package cn.bclearn.mitopoolweb.controller;

import cn.bclearn.mitopoolweb.dao.entity.*;
import cn.bclearn.mitopoolweb.dao.repository.PictureRepository;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.util.JSONPObject;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

@RestController
public class PicController {
    @Autowired
    private PictureRepository pictureRepository;
    @RequestMapping("/getpic")
    public List<Picture> getPic(){
        List ids= Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
        return (List<Picture>) pictureRepository.findAllById(ids);
    }

    @RequestMapping("/getData{page}")
    @ResponseBody
    public String getData(@PathVariable Integer page){
        Result result = new Result();
        Data data = new Data();
        List<Blog> blogs=new ArrayList<>();
        for(int i=1;i<11;i++) {
            Blog blog=new Blog();
            blog.setMsg("1、 洋葱切丝、葱切小段；2、 锅中放油，稍稍多一些，虾入油锅炸；");
            Resource resource = new ClassPathResource("static/img/index/0"+i+".jpeg");
            File picture = null;
            BufferedImage sourceImg = null;
            try {
                picture = resource.getFile();
                sourceImg = ImageIO.read(new FileInputStream(picture));
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("page:"+page);
            blog.setIsrc("img/index/0"+i+".jpeg");
            blog.setIht(sourceImg.getHeight()*200/sourceImg.getWidth());
            blogs.add(blog);
        }
        data.setBlogs(blogs);
        data.setHas_next(true);
        data.setHasrp(true);
        data.setNopth(false);
        data.setPgsource("_");
        result.setData(data);
        result.setSuccess(true);
        return JSONObject.fromObject(result).toString();
    }
}
