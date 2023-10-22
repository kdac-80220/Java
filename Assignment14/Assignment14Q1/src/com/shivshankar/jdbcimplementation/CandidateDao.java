package com.shivshankar.jdbcimplementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CandidateDao implements AutoCloseable{
	private Connection con;
	
		CandidateDao() throws Exception
		{
			con=Dbutil.getConnection();
		}
		
		public void close()
		{
			try {
				if(con!=null)
				{
					con.close();
				}
			}catch(Exception e)
			{
				e.printStackTrace();
			}	
		}
		
		public int addCandidate(Candidate c)
		{
			int cnt=0;
			String sql="insert into candidates values (default,?,?,?)";
			try(PreparedStatement pstmt=con.prepareStatement(sql))
			{
				pstmt.setString(1, c.getName());
				pstmt.setString(2, c.getParty());
				pstmt.setInt(3, c.getVotes());
				
				cnt=pstmt.executeUpdate();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			return cnt;
		}
		
		public int updateCandidate(Candidate c)
		{
			int cnt=0;
			String sql="update candidates set name=?, party=? where id=?";
				try(PreparedStatement pstmt=con.prepareStatement(sql))
				{
					pstmt.setString(1, c.getName());
					pstmt.setString(2, c.getParty());
					pstmt.setInt(3, c.getId());
					
					cnt=pstmt.executeUpdate();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			return cnt;
		}
		
		public List<PartyVotes> getPartywiseVotes() {
			List<PartyVotes> list=new ArrayList<>();
			int cnt=0;
			String sql="Select distinct party,sum(votes) from candidates group by party";
			try(PreparedStatement pstmt=con.prepareStatement(sql))
			{
				try(ResultSet rs=pstmt.executeQuery())
				{
					while(rs.next())
					{
						String party=rs.getString("party");
						int votes=rs.getInt("sum(votes)");
						list.add(new PartyVotes(party,votes));
						cnt++;
					}
				}
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			return list;
		}
}


