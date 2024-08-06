import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Test1 {
	public static void main(String[] args) {
		String shinyaBirthday = "1998/03/19";
		String minamiBirthday = "2000/02/14";
		String furuyamaBirthday = "1998/09/12";
		//改行
		System.out.println("問１");
		//問題1:現在の時刻を出力してください
		
		Date now = new Date();
		System.out.println(now.toString());
		
		//改行
		System.out.println("問２");
		//問題2:shinyaBirthdayとminamiBirthdayを日付型に変更し条件式で誕生日を比較し早い方の日付を文字列型で出力しなさい。
		
		try {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
			LocalDate shinyaDate = LocalDate.parse(shinyaBirthday, formatter);
			LocalDate minamiDate = LocalDate.parse(minamiBirthday, formatter);
			
			LocalDate earlierDate = shinyaDate.isBefore(minamiDate) ? shinyaDate : minamiDate;
			System.out.println(earlierDate.format(formatter));
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		//改行
		System.out.println("問３");
		//問題3:furuyamaBirthdayに５年2ヶ月追加した値を文字列型で表示しなさい
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
			Date furuyamaDate = sdf.parse(furuyamaBirthday);
			
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(furuyamaDate);
			
			calendar.add(calendar.YEAR, 5);
			calendar.add(calendar.MONTH, 2);
			
			Date newDate = calendar.getTime();
			System.out.println(sdf.format(newDate));
			
		}catch(ParseException e) {
			e.printStackTrace();
		}
		
		}
	}
