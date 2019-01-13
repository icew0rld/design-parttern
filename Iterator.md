# 迭代器模式

定义：

提供一种方法顺序访问一个聚合对象中各个元素, 而又不需暴露该对象的内部表示。

类图：

![](/Users/acer/project/design-pattern/屏幕快照 2019-01-13 15.34.47.png)

代码:

[Iterator.java](./code/src/Iterator.java)

注：

- ConcreteAggregate需要把内部实现暴露给ConcreteIterator，后者才能实现对其元素的顺序访问。通过构造函数传递，或让ConcreteIterator作为其内部类。