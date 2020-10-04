package esfera;


public class Esfera {

    public static void main(String[] args) {
        TDA esfera = new TDA(3);
        
        System.out.println("Area : " + esfera.getArea());
        System.out.println("Radio: " + esfera.getRadio());
        System.out.println("Diametro: " + esfera.getDiametro());
        System.out.println("Circunferencia: " + esfera.getCircunferencia());
        System.out.println("Volumen: " + esfera.getVolumen());
    }
    
}
