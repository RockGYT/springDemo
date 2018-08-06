/**
 * FileName: UserBiz
 * Author:   Rock_Guo
 * Date:     2018/8/6 10:47
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zdgj.biz;

import com.zdgj.bean.User;
import com.zdgj.dao.UserDao;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Rock_Guo
 * @create 2018/8/6
 * @since 1.0.0
 */
public class UserBiz {

    private UserDao dao;

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
        dao.deleteUserById(id);
        dao.updateUserReliationByUserId(id);
    }




    public UserDao getDao() {
        return dao;
    }

    public void setDao(UserDao dao) {
        this.dao = dao;
    }
}
