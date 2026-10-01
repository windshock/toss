package o;

import android.net.Uri;
import androidx.annotation.Nullable;
import o.CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10;
import o.TextFieldStateKtExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class BottomNavigationKtExternalSyntheticLambda9 extends CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 {
    private final TextFieldStateKtExternalSyntheticLambda0 IAuthTabCallbackDefault;
    private final long IAuthTabCallbackStub;
    private final long IAuthTabCallbackStubProxy;
    private final long IAuthTabCallback_Parcel;
    private final boolean access000;
    private final long access100;
    private final Object asBinder;
    private final TextFieldStateKtExternalSyntheticLambda0.onTransact asInterface;
    private final long extraCallback;
    private final long getInterfaceDescriptor;
    private final boolean onExtraCallback;
    private final long onNavigationEvent;
    private final boolean onTransact;
    private static final Object onExtraCallbackWithResult = new Object();
    private static final TextFieldStateKtExternalSyntheticLambda0 IAuthTabCallback = new TextFieldStateKtExternalSyntheticLambda0.onWarmupCompleted().onExtraCallback("SinglePeriodTimeline").IAuthTabCallback(Uri.EMPTY).onWarmupCompleted();

    public int onExtraCallbackWithResult() {
        return 1;
    }

    public int onWarmupCompleted() {
        return 1;
    }

    public BottomNavigationKtExternalSyntheticLambda9(long j, boolean z, boolean z2, boolean z3, @Nullable Object obj, TextFieldStateKtExternalSyntheticLambda0 textFieldStateKtExternalSyntheticLambda0) {
        this(j, j, 0L, 0L, z, z2, z3, obj, textFieldStateKtExternalSyntheticLambda0);
    }

    public BottomNavigationKtExternalSyntheticLambda9(long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, @Nullable Object obj, TextFieldStateKtExternalSyntheticLambda0 textFieldStateKtExternalSyntheticLambda0) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j2, j3, j4, z, z2, false, obj, textFieldStateKtExternalSyntheticLambda0, z3 ? textFieldStateKtExternalSyntheticLambda0.IAuthTabCallback : null);
    }

    public BottomNavigationKtExternalSyntheticLambda9(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, @Nullable Object obj, TextFieldStateKtExternalSyntheticLambda0 textFieldStateKtExternalSyntheticLambda0, @Nullable TextFieldStateKtExternalSyntheticLambda0.onTransact ontransact) {
        this.IAuthTabCallbackStubProxy = j;
        this.extraCallback = j2;
        this.onNavigationEvent = j3;
        this.IAuthTabCallbackStub = j4;
        this.IAuthTabCallback_Parcel = j5;
        this.getInterfaceDescriptor = j6;
        this.access100 = j7;
        this.onTransact = z;
        this.onExtraCallback = z2;
        this.access000 = z3;
        this.asBinder = obj;
        this.IAuthTabCallbackDefault = (TextFieldStateKtExternalSyntheticLambda0) RecordingInputConnection_androidKt.onExtraCallbackWithResult(textFieldStateKtExternalSyntheticLambda0);
        this.asInterface = ontransact;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f A[PHI: r1
      0x002f: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v6 long) binds: [B:3:0x000d, B:5:0x0011, B:7:0x0017, B:12:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback onWarmupCompleted(int i2, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback iAuthTabCallback, long j) {
        long j2;
        RecordingInputConnection_androidKt.onExtraCallback(i2, 0, 1);
        long j3 = this.access100;
        boolean z = this.onExtraCallback;
        if (!z || this.access000 || j == 0) {
            j2 = j3;
        } else {
            long j4 = this.IAuthTabCallback_Parcel;
            if (j4 != -9223372036854775807L) {
                j3 += j;
                if (j3 <= j4) {
                }
            }
            j2 = -9223372036854775807L;
        }
        return iAuthTabCallback.onExtraCallback(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback.onNavigationEvent, this.IAuthTabCallbackDefault, this.asBinder, this.IAuthTabCallbackStubProxy, this.extraCallback, this.onNavigationEvent, this.onTransact, z, this.asInterface, j2, this.IAuthTabCallback_Parcel, 0, 0, this.getInterfaceDescriptor);
    }

    public CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback IAuthTabCallback(int i2, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback onextracallback, boolean z) {
        RecordingInputConnection_androidKt.onExtraCallback(i2, 0, 1);
        return onextracallback.onWarmupCompleted((Object) null, z ? onExtraCallbackWithResult : null, 0, this.IAuthTabCallbackStub, -this.getInterfaceDescriptor);
    }

    public int IAuthTabCallback(Object obj) {
        return onExtraCallbackWithResult.equals(obj) ? 0 : -1;
    }

    public Object onNavigationEvent(int i2) {
        RecordingInputConnection_androidKt.onExtraCallback(i2, 0, 1);
        return onExtraCallbackWithResult;
    }
}
