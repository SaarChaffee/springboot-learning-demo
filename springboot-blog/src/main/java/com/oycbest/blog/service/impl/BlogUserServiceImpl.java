package com.oycbest.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.oycbest.blog.domain.BlogUser;
import com.oycbest.blog.mapper.BlogUserMapper;
import com.oycbest.blog.service.BlogUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户表(BlogUser)表服务实现类
 *
 * @author oyc
 * @since 2020-12-16 00:02:35
 */
@Service("blogUserService")
public class BlogUserServiceImpl extends ServiceImpl<BlogUserMapper,BlogUser> implements BlogUserService {
}
