package com.leadersys;
/*
 *����:DelEvent.class
 *�汾:1.0
 *����:2020��12��29��
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;

public class DelEvent  implements ActionListener {
	Connection con=null;
	java.sql.Statement sql;
	java.sql.PreparedStatement sqll;
	String headnumber;
	public void actionPerformed(ActionEvent e) {
		headnumber =ManageComponents.readNumberText();
		//���ֲ���Ϊ��  ���Ϊ�ձ���
		boolean x=(headnumber.equals(""));
		if(x==true) {
			JOptionPane.showMessageDialog(null, "�������Ų���Ϊ��", "��Ϣ",JOptionPane.WARNING_MESSAGE);
		}else {
			delDate();
		}
	}
	void delDate() {
		String Uri="delete from leaderdate where ����=?";
		try {
			sqll = ManageDatabaseReading.con.prepareStatement(Uri);
			sqll.setString(1,headnumber);
			int ok=sqll.executeUpdate();
			if(ok==0) {
				JOptionPane.showMessageDialog(null, "δ�ҵ���ع���", "��Ϣ",JOptionPane.WARNING_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null, "ɾ���ɹ�", "��Ϣ",JOptionPane.WARNING_MESSAGE);
			}
		}catch(SQLException e) {
		}
	}
}
