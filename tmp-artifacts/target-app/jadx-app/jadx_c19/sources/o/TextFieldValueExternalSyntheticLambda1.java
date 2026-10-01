package o;

import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import o.SaversKtExternalSyntheticLambda35;
import o.ShaderBrushSpanExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TextFieldValueExternalSyntheticLambda1 implements ShaderBrushSpanExternalSyntheticLambda0<File, ByteBuffer> {
    @Override // o.ShaderBrushSpanExternalSyntheticLambda0
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public boolean onNavigationEvent(@NonNull File file) {
        return true;
    }

    @Override // o.ShaderBrushSpanExternalSyntheticLambda0
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public ShaderBrushSpanExternalSyntheticLambda0.onExtraCallbackWithResult<ByteBuffer> onNavigationEvent(@NonNull File file, int i2, int i3, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) {
        return new ShaderBrushSpanExternalSyntheticLambda0.onExtraCallbackWithResult<>(new setDpMargin(file), new onNavigationEvent(file));
    }

    public static class onExtraCallback implements ResolvedTextDirection<File, ByteBuffer> {
        @Override // o.ResolvedTextDirection
        public ShaderBrushSpanExternalSyntheticLambda0<File, ByteBuffer> IAuthTabCallback(@NonNull AndroidViewBindingKtExternalSyntheticLambda3 androidViewBindingKtExternalSyntheticLambda3) {
            return new TextFieldValueExternalSyntheticLambda1();
        }
    }

    static final class onNavigationEvent implements SaversKtExternalSyntheticLambda35<ByteBuffer> {
        private final File onExtraCallback;

        @Override // o.SaversKtExternalSyntheticLambda35
        public void onExtraCallback() {
        }

        @Override // o.SaversKtExternalSyntheticLambda35
        public void onExtraCallbackWithResult() {
        }

        onNavigationEvent(File file) {
            this.onExtraCallback = file;
        }

        @Override // o.SaversKtExternalSyntheticLambda35
        public void onExtraCallback(@NonNull SaversKtExternalSyntheticLambda11 saversKtExternalSyntheticLambda11, @NonNull SaversKtExternalSyntheticLambda35.onNavigationEvent<? super ByteBuffer> onnavigationevent) {
            try {
                onnavigationevent.onExtraCallback((SaversKtExternalSyntheticLambda35.onNavigationEvent<? super ByteBuffer>) Barrier.onExtraCallbackWithResult(this.onExtraCallback));
            } catch (IOException e) {
                onnavigationevent.onExtraCallback((Exception) e);
            }
        }

        @Override // o.SaversKtExternalSyntheticLambda35
        public Class<ByteBuffer> onNavigationEvent() {
            return ByteBuffer.class;
        }

        @Override // o.SaversKtExternalSyntheticLambda35
        public SaversKtExternalSyntheticLambda21 IAuthTabCallback() {
            return SaversKtExternalSyntheticLambda21.LOCAL;
        }
    }
}
