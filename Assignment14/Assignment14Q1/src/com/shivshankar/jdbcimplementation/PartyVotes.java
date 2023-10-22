package com.shivshankar.jdbcimplementation;


//POJO class= constructors+getters/setters+toString()
public class PartyVotes {
	private String party;
	private int votes;

	public PartyVotes() {
		// TODO Auto-generated constructor stub
	}
	public PartyVotes(String party, int votes) {
		
		this.party = party;
		this.votes = votes;
	}
	public String getParty() {
		return party;
	}
	public void setParty(String party) {
		this.party = party;
	}
	public int getVotes() {
		return votes;
	}
	public void setVotes(int votes) {
		this.votes = votes;
	}
	
	
	@Override
	public String toString() {
		return "Party:"+this.party+" Votes: "+this.votes;
	}
}
