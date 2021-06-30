package datakaryawan;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


/**
 *
 * @author acer
 */
public class LihatModel {
    
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/karyawan";
    static final String USER = "root";
    static final String PASS = "";
    
    Connection koneksi;
    Statement statement;
    
    public LihatModel(){
        try{
            Class.forName(JDBC_DRIVER);
            koneksi = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Koneksi Berhasil");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println("Koneksi Gagal");
        }
    }
    
    public String[][] readKaryawan(){
        try{
            int jmlData = 0;
            
            String data[][] = new String[getBanyakData()][4]; //baris, kolom nya ada 4
            
            String query = "Select * from karyawan"; 
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data[jmlData][0] = resultSet.getString("id"); //harus sesuai nama kolom di mysql
                data[jmlData][1] = resultSet.getString("nama");                
                data[jmlData][2] = resultSet.getString("usia");
                data[jmlData][3] = resultSet.getString("gaji");
                jmlData++;
            }
            return data;
               
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }

    
    public void insertData(String nama, String usia, String gaji){
        int jmlData=0;
        try {

                String query = "INSERT INTO karyawan VALUES(NULL,'"+nama+"','"+usia+"','"+gaji+"')";
                System.out.println(" cek " + nama + " " + usia + " " + gaji);
                statement = (Statement) koneksi.createStatement();
                statement.executeUpdate(query); //execute querynya
                System.out.println("Berhasil ditambahkan");
                JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
          
        } catch (Exception sql) {
            System.out.println(sql.getMessage());   
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }
    
    public LihatModel(String id,String nama, String usia, String gaji){
        int jmlData=0;
        try{
            Class.forName(JDBC_DRIVER);
            koneksi = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Koneksi Berhasil");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println("Koneksi Gagal");
        }
        System.out.println(id+nama+gaji);
        
        try {
                String query = "UPDATE karyawan SET nama='" + nama + "',usia='" + usia + "', gaji='" + gaji + "' WHERE id=" + id;
                statement = (Statement) koneksi.createStatement();
                statement.executeUpdate(query); //execute querynya
                System.out.println("Berhasil diupdate");
                JOptionPane.showMessageDialog(null, "Data Berhasil diupdate");
           
        } catch (Exception sql) {
            System.out.println(sql.getMessage());   
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }
    
    public int getBanyakData(){
        int jmlData = 0;
        try{
            statement = koneksi.createStatement();
            String query = "Select * from karyawan";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){ 
                jmlData++;
            }
            return jmlData;
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return 0;
        }
    }
    
    public LihatModel(String id) {
        try{
            Class.forName(JDBC_DRIVER);
            koneksi = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Koneksi Berhasil");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println("Koneksi Gagal");
        }
        try{
            String query = "DELETE FROM karyawan WHERE id = '"+id+"'";
            statement = koneksi.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
            
        }catch(SQLException sql) {
            System.out.println(sql.getMessage());
        }
    }
}
