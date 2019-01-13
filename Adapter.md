# 适配器模式

定义：

将一个类的接口转换成另外一个客户希望的接口。

类图：

![](/Users/acer/project/design-pattern/屏幕快照 2019-01-12 22.37.17.png)

代码：

注：

- Adaptee作为Adapter的成员
- 理论上，Adaptee也应该是接口，这样Adapter就可以适配其他实现相同接口的具体Adaptee