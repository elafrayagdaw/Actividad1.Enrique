import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.Test;

class CalcularPeriodoTest {

	@Test
	void testCalcularPeriodo() {
		CalcularPeriodo c = new CalcularPeriodo();
		LocalDate fecha = LocalDate.of(2021, Month.MAY, 24);
		c.calcularPeriodo("Enrique,Actividad", fecha);
	}

}
