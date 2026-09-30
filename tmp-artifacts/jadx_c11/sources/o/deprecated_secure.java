package o;

import im.toss.features.loan.comparison.result.view.LoanComparisonResultWarningNoticeView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.setByteOrder;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class deprecated_secure {
    public static final onExtraCallback Companion = new onExtraCallback(null);
    private static final deprecated_secure IAuthTabCallback;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access100 = 0;
    private static int extraCallbackWithResult = 1;
    private static int getInterfaceDescriptor = 1;
    private static final deprecated_secure onExtraCallback;
    private static final deprecated_secure onExtraCallbackWithResult;
    private static final deprecated_secure onNavigationEvent;
    private static final deprecated_secure onWarmupCompleted;
    private final float IAuthTabCallbackDefault;
    private final int IAuthTabCallbackStub;
    private final long IAuthTabCallbackStubProxy;
    private final float access000;
    private final boolean asBinder;
    private final float asInterface;
    private final float onTransact;

    public /* synthetic */ deprecated_secure(int i, float f, long j, float f2, float f3, float f4, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, f, j, f2, f3, f4, z);
    }

    public static /* synthetic */ deprecated_secure onWarmupCompleted(deprecated_secure deprecated_secureVar, int i, float f, long j, float f2, float f3, float f4, boolean z, int i2, Object obj) {
        float f5;
        long j2;
        float f6;
        int i3 = 2 % 2;
        int i4 = access100 + 67;
        int i5 = i4 % 128;
        extraCallbackWithResult = i5;
        int i6 = (i4 % 2 == 0 || (i2 & 1) == 0) ? i : deprecated_secureVar.IAuthTabCallbackStub;
        if ((i2 & 2) != 0) {
            int i7 = i5 + 15;
            access100 = i7 % 128;
            int i8 = i7 % 2;
            f5 = deprecated_secureVar.IAuthTabCallbackDefault;
        } else {
            f5 = f;
        }
        if ((i2 & 4) != 0) {
            int i9 = i5 + 71;
            access100 = i9 % 128;
            int i10 = i9 % 2;
            j2 = deprecated_secureVar.IAuthTabCallbackStubProxy;
        } else {
            j2 = j;
        }
        if ((i2 & 8) != 0) {
            int i11 = access100 + 71;
            extraCallbackWithResult = i11 % 128;
            int i12 = i11 % 2;
            f6 = deprecated_secureVar.onTransact;
        } else {
            f6 = f2;
        }
        return (deprecated_secure) onExtraCallback(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -374753862, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), new Object[]{deprecated_secureVar, Integer.valueOf(i6), Float.valueOf(f5), Long.valueOf(j2), Float.valueOf(f6), Float.valueOf((i2 & 16) != 0 ? deprecated_secureVar.asInterface : f3), Float.valueOf((i2 & 32) != 0 ? deprecated_secureVar.access000 : f4), Boolean.valueOf((i2 & 64) != 0 ? deprecated_secureVar.asBinder : z)}, 374753863);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = access100 + 41;
            extraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof deprecated_secure)) {
            return false;
        }
        deprecated_secure deprecated_secureVar = (deprecated_secure) obj;
        Object obj2 = null;
        if (this.IAuthTabCallbackStub != deprecated_secureVar.IAuthTabCallbackStub) {
            int i4 = access100 + 17;
            extraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        if (Float.compare(this.IAuthTabCallbackDefault, deprecated_secureVar.IAuthTabCallbackDefault) != 0) {
            return false;
        }
        if (!setByteOrder.onExtraCallbackWithResult(this.IAuthTabCallbackStubProxy, deprecated_secureVar.IAuthTabCallbackStubProxy)) {
            int i5 = access100 + 97;
            extraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (Float.compare(this.onTransact, deprecated_secureVar.onTransact) != 0) {
            int i7 = extraCallbackWithResult + 101;
            access100 = i7 % 128;
            if (i7 % 2 == 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        if (Float.compare(this.asInterface, deprecated_secureVar.asInterface) == 0) {
            if (Float.compare(this.access000, deprecated_secureVar.access000) == 0) {
                return this.asBinder == deprecated_secureVar.asBinder;
            }
            int i8 = access100 + 55;
            extraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        int i10 = extraCallbackWithResult;
        int i11 = i10 + 85;
        access100 = i11 % 128;
        boolean z = i11 % 2 != 0;
        int i12 = i10 + 89;
        access100 = i12 % 128;
        if (i12 % 2 == 0) {
            return z;
        }
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = access100 + 119;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((Integer.hashCode(this.IAuthTabCallbackStub) * 31) + Float.hashCode(this.IAuthTabCallbackDefault)) * 31) + setByteOrder.onTransact(this.IAuthTabCallbackStubProxy)) * 31) + Float.hashCode(this.onTransact)) * 31) + Float.hashCode(this.asInterface)) * 31) + Float.hashCode(this.access000)) * 31) + Boolean.hashCode(this.asBinder);
        int i4 = access100 + 95;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 15 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BlurStyle(passes=" + this.IAuthTabCallbackStub + ", offset=" + this.IAuthTabCallbackDefault + ", tint=" + setByteOrder.IAuthTabCallbackDefault(this.IAuthTabCallbackStubProxy) + ", noiseAlpha=" + this.onTransact + ", cornerRadiusPx=" + this.asInterface + ", renderEffectRadiusPx=" + this.access000 + ", isCircle=" + this.asBinder + ")";
        int i2 = access100 + 3;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    private deprecated_secure(int i, float f, long j, float f2, float f3, float f4, boolean z) {
        this.IAuthTabCallbackStub = i;
        this.IAuthTabCallbackDefault = f;
        this.IAuthTabCallbackStubProxy = j;
        this.onTransact = f2;
        this.asInterface = f3;
        this.access000 = f4;
        this.asBinder = z;
    }

    public static final /* synthetic */ deprecated_secure IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = access100 + 93;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        deprecated_secure deprecated_secureVar = onExtraCallbackWithResult;
        int i4 = i3 + 107;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return deprecated_secureVar;
    }

    public static final /* synthetic */ deprecated_secure onExtraCallback() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 35;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        deprecated_secure deprecated_secureVar = IAuthTabCallback;
        if (i3 != 0) {
            int i4 = 95 / 0;
        }
        return deprecated_secureVar;
    }

    public static final /* synthetic */ deprecated_secure onNavigationEvent() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 5;
        int i3 = i2 % 128;
        access100 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        deprecated_secure deprecated_secureVar = onWarmupCompleted;
        int i4 = i3 + 9;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 71 / 0;
        }
        return deprecated_secureVar;
    }

    public static final /* synthetic */ deprecated_secure onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 1;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        deprecated_secure deprecated_secureVar = onNavigationEvent;
        int i5 = i2 + 105;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return deprecated_secureVar;
    }

    public final int asInterface() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 115;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        int i5 = this.IAuthTabCallbackStub;
        int i6 = i3 + 97;
        extraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final float IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = access100 + 25;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ deprecated_secure(int i, float f, long j, float f2, float f3, float f4, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        long jIAuthTabCallbackDefault;
        float f5;
        float f6;
        boolean z2 = false;
        int i3 = (i2 & 1) != 0 ? 0 : i;
        float f7 = (i2 & 2) != 0 ? 0.0f : f;
        if ((i2 & 4) != 0) {
            jIAuthTabCallbackDefault = setByteOrder.Companion.IAuthTabCallbackDefault();
            int i4 = access100 + 45;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } else {
            jIAuthTabCallbackDefault = j;
        }
        if ((i2 & 8) != 0) {
            int i7 = extraCallbackWithResult + 75;
            access100 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            f5 = 0.0f;
        } else {
            f5 = f2;
        }
        if ((i2 & 16) != 0) {
            int i10 = extraCallbackWithResult + 63;
            access100 = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 2 % 2;
            f6 = 0.0f;
        } else {
            f6 = f3;
        }
        float f8 = (i2 & 32) == 0 ? f4 : 0.0f;
        if ((i2 & 64) != 0) {
            int i13 = 2 % 2;
        } else {
            z2 = z;
        }
        this(i3, f7, jIAuthTabCallbackDefault, f5, f6, f8, z2, null);
    }

    public final long IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 5;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        long j = this.IAuthTabCallbackStubProxy;
        int i5 = i2 + 37;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float asBinder() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 61;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        float f = this.onTransact;
        int i5 = i2 + 5;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return f;
        }
        throw null;
    }

    public final float onTransact() {
        float f;
        int i = 2 % 2;
        int i2 = access100 + 93;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            f = this.access000;
            int i4 = 77 / 0;
        } else {
            f = this.access000;
        }
        int i5 = i3 + 109;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public static final class onExtraCallback {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final deprecated_secure IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 21;
            IAuthTabCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                onNavigationEvent();
                obj.hashCode();
                throw null;
            }
            deprecated_secure deprecated_secureVarOnNavigationEvent = onNavigationEvent();
            int i3 = onExtraCallbackWithResult + 125;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return deprecated_secureVarOnNavigationEvent;
            }
            obj.hashCode();
            throw null;
        }

        public final deprecated_secure onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 3;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            deprecated_secure deprecated_secureVarOnExtraCallback = deprecated_secure.onExtraCallback();
            int i4 = IAuthTabCallback + 79;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return deprecated_secureVarOnExtraCallback;
        }

        public final deprecated_secure asInterface() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 3;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
                int iOnWarmupCompleted2 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
                return (deprecated_secure) deprecated_secure.onExtraCallback(iOnWarmupCompleted, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 269600636, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted2, new Object[0], -269600636);
            }
            int iOnWarmupCompleted3 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
            int iOnWarmupCompleted4 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
            throw null;
        }

        public final deprecated_secure onNavigationEvent() {
            deprecated_secure deprecated_secureVarIAuthTabCallback;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 11;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                deprecated_secureVarIAuthTabCallback = deprecated_secure.IAuthTabCallback();
                int i3 = 73 / 0;
            } else {
                deprecated_secureVarIAuthTabCallback = deprecated_secure.IAuthTabCallback();
            }
            int i4 = IAuthTabCallback + 35;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return deprecated_secureVarIAuthTabCallback;
        }

        public final deprecated_secure onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 23;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                deprecated_secure.onWarmupCompleted();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            deprecated_secure deprecated_secureVarOnWarmupCompleted = deprecated_secure.onWarmupCompleted();
            int i3 = onExtraCallbackWithResult + 83;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return deprecated_secureVarOnWarmupCompleted;
        }

        public final deprecated_secure onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 113;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return deprecated_secure.onNavigationEvent();
            }
            deprecated_secure.onNavigationEvent();
            throw null;
        }
    }

    static {
        setByteOrder.onExtraCallbackWithResult onextracallbackwithresult = setByteOrder.Companion;
        float f = 0.0f;
        float f2 = 0.0f;
        IAuthTabCallback = new deprecated_secure(0, 0.0f, onextracallbackwithresult.IAuthTabCallbackDefault(), 0.0f, f, f2, false, 80, null);
        float f3 = 0.0f;
        float f4 = 0.0f;
        boolean z = false;
        int i = 80;
        DefaultConstructorMarker defaultConstructorMarker = null;
        onExtraCallback = new deprecated_secure(1, 0.5f, onextracallbackwithresult.IAuthTabCallbackDefault(), f3, f4, 12.0f, z, i, defaultConstructorMarker);
        boolean z2 = false;
        int i2 = 80;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        onExtraCallbackWithResult = new deprecated_secure(3, 2.62f, onextracallbackwithresult.IAuthTabCallbackDefault(), f, f2, 55.0f, z2, i2, defaultConstructorMarker2);
        onNavigationEvent = new deprecated_secure(4, 3.52f, onextracallbackwithresult.IAuthTabCallbackDefault(), f3, f4, 80.0f, z, i, defaultConstructorMarker);
        onWarmupCompleted = new deprecated_secure(6, 4.2f, onextracallbackwithresult.IAuthTabCallbackDefault(), f, f2, 150.0f, z2, i2, defaultConstructorMarker2);
        int i3 = getInterfaceDescriptor + 17;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i3;
        int i8 = ~i;
        int i9 = ~(i7 | i8);
        int i10 = ~i6;
        int i11 = i9 | (~(i10 | i));
        int i12 = i8 | i3;
        int i13 = ~(i12 | i6);
        int i14 = (~(i | i7)) | (~(i8 | i10)) | (~i12);
        int i15 = i3 + i6 + i5 + (1650861130 * i2) + ((-924421097) * i4);
        int i16 = i15 * i15;
        int i17 = ((i3 * (-959335331)) - 587927435) + (i6 * (-959335331)) + (i11 * 462) + (i13 * (-462)) + (i14 * 462) + ((-959334869) * i5) + (22983790 * i2) + (637852125 * i4) + (i16 * (-1124859904));
        if ((i3 * (-405912681)) + 1474035712 + ((-405912681) * i6) + (i11 * (-1619411862)) + (1619411862 * i13) + ((-1619411862) * i14) + ((-2025324544) * i5) + (986710016 * i2) + ((-948436992) * i4) + ((-1864630272) * i16) + (i17 * i17 * (-1807482880)) != 1) {
            int i18 = 2 % 2;
            int i19 = extraCallbackWithResult;
            int i20 = i19 + 101;
            access100 = i20 % 128;
            int i21 = i20 % 2;
            deprecated_secure deprecated_secureVar = onExtraCallback;
            int i22 = i19 + 101;
            access100 = i22 % 128;
            int i23 = i22 % 2;
            return deprecated_secureVar;
        }
        int i24 = 2 % 2;
        deprecated_secure deprecated_secureVar2 = new deprecated_secure(((Number) objArr[1]).intValue(), ((Number) objArr[2]).floatValue(), ((Number) objArr[3]).longValue(), ((Number) objArr[4]).floatValue(), ((Number) objArr[5]).floatValue(), ((Number) objArr[6]).floatValue(), ((Boolean) objArr[7]).booleanValue(), null);
        int i25 = access100 + 65;
        extraCallbackWithResult = i25 % 128;
        int i26 = i25 % 2;
        return deprecated_secureVar2;
    }

    public static final /* synthetic */ deprecated_secure onExtraCallbackWithResult() {
        int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        return (deprecated_secure) onExtraCallback(iOnWarmupCompleted, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 269600636, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted2, new Object[0], -269600636);
    }

    public final deprecated_secure onWarmupCompleted(int i, float f, long j, float f2, float f3, float f4, boolean z) {
        Object[] objArr = {this, Integer.valueOf(i), Float.valueOf(f), Long.valueOf(j), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Boolean.valueOf(z)};
        return (deprecated_secure) onExtraCallback(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -374753862, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), objArr, 374753863);
    }
}
