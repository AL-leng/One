package com.anyuying.common.test;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

import com.anyuying.common.utils.RandomUtil;
import com.anyuying.common.utils.StringUtil;

/**
 * 
 * <br>Title:测试类
 * <br>Description:TODO 类功能描述
 * <br>Author:安玉莹(an_yuying_2010@163.com)
 * <br>Date:2019年6月17日
 */
public class UtilsTest {
  //01
  @Test
  public void test1() {
    System.out.println(RandomUtil.random(1, 3));
  }

  //02
  @Test
  public void test2() {
    System.out.println(RandomUtil.subRandom(1, 10, 5));
  }

  //03
  @Test
  public void test3() {
    System.out.println(RandomUtil.randomCharacter());
  }

  //04
  @Test
  public void test4() {
    System.out.println(RandomUtil.randomString(4));
  }

  //StringUtils01
  @Test
  public void StringUtils01() {
    System.out.println(StringUtil.hasLength(" "));
  }

  //StringUtils02
  @Test
  public void StringUtils02() {
    System.out.println(StringUtil.hasText(" dfsjnhk"));
  }

  //StringUtils03
  @Test
  public void StringUtils03() throws UnsupportedEncodingException {
    System.out.println(StringUtil.randomChineseString());
  }
}
