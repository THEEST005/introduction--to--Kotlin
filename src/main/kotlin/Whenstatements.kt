fun main(args: Array<String>) {
    println("Enter number")
    var number:Int = readln()!!.toInt()

    when(number){
        1-> println("Go To First floor")
        2-> println("Go To Second floor")
        3-> println("Go To Third floor")
        4-> println("Go To Fourth floor")

        else -> println("Not available")
    }
}