/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datakaryawan;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author acer
 */
public class LihatDetail extends JFrame{
    
    JLabel lId = new JLabel("ID");
    JLabel lNama = new JLabel("Nama");
    JLabel lUsia = new JLabel("Usia");
    JLabel lGaji = new JLabel("Gaji");
    JLabel lIdD = new JLabel("");
    JLabel lNamaD = new JLabel("");
    JLabel lUsiaD = new JLabel("");
    JLabel lGajiD = new JLabel("");
    JLabel lTotal = new JLabel("Total Gaji");
    JLabel tfTotal = new JLabel();
    
    JLabel lLembur = new JLabel("Lembur (Jam)");
    JTextField tfLembur = new JTextField();
    
    JLabel Karyawan = new JLabel("Detail Data Karyawan");
    JButton btnTotal = new JButton("Total");
    JButton btnBack = new JButton("Kembali");
    
    JButton btnEdit = new JButton("Edit");
    JButton btnDelete = new JButton("Hapus");
    
    
    public LihatDetail(String id,String nama,String usia, String gaji) {
    setTitle("Detail Karyawan");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(300,350);
        lIdD.setText(id);
        lNamaD.setText(nama);
        lUsiaD.setText(usia);
        lGajiD.setText(gaji);
        tfTotal.setText(gaji);
        
        add(Karyawan);
        Karyawan.setBounds(50,25,120,20);
        
        add(lId);
        lId.setBounds(50, 60, 90, 20);
        add(lIdD);
       lIdD.setBounds(150, 60, 120, 20);
        
        add(lNama);
        lNama.setBounds(50, 80, 90, 20);
        add(lNamaD);
        lNamaD.setBounds(150, 80, 120, 20);
        
        add(lUsia);
        lUsia.setBounds(50, 100, 90, 20);
        add(lUsiaD);
        lUsiaD.setBounds(150, 100, 120, 20);
        
        add(lGaji);
        lGaji.setBounds(50, 120, 90, 20);
        add(lGajiD);
        lGajiD.setBounds(150, 120, 120, 20);
        
        add(lTotal);
        lTotal.setBounds(50, 140, 90, 20);
        add(tfTotal);
        tfTotal.setBounds(150, 140, 120, 20);
        
        add(lLembur);
        lLembur.setBounds(50, 170, 90, 20);
        add(tfLembur);
        tfLembur.setBounds(150, 170, 90, 20);
        
        add(btnTotal);
        btnTotal.setBounds(110, 210, 70, 20);
        
        add(btnEdit);
        btnEdit.setBounds(50, 240, 90, 20);
        
        add(btnDelete);
        btnDelete.setBounds(150, 240, 90, 20);
        
        add(btnBack);
        btnBack.setBounds(50, 270, 190, 20);
        
        btnTotal.addActionListener(new ActionListener( ) {
        public void actionPerformed(ActionEvent e){
        String Lembur = tfLembur.getText();
        if (Lembur.isEmpty()){   
            JOptionPane.showMessageDialog(null, "Form Lembur masih ada yang kosong");
            }
            else if(Lembur.matches("[0-9]+") == false){
               JOptionPane.showMessageDialog(null, "Lembur Harus angka dan Positif");
            }
            else
            {
        double LemburD = Double.parseDouble(Lembur);
        double gajiD = Double.parseDouble(gaji);
        double Total = gajiD + LemburD * 25000;
        String Totalgaji = Double. toString(Total);
        tfTotal.setText(Totalgaji);
            }
        }
        });
        
        btnEdit.addActionListener(new ActionListener( ) {
        public void actionPerformed(ActionEvent e){
        setVisible(false);
        LihatAdd lihatAdd = new LihatAdd(id,nama,usia,gaji);
        }
        });
        
        btnDelete.addActionListener(new ActionListener( ) {
        public void actionPerformed(ActionEvent e){
        LihatModel lihatModel = new LihatModel(id);
        }
        });
        
        btnBack.addActionListener(new ActionListener( ) {
        public void actionPerformed(ActionEvent e){
        setVisible(false);
        LihatView lihatView = new LihatView();
        LihatModel lihatModel = new LihatModel();
        LihatController controller = new LihatController(lihatView, lihatModel);
        }
        });
      
        
        
    }
    
            public String getId(){
        return lIdD.getText();
    }
    
        public String getNama(){
        return lNamaD.getText();
    }
    
    public String getUsia(){
        return lUsiaD.getText();
    }
    
    public String getGaji(){
        return lGajiD.getText();
    }
}
