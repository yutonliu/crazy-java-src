

/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a> 
 * <br/>Copyright (C), 2001-2012, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class Overload
{
	//���涨��������test���������������β��б���ͬ
	//ϵͳ�����������������������ֱ���Ϊ��������
	public void test()
	{
		System.out.println("�޲���");
	}
	public void test(String msg)
	{
		System.out.println("���ص�test���� " + msg);
	}
	public static void main(String[] args)
	{
		Overload ol = new Overload();
		//����testʱû�д�����������ϵͳ��������û�в�����test������
		ol.test();
		//����testʱ������һ���ַ���������
		//���ϵͳ����������һ���ַ���������test������
		ol.test("hello");
	}
}