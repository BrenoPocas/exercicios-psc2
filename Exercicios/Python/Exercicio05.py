idadeMaiorQue50 = 0
somaAlturasEntre10e20 = 0
quantidadeIdadesEntre10e20 = 0
quantidadePesoMenorQue40 = 0

for x in range(25):
    idade = int(input("Digite a idade da pessoa: "))
    altura = float(input("Digite a altura da pessoa: "))
    peso = float(input("Digite o peso da pessoa: "))
    if idade >= 50:
        idadeMaiorQue50 += 1
    if idade >= 10 and idade < 20:
        somaAlturasEntre10e20 += altura
        quantidadeIdadesEntre10e20 += 1
    if peso < 40:
        quantidadePesoMenorQue40 += 1
porcentagemPesoMenorQue40 = (quantidadePesoMenorQue40 / 25) * 100
mediaAlturasEntre10e20 = somaAlturasEntre10e20 / quantidadeIdadesEntre10e20
print("A) " + str(idadeMaiorQue50) + " pessoas possuem idade superior a 50 anos.")
print("B) A media das alturas das pessoas com idade entre 10 e 20 anos é: " + str(mediaAlturasEntre10e20))
print("C) " + str(porcentagemPesoMenorQue40) + "% das pessoas possuem peso abaixo de 40 quilos.")