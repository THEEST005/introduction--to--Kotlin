fun main(args: Array<String>) {

    print("Enter Marks")
    var marks:Int = readLine()!!.toInt()

    if (marks >=80){
        print("Grade A")}

        else if (marks >=70){
            print("Grade B") }

        else if (marks >=60){
            print("Grade C") }

        else if (marks >=50){
            print("Grade D")
    }

        else if (marks >=40){
            print("Grade E") }

    else{
        print("Failed")
    }


}


