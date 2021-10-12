interface InterfaceAnimal {
    public void animalSound();
    public void run();
}

class Dog implements InterfaceAnimal{
    public void animalSound(){
        System.out.println("woof");
    }
    public void run(){
        System.out.println("dog runs");
    }
}

class Main2 {
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.animalSound();
        dog.run();
    }
}
