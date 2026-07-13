import java.io.File;

public class Main {
    private static void listDirectory(File directory, String indent) {
        File[] entries = directory.listFiles();
        if (entries == null) {
            System.out.println(indent + "Cannot list directory: " + directory.getPath());
            return;
        }

        for (File entry : entries) {
            String name = entry.getName();
            if (name.equals(".") || name.equals(".."))
                continue;

            if (entry.isDirectory()) {
                System.out.println(indent + "[DIR]  " + name);
                listDirectory(entry, indent + "  ");
            } else {
                System.out.println(indent + "[FILE] " + name + " (" + entry.length() + " bytes)");
            }
        }
    }

    public static void main(String[] args) {
        listDirectory(new File("1:/"), "");
    }
}
