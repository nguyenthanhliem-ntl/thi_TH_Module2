package data;

import service.Messeger;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class File {
    private String phone;
    private static File INSTANCE;

    public File(String id) {
        this.phone = phone;
        System.out.println(id);
    }
    public static File getINSTANCE(String id){
        if (INSTANCE == null)
            INSTANCE = new File(id);
        return INSTANCE;
    }
    public List<Messeger> readFile() throws IOException, ClassNotFoundException {
        java.io.File file = new java.io.File("listGrade.dat");
        if (!file.exists()){
            file.createNewFile();
        }
        if (file.length() >0){
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Object object = objectInputStream.readObject();
            List<Messeger> list = (List<Messeger>) object;
            objectInputStream.close();
            fileInputStream.close();
            return list;
        }
        else return new ArrayList<>();
    }
    public void writeFile(List<Messeger> gradeList) throws IOException{
        java.io.File file = new java.io.File("listGrade.dat");
        if (!file.exists()){
            file.createNewFile();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(gradeList);
        objectOutputStream.close();
        fileOutputStream.close();
    }
}