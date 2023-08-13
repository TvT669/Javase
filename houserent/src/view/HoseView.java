package view;

import domain.House;
import service.HouseService;
import utils.Utility;

public class HoseView {
    private char key = ' ';
    private boolean loop = true;
    private HouseService houseService = new HouseService(1);
    public void modify(){
        System.out.println("--------------------修改房屋--------------------");
        System.out.println("请输入要修改的编号");
        int seaId = Utility.readInt();
        House house = houseService.search(seaId);
        if(house == null){
            System.out.println("--------------------修改房屋编号不存在--------------------");
            return;
        }
        System.out.println("请输入要修改的内容");
        System.out.print("姓名（"+house.getName()+"）");
        String name = Utility.readString(8, "");
        if(!"".equals(name)) {
            house.setName(name);
        }
        System.out.print("电话（"+house.getPhone()+"）");
        String phone = Utility.readString(10, "");
        if(!"".equals(phone)) {
            house.setPhone(phone);
        }
        System.out.print("地址（"+house.getAddress()+"）");
        String address = Utility.readString(10,"");
        if(!"".equals(address)) {
            house.setAddress(address);
        }
        System.out.print("月租（"+house.getRent()+"）");
        int rent = Utility.readInt(-1);
        if(rent!=-1) {
            house.setRent(rent);
        }
        System.out.print("状态（"+house.getState()+"）");
        String state = Utility.readString(16, "");
        if(!"".equals(state)) {
            house.setState(state);
        }
        System.out.println("--------------------修改完成--------------------");


    }
    public void seaHouse(){
        System.out.println("--------------------查找房屋--------------------");
        System.out.println("请输入要查找的编号");
        int seaId = Utility.readInt();
        House house = houseService.search(seaId);
        if(house != null){
            System.out.println(house);
            System.out.println("--------------------查找房屋结束--------------------");
        }else{
            System.out.println("--------------------查找房屋编号不存在--------------------");
        }

    }
    public void exit(){
        char c = Utility.readConfirmSelection();
        if(c == 'Y'){
            loop = false;
            System.out.println("您已退出");
        }

    }
    public void delHouse(){
        System.out.println("--------------------删除房屋--------------------");
        System.out.println("请选择待删除房屋编号");
        int delId = Utility.readInt();
        if(delId == -1){
            System.out.println("您已放弃删除");
            return;
        }
        char choice = Utility.readConfirmSelection();
        if(choice == 'Y'){
            if(houseService.del(delId)) {
                System.out.println("--------------------删除房屋成功--------------------");
            }
            else{
                System.out.println("--------------------删除房屋标号不存在--------------------");
            }
        }else{
            System.out.println("您已放弃删除");
        }

    }
    public void addHouse(){
        System.out.println("--------------------添加房屋--------------------");
        System.out.print("姓名");
        String name = Utility.readString(8);
        System.out.print("电话");
        String phone = Utility.readString(10);
        System.out.print("地址");
        String address = Utility.readString(10);
        System.out.print("月租");
        int rent = Utility.readInt();
        System.out.print("状态（未出租/已出租）");
        String state = Utility.readString(16);
        House newhouse = new House(0, name, phone, address, rent, state);
        if(houseService.add(newhouse)){
            System.out.println("--------------------添加完成--------------------");
        }else {
            System.out.println("--------------------添加失败--------------------");
        }


    }
    public void HouseList(){
        System.out.println("--------------------房屋列表--------------------");
        System.out.println("\t编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态（已出租/未出租）");
        House[]houses = houseService.list();
        for (int i = 0; i < houses.length ; i++) {
            if(houses[i]==null){
                break;
            }System.out.println(houses[i]);
        }
        System.out.println("--------------------房屋列表完成--------------------");
    }

    public void mainMeau(){
        do{
            System.out.println("----------房屋出租系统----------");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 源");
            System.out.println("\t\t\t3 删 除 房 源");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t6 退       出");
            System.out.println("请输入你的选择（1-6）");
            key = Utility.readChar();
            switch(key){
                case'1':
                   addHouse();
                    break;
                case'2':
                  seaHouse();
                    break;
                case'3':
                   delHouse();
                    break;
                case'4':
                    modify();
                    break;
                case'5':
                    HouseList();
                    break;
                case'6':
                  exit();
                    break;
                default:
                    System.out.println("请输入正确的选择");
            }
        }while(loop);


    }
}
