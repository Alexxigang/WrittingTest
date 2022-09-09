Python 列表、元组、字典、集合


1、元组tuple
（1）元组是有序列表，有不可见的下标，下标从0开始
（2）元组的数据是相对固定的，数据不能增删改，他的一个重要用途是保存固定的、安全要求高的数据
（3）元组用小括号()括起来，空元组定义时是()，一个元素的元组定义时是(1,)，在第一个元素后面加上逗号，为了和数学公式中的计算小括号区分开来
（4）元组本身不能修改，但元组中有列表时，列表数据可以修改
● 获取元组中的某个值：tuple[i]
● 获取元组区间值：tuple[i,j]
● 计算元组个数：len(tuple)
● 合并元组：tuple1+tuple2
● 返回元组中元素最大值（针对于数值类型）：max(tuple)
● 返回元组中元素最小值（针对于数值类型）：min(tuple)
● 将列表转换为元组：tuple(list)
● 删除元组：del tuple


2、列表list
列表list也是有序集合，用中括号[]括起来的数据，下标也是从0开始的，可进行增删查改操作
● 获取列表的单个值：list[i]
● 获取列表的区间值：list[i,j]
● 计算元组个数：len(list)
● 列表末尾添加元素：list.append(value)
● 删除列表末尾元素，返回删除的数据：list.pop()
● 删除指定下标的元素，返回删除的数据：list.pop(i)
● 修改列表指定下标元素的值，即重新赋值：list[i]=value
● 返回列表中元素最大值（针对于数值类型）：max(list)
● 返回列表中元素最小值（针对于数值类型）：min(list)
● 将元组转换为列表：list(tuple)

3、字典dict
字典是以键值对（key-vaule）形式存在的数据，用大括号{}括起来的数据，具有极快的查找速度。字典是无序的，支持增删查改的操作，但字典的key是不可变的。字典中的key是必须存在的，如果key不存在会抛出异常keyError。
● 获取字典中指定的key的值：dict['key']
● 更新字典中指定key的值（key存在），key不存在时新增：dict['key']=value
● 删除字典中指定key及其值：del dict['key']
● 删除字典中所有的元素：dict.clear()
● 计算字典中元素的个数：len(dict)
● 将字典转换成字符串类型：str(dict)
● 获取字典的所有key，存储在列表中：dict.keys()
● 获取字典的所有value，存储在列表中：dict.values()
● 获取字典的键值对，以元组的形式存储在列表中：dict.items()
● 判断字典中是否有指定的key，返回布尔类型：key in dict.keys()


# 定义一个元组
    test_tuple = (1, -2, 'java', 0, "接口测试", 'python', '元组你好')
    test_tuple1 = (1, 2, 3, 4, 5, 6, 7, 8, 9)
    list1 = ['java_list', 'python_list', 200, 404, '列表你好']
    dict1 = {'小狗': '汪汪汪', '小猫': '喵喵喵', '小羊': '咩咩咩', '老鼠': '吱吱吱', '老虎': '吼吼吼', '小明': '你好你好'}

    # 字典的应用
    print(dict1['小猫'])
    dict1['小鸟'] = '套缸淘帮'
    print(dict1)
    del dict1['小明']
    print(dict1)
    print('计算字典数据的个数：%d' % len(dict1))
    print("输出字典转换为字符串类型：%s" % str(dict1))
    print("输出所有的key：{0}".format(dict1.keys()))
    print("输出所有的value：{0}".format(dict1.values()))
    print("输出字典转换为元组后的数据：{0}".format(dict1.items()))


    # 列表的应用
    print("输出一个列表数据：{0}".format(list1))
    print("输出一个区间列表数据：{0}".format(list1[1:4]))
    print('计算列表数据的个数：%d' % len(list1))
    list1.append('加的值')
    print("输出增加两个值后的列表数据：{0}".format(list1))
    print("删除的末尾数值为：{0}".format(list1.pop()))   # 删除末尾数据
    print("删除的第三个数值为：{0}".format(list1.pop(2)))  # 删除下标为2的数据
    list1[0] = '新的第一个下标的值'
    print("输出新的列表数据：{0}".format(list1))
    print('将元组转为列表：{0}'.format(list(test_tuple)))
    # del list1

    # 元组的应用
    print('输出一个元组数据：{0}'.format(test_tuple))
    print('输出元组的一个值：{0}'.format(test_tuple[4]))
    print('输出元组区间第二个到第六个的值：{0}'.format(test_tuple[1:5]))
    print('计算元组的个数：%d' % len(test_tuple))
    print('合并元组后：{0}'.format(test_tuple + test_tuple1))
    print('元组的最大值：%d' % max(test_tuple1))
    print('元组的最小值：%d' % min(test_tuple1))
    print(list1)
    print('将列表转为元组：{0}'.format(tuple(list1)))
    del test_tuple
