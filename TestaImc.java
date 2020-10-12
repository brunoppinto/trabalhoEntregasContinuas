package teste.imc;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestaImc {
	
	Imc i;
	
	@Before
	public void setup () {
		i  = new Imc();
		
	}
	
	
	@Test
	public void teste () {			
		Assert.assertEquals(24.930747922437675,i.CalcImc(90, 1.90),0.0);		
	}
	
	@Test
	public void teste1 () {			
		Assert.assertEquals(40.0,i.CalcImc(90, 1.50),0.0);		
	}
	
	@Test
	public void teste2 () {			
		Assert.assertEquals(33.51527338887293,i.CalcImc(105, 1.77),0.0);		
	}
	
	@Test
	public void teste3 () {			
		Assert.assertEquals(31.26369612856099,i.CalcImc(107, 1.85),0.0);		
	}
	
	@After
	public void tearDown() {
		i=null;
	}

}
