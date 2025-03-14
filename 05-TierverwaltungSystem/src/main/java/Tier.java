import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class Tier {
    private String name;
    private int alter;


    public abstract String gibLaut();

    public void zeigeInfo(int alter, String name) {
        System.out.println(alter + " " + name);
    }

}
