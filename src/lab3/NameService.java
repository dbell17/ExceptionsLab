package lab3;

/**
 * This class provides various services relating to name manipulation.
 * No output should be performed here.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class NameService {
    private static final int FIRST_NAME_IDX = 0;
    private static final int LAST_NAME_IDX = 1;

    /**
* Finds and returns the last name from within a full name.
*
* @param fullName - a name containing a first name and a last name
* @return the last name
*/
    //Must not be null or empty
    //Must be at least two names ie:(firstName lastName)
    public final String extractLastName(String fullName) throws NameFormatError {
        if (fullName == null || fullName.isEmpty()) {
            throw new NameFormatError();
        }

        fullName = fullName.trim();
        String[] nameParts = fullName.split(" ");
        System.out.println(nameParts.length);
        if (nameParts.length < 2) {
            throw new NameFormatError();
        }

        return nameParts[nameParts.length - LAST_NAME_IDX];
    }

    /**
* Finds and returns the first name from within a full name. Caution: No
* validation is performed.
*
* @param fullName - a name containing a first name and a last name
* @return the first name
*/
    //must not be null or empty
    public final String extractFirstName(String fullName) throws NameFormatError{
        if (fullName == null || fullName.isEmpty()) {
            throw new NameFormatError();
        }
        fullName = fullName.trim();
        String[] nameParts = fullName.split(" ");

        return nameParts[FIRST_NAME_IDX];
    }

    /**
* Gets the length of a name.
*
* @param name - any full name or part of a name.
* @return the length of the name or part.
*/
    //must not be null or empty
    public final int getNameLength(final String name) throws NameFormatError{
        if(name == null || name.isEmpty()){
            throw new NameFormatError();
        }
        return name.length();
    }
    
}
