fun main(){
    //Base de datos
    var usuarios = Usuarios()

    //Datos para trabajar
    var email = "jose@cuenca.com"
    var contrasena = "123"

    //LogIn
    println(usuarios.logIn(email,contrasena))

    //Operaciones con la cuenta
    if(usuarios.cuenta != null){
        //Ver fondos
        println(usuarios.cuenta.obtenerFondos())

        //Depositar
        println(usuarios.cuenta.depositar(100.0))
        println(usuarios.cuenta.depositar(50.0))
        println(usuarios.cuenta.depositar(70.0))

        //Retirar
        println(usuarios.cuenta.retirar(60.0))
        println(usuarios.cuenta.retirar(40.0))

        //Ver fondos
        println(usuarios.cuenta.obtenerFondos())
    }


}