package com.leadersys;
/*
 *����:ManageBackgroundPictures.class
 *�汾:1.0
 *����:2020��12��29��
 */

import javax.swing.*;
import java.awt.*;

public class ManageBackgroundPictures extends JPanel {
	FlowLayout flowlayout;
	JLabel img1;//���� ���� �Ա� רҵ  ��� нˮ  ͼƬ
	public ManageBackgroundPictures() {
		setLayout(null);//
		ImageIcon img = new ImageIcon("src/img/2.jpg");//���Ǳ���ͼƬ 
		img1=new JLabel(img);
		img1.setBounds(0,0,530, 50);//���ñ���ͼƬ ���ñ���λ��
		this.setBounds(0,0,530,50);
		add(img1);
	}

}
