blog
====
This is a blog system, lalala

数据库
=====

数据库用MySQL, 密码123456

安装和使用Git
=====

在Ubuntu上安装Git: sudo apt-get install git 完了.

**配置用户名和邮箱:**

> `git config --global user.email "yourmail@mail.com"` <br>
`git config --global user.name "yourname"`

**生成SSH key:**

> 若是ubuntu,打开终端,使用: <br>

`$ ssh-keygen -t rsa`
输入后，直接按三个回车就ok了，不要输入密码

将自己的公钥放到github上, setting->SSH key-> Add


获取项目代码
====
在`~/`目录下使用`$ mkdir workspace`创建workspace文件夹, `$ cd workspace`进入workspace, `$ mkdir blog`,再进入`blog/`,<br> 运行`$ git init`, 创建git仓库, 再运行`$ git remote add blog git@github.com:xhwSkhizein/blog.git`添加blog的远程连接, 再运行`$ git pull blog master`则把项目拉取到本地git仓库, 可以使用eclipse导入maven工程导入项目.

git常用命令
====
`$ git add` 添加文件到git暂存区[本地操作]<br>
`$ git commit -m 'commit message'` 提交代码到本地仓库[本地操作]<br>
`$ git pull blog master` 将远程github上的代码拉取到本地仓库[远程操作]<br>
`$ git push blog master` 将本地仓库代码推送到github上[远程操作]

<br>
其他一些命令:
`$ git status` 查看git仓库状态<br>
`$ git log --pretty=oneline` 显示版本快照记录,每条记录一行<br>

**回退操作:**
`$ git reset`回退到git仓库上个版本, 在git中,当前版本用**HEAD**表示, 也就是最新的提交, 上一个版本就是**HEAD^**,回退到上个版本也可以这样`$ git reset -- hard HEAD^`,上上个版本就是**HEAD^^**,向上10个版本可以写成**HEAD~10**<br>

**修改操作:**
当修改某个文件状态变为modified时,即已经修改但是不想提交,可以使用`$ git checkout -- filename`,已经add到了暂存区但未提交则可以使用`git reset HEAD filename`命令把暂存区的修改撤销掉<br>

**删除操作:**
删除一个文件.可以在目录中直接用系统命令`$ rm filename` 删除文件,然后在使用`$ git rm filename`将文件再git库中删除,再`$ git commit -m "delete file filename"`



