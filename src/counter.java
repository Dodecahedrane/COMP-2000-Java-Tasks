public class counter {
    public final int MAX = 100;
    public int value;

    public void increment(){
        if(value<=MAX){
            value = value + 1;
        }
    }

    public void printValue(){
        System.out.println(value);
    }
}
