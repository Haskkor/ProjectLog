package nz.co.farnault.projectlog.mapping;

import java.util.HashSet;
import java.util.Set;

import nz.co.farnault.projectlog.dto.RoleDTO;
import nz.co.farnault.projectlog.model.Role;

public class RoleConverter {

	public static RoleDTO convert(Role role) {
		RoleDTO dto = new RoleDTO();
		dto.setId(dto.getId());
		dto.setName(dto.getName());
		dto.setUsers(UserConverter.convertUsers(role.getUsers()));
		return dto;
	}

	public static Role convert(RoleDTO dto) {
		Role role = new Role();
		role.setId(dto.getId());
		role.setName(dto.getName());
		role.setUsers(UserConverter.convertUserDTOs(dto.getUsers()));
		return role;
	}

	public static Set<RoleDTO> convertRoles(Set<Role> roles) {
		Set<RoleDTO> dtos = new HashSet<RoleDTO>();
		for (Role role : roles) {
			dtos.add(convert(role));
		}
		return dtos;
	}

	public static Set<Role> convertRoleDTOs(Set<RoleDTO> dtos) {
		Set<Role> roles = new HashSet<Role>();
		for (RoleDTO dto : dtos) {
			roles.add(convert(dto));
		}
		return roles;
	}
}
