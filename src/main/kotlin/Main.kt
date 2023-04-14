import kotlin.system.exitProcess

fun main(){
    var  student1= Student("Ryan",20,175.5)
    var  student2= Student("Eunice",9,155.5)
    var  student3= Student("Grace",19,195.5)
    var  student4= Student("Robert",23,145.5)
    var  student5= Student("Shabella",10,174.5)
    println( student1.products())
    println( student2.products())
    println( student3.products())
    println( "first name: ${student1.name}")
    println( student4.products())

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
Shapes()
    var rectangle=Rectangle(123.0,130.0)
    rectangle.perimeter()
    rectangle.area()
    var circle=Circles(11.5)
    circle.area()
    circle.perimeter()
    var triangle=Triangle(123.0,89.0)
   triangle.perimeter()
    triangle.area()

    var employees1=Fulltime("Regina",3245678,10,10)
    var employees2=Fulltime("Robert",267890,5,5)
    var employees3=Fulltime("Ryan",2345678,3,12)
    var employees7=Fulltime("Eunice",8764568,10,11)
    employees1.fulltimepay()
    employees1.fulltimepay()
    employees3.fulltimepay()
    employees7.fulltimepay()
    var employees4=Parttime("Philiph",34567,1,8)
    var employees5=Parttime("Ann",7654876,2,9)
    var employees6=Parttime("Grace",1234567,4,4)
    employees4.partpay()
    employees5.partpay()
    employees6.partpay()
    var toyota =Cars("toyota","landcruiser",1990,60)
    var bmw=Cars("Bmw","i7",1990,80)
    var audi=Cars("audi","suv",2000,70)
    toyota.accellaration()
    bmw.deaccelaration()
    var character=Characters("Winnie",3,6)
    var character1=Characters("Marion",1,3)
    var character2=Characters("Aluel",1,1)
    character1.strategy()
    character2.attacking()
    character.defending()
    var character3=Heroes("mary",1,3)
    var character4=Villians("veronica",7,5)
    var character5=Villians("loice",5,1)
    var character6=Heroes("cytnthia",3,2)
    character5.strategy()
    character6.strategy()
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


//Implement a base class in Kotlin for a simple shape hierarchy that includes subclasses for circles,
// rectangles, and triangles. Each subclass should have properties for the shape's dimensions
// (e.g., radius for circles, width and height for rectangles, and base and height for triangles),
// as well as methods for calculating the shape's area and perimeter.
 class Shapes(){

 }
class Circles(var radius:Double){
    fun area(){
        var area :Double=Math.PI*radius
        println(area)
    }
    fun perimeter(){
        var perimeter=(Math.PI*radius)*2
        println(perimeter)
    }

}
class Rectangle(var width:Double,var height:Double){
    fun perimeter(){
        var perimeter=(width+height)*2
        println(perimeter)
    }
    fun area(){
        var area=width*height
        println(area)
    }
//

}
class Triangle(var base:Double,var height: Double){
    fun perimeter() {
        var trianglearea = base * height
        println(trianglearea)
    }
    fun area(){
        var perimeter=(base*2)+(height*2)
        println(perimeter)
    }
}
//Write a Kotlin program that demonstrates the use of inheritance by creating a base class for
// employees, and subclasses for full-time and part-time employees. Each employee subclass should have
// properties for the employee's name, ID number, and hourly rate, as well as methods for calculating
// the employee's pay (based on hours worked and hourly rate).
open class Employees(var name : String,var iDnumber:Int,var hourlyrate:Int,var workedhours:Int){

}
class Fulltime(name: String,iDnumber: Int,hourlyrate: Int,workedhours: Int,)
    :Employees(name,iDnumber,hourlyrate,workedhours){
        fun fulltimepay(){
    var pay=workedhours*hourlyrate
        println(pay)
    }
    }

class Parttime(name: String,iDnumber: Int,hourlyrate: Int,workedhours: Int,)
    :Employees(name,iDnumber,hourlyrate,workedhours){
   fun partpay (){
    var pay=workedhours*hourlyrate
    println(pay)
}
}
//Write a Kotlin program that demonstrates the use of inheritance by creating a base class for vehicles,
// and subclasses for cars and motorcycles. Each vehicle subclass should have properties for the vehicle
// 's make, model, and year, as well as methods for accelerating and braking.
class Vehicles(var make:String,var model:String,var year:Int,var speed:Int){

}
class Cars(var make:String,var model:String,var year:Int,var speed:Int){
  fun accellaration(){
      var accellarate=0
      println(accellarate++)
  }
    fun deaccelaration(){
        var deaccelarate=speed--
        println(deaccelarate)
    }
}
class Motorcycles(var make:String,var model:String,var year:Int,var speed:Int) {
    fun accellaration() {
        var accellarate = speed++
        println(accellarate)
    }
    fun deaccelaration(){
        var deaccelarate=speed--
        println(deaccelarate)
    }
}
//Create a class hierarchy in Kotlin for a simple video game that includes a base class for characters,
// and subclasses for heroes and villains. Each character subclass should have properties for the
// character's name, health, and attack power, as well as methods for attacking and defending.
open class Characters(var name: String,var health:Int,var attackpower:Int){
    fun attacking(){
        var attack=attackpower+health
        println(attack)
    }
    fun defending(){
        var defend=health/attackpower
        println(defend)
    }
    open fun strategy(){
        println ("I did it")

    }
}
 class Heroes( name: String,health:Int,attackPower:Int):Characters(name,health,attackPower){
     override fun strategy(){
         println("divide and conqure")
     }
}
class Villians(name: String,health:Int,attackPower:Int):Characters(name,health,attackPower){
   override fun strategy(){
       println("kill them all")
   }
}




