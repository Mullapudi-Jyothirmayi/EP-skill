package hibernate_student;

import java.util.List;
import org.hibernate.query.Query;


public class Student_DAO 
{
	
	public static int save(Student_Bean sb)
	{
		Config c = new Config();		
		c.configgen();
		c.ss.save(sb);
		c.t.commit();
		c.ss.close();
		c.sf.close();
		return 1;
	}
	public static int updateaddress(String address,int id)
	{
		Config c = new Config();		
		c.configgen();
		Query q=c.ss.createQuery("update Student_Bean set address=:newaddress where sregno=:sid");
		q.setParameter("newaddress",address);
		q.setParameter("sid",id);
		int b=q.executeUpdate();
		c.t.commit();
		c.ss.close();
		c.sf.close();
		return b;
		
	}
	public static int updatecourse(String course,int regno)
	{
		Config c = new Config();		
		c.configgen();
		Query q=c.ss.createQuery("update Student_Bean set course=:newcourse where sregno=:stid");
		q.setParameter("newcourse",course);
		q.setParameter("stid",regno);
		int i=q.executeUpdate();
		c.t.commit();
		c.ss.close();
		c.sf.close();
		return i;
	}
	public static int delete(int regno)
	{
		Config c = new Config();		
		c.configgen();
		Query q=c.ss.createQuery("delete from Student_Bean where sregno=:stid");
		q.setParameter("stid",regno);
		int j=q.executeUpdate();
		c.t.commit();
		c.ss.close();
		c.sf.close();
		return j;
	}
	public static void displayvalue(int id)
	{
		Config c = new Config();		
		c.configgen();
		Query q=c.ss.createQuery("from Student_Bean where sregno=:stid");
		q.setParameter("stid",id);
		Student_Bean sb =(Student_Bean) q.uniqueResult();
		System.out.println(sb);
		c.t.commit();
		c.ss.close();
		c.sf.close();
	}
	public static void displayall(Student_Bean sb)
	{
		Config c = new Config();		
		c.configgen();
		Query q=c.ss.createQuery("from Student_Bean");	
		List<Student_Bean> list=q.list();		
		for(Student_Bean e:list) {
			System.out.println(e);			
		}
		c.t.commit();
		c.ss.close();
		c.sf.close();
	}
	
}
