import kotlin.system.exitProcess

fun main(){
    var  student1= Student("Ryan",20,175.5)
    var  student2= Student("Eunice",9,155.5)
    var  student3= Student("Grace",19,195.5)
    var  student4= Student("Robert",23,145.5)
    var  student5= Student("Shabella",10,174.5)
    println( student1.products())
    println( student2.products())
    println( student4.products())
    println( student3.products())
    println( "first name: ${student1.name}")
    println( "first name: ${student4.name}")
    (student1.heightts())
    (student2.heightts())
    (student3.heightts())
    (student4.heightts())

    var reading=ChatMessage("Kabonge","Regina",10.30,"How are you")
    println( "${reading.sender} says ${reading.messageBody}")
    var phonect=Kettle("phonic","electric","black",20.9)
    var big=Kettle("marble","solor","blue",40.0)
    var medium=Kettle("clay","sun","brown",10.0)
    var large=Kettle("glass","thermal","clear",5.0)
    phonect.turnOn()
    phonect.turnOff()
}

class Student(var name:String,var age:Int,var height:Double){
    //Write a function that returns the product of age by 2
    fun products():Int{
        var product=age*2
        return product
    }
    fun heightts(){
        if (175<=height){
            println("meduim height")
        }
        else if (180>=height){
            println("you are tall")
        }
        else{
            println("tall or short")
        }
    }
}
class Kettle(var model:String,var make:String,var color:String,speed:Double){
    fun turnOn(){
        println("zzzzzz")
    }
    fun turnOff(){
        println("zzzvvvv")
    }
}

//You are building a messaging application in Kotlin,write a class called chatMessage
// This chat message has properties such as sender, recipient, timestamp, and message body. Additionally,
//print out the message as read .

data class ChatMessage(var sender:String,var recipient:String,var timestamp:Double,var messageBody:String)