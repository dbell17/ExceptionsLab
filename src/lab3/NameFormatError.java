/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Don
 */
public class NameFormatError extends IllegalArgumentException {

        public static String errorMsg = "Must enter a first and last name, seperated by a space.";

        public NameFormatError() {
            super(errorMsg);
        }

        public NameFormatError(final String msg) {
            super(errorMsg);
        }

        public NameFormatError(final String msg, final Throwable cause) {
            super(errorMsg, cause);
        }

        public NameFormatError(final Throwable cause) {
            super(cause);
        }

    }
