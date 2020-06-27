package memo;

public class Complete {
    public static String[] complete(String[] index, int number){
        for(int i = 1; i<=20; i++){
            if(index[i-1]=="")
                break;
            if(i==number){
                String[] thing = index[i-1].split("\\s+");
                index[i-1] = thing[0]+" 1";
                break;
            }
        }
        System.out.println("事项已完成！");
        return index;
    }
}
