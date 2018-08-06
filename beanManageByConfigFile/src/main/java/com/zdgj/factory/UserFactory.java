/**
 * FileName: UserFactory
 * Author:   Rock_Guo
 * Date:     2018/8/6 10:09
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zdgj.factory;

import com.zdgj.bean.User;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Rock_Guo
 * @create 2018/8/6
 * @since 1.0.0
 */
public class UserFactory {

    // 静态方法
    public static User getUserInstance(){
        return new User("James");
    }

    //
    public User createUser(){
        return new User("Wade");
    }

}
