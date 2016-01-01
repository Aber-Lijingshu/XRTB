package com.xrtb.tools;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IABCategories {
	public static final Map<String,String> map = new HashMap<String,String>();
	static {
		map.put("IAB1", "Arts & Entertainment");
		map.put("IAB1-1", "Books & Literature");
		map.put("IAB1-2", "Celebrity Fan/Gossip");
		map.put("IAB1-3", "Fine Art");
		map.put("IAB1-4", "Humor");
		map.put("IAB1-5", "Movies");
		map.put("IAB1-6", "Music");
		map.put("IAB1-7", "Television");
		map.put("IAB2", "Automotive");
		map.put("IAB2-1", "Auto Parts");
		map.put("IAB2-2", "Auto Repair");
		map.put("IAB2-3", "Buying/Selling Cars");
		map.put("IAB2-4", "Car Culture");
		map.put("IAB2-5", "Certified Pre-Owned");
		map.put("IAB2-6", "Convertible");
		map.put("IAB2-7", "Coupe");
		map.put("IAB2-8", "Crossover");
		map.put("IAB2-9", "Diesel");
		map.put("IAB2-10", "Electric Vehicle");
		map.put("IAB2-11", "Hatchback");
		map.put("IAB2-12", "Hybrid");
		map.put("IAB2-13", "Luxury");
		map.put("IAB2-14", "MiniVan");
		map.put("IAB2-15", "Mororcycles");
		map.put("IAB2-16", "Off-Road Vehicles");
		map.put("IAB2-17", "Performance Vehicles");
		map.put("IAB2-18", "Pickup");
		map.put("IAB2-19", "Road-Side Assistance");
		map.put("IAB2-20", "Sedan");
		map.put("IAB2-21", "Trucks & Accessories");
		map.put("IAB2-22", "Vintage Cars");
		map.put("IAB2-23", "Wagon");
		map.put("IAB3", "Business");
		map.put("IAB3-1", "Advertising");
		map.put("IAB3-2", "Agriculture");
		map.put("IAB3-3", "Biotech/Biomedical");
		map.put("IAB3-4", "Business Software");
		map.put("IAB3-5", "Construction");
		map.put("IAB3-6", "Forestry");
		map.put("IAB3-7", "Government");
		map.put("IAB3-8", "Green Solutions");
		map.put("IAB3-9", "Human Resources");
		map.put("IAB3-10", "Logistics");
		map.put("IAB3-11", "Marketing");
		map.put("IAB3-12", "Metals");
		map.put("IAB4", "Careers");
		map.put("IAB4-1", "Career Planning");
		map.put("IAB4-2", "College");
		map.put("IAB4-3", "Financial Aid");
		map.put("IAB4-4", "Job Fairs");
		map.put("IAB4-5", "Job Search");
		map.put("IAB4-6", "Resume Writing/Advice");
		map.put("IAB4-7", "Nursing");
		map.put("IAB4-8", "Scholarships");
		map.put("IAB4-9", "Telecommuting");
		map.put("IAB4-10", "U.S. Military");
		map.put("IAB4-11", "Career Advice");
		map.put("IAB5", "Education");
		map.put("IAB5-1", "7-12 Education");
		map.put("IAB5-2", "Adult Education");
		map.put("IAB5-3", "Art History");
		map.put("IAB5-4", "Colledge Administration");
		map.put("IAB5-5", "College Life");
		map.put("IAB5-6", "Distance Learning");
		map.put("IAB5-7", "English as a 2nd Language");
		map.put("IAB5-8", "Language Learning");
		map.put("IAB5-9", "Graduate School");
		map.put("IAB5-10", "Homeschooling");
		map.put("IAB5-11", "Homework/Study Tips");
		map.put("IAB5-12", "K-6 Educators");
		map.put("IAB5-13", "Private School");
		map.put("IAB5-14", "Special Education");
		map.put("IAB5-15", "Studying Business");
		map.put("IAB6", "Family & Parenting");
		map.put("IAB6-1", "Adoption");
		map.put("IAB6-2", "Babies & Toddlers");
		map.put("IAB6-3", "Daycare/Pre School");
		map.put("IAB6-4", "Family Internet");
		map.put("IAB6-5", "Parenting - K-6 Kids");
		map.put("IAB6-6", "Parenting teens");
		map.put("IAB6-7", "Pregnancy");
		map.put("IAB6-8", "Special Needs Kids");
		map.put("IAB6-9", "Eldercare");
		map.put("IAB7", "Health & Fitness");
		map.put("IAB7-1", "Exercise");
		map.put("IAB7-2", "A.D.D.");
		map.put("IAB7-3", "AIDS/HIV");
		map.put("IAB7-4", "Allergies");
		map.put("IAB7-5", "Alternative Medicine");
		map.put("IAB7-6", "Arthritis");
		map.put("IAB7-7", "Asthma");
		map.put("IAB7-8", "Autism/PDD");
		map.put("IAB7-9", "Bipolar Disorder");
		map.put("IAB7-10", "Brain Tumor");
		map.put("IAB7-11", "Cancer");
		map.put("IAB7-12", "Cholesterol");
		map.put("IAB7-13", "Chronic Fatigue Syndrome");
		map.put("IAB7-14", "Chronic Pain");
		map.put("IAB7-15", "Cold & Flu");
		map.put("IAB7-16", "Deafness");
		map.put("IAB7-17", "Dental Care");
		map.put("IAB7-18", "Depression");
		map.put("IAB7-19", "Dermatology");
		map.put("IAB7-20", "Diabetes");
		map.put("IAB7-21", "Epilepsy");
		map.put("IAB7-22", "GERD/Acid Reflux");
		map.put("IAB7-23", "Headaches/Migraines");
		map.put("IAB7-24", "Heart Disease");
		map.put("IAB7-25", "Herbs for Health");
		map.put("IAB7-26", "Holistic Healing");
		map.put("IAB7-27", "IBS/Crohn's Disease");
		map.put("IAB7-28", "Incest/Abuse Support");
		map.put("IAB7-29", "Incontinence");
		map.put("IAB7-30", "Infertility");
		map.put("IAB7-31", "Men's Health");
		map.put("IAB7-32", "Nutrition");
		map.put("IAB7-33", "Orthopedics");
		map.put("IAB7-34", "Panic/Anxiety Disorders");
		map.put("IAB7-35", "Pediatrics");
		map.put("IAB7-36", "Physical Therapy");
		map.put("IAB7-37", "Psychology/Psychiatry");
		map.put("IAB7-38", "Senor Health");
		map.put("IAB7-39", "Sexuality");
		map.put("IAB7-40", "Sleep Disorders");
		map.put("IAB7-41", "Smoking Cessation");
		map.put("IAB7-42", "Substance Abuse");
		map.put("IAB7-43", "Thyroid Disease");
		map.put("IAB7-44", "Weight Loss");
		map.put("IAB7-45", "Women's Health");
		map.put("IAB8", "Food & Drink");
		map.put("IAB8-1", "American Cuisine");
		map.put("IAB8-2", "Barbecues & Grilling");
		map.put("IAB8-3", "Cajun/Creole");
		map.put("IAB8-4", "Chinese Cuisine");
		map.put("IAB8-5", "Cocktails/Beer");
		map.put("IAB8-6", "Coffee/Tea");
		map.put("IAB8-7", "Cuisine-Specific");
		map.put("IAB8-8", "Desserts & Baking");
		map.put("IAB8-9", "Dining Out");
		map.put("IAB8-10", "Food Allergies");
		map.put("IAB8-11", "French Cuisine");
		map.put("IAB8-12", "Health/Lowfat Cooking");
		map.put("IAB8-13", "Italian Cuisine");
		map.put("IAB8-14", "Japanese Cuisine");
		map.put("IAB8-15", "Mexican Cuisine");
		map.put("IAB8-16", "Vegan");
		map.put("IAB8-17", "Vegetarian");
		map.put("IAB8-18", "Wine");
		map.put("IAB9", "Hobbies & Interests");
		map.put("IAB9-1", "Art/Technology");
		map.put("IAB9-2", "Arts & Crafts");
		map.put("IAB9-3", "Beadwork");
		map.put("IAB9-4", "Birdwatching");
		map.put("IAB9-5", "Board Games/Puzzles");
		map.put("IAB9-6", "Candle & Soap Making");
		map.put("IAB9-7", "Card Games");
		map.put("IAB9-8", "Chess");
		map.put("IAB9-9", "Cigars");
		map.put("IAB9-10", "Collecting");
		map.put("IAB9-11", "Comic Books");
		map.put("IAB9-12", "Drawing/Sketching");
		map.put("IAB9-13", "Freelance Writing");
		map.put("IAB9-14", "Genealogy");
		map.put("IAB9-15", "Getting Published");
		map.put("IAB9-16", "Guitar");
		map.put("IAB9-17", "Home Recording");
		map.put("IAB9-18", "Investors & Patents");
		map.put("IAB9-19", "Jewelry Making");
		map.put("IAB9-20", "Magic & Illusion");
		map.put("IAB9-21", "Needlework");
		map.put("IAB9-22", "Painting");
		map.put("IAB9-23", "Photography");
		map.put("IAB9-24", "Radio");
		map.put("IAB9-25", "Roleplaying Games");
		map.put("IAB9-26", "Sci-Fi & Fantasy");
		map.put("IAB9-27", "Scrapbooking");
		map.put("IAB9-28", "Screenwriting");
		map.put("IAB9-29", "Stamps & Coins");
		map.put("IAB9-30", "Video & Computer Games");
		map.put("IAB9-31", "Woodworking");
		map.put("IAB10", "Home & Garden");
		map.put("IAB10-1", "Appliances");
		map.put("IAB10-2", "Entertaining");
		map.put("IAB10-3", "Environmental Safety");
		map.put("IAB10-4", "Gardening");
		map.put("IAB10-5", "Home Repair");
		map.put("IAB10-6", "Home Theater");
		map.put("IAB10-7", "Interior Decorating");
		map.put("IAB10-8", "Landscaping");
		map.put("IAB10-9", "Remodeling & Construction");
		map.put("IAB11", "Law); Gov't & Politics");
		map.put("IAB11-1", "Immigration");
		map.put("IAB11-2", "Legal Issues");
		map.put("IAB11-3", "U.S. Government Resources");
		map.put("IAB11-4", "Politics");
		map.put("IAB11-5", "Commentary");
		map.put("IAB12", "News");
		map.put("IAB12-1", "International News");
		map.put("IAB12-2", "National News");
		map.put("IAB12-3", "Local News");
		map.put("IAB13", "Personal Finance");
		map.put("IAB13-1", "Beginning Investing");
		map.put("IAB13-2", "Credit/Debt & Loans");
		map.put("IAB13-3", "Financial News");
		map.put("IAB13-4", "Financial Planning");
		map.put("IAB13-5", "Hedge Fund");
		map.put("IAB13-6", "Insurance");
		map.put("IAB13-7", "Investing");
		map.put("IAB13-8", "Mutual Funds");
		map.put("IAB13-9", "Options");
		map.put("IAB13-10", "Retirement Planning");
		map.put("IAB13-11", "Stocks");
		map.put("IAB13-12", "Tax Planning");
		map.put("IAB14", "Society");
		map.put("IAB14-1", "Dating");
		map.put("IAB14-2", "Divorce Support");
		map.put("IAB14-3", "Gay Life");
		map.put("IAB14-4", "Marriage");
		map.put("IAB14-5", "Senior Living");
		map.put("IAB14-6", "Teens");
		map.put("IAB14-7", "Weddings");
		map.put("IAB14-8", "Ethnic Specific");
		map.put("IAB15", "Science");
		map.put("IAB15-1", "Astrology");
		map.put("IAB15-2", "Biology");
		map.put("IAB15-3", "Chemistry");
		map.put("IAB15-4", "Geology");
		map.put("IAB15-5", "Paranormal Phenomena");
		map.put("IAB15-6", "Physics");
		map.put("IAB15-7", "Space/Astronomy");
		map.put("IAB15-8", "Geography");
		map.put("IAB15-9", "Botany");
		map.put("IAB15-10", "Weather");
		map.put("IAB16", "Pets");
		map.put("IAB16-1", "Aquariums");
		map.put("IAB16-2", "Birds");
		map.put("IAB16-3", "Cats");
		map.put("IAB16-4", "Dogs");
		map.put("IAB16-5", "Large Animals");
		map.put("IAB16-6", "Reptiles");
		map.put("IAB16-7", "Veterinary Medicine");
		map.put("IAB17", "Sports");
		map.put("IAB17-1", "Auto Racing");
		map.put("IAB17-2", "Baseball");
		map.put("IAB17-3", "Bicycling");
		map.put("IAB17-4", "Bodybuilding");
		map.put("IAB17-5", "Boxing");
		map.put("IAB17-6", "Canoeing/Kayaking");
		map.put("IAB17-7", "Cheerleading");
		map.put("IAB17-8", "Climbing");
		map.put("IAB17-9", "Cricket");
		map.put("IAB17-10", "Figure Skating");
		map.put("IAB17-11", "Fly Fishing");
		map.put("IAB17-12", "Football");
		map.put("IAB17-13", "Freshwater Fishing");
		map.put("IAB17-14", "Game & Fish");
		map.put("IAB17-15", "Golf");
		map.put("IAB17-16", "Horse Racing");
		map.put("IAB17-17", "Horses");
		map.put("IAB17-18", "Hunting/Shooting");
		map.put("IAB17-19", "Inline Skating");
		map.put("IAB17-20", "Martial Arts");
		map.put("IAB17-21", "Mountain Biking");
		map.put("IAB17-22", "NASCAR Racing");
		map.put("IAB17-23", "Olympics");
		map.put("IAB17-24", "Paintball");
		map.put("IAB17-25", "Power & Motorcycles");
		map.put("IAB17-26", "Pro Basketball");
		map.put("IAB17-27", "Pro Ice Hockey");
		map.put("IAB17-28", "Rodeo");
		map.put("IAB17-29", "Rugby");
		map.put("IAB17-30", "Running/Jogging");
		map.put("IAB17-31", "Sailing");
		map.put("IAB17-32", "Saltwater Fishing");
		map.put("IAB17-33", "Scuba Diving");
		map.put("IAB17-34", "Skateboarding");
		map.put("IAB17-35", "Skiing");
		map.put("IAB17-36", "Snowboarding");
		map.put("IAB17-37", "Surfing/Bodyboarding");
		map.put("IAB17-38", "Swimming");
		map.put("IAB17-39", "Table Tennis/Ping-Pong");
		map.put("IAB17-40", "Tennis");
		map.put("IAB17-41", "Volleyball");
		map.put("IAB17-42", "Walking");
		map.put("IAB17-43", "Waterski/Wakeboard");
		map.put("IAB17-44", "World Soccer");
		map.put("IAB18", "Style & Fashion");
		map.put("IAB18-1", "Beauty");
		map.put("IAB18-2", "Body Art");
		map.put("IAB18-3", "Fashion");
		map.put("IAB18-4", "Jewelry");
		map.put("IAB18-5", "Clothing");
		map.put("IAB18-6", "Accessories");
		map.put("IAB19", "Technology & Computing");
		map.put("IAB19-1", "3-D Graphics");
		map.put("IAB19-2", "Animation");
		map.put("IAB19-3", "Antivirus Software");
		map.put("IAB19-4", "C/C++");
		map.put("IAB19-5", "Cameras & Camcorders");
		map.put("IAB19-6", "Cell Phones");
		map.put("IAB19-7", "Computer Certification");
		map.put("IAB19-8", "Computer Networking");
		map.put("IAB19-9", "Computer Peripherals");
		map.put("IAB19-10", "Computer Reviews");
		map.put("IAB19-11", "Data Centers");
		map.put("IAB19-12", "Databases");
		map.put("IAB19-13", "Desktop Publishing");
		map.put("IAB19-14", "Desktop Video");
		map.put("IAB19-15", "Email");
		map.put("IAB19-16", "Graphics Software");
		map.put("IAB19-17", "Home Video/DVD");
		map.put("IAB19-18", "Internet Technology");
		map.put("IAB19-19", "Java");
		map.put("IAB19-20", "JavaScript");
		map.put("IAB19-21", "Mac Support");
		map.put("IAB19-22", "MP3/MIDI");
		map.put("IAB19-23", "Net Conferencing");
		map.put("IAB19-24", "Net for Beginners");
		map.put("IAB19-25", "Network Security");
		map.put("IAB19-26", "Palmtops/PDAs");
		map.put("IAB19-27", "PC Support");
		map.put("IAB19-28", "Portable");
		map.put("IAB19-29", "Entertainment");
		map.put("IAB19-30", "Shareware/Freeware");
		map.put("IAB19-31", "Unix");
		map.put("IAB19-32", "Visual Basic");
		map.put("IAB19-33", "Web Clip Art");
		map.put("IAB19-34", "Web Design/HTML");
		map.put("IAB19-35", "Web Search");
		map.put("IAB19-36", "Windows");
		map.put("IAB20", "Travel");
		map.put("IAB20-1", "Adventure Travel");
		map.put("IAB20-2", "Africa");
		map.put("IAB20-3", "Air Travel");
		map.put("IAB20-4", "Australia & New Zealand");
		map.put("IAB20-5", "Bed & Breakfasts");
		map.put("IAB20-6", "Budget Travel");
		map.put("IAB20-7", "Business Travel");
		map.put("IAB20-8", "By US Locale");
		map.put("IAB20-9", "Camping");
		map.put("IAB20-10", "Canada");
		map.put("IAB20-11", "Caribbean");
		map.put("IAB20-12", "Cruises");
		map.put("IAB20-13", "Eastern Europe");
		map.put("IAB20-14", "Europe");
		map.put("IAB20-15", "France");
		map.put("IAB20-16", "Greece");
		map.put("IAB20-17", "Honeymoons/Getaways");
		map.put("IAB20-18", "Hotels");
		map.put("IAB20-19", "Italy");
		map.put("IAB20-20", "Japan");
		map.put("IAB20-21", "Mexico & Central America");
		map.put("IAB20-22", "National Parks");
		map.put("IAB20-23", "South America");
		map.put("IAB20-24", "Spas");
		map.put("IAB20-25", "Theme Parks");
		map.put("IAB20-26", "Traveling with Kids");
		map.put("IAB20-27", "United Kingdom");
		map.put("IAB21", "Real Estate");
		map.put("IAB21-1", "Apartments");
		map.put("IAB21-2", "Architects");
		map.put("IAB21-3", "Buying/Selling Homes");
		map.put("IAB22", "Shopping");
		map.put("IAB22-1", "Contests & Freebies");
		map.put("IAB22-2", "Couponing");
		map.put("IAB22-3", "Comparison");
		map.put("IAB22-4", "Engines");
		map.put("IAB23", "Religion & Spirituality");
		map.put("IAB23-1", "Alternative Religions");
		map.put("IAB23-2", "Atheism/Agnosticism");
		map.put("IAB23-3", "Buddhism");
		map.put("IAB23-4", "Catholicism");
		map.put("IAB23-5", "Christianity");
		map.put("IAB23-6", "Hinduism");
		map.put("IAB23-7", "Islam");
		map.put("IAB23-8", "Judaism");
		map.put("IAB23-9", "Latter-Day Saints");
		map.put("IAB23-10", "Pagan/Wiccan");
		map.put("IAB24", "Uncategorized");
		map.put("IAB25", "Non-Standard Content");
		map.put("IAB25-1", "Unmoderated UGC");
		map.put("IAB25-2", "Extreme Graphic/Explicit Violence");
		map.put("IAB25-3", "Pornography");
		map.put("IAB25-4", "Profane Content");
		map.put("IAB25-5", "Hate Content");
		map.put("IAB25-6", "Under Construction");
		map.put("IAB25-7", "Incentivized");
		map.put("IAB26", "Illegal Content");
		map.put("IAB26-1", "Illegal Content");
		map.put("IAB26-2", "Warez");
		map.put("IAB26-3", "Spyware/Malware");
		map.put("IAB26-4", "CopyrightInfringement");
		}
	
	public static String getIAB(String key) {
		String str = map.get(key);
		if (str == null) {
			Set<String> set = map.keySet();
			Iterator<String> it = set.iterator();
			while(it.hasNext()) {
				String s = it.next();
				String test = map.get(s);
				if (test.equalsIgnoreCase(key))
					return s;		
			}
		}
		return null;
	}
	
	public static String get(String key) {
		return map.get(key);
	}
}
