package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFj1qSDK {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public static final AFj1qSDK onNavigationEvent = new AFj1qSDK();
    private static int onWarmupCompleted;

    static {
        int i = onExtraCallbackWithResult + 25;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private AFj1qSDK() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Uri onExtraCallbackWithResult(@NotNull Context context, @NotNull Bitmap bitmap) throws Throwable {
        File fileOnExtraCallback;
        Exception exc;
        FileOutputStream fileOutputStream;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onExtraCallback = i2 % 128;
        ?? r1 = i2 % 2;
        OutputStream outputStream = null;
        try {
        } catch (IOException e) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "CommonUtils", e.getMessage(), e, (Map) null, 8, (Object) null);
            fileOnExtraCallback = null;
        }
        if (r1 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(bitmap, "");
            onExtraCallback(context);
            outputStream.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(bitmap, "");
        fileOnExtraCallback = onExtraCallback(context);
        try {
            try {
            } catch (Throwable th) {
                th = th;
                outputStream = r1;
            }
        } catch (Exception e2) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "CommonUtils", e2.getMessage(), e2, (Map) null, 8, (Object) null);
            r1 = r1;
        }
        if (fileOnExtraCallback != null) {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(fileOnExtraCallback);
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream2);
                    fileOutputStream2.flush();
                    r1 = fileOutputStream2;
                } catch (Exception e3) {
                    exc = e3;
                    fileOutputStream = fileOutputStream2;
                    ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "CommonUtils", exc.getMessage(), exc, (Map) null, 8, (Object) null);
                    r1 = fileOutputStream;
                    if (fileOutputStream != null) {
                        int i3 = IAuthTabCallback + 1;
                        onExtraCallback = i3 % 128;
                        int i4 = i3 % 2;
                        fileOutputStream.flush();
                        r1 = fileOutputStream;
                        r1.close();
                        r1 = r1;
                    }
                    if (fileOnExtraCallback == null) {
                    }
                }
            } catch (Exception e4) {
                exc = e4;
                fileOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                if (outputStream != null) {
                    try {
                        outputStream.flush();
                        outputStream.close();
                    } catch (Exception e5) {
                        ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "CommonUtils", e5.getMessage(), e5, (Map) null, 8, (Object) null);
                    }
                }
                throw th;
            }
            r1.close();
            r1 = r1;
        }
        if (fileOnExtraCallback == null) {
            return Uri.fromFile(fileOnExtraCallback);
        }
        return null;
    }

    public final File onExtraCallback(@NotNull Context context) throws IOException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        File fileCreateTempFile = File.createTempFile("JPEG_" + new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()) + "_", ".jpg", context.getExternalFilesDir(Environment.DIRECTORY_PICTURES));
        int i2 = onExtraCallback + 37;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return fileCreateTempFile;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean onExtraCallback(@NotNull Bitmap bitmap) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(bitmap, "");
        if (Build.VERSION.SDK_INT >= 26 && bitmap.getConfig() == EncoderProfilesProxyCompatBaseImpl.onExtraCallback()) {
            bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, false);
        }
        if (bitmap == null) {
            int i2 = IAuthTabCallback + 51;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width > 0) {
            int i4 = onExtraCallback + 103;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            if (height > 0) {
                try {
                    if (Color.alpha(bitmap.getPixel(0, 0)) == 0) {
                        int i6 = IAuthTabCallback + 19;
                        onExtraCallback = i6 % 128;
                        int i7 = i6 % 2;
                        return true;
                    }
                    int i8 = width - 1;
                    if (Color.alpha(bitmap.getPixel(i8, 0)) == 0) {
                        return true;
                    }
                    int i9 = height - 1;
                    if (Color.alpha(bitmap.getPixel(0, i9)) == 0) {
                        return true;
                    }
                    if (Color.alpha(bitmap.getPixel(i8, i9)) != 0) {
                        return false;
                    }
                    int i10 = IAuthTabCallback + 21;
                    onExtraCallback = i10 % 128;
                    int i11 = i10 % 2;
                    return true;
                } catch (Exception e) {
                    ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "ImageUtils", e.getMessage(), e, (Map) null, 8, (Object) null);
                }
            }
        }
        return false;
    }
}
