package step.step2;


import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import zerobase.wifi.dto.WifiInfoDto;
import zerobase.wifi.service.SqliteConnection;

public class DataBaseConnection extends SqliteConnection {

    /**
     * 데이터 베이스 연결 테스트
     * sqlite에서 현재 시간을 가져오는 쿼리를 실행해 본다.
     * select date(), time();
     */
    public static ArrayList<WifiInfoDto> getWifiList() {

    	
    	String url = "jdbc:mariadb://127.0.0.1:3306/testdb3";
        String dbUserId = "testuser3";
        String dbPassword = "zerobase";


        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Statement statement = null;
        ResultSet rs = null;
        
        ArrayList<WifiInfoDto> wifiList = new ArrayList<>();
        WifiInfoDto wifiInfo = new WifiInfoDto();
        try {
            connection = DriverManager.getConnection(url, dbUserId, dbPassword);
            System.out.println("connection : " + connection);
            String sql = "select * from wifi_list";
            preparedStatement = connection.prepareStatement(sql);

            rs = preparedStatement.executeQuery();

            if (rs.next()) {
            	String lat = rs.getString("X_SWIFI_MGR_NO");
            	
            	wifiInfo.setX_SWIFI_MGR_NO(lat);
                System.out.println("wifiInfo.toString : " + wifiInfo.toString());
                
                wifiList.add(wifiInfo);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();

        } finally {

            try {
                if (rs != null && !rs.isClosed()) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if (preparedStatement != null && !preparedStatement.isClosed()) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        
    		return wifiList;	

    }
}
