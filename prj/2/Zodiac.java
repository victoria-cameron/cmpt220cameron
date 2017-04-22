//file: Zodiac.java
//author: Victoria Cameron
//course: CMPT 220
//assignment: Project 2
//due date: May, 2017
//version: 0.4

public class Zodiac{
  int month = 1;
  int day = 1;
  int year = 1900;
  String cZodiac = new String ("ERROR");
  String wZodiac = new String ("ERROR");

  //Constructor
  public Zodiac(){

  }

  //created the western zodiac string that will be printed
  public void western (int month, int day){
    month = month + 1;
    if ((month == 12 && day >= 22 && day <= 31) || (month ==  1 && day >= 1 && day <= 19))
        wZodiac = (" Your Western zodiac sign is Capricorn." +
          "The sign of highly intelligent and knowlegable individuals.");
      else if ((month ==  1 && day >= 20 && day <= 31) || (month ==  2 && day >= 1 && day <= 17))
          wZodiac = (" Your Western zodiac sign is Aquarius." +
            "The sign of unorthodox and loyal individuals.");
      else if ((month ==  2 && day >= 18 && day <= 29) || (month ==  3 && day >= 1 && day <= 19))
          wZodiac = (" Your Western zodiac sign is Pisces." +
            "The sign of trust worthy and loyal individuals.");
      else if ((month ==  3 && day >= 20 && day <= 31) || (month ==  4 && day >= 1 && day <= 19))
          wZodiac = (" Your Western zodiac sign is Aries." +
            "The sign of creative, and adaptable strong willed individuals.");
      else if ((month ==  4 && day >= 20 && day <= 30) || (month ==  5 && day >= 1 && day <= 20))
          wZodiac = (" Your Western zodiac sign is Taurus." +
            "The sign of strong and stuborn individuals.");
      else if ((month ==  5 && day >= 21 && day <= 31) || (month ==  6 && day >= 1 && day <= 20))
          wZodiac = (" Your Western zodiac sign is Gemini." +
            "The sign of flexible and balanced individuals.");
      else if ((month ==  6 && day >= 21 && day <= 30) || (month ==  7 && day >= 1 && day <= 22))
          wZodiac = (" Your Western zodiac sign is Cancer." +
            "The sign of Loving and traditional individuals.");
      else if ((month ==  7 && day >= 23 && day <= 31) || (month ==  8 && day >= 1 && day <= 22))
          wZodiac = (" Your Western zodiac sign is Leo." +
            "The sign of expansive and powerful individuals.");
      else if ((month ==  8 && day >= 23 && day <= 31) || (month ==  9 && day >= 1 && day <= 22))
          wZodiac = (" Your Western zodiac sign is Virgo." +
            "The sign of charming and artful individuals.");
      else if ((month ==  9 && day >= 23 && day <= 30) || (month == 10 && day >= 1 && day <= 22))
          wZodiac = (" Your Western zodiac sign is Libra." +
            "The sign of lawful and stable individuals.");
      else if ((month == 10 && day >= 23 && day <= 31) || (month == 11 && day >= 1 && day <= 21))
          wZodiac = (" Your Western zodiac sign is Scorpio" +
            "The sign of misunderstood, and bold individuals.");
      else if ((month == 11 && day >= 22 && day <= 30) || (month == 12 && day >= 1 && day <= 21))
          wZodiac = (" Your Western zodiac sign is Sagittarius." +
            "The sign of intense and focused individuals.");
      else
          wZodiac = (" Your Western zodiac sign is Illegal date");
  }

  //creates the chinese zodiac string to be printed.
  public void chinese (int year){
    switch (year % 12) {
      case 0: cZodiac = ("Your Chinese zodiac is a monkey." +
        "You are quick- witted, adaptable, and a very charming conversationalist.");
      break;
      case 1: cZodiac = ("Your Chinese zodiac is a rooster." +
        "You are honest, energetic, and can sometimes be a little flampoyant");
      break;
      case 2: cZodiac = ("Your Chinese zodiac is a dog." +
        "You are loyal, diligent, and lively.");
      break;
      case 3: cZodiac = ("Your Chinese zodiac is a pig." +
        "You are honorable, determined, and optimistic.");
      break;
      case 4: cZodiac = ("Your Chinese zodiac is a rat." +
        "You are intellegent, artistic and sociable.");
      break;
      case 5: cZodiac = ("Your Chinese zodiac is a ox." +
        "You are loyal, thorough, and reliable.");
      break;
      case 6: cZodiac = ("Your Chinese zodiac is a tiger." +
        "You are enthusiastic, confident, and a natural leader");
      break;
      case 7: cZodiac = ("Your Chinese zodiac is a rabbit." +
        "You are trustworthy, diplomatic, and empethetic.");
      break;
      case 8: cZodiac = ("Your Chinese zodiac is a dragon." +
        "You are artistic, flexible, and very imaginative.");
      break;
      case 9: cZodiac = ("Your Chinese zodiac is a snake." +
        "You are intuitive, organized, and attentive.");
      break;
      case 10: cZodiac = ("Your Chinese zodiac is a horse." +
        "You are aldptable, loyal, and courageous.");
      break;
      case 11: cZodiac = ("Your Chinese zodiac is a sheep." +
        "You are tasetful, warm, and sensitive.");
    }
  }

}