package org.howard.edu.lsp.finals.problem;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SongsDatabase {
	//keys is the genre, Hashset contains associated songs
	
	private Map<String, HashSet<String>> map = new HashMap<String, HashSet<String>>();
	
	// Add a song title to a genre
	public void addSong(String genre, String songTitle) {
		HashSet<String> mySongSet = map.get(genre);
		if(mySongSet == null) {
			mySongSet = new HashSet<String>();
			map.put(genre, mySongSet);
		}
		mySongSet.add(songTitle);
	}
	
	//Return the Set that contains all songs for a genre 
	public Set<String> getSongs(String genre) {
		HashSet<String> mySongSet = map.get(genre);
		if(mySongSet == null) {
			mySongSet = new HashSet<String>();

		}
		return mySongSet;
	}
	
	//Return genre, i.e., jazz, given a song title 
	public String getGenreOfSong(String songTitle) {
		for (String genre: map.keySet()) {
			HashSet<String> mySongSet = map.get((genre));
			if (mySongSet.contains((songTitle))){
				return genre;
			}
		}
		return null;
	}
	
}
