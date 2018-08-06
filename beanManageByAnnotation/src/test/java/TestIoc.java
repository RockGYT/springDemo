/**
 * FileName: TestIoc
 * Author:   Rock_Guo
 * Date:     2018/8/6 14:05
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

import com.zdhz.bean.User;
import com.zdhz.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Rock_Guo
 * @create 2018/8/6
 * @since 1.0.0
 */
public class TestIoc {

    /**
     * 注解 bean
     */
    @Test
    public void runUser(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) applicationContext.getBean("user");
        user.setName("ZhangSan");
        System.out.println(user.toString());
    }

    /**
     *  属性注入
     */
    @Test
    public void runUserService(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        User user = (User) applicationContext.getBean("user");
        user.setId("222");
        user.setName("LiSi");
        System.out.println("----------------------------------------------");
        userService.saveUser(user);
        userService.deleteUser(user);
        userService.deleteUserById(user.getId());
        System.out.println("----------------------------------------------");
    }
}
