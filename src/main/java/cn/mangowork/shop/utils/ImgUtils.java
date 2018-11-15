package cn.mangowork.shop.utils;

import cn.mangowork.shop.constant.EnvConstant;
import cn.mangowork.shop.backend.controller.admin.AdvController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

/**
 * @author dailiming
 * @version v1
 * 图标工具
 * @create 2018-11-13 19:47
 **/

@Component
public class ImgUtils {

    private static final Logger logger = LoggerFactory.getLogger(AdvController.class);

    /**
     * 保存图片
     * @param file
     * @return
     * @throws IOException
     */
    public static String saveImage(MultipartFile file, String storagePath) throws IOException {
        String savePath = null;
        if (file != null){
            String path = EnvConstant.BASE_PATH + storagePath;
            path = path.replaceAll("//", "/");
            File cur = new File(path);
            if (!cur.isDirectory()){
                cur.mkdirs();
            }
            String fileName = UUID.UU32() + file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf('.'));
            savePath = storagePath + fileName;
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(new File(path + fileName)));
            System.out.println(file.getName());
            out.write(file.getBytes());
            out.flush();
            out.close();
        }
        return savePath;
    }


}
