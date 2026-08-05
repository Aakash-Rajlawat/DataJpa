package com.aakash.repository;

import com.aakash.entity.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//@Repository(not mandetory cuz we are extending Crud repository)
public interface PlayerRepository extends CrudRepository<Player,Integer> {
}
