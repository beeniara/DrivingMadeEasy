fun main(args: Array<String>) {
    //an interface is a programming structure to be enforced on an object
    //why use it = better than class - it can define a single class that  can implement
    //multiple interfaces. more flexible than class//
    //if we do not use inheritance, we can use an interface, it is a contract between itself and any class implemented
var myNexus = NexusClass()
    println (myNexus.getName() + "-" + myNexus.getRam() + "-" + myNexus.getCPUType())
    var myIphone = IPhoneClass()
    println (myIphone.getName() + "-" + myIphone.getRam() + "-" + myIphone.getCPUType() )


}

interface ComputerInterface {
    fun getName(): String
    fun getRam(): Int
    fun getCPUType(): String

}
// Multiple classes can implement this interface
//: is a sign to show implement
//can not create object of Interface

class NexusClass: ComputerInterface {
    override fun getName(): String {
        return "Nexus 6"

    }

    override fun getRam(): Int {
        return 1000
    }

    override fun getCPUType(): String {
        return "getDragon"

    }
}
class IPhoneClass: ComputerInterface {
    override fun getName(): String {
        return "Iphone7"
    }

    override fun getCPUType(): String {
        return "A5"
    }

    override fun getRam(): Int {
        return 3000
    }
}
