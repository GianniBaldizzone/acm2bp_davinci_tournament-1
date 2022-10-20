import java.util.Date;

public class Main {
    public static void main(String args[]) {
        System.out.println("Da Vinci Tournament");
        Date comienzoDeCursada = new Date(
                2022,
                7,
                18);

        Date finDeCursada = new Date(
                2022,
                11,
                5);


        Season torneoDaVinci = new Season(
            "Torneo 2022, 2do cuatri",
            comienzoDeCursada,
            finDeCursada
        );


    }
}
