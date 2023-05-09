/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package komputercetak;

/**
 *
 * @author LENOVO
 */
final class Komputercetak {
    final static void cetak(Komputer[]komp){
        komp [0] = new PC() {};
        komp [1] = new Laptop() {};
        komp [2] = new Notebook() {};
        
        for (Komputer comp : komp){
            comp.hidupkan_os();
            comp.klik_kanan();
            comp.klik_kiri();
            comp.tekan_enter();
            comp.cetak_data();
            comp.matikan_os();
            System.out.println("");
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        Komputer[]cmptr = new Komputer [3];
        cetak(cmptr);
    }
    
}
