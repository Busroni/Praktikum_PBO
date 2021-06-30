/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datakaryawan;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author acer
 */
public class MenuControl {
    MenuView mv;;
    //JFrame frame = new JFrame();

    public MenuControl(MenuView menuView) {
        this.mv = menuView;
        
        // input data ==========================================================
        
        
        
        
        
        
        
        // lihat data ==========================================================
        menuView.btnLihat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                menuView.setVisible(false);
                LihatView lihatView = new LihatView();
                LihatModel lihatModel = new LihatModel();
                LihatController controller = new LihatController(lihatView, lihatModel);
                
            }
        });
        
        menuView.btnTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                menuView.setVisible(false);
                LihatModel lihatModel = new LihatModel();
                LihatAdd lihatAdd = new LihatAdd();
                LihatController controllers = new LihatController (lihatAdd,lihatModel);
            }
        });
        
    }
    
}