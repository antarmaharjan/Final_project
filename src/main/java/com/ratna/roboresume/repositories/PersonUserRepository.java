package com.ratna.roboresume.repositories;

import com.ratna.roboresume.models.PersonUser;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface PersonUserRepository extends CrudRepository<PersonUser,Long>
{
    PersonUser findByUsername(String username);
    ArrayList<PersonUser> findAllByPersonFirstNameContains(String s);
    ArrayList<PersonUser> findAllByPersonLastNameContains(String s);

    ArrayList<PersonUser> findAllByEducationSetContains(String skill);
    //PersonUser findAllByPersonFirstNameContainsOrPersonLastNameContains(String nameBit);

}