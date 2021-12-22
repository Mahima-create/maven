package com.git;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConCat {

	@Test
	public void ConCattest() {
		Application junit = new Application();
		String result = junit.ConCat("Hello", "Welcome");
		assertEquals("HelloWelcome", result);
	}

}
