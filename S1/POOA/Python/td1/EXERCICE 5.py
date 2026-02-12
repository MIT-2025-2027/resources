chaine = str(input("Entrer une chaine de charactere : "))
nombre = int(input("Entrer n : "))
def pair(ch):
    modified = ch[::2]
    return modified

def supr(n):

    sup = chaine[n+1:]
    return sup

print(pair(chaine))
print(supr(nombre))