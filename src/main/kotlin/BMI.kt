fun main(args: Array<String>) {
    var weight = 100
    var height = 1.9
    var BMI = weight/(height * height)

    if (BMI <=18){
        println("Underweight")
    }
    else if (BMI <=29){
        println("Normal weight")
    }
    else if(BMI <=34){
        println("Overweight")
    }
    else{
        println("Obese")
    }
}