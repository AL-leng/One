package com.anyuying.common.person;

import java.io.UnsupportedEncodingException;
import java.util.Date;

import org.junit.Test;

import com.anyuying.common.entity.Person;
import com.anyuying.common.utils.RandomUtil;
import com.anyuying.common.utils.StringUtil;

/**
 * 
 * <br>Title:Person测试类
 * <br>Description:TODO 类功能描述
 * <br>Author:安玉莹(an_yuying_2010@163.com)
 * <br>Date:2019年6月17日
 */
public class PersonTest {
  @Test
  public void pt() throws UnsupportedEncodingException {
    for (int i = 0; i < 10000; i++) {
      Person ps = new Person(RandomUtil.random(1, 2000), StringUtil.getRandomChineseName(),
        RandomUtil.random(1, 120), StringUtil.randomChineseString(100), new Date());
      System.out.println(ps);
    }
  }
}
