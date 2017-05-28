package nz.co.farnault.projectlog.dto;

import java.util.Date;
import java.util.Set;

public class WorkoutDTO {

	private int id;
	private String name;
	private Date date;
	private UserDTO user;
	private Set<WorkingSetDTO> workingSets;

	public WorkoutDTO() {
		super();
	}

	public WorkoutDTO(int id, String name, Date date, UserDTO user, Set<WorkingSetDTO> workingSets) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.user = user;
		this.workingSets = workingSets;
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}

	public Set<WorkingSetDTO> getWorkingSets() {
		return workingSets;
	}

	public void setWorkingSets(Set<WorkingSetDTO> workingSets) {
		this.workingSets = workingSets;
	}
}
