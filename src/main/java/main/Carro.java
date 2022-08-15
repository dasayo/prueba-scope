package main;

public class Carro {
    private int puertas;
    private String modelo;
    private String color;
    private int contPit =1;

    private float acelarar;

    public Carro() {
        this.color = "Blanco";
        this.modelo = "TXL";
        this.puertas = 4;
        this.acelarar = 0;
    }

    public void pitar(){
        this.contPit++;
        System.out.println("Peeeeee Peeeeee");
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void acelerar(float segundos){
        this.acelarar = 5*segundos;
    }

    public int getContPit() {
        return contPit;
    }
}
