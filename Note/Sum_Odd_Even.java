/*1���� �Է¹��� ���ڻ��̿� �����ϴ� Ȧ������, ¦���� ���� ���Ͻÿ�.*/
//��) 1���� 5������ Ȧ���� �� : 1+3+5 = 9, 1���� 5������ ¦���� �� 2+4 = 6

import java.util.Scanner;
public class Sum_Odd_Even{
  public static void main(String args[ ]){
	int num;
	int odd_sum = 0;  //Ȧ������ ��
	int even_sum = 0; //¦������ ��
	Scanner scan = new Scanner(System.in);
	
	System.out.print("���� �Է��ϼ��� : ");
	num = scan.nextInt();

	for ( int i =1; i<=num; i++){ //1,2,3,4,..........n
	   switch(i%2){
	     case 0: even_sum += i; break;
	     case 1: odd_sum += i; break;
	     default : System.out.println("���ڰ� �ƴմϴ�.");
	 }//end of switch

	   /*if(i%2==0){
		even_sum += i; //������
	      }else{
		odd_sum += i;
	     }*/

	}//end of for

	System.out.println("1���� "+num+" ���� Ȧ���� �� : "+odd_sum);
	System.out.println("1���� "+num+" ���� ¦���� �� : "+even_sum);
		
  }
}