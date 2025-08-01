package oops_skill;

public class String_methods {

	public static void main(String[] args) {

				String s = "  Hello Java World  ";
				String s1 = "Hello";
				String s2 = "hello";

				System.out.println("Original String: \"" + s + "\"");

				System.out.println("Length: " + s.length());

				System.out.println("Character at index 1: " + s.charAt(1));

				System.out.println("Substring (7,11): " + s.substring(7, 11)); 

				System.out.println("Lowercase: " + s.toLowerCase());
				System.out.println("Uppercase: " + s.toUpperCase());

				System.out.println("s1 equals s2: " + s1.equals(s2));
				System.out.println("s1 equalsIgnoreCase s2: " + s1.equalsIgnoreCase(s2));

				System.out.println("Compare s1 and s2: " + s1.compareTo(s2));

				System.out.println("Contains 'Java': " + s.contains("Java"));

				System.out.println("Starts with '  He': " + s.startsWith("  He"));
				System.out.println("Ends with 'ld  ': " + s.endsWith("ld  "));

				System.out.println("Index of 'l': " + s.indexOf('l'));
				System.out.println("Last index of 'l': " + s.lastIndexOf('l'));

				System.out.println("Trimmed: \"" + s.trim() + "\"");

				System.out.println("Replace 'l' with '*': " + s.replace('l', '*'));


				String data = "Java,Python,C++,JavaScript";
				String[] langs = data.split(",");
				System.out.print("Split result: ");
				for (String lang : langs) {
					System.out.print(lang + " ");
				}
				System.out.println();

				String empty = "";
				String blank = "   ";
				System.out.println("Is empty: " + empty.isEmpty());
				System.out.println("Is blank (Java 11+): " + blank.isBlank());
			}
		}

