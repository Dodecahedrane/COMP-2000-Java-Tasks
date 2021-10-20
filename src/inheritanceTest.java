public class inheritanceTest {
    public void Text(){
        System.out.println("some text");
    }
}

//You can make abstract classes where you dont have to implement any of the methods

//public abstract class inheritanceTest {
//  public abstract void Text();
//}


class specificText extends inheritanceTest{
    public void Text(){
        System.out.println("specific text");
    }

    public void OtherMethod(){
        System.out.println("Some other text");
    }
}

class Main{
    public static void main(String[] args){
        specificText text = new specificText();
        text.Text();
        text.OtherMethod();
    }
}
