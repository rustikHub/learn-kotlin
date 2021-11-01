package euler

import kotlin.math.max

fun main() {
    problem7()
}

fun problem7() {

    var count = 1

    for (i in 3..Long.MAX_VALUE step 2) {
        if (isPrime(i)) {
            count++;
           // println("$count : $i")
        }

        if (count == 10_001) {
            println("10_001 prime number is $i")
            break;
        }
    }
}
fun isPrime(n: Long): Boolean {
    if (n <= 1) return false

    for (i in 2 until n/2) if (n % i == 0L) return false
    return true
}



fun problem6() {
    var sum = 0
    var sumSqr = 0
    for (i in 1..100) {
        sum += i;
        sumSqr += (i * i)
    }
    sum *= sum;

    println(sum - sumSqr)
}

fun problem5() {
    var num = 2520;


    var check = false;
    while (!check) {

        check = true;
        for (i in 2..20) {
            if (num % i != 0) {
                check = false;
                break;
            }
        }

        if (check) {
            break;
        }

        num += 2520;
    }

    println(num)
}

fun problem4() {
    var ans = 0
    for (i in 999 downTo 100) {
        for (j in 999 downTo 100) {
            //println("$i , $j")
            val num = i * j;
            if (num.toString().split("").reversed().joinToString("") == num.toString()) {
                ans = max(num, ans)
            }
        }
    }

    println("Answer : $ans");
}

fun problem3() {
    var num = 83L

    var div = 2
    var maxFact: Long;
    var ans: Long;

    while (num != 0L) {
        if (num % div != 0L) {
            println("Div = $div;")
            div++
        } else {
            println("Div = $div, Number = $num;")
            maxFact = num
            num /= div

            if (num == 1L) {
                println("$maxFact is the largest prime factor !");
                ans = 1;
                break;
            }
        }
    }


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