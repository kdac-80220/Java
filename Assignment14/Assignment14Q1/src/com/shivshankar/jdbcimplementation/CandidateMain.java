package com.shivshankar.jdbcimplementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CandidateMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("0.Exit");
			System.out.println("1.Add Candidates");
			System.out.println("2.Update Candidates");
			System.out.println("3.Party wise votes");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:	try(CandidateDao dou=new CandidateDao())
						{
							Candidate c=new Candidate();
							c.acceptCandidate();
							int cnt=dou.addCandidate(c);
							System.out.println("Row Inserted..."+cnt);
						}catch(Exception e)
						{
							e.printStackTrace();
						}
						break;
				case 2:	try(CandidateDao dou=new CandidateDao())
						{
							Candidate c=new Candidate();
							System.out.println("Enter Id:");
							c.setId(sc.nextInt());
							System.out.println("Enter Name:");
							c.setName(sc.next());
							System.out.println("Enter Party:");
							c.setParty(sc.next());
							int cnt=dou.updateCandidate(c);
							System.out.println("Row Updated: "+cnt);
						}catch(Exception e)
						{
							e.printStackTrace();
						}
						break;
				case 3:	List<PartyVotes> list=new ArrayList<>();
						try(CandidateDao dou=new CandidateDao())
						{
							list=dou.getPartywiseVotes();
							for(PartyVotes s:list)
								System.out.println(s);
							
						}catch(Exception e)
						{
							e.printStackTrace();
						}
						break;
				default:System.out.println("Wrong choise");
			}
			
		}while(choice!=0);
		
		
		
		
		
	}

}
