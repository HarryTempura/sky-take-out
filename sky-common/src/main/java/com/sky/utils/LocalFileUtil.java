package com.sky.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@Data
@AllArgsConstructor
@Slf4j
public class LocalFileUtil {

    private String root;

    /**
     * 上传文件到本地
     *
     * @param bytes
     * @param objectName
     * @return
     */
    public String upload(byte[] bytes, String objectName) {
        // 构建文件完整路径
        File file = new File(root, objectName);

        // 确保父目录存在
        File parentDir = file.getParentFile();
        if (!parentDir.exists() && !parentDir.mkdirs()) {
            log.error("无法创建目录: {}", parentDir.getAbsolutePath());
            throw new RuntimeException("目录创建失败: " + parentDir.getAbsolutePath());
        }

        // 写入文件
        try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(bytes);
            fos.flush();
        } catch (IOException e) {
            log.error("文件写入失败: {}", file.getAbsolutePath(), e);
            throw new RuntimeException("文件写入失败: " + file.getAbsolutePath(), e);
        }

        // 返回文件存储路径
        String filePath = file.getAbsolutePath();
        log.info("文件上传到: {}", filePath);
        return filePath;
    }

}
