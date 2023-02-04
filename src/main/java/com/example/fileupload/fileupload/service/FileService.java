package com.example.fileupload.fileupload.service;

import com.amazonaws.services.s3.model.ObjectListing;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public interface FileService {
    public HashMap<String, Object> createFile(MultipartFile file, String directory,String user,int randomId) throws IOException;
    public boolean deleteFile(String directory,String fileName) throws IOException;
    public byte[] downloadFile(String directory,String fileName) throws IOException;
    public ObjectListing allFiles() throws IOException;
}
