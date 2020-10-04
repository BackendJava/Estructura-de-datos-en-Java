
package esfera;

public class TDA {
    private double radio;

    public TDA(double radio) {
        if(radio > 0){
        this.radio = radio;
        }
        else{
            this.radio = 0.0;
        }
    }
    public double getRadio(){
        return radio;
    }
    
    public double getDiametro(){
        return (2*radio);
    }
    
    public double getArea(){
        return (4*Math.PI*Math.pow(radio,2));
    }
    
    public double getCircunferencia(){
        return (Math.PI * getDiametro());
    }
    
    public double getVolumen(){
        return (4*Math.PI*Math.pow(radio,3))/3 ;
    }
    
    
}
