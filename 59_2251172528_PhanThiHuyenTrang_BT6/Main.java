public class Main {

    public interface IService {
        void Log(String message);
    }

    public static class FileZipLogger {
        public void Log(String message) {
            System.out.println("Zip Log: " + message);
        }
    }

    public static class FileLoggerAdapter implements IService {
        private FileZipLogger adapter;

        public FileLoggerAdapter(FileZipLogger adapter) {
            this.adapter = adapter;
        }

        @Override
        public void Log(String message) {
            adapter.Log(message);
        }

        public void LogWithFooter(String message, String footer) {
            String formatted = message + "\n"  + footer ;
            adapter.Log(formatted);
        }
    }

    public static void main(String[] args) {
        FileZipLogger zipLogger = new FileZipLogger();
        FileLoggerAdapter loggerAdapter = new FileLoggerAdapter(zipLogger);

        loggerAdapter.Log("Message 1");
        loggerAdapter.LogWithFooter("Message 2", "End of Log");
    }
}
