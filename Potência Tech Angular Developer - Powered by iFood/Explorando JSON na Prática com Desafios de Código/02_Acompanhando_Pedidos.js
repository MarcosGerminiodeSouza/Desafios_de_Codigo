// Criando um objeto chamado "pedido" as seguintes propriedades:
var pedido = {
  cliente: {
  nome: gets(),       // Lê a primeira linha da "Entrada": Nome do Cliente.
  endereco: gets(),   // Lê a segunda linha da "Entrada": Endereço do Cliente.
  telefone: ""
  },
  id: parseInt(gets()) // Lê a terceira linha da "Entrada": ID do Pedido.
  
};
//TODO: Leia a quarta linha da "Entrada": Telefone do Cliente.
pedido.cliente.telefone = gets();
//TODO: Imprima a saída formatada de acordo com este desafio.
function imprimeSaida() {
  return print(`Cliente: ${pedido.cliente.nome}, ${pedido.cliente.endereco}
  ID: ${pedido.id}
  Tel: ${pedido.cliente.telefone}`);
}

imprimeSaida();