package shirazisoftware.accessingdatajpa;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AddressBookLauncher {

    public void launch() {
        String[] contextPaths = new String[] {"app-context.xml"};
        new ClassPathXmlApplicationContext(contextPaths);
    }

}
