# test_spaghetti.py — Tests pour le Refactoring Race
# ⚠️ CES TESTS DOIVENT CONTINUER À PASSER APRÈS LE REFACTORING !
import pytest
from spaghetti import calc


def test_simple_cart():
    """Un article simple, livraison FR, client normal"""
    items = [("Item", 10.0, 1)]
    result = calc(items, "FR", "NORMAL")
    assert result == 19.19  # 10 + 5.99 shipping + 20% tax


def test_vip_discount():
    """Un article avec réduction VIP"""
    items = [("Item", 100.0, 1)]
    result = calc(items, "FR", "VIP")
    assert result == 105.19  # 100*0.85=85 + 5.99 + 20% tax


def test_quantity_discount():
    """5+ articles du même type = 10% de réduction"""
    items = [("Item", 10.0, 5)]
    result = calc(items, "FR", "NORMAL")
    assert result == 60.59  # 10*5*0.9=45 + 5.99 + 20% tax


def test_free_shipping_fr():
    """Livraison gratuite en France si > 100€"""
    items = [("Item", 200.0, 1)]
    result = calc(items, "FR", "NORMAL")
    assert result == 240.0  # 200 + 0 shipping + 20% tax


def test_eu_shipping():
    """Livraison EU avec frais"""
    items = [("Item", 10.0, 1)]
    result = calc(items, "EU", "NORMAL")
    assert result == 31.19  # 10 + 15.99 + 20% tax


def test_world_no_tax():
    """Livraison mondiale sans TVA"""
    items = [("Item", 10.0, 1)]
    result = calc(items, "WORLD", "NORMAL")
    assert result == 35.99  # 10 + 25.99 + 0 tax


def test_student_discount():
    """Réduction étudiant"""
    items = [("Item", 100.0, 1)]
    result = calc(items, "FR", "STUDENT")
    assert result == 114.79  # 100*0.9=90 + 5.99 + 20% tax


def test_empty_cart():
    """Panier vide"""
    items = []
    result = calc(items, "FR", "NORMAL")
    assert result == 7.19  # 0 + 5.99 + 20% tax

