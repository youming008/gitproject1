package com.kingking.springboot.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @ConfigurationProperties 告诉springboot将配置文件中的对应属性值，映射到这个组件类中,进行一一绑定
 *
 * prefix = "emp" 配置文件中的前缀名，配置了那个前缀就会与下面的属性一一映射
 *
 * @Component  必须使用这个标签将当前组件作为 springboot中的一个组件来使用，这样才会纳入容器管理
 *
 */
@Validated
@Component
@ConfigurationProperties(prefix="emp")
public class Emp {
    /**
     * @Value 类似于Spring框架中使用配置文件中的数据注入方式
     * <bean>
     *     <property name="lastName" value = "字面量 /#{SpEL}  spring表达式 ${key} 从配置文件中获取"></property>
     *
     * </bean>
     *
     */
//    @Value("${emp.last-name}}")
    @Email
    private String lastName;
    @Value("#{10*2}")
    private Integer age;
    @Value("90099")
    private Double salary;
    private Boolean boss;
    private Date birthday;

    private Map map;
    private List list;

    private Forte forte;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Forte getForte() {
        return forte;
    }

    public void setForte(Forte forte) {
        this.forte = forte;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", boss=" + boss +
                ", birthday=" + birthday +
                ", map=" + map +
                ", list=" + list +
                ", forte=" + forte +
                '}';
    }
}
