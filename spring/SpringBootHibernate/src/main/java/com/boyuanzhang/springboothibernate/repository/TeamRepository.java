package com.boyuanzhang.springboothibernate.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.boyuanzhang.springboothibernate.model.Team;
@Repository
public interface TeamRepository extends CrudRepository<Team, Long> {
    Team findByPlayers(long playerId);
}