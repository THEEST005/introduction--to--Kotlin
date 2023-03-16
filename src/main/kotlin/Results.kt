fun main(args: Array<String>) {

    print("Enter Number")
    var number:Int = readLine()!!.toInt()

    if (number ==544) {
        print("data plans. choose an option: 1.1GB valid for one hour,2.50Mb for 1day: ")

        var option: Int = readLine()!!.toInt()

        when (option) {
            1 -> {
                print("Bought Successfully")
            }

            2 -> {
                print("Valid for a day")
            }

            else -> {
                print("Invalid Option")
            }
        }
    }


        else{
        print("Invalid Number")
        }
    }
