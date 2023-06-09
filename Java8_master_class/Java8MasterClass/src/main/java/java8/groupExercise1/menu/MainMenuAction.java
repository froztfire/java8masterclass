package java8.groupExercise1.menu;

import java8.groupExercise1.menu.option.Option;
import java8.groupExercise1.model.UserSelectionState;
import java8.groupExercise1.util.InputHelper;

import java.util.HashMap;
import java.util.Map;

import static java8.groupExercise1.util.Constants.*;

@Option(label = OPTION_LIST_ALL_EMPLOYEE_RECORDS, key = 1)
@Option(label = OPTION_ADD_NEW_EMPLOYEE_RECORD, key = 2)
@Option(label = OPTION_DELETE_EMPLOYEE_RECORD, key = 3)
@Option(label = OPTION_SEARCH_EMPLOYEE_RECORD, key = 4)
@Option(label = OPTION_EXIT, key = -1)

public class MainMenuAction implements CommandAction {
    private Map<Integer, CommandAction> commandActionsMap;
    private final UserSelectionState userSelectionState;

    public MainMenuAction(UserSelectionState userSelectionState) {
        this.userSelectionState = userSelectionState;

        commandActionsMap = new HashMap<>();
        commandActionsMap.put(1, new ListAllEmployeeAction(userSelectionState));
        commandActionsMap.put(2, new AddNewEmployeeAction(userSelectionState));
        commandActionsMap.put(3, new DeleteEmployeeAction(userSelectionState));
        commandActionsMap.put(4, new SearchEmployeeAction(userSelectionState));
        commandActionsMap.put(-1, new ExitAction());
    }

    @Override
    public void doAction() {
        userSelectionState.getPreviousCommandAction().add(this);

        int selectedOption =
                InputHelper.askUserToSelect(
                        this.getClass(), OPTION_HEADER_MAIN_OPTIONS, INSTRUCTION_ENTER_ACTION_TYPE);

        CommandAction commandAction = commandActionsMap.get(selectedOption);
        commandAction.doAction();
    }
}
