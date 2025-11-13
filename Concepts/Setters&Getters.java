class student{
    private String name;
    private int age;

    public void setName(String s){
        name = s;
    }
    public void setAge(int a){
        age = a;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
    public static void main (String[] args){
        student s = new student();
        s.setName("Mafthiyar");
        s.setAge(23);

        System.out.println("Name : "+ s.getName());
        System.out.println("Age : "+ s.getAge());


    }
}