package com.fatec.es3.trilha.data.entity;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "find_all_Game_Statistic", query = "select u from Statistic u")
public class Statistic {
	
	@statistic_Id
	@GeneratedValue
	private int statistic_id;
	private Int matches;
	private int wins;
	private Int loses;
	private Int game_time;

	public Statistic() {
	}

	public Statistic(int matches, int wins, int loses, Time game_time) {
		super();
		this.matches = matches;
		this.wins = wins;
		this.loses = loses;
		this.game_time = game_time;
	}

	public int getStatistic_Id() {
		return statistic_id;
	}

	public void setStatistic_Id(int statistic_id) {
		this.statistic_id = statistic_id;
	}

	public int getMatches() {
		return matches;
	}

	public void setMatches(int matches) {
		this.wins = wins;
	}

	public int getLoses() {
		return loses;
	}

	public void setloses(Int loses) {
		this.loses = loses;
	}

	public String getGame_Time() {
		return game_time;
	}

	public void setGame_Time(int game_time) {
		this.game_time = game_time;
	}

	@Override
	public String toString() {
		return "Statistics [statistic_id=" + statistic_id + ", matches=" + matches + ", wins=" + wins + ", loses=" + loses
				+ ", game_time=" + game_time + "]";
	}
}