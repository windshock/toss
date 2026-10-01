package o;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class Cookies_clearByName {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    public static Intent onWarmupCompleted(Context context, File file, String str, String str2) {
        int i = 2 % 2;
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri uriForFile = FileProvider.getUriForFile(context, str2, file);
        context.grantUriPermission(context.getPackageName(), uriForFile, 1);
        intent.setDataAndType(uriForFile, str);
        intent.setFlags(1073741825);
        int i2 = onExtraCallbackWithResult + 31;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return intent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static File onWarmupCompleted(byte[] bArr, File file) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        onExtraCallback = i2 % 128;
        FileOutputStream fileOutputStream = null;
        if (i2 % 2 == 0) {
            file.exists();
            fileOutputStream.hashCode();
            throw null;
        }
        if (file.exists()) {
            int i3 = onExtraCallbackWithResult + 79;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                file.delete();
                fileOutputStream.hashCode();
                throw null;
            }
            file.delete();
            int i4 = onExtraCallback + 15;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused) {
                }
                return file;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
