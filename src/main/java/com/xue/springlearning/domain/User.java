package com.xue.springlearning.domain;



import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * 创建用户表
 */
@Entity  // 实体
@XmlRootElement // mediatype 转为xml
public class User  implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id  // 主键
    @GeneratedValue(strategy=GenerationType.IDENTITY) // 自增长策略
    private Long id;

    @Column(nullable = true) // 映射为字段，值不能为空
    private String name;
    @Column(nullable = true) // 映射为字段，值不能为空
    private Integer age;

    protected User() {// JPA 的规范要求无参构造函数；设为 protected 防止直接使用
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format(
                "User[id=%d, name='%s', age='%d']",
                id, name, age);
    }
}
