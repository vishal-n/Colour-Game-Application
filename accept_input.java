import java.util.*;

class application
{
	public static void main(String[] args)
	{
		List lst = new ArrayList();

		Scanner sc = new Scanner(System.in);

		while(true)
		{
			System.out.print("Enter a command: ");
			String input_command = sc.nextLine();

			switch(input_command)
			{
				case "+salt": System.out.println("Subscribing salt!");
							  if(!lst.contains("salt"))
							  {
							  	lst.add("salt");
							  }
							  break;

				case "-salt": System.out.println("Unsubscribing salt!");
							  if(lst.contains("salt"))
							  {
							  	lst.remove("salt");
							  }
							  break;

				case "+ink": System.out.println("Subcscribing ink!");
							  if(!lst.contains("ink"))
							  {
							  	lst.add("ink");
							  }
							  break;

				case "-ink": System.out.println("Unsubscribing ink!");
							  if(lst.contains("ink"))
							  {
							  	lst.remove("ink");
							  }
							  break;

				case "+banana": System.out.println("Subscribing banana!");
							  if(!lst.contains("banana"))
							  {
							  	lst.add("banana");
							  }
							  break;

				case "-banana": System.out.println("Unsubscribing banana!");
							  if(lst.contains("banana"))
							  {
							  	lst.remove("banana");
							  }
							  break;

				case "+frog": System.out.println("Subscribing frog!");
							  if(!lst.contains("frog"))
							  {
							  	lst.add("frog");
							  }
							  break;

				case "-frog": System.out.println("Unsubscribing frog!");
							  if(lst.contains("frog"))
							  {
							  	lst.remove("frog");
							  }
							  break;

				case "+blood": System.out.println("Subscribing blood!");
							  if(!lst.contains("blood"))
							  {
							  	lst.add("blood");
							  }
							  break;

				case "-blood": System.out.println("Unsubscribing blood!");
							  if(lst.contains("blood"))
							  {
							  	lst.remove("blood");
							  }
							  break;

				case "+sky": System.out.println("Subscribing sky!");
							  if(!lst.contains("sky"))
							  {
							  	lst.add("sky");
							  }
							  break;

				case "-sky": System.out.println("Unsubscribing sky!");
							  if(lst.contains("sky"))
							  {
							  	lst.remove("sky");
							  }
							  break;

				case "+apple": System.out.println("Subscribing apple!");
							  if(!lst.contains("apple"))
							  {
							  	lst.add("apple");
							  }
							  break;

				case "-apple": System.out.println("Unsubscribing apple!");
							  if(lst.contains("apple"))
							  {
							  	lst.remove("apple");
							  }
							  break;

				case "white": if(lst.contains("salt"))
							  {
							    System.out.println("I’m Salt! I’m sometimes white!");
							  }
							  break;

				case "red": if(lst.contains("blood"))
							{
								System.out.println("I'm Blood! I'm sometimes red!");
							}
							else if(!lst.contains("blood") && lst.contains("apple"))
							{
								System.out.println("I'm Apple! I'm sometimes red!");
							}
							else if(!lst.contains("blood") && !lst.contains("apple") && lst.contains("ink"))
							{
								System.out.println("I'm Ink! I'm sometimes red!");
							}
							break;

				case "black": if(lst.contains("ink"))
							  {
							  	System.out.println("I'm Ink! I'm sometimes black!");
							  }
							  else if(!lst.contains("ink") && lst.contains("sky"))
							  {
							  	System.out.println("I'm Sky! I'm sometimes black!");
							  }
							  break;

				case "green": if(lst.contains("banana"))
							  {
							  	System.out.println("I'm Banana! I'm sometimes green");
							  }
							  else if(!lst.contains("banana") && lst.contains("apple"))
							  {
							  	System.out.println("I'm Apple! I'm sometimes green");
							  }
							  break;

				case "yellow": if(lst.contains("frog"))
							   {
							   	 System.out.println("I'm Frog! I'm yellow today");
							   }
							   else if(!lst.contains("frog") && lst.contains("banana"))
							   {
							   	 System.out.println("I'm Banana! I'm sometimes yellow");
							   }
							   break;

				case "blue": if(lst.contains("sky"))
							 {
							 	System.out.println("I'm Sky! I'm sometimes blue");
							 }
							 else if(!lst.contains("sky") && lst.contains("frog"))
							 {
							 	System.out.println("I'm Frog! I'm blue today");
							 }
							 break;
				
				case "list": System.out.println(lst);
							 break;

				case "exit": return;
			}
		}
	}
}