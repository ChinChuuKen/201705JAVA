class Sample10x2
{
	public static void main(String[] args)
	{
		for(int i=0; i<5; i++){
			// (1)Math.random�̖߂�l���擾
			double ans = Math.random();
			// (2)�߂�l�̏����_���ʂ̒l���擾
			double cans = Math.ceil(ans*10);
			
			char ch;
			// (3) (2)�Ŏ擾�����l��3�Ŋ���A
			// ���̗]����擾
			// (4),(6)switch���ŕ��򂷂邽�߁A
			// int�^�ɂ���
			int amari = (int)(cans%3);
			// (7) (6)�̒l��switch���Ŕ��肵�A
			// �Ή�����������\��
			switch(amari){
				case 0:
					ch = '��';
					break;
				case 1:
					ch = '��';
					break;
				default:
					ch = '��';
					break;
			}
			System.out.print(ch);
		}
	}
}