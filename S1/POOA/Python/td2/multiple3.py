nombre = int(input("Entrer un entier : "))

if nombre % 2 == 0 :
    print("Ce nombre est pair")
elif nombre % 2 != 0 and nombre % 3 == 0 :
    print("Ce nombre est impair mais multiple de 3")
else :
    print("Ce nombre n'est in pair ni multiple de 3")