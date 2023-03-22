import java.util.Scanner

var sc=Scanner(System.`in`)
fun main() {
    val oplist=listOf<Char>('+','-','*','/')
    operation(oplist)
}

fun operation(oplist: List<Char>){
    println("Enter a character amongst the following: \n+ : Addition \n- : Subtraction, \n * : Multiplication \n / : Division")
    var character= readLine()!!.first()
    println("Enter the first number")
    var a=sc.nextInt()
    println("Enter the second number")
    var b=sc.nextInt()
    when {
        character==oplist[0] -> println(a+b)
        character==oplist[1] -> println(a-b)
        character==oplist[2] -> println(a*b)
        character==oplist[3] -> println(a/b)
    }
}
