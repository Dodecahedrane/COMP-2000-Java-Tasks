public class EmployeesPrint {
    static String[] names = {"Dave","Steve","Bob","Jess"};
    static int[] ages = {23,52,99,34};

    public static void printAllEmployees(){
        for(int i = 0; i < names.length; i++){
            System.out.print(names[i] + " " + ages[i] + "\n");
        }
    }

    public static void printAllEmployeesOver50(){
        for(int i = 0; i < names.length; i++){
            if(ages[i]>=50){
                System.out.print(names[i] + " " + ages[i] + "\n");
            }
        }
    }

    public static void main(String []args){
        printAllEmployees();
        System.out.println("");
        printAllEmployeesOver50();
    }
}
