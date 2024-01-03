/* creating of my average class */
public class Average {

    public double tpe, cc, exam;
    public Average(double tpe, double cc, double exam) {
        this.tpe = tpe;
        this.cc = cc;
        this.exam = exam;
    }

    public double averaging() {
        return ((tpe * 0.1) + (cc * 0.2) + (exam * 0.7));
    }
}
    
  
