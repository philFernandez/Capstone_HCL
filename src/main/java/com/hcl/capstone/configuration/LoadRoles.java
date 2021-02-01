package com.hcl.capstone.configuration;

import java.util.HashSet;
import java.util.Set;
import com.hcl.capstone.model.Role;
import com.hcl.capstone.model.RoleRepository;
import com.hcl.capstone.model.User;
import com.hcl.capstone.model.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadRoles {

    @Bean
    CommandLineRunner loadRolesDB(UserRepository userRepo, RoleRepository roleRepo) {
        final Set<User> users = new HashSet<>();
        final Set<Role> roles = new HashSet<>();
        final User user = new User("phil", "phil", "phil@hcl.com");
        final Role userRole = new Role();
        userRole.setName("ROLE_USER");
        users.add(user);
        roles.add(userRole);
        userRole.setUsers(users);
        return args -> {
            roleRepo.save(userRole);
            user.setRoles(roles);
            userRepo.save(user);
        };
    }

}
