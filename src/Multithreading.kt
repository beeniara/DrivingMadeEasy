fun main(args: Array<String>) {

// a thread = of execution is the smallest sequence of programmed instructions
// that can be managed independently
    // multi-threading - executing multiple threads simultaneously
    // multi tread provides execution of two or more parts
    // of a program to maximum utilize the CPU time
// Synchronous Programming - program executed line by line one line at a time
    //asynchronous - multiple threads executed at the same time without interruption

    var lion = Animal("Lion")
    lion.start()
    lion.join()//this code will allow the lion to continue till it dies
    //then the rest of the thread will continue
    var tiger = Animal("Tiger")
    tiger.start()
    var leopard = Animal("Leopard")
    leopard.start()
    var bear = Animal("Bear")
    bear.start()
}
class Animal: Thread{
    var animalName: String =""
    constructor(name: String){
        animalName = name
    }
    override fun run() {//
        super.run()
        var counter = 0

        while (counter < 5) {//
            println("$animalName is running - $counter")
            counter++
            try {
                Thread.sleep(2000)//sleep until 2 secs passed
            } catch (e: Exception){
                println(e.message)
            }
        }
    }
}
