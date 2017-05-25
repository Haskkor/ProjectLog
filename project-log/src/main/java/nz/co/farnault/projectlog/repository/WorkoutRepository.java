package nz.co.farnault.projectlog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nz.co.farnault.projectlog.model.Workout;

@Repository("workoutRepository")
public interface WorkoutRepository extends JpaRepository<Workout, Integer> {

}