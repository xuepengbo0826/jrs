package com.jrs.www.controller;

import com.jrs.www.enums.BusnessExcpitonEnums;
import com.jrs.www.util.ResponseUtil;
import com.jrs.www.vo.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.List;

@RestController
@RequestMapping(value = "upload")
public class FileUploadController {

    /**
     * 单文件上传
     *
     * @param file
     * @param request
     * @return
     */
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public ResponseBody upload(@RequestParam("file") MultipartFile file, HttpServletRequest request) {
        if (!file.isEmpty()) {
            String saveFileName = file.getOriginalFilename();
            File saveFile = new File(request.getSession().getServletContext().getRealPath("/upload/") + saveFileName);
            if (!saveFile.getParentFile().exists()) {
                saveFile.getParentFile().mkdirs();
            }
            try {
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(saveFile));
                out.write(file.getBytes());
                out.flush();
                out.close();
                return ResponseUtil.ResponseUtil(BusnessExcpitonEnums.ERROR.getCode(), BusnessExcpitonEnums.ERROR.getMessage(), "上传成功！");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return ResponseUtil.ResponseUtil(BusnessExcpitonEnums.ERROR.getCode(), BusnessExcpitonEnums.ERROR.getMessage(), "上传失败！");
            } catch (IOException e) {
                e.printStackTrace();
                return ResponseUtil.ResponseUtil(BusnessExcpitonEnums.ERROR.getCode(), BusnessExcpitonEnums.ERROR.getMessage(), "上传失败！");
            }
        } else {
            return ResponseUtil.ResponseUtil(BusnessExcpitonEnums.ERROR.getCode(), BusnessExcpitonEnums.ERROR.getMessage(), "上传失败！");
        }
    }

    /**
     * 多文件上传
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "/uploadFiles", method = RequestMethod.POST)
    public ResponseBody uploadFiles(HttpServletRequest request) throws IOException {
        File savePath = new File(request.getSession().getServletContext().getRealPath("/upload/"));
        if (!savePath.exists()) {
            savePath.mkdirs();
        }
        List<MultipartFile> files = ((MultipartHttpServletRequest) request).getFiles("file");
        MultipartFile file;
        BufferedOutputStream stream = null;
        for (int i = 0; i < files.size(); ++i) {
            file = files.get(i);
            if (!file.isEmpty()) {
                try {
                    byte[] bytes = file.getBytes();
                    File saveFile = new File(savePath, file.getOriginalFilename());
                    stream = new BufferedOutputStream(new FileOutputStream(saveFile));
                    stream.write(bytes);
                    stream.close();
                } catch (Exception e) {
                    if (stream != null) {
                        stream.close();
                    }
                    return ResponseUtil.ResponseUtil(BusnessExcpitonEnums.ERROR.getCode(), BusnessExcpitonEnums.ERROR.getMessage(), "第" + i + "个文件上传错误!");
                }
            } else {
                return ResponseUtil.ResponseUtil(BusnessExcpitonEnums.ERROR.getCode(), BusnessExcpitonEnums.ERROR.getMessage(), "第" + i + "个文件为空");
            }
        }
        return ResponseUtil.ResponseUtil(BusnessExcpitonEnums.SUCCESS.getCode(), BusnessExcpitonEnums.SUCCESS.getMessage(), true);
    }
}
