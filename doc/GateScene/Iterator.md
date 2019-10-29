# Iterator

**迭代器模式**是一种行为设计模式， 让你能在不暴露集合底层表现形式 （列表、 栈和树等） 的情况下遍历集合中所有的元素。

- 优点 
  1. 单一职责原则 通过将体积庞大的遍历算法代码抽取为独立的类， 你可对客户端代码和集合进行整理。
  2. 开闭原则。 你可实现新型的集合和迭代器并将其传递给现有代码， 无需修改现有代码。
  3.  你可以并行遍历同一集合， 因为每个迭代器对象都包含其自身的遍历状态。
  4.  相似的， 你可以暂停遍历并在需要时继续。
- 缺点
  1. 如果你的程序只与简单的集合进行交互， 应用该模式可能会矫枉过正。
  2.  对于某些特殊集合， 使用迭代器可能比直接遍历的效率低。

## API描述

迪士尼的管理员有时需要检查一下安检流程中现在都有哪些部件。使用迭代器封装了部件链表的遍历操作，使得调用者可以轻松地查看安检流程中的部件。

下面是类图。

![Package chainOfResponsibility](/Users/fuqijun/Downloads/image/Package chainOfResponsibility.png)

接口类 Iterator 定义了迭代器需要有的函数

迭代器实现类 SecurityCheckProcessIterator。 实现了hasNext()和next()方法，用于遍历安检流程。

SecurityCheckProcessIterator不开放构造函数，只能通过SecurityCheckProcess创建。