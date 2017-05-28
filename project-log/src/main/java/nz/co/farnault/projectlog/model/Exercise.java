package nz.co.farnault.projectlog.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "exercise")
public class Exercise {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "exercise_id")
	private int id;
	@Column(name = "name")
	private String name;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "muscle_group_exercise", joinColumns = @JoinColumn(name = "exercise_id"), inverseJoinColumns = @JoinColumn(name = "muscle_group_id"))
	private Set<MuscleGroup> muscleGroups;
	@OneToMany(mappedBy = "exercise")
	@Transient
	private Set<WorkingSet> workingSets;

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

	public Set<MuscleGroup> getMuscleGroups() {
		return muscleGroups;
	}

	public void setMuscleGroups(Set<MuscleGroup> muscleGroups) {
		this.muscleGroups = muscleGroups;
	}

	// public Set<WorkingSet> getWorkingSets() {
	// return workingSets;
	// }
	//
	// public void setWorkingSets(Set<WorkingSet> workingSets) {
	// this.workingSets = workingSets;
	// }
}
