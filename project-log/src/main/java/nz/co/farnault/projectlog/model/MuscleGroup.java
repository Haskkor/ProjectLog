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
import javax.persistence.Table;

@Entity
@Table(name = "muscle_group")
public class MuscleGroup {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "muscle_group_id")
	private int id;
	@Column(name = "name")
	private String name;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "muscle_group_exercise", joinColumns = @JoinColumn(name = "muscle_group_id"), inverseJoinColumns = @JoinColumn(name = "exercise_id"))
	private Set<Exercise> exercises;

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

	public Set<Exercise> getExercises() {
		return exercises;
	}

	public void setExercises(Set<Exercise> exercises) {
		this.exercises = exercises;
	}
}
