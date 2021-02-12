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
        assertNotEquals(bushGrove, stateFarm);
    }

    @Test
    public  void testJobConstructorSetsAllFields() {
        Job jobSearchFile = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(jobSearchFile, jobSearchFile);
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
        assertNotEquals(jobSearchFile1, jobSearchFile2);
    }

    @Test
    public void testToString() {
        Job jobSearchFile1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String output =
                "\n"+"ID:"+jobSearchFile1.getId()+"\n"+
                "Name: Product tester"+"\n"+
                "Employer: ACME"+"\n"+
                "Location: Desert"+"\n"+
                "Position Type: Quality control"+"\n"+
                "Core Competency: Persistence\n";
        assertEquals(output,jobSearchFile1.toString());



    }

    @Test
    public void testToStringInAndOut() {
        Job jobSearchFile2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        char first = jobSearchFile2.toString().charAt(0);
        char end = jobSearchFile2.toString().charAt(jobSearchFile2.toString().length()-1);
        assertEquals(first, end);
        assertEquals(first,end);
    }
}


