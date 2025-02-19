package grupo.aula_spring_data_jpa;

import grupo.aula_spring_data_jpa.model.User;
import grupo.aula_spring_data_jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Luis");
        user.setUsername("LuisC");
        user.setPassword("spring123");

        repository.save(user);

        for(User u: repository.findAll()) {
            System.out.println(u);
        }
    }
}
