package nz.co.farnault.projectlog.service;

import nz.co.farnault.projectlog.model.User;

public interface UserService {

	public User findUserByEmail(String email);

	public void saveUser(User user);
}
