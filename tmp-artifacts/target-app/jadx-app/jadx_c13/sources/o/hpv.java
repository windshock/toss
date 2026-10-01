package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class hpv implements yi, uh1<hpv> {
    private Integer IAuthTabCallback;
    private Integer IAuthTabCallbackStub;
    private jni_YGNodeStyleSetMinHeightPercentJNI onExtraCallback;
    private Integer onExtraCallbackWithResult;
    private Integer onNavigationEvent;
    private Integer onWarmupCompleted;

    public hpv() {
        this(null, null, null, null, null, null, 63, null);
    }

    public hpv(@Nullable Integer num, @Nullable Integer num2, @Nullable jni_YGNodeStyleSetMinHeightPercentJNI jni_ygnodestylesetminheightpercentjni, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5) {
        this.onWarmupCompleted = num;
        this.onNavigationEvent = num2;
        this.onExtraCallback = jni_ygnodestylesetminheightpercentjni;
        this.onExtraCallbackWithResult = num3;
        this.IAuthTabCallbackStub = num4;
        this.IAuthTabCallback = num5;
    }

    public /* synthetic */ hpv(Integer num, Integer num2, jni_YGNodeStyleSetMinHeightPercentJNI jni_ygnodestylesetminheightpercentjni, Integer num3, Integer num4, Integer num5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : jni_ygnodestylesetminheightpercentjni, (i & 8) != 0 ? null : num3, (i & 16) != 0 ? null : num4, (i & 32) != 0 ? null : num5);
    }

    @Override // o.yi
    public void IAuthTabCallback(@Nullable Integer num) {
        this.onWarmupCompleted = num;
    }

    @Override // o.yi
    public Integer onTransact() {
        return this.onWarmupCompleted;
    }

    @Override // o.yi
    public Integer IAuthTabCallbackStub() {
        return this.onNavigationEvent;
    }

    @Override // o.yi
    public void onWarmupCompleted(@Nullable Integer num) {
        this.onNavigationEvent = num;
    }

    @Override // o.yi
    public jni_YGNodeStyleSetMinHeightPercentJNI IAuthTabCallbackDefault() {
        return this.onExtraCallback;
    }

    @Override // o.yi
    public void onExtraCallback(@Nullable jni_YGNodeStyleSetMinHeightPercentJNI jni_ygnodestylesetminheightpercentjni) {
        this.onExtraCallback = jni_ygnodestylesetminheightpercentjni;
    }

    @Override // o.yi
    public Integer IAuthTabCallback_Parcel() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.yi
    public void onTransact(@Nullable Integer num) {
        this.onExtraCallbackWithResult = num;
    }

    @Override // o.yi
    public Integer extraCallbackWithResult() {
        return this.IAuthTabCallbackStub;
    }

    @Override // o.yi
    public void getInterfaceDescriptor(@Nullable Integer num) {
        this.IAuthTabCallbackStub = num;
    }

    @Override // o.yi
    public Integer IAuthTabCallbackStubProxy() {
        return this.IAuthTabCallback;
    }

    @Override // o.yi
    public void asInterface(@Nullable Integer num) {
        this.IAuthTabCallback = num;
    }

    public final jni_YGNodeStyleSetFlexBasisPercentJNI IAuthTabCallback() {
        int iIntValue;
        int iIntValue2;
        Integer numOnTransact = onTransact();
        if (numOnTransact != null) {
            iIntValue = numOnTransact.intValue();
            Integer numIAuthTabCallbackStub = IAuthTabCallbackStub();
            if (numIAuthTabCallbackStub != null && ((iIntValue + 11) % 12) + 1 != (iIntValue2 = numIAuthTabCallbackStub.intValue())) {
                throw new IllegalArgumentException(("Inconsistent hour and hour-of-am-pm: hour is " + iIntValue + ", but hour-of-am-pm is " + iIntValue2).toString());
            }
            jni_YGNodeStyleSetMinHeightPercentJNI jni_ygnodestylesetminheightpercentjniIAuthTabCallbackDefault = IAuthTabCallbackDefault();
            if (jni_ygnodestylesetminheightpercentjniIAuthTabCallbackDefault != null) {
                if ((jni_ygnodestylesetminheightpercentjniIAuthTabCallbackDefault == jni_YGNodeStyleSetMinHeightPercentJNI.PM) != (iIntValue >= 12)) {
                    throw new IllegalArgumentException(("Inconsistent hour and the AM/PM marker: hour is " + iIntValue + ", but the AM/PM marker is " + jni_ygnodestylesetminheightpercentjniIAuthTabCallbackDefault).toString());
                }
            }
        } else {
            Integer numIAuthTabCallbackStub2 = IAuthTabCallbackStub();
            Integer numValueOf = null;
            if (numIAuthTabCallbackStub2 != null) {
                int iIntValue3 = numIAuthTabCallbackStub2.intValue();
                jni_YGNodeStyleSetMinHeightPercentJNI jni_ygnodestylesetminheightpercentjniIAuthTabCallbackDefault2 = IAuthTabCallbackDefault();
                if (jni_ygnodestylesetminheightpercentjniIAuthTabCallbackDefault2 != null) {
                    if (iIntValue3 == 12) {
                        iIntValue3 = 0;
                    }
                    numValueOf = Integer.valueOf(iIntValue3 + (jni_ygnodestylesetminheightpercentjniIAuthTabCallbackDefault2 != jni_YGNodeStyleSetMinHeightPercentJNI.PM ? 0 : 12));
                }
            }
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                throw new jni_YGNodeStyleGetMaxHeightJNI("Incomplete time: missing hour");
            }
        }
        int iIntValue4 = ((Number) jw11.onWarmupCompleted(IAuthTabCallback_Parcel(), "minute")).intValue();
        Integer numExtraCallbackWithResult = extraCallbackWithResult();
        int iIntValue5 = numExtraCallbackWithResult != null ? numExtraCallbackWithResult.intValue() : 0;
        Integer numIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy();
        return new jni_YGNodeStyleSetFlexBasisPercentJNI(iIntValue, iIntValue4, iIntValue5, numIAuthTabCallbackStubProxy != null ? numIAuthTabCallbackStubProxy.intValue() : 0);
    }

    public final void onExtraCallback(@NotNull jni_YGNodeStyleSetFlexBasisPercentJNI jni_ygnodestylesetflexbasispercentjni) {
        Intrinsics.checkNotNullParameter(jni_ygnodestylesetflexbasispercentjni, "");
        IAuthTabCallback(Integer.valueOf(jni_ygnodestylesetflexbasispercentjni.onWarmupCompleted()));
        onWarmupCompleted(Integer.valueOf(((jni_ygnodestylesetflexbasispercentjni.onWarmupCompleted() + 11) % 12) + 1));
        onExtraCallback(jni_ygnodestylesetflexbasispercentjni.onWarmupCompleted() >= 12 ? jni_YGNodeStyleSetMinHeightPercentJNI.PM : jni_YGNodeStyleSetMinHeightPercentJNI.AM);
        onTransact(Integer.valueOf(jni_ygnodestylesetflexbasispercentjni.IAuthTabCallback()));
        getInterfaceDescriptor(Integer.valueOf(jni_ygnodestylesetflexbasispercentjni.onExtraCallback()));
        asInterface(Integer.valueOf(jni_ygnodestylesetflexbasispercentjni.onExtraCallbackWithResult()));
    }

    @Override // o.uh1
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public hpv onExtraCallback() {
        return new hpv(onTransact(), IAuthTabCallbackStub(), IAuthTabCallbackDefault(), IAuthTabCallback_Parcel(), extraCallbackWithResult(), IAuthTabCallbackStubProxy());
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof hpv)) {
            return false;
        }
        hpv hpvVar = (hpv) obj;
        return Intrinsics.areEqual(onTransact(), hpvVar.onTransact()) && Intrinsics.areEqual(IAuthTabCallbackStub(), hpvVar.IAuthTabCallbackStub()) && IAuthTabCallbackDefault() == hpvVar.IAuthTabCallbackDefault() && Intrinsics.areEqual(IAuthTabCallback_Parcel(), hpvVar.IAuthTabCallback_Parcel()) && Intrinsics.areEqual(extraCallbackWithResult(), hpvVar.extraCallbackWithResult()) && Intrinsics.areEqual(IAuthTabCallbackStubProxy(), hpvVar.IAuthTabCallbackStubProxy());
    }

    public int hashCode() {
        Integer numOnTransact = onTransact();
        int iIntValue = numOnTransact != null ? numOnTransact.intValue() : 0;
        Integer numIAuthTabCallbackStub = IAuthTabCallbackStub();
        int iIntValue2 = numIAuthTabCallbackStub != null ? numIAuthTabCallbackStub.intValue() : 0;
        jni_YGNodeStyleSetMinHeightPercentJNI jni_ygnodestylesetminheightpercentjniIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        int iHashCode = jni_ygnodestylesetminheightpercentjniIAuthTabCallbackDefault != null ? jni_ygnodestylesetminheightpercentjniIAuthTabCallbackDefault.hashCode() : 0;
        Integer numIAuthTabCallback_Parcel = IAuthTabCallback_Parcel();
        int iIntValue3 = numIAuthTabCallback_Parcel != null ? numIAuthTabCallback_Parcel.intValue() : 0;
        Integer numExtraCallbackWithResult = extraCallbackWithResult();
        int iIntValue4 = numExtraCallbackWithResult != null ? numExtraCallbackWithResult.intValue() : 0;
        Integer numIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy();
        return (iIntValue * 31) + (iIntValue2 * 31) + (iHashCode * 31) + (iIntValue3 * 31) + (iIntValue4 * 31) + (numIAuthTabCallbackStubProxy != null ? numIAuthTabCallbackStubProxy.intValue() : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        String strPadStart;
        StringBuilder sb = new StringBuilder();
        Object objOnTransact = onTransact();
        if (objOnTransact == null) {
            objOnTransact = "??";
        }
        sb.append(objOnTransact);
        sb.append(':');
        Object objIAuthTabCallback_Parcel = IAuthTabCallback_Parcel();
        if (objIAuthTabCallback_Parcel == null) {
            objIAuthTabCallback_Parcel = "??";
        }
        sb.append(objIAuthTabCallback_Parcel);
        sb.append(':');
        Integer numExtraCallbackWithResult = extraCallbackWithResult();
        sb.append(numExtraCallbackWithResult != null ? numExtraCallbackWithResult : "??");
        sb.append('.');
        Integer numIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy();
        if (numIAuthTabCallbackStubProxy != null) {
            String strValueOf = String.valueOf(numIAuthTabCallbackStubProxy.intValue());
            strPadStart = StringsKt__StringsKt.padStart(strValueOf, 9 - strValueOf.length(), '0');
            if (strPadStart == null) {
                strPadStart = "???";
            }
        }
        sb.append(strPadStart);
        return sb.toString();
    }
}
