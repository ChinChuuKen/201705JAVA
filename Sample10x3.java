class Sample10x3
{
	public static void main(String[] args)
	{
		for(int i=0; i<5; i++){
			// (1)Math.random�̖߂�l���擾
			double ans = Math.random();
			// (2)�߂�l�̏����_���ʂ̒l���擾
			double cans = Math.ceil(ans*10);
			
			// (3) (2)�Ŏ擾�����l��3�Ŋ���A
			// ���̗]����擾
			double amari = cans%3;
			char ch;
			// (4)if���ŕ���
			// (5) (3)�̒l�𔻒肵�A
			// �Ή�����������\��
			if(amari == 0){
				ch = '��';
			}else if(amari == 1){
				ch = '��';
			}else{
				ch = '��';
			}
			System.out.print(ch);
		}
	}
}