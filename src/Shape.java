interface Shape {
    public void draw();
    public int howManySides();
}

class Square implements Shape{
    public void draw(){
        System.out.println("□");
    }

    public int howManySides(){
        return 4;
    }
}

class Rectangle implements Shape{
    public void draw(){
        System.out.println("▭");
    }

    public int howManySides(){
        return 4;
    }
}


class MainShape{
    public static void main(String[] args){
        Square s = new Square();
        Rectangle r = new Rectangle();

        s.draw();
        System.out.println(s.howManySides());
        r.draw();
        System.out.println(r.howManySides());
    }
}