4、切片
切片是针对列表list而言的，需要知道列表的索引，列表有N个元素，正向索引是0~N-1
L(起始索引:终止索引:变化量)，其中变化量可不用写，默认为1
● 截取1~3位：L[0:2]
● 截取全部（复制列表）：L[:]
● 截取1~4位，间隔两个数进行截取：L[0:3:2]
● 截取第3个之后所有的值：L[2:]
● 截取第3个之前所有的值：L[:2]


一. 认识列表


列表（list）是什么：

序列是Python中最基本的数据结构。
在Python中，用方括号 [ ] 来表示列表，并用逗号来分隔其中的元素。并且列表的数据项（各个元素）不需要具有相同的类型。
序列中的每个元素都分配一个数字 - 它的位置，即索引，第一个索引是0，第二个索引是1，依此类推。
序列都可以进行的操作包括索引，切片，加，乘，检查成员。
此外，Python已经内置确定序列的长度以及确定最大和最小的元素的方法。
把列表当作堆栈使用。涉及的方法有：append()、pop()
访问和使用列表可以使用切片。[a:b]
把列表当作队列使用（不过使用起来较麻烦，可自行百度）。
列表可以嵌套使用。
列表复制是这样的：list2 = list1[:]
获取列表的索引值：a = list.index("String")


定义列表的示例：

list1 = ['physics', 'chemistry', 1997, 2000]
list2 = [1, 2, 3, 4, 5 ]
list3 = ["a", "b", "c", "d"]
print(list1)
print(list2)
print(list3)

运行结果：
['physics', 'chemistry', 1997, 2000]
[1, 2, 3, 4, 5]
['a', 'b', 'c', 'd']




二. 切片
切片和索引：

与字符串的索引一样，列表索引从0开始。(在字符串那个章节总结过)列表可以进行截取、组合等；
你还可以处理列表的部分元素——Python称之为切片。使用下标索引来访问列表中的值，同样你也可以使用方括号[ ]的形式截取字符； [x:y]
要创建切片，可指定要使用的第一个元素和最后一个元素的索引。与函数range() 一样，Python在到达你指定的第二个索引前面的元素后停止。要输出列表中的前三个元素，需要指定索引0~3，这将输出分别为0 、1 和2 的元素； [1:5]表示索引为1,2,3,4的四个元素
如果你没有指定第一个索引，Python将自动从列表开头开始； [ :6]
要让切片终止于列表末尾，也可使用类似的语法，即不指定第二个索引； [2: ]
无论列表多长，这种语法都能够让你输出从特定位置到列表末尾的所有元素。
如果要遍历列表的部分元素，可在for 循环中使用切片。


下面示例代码（注意“//”不代表注释，仅仅为了展示）：

list1 = ['physics', 'chemistry', 1997, 2000]
list2 = [1, 2, 3, 4, 5, 6, 7 ]

print(list1[1],list1[-2])           //类似字符串一样使用索引
print ("list1[0]: ", list1[0])      //输出第一个元素
print ("list2[1:5]: ", list2[1:5])  //输出索引为1到（5-1）的元素
print ("list2[:4]: ", list2[1:])    //前者输出从第1个元素到索引为（4-1）的元素
//后者输出索引为1到最后一个元素

运行结果：
chemistry 1997
list1[0]:  physics
list2[1:5]:  [2, 3, 4, 5]
list2[:4]:  [2, 3, 4, 5, 6, 7]




三. 更新列表
3.1 处理元素
附加参考：[列表使用大全] [Python3列表元素的修改]

1. 按索引来使用的方法

