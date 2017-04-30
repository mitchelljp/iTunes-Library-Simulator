package edu.macalester.comp124.music;

/**
 * A media object in an iTunes library that may be a podcast, song, video, etc.
 * 
 * @author shilad
 */
public class Media {
    private String filePath;
    private String name;
    private int count;

    /**this is a constructor for the media class
     *
     * @param filePath
     * @param name
     * @param count
     */
    public Media(String filePath, String name, int count){
        this.filePath=filePath;
        this.name=name;
        this.count=count;
    }

    /**
     * this is second media constructor
     * @param filePath
     * @param name
     */
    public Media(String filePath, String name){
        this(filePath,name,0);
    }

    //these are getters below.
    public String getFilePath() {
        return this.filePath;
    }
    public String getName(){
        return this.name;
    }
    public int getCount(){
        return this.count;
    }



    /**
     * Returns true iff the media object matches the search query.
     */
	public boolean matchesQuery(String query) {
		return getName().toLowerCase().contains(query.toLowerCase());
	}

    @Override
    public boolean equals(Object o) {
        Media media = (Media) o;
        return (filePath.equals(media.filePath) && name.equals(media.name));
    }
    public String toString(){
    return "This song is located at"+filePath+". The song title is "+name + ".";
}
}


