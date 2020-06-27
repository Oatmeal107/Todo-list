package memo;

public class Glance {
    public static void glance(String[] index){
        if(index[0]==""){
            System.out.println("无待办事项!");
            return;
        }
        System.out.println("序号\t事项\t\t\t是否完成");
        String complete = "未完成";
        for(int i = 1; i<=20; i++){
            if(index[i-1] == "")
                break;
            String[] thing = index[i-1].split("\\s+");
            if(thing[1].toCharArray()[0] == 49)
                complete = "已完成";
            System.out.println(i +"\t"+ thing[0]+"\t\t\t" + complete);
            complete = "未完成";
        }
        return;
    }
}
