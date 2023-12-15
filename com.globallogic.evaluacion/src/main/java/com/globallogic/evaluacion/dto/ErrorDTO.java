package com.globallogic.evaluacion.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ErrorDTO {
	
	public ErrorDTO() {
		super();
		
		this.error = new ArrayList<ErrorDetailDTO>();
	}
	
	public ErrorDTO(int codigo, List<String> errors) {
		super();
		
		this.error = new ArrayList<ErrorDetailDTO>();
		this.error.add(new ErrorDetailDTO(codigo, errors));
	}
	
	public ErrorDTO(int codigo, String error) {
		super();
		
		this.error = new ArrayList<ErrorDetailDTO>();
		this.error.add(new ErrorDetailDTO(codigo, error));
	}



	private List<ErrorDetailDTO> error;


	public List<ErrorDetailDTO> getError() {
		return error;
	}


	public void setError(List<ErrorDetailDTO> errorDetail) {
		this.error = errorDetail;
	}

	public void addErrorDetail(ErrorDetailDTO errorDetail) {
		this.error.add(errorDetail);
	}
}


class ErrorDetailDTO {
	
	public ErrorDetailDTO() {
		super();
	}
	

	public ErrorDetailDTO(int codigo, String detail) {
		super();
		this.setCodigo(codigo);
		this.setDetail(detail);
		this.setTimestamp(LocalDateTime.now());
	}

	public ErrorDetailDTO(int codigo, List<String> detail) {
		super();
		this.codigo = codigo;
		if(detail != null && detail.size() > 0) this.detail = String.join("; ", detail);
		else this.detail = "";
		this.setTimestamp(LocalDateTime.now());
	}


	private LocalDateTime timestamp;
	
	private int codigo;
	
	private String detail;

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	
}