package nz.co.farnault.projectlog.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "working_set")
public class WorkingSet {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "working_set_id")
	private int id;
	@Column(name = "reps")
	private String reps;
	@Column(name = "weights")
	private String weights;
	@ManyToMany(mappedBy = "workingSets")
	private Set<Workout> workouts;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "exercise_id")
	private Exercise exercise;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getReps() {
		return reps;
	}

	public void setReps(String reps) {
		this.reps = reps;
	}

	public String getWeights() {
		return weights;
	}

	public void setWeights(String weights) {
		this.weights = weights;
	}

	public Set<Workout> getWorkouts() {
		return workouts;
	}

	public void setWorkouts(Set<Workout> workouts) {
		this.workouts = workouts;
	}

	public Exercise getExercise() {
		return exercise;
	}

	public void setExercise(Exercise exercise) {
		this.exercise = exercise;
	}
}