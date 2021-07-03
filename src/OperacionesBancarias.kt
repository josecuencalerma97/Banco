class OperacionesBancarias(correo: String) : Cuenta(correo) {

    fun operacion(op: String): String {
        return when (op) {
            "1" -> obtenerFondos()
            "2" -> depositar()
            "3" -> retirar()
            else -> {
                Texto.texto.getTexto("bancaError")!!
            }
        }
    }



}