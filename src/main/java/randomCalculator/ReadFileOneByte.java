package randomCalculator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * File 패키지 추가 (파일 한바이트 읽어서 출력)
 */
public class ReadFileOneByte {
    private String filename;

    public ReadFileOneByte(String filename) {
        this.filename = filename;
    }

    char readByte() throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader(filename),
                16 * 1024
        );
        return (char)br.read();
    }
}
