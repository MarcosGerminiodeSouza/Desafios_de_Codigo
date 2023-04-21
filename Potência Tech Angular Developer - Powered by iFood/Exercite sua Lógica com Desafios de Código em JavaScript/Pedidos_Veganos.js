const numPedidos = parseInt(gets());

for (let i = 1; i <= numPedidos; i++) {
  const prato = gets();
  const calorias = parseInt(gets());
  const ehVegano = gets().toLowerCase() === 's';
  
  var vegano = ehVegano ? 'Vegano' : 'Nao-vegano';
  print(`Pedido ${i}: ${prato} (${vegano}) - ${calorias} calorias`);
}