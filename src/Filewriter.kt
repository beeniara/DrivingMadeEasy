import java.io.FileReader
import java.io.FileWriter
import java.lang.Exception

fun main(args: Array<String>) {
    readFromExternalFile()
println("please enter a string value")
    var input = readLine().toString()
    writeToExternalFile(input)
}
fun writeToExternalFile(text:String) {
    try {
        var fileWriter: FileWriter = FileWriter("ExternalFile.txt")
        fileWriter.write(text)
        fileWriter.close()//need to close the file
        println("The text is save")
    } catch (e: Exception) {
        println(e.message)
    }
}

    fun readFromExternalFile(){
        try{
            var fileReader = FileReader ("ExternalFile.txt")//should be same file name as
            //..the one we write our file to.
            var counter: Int?//we want to count one by one, optional choice in case
            //..value returns null
            do{
                counter = fileReader.read()//
                print(counter.toChar())//toChar convert interger  into a character
            }while(counter !=-1)//specify a valid value?????
        }catch(e:Exception){
            println(e.message)
        }
    }
