package com.ipartek.formacion.perrera;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.ipartek.formacion.perrera.pojo.Perro;

public class DependenciaPerreraDAOTest {

	@Test
	public void test() {

		Perro perro = null;
		assertTrue("No existe dependencia Modulo PerreraDAO", perro == null);

	}

}
