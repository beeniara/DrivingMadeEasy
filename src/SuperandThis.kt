fun main(args: Array<String>) {
    var myKickBoxer: KickBoxer = KickBoxer(200,300, 10)
    println(myKickBoxer.kickSpeed)
    println(myKickBoxer.kickPower)
    //println(myKickBoxer.numberOfMatches won)..this can not be accessed as it is not an instant variable that
        //we put inside the kickBoxer class, it is a parameter that we pass for the custom constructor of the
    // kickBoxer class

        // myKickBoxer.fight()

//when we run, 10 for number of matches won from calling constructor which output the numberOfMatches
    //then 200 for kickSpeed and 300 for kickPower in fun main function
}
open class BoxerX(numberOfMatchesWon: Int){
    var name: String =" "
    var punchSpeed: Int =0
    var punchPower: Int=0

    fun throwPunch(){
        println("The boxer is throwing a puchh")
    }
}
class KickBoxer: BoxerX {
    var kickSpeed: Int = 0
    var kickPower: Int = 0

    fun fight() {
        super.throwPunch()
        println("The kickboxer is fighting")
    }//we are able to access function throwPunch from super because it is public

    constructor (kickSpeed: Int, kickPower: Int, numberOfMatches:Int): super(numberOfMatches) {
        this.kickSpeed = kickSpeed
        this.kickPower = kickPower // this refers to instance variable kickPower, kickPower after the = is refering
        //to parameter
        println(numberOfMatches)
    }
}