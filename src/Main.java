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

        Date fechaParcial= new Date(2022,9,29);


        Season torneoDaVinci = new Season(
            "Torneo 2022, 2do cuatri",
            comienzoDeCursada,
            finDeCursada
        );

        Player profeSergio = new Player(
                "Sergio Medina",
                "Goalkeeper");
        Player profeSuplente = new Player(
                "Suplente",
                "Defender");

        Team profesPoo = new Team ("Profesores POO");
        profesPoo.addPlayer(profeSuplente);
        profesPoo.addPlayer(profeSergio);

        Team estudiantesPoo = new Team ("Estudiantes POO");

        Match primerParcial = new Match (
                "Aula 116",
                fechaParcial,
                profesPoo,
                estudiantesPoo);








    }
}
