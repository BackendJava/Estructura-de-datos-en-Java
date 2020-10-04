/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio9;

/**
 *
 * @author elektra
 */
public class NodoArbol {
    protected int dato;
    protected NodoArbol HijoIzdo;
    protected NodoArbol HijoDcho;

    public NodoArbol(int dato) {
        this.dato = dato;
        this.HijoDcho = null;
        this.HijoIzdo = null;
    }
}
