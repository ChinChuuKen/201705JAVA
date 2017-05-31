}catch(ArrayIndexOutOfBoundsException eeeee){
			System.out.println("要求なデータを入力してください!");
	}finally{}
	
	
	
	try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int sel = Integer.parseInt(br.readLine());
			Chara2[] chArr;
			String dtype;
	        //入力が0の場合、dtypeの値は"海賊"、chArrの値はprtArray
			//入力が1の場合、dtypeの値は"海軍"、chArrの値はnvyArray
			if(sel == 0){
				dtype = "海賊";
				chArr = prtArray;
				System.out.println("***** "+dtype+"のデータを表示します。 *****");
				System.out.println("誰のデータを表示しますか？\n表示したい人物の番号を入力してください。\n"+
					"全員分表示する場合は全員(99)を入力してください。");
				dispNameList(chArr, sel);		//引数chArrの値(配列の名前)とselの値(0か1)を指定し,dispNameList()を実行
				sel = Integer.parseInt(br.readLine());
				dispData(chArr, sel);			//引数chArrの値(配列の名前)とselの値(人物の番号か99)を指定し,dispData()を実行
			}else if(sel == 1){
				dtype = "海軍";
				chArr = nvyArray;
				System.out.println("***** "+dtype+"のデータを表示します。 *****");
				System.out.println("誰のデータを表示しますか？\n表示したい人物の番号を入力してください。\n"+
					"全員分表示する場合は全員(99)を入力してください。");
				dispNameList(chArr, sel);		//引数chArrの値(配列の名前)とselの値(0か1)を指定し,dispNameList()を実行
				sel = Integer.parseInt(br.readLine());
				dispData(chArr, sel);			//引数chArrの値(配列の名前)とselの値(人物の番号か99)を指定し,dispData()を実行
			}else{
				System.out.println("要求なデータを入力してください!");
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("要求なデータを入力してください!");
	    }finally{}