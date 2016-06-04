package br.com.tt;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses(
		{
			TesteJunit01.class, 
			TesteJunit02.class
		}
	)

public class JunitTestSuite {

}
