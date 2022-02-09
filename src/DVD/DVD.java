package DVD;

public class DVD {

	public String name;
	public int releaseDate;
	public String director;
	
	public 	DVD(String name,int releaseDate,String director) {
		this.name=name;
		this.releaseDate=releaseDate;
		this.director=director;
	}
	
	public String toString() {
		return this.name + ", directed by " + this.director + ", released in " + this.releaseDate;
	}
}
