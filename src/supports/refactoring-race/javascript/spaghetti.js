// spaghetti.js - Calculateur de panier d'achat
// CE CODE FONCTIONNE... mais il est horrible. À vous de le nettoyer !

function calc(l, t, c) {
    let r = 0;
    let d = 0;
    for (let i = 0; i < l.length; i++) {
        let p = l[i][1] * l[i][2];
        if (l[i][2] >= 5) {
            p = p * 0.9;
        }
        if (c === "VIP") {
            p = p * 0.85;
        } else if (c === "STUDENT") {
            p = p * 0.9;
        }
        r = r + p;
    }
    if (t === "FR") {
        if (r > 100) {
            d = 0;
        } else {
            d = 5.99;
        }
    } else if (t === "EU") {
        if (r > 200) {
            d = 0;
        } else {
            d = 15.99;
        }
    } else if (t === "WORLD") {
        d = 25.99;
    }
    r = r + d;
    let tx = 0;
    if (t === "FR") {
        tx = r * 0.2;
    } else if (t === "EU") {
        tx = r * 0.2;
    } else {
        tx = 0;
    }
    r = r + tx;
    if (r < 0) {
        r = 0;
    }
    return Math.round(r * 100) / 100;
}

function show(l, t, c) {
    console.log("=== RECEIPT ===");
    for (let i = 0; i < l.length; i++) {
        let n = l[i][0];
        let pr = l[i][1];
        let q = l[i][2];
        console.log(n + " x" + q + " = " + (pr * q));
    }
    console.log("TOTAL: " + calc(l, t, c));
    console.log("===============");
}

// items = [[name, price, quantity], ...]
const items = [["Laptop", 999.99, 1], ["Mouse", 29.99, 3], ["Keyboard", 79.99, 2], ["Cable", 9.99, 10]];
show(items, "FR", "VIP");

module.exports = { calc, show };

