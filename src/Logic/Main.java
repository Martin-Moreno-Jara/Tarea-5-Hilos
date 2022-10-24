//Martin Moreno Jara, Gabriel Felipe Fonseca Guerrero (grupo 5)
package Logic;

import data.Salon;

public class Main {
    public static void main(String[] args){

        Salon salon2 = new Salon(20,1);
        Salon salon1 = new Salon(25);
        salon1.setNumero_salon(2);

        Thread thread_salon2 = new Thread(salon2);
        Thread thread_salon1 = new Thread(salon1);

        thread_salon2.start();
        thread_salon1.start();

    }
}