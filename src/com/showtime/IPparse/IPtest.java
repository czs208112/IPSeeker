package com.showtime.IPparse;

import junit.framework.TestCase;

public class IPtest extends TestCase {

	public void testIp() {
		// 指定纯真数据库的文件名，所在文件夹
		IPSeeker ip = new IPSeeker("QQWry.Dat", "C:/Program Files (x86)/cz88.net/ip");
		// 测试IP 58.20.43.13
		System.out.println(ip.getIPLocation("1.1.1.2").getCountry() + ":" + ip.getIPLocation("1.1.1.2").getArea());
	}
}