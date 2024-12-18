package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import hust.soict.dsai.aims.exception.PlayerException;

public class CompactDisc extends Disc implements Playable {
    // Fields
    private String artist;
    private List<Track> tracks = new ArrayList<>();

    // Constructor 
    public CompactDisc(String title, String category, float cost, int length, String artist) {
        super(-1, title, category, cost, length);
        this.artist = artist;
    }
   

	// Getters and Setters
    public String getArtist() {
        return artist;
    }

    // Method to add a track
    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("Track \"" + track.getTitle() + "\" is already in the list.");
        } else {
            tracks.add(track);
            System.out.println("Track \"" + track.getTitle() + "\" has been added.");
        }
    }

    // Remove a track
    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track \"" + track.getTitle() + "\" has been removed.");
        } else {
            System.out.println("Track \"" + track.getTitle() + "\" is not in the list.");
        }
    }

    // Get the total length of the CD
    @Override
    public int getLength() {
        return tracks.stream().mapToInt(Track::getLength).sum();
    }

    // Implement play() method
    @Override
	public void play() throws PlayerException{
		System.out.println("CompactDisc Artist: " + this.getArtist());
		System.out.println("Total length: " + this.getLength());

		if (this.getLength() > 0) {
			System.out.println("Compactdisc: " + this.getTitle());
			System.out.println("CompactDisc Artist: " + this.getArtist());
			System.out.println("Total length: " + this.getLength());
			Iterator<Track> iter = tracks.iterator();
			Track nextTrack;
			while (iter.hasNext()) {
				nextTrack = (Track) iter.next();
				try {
					nextTrack.play();
				}
				catch(PlayerException e ) {
					throw e;
				}
			}
		}
		else {
			throw new PlayerException("Error: CD length is non-positive!");
		}

		System.out.println("-----------------Play All Tracks-----------------");
		for (Track track: tracks) {
			track.play();
		}
	}

    // Override toString for CompactDisc details
    @Override
    public String toString() {
        return String.format("CD - %s - %s - %s: %.2f $", getTitle(), getCategory(), artist, getCost());
    }
} 
