/**
 * FileName: UserDao
 * Author:   Rock_Guo
 * Date:     2018/8/6 10:43
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zdgj.dao;

import com.zdgj.bean.User;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Rock_Guo
 * @create 2018/8/6
 * @since 1.0.0
 */
public class UserDao {
    public void save(User user){
        System.out.println(" Save user "+user.getName()+" into DB ! ");
    }

    public void delete(User user){
        System.out.println(" Delete user "+user.getName() + " from DB ! ");
    }

    public void deleteUserById(String id){
        System.out.println(" delete from t_user where id = "+id);
    }

    public void updateUserReliationByUserId(String userId){
        System.out.println(" delete anything that relate to the user which id is "+userId);
    }
}
