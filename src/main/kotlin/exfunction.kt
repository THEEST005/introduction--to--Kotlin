fun main(args: Array<String>) {
    sum()
    multiply()

}
fun sum(){
    println("Enter first number")
    var Num1 : Int = readln().toInt()
    println("Enter second number")
    var Num2 : Int = readln().toInt()

    var result= Num1 + Num2
    print(result)
}

fun multiply(){
    println("Enter first number")
    var Num1 : Int = readln().toInt()
    println("Enter second number")
    var Num2 : Int = readln().toInt()

    var result= Num1 * Num2
    print(result)


}


