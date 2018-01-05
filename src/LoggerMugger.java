import java.util.*;
import java.lang.String;

public class LoggerMugger {
    /* private static Logger logger = Logger.getLogger("Lockie.txt");
     */

    int isFisherman = 3;
    boolean isFishingTrip = false;

    public boolean fisherKing() {


        if (isFisherman == 3) {

            System.out.println("Fishin");//fishin printed to console as int is validated as true
            //number of fisherman is greater than or equal to 3 so it returns true boolean value
            //operator can be either >= or ==
            return isFishingTrip = true;

        } else
            System.out.println("Raining fellas, stormy seas mean no fish");
        return isFishingTrip = false;
    }

    {
        boolean isFishie = false;


        if (isFishie) System.out.println("Fishin boys");
        else System.out.println("Nope we aint going to catch any tuna today");

        //as boolean value has been declared to false, the else statement will print, conversely if set to true,
        //if statement prints to console

    }

    {
        class Employee {
            protected long employeeId;
            protected String firstName;
            protected String lastName;

            public int hashCode() {
                return (int) employeeId *
                        firstName.hashCode() *
                        lastName.hashCode();
            }

            public void main(String[] args) {
                Employee ee = new Employee();
                ee.hashCode();
                System.out.println(ee);
            }
        }

    }

    {
        boolean b;
        boolean bValue = (b = true);
        //evaluates to true
        if (bValue) System.out.println("True");
        else System.out.println("False");
        if (bValue = false) System.out.println("True");
        else System.out.println("False");
        if (bValue == false) System.out.println("True");
        else System.out.println("False");
    }

    /*
    {
        int i;
        int iValue = (i=1);
        if(iValue){ //compilation error boolean expected as expression not int, same as if you placed if(i=1)
            //incompatible types
    };
    */ {
        long cruiseLiner = 900L;

        System.out.println("The biggest cruise liner in the world is this long " + cruiseLiner + " metres ");
        if (cruiseLiner == 700L)
            System.out.println("Not the longest");
        else if (cruiseLiner == 900L)
            System.out.println("the longest beast");
        else if (cruiseLiner == 1000L)
            System.out.println("Outside the bounds");

    }

    {
        Integer wrapperInteger = new Integer(6);//give unneccesary unboxing

        Boolean wrapperBoolean = new Boolean("true");//deprecated, constructing new Boolean object is rarely done(instatiating)

        Boolean primitiveBoolean = wrapperBoolean.booleanValue(); // unboxing wrapper goes back into primitive boolean value
        primitiveBoolean = wrapperBoolean;
        if (wrapperBoolean)
            System.out.println("Works because of unboxing");
    }

    public void caychingDinner() {


        String fish = "Marlin";
        String fih2 = "Bass";
        String fishaa = "Swordfish";

        String catchResult = "Swordfish, Marlin,Bass";

        if (catchResult == fih2) {
            System.out.println("We eating Bass");
        } else if (catchResult == fish) {
            System.out.println("we eating Marlin");
        } else
            System.out.println(catchResult);
        //prints catchResult with all three strings
        System.out.println("We eating swodfish");
//outputs catchResult variable to Swordfish
    }

    {

/*
IF BELOW I RAN THIS SWITCH IT WOULD EXECUTE RUNNING CODE FROM BAKED, GRILLED AND TO DEFAULT, PRINTING ALL THREE
It i place a break at BAKED iteration terminates as variable "BAKED has been reached, outputs it to screen
If i omit all breaks in loop, default value will output to screen

 */

        String theFish = "FRIED, SAUTEED, BAKED, GRILLED";
        theFish = "";
        switch (theFish) {
            case "FRIED":
                theFish = "FRIED";
                System.out.println("Waiter i will have it Fried ");

            case "SAUTEED":
                theFish = "SAUTEED";
                System.out.println("Waiter i will have it Sauteed ");

            case "BAKED":
                theFish = "BAKED";
                System.out.println("Waiter i will have it  Baked");
                break;
            case "GRILLED":
                theFish = "GRILLED";
                System.out.println("Waiter i will have it Grilled ");

            default:
                System.out.println("I dont want fish");

        }

    }

