pares = 0
for x in range(10):
    if int(input("Digite um numero: ")) % 2 == 0:
        pares += 1
print(str(pares) + " dos números digitados são pares.")