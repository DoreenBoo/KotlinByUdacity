fun main(){
    val numbers = intArrayOf(11,12,13,14,15)
    var stringList = mutableListOf<String>()
    for (i in numbers){                     //使用for循环遍历numbers数组
        stringList.add(i.toString())
    }
    println(stringList)
}
