package shirazisoftware.accessingdatajpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AccessingDataJpaApplication {

    private static final Logger log =
            LoggerFactory.getLogger(AccessingDataJpaApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(AccessingDataJpaApplication.class);
    }

    @Bean
    public CommandLineRunner shirazisoftware(BuddyInfoRepository repository) {
        return (args) -> {
            // save a few customers
            repository.save(new BuddyInfo("Jack", "(613) 098-7474", "Canada"));
            repository.save(new BuddyInfo("Chloe", "(613) 023-4321", "Canada"));
            repository.save(new BuddyInfo("Kim", "(613) 937-1284", "Canada"));
            repository.save(new BuddyInfo("David", "(613) 001-8235", "Canada"));
            repository.save(new BuddyInfo("Michelle", "(613) 939-7362", "Canada"));

            // fetch all customers
            log.info("Buddies found with findAll():");
            log.info("-------------------------------");
            for (BuddyInfo buddy : repository.findAll()) {
                log.info(buddy.toString());
            }
            log.info("");

            // fetch an individual customer by ID
            BuddyInfo buddyInfo = repository.findById(1L);
            log.info("Buddy found with findById(1L):");
            log.info("--------------------------------");
            log.info(buddyInfo.toString());
            log.info("");

            // fetch customers by name
            log.info("Buddy found with findByName('David'):");
            log.info("--------------------------------------------");
            repository.findByName("David").forEach(david -> {
                log.info(david.toString());
            });
            // for (Customer bauer : repository.findByLastName("Bauer")) {
            //  log.info(bauer.toString());
            // }
            log.info("");

        };
    }

}