/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectperjalananmobil;

/**
 *
 * @author NITRO 5
 */
public class SUV extends Mobil{
    
    @Override
    public double hitungBensin() {
        double bensin = this.jarak / 12 ;
        return bensin;
    }
}