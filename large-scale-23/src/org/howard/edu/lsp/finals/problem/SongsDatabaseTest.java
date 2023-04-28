package org.howard.edu.lsp.finals.problem;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class SongsDatabaseTest {
	private SongsDatabase myDatabase;
	
	@BeforeEach
	/**
	 * 
	 * @throws Exception
	 */
	void setUp() throws Exception {
		myDatabase = new SongsDatabase();
		myDatabase.addSong("Pop", "Smooth Criminal");
		myDatabase.addSong("Rock", "Hotel California");
		myDatabase.addSong("Jazz", "Sir Duke");
		myDatabase.addSong("Rap", "Freestyle");
	}
	
	@AfterEach
	/**
	 * 
	 * @throws Exception
	 */
	void tearDown() throws Exception {
		myDatabase = null;
	}

	@Test
	@DisplayName("Test case for adding song method")
	void testAddSong() {
		myDatabase.addSong("Pop", "Thriller");
        myDatabase.addSong("Pop", "Remember the Time");
        myDatabase.addSong("Rock", "Say It Ain't So");
        myDatabase.addSong("Rock", "Hotel California");
        myDatabase.addSong("Jazz", "Duke Ellington");
        myDatabase.addSong("Jazz", "Take the A Train");
        myDatabase.addSong("Rap", "Mockingbird");
        myDatabase.addSong("Rap", "Back to Back");
	}
	
	@Test
	@DisplayName("Test case for getting the song method")
	void testGetSong() {
		
		//testing if songs exist for pop songs set
		Set<String> mySongs = myDatabase.getSongs("Pop");
		assertTrue(mySongs.contains("Smooth Criminal"));
        assertFalse(mySongs.contains("Remember the Time"));
        
        //clearing set
        mySongs.clear();
        
        //testing if songs exist for the Jazz songs sets
        mySongs = myDatabase.getSongs("Jazz");
        assertTrue(mySongs.contains("Sir Duke"));
        assertFalse(mySongs.contains("Black People Song"));
        System.out.println(myDatabase.getSongs("Jazz")); //prints list of song in Jazz
        
        //clearing set
        mySongs.clear();
        
	    //testing if songs exist for the Rock songs sets
	    mySongs = myDatabase.getSongs("Rock");
	    assertTrue(mySongs.contains("Hotel California"));
	    assertFalse(mySongs.contains("Take the A Train"));
	    System.out.println(myDatabase.getSongs("Rock")); //prints list of songs in Rock
	    
	    //clearing set
        mySongs.clear();
        
	    //testing if songs exist for the Rap songs sets
	    mySongs = myDatabase.getSongs("Rap");
	    assertFalse(mySongs.contains("Mockingbird"));
	    assertTrue(mySongs.contains("Freestyle"));
	    
	    System.out.println(myDatabase.getSongs("Rap")); //prints list of songs in Rap
	}
	
	@Test
	@DisplayName("Test case for getting genre of song method")
	void testGettingGenreOfSong() {
		assertEquals("Pop", myDatabase.getGenreOfSong("Smooth Criminal"));
        assertEquals("Rock", myDatabase.getGenreOfSong("Hotel California"));
        assertEquals("Rap", myDatabase.getGenreOfSong("Freestyle"));
        System.out.println(myDatabase.getGenreOfSong("Smooth Criminal")); //prints genre of song
        System.out.println(myDatabase.getGenreOfSong("Freestyle")); //prints genre of song
        assertNull(myDatabase.getGenreOfSong("Hello"));
	}
	
	
	
}
