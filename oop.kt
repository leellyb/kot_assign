class fruit {
//VAR apple,lemon,appletaste, lemontaste, applecolor , lemoncolor

    var apple: String = "red"
    var lemon: String = "green"
    var appletaste: String = "sweet"
    var lemontaste: String = "sour"


    fun tastefruit() {
        println("The taste  of apple is ${appletaste} ")
        println("The taste of lemon is ${lemontaste} ")

    }

    fun colorfruit() {
        println("the color of apple is ${apple} ")
        println("the color of lemon is ${lemon} ")
    }



}
fun main(){
    val obj= fruit()
    println(" ${obj.tastefruit()}")
    println(" ${obj.colorfruit()}")


}