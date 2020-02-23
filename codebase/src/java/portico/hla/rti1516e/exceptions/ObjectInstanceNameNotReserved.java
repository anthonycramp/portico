/*
 * The IEEE hereby grants a general, royalty-free license to copy, distribute,
 * display and make derivative works from this material, for all purposes,
 * provided that any use of the material contains the following
 * attribution: "Reprinted with permission from IEEE 1516.1(TM)-2010".
 * Should you require additional information, contact the Manager, Standards
 * Intellectual Property, IEEE Standards Association (stds-ipr@ieee.org).
 */

package hla.rti1516e.exceptions;


/**
 * Public exception class ObjectInstanceNameNotReserved
 */

public final class ObjectInstanceNameNotReserved extends RTIexception {
   public ObjectInstanceNameNotReserved(String msg)
   {
      super(msg);
   }

   public ObjectInstanceNameNotReserved(String message, Throwable cause)
   {
      super(message, cause);
   }
}
