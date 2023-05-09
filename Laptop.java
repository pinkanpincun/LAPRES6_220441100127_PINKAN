/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package komputercetak;

/**
 *
 * @author LENOVO 
 */
public abstract class Laptop extends Komputer implements Mouse, Keyboard, Printer{
     void hidupkan_os(){
        System.out.println("Hidupkan Laptop");
    }
    void matikan_os(){
        System.out.println("Matikan Laptop");
    }
    public void klik_kanan(){
        System.out.println("Klik Kanan");
    }
    public void klik_kiri(){
        System.out.println("Klik Kiri");
    }
    public void tekan_enter(){
        System.out.println("Klik Enter");
    }
    public void cetak_data(){
        System.out.println("Printing");
    }
            
}
