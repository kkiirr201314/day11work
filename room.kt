open class room(val name: String){
    protected open val dangerLevel = 5

    fun description() = "Room: $name\n" + "Danger level: $dangerLevel"

    open fun load () = "這裡沒什麼可看的..."
}
class TownSquare : room("Town Square"){
    override val dangerLevel = super.dangerLevel -3

    override fun  load() = "因為你的到來村民正在歡呼與集會"
}