package com.lagou.edu.mvcframework.pojo;

import javax.sound.midi.MetaEventListener;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;


/**
 * 封装handler方法相关的信息
 */
public class Handler {

    private Object controller; // method.invoke(obj,)

    private Method method;

    private Pattern pattern; // spring中url是支持正则的



    private Map<String,Integer> paramIndexMapping; // 参数顺序,是为了进行参数绑定，key是参数名，value代表是第几个参数 <name,2>


    public String[] getBaseUsers() {
        return baseUsers;
    }

    public String[] getUsers() {
        return users;
    }



    public void setBaseUsers(String[] baseUsers) {
        this.baseUsers = baseUsers;
    }

    public void setUsers(String[] users) {
        this.users = users;
    }

    private String[] baseUsers;

    private String[] users;

    public Handler(Object controller, Method method, Pattern pattern,
                   String[] baseUsers,String[] users) {
        this.controller = controller;
        this.method = method;
        this.pattern = pattern;

        this.baseUsers=baseUsers;
        this.users=users;
        this.paramIndexMapping = new HashMap<>();
    }

    public Object getController() {
        return controller;
    }

    public void setController(Object controller) {
        this.controller = controller;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public Pattern getPattern() {
        return pattern;
    }

    public void setPattern(Pattern pattern) {
        this.pattern = pattern;
    }

    public Map<String, Integer> getParamIndexMapping() {
        return paramIndexMapping;
    }

    public void setParamIndexMapping(Map<String, Integer> paramIndexMapping) {
        this.paramIndexMapping = paramIndexMapping;
    }
}
