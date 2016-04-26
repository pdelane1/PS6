package base;

import static org.junit.Assert.*;

import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import domain.PersonDomainModel;
import base.PersonDAL;

public class Person_Test {
	private UUID PersonID = UUID.randomUUID();
	PersonDomainModel Person = new PersonDomainModel(PersonID);

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void addPersonTest() {
		assertEquals(PersonDAL.addPerson(Person), Person);
	}
	
	@Test
	public void updatePersonTest() {
		assertEquals(PersonDAL.updatePerson(Person), Person);
	}
	
	@Test
	public void getPersonTest() {
		assertEquals(PersonDAL.getPerson(PersonID), Person);
	}

}
