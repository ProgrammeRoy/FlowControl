import kotlin.random.Random

fun main(args: Array<String>){
    //While( ) Loop
    var i = 1
    while (i<10){
        print(i)
        i++
    }
    println()
    println("-----------")

    i=1
    do{
        print(i)
        if (i==5){
            break
        }
        i++
    }while (i<10)

    //Challenge
    var counter = 0
    while (counter<10){
        println("Counter: $counter")
        counter++
    }

    counter = 0
    var roll = 0
    val random = Random
    do{
        roll = random.nextInt(6)
        counter+=1
        println("After $counter roll(s), roll is $roll")
    }while (roll!=0)
    println(random)


}