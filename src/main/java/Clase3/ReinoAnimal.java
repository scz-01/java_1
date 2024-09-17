package Clase3;

public class ReinoAnimal {

    ReinoAnimal(){

    }

    // Atributos
    private String altura;
    // vertebrados - invertebrados
    private String estructuraVertebral;
    // herbivoros - carnivoros - omnivoros
    private String alimentacion;
    // terrestre - acuatico - aeroterrestre
    private String habitat;
    // oviparos - viviparos - ovoviviparos
    // private String reproduccion;

    public String getAltura(){
        return this.altura;
    }
    public void setAltura(String altura){
        this.altura=altura;
    }

    public String getEstructuraVertebral(){
        return this.estructuraVertebral;
    }
    public void setEstructuraVertebral(String estructuraVertebral){
        this.estructuraVertebral=estructuraVertebral;
    }

    public String getAlimentacion(){
        return this.alimentacion;
    }
    public void setAlimentacion(String alimentacion){
        this.alimentacion=alimentacion;
    }

    public String getHabitat(){
        return this.habitat;
    }
    public void setHabitat(String habitat){
        this.habitat=habitat;
    }


    public String cazar(){
        return "Cazando";
    }
    public String escalar(){
        return "Escalando";
    }
    public String nadar(){
        return "Nadando";
    }

}