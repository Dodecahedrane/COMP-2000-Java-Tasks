abstract class Employee {
    public abstract void job();
    public abstract void workEnviroment();
    public abstract void skills();
}

class Lecturer extends Employee{
    public void job(){
        System.out.println("Lecturer");
    }

    public void workEnviroment(){
        System.out.println("University");
    }

    public void skills(){
        System.out.println("Teaching");
    }
}

class Engineer extends Employee{
    public void job(){
        System.out.println("Engineer");
    }

    public void workEnviroment(){
        System.out.println("Office");
    }

    public void skills(){
        System.out.println("CAD");
    }
}
