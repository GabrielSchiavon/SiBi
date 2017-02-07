/*
 * Trabalhodesenvolvido para disciplina de ISS - 2016
 */
package modelo;

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
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Emprestimo.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Emprestimo instance = new Emprestimo();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Emprestimo.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Emprestimo instance = new Emprestimo();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataEmprestimo method, of class Emprestimo.
     */
    @Test
    public void testGetDataEmprestimo() {
        System.out.println("getDataEmprestimo");
        Emprestimo instance = new Emprestimo();
        Date expResult = null;
        Date result = instance.getDataEmprestimo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataEmprestimo method, of class Emprestimo.
     */
    @Test
    public void testSetDataEmprestimo() {
        System.out.println("setDataEmprestimo");
        Date dataEmprestimo = null;
        Emprestimo instance = new Emprestimo();
        instance.setDataEmprestimo(dataEmprestimo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataDevolucao method, of class Emprestimo.
     */
    @Test
    public void testGetDataDevolucao() {
        System.out.println("getDataDevolucao");
        Emprestimo instance = new Emprestimo();
        Date expResult = null;
        Date result = instance.getDataDevolucao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataDevolucao method, of class Emprestimo.
     */
    @Test
    public void testSetDataDevolucao() {
        System.out.println("setDataDevolucao");
        Date dataDevolucao = null;
        Emprestimo instance = new Emprestimo();
        instance.setDataDevolucao(dataDevolucao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEstado method, of class Emprestimo.
     */
    @Test
    public void testIsEstado() {
        System.out.println("isEstado");
        Emprestimo instance = new Emprestimo();
        boolean expResult = false;
        boolean result = instance.isEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class Emprestimo.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        boolean estado = false;
        Emprestimo instance = new Emprestimo();
        instance.setEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdMaterial method, of class Emprestimo.
     */
    @Test
    public void testGetIdMaterial() {
        System.out.println("getIdMaterial");
        Emprestimo instance = new Emprestimo();
        int expResult = 0;
        int result = instance.getIdMaterial();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdMaterial method, of class Emprestimo.
     */
    @Test
    public void testSetIdMaterial() {
        System.out.println("setIdMaterial");
        int idMaterial = 0;
        Emprestimo instance = new Emprestimo();
        instance.setIdMaterial(idMaterial);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoMaterial method, of class Emprestimo.
     */
    @Test
    public void testGetTipoMaterial() {
        System.out.println("getTipoMaterial");
        Emprestimo instance = new Emprestimo();
        int expResult = 0;
        int result = instance.getTipoMaterial();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipoMaterial method, of class Emprestimo.
     */
    @Test
    public void testSetTipoMaterial() {
        System.out.println("setTipoMaterial");
        int tipoMaterial = 0;
        Emprestimo instance = new Emprestimo();
        instance.setTipoMaterial(tipoMaterial);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdUsuario method, of class Emprestimo.
     */
    @Test
    public void testGetIdUsuario() {
        System.out.println("getIdUsuario");
        Emprestimo instance = new Emprestimo();
        int expResult = 0;
        int result = instance.getIdUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdUsuario method, of class Emprestimo.
     */
    @Test
    public void testSetIdUsuario() {
        System.out.println("setIdUsuario");
        int idUsuario = 0;
        Emprestimo instance = new Emprestimo();
        instance.setIdUsuario(idUsuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cadastro method, of class Emprestimo.
     */
    @Test
    public void testCadastro() {
        System.out.println("cadastro");
        Emprestimo emprestimo = null;
        Emprestimo instance = new Emprestimo();
        instance.cadastro(emprestimo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consulta method, of class Emprestimo.
     */
    @Test
    public void testConsulta() {
        System.out.println("consulta");
        int idMaterial = 0;
        int idUsuario = 0;
        Emprestimo instance = new Emprestimo();
        List expResult = null;
        List result = instance.consulta(idMaterial, idUsuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of realizarDevolucao method, of class Emprestimo.
     */
    @Test
    public void testRealizarDevolucao() {
        System.out.println("realizarDevolucao");
        Emprestimo emprestimo = null;
        Emprestimo instance = new Emprestimo();
        instance.realizarDevolucao(emprestimo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of notificar method, of class Emprestimo.
     */
    @Test
    public void testNotificar() {
        System.out.println("notificar");
        Emprestimo instance = new Emprestimo();
        instance.notificar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of realizarRenovacao method, of class Emprestimo.
     */
    @Test
    public void testRealizarRenovacao() {
        System.out.println("realizarRenovacao");
        Emprestimo emprestimo = null;
        Emprestimo instance = new Emprestimo();
        instance.realizarRenovacao(emprestimo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
