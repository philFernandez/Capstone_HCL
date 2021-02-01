package com.hcl.capstone.configuration;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import com.hcl.capstone.model.Category;
import com.hcl.capstone.model.Genre;
import com.hcl.capstone.model.Order;
import com.hcl.capstone.model.OrderRepository;
import com.hcl.capstone.model.Product;
import com.hcl.capstone.model.ProductRepository;
import com.hcl.capstone.model.Role;
import com.hcl.capstone.model.RoleRepository;
import com.hcl.capstone.model.User;
import com.hcl.capstone.model.UserRepository;
import com.hcl.capstone.utils.MyUtils;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {

    @Bean
    CommandLineRunner loadRolesDB(UserRepository userRepo, RoleRepository roleRepo,
            ProductRepository productRepo, OrderRepository orderRepo)
            throws ParseException {
        final Set<User> users = new HashSet<>();
        final Set<Role> roles = new HashSet<>();

        final User user = new User("phil", "phil", "phil@hcl.com");
        final Role userRole = new Role();

        userRole.setName("ROLE_USER");
        users.add(user);
        roles.add(userRole);
        userRole.setUsers(users);

        final Order order1 = new Order(MyUtils.DATE_FMT.parse("01/31/2021"), 0.07, user);

        Product guitar = new Product(order1.getId(), "Guitar", Category.INSTRUMENT,
                "6 string guitar", 149.99, 12);
        Product bassGuitar =
                new Product(order1.getId(), "Bass Guitar", Category.INSTRUMENT,
                        "4 string bass guitar", 199.99, 10);
        Product flute = new Product(order1.getId(), "Wood Flute", Category.INSTRUMENT,
                "Flute of wood", 599.99, 6);
        Product jimiHendrix =
                new Product(order1.getId(), "Jimi Hendrix", Category.VINYL, Genre.ROCK,
                        "Jimi Hendrix Record: 72 rpm", 12.49, 100);
        Product theDoors1 =
                new Product(order1.getId(), "The Doors CD", Category.DISK, Genre.ROCK,
                        "Doors Compact Disc", 12.49, 100);
        Product bbKing =
                new Product(order1.getId(), "BBking's Greatest Hits", Category.DISK,
                        Genre.BLUES,
                        "BBKing Compact Disc", 15.49, 100);
        Product guitarStock = new Product("Guitar", Category.INSTRUMENT,
                "6 string guitar", 149.99, 12);
        Product bassGuitarStock = new Product("Bass Guitar", Category.INSTRUMENT,
                "4 string bass guitar", 199.99, 10);
        Product fluteStock = new Product("Wood Flute", Category.INSTRUMENT,
                "Flute of wood", 599.99, 6);
        Product jimiHendrixStock =
                new Product("Jimi Hendrix", Category.VINYL, Genre.ROCK,
                        "Jimi Hendrix Record: 72 rpm", 12.49, 100);
        Product theDoors1Stock = new Product("The Doors CD", Category.DISK, Genre.ROCK,
                "Doors Compact Disc", 12.49, 100);
        Product bbKingStock =
                new Product("BBking's Greatest Hits", Category.DISK, Genre.BLUES,
                        "BBKing Compact Disc", 15.49, 100);
        List<Product> order1Products = new ArrayList<>(Arrays.asList(guitar, bassGuitar,
                flute, jimiHendrix, theDoors1, bbKing));
        order1.setProducts(order1Products);


        return args -> {
            roleRepo.save(userRole);
            user.setRoles(roles);
            userRepo.save(user);

            productRepo.save(guitar);
            productRepo.save(bassGuitar);
            productRepo.save(flute);
            productRepo.save(jimiHendrix);
            productRepo.save(theDoors1);
            productRepo.save(bbKing);

            orderRepo.save(order1);

            productRepo.save(guitarStock);
            productRepo.save(bassGuitarStock);
            productRepo.save(fluteStock);
            productRepo.save(jimiHendrixStock);
            productRepo.save(theDoors1Stock);
            productRepo.save(bbKingStock);

        };
    }
}
