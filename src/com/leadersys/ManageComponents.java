package com.leadersys;
/*
 *����:ManageComponents.class
 *�汾:1.0
 *����:2020��12��29��
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ManageComponents extends JPanel {
	FlowLayout flowlayout;
	JButton addDate,delDate,chekDate,showDate,revData;// ��  ɾ  ��  ��  ���� �����ť
	JLabel  headname; //ͷ ����
	static JTextField headNumber;//ͷ�ı�
	ActionListener Addlistener;
	ActionListener dellistener;
	ActionListener Updalistener;
	ActionListener Showlistener;
	ActionListener revListener;
	public ManageComponents() {
		flowlayout=new FlowLayout(FlowLayout.LEFT);
		setLayout(flowlayout);//
		headname=new JLabel("����");
		headNumber =new JTextField(9);
		this.setBounds(0,52,516,57);//���ô�С
		addDate =new JButton("����");
		delDate =new JButton("ɾ��");
		chekDate =new JButton("�޸�");
		showDate =new JButton("����");
		revData =new JButton("����");
		addEvent();//����
		this.add(addDate);
		this.add(delDate);
		this.add(chekDate);
		this.add(showDate);
		this.add(revData);
		this.add(headname);
		this.add(headNumber);
		setBorder(BorderFactory.createTitledBorder("�������ܽ���"));
	}
	void addEvent() {
		Addlistener =new AddEvent();//�������ݼ���
		dellistener =new DelEvent();//ɾ�����ݼ���
		Updalistener =new ChangeEvent();//�������ݼ���
		Showlistener=new ShowEvent();//�������ݼ���
		revListener=new ResetEvent();//���ü���
		addDate.addActionListener(Addlistener);
		delDate.addActionListener(dellistener);
		chekDate.addActionListener(Updalistener);
		showDate.addActionListener(Showlistener);
		revData.addActionListener(revListener);
	}
	static String readNumberText() {
		String nametext=headNumber.getText();
		return nametext;
	}

}
