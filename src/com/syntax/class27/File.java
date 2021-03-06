package com.syntax.class27;

public abstract class File {
    private void method(){
        System.out.println("I can have private methods");
    }

     public abstract void open();
       public void edit(){
           System.out.println("I can edit any file");
       }
       public void close(){
           method();
           System.out.println("I can close any file");
       }
}
 class JavaFile extends File{

    public void open(){
        System.out.println("We need notepad++ to open the Java file");
    }
}
class WordFile extends File{

    public void open(){
        System.out.println("To open .doc file we need Microsoft word to be installed");
    }
}
class PdfFile extends File{
    public void open() {
        System.out.println("To open PDF file we need some PDF program");
    }
}

class TestFile{
    public static void main(String[] args) {
        File[] allFiles={new JavaFile(), new WordFile(), new PdfFile()};
        for(File file:allFiles){
            file.open();
            file.edit();
            file.close();
        }
    }
}