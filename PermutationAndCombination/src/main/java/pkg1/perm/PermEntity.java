package pkg1.perm;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class PermEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String ipword;
	private String permutation;
	
	public PermEntity(int id, String ipword, String permutation) {
		super();
		this.id = id;
		this.ipword = ipword;
		this.permutation = permutation;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIpword() {
		return ipword;
	}
	public void setIpword(String ipword) {
		this.ipword = ipword;
	}
	public String getPermutation() {
		return permutation;
	}
	public void setPermutation(String permutation) {
		this.permutation = permutation;
	}

}
