package nz.co.farnault.projectlog.mapping;

import java.util.HashSet;
import java.util.Set;

import nz.co.farnault.projectlog.dto.WorkoutDTO;
import nz.co.farnault.projectlog.model.Workout;

public class WorkoutConverter {

	public static WorkoutDTO convert(Workout workout) {
		WorkoutDTO dto = new WorkoutDTO();
		dto.setId(workout.getId());
		dto.setName(workout.getName());
		dto.setDate(workout.getDate());
		dto.setUser(UserConverter.convert(workout.getUser()));
		dto.setWorkingSets(WorkingSetConverter.convertWorkingSets(workout.getWorkingSets()));
		return dto;
	}

	public static Workout convert(WorkoutDTO dto) {
		Workout workout = new Workout();
		workout.setId(dto.getId());
		workout.setName(dto.getName());
		workout.setDate(dto.getDate());
		workout.setUser(UserConverter.convert(dto.getUser()));
		workout.setWorkingSets(WorkingSetConverter.convertWorkingSetDTOs(dto.getWorkingSets()));
		return workout;
	}

	public static Set<WorkoutDTO> convertWorkouts(Set<Workout> workouts) {
		Set<WorkoutDTO> dtos = new HashSet<WorkoutDTO>();
		for (Workout workout : workouts) {
			dtos.add(convert(workout));
		}
		return dtos;
	}

	public static Set<Workout> convertWorkoutDTOs(Set<WorkoutDTO> dtos) {
		Set<Workout> workouts = new HashSet<Workout>();
		for (WorkoutDTO dto : dtos) {
			workouts.add(convert(dto));
		}
		return workouts;
	}

}
