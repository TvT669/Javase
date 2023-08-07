import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class SmallChangeSys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String details = "----------零钱通明细----------";
        boolean loop = true;
        double money = 0;
        double balance = 0;
        Date date = null;
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy--MM--dd HH:mm");
        String note = null;
        do{
            System.out.println("\n==========零钱通==========");
            System.out.println("\t\t1 零钱通明细");
            System.out.println("\t\t2 收益入账");
            System.out.println("\t\t3 消费");
            System.out.println("\t\t4 退出");
            System.out.print("请选择（1-4）");
            int key = scanner.nextInt();
           switch (key){
               case 1:
                   System.out.println(details);
                   break;
               case 2:
                   System.out.print("收益入账");
                  money = scanner.nextDouble();
                  if(money <= 0){
                      System.out.println("请输入正确的消费");
                      break;
                  }
                  balance += money;
                  date = new Date();
                  details +="\n收益入账\t+"+money+"\t"+sdf.format(date)+"\t余额"+balance;
                   break;
               case 3:
                   System.out.println("消费金额");
                   money = scanner.nextDouble();
                   if(money <= 0 || money > balance){
                       System.out.println("消费金额应在0-"+balance);
                       break;
                   }
                   System.out.println("消费类型");
                   note = scanner.next();
                   balance -= money;
                   date = new Date();
                   details += "\n"+note+"\t-"+money+"\t"+sdf.format(date)+"\t余额"+balance;
                   break;
               case 4:
                  String choice = " ";
                  while(true){
                      System.out.println("你确定要退出了吗?y/n");
                      choice = scanner.next();
                      if("y".equals(choice)||"n".equals(choice)){
                          break;
                      }

                  }
                  if("y".equals(choice)){
                      loop = false;
                      break;

                  }

               default:
                   System.out.println("请输入正确的选项");
           }

        }while(loop);
        System.out.println("您已退出零钱通");

    }
}
