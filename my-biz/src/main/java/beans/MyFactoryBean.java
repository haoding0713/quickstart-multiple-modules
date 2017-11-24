package beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

import javax.sql.ConnectionPoolDataSource;


/**
 * If you have complex initialization code that is better expressed in Java as opposed to a (potentially) verbose amount of XML,
 * you can create your own FactoryBean, write the complex initialization inside that class,
 * and then plug your custom FactoryBean into the container.
 *
 * A hypothetical ConnectionPool Factory Bean.
 */
public class MyFactoryBean implements FactoryBean<ConnectionPoolDataSource>, InitializingBean, DisposableBean {

    private ConnectionPoolDataSource connectionPoolDataSource;

    @Override
    public ConnectionPoolDataSource getObject() throws Exception {
        return this.connectionPoolDataSource;
    }

    @Override
    public Class<?> getObjectType() {
        return ConnectionPoolDataSource.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        // Complex initialization code
    }

    @Override
    public void destroy() throws Exception {
        // Shutdown connectionPoolDataSource
    }
}
