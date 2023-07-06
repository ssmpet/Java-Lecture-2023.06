package mysql.Ex07_kpop;

import java.time.LocalDate;

public class GirlGroup {
	private int gid;
	private String name;
	private LocalDate debut;
	private int hitSongId;
	private String title;
	
	public GirlGroup() {}
	public GirlGroup(int gid, String name, LocalDate debut, int hitSongId) {
		this.gid = gid;
		this.name = name;
		this.debut = debut;
		this.hitSongId = hitSongId;
	}
	public GirlGroup(int gid, String name, LocalDate debut, int hitSongId, String title) {
		this.gid = gid;
		this.name = name;
		this.debut = debut;
		this.hitSongId = hitSongId;
		this.title = title;
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDebut() {
		return debut;
	}
	public void setDebut(LocalDate debut) {
		this.debut = debut;
	}
	public int getHitSongId() {
		return hitSongId;
	}
	public void setHitSongId(int hitSongId) {
		this.hitSongId = hitSongId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "GirlGroup [gid=" + gid + ", name=" + name + ", debut=" + debut + ", hitSongId=" + hitSongId + ", 히트송=" + title +"]";
	}
	
	
}
