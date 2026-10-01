package com.iap.ac.android.acs.multilanguage.utils;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iap.ac.android.common.log.ACLog;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class FileUtils {
    private static final String a = LanguagePackageUtil.logTag("FileUtils");

    private static void a(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                ACLog.d(a, "closeStream() failed, error: " + e);
            }
        }
    }

    public static boolean deleteFile(String str, String str2) {
        if (isFileExists(str, str2)) {
            return new File(str, str2).delete();
        }
        return false;
    }

    public static boolean isFileExists(String str, String str2) {
        File file = new File(str, str2);
        return file.exists() && file.length() > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.content.res.AssetManager] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.io.Closeable, java.io.InputStreamReader, java.io.Reader] */
    public static String readConfigFromAsset(Context context, String str) throws Throwable {
        Throwable th;
        Exception e;
        BufferedReader bufferedReader;
        ?? assets = context.getAssets();
        Closeable closeable = null;
        try {
            try {
                assets = assets.open(str, 3);
            } catch (Throwable th2) {
                closeable = 3;
                th = th2;
            }
            try {
                str = new InputStreamReader(assets);
                try {
                    bufferedReader = new BufferedReader(str);
                    try {
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                String string = sb.toString();
                                a(bufferedReader);
                                a(str);
                                a(assets);
                                return string;
                            }
                            sb.append(line);
                        }
                    } catch (Exception e2) {
                        e = e2;
                        ACLog.e(a, "readConfigFromAsset failed: " + e);
                        a(bufferedReader);
                        a(str);
                        a(assets);
                        return null;
                    }
                } catch (Exception e3) {
                    e = e3;
                    bufferedReader = null;
                } catch (Throwable th3) {
                    th = th3;
                    a(closeable);
                    a(str);
                    a(assets);
                    throw th;
                }
            } catch (Exception e4) {
                e = e4;
                assets = assets;
                str = 0;
                bufferedReader = null;
                ACLog.e(a, "readConfigFromAsset failed: " + e);
                a(bufferedReader);
                a(str);
                a(assets);
                return null;
            } catch (Throwable th4) {
                th = th4;
                assets = assets;
                str = 0;
                a(closeable);
                a(str);
                a(assets);
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            assets = 0;
        } catch (Throwable th5) {
            th = th5;
            assets = 0;
        }
    }

    public static String readStringFromFile(@NonNull String str, @NonNull String str2) throws Throwable {
        Throwable th;
        FileInputStream fileInputStream;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            fileInputStream = new FileInputStream(new File(str, str2));
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    String string = sb.toString();
                    a(bufferedReader);
                    a(fileInputStream);
                    return string;
                }
                sb.append(line);
            }
        } catch (Throwable th4) {
            bufferedReader2 = bufferedReader;
            th = th4;
            a(bufferedReader2);
            a(fileInputStream);
            throw th;
        }
    }

    public static void writeStringToFile(@NonNull String str, @NonNull String str2, @NonNull String str3) throws Throwable {
        Throwable th;
        FileOutputStream fileOutputStream;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            File file = new File(str);
            ACLog.d(a, "writeStringToFile() dir = " + file.getAbsolutePath());
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, str2);
            if (file2.exists()) {
                file2.delete();
            }
            file2.createNewFile();
            fileOutputStream = new FileOutputStream(file2);
            try {
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(fileOutputStream);
                try {
                    bufferedOutputStream2.write(str3.getBytes());
                    a(bufferedOutputStream2);
                    a(fileOutputStream);
                } catch (Throwable th2) {
                    th = th2;
                    bufferedOutputStream = bufferedOutputStream2;
                    a(bufferedOutputStream);
                    a(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }
}
