/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package stack.taller10;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author CltControl
 */
public class OperationsTest {
    
    @Test
    void testMakeFormulaGeneraFormulaValida() {
        String formula = Operations.MakeFormula();

        // Prueba de que  fórmula no está vacía
        assertNotNull(formula, "La fórmula generada no debe ser nula");
        assertFalse(formula.isEmpty(), "La fórmula generada no debe estar vacía");

        // Asegúrate de que la fórmula contenga números y operadores
        assertTrue(formula.matches("^[0-9]+([\\+\\-\\*][0-9]+)*$"), 
                "La fórmula generada debe contener solo números y operadores válidos");
    }

    @Test
    void testEmptyString() {
        String formula = Operations.MakeFormula();
        assertFalse(formula.trim().isEmpty(), "La fórmula no debe ser una cadena vacía.");
    }

    @Test
    void testMakeFormulaCapturaNumeroOperaciones() {
        String formula = Operations.MakeFormula();
        // Verifica la cantidad de operadores que hay en la fórmula
        long operatorCount = formula.chars().filter(ch -> ch == '+' || ch == '-' || ch == '*'|| ch=='/').count();
        
        // Dado que count está entre 1 y 2, la fórmula debería tener entre 1 y 2 operadores
        assertTrue(operatorCount >= 1 && operatorCount <= 2, 
                "La fórmula debe tener entre 1 y 2 operadores.");
    }

    @Test
    void testMakeFormulaRandomDiferentes() {
        String formula1 = Operations.MakeFormula();
        String formula2 = Operations.MakeFormula();
        
        // Verifica que las fórmulas generadas sean aleatorias
        assertNotEquals(formula1, formula2, "Las fórmulas generadas no deben ser iguales.");
    }
    


    @Test
    @DisplayName("Test suma básica con números naturales")
    void testSolveBasicAddition() {
        assertEquals("1+2= 3", Operations.Solve("1+2"));
        assertEquals("10+20=30", Operations.Solve("10+20"));
    }


    @Test
    @DisplayName("Test resta básica con números naturales")
    void testSolveBasicSubtraction() {
        assertEquals("5-2=3", Operations.Solve("5-2"));
        assertEquals("20-10=10", Operations.Solve("20-10"));
    }


    public OperationsTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
     

   
     
}
