package com.idea.encap;

public class Account {
    public  String name;
    private double money;
    private String code;
    public Account(){

    }
    public Account(String name,double money,String code){
        this.name = name;
        this.money = money;
        this.code = code;
        this.setName(name);
        this.setMoney(money);
        this.setCode(code);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 2 && name.length() <=4){
            this.name = name;
        }
        else{
            System.out.println("请输入正确的姓名");
        }

    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        if(money > 20.0) {
            this.money = money;
        }else{
            System.out.println("余额不足");
        }
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        if(code.length() == 6) {
            this.code = code;
        }else{
            System.out.println("请输入正确的密码");
        }

    }
    public void info(){
        System.out.println("name: "+name+" code: "+code+" money: "+money);
    }
}
