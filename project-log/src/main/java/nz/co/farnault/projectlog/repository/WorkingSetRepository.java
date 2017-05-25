package nz.co.farnault.projectlog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nz.co.farnault.projectlog.model.WorkingSet;

@Repository("workingSetRepository")
public interface WorkingSetRepository extends JpaRepository<WorkingSet, Integer> {

}