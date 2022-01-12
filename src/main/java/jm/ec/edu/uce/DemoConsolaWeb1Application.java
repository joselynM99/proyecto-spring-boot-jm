package jm.ec.edu.uce;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jm.ec.edu.uce.service.scope.IMatriculaPrototypeService;
import jm.ec.edu.uce.service.scope.IMatriculaSingletonService;




@SpringBootApplication
public class DemoConsolaWeb1Application implements CommandLineRunner {

	private static final Logger LOG = LoggerFactory.getLogger(DemoConsolaWeb1Application.class);

	@Autowired
	private IMatriculaSingletonService obj1;

	@Autowired
	private IMatriculaSingletonService obj2;

	@Autowired
	private IMatriculaSingletonService obj3;

	// Scope Prototype
	@Autowired
	private IMatriculaPrototypeService pro1;
	
	@Autowired
	private IMatriculaPrototypeService pro2;

	public static void main(String[] args) {
		SpringApplication.run(DemoConsolaWeb1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//Singleton crea una sola instancia y cuando se modifica uno, se modifica todos los objetos		
		LOG.info("Impresion valor del objeto");
		this.obj1.establecerDato("Joselyn");
		LOG.info(this.obj1.obtenerCodigo());
		LOG.info("Obejto2");
		LOG.info(this.obj2.obtenerCodigo());
		LOG.info("Obejto3");
		LOG.info(this.obj3.obtenerCodigo());
		this.obj3.establecerDato("pepito");
		LOG.info("Objeto 1 nuevo");
		LOG.info(this.obj1.obtenerCodigo());
		
//Prototype crea instancias diferentes, obejtos distintos
		LOG.info("***********Prototype***********");
		this.pro1.establecerNombre("Juan");
		LOG.info(this.pro1.obtenerNombre());
		LOG.info("Pro 2");
		this.pro2.establecerNombre("Maria");
		LOG.info(this.pro2.obtenerNombre());
		LOG.info(this.pro1.obtenerNombre());
		
		
		
	}

}
