package cn.llyong.io;

/**
 * @description:
 * @author: llyong
 * @date: 2018/9/2
 * @time: 13:56
 * @version: 1.0
 */
public class HelloController {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sayhello() {
        System.out.println("name="+name+",age="+age);
    }
}
