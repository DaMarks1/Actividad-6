public class Person {
    private String name;
    private int age;
    private int identificador;
    private int campus;

    public Person(String name, int identificador) {
        this.name = name;
        this.identificador = identificador;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getCampus() {
        return campus;
    }

    public void setCampus(int campus) {
        this.campus = campus;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void displayInfo(){
        System.out.println("\n El nombre es:  " + name + " con ID " + identificador);
        if(age>0){
            System.out.println("Tiene" + age + "años");
        }
    }
}
