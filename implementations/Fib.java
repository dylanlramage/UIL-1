import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Fib {

	 public static void main(String[] args) {
	 	Fib f = new Fib();
	 	out.println(f.fi(10));
	 }

	 public long fi(int n) {
	 	long l = 1;
	 	long sl = 1;
	 	long fn = 2;
	 	for(int i = 3;i <= n;i++) {
	 		fn = l + sl;
	 		sl = l;
	 		l = fn;
	 	}
	 	return fn;
	 }
}