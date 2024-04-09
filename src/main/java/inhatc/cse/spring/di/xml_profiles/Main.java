package inhatc.cse.spring.di.xml_profiles;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String config = null;
        Scanner scanner = new Scanner(System.in);
        System.out.print("dev or run : ");
        String str = scanner.next();

        if (str.equals("dev")) {
            config = "dev";
        } else if(str.equals("run")) {
            config = "run";
        } else {
            System.out.println("dev or run");
            return;
        }
        scanner.close();

        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.getEnvironment().setActiveProfiles(config);
        ctx.load("ch08/profile_dev.xml", "ch08/profile_run.xml");
        ctx.refresh();

        ServerInfo serverInfo = ctx.getBean("serverInfo", ServerInfo.class);
        System.out.println("ip : " + serverInfo.getIpNum());
        System.out.println("port : " + serverInfo.getPortNum());
    }
}
