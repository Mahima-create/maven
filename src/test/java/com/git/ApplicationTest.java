package com.git;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ApplicationTest {

	@Test
	public void Addtest() {
		Application junit = new Application();
		int result = junit.add(100, 200);
		assertEquals(300, result);

	}

}
