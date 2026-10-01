package o;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface HandwritingGestureApi34ExternalSyntheticLambda16 {
    public static final ByteBuffer onNavigationEvent = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    boolean IAuthTabCallback();

    void onExtraCallback();

    ByteBuffer onExtraCallbackWithResult();

    IAuthTabCallback onExtraCallbackWithResult(IAuthTabCallback iAuthTabCallback) throws onExtraCallbackWithResult;

    void onExtraCallbackWithResult(ByteBuffer byteBuffer);

    void onNavigationEvent();

    void onTransact();

    boolean onWarmupCompleted();

    public static final class IAuthTabCallback {
        public static final IAuthTabCallback onNavigationEvent = new IAuthTabCallback(-1, -1, -1);
        public final int IAuthTabCallback;
        public final int onExtraCallback;
        public final int onExtraCallbackWithResult;
        public final int onWarmupCompleted;

        public IAuthTabCallback(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
            this(basicTextContextMenuProviderKtExternalSyntheticLambda4.prefetch, basicTextContextMenuProviderKtExternalSyntheticLambda4.onNavigationEvent, basicTextContextMenuProviderKtExternalSyntheticLambda4.onUnminimized);
        }

        public IAuthTabCallback(int i2, int i3, int i4) {
            this.onExtraCallbackWithResult = i2;
            this.onWarmupCompleted = i3;
            this.onExtraCallback = i4;
            this.IAuthTabCallback = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallbackStubProxy(i4) ? TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(i4, i3) : -1;
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.onExtraCallbackWithResult + ", channelCount=" + this.onWarmupCompleted + ", encoding=" + this.onExtraCallback + ']';
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IAuthTabCallback)) {
                return false;
            }
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) obj;
            return this.onExtraCallbackWithResult == iAuthTabCallback.onExtraCallbackWithResult && this.onWarmupCompleted == iAuthTabCallback.onWarmupCompleted && this.onExtraCallback == iAuthTabCallback.onExtraCallback;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.onExtraCallbackWithResult), Integer.valueOf(this.onWarmupCompleted), Integer.valueOf(this.onExtraCallback));
        }
    }

    public static final class onExtraCallbackWithResult extends Exception {
        public final IAuthTabCallback inputAudioFormat;

        public onExtraCallbackWithResult(IAuthTabCallback iAuthTabCallback) {
            this("Unhandled input format:", iAuthTabCallback);
        }

        public onExtraCallbackWithResult(String str, IAuthTabCallback iAuthTabCallback) {
            super(str + " " + iAuthTabCallback);
            this.inputAudioFormat = iAuthTabCallback;
        }
    }
}
