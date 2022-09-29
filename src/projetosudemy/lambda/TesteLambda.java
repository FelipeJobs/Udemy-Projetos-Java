package projetosudemy.lambda;

public class TesteLambda {
    public static void main(String[] args) {
        Calculo soma =(x,y)->{
            return x+y;
        };
        System.out.println(soma.exr(10,5));
    }
}
