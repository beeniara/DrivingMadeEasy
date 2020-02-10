fun main(args: Array<String>) {
    // a member of its enclosing class.  Non static nested classes have access to other members of enclising class even if they are declared private.
    // Static nested classes do not have access to other members of the enclosing class

var outerAnimal = OuterAnimalClass()
    var nestedLion = OuterAnimalClass.StaticLionClass()
    var innerTiger= OuterAnimalClass().NonStaticTigerClass()
    innerTiger.printAnimalName()
}

class OuterAnimalClass {
    private var animalName: String = "Animal"
    class StaticLionClass {
        fun printAnimalName(){
            //println(animalName)
            // Static classes can not access members of the
            // ..the enclosing class. To access it you change to non static by putting
            //..the word ínner'infront of the class.

        }
    }
inner class NonStaticTigerClass {
    fun printAnimalName () {
        println (animalName)
    }
}
}