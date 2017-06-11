package com.hsj.tool;

import android.text.TextUtils;

/**
 * @Author:HSJ
 * @E-mail:mr.ajun@foxmail.com
 * @Date:2017/5/27 16:41
 * @Class:BaseTool
 * @Description:基本工具类
 */
public class BaseTool {

    public boolean isEmpty(String str){
        return TextUtils.isEmpty(str);
    }

    public String setText(String str){
        if(TextUtils.isEmpty(str))return "";
        return str;
    }

}