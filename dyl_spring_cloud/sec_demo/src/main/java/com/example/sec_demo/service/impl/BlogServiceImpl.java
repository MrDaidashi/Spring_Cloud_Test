package com.example.sec_demo.service.impl;

import com.example.sec_demo.entity.Blog;
import com.example.sec_demo.service.IBlogService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class BlogServiceImpl implements IBlogService{
    private List<Blog> list = new ArrayList<>();

    public BlogServiceImpl(){
        list.add(new Blog(1L,"spring in action","good!"));
        list.add(new Blog(2L,"spring boot in action","nice!"));
    }
    @Override
    public List<Blog> getBlogs() {
        return list;
    }

    @Override
    public void deleteBlog(long id) {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Blog blog = (Blog) iterator.next();
            if (blog.getId() == id){
                iterator.remove();
            }
        }
    }
}
