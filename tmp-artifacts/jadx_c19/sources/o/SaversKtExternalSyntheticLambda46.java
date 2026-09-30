package o;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import androidx.annotation.NonNull;
import com.bumptech.glide.Glide;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import o.SaversKtExternalSyntheticLambda35;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SaversKtExternalSyntheticLambda46 implements SaversKtExternalSyntheticLambda35<InputStream> {
    private final SaversKtExternalSyntheticLambda47 IAuthTabCallback;
    private InputStream onExtraCallbackWithResult;
    private final Uri onWarmupCompleted;

    @Override // o.SaversKtExternalSyntheticLambda35
    public void onExtraCallbackWithResult() {
    }

    public static SaversKtExternalSyntheticLambda46 onWarmupCompleted(Context context, Uri uri) {
        return IAuthTabCallback(context, uri, new onExtraCallbackWithResult(context.getContentResolver()));
    }

    public static SaversKtExternalSyntheticLambda46 IAuthTabCallback(Context context, Uri uri) {
        return IAuthTabCallback(context, uri, new onNavigationEvent(context.getContentResolver()));
    }

    private static SaversKtExternalSyntheticLambda46 IAuthTabCallback(Context context, Uri uri, SaversKtExternalSyntheticLambda45 saversKtExternalSyntheticLambda45) {
        return new SaversKtExternalSyntheticLambda46(uri, new SaversKtExternalSyntheticLambda47(Glide.onNavigationEvent(context).onTransact().onExtraCallback(), saversKtExternalSyntheticLambda45, Glide.onNavigationEvent(context).onExtraCallbackWithResult(), context.getContentResolver()));
    }

    SaversKtExternalSyntheticLambda46(Uri uri, SaversKtExternalSyntheticLambda47 saversKtExternalSyntheticLambda47) {
        this.onWarmupCompleted = uri;
        this.IAuthTabCallback = saversKtExternalSyntheticLambda47;
    }

    @Override // o.SaversKtExternalSyntheticLambda35
    public void onExtraCallback(@NonNull SaversKtExternalSyntheticLambda11 saversKtExternalSyntheticLambda11, @NonNull SaversKtExternalSyntheticLambda35.onNavigationEvent<? super InputStream> onnavigationevent) throws Throwable {
        try {
            InputStream inputStreamOnWarmupCompleted = onWarmupCompleted();
            this.onExtraCallbackWithResult = inputStreamOnWarmupCompleted;
            onnavigationevent.onExtraCallback((SaversKtExternalSyntheticLambda35.onNavigationEvent<? super InputStream>) inputStreamOnWarmupCompleted);
        } catch (FileNotFoundException e) {
            onnavigationevent.onExtraCallback((Exception) e);
        }
    }

    private InputStream onWarmupCompleted() throws Throwable {
        InputStream inputStreamOnExtraCallback = this.IAuthTabCallback.onExtraCallback(this.onWarmupCompleted);
        int iIAuthTabCallback = inputStreamOnExtraCallback != null ? this.IAuthTabCallback.IAuthTabCallback(this.onWarmupCompleted) : -1;
        return iIAuthTabCallback != -1 ? new SaversKtExternalSyntheticLambda38(inputStreamOnExtraCallback, iIAuthTabCallback) : inputStreamOnExtraCallback;
    }

    @Override // o.SaversKtExternalSyntheticLambda35
    public void onExtraCallback() throws IOException {
        InputStream inputStream = this.onExtraCallbackWithResult;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // o.SaversKtExternalSyntheticLambda35
    public Class<InputStream> onNavigationEvent() {
        return InputStream.class;
    }

    @Override // o.SaversKtExternalSyntheticLambda35
    public SaversKtExternalSyntheticLambda21 IAuthTabCallback() {
        return SaversKtExternalSyntheticLambda21.LOCAL;
    }

    static class onNavigationEvent implements SaversKtExternalSyntheticLambda45 {
        private static final String[] onExtraCallback = {"_data"};
        private final ContentResolver onWarmupCompleted;

        onNavigationEvent(ContentResolver contentResolver) {
            this.onWarmupCompleted = contentResolver;
        }

        @Override // o.SaversKtExternalSyntheticLambda45
        public Cursor onWarmupCompleted(Uri uri) {
            return this.onWarmupCompleted.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, onExtraCallback, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    static class onExtraCallbackWithResult implements SaversKtExternalSyntheticLambda45 {
        private static final String[] onExtraCallbackWithResult = {"_data"};
        private final ContentResolver onWarmupCompleted;

        onExtraCallbackWithResult(ContentResolver contentResolver) {
            this.onWarmupCompleted = contentResolver;
        }

        @Override // o.SaversKtExternalSyntheticLambda45
        public Cursor onWarmupCompleted(Uri uri) {
            return this.onWarmupCompleted.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, onExtraCallbackWithResult, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }
}
