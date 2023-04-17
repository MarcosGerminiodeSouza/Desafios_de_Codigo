let str = gets();

let vogais = str.replace(/[^AEIOUaáàãâêéeíiõoóúu]/g, '').length;
let space = str.split(' ').length-1;

print('Espacos em branco: ' + space + ' Vogais: ' + vogais );