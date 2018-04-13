import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/*
 * 可视化日历程序
 */
public class ConsoleCalendar {
	public static void main(String[] args) {
		System.out.println("请输入日期（按照格式2018-5-1）：");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		// 系统里将1到12月设定为int型从0到11，周日到周六设定为从1到7
		// String string = "2018-4-13";
		System.out.println(string + "\n");
		SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date = dFormat.parse(string);
			GregorianCalendar gCalendar = new GregorianCalendar();
			gCalendar.setTime(date);
			int maxDate = gCalendar.getActualMaximum(gCalendar.DAY_OF_MONTH);// 该月共有多少天
			// System.out.println(maxDate);
			int nowDay = gCalendar.get(Calendar.DAY_OF_MONTH);
			gCalendar.set(Calendar.DAY_OF_MONTH, 1);// 将时间设定在每月的第一天，即1号
			// System.out.println(gCalendar);
			System.out.print("一\t二\t三\t四\t五\t六\t日\n");
			// System.out.println(gCalendar.get(Calendar.DAY_OF_WEEK));
			if (gCalendar.get(Calendar.DAY_OF_WEEK) == 1)
				System.out.print("\t\t\t\t\t\t");
			else {
				for (int i = 2; i < gCalendar.get(Calendar.DAY_OF_WEEK); i++) {
					System.out.print("\t");
				}
			}
			for (int i = 1; i <= maxDate; i++) {
				if (i == nowDay) {
					System.out.print("*");
				}
				System.out.print(i + "\t");
				int dayOfWeek = gCalendar.get(Calendar.DAY_OF_WEEK);
				if (dayOfWeek == Calendar.SUNDAY)
					System.out.println();
				gCalendar.add(Calendar.DAY_OF_MONTH, 1);
			}
		} catch (ParseException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}

	}
}
