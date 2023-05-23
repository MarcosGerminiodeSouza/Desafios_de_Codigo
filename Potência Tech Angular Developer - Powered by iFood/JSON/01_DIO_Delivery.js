const pedido = {
    cliente: gets(),
    endereco: gets(),
    itens: [],
    taxaEntrega: 5.0
  };  
  
  const quantidadeItens = parseInt(gets());
  while (pedido.itens.length < quantidadeItens) {
    const nomeItem = gets();
    const precoItem = parseFloat(gets());
    pedido.itens.push({ nome: nomeItem, preco: precoItem });
  }
  
  function valorTotalPedido(pedido) {
    let valorTotal = 0;
    
    for (let item of pedido.itens) {
        valorTotal+= item.preco;
      }

    return (valorTotal + pedido.taxaEntrega).toFixed(2);
  }

  const valor = valorTotalPedido(pedido);
  
  function imprimeSaida() {
    return print(`
    Pedido: ${pedido.cliente}
    Endereco de entrega: ${pedido.endereco}
    Total: R$ ${valor}`);
  }
  
  imprimeSaida();

  /*
  const pedido = {
  cliente: gets(),
  endereco: gets(),
  itens: [],
  taxaEntrega: 5.0
};

// Para popular o array de itens, criamos a seguinte estrutura de repetição:
const quantidadeItens = parseInt(gets());
while (pedido.itens.length < quantidadeItens) {
  const nomeItem = gets();
  const precoItem = parseFloat(gets());
  pedido.itens.push({ nome: nomeItem, preco: precoItem });
}

//TODO: Percorra o array de itens do pedido e calcule o seu valor total.
function valorTotalPedido(pedido) {
  let valorTotal = 0;
  
  for(let item of pedido.itens){
      valorTotal+= item.preco;
    }
  return (valorTotal + pedido.taxaEntrega).toFixed(2);
}
let valor = valorTotalPedido(pedido);

function imprimeSaida() {
  return print(`
  Pedido: ${pedido.cliente}
  Endereco de entrega: ${pedido.endereco}
  Total: R$ ${valor}`);
}

imprimeSaida();
  */