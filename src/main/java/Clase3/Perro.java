package Clase3;

public class Perro extends ReinoAnimal{
    class perro{

    }

    private String nombre;
    private int edad;
    private String peso;
    private String fechaNacimiento;

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }

    public String getPeso(){
        return this.peso;
    }
    public void setPeso(String peso){
        this.peso=peso;
    }

    public String getFechaNacimiento(){
        return this.fechaNacimiento;
    }
    public void setFechaNacimiento(String fechaNacimiento){
        this.fechaNacimiento=fechaNacimiento;
    }


    public String ladrar(){
        return "El perro esta ladrando";
    }

    public String comer(){
        return "El perro esta comiendo";
    }

}
