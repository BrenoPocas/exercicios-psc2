totalIdades = 0
mediaIdades = 0
pesoMaiorQueNoventa = 0
for x in range(7):
    totalIdades += int(input("Digite a idade de uma pessoa: "))
    peso = int(input("Digite o peso dessa pessoa: "))
    if peso > 90:
        pesoMaiorQueNoventa += 1
mediaIdades = totalIdades / 7
print("A media das idades das sete pessoas é: " + str(mediaIdades) + " e " + str(pesoMaiorQueNoventa) + " pessoas pesam mais que 90kg.")