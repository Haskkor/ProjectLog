package nz.co.farnault.projectlog.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "workout")
public class Workout {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "workout_id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "date_workout")
	private Date date;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", foreignKey = @ForeignKey(name = "workout_app_user_fkey"))
	private User user;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "workout_working_set", joinColumns = @JoinColumn(name = "workout_id"), inverseJoinColumns = @JoinColumn(name = "working_set_id"), foreignKey = @ForeignKey(name = "workout_working_set_fkey"), inverseForeignKey = @ForeignKey(name = "working_set_workout_fkey"))
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Set<WorkingSet> getWorkingSets() {
		return workingSets;
	}

	public void setWorkingSets(Set<WorkingSet> workingSets) {
		this.workingSets = workingSets;
	}
}
