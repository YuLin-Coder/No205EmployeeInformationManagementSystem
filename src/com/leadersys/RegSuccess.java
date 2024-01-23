package com.leadersys;
/*
 *����:RegSuccess.class
 *�汾:1.0
 *����:2020��12��29��
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class RegSuccess extends JFrame{
	static JPanel Apanel;//����һ�����
	static final int WIDTH=421;//���ö����ܵĿ��
	static final int HEIGHT=260;//���ö����ܵĸ߶�
	//������ǩ
	JLabel regcount;//ע���˺�
	JLabel regpassword;//ע������
	//һ���ı���  ���������
	static JTextField nameinput;//�û������
	static JPasswordField passwordinput;//���������
	//һ��ע�ᰴť
	JButton regok;//��¼��ť
	//һ�������ǩ
	JLabel title;//����
	//һ������
	JLabel img1;//�û��� ��ǩ
	ActionListener reglistener;//ע���������
	public RegSuccess(){
		setVisible(true); 
		init();
		regCount();
		setResizable(false);//���ɱ䴰��
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		validate();
	}
	void init() {//��ʼ��ע�ᴰ��
		Apanel =new JPanel();
		Apanel .setLayout(null);//���ò���Ϊ��
		//����������ʽ
		Font f=new Font("����",Font.BOLD,30);//����
		Font fe=new Font("����bai�п�",Font.PLAIN,20);//��ǩ
		Font fee=new Font("����",Font.PLAIN,16);//�˺ſ�
		Font feee=new Font("����",Font.BOLD,16);//��¼��ť
		//������ʾ��λ�����м�
		Toolkit kit =Toolkit.getDefaultToolkit();//��ȡ�����С
		Dimension screenSize=kit.getScreenSize();
		int width=screenSize.width;
		int height=screenSize.height;//��ȡ��Ļ�߶ȺͿ��
		int x=(width-WIDTH)/2;
		int y=(height-HEIGHT)/2;
		setSize(WIDTH,HEIGHT);
		setLocation(x-100, y-100);//����λ�� �ʹ��ڴ�С
		//���ñ�����ɫ
		ImageIcon img = new ImageIcon("src/img/1.jpg");//���Ǳ���ͼƬ 
		title=new JLabel("�쵼����ϵͳ�˺�ע��");//����
		regcount =new JLabel("�˺�");//ע���˺�
		regpassword=new JLabel("����");//ע������
		nameinput=new JTextField();//�û������
		passwordinput=new JPasswordField();;//���������
		regok=new JButton ("����ע��");
		img1=new JLabel(img);
		img1.setBounds(0,0,421, 120);//���ñ���ͼƬ ���ñ���λ��
		title.setForeground(Color.WHITE);	//���ر���
		title.setBounds(40, 45, 400, 30);
		title.setFont(f);
		regcount.setForeground(Color.black);		//��ӱ�ǩ
		regcount.setBounds(70, 125, 300, 25);
		regcount.setFont(fe);
		regpassword.setForeground(Color.black);
		regpassword.setBounds(70, 155, 300, 25);
		regpassword.setFont(fe);
		nameinput.setForeground(Color.black);
		nameinput.setBounds(120, 125, 210, 25);
		nameinput.setFont(fee);
		passwordinput.setForeground(Color.black);
		passwordinput.setBounds(120, 155, 210, 25);
		passwordinput.setFont(fee);
		regok.setForeground(Color.white);
		regok.setBackground(new Color(8,189,252));
		regok.setBounds(70, 185, 260, 30);
		regok.setFont(feee);
		Apanel.add(regok);
		Apanel.add(passwordinput);
		Apanel.add(nameinput);
		Apanel.add(regpassword);
		Apanel.add(regcount);
		Apanel.add(title);
		Apanel.add(img1);
		add(Apanel);
	}
	static String readCountTextDate() {//��ȡע����˺ź�����
		//mysql_data mysqlCon=new mysql_data();//����Ҫ��mysql ��ȡ���� 
		String nametext=nameinput.getText();
		return nametext;
	}
	static String  readPasswordTextDate() {	//��ȡ���������
		String passwordtext=new String(passwordinput.getPassword());
		String str =new String(passwordtext);
		return str;
	}
	void regCount() {
		reglistener=new RegSuccessEvent();
		regok.addActionListener(reglistener);
	}

}
