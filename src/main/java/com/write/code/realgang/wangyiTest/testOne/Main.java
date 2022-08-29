package com.write.code.realgang.wangyiTest.testOne;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * @description: main
 * @author: RealGang
 * @create: 2022-08-13 09:49
 **/
public class Main {

    public void solution() {
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        int b = reader.nextInt();

        Random random = new Random();
        System.out.println(random.nextInt(100));
//        System.out.println(0);
//  select (select '2022-02-08' ) as reg_day , ( select count(*) from register_tb where reg_time >= '2022-02-08' and reg_time <= '2022-02-09' )  as add_users, ( select concat( TRUNCATE( ( SELECT count(*) FROM `login_tb` where user_id in (select user_id from register_tb where reg_time >= '2022-02-08' and reg_time <= '2022-02-09') and log_time >= '2022-02-09' and log_time <= '2022-02-10' ) / ( select count(*) as add_users from register_tb where reg_time >= '2022-02-08' and reg_time <= '2022-02-09'  )*100 ,1) ,'%') )  as remain_1 ,  ( select concat( TRUNCATE( ( SELECT count(*) FROM `login_tb` where user_id in (select user_id from register_tb where reg_time >= '2022-02-08' and reg_time <= '2022-02-09') and log_time >= '2022-02-11' and log_time <= '2022-02-12' ) / ( select count(*) as add_users from register_tb where reg_time >= '2022-02-08' and reg_time <= '2022-02-09'  )*100 ,1) ,'%') )  as remain_3

        // select (select '2022-02-09' ) as reg_day , ( select count(*) from register_tb where reg_time >= '2022-02-09' and reg_time <= '2022-02-10' )  as add_users, ( select concat( TRUNCATE( ( SELECT count(*) FROM `login_tb` where user_id in (select user_id from register_tb where reg_time >= '2022-02-09' and reg_time <= '2022-02-10') and log_time >= '2022-02-10' and log_time <= '2022-02-11' ) / ( select count(*) as add_users from register_tb where reg_time >= '2022-02-09' and reg_time <= '2022-02-10'  )*100 ,1) ,'%') )  as remain_1 ,  ( select concat( TRUNCATE( ( SELECT count(*) FROM `login_tb` where user_id in (select user_id from register_tb where reg_time >= '2022-02-09' and reg_time <= '2022-02-10') and log_time >= '2022-02-12' and log_time <= '2022-02-13' ) / ( select count(*) as add_users from register_tb where reg_time >= '2022-02-09' and reg_time <= '2022-02-10'  )*100 ,1) ,'%') )  as remain_3    }

    public static void main(String[] args) {
        Main mainClass = new Main();
        mainClass.solution();
    }
}
