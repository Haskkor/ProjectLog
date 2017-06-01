package nz.co.farnault.projectlog.dto;

import java.util.Set;

public class RoleDTO {

	private Long id;
	private String name;
	private Set<UserDTO> users;

	public RoleDTO() {
		super();
	}

	public RoleDTO(Long id, String name, Set<UserDTO> users) {
		super();
		this.id = id;
		this.name = name;
		this.users = users;
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

	public Set<UserDTO> getUsers() {
		return users;
	}

	public void setUsers(Set<UserDTO> users) {
		this.users = users;
	}
}
