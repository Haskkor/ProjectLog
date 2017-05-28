package nz.co.farnault.projectlog.dto;

import java.util.Set;

public class WorkingSetDTO {

	private int id;
	private String reps;
	private String weights;
	private Set<WorkoutDTO> workouts;
	private ExerciseDTO exercise;

	public WorkingSetDTO() {
		super();
	}

	public WorkingSetDTO(int id, String reps, String weights, Set<WorkoutDTO> workouts, ExerciseDTO exercise) {
		super();
		this.id = id;
		this.reps = reps;
		this.weights = weights;
		this.workouts = workouts;
		this.exercise = exercise;
	}

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

	public Set<WorkoutDTO> getWorkouts() {
		return workouts;
	}

	public void setWorkouts(Set<WorkoutDTO> workouts) {
		this.workouts = workouts;
	}

	public ExerciseDTO getExercise() {
		return exercise;
	}

	public void setExercise(ExerciseDTO exercise) {
		this.exercise = exercise;
	}
}
