fun main() {
  val media = readLine()!!.toDouble();
   
  if (media > 7)
    println("APR");
  else if (media >= 5)
    println("REC");
  else
    println("REP");
}