    //int u;
    //for (u = 2; u < 300; --u) {
    //  System.out.println(u);
    //creates an infinte loop


    {
        int uf = 600;
        for (uf = 0; uf < 60; ++uf) {
            System.out.println(uf);
            //this will decrement from 0 - 59 then it will terminate
        }

/*
        int utf = 200;
        for (utf = 200; utf > 0; utf++) {
            System.out.println(utf);
            //this will create infinite loop continuosly incrementing
     }
     */
        {
            int hjl;
            for (hjl = 0; hjl < 30; ++hjl) {
                System.out.println("This is a loop structure incrementing " + hjl);
                //This will inrement from 0 - 29 then terminate with sys out as above
            }
            System.out.println("This is a loop structure incrementing " + hjl);//outside scope of loop
        }
    }

    {
        int shoeSize[] = {7, 8, 9, 10, 11, 12, 13};
        //array has [7] elements
        for (int i : shoeSize) {
            System.out.println(shoeSize.equals(4));//outputs false 7 times to console
        }

        int shoeSize1[] = {7, 8, 9, 10, 11, 12, 13};
        //array has [7] elements
        for (int igh : shoeSize1) {
            System.out.println(shoeSize1[4]);//prints element 11 7 times to console
        }
        int shoeSize2[] = {7, 8, 9, 10, 11, 12, 13};
        //array has [7] elements
        for (int irh : shoeSize2) {
            System.out.println(shoeSize2.hashCode());//prints 93122545 7 times to console
        }
        List<Integer> shoeSizer = new ArrayList<>();
        shoeSizer.add(3);
        shoeSizer.add(12);
        shoeSizer.add(7);
        for (Integer irh : shoeSizer) {
            System.out.println(shoeSize2.hashCode());
            //when this ArrayList is iterated over, these 3 hascode values are added to list, and then these 3
            //added values override entire list of hashcode values from shoeSize2
            System.out.println(shoeSizer.hashCode());//this gives the value of hashcode 33053 for three ARRAYLIST values added
            System.out.println(shoeSize1.hashCode());
        }
        List<Integer> shoeSizer11 = new ArrayList<>();
        shoeSizer11.add(3);
        shoeSizer11.add(12);
        shoeSizer11.add(7);
        for (Integer ite : shoeSizer11) {
            System.out.println(ite);//prints 3,12,7 to console
        }
        List<Integer> shoeSizer113 = new ArrayList<>();
        shoeSizer113.add(22);
        shoeSizer113.add(15);
        shoeSizer113.add(17);
        for (Integer ire : shoeSizer113) {
            System.out.println(ire);//prints 22,15,17
            System.out.println(shoeSizer113);//prints [22, 15, 17]


        }

    }

    {

        int golfSession = 18;
        int holeProgression = 0;
        do
            for (int ids = 0; ids < holeProgression; ids++) {

                System.out.println(ids);


            } while (golfSession < 18);

    }


    public void golfingByHour() {
        int totalHoursGolfing = 0;
        int maxTotalHoursRound = 4;

        for (int gy = 4; gy < 5; ++gy) {
            totalHoursGolfing = ++maxTotalHoursRound;
            if (totalHoursGolfing > maxTotalHoursRound)

                break;
            System.out.println("Round of 18 holes of golf should take no longer than " + gy + " hours to play");
        }
    }

