#Desafio 01

Para a realização desse desafio optei por iniciar declarando as variáveis e seus tipos no início, para que eu pudesse organizar e entender por partes o que estava sendo usado no programa.\
Busquei usar apenas os conhecimentos ensinados nas aulas para a construção do código, mas conforme fui avançando, precisei buscar novas informações para deixar o programa mais fechado possível.\
Isso ocorreu na tentativa de leitura do nome completo e do saldo, pois com o scanner.next() o programa não lia o nome completo, apenas a primeira palavra digitada e, por consequência, entendia que as demais palavras eram parte da pergunta abaixo (o saldo), o que gerou um erro, pois o computador esperava um número decimal e não uma string. 

Para resolver essa situação usei o nextLine(), porque com ele é possível ler frases completas, mas por ele "pular" linhas, precisei usar ele em todo o código, de forma que o uso ficasse padrão. Como algumas informações (número e saldo) eram números, precisei usar os métodos Integer.parseInt e Double.parseDouble para converter as strings em números correspondentes ao solicitado.\ 

Para conseguir realizar essas modificações contei com a ajuda da documentação JAVA disponível no W3Schools e algumas explicações de uso do Chatgpt. 