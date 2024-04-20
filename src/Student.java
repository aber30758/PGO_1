public class Student {
    public String fname;
    public String lname;
    public int indexNumber;
    public String email;
    public int address;
    public double[] grades;


    public double calculateAverage(){
        if(grades.length==0){
            throw new IllegalArgumentException("Brak ocen!");}
        double srednia=0;
        for(int i=0;i<grades.length;i++){
            srednia+=grades[i];
        }
        srednia/=grades.length;
        return srednia;
    }

}
