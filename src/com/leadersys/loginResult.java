package com.leadersys;
/*
 *����:loginResult.class
 *�汾:1.0
 *����:2020��12��29��
 */
import javax.swing.*;
import java.awt.*;

public class loginResult extends JFrame{
	
	ManageBackgroundPictures apan;//��һ�಼��
	ManageComponents bpan;//�ڶ��಼��
	ManageCondition cpan;//�����಼��
	ManageForm dpan;//�����಼��  //����װ ��  ɾ  ��  ��  ���� �����ť  ��flowLayou ����  	��һ������װһ��ͼƬ
	static final int WIDTH=530;//���ö����ܵĿ��
	static final int HEIGHT=450;//���ö����ܵĸ߶�
	//����  5����ť  6����ǩ   6���༭��  һ�����  һ����ǩͼƬ
	JRadioButton man,woman;//��ѡ��ť �� Ů 
	ButtonGroup group;//����������İ�ť 
	public loginResult(){
		setVisible(true); 
		init();
		setResizable(false);//���ɱ䴰��
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		validate();
	}
	void init() {//���õ�ǰ����λ��
		Toolkit kit =Toolkit.getDefaultToolkit();//��ȡ�����С
		Dimension screenSize=kit.getScreenSize();
		int width=screenSize.width;
		int height=screenSize.height;//��ȡ��Ļ�߶ȺͿ��
		int x=(width-WIDTH)/2;
		int y=(height-HEIGHT)/2;
		setSize(WIDTH,HEIGHT);
		setLocation(x, y);//����λ�� �ʹ��ڴ�С
		this.setLayout(null);//��һ���õ�ǰ����Ϊ��
		apan=new ManageBackgroundPictures();//��һ����� ͼƬ
		bpan=new ManageComponents();//�ڶ���Ű�ť
		cpan=new ManageCondition();//����Ϣ��
		dpan=new ManageForm();//�ű��
		this.add(apan);
		this.add(bpan);
		this.add(cpan);
		this.add(dpan);
	
	}
}
