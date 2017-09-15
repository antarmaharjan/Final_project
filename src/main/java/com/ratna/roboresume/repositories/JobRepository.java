package com.ratna.roboresume.repositories;

import com.ratna.roboresume.models.Job;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface JobRepository extends CrudRepository<Job,Long> {
    Job findJobsByJobEmployerContains(String jobBit);
    ArrayList<Job> findAllByJobDescriptionContains(String descBit);
    ArrayList<Job> findAllByJobEmployerContains(String coBit);

}
