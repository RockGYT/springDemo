/**
 * FileName: TestIoc
 * Author:   Rock_Guo
 * Date:     2018/8/6 9:52
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

import com.zdgj.bean.PropertyDemo;
import com.zdgj.bean.Student;
import com.zdgj.bean.User;
import com.zdgj.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

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
     *  Bean注入
     */
    @Test
    public void runUser(){

        // 1. 加载Spring配置文件，根据创建对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 2. 得到配置创建的对象
        User user = (User) applicationContext.getBean("user");
        System.out.println(user.toString());

        User user2 = (User) applicationContext.getBean("user2");
        System.out.println(user2.toString());

        User user3 = (User) applicationContext.getBean("user3");
        System.out.println(user3.toString());
    }

    /**
     *  属性注入
     */
    @Test
    public void runStudent(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student lilei = (Student)applicationContext.getBean("lilei");
        Student hanmeimei = (Student)applicationContext.getBean("hanmeimei");
        Student weihua = (Student)applicationContext.getBean("weihua");
        System.out.println(lilei.toString());
        System.out.println(hanmeimei.toString());
        System.out.println(weihua.toString());
    }

    /**
     * 对象型的属性注入
     */
    @Test
    public void runUserService(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService userService = (UserService) applicationContext.getBean("userService");
        User user = (User) applicationContext.getBean("user");
        user.setId("111");
        user.setName("ZhangSan");
        System.out.println("---------------------------");
        userService.saveUser(user);
        System.out.println("---------------------------");
        userService.deleteUser(user);
        System.out.println("---------------------------");
        userService.deleteUserById(user.getId());
        System.out.println("---------------------------");

    }

    @Test
    public void runPropertyDemo(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        PropertyDemo pd = (PropertyDemo) context.getBean("prop");
        System.out.println("---------------------------");
        System.out.println(pd);
        System.out.println(Arrays.toString(pd.getArrs()));
        System.out.println(pd.getList());
        System.out.println(pd.getSet());
        System.out.println(pd.getMap());
        System.out.println(pd.getProperties());
        System.out.println("---------------------------");
    }


}
