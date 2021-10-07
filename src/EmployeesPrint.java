public class EmployeesPrint {
    static String[] names = {"Dave","Steve","Bob","Jess"};
    static int[] ages = {23,42,99,34};


    public static void main(String []args){
        for(int i = 0; i < names.length; i++){
            System.out.print(names[i] + " " + ages[i] + "\n");
        }
    }
}
