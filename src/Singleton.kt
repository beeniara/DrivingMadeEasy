fun main(args: Array<String>) {

var mySamsungGalaxy = SamsungGalaxy.theOnlyGalaxyS8Instance
    println (mySamsungGalaxy.name)

    var yourSamsungGalaxy = SamsungGalaxy.theOnlyGalaxyS8Instance
    //Singleton is useful when exactly one object is needed to corordinate actions
    //..across the system

}
class SamsungGalaxy{
    var name: String = "Galaxy S8"
    constructor(){
        println ("$name is created")
    }
    companion object {
        val theOnlyGalaxyS8Instance: SamsungGalaxy by lazy{
            SamsungGalaxy()}
        //Everytime the this instance is sent back.
        //This instance is created only once
        //created only when needed and no other objects will be created.
        //use of singleton can be indicated by putting "private infront the constructor
    }
}