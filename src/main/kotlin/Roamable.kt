interface Roamable {

    val velocity: Int
        get() = 20

    fun roam(){
        println("The Roamable is roaming")
    }
}