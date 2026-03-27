


class Animal{
    int age ;
    String name ;
   static String color ;
    
    public Animal(int age , String name , String color){
        this.age = age;
        this.name = name;
        Animal.color = color;
    }
    public void display(){
    System.out.println(age);
    System.out.println(name);
    System.out.println(color);
}
static{
    color = "White";
    System.out.println("Static block executed");
}

// public static void display1(Animal obj){
//     // System.out.println(obj.name);
// }


}

class Hello{
public static void main(String a[]){

Animal obj = new Animal (10 , "Dog" , "Black");
    obj.display();
    // Animal.display1(obj);
}

}



