package com.leadersys;
/*
 *����:ShowEvent.class
 *�汾:1.0
 *����:2020��12��29��
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ShowEvent  implements ActionListener {
	Connection con=null;
	boolean rks=true;
	java.sql.PreparedStatement sqll;
	ResultSet rs;
	int a=0;
	boolean real=true;
	String name,number,sex,sale,pro,ageLL,headnumber;
	public void actionPerformed(ActionEvent e) {
		headnumber =ManageComponents.readNumberText();//��������
		//�������� ����Ϊ��  ���Ϊ�ձ���
		boolean x=(headnumber.equals(""));
		if(x==true) {
			showallDate();
		}else {
			showdate();
		}
	}
	void showdate() {
		int row,clon;
		int count=0;
		
		String  bol;
		String Uri="select * from  leaderdate where ����=?";
		boolean ok=true;
		try {
			
			sqll = ManageDatabaseReading.con.prepareStatement(Uri);
			sqll.setString(1, headnumber);//��ѯ����
			rs=sqll.executeQuery();
			ManageForm.model.setNumRows(0);
				while(rs.next()) {	
					number=rs.getString(1);
					name=rs.getString(2);
					sex=rs.getString(3);
					sale=rs.getString(4);
					pro=rs.getString(5);
					ageLL=rs.getString(6);
					ManageForm.rwo.add(0,number);
					ManageForm.rwo.add(1,name);
					ManageForm.rwo.add(2,sex);
					ManageForm.rwo.add(3,sale);
					ManageForm.rwo.add(4,pro);
					ManageForm.rwo.add(5,ageLL);
					ManageForm.model.addRow(ManageForm.rwo);//���������������
					ManageCondition.nameT.setText(name);
					ManageCondition.numberT.setText(number);
					ManageCondition.sexT.setText(sex);
					ManageCondition.salaryT.setText(sale);
					ManageCondition.professT.setText(pro);
					ManageCondition.ageT.setText(ageLL);
					a++;
			}
				if(a!=0) {
					a=0;
					
				}else {
					ManageCondition.nameT.setText("");
					ManageCondition.numberT.setText("");
					ManageCondition.sexT.setText("");
					ManageCondition.salaryT.setText("");
					ManageCondition.professT.setText("");
					ManageCondition.ageT.setText("");
					JOptionPane.showMessageDialog(null, "��ǰ�����Ѿ�������", "��Ϣ",JOptionPane.WARNING_MESSAGE);
				}
			//��������û��ִ��
			
		}catch(SQLException e) {
		}
	}
	void showallDate() {
		String [] dm=new String [6];
		String Uri="select * from  leaderdate";
	try {
			sqll = ManageDatabaseReading.con.prepareStatement(Uri);
			rs=sqll.executeQuery();
			ManageForm.model.setNumRows(0);
			while(rs.next()) {
					number=rs.getString(1);
					name=rs.getString(2);
					sex=rs.getString(3);
					sale=rs.getString(4);
					pro=rs.getString(5);
					ageLL=rs.getString(6);
					dm[0]=number;
					dm[1]=name;
					dm[2]=sex;
					dm[3]=sale;
					dm[4]=pro;
					dm[5]=ageLL;
					ManageForm.model.addRow(dm);
			}
		}catch(SQLException e) {
		}
	}
}