append(‘String’)： 将元素string追加到列表末尾，即把一个元素添加到堆栈顶；
pop(X)： 删除列表中任何位置的元素，只需在括号中指定要删除的元素的索引即可。若果不指定则默认删除末尾的元素；
insert(X, “String”)： 将元素String插入到索引为X的位置，原来元素从索引为X往后移；
del list[X]： 删除列表list索引为X的元素；
len(list)： 是个函数，统计列表list元素的个数，和在字符串中使用一样；
del和pop()的区别在于：del删除的元素不可以再继续使用了，但是pop()有个返回值，因为当作栈使用，它删除的元素还可以在其他地方继续使用；
reverse() ： 按元素顺序倒转；
sort() ： 是方法，对列表进行永久性排序，前提是列表中所有元素数据类型一样；
sorted() ： 注意这是个函数，对列表进行临时排序，若列表中所有元素数据类型不一样会报错；
2. 按值来使用的方法

remove(“String”)： 删除列表中值为String的元素。注意：方法remove() 只删除第一个指定的值。如果要删除的值可能在列表中出现多次，就需要使用循环来判断是否删除了所有这样的值。


下面示例代码（注意“//”不代表注释，仅仅为了展示）：

list1 = ['physics', 'chemistry', 1997, 2000]
list2 = [1, 2, 3, 4, 5, 6, 7 ]

list1.append('Adam')      //append()
print(list1)

a = list2.pop(3)          //pop()
print(a)

del list2[4]              //del
print(list2)

list2.insert(3,9)         //insert()
print(list2)

print(len(list2))         //len()

list1.remove(1997)        //remove
list1.remove("Adam")
print(list1)

运行结果：
['physics', 'chemistry', 1997, 2000, 'Adam']
4
[1, 2, 3, 5, 7]
[1, 2, 3, 9, 5, 7]
6
['physics', 'chemistry', 2000]
p = ['asp', 'php']
s = ['python', 'java','scheme']

print(s)                        //临时排序
print(sorted(s))
print(s);print('\n')

s.sort();print(s);print('\n')   //永久排序

s.reverse();print(s)            //倒序


运行结果：
['python', 'java', 'scheme']
['java', 'python', 'scheme']
['python', 'java', 'scheme']


['java', 'python', 'scheme']


['scheme', 'python', 'java']




3.2 嵌套使用列表


s = ['python', 'java', ['asp', 'php'], 'scheme']
print(len(s))

运行结果：
4


要注意s只有4个元素，其中s[2]又是一个list，如果拆开写就更容易理解了。
要拿到’php’可以写p[1]或者s[2][1]，因此s可以看成是一个二维数组，类似的还有三维、四维……数组，不过很少用到。

p = ['asp', 'php']
s = ['python', 'java', p, 'scheme']
print(s)
print(p[1])
print(s[2][1])

运行结果：
['python', 'java', ['asp', 'php'], 'scheme']
php
php




四. 列表常用的方法和函数
4.1 列表操作符
列表对 + 和 * 的操作符与字符串相似。+ 号用于组合列表，* 号用于重复列表。
如下所示：

Python表达式	结果	描述
len([1, 2, 3])	3	长度
[1, 2, 3] + [4, 5, 6]	[1, 2, 3, 4, 5, 6]	组合
[‘Hi!’] * 4	[‘Hi!’, ‘Hi!’, ‘Hi!’, ‘Hi!’]	重复
3 in [1, 2, 3]	True	元素是否存在于列表中
for x in [1, 2, 3]: print x,	1 2 3	迭代




4.2 列表函数&方法
可查阅：[Python列表函数&方法]

列表中Python包含以下函数:

序号	函数
1	cmp(list1, list2)
比较两个列表的元素
2	len(list)
列表元素个数
3	max(list)
返回列表元素最大值
4	min(list)
返回列表元素最小值
5	list(seq)
将元组转换为列表


Python包含以下方法:

序号	方法
1	list.append(obj)
在列表末尾添加新的对象
2	list.count(obj)
统计某个元素在列表中出现的次数
3	list.extend(seq)
在列表末尾一次性追加另一个序列中的多个值（用新列表扩展原来的列表）
4	list.index(obj)
从列表中找出某个值第一个匹配项的索引位置
5	list.insert(index, obj)
将对象插入列表
6	list.pop([index=-1])
移除列表中的一个元素（默认最后一个元素），并且返回该元素的值
7	list.remove(obj)
移除列表中某个值的第一个匹配项
8	list.reverse()
反向列表中元素
9	list.sort(cmp=None, key=None, reverse=False)
对原列表进行排序




五. 元组
什么是元组tuple：

