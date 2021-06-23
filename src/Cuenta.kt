class Cuenta(var correo: String) {

    private var fondos: Double = 0.0

    fun depositar(monto: Double): String{
        fondos += monto
        return "Deposito exitoso"
    }

    fun retirar(monto: Double): String{
        var resp = "Fondos insuficientes"
        if(monto <= fondos){
            fondos -= monto
            resp = "Retiro exitoso"
        }
        return resp
    }

    fun obtenerFondos(): String{
        return "Tus fondos son $fondos pesos"
    }

}