taille = int(input("Entrer la taille du SAPIN: "))
n=taille

for i in range(1,(taille)*2,2):
    print(f"{' '*n} {'*'* i}")
    n-=1


