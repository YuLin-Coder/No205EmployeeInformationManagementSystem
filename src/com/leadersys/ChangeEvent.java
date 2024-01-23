package com.leadersys;
/*
 *����:ChangeEvent.class
 *�汾:1.0
 *����:2020��12��29��
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;

public class ChangeEvent  implements ActionListener {
	Connection con=null;
	java.sql.PreparedStatement sqll;
	String name;
	String number;
	String sex;
	String sale;
	String pro;
	String ageLL;
	String headnumber;
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//��Ҫ�� 6���ı���� ����ȫ����ȡ����   
		name=ManageCondition.readNameText();
		number=ManageCondition.readNumberText();
		sex=ManageCondition.readSexTText();
		sale=ManageCondition.readSalaryTText();
		pro=ManageCondition.readProfessTText();
		ageLL=ManageCondition.readAgeTText();
		headnumber =ManageComponents.readNumberText();
		//���ֲ���Ϊ��  ���Ϊ�ձ���
		boolean x=(headnumber.equals(""));
		if(x==true) {
			JOptionPane.showMessageDialog(null, "������������Ϊ��", "��Ϣ",JOptionPane.WARNING_MESSAGE);
		}else {
			addData();
		}
	}
	void addData() {
		String Uri="update leaderdate set ����=?,����=?,�Ա�=?,нˮ=?,רҵ=?,����=? where ����=?";
		try {
			sqll = ManageDatabaseReading.con.prepareStatement(Uri);
			sqll.setString(1, number);
			sqll.setString(2, name);
			sqll.setString(3, sex);
			sqll.setString(4, sale);
			sqll.setString(5, pro);
			sqll.setString(6, ageLL);
			sqll.setString(7, headnumber);
			int ok=sqll.executeUpdate();
			JOptionPane.showMessageDialog(null, "���ĳɹ�", "��Ϣ",JOptionPane.WARNING_MESSAGE);
		}catch(SQLException e) {
			JOptionPane.showMessageDialog(null, "������������Ϊ��", "��Ϣ",JOptionPane.WARNING_MESSAGE);
		}
	}
}
