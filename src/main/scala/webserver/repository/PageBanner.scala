package webserver.repository

import com.fasterxml.jackson.annotation.JsonIgnore

import scala.beans.BeanProperty

@JsonIgnore
case class PageBanner(
  @BeanProperty
  id:  Long = 0L,
  @BeanProperty
  title:  String,  //轮播图标题
  @BeanProperty
  images:  String,  //图片
  @BeanProperty
  targetUri:  String,  //链接地址
  @BeanProperty
  createAt:  Int = 0,  //null
  @BeanProperty
  updateAt:  Int = 0,  //null
)