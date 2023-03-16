fun main(args: Array<String>) {

    println("Enter weight")
    var weight:Int = readLine()!!.toInt()
    println("Enter height")
    var height: Double = readLine()!!.toDouble()
    val bmi = weight/(height * height)


    if (bmi <=18){
        println("Underweight")
    }
    else if (bmi <=29){
        println("Normal weight")
    }
    else if(bmi <=34){
        println("Overweight")
    }
    else{
        println("Obese")
    }
}