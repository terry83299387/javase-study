# javase-study：一个寓教于乐的 Java SE 自我学习和检查工具

## 项目简介

本项目可以用来帮助学习 Java SE 标准库，也可以用于检查学习成果。

项目基于 JDK 8，它具有以下特点：

1. 覆盖面广

   覆盖 JDK 中所有的常用包和类；

2. 难度适中、简单但有趣

   大多数题目都是对初学者友好的，同时也尽量兼顾趣味性，很多题目都具有实际应用的背景（可能会做一些简化）；

3. 提供完整的单元测试用例来帮助检测答案

   每个题目在设计时都兼顾了可测试性，并编写对应的测试用例。一键运行即可轻松检测答案；

4. 为每个题目提供了一套完整的参考实现

   参考实现并不是“标准答案”，仅用来在“卡壳”时为您提供思路。请尽量独自完成题目。

## 如何开始？

将项目克隆到你的本地，然后打开任何一个包中的类，你就能知道怎么做了。例如：

* [Java 语言基础中的表达式](https://github.com/terry83299387/javase-study/blob/master/src/main/java/study/javase/langbasic/Expressions.java)
* [Java 集合中的 List](https://github.com/terry83299387/javase-study/blob/master/src/main/java/study/javase/collection/Lists.java)
* ...

例如，对于 [Java 语言基础中的表达式](https://github.com/terry83299387/javase-study/blob/master/src/main/java/study/javase/langbasic/Expressions.java) 中的一个题目：

```Java
/**
 * num 是一个 int 类型的整数，请计算并返回其平方值。
 * 注：为了防止结果溢出，应以 long 型来存储结果。
 */
public long square(int num) {
	// TODO your code goes here
	return 0;
}
```

文档注释中的内容即为题目的要求（本项目的所有题目都遵照这种方式）。按照题目要求，下面是实现之后的代码：

```Java
/**
 * num 是一个 int 类型的整数，请计算并返回其平方值。
 * 注：为了防止结果溢出，应以 long 型来存储结果。
 */
public long square(int num) {
	long result = (long) num * (long) num;
	return result;
}
```

等到部分或全部题目完成后，即可运行测试来检查成果了。

## 运行测试

请按照以下步骤来运行本项目。

1. 按照要求编写代码，完成题目

2. 修改 resources 中的 config.ini

   将“test\_answers”设置为 true，以允许运行题目的测试用例。如果不希望运行参考实现的测试用例，还可将“test\_refimpl”设置为 false。

3. 运行测试用例

   以 Eclipse 为例，只需在项目上右键，然后选择“Run As” -> “JUnit Test”即可。

*注：不需要等到全部题目都完成后再运行测试用例，每完成一部分都可以运行一次，从而检查阶段性成果。有问题能够及时修改和更正。*

## 部分包简介

大部分的包所包含的内容都是一目了然的，下面仅对部分包做一下说明。

* study.javase.assist

&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 该包及其子包中的类是辅助类，供其他包使用。

* study.javase.refimpl

&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 本包及其子包是本项目中包含的题目的参考实现，供参考。

* study.javase.langbasic

&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 与 Java 语言相关的基本概念，以及常用的类和接口的使用。<b>推荐初学者先从这里开始</b>。

* study.javase.awt.dd

&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; GUI 编程中的 [Drag and Drop](https://docs.oracle.com/javase/8/docs/technotes/guides/dragndrop/index.html)。

* study.javase.awt.graphic2d

&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; GUI 编程中的 Java 2D API。

* study.javase.awt.imf

&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; GUI 编程中的 [Java Input Method Framework](https://docs.oracle.com/javase/8/docs/technotes/guides/imf/index.html)。

* study.javase.collection

&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; Java 集合框架（[Java Collections Framework](https://docs.oracle.com/javase/8/docs/technotes/guides/collections/index.html)），包括普通集合和并发集合。

* study.javase.collection.lagacy

&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; Java 早期的集合类（Vector、Hashtable 等）

* study.javase.deployment

&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 与应用部署相关的内容，目前仅包括 Web Start 应用的部署，不包括 Applet 相关内容。

* study.javase.deployment.jnlp

&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; [jnlp api](https://docs.oracle.com/javase/8/docs/jre/api/javaws/jnlp/index.html)。

* study.javase.ext_mechanism

&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; Java 扩展技术（[Java Extension Mechanism](https://docs.oracle.com/javase/8/docs/technotes/guides/extensions/index.html)）。

* study.javase.fullscreen_exclusive

&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; [全屏独占模式](https://docs.oracle.com/javase/tutorial/extra/fullscreen/index.html)（full-screen exclusive mode）的使用。

* study.javase.functional.lambda

&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; lambda 表达式和函数接口（java.util.function)、方法引用相关的知识。

* study.javase.functional.stream

&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; java.util.stream.Stream 的使用。

* study.javase.jpda

&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; [Java Platform Debugger Architecture](https://docs.oracle.com/javase/8/docs/technotes/guides/jpda/index.html)，Java 平台调试架构。

* study.javase.jvmti

&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; [JVM Tool Interface](https://docs.oracle.com/javase/8/docs/technotes/guides/jvmti/index.html)，JVM 工具接口。

* study.javase.math

&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; java.math 包的使用。

* study.javase.net.sdp

&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; Socket Direct Protocol 的使用（InfiniBand）。

* study.javase.print

&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; javax.print 包的使用。

* study.javase.references

&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; java.lang.ref 包的使用。

* study.javase.security.policy

&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; Java 安全策略的配置和使用。

* study.javase.time

&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; Java 时间和日期 API 的使用（java.time 包)。

* study.javase.time.lagacy

&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; Java 早期的时间和日期 API（Date、Calendar）。

* study.javase.tools

&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; Java 常用工具的使用。（[https://docs.oracle.com/javase/8/docs/technotes/tools/index.html](https://docs.oracle.com/javase/8/docs/technotes/tools/index.html)）

* study.javase.tools.attach

&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; [Dynamic Attach](https://docs.oracle.com/javase/8/docs/technotes/guides/attach/index.html)。

* study.javase.tools.jconsole

&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; [JConsole Accessing API](https://docs.oracle.com/javase/8/docs/technotes/guides/management/jconsole.html)。

* study.javase.util

&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; java.util 包中除集合、时间日期类之外的其他工具类。

## 如何参与项目及报告 bug

可以在线提 [PR](https://github.com/terry83299387/javase-study/pulls)、[Issues](https://github.com/terry83299387/javase-study/issues)，也可以给我发邮件：[qiaomingkui@163.com](mailto:qiaomingkui@163.com)。

另外，欢迎 star！

## 贡献者名单

[Terry Qiao](https://github.com/terry83299387)

目前仅有我一人，期待您的参与。
