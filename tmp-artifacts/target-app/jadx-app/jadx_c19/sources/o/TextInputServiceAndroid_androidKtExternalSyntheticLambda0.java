package o;

import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import o.SaversKtExternalSyntheticLambda35;
import o.ShaderBrushSpanExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TextInputServiceAndroid_androidKtExternalSyntheticLambda0<Data> implements ShaderBrushSpanExternalSyntheticLambda0<File, Data> {
    private final IAuthTabCallback<Data> onWarmupCompleted;

    public interface IAuthTabCallback<Data> {
        Class<Data> onNavigationEvent();

        Data onNavigationEvent(File file) throws FileNotFoundException;

        void onWarmupCompleted(Data data) throws IOException;
    }

    @Override // o.ShaderBrushSpanExternalSyntheticLambda0
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public boolean onNavigationEvent(@NonNull File file) {
        return true;
    }

    public TextInputServiceAndroid_androidKtExternalSyntheticLambda0(IAuthTabCallback<Data> iAuthTabCallback) {
        this.onWarmupCompleted = iAuthTabCallback;
    }

    @Override // o.ShaderBrushSpanExternalSyntheticLambda0
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public ShaderBrushSpanExternalSyntheticLambda0.onExtraCallbackWithResult<Data> onNavigationEvent(@NonNull File file, int i2, int i3, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) {
        return new ShaderBrushSpanExternalSyntheticLambda0.onExtraCallbackWithResult<>(new setDpMargin(file), new onWarmupCompleted(file, this.onWarmupCompleted));
    }

    static final class onWarmupCompleted<Data> implements SaversKtExternalSyntheticLambda35<Data> {
        private final IAuthTabCallback<Data> IAuthTabCallback;
        private final File onNavigationEvent;
        private Data onWarmupCompleted;

        @Override // o.SaversKtExternalSyntheticLambda35
        public void onExtraCallbackWithResult() {
        }

        onWarmupCompleted(File file, IAuthTabCallback<Data> iAuthTabCallback) {
            this.onNavigationEvent = file;
            this.IAuthTabCallback = iAuthTabCallback;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [Data, java.lang.Object] */
        @Override // o.SaversKtExternalSyntheticLambda35
        public void onExtraCallback(@NonNull SaversKtExternalSyntheticLambda11 saversKtExternalSyntheticLambda11, @NonNull SaversKtExternalSyntheticLambda35.onNavigationEvent<? super Data> onnavigationevent) {
            try {
                Data dataOnNavigationEvent = this.IAuthTabCallback.onNavigationEvent(this.onNavigationEvent);
                this.onWarmupCompleted = dataOnNavigationEvent;
                onnavigationevent.onExtraCallback((SaversKtExternalSyntheticLambda35.onNavigationEvent<? super Data>) dataOnNavigationEvent);
            } catch (FileNotFoundException e) {
                onnavigationevent.onExtraCallback((Exception) e);
            }
        }

        @Override // o.SaversKtExternalSyntheticLambda35
        public void onExtraCallback() {
            Data data = this.onWarmupCompleted;
            if (data != null) {
                try {
                    this.IAuthTabCallback.onWarmupCompleted(data);
                } catch (IOException unused) {
                }
            }
        }

        @Override // o.SaversKtExternalSyntheticLambda35
        public Class<Data> onNavigationEvent() {
            return this.IAuthTabCallback.onNavigationEvent();
        }

        @Override // o.SaversKtExternalSyntheticLambda35
        public SaversKtExternalSyntheticLambda21 IAuthTabCallback() {
            return SaversKtExternalSyntheticLambda21.LOCAL;
        }
    }

    public static class onExtraCallbackWithResult<Data> implements ResolvedTextDirection<File, Data> {
        private final IAuthTabCallback<Data> onExtraCallbackWithResult;

        public onExtraCallbackWithResult(IAuthTabCallback<Data> iAuthTabCallback) {
            this.onExtraCallbackWithResult = iAuthTabCallback;
        }

        @Override // o.ResolvedTextDirection
        public final ShaderBrushSpanExternalSyntheticLambda0<File, Data> IAuthTabCallback(@NonNull AndroidViewBindingKtExternalSyntheticLambda3 androidViewBindingKtExternalSyntheticLambda3) {
            return new TextInputServiceAndroid_androidKtExternalSyntheticLambda0(this.onExtraCallbackWithResult);
        }
    }

    public static class onExtraCallback extends onExtraCallbackWithResult<InputStream> {
        public onExtraCallback() {
            super(new IAuthTabCallback<InputStream>() { // from class: o.TextInputServiceAndroid_androidKtExternalSyntheticLambda0.onExtraCallback.2
                @Override // o.TextInputServiceAndroid_androidKtExternalSyntheticLambda0.IAuthTabCallback
                /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
                public InputStream onNavigationEvent(File file) throws FileNotFoundException {
                    return new FileInputStream(file);
                }

                @Override // o.TextInputServiceAndroid_androidKtExternalSyntheticLambda0.IAuthTabCallback
                /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
                public void onWarmupCompleted(InputStream inputStream) throws IOException {
                    inputStream.close();
                }

                @Override // o.TextInputServiceAndroid_androidKtExternalSyntheticLambda0.IAuthTabCallback
                public Class<InputStream> onNavigationEvent() {
                    return InputStream.class;
                }
            });
        }
    }

    public static class onNavigationEvent extends onExtraCallbackWithResult<ParcelFileDescriptor> {
        public onNavigationEvent() {
            super(new IAuthTabCallback<ParcelFileDescriptor>() { // from class: o.TextInputServiceAndroid_androidKtExternalSyntheticLambda0.onNavigationEvent.4
                @Override // o.TextInputServiceAndroid_androidKtExternalSyntheticLambda0.IAuthTabCallback
                /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
                public ParcelFileDescriptor onNavigationEvent(File file) throws FileNotFoundException {
                    return ParcelFileDescriptor.open(file, 268435456);
                }

                @Override // o.TextInputServiceAndroid_androidKtExternalSyntheticLambda0.IAuthTabCallback
                public void onWarmupCompleted(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                    parcelFileDescriptor.close();
                }

                @Override // o.TextInputServiceAndroid_androidKtExternalSyntheticLambda0.IAuthTabCallback
                public Class<ParcelFileDescriptor> onNavigationEvent() {
                    return ParcelFileDescriptor.class;
                }
            });
        }
    }
}
