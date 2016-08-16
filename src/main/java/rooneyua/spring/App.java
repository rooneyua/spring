package rooneyua.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"beans.xml"});
		
		PetShop petShop = context.getBean("petShop", PetShop.class);
		
		System.out.println(petShop.getName());
	}
}
