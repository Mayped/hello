
JARS = /Users/jayfenwick/jars
JUNIT = $(JARS)/junit-4.11.jar
JAVAHOME = /Applications/BlueJ\ 3.1.0/BlueJ.app/Contents/Plugins/jdk/Contents/Home/bin/
JAVAC = $(JAVAHOME)/javac
JAVA = $(JAVAHOME)/java

.SUFFIXES: .java .class
.java.class:
	$(JAVAC) $*.java

default:
	@echo "Targets: hello hellotest clean"

hello: Hello.class
	$(JAVA) Hello

hellotest: HelloTest.java Hello.java $(JUNIT)
	rm -f *.class
	$(JAVAC) -cp ./:$(JUNIT) HelloTest.java
	$(JAVA) -cp ./:$(JUNIT) junit.textui.TestRunner HelloTest

clean:
	rm -f *.class