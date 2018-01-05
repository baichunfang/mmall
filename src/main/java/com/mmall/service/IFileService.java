package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by fang on 11/17/17.
 */
public interface IFileService {

    String upload(MultipartFile file, String path);
}
