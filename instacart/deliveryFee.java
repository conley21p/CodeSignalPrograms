/*
To make sure that groceries can always be delivered, Instacart tries 
to equally distribute delivery requests throughout the day by including 
an additional delivery fee during busy periods.

Each day is divided into several intervals that do not overlap and cover 
the whole day from 00:00 to 23:59. For each i the delivery fee in the intervals[i] 
equals fees[i].

Given the list of delivery requests deliveries, your task is to check whether 
the delivery fee is directly correlated to the order volume in each interval 
i.e. the interval_fee / interval_deliveries value is constant for each interval 
throughout the day.
*/

boolean deliveryFee(int[] i, int[] f, int[][] d) {
		int[] iDelivs  = new int[f.length];
		for(int x = 0; x < d.length;x++) {
			int y = f.length-1;
            System.out.println(d[x][0]*100+d[x][1]);
			while(y>=0) {
				if(d[x][0]*100+d[x][1]>=i[y]*100) {
					iDelivs[y]+=1;
					y=-1;
				}else {
					y--;
				}
			}
		}
        for(int x = 0; x<iDelivs.length;x++){
            System.out.println("id:" + iDelivs[x]);
        }
		for(int x = 1; x<f.length;x++) {
			if(iDelivs[x]*f[x-1]!=iDelivs[x-1]*f[x]) {
				System.out.println(x+"x  "+iDelivs[x]*f[x-1]+ "  "+iDelivs[x-1]*f[x]);
				return false;
            }
		}
		return true;
	}
	