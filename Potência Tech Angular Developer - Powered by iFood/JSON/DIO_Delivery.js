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