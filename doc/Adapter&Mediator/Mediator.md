## Mediator

​	中介者模式能减少对象之间混乱无序的依赖关系，该模式会限制对象之间的直接交互，迫使它们通过一个中介者对象进行合作。

* **优点**：降低了对象之间的耦合性，使得对象易于独立地被复用。
* **缺点**：将对象间的一对多关联转变为一对一的关联，提高系统的灵活性，使得系统易于维护和扩展。

### 1. API描述

​	Mediator场景为：迪士尼吸引了众多游客前来体验丰富的游乐项目，尤其是节假日期间，场面异常火爆。为了避免孩子与家长走散所带来的麻烦，迪士尼设立了走失儿童认领处，如果发现自己和亲人失散，儿童和家长均可向其求助，为其尽快联系上家属。

​	Colleague：为每个ConcreteColleague提供与Mediator交互的接口。

​	ColleagueBase：每个Colleague的抽象基类。关键方法如下：

| 方法名                                           | 作用                                   |
| ------------------------------------------------ | -------------------------------------- |
| getCount()                                       | Mediator获取访问走失儿童认领处次数     |
| setCount(int count)                              | 计数，Mediator更新Colleague访问次数    |
| setMediator(Mediator mediator)                   | 设置Mediator                           |
| setColleagueState(ColleagueState colleagueState) | 设置聚散状态                           |
| getColleagueState()                              | 获取聚散状态                           |
| getMyName()                                      | 获取自己的姓名                         |
| getFamilyName()                                  | 获取家人姓名                           |
| seekHelp()                                       | 通过mediator，向BabyCareCenter寻求帮助 |
| printResult()                                    | 根据不同状态输出结果                   |

​	Baby：家长走失的孩子，在该设计模式中扮演(ConcreteColleague)角色，是ColleagueBase的具体实现。

​	Parent：与孩子失散的家长，在该设计模式中扮演(ConcreteColleague)角色，是ColleagueBase的具体实现。

​	ColleagueState：枚举类，用于表示孩子与家长的聚散状态（separation和reunion）。

​	Mediator：中介者接口，交由BabyCareCenter实现。

​	BabyCareCenter：走失儿童认领处，是Mediator类的具体实现。在该设计模式中扮演(ConcreteMediator)角色。关键方法如下：

| 方法名                                                  | 作用                                                         |
| ------------------------------------------------------- | ------------------------------------------------------------ |
| register(Colleague colleague)                           | 登记Colleague，为每个Colleague提供Mediator                   |
| cancellation(Colleague colleague, Colleague colleague1) | 在家长与其失散的孩子团聚后调用此方法，将家长及其孩子的状态设置为REUNION |
| offerHelp(Colleague colleague)                          | 为每个需要寻找其亲人的Colleague提供帮助                      |

### 2. class diagram

![](Mediator.assets/mediator.jpg)