package problem;

public class Exercise {

	public static boolean isNumber(String str)
	{
		boolean result = false;
		
		for(int i = 0; i < str.length(); i++)
		{
			if((str.charAt(i) >= 48) && (str.charAt(i) <=57))
			{
				result = true;
			}
			else
			{
				result = false;
				break;
			}
		}
		 return result; 
	}
	


	public static void main(String[] args)
	{
		String str = "123";
		System.out.println(str+"�� �����Դϱ�? " +isNumber(str));
		str = "1234";
		System.out.println(str+"�� �����Դϱ�?" +isNumber(str));
	}
}