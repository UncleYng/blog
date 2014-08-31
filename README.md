blog
====
This is a blog system, lalala

数据库
=====

数据库用MySQL, 新建用户名vv, 密码123456

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
在`~/`目录下使用`$ mkdir workspace`创建workspace文件夹, `$ cd workspace`进入workspace, `$ mkdir blog`,
再进入`blog/`, 运行`$ git init`, 创建git仓库, 再运行`$ git remote add blog git@github.com:xhwSkhizein/blog.git`添加与我blog的远程连接, 再运行`$ git pull blog master`则把项目拉取到本地git仓库, 可以使用eclipse导入maven工程导入项目.

git常用命令
====
`$ git add` 添加文件到git缓冲区<br>[本地操作]
`$ git commit -m 'commit message'` 提交代码到本地仓库<br>[本地操作]
`$ git pull blog master` 将远程github上的代码拉取到本地仓库<br>[远程操作]
`$ git push blog master` 将本地仓库代码推送到github上[远程操作]
