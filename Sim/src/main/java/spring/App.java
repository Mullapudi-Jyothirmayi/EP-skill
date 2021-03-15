package spring;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SuppressWarnings({ "unused", "deprecation" })
public class App 
{
    public static void main( String[] args )
    {
//        Resource r = new ClassPathResource("spring.xml");
//        BeanFactory f = new XmlBeanFactory(r);
    	ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
    	Sim sim = (Sim) ac.getBean("sim", Sim.class);
//        Sim sim = (Sim) f.getBean("airtel", Sim.class);

    	System.out.println(sim);
    }
}
