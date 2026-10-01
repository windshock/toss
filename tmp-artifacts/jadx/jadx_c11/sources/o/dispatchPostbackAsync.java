package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class dispatchPostbackAsync {
    public static final onExtraCallback Companion;
    private static final dispatchPostbackAsync IAuthTabCallback = new dispatchPostbackAsync(0.0f, 0, 0, null, null, 31, null);
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static int onTransact;
    private final r8lambda9HStmjrtoDHLHwHNekzuov8q0sI asInterface;
    private final float onExtraCallback;
    private final InterfaceC0083handshake onExtraCallbackWithResult;
    private final int onNavigationEvent;
    private final int onWarmupCompleted;

    public /* synthetic */ dispatchPostbackAsync(float f, int i, int i2, InterfaceC0083handshake interfaceC0083handshake, r8lambda9HStmjrtoDHLHwHNekzuov8q0sI r8lambda9hstmjrtodhlhwhnekzuov8q0si, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, i, i2, interfaceC0083handshake, r8lambda9hstmjrtodhlhwhnekzuov8q0si);
    }

    public static /* synthetic */ dispatchPostbackAsync onWarmupCompleted(dispatchPostbackAsync dispatchpostbackasync, float f, int i, int i2, InterfaceC0083handshake interfaceC0083handshake, r8lambda9HStmjrtoDHLHwHNekzuov8q0sI r8lambda9hstmjrtodhlhwhnekzuov8q0si, int i3, Object obj) {
        int i4 = 2 % 2;
        if ((i3 & 1) != 0) {
            f = dispatchpostbackasync.onExtraCallback;
        }
        float f2 = f;
        if ((i3 & 2) != 0) {
            i = dispatchpostbackasync.onWarmupCompleted;
            int i5 = IAuthTabCallbackDefault + 17;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
        }
        int i7 = i;
        if ((i3 & 4) != 0) {
            i2 = dispatchpostbackasync.onNavigationEvent;
        }
        int i8 = i2;
        Object obj2 = null;
        if ((i3 & 8) != 0) {
            int i9 = onTransact;
            int i10 = i9 + 79;
            IAuthTabCallbackDefault = i10 % 128;
            if (i10 % 2 == 0) {
                InterfaceC0083handshake interfaceC0083handshake2 = dispatchpostbackasync.onExtraCallbackWithResult;
                obj2.hashCode();
                throw null;
            }
            interfaceC0083handshake = dispatchpostbackasync.onExtraCallbackWithResult;
            int i11 = i9 + 79;
            IAuthTabCallbackDefault = i11 % 128;
            int i12 = i11 % 2;
        }
        InterfaceC0083handshake interfaceC0083handshake3 = interfaceC0083handshake;
        if ((i3 & 16) != 0) {
            r8lambda9hstmjrtodhlhwhnekzuov8q0si = dispatchpostbackasync.asInterface;
        }
        dispatchPostbackAsync dispatchpostbackasyncOnWarmupCompleted = dispatchpostbackasync.onWarmupCompleted(f2, i7, i8, interfaceC0083handshake3, r8lambda9hstmjrtodhlhwhnekzuov8q0si);
        int i13 = IAuthTabCallbackDefault + 67;
        onTransact = i13 % 128;
        if (i13 % 2 == 0) {
            return dispatchpostbackasyncOnWarmupCompleted;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dispatchPostbackAsync)) {
            return false;
        }
        dispatchPostbackAsync dispatchpostbackasync = (dispatchPostbackAsync) obj;
        if (!VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.onExtraCallback, dispatchpostbackasync.onExtraCallback)) {
            int i2 = onTransact + 37;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (this.onWarmupCompleted != dispatchpostbackasync.onWarmupCompleted) {
            return false;
        }
        if (!AppLovinVastMediaViewf.onExtraCallbackWithResult(this.onNavigationEvent, dispatchpostbackasync.onNavigationEvent)) {
            int i4 = IAuthTabCallbackDefault + 61;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallbackWithResult, dispatchpostbackasync.onExtraCallbackWithResult)) {
            return Intrinsics.areEqual(this.asInterface, dispatchpostbackasync.asInterface);
        }
        int i6 = IAuthTabCallbackDefault + 73;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 21;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = (((((((VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.onExtraCallback) * 31) + Integer.hashCode(this.onWarmupCompleted)) * 31) + AppLovinVastMediaViewf.onExtraCallback(this.onNavigationEvent)) * 31) + this.onExtraCallbackWithResult.hashCode()) * 31) + this.asInterface.hashCode();
        int i4 = IAuthTabCallbackDefault + 97;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return iOnWarmupCompleted;
        }
        throw null;
    }

    public final dispatchPostbackAsync onWarmupCompleted(float f, int i, int i2, @NotNull InterfaceC0083handshake interfaceC0083handshake, @NotNull r8lambda9HStmjrtoDHLHwHNekzuov8q0sI r8lambda9hstmjrtodhlhwhnekzuov8q0si) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(interfaceC0083handshake, "");
        Intrinsics.checkNotNullParameter(r8lambda9hstmjrtodhlhwhnekzuov8q0si, "");
        dispatchPostbackAsync dispatchpostbackasync = new dispatchPostbackAsync(f, i, i2, interfaceC0083handshake, r8lambda9hstmjrtodhlhwhnekzuov8q0si, null);
        int i4 = IAuthTabCallbackDefault + 103;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return dispatchpostbackasync;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TextLayoutStyle(maxTextSize=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.onExtraCallback) + ", maxLines=" + this.onWarmupCompleted + ", overflow=" + AppLovinVastMediaViewf.onExtraCallbackWithResult(this.onNavigationEvent) + ", tdsLineHeight=" + this.onExtraCallbackWithResult + ", wordBreakStrategyResolver=" + this.asInterface + ")";
        int i2 = onTransact + 33;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    private dispatchPostbackAsync(float f, int i, int i2, InterfaceC0083handshake interfaceC0083handshake, r8lambda9HStmjrtoDHLHwHNekzuov8q0sI r8lambda9hstmjrtodhlhwhnekzuov8q0si) {
        Intrinsics.checkNotNullParameter(interfaceC0083handshake, "");
        Intrinsics.checkNotNullParameter(r8lambda9hstmjrtodhlhwhnekzuov8q0si, "");
        this.onExtraCallback = f;
        this.onWarmupCompleted = i;
        this.onNavigationEvent = i2;
        this.onExtraCallbackWithResult = interfaceC0083handshake;
        this.asInterface = r8lambda9hstmjrtodhlhwhnekzuov8q0si;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ dispatchPostbackAsync(float f, int i, int i2, InterfaceC0083handshake interfaceC0083handshake, r8lambda9HStmjrtoDHLHwHNekzuov8q0sI r8lambda9hstmjrtodhlhwhnekzuov8q0si, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i3 & 1) != 0) {
            int i4 = onTransact + 29;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            f = VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback();
            int i6 = onTransact + 11;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
        }
        float f2 = f;
        if ((i3 & 2) != 0) {
            int i9 = onTransact + 13;
            IAuthTabCallbackDefault = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 5 / 0;
            }
            int i11 = 2 % 2;
            i = Integer.MAX_VALUE;
        }
        int i12 = i;
        if ((i3 & 4) != 0) {
            int i13 = IAuthTabCallbackDefault + 69;
            onTransact = i13 % 128;
            int i14 = i13 % 2;
            i2 = AppLovinVastMediaViewf.Companion.onNavigationEvent();
            int i15 = 2 % 2;
        }
        int i16 = i2;
        InterfaceC0083handshake interfaceC0083handshakeIAuthTabCallback = (i3 & 8) != 0 ? InterfaceC0083handshake.Companion.IAuthTabCallback() : interfaceC0083handshake;
        if ((i3 & 16) != 0) {
            int i17 = IAuthTabCallbackDefault + 121;
            onTransact = i17 % 128;
            if (i17 % 2 != 0) {
                r8lambda9hstmjrtodhlhwhnekzuov8q0si = r8lambda9HStmjrtoDHLHwHNekzuov8q0sI.Companion.onNavigationEvent();
                int i18 = 94 / 0;
            } else {
                r8lambda9hstmjrtodhlhwhnekzuov8q0si = r8lambda9HStmjrtoDHLHwHNekzuov8q0sI.Companion.onNavigationEvent();
            }
        }
        this(f2, i12, i16, interfaceC0083handshakeIAuthTabCallback, r8lambda9hstmjrtodhlhwhnekzuov8q0si, null);
    }

    public static final /* synthetic */ dispatchPostbackAsync onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact + 103;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        dispatchPostbackAsync dispatchpostbackasync = IAuthTabCallback;
        int i5 = i3 + 31;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return dispatchpostbackasync;
    }

    public final float onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 13;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        float f = this.onExtraCallback;
        if (i3 != 0) {
            int i4 = 19 / 0;
        }
        return f;
    }

    public final int onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 123;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onWarmupCompleted;
        }
        int i3 = 2 / 0;
        return this.onWarmupCompleted;
    }

    public final int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 69;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.onNavigationEvent;
        int i6 = i2 + 19;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final InterfaceC0083handshake IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 95;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        InterfaceC0083handshake interfaceC0083handshake = this.onExtraCallbackWithResult;
        int i5 = i2 + 53;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return interfaceC0083handshake;
    }

    public final r8lambda9HStmjrtoDHLHwHNekzuov8q0sI asInterface() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 71;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        r8lambda9HStmjrtoDHLHwHNekzuov8q0sI r8lambda9hstmjrtodhlhwhnekzuov8q0si = this.asInterface;
        int i5 = i2 + 29;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return r8lambda9hstmjrtodhlhwhnekzuov8q0si;
    }

    public static final class onExtraCallback {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final dispatchPostbackAsync onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 27;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                dispatchPostbackAsync.onWarmupCompleted();
                throw null;
            }
            dispatchPostbackAsync dispatchpostbackasyncOnWarmupCompleted = dispatchPostbackAsync.onWarmupCompleted();
            int i3 = IAuthTabCallback + 47;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 0 / 0;
            }
            return dispatchpostbackasyncOnWarmupCompleted;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallback(defaultConstructorMarker);
        int i = asBinder + 53;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }
}
