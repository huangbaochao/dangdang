package base;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * @Author: Derek.huang on 2023/5/28 19:53.
 */
@RunWith(PowerMockRunner.class)
@PowerMockIgnore({"javax.management.*","javax.crypto.*","javax.script.*"})
public class ServiceMockTestBase {

    @Before
    public void setUp() {
        // 初始化测试用例类中由Mockito的注解标注的所有模拟对象
        MockitoAnnotations.initMocks(this);
    }

}
