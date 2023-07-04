fun main(){
    var artist = Artist("Malaika","Kenya","gospel", instruments = listOf("guitar","piano",))
    println(artist.artistDetail())
    var perform = Performance("Nikita","Kenya","love song", instruments = listOf("guitar","piano"),"2 hours")

    println(perform.playInstrument("guitar"))
    var stage = Stage("Marisa","Kenya","bongo", instruments = listOf("piano","harp","violin",),100,"Samburu")
    println(stage.performance())



    // Create multiple objects of the Product class
    val product1 = Product("mangoes", 10.99, 5)
    println(product1.calculateTotalValue())
    val product2 = Product("bananas", 4.99, 10)
    println(product2.calculateTotalValue())
    val product3 = Product("kale", 2.5, 20)
    println(product3.calculateTotalValue())



    val student = Product.Student("Marisah", 24, mutableListOf(50,80,92,78,86))
    println( student.avgGrade())
    student.studentInfo()
    student.passed()
}

//**African Music Festival:** You're in charge of organizing a Pan-African music
//festival. Many artists from different countries, each with their own musical style
//and instruments, are scheduled to perform. You need to write a program to
//manage the festival lineup, schedule, and stage arrangements. Think about how
//you might model the `Artist`, `Performance`, and `Stage` classes, and consider
//how you might use inheritance if there are different types of performances or
//stages.


open class Artist(var name:String, var country:String, var musicType:String, var instruments:List<String>){
    fun artistDetail(){
        println("name:$name, country:$country, musicType:$musicType, instruments:${instruments.joinToString()}")
    }
}
class Performance(name: String, country: String, musicType: String, instruments: List<String>, var stageTime:String):Artist(name,country,musicType,instruments){

    fun playInstrument(instrument:String){
        if (instruments.contains(instrument)){
            println("$name is playing $instrument")
        }
        else{
            println("$name is not playing $instrument")
        }
    }
}
class Stage(name: String, country: String, musicType: String, instruments: List<String>, var capacity:Int,var location:String):Artist(name,country,musicType,instruments){
    fun performance(){
        println("name:$name, country:$country, musictype:$musicType, capacity:$capacity, place:$location")
    }
}

//Create a class called Product with attributes for name, price, and quantity.
//Implement a method to calculate the total value of the product (price * quantity).
//Create multiple objects of the Product class and calculate their total values.

class Product(var name: String, var price: Double, var quantity: Int) {
    fun calculateTotalValue(): Double {
        return price * quantity
    }

//    Implement a class called Student with attributes for name, age, and grades (a
//    list of integers). Include methods to calculate the average grade, display the
//    student information, and determine if the student has passed (average grade >=
//    60). Create objects for the Student class and demonstrate the usage of these
//    methods.

class Student(var name:String, var age:Int, var grades:MutableList<Int>){

        fun avgGrade(): Double {
            var sum = 0
            for (grade in grades) {
                sum += grade
            }
            return sum.toDouble()
        }
        fun studentInfo(){
            println("$name of age $age has passed with an average of ${avgGrade()}")
        }
        fun passed(){
            if (avgGrade()>=60){
                println("$name has passed")
            }
            else {
                println("$name has failed")
            }
        }
}
}

