package data;

import java.util.Random;

public class Salon implements Runnable{
    Random ram = new Random();

    public int getDuracion_clase() {
        return duracion_clase;
    }

    public void setDuracion_clase(int duracion_clase) {
        this.duracion_clase = duracion_clase;
    }

    public int getNumero_salon() {
        return numero_salon;
    }

    public void setNumero_salon(int numero_salon) {
        this.numero_salon = numero_salon;
    }

    private int duracion_clase;
    private int numero_salon;

    public Salon(int duracion_clase){
        this.duracion_clase=duracion_clase;
    }
    public Salon(int duracion_clase,int num_salon){
        this.duracion_clase=duracion_clase;
        this.numero_salon = num_salon;
    }

    public void stop(){
        duracion_clase=-1;
    }

    @Override
    public void run(){

        int contador =0;
        int numero_estudiantes=0;
        int profesor = 1;

        while(contador<this.duracion_clase){
            try{
                int numero_random = ram.nextInt(1,5);
                contador++;
                numero_estudiantes += numero_random;
                Thread.sleep(1000);
                System.out.println("Salon "+this.getNumero_salon()+": "+contador+" minutos de clase, "+numero_estudiantes+" estudiantes y "+profesor+" profesor");
            }
            catch (InterruptedException error){
                error.printStackTrace();
            }
        }
        System.out.println("\nEl salon "+this.getNumero_salon()+ " ha terminado su clase a los "+contador+" minutos, con "+numero_estudiantes+" estudiantes"+
                " y "+profesor+" profesor");

    }
}
