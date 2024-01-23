package com.leadersys;
/*
 *����:Login.class
 *�汾:1.0
 *����:2020��12��29��
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Login extends JFrame{
	static JPanel contentPanel;//����һ�����
	static final int WIDTH=390;//���ö����ܵĿ��
	static final int HEIGHT=245;//���ö����ܵĸ߶�
	JButton ok;//��¼��ť
	JLabel reg;//ע�ᰴť
	JLabel title;//����
	JLabel name;//�û��� ��ǩ
	JLabel password;//����  ��ǩ
	static JTextField nameinput;//�û������
	static JPasswordField passwordinput;//���������
	JLabel img1;
	//���������
	ActionListener loginlistener;//��¼��������
	RegEvent reglistener;//ע���������
	public Login(){
		
		setVisible(true); 
		init();
		mysqld();
		setResizable(false);//���ɱ䴰��
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		validate();
	}
	void init(){
		contentPanel =new JPanel();
		contentPanel.setLayout(null);//���ò���Ϊ��
		ok=new JButton("��ȫ��¼");//���尴ť
		reg=new JLabel("ע���˺�");
		title =new JLabel("Ա����Ϣ����ϵͳ");
		name =new JLabel("�˺�");
		password =new JLabel("����");
		nameinput=new JTextField(15);//�˺�
		passwordinput=new JPasswordField(15);//�����
		ImageIcon img = new ImageIcon("src/img/1.jpg");//���Ǳ���ͼƬ 
		img1=new JLabel(img);
		img1.setBounds(0,0,img.getIconWidth(), img.getIconHeight());//���ñ���ͼƬ ���ñ���λ��
		Toolkit kit =Toolkit.getDefaultToolkit();//��ȡ�����С	//���ô���λ��
		Dimension screenSize=kit.getScreenSize();
		int width=screenSize.width;
		int height=screenSize.height;//��ȡ��Ļ�߶ȺͿ��
		int x=(width-WIDTH)/2;
		int y=(height-HEIGHT)/2;
		setSize(WIDTH,HEIGHT);
		setLocation(x, y);//����λ�� �ʹ��ڴ�С	�������ñ������ñ��� 
		Font f=new Font("����",Font.BOLD,26);//����
		Font fe=new Font("����bai�п�",Font.BOLD,16);//��ǩ
		Font fee=new Font("����",Font.PLAIN,16);//�˺ſ�
		Font feee=new Font("����",Font.BOLD,16);//��¼��ť
		Font a=new Font("����",Font.BOLD,11);//ע���ǩ
		title.setForeground(Color.WHITE);
		title.setFont(f);
		title.setBounds(80, 30, 300, 54);
		name.setForeground(Color.cyan);//�����ǩ �û����� ����
		name.setBounds(80, 90, 62, 25);
		name.setFont(fe);
		password.setForeground(Color.cyan);
		password.setBounds(80, 123, 62, 25);
		password.setFont(fe);
		nameinput.setForeground(Color.BLACK);//�����˺����� �������
		nameinput.setBounds(120, 92, 180, 23);
		nameinput.setFont(fee);
		passwordinput.setForeground(Color.BLACK);
		passwordinput.setBounds(120, 125, 180, 23);
		passwordinput.setFont(fee);
		ok.setForeground(Color.white);	//���� ��¼��ť
		ok.setBackground(new Color(8,189,252));
		ok.setBounds(80, 160, 220, 33);
		ok.setFont(feee);
		reg.setForeground(new Color(166,166,166));//����ע���ǩ
		reg.setBounds(10, 180, 50, 20);
		reg.setFont(a);
		contentPanel.add(reg);
		contentPanel.add(ok);
		contentPanel.add(passwordinput);
		contentPanel.add(nameinput);
		contentPanel.add(password);
		contentPanel.add(name);
		contentPanel.add(title);
		contentPanel.add(img1);
		add(contentPanel);
	}
	//��ȡ�˺ſ�����
	static String readCountTextDate() {
		//mysql_data mysqlCon=new mysql_data();//����Ҫ��mysql ��ȡ���� 
		String nametext=nameinput.getText();
		return nametext;
	}
	//��ȡ���������
	static String  readPasswordTextDate() {
		String passwordtext=new String(passwordinput.getPassword());
		String str =new String(passwordtext);
		return str;
	}
	//���ж�ȡ���ݿ�����
	void mysqld() {
		ManageDatabaseReading mysql=new ManageDatabaseReading();//ʵ����ȡ sql ����
		loginlistener =new LoginEvent();//������¼������
		ok.addActionListener(loginlistener);
		reglistener =new RegEvent();//����ע�������
		reg.addMouseListener(reglistener);
	}
}
