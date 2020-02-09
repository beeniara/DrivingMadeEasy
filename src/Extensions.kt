fun main(args: Array<String>) {
    // extensions allow code written by others to be extended.
    //allow for features to be implemented once in ways that enable reuse
    //.. without needing for inheritance or interface
//with generic classes extension methods allow implementation of behaviour that is available for
    //..all instantiations of the generic type without requiring them to derive from a common base class
    var intArray=ArrayList<Int>()
    intArray.add(5)
    intArray.add(9)
    intArray.add(7)
    intArray.addTwoNumbers(intArray[0],intArray[1])
}
fun ArrayList<Int>.addTwoNumbers (number1: Int, number2: Int): Int {
    var result = number1 + number2
    println(result)
    return result
}
