/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package komputercetak;

/**
 *
 * @author LENOVO
 * 
 */
public abstract class PC extends Komputer implements Mouse, Keyboard, Printer {
     @Override

    void hidupkan_os(){
        System.out.println("Hidupkan PC");
    }
     @Override
    void matikan_os(){
        System.out.println("Matikan PC");
    }
     @Override
    public void klik_kanan(){
        System.out.println("Klik Kanan");
    }
    public void klik_kiri(){
        System.out.println("Klik Kiri");
    }
    public void tekan_enter(){
        System.out.println("Klik Enter");
    }
     @Override
    public void cetak_data(){
        System.out.println("Printing");
    }
            
}
