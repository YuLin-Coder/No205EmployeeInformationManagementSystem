package com.leadersys;
/*
 *����:ManageForm.class
 *�汾:1.0
 *����:2020��12��29��
 */

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.util.Vector;

public class ManageForm extends JPanel{
	static JTable table=null;	
	static Vector rwo;
	JScrollPane jscrollpane;
	Object columns[] ={"����","����","�Ա�","нˮ","רҵ","����"};//������Ϣ
	static Object a[][];//������Ϣ
	static int row ;
	static DefaultTableModel  model;
	static TableColumnModel columnModel;
	public ManageForm (){
		JTable tableL=getTable();
		JScrollPane jscrollpane=new JScrollPane(tableL);
		jscrollpane.setPreferredSize(new Dimension(500,160));
		tableL.setPreferredSize(new Dimension(200,160));
		jscrollpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		this.setBounds(0, 215,516,190);
		setBorder(BorderFactory.createTitledBorder("������ʾ����"));
		add(jscrollpane);
	}

	JTable getTable() {
		if(table==null) {
			table=new JTable();//���� 
			int[] columnWidth={70,70,70,70,70,70};//�����п�
			model=new DefaultTableModel(){
				public boolean isCellEditable(int row, int column)
				{
				return false;
				}
				};//�п� ������  �����ñ�񲻿ɱ༭
			model.setColumnIdentifiers(columns);
			table.setModel(model);//����Ϊ����ģʽ
			columnModel=table.getColumnModel();//��ȡ�����Ŀ���
			table.getTableHeader().setReorderingAllowed(false);//�ñ�񲻿��϶�
			table.getTableHeader().setResizingAllowed(false);//�ñ�񲻿��϶�
			int count=columnModel.getColumnCount();//��������������
			for(int i=0;i<count;i++){
				javax.swing.table.TableColumn column=columnModel.getColumn(i);//�����б��еĶ���
				column.setPreferredWidth(columnWidth[i]);
			}
			 rwo = new Vector(6);
		}
		return table;
	}
}

