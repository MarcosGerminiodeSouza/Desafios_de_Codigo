// sem segir o padrão
const pedido = {
    nome1: gets(),
    tipo1: gets(),
    distancia1: parseFloat(gets()),
    nome2: gets(),
    tipo2: gets(),
    distancia2: parseFloat(gets()),
    nome3: gets(),
    tipo3: gets(),
    distancia3: parseFloat(gets())
  }
  
  if (pedido.distancia1 < pedido.distancia2 & pedido.distancia1 < pedido.distancia3)
    print(`O pedido mais próximo é o de ${pedido.nome1}, do tipo ${pedido.tipo1}`);
  else if (pedido.distancia2 < pedido.distancia1 & pedido.distancia2 < pedido.distancia3)
    print(`O pedido mais próximo é o de ${pedido.nome2}, do tipo ${pedido.tipo2}`);
  else
    print(`O pedido mais próximo é o de ${pedido.nome3}, do tipo ${pedido.tipo3}`);