# 命令模式

定义：

将一个命令封装为一个对象，从而使你可用不同的命令对客户进行参数化。

类图：

![](/Users/acer/project/design-pattern/屏幕快照 2019-01-13 13.52.03.png)

代码：

[Command.java](./code/src/Command.java)

注：

- Command封装了命令，由内部的Receiver实现。比如开灯命令和灯。
- Invoker包含Command，并调用Command的execute()和undo()
- undo()是execute()的反向操作

实例：

- 遥控器（来自《Head First设计模式》）