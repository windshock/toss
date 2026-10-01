package o;

import android.util.Base64;
import androidx.annotation.NonNull;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import o.SaversKtExternalSyntheticLambda35;
import o.ShaderBrushSpanExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TextInputServiceAndroid_androidKtExternalSyntheticLambda1<Model, Data> implements ShaderBrushSpanExternalSyntheticLambda0<Model, Data> {
    private final onExtraCallbackWithResult<Data> onNavigationEvent;

    public interface onExtraCallbackWithResult<Data> {
        Data IAuthTabCallback(String str) throws IllegalArgumentException;

        Class<Data> onExtraCallbackWithResult();

        void onExtraCallbackWithResult(Data data) throws IOException;
    }

    public TextInputServiceAndroid_androidKtExternalSyntheticLambda1(onExtraCallbackWithResult<Data> onextracallbackwithresult) {
        this.onNavigationEvent = onextracallbackwithresult;
    }

    @Override // o.ShaderBrushSpanExternalSyntheticLambda0
    public ShaderBrushSpanExternalSyntheticLambda0.onExtraCallbackWithResult<Data> onNavigationEvent(@NonNull Model model, int i2, int i3, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) {
        return new ShaderBrushSpanExternalSyntheticLambda0.onExtraCallbackWithResult<>(new setDpMargin(model), new onWarmupCompleted(model.toString(), this.onNavigationEvent));
    }

    @Override // o.ShaderBrushSpanExternalSyntheticLambda0
    public boolean onNavigationEvent(@NonNull Model model) {
        return model.toString().startsWith("data:image");
    }

    static final class onWarmupCompleted<Data> implements SaversKtExternalSyntheticLambda35<Data> {
        private final onExtraCallbackWithResult<Data> onExtraCallback;
        private Data onNavigationEvent;
        private final String onWarmupCompleted;

        @Override // o.SaversKtExternalSyntheticLambda35
        public void onExtraCallbackWithResult() {
        }

        onWarmupCompleted(String str, onExtraCallbackWithResult<Data> onextracallbackwithresult) {
            this.onWarmupCompleted = str;
            this.onExtraCallback = onextracallbackwithresult;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [Data, java.lang.Object] */
        @Override // o.SaversKtExternalSyntheticLambda35
        public void onExtraCallback(@NonNull SaversKtExternalSyntheticLambda11 saversKtExternalSyntheticLambda11, @NonNull SaversKtExternalSyntheticLambda35.onNavigationEvent<? super Data> onnavigationevent) {
            try {
                Data dataIAuthTabCallback = this.onExtraCallback.IAuthTabCallback(this.onWarmupCompleted);
                this.onNavigationEvent = dataIAuthTabCallback;
                onnavigationevent.onExtraCallback((SaversKtExternalSyntheticLambda35.onNavigationEvent<? super Data>) dataIAuthTabCallback);
            } catch (IllegalArgumentException e) {
                onnavigationevent.onExtraCallback((Exception) e);
            }
        }

        @Override // o.SaversKtExternalSyntheticLambda35
        public void onExtraCallback() {
            try {
                this.onExtraCallback.onExtraCallbackWithResult(this.onNavigationEvent);
            } catch (IOException unused) {
            }
        }

        @Override // o.SaversKtExternalSyntheticLambda35
        public Class<Data> onNavigationEvent() {
            return this.onExtraCallback.onExtraCallbackWithResult();
        }

        @Override // o.SaversKtExternalSyntheticLambda35
        public SaversKtExternalSyntheticLambda21 IAuthTabCallback() {
            return SaversKtExternalSyntheticLambda21.LOCAL;
        }
    }

    public static final class IAuthTabCallback<Model> implements ResolvedTextDirection<Model, InputStream> {
        private final onExtraCallbackWithResult<InputStream> onExtraCallbackWithResult = new onExtraCallbackWithResult<InputStream>() { // from class: o.TextInputServiceAndroid_androidKtExternalSyntheticLambda1.IAuthTabCallback.2
            @Override // o.TextInputServiceAndroid_androidKtExternalSyntheticLambda1.onExtraCallbackWithResult
            /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
            public InputStream IAuthTabCallback(String str) {
                if (!str.startsWith("data:image")) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int iIndexOf = str.indexOf(44);
                if (iIndexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (!str.substring(0, iIndexOf).endsWith(";base64")) {
                    throw new IllegalArgumentException("Not a base64 image data URL.");
                }
                return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
            }

            @Override // o.TextInputServiceAndroid_androidKtExternalSyntheticLambda1.onExtraCallbackWithResult
            public void onExtraCallbackWithResult(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // o.TextInputServiceAndroid_androidKtExternalSyntheticLambda1.onExtraCallbackWithResult
            public Class<InputStream> onExtraCallbackWithResult() {
                return InputStream.class;
            }
        };

        @Override // o.ResolvedTextDirection
        public ShaderBrushSpanExternalSyntheticLambda0<Model, InputStream> IAuthTabCallback(@NonNull AndroidViewBindingKtExternalSyntheticLambda3 androidViewBindingKtExternalSyntheticLambda3) {
            return new TextInputServiceAndroid_androidKtExternalSyntheticLambda1(this.onExtraCallbackWithResult);
        }
    }
}
