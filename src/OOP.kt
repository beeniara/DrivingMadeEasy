fun main(args: Array<String>) { // main is the entry point

var myBoxer = Boxer ( "John",  1000,  2000)



}
//A Constructor of the Boxer class
//inside the Boxer class are the variables

class Boxer(name:String, power:Int, speed: Int) {
    private var name: String = ""  // empty string value
    private var power: Int? = null
    private var speed: Int = 0


    // Because the Boxer class is initialised init is executed  so John-1000-2000 will be executed
    init {
        this.name = name
        println(name + "_" + power + "-" + speed)
        // this.refers to the instance variable or an object of the boxer , we get the name after the = sign from
        // the para of constructor from the constructor
    }
    fun getName(): String {
        return this.name //refers to the instance variable

    }


}