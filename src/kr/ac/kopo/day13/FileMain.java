package kr.ac.kopo.day13;

import java.io.File;

public class FileMain {
	
	public static void main(String[] args) {
		
		
		File dirObj = new File("iotest");
		if(dirObj.exists()) {
			
			File[] list = dirObj.listFiles();
			for(File f : list) {
				System.out.println(f.getName());
				System.out.println(f.isDirectory() ? "디렉토리" : "파일");
			}
			
//			String[] list = dirObj.list();
//			for(String data : list) {
//				System.out.println(data);
//				File fileObj = new File(dirObj.getName() + "/" + data);
//				System.out.println(fileObj.isDirectory() 
//						? "디렉토리" : "파일");
//			}
		}
		
		/*
		File dirObj = new File("iotest/강아지/리트리버");
		System.out.println("존재여부 : " + dirObj.exists());
		System.out.println("디렉토리여부 : " + dirObj.isDirectory());
		System.out.println("파일여부 : " + dirObj.isFile());
		
		// 이클립스의 경우 실시간 적용이 되지않는다. -> F5
		if(!dirObj.exists()) {
			// mkdir() 최하위 폴더 전 상위 폴더들은 알고 있어야 한다. -> 상위폴더 먼저 만들고 그다음 하위폴더
			// => mkdirs() 사용하면 상위폴더들까지 만들어준다!
			dirObj.mkdirs();
		}
		*/
		
		
		/*
								// 상대경로 -> JAVA 를 뜻한다.
		File  fileObj = new File("iotest/a.txt");
		String fileName = fileObj.getName();
		String parent = fileObj.getParent();
		
		System.out.println("파일명 : " + fileName);
		System.out.println("부모 : " + parent);
		
		System.out.println("파일 존재여부 : " + fileObj.exists());
		
		long fileSize = fileObj.length();
		System.out.println("파일 크기 : " + fileSize + "byte(s)");
		
		System.out.println(fileObj.canRead() ? "읽기가능" : "읽기불가능");
		System.out.println(fileObj.canWrite() ? "쓰기가능" : "쓰기불가능");
		
		long lastTime = fileObj.lastModified();
		//SimpleDateFormat
		String pattern = "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
														// Date의 기본생성자가 long형을 Date형으로 바꿔줌
		System.out.println("마지막 수정시간 : " + sdf.format(new Date(lastTime)));
		
		*/
	}

}
