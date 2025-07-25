fun  main(){
    val fishname = "Speedo"
    when(fishname.length){
        0 -> println("error")
        in 3..12 -> println("Good fish name")
        else -> println("OK fish name")
    }
}