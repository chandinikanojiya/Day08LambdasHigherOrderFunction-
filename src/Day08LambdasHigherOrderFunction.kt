
/*
fun main() {
    val trickFunction = trick
    trick()
    trickFunction()
    treat()
}

val trick= {    // lambdas expression fun hata kr val lga diya and () hata kr = lga diya aur upper wale me variable
    // me store krne liye :: hata kr = naam de diya (trick) and fir main fun me humne call kr diya trick
    println("No treats!")
}
val treat: () -> Unit={ // yha pr paramerter() dene k liye and -> iske baad return type dena hota hai
    println("have a treat")
}
 */



/*
// Use a function as a return type
fun main() {
val treatFunction=trickOrTreat(false)
    val trickFunction=trickOrTreat(true)
    treatFunction()
    trickFunction()
}

fun trickOrTreat(isTrick: Boolean,): () -> Unit {
    if (isTrick){
        return trick
    }
    else{
        return treat
    }
}

val trick = {
    println("No treats!")
}

val treat = {
    println("Have a treat!")
}
 */


//Pass a function to another function as an argument
fun main() {
    val coins: (Int) -> String = { quantity -> "$quantity quarters"
    }
    val cupcake: (Int) -> String = { quantity -> "Have a cupcake!"
    }

    val treatFunction = trickOrTreat(false,coins)// coins wala function bheja
    val trickFunction = trickOrTreat(true,cupcake) //cupcake wala function bheja
    repeat(4) { // repeat built in function hai hum kisi bhi functon ko kitni baar bhi chala skte hai
        treatFunction()
    }
    trickFunction()
}
fun trickOrTreat(isTrick: Boolean, extraTreat: (Int) -> String): () -> Unit {
    if (isTrick) {
        return trick
    } else {
        println(extraTreat(5))
        return treat
    }
}

val trick = {
    println("No treats!")
}

val treat = {
    println("Have a treat!")
}


//Nullable function types fun me Iska syntax ye hai ki poore function type ko ek bracket me lapeto aur aage ? chipka do: ((Int) -> String)?