Python的元组与列表类似，不同之处在于元组的元素不能修改。
元组使用小括号()，列表使用方括号[]。
元组创建很简单，只需要在括号中添加元素，并使用逗号隔开即可。
当括号中只有一个数字没有逗号时，既表示一个数字也可以便是一个元组，又可以表示数学公式中的小括号，这就产生了歧义。这种情况下，按小括号进行计算，计算结果自然是1。所以，只有1个元素的tuple定义时必须加一个逗号。


一、定义元组
tup1 = ('physics', 'chemistry', 1997, 2000)
tup2 = (1, 2, 3, 4, 5 )
tup3 = "a", "b", "c", "d"


创建空元组：tup1 = ()

元组中只包含一个元素时，需要在元素后面添加逗号。tup1 = (50,)

元组与字符串类似，下标索引从0开始，可以进行截取，组合等。



二、使用元组
元组可以使用下标索引来访问元组中的值，如下：
#!/usr/bin/python

tup1 = ('physics', 'chemistry', 1997, 2000)
tup2 = (1, 2, 3, 4, 5, 6, 7 )

print "tup1[0]: ", tup1[0]
print "tup2[1:5]: ", tup2[1:5]

以上实例输出结果：

tup1[0]:  physics
tup2[1:5]:  (2, 3, 4, 5)
元组的值不允许修改，但是可以进行运算，比如连接用加号（+），重复用星号（*）。

元组中的元素值是不允许删除的，但我们可以使用del语句来删除整个元组

#!/usr/bin/python

tup = ('physics', 'chemistry', 1997, 2000)

print tup
del tup
print "After deleting tup : "
print tup
以上实例元组被删除后，输出变量会有异常信息，输出如下所示：

('physics', 'chemistry', 1997, 2000)
After deleting tup :
Traceback (most recent call last):
File "test.py", line 9, in <module>
print tup
NameError: name 'tup' is not defined


最后来看一个“可变的”tuple：
t = ('a', 'b', ['A', 'B'])
t[2][0] = 'X'
t[2][1] = 'Y'
print(t)

运行结果：
('a', 'b', ['X', 'Y'])
这个tuple定义的时候有3个元素，分别是’a’，’b’和一个list。不是说tuple一旦定义后就不可变了吗？怎么后来又变了？
别急，我们先看看定义的时候tuple包含的3个元素：

0.png
0.png
当我们把list的元素’A’和’B’修改为’X’和’Y’后，tuple变为：

0 (1).png
0 (1).png


表面上看，tuple的元素确实变了，但其实变的不是tuple的元素，而是list的元素。tuple一开始指向的list并没有改成别的list，所以，tuple所谓的“不变”是说，tuple的每个元素，指向永远不变。即指向’a’，就不能改成指向’b’，指向一个list，就不能改成指向其他对象，但指向的这个list本身是可变的！

理解了“指向不变”后，要创建一个内容也不变的tuple怎么做？那就必须保证tuple的每一个元素本身也不能变。



三、元组运算符
与字符串一样，元组之间可以使用 + 号和 * 号进行运算。这就意味着他们可以组合和复制，运算后会生成一个新的元组。

Python表达式	结果	描述
len((1, 2, 3))	3	计算元素个数
(1, 2, 3) + (4, 5, 6)	(1, 2, 3, 4, 5, 6)	连接
(‘Hi!’,) * 4	(‘Hi!’, ‘Hi!’, ‘Hi!’, ‘Hi!’)	复制
3 in (1, 2, 3)	True	元素是否存在
for x in (1, 2, 3): print x,	1 2 3	迭代


四、元组内置函数
Python元组包含了以下内置函数

序号	函数
1	cmp(tuple1, tuple2)
比较两个元组元素。
2	len(tuple)
计算元组元素个数。
3	max(tuple)
返回元组中元素最大值。
4	min(tuple)
返回元组中元素最小值。
5	tuple(seq)
将列表转换为元组。




六. 字典
6.1 字典的定义
关于字典dict：

字典是另一种可变容器模型，且可存储任意类型对象；
字典的每个键值 key=>value 对用冒号 : 分割，每个键值对之间用逗号 , 分割，整个字典包括在花括号 {} 中；d = {key1 : value1, key2 : value2 }
键一般是唯一的，如果重复最后的一个键值对会替换前面的，值不需要唯一；
值可以取任何数据类型，但键必须是不可变的，如字符串，数字或元组；
第一个键定义为什么数据类型，后面所有的键必须定义为相同的数据类型；
访问字典里的值，把相应的键放入熟悉的方括弧即可，dict[key]


