package com.devops.demo.sealed;
/**
 * 设置该类为密封类，指明继承类只能是Dog或者是Cat
 */
public abstract sealed class Animal permits Dog, Cat{

}
