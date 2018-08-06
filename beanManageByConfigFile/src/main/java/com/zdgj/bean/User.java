/**
 * FileName: User
 * Author:   Rock_Guo
 * Date:     2018/8/6 9:44
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zdgj.bean;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Rock_Guo
 * @create 2018/8/6
 * @since 1.0.0
 */
public class User extends BaseBean {

    public User (){
        super();
    }

    public User(String name){
        super();
        this.setName(name);
    }

    public String toString(){
        return "The user's name is "+this.getName();
    }

    public void add(){
        System.out.println(" this is a add method ! ");
    }

}
