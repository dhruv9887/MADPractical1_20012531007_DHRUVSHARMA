fun main(){
    println("Enter a digit : ");
    val a = readLine()!!.toInt();
    if(a % 2==0) {
        print("$a is an even number ");
    }
    else {
        print("$a is an odd number ");
    }
}