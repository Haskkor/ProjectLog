package nz.co.farnault.projectlog.enums;

public enum Role {
	
	ADMIN("Admin"), USER("User"), MODERATOR("Moderator");

	private String role;

	private Role(final String role) {
		this.role = role;
	}

	public String getRole() {
		return this.role;
	}

	@Override
	public String toString() {
		return this.role;
	}

	public String getName() {
		return this.name();
	}
}
