package com.iap.android.mppclient.container.utils;

import android.content.res.Resources;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class IOUtils {
    private static int IO_BUFFER_SIZE = 2048;
    public static final String TAG = "IOUtils";

    public static InputStream readAssetForInputStream(Resources resources, String str) {
        try {
            return resources.getAssets().open(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String readAsset(Resources resources, String str) throws Throwable {
        Throwable th;
        InputStream inputStreamOpen;
        InputStream inputStream = null;
        try {
            inputStreamOpen = resources.getAssets().open(str);
            try {
                String str2 = read(inputStreamOpen);
                closeQuietly(inputStreamOpen);
                return str2;
            } catch (IOException unused) {
                closeQuietly(inputStreamOpen);
                return null;
            } catch (Throwable th2) {
                th = th2;
                inputStream = inputStreamOpen;
                closeQuietly(inputStream);
                throw th;
            }
        } catch (IOException unused2) {
            inputStreamOpen = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static void closeQuietly(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.getMessage();
            }
        }
    }

    private static String read(String str) {
        try {
            return read(new FileInputStream(str));
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    private static String read(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        return new String(readToByte(inputStream));
    }

    private static byte[] readToByte(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i2 = IO_BUFFER_SIZE;
        byte[] bArr = new byte[i2];
        while (true) {
            try {
                int i3 = inputStream.read(bArr, 0, i2);
                if (i3 >= 0) {
                    byteArrayOutputStream.write(bArr, 0, i3);
                } else {
                    return byteArrayOutputStream.toByteArray();
                }
            } catch (Exception e) {
                e.getMessage();
                return null;
            } finally {
                closeQuietly(inputStream);
            }
        }
    }
}
