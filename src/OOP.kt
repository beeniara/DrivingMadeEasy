fun main(args: Array<String>) { // main is the entry point


  // creating object of our Car Class ...do it in the main function
    var myCar: Car = Car() //new object of the Car Class created, the Car is the Data type of myCar
    myCar.speed = 200
    println(myCar.speed) // outputing the speed of the object of my Car Class

    var yourCar = Car()

    yourCar.power = 1000  //

     println(yourCar.power)

    println(yourCar.speed)

    println(Car().numberOfWheels)


}

class Car{

    var speed: Int= 0 //must initialise properties or be abstract, speed is a property or variable of the car Class
    var power: Int = 0
    var name: String =""
    var numberOfWheels: Int = 0




}
//A Constructor of the Boxer class
//inside the Boxer class are the variables

class Boxer(name:String, power:Int, speed: Int) {
    private var name: String = ""  // empty string value
    private var power: Int? = null
    private var speed: Int = 0


    //init is executed the moment an object of a Boxer class is initialised.
    init {
        this.name =
            name // this.refers to the instance variable or an object of the boxer , we get the name after the = sign from
        // the para of constructor from the constructor
    }
    fun getName(): String {
        return this.name

    }

}