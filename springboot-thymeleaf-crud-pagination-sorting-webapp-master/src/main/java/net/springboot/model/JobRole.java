package net.springboot.model;

public enum JobRole {
	TEAM_LEADER("TeamLeader"), DEPARTAMENT_MANAGER("DepartamentManager"), SOFTWARE_DEVELOPER("SoftwareDeveloper"), ADMIN("Admin");
	
    private final String displayValue;
    
    private JobRole(String displayValue) {
        this.displayValue = displayValue;
    }
    
    public String getDisplayValue() {
        return displayValue;
    }
}
