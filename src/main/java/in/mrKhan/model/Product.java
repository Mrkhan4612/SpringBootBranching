package in.mrKhan.model;

import lombok.Data;

@Data
public class Product {
	
	private Integer pid;
	
	private String pname;
	
	private Integer price;

	public Product(Integer pid, String pname, Integer price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}

	
}
