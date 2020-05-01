package pessoal_junit_hello_world;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OlaJenkinsTest {
	
	private String resultadoEsperado = "Ola, Jenkins";

	@Test
	void test() {
		OlaJenkins instancia = new OlaJenkins();
		assertEquals (resultadoEsperado, instancia.hello());
	}

}
