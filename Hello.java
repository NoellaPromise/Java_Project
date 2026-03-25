


class Animal{
    int age ;
    String name ;
    
    public Animal(int age , String name){
        this.age = age;
        this.name = name;
    }
}

class Hello{
public static void main(String a[]){

Animal obj = new Animal (10 , "Dog");
    System.out.println(obj.age);
    System.out.println(obj.name);
}

}



