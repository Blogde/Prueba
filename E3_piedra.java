import java.util.Scanner;


public class E3_piedra {

   
    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);
       
        String jugador;
        String maquina;

        System.out.print("Elige piedra (P) o tijera (T): ");
        jugador = teclado.next();

        while (!jugador.equals("P") && !jugador.equals("p")
        && !jugador.equals("T") && !jugador.equals("t")) {

        System.out.println("Opcion no valida.");
        System.out.print("Introduce P o T: ");
        jugador = teclado.next();
}

        int aleatorio = (int) (Math.random() * 2);

        if (aleatorio == 0) {
        maquina = "P";
        } else {
        maquina = "T";
        }

        System.out.println("Jugador: " + jugador);
        System.out.println("Maquina: " + maquina);

        if (jugador.equals("P") || jugador.equals("p")) {
        if (maquina.equals("T")) {
        System.out.println("El jugador 1 ha ganado.");
        } else {
        System.out.println("La maquina ha ganado.");
        }
        } else {
        if (maquina.equals("P")) {
        System.out.println("La maquina ha ganado.");
        } else {
        System.out.println("El jugador 1 ha ganado.");
    }
}

        teclado.close();

    }

}