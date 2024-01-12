package util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import model.Book;
//singleton pattern

public class FileUtil {
    private static FileUtil fileUtil;
    private FileUtil(){
    }


    public static FileUtil GetInstance(){
        if(fileUtil == null){
            fileUtil = new FileUtil();
        }
        return fileUtil;
    }
    public void writeFile(List<Book> listBook) throws IOException {
        String path = "D:\\C1023H1-JV101-HuynhDinhVietToann\\Module2\\caseStudy\\case_study_module2\\Store_Manager\\src\\database\\data_book";
        BufferedWriter bw = new BufferedWriter(new FileWriter(path));
        for (Book book : listBook) {
            bw.write(book.toString());
            bw.write("\n");
            bw.flush();
        }
    }
}