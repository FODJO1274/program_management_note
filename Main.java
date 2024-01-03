import java.util.Scanner;
public class Main {

    /* Declaration of attributes of my class */
    private static String nameStudent;
    private static String surnameStudent;
    private static String registrationNumberStudent;
    private static char   sexStudent;
    private static double myNoteTpe;
    private static double myNoteCc;
    private static double myNoteExam;

    public static void main(String[] args) {
    

        Scanner scanner = new Scanner(System.in);

        /* creation of differents tables of my elements */
        Student[] tabStudent = new Student[2];
        Note[] tabNote = new Note[2];
        Average[] tabAverage = new Average[2];

        /* Information recovery */
        for(int i = 0; i < 2; i++) {
            System.out.println("Enter the name : ");
            nameStudent = scanner.nextLine();                                                
            System.out.println("Enter the surname : ");
            surnameStudent = scanner.nextLine();                                                
            System.out.println("Enter the sexStudent : ");
            sexStudent = scanner.next().charAt(0);                                                 
            scanner.nextLine();
            System.out.println("Enter the registrationNumberStudent : ");
            registrationNumberStudent = scanner.nextLine();                                               
            System.out.println("Enter the note of the student at the tpe : ");
            myNoteTpe = scanner.nextDouble();                                                                              
            System.out.println("Enter the note of the student at the cc : ");
            myNoteCc = scanner.nextDouble();
            System.out.println("Enter the note of the student at the exam : ");
            myNoteExam = scanner.nextDouble();  
            scanner.nextLine();                                                         
                                                                                
            tabStudent[i] = new Student(nameStudent, surnameStudent, registrationNumberStudent, sexStudent);
            tabNote[i] = new Note(myNoteTpe, myNoteCc, myNoteExam);
            tabAverage[i] = new Average(tabNote[i].getNoteTpe(), tabNote[i].getNoteCc(), tabNote[i].getNoteExam());
        }

        System.out.println();
        System.out.println();

        /* writing student information to the terminal */
        System.out.println("Matricule Nom Prenom Sexe  NoteTpe NoteCc NoteExam MoyenneGenerale");
        System.out.println();
        for(int i = 0; i < 2; i++) {
            System.out.println(tabStudent[i].getRegistrationNumber() +" "+ tabStudent[i].getName() +" "+ tabStudent[i].getSurname() +" "+ tabNote[i].getNoteTpe() +" "+ tabNote[i].getNoteCc() +" "+ tabNote[i].getNoteExam() +" "+ tabAverage[i].averaging());
            System.out.println();
        }
    }
}