    public void coastTrip() {
        /*
        This entire method prints out the coast trip, 2 games of golf played, 3 nights of quizzes,
        2 trips to beach and 1 day playing bowls
        each int was iterated over for loop and given set boundaries
         */
        int golfGames = 2;
        int nightsPlayingQuiz = 3;
        int tripsToBeach = 2;
        int gameofBowls = 1;

        for (int rw = 1; rw < 3; ++rw) {
            // golfGames++;
            System.out.println("\nDay " + rw + ": games of golf");
        }
        for (int jd = 1; jd < 4; ++jd) {
            //   nightsPlayingQuiz++;
            System.out.println("\nDay " + jd + ": nights playing quiz");
        }
        for (int tg = 1; tg < 3; ++tg) {
            //     tripsToBeach++;
            System.out.println("\nDay " + tg + ": beach fun");
        }
        for (int ui = 1; ui < 2; ++ui) {
            //       gameofBowls++;
            System.out.println("\nDay " + ui + ": bowls at the local");
        }
    }

    {
        byte aa;
        aa = 30;
        System.out.println(aa += 12);
        aa = 42;
        System.out.println(aa += 32);
        aa = 74;
        System.out.println(aa += 12);
        aa = 86;
        System.out.println(aa %= 12);
        aa = 2;
        System.out.println(aa ^= 12);
        aa = 14;
        System.out.println(aa *= 12);
        aa = -88;
        System.out.println(aa != 12);//true
        aa = -88;
        System.out.println(aa |= 12);//-84
        aa = -84;
        System.out.println(aa >>= 12);//-1
        aa = -1;
        System.out.println(aa <<= 12);//0
        aa = 35;
        System.out.println(aa >>>= 12);//0

    }

    {
        int pirates = 25;
        int pirateShips = 73;
        int assignedShips = pirates / pirateShips;

        System.out.println(assignedShips);//0
        int assignedShips3 = pirateShips / pirates;
        System.out.println(assignedShips3); //2
        int assignedShips32 = pirateShips % pirates;
        System.out.println(assignedShips32);//23

        byte shipeers = 22;
        shipeers++;
        // --shipeers; if this omitted it becomes -118
        shipeers *= (20 / 3);
        System.out.println("Ship: " + shipeers);//-124

        byte ure = 8;
        byte ref = ++ure;

        System.out.println(ure);//9

        char sez = 'r';
        char quin = sez = 'a';
        System.out.println(sez);//sez is reassigned to 'a'
        char apple = 'l';
        char ban = 'a';
        char org = 'r';
        char rasp = 'r';
        char grape = 'y';

        System.out.println(apple + ban + org + rasp + grape);//prints 554
        System.out.println(apple + "" + ban + "" + org + "" + rasp + "" + grape);//larry prints

    }

    {
        boolean b1 = 'A' < 'B'; //character literals
        boolean b2 = '\u0041' < '\u0042'; //Unicode literal
        boolean b3 = 0x0041 < 0X0042; //hexadecimal literals
        boolean b4 = 65 < 66; //Integer literal that fits into char
        boolean b5 = '\101' < '\102'; //Octal literals
        boolean b6 = 0101 < 0102;//octal literals
        boolean b7 = 'A' < 0102; //Character and Octal literals

        /*
        you can test the relationship between  floating points
        for instance using D or d postfixes, of f and F for floating points

         */
        float reggie = 10.9f;

        double roger = reggie - 3.4d;
        System.out.println(roger);//7.4999999
        double jake = 25.9d;
        // float mike = jake + 11.2;//incompatible types

    }

