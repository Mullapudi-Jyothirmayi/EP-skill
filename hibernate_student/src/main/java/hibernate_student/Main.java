package hibernate_student;

import java.util.Scanner;

public class Main {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Choose The Crud Operations");
			System.out.println("1.Insertion\n2.Update Address\n3.Update Course\n4.Deletion\n5.Display By using id\n6.Dispaly all values\n ");
			int option=sc.nextInt();
			Student_Bean sb=new Student_Bean();
			switch(option) {
			
				case 1:
						System.out.println("Enter Regno:");
						int id=sc.nextInt();
						sb.setSregno(id);						
						System.out.println("Enter Name:");
						String name=sc.next();
						sb.setName(name);						
						System.out.println("Enter DOB:");
						String dob=sc.next();
						sb.setDob(dob);						
						System.out.println("Enter Email:");
						String email=sc.next();
						sb.setEmail(email);						
						System.out.println("Enter Address:");
						String address=sc.next();
						sb.setAddress(address);						
						System.out.println("Enter course:");
						String course=sc.next();
						sb.setCourse(course);	
						int i=Student_DAO.save(sb);						
						if(i>0) {
							System.out.println("Insertion sucessful!!");
							
						}
						else {
							System.out.println("Insertion Failed!!");
						}
						break;
				case 2:
					System.out.println("Enter id for updation:");
					int sid=sc.nextInt();
					System.out.println("Enter Address For updation");
					String newaddress=sc.next();
					int a=Student_DAO.updateaddress(newaddress,sid);
					if(a>0) {
						System.out.println("Address updated sucessfully!!");
					}
					else {
						System.out.println("Address not updated!!!");
	
					}
					break;
				case 3:
					System.out.println("Enter id for updation:");
					int stid=sc.nextInt();
					System.out.println("Enter Course For updation");
					String newcourse=sc.next();
					int c=Student_DAO.updatecourse(newcourse,stid);
					if(c>0) {
						System.out.println("Course updated sucessfully!!");
					}
					else {
						System.out.println("Course not updated!!!");
	
					}
					break;
				case 4:
					
					System.out.println("Enter id to delete details:");
						int stuid=sc.nextInt();
						int d=Student_DAO.delete(stuid);
						if(d>0) {
							System.out.println("Deleted Sucessfullly!!!");
						}
						else {
							System.out.println("Cannot be deleted");
						}
						break;
						
					
				case 5:
					System.out.println("Enter id to get details:");
					int suid=sc.nextInt();
					Student_DAO.displayvalue(suid);
					break;
					
				case 6:
					Student_DAO.displayall(sb);
					break;
			}
		}
		
	}
}
