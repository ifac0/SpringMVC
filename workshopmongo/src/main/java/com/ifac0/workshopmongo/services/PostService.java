package com.ifac0.workshopmongo.services;

import com.ifac0.workshopmongo.domain.Post;
import com.ifac0.workshopmongo.repository.PostRepository;
import com.ifac0.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Optional<Post> findById(String id) {
       Optional<Post> user = repo.findById(id);
       if(null == user){
           throw new ObjectNotFoundException("Objeto não encontrado");
       }
       return user;
    }

    public List<Post> findByTitle(String text) {
        return repo.findByTitleContainingIgnoreCase(text);
    }
}
