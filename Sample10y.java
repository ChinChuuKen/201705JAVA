import java.io.*;
class Sample10y
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("��������͂��Ă��������B(0~2)0:�p�[�A1:�`���L�A2:�O�E");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0;i<5;i++){
		
			String str = br.readLine();
			int num = Integer.parseInt(str);
		
			if(num>2 || num<0){
				System.out.println("���͒l0~�Q�ȓ��͂�����B");
			}else{
				double a,b,c;
				int d,e;
				
				a = Math.random();
				b = a*10;
				c = Math.floor(b);
				d = (int) c;
				e = d%3;
			
				switch(e){
				    case 0:{
						if(num==0){
							System.out.println("������"+e+",���͐���"+num+",�����킯�B");
						}else if(num==1){
							System.out.println("������"+e+",���͐���"+num+",���[�U�[�̏����B");
						}else if(num==2){
							System.out.println("������"+e+",���͐���"+num+",���[�U�[�̕����B");
						}
				    	break;
					}
				    case 1:{
						if(num==0){
							System.out.println("������"+e+",���͐���"+num+",���[�U�[�̕����B");
						}else if(num==1){
							System.out.println("������"+e+",���͐���"+num+",�����킯�B");
						}else if(num==2){
							System.out.println("������"+e+",���͐���"+num+",���[�U�[�̏����B");
						}
				    	break;
					}
				    case 2:{
						if(num==0){
							System.out.println("������"+e+",���͐���"+num+",���[�U�[�̕����B");
						}else if(num==1){
							System.out.println("������"+e+",���͐���"+num+",���[�U�[�̏����B");
						}else if(num==2){
							System.out.println("������"+e+",���͐���"+num+",�����킯�B");
						}
					    break;
					}
				}
			
				if(e==0 && num==0){
					System.out.println("������"+e+",���͐���"+num+",�����킯�B");
				}else if(e==0 && num==1){
					System.out.println("������"+e+",���͐���"+num+",���[�U�[�̏����B");
				}else if(e==0 && num==2){
					System.out.println("������"+e+",���͐���"+num+",���[�U�[�̕����B");
				}else if(e==1 && num==0){
					System.out.println("������"+e+",���͐���"+num+",���[�U�[�̕����B");
				}else if(e==1 && num==1){
					System.out.println("������"+e+",���͐���"+num+",�����킯�B");
				}else if(e==1 && num==2){
					System.out.println("������"+e+",���͐���"+num+",���[�U�[�̏����B");
				}else if(e==2 && num==0){
					System.out.println("������"+e+",���͐���"+num+",���[�U�[�̕����B");
				}else if(e==2 && num==1){
					System.out.println("������"+e+",���͐���"+num+",���[�U�[�̏����B");
				}else if(e==2 && num==2){
					System.out.println("������"+e+",���͐���"+num+",�����킯�B");
				}
			}
		}
	}
}