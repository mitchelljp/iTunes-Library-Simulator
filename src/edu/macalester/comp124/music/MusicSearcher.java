package edu.macalester.comp124.music;

import acm.program.ConsoleProgram;

/**
 * Searches the "iTunes Music Library.xml" file for a query.
 */
public class MusicSearcher extends ConsoleProgram {
	public static final String PATH = "../124-itunes/res/iTunes Music Library.xml";
    public static final String SENTINEL = "stop";
    private ITunesReader itunes;

    public void init() {
        itunes = new ITunesReader(PATH);
    }

	public String summarize(){
        Song song;
        int count=0;
        while(true){
            song=itunes.readNextSong();
                if(song==null) {
                    break;
                }
            count++;
            if(song.getCount()>=100){
                println(song);
            }

        }
        println(count);

        return null;

    }

	public void run() {
        while(true){
            String query= readLine ("Please enter a search query");
            if(query=="stop"){
                break;
                }
            else{
                summarize();
            }


        }


    }
}
