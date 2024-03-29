### 一、设计模式分类

#### 创建型模型
>这些设计模式提供了一种在创建对象的同时隐藏创建逻辑的方式，而不是使用 new 运算符直接实例化对象。这使得程序在判断针对某个给定实例需要创建哪些对象时更加灵活。

#### 结构型模式
>这些设计模式关注类和对象的组合。继承的概念被用来组合接口和定义组合对象获得新功能的方式。

#### 行为型模式
>这些设计模式特别关注对象之间的通信。

#### J2EE 模式
>这些设计模式特别关注表示层。这些模式是由 Sun Java Center 鉴定的。
<br/><br/>  
  
<table>
  <tbody>
    <tr>
      <th>序号</th>
      <th>模式 &amp; 描述</th>
      <th>包括</th>
    </tr>
    <tr>
      <td>1</td>
      <td><b>创建型模式</b><br></td>
      <td>
        <ul>
          <li><a href='factory-pattern/document/工厂模式.md'>工厂模式（Factory Pattern）</a></li>
          <li><a href='singleton-pattern/document/单例模式.md'>单例模式（Singleton Pattern）</a></li>
          <li><a href='builder-pattern/document/建造者模式.md'>建造者模式（Builder Pattern）</a></li>
          <li><a href='prototype-pattern/document/原型模式.md'>原型模式（Prototype Pattern）</a></li>
        </ul>
      </td>
    </tr>
    <tr>
      <td>2</td>
      <td><b>结构型模式</b></td>
      <td>
        <ul>
          <li><a href='adapter-pattern/document/适配器模式.md'>适配器模式（Adapter Pattern）</a></li>
          <li><a href='bridge-pattern/document/桥接模式.md'>桥接模式（Bridge Pattern）</a></li>
          <li><a href='composite-pattern/document/组合模式.md'>组合模式（Composite Pattern）</a></li>
          <li><a href='decorator-pattern/document/装饰器模式.md'>装饰器模式（Decorator Pattern）</a></li>
          <li><a href='facade-pattern/document/外观模式.md'>外观模式（Facade Pattern）</a></li>
          <li><a href='flyweight-pattern/document/享元模式.md'>享元模式（Flyweight Pattern）</a></li>
          <li><a href='proxy-pattern/document/代理模式.md'>代理模式（Proxy Pattern）</a></li>
        </ul>
      </td>
    </tr>
    <tr>
      <td>3</td>
      <td><b>行为型模式</b></td>
      <td>
        <ul>
          <li><a href='chain-pattern/document/责任链模式.md'>责任链模式（Chain of Responsibility Pattern）</a></li>
          <li><a href='command-pattern/document/命令模式.md'>命令模式（Command Pattern）</a></li>
          <li><a href='interpreter-pattern/document/解释器模式.md'>解释器模式（Interpreter Pattern）</a></li>
          <li><a href='iterator-pattern/document/迭代器模式.md'>迭代器模式（Iterator Pattern）</a></li>
          <li><a href='mediator-pattern/document/中介模式.md'>中介模式（Mediator Pattern）</a></li>
          <li><a href='memento-pattern/document/备忘录模式.md'>备忘录模式（Memento Pattern）</a></li>
          <li><a href='observer-pattern/document/观察者模式.md'>观察者模式（Observer Pattern）</a></li>
          <li><a href='state-pattern/document/状态模式.md'>状态模式（State Pattern）</a></li>
          <li><a href='strategy-pattern/document/策略模式.md'>策略模式（Strategy Pattern）</a></li>
          <li><a href='template-pattern/document/模板模式.md'>模板模式（Template Pattern）</a></li>
          <li><a href='visitor-pattern/document/访问者模式.md'>访问者模式（Visitor Pattern）</a></li>
        </ul>
      </td>
    </tr>
    <tr>
      <td>4</td>
      <td><b>J2EE 模式</b></td>
      <td>
        <ul>
          <li>MVC 模式（MVC Pattern）</li>
          <li>业务代表模式（Business Delegate Pattern）</li>
          <li>组合实体模式（Composite Entity Pattern）</li>
          <li>数据访问对象模式（Data Access Object Pattern）</li>
          <li>前端控制器模式（Front Controller Pattern）</li>
          <li>拦截过滤器模式（Intercepting Filter Pattern）</li>
          <li>服务定位器模式（Service Locator Pattern）</li>
          <li>传输对象模式（Transfer Object Pattern）</li>
        </ul>
      </td>
    </tr>
  </tbody>
</table>
<br>

### 二、设计模式之间的关系 
<img src="https://www.runoob.com/wp-content/uploads/2014/08/the-relationship-between-design-patterns.jpg" width="100%">