    {
        Object ko = new Object();
        Object hw = new Object();
        hw = ko;


        System.out.println(ko != hw);//false, same reference
        System.out.println(ko == hw);//true same reference

        boolean bev = true && true;//true
        boolean beer = true && false;//false, evaluates right operand
        boolean bean = false && true;//false, doent not evaluate right operand hence false
        boolean bolivia = false && false;//false, right operand no evaluated

        //&& if both values of operands have true  then true is returned. if left hand operand returns false,
        //we do not evaluate  right

        System.out.println("Bev" + bev);
        System.out.println("Beer" + beer);
        System.out.println("bean" + bean);
        System.out.println("Bol" + bolivia);

        boolean ozone = true || true;//truenright operand not evaluated
        boolean otter = true || false;// true right operand not evealuated
        boolean oqr = false || true;//true evaluates both sides
        boolean opie = false || false;//false

        //OR: if left operand returns true no need to to check right operand

        System.out.println("oz: " + ozone);
        System.out.println("otter" + otter);
        System.out.println("oqr" + oqr);
        System.out.println("opie" + opie);

        System.out.println(!false);//true
        System.out.println(!true);//false
        System.out.println(!!true);//true
        System.out.println(!!!true);//false
        System.out.println(!!!!true);//true


    }

    {
        int p3 = 22;
        int p4 = 33;
        int p8 = 12;
        System.out.println(p3 / p4 - p8);//-12
        //22/33
        //0.666
        //0.6666-12
        //-11.333
        //-12


        String lockyer = " My fave player";
        System.out.println(lockyer.replace("player", "Sportsman"));
        System.out.println(lockyer);
        //string are immutable, meaning by me modifying the string, new string returned but wont change the value
        String ss = new String("Thursto");
        String dd = new String("My man");
        new StringJoiner(ss + dd);
        System.out.println(ss + " " + dd);


        String treaure = "Buried Treasure";
        System.out.println(treaure.charAt(4));//e
        System.out.println(treaure.charAt(8));//r
        System.out.println(treaure.indexOf(6));//-1
        System.out.println(treaure.indexOf(3));

        String s432 = 1 + 3 + "DEF" + (11 * 2);
        System.out.println("God knows: " + s432);//4DEF22

        String h94 = null;
        System.out.println(h94);//prints null
        System.out.println(h94.toString());//null pointer exception

    }
        {
            int iVaz = 0;
            int iVazza = 1;
            boolean iVardy = false;
            boolean iVetta = true;
            if (!(iVaz <= iVazza) && (iVaz >= iVazza))//always false
                System.out.println("Whish one is it" + iVardy);
            else
                System.out.println("Or is it this one" + iVetta);//this prints to console
            if (!(iVaz >= iVazza) && (iVaz == iVazza))
                System.out.println("Lets: " + false);
            else
                System.out.println("Lets: " + true);//this prints to console

            String shizzle = "Jacko";
            System.out.println(!shizzle.startsWith("K"));//true

            //cannot be used on non-boolean value
            //!10 compile error, integer use is illegal
            //!"STRING"; compile error, string use is illegal


        }

        {
            boolean isValid = true;
            while (isValid) {
                isValid = false;
                System.out.println("t1");
                if (isValid = true) {
                    System.out.println("t2");
                    break;//terminates here anything beyond unreachable
                }
                isValid = false;
                System.out.println("t3");
                //t1 and t2 output to console, this is because condition is false at t1 so its a valid output
                //however once it gets to t2 it breaks iteration and prints both t1 and t2, misses t3 as its both out of
                //scope and its also false evaluation
            }
        }


        public void breaterTest() {
            myBreakLabel:
            while (true) {
                System.out.println("Apples");
                while (true) {
                    System.out.println("Oranges");
                    while (true) {
                        System.out.println("Mangoes");
                        break myBreakLabel;
                    }
                }
            }
        }
/*
    public void ContTest() {
        myContinueLabel:

        This entire continue while statement will become ifinite loop as there is no break


            while (true) {
                System.out.println("Burger");
                while (true) {
                    System.out.println("Shake");
                    continue myContinueLabel;
                   while (true) {
                    System.out.println("Chips");
                    /// If code is in this position it will become unreachable to while statement
                } */


