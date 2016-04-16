package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entity.User;
import utils.JdbcUtil;

public class UserDAO {
	private JdbcUtil util;
	public UserDAO(){
		util=new JdbcUtil();
	}
	
	public void userSave(User user) throws SQLException {

		Connection conn=util.getConnection();
		do{
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}while(conn==null);
		// 3 String sql
		String sql="insert into table_user(email,username,password,picPath,phoneNum,follower_count,following_count, intro, birthday) values(?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps=null;
		try {

			ps=conn.prepareStatement(sql);

			ps.setString(1, user.getEmail());
			ps.setString(2, user.getUsername());
			ps.setString(3, user.getPassword());
			ps.setString(4, user.getProfileURL());
			ps.setString(5, user.getPhoneNum());
			ps.setInt(6,user.getFollowerCount());
			ps.setInt(7,user.getFollowingCount());
			ps.setString(8, user.getIntro());
			ps.setDate(9, user.getBirthday());

			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(ps != null){
				ps.close();
			}
			if(conn != null){
				conn.close();
			}
		}
	}
		
	public User userSearch(String name) throws SQLException {
		if(name!=null){
			Connection conn=util.getConnection();
			do{
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}while(conn==null);
			
			String sql="select * from table_user where username = ?;";
			ResultSet rs=null;
			PreparedStatement ps=null;
			User user = null;
			try {

				ps=conn.prepareStatement(sql);
				ps.setString(1, name);
				rs=ps.executeQuery();
				user = new User();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				if(ps != null){
					ps.close();
				}
				if(conn != null){
					conn.close();
				}
				if(rs!=null){
					rs.close();
				}
			}
		}
		
		return null;
	}
		
	
}
