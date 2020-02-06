package com.example.mall.user.service;

import com.example.mall.user.bean.umsMember;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
     List<umsMember> getAllUser();
}
