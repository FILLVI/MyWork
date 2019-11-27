public class SingeltonLesson {
    public static void main(String[] args) {
        Singelton singelton = Singelton.getInstance();
        Singelton singelton12 = Singelton.getInstance();
    }
}

class Singelton{
    int i = 0;
    static Singelton singelton = new Singelton();
    private Singelton(){

    }

    public static Singelton getInstance(){
        return singelton;
    }
}