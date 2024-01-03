/* creating of my note class */
public class Note {
    
    public double noteTpe;
    public double noteCc;
    public double noteExam;

    public Note(double noteTpe, double noteCc, double noteExam) {
        this.noteTpe = noteTpe;
        this.noteCc = noteCc;
        this.noteExam = noteExam;
    }

    public double getNoteTpe() {
        return noteTpe;
    }
    public double getNoteCc() {
        return noteCc;
    }
    public double getNoteExam() {
        return noteExam;
    }
    public void setNoteTpe(double noteTpe) {
        this.noteTpe = noteTpe;
    }
    public void setNotecc(double noteCc) {
        this.noteCc = noteCc;
    }
    public void setNoteExam(double noteExam) {
        this.noteExam = noteExam;
    }    
}
