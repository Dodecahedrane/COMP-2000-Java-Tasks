public class inheritanceTest {
    public void Text(){
        System.out.println("some text");
    }
}

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
