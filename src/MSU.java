

public class MSU {

    private String name = "MSU";
    public int faculty = 51;
    public String curriculum = "Computer Science";
    protected double avgGPA = 3.0;
    public float acceptanceRate = 85.66f;
    char avgGrade = 'B';


    public String getName() {  //getter
        return name;
    }

    public void setName() {  //setter
        this.name = "MSU Denver";
    }

    public static void main(String[] args) {

    }

}
    /* public MSU(String curriculum, float acceptanceRate, String name, int faculty, double avgGPA, char avgGrade){
         this.acceptanceRate = acceptanceRate;
         this.avgGPA = avgGPA;
         this.name = name;
         this.curriculum = curriculum;
         this.avgGrade = avgGrade;
         this.faculty = faculty;
     }*/
    class student extends MSU {

        public void student() {

            System.out.println("Info on Metropolitan State University");
            System.out.println("Acceptance Rate is: ");
            MSU m = new MSU();
            System.out.println(m.acceptanceRate);

        }

    }