6.2 字典的修改
向字典添加新内容的方法是增加新的键/值对，修改或删除已有键/值对

一、添加键—值对、修改字典



字典是一种动态结构，可随时在其中添加键—值对。要添加键—值对，可依次指定字典名、用方括号括起的键和相关联的值。


如下示例，我们先建立一个空字典，然后向里面添加元素（键值对）并修改：
a={}
a['color']='green'
a['points']=5
print(a['color'],a['points'])

a['color']=666
print(a['color'],a['points'])

运行结果：
green 5
666 5


二、删除键—值对
能删单一的元素也能清空字典，清空只需一项操作。

删除字典可以使用del或者pop()。

要删除一个key:
用pop(key)方法，对应的value也会从dict中删除
可使用del 语句将相应的键—值对彻底删除。使用del 语句时，必须指定字典名和要删除的键。del dict['key']
删除整个字典：del dict 则dict这个字典被删除了


# -*- coding: UTF-8 -*-

dict = {'Name': 'Zara', 'Age': 7, 'Class': 'First'}

del dict['Name']  # 删除键是'Name'的条目
dict.pop('Class')

print(dict['Age'])
dict.clear()      # 清空词典所有条目
del dict          # 删除词典
print(dict['Age'])

运行结果：
7
Traceback (most recent call last):
File "1.py", line 11, in <module>
print(dict['Age'])
TypeError: 'type' object is not subscriptable


6.3 字典的遍历
一、判断字典中某个键是否存在
方法：

通过in判断key是否存在；
通过dict提供的get()方法，如果key不存在，可以返回None，或者返回自己指定的value。


# -*- coding: UTF-8 -*-

dict = {'Name': 'Zara', 'Age': 7, 'Class': 'First'}
a = 'Name' in dict
b = 'Year' in dict
print(a)
print(b)

c = dict.get('Name','如果不存在，这里是返回信息')
d = dict.get('Year','如果不存在，这里是返回信息')
print(c)
print(d)

运行结果：
True
False
Zara
如果不存在，这里是返回信息


二、遍历字典中的所有键
在不需要使用字典中的值时，方法keys() 很有用。

f = {
'jen': 'python',
'sarah': 'c',
'edward': 'ruby',
'phil': 'python',
}

for name in f.keys():
print(name.title())

运行结果：
Jen
Sarah
Edward
Phil


三、遍历字典中的所有值
如果你感兴趣的主要是字典包含的值，可使用方法values() ，它返回一个值列表，而不包含任何键。

f = {
'jen': 'python',
'sarah': 'c',
'edward': 'ruby',
'phil': 'python',
}

for g in f.values():
print(g.title())

运行结果：
Python
C
Ruby
Python


6.4 字典的各种嵌套
请自行查阅Python编程：从入门到实践 6.4



6.5 字典内置函数&方法
可查阅：[Python字典函数&方法]



一、Python字典包含了以下内置函数：
序号	函数
1	cmp(dict1, dict2)
比较两个字典元素。
2	len(dict)
计算字典元素个数，即键的总数。
3	str(dict)
输出字典可打印的字符串表示。
4	type(variable)
返回输入的变量类型，如果变量是字典就返回字典类型。


二、Python字典包含了以下内置方法：
序号	方法
1	dict.clear()
删除字典内所有元素
2	dict.copy()
返回一个字典的浅复制
3	dict.fromkeys(seq[, val])
创建一个新字典，以序列 seq 中元素做字典的键，val 为字典所有键对应的初始值
4	dict.get(key, default=None)
返回指定键的值，如果值不在字典中返回default值
5	dict.has_key(key)
如果键在字典dict里返回true，否则返回false
6	dict.items()
以列表返回可遍历的(键, 值) 元组数组
7	dict.keys()
以列表返回一个字典所有的键
8	dict.setdefault(key, default=None)
和get()类似, 但如果键不存在于字典中，将会添加键并将值设为default
9	dict.update(dict2)
把字典dict2的键/值对更新到dict里
10	dict.values()
以列表返回字典中的所有值
11	pop(key[,default])
删除字典给定键 key 所对应的值，返回值为被删除的值。key值必须给出。 否则，返回default值。
12	popitem()
随机返回并删除字典中的一对键和值。




七. 集合
集合是什么：

