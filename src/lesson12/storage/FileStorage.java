package lesson12.storage;

import lesson12.entity.Product;

import java.io.*;
import java.util.HashMap;

public class FileStorage implements Storage{
    private String filePath;



    public void setFilePath(String filePath){
        this.filePath = filePath;
    }


    @Override
    public void save(HashMap<Integer, Product> map) {
       try(var oos = new ObjectOutputStream(new FileOutputStream(filePath, false))) {
           oos.writeObject(map);
           oos.flush();
       } catch (IOException exception) {
           exception.printStackTrace();
       }


    }

    @Override
    public HashMap<Integer, Product> getAll() {
        HashMap<Integer, Product> map = new HashMap<>();
        File file = new File(filePath);
        if(file.exists()){
            try(var ois = new ObjectInputStream(new FileInputStream(filePath))) {
                map = (HashMap<Integer, Product>) ois.readObject();
            } catch (IOException | ClassNotFoundException exception) {
                exception.printStackTrace();
            }
        }

      return map;
    }
}
