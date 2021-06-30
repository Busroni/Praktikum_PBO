/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datakaryawan;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author acer
 */
public class MenuView extends JFrame{
    JLabel lblMain = new JLabel("Main Menu");
    JButton btnLihat = new JButton("Lihat Data");
    JButton btnTambah = new JButton("Tambah Data");

    public MenuView() {
        setTitle("Main Menu");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(300,400);
        
        add(lblMain);
        lblMain.setBounds(105, 70, 150, 40);
        add(btnLihat);
        btnLihat.setBounds(60, 110, 150, 40);
        add(btnTambah);
        btnTambah.setBounds(60, 170, 150, 40);
    }
}
