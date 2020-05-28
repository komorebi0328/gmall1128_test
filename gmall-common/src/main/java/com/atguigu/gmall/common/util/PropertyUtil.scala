package com.atguigu.gmall.common.util

import java.util.Properties

/**
  * @author wgsForever
  * @create 2020-05-28 14:44
  */
object PropertyUtil {

  /**
    * 属性文件
    *
    * @param fileName     属性文件
    * @param propertyName 属性名
    */
  def getProperty(fileName: String, propertyName: String) = {
    // 1. 读取文件内容
    val is = PropertyUtil.getClass.getClassLoader.getResourceAsStream(fileName)
    val properties = new Properties()
    properties.load(is)
    // 2. 根据属性名得到属性值
    properties.getProperty(propertyName)
  }
}