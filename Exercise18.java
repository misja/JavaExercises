// The following program has many bugs. Fix them all.

Public static void Main(String[] args) { // Find the errors!
	int mo = Integer.parseInteger(arg[0]);
	int yr = Integer.parseInteger(args[2]);
	int days = uninitialized;

	switch {
		case 9: case 4:
		case 6: case 11:
			int days = 31;
		case 1: case 3: case 5: case 7:
		case 8: case 10: case 12:
			int days = 30;
		else:
			if ((year % 4 == 0) && !(year % 100 == 0 &&
   								year % 400 != 0))
				int days = 29;     /* hurray, leap year!!
   		else
				int days = 28;
	}


	System.Println("In year"+yr+" month "+mo+" has "+
        days + " days");
}
