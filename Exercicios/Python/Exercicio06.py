somaPares = 0
somaImpares = 0
somaDiv3 = 0

for x in range(10):
    num = int(input("Digite um numero: "))
    if num%2 == 0:
        somaPares += num
    else:
        somaImpares += num
    if num%3 == 0:
        somaDiv3 += num
print("A soma dos numeros pares é: " + str(somaPares))
print("A soma dos numeros impares é: " + str(somaImpares))
print("A soma dos numeros divisiveis por três é: " + str(somaDiv3))