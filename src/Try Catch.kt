fun main(args: Array<String>) {
    //in statements where exceptions can occur
    //for error prone programs and if not use try catch around any code, the method can throw an error.
println("Please enter an Interger Value")

   try{ var myIntergerValue: Int= readLine()!!.toInt()
    println(myIntergerValue)

} catch(myException:Exception){//specify name of parameter and datatype
   myException.printStackTrace()}//will print all errors description,
    //if any error the catch block will be executed.
}
