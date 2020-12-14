/*
Question:
	Instacart customers are able to set the delivery window during which they want to 
receive their groceries. There are always plenty of shoppers in the area ready to take a 
customer's order, but unfortunately they can't always do it right away. Before taking 
an order a shopper wants to ensure they will make it in time. They also don't want to 
stay idle, so arriving early isn't an option either.

Our task is to implement an algorithm that determines whether shoppers should 
take the given order or not.
For each shopper you know their travel speed, distance to the store and the estimated 
amount of time they will spend there. Figure out which of them can take the order, 
assuming it is known when the customer wants to receive the groceries and the distance 
between their house and the store.

*/

boolean[] delivery(int[] order, int[][] shoppers) {
		boolean[] result = new boolean[shoppers.length];
		for(int i = 0; i< shoppers.length; i++) {
			result[i] = ((order[0]+shoppers[i][0]+0.0)/shoppers[i][1])+shoppers[i][2] >= order[1]  && ((order[0]+shoppers[i][0]+0.0)/shoppers[i][1])+shoppers[i][2] <=   order[1]+order[2];	
		}
		return result;
}