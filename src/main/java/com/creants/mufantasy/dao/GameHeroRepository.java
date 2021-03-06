package com.creants.mufantasy.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.creants.mufantasy.entities.GameHero;

/**
 * @author LamHM
 *
 */
@Repository
public interface GameHeroRepository extends MongoRepository<GameHero, String> {

}
