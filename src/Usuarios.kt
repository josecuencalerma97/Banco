class Usuarios{

    private var usuarios = mutableListOf<Persona>(
            Persona("José","jose@cuenca.com","123"),
            Persona("Luis Adrian","luis@bustamante.com","123"),
            Persona("Daniel Diego","daniel@diego.com","123"),
            Persona("Josue Alejandro","josue@alejandro.com","123"))

    private lateinit var usuario: Persona
    lateinit var cuenta: Cuenta

    fun logIn(email:String,contrasena:String): String{
        var resp = "El correo/contrasena no coinciden";
        for(usuario in usuarios){
            if(usuario.email == email && usuario.contrasena == contrasena){
                resp = "LogIn Exitoso"
                this.usuario = usuario
                this.cuenta = Cuenta(this.usuario.email)
                break
            }
        }
        return resp
    }
}