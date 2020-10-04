
package interfaz;

import java.util.ArrayList;

public interface ControladorJuego {
    public static final int d_arriba = 1;
    public static final int d_abajo = 1;
    public static final int d_derecha = 1;
    public static final int d_izquierda = 1;
    
    public void generarNuevoPunto();
    public boolean cambioDireccion(int direccion);
    public ArrayList<Component>getCuerpo();
}
