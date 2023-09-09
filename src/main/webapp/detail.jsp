<%@ page contentType="text/html; charset=UTF-8" 
pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<%@ page import="zerobase.wifi.service.WifiService" %>
<%@ page import="zerobase.wifi.dto.WifiInfoDto" %>
<%@page import="java.util.List"%> <!-- 선언부 밑에 위치해야한다. -->
<%@page import="java.util.ArrayList"%>


<%@page import="java.beans.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.SQLException"%>

<!DOCTYPE html>
<html lang="ko">
<head>
	<title>와이파이 정보 구하기</title>
	<link href="/res/css/main.css" rel="stylesheet"/>
</head>
<body>
	<h1>와이파이 정보 구하기</h1>
	<jsp:include page="inc_menu.jsp"/>

	<%

		WifiService wifiService = new WifiService();
		
		List<WifiInfoDto> wifiList = wifiService.getList();
		System.out.println("wifiList : " + wifiList);

		/* 
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
		
		 */
	%>
	
	<table>
		<tr>
			<td>1</td>
			<td>1</td>
			<td>1</td>
			<td>1</td>
		</tr>
	</table>
	
</body>
</html>