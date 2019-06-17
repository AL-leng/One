package com.anyuying.common.entity;

import java.util.Date;

/**
 * 
 * <br>Title:TODO实体类
 * <br>Description:TODO 类功能描述
 * <br>Author:安玉莹(an_yuying_2010@163.com)
 * <br>Date:2019年6月17日
 */
public class Person {
  private int sid;

  private String sname;

  private int age;

  private String jies;

  private Date ddd;

  public int getSid() {
    return sid;
  }

  public void setSid(int sid) {
    this.sid = sid;
  }

  public String getSname() {
    return sname;
  }

  public void setSname(String sname) {
    this.sname = sname;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getJies() {
    return jies;
  }

  public void setJies(String jies) {
    this.jies = jies;
  }

  public Date getDdd() {
    return ddd;
  }

  public void setDdd(Date ddd) {
    this.ddd = ddd;
  }

  public Person(int sid, String sname, int age, String jies, Date ddd) {
    super();
    this.sid = sid;
    this.sname = sname;
    this.age = age;
    this.jies = jies;
    this.ddd = ddd;
  }

  public Person() {
    super();
    // TODO Auto-generated constructor stub
  }

  @Override
  public String toString() {
    return "Person [sid=" + sid + ", sname=" + sname + ", age=" + age + ", jies=" + jies + ", ddd=" + ddd
      + "]";
  }

}
