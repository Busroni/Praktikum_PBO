/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas5.ruang;

/**
 *
 * @author acer
 */
public class Balok implements MenghitungRuang{
    int pBalok, lBalok, tBalok;

    public Balok(int pBalok, int lBalok, int tBalok) {
        this.pBalok = pBalok;
        this.lBalok = lBalok;
        this.tBalok = tBalok;
    }

    public int volumeBalok() {
        return pBalok*lBalok*tBalok;
    }
    
    public int luas(){
        return pBalok*lBalok;
    }
    
    public int keliling(){
        return 2*(pBalok+lBalok);
    }
    
    public int luasPermukaanBalok() {
        return 2*((pBalok*lBalok)+(pBalok*tBalok)+(lBalok*tBalok));
    }

    @Override
    public int permukaanBalok(int pBalok, int lBalok, int tBalok) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int volumeBalok(int pBalok, int lBalok, int tBalok) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
