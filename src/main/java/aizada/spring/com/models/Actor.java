package aizada.spring.com.models;

import org.hibernate.annotations.GeneratorType;
import org.springframework.context.annotation.Bean;

import javax.persistence.*;


@Entity
@Table(name="test_key")
public class Actor {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_actor;
    @Column(name = "name_test")
    private String name_actor;


    public Actor(){

    }
    public Actor(String name_actor) {
        this.name_actor = name_actor;
    }


    public int getId_actor() {
        return id_actor;
    }

    public void setId_actor(int id_actor) {
        this.id_actor = id_actor;
    }

    public String getName_actor() {
        return name_actor;
    }

    public void setName_actor(String name_actor) {
        this.name_actor = name_actor;
    }

    @Override
    public String toString(){
        return "id_actor->"+id_actor+"," +
                "name_actor->"+name_actor;
    }
}
