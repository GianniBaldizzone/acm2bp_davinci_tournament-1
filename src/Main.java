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


        Season torneoDaVinci = new Season("Torneo 2022, 2do cuatri", comienzoDeCursada, finDeCursada);

        Team profesPoo = new Team ("Profesores POO");
        profesPoo.addPlayer(new Player("Sergio Medina", "Goalkeeper"));
        profesPoo.addPlayer(new Player("Suplente", "Defender"));
        profesPoo.addPlayer(new Player("Victor Hugo","Forward"));
        profesPoo.addPlayer(new Player("Daniel Web","Midfielder"));
        profesPoo.addPlayer(new Player("Hector Fenochi","Forward"));

        Team estudiantesPoo = new Team ("Estudiantes POO");
        estudiantesPoo.addPlayer(new Player("Facundo Preiss", "Forward"));
        estudiantesPoo.addPlayer(new Player("Lucas Emens", "Defender"));
        estudiantesPoo.addPlayer(new Player("Gianni Baldizzone","Goalkeeper"));
        estudiantesPoo.addPlayer(new Player("Santino Fazio","Midfielder"));
        estudiantesPoo.addPlayer(new Player("Angel Lopez","Forward"));

        Match primerParcial = new Match (
                "Aula 116",
                fechaParcial,
                profesPoo,
                estudiantesPoo);

        System.out.println(primerParcial.generateMarker());
        primerParcial.makeGoal(profesPoo, profesPoo.getPlayer().get(0)); //get(0) es un metodo para acceder al espacio 0 del ArrayList <Player>
        System.out.println(profesPoo.getPlayer().get(0));
        System.out.println(primerParcial.generateMarker());








    }
}
