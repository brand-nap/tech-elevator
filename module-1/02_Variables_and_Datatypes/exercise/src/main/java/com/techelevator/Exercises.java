package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /* Exercise 1
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */
		// ### EXAMPLE:
		int birdsOnABranch = 4;
		int birdsThatFlyAway = 1;
		int birdsRemaining = birdsOnABranch - birdsThatFlyAway;

        /* Exercise 2
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */
		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

        /* Exercise 3
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int raccoonsPlaying = 3;
		int raccoonsHome = 2;
		int raccoonsLeft = raccoonsPlaying - raccoonsHome;

        /* Exercise 4
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int flowers = 5;
		int bees = 3;
		int missingBees = flowers-bees;

        /* Exercise 5
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		int lonelyPigeons = 1;
		int friendlyPigeons = 1;
		int totPigeons = lonelyPigeons+friendlyPigeons;

        /* Exercise 6
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		int ogOwls = 3;
		int newOwls = 3;
		int totOwls = ogOwls + newOwls;

        /* Exercise 7
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		int workingBeavers = 2;
		int lazyBeavers = 1;
		int focusedBeavers = workingBeavers-lazyBeavers;

        /* Exercise 8
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int ogToucans = 2;
		int newToucans = 1;
		int totToucans = ogToucans + newToucans;

        /* Exercise 9
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int squirrels = 4;
		int nuts = 2;
		int hungrySquirrels = squirrels - nuts;

        /* Exercise 10
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		int quarter = 25;
		int dime = 10;
		int nickel = 5;
		int networth = quarter + dime + 2*nickel;

        /* Exercise 11
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		int brier = 18;
		int macadams = 20;
		int flannery = 17;
		int firstGrade = brier + macadams + flannery;

        /* Exercise 12
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */

		int yoyo = 24;
		int whistle = 14;
		int cost = yoyo + whistle;
        /* Exercise 13
        13. Mrs. Hilt made 5 Rice Krispies Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int riceKrispy = 5;
		int largeMarshmallow = 8;
		int miniMarshmallow = 10;
		int marshmallows = miniMarshmallow + largeMarshmallow;

        /* Exercise 14
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		int house = 29;
		int school = 17;
		int worseSnow = house - school;

        /* Exercise 15
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		int cash = 10;
		int truck = 3;
		int pencilCase = 2;
		int leftOver = cash - (truck + pencilCase);

        /* Exercise 16
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int initialMarbles = 16;
		int lostMarbles = 7;
		int finalMarbles = initialMarbles - lostMarbles;

        /* Exercise 17
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int currentSeashells = 19;
		int goalSeashells = 25;
		int missingSeashells = currentSeashells - goalSeashells;

        /* Exercise 18
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		int allBalloons = 17;
		int redBalloons = 8;
		int greenBalloons = allBalloons - redBalloons;

        /* Exercise 19
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		int currentLibrary = 38;
		int additionalBooks = 10;
		int modifiedLibrary = currentLibrary+additionalBooks;

        /* Exercise 20
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		int beeLegs = 6;
		int hive = 6;
		int hiveLegTot = hive*beeLegs;

        /* Exercise 21
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		int icecream = 99;
		int icecreamRetreat = icecream*2;

        /* Exercise 22
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		int rocksNeeded = 125;
		int rocksObtained = 64;
		int rocksLeft = rocksNeeded - rocksObtained;
        /* Exercise 23
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		int hiltMarbles = 38;
		int hiltLostMarbles = 15;
		int hiltMarblesLeft = hiltMarbles - hiltLostMarbles;

        /* Exercise 24
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		int drive = 78;
		int driven = 32;
		int driveLeft = drive - driven;

        /* Exercise 25
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time (in minutes) did she spend shoveling snow?
        */

		int firstShovel = 90;
		int secondShovel = 45;
		int totalShovel = firstShovel+ secondShovel;


        /* Exercise 26
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		int amountOfDogs = 6;
		double dogPrice = .5;
		double dogTotPrice = dogPrice * amountOfDogs;

        /* Exercise 27
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		int hiltFunds = 50;
		int pencil = 7;
		int pencilsBought = hiltFunds - pencil;


        /* Exercise 28
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */

		int butterflies = 33;
		int orangeBF = 20;
		int redBF = butterflies - orangeBF;


        /* Exercise 29
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		double paid = 1;
		double candyCost = .54;
		double change = paid - candyCost;

        /* Exercise 30
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		int trees = 13;
		int treesToPlant = 12;
		int futureTrees = trees + treesToPlant;


        /* Exercise 31
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */

		int grandmaWait = 2;
		int gmaWaitHours = grandmaWait * 24;


        /* Exercise 32
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int cousins = 4;
		int gumEach = 5;
		int totalGum = cousins * gumEach;

        /* Exercise 33
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		double danBank = 3;
		double candyBar = 1;
		double danChange = danBank - candyBar;

        /* Exercise 34
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int boats = 5;
		int peoplePerBoat = 3;
		int lakePop = peoplePerBoat * boats;

        /* Exercise 35
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		int legos = 380;
		int lostLegos = 57;
		int leftoverLegos = legos - lostLegos;

        /* Exercise 36
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */

		int muffins = 35;
		int totMuffins = 83;
		int muffinsToBake = totMuffins - muffins;

        /* Exercise 37
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		int crayonsW = 1400;
		int crayonsL = 290;
		int willSuperiority = crayonsW - crayonsL;


        /* Exercise 38
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		int stickersPerPage = 10;
		int numOfPages = 22;
		int totStickers = stickersPerPage * numOfPages;

        /* Exercise 39
        39. There are 100 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		double cupcakes = 100;
		int kids = 8;
		double cupcakeSplit = cupcakes/kids;

        /* Exercise 40
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies, how many
        cookies will not be placed in a jar?
        */
		int gingerbread = 47;
		int jarSize = 6;
		int leftoverCookies = gingerbread%jarSize;

        /* Exercise 41
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received an equal number of croissants,
        how many will be left with Marian?
        */
		int croissants = 59;
		int neighbors = 8;
		int leftoverCroissants = croissants%neighbors;

        /* Exercise 42
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		int oatmeal = 276;
		int trayStorage = 12;
		int numOfTrays = oatmeal/trayStorage;

        /* Exercise 43
        43. Marian’s friends were coming over that afternoon, so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		int pretzels = 480;
		int servingSize = 12;
		int servings = pretzels/servingSize;

        /* Exercise 44
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		int lemonCupcake = 53;
		int boxSize = 3;
		int boxTotal = lemonCupcake/boxSize;


        /* Exercise 45
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		int carrot = 74;
		int carrotServing = 12;
		int carrotsLeft = carrot%carrotServing;


        /* Exercise 46
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		int teddyBears = 98;
		int shelfSize = 7;
		int shelves = teddyBears/shelfSize;

        /* Exercise 47
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */

		int albumSize = 20;
		int pics = 480;
		int albumsNeeded = pics/albumSize;

        /* Exercise 48
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		int cards = 94;
		int cardBoxSize = 8;
		int cardBoxTot = cards / cardBoxSize;


        /* Exercise 49
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */

		int books = 210;
		int bookShelfSize = 10;
		int bookShelves = books/bookShelfSize;


        /* Exercise 50
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		int croissants2 = 17;
		int guests = 7;
		int croissantDist = croissants2/guests;

	    /* Exercise 51
	    51. Bill and Jill are house painters. Bill can paint a standard room in 2.15 hours, while Jill averages
	    1.90 hours. How long will it take the two painters working together to paint 5 standard rooms?
	    Hint: Calculate the rate at which each painter can complete a room (rooms / hour), combine those rates, 
	    and then divide the total number of rooms to be painted by the combined rate.
	    */
		double billRoomToTime = 1/2.15;
     	double jillRoomToTime = 1/1.9;
		 double jointRoomToTime = billRoomToTime + jillRoomToTime;
		 double roomsToPaint = 5;
		 double jointTimeToFinish = roomsToPaint/jointRoomToTime;



	    /* Exercise 52
	    52. Create and assign variables to hold a first name, last name, and middle initial. Using concatenation,
		build an additional variable to hold the full name in the order of last name, first name, middle initial. The
		last and first names should be separated by a comma followed by a space, and the middle initial must end
		with a period. Use "Grace", "Hopper, and "B" for the first name, last name, and middle initial.
		Example: "John", "Smith, "D" —> "Smith, John D."
	    */
		String firstName = "Grace";
		String lastName = "Hopper";
		char middleInitial = 'B';
		String fullName = lastName + ", " + firstName + " " + middleInitial + ".";


	    /* Exercise 53
	    53. The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
	    What percentage of the trip as a whole number has been completed?
	    */
		int distance = 800;
		int travelled = 537;
		int percentComplete = distance/travelled;
	}

}
