void main() {
  print("****************************************");
  print("Construindo lista genérica");
  print("****************************************");
  
  List diversos = ["Rafael", 10, 121.56];
  print(diversos);
  
  diversos.add(148);
  print(diversos);
  
  print("Lista completa = $diversos");
  
  int posicao = 0;
  print("Posição [$posicao] = ${diversos[posicao]}");
  
  print("\n****************************************");
  print("Construindo lista do tipo inteiro");
  print("******************************************");
  
  List<int> idades = [15, 18, 14, 13, 12];
  print(idades);
  idades.add(55);
  print(idades);
  
  posicao = 4;
  print("Posição [$posicao] = ${idades[posicao]}\n");
  print("** Utilizando o laço FOR");
  for(int i = 0; i < idades.length; i++){
    print("Idades[${i}] = idades[${idades[i]}]");
  }
  
  print("\n** Utilizando o laço WHILE");
  int i = 0;
  while(i < idades.length){
    print("Idades[${i}] = idades[${idades[i]}]");
    i++;
  }
    
  print("\n****************************************");
  print("Construindo lista do tipo double");
  print("******************************************");
  
  List<double> salarios = [1500.00, 1878.46, 140.00, 103.77, 12000.55];
  print(salarios);
  
  posicao = 3;
  print("Posição [$posicao] = ${salarios[posicao]}");
  
  print("\n****************************************");
  print("Construindo lista do tipo String");
  print("******************************************");
  
  List<String> esportes = ["Futebol", "Voleibol", "HandBol", "Xadrez"];
  print(esportes);
  
  int quantidadeEsporte = esportes.length;
  print("Informe um número entre 0 e ${quantidadeEsporte - 1}: ");
  posicao = 4;
  
  if(posicao < quantidadeEsporte)
    print("Posição [$posicao] = ${esportes[posicao]}");
  else
    print("A posição $posicao informada está fora do intervalo [0 - $quantidadeEsporte]");
  
  
   
  print("\n****************************************");
  print("Construindo um MAP String , String");
  print("******************************************");
  
  Map<String, String> nomeClientes = {"Rafael": "Florindo", "Ronie":"Tokumoto", "Carlos":"Danilo"};
  print(nomeClientes);
  
  String nome = "Ronie";
  var sobreNome = nomeClientes[nome];
  
  print("Cliente: $nome $sobreNome");
  
  print("Cliente: $nome ${nomeClientes[nome]}");

}
