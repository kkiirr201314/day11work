open class room(val name: String){
    fun description() = "Room: $name"

    open fun load () = "這裡沒什麼可看的..."
}
class TownSquare : room("Town Square"){
    override fun  load() = "因為你的到來村民正在歡呼與集會"
}