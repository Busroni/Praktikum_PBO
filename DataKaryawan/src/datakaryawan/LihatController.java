package datakaryawan;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author acer
 */
public class LihatController {

    LihatModel lihatModell;
    LihatView lihatVieww;
    LihatAdd lihatAddd;
    LihatDetail lihatDetail;
    
    public LihatController(LihatView lihatView, LihatModel lihatModel) {
        this.lihatModell = lihatModel;
        this.lihatVieww = lihatView;
        
        if (lihatModell.getBanyakData()!=0) {
            String dataKontak[][] = lihatModell.readKaryawan();
            lihatVieww.tabel.setModel((new JTable(dataKontak, lihatVieww.namaKolom)).getModel());
        }
        else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }       
        
       
        lihatVieww.tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                lihatView.setVisible(false);
                int baris = lihatVieww.tabel.getSelectedRow();
                String id = lihatVieww.tabel.getValueAt(baris, 0).toString();
                String nama = lihatVieww.tabel.getValueAt(baris, 1).toString();
                String usia = lihatVieww.tabel.getValueAt(baris, 2).toString();
                String gajiString = lihatVieww.tabel.getValueAt(baris, 3).toString();
                Double gaji = Double.parseDouble(gajiString);
                LihatDetail lihatDetail = new LihatDetail(id,nama,usia,gajiString);
                
            }
        }
        );
    }
    
    public LihatController(LihatAdd lihatAdd,LihatModel lihatModel) {
        this.lihatModell = lihatModel;
        this.lihatAddd = lihatAdd;
        
        lihatAddd.btnTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String nama = lihatAddd.getNama();
                String usia = lihatAddd.getUsia();
                String gaji = lihatAddd.getGaji();

            if (nama.isEmpty()||usia.isEmpty()|| gaji.isEmpty()){   
            JOptionPane.showMessageDialog(null, "Form masih ada yang kosong");
            }
            else if(usia.matches("[0-9]+") == false){
               JOptionPane.showMessageDialog(null, "Usia Harus angka dan Positif");
            }
            else if(gaji.matches("[0-9]+") == false){
               JOptionPane.showMessageDialog(null, "Gaji Harus angka dan Positif");
            }
            else
            {
            lihatModell.insertData(nama, usia, gaji);
            //kembali
            lihatAdd.setVisible(false);
            LihatView lihatView = new LihatView();
            LihatController controller = new LihatController(lihatView, lihatModel);
            }
            }
        });

    }
    
}
