

fun main(){
    var b = schoolName("akira","chix")
    println(b)


}
//Write and invoke a function that takes in any 2 strings and returns the first
//character of the longer string or the first character of the first string if they are
//equal in length.
fun schoolName(name1:String,name2:String): String{
    var school=name1+name2
    return school
//}
//Write and invoke one function that takes in an array of integers and returns
//these 3 values: smallest, largest and average of all the elements
fun numbers(num1:Int,num2:Int,num3:Int): Int {
    var numbers = arrayOf(10, 20, 30, 40, 50)
    return (numbers.min())
    return (numbers.max())
    println(numbers.average())



//Write and call a function that takes in a string and splits it into all the
//characters that constitute it. Your function should print out this output.
fun schoolName(){
    var schoolName="Akirachix"
    println(schoolName[0])
    println(schoolName[1])
    println(schoolName[3])
    println(schoolName[4])
    println(schoolName[5])
    println(schoolName[6])
    println(schoolName[7])
    println(schoolName[8])



//Write and call a function that takes in an array of strings, joins them all into
//one string and returns it.
fun students(num1:String,num2:String): String{
    var position = num1 + num2
    println(position)


