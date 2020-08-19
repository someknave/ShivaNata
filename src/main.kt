


fun main(){

}

fun ShivaPosition.shivaMove(right:String ="still", left:String ="still",
                            leg:String ="still", mirror: Boolean = false ): ShivaPosition{
    if (mirror) return ShivaPosition(translateMove(left, this.left), translateMove(right, this.right),
        translateMove(leg, this.leg), this.legMode)
    return ShivaPosition( translateMove(right, this.right), translateMove(left, this.left),
        translateMove(leg, this.leg), this.legMode)

}
fun translateMove(move: String, pose: Int): Int {
    if (move in positions.keys ) return positions[move]?:0
    if (pose % 2 == 0) return 0
    if (move in moves.keys) return (pose + (moves[move]?:0)) and 23
    return pose
}

val positions = mapOf<String, Int>("0" to 0, "1" to 1, "2" to 3, "3" to 5, "4" to 7, "5" to 17,
    "6" to 19, "7" to 21, "8" to 23)
val moves = mapOf<String, Int>("f" to 2, "b" to 6, "t" to 4, "c" to 16, "cf" to 18, "ct" to 20, "cb" to 22)