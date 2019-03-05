package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface ChampionRepo extends CrudRepository<Champion, Integer> {

}
