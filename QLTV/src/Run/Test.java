/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Run;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DAO.CustomerDAO;
import DAO.DatabaseConnection;
import Model.Customer;
import Service.CustomerService;
import java.util.ArrayList;
import java.util.TreeSet;

/**
 *
 * @author Admin
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CustomerDAO customerDAO = new CustomerDAO();
        CustomerService customerService = new CustomerService();

//        // TODO code application logic here
//        String query = "Select * from Admin";
//        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {
//            while (rs.next()) {
//                String ADid = rs.getString("ADid");
//                String Aname = rs.getString("Aname");
//                String Assn = rs.getString("Assn");
//                String ADbirthDate = rs.getString("ADbirthDate");
//                String ADgender = rs.getString("ADgender");
//                String ADphoneNumber = rs.getString("ADphoneNumber");
//                String ADemail = rs.getString("ADemail");
//                String ADaddress = rs.getString("ADaddress");
//                String AccountId = rs.getString("AccountId");
//
//                System.out.println(ADid + Aname + Assn + ADbirthDate + ADgender + ADphoneNumber + ADemail + ADaddress + AccountId);
//            }
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//
//        }

        //customerDAO.delete("C001");
        ArrayList<Customer> cus = new ArrayList<>();
               cus = customerDAO.getCusList();
        for (Customer cu : cus) {
            System.out.println(cu);
        }
        
        System.out.println("cus:" + customerService.findById("C002"));

    }
}
