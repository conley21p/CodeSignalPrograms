/*
After recently joining Instacart's beta testing developer group, 
you decide to experiment with their new API. You know that the API returns 
item-specific display-ready strings like 10.0% higher than in-store or 5.0% 
lower than in-store that inform users when the price of an item is different 
from the one in-store. But you want to extend this functionality by giving 
people a better sense of how much more they will be paying for their entire shopping cart.

Your app lets a user decide the total amount x they are willing to pay via 
Instacart over in-store prices. This you call their price sensitivity.

Your job is to determine whether a given customer will be willing to pay 
for the given items in their cart based on their stated price sensitivity x.
*/


boolean isAdmissibleOverpayment(double[] p, String[] s, double x) {
		DecimalFormat df = new DecimalFormat("#.####");
		for(int i =0; i < p.length; i++) {
			if(s[i].charAt(s[i].indexOf('%')+2)=='h') {
				x+=Double.parseDouble(df.format((p[i]/(1+(.01*Double.parseDouble(s[i].substring(0,s[i].indexOf('%'))))))-p[i]));
			}else if(s[i].charAt(s[i].indexOf('%')+2)=='l') {
				x+=-1*Double.parseDouble(df.format(p[i]-(p[i]/(1-(.01*Double.parseDouble(s[i].substring(0,s[i].indexOf('%'))))))));
            }
			x = Double.parseDouble(df.format(x));
		}
		return x>=0;
}