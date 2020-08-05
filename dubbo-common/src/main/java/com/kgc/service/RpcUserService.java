package com.kgc.service;
import com.kgc.pojo.User;
import java.util.List;
//服务
public interface RpcUserService {
    public List<User> getAllUser(Integer deptId);
}
