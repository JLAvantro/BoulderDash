package model.DAO;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ DAOMapTest.class, DBConnectionTest.class, DBPropertiesTest.class })
public class AllTests {

}
