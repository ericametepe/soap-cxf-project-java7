package com.agefos.composant.rfi.repository;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import com.github.springtestdbunit.DbUnitTestExecutionListener;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:RepositoryTest-context.xml" })
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class,
		DependencyInjectionTestExecutionListener.class,
		DbUnitTestExecutionListener.class,
		TransactionalTestExecutionListener.class })
public abstract class AbstractRepository {

}
