package nz.co.farnault.projectlog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nz.co.farnault.projectlog.model.MuscleGroup;

@Repository("muscleGroupRepository")
public interface MuscleGroupRepository extends JpaRepository<MuscleGroup, Integer> {

}