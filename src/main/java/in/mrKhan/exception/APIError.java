package in.mrKhan.exception;

import java.util.Date;

import lombok.Data;

@Data
public class APIError {

	private Integer errCode;
	private String errDesc;
	private Date erroDate;
	
	public APIError(Integer errCode, String errDesc, Date erroDate) {
		super();
		this.errCode = errCode;
		this.errDesc = errDesc;
		this.erroDate = erroDate;
	}
	
	
}
