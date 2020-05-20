package com.lockexample.DesignPattern.Struct;

/**
 * 适配器模式（Adapter）适配器模式的作用就是在原来的类上提供新功能。
 *
 * 主要可分为3种：
 *
 * 类适配：创建新类，继承源类，并实现新接口，
 * 例如class  adapter extends oldClass  implements newFunc{}
 *
 * 对象适配：创建新类持源类的实例，并实现新接口，
 * 例如class adapter implements newFunc { private oldClass oldInstance ;}
 *
 * 接口适配：创建新的抽象类实现旧接口方法。
 * 例如abstract class adapter implements oldClassFunc { void newFunc();}
 *
 */
public class Adapter {

}
