package org.launchcode.techjobs.oo;

import org.junit.Test;

//??? Which of the two should I be doing?
import static org.junit.Assert.*;


public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId(){
        Job a = new Job();
        Job b = new Job();
        assertNotEquals(a, b);
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job aJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(aJob.getName() instanceof String);
        assertEquals(aJob.getName(), "Product tester");

        assertTrue(aJob.getEmployer() instanceof Employer);
        assertEquals(aJob.getEmployer().getValue(), "ACME");

        assertTrue(aJob.getLocation() instanceof Location);
        assertEquals(aJob.getLocation().getValue(), "Desert");

        assertTrue(aJob.getPositionType() instanceof PositionType);
        assertEquals(aJob.getPositionType().getValue(), "Quality control");

        assertTrue(aJob.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(aJob.getCoreCompetency().getValue(), "Persistence");
    }

    @Test
    public void testJobsForEquality(){
        Job a = new Job("A", new Employer("B"), new Location("C"), new PositionType("D"), new CoreCompetency( "E"));
        Job b = new Job("A", new Employer("B"), new Location("C"), new PositionType("D"), new CoreCompetency( "E"));
        assertFalse(a.equals(b));

    }

}
