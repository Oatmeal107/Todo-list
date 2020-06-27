package memoTest;

import memo.Add;
import memo.Complete;
import memo.Delete;

import static org.junit.jupiter.api.Assertions.*;

class Test {

    @org.junit.jupiter.api.Test
    void addTest() {
        //测试Add类中的add方法
        String[] index = prepare();
        String[] members = index[0].split("\\s+");
        //判断
        assertEquals("上学", members[0]);
        assertEquals("0", members[1]);
    }

    @org.junit.jupiter.api.Test
    void deleteTest() {
        //测试Delete类中的delete方法
        String[] index = prepare();
        index = Delete.delete(index , 1);
        index = Add.add(index, "放学");
        String[] members = index[0].split("\\s+");
        //判断
        assertEquals("放学", members[0]);
        assertEquals("0", members[1]);
    }

    @org.junit.jupiter.api.Test
    void completeTest() {
        //测试Complete类中的complete方法
        String[] index = prepare();
        index = Complete.complete(index, 1);
        String[] members = index[0].split("\\s+");
        //判断
        assertEquals("上学", members[0]);
        assertEquals("1", members[1]);
    }

    //测试开始前的准备工作
    private  static String[] prepare(){
        String[] index = new String[20];
        for(int i = 0; i<20; i++)
            index[i] = "";
        index = Add.add(index, "上学");
        return index;
    }
}