package com.creants.mufantasy.entities;

/**
 * @author LamHM
 *
 */
public class GameHero {
	// server_id#user_id#hero_no
	private String id;
	private int userId;
	private String serverId;
	private String name;
	private int level;
	private long zen;
	private long soul;
	private int exp;
	private int statmina;


	public int getStatmina() {
		return statmina;
	}


	public void setStatmina(int statmina) {
		this.statmina = statmina;
	}


	public String getServerId() {
		return serverId;
	}


	public void setServerId(String serverId) {
		this.serverId = serverId;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getZen() {
		return zen;
	}


	public void setZen(long zen) {
		this.zen = zen;
	}


	public long getSoul() {
		return soul;
	}


	public void setSoul(long soul) {
		this.soul = soul;
	}


	public int getExp() {
		return exp;
	}


	public void setExp(int exp) {
		this.exp = exp;
	}

}
