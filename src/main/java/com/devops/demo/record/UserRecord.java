package com.devops.demo.record;
/**
 * 类似于lombok的属性只读对象
 * 只需要将属性定义在record的参数中，
 * 在UserRecord.class字节码文件中会自动添加构造函数和获取属性方法
 * 适合用来定义coordonner(x,y)
 */
public record UserRecord(Long userId, String userName) {

}
