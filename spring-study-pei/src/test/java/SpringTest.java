import com.ellison.pei.domain.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ellisonpei
 */

public class SpringTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext st = new AnnotationConfigApplicationContext();
		st.start();

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		Student s = (Student) applicationContext.getBean("student");



	}
}
