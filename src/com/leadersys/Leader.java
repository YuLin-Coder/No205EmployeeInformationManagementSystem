package com.leadersys;
/*
 *����:Leader.class
 *�汾:1.0
 *����:2020��12��29��
 */
public class Leader {
		static Login login;
		public static void setDisappear(Login logina) {
			login=logina;
	}
		public static void disappear() {
			login.dispose();
	}
	public static void main(String[] args) {
		Login login =new Login();//���ص�¼��
		setDisappear(login);
	}
}
