public class ExemplosFor {
    public static void main(String[] args) {

        System.out.println("Par");
        for(int i = 0; i <= 20; i+=2) {
            System.out.println(i);
        }
        System.out.println("Ímpar");
        for(int i = 1; i <=20; i+=2){
            System.out.println(i);
        }
        System.out.println("Invertido par");
        for(int i = 20; i >= 0; i -= 2){
            System.out.println(i);
        }
        System.out.println("Invertido ímpar");
        for(int i = 19; i >= 1; i -=2) {
            System.out.println(i);
        }
    }
}