集合和字典类似，也是一组key的集合，但不存储value。由于key不能重复，所以，在集合中，没有重复的key；
集合可以看成数学意义上的无序和无重复元素的集合，因此，两个set可以做数学意义上的交集、并集，差等操作；
基本功能包括关系测试和消除重复元素。集合对象还支持 union（联合），intersection（交），difference（差）和 sysmmetric difference（对称差集）等数学运算；
大括号或 set() 函数可以用来创建集合。注意：想要创建空集合，你必须使用 set() 而不是 {}。后者用于创建空字典。
注意：set()只能放一个参数，它会将里面的字符串拆成字符，并且每个字符都是无序的（集合的属性）；
如果集合中包含多喝不可拆的元素，则必须用{}来定义集合。


仔细分析如下代码：

basket = {
'apple',
'orange',
'apple',
'pear',
'orange',
'banana'}

print(basket)
print('\n')

a = set('abracadabra')
b = set('alacazam')
c =set('我们')

print(a)
print(b)
print(c)

print('\n')

print(a - b)
print(a | b)
print(a & b)
print(a ^ b )

运行结果：
{'pear', 'orange', 'banana', 'apple'}


{'c', 'b', 'r', 'a', 'd'}
{'c', 'a', 'm', 'z', 'l'}
{'们', '我'}


{'r', 'd', 'b'}
{'c', 'b', 'r', 'a', 'm', 'd', 'z', 'l'}
{'a', 'c'}
{'m', 'b', 'd', 'z', 'l', 'r'}

## 栈
### stack

用列表表示，append表示push,pop直接剔除列表最后一个

队列：queue和dueue

    >>> import queue
    >>> q=queue.Queue()   # 创建队列
    >>> q.empty()   # 是否为空
    True
    >>> q.put("a")  # 放值
    >>> q.put("b")
    >>> q.qsize()   # 长度
    2
    >>> q.put("c")
    >>> q.full()    # 是否放满
    False
    >>> q.get()     # 取值
    'a'
    >>> q.get()
    'b'
    >>> q.get()//出队操作
    'c'


然后dueue：双向队列

    >>> from collections import deque
    >>> d=deque()
    # append 往右边添加一个元素
    
    >>> d.append(1)
    >>> d.append(2)
    >>> d
    deque([1, 2])
    # appendleft 往左边添加一个元素
    
        >>> d.appendleft("a")
        >>> d.appendleft("b")
        >>> d
        deque(['b', 'a', 1, 2])
    #pop 获取最右边一个元素，并在队列中删除
    
    #popleft 获取最左边一个元素，并在队列中删除
    
    >>> d
    deque(['b', 'a', 1, 2])
    >>> d.pop()
    2
    >>> d.popleft()
    'b'
    >>> d
    deque(['a', 1])
    # clear 清空队列
    
    >>> d
    deque(['a', 1])
    >>> d.clear()
    >>> d
    deque([])
    # extend 从队列右边扩展一个列表的元素
    # extendleft从队列左边扩展一个列表的元素
    
    >>> d
    deque([])
    >>> d.extend([3,4,5])
    >>> d
    deque([3, 4, 5])
    >>> d.extendleft(["a","b","c"])
    >>> d
    deque(['c', 'b', 'a', 3, 4, 5])


多行等长输出

    while True:
    try:
    l = list(map(int, input().split()))
    print(sum(l))
    except:
    break

多行不等长输出

    while True:
    try:
    l = list(map(int, input().split()))
    if len(l) != 1:
    print(sum(i))
    else:
    pass
    except:
    break

多行输入，遇00停止

    while True:
    try:
    a, b = map(int, input().split())
    if a == 0 and b == 0:
    break
    else:
    print(a+b)
    except:
    break

多行输入，遇0停止

    while True:
    try:
    l = list(map(int, input().split()))
    if l[0] == 0:
    break
    else:
    print(sum(l))
    except:
    break

先输入行数，再输入各行

    while True:
    try:
    n = int(input())
    for i in range(n):
    l = list(map(int, input().split()))
    print(sum(nums[1:]))
    except:
    break

每行第一个数为数据个数

    while True:
    try:
    l = list(map(int, input().split()))
    print(sum(l[1:]))
    except:
    break

输入为字符串型整型

    while True:
    try:
    l = list(map(int, input().strip().split()))
    print(sum(nums))
    except:
    break

首行为字符串个数，第二行为空格空开的字符串

    while True:
    try:
    n = int(input())
    l = list(map(str, input().strip().split()))
    print(" ".join(l))
    except:
    break


