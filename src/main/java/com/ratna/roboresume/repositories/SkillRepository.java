package com.ratna.roboresume.repositories;

import com.ratna.roboresume.models.Skill;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface SkillRepository extends CrudRepository<Skill,Long> {
    ArrayList<Skill> findAllBySkillNameContains(String s);
}
