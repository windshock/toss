package o;

import androidx.annotation.NonNull;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.SaversKtExternalSyntheticLambda35;
import o.ShaderBrushSpanExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TextFieldValueExternalSyntheticLambda0<Data> implements ShaderBrushSpanExternalSyntheticLambda0<byte[], Data> {
    private final onWarmupCompleted<Data> onExtraCallback;

    public interface onWarmupCompleted<Data> {
        Data onExtraCallback(byte[] bArr);

        Class<Data> onWarmupCompleted();
    }

    @Override // o.ShaderBrushSpanExternalSyntheticLambda0
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public boolean onNavigationEvent(@NonNull byte[] bArr) {
        return true;
    }

    public TextFieldValueExternalSyntheticLambda0(onWarmupCompleted<Data> onwarmupcompleted) {
        this.onExtraCallback = onwarmupcompleted;
    }

    @Override // o.ShaderBrushSpanExternalSyntheticLambda0
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public ShaderBrushSpanExternalSyntheticLambda0.onExtraCallbackWithResult<Data> onNavigationEvent(@NonNull byte[] bArr, int i2, int i3, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) {
        return new ShaderBrushSpanExternalSyntheticLambda0.onExtraCallbackWithResult<>(new setDpMargin(bArr), new onNavigationEvent(bArr, this.onExtraCallback));
    }

    static class onNavigationEvent<Data> implements SaversKtExternalSyntheticLambda35<Data> {
        private final onWarmupCompleted<Data> onExtraCallbackWithResult;
        private final byte[] onNavigationEvent;

        @Override // o.SaversKtExternalSyntheticLambda35
        public void onExtraCallback() {
        }

        @Override // o.SaversKtExternalSyntheticLambda35
        public void onExtraCallbackWithResult() {
        }

        onNavigationEvent(byte[] bArr, onWarmupCompleted<Data> onwarmupcompleted) {
            this.onNavigationEvent = bArr;
            this.onExtraCallbackWithResult = onwarmupcompleted;
        }

        @Override // o.SaversKtExternalSyntheticLambda35
        public void onExtraCallback(@NonNull SaversKtExternalSyntheticLambda11 saversKtExternalSyntheticLambda11, @NonNull SaversKtExternalSyntheticLambda35.onNavigationEvent<? super Data> onnavigationevent) {
            onnavigationevent.onExtraCallback((SaversKtExternalSyntheticLambda35.onNavigationEvent<? super Data>) this.onExtraCallbackWithResult.onExtraCallback(this.onNavigationEvent));
        }

        @Override // o.SaversKtExternalSyntheticLambda35
        public Class<Data> onNavigationEvent() {
            return this.onExtraCallbackWithResult.onWarmupCompleted();
        }

        @Override // o.SaversKtExternalSyntheticLambda35
        public SaversKtExternalSyntheticLambda21 IAuthTabCallback() {
            return SaversKtExternalSyntheticLambda21.LOCAL;
        }
    }

    public static class IAuthTabCallback implements ResolvedTextDirection<byte[], ByteBuffer> {
        @Override // o.ResolvedTextDirection
        public ShaderBrushSpanExternalSyntheticLambda0<byte[], ByteBuffer> IAuthTabCallback(@NonNull AndroidViewBindingKtExternalSyntheticLambda3 androidViewBindingKtExternalSyntheticLambda3) {
            return new TextFieldValueExternalSyntheticLambda0(new onWarmupCompleted<ByteBuffer>() { // from class: o.TextFieldValueExternalSyntheticLambda0.IAuthTabCallback.5
                @Override // o.TextFieldValueExternalSyntheticLambda0.onWarmupCompleted
                /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
                public ByteBuffer onExtraCallback(byte[] bArr) {
                    return ByteBuffer.wrap(bArr);
                }

                @Override // o.TextFieldValueExternalSyntheticLambda0.onWarmupCompleted
                public Class<ByteBuffer> onWarmupCompleted() {
                    return ByteBuffer.class;
                }
            });
        }
    }

    public static class onExtraCallback implements ResolvedTextDirection<byte[], InputStream> {
        @Override // o.ResolvedTextDirection
        public ShaderBrushSpanExternalSyntheticLambda0<byte[], InputStream> IAuthTabCallback(@NonNull AndroidViewBindingKtExternalSyntheticLambda3 androidViewBindingKtExternalSyntheticLambda3) {
            return new TextFieldValueExternalSyntheticLambda0(new onWarmupCompleted<InputStream>() { // from class: o.TextFieldValueExternalSyntheticLambda0.onExtraCallback.4
                @Override // o.TextFieldValueExternalSyntheticLambda0.onWarmupCompleted
                /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
                public InputStream onExtraCallback(byte[] bArr) {
                    return new ByteArrayInputStream(bArr);
                }

                @Override // o.TextFieldValueExternalSyntheticLambda0.onWarmupCompleted
                public Class<InputStream> onWarmupCompleted() {
                    return InputStream.class;
                }
            });
        }
    }
}
