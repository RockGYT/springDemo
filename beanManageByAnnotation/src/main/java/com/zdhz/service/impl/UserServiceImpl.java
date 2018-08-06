/**
 * FileName: UserServiceImpl
 * Author:   Rock_Guo
 * Date:     2018/8/6 10:57
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zdhz.service.impl;

import com.zdhz.bean.User;
import com.zdhz.dao.UserDao;
import com.zdhz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 〈一句话功能简述〉<br> 
 * 〈 通过注解的方式注入属性〉
 *  例子中的两种属性注入方式，均不需要配置set方法。
 *
 * @author Rock_Guo
 * @create 2018/8/6
 * @since 1.0.0
 */

@Service(value="userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao dao;

    @Resource(name="userDao")
    private UserDao dao2;

    // 保存
    public void saveUser(User user){
        dao.save(user);
    }

    // 删除
    public void deleteUser(User user){
        dao.delete(user);
        dao.updateUserReliationByUserId(user.getId());
    }

    // 按id删除
    public void deleteUserById(String id){
        dao2.deleteUserById(id);
        dao2.updateUserReliationByUserId(id);
    }

}
