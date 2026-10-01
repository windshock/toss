package o;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import o.SaversKtExternalSyntheticLambda35;
import o.ShaderBrushSpanExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AndroidViewBindingKtExternalSyntheticLambda9<DataT> implements ShaderBrushSpanExternalSyntheticLambda0<Uri, DataT> {
    private final Class<DataT> IAuthTabCallback;
    private final ShaderBrushSpanExternalSyntheticLambda0<Uri, DataT> onExtraCallback;
    private final Context onExtraCallbackWithResult;
    private final ShaderBrushSpanExternalSyntheticLambda0<File, DataT> onNavigationEvent;

    AndroidViewBindingKtExternalSyntheticLambda9(Context context, ShaderBrushSpanExternalSyntheticLambda0<File, DataT> shaderBrushSpanExternalSyntheticLambda0, ShaderBrushSpanExternalSyntheticLambda0<Uri, DataT> shaderBrushSpanExternalSyntheticLambda02, Class<DataT> cls) {
        this.onExtraCallbackWithResult = context.getApplicationContext();
        this.onNavigationEvent = shaderBrushSpanExternalSyntheticLambda0;
        this.onExtraCallback = shaderBrushSpanExternalSyntheticLambda02;
        this.IAuthTabCallback = cls;
    }

    @Override // o.ShaderBrushSpanExternalSyntheticLambda0
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public ShaderBrushSpanExternalSyntheticLambda0.onExtraCallbackWithResult<DataT> onNavigationEvent(@NonNull Uri uri, int i2, int i3, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) {
        return new ShaderBrushSpanExternalSyntheticLambda0.onExtraCallbackWithResult<>(new setDpMargin(uri), new onWarmupCompleted(this.onExtraCallbackWithResult, this.onNavigationEvent, this.onExtraCallback, uri, i2, i3, saversKtExternalSyntheticLambda30, this.IAuthTabCallback));
    }

    @Override // o.ShaderBrushSpanExternalSyntheticLambda0
    public boolean onNavigationEvent(@NonNull Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && SaversKtExternalSyntheticLambda44.onExtraCallback(uri);
    }

    static final class onWarmupCompleted<DataT> implements SaversKtExternalSyntheticLambda35<DataT> {
        private static final String[] IAuthTabCallback = {"_data"};
        private final SaversKtExternalSyntheticLambda30 IAuthTabCallbackDefault;
        private final ShaderBrushSpanExternalSyntheticLambda0<Uri, DataT> IAuthTabCallbackStub;
        private final int asBinder;
        private volatile boolean asInterface;
        private final int getInterfaceDescriptor;
        private final Class<DataT> onExtraCallback;
        private final ShaderBrushSpanExternalSyntheticLambda0<File, DataT> onExtraCallbackWithResult;
        private final Context onNavigationEvent;
        private final Uri onTransact;
        private volatile SaversKtExternalSyntheticLambda35<DataT> onWarmupCompleted;

        onWarmupCompleted(Context context, ShaderBrushSpanExternalSyntheticLambda0<File, DataT> shaderBrushSpanExternalSyntheticLambda0, ShaderBrushSpanExternalSyntheticLambda0<Uri, DataT> shaderBrushSpanExternalSyntheticLambda02, Uri uri, int i2, int i3, SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30, Class<DataT> cls) {
            this.onNavigationEvent = context.getApplicationContext();
            this.onExtraCallbackWithResult = shaderBrushSpanExternalSyntheticLambda0;
            this.IAuthTabCallbackStub = shaderBrushSpanExternalSyntheticLambda02;
            this.onTransact = uri;
            this.getInterfaceDescriptor = i2;
            this.asBinder = i3;
            this.IAuthTabCallbackDefault = saversKtExternalSyntheticLambda30;
            this.onExtraCallback = cls;
        }

        @Override // o.SaversKtExternalSyntheticLambda35
        public void onExtraCallback(@NonNull SaversKtExternalSyntheticLambda11 saversKtExternalSyntheticLambda11, @NonNull SaversKtExternalSyntheticLambda35.onNavigationEvent<? super DataT> onnavigationevent) {
            try {
                SaversKtExternalSyntheticLambda35<DataT> saversKtExternalSyntheticLambda35AsInterface = asInterface();
                if (saversKtExternalSyntheticLambda35AsInterface == null) {
                    onnavigationevent.onExtraCallback((Exception) new IllegalArgumentException("Failed to build fetcher for: " + this.onTransact));
                    return;
                }
                this.onWarmupCompleted = saversKtExternalSyntheticLambda35AsInterface;
                if (this.asInterface) {
                    onExtraCallbackWithResult();
                } else {
                    saversKtExternalSyntheticLambda35AsInterface.onExtraCallback(saversKtExternalSyntheticLambda11, onnavigationevent);
                }
            } catch (FileNotFoundException e) {
                onnavigationevent.onExtraCallback((Exception) e);
            }
        }

        private SaversKtExternalSyntheticLambda35<DataT> asInterface() throws FileNotFoundException {
            ShaderBrushSpanExternalSyntheticLambda0.onExtraCallbackWithResult<DataT> onextracallbackwithresultOnWarmupCompleted = onWarmupCompleted();
            if (onextracallbackwithresultOnWarmupCompleted != null) {
                return onextracallbackwithresultOnWarmupCompleted.onExtraCallback;
            }
            return null;
        }

        private ShaderBrushSpanExternalSyntheticLambda0.onExtraCallbackWithResult<DataT> onWarmupCompleted() throws FileNotFoundException {
            if (Environment.isExternalStorageLegacy()) {
                return this.onExtraCallbackWithResult.onNavigationEvent(onExtraCallbackWithResult(this.onTransact), this.getInterfaceDescriptor, this.asBinder, this.IAuthTabCallbackDefault);
            }
            return this.IAuthTabCallbackStub.onNavigationEvent(onTransact() ? MediaStore.setRequireOriginal(this.onTransact) : this.onTransact, this.getInterfaceDescriptor, this.asBinder, this.IAuthTabCallbackDefault);
        }

        @Override // o.SaversKtExternalSyntheticLambda35
        public void onExtraCallback() {
            SaversKtExternalSyntheticLambda35<DataT> saversKtExternalSyntheticLambda35 = this.onWarmupCompleted;
            if (saversKtExternalSyntheticLambda35 != null) {
                saversKtExternalSyntheticLambda35.onExtraCallback();
            }
        }

        @Override // o.SaversKtExternalSyntheticLambda35
        public void onExtraCallbackWithResult() {
            this.asInterface = true;
            SaversKtExternalSyntheticLambda35<DataT> saversKtExternalSyntheticLambda35 = this.onWarmupCompleted;
            if (saversKtExternalSyntheticLambda35 != null) {
                saversKtExternalSyntheticLambda35.onExtraCallbackWithResult();
            }
        }

        @Override // o.SaversKtExternalSyntheticLambda35
        public Class<DataT> onNavigationEvent() {
            return this.onExtraCallback;
        }

        @Override // o.SaversKtExternalSyntheticLambda35
        public SaversKtExternalSyntheticLambda21 IAuthTabCallback() {
            return SaversKtExternalSyntheticLambda21.LOCAL;
        }

        private File onExtraCallbackWithResult(Uri uri) throws FileNotFoundException {
            Cursor cursor = null;
            try {
                Cursor cursorQuery = this.onNavigationEvent.getContentResolver().query(uri, IAuthTabCallback, null, null, null);
                if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                }
                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                if (TextUtils.isEmpty(string)) {
                    throw new FileNotFoundException("File path was empty in media store for: " + uri);
                }
                File file = new File(string);
                cursorQuery.close();
                return file;
            } catch (Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        }

        private boolean onTransact() {
            return this.onNavigationEvent.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }
    }

    public static final class IAuthTabCallback extends onNavigationEvent<InputStream> {
        public IAuthTabCallback(Context context) {
            super(context, InputStream.class);
        }
    }

    public static final class onExtraCallback extends onNavigationEvent<ParcelFileDescriptor> {
        public onExtraCallback(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    static abstract class onNavigationEvent<DataT> implements ResolvedTextDirection<Uri, DataT> {
        private final Class<DataT> onExtraCallback;
        private final Context onExtraCallbackWithResult;

        onNavigationEvent(Context context, Class<DataT> cls) {
            this.onExtraCallbackWithResult = context;
            this.onExtraCallback = cls;
        }

        @Override // o.ResolvedTextDirection
        public final ShaderBrushSpanExternalSyntheticLambda0<Uri, DataT> IAuthTabCallback(@NonNull AndroidViewBindingKtExternalSyntheticLambda3 androidViewBindingKtExternalSyntheticLambda3) {
            return new AndroidViewBindingKtExternalSyntheticLambda9(this.onExtraCallbackWithResult, androidViewBindingKtExternalSyntheticLambda3.onWarmupCompleted(File.class, this.onExtraCallback), androidViewBindingKtExternalSyntheticLambda3.onWarmupCompleted(Uri.class, this.onExtraCallback), this.onExtraCallback);
        }
    }
}
