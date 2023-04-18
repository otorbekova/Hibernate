package aizada.spring.com.repositories;

import aizada.spring.com.models.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepositories extends
        JpaRepository<Actor,Integer> {
}
