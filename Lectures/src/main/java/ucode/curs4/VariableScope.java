package ucode.curs4;

public class VariableScope {

    //instance variable
    private int thisCanBeSeenEverywhere = 100;

    public void methodVariableScope() {
        int variable = 9;

        if (variable >= 10) {
            int internalVariable = 10;
            System.out.println("i can see this variable " + variable + internalVariable);
        } else {
            System.out.println("i cannot see internalVariable");
        }

        System.out.println("i cannot see internalVariable");

        int iterator1 = 0;
        for (; iterator1 <= 2; iterator1++) {
            System.out.println("now i can access the iterator after the for");
        }

        for (int iterator2 = 0; iterator2 <= 2; iterator2++) {

            int anotherInternalVariable = 115;

            {
                System.out.println(anotherInternalVariable);

                int thisIsTricky = 10;
                System.out.println(thisIsTricky);
//                int anotherInternalVariable = 10;
            }


            System.out.println("i cannot see thisIsTricky here");

            System.out.println("i can see both iterators here");

        }


        System.out.println("i can only see iterator1 here");

        System.out.println("i can see thisCanBeSeenEverywhere " + thisCanBeSeenEverywhere);
    }

    public void methodVariableScope2() {
        System.out.println("I cannot see either of the variables defined in the previous method");

        System.out.println("But i can see thisCanBeSeenEverywhere " + thisCanBeSeenEverywhere);
    }

    public void variableNames() {
        int thisCanBeSeenEverywhere = 20;
        System.out.println("This is the internal, overridden variable " + thisCanBeSeenEverywhere);
        //this = extindem scopul la care ne referim de la metoda la intreaga clasa
        System.out.println("This is the external, instance variable " + this.thisCanBeSeenEverywhere);
    }

}
