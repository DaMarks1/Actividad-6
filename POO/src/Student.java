public class Student extends Person {
    private Integer [] grades = new Integer[5];

    public Student(String name, int identificador) {
        super(name, identificador);
    }

    public Integer[] getGrades() {
        return grades;
    }

    public void setGrades(Integer[] grades) {
        this.grades = grades;
    }

    public double average(Integer[] grades){
        int sum = 0;
        for (int i = 0; i < grades.length; i++){
            sum += grades[i];
        }
        return sum / grades.length;
    }

    public char setFinalGrade(double average) {
        char califi;
        if (average >= 91) {
            califi = 'A';
        } else if (average >= 81) {
            califi = 'B';
        } else if (average >= 71) {
            califi = 'C';
        } else if (average >= 61) {
            califi   = 'D';
        } else if (average >= 51) {
            califi = 'E';
        } else {
            califi = 'F';
        }
        return califi;
    }

    public void displayInfoGrade(String name, Integer[] grades, double promedio, char califi) {
        System.out.println("\n La calificaciones de " + name);
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Calificación es " + (i + 1) + ": " + grades[i]);
        }
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificacion: " + califi);
    }
}