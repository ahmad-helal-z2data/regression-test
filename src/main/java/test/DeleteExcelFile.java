package test;

import java.io.File;

public class DeleteExcelFile {

    public void deleteFolder(String file) {
        File folder = new File(file);
        File[] files = folder.listFiles();
        if (files != null) { //some JVMs return null for empty dirs
            for (File f : files) {
                if (f.isDirectory()) {
                    deleteFolder(file);
                } else {
                    f.delete();
                }
            }
        }
        folder.delete();
    }



    public static boolean delete(File file) {

        File[] flist = null;

        if(file == null){
            return false;
        }

        if (file.isFile()) {
            return file.delete();
        }

        if (!file.isDirectory()) {
            return false;
        }

        flist = file.listFiles();
        if (flist != null && flist.length > 0) {
            for (File f : flist) {
                if (!delete(f)) {
                    return false;
                }
            }
        }

        return file.delete();
    }









    public static void main(String[] args) {
//        File doomedFile = new File ("E:\\helal's\\projects\\regression-test\\downloads", "*.txt");
//        doomedFile.delete();


//        File folder = new File("E:\\helal's\\projects\\regression-test\\downloads");

        String filePath= "E:\\helal's\\projects\\regression-test\\downloads";

//        deleteFolder(filePath);
    }
}
