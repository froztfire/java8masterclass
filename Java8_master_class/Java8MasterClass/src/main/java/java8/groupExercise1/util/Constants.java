package java8.groupExercise1.util;

public class Constants {
    private Constants() {
    }

    public static final String DISPLAY_EMPLOYEE_FULL_NAME_FORMAT = "%s %s %s";

    public static final String DISPLAY_LINE = new String(new char[110]).replace('\0', '=');

    public static final String DISPLAY_NO_RECORDS_FOUND = "No records found.";
    public static final String DISPLAY_NO_RECORDS_FOUND_FORMAT = "| %60s %-45s | \n";

    public static final String DISPLAY_TABLE_BODY_FORMAT = "| %-25s | %-50s | %-25s |\n";

    public static final String DISPLAY_TABLE_HEADER_EMPLOYEE_NUMBER = "Employee Number";

    public static final String DISPLAY_TABLE_HEADER_FORMAT = "| %-25s | %-50s | %-25s |\n";

    public static final String DISPLAY_TABLE_HEADER_HIRING_DATE = "Date Hired";

    public static final String DISPLAY_TABLE_HEADER_NAME = "Name";

    public static final String EMPTY_STRING = "";

    public static final String INSTRUCTION_ENTER_ACTION_TYPE = "Enter action type: ";

    public static final String INSTRUCTION_ENTER_FIRST_NAME = "Enter Employee First Name: ";

    public static final String INSTRUCTION_ENTER_HIRING_DATE = "Enter Date Hired: ";

    public static final String INSTRUCTION_ENTER_LAST_NAME = "Enter Employee Last Name: ";

    public static final String INSTRUCTION_ENTER_MIDDLE_NAME = "Enter Employee Middle Name: ";

    public static final String INSTRUCTION_FIRST_NAME = "First name: ";

    public static final String INSTRUCTION_HIRING_DATE = "Hiring Date: ";

    public static final String INSTRUCTION_LAST_NAME = "Last name: ";

    public static final String INSTRUCTION_MIDDLE_NAME = "Middle name: ";

    public static final String INSTRUCTION_SELECT_AN_ACTION = "Select action: ";

    public static final String MESSAGE_DELETED_EMPLOYEE = "Deleted [%d] %s %s %s (%s).\n";

    public static final String MESSAGE_EMPLOYEE_NOT_FOUND =
            "Employee with employee number %d cannot be found!\n";

    public static final String MESSAGE_EMPLOYEE_SUCCESSFULLY_ADDED =
            "\nEmployee Record Added Successfully: ";

    public static final String MESSAGE_EXIT = "Goodbye!";

    public static final String OPTION_ADD_NEW_EMPLOYEE_RECORD = "Add New Employee Record";

    public static final String OPTION_BACK = "Back";

    public static final String OPTION_DELETE_EMPLOYEE_RECORD = "Delete Employee Record";

    public static final String OPTION_EXIT = "Exit";

    public static final String OPTION_HEADER_CHOOSE_AN_ACTION = "Choose an action";
    public static final String OPTION_HEADER_MAIN_OPTIONS = "Main Options";

    public static final String OPTION_LIST_ALL_EMPLOYEE_RECORDS = "List All Employee Records";

    public static final String OPTION_SEARCH_BY_EMPLOYEE_NUMBER = "Search by Employee Number";

    public static final String OPTION_SEARCH_BY_FIRST_NAME = "Search by First Name";

    public static final String OPTION_SEARCH_BY_HIRING_DATE = "Search by Hiring Date";

    public static final String OPTION_SEARCH_BY_LAST_NAME = "Search by Last Name";

    public static final String OPTION_SEARCH_BY_MIDDLE_NAME = "Search by Middle Name";

    public static final String OPTION_SEARCH_EMPLOYEE_RECORD = "Search Employee Record";

    public static final String OPTION_SORT_BY_EMPLOYEE_NUMBER = "Sorted by Employee Number";

    public static final String OPTION_SORT_BY_FIRST_NAME = "Sorted by First Name";

    public static final String OPTION_SORT_BY_HIRING_DATE = "Sorted by Hiring Date";

    public static final String OPTION_SORT_BY_LAST_NAME = "Sorted by Last Name";
}