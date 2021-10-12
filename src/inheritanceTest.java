public class inheritanceTest {
    public void Text(){
        System.out.println("some text");
    }
}

//You can make abstract classes where you dont have to implement any of the methods

//public abstract class inheritancetest {
//  public void Text();
//}


class specificText extends inheritanceTest{
    public void Text(){
        System.out.println("specific text");
    }
}

class Main{
    public static void main(String[] args){
        specificText Text = new specificText();
        Text.Text();
    }
}
