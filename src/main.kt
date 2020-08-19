


fun main(){

}


fun faf(pose: ShivaPosition): ShivaPosition{
    return ShivaPosition((pose.left + 1) and 19, (pose.right + 1) and 19, pose.leg, pose.legMode)
}
fun bab(pose: ShivaPosition): ShivaPosition{
    return ShivaPosition((pose.left + 3) and 19, (pose.right + 3) and 19, pose.leg, pose.legMode)
}
fun fab(pose: ShivaPosition): ShivaPosition{
    return ShivaPosition((pose.left + 1) and 19, (pose.right + 3) and 19, pose.leg, pose.legMode)
}
fun baf(pose: ShivaPosition): ShivaPosition{
    return ShivaPosition((pose.left + 3) and 19, (pose.right + 1) and 19, pose.leg, pose.legMode)
}
fun cfacf(pose: ShivaPosition): ShivaPosition{
    return ShivaPosition((pose.left + 17) and 19, (pose.right + 17) and 19, pose.leg, pose.legMode)
}
fun cbacb(pose: ShivaPosition): ShivaPosition{
    return ShivaPosition((pose.left + 19) and 19, (pose.right + 19) and 19, pose.leg, pose.legMode)
}
fun cfacb(pose: ShivaPosition): ShivaPosition{
    return ShivaPosition((pose.left + 17) and 19, (pose.right + 19) and 19, pose.leg, pose.legMode)
}
fun cbacf(pose: ShivaPosition): ShivaPosition{
    return ShivaPosition((pose.left + 19) and 19, (pose.right + 17) and 19, pose.leg, pose.legMode)
}
fun tat(pose: ShivaPosition): ShivaPosition{
    return ShivaPosition((pose.left + 2) and 19, (pose.right + 2) and 19, pose.leg, pose.legMode)
}
fun cac(pose: ShivaPosition): ShivaPosition{
    return ShivaPosition((pose.left + 16) and 19, (pose.right + 16) and 19, pose.leg, pose.legMode)
}
fun ctact(pose: ShivaPosition): ShivaPosition{
    return ShivaPosition((pose.left + 18) and 19, (pose.right + 18) and 19, pose.leg, pose.legMode)
}
fun mirror(pose: ShivaPosition): ShivaPosition{
    return ShivaPosition(pose.right, pose.left, pose.leg, pose.legMode)
}
fun facf(pose: ShivaPosition): ShivaPosition{
    return ShivaPosition((pose.left + 1) and 19, (pose.right + 17) and 19, pose.leg, pose.legMode)
}
fun bacb(pose: ShivaPosition): ShivaPosition{
    return ShivaPosition((pose.left + 3) and 19, (pose.right + 19) and 19, pose.leg, pose.legMode)
}
fun facb(pose: ShivaPosition): ShivaPosition{
    return ShivaPosition((pose.left + 1) and 19, (pose.right + 19) and 19, pose.leg, pose.legMode)
}
fun bacf(pose: ShivaPosition): ShivaPosition{
    return ShivaPosition((pose.left + 3) and 19, (pose.right + 17) and 19, pose.leg, pose.legMode)
}
fun cfaf(pose: ShivaPosition): ShivaPosition{
    return ShivaPosition((pose.left + 17) and 19, (pose.right + 1) and 19, pose.leg, pose.legMode)
}
fun cbab(pose: ShivaPosition): ShivaPosition{
    return ShivaPosition((pose.left + 19) and 19, (pose.right + 3) and 19, pose.leg, pose.legMode)
}
fun cfab(pose: ShivaPosition): ShivaPosition{
    return ShivaPosition((pose.left + 17) and 19, (pose.right + 3) and 19, pose.leg, pose.legMode)
}
fun cbaf(pose: ShivaPosition): ShivaPosition{
    return ShivaPosition((pose.left + 19) and 19, (pose.right + 1) and 19, pose.leg, pose.legMode)
}
fun cat(pose: ShivaPosition): ShivaPosition{
    return ShivaPosition((pose.left + 16) and 19, (pose.right + 2) and 19, pose.leg, pose.legMode)
}
fun tac(pose: ShivaPosition): ShivaPosition{
    return ShivaPosition((pose.left + 2) and 19, (pose.right + 16) and 19, pose.leg, pose.legMode)
}
fun tact(pose: ShivaPosition): ShivaPosition{
    return ShivaPosition((pose.left + 2) and 19, (pose.right + 18) and 19, pose.leg, pose.legMode)
}
fun tcat(pose: ShivaPosition): ShivaPosition{
    return ShivaPosition((pose.left + 18) and 19, (pose.right + 2) and 19, pose.leg, pose.legMode)
}
fun cact(pose: ShivaPosition): ShivaPosition{
    return ShivaPosition((pose.left + 16) and 19, (pose.right + 18) and 19, pose.leg, pose.legMode)
}
fun ctat(pose: ShivaPosition): ShivaPosition{
    return ShivaPosition((pose.left + 18) and 19, (pose.right + 16) and 19, pose.leg, pose.legMode)
}