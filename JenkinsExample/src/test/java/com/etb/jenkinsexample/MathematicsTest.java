package com.etb.jenkinsexample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathematicsTest {

	@Test
	void testAdd() {
		assertEquals(5,Mathematics.add(3, 2));
	}

	@Test
	void testSub() {
		assertEquals(1,Mathematics.add(3, 2));
	}

}
