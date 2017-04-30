package edu.macalester.comp124.music;


/**
 * A song in an itunes library
 */
public class Song extends Media {
	private String artist;
	private String album;

    /**
     * Chains to the 5-arg song constructor
     * @param filePath
     * @param artist
     * @param album
     * @param song
     */
	public Song(String filePath, String artist, String album, String song) {
		this(filePath, artist, album, song, 0);
	}

    /**
     * Initializes a new song.
     * @param filePath
     * @param artist
     * @param album
     * @param song
     * @param count
     */
	public Song(String filePath, String artist, String album, String song, int count) {
		super(filePath, song, count);
		this.artist = artist;
		this.album = album;
	}

	public String getArtist() {
		return artist;
	}
	public String getAlbum() {
		return album;
	}

	public String toString() {

		return super.toString()+" The artist is "+artist+" and the album is " +album + ".";
	}

    /**
     * Returns true iff the song matches a human-entered query.
     * @param query
     * @return
     */
	public boolean matchesQuery(String query) {
		return ((super.matchesQuery(query))
		||     (artist != null && artist.toLowerCase().contains(query.toLowerCase()))
		||     (album != null && album.toLowerCase().contains(query.toLowerCase())));
	}
    //this is comparing two things from different classes to see if they are the same
    @Override
    public boolean equals(Object obj){
        if(obj == null || !(obj instanceof Song)){
            return false;
        }
        Song songObj=(Song)obj;
        if (this.artist.equals(songObj.getArtist()) && this.album.equals(songObj.getAlbum()) && super.equals(songObj)){
            return true;
        }
        return false;

    }
}
