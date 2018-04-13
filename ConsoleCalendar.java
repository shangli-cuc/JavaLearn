import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/*
 * ���ӻ���������
 */
public class ConsoleCalendar {
	public static void main(String[] args) {
		System.out.println("���������ڣ����ո�ʽ2018-5-1����");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		// ϵͳ�ｫ1��12���趨Ϊint�ʹ�0��11�����յ������趨Ϊ��1��7
		// String string = "2018-4-13";
		System.out.println(string + "\n");
		SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date = dFormat.parse(string);
			GregorianCalendar gCalendar = new GregorianCalendar();
			gCalendar.setTime(date);
			int maxDate = gCalendar.getActualMaximum(gCalendar.DAY_OF_MONTH);// ���¹��ж�����
			// System.out.println(maxDate);
			int nowDay = gCalendar.get(Calendar.DAY_OF_MONTH);
			gCalendar.set(Calendar.DAY_OF_MONTH, 1);// ��ʱ���趨��ÿ�µĵ�һ�죬��1��
			// System.out.println(gCalendar);
			System.out.print("һ\t��\t��\t��\t��\t��\t��\n");
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
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}

	}
}
