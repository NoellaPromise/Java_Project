


class Animal{
    private int age = 10;
    private String name = "Tommy";

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    
}
class Hello{
public static void main(String a[]){

    Animal obj = new Animal();
    // obj.age = 10;
    // obj.name = "Tommy";

    obj.getAge();
    obj.getName();
    
System.out.println(obj.getAge());
System.out.println(obj.getName());
}

}



