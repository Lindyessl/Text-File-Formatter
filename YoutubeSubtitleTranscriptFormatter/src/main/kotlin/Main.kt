import java.io.File
// User inputs
// Directory location of input text file. E.g. C:\\Users\\lindy\\Desktop
var directory = ""
// Input & Output text file name parameters at directory. Include txt extension.
var inputFileName = "input.txt"
var outputFileName = "output.txt"
// Find "X" in input.txt, replace with "Y" in created output.txt within same directory
var find = ""
var replace = ""





val file = (File("$directory"+File.separator+"$inputFileName"))
fun main() {
    var output = formatModify()
    File("$directory"+File.separator+"$outputFileName").writeText(output)
        println("Output created")
}
fun formatModify(): String
{
    return file.readText().replace("$find","$replace")
}