package com.pgl.ssdk;

import android.content.Context;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class af {
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(Context context) {
        String strA;
        synchronized (af.class) {
            try {
                String str = context.getFilesDir().getAbsolutePath() + "/dic";
                if (new File(str).exists()) {
                    a("chmod 777 ".concat(String.valueOf(str)));
                    String strA2 = a(str);
                    a("chmod 600 ".concat(String.valueOf(str)));
                    if (strA2 != null && strA2.length() > 0) {
                        return strA2;
                    }
                }
                InputStream inputStreamOpen = context.getResources().getAssets().open("dic");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[4096];
                while (true) {
                    int i = inputStreamOpen.read(bArr, 0, 4096);
                    if (i == -1) {
                        break;
                    }
                    a(bArr, i, "dic".getBytes(Charset.forName("UTF-8")));
                    byteArrayOutputStream.write(bArr, 0, i);
                }
                FileOutputStream fileOutputStream = new FileOutputStream(str);
                fileOutputStream.write(byteArrayOutputStream.toByteArray());
                fileOutputStream.close();
                a("chmod 777 ".concat(String.valueOf(str)));
                strA = a(str);
                if (strA == null || strA.length() == 0) {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(str, "rw");
                    randomAccessFile.seek(16L);
                    randomAccessFile.write(new byte[]{2});
                    randomAccessFile.close();
                    strA = a(str);
                }
                a("chmod 600 ".concat(String.valueOf(str)));
            } catch (Throwable unused) {
                strA = "0[<!>]EXCEPTION[<!>]";
            }
            if (strA != null) {
                if (strA.length() == 0) {
                    strA = "0[<!>]ERROR[<!>]";
                }
            }
            return strA;
        }
    }

    private static String a(BufferedInputStream bufferedInputStream) throws IOException {
        int i;
        if (bufferedInputStream == null) {
            return "";
        }
        byte[] bArr = new byte[4096];
        StringBuilder sb = new StringBuilder();
        do {
            try {
                i = bufferedInputStream.read(bArr);
                if (i > 0) {
                    sb.append(new String(bArr, 0, i));
                }
            } catch (Exception unused) {
            }
        } while (i >= 4096);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a A[PHI: r0 r1
      0x006a: PHI (r0v4 java.lang.String) = (r0v8 java.lang.String), (r0v7 java.lang.String), (r0v7 java.lang.String) binds: [B:34:0x0067, B:39:0x006a, B:8:0x0039] A[DONT_GENERATE, DONT_INLINE]
      0x006a: PHI (r1v6 java.lang.Process) = (r1v5 java.lang.Process), (r1v8 java.lang.Process), (r1v8 java.lang.Process) binds: [B:34:0x0067, B:39:0x006a, B:8:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x004c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String a(String str) throws Throwable {
        Process processExec;
        BufferedInputStream bufferedInputStream;
        BufferedOutputStream bufferedOutputStream;
        BufferedOutputStream bufferedOutputStream2 = null;
        strA = null;
        String strA = null;
        try {
            processExec = Runtime.getRuntime().exec("sh");
            try {
                bufferedOutputStream = new BufferedOutputStream(processExec.getOutputStream());
                try {
                    bufferedInputStream = new BufferedInputStream(processExec.getInputStream());
                    try {
                        bufferedOutputStream.write(str.getBytes());
                        bufferedOutputStream.write(10);
                        bufferedOutputStream.flush();
                        bufferedOutputStream.close();
                        processExec.waitFor();
                        strA = a(bufferedInputStream);
                        try {
                            bufferedOutputStream.close();
                        } catch (IOException unused) {
                        }
                        try {
                            bufferedInputStream.close();
                        } catch (IOException unused2) {
                        }
                    } catch (Exception unused3) {
                        if (bufferedOutputStream != null) {
                        }
                        if (bufferedInputStream != null) {
                        }
                        if (processExec != null) {
                        }
                        return strA;
                    } catch (Throwable th) {
                        th = th;
                        bufferedOutputStream2 = bufferedOutputStream;
                        if (bufferedOutputStream2 != null) {
                        }
                        if (bufferedInputStream != null) {
                        }
                        if (processExec != null) {
                        }
                    }
                } catch (Exception unused4) {
                    bufferedInputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedInputStream = null;
                }
            } catch (Exception unused5) {
                bufferedOutputStream = null;
                bufferedInputStream = null;
                if (bufferedOutputStream != null) {
                    try {
                        bufferedOutputStream.close();
                    } catch (IOException unused6) {
                    }
                }
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (IOException unused7) {
                    }
                }
                if (processExec != null) {
                    processExec.destroy();
                }
                return strA;
            } catch (Throwable th3) {
                th = th3;
                bufferedInputStream = null;
                if (bufferedOutputStream2 != null) {
                    try {
                        bufferedOutputStream2.close();
                    } catch (IOException unused8) {
                    }
                }
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (IOException unused9) {
                    }
                }
                if (processExec != null) {
                    throw th;
                }
                processExec.destroy();
                throw th;
            }
        } catch (Exception unused10) {
            processExec = null;
        } catch (Throwable th4) {
            th = th4;
            processExec = null;
        }
        processExec.destroy();
        return strA;
    }

    private static void a(byte[] bArr, int i, byte[] bArr2) {
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i2 % bArr2.length]);
        }
    }
}
