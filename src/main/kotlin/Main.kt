fun main (){

    var idade = 18


    println("Entre com a sua idade: ")
    var age: Int = readLine()!!.toInt()

    if(age >=18)
        println("Você é maior de idade.")
    else
        println("Você não é maior de idade...")
}