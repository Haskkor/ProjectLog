package nz.co.farnault.projectlog.model;

@Entity
@Table(name = "set")
public class Set {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "set_id")
	private int id;
	@Column(name = "reps")
	private String reps;
	@Column(name = "weights")
	private String weights;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "workout", joinColumns = @JoinColumn(name = "set_id"), inverseJoinColumns = @JoinColumn(name = "workout_id"))
	private Set<Workout> workouts;

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
}