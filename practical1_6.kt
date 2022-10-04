fun main(){
    println("Enter 1st Number : ");
    val a = readLine()!!.toInt();
    println("Enter 2nd Number : ");
    val b = readLine()!!.toInt();
    println("Addition : "+add(a, b));
    println("subtract : "+subtract(a, b));
    println("multiply : "+multiply(a, b));
    println("divide : "+ divide(a, b));


}
fun add(a : Int, b : Int):Int{
    return a+b;
}
fun subtract(a : Int, b : Int):Int{
    return a-b;
}
fun multiply(a : Int, b : Int):Int{
    return a*b;
}
fun divide(a : Int, b : Int):Double{
    return a/b.toDouble();
}