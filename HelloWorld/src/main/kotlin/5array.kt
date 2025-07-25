//How can you use a for loop to create (a list of) the numbers
// between 0 and 100 that are divisible by 7?
fun main(){
    val divisibleBySeven = mutableListOf<Int>()
    for (i in 0..100){
        if(i % 7 == 0){
            divisibleBySeven.add(i)
        }
    }
    println(divisibleBySeven)
}