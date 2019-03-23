/**
 * 
 */
package com.krishna.rest.model;

import java.io.Serializable;

/**
 * @author arunangsu.sahu
 *
 */
public class Track implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -495386184377212953L;
	private String title;
	private String singer;
	/**
	 * 
	 */
	public Track() {
		// No argument Constructor
	}
	/**
	 * @param title
	 * @param singer
	 */
	public Track(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the singer
	 */
	public String getSinger() {
		return singer;
	}
	/**
	 * @param singer the singer to set
	 */
	public void setSinger(String singer) {
		this.singer = singer;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Track [title=" + title + ", singer=" + singer + "]";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((singer == null) ? 0 : singer.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Track other = (Track) obj;
		if (singer == null) {
			if (other.singer != null)
				return false;
		} else if (!singer.equals(other.singer))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	

}
