


class Animal{
    private int age ;
    private String name ;

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

    public int setAge(int age) {
        return age;
    }

    public String setName(String name) {
        return name;
    }
    
}
class Hello{
public static void main(String a[]){

    Animal obj = new Animal();

obj.getAge();
    obj.getName();

    obj.setAge(10);
    obj.setName("Tommy");

    System.out.println(obj.getAge());
    System.out.println(obj.getName());
}

}



