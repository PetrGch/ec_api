package com.currency_exchange.repository;

import com.currency_exchange.model.Role;
import com.currency_exchange.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by petr on 02.06.18.
 */

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

  Optional<Role> findByName(RoleName roleName);

}
