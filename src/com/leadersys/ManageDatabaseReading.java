package com.leadersys;
/*
 *����:ManageDatabaseReading.class
 *�汾:1.0
 *����:2020��12��29��
 */
import java.sql.*;

public class ManageDatabaseReading {
	static Connection con=null;
	static Statement sql;
	ResultSet rs;

	 ManageDatabaseReading(){
		//��������  
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}catch(Exception e){
		}
		//�������ݿ�
		String uri="jdbc:mysql://localhost:3306/no205_datasystemcon?characterEncoding=utf-8&useSSL=false&serverTimezone=UTC&AllowPublicKeyRetrieval=True";
		try{
		
			con=DriverManager.getConnection(uri,"root","123456");//�˺�����
			sql=con.createStatement();
			System.out.println("�������ݿ�ɹ�");
		}catch(SQLException e){
			System.out.println("�������ݿ�ʧ��");
			String temp=e.getMessage();
			System.out.println(temp);
			String[] arr1=temp.split(" ");
			if(arr1[0].equals("Unknown")) {
			System.out.println("�뽨������Ϊ��"+arr1[2]+"���ݿ�");
			}
			if(arr1[0].equals("Access")) {
			System.out.println("�������ݿ������Ƿ���ȷ�����ݿ��������");
			}
		}
	}	
}
