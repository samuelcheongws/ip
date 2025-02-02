package duke.command;
import duke.DukeException;
import duke.Storage;
import duke.TaskList;
import duke.Ui;

/**
 * Abstract class for a command.
 */
public abstract class Command {
    /**
     * Executes the command class.
     *
     * @param taskList A list of tasks.
     * @param ui A UI to display the output generated by duke
     */
    public abstract String execute(Storage storage, TaskList taskList, Ui ui) throws DukeException;

    /**
     * Returns true if the Duke program is closing, false otherwise.
     *
     * @return False.
     */
    public boolean canExit() {
        return false;
    }
}