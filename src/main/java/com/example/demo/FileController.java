package com.example.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileController {

	 @Autowired
	    FileService fileService;

	    @RequestMapping("/api/savefile")
	    public String addFile() throws FileNotFoundException {
	        String filePath="/Users/wubin/workspace/jackrabbit2/lib/test.txt";
	        FileInputStream fileInputStream = new FileInputStream(new File(filePath));
	        fileService.save(fileInputStream);
	        return "ok";
	    }
}
