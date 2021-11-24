package level2;

import java.io.*;
import java.util.Scanner;

abstract class FileEditor {
    Scanner sc = new Scanner(System.in);
    final File file = new File("H:" /*修改为想储存的路径*/+ File.separator + "test.txt");
    byte[]b;
    OutputStream ops;
    //创建文件
    void FileEditor() {
        try {
            this.file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //写文件
    void setter() throws IOException {
    }
    //输出写的类容
    void getter()throws Exception{
        System.out.println("文件类容为：");
        InputStream input = new FileInputStream(file);
        byte []b = new byte[1024];
        int l = input.read(b);
        System.out.println(new String(b,0,l));
        input.close();
    }
}

class FileEditorA extends FileEditor {

    public void setter() throws IOException{
        System.out.println("请输入想要写入的类容");
        System.out.println("注：输入end为结束写入");
        ops = new FileOutputStream(super.file,true);
        String writeIn;
        while (true) {
            writeIn = sc.next();
            if (writeIn.equals("end")) {
                break;
            }
            b=writeIn.getBytes();
            ops.write(b);
        }
        ops.close();
    }
}