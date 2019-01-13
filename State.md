# 状态模式

定义：

允许一个对象在其内部状态改变时改变它的行为。对象看起来似乎修改了它的类。

类图：

![](/Users/acer/project/design-pattern/屏幕快照 2019-01-13 11.22.57.png)

代码：

[State.java](./code/src/State.java)

注：

- Context通常包含多个State
- State通常包含Context，从而可以通过调用Context的方法改变其状态