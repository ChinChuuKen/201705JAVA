}catch(ArrayIndexOutOfBoundsException eeeee){
			System.out.println("�v���ȃf�[�^����͂��Ă�������!");
	}finally{}
	
	
	
	try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int sel = Integer.parseInt(br.readLine());
			Chara2[] chArr;
			String dtype;
	        //���͂�0�̏ꍇ�Adtype�̒l��"�C��"�AchArr�̒l��prtArray
			//���͂�1�̏ꍇ�Adtype�̒l��"�C�R"�AchArr�̒l��nvyArray
			if(sel == 0){
				dtype = "�C��";
				chArr = prtArray;
				System.out.println("***** "+dtype+"�̃f�[�^��\�����܂��B *****");
				System.out.println("�N�̃f�[�^��\�����܂����H\n�\���������l���̔ԍ�����͂��Ă��������B\n"+
					"�S�����\������ꍇ�͑S��(99)����͂��Ă��������B");
				dispNameList(chArr, sel);		//����chArr�̒l(�z��̖��O)��sel�̒l(0��1)���w�肵,dispNameList()�����s
				sel = Integer.parseInt(br.readLine());
				dispData(chArr, sel);			//����chArr�̒l(�z��̖��O)��sel�̒l(�l���̔ԍ���99)���w�肵,dispData()�����s
			}else if(sel == 1){
				dtype = "�C�R";
				chArr = nvyArray;
				System.out.println("***** "+dtype+"�̃f�[�^��\�����܂��B *****");
				System.out.println("�N�̃f�[�^��\�����܂����H\n�\���������l���̔ԍ�����͂��Ă��������B\n"+
					"�S�����\������ꍇ�͑S��(99)����͂��Ă��������B");
				dispNameList(chArr, sel);		//����chArr�̒l(�z��̖��O)��sel�̒l(0��1)���w�肵,dispNameList()�����s
				sel = Integer.parseInt(br.readLine());
				dispData(chArr, sel);			//����chArr�̒l(�z��̖��O)��sel�̒l(�l���̔ԍ���99)���w�肵,dispData()�����s
			}else{
				System.out.println("�v���ȃf�[�^����͂��Ă�������!");
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("�v���ȃf�[�^����͂��Ă�������!");
	    }finally{}