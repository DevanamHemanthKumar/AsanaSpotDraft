package com.Asana.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Asana.model.AsanaTasks;

public interface AsanaRepository extends JpaRepository<AsanaTasks, Long>{

}
