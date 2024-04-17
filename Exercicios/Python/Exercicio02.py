maior = 0
for x in range(5):
    num = int(input("Digite um numero: "))
    if num > maior:
        maior = num
print("O maior numero é: "+ str(maior))