package com.google.android.play.core.assetpacks;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.util.Properties;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class em {
    private static final com.google.android.play.core.assetpacks.internal.o a;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final bh c;
    private final String d;
    private final int e;
    private final long f;
    private final String g;
    private static final byte[] $$a = {98, -3, -80, -4};
    private static final int $$b = 180;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private final byte[] b = new byte[8192];
    private int h = -1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i2, int i3) {
        int i4;
        int i5 = (i3 * 2) + 105;
        int i6 = 4 - (i2 * 3);
        byte[] bArr = $$a;
        int i7 = s * 4;
        byte[] bArr2 = new byte[i7 + 1];
        if (bArr == null) {
            int i8 = i7;
            int i9 = i6;
            i4 = 0;
            int i10 = i9 + 1;
            i5 = i6 + i8;
            i6 = i10;
            bArr2[i4] = (byte) i5;
            if (i4 == i7) {
                return new String(bArr2, 0);
            }
            i4++;
            i8 = bArr[i6];
            int i11 = i5;
            i9 = i6;
            i6 = i11;
            int i102 = i9 + 1;
            i5 = i6 + i8;
            i6 = i102;
            bArr2[i4] = (byte) i5;
            if (i4 == i7) {
            }
        } else {
            i4 = 0;
            bArr2[i4] = (byte) i5;
            if (i4 == i7) {
            }
        }
    }

    static {
        onWarmupCompleted = 1;
        onNavigationEvent();
        a = new com.google.android.play.core.assetpacks.internal.o("SliceMetadataManager");
        int i2 = onExtraCallbackWithResult + 123;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
    }

    em(bh bhVar, String str, int i2, long j, String str2) {
        this.c = bhVar;
        this.d = str;
        this.e = i2;
        this.f = j;
        this.g = str2;
    }

    final File c() {
        int i2 = 2 % 2;
        File file = new File(n(), String.format("%s-NAM.dat", Integer.valueOf(this.h)));
        int i3 = onExtraCallback + 35;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return file;
    }

    final void d(InputStream inputStream, long j) throws IOException {
        int i2;
        int i3 = 2 % 2;
        RandomAccessFile randomAccessFile = new RandomAccessFile(c(), "rw");
        try {
            randomAccessFile.seek(j);
            do {
                i2 = inputStream.read(this.b);
                if (i2 > 0) {
                    int i4 = IAuthTabCallback + 101;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    randomAccessFile.write(this.b, 0, i2);
                }
            } while (i2 == 8192);
            int i6 = IAuthTabCallback + 113;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                randomAccessFile.close();
            } else {
                randomAccessFile.close();
                int i7 = 53 / 0;
            }
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    final void e(long j, byte[] bArr, int i2, int i3) throws IOException {
        int i4 = 2 % 2;
        RandomAccessFile randomAccessFile = new RandomAccessFile(c(), "rw");
        try {
            randomAccessFile.seek(j);
            randomAccessFile.write(bArr, i2, i3);
            randomAccessFile.close();
            int i5 = onExtraCallback + 85;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    final void k(byte[] bArr, InputStream inputStream) throws IOException {
        int i2 = 2 % 2;
        this.h++;
        FileOutputStream fileOutputStream = new FileOutputStream(c());
        try {
            fileOutputStream.write(bArr);
            int i3 = inputStream.read(this.b);
            while (i3 > 0) {
                int i4 = onExtraCallback + 39;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    fileOutputStream.write(this.b, 0, i3);
                    i3 = inputStream.read(this.b);
                } else {
                    fileOutputStream.write(this.b, 0, i3);
                    i3 = inputStream.read(this.b);
                }
            }
            fileOutputStream.close();
            int i5 = onExtraCallback + 65;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    final void l(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = 2 % 2;
        this.h++;
        FileOutputStream fileOutputStream = new FileOutputStream(c());
        try {
            fileOutputStream.write(bArr, 0, i3);
            fileOutputStream.close();
            int i5 = IAuthTabCallback + 77;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private final File n() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 83;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        File fileO = this.c.o(this.d, this.e, this.f, this.g);
        if (!fileO.exists()) {
            int i5 = onExtraCallback + 89;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            fileO.mkdirs();
            if (i6 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i7 = IAuthTabCallback + 81;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
        }
        return fileO;
    }

    private final File o() throws IOException {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 9;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        File fileN = this.c.n(this.d, this.e, this.f, this.g);
        fileN.getParentFile().mkdirs();
        fileN.createNewFile();
        int i5 = onExtraCallback + 87;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 83 / 0;
        }
        return fileN;
    }

    final int a() throws IOException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 5;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            this.c.n(this.d, this.e, this.f, this.g).exists();
            throw null;
        }
        File fileN = this.c.n(this.d, this.e, this.f, this.g);
        if (!fileN.exists()) {
            int i4 = onExtraCallback + 81;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 44 / 0;
            }
            return 0;
        }
        FileInputStream fileInputStream = new FileInputStream(fileN);
        try {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
            if (Integer.parseInt(properties.getProperty("fileStatus", "-1")) != 4) {
                if (properties.getProperty("previousChunk") != null) {
                    return Integer.parseInt(properties.getProperty("previousChunk")) + 1;
                }
                throw new ck("Slice checkpoint file corrupt.");
            }
            int i6 = onExtraCallback + 15;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return -1;
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    final el b() throws Throwable {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 11;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            this.c.n(this.d, this.e, this.f, this.g).exists();
            throw null;
        }
        File fileN = this.c.n(this.d, this.e, this.f, this.g);
        if (!fileN.exists()) {
            throw new ck("Slice checkpoint file does not exist.");
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(fileN);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("fileStatus") != null) {
                int i4 = IAuthTabCallback + 23;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                if (properties.getProperty("previousChunk") != null) {
                    try {
                        int i6 = Integer.parseInt(properties.getProperty("fileStatus"));
                        String property = properties.getProperty("fileName");
                        long j = Long.parseLong(properties.getProperty("fileOffset", "-1"));
                        long j2 = Long.parseLong(properties.getProperty("remainingBytes", "-1"));
                        int i7 = Integer.parseInt(properties.getProperty("previousChunk"));
                        Object[] objArr = new Object[1];
                        p(1 - Gravity.getAbsoluteGravity(0, 0), 1 - (ViewConfiguration.getWindowTouchSlop() >> 8), new char[]{0}, false, KeyEvent.normalizeMetaState(0) + 219, objArr);
                        this.h = Integer.parseInt(properties.getProperty("metadataFileCounter", ((String) objArr[0]).intern()));
                        return new bp(i6, property, j, j2, i7);
                    } catch (NumberFormatException e) {
                        throw new ck("Slice checkpoint file corrupt.", e);
                    }
                }
            }
            throw new ck("Slice checkpoint file corrupt.");
        } finally {
        }
    }

    final void h(byte[] bArr, int i2) throws Throwable {
        int i3 = 2 % 2;
        Properties properties = new Properties();
        Object[] objArr = new Object[1];
        p(1 - KeyEvent.getDeadChar(0, 0), Color.green(0) + 1, new char[]{0}, false, (ViewConfiguration.getJumpTapTimeout() >> 16) + 221, objArr);
        properties.put("fileStatus", ((String) objArr[0]).intern());
        properties.put("previousChunk", String.valueOf(i2));
        properties.put("metadataFileCounter", String.valueOf(this.h));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            File fileM = this.c.m(this.d, this.e, this.f, this.g);
            if (fileM.exists()) {
                int i4 = onExtraCallback + 119;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    fileM.delete();
                    throw null;
                }
                fileM.delete();
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(fileM);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.close();
                int i5 = IAuthTabCallback + 73;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            } catch (Throwable th) {
                try {
                    fileOutputStream2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                fileOutputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    final void i(int i2) throws IOException {
        int i3 = 2 % 2;
        Properties properties = new Properties();
        properties.put("fileStatus", "4");
        properties.put("previousChunk", String.valueOf(i2));
        properties.put("metadataFileCounter", String.valueOf(this.h));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            int i4 = IAuthTabCallback + 101;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    final void j(byte[] bArr) throws IOException {
        int i2 = 2 % 2;
        this.h++;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(n(), String.format("%s-LFH.dat", Integer.valueOf(this.h))));
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
                int i3 = onExtraCallback + 109;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            } finally {
            }
        } catch (IOException e) {
            throw new ck("Could not write metadata file.", e);
        }
    }

    final void f(int i2) throws IOException {
        int i3 = 2 % 2;
        Properties properties = new Properties();
        properties.put("fileStatus", "3");
        properties.put("fileOffset", String.valueOf(c().length()));
        properties.put("previousChunk", String.valueOf(i2));
        properties.put("metadataFileCounter", String.valueOf(this.h));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        Object obj = null;
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            int i4 = IAuthTabCallback + 37;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    final boolean m() throws IOException {
        int i2 = 2 % 2;
        File fileN = this.c.n(this.d, this.e, this.f, this.g);
        if (!fileN.exists()) {
            return false;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(fileN);
            try {
                Properties properties = new Properties();
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") == null) {
                    a.b("Slice checkpoint file corrupt while checking if extraction finished.", new Object[0]);
                    return false;
                }
                if (Integer.parseInt(properties.getProperty("fileStatus")) == 4) {
                    return true;
                }
                int i3 = IAuthTabCallback + 123;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return false;
            } finally {
            }
        } catch (IOException e) {
            a.b("Could not read checkpoint while checking if extraction finished. %s", e);
            int i5 = IAuthTabCallback + 93;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
    }

    final void g(String str, long j, long j2, int i2) throws Throwable {
        int i3 = 2 % 2;
        Properties properties = new Properties();
        Object[] objArr = new Object[1];
        p((ViewConfiguration.getTapTimeout() >> 16) + 1, TextUtils.indexOf("", "", 0, 0) + 1, new char[]{0}, false, 220 - Color.blue(0), objArr);
        properties.put("fileStatus", ((String) objArr[0]).intern());
        properties.put("fileName", str);
        properties.put("fileOffset", String.valueOf(j));
        properties.put("remainingBytes", String.valueOf(j2));
        properties.put("previousChunk", String.valueOf(i2));
        properties.put("metadataFileCounter", String.valueOf(this.h));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            int i4 = IAuthTabCallback + 123;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void p(int i2, int i3, char[] cArr, boolean z, int i4, Object[] objArr) throws Throwable {
        int i5;
        char[] cArr2;
        Throwable cause;
        int i6 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr3 = new char[i2];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i5 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i2) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr3[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i4 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i7 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i7]), Integer.valueOf(onNavigationEvent)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 23 - (ViewConfiguration.getPressedStateDuration() >> 16), 10278 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 54 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 2167 - View.resolveSizeAndState(0, 0, 0), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i8 = $11 + 67;
                $10 = i8 % 128;
                int i9 = i8 % 2;
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i3 > 0) {
            int i10 = $11 + 41;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i3;
            char[] cArr4 = new char[i2];
            System.arraycopy(cArr3, 0, cArr4, 0, i2);
            System.arraycopy(cArr4, 0, cArr3, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr4, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr3, 0, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            int i12 = $11 + 19;
            $10 = i12 % 128;
            if (i12 % 2 != 0) {
                cArr2 = new char[i2];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 1;
            } else {
                cArr2 = new char[i2];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            }
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i2) {
                int i13 = $10 + 85;
                $11 = i13 % 128;
                if (i13 % 2 == 0) {
                    cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr3[(i2 << simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) + 1];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getSize(0) + 12843), Gravity.getAbsoluteGravity(0, 0) + 55, TextUtils.getOffsetBefore("", 0) + 2167, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } else {
                    cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr3[(i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback4 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 12842), TextUtils.getCapsMode("", 0, 0) + 55, 2167 - Gravity.getAbsoluteGravity(0, 0), 1298711993, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                int i14 = $10 + 109;
                $11 = i14 % 128;
                int i15 = i14 % 2;
                i5 = 2083011369;
            }
            cArr3 = cArr2;
        }
        objArr[0] = new String(cArr3);
    }

    static void onNavigationEvent() {
        onNavigationEvent = 478308994;
    }
}
