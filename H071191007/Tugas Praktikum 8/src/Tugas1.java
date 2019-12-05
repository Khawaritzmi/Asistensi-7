import java.io.*;
import java.util.*;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\n1. Membuat dan mengisi file baru\n2. Membaca file\n3. Duplikat file\n4. Menghapus file");
        while (true){
            try {
            System.out.println("\nInput pilihan menu : ");
            int n = input.nextInt();

            if (n == 1) {
                System.out.println("\nInput nama file : ");
                String namaFile = input.next() + ".txt";
                System.out.println("\nInput isi file : ");
                String isiFile = input.next();

                FileWriter file = null;
                PrintWriter writer = null;
                
                try {
                    file = new FileWriter(namaFile);
                    writer = new PrintWriter(file);
                    writer.println(isiFile);
                } catch (Exception ioe) {
                    System.out.println(ioe.getMessage());
                } finally {
                    try {
                        if (writer != null) {
                            writer.close();
                        }if (file != null) {
                            file.close();
                        }
                    } catch (Exception ioe) {
                        System.out.println(ioe.getMessage());
                    } 
                }
            } else if (n == 2) {
                System.out.println("\nInput file yang akan dibaca : ");
                String namaFile2 = input.next() + ".txt";

                FileReader fr = null;
                BufferedReader br = null;

                try {
                    fr = new FileReader(namaFile2);
                    br = new BufferedReader(fr);
                    String s;
                    while ((s = br.readLine()) != null) {
                        System.out.println("\nIsi file : ");
                        System.out.println(s);
                    }
                } catch (Exception ioe) {
                    System.out.println(ioe.getMessage());
                } finally {
                    try {
                        if (fr != null) {
                            fr.close();
                        }if (br != null) {
                            br.close();
                        }
                    } catch (Exception ioe) {
                        System.out.println(ioe.getMessage());
                    }
                }
            } else if (n == 3){
                System.out.println("\nInput nama file yang akan di duplikat :");
                String namaFileLama = input.next() + ".txt"; 
                System.out.println("\nInput nama file baru : ");
                String namaFileBaru = input.next()+ ".txt";

                FileReader fr1 = null;
                BufferedReader br1 = null;
                FileWriter fw = null;
                PrintWriter pw = null;

                try {
                    fr1 = new FileReader(namaFileLama);
                    br1 = new BufferedReader(fr1);
                    
                    String s1;
                    String content = "";

                    while ((s1 = br1.readLine()) != null) {
                        content += s1;
                        content += "\n";
                    }
                    
                    fw = new FileWriter(namaFileBaru);
                    pw = new PrintWriter(fw);
                    
                    pw.println(content);

                    System.out.println("\nIsi file baru :");
                    System.out.println(content);

                } catch (Exception ioe) {
                    System.out.println(ioe.getMessage());
                } finally {
                    try {
                        if (fr1 != null) {
                            fr1.close();
                        }if (br1 != null) {
                            br1.close();
                        }if (fw != null) {
                            fw.close();
                        }if (pw != null) {
                            pw.close();
                        }
                    } catch (Exception ioe) {
                        System.out.println(ioe.getMessage());
                    }
                }
            }
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        } finally {
            
        }
        }
        // input.close();
        
    }
}