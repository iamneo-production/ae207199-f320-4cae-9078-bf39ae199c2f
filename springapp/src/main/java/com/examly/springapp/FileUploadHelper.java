package com.examly.springapp;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper
{
	public final String UPLOAD_DIR="//home//coder//project//workspace//springapp//src//main//resources//static//file";
	public boolean uploadFile(MultipartFile multipartFile)
	{
		boolean f=false;
		try {
			Files.copy(multipartFile.getInputStream(),Paths.get(UPLOAD_DIR+File.separator+multipartFile.getOriginalFilename()),StandardCopyOption.REPLACE_EXISTING);
			f=true;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	
}
