package com.campusdual.classroom;

public class TVRemote {

    int channel;
    int volume;
    boolean on;
    String color;

    public TVRemote(String color) {
        this.channel = 0;
        this.volume = 20;
        this.color = color;


    }

    public boolean turnOn() {
        if(on) {
            System.out.println("La TV ya está encendida");
        } else {
            System.out.println("La TV se ha encendido");
            on=true;
        }
        return on;
    }

    public boolean turnOff() {
        if (!on){

            System.out.println("La TV está apagada");
        } else {
            System.out.println("La TV se ha apagado");
            on=false;
        }
        return on;
    }

    public void channelUp() {
        this.channel++;
        System.out.println("Estás en el canal: " + this.channel);

    }

    public void channelDown() {
        if (this.channel > 0){
            this.channel--;
        } else {
            System.out.println("No se puede bajar más de canal.");
        }

    }

    public void volumeUp() {
        this.volume++;
        System.out.println("El volumen está al: " + this.volume);
      
    }

    public void volumeDown() {
        if (this.volume > 0){
            this.volume--;
        } else {
            System.out.println("No puedes bajar más el volumen");
        }

    }

    public String getColor() {
        if (this.color.equals("Rojo")){
            System.out.println("El color del mando es: " );
        } else {
            System.out.println("El color del mando es: ");
        }
        return this.color;

    }

    private boolean checkMinValue(int value) {
        if (value == 0) {
            return false;
        } else {
            return true;
        }
    }

}
