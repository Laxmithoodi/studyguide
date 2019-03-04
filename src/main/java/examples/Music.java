package examples;
import java.util.List;

public abstract class Music  {

    List<Notes> notesList;

    public Music(List<Notes> notes){ }

    public Music(){}

    public abstract String playNotes();

    public List<Notes> getNotesList() {
        return notesList;
    }

    public void setNotesList(List<Notes> notesList) {
        this.notesList = notesList;
    }
}