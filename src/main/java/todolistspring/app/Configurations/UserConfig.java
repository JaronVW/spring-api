package todolistspring.app.Configurations;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import todolistspring.app.Models.User;
import todolistspring.app.Repositories.UserRepository;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class UserConfig {

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
