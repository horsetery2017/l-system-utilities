/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lsystem;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tux
 */
public class StochasticGrammarTest {

    Grammar instance;

    /**
     *
     */
    public StochasticGrammarTest() {
        instance = new StochasticGrammar("F");
    }

    /**
     *
     * @throws Exception
     */
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    /**
     *
     * @throws Exception
     */
    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     *
     */
    @Before
    public void setUp() {
    }

    /**
     *
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of addRule method, of class StochasticGrammar.
     */
    @Test
    public void testAddRule_char_String() {
        System.out.println("addRule no weighting");
        char premise = 'F';
        String rule = "F-F-F";
        instance.addRule(premise, rule);
    }

    /**
     * Test of addRule method, of class StochasticGrammar.
     */
    @Test
    public void testAddRule_3args() {
        System.out.println("addRules with weighting");
        char premise = 'X';
        String rule = "FX-FX";
        float weight = 1.0F;
        instance.addRule(premise, rule, weight);
        String rule1 = "FX-FX";
        float weight1 = 1.0F;
        instance.addRule(premise, rule1, weight1);
    }

    /**
     * Test of getRule method, of class StochasticGrammar.
     */
    @Test
    public void testGetRule() {
        String expResult = "FX-FX";
        char premise = 'X';
        String rule = "FX-FX";
        float weight = 1.0F;
        instance.addRule(premise, rule, weight);
        String rule1 = "FF-FF";
        float weight1 = 1.0F;
        instance.addRule(premise, rule1, weight1);
        String result = instance.getRule('X');
        assertEquals(expResult, result);
    }

    /**
     * Test of createGrammar method, of class StochasticGrammar.
     */
    @Test
    public void testCreateGrammar_int() {
        System.out.println("createGrammar");
        String expResult = "FX-FX";
        char premise = 'F';
        String rule = "FX-FX";
        float weight = 1.0F;
        instance.addRule(premise, rule, weight);
        String rule1 = "XF-FX";
        float weight1 = 1.0F;
        instance.addRule(premise, rule1, weight1);
        String result = instance.createGrammar(2);
        assertEquals(expResult, result);
    }

    /**
     * Test of createGrammar method, of class StochasticGrammar.
     */
    @Test
    public void testCreateGrammar_0args() {
        System.out.println("createGrammar");
        char premise = 'F';
        String rule = "FX-FX";
        float weight = 1.0F;
        instance.addRule(premise, rule, weight);
        String rule1 = "FX-FX";
        float weight1 = 1.0F;
        instance.addRule(premise, rule1, weight1);
        String result = instance.createGrammar();
        String expResult = "F";
        assertEquals(expResult, result);
    }

    /**
     * Test of version method, of class StochasticGrammar.
     */
    @Test
    public void testVersion() {
        System.out.println("version");
        String expResult = "0.6.5";
        String result = instance.version();
        assertEquals(expResult, result);
    }
}