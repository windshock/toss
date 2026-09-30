package org.ejbca.cvc.example;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class FileHelper {
    private FileHelper() {
    }

    public static byte[] loadFile(String str) throws IOException {
        return loadFile(new File(str));
    }

    public static byte[] loadFile(File file) throws Throwable {
        FileInputStream fileInputStream;
        boolean z;
        try {
            int length = (int) file.length();
            byte[] bArr = new byte[length];
            fileInputStream = new FileInputStream(file);
            int i = 0;
            while (true) {
                for (true; z; false) {
                    try {
                        int i2 = fileInputStream.read(bArr, i, length - i);
                        i += i2;
                        z = i2 > 0 && i != length;
                    } catch (Throwable th) {
                        th = th;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e) {
                                System.out.println("loadFile - error when closing: " + e);
                            }
                        }
                        throw th;
                    }
                }
                try {
                    fileInputStream.close();
                    return bArr;
                } catch (IOException e2) {
                    System.out.println("loadFile - error when closing: " + e2);
                    return bArr;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
    }

    public static void writeFile(File file, byte[] bArr) throws Throwable {
        Throwable th;
        BufferedOutputStream bufferedOutputStream;
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file), 1000);
            try {
                bufferedOutputStream.write(bArr);
                bufferedOutputStream.close();
            } catch (Throwable th2) {
                th = th2;
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedOutputStream = null;
        }
    }
}
