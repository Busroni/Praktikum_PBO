/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas5;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import tugas5.ruang.Balok;

/**
 *
 * @author acer
 */
public class Gui extends JFrame implements ActionListener{
       JLabel judul = new JLabel("KALKULATOR BALOK");
       JLabel lpanjang = new JLabel("Panjang");
       JTextField fpanjang = new JTextField(10);
       
       JLabel llebar = new JLabel("Lebar");
       JTextField flebar = new JTextField(10);
       
       JLabel ltinggi = new JLabel("Tinggi");
       JTextField ftinggi = new JTextField(10);
       
       JLabel lluas = new JLabel();
       JLabel lkeliling = new JLabel();
       JLabel lluaspermukaan = new JLabel();
       JLabel lvolume = new JLabel();
       
       JButton bhitung = new JButton("Hitung");
       JButton breset = new JButton("Reset");

       public Gui(){
           setTitle("Hitung Balok");
           setSize( 350 ,  400 );
           setLayout(null);
           add(judul);
           add(lpanjang);
           add(fpanjang);
           add(llebar);
           add(flebar);
           add(ltinggi);
           add(ftinggi);
           add(lluas);
           add(lkeliling);
           add(lluaspermukaan);
           add(lvolume);
           add(bhitung);
           add(breset);
           
           judul.setBounds(100,20,200,20);
           lpanjang.setBounds(50,60,120,20);
           fpanjang.setBounds(130,60,150,20);
           llebar.setBounds(50,85,120,20);
           flebar.setBounds(130,85,150,20);
           ltinggi.setBounds(50,110,120,20);
           ftinggi.setBounds(130,110,150,20);
           lluas.setBounds(50,150,200,20);
           lkeliling.setBounds(50,175,200,20);
           lluaspermukaan.setBounds(50,200,200,20);
           lvolume.setBounds(50,225,200,20);
           bhitung.setBounds(50,280,100,30);
           breset.setBounds(180,280,100,30);
           
           setVisible(true);
           setDefaultCloseOperation(EXIT_ON_CLOSE);
           setLocationRelativeTo(null);
       
           bhitung.addActionListener(this);
           breset.addActionListener(this);
       }
       
       public void actionPerformed(ActionEvent e){
           int panjang,lebar,tinggi;
           
           if(e.getSource() == bhitung){
               if(fpanjang.getText().isEmpty()||flebar.getText().isEmpty()||ftinggi.getText().isEmpty()){
                    JOptionPane.showMessageDialog(this, "Form Masih Ada Yang Kosong");
               } else {
                    try{
                         panjang = Integer.parseInt(fpanjang.getText());
                         lebar = Integer.parseInt(flebar.getText());
                         tinggi = Integer.parseInt(ftinggi.getText());
                         Balok balok = new Balok(panjang, lebar, tinggi);
                         lluas.setText("Luas Persegi Panjang = " + balok.luas());
                         lkeliling.setText("Keliling Persegi Panjang = " + balok.keliling());
                         lluaspermukaan.setText("Luas Permukaan Balok = " + balok.luasPermukaanBalok());
                         lvolume.setText("Volume Balok = " + balok.volumeBalok());
                     } catch(Exception err){
                         JOptionPane.showMessageDialog(this, "Input Hanya Berupa Integer");
                     }
               }
           }
           
           if(e.getSource() == breset){
               fpanjang.setText("");
               flebar.setText("");
               ftinggi.setText("");
               lluas.setText("");
               lkeliling.setText("");
               lluaspermukaan.setText("");
               lvolume.setText("");
           }
        }
}
