import com.demo.rules.CustomerManager;
import com.demo.rules.SaleDtl;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class Test {

    @org.junit.Test
    public void test(){
        System.setProperty("drools.dateformat","yyyy-MM-dd HH:mm");
        KieServices kieServices = KieServices.Factory.get();
        //获得Kie容器对象
        KieContainer kieContainer = kieServices.newKieClasspathContainer();
        //从Kie容器对象中获取会话对象
        KieSession session = kieContainer.newKieSession();

        //Fact对象，事实对象
        CustomerManager order = new CustomerManager();
        order.setName("zhangsan1");
        order.setId(1L);

        SaleDtl dtl = new SaleDtl();
        dtl.setClientManagerId(1L);
        //将Order对象插入到工作内存中
        session.insert(order);
        session.insert(dtl);


        //激活规则，由Drools框架自动进行规则匹配，如果规则匹配成功，则执行当前规则
        session.fireAllRules();

        //关闭会话
        session.dispose();
    }

}
