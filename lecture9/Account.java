public class Account {
	private int id;
	private String name;
	
	public Account (int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public boolean equals (Object obj) {
	
		boolean result = true;
		
		if ( obj == null) {
			result = false;
		} else if (this.getClass() != obj.getClass()) {
			result = false;
		} else {
			Account other = (Account) obj;
			if (this.id != other.id) {
				result = false;
			} else if (name == null && other.name != null) {
				result = false;
			} else if (name != null && !name.equals(other.name)) {
				result = false;
			}
		}
		
		return result;
		
	}
}