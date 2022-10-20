import java.util.Date;

public class Match {
    private String location;
    private Date date;
    private Team localTeam;
    private Team visitantTeam;
    private int localGoalCounter;
    private int visitantGoalCounter;

    Match(){
       this.setLocalGoalCounter(0);
       this.setVisitantGoalCounter(0);

    }

    Match(String location,Date date){
        this.setLocation(location);
        this.setDate(date);
        this.setLocalGoalCounter(0);
        this.setVisitantGoalCounter(0);

    }

    public void setLocation(String location){
        this.location = location;
        return;
    }
    public String getLocation(){
        return this.location;
    }

    public void setDate(Date date){
        this.date = date;
        return;
    }
    public Date getdate(){
        return this.date;
    }
    public void setLocalTeam(Team localTeam){
        this.localTeam = localTeam;
    }
    public void setVisitantTeam(Team visitantTeam){
        this.visitantTeam = visitantTeam;
    }
    public Team getLocalTeam(){
        return this.localTeam;
    }
    public void incrementLocalCounter(){
        this.localGoalCounter++;
    }

    public int getLocalCounter(){
        return this.localGoalCounter;
    }

    public void setLocalGoalCounter(int localGoalCounter) {
        this.localGoalCounter = localGoalCounter;
        return;
    }
    public void setVisitantGoalCounter(int visitantGoalCounter) {
        this.visitantGoalCounter = visitantGoalCounter;
        return;
    }
}