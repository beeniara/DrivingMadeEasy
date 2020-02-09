fun main(args: Array<String>) {


var myAnimal = GenericAnimalClass (20)
    //a style of computer programming in which algorithms are written in terms of types to be specified later that
//    then instantiated when needed for specific types provided as parameters
    //many benefits like stronger type checks at compile time
    //strong type checking to generic code and issues error if the code violates type safety
    // easier to fix compile time errors than runtime errors
}
class GenericAnimalClass<T>(kind:T) {
    init{
        println(kind)
    }
}