package com.techelevator.projects.dao;

import com.techelevator.projects.model.Timesheet;
import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.List;

public class JdbcTimesheetDaoTests extends BaseDaoTests {

    private static final Timesheet TIMESHEET_1 = new Timesheet(1, 1, 1,
            LocalDate.parse("2021-01-01"), 1.0, true, "Timesheet 1");
    private static final Timesheet TIMESHEET_2 = new Timesheet(2, 1, 1,
            LocalDate.parse("2021-01-02"), 1.5, true, "Timesheet 2");
    private static final Timesheet TIMESHEET_3 = new Timesheet(3, 2, 1,
            LocalDate.parse("2021-01-01"), 0.25, true, "Timesheet 3");
    private static final Timesheet TIMESHEET_4 = new Timesheet(4, 2, 2,
            LocalDate.parse("2021-02-01"), 2.0, false, "Timesheet 4");
    
    private JdbcTimesheetDao dao;


    @Before
    public void setup() {
        dao = new JdbcTimesheetDao(dataSource);
    }

    @Test
    public void getTimesheet_returns_correct_timesheet_for_id() {
        Timesheet timesheet = dao.getTimesheet(3);
        assertTimesheetsMatch(TIMESHEET_3, timesheet);
    }

    @Test
    public void getTimesheet_returns_null_when_id_not_found() {
        Timesheet timesheet = dao.getTimesheet(5);
        assertEquals(timesheet, null);
    }

    @Test
    public void getTimesheetsByEmployeeId_returns_list_of_all_timesheets_for_employee() {
        int timesheets = dao.getTimesheetsByEmployeeId(1).size();
        boolean inOrder = true;
        int lastID = 0;
        for (Timesheet timesheet : dao.getTimesheetsByEmployeeId(1)) {
            inOrder = (lastID < timesheet.getTimesheetId()) ? inOrder : false;
        }

        assertEquals(2, timesheets);
        assertEquals(true, inOrder);
    }

    @Test
    public void getTimesheetsByProjectId_returns_list_of_all_timesheets_for_project() {
        int timesheets = dao.getTimesheetsByProjectId(1).size();
        boolean inOrder = true;
        int lastID = 0;
        for (int i = 0; i < 10 ; i++) {
            for (Timesheet timesheet : dao.getTimesheetsByProjectId(i)) {
                inOrder = (lastID < timesheet.getTimesheetId()) ? inOrder : false;
            }
        }
        assertEquals(3, timesheets);
        assertEquals(true, inOrder);
    }

    @Test
    public void createTimesheet_returns_timesheet_with_id_and_expected_values() {
        Timesheet timesheet = dao.createTimesheet(TIMESHEET_3);
        assertEquals(5, timesheet.getTimesheetId());
        timesheet.setTimesheetId(3);
        assertTimesheetsMatch(TIMESHEET_3, timesheet);
    }

    @Test
    public void created_timesheet_has_expected_values_when_retrieved() {
        Timesheet timesheet = dao.createTimesheet(TIMESHEET_3);
        assertEquals(6, timesheet.getTimesheetId());
        assertEquals(TIMESHEET_3.getEmployeeId(), timesheet.getEmployeeId());
        assertEquals(TIMESHEET_3.getProjectId(), timesheet.getProjectId());
        assertEquals(TIMESHEET_3.getDateWorked(), timesheet.getDateWorked());
        assertEquals(TIMESHEET_3.getHoursWorked(), timesheet.getHoursWorked(), 0.001);
        assertEquals(TIMESHEET_3.isBillable(), timesheet.isBillable());
        assertEquals(TIMESHEET_3.getDescription(), timesheet.getDescription());
    }

    @Test
    public void updated_timesheet_has_expected_values_when_retrieved() {
        assertEquals("Timesheet 4", dao.getTimesheet(4).getDescription());
        TIMESHEET_4.setDescription("Hi, my name is Brandon");
        dao.updateTimesheet(TIMESHEET_4);
        assertEquals("Hi, my name is Brandon", dao.getTimesheet(4).getDescription());
    }

    @Test
    public void deleted_timesheet_cant_be_retrieved() {
        assertTimesheetsMatch(TIMESHEET_1, dao.getTimesheet(1));
        dao.deleteTimesheet(1);
        assertEquals(null, dao.getTimesheet(1));
    }

    @Test
    public void getBillableHours_returns_correct_total() {
        assertEquals(.25, dao.getBillableHours(2, 1), 0.001);
        assertEquals(0, dao.getBillableHours(2, 2), 0.001);
    }

    private void assertTimesheetsMatch(Timesheet expected, Timesheet actual) {
        Assert.assertEquals(expected.getTimesheetId(), actual.getTimesheetId());
        Assert.assertEquals(expected.getEmployeeId(), actual.getEmployeeId());
        Assert.assertEquals(expected.getProjectId(), actual.getProjectId());
        Assert.assertEquals(expected.getDateWorked(), actual.getDateWorked());
        Assert.assertEquals(expected.getHoursWorked(), actual.getHoursWorked(), 0.001);
        Assert.assertEquals(expected.isBillable(), actual.isBillable());
        Assert.assertEquals(expected.getDescription(), actual.getDescription());
    }

}
