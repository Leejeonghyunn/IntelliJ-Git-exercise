package randomCalculator;

import java.io.IOException;

/**
 * File 패키지 추가 (파일 한바이트 읽어서 출력)
 */
public class ReadFile {
    public static void main(String[] args) throws IOException {
        ReadFileOneByte readFileOneByte = new ReadFileOneByte("a_file.txt");

        System.out.println(readFileOneByte.readByte());
    }
}
