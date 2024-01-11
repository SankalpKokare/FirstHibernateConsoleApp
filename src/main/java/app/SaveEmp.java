package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.hibernate.*;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import entites.Emp;

public class SaveEmp {

	public static void main(String[] args) throws ParseException {
		
		//create session factory
		//create the service 
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		
		//read the info hibernate.cfg.xml file
		Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
		
		//connect to database
		SessionFactory sf = metadata.getSessionFactoryBuilder().build();
		
		//create session 
		Session session = sf.openSession();
		
		//LocalDate.parse("2000-09-08").get
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				java.util.Date bdate_p = new java.util.Date(sdf.parse("2000-09-08").getTime());
				java.sql.Date bdate = new java.sql.Date(bdate_p.getTime());
				
	Emp e = new Emp(200, "Hibernate", "coder", 7369, bdate, 500,0.00);
		
	Transaction tr = session.beginTransaction();
	
	session.persist(e);  //insert query
	
	tr.commit();
	
	session.close();
	
	sf.close();
	
		
	}
	
}
