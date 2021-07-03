class Usuarios{

    private var usuarios = mutableListOf<Persona>(
            Persona("José","jose@cuenca.com","123"),
            Persona("Luis Adrian","luis@bustamante.com","123"),
            Persona("Daniel Diego","daniel@diego.com","123"),
            Persona("Josue Alejandro","josue@alejandro.com","123"))

    private lateinit var usuario: Persona
    lateinit var banca: OperacionesBancarias
    var isLogIn = false

    fun logIn(email:String,contrasena:String): String?{
        var resp = Texto.texto.getTexto("logInError")
        for(usuario in usuarios){
            if(usuario.email == email && usuario.contrasena == contrasena){
                resp = Texto.texto.getTexto("logInOk")
                this.isLogIn = true
                this.usuario = usuario
                this.banca = OperacionesBancarias(this.usuario.email)
                break
            }
        }
        return resp
    }
}