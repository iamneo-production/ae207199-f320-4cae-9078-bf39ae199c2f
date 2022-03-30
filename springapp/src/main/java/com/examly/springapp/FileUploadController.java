package com.examly.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.examly.springapp.FileUploadHelper;

@RestController
public class FileUploadController{
	@Autowired
	private FileUploadHelper fileUploadHelper;
	@PostMapping("/upload-file")
	public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file)
	{
		try 
		{
			if(file.isEmpty())
			{
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("must contain file");
			}
			boolean f=fileUploadHelper.uploadFile(file);
			if(f) {
				return ResponseEntity.ok("File is uploaded");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	
	
	
	return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("some thing went wrong !_Try again");
	}
}
	
	
	


	
