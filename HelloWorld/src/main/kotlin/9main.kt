fun main(){
    val fortune = getFortuneCookie()
    println("your fortune is: $fortune")
}
fun getFortuneCookie():String{
    val fortunes = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )
    print("Enter your birthday:")
    val birthday = readLine()
    val intBirthday = birthday?.toIntOrNull()?:1
//    println(intBirthday)

    val index = intBirthday % fortunes.size
//    println(index)
    return fortunes[index]

}