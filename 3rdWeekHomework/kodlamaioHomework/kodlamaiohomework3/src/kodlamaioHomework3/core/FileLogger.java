package kodlamaioHomework3.core;

public class FileLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("File'a loglandı: " +data);

    }

}
