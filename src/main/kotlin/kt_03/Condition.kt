package kt_03

import User

private const val UserNAME = "kotlin"

private const val PASSWORD = "jetbrains"


private const val ADMIN_USER = "admin"

private const val ADMIN_PASSWORD = "admin"

private const val DEBUG = 1

private const val USER = 0


fun main(args:Array<String>) {
    val mode = if(args.isNotEmpty() && args[0] == "1"){
        DEBUG
    }else{
        USER
    }
    println(mode)

    println("请输入用户名：")
    val username = readLine()
    println("请输入密码")
    val password = readLine()
    if(username == UserNAME && password == PASSWORD){
        println("登录成功")
    }else{
        println("登录失败")
    }

}