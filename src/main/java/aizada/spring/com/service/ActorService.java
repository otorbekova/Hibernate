package aizada.spring.com.service;

import aizada.spring.com.models.Actor;
import aizada.spring.com.repositories.ActorRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class ActorService {
    private final  ActorRepositories actorRepositories;

    @Autowired
    public ActorService(ActorRepositories actorRepositories) {
        this.actorRepositories = actorRepositories;
    }


    public List<Actor> findAll() {
        return actorRepositories.findAll();
    }
/*
    public Actor findOne(int id) {
        Optional<Actor> foundPerson = actorRepositories.findById(id);
        return foundPerson.orElse(null);
    }

    @Transactional
    public void save(Actor person) {
        actorRepositories.save(person);
    }

    @Transactional
    public void update(int id, Actor updatedPerson) {
        updatedPerson.setId_actor(id);
        actorRepositories.save(updatedPerson);
    }

    @Transactional
    public void delete(int id) {
        actorRepositories.deleteById(id);
    }*/
}