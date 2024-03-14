class Person {
    int Id;
    String name;
       


    Person(){
        System.out.println("default constructor");

    }
    Person(int i, String n){
        Id =i;
        name =n;
    }
    public static void main(String[] args) {
        Person Person= new Person(69, "Bhupendra jogi");
        System.out.println("Person Id:" +Person.Id+"\nPerson name : "+Person.name);
    }
}