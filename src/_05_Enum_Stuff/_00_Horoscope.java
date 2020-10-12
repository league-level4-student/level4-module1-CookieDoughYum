package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	public static void take(Zodiac zodiac){
		switch(zodiac) {
		// Notice that 'DataTypes.' is not requires when accessing categories
		case ARIES:{
			System.out.println("GEMINI");
			break;
		}
		case TAURUS:{
			System.out.println("CANCER");
			break;
		}
		case GEMINI:{
			System.out.println("VIRGO");
			break;
		}
		case CANCER:{
			System.out.println("SCORPIO");
			break;
		}
		case LEO:{
			System.out.println("ARIES");
			break;
		}
		case VIRGO:{
			System.out.println("PISCES");
			break;
		}
		case LIBRA:{
			System.out.println("AQUARIUS");
			break;
		}
		case SCORPIO:{
			System.out.println("TAURUS");
			break;
		}
		case SAGITTARIUS:{
			System.out.println("CAPRICORN");
			break;
		}
		case CAPRICORN:{
			System.out.println("LEO");
			break;
		}
		case AQUARIUS:{
			System.out.println("LIBRIA");
			break;
		}
		case PISCES:{
			System.out.println("GEMINI");
			break;
		}
		}
	}
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		take(Zodiac.LIBRA);
	}
}
