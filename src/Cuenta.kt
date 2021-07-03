open class Cuenta(var correo: String) {

    private var fondos: Double = 0.0

    fun depositar(): String{
        print(Texto.texto.getTexto("bancaDeposito"))
        fondos += readLine().toString().toDouble()
        return Texto.texto.getTexto("bancaDepositoOk")!!
    }

    fun retirar(): String{
        print(Texto.texto.getTexto("bancaRetiro"))
        var monto = readLine().toString().toDouble()

        var resp = Texto.texto.getTexto("bancaRetiroError")!!
        if(monto <= fondos){
            fondos -= monto
            resp = Texto.texto.getTexto("bancaRetiroOk")!!
        }
        return resp
    }

    fun obtenerFondos(): String{
        return Texto.texto.getTexto("bancaSaldo")!!.format(fondos)
    }

}