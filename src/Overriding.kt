
//overriding - the ability of a subclass to override a method allows a class to inherit from a superclass whose behaviour is close enough and then to modify behaviour as needed.
//only exclusive to inheritance
//??? why print "the animal is fighting twice"?

fun main(args: Array<String>) {
    var myAnimal = AnimalX()
    myAnimal.fight()

    var myTiger = Tiger()
    myTiger.fight()

}
open class AnimalX {
    var name: String = ""
    open fun fight(){
        println ("The animal is fighting")
    }
}
// we can not override fun fight () unless we make it open and also change class AnimalX to open as well
class Tiger : AnimalX(){
    override fun fight() {
        super.fight()
        println("Fight Harder ...")
    }
    }
