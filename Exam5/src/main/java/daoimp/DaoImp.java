package daoimp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connect.ConnectionFactory;
import dao.Dao;

public class DaoImp implements Dao{
	
	public static Connection conn = ConnectionFactory.makeConnection();

	public String selectFirstName(String firstName) {
		String sql = "select * from customer where first_name = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, firstName);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				return rs.getString(4);
			}return null;
			
		} catch (SQLException e) {
			System.out.println("DaoImp  select    =========  error");
			e.printStackTrace();
			return null ;
		}
	}

	public ResultSet showCustomerInfo() {
		String sql = "select * from customer";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			return ps.executeQuery();
		} catch (SQLException e) {
			System.out.println("DaoImp  show    =========  error");
			e.printStackTrace();
			return null ;
		}
	}

	public void deleteFilm(int film_id) {
		try {
			String sql ="delete from film_text where film_id ="+film_id;
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.execute(sql);
		} catch (SQLException e) {
			System.out.println("DaoImp  delete    =========  error");
			e.printStackTrace();
		}
	}

	public void insertCustomer(int firstname,String lastname, String address) {
		System.out.println("======="+firstname+lastname+address);
		try {
			String sql = "insert into customer values("+firstname+",'"+lastname+"','"+address+"')";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		
	}

}
