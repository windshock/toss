package com.google.android.play.core.assetpacks;

import android.util.Base64;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class dq {
    static String a(List list) throws NoSuchAlgorithmException, IOException {
        int i2;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
        byte[] bArr = new byte[8192];
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FileInputStream fileInputStream = new FileInputStream((File) it.next());
            do {
                try {
                    i2 = fileInputStream.read(bArr);
                    if (i2 > 0) {
                        messageDigest.update(bArr, 0, i2);
                    }
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } while (i2 != -1);
            fileInputStream.close();
        }
        return Base64.encodeToString(messageDigest.digest(), 11);
    }
}
