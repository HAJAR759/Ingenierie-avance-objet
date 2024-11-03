package adapter_pattern;

public class InternalData {
	
    private String fullName;
    private int yearsOld;

    public InternalData(String fullName, int yearsOld) {
    	
        this.fullName = fullName;
        this.yearsOld = yearsOld;
    }

    public String getFullName() {
        return fullName;
    }

    public int getYearsOld() {
        return yearsOld;
    }
}
