package ziputil;

import java.io.IOException;
import java.nio.file.Paths;

public class ZipUtil {
    public static void main(String[] args) throws IOException {
        Zip.zip(Paths.get("C:\\temp\\2017.11.12"), Paths.get("C:\\temp\\zipped.zip"));
        Zip.unzip(Paths.get("C:\\temp\\zipped.zip").toFile(), Paths.get("C:\\temp\\unzipped"));
    }
}
