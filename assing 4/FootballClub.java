import java.util.ArrayList;

public class FootballClub {
    private String name;
    private final int maxSquadSize = 25;

    private ArrayList<Player> squad = new ArrayList<Player>();

    FootballClub(String teamName){
        name = teamName;
    }

    public String toString(){
        String msg = "FootballClub Name: " + name + " Player count: " + squad.size() + "\n" ;
        for(int i=0; i<squad.size() ; i++){
            msg += "\t" + squad.get(i) + "\n";
        }
        return msg;
    }

    public void removeAllPlayer(){
        squad.clear();
        return;
    }

    public void addPlayer(Player newPlayer){
        if(squad.size()<=maxSquadSize) squad.add(newPlayer);
        else System.out.println("There is Full!");
    }

    public Player findPlayer(String firstName, int jersey){
        for(int i=0; i<squad.size(); i++){
            if(squad.get(i).small_equals(firstName,jersey)) return squad.get(i);
        }
        return null;
    }
}
