package com.Logger.shabaan.TDD_And_JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestDeleteA {
	DeleteAFromFirst2Char deleteAFromFirst2Char;
	@BeforeEach
	void setip() {
		 deleteAFromFirst2Char =new DeleteAFromFirst2Char();
	}
	@Test
	void testAAtFirst() {
		assertEquals("BCD",deleteAFromFirst2Char.del("ABCD"));
	}
	@Test
	void testAAtFirst2Char() {
		assertEquals("CD",deleteAFromFirst2Char.del("AACD"));
	}
	@Test
	void testAAtSecondChar() {
		assertEquals("BCD",deleteAFromFirst2Char.del("BACD"));
	}
	@Test
	void testAAtAfterTwoChar() {
		assertEquals("BBAA",deleteAFromFirst2Char.del("BBAA"));
	}
	@Test
	void testAAtAfterThreeChar() {
		assertEquals("ABC",deleteAFromFirst2Char.del("AAABC"));
	}
	@Test
	void testAAtFirstAndLastTwoChar() {
		assertEquals("BAA",deleteAFromFirst2Char.del("AABAA"));
	}
	@Test
	void testAAtEmptyChar() {
		assertEquals("",deleteAFromFirst2Char.del(""));
	}
}
