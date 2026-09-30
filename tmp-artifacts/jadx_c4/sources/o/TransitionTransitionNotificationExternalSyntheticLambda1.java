package o;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class TransitionTransitionNotificationExternalSyntheticLambda1 extends PasswordTransformationMethod {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    public static final int onWarmupCompleted = 8;

    static {
        int i = onExtraCallbackWithResult + 123;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    @Override // android.text.method.PasswordTransformationMethod, android.text.method.TransformationMethod
    public CharSequence getTransformation(@NotNull CharSequence charSequence, @NotNull View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(view, "");
        onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this, charSequence);
        int i2 = onNavigationEvent + 61;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return onextracallbackwithresult;
    }

    public final class onExtraCallbackWithResult implements CharSequence {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        private final CharSequence onExtraCallbackWithResult;
        final /* synthetic */ TransitionTransitionNotificationExternalSyntheticLambda1 onWarmupCompleted;

        public char onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 73;
            int i4 = i3 % 128;
            IAuthTabCallback = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 21;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                return (char) 8226;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public onExtraCallbackWithResult(@NotNull TransitionTransitionNotificationExternalSyntheticLambda1 transitionTransitionNotificationExternalSyntheticLambda1, CharSequence charSequence) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            this.onWarmupCompleted = transitionTransitionNotificationExternalSyntheticLambda1;
            this.onExtraCallbackWithResult = charSequence;
        }

        @Override // java.lang.CharSequence
        public final char charAt(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 61;
            onNavigationEvent = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                onExtraCallback(i);
                obj.hashCode();
                throw null;
            }
            char cOnExtraCallback = onExtraCallback(i);
            int i4 = onNavigationEvent + 21;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return cOnExtraCallback;
            }
            obj.hashCode();
            throw null;
        }

        @Override // java.lang.CharSequence
        public final int length() {
            int iOnExtraCallbackWithResult;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 23;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                iOnExtraCallbackWithResult = onExtraCallbackWithResult();
                int i3 = 68 / 0;
            } else {
                iOnExtraCallbackWithResult = onExtraCallbackWithResult();
            }
            int i4 = onNavigationEvent + 41;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return iOnExtraCallbackWithResult;
        }

        public int onExtraCallbackWithResult() {
            int length;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 117;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                length = this.onExtraCallbackWithResult.length();
                int i3 = 32 / 0;
            } else {
                length = this.onExtraCallbackWithResult.length();
            }
            int i4 = IAuthTabCallback + 1;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return length;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // java.lang.CharSequence
        public CharSequence subSequence(int i, int i2) {
            int i3 = 2 % 2;
            int i4 = onNavigationEvent + 21;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            CharSequence charSequenceSubSequence = this.onExtraCallbackWithResult.subSequence(i, i2);
            int i6 = onNavigationEvent + 55;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                return charSequenceSubSequence;
            }
            throw null;
        }
    }
}
