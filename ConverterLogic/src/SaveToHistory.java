import java.io.*;

public class SaveToHistory {
    void save(String toSave) {
        File saveFile = new File("ConverterLogic/convertHistory.txt");
        PrintWriter pw = null;
        try {
            if (saveFile.exists() == false){ saveFile.createNewFile(); }
            pw = new PrintWriter(new FileWriter(saveFile, true));
        } catch (IOException e) {
            e.printStackTrace();
        }
        pw.println(toSave);
        pw.flush();
        pw.close();
    }
}