package com.leadersys;
/*
 *����:ResetEvent.class
 *�汾:1.0
 *����:2020��12��29��
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResetEvent implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		//���������� �ı�
		ManageCondition.nameT.setText("");
		ManageCondition.numberT.setText("");
		ManageCondition.sexT.setText("");
		ManageCondition.salaryT.setText("");
		ManageCondition.professT.setText("");
		ManageCondition.ageT.setText("");
	}
}
