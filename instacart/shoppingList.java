/*As part of an Instacart beta testing group, Sara is trying out a brand new 
feature that automatically estimates the combined cost of the items in her 
handwritten shopping list. Her list contains both items and their prices. 
All Sara has to do is snap a photo of her list with the Instacart app, 
and she gets a quick estimate of what everything will cost.

Sara asked for your help, so it is up to you to devise an algorithm 
that calculates the cost after the image is converted into plain text. 
All you need to do is extract all numbers from the given string items and sum them up.
*/

double shoppingList(String items) {
		StringBuilder r = new StringBuilder();
		double sum = 0;
		for(int i =0; i < items.length();i++) {
			if(Character.isDigit(items.charAt(i))){//if char is number append to r to store value
				r.append(items.charAt(i));
				System.out.println(r);
			}else if(items.charAt(i)=='.'){
				if(items.charAt(i-1)=='.'){//if this is the second consectitive . then add r to sum and clear r
					if(r.length()>1) {
						sum+=Double.parseDouble(r.toString());
					}r = new StringBuilder();
				}else {//if this is the first . the add to r value
					r.append('.');
				}
			}else {//if it is not a number we need to add then add r to sum if it is greater than 1 and then clear r
				if(r.length()>0)sum+=Double.parseDouble(r.toString());
				r = new StringBuilder();
			}
			if(r.length()>0&&i==items.length()-1)sum+=(double)Double.parseDouble(r.toString());
		}
		return sum;
	}