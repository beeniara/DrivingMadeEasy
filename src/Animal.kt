fun main(args: Array<String>) {
   // var animal = Animal(1000) // calling the primary constructor
    var animal = Animal ("My Lion", "Yellow",2000,4000)// to call the primary constructor we need to pass an Int value as the power,
    // if custome constructor then we need to pass the name, color speed and power

}

class Animal (power:Int){
    init{
        println(power) // the init part will be executed because custom constructor - the codes inside the constructor will be executed.
        }
 constructor(name:String, color: String, speed:Int, power: Int): this(power) {
     println(name + "-" + color + "-" + speed + "-" + power)// customed constructor
 }

}