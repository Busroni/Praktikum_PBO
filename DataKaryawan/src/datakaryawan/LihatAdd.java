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
public class LihatAdd extends JFrame{
    JLabel lId = new JLabel("id");
    JLabel lNama = new JLabel("nama");
    JLabel lUsia = new JLabel("usia");
    JLabel lGaji = new JLabel("gaji");
    
    JTextField tfId = new JTextField();
    JTextField tfNama = new JTextField();
    JTextField tfUsia = new JTextField();
    JTextField tfGaji = new JTextField();
    JTextField tfCari = new JTextField();
    
    JLabel InKaryawan = new JLabel("Input Karyawan");
    JButton btnTambah = new JButton("Tambah");
    JButton btnUpdate = new JButton("Submit");
    JButton btnReset = new JButton("Reset");
    JButton btnBack = new JButton("Kembali");
    
    public LihatAdd() {
    setTitle("Tambah Data");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(300,350);
        
        add(InKaryawan);
        InKaryawan.setBounds(50,45,90,20);
        
        
        add(lNama);
        lNama.setBounds(50, 90, 90, 20);
        add(tfNama);
        tfNama.setBounds(110, 90, 120, 20);
        
        add(lUsia);
        lUsia.setBounds(50, 120, 90, 20);
        add(tfUsia);
        tfUsia.setBounds(110, 120, 120, 20);
        
        add(lGaji);
        lGaji.setBounds(50, 150, 90, 20);
        add(tfGaji);
        tfGaji.setBounds(110, 150, 120, 20);
        
        
        add(btnTambah);
        btnTambah.setBounds(50, 190, 90, 20);
        
        add(btnReset);
        btnReset.setBounds(150, 190, 90, 20);
        
        add(btnBack);
        btnBack.setBounds(50, 230, 190, 20);
        
        btnReset.addActionListener(new ActionListener( ) {
        public void actionPerformed(ActionEvent e){
        tfNama.setText("");
        tfUsia.setText("");
        tfGaji.setText("");
        }
        });
        
        btnBack.addActionListener(new ActionListener( ) {
        public void actionPerformed(ActionEvent e){
        MenuView menuView = new MenuView();
        MenuControl menuController = new MenuControl(menuView);
        setVisible(false);
        }
        });
        
    }
    
    public LihatAdd(String id,String nama,String usia, String gaji) {
    setTitle("Update Data");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(300,350);
        tfId.setText(id);
        tfNama.setText(nama);
        tfUsia.setText(usia);
        tfGaji.setText(gaji);
        
        add(InKaryawan);
        InKaryawan.setBounds(50,45,90,20);
        
        add(tfId);
        
        add(lNama);
        lNama.setBounds(50, 90, 90, 20);
        add(tfNama);
        tfNama.setBounds(110, 90, 120, 20);
        
        add(lUsia);
        lUsia.setBounds(50, 120, 90, 20);
        add(tfUsia);
        tfUsia.setBounds(110, 120, 120, 20);
        
        add(lGaji);
        lGaji.setBounds(50, 150, 90, 20);
        add(tfGaji);
        tfGaji.setBounds(110, 150, 120, 20);
        
        
        add(btnUpdate);
        btnUpdate.setBounds(50, 190, 90, 20);
        
        add(btnReset);
        btnReset.setBounds(150, 190, 90, 20);
        
        add(btnBack);
        btnBack.setBounds(50, 230, 190, 20);
        
        btnReset.addActionListener(new ActionListener( ) {
        public void actionPerformed(ActionEvent e){
        tfNama.setText("");
        tfUsia.setText("");
        tfGaji.setText("");
        }
        });
        
        btnUpdate.addActionListener(new ActionListener( ) {
        public void actionPerformed(ActionEvent e){
        if (tfNama.getText().isEmpty()||tfUsia.getText().isEmpty()|| tfGaji.getText().isEmpty()){   
            JOptionPane.showMessageDialog(null, "Form masih ada yang kosong");
            }
            else if(tfUsia.getText().matches("[0-9]+") == false){
               JOptionPane.showMessageDialog(null, "Usia Harus angka dan Positif");
            }
            else if(tfGaji.getText().matches("[0-9]+") == false){
               JOptionPane.showMessageDialog(null, "Gaji Harus angka dan Bilangan Bulat");
            }
            else
            {
        LihatModel lihatModel = new LihatModel(tfId.getText(),tfNama.getText(),tfUsia.getText(),tfGaji.getText());
            }
        }
        });
        
        btnBack.addActionListener(new ActionListener( ) {
        public void actionPerformed(ActionEvent e){
        LihatView lihatView = new LihatView();
        LihatModel lihatModel = new LihatModel();
        LihatController controller = new LihatController(lihatView, lihatModel);
        setVisible(false);
        }
        });
        

    }
        public String getId(){
        return tfId.getText();
    }
    
        public String getNama(){
        return tfNama.getText();
    }
    
    public String getUsia(){
        return tfUsia.getText();
    }
    
    public String getGaji(){
        return tfGaji.getText();
    }
}
