import java.util.Objects;

public class Player {
    private String firstName;
    private String LastName;
    private int jerseyNumber;

    Player(String first, String Last, int number){
        firstName = first;
        LastName= Last;
        jerseyNumber = number;
    }

    public String toString(){
        String str = "["+LastName+", "+firstName+" "+jerseyNumber+"]";
        return str;
    }

    public boolean small_equals(String first, int number){
        if(first.equals(firstName) && number==jerseyNumber) return true;
        else return false;
    }

    public boolean equals(Object newPlayer){
        if(!(newPlayer instanceof Player)) return false;
        Player Player2 = (Player) newPlayer;
        return firstName == Player2.firstName && LastName == Player2.LastName && jerseyNumber == Player2.jerseyNumber;
    }

    public int hashCode(){
        int result = 1;
        result = 31 * result + Objects.hashCode(firstName);
        result = 31 * result + Objects.hashCode(LastName);
        result = 31 * result + Integer.hashCode(jerseyNumber);
        return result ;
    }
}
