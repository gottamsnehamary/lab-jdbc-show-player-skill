package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO
{
	static List<Skill> list=new ArrayList<Skill>();
	public List< Skill > listAllSkills() throws Exception
	{
        Connection con = ConnectionManager.getConnection();
        
		Statement stmt=  con.createStatement();
		
		ResultSet rs =stmt.executeQuery("select * from SKILL order by name asc ");
		
		while(rs.next())
		{
			
			long id=rs.getLong(1);
			String name=rs.getString(2);
			Skill skill=new Skill(id,name);
			
			list.add(skill);
			
		}
		
		return list;
		
		
	}
	
	

	
}