        private void generateRandomRank() {
            String randomRank = "B";
            //this will execute once case "D" is reached with an output of Top Echelon

            switch (randomRank) {
                case "A":
                    randomRank = "General";
                    System.out.println("Top Dog");
                    break;
                case "B":
                    randomRank = "Lieutenant";
                    System.out.println("Decent rank soldier");
                    break;
                case "C":
                    randomRank = "Colonel";
                    System.out.println("Earned my way up the ranks");
                    break;
                case "D":
                    randomRank = "Major";
                    System.out.println("Top echelon");
                    break;
                case "E":
                    randomRank = "Captain";
                    System.out.println("That little job you pulled off desrves a commendation");
                    break;
                case "F":
                    randomRank = "Private";
                    System.out.println("Highly decorated officer");
                    break;
                default:
                    System.out.println("Nothing but a grunt");
            }
        }

        {
            String s4 = "Legend";
            String s23 = new String("Legend");
            s23 = s4;
            System.out.println(s4);//s4 prints "Legend", points to exact same reference object as s23

            s4 = new String("Legend1");
            System.out.println(s4);//points to different reference other than s23, s4 == "Legend1"

            System.out.println(s23.equals(s4));//evaluates to false, s4 now points to different obj reference to s23

            System.out.println(s4 != s23);//evaluates to true/ s4 not equal to s23

        /*
        A switch statement works with which wrapper class/ref types
        .Character
        .Byte
        .Short
         */

            System.out.println(s4 == s23 && s4 != s23);//false does not evaluate other expression other side of ampersand
            System.out.println(s4 == s23 & s4 != s23);//still evaluates to false
            System.out.println(s4 == s23 || s4 != s23);// evaluates to true
            boolean boolean1 = true || true && false;
            boolean boolean2 = (true || true) && false;
            System.out.println(boolean1); //evaluates to true
            System.out.println(boolean2);//evaluates to false

        }


        {
            int grades = 80;

            switch (grades) {
                case 0:

                    System.out.println("Not a great grade" + grades);
                case 20:
                    System.out.println("Git gud son" + grades);
                case 80:
                    System.out.println("Going places bruh with such a great grade of " + grades);
                    // break; this will ensure loop terminates at this point as case reached, does not proceed further
                    // if you take out the break it will p[rint case 80 and the default case
                case 100:
                    System.out.println("Way too good dawg " + grades);
                    //case 100: compile error you cannot have duplicate case number

                default:
                    System.out.println("Get a new career ");
            }
        }

        {
            int c = -3;
            int absoluteValue = c > 0 ? c : -c;
            System.out.println(absoluteValue);
            //this prints 3, as the result is not greater than 0, true : false --> answer is false

            long stadiumCapacity = 900000L;
            long peopleAttending = 7000L;

            long evaluateCrowd = stadiumCapacity > peopleAttending ? 900000L : 7000L;
            System.out.println(evaluateCrowd);

        }

        public static void main(String[] args) {
            LoggerMugger lm = new LoggerMugger();
            lm.fisherKing();
            LoggerMugger fs = new LoggerMugger();
            fs.caychingDinner();
            LoggerMugger fff = new LoggerMugger();
            LoggerMugger dsq = new LoggerMugger();
            dsq.golfingByHour();
            LoggerMugger hse = new LoggerMugger();
            hse.coastTrip();
            LoggerMugger bgd = new LoggerMugger();
            bgd.breaterTest();
            LoggerMugger oop = new LoggerMugger();
            oop.coastTrip();


            HashMap<String, String> steveKing = new HashMap<String, String>();
            steveKing.put("gunslinger", "roland");
            steveKing.put("boy", "jake");
            steveKing.put("odetta", "mordred");
            steveKing.put("Crimson king", "rose");
            steveKing.put("tower", "blaine");
            steveKing.put("turtle", "thinning");

            //iteration

            for (String s : steveKing.keySet()) {
                //conditional
                if (s.equals("jake")) {
                    System.out.println(s + steveKing.get(s));
                    //Expression
                    steveKing.put("Crimson king", "boy");
                    System.out.println(s + steveKing.get(s));

                }
            }
        }

    }





