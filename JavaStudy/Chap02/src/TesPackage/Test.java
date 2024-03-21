package TesPackage;

public class Test {

	public static void main(String[] args) {
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		int result = (int)(var1+(var2+var3))+(int)Double.parseDouble(var4);
		int result2 = (int)(var1+(int)var2+var3+Double.parseDouble(var4));
		int result3 = (int)var1+(int)(var2+var3)+(int)Double.parseDouble(var4);
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		}

}
