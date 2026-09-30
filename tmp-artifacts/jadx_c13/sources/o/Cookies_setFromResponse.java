package o;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.InputStream;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class Cookies_setFromResponse {
    public static final Cookies_setFromResponse IAuthTabCallback = new Cookies_setFromResponse();
    private static int asInterface = 1;
    private static final boolean onExtraCallback = false;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    static {
        int i = onWarmupCompleted + 45;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private Cookies_setFromResponse() {
    }

    public final Bitmap onExtraCallbackWithResult(@NotNull ContentResolver contentResolver, @NotNull Uri uri) throws FileNotFoundException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(contentResolver, "");
        Intrinsics.checkNotNullParameter(uri, "");
        try {
            InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = Bitmap.Config.RGB_565;
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                options.inJustDecodeBounds = false;
                int iMin = Math.min(options.outWidth, options.outHeight) / 640;
                options.inSampleSize = 1;
                int i2 = onExtraCallbackWithResult + 25;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                while (true) {
                    int i4 = options.inSampleSize << 1;
                    if (i4 <= iMin) {
                        options.inSampleSize = i4;
                    } else {
                        CloseableKt.closeFinally(inputStreamOpenInputStream, null);
                        inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                        try {
                            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                            CloseableKt.closeFinally(inputStreamOpenInputStream, null);
                            return bitmapDecodeStream;
                        } finally {
                        }
                    }
                }
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th) {
            if (!(!onExtraCallback)) {
                th.getMessage();
            }
            int i5 = onExtraCallbackWithResult + 105;
            asInterface = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 31 / 0;
            }
            return null;
        }
    }
}
