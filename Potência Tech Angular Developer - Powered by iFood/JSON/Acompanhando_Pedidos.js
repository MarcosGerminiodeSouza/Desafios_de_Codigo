var pedido = {
  cliente: {
  nome: gets(),
  endereco: gets(),
  telefone: ""
  },
  id: parseInt(gets())
};

pedido.cliente.telefone = gets();

function imprimeSaida() {
  return print(`Cliente: ${pedido.cliente.nome}, ${pedido.cliente.endereco}
  ID: ${pedido.id}
  Tel: ${pedido.cliente.telefone}`);
}

imprimeSaida();