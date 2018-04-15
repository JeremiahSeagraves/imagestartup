package com.example.demo.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletContext;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.model.FileInfo;

@RestController()
@RequestMapping("/api")
public class FileUploadControlla {

	@Autowired
	private ServletContext context;

	private String nombreFotoUnica = "fotoPrueba.";

	@RequestMapping(value = "subirFoto", headers=("content-type=multipart/*"), method = RequestMethod.POST) 
	public ResponseEntity<FileInfo> upload(@RequestParam("file") MultipartFile inputFile) {
		FileInfo fileInfo = new FileInfo();
		HttpHeaders headers = new HttpHeaders();
		String extension = FilenameUtils.getExtension(inputFile.getOriginalFilename());
		nombreFotoUnica = "fotoPrueba." + extension;
		if (!inputFile.isEmpty()) {
			try {
				//String originalFilename = inputFile.getOriginalFilename();
				File destinationFile = new File(context.getRealPath("/WEB-INF"));
				if(!destinationFile.exists()){
					System.out.println("Se creó la carpeta " + destinationFile.mkdir());
				}

				destinationFile = new File(context.getRealPath("/WEB-INF/uploaded"));

				if(!destinationFile.exists()){
					System.out.println("Se creó la carpeta " + destinationFile.mkdir());
				}

				destinationFile =new File(context.getRealPath("/WEB-INF/uploaded" +File.separator + nombreFotoUnica));

				inputFile.transferTo(destinationFile);
				fileInfo.setFileName(destinationFile.getPath());
				fileInfo.setFileSize(inputFile.getSize());
				headers.add("File Uploaded Successfully - ", nombreFotoUnica);
				return new ResponseEntity<FileInfo>(fileInfo, headers, HttpStatus.OK);
			} catch (Exception e) {    
				e.printStackTrace();
				return new ResponseEntity<FileInfo>(HttpStatus.BAD_REQUEST);
			}
		}else{
			return new ResponseEntity<FileInfo>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@RequestMapping(path = "/descargarFoto", method = RequestMethod.GET)
	public ResponseEntity<InputStreamResource> download(String param) throws IOException {
		HttpHeaders headers = new HttpHeaders();
		File file = new File(context.getRealPath("/WEB-INF/uploaded/"+nombreFotoUnica));
	    InputStreamResource resource = new InputStreamResource(new FileInputStream(file));

	    return ResponseEntity.ok()
	            .headers(headers)
	            .contentLength(file.length())
	            .contentType(MediaType.parseMediaType("image/png"))
	            .body(resource);
	}

}
