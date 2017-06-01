package nz.co.farnault.projectlog.dto;

import java.util.Set;

public class UserDTO {

	private Long id;
	private String email;
	private String password;
	private String firstName;
	private String lastName;
	private boolean active;
	private Set<WorkoutDTO> workouts;
	private Set<RoleDTO> roles;

	public UserDTO() {
		super();
	}

	public UserDTO(Long id, String email, String password, String firstName, String lastName, boolean active,
			Set<WorkoutDTO> workouts, Set<RoleDTO> roles) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.active = active;
		this.workouts = workouts;
		this.roles = roles;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Set<WorkoutDTO> getWorkouts() {
		return workouts;
	}

	public void setWorkouts(Set<WorkoutDTO> workouts) {
		this.workouts = workouts;
	}

	public Set<RoleDTO> getRoles() {
		return roles;
	}

	public void setRoles(Set<RoleDTO> roles) {
		this.roles = roles;
	}
}
