
package torre.de.hanoi;

public class TorreDeHanoi {

    public static void main(String[] args) {
        Ventana x = new Ventana();
        x.setVisible(true);
        TorreDeHanoi obj = new TorreDeHanoi();
        obj.TorreHanoi(4, 1, 2, 3);
        
    }
    
    public void TorreHanoi(int discos, int torre1, int torre2,int torre3){
        if(discos == 1){
            System.out.println("Mover disco de torre " + torre1 + " a " + "torre "+ torre3);
        }else{
            TorreHanoi(discos-1, torre1, torre3, torre2);
            System.out.println("Mover disco de torre " + torre1 + " a " + "torre "+ torre3);
            TorreHanoi(discos-1, torre2, torre1, torre3);
        }
    }
    
}
