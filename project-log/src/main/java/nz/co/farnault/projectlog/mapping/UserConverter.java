package nz.co.farnault.projectlog.mapping;

import java.util.HashSet;
import java.util.Set;

import nz.co.farnault.projectlog.dto.UserDTO;
import nz.co.farnault.projectlog.model.User;

public class UserConverter {

	public static UserDTO convert(User user) {
		UserDTO dto = new UserDTO();
		dto.setId(user.getId());
		dto.setEmail(user.getEmail());
		dto.setPassword(user.getPassword());
		dto.setFirstName(user.getFirstName());
		dto.setLastName(user.getLastName());
		dto.setActive(user.isActive());
		dto.setRoles(RoleConverter.convertRoles(user.getRoles()));
		dto.setWorkouts(WorkoutConverter.convertWorkouts(user.getWorkouts()));
		return dto;
	}

	public static User convert(UserDTO dto) {
		User user = new User();
		user.setId(dto.getId());
		user.setEmail(dto.getEmail());
		user.setPassword(dto.getPassword());
		user.setFirstName(dto.getFirstName());
		user.setLastName(dto.getLastName());
		user.setActive(dto.isActive());
		user.setRoles(RoleConverter.convertRoleDTOs(dto.getRoles()));
		user.setWorkouts(WorkoutConverter.convertWorkoutDTOs(dto.getWorkouts()));
		return user;
	}

	public static Set<UserDTO> convertUsers(Set<User> users) {
		Set<UserDTO> dtos = new HashSet<UserDTO>();
		for (User user : users) {
			dtos.add(convert(user));
		}
		return dtos;
	}

	public static Set<User> convertUserDTOs(Set<UserDTO> dtos) {
		Set<User> users = new HashSet<User>();
		for (UserDTO dto : dtos) {
			users.add(convert(dto));
		}
		return users;
	}
}
