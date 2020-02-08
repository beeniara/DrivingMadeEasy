fun main(args: Array<String>) {

    var myLion: Animal2 = Animal2()// create new object of Animal2
    myLion.animalName = "Some Name"

    var iphone = Computer()
   // iphone.computerName   we can not access computerName because it is private
}
class Animal2 {
    // Public - can be accessed from anywhere
    //private - can only be accessed within a class that declare it
    //protected - can be accessed within subclass
    public var animalName: String = ""

}
class Computer{
    private var computerName: String = ""
}

open class Person2{
    protected var personName: String="" // the subclass can access the personName because it is protected

}
class Student2: Person2() {
    fun changePersonName() {
        personName = ""
    }
}