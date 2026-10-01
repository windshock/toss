package o;

import android.content.Context;
import android.os.Build;
import com.applovin.shadow.okio.NioSystemFileSystem$;
import im.toss.rn.toss.core.bridge.module.storage.ReactDatabaseSupplier;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class setNativeAdListener {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    public static void onExtraCallback(Context context) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            if (IAuthTabCallback(context)) {
                int i3 = onExtraCallbackWithResult + 49;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            ArrayList<File> arrayListOnExtraCallbackWithResult = onExtraCallbackWithResult(context);
            File fileOnExtraCallback = onExtraCallback(arrayListOnExtraCallbackWithResult);
            if (fileOnExtraCallback == null) {
                return;
            }
            try {
                ReactDatabaseSupplier.onNavigationEvent(context).onExtraCallbackWithResult();
                onNavigationEvent(new FileInputStream(fileOnExtraCallback), new FileOutputStream(context.getDatabasePath("RKStorage")));
                fileOnExtraCallback.getName();
                try {
                    Iterator<File> it = arrayListOnExtraCallbackWithResult.iterator();
                    while (it.hasNext()) {
                        File next = it.next();
                        if (next.delete()) {
                            next.getName();
                        } else {
                            next.getName();
                        }
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            } catch (Exception unused2) {
                fileOnExtraCallback.getName();
                return;
            }
        }
        IAuthTabCallback(context);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static boolean IAuthTabCallback(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zExists = context.getDatabasePath("RKStorage").exists();
        if (i3 != 0) {
            int i4 = 78 / 0;
        }
        int i5 = IAuthTabCallback + 119;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return zExists;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static ArrayList<File> onExtraCallbackWithResult(Context context) {
        int i = 2 % 2;
        ArrayList<File> arrayList = new ArrayList<>();
        try {
            File[] fileArrListFiles = context.getDatabasePath("noop").getParentFile().listFiles();
            if (fileArrListFiles != null) {
                int i2 = onExtraCallbackWithResult + 23;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 0;
                int length = fileArrListFiles.length;
                while (i4 < length) {
                    int i5 = IAuthTabCallback + 111;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    File file = fileArrListFiles[i4];
                    if (file.getName().startsWith("RKStorage-scoped-experience-") && !file.getName().endsWith("-journal")) {
                        arrayList.add(file);
                    }
                    i4++;
                    int i7 = IAuthTabCallback + 7;
                    onExtraCallbackWithResult = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i8 = 3 % 3;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    private static File onExtraCallback(ArrayList<File> arrayList) {
        int i = 2 % 2;
        File file = null;
        if (arrayList.size() == 0) {
            return null;
        }
        Iterator<File> it = arrayList.iterator();
        long j = -1;
        while (it.hasNext()) {
            int i2 = IAuthTabCallback + 51;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            File next = it.next();
            long jOnExtraCallbackWithResult = onExtraCallbackWithResult(next);
            if (jOnExtraCallbackWithResult > j) {
                file = next;
                j = jOnExtraCallbackWithResult;
            }
        }
        if (file != null) {
            return file;
        }
        File file2 = arrayList.get(0);
        int i4 = onExtraCallbackWithResult + 55;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return file2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 26) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static long onExtraCallbackWithResult(File file) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        onExtraCallbackWithResult = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                if (Build.VERSION.SDK_INT >= 14) {
                    int i3 = onExtraCallbackWithResult + 119;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    return IAuthTabCallback(file);
                }
                return file.lastModified();
            }
        } catch (Exception unused) {
            return -1L;
        }
    }

    private static long IAuthTabCallback(File file) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        try {
            long millis = Files.readAttributes(file.toPath(), NioSystemFileSystem$.ExternalSyntheticApiModelOutline0.m(), new LinkOption[0]).creationTime().toMillis();
            int i4 = IAuthTabCallback + 7;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return millis;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Exception unused) {
            return -1L;
        }
    }

    private static void onNavigationEvent(FileInputStream fileInputStream, FileOutputStream fileOutputStream) throws Throwable {
        FileChannel fileChannel;
        int i = 2 % 2;
        FileChannel channel = null;
        try {
            FileChannel channel2 = fileInputStream.getChannel();
            try {
                channel = fileOutputStream.getChannel();
                channel2.transferTo(0L, channel2.size(), channel);
                try {
                    channel2.close();
                    if (channel != null) {
                        int i2 = IAuthTabCallback + 3;
                        onExtraCallbackWithResult = i2 % 128;
                        int i3 = i2 % 2;
                        channel.close();
                    }
                } catch (Throwable th) {
                    if (channel != null) {
                        channel.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                FileChannel fileChannel2 = channel;
                channel = channel2;
                fileChannel = fileChannel2;
                if (channel != null) {
                    int i4 = IAuthTabCallback + 27;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    try {
                        channel.close();
                    } catch (Throwable th3) {
                        if (fileChannel != null) {
                            fileChannel.close();
                        }
                        throw th3;
                    }
                }
                if (fileChannel != null) {
                    int i6 = IAuthTabCallback + 37;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    fileChannel.close();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            fileChannel = null;
        }
    }
}
