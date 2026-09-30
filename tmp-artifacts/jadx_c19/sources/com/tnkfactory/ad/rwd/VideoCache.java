package com.tnkfactory.ad.rwd;

import android.content.Context;
import android.os.Environment;
import com.tnkfactory.ad.Logger;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class VideoCache {
    public static final VideoCache INSTANCE = new VideoCache();

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        try {
            if (str.length() <= 0) {
                return null;
            }
            String strSubstring = str.substring(StringsKt.lastIndexOf$default(str, "/", 0, false, 6, (Object) null) + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            return strSubstring;
        } catch (Exception e) {
            Logger.e("GVFU " + str + " : " + e);
            return null;
        }
    }

    public final void a() {
        if (System.currentTimeMillis() - Settings.INSTANCE.getLastImageCachePurgeMillis(getApplicationContext()) < 86400000) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it = ArrayIteratorKt.iterator(new File(getApplicationContext().getCacheDir(), "tnkad").listFiles());
            while (it.hasNext()) {
                File file = (File) it.next();
                if (file.exists() && file.isFile() && file.lastModified() < jCurrentTimeMillis - 1296000000) {
                    file.delete();
                }
            }
        } catch (Exception e) {
            Logger.e("PVCF " + e);
        }
        Settings.INSTANCE.setLastImageCachePurgeMillis(getApplicationContext());
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String cacheVideo(@Nullable String str) {
        File fileA;
        Object th;
        InputStream inputStream;
        FileOutputStream fileOutputStream;
        String strB = b(str);
        InputStream inputStream2 = null;
        if (strB == null || (fileA = a(strB)) == null) {
            return null;
        }
        if (fileA.exists()) {
            return fileA.getPath();
        }
        try {
            URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
            Intrinsics.checkNotNull(uRLConnectionOpenConnection, "");
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
            httpsURLConnection.setConnectTimeout(10000);
            httpsURLConnection.setReadTimeout(60000);
            httpsURLConnection.setSSLSocketFactory(new SSLFactory());
            if (httpsURLConnection.getResponseCode() == 200) {
                inputStream = httpsURLConnection.getInputStream();
                try {
                    fileOutputStream = new FileOutputStream(fileA);
                    try {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int i2 = inputStream.read(bArr, 0, 4096);
                            if (i2 == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, i2);
                        }
                        inputStream2 = inputStream;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            Logger.e("read_error_video_from_server = " + th);
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException unused) {
                                }
                            }
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException unused2) {
                                }
                            }
                            return null;
                        } finally {
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = null;
                    Logger.e("read_error_video_from_server = " + th);
                    if (inputStream != null) {
                    }
                    if (fileOutputStream != null) {
                    }
                    return null;
                }
            } else {
                fileOutputStream = null;
            }
            if (inputStream2 != null) {
                try {
                    inputStream2.close();
                } catch (IOException unused3) {
                }
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused4) {
                }
            }
            a();
            return fileA.getPath();
        } catch (Throwable th4) {
            th = th4;
            inputStream = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String cacheVideoUrl(@Nullable String str, long j) throws Throwable {
        Throwable th;
        FileOutputStream fileOutputStream;
        Exception e;
        AssertionError e2;
        FileOutputStream fileOutputStream2;
        File videoCacheFile = getVideoCacheFile(str);
        InputStream inputStream = null;
        if (videoCacheFile == null) {
            return null;
        }
        ?? r8 = j;
        if (videoCacheFile.exists()) {
            int i2 = (videoCacheFile.length() > j ? 1 : (videoCacheFile.length() == j ? 0 : -1));
            r8 = i2;
            if (i2 == 0) {
                return videoCacheFile.getPath();
            }
        }
        try {
            try {
                URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
                Intrinsics.checkNotNull(uRLConnectionOpenConnection, "");
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setReadTimeout(60000);
                httpsURLConnection.setSSLSocketFactory(new SSLFactory());
                if (httpsURLConnection.getResponseCode() == 200) {
                    str = httpsURLConnection.getInputStream();
                    try {
                        fileOutputStream2 = new FileOutputStream(videoCacheFile);
                    } catch (AssertionError e3) {
                        e2 = e3;
                        str = str;
                        fileOutputStream2 = null;
                        Logger.e("RVFAE " + e2);
                        if (str != 0) {
                            try {
                                str.close();
                            } catch (IOException unused) {
                            }
                        }
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                            } catch (IOException unused2) {
                            }
                        }
                        return null;
                    } catch (Exception e4) {
                        e = e4;
                        str = str;
                        fileOutputStream2 = null;
                        Logger.e("RVFE " + e);
                        if (str != 0) {
                            try {
                                str.close();
                            } catch (IOException unused3) {
                            }
                        }
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                            } catch (IOException unused4) {
                            }
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        r8 = 0;
                        inputStream = str;
                        fileOutputStream = r8;
                        if (inputStream != null) {
                        }
                        if (fileOutputStream != null) {
                        }
                    }
                    try {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int i3 = str.read(bArr, 0, 4096);
                            if (i3 == -1) {
                                break;
                            }
                            fileOutputStream2.write(bArr, 0, i3);
                        }
                        inputStream = str;
                    } catch (AssertionError e5) {
                        e2 = e5;
                        Logger.e("RVFAE " + e2);
                        if (str != 0) {
                        }
                        if (fileOutputStream2 != null) {
                        }
                        return null;
                    } catch (Exception e6) {
                        e = e6;
                        Logger.e("RVFE " + e);
                        if (str != 0) {
                        }
                        if (fileOutputStream2 != null) {
                        }
                        return null;
                    }
                } else {
                    fileOutputStream2 = null;
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused5) {
                    }
                }
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException unused6) {
                    }
                }
                a();
                return videoCacheFile.getPath();
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (AssertionError e7) {
            e2 = e7;
            str = 0;
        } catch (Exception e8) {
            e = e8;
            str = 0;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused7) {
                }
            }
            if (fileOutputStream != null) {
                throw th;
            }
            try {
                fileOutputStream.close();
                throw th;
            } catch (IOException unused8) {
                throw th;
            }
        }
    }

    public final Context getApplicationContext() {
        return TnkCore.INSTANCE.getAppResource().getApplicationContext();
    }

    public final String getCachedVideoPath(@NotNull Context context, @Nullable String str) {
        File fileA;
        Intrinsics.checkNotNullParameter(context, "");
        String strB = b(str);
        if (strB == null || (fileA = a(strB)) == null || !fileA.exists()) {
            return null;
        }
        return fileA.getPath();
    }

    public final File getVideoCacheFile(@Nullable String str) {
        String strB = b(str);
        if (strB == null) {
            return null;
        }
        File fileA = a(strB);
        if (fileA != null) {
            fileA.exists();
        }
        return fileA;
    }

    public final File a(String str) {
        try {
            File file = new File(getApplicationContext().getExternalFilesDir(Environment.DIRECTORY_PICTURES), "tnkad");
            if (!file.exists()) {
                file.mkdirs();
            }
            return new File(file, str);
        } catch (Exception e) {
            Logger.e("GVCF " + e);
            return null;
        }
    }
}
