package com.leadersys;
/*
 *����:RegSuccessEvent.class
 *�汾:1.0
 *����:2020��12��29��
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;


public class RegSuccessEvent implements ActionListener {


	java.sql.PreparedStatement sqll;
	ResultSet rs;
	public void actionPerformed(ActionEvent e) {
		String CountText = RegSuccess.readCountTextDate();
		String PasswordText =RegSuccess.readPasswordTextDate();	//��ȡ��ע����˺ź�����
		String Uri="insert into user values(?,?)";
		boolean x=(CountText.equals(""));
		boolean y=(PasswordText.equals(""));
		boolean z=(x&&y);
		if (z==true) {
			
			JOptionPane.showMessageDialog(null, "�˺ź����붼����Ϊ��", "�˺�ע����Ϣ",JOptionPane.WARNING_MESSAGE);
		}else if(y==true) {
			JOptionPane.showMessageDialog(null, "���벻��Ϊ��", "�˺�ע����Ϣ",JOptionPane.WARNING_MESSAGE);
		}else if(x==true) {
			JOptionPane.showMessageDialog(null, "�˺Ų���Ϊ��", "�˺�ע����Ϣ",JOptionPane.WARNING_MESSAGE);
		}else 
		try {
			//ִ�в���
			//mysql_data.sql.executeUpdate(Uri);
			sqll = ManageDatabaseReading.con.prepareStatement(Uri);
			sqll.setString(1, CountText);
			sqll.setString(2, PasswordText);
			int ok=sqll.executeUpdate();
			JOptionPane.showMessageDialog(null, "ע��ɹ�", "�˺�ע����Ϣ",JOptionPane.WARNING_MESSAGE);
		}catch(SQLException e2){
			JOptionPane.showMessageDialog(null, "ע��ʧ�ܸ��˺��Ѿ�����", "�˺�ע����Ϣ",JOptionPane.WARNING_MESSAGE);
		}
	}
}
