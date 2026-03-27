


class Animal{
    int age ;
    String name ;
   static String color ;
    
    public Animal(int age , String name , String color){
        this.age = age;
        this.name = name;
        Animal.color = color;
    }
}

class Hello{
public static void main(String a[]){

Animal obj = new Animal (10 , "Dog" , "Black");
    System.out.println(obj.age);
    System.out.println(obj.name);
    System.out.println(obj.color);
}

}



