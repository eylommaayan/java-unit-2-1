// כתוב תוכנית המגרילה שלושה מספרים בטווח 20-40 ומציג כפלט
// 1- את המספר הגדול ביותר
// 2- את השורש הריבועי המעוגל של כל אחד מהמספרים שהוגרלו
// 3- הודעה מתאימה אם יש לפחות שני מספרים שהשורש המעוגל שלהם שווה 


import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        // יצירת אובייקט מחולקת
        Random random = new Random();

        // הגרלת שלושה מספרים בטווח 20-40
        int num1 = random.nextInt(21) + 20;
        int num2 = random.nextInt(21) + 20;
        int num3 = random.nextInt(21) + 20;

        // הדפסת המספר הגדול ביותר
        int maxNumber = Math.max(num1, Math.max(num2, num3));
        System.out.println("המספר הגדול ביותר הוא: " + maxNumber);

        // הדפסת השורש הריבועי המעוגל של כל אחד מהמספרים
        System.out.println("השורש הריבועי המעוגל של המספר הראשון הוא: " + Math.round(Math.sqrt(num1)));
        System.out.println("השורש הריבועי המעוגל של המספר השני הוא: " + Math.round(Math.sqrt(num2)));
        System.out.println("השורש הריבועי המעוגל של המספר השלישי הוא: " + Math.round(Math.sqrt(num3)));

        // בדיקה אם יש לפחות שני מספרים שהשורש המעוגל שלהם שווה
        if (Math.round(Math.sqrt(num1)) == Math.round(Math.sqrt(num2)) ||
            Math.round(Math.sqrt(num1)) == Math.round(Math.sqrt(num3)) ||
            Math.round(Math.sqrt(num2)) == Math.round(Math.sqrt(num3))) {
            System.out.println("יש לפחות שני מספרים שהשורש המעוגל שלהם שווה.");
        } else {
            System.out.println("אין לפחות שני מספרים שהשורש המעוגל שלהם שווה.");
        }
    }
}
