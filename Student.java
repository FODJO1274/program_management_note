/* creating of my student class */
public class Student {

    public String name;
    public String surname;
    public String registrationNumber;
    public char sex;

    public Student(String name, String surname, String registrationNumber, char sex) {
        this.name = name;
        this.surname = surname;
        this.registrationNumber = registrationNumber;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public char getSex() {
        return sex;
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }

}