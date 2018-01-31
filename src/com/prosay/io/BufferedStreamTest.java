package com.prosay.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedStreamTest {
    /*
     * 
     */
	public static void main(String[] args) throws FileNotFoundException {
		OutputStream os = null;
		InputStream in = null;
		try {
			//写文件
			os = new BufferedOutputStream(new FileOutputStream("D:\\prosay\\def.txt", true));
			os.write("HelloWorld".getBytes());
			os.flush();
			
			//读文件
			StringBuilder sb = new StringBuilder();
			in = new BufferedInputStream(new FileInputStream("D:\\prosay\\def.txt"));
			byte[] buffer = new byte[1024];
			int len;
			byte[] buTmp;
			while((len = in.read(buffer)) != -1){
				if(len < 1024){
					buTmp = new byte[len];
					System.arraycopy(buffer, 0, buTmp, 0, len);
					sb.append(new String(buTmp));
				}else{
					sb.append(new String(buffer));
				}
			}
			System.out.println(">>>>>"+ sb.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(os != null){
				try {
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(in != null){
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
