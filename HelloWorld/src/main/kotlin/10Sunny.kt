fun main(){
    print("Enter your mood: ")
    val mood = readLine()?:"neutral"

    print("Enter your weather(sunny, rainy, cloudy):")
    val weather = readLine()?:"sunny"

    print("Enter your temperature:")
    val temperature = readLine()?.toIntOrNull() ?: 24

    val activity = when{
        isHappySunny(mood, weather) -> "go for a walk"
        isSadRainyCold(mood, weather, temperature) -> "Stay in bed."
        isHot(temperature) -> "Go swimming."
        else -> "Stay home and watch TV."
    }
    println("Activity suggestion: $activity")
}

//单函数表达式
fun isHappySunny(mood:String, weather:String) = mood == "happy" && weather == "sunny"
fun isSadRainyCold(mood:String, weather:String, temperature:Int) = mood == "sad" && weather == "rainy" && temperature == 0
fun isHot(temperature:Int) = temperature > 35

/*
fun whatShouldIDoToday(mood:String, weather: String = "Sunny", temperature:Int = 24):String{
    return when {
        mood == "happy" && weather == "Sunny" -> "go for a walk"
        mood == "sad" && weather == "Rainy" -> "stay home and watch TV"
        temperature > 35 -> "go swimming"
        else -> "Stay home and watch TV"
    }

}*/
