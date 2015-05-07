package org.unidal.maven.plugin.wizard;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({

ProjectTest.class,

WizardModelTest.class,

WebAppMojoTest.class,

JdbcMojoTest.class,

ModelMojoTest.class,

CatConfigMojoTest.class

})
public class AllTests {

}
