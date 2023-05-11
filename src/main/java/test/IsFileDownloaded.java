package test;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.NotFileFilter;
import org.apache.commons.io.filefilter.PrefixFileFilter;
import org.apache.commons.io.filefilter.SuffixFileFilter;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class IsFileDownloaded {

    public static boolean isFileDownloaded(String downloadPath, String fileName) {
        boolean flag = false;
        File dir = new File(downloadPath);
        File[] dir_contents = dir.listFiles();

        for (int i = 0; i < dir_contents.length; i++) {
            if (dir_contents[i].getName().equals(fileName))
                return flag=true;
        }

        return flag;
    }




//    private static boolean isDirEmpty(final Path directory) throws IOException {
//        try(DirectoryStream<Path> dirStream = Files.newDirectoryStream(directory)) {
//            return !dirStream.iterator().hasNext();
//        }
//    }


    private static boolean isDirEmpty(String dirPath) throws IOException {
        final Path directory = (Path) Paths.get(dirPath);
        try(DirectoryStream<Path> dirStream = Files.newDirectoryStream(directory)) {
            return !dirStream.iterator().hasNext();
        }
    }






    public static void main(String[] args) throws IOException {
        boolean bo = isFileDownloaded("E:\\helal's\\projects\\regression-test\\downloads", "test1.txt");
        if (bo)
            System.out.println("file downloaded");
        else
            System.out.println("file not downloaded");





        bo = isDirEmpty("E:\\helal's\\projects\\regression-test\\downloads");
        if (bo)
            System.out.println("folder is empty");
        else
            System.out.println("folder is not empty");
    }

}
