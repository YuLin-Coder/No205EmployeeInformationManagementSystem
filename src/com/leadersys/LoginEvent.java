package com.leadersys;
/*
 *����:LoginEvent.class
 *�汾:1.0
 *����:2020��12��29��
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginEvent implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		String CountText = Login.readCountTextDate();
		String PasswordText = Login.readPasswordTextDate();
		ResultSet rs;
		boolean bo=false;
		boolean b1=loginRead(CountText,PasswordText);
		if(b1==true) {
		 try{
				
				rs=ManageDatabaseReading.sql.executeQuery("select * from user ");
				while (rs.next()) {
					String count=rs.getString(1);
					String password=rs.getString(2);
					
			
						boolean x=(count.equals(CountText));
						boolean y=(PasswordText.equals(password));
						boolean z=(x&&y);
						if(z==true) {
							bo=true;//�ɹ���ȡ������
						}
				}
				if (bo==true) {
					
					Leader.disappear();
					loginResult loginresult =new loginResult();
					//�˴�д��¼�����
				}else {
					JOptionPane.showMessageDialog(null, "�˺Ż��������", "�˺���Ϣ",JOptionPane.WARNING_MESSAGE);
				}
			}catch(SQLException e1){
			}
		} 
	}
		boolean loginRead(String CountText,String PasswordText) {
		boolean x=(CountText.equals(""));
		boolean y=(PasswordText.equals(""));
		boolean z=(x&&y);
		if (z==true) {
			JOptionPane.showMessageDialog(null, "�˺ź����붼����Ϊ��", "�˺�ע����Ϣ",JOptionPane.WARNING_MESSAGE);
			return false;
		}else if(y==true) {
			JOptionPane.showMessageDialog(null, "���벻��Ϊ��", "�˺�ע����Ϣ",JOptionPane.WARNING_MESSAGE);
			return false;
		}else if(x==true) {
			JOptionPane.showMessageDialog(null, "�˺Ų���Ϊ��", "�˺�ע����Ϣ",JOptionPane.WARNING_MESSAGE);
			return false;
		}else {
			return true ;
		}
	}
}
