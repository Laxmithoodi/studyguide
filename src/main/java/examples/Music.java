package examples;
import java.util.List;

public abstract class Music  {

    List<Notes> notesList;

    public Music(List<Notes> notes){ }

    public Music(){}

    public abstract String playNotes();
}