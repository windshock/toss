package o;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class SaversKtExternalSyntheticLambda47 {
    private static final SaversKtExternalSyntheticLambda42 onExtraCallback = new SaversKtExternalSyntheticLambda42();
    private final SaversKtExternalSyntheticLambda45 IAuthTabCallback;
    private final Savers_androidKtExternalSyntheticLambda6 onExtraCallbackWithResult;
    private final ContentResolver onNavigationEvent;
    private final SaversKtExternalSyntheticLambda42 onTransact;
    private final List<ImageHeaderParser> onWarmupCompleted;

    SaversKtExternalSyntheticLambda47(List<ImageHeaderParser> list, SaversKtExternalSyntheticLambda45 saversKtExternalSyntheticLambda45, Savers_androidKtExternalSyntheticLambda6 savers_androidKtExternalSyntheticLambda6, ContentResolver contentResolver) {
        this(list, onExtraCallback, saversKtExternalSyntheticLambda45, savers_androidKtExternalSyntheticLambda6, contentResolver);
    }

    SaversKtExternalSyntheticLambda47(List<ImageHeaderParser> list, SaversKtExternalSyntheticLambda42 saversKtExternalSyntheticLambda42, SaversKtExternalSyntheticLambda45 saversKtExternalSyntheticLambda45, Savers_androidKtExternalSyntheticLambda6 savers_androidKtExternalSyntheticLambda6, ContentResolver contentResolver) {
        this.onTransact = saversKtExternalSyntheticLambda42;
        this.IAuthTabCallback = saversKtExternalSyntheticLambda45;
        this.onExtraCallbackWithResult = savers_androidKtExternalSyntheticLambda6;
        this.onNavigationEvent = contentResolver;
        this.onWarmupCompleted = list;
    }

    int IAuthTabCallback(Uri uri) throws IOException {
        InputStream inputStreamOpenInputStream = null;
        try {
            try {
                inputStreamOpenInputStream = this.onNavigationEvent.openInputStream(uri);
                int iOnNavigationEvent = SaversKtExternalSyntheticLambda22.onNavigationEvent(this.onWarmupCompleted, inputStreamOpenInputStream, this.onExtraCallbackWithResult);
                if (inputStreamOpenInputStream != null) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return iOnNavigationEvent;
            } catch (IOException | NullPointerException unused2) {
                if (Log.isLoggable("ThumbStreamOpener", 3)) {
                    Objects.toString(uri);
                }
                if (inputStreamOpenInputStream == null) {
                    return -1;
                }
                try {
                    inputStreamOpenInputStream.close();
                    return -1;
                } catch (IOException unused3) {
                    return -1;
                }
            }
        } catch (Throwable th) {
            if (inputStreamOpenInputStream != null) {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    public InputStream onExtraCallback(Uri uri) throws Throwable {
        String strOnNavigationEvent = onNavigationEvent(uri);
        if (TextUtils.isEmpty(strOnNavigationEvent)) {
            return null;
        }
        File fileOnNavigationEvent = this.onTransact.onNavigationEvent(strOnNavigationEvent);
        if (!onWarmupCompleted(fileOnNavigationEvent)) {
            return null;
        }
        Uri uriFromFile = Uri.fromFile(fileOnNavigationEvent);
        try {
            return this.onNavigationEvent.openInputStream(uriFromFile);
        } catch (NullPointerException e) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String onNavigationEvent(@NonNull Uri uri) throws Throwable {
        Cursor cursorOnWarmupCompleted;
        Cursor cursor = null;
        try {
            cursorOnWarmupCompleted = this.IAuthTabCallback.onWarmupCompleted(uri);
            if (cursorOnWarmupCompleted != null) {
                try {
                    try {
                        if (cursorOnWarmupCompleted.moveToFirst()) {
                            String string = cursorOnWarmupCompleted.getString(0);
                            cursorOnWarmupCompleted.close();
                            return string;
                        }
                    } catch (SecurityException unused) {
                        if (Log.isLoggable("ThumbStreamOpener", 3)) {
                            Objects.toString(uri);
                        }
                        if (cursorOnWarmupCompleted != null) {
                            cursorOnWarmupCompleted.close();
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorOnWarmupCompleted;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorOnWarmupCompleted != null) {
                cursorOnWarmupCompleted.close();
            }
            return null;
        } catch (SecurityException unused2) {
            cursorOnWarmupCompleted = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
            }
            throw th;
        }
    }

    private boolean onWarmupCompleted(File file) {
        return this.onTransact.onExtraCallback(file) && 0 < this.onTransact.onNavigationEvent(file);
    }
}
