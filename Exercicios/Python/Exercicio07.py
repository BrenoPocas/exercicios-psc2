print("Numeros que produzem resto 3 quando divididos por 5: ")
res = ""
for x in range(1000, 2000):
    if x % 5 == 3:
        res += str(x)
        res += " "
print(res)