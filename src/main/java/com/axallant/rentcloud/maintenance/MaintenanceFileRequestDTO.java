package com.axallant.rentcloud.maintenance;

import javax.validation.constraints.NotEmpty;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MaintenanceFileRequestDTO {


	private String fileName;
	@NotEmpty(message = "Cantegory can't be empty")
	
	private String category;
	
	private String uploadBy;
	
	private String fileType;
	
	private boolean tenantAccess;
	
	private boolean landlordAccess;
	
	private boolean deleted;
	
    private int version;
    
    @NotEmpty(message = "File should be added")
    private MultipartFile document;
}
