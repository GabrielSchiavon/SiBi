/*
 * Trabalhodesenvolvido para disciplina de ISS - 2016
 */
package modelo;

import controller.EmprestimoController;
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
    /*
    @Test
    public void testCadastro() {
        System.out.println("cadastro");
        Emprestimo emprestimo = null;
        Emprestimo instance = new Emprestimo();
        instance.cadastro(emprestimo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of consulta method, of class Emprestimo.
     */
    @Test
    public void testConsulta() {
        Emprestimo emp = new Emprestimo();
        EmprestimoController controller = new EmprestimoController();
        Emprestimo emprestimo = (Emprestimo) controller.consultarEmprestimo(65536, 1, emp).get(0);
        assertEquals(917504, emprestimo.getId());
    }

    /**
     * Test of realizarDevolucao method, of class Emprestimo.
     */
    /*
    @Test
    public void testRealizarDevolucao() {
        System.out.println("realizarDevolucao");
        Emprestimo emprestimo = null;
        Emprestimo instance = new Emprestimo();
        instance.realizarDevolucao(emprestimo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
    /**
     * Test of notificar method, of class Emprestimo.
     */
/*    @Test
    public void testNotificar() {
        System.out.println("notificar");
        Emprestimo instance = new Emprestimo();
        instance.notificar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
    /**
     * Test of realizarRenovacao method, of class Emprestimo.
     */
/*    @Test
    public void testRealizarRenovacao() {
        System.out.println("realizarRenovacao");
        Emprestimo emprestimo = null;
        Emprestimo instance = new Emprestimo();
        instance.realizarRenovacao(emprestimo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/    
}
