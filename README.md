# PortScanner-JAVA

Java has built-in networking libraries that can be used to scan for open ports on a target system. Here is an example code snippet in Java that uses the java.net.Socket class to connect to a remote host on a specific port and checks if the port is open.

In this example, I started by specifying the target host name or IP address and the range of ports we want to scan. Then used a for loop to iterate through each port in the range and attempt to connect to it using the Socket class. If the connection is successful, print a message indicating that the port is open, and then close the socket. If the connection fails, catch the exception and continue to the next port.
