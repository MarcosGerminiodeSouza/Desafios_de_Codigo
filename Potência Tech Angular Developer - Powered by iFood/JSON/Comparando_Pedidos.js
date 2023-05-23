const cliente1 = { 
  nome: gets(),
  item: gets(), 
  preco: parseFloat(gets())
};

const cliente2 = {
  nome: gets(), 
  item: gets(), 
  preco: parseFloat(gets()) 
};

if(cliente1.item == cliente2.item & cliente1.nome == cliente2.nome & cliente1.preco == cliente2.preco)
  print("Os pedidos são iguais");
else
  print("Os pedidos são diferentes");