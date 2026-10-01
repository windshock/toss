package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.QuirksExternalSyntheticBackport0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class r8lambdaPuDx6Zf1uRi3X6EXV58bLbqqXWU extends SupportedOutputSizesSorterLegacy<r8lambdaerigy6cOS6VOy0wZORlt_FVM4> {
    private static int access000 = 1;
    private static int access100;
    private final r8lambdacVBglJs0KSxuT8ZctwBlsCbeIxI IAuthTabCallback;
    private final float IAuthTabCallbackDefault;
    private final float IAuthTabCallbackStub;
    private final float asBinder;
    private final float asInterface;
    private final r8lambdawXVv9xwdiGsnLD64xJ_ruHAm57M getInterfaceDescriptor;
    private final MappingRedirectableLiveDataExternalSyntheticLambda1 onExtraCallback;
    private final int onExtraCallbackWithResult;
    private final int onNavigationEvent;
    private final float onTransact;
    private final float onWarmupCompleted;

    public /* synthetic */ r8lambdaPuDx6Zf1uRi3X6EXV58bLbqqXWU(int i, int i2, float f, float f2, r8lambdacVBglJs0KSxuT8ZctwBlsCbeIxI r8lambdacvbgljs0ksxut8zctwblscbeixi, r8lambdawXVv9xwdiGsnLD64xJ_ruHAm57M r8lambdawxvv9xwdigsnld64xj_ruham57m, float f3, float f4, float f5, float f6, MappingRedirectableLiveDataExternalSyntheticLambda1 mappingRedirectableLiveDataExternalSyntheticLambda1, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, f, f2, r8lambdacvbgljs0ksxut8zctwblscbeixi, r8lambdawxvv9xwdigsnld64xj_ruham57m, f3, f4, f5, f6, mappingRedirectableLiveDataExternalSyntheticLambda1);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = access000 + 21;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof r8lambdaPuDx6Zf1uRi3X6EXV58bLbqqXWU)) {
            return false;
        }
        r8lambdaPuDx6Zf1uRi3X6EXV58bLbqqXWU r8lambdapudx6zf1uri3x6exv58blbqqxwu = (r8lambdaPuDx6Zf1uRi3X6EXV58bLbqqXWU) obj;
        if (this.onNavigationEvent != r8lambdapudx6zf1uri3x6exv58blbqqxwu.onNavigationEvent) {
            int i4 = access000 + 55;
            int i5 = i4 % 128;
            access100 = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 73;
            access000 = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 59 / 0;
            }
            return false;
        }
        if (this.onExtraCallbackWithResult != r8lambdapudx6zf1uri3x6exv58blbqqxwu.onExtraCallbackWithResult) {
            int i9 = access100 + 29;
            access000 = i9 % 128;
            if (i9 % 2 != 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (!VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.asInterface, r8lambdapudx6zf1uri3x6exv58blbqqxwu.asInterface) || Float.compare(this.IAuthTabCallbackStub, r8lambdapudx6zf1uri3x6exv58blbqqxwu.IAuthTabCallbackStub) != 0 || !Intrinsics.areEqual(this.IAuthTabCallback, r8lambdapudx6zf1uri3x6exv58blbqqxwu.IAuthTabCallback) || !Intrinsics.areEqual(this.getInterfaceDescriptor, r8lambdapudx6zf1uri3x6exv58blbqqxwu.getInterfaceDescriptor)) {
            return false;
        }
        if (Float.compare(this.onWarmupCompleted, r8lambdapudx6zf1uri3x6exv58blbqqxwu.onWarmupCompleted) != 0) {
            int i10 = access000 + 59;
            access100 = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.asBinder, r8lambdapudx6zf1uri3x6exv58blbqqxwu.asBinder)) {
            int i12 = access100 + 23;
            access000 = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (!VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.IAuthTabCallbackDefault, r8lambdapudx6zf1uri3x6exv58blbqqxwu.IAuthTabCallbackDefault) || !VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.onTransact, r8lambdapudx6zf1uri3x6exv58blbqqxwu.onTransact)) {
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallback, r8lambdapudx6zf1uri3x6exv58blbqqxwu.onExtraCallback)) {
            return true;
        }
        int i14 = access100 + 101;
        access000 = i14 % 128;
        return i14 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = access000 + 125;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((((((Integer.hashCode(this.onNavigationEvent) * 31) + Integer.hashCode(this.onExtraCallbackWithResult)) * 31) + VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.asInterface)) * 31) + Float.hashCode(this.IAuthTabCallbackStub)) * 31) + this.IAuthTabCallback.hashCode()) * 31) + this.getInterfaceDescriptor.hashCode()) * 31) + Float.hashCode(this.onWarmupCompleted)) * 31) + VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.asBinder)) * 31) + VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.IAuthTabCallbackDefault)) * 31) + VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.onTransact)) * 31) + this.onExtraCallback.hashCode();
        int i4 = access000 + 43;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "HorizontalProgressTrackElement(activeStep=" + this.onNavigationEvent + ", totalSteps=" + this.onExtraCallbackWithResult + ", trackHeight=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.asInterface) + ", trackCenterY=" + this.IAuthTabCallbackStub + ", colors=" + this.IAuthTabCallback + ", trackState=" + this.getInterfaceDescriptor + ", indicatorRadius=" + this.onWarmupCompleted + ", trackHorizontalPadding=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.asBinder) + ", trackCornerRadius=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.IAuthTabCallbackDefault) + ", trackBorderWidth=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.onTransact) + ", progressShadow=" + this.onExtraCallback + ")";
        int i2 = access100 + 71;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private r8lambdaPuDx6Zf1uRi3X6EXV58bLbqqXWU(int i, int i2, float f, float f2, r8lambdacVBglJs0KSxuT8ZctwBlsCbeIxI r8lambdacvbgljs0ksxut8zctwblscbeixi, r8lambdawXVv9xwdiGsnLD64xJ_ruHAm57M r8lambdawxvv9xwdigsnld64xj_ruham57m, float f3, float f4, float f5, float f6, MappingRedirectableLiveDataExternalSyntheticLambda1 mappingRedirectableLiveDataExternalSyntheticLambda1) {
        Intrinsics.checkNotNullParameter(r8lambdacvbgljs0ksxut8zctwblscbeixi, "");
        Intrinsics.checkNotNullParameter(r8lambdawxvv9xwdigsnld64xj_ruham57m, "");
        Intrinsics.checkNotNullParameter(mappingRedirectableLiveDataExternalSyntheticLambda1, "");
        this.onNavigationEvent = i;
        this.onExtraCallbackWithResult = i2;
        this.asInterface = f;
        this.IAuthTabCallbackStub = f2;
        this.IAuthTabCallback = r8lambdacvbgljs0ksxut8zctwblscbeixi;
        this.getInterfaceDescriptor = r8lambdawxvv9xwdigsnld64xj_ruham57m;
        this.onWarmupCompleted = f3;
        this.asBinder = f4;
        this.IAuthTabCallbackDefault = f5;
        this.onTransact = f6;
        this.onExtraCallback = mappingRedirectableLiveDataExternalSyntheticLambda1;
    }

    public /* synthetic */ QuirksExternalSyntheticBackport0.onWarmupCompleted onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access100 + 107;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaerigy6cOS6VOy0wZORlt_FVM4 r8lambdaerigy6cos6voy0wzorlt_fvm4IAuthTabCallback = IAuthTabCallback();
        int i4 = access000 + 85;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return r8lambdaerigy6cos6voy0wzorlt_fvm4IAuthTabCallback;
        }
        throw null;
    }

    public /* synthetic */ void onNavigationEvent(QuirksExternalSyntheticBackport0.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = access000 + 43;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback((r8lambdaerigy6cOS6VOy0wZORlt_FVM4) onwarmupcompleted);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = access100 + 27;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    public r8lambdaerigy6cOS6VOy0wZORlt_FVM4 IAuthTabCallback() {
        int i = 2 % 2;
        r8lambdaerigy6cOS6VOy0wZORlt_FVM4 r8lambdaerigy6cos6voy0wzorlt_fvm4 = new r8lambdaerigy6cOS6VOy0wZORlt_FVM4(this.onNavigationEvent, this.onExtraCallbackWithResult, this.asInterface, this.IAuthTabCallbackStub, this.IAuthTabCallback, this.getInterfaceDescriptor, this.onWarmupCompleted, this.asBinder, this.IAuthTabCallbackDefault, this.onTransact, this.onExtraCallback, null);
        int i2 = access100 + 69;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        return r8lambdaerigy6cos6voy0wzorlt_fvm4;
    }

    public void onExtraCallback(@NotNull r8lambdaerigy6cOS6VOy0wZORlt_FVM4 r8lambdaerigy6cos6voy0wzorlt_fvm4) {
        int i = 2 % 2;
        int i2 = access100 + 37;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdaerigy6cos6voy0wzorlt_fvm4, "");
        r8lambdaerigy6cos6voy0wzorlt_fvm4.onExtraCallback(this.onNavigationEvent, this.onExtraCallbackWithResult, this.asInterface, this.IAuthTabCallbackStub, this.IAuthTabCallback, this.getInterfaceDescriptor, this.onWarmupCompleted, this.asBinder, this.IAuthTabCallbackDefault, this.onTransact, this.onExtraCallback);
        int i4 = access000 + 95;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }
}
