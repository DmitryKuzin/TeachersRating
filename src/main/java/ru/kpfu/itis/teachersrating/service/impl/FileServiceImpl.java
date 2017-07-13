package ru.kpfu.itis.teachersrating.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import ru.kpfu.itis.teachersrating.service.FileService;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

@Service
public class FileServiceImpl implements FileService {

    @Override
    public String saveImage(MultipartFile file) {
        if (!file.isEmpty()) {
            try {
                byte[] bytes = file.getBytes();
                //ToDo
                File dir = new File("C:\\git/praktica/TeachersRating/target/classes/static/img");
                if (!dir.exists()) {
                    dir.mkdirs();
                }
                String newFileName = UUID.randomUUID().toString() + "."
                        + file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".") + 1);
                File serverFile = new File(dir.getAbsolutePath()
                        + File.separator + newFileName);
                BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
                stream.write(bytes);
                stream.close();

                System.out.println("Server File Location = " + serverFile.getAbsolutePath());
                return newFileName;
            } catch (IOException e) {
                System.out.println("IO_EXCEPTION!!!");
                return null;
            }
        }
        return null;
    }
}
