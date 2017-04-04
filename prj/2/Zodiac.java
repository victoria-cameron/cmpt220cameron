public class Zodiac{
  int month = 1;
  int date = 1;
  int year = 1900;
  String cZodiac = new String ("ERROR");

  public Zodiac(){

  }
  //public void starSign (  ){

  //}
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