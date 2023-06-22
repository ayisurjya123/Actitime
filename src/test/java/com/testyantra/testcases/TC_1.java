package com.testyantra.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.testyantra.generic.BaseTest;
import com.testyantra.pages.Actitimelogin;

public class TC_1 extends BaseTest
{

	@Test
	public void login1() throws IOException
	{
		Actitimelogin log=new Actitimelogin(driver);
		log.loginmethod();
	}
}
