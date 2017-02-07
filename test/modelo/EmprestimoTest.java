/*
 * Trabalhodesenvolvido para disciplina de ISS - 2016
 */
package modelo;

import controller.EmprestimoController;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gabriel
 */
public class EmprestimoTest {
    private Emprestimo emprestimo;
    
    public EmprestimoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        this.emprestimo = new Emprestimo();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of cadastro method, of class Emprestimo.
     */
    @Test
    public void testCadastro() {
        EmprestimoController controller = new EmprestimoController();
        
        Calendar dataDevolucao = Calendar.getInstance();
        Calendar dataEmprestimo = Calendar.getInstance();
        dataDevolucao.add(Calendar.DAY_OF_MONTH, 7);
        
        emprestimo.setId(1);
        emprestimo.setDataDevolucao(dataDevolucao.getTime());
        emprestimo.setDataEmprestimo(dataEmprestimo.getTime());
        emprestimo.setEstado(true);
        emprestimo.setIdMaterial(65536);
        emprestimo.setIdUsuario(1);
        emprestimo.setTipoMaterial(0);
        controller.emprestimoCadastro(emprestimo);
    }

    /**
     * Test of consulta method, of class Emprestimo.
     */
    @Test
    public void testConsulta() {
        Emprestimo emp = new Emprestimo();
        EmprestimoController controller = new EmprestimoController();
        List<Emprestimo> lista = controller.consultarEmprestimo(65536, 1, emp);
        Emprestimo emprestimo = lista.get(0);
        assertEquals(917504, emprestimo.getId());
    } 
}
