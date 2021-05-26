// The following program has many bugs. Fix them all.

Public static void Main(String[] args) { // Find the errors!
	int mo = Integer.parseInteger(arg[0]);
	int yr = Integer.parseInteger(args[2]);
	int days = uninitialized;
	if (mo != 2) {
		if (mo = 9 || 4 || 6 || 11) { days = 31;
		else days = 30; }
	} else if (year % 4 == 0) && !(year % 100 == 0 &&
   		year % 400 != 0)
		days = 29;     /* hurray, leap year!!
   } else
		days = 28;
	System.Println("In year"+yr+" month "+mo+" has "+
        days + " days");
}
