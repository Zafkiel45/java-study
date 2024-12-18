public class Variables {
    public static void main(String[] args) {
        int instanceVariable = 19; /* Each instance of this variable has its own state */
       
        /* Arguments always treated as variables. Fields is a term for 
            variables declared inside of class. Both instance variable and 
            static variable. 
        */ 

        /*
            "fields" declared in method are local fields. Local fields can be only
            access by the method itself. 

            In JavaScritp exists Closures that work arount this, but in Java I
            do not know. When you will be mature in Java, search for this. 
        */ 

        /*
         * Names for fields can initiate with underline(_), dollar($) or a letter.
         * The letter is preferend. Field names are case-sensitive. I "cited"
         * fields apply for parameters too.  
         * 
         * It's convention never to use dollar or underline on day-day. Avoid 
         * this. 
         * 
         * Subsequent characters can be the same that cited above, but use the 
         * sense. Avoid sequentes with underline or dollar. CamelCase is 
         * preferible using letters.
        */
    };
};

/* The static variable "numGears" throw a error if inside of main class.
 * It might be because "main" already is "static", but I'm not certain of this
 * Search more about this.
 */

class StaticsVariables {
    static int numGears = 6; /* The current state is shared among all instances */
    static final int numGearsFinal = 6; 
    /* To do the same than "numGear", but the "final" keyword is still a mistery for me 
     * Search more about the "final" keyword.
    */
};
