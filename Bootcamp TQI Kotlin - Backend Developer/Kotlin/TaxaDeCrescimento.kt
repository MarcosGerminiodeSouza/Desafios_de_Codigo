data class Pais(var habitantes: Double, var taxaCrescimento: Double) {
  fun crescerPopulacaoAnual() {
    
    habitantes += habitantes * (taxaCrescimento / 100)
  }
}

fun main() {
  var habitantesPaisA = readLine()!!.toDouble();
  var habitantesPaisB = readLine()!!.toDouble();
  var paisA = Pais(habitantesPaisA, taxaCrescimento = 3.0)
  var paisB = Pais(habitantesPaisB, taxaCrescimento = 1.5)
   
  var quantidadeAnos = 0
  
  while (paisA.habitantes < paisB.habitantes) {
    paisA.crescerPopulacaoAnual()
    paisB.crescerPopulacaoAnual()
    quantidadeAnos++ 
  }
  
  println("$quantidadeAnos anos")
}