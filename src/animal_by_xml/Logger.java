package animal_by_xml;

import java.util.Date;

public class Logger {
    public void beforeSay() {
        System.out.println("【AOP 拦截 - 准备发声】当前系统时间：" + new Date());
    }

    public void afterSay() {
        System.out.println("【AOP 拦截 - 发声完毕】记录结束。\n");
    }
}
