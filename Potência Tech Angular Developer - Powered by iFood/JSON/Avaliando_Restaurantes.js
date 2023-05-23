const restaurante = {
  nome1: gets(),
  avaliacao1: parseFloat(gets()),
  nome2: gets(),
  avaliacao2: parseFloat(gets())
};

if (restaurante.avaliacao1 > restaurante.avaliacao2 || restaurante.avaliacao1 == restaurante.avaliacao2)
  print(`Restaurante: ${restaurante.nome1}, Avaliação: ${restaurante.avaliacao1.toFixed(1)}`);
else
  print(`Restaurante: ${restaurante.nome2}, Avaliação: ${restaurante.avaliacao2.toFixed(1)}`);