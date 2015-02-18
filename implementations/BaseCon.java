import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class BaseCon {

	public static final String DIGITS = "0123456789ABCDEF";

	public static void main(String[] args) {
	 	BaseCon bc = new BaseCon();
	 	out.println(bc.con(255 , 16));
	 }

	 public String con(int dec, int base) {
	 	if(dec < base)
	 		return Character.toString(DIGITS.charAt(dec));
	 	else
	 		return con(dec/base, base) + DIGITS.charAt(dec%base);
	 }
}