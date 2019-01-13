# 桥接模式

 将抽象部分与它的实现部分分离,使它们都可以独立地变化。

类图：

![](屏幕快照_2019-01-13_17.06.35.png)

注：

- RefinedAbstraction中如果有新增的方法，其只能调用Abstraction中的方法，不能调用Implementor的方法。