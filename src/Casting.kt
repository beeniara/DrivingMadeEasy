// up casting = casting to a super type (Super Class) e.g var myComputer: ComputerX = Nexus()
// Down casting = casting to a subclass e.g var MyNexus: Nexus = ComputerX() as Nexus
//..application will crash and will have a runtime exception. dos not occur automatically unlike up casting

fun main(args: Array<String>) {
var myComputer: ComputerX = Nexus()// Up Casting - Automatically occurs
    println(myComputer.computerName)
    var myNexus: Nexus = ComputerX() as Nexus // Down casted to Nexus.  Does not occur automatically

}
open class ComputerX {
     var computerName: String = "Nexus"
}
class Nexus: ComputerX(){

}

