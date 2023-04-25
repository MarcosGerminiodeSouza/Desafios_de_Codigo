//TODO: Usando o array "acima" identifique qual dos restaurantes é o melhor avaliado.
//Dica: Explore o conceito de "reduce" em seu array, ele pode muito útil neste desafio.
//Referência: https://stackoverflow.com/a/34087850/3072570

// sem seguir o padrão
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