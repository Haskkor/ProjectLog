package nz.co.farnault.projectlog.dto;

import java.util.Set;

public class MuscleGroupDTO {

	private int id;
	private String name;
	private Set<ExerciseDTO> exercises;

	public MuscleGroupDTO() {
		super();
	}

	public MuscleGroupDTO(int id, String name, Set<ExerciseDTO> exercises) {
		super();
		this.id = id;
		this.name = name;
		this.exercises = exercises;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<ExerciseDTO> getExercises() {
		return exercises;
	}

	public void setExercises(Set<ExerciseDTO> exercises) {
		this.exercises = exercises;
	}
}
