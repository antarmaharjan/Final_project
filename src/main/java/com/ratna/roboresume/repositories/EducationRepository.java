package com.ratna.roboresume.repositories;

import com.ratna.roboresume.models.Education;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface EducationRepository extends CrudRepository<Education,Long>
{
    ArrayList<Education> findAllByEducationSchoolName(String e);
}
