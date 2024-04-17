primo = True

num = int(input("Digite um numero: "))

for x in range(2, num):
    if(num % x == 0):
        primo = False
        break

if primo:
    print("O numero " + str(num) + " é primo.")
else:
    print("O numero " + str(num) + " não é primo.")