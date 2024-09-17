package Clase2;

public class Persona {

    // Constructor sin argumentos
    Persona(){

    }

   // Constructor con argumento nombreCompleto
    Persona(String nombreCompleto){
        this.nombreCompleto=nombreCompleto;
    }

    // Atributos - preferiblemente privados
    private String nombreCompleto;
    private  int edad;
    private String genero;
    private String identificacion;
    private String tipoDocumento;
    private String telefono;

//    en caso de necesitar darle acceso desde otro lugar debemos generar GET Y SET (getter and setters)
    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int edad){
        this.edad=edad;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    //    construyendo funciones
    public String correr(){
        return  "Estoy corriendo";
    }

    public String saltar(){
        return  "Estoy saltando";
    }

    public String nadar(){
        return  "Estoy nadando";
    }

//    en caso que el metodo no retorne nada utilizamos VOID
    public void escalar(){

    }

}
