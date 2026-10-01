package o;

import android.media.AudioDeviceInfo;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface SelectionManagerExternalSyntheticLambda2 {

    public interface onNavigationEvent {
        default void IAuthTabCallback() {
        }

        default void IAuthTabCallback(IAuthTabCallback iAuthTabCallback) {
        }

        default void onExtraCallback() {
        }

        void onExtraCallback(int i2, long j, long j2);

        default void onExtraCallbackWithResult() {
        }

        default void onNavigationEvent() {
        }

        default void onNavigationEvent(IAuthTabCallback iAuthTabCallback) {
        }

        void onNavigationEvent(boolean z);

        void onWarmupCompleted();

        default void onWarmupCompleted(int i2) {
        }

        default void onWarmupCompleted(long j) {
        }

        default void onWarmupCompleted(Exception exc) {
        }
    }

    long IAuthTabCallback(boolean z);

    void IAuthTabCallback();

    default void IAuthTabCallback(int i2, int i3) {
    }

    boolean IAuthTabCallback(ByteBuffer byteBuffer, long j, int i2) throws IAuthTabCallbackStub, onWarmupCompleted;

    void IAuthTabCallbackDefault();

    void IAuthTabCallbackStub();

    void IAuthTabCallbackStubProxy() throws IAuthTabCallbackStub;

    void access000();

    default void access100() {
    }

    boolean asBinder();

    boolean asInterface();

    int onExtraCallback(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4);

    AndroidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1 onExtraCallback();

    default void onExtraCallback(int i2) {
    }

    default void onExtraCallback(@Nullable AudioDeviceInfo audioDeviceInfo) {
    }

    void onExtraCallback(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, int i2, @Nullable int[] iArr) throws onExtraCallback;

    default void onExtraCallback(@Nullable SelectionManagerExternalSyntheticLambda12 selectionManagerExternalSyntheticLambda12) {
    }

    void onExtraCallback(TextContextMenuModifierKtExternalSyntheticLambda0 textContextMenuModifierKtExternalSyntheticLambda0);

    void onExtraCallbackWithResult();

    void onExtraCallbackWithResult(int i2);

    void onNavigationEvent();

    void onNavigationEvent(AndroidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1 androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1);

    void onNavigationEvent(onNavigationEvent onnavigationevent);

    void onTransact();

    long onWarmupCompleted();

    void onWarmupCompleted(float f);

    void onWarmupCompleted(TextContextMenuHelperApi28ExternalSyntheticLambda5 textContextMenuHelperApi28ExternalSyntheticLambda5);

    default void onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda0 textFieldDecoratorModifierNodeExternalSyntheticLambda0) {
    }

    void onWarmupCompleted(boolean z);

    boolean onWarmupCompleted(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4);

    public static final class IAuthTabCallback {
        public final int IAuthTabCallback;
        public final boolean IAuthTabCallbackStub;
        public final int onExtraCallback;
        public final int onExtraCallbackWithResult;
        public final int onNavigationEvent;
        public final boolean onWarmupCompleted;

        public IAuthTabCallback(int i2, int i3, int i4, boolean z, boolean z2, int i5) {
            this.onExtraCallback = i2;
            this.onNavigationEvent = i3;
            this.IAuthTabCallback = i4;
            this.IAuthTabCallbackStub = z;
            this.onWarmupCompleted = z2;
            this.onExtraCallbackWithResult = i5;
        }
    }

    public static final class onExtraCallback extends Exception {
        public final BasicTextContextMenuProviderKtExternalSyntheticLambda4 format;

        public onExtraCallback(Throwable th, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
            super(th);
            this.format = basicTextContextMenuProviderKtExternalSyntheticLambda4;
        }

        public onExtraCallback(String str, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
            super(str);
            this.format = basicTextContextMenuProviderKtExternalSyntheticLambda4;
        }
    }

    public static final class onWarmupCompleted extends Exception {
        public final int audioTrackState;
        public final BasicTextContextMenuProviderKtExternalSyntheticLambda4 format;
        public final boolean isRecoverable;

        public onWarmupCompleted(String str, int i2, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, boolean z, @Nullable Throwable th) {
            super(str, th);
            this.audioTrackState = i2;
            this.isRecoverable = z;
            this.format = basicTextContextMenuProviderKtExternalSyntheticLambda4;
        }

        public onWarmupCompleted(int i2, int i3, int i4, int i5, int i6, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, boolean z, @Nullable Exception exc) {
            StringBuilder sb = new StringBuilder();
            sb.append("AudioTrack init failed ");
            sb.append(i2);
            sb.append(" ");
            sb.append("Config(");
            sb.append(i3);
            sb.append(", ");
            sb.append(i4);
            sb.append(", ");
            sb.append(i5);
            sb.append(", ");
            sb.append(i6);
            sb.append(")");
            sb.append(" ");
            sb.append(basicTextContextMenuProviderKtExternalSyntheticLambda4);
            sb.append(z ? " (recoverable)" : "");
            this(sb.toString(), i2, basicTextContextMenuProviderKtExternalSyntheticLambda4, z, exc);
        }
    }

    public static final class IAuthTabCallbackStub extends Exception {
        public final int errorCode;
        public final BasicTextContextMenuProviderKtExternalSyntheticLambda4 format;
        public final boolean isRecoverable;

        public IAuthTabCallbackStub(int i2, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, boolean z) {
            super("AudioTrack write failed: " + i2);
            this.isRecoverable = z;
            this.errorCode = i2;
            this.format = basicTextContextMenuProviderKtExternalSyntheticLambda4;
        }
    }

    public static final class onExtraCallbackWithResult extends Exception {
        public final long actualPresentationTimeUs;
        public final long expectedPresentationTimeUs;

        public onExtraCallbackWithResult(long j, long j2) {
            super("Unexpected audio track timestamp discontinuity: expected " + j2 + ", got " + j);
            this.actualPresentationTimeUs = j;
            this.expectedPresentationTimeUs = j2;
        }
    }

    default SelectionManagerExternalSyntheticLambda14 onNavigationEvent(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        return SelectionManagerExternalSyntheticLambda14.onNavigationEvent;
    }
}
