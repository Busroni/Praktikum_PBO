package datakaryawan;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author acer
 */
public class LihatView extends JFrame{
        
    JTable tabel;
    DefaultTableModel dtm;
    JScrollPane scrollPane;
    Object namaKolom[] = {"id", "nama", "usia", "gaji"};
    
    JButton btnBack = new JButton("Kembali");

    public LihatView() {
        dtm = new DefaultTableModel(namaKolom, 0);
        tabel = new JTable(dtm);
        scrollPane = new JScrollPane(tabel);
        
        setTitle("Tabel Karyawan");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(535,400);
        
        add(scrollPane);
        scrollPane.setBounds(20, 20, 480, 300);
        
        add(btnBack);
        btnBack.setBounds(20, 320, 480, 20);
        
        btnBack.addActionListener(new ActionListener( ) {
        public void actionPerformed(ActionEvent e){
        MenuView menuView = new MenuView();
        MenuControl menuController = new MenuControl(menuView);
        setVisible(false);
        }
        });

    }
    
    
}