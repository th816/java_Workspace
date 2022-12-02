package com.kh.practice.file.controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.kh.chap05_assist2.model.vo.Phone;
import com.kh.practice.file.model.dao.FileDAO;

public class FileController {
	
	private FileDAO fd = new FileDAO();
	public boolean checkName(String file) {
		
		return fd.checkName(file);
		
	}
	
	public void fileSave(String file, StringBuilder sb) {
		
		fd.fileSave(file, sb.toString());
		
	
	}
	
	
	public StringBuilder fileOpen(String file) {
		
		return fd.fileOpen(file);
		
	}
	
	public void fileEdit(String file, StringBuilder sb) {
		
		fd.fileEdit(file, sb.toString());
		
	
	}
	
	
	
	

}
