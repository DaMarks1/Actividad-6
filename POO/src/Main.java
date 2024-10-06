public class Main {
    public static void main(String[] args) {
        Student persona1 = new Student("Gerry",1);
        Student person2 = new Student("Jenny",2);
        persona1.setGrades(new Integer[]{90,80,75,100,24});
        person2.setGrades(new Integer[]{100,95,86,100,89});
        double average1 = persona1.average(persona1.getGrades());
        char resultado = persona1.setFinalGrade(average1);
        persona1.displayInfoGrade(persona1.getName(), persona1.getGrades(), average1, resultado);



        System.out.println("\n Informacion de persona");
        persona1.displayInfo();
        person2.displayInfo();

    }
}