fat = 1
num = int(input("Digite um numero: "))

for x in range(num):
    fat *= (num-x)

print("O fatorial de " + str(num) + " é " + str(fat))