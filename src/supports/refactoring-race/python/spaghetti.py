# spaghetti.py - Calculateur de panier d'achat
# CE CODE FONCTIONNE... mais il est horrible. À vous de le nettoyer !

def calc(l, t, c):
    r = 0
    d = 0
    for i in range(len(l)):
        p = l[i][1] * l[i][2]
        if l[i][2] >= 5:
            p = p * 0.9
        if c == "VIP":
            p = p * 0.85
        elif c == "STUDENT":
            p = p * 0.9
        r = r + p
    if t == "FR":
        if r > 100:
            d = 0
        else:
            d = 5.99
    elif t == "EU":
        if r > 200:
            d = 0
        else:
            d = 15.99
    elif t == "WORLD":
        d = 25.99
    r = r + d
    tx = 0
    if t == "FR":
        tx = r * 0.2
    elif t == "EU":
        tx = r * 0.2
    else:
        tx = 0
    r = r + tx
    if r < 0:
        r = 0
    return round(r, 2)


def show(l, t, c):
    print("=== RECEIPT ===")
    for i in range(len(l)):
        n = l[i][0]
        pr = l[i][1]
        q = l[i][2]
        print(n + " x" + str(q) + " = " + str(pr * q))
    print("TOTAL: " + str(calc(l, t, c)))
    print("===============")


# items = [(name, price, quantity), ...]
items = [("Laptop", 999.99, 1), ("Mouse", 29.99, 3), ("Keyboard", 79.99, 2), ("Cable", 9.99, 10)]
show(items, "FR", "VIP")

