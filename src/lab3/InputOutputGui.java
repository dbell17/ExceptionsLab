package lab3;

import javax.swing.JOptionPane;

/**
 * This class is responsible for all input and output in the program.
 *
 * @author Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class InputOutputGui {

    private NameService nameService;
    public InputOutputGui() {
        setNameService(new NameService());
    }

    public final void startConversation() {
        String msg;
        String fullName = JOptionPane.showInputDialog("Enter full name:");
        try {
            String lastName = getNameService().extractLastName(fullName);
            String firstName = getNameService().extractFirstName(fullName);
            msg = "Your last name is: " + lastName
                    + " -- Your first name is: " + firstName;
        } catch (NameFormatError e) {
            msg = e.getMessage();
        }
        JOptionPane.showMessageDialog(null, msg);

    }

    public final NameService getNameService() {
        return nameService;
    }

    //Must not be null
    public final void setNameService(final NameService nameService) {
        try {
            this.nameService = nameService;
        } catch (NullPointerException np) {
            JOptionPane.showMessageDialog(null, np.getMessage());
        }
    }

}
