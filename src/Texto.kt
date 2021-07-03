class Texto: Idiomas {

    private var texto: MutableMap<String, MutableMap<String,String>> = mutableMapOf()

    init {
        loadTexto()
    }

    override fun loadTexto() {
        //Cargar textos en español
        texto["es"] = mutableMapOf(
                "saludo" to "!Bienvenidos a La Poderosisima App Fintech!"
        )
    }

    override fun getTexto(id: String): String? {
        //Verificar si el idioma está disponible, sino español por defecto
        if(LNG !in texto.keys){
            LNG = "es"
        }
        return texto[LNG]!![id]
    }

    companion object{
        var LNG = "es"
        var texto = Texto()
    }

}