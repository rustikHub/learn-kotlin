package euler

fun main() {
    problem2()
}

fun problem3() {

}

fun problem2() {
    var f1 = 1
    var f2 = 2
    var sum = 2


    while (f2 <= 4_000_000) {
        val temp = f2

        f2 += f1

        f1 = temp

        if (f2 % 2 == 0) {
            sum += f2
        }

        print("$f2, ")
    }
    println("\n$sum jami")
}

fun problem1() {
    var sum = 0;

    for (i in 1 until 1000) {
        if (i % 3 == 0 || i % 5 == 0) {
            sum += i;
        }
    }

    println(sum);
}