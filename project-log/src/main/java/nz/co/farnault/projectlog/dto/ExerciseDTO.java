package nz.co.farnault.projectlog.dto;

import java.util.Set;

public class ExerciseDTO {

	private Long id;
	private String name;
	private Set<MuscleGroupDTO> muscleGroups;
	private Set<WorkingSetDTO> workingSets;

	public ExerciseDTO() {
		super();
	}

	public ExerciseDTO(Long id, String name, Set<MuscleGroupDTO> muscleGroups, Set<WorkingSetDTO> workingSets) {
		super();
		this.id = id;
		this.name = name;
		this.muscleGroups = muscleGroups;
		this.workingSets = workingSets;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<MuscleGroupDTO> getMuscleGroups() {
		return muscleGroups;
	}

	public void setMuscleGroups(Set<MuscleGroupDTO> muscleGroups) {
		this.muscleGroups = muscleGroups;
	}

	public Set<WorkingSetDTO> getWorkingSets() {
		return workingSets;
	}

	public void setWorkingSets(Set<WorkingSetDTO> workingSets) {
		this.workingSets = workingSets;
	}
}
