package org.tnsif.client;

import org.tnsif.application.GSNormalAcc;
import org.tnsif.application.GSPrimeAcc;
import org.tnsif.application.GSShopFactoryAcc;
import org.tnsif.framework.ShopFactory;

public class Client {
	public static void main(String[] args) {
		ShopFactory f=new GSShopFactoryAcc();
		GSPrimeAcc p=new GSPrimeAcc(1234, " Dnyaneshwar bhalerao", 1060f, true);
		GSNormalAcc n=new GSNormalAcc(1134, " Bhushan shinde", 1060f, 60f);
		
		System.out.println("Prime Acc");
		System.out.println(p);
		p.bookProduct(p.getCharges());
		
		System.out.println("Normal Acc");
		System.out.println(n);
		n.bookProduct(n.getCharges());
	}
	
}


/*OUTPUT
* Prime Acc
GSPrimeAcc [toString()=PrimeAcc [isPrime=true]]
Acc no1234 Acc name Dnyaneshwar bhalerao Delivery charges1060.0
Normal Acc
GSNormalAcc [toString()=NormalAcc [deliveryCharges=60.0]]
Acc no1134 Acc name Bhushan shinde Delivery charges1060.0 DeliveryCharges:1120.0
*/