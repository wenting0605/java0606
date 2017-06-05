package ch11;

public class WorkWithPens2 {
	private IWritable writable;

	public IWritable getWritable() {
		return writable;
	}

	public void setWritable(IWritable writable) {
		this.writable = writable;
	}
	
	public void writeWithPens() {
		writable.write();
	}
}
