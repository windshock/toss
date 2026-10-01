package com.bytedance.adsdk.zb.dj;

import android.util.Pair;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ul {
    private final lud ycx;

    public ul(lud ludVar) {
        this.ycx = ludVar;
    }

    Pair<sya, InputStream> ycx(String str) {
        sya syaVar;
        try {
            File fileZb = zb(str);
            if (fileZb == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(fileZb);
            if (fileZb.getAbsolutePath().endsWith(".zip")) {
                syaVar = sya.ZIP;
            } else {
                syaVar = sya.JSON;
            }
            fileZb.getAbsolutePath();
            return new Pair<>(syaVar, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    File ycx(String str, InputStream inputStream, sya syaVar) throws IOException {
        File file = new File(ycx(), ycx(str, syaVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i2 = inputStream.read(bArr);
                    if (i2 != -1) {
                        fileOutputStream.write(bArr, 0, i2);
                    } else {
                        fileOutputStream.flush();
                        return file;
                    }
                }
            } finally {
                fileOutputStream.close();
            }
        } finally {
            inputStream.close();
        }
    }

    void ycx(String str, sya syaVar) {
        File file = new File(ycx(), ycx(str, syaVar, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        if (file.renameTo(file2)) {
            return;
        }
        file.getAbsolutePath();
        file2.getAbsolutePath();
    }

    private File zb(String str) throws FileNotFoundException {
        File file = new File(ycx(), ycx(str, sya.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(ycx(), ycx(str, sya.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    private File ycx() {
        File fileYcx = this.ycx.ycx();
        if (fileYcx.isFile()) {
            fileYcx.delete();
        }
        if (!fileYcx.exists()) {
            fileYcx.mkdirs();
        }
        return fileYcx;
    }

    private static String ycx(String str, sya syaVar, boolean z) {
        StringBuilder sb = new StringBuilder("lottie_cache_");
        sb.append(str.replaceAll("\\W+", ""));
        sb.append(z ? syaVar.ycx() : syaVar.sya);
        return sb.toString();
    }
}
