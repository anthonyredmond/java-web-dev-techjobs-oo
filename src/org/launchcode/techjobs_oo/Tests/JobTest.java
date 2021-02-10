package org.launchcode.techjobs_oo.Tests;
import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.main.PositionType;
import org.launchcode.techjobs_oo.main.*;

public class JobTest {
    Job bushGrove;
    Job stateFarm;
    @Before
    public void createJobs(){
        bushGrove = new Job();
        stateFarm = new Job();

    }


    @Test
    public void  testSettingJobId() {
    assertFalse(bushGrove.equals(stateFarm));
    }

    @Test
    public  void testJobConstructorSetsAllFields() {
        Job jobSearchFile = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(jobSearchFile.equals(jobSearchFile));
        assertEquals("Product tester", jobSearchFile.getName());
        assertEquals("ACME", jobSearchFile.getEmployer().getValue());
        assertEquals("Desert", jobSearchFile.getLocation().getValue());
        assertEquals("Quality control", jobSearchFile.getPositionType().getValue());
        assertEquals("Persistence", jobSearchFile.getCoreCompetency().getValue());
    }
    @Test
    public void testJobsForEquality(){
            Job jobSearchFile1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
            Job jobSearchFile2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertFalse(jobSearchFile1.equals(jobSearchFile2));
    }

    @Test
    public void testToString() {
        Job jobSearchFile1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String output = "ID:"+jobSearchFile1.getId()+"\n"+
         "Name: Product tester"+"\n"+
         "Employer: ACME"+"\n"+
        "Location: Desert"+"\n"+
         "Position Type: Quality control"+"\n"+
         "Core Competency: Persistence";
        assertEquals(output,jobSearchFile1.toString());



    }










    }


