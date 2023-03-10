package Utils;

import java.io.*;
import java.util.ArrayList;

public class Utils {
    public static String readTxt(int role, int position){
        File data = new File("src/test/resources/DataEntry/registro.txt");
        ArrayList<String> dataList = new ArrayList();
        try {
            BufferedReader br = new BufferedReader(new FileReader(data));
            String line;
            while ((line = br.readLine())!=null){
                System.out.printf(line);
                dataList.add(line);
            }
            System.out.printf(String.valueOf(dataList));
            System.out.printf(dataList.get(role-1).split(";")[position]);
            return dataList.get(role-1).split(";")[position];
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
