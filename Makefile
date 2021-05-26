# This repository contains exercises for beginning Java programmers.
#
# Click on one of the Java exercise files at the left, 
# read the comments in the file and add your own code,
# then click "run" above to test your solution.
#
# If you want to save your work, you will likely need to create an
# account (top right corner). See "A Brief Introduction" at left
# for details.
#
# We may add new exercises periodically, so check back later for more.

menu:
	@echo "Welcome to Java Exercises!"
	@-read -p "Which exercise do you want to test? [0-99] " n && make --no-print-directory "Exercise$$n"

Exercise%: Exercise0%.java
	javac -classpath .:stdlib.jar Exercise0$*.java
	-java -classpath .:stdlib.jar Exercise0$*
	@-rm -f *.class
	@echo "==== DONE ===="

Exercise%: Exercise%.java
	javac -classpath .:stdlib.jar Exercise$*.java
	-java -classpath .:stdlib.jar Exercise$*
	@-rm -f *.class
	@echo "==== DONE ===="

.DEFAULT:
	@echo "Sorry, I don't know how to test Exercise '$@'."
	@true

