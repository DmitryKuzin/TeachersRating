package ru.kpfu.itis.teachersrating.service;

import org.springframework.web.multipart.MultipartFile;

public interface FileService {

    String saveImage(MultipartFile file);
}
