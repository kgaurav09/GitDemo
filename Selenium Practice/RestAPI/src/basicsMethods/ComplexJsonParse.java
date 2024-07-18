package basicsMethods;

import org.testng.Assert;

import files.Payload;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {

	public static void main(String[] args) {
		int TotalSum=0;

		JsonPath js = new JsonPath(Payload.CourcePrice());
		int CourseCount = js.getInt("courses.size()");
		System.out.println("Total number of cources present " + js.getInt("courses.size()"));

		System.out.println("Print title of 1st cource " + js.getString("courses[0].title"));

		System.out.println("Purchase amount " + js.getInt("dashboard.purchaseAmount"));

		for (int i = 0; i < CourseCount; i++) {
			String CourcesTitle = js.get("courses[" + i + "].title");
			System.out.println(CourcesTitle);
			int price = js.get("courses[" + i + "].price");
			System.out.println(price);

		}

		System.out.println("No. of copies sold by RPA " + js.getInt("courses[2].copies"));

		for (int i = 0; i < CourseCount; i++) {
			String CourcesTitle = js.get("courses[" + i + "].title");
			if (CourcesTitle.equalsIgnoreCase("RPA")) {
				System.out.println("No. of copies sold by RPA " + js.get("courses[" + i + "].copies").toString());
				break;
			}

		}

		int ToatlPurchaseAmount = js.getInt("dashboard.purchaseAmount");

		for (int i = 0; i<CourseCount; i++) {

			int price=js.get("courses["+i+"].price");
			
			int copies=js.get("courses["+i+"].copies");
			
			int TotalExpectedPAM=price*copies;
			TotalSum=TotalSum+TotalExpectedPAM;
			//System.out.println(TotalExpectedPAM);
			
			
			
		}
		System.out.println(TotalSum);
		Assert.assertEquals(ToatlPurchaseAmount, TotalSum);

	}

}
