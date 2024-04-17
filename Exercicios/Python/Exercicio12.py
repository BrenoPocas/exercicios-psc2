tamanho = 2
idadeMaiorQue50 = 0
somaAlturas = 0
idadeEntre10e20 = 0
pesoMenorQue40 = 0

for x in range(tamanho):
    idade = int(input("Digite a idade: "))
    altura = float(input("Digite a altura: "))
    peso = float(input("Digite o peso: "))
    if idade >= 50:
        idadeMaiorQue50 += 1
    if idade >= 10 and idade < 20:
        somaAlturas += altura
        idadeEntre10e20 += 1
    if peso < 40:
        pesoMenorQue40 += 1

print(str(idadeMaiorQue50) + " pessoas possuem mais de 50 anos.")

if idadeEntre10e20 != 0:
    mediaAlturas = somaAlturas / idadeEntre10e20
    print("A média das alturas das pessoas entre 10 e 20 anos é: " + str(mediaAlturas))
else:
    print("Não possui pessoas entre 10 e 20 anos.")

porcentagemPesoMenorQue40 = pesoMenorQue40 / tamanho * 100
print(str(porcentagemPesoMenorQue40) + "% das pessoas possuem peso inferior a 40 quilos.")