package ru.kpfu.itis.teachersrating.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by Roman on 12.07.2017.
 */
public interface FileService {

    String saveImage(MultipartFile file);
}
