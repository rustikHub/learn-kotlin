fun main(args: Array<String>) {
    var x = (5 / 2)
//println(x == 2.5) // ERROR: Operator '==' cannot be applied to 'Int' and 'Double'
    println(x == 2.5.toInt())

}

fun test1() {
    val test = Test("Salom");
    println(test)
}