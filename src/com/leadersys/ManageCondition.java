package com.leadersys;
/*
 *����:ManageCondition.class
 *�汾:1.0
 *����:2020��12��29��
 */

import javax.swing.*;
import java.awt.*;

public class ManageCondition extends JPanel{

	FlowLayout flowlayout;
	JLabel  name;//���� ���� �Ա� רҵ  ��� нˮ  
	JLabel  number;//���� ���� �Ա� רҵ  ��� нˮ  
	JLabel  sex;//���� ���� �Ա� רҵ  ��� нˮ  
	JLabel  profess;//���� ���� �Ա� רҵ  ��� нˮ  
	JLabel  age;//���� ���� �Ա� רҵ  ��� нˮ  
	JLabel  salary;//���� ���� �Ա� רҵ  ��� нˮ  
	static JTextField nameT;
	static JTextField numberT;
	static JTextField sexT;
	static JTextField professT;
	static JTextField ageT;
	static JTextField salaryT;
	public ManageCondition() {
		flowlayout=new FlowLayout();
		setLayout(flowlayout);
		this.setBounds(0,107,516,110);//���ô�С
		name =new JLabel("����");
		number =new JLabel("����");
		sex =new JLabel("�Ա�");
		profess =new JLabel("רҵ");
		age =new JLabel("����");
		salary =new JLabel("����");
		nameT =new JTextField(19);
		numberT =new JTextField(19);
		sexT =new JTextField(19);
		professT =new JTextField(19);
		ageT =new JTextField(19);
		salaryT =new JTextField(19);
		this.add(name);
		this.add(nameT);
		this.add(number );
		this.add(numberT );
		this.add(sex);
		this.add(sexT);
		this.add(profess);
		this.add(professT);
		this.add(age);
		this.add(ageT);
		this.add(salary);
		this.add(salaryT);
		setBorder(BorderFactory.createTitledBorder("��Ϣ�������"));
	}
	static String readNameText() {	//��ȡ ���� 
		String nametext=nameT.getText();//�˴���Ҫд������� ����ȡ �ı���Ϣ
		return nametext;
	}
	static String readNumberText() {//��ȡ ����
		String nametext=numberT.getText();
		return nametext;
	}
	static String readSexTText() {//��ȡ �Ա�
			String nametext=sexT.getText();
			return nametext;
		}
	static String readProfessTText() {	//��ȡ רҵ
			String nametext=professT.getText();
			return nametext;
		}
	static String readAgeTText() {	//��ȡ ���
			String nametext=ageT.getText();
			return nametext;
			}
	static String readSalaryTText() {	//��ȡ н��
				String nametext=salaryT.getText();
				return nametext;
			}
}
