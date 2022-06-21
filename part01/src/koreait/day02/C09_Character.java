package koreait.day02;

public class C09_Character {

	public static void main(String[] args) {

		char c1 = 'a';
		char c2 = 97;		//¹®ÀÚÄÚµå´Â Á¤¼ö°ª.

		
		//µÑ´Ù 'a' Ãâ·Â
		System.out.println("c1 =" + c1);
		System.out.println("c2 =" + c2);
		
		//¹®ÀÚÄÚµå Á¤¼ö°ª Ãâ·ÂÀº? -> int·Î Ä³½ºÆÃ ÇÊ¿ä : µÑ´Ù 97Ãâ·Â
		System.out.printf("c1= %d\n",(int)c1); //¿À·ù : char ÇüÀº %d·Î Ãâ·ÂÇÒ¼ö¾ø´Ù
		System.out.printf("c2= %d\n",(int)c2);

		c1 = (char)(c1 +1); //´ø¼À ¿¬»ê °¡´É. ¿¬»ê°á°ú ´ëÀÔÇÒ¶§´Â casting ÇÊ¿ä.
		System.out.println("c1 =" + c1);
		
		c1++; 		//++ ¿¬»êÀº c1 = c1+1 , charÇü¿¡¼­´Â casting ÀÌÇÊ¿ä¾ø½À´Ï´Ù. 
		System.out.println("c1 =" + c1);
		
		//ÇÑ±Û¹®ÀÚÅ×½ºÆ® : ÇÑ±Û¹®ÀÚÄÚµå´Â 10Áø¼ö °ªÀ» 44032 ~ 55203 , 16Áø¼ö (2Áø¼ö) ac00~d7a3
		char h1 ='°¡';
		char h2 = 44032; //
		char h3 ='\uac00';	// \\u´Â 16Áø¼öÀ¯´ÏÄÚµå, ac00Àº 16Áø¼ö°ª
		
		System.out.println("h1 = " + h1);
		System.out.println("h2 = " + h2);
		System.out.println("h3 = " + h3);
		
		System.out.printf("h1 = %d\n",(int)h1);
		System.out.printf("h2 = %d\n",(int)h2);
		System.out.printf("h3 = %d\n",(int)h3);
		
		h1++;
		System.out.println("h1 = " + h1);
		
		h1++;
		System.out.println("h1 = " + h1);
		
		//ÇÑ±ÛÀÇ ¸¶Áö¸· ¹®ÀÚ
		char h4 = 55203;  //10Áø¼öÇ¥Çö
		char h5 = '\ud7a3';//16Áø¼öÇ¥Çö, ÆR
		System.out.println("h4 = " + h4);
		System.out.println("h5 = " + h5);
		
		h4++;
		System.out.println("h4="+h4);
		
		h5--;
		System.out.println("h5 = " + h5);
		System.out.println('H'+'e'+'l'+'l'+'o');
		
		//charÀÌ ¸ð¿©¼­ ÇÑÁÙ·Î ³ª¶õÈ÷ ³ª¿­ÇÏ¸é -> ¹®ÀÚ¿­ÀÌ µË´Ï´Ù. "Hello" 
		
		
		
	}

}




/*
 *	±âº»Çü½Ä µ¥ÀÌÅÍ : ¹®ÀÚÇü char 
 * 		¹®ÀÚµ¥ÀÌÅÍ¸¦ ÀúÀåÇÏ´Â 2¹ÙÀÌÆ® Çü½Ä. Á¤¼ö°ª 0 ~ 65535 ¹üÀ§ ÀúÀåµµ °¡´ÉÇÕ´Ï´Ù.
 * 		ÄÄÇ»ÅÍ¿¡¼­ ´Ù·ç´Â ¹®ÀÚ´Â ¹®ÀÚÄÚµå·Î Ã³¸®µÇ´Âµ¥ ÄÚµå´Â Á¤¼ö°ªÀÔ´Ï´Ù.
 * 		¹®Á¦µ¥ÀÌÅÍ´Â '' ±âÈ£¸¦ »ç¿ëÇÕ´Ï´Ù.(''¾È¿¡´Â ¹®ÀÚ1°³¸¸)
 * 		
 * 		¿µ¹®ÀÚ,¼ýÀÚ,Æ¯¼ö¹®ÀÚ´Â ASCII ÄÚµå·Î Ç¥ÇöµË´Ï´Ù.
 * 		¿µ¹®ÀÚ,¼ýÀÚ,Æ¯¼ö¹®ÀÚ ¿ÜÀÇ ´Ù±¹¾î¹®ÀÚ¸¦ Ã³¸®ÇÏ´Â ÀÎÄÚµù ¹æ½Ä¿¡ µû¶ó
 * 		¹®ÀÚÄÚµå°ªÀÌ ´Ù¸¨´Ï´Ù. ±¹Á¦È­ ÀÎÄÚµùÀ¸·Î utf-8 ¹æ½ÄÀ» ¸¹ÀÌ »ç¿ëÇÕ´Ï´Ù.
 * 		
 * 
 * 		°£ : ¤¡ ¤¤ ¤¤ (ÃÊ¼º,Áß¼º,Á¾¼º °¢°¢¿¡ ÄÚµå°ªÀ¸·Î Á¶ÇÕÇÏ´Â Á¶ÇÕÇü)
 * 		ÇÑ±Û¿¡¼­ ³ª¿Ã¼ö ÀÖ´Â ¸ðµç ÃÊ¼º/Áß¼º/Á¾¼ºÀÇ ¸ðµç Ç¥ÇöÀ» ¸¸µé¾î¼­ °¢°¢ ÄÚµå°ªÀ» ºÎ¿©ÇÏ´Â ¿Ï¼ºÇü
 * 
 * 
 *  */
