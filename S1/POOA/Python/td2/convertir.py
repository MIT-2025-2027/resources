devise=str(input("Entrer le devise (E ou $) : "))

if devise == 'E':
    c = float(input("Entrer le montant en EURO : "))
    result = c * 1.18
    print(f" {c} E  = {result : .2f} $")
elif devise == '$':
    c = float(input("Entrer le montant en USD : "))
    result = c / 1.18
    print(f" {c} $  = {result : .2f} E")
else:
    print("ERREUR (SEULEMENT $ et E sont acceptes)")
