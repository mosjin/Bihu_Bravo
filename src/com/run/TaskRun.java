package com.run;

import com.web.browser.management.bihu.Bihu;

public class TaskRun {

	public static void main(String[] args) {
		Bihu bihu = new Bihu(null, null);
		
		boolean isSuccess = bihu.login("https://bihu.com/login", "jjwlove@126.com", "jjwang1985");
		if(isSuccess == true) {
			bihu.doBravo();
		}
	}
}
