/**
 * FileName: Student
 * Author:   Rock_Guo
 * Date:     2018/8/6 10:20
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
public class Student extends BaseBean{

    public Student(){}

    public Student(String name){
        this.setName(name);
    }

    @Override
    public String toString(){
        return "The student's name is "+this.getName();
    }

}
