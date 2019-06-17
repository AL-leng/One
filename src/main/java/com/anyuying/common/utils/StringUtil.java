package com.anyuying.common.utils;

import java.io.UnsupportedEncodingException;

/**
 * 
 * <br>Title:字符串工具类
 * <br>Description:TODO 类功能描述
 * <br>Author:安玉莹(an_yuying_2010@163.com)
 * <br>Date:2019年6月17日
 */
public class StringUtil {
  static String[] sname = { "赵", "钱", "孙", "李", "周", "吴", "郑", "王" };

  //方法1：判断源字符串是否有值，空引号(空白字符串)也算没值 (5分)
  public static boolean hasLength(String src) {
    return null != src && src.length() > 0;
  }

  //方法2：判断源字符串是否有值，空引号(空白字符串)和空格也算没值 (5分)
  public static boolean hasText(String src) {
    return null != src && src.trim().length() > 0;
  }

  //方法3：返回参数length个中文汉字字符串，字符集必须在GB2312(相当于中文简体)范围内,例如“中呀被”(5分)
  public static String randomChineseString() throws UnsupportedEncodingException {
    String substring = "";
    // String substring2 = substring.substring(RandomUtil.random(19968, 40869));
    // if (substring2.equals(substring2.getBytes("GB2312")))
    return null;
  }

  //方法4：返回中文姓名，必须以真实姓开头，百家姓在“六、附百家姓”里，名使用1-2个随机汉字(8分)，内部调用randomChineseString()方法(3分)。返回示例：“刘呀被”、“欧阳及为”
  public static String generateChineseName() throws UnsupportedEncodingException {
    StringBuilder sb = new StringBuilder();
    StringBuilder append = sb.append(randomChineseString());
    return null;
  }
}
