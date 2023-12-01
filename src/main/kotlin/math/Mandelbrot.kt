package math

object Mandelbrot : AlgebraicFractal {
    val r = 2.0
    val r2 = r * r

    override var maxIterations: Int = 500
    override fun isInSet(z: Complex): Float {
        var i = 0
        val z1 = Complex()
        do{
            z1 *= z1
            z1 += z
        } while(++i < maxIterations && z1.abs2() < r2)
        return i / maxIterations.toFloat()
    }

}