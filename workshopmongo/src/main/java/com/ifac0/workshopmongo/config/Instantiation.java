package com.ifac0.workshopmongo.config;

import com.ifac0.workshopmongo.domain.Post;
import com.ifac0.workshopmongo.domain.User;
import com.ifac0.workshopmongo.dto.AuthorDTO;
import com.ifac0.workshopmongo.dto.CommentDTO;
import com.ifac0.workshopmongo.repository.PostRepository;
import com.ifac0.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;

    @Override
    public void run(String... args) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
        userRepository.deleteAll();
        postRepository.deleteAll();

        User maria = new User(null, "Maria Brown", "maria@gmail.com");
        User alex = new User(null, "Alex Green", "alex@gmail.com");
        User bob = new User(null, "Bob Grey", "bob@gmail.com");

        userRepository.saveAll(Arrays.asList(maria, alex, bob));

        Post post1 = new Post(null, sdf.parse("21/03/2018"),"Partiu Viagem", "Vou viajar para São Paulo, Abraços", new AuthorDTO(maria));
        Post post2 = new Post(null, sdf.parse("21/09/2022"),"Bom dia", "Acordei Feliz Hoje!",  new AuthorDTO(maria));

        CommentDTO c1 = new CommentDTO("Boa viagem", sdf.parse("25/01/2000"), new AuthorDTO(alex));

        post1.getComments().addAll(Arrays.asList(c1));

        postRepository.saveAll(Arrays.asList(post1, post2));

        maria.getPosts().addAll(Arrays.asList(post1, post2));
        userRepository.save(maria);
    }
}
