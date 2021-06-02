public class Person {

    private String name;

    public Person (String name) {
        setName(name);
    }


    public String getName(){
//TODO: return the person's name
        return this.name;
    }

    public void setName(String name){
//TODO: change the name property to the passed value
        this.name = name;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("HI THERE! "+getName());
    }


    public static void main(String[] args) {
        Person person1 = new Person("Alexander");
        Person person2 = new Person ("Kyle");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person1.setName("June");
        person2.setName("April");
        person1.sayHello();
        person2.sayHello();
        System.out.println("_END_");
    }

}
