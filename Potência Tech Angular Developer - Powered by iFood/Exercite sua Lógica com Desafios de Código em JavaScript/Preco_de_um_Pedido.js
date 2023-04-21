const valorHamburguer = parseFloat(gets());
const quantidadeHamburguer = parseInt(gets());
const valorBebida = parseFloat(gets());
const quantidadeBebida = parseInt(gets());
const valorPago = parseFloat(gets());
var total = 0;
var troco = 0;

total += (valorHamburguer * quantidadeHamburguer);
total += (valorBebida * quantidadeBebida);
troco = valorPago - total;

print(`O preço final do pedido é R$ ${total.toFixed(2)}. Seu troco é R$ ${troco.toFixed(2)}.`);