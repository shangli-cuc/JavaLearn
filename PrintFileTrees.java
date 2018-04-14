import java.io.File;
/*
 * 打印目录树状结构
 */
public class PrintFileTrees {
	public static void main(String[] args) {
		File file=new File("d:/迅雷下载");
		printFile(file, 0);
	}
	public static void printFile(File file ,int level) {
		for(int i=0;i<level;i++) {
			System.out.print("-");
		}
		System.out.println(file.getName());
		if(file.isDirectory()) {
			File fileList[]=file.listFiles();
			for(File temp:fileList) {
				printFile(temp, level+1);
			}
		}
	}
}
