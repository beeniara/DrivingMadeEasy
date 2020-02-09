fun main(args: Array<String>) {

    var myLion = LionClass()
    println(myLion.getName() + "-" + myLion.getLionSpeed())
    var myTiger = TigerClass()
    println(myTiger.getName() + "-" + myTiger.getSpeed())
}

//Abstract - a technique for arranging complexity of computer systems. works by
//establishing a level of complexity on which a person
// interacts with the system, suppressing the more complex details below the current level.
//processed through hiding all but relevant
//features - can not be instantiated - can not create objects
// can be subclass
// must provide implementations for all abstract methods of the super class
//start with abstract then class then name of class
//start function with abstract if abstract funtion

abstract class AnimalClass{
    abstract fun getName(): String
     open fun getSpeed(): Int {
        return 2000
    }
}
class LionClass: AnimalClass(){ //LionClass inheriting from AnimalClass
    override fun getName(): String {
        return "Lion"
    }
    fun getLionSpeed(): Int{
        return getSpeed() // from super Class
    }
}
class TigerClass : AnimalClass(){
    override fun getName(): String {
        return " Tiger "
    }
    fun getTigerSpeed():Int {
        return getSpeed()// getSpeed function inside the animal class
        //to comment out ...hold control and / key
    }
    override fun getSpeed(): Int {
        return 5000
    }
}