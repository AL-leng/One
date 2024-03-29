package com.anyuying.common.utils;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * \
 * <br>Title:随机数工具类(RandomUtil.java)
 * <br>Description:TODO 类功能描述
 * <br>Author:安玉莹(an_yuying_2010@163.com)
 * <br>Date:2019年6月17日
 */
public class RandomUtil {
  /*  方法1：返回min-max之间的随机整数（包含min和max值
  例如返回1-3之间的随机数，那么返回1或2或3都是正确的，返回4就不对。 (5分)*/
  public static int random(int min, int max) {
    Random ran = new Random();
    return ran.nextInt((max - min + 1) + min);
  }

  /*方法2：在最小值min与最大值max之间截取subs个不重复的随机数。
  例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，[3,5,5]则不对，因为5重复了
  应用场景：在100篇文章中随机取10篇文章，月考可能会使用到。 (8分)*/
  public static Set<Integer> subRandom(int min, int max, int subs) {
    Set<Integer> set = new HashSet<Integer>();
    while (set.size() != subs) {
      Random ran = new Random();
      set.add(ran.nextInt((max - min + 1) + min));
    }
    return set;
  }

  //方法3：返回1个1-9,a-Z之间的随机字符。 (8分)
  public static char randomCharacter() {
    String str = "123456789qwertyuiopasdfghjklzxcvbnm";
    Integer index = random(0, str.length() - 1);
    return str.charAt(index);
  }

  //方法4：返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
  public static String randomString(int length) {
    String sds = "";
    for (int i = 0; i < length; i++) {
      sds += randomCharacter();
    }
    return sds;
  }
}
