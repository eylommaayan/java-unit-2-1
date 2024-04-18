// תוכנית שעושה הגרלה עץ או פלי
// הטלת מטבע מדפיסה 1 אם התקבל עץ או 2 אם התקבל פלי

public class Heads_or_tails {

    public static void main(String[] args) {
         // הגרלת מספר בין 0 ל-1
         double choice = Math.random();

         // בדיקת הבחירה
         if (choice < 0.5) {
             System.out.println("1"); // עץ
         } else {
             System.out.println("2"); // פלי
         }
     
    }
}