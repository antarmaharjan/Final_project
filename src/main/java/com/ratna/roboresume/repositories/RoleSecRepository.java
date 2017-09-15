package com.ratna.roboresume.repositories;

import com.ratna.roboresume.models.RoleSec;
import org.springframework.data.repository.CrudRepository;

public interface RoleSecRepository extends CrudRepository<RoleSec,Long> {
    RoleSec findBySecRoleName(String r);
}
