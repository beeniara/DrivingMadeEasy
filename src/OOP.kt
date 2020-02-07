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