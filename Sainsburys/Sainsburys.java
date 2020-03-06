package Sainsburys;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import java.io.IOException;
import java.text.DecimalFormat;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Sainsburys {

static void results() throws JSONException, IOException{
		
Document doc0 = Jsoup.connect("https://jsainsburyplc.github.io/serverside-test/site/www.sainsburys.co.uk/shop/gb/groceries/berries-cherries-currants/sainsburys-british-strawberries-400g.html").get();
Document doc1 = Jsoup.connect("https://jsainsburyplc.github.io/serverside-test/site/www.sainsburys.co.uk/shop/gb/groceries/berries-cherries-currants/sainsburys-blueberries-200g.html").get();
Document doc2 = Jsoup.connect("https://jsainsburyplc.github.io/serverside-test/site/www.sainsburys.co.uk/shop/gb/groceries/berries-cherries-currants/sainsburys-raspberries-225g.html").get();
Document doc3 = Jsoup.connect("https://jsainsburyplc.github.io/serverside-test/site/www.sainsburys.co.uk/shop/gb/groceries/berries-cherries-currants/sainsburys-blackberries--sweet-150g.html").get();
Document doc4 = Jsoup.connect("https://jsainsburyplc.github.io/serverside-test/site/www.sainsburys.co.uk/shop/gb/groceries/berries-cherries-currants/sainsburys-blueberries--so-organic-150g.html").get();
Document doc5 = Jsoup.connect("https://jsainsburyplc.github.io/serverside-test/site/www.sainsburys.co.uk/shop/gb/groceries/berries-cherries-currants/sainsburys-raspberries--taste-the-difference-150g.html").get();
Document doc6 = Jsoup.connect("https://jsainsburyplc.github.io/serverside-test/site/www.sainsburys.co.uk/shop/gb/groceries/berries-cherries-currants/sainsburys-cherries-350g.html").get();
Document doc7 = Jsoup.connect("https://jsainsburyplc.github.io/serverside-test/site/www.sainsburys.co.uk/shop/gb/groceries/berries-cherries-currants/sainsburys-blackberries--tangy-150g.html").get();
Document doc8 = Jsoup.connect("https://jsainsburyplc.github.io/serverside-test/site/www.sainsburys.co.uk/shop/gb/groceries/berries-cherries-currants/sainsburys-mixed-berries-300g.html").get();
Document doc9 = Jsoup.connect("https://jsainsburyplc.github.io/serverside-test/site/www.sainsburys.co.uk/shop/gb/groceries/berries-cherries-currants/sainsburys-mixed-berry-twin-pack-200g-7696255-p-44.html").get();
Document doc10 = Jsoup.connect("https://jsainsburyplc.github.io/serverside-test/site/www.sainsburys.co.uk/shop/gb/groceries/berries-cherries-currants/sainsburys-redcurrants-150g.html").get();
Document doc11 = Jsoup.connect("https://jsainsburyplc.github.io/serverside-test/site/www.sainsburys.co.uk/shop/gb/groceries/berries-cherries-currants/sainsburys-cherry-punnet--taste-the-difference-250g.html").get();
Document doc12 = Jsoup.connect("https://jsainsburyplc.github.io/serverside-test/site/www.sainsburys.co.uk/shop/gb/groceries/berries-cherries-currants/sainsburys-blackcurrants-150g.html").get();
Document doc13 = Jsoup.connect("https://jsainsburyplc.github.io/serverside-test/site/www.sainsburys.co.uk/shop/gb/groceries/berries-cherries-currants/sainsburys-british-cherry---strawberry-pack-600g.html").get();
//each document connects to a page containing each item 
 
double gross = 1.75 + 1.75 + 1.75 + 1.50 + 2.00 + 2.50 + 2.50 + 1.50 + 3.50 + 2.75 + 2.50 + 2.50 + 1.75 + 4.00;//prices found using scraping
double vat = (1.75*0.2) + (1.75*0.2) + (1.75*0.2) + (1.50*0.2) + (2.00*0.2) + (2.50*0.2) + (2.50*0.2) + (1.50*0.2) + (3.50*0.2) + (2.75*0.2) + (2.50*0.2) + (2.50*0.2) + (1.75*0.2) + (4.00*0.2);
DecimalFormat df = new DecimalFormat("#.00");

String title = doc0.title();
Element description = doc0.select("div.productText").first();
String unit_price =doc0.select("p.pricePerUnit").first().text();
Element kcal_per_100g = doc0.select("td.nutritionLevel1").first();
		      
String title1 = doc1.title(); 
Element description1 = doc1.select("div.productText").first();
String unit_price1 =doc1.select("p.pricePerUnit").first().text();
Element kcal_per_100g1 = doc1.select("td.tableRow0").first();
		      
String title2 = doc2.title();
Element description2 = doc2.select("div.productText").first();
String unit_price2 =doc2.select("p.pricePerUnit").first().text();
Element kcal_per_100g2 = doc2.select("td.tableRow0").first();
		      
String title3 = doc3.title();
Element description3 = doc3.select("div.productText").first();
String unit_price3 =doc3.select("p.pricePerUnit").first().text();
Element kcal_per_100g3 = doc3.select("tr.tableRow0").first();
		      
String title4 = doc4.title();
Element description4 = doc4.select("div.productText").first();
String unit_price4 =doc4.select("p.pricePerUnit").first().text();
Element kcal_per_100g4 = doc4.select("tr.tableRow0").first();
		      
String title5 = doc5.title();
Element description5 = doc5.select("div.productText").first();
String unit_price5 =doc5.select("p.pricePerUnit").first().text();
Element kcal_per_100g5 = doc5.select("td.tableRow0").first();
		      
String title6 = doc6.title();
Element description6 = doc6.select("div.productText").first();
String unit_price6 =doc6.select("p.pricePerUnit").first().text();
Element kcal_per_100g6 = doc6.select("tr.tableRow0").first();
		      
String title7 = doc7.title();
Element description7 = doc7.select("div.productText").first();
String unit_price7 =doc7.select("p.pricePerUnit").first().text();
Element kcal_per_100g7 = doc7.select("td.tableRow0").first();
		      
String title8 = doc8.title();
Element description8 = doc8.select("div.productText").first();
String unit_price8 =doc8.select("p.pricePerUnit").first().text();
		      
String title9 = doc9.title();
Element description9 = doc9.select("div.productText").first();
String unit_price9 =doc9.select("p.pricePerUnit").first().text();
		      
String title10 = doc10.title();
Element description10 = doc10.select("div.productText").first();
String unit_price10 =doc10.select("p.pricePerUnit").first().text();
Element kcal_per_100g10 = doc10.select("td.tableRow0").first();
		      
String title11 = doc11.title();
Element description11 = doc11.select("div.productText").first();
String unit_price11 =doc11.select("p.pricePerUnit").first().text();
Element kcal_per_100g11 = doc11.select("td.tableRow0").first();
		      
String title12 = doc12.title();
Element description12 = doc12.select("div.productText").first();
String unit_price12 =doc12.select("p.pricePerUnit").first().text();
		      
String title13 = doc13.title();
Element description13 = doc13.select("div.productText").first();
String unit_price13 =doc13.select("p.pricePerUnit").first().text();

		      
JSONObject strawberry = new JSONObject();

strawberry.put("Description", description.text());
strawberry.put("unit_price", unit_price);
strawberry.put("Title", title);
strawberry.put("kcal_per_100g",kcal_per_100g.text());
		 		 
JSONObject blueberry = new JSONObject();
		 
blueberry.put("Description", description1.text());
blueberry.put("unit_price", unit_price1);
blueberry.put("Title", title1);
blueberry.put("kcal_per_100g",kcal_per_100g1.text());
		
JSONObject raspberry = new JSONObject();
		 
raspberry.put("Description", description2.text());
raspberry.put("unit_price", unit_price2);
raspberry.put("Title", title2);
raspberry.put("kcal_per_100g",kcal_per_100g2.text());
		
JSONObject blackberry = new JSONObject();
		 
blackberry.put("Description", description3.text());
blackberry.put("unit_price", unit_price3);
blackberry.put("Title", title3);
blackberry.put("kcal_per_100g",kcal_per_100g3.text());
		
JSONObject blueberryorg = new JSONObject();//Organic blueberries
		 
blueberryorg.put("Description", description4.text());
blueberryorg.put("unit_price", unit_price4);
blueberryorg.put("Title", title4);
blueberryorg.put("kcal_per_100g",kcal_per_100g4.text());
				
JSONObject raspberryttd = new JSONObject();//Raspberry Taste the Difference
		 
raspberryttd.put("Description", description5.text());
raspberryttd.put("unit_price", unit_price5);
raspberryttd.put("Title", title5);
raspberryttd.put("kcal_per_100g",kcal_per_100g5.text());
				
JSONObject cherry = new JSONObject();
		 
cherry.put("Description", description6.text());
cherry.put("unit_price", unit_price6);
cherry.put("Title", title6);
cherry.put("kcal_per_100g",kcal_per_100g6.text());
		
JSONObject blackberrytangy = new JSONObject();
		 
blackberrytangy.put("Description", description7.text());
blackberrytangy.put("unit_price", unit_price7);
blackberrytangy.put("Title", title7);
blackberrytangy.put("kcal_per_100g",kcal_per_100g7.text());
				
JSONObject mixedberries = new JSONObject();
		 
mixedberries.put("Description", description8.text());
mixedberries.put("unit_price", unit_price8);
mixedberries.put("Title", title8);		
		
JSONObject mixedberrytp = new JSONObject();//Mixed berry two pack
		 
mixedberrytp.put("Description", description9.text());
mixedberrytp.put("unit_price", unit_price9);
mixedberrytp.put("Title", title9);
		
JSONObject redcurrants = new JSONObject();
		 
redcurrants.put("Description", description10.text());
redcurrants.put("unit_price", unit_price10);
redcurrants.put("Title", title10);
redcurrants.put("kcal_per_100g",kcal_per_100g10.text());
			
JSONObject cherrypunnetttd = new JSONObject();//Cherry punnet taste the difference  
		 
cherrypunnetttd.put("Description", description11.text());
cherrypunnetttd.put("unit_price", unit_price11);
cherrypunnetttd.put("Title", title11);
cherrypunnetttd.put("kcal_per_100g",kcal_per_100g11.text());
				
JSONObject blackcurrant = new JSONObject();
		 
blackcurrant.put("Description", description12.text());
blackcurrant.put("unit_price", unit_price12);
blackcurrant.put("Title", title12);
		 		 
JSONObject cherryandstrawberry = new JSONObject();
		 
cherryandstrawberry.put("Description", description13.text());
cherryandstrawberry.put("unit_price", unit_price13);
cherryandstrawberry.put("Title", title13);

JSONObject total = new JSONObject();

total.put("Gross", df.format(gross));//returns gross at two decimal places
total.put("VAT", df.format(vat));//returns vat at two decimal places
		
				
JSONArray sainsburys = new JSONArray();//all JSON Objects contained in JSON Array
sainsburys.put(strawberry);
sainsburys.put(blueberry);
sainsburys.put(raspberry);
sainsburys.put(blackberry);
sainsburys.put(blueberryorg);
sainsburys.put(raspberryttd);
sainsburys.put(cherry);
sainsburys.put(blackberrytangy);
sainsburys.put(mixedberries);
sainsburys.put(mixedberrytp);
sainsburys.put(redcurrants);
sainsburys.put(cherrypunnetttd);
sainsburys.put(blackcurrant);
sainsburys.put(cherryandstrawberry);
sainsburys.put(total);
		 
		 
System.out.println(sainsburys); 
	
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws JSONException, IOException {
		// TODO Auto-generated method stub
		
		results();

	}

}
