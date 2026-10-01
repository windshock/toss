package o;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.FileNotFoundException;
import o.SaversKtExternalSyntheticLambda35;
import o.ShaderBrushSpanExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class doFrame implements ShaderBrushSpanExternalSyntheticLambda0<Uri, File> {
    private final Context IAuthTabCallback;

    public doFrame(Context context) {
        this.IAuthTabCallback = context;
    }

    @Override // o.ShaderBrushSpanExternalSyntheticLambda0
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public ShaderBrushSpanExternalSyntheticLambda0.onExtraCallbackWithResult<File> onNavigationEvent(@NonNull Uri uri, int i2, int i3, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) {
        return new ShaderBrushSpanExternalSyntheticLambda0.onExtraCallbackWithResult<>(new setDpMargin(uri), new IAuthTabCallback(this.IAuthTabCallback, uri));
    }

    @Override // o.ShaderBrushSpanExternalSyntheticLambda0
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public boolean onNavigationEvent(@NonNull Uri uri) {
        return SaversKtExternalSyntheticLambda44.onExtraCallback(uri);
    }

    static class IAuthTabCallback implements SaversKtExternalSyntheticLambda35<File> {
        private static final String[] IAuthTabCallback = {"_data"};
        private final Context onExtraCallback;
        private final Uri onWarmupCompleted;

        @Override // o.SaversKtExternalSyntheticLambda35
        public void onExtraCallback() {
        }

        @Override // o.SaversKtExternalSyntheticLambda35
        public void onExtraCallbackWithResult() {
        }

        IAuthTabCallback(Context context, Uri uri) {
            this.onExtraCallback = context;
            this.onWarmupCompleted = uri;
        }

        @Override // o.SaversKtExternalSyntheticLambda35
        public void onExtraCallback(@NonNull SaversKtExternalSyntheticLambda11 saversKtExternalSyntheticLambda11, @NonNull SaversKtExternalSyntheticLambda35.onNavigationEvent<? super File> onnavigationevent) {
            Cursor cursorQuery = this.onExtraCallback.getContentResolver().query(this.onWarmupCompleted, IAuthTabCallback, null, null, null);
            if (cursorQuery != null) {
                try {
                    string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                } finally {
                    cursorQuery.close();
                }
            }
            if (TextUtils.isEmpty(string)) {
                onnavigationevent.onExtraCallback((Exception) new FileNotFoundException("Failed to find file path for: " + this.onWarmupCompleted));
                return;
            }
            onnavigationevent.onExtraCallback((SaversKtExternalSyntheticLambda35.onNavigationEvent<? super File>) new File(string));
        }

        @Override // o.SaversKtExternalSyntheticLambda35
        public Class<File> onNavigationEvent() {
            return File.class;
        }

        @Override // o.SaversKtExternalSyntheticLambda35
        public SaversKtExternalSyntheticLambda21 IAuthTabCallback() {
            return SaversKtExternalSyntheticLambda21.LOCAL;
        }
    }

    public static final class onExtraCallback implements ResolvedTextDirection<Uri, File> {
        private final Context IAuthTabCallback;

        public onExtraCallback(Context context) {
            this.IAuthTabCallback = context;
        }

        @Override // o.ResolvedTextDirection
        public ShaderBrushSpanExternalSyntheticLambda0<Uri, File> IAuthTabCallback(AndroidViewBindingKtExternalSyntheticLambda3 androidViewBindingKtExternalSyntheticLambda3) {
            return new doFrame(this.IAuthTabCallback);
        }
    }
}
