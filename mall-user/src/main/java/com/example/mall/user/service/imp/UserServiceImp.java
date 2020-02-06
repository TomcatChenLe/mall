package com.example.mall.user.service.imp;

import com.example.mall.user.bean.umsMember;
import com.example.mall.user.mapper.UserMapper;
import com.example.mall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp  implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<umsMember> getAllUser() {
        List<umsMember> umsMember=userMapper.selectAllUser();
        return umsMember;
    }
}
