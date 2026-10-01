package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.features.benefit.ui.BenefitItemAdapter$;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getDnsokhttp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getDnsokhttp implements eventListener, getConnectionPoolokhttp, connectTimeout {
    private static int access000 = 1;
    private static int asBinder;
    private final /* synthetic */ getConnectionSpecsokhttp IAuthTabCallback;
    private final long IAuthTabCallbackDefault;
    private final getSupportedHighSpeedResolutionsFor<getHumanReadableName> IAuthTabCallbackStub;
    private final getSupportedHighSpeedResolutionsFor<AvoidCaptureProcessProgressAvailabilityCheckQuirk> asInterface;
    private final getSupportedHighSpeedResolutionsFor<setByteOrder> onExtraCallback;
    private final /* synthetic */ addNetworkInterceptor onExtraCallbackWithResult;
    private final getSupportedHighSpeedResolutionsFor<GraphicDeviceInfo> onNavigationEvent;
    private final hasProvider onTransact;
    private final /* synthetic */ getCallTimeoutokhttp onWarmupCompleted;

    public /* synthetic */ getDnsokhttp(hasProvider hasprovider, long j, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor4, DefaultConstructorMarker defaultConstructorMarker) {
        this(hasprovider, j, (getSupportedHighSpeedResolutionsFor<getHumanReadableName>) getsupportedhighspeedresolutionsfor, (getSupportedHighSpeedResolutionsFor<AvoidCaptureProcessProgressAvailabilityCheckQuirk>) getsupportedhighspeedresolutionsfor2, (getSupportedHighSpeedResolutionsFor<setByteOrder>) getsupportedhighspeedresolutionsfor3, (getSupportedHighSpeedResolutionsFor<GraphicDeviceInfo>) getsupportedhighspeedresolutionsfor4);
    }

    public /* synthetic */ getDnsokhttp(hasProvider hasprovider, getHumanReadableName gethumanreadablename, long j, long j2, long j3, GraphicDeviceInfo graphicDeviceInfo, DefaultConstructorMarker defaultConstructorMarker) {
        this(hasprovider, gethumanreadablename, j, j2, j3, graphicDeviceInfo);
    }

    public static /* synthetic */ Unit IAuthTabCallback(getDnsokhttp getdnsokhttp, y1a y1aVar, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = asBinder + 23;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(getdnsokhttp, y1aVar, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = access000 + 7;
        asBinder = i6 % 128;
        if (i6 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i3;
        int i9 = ~i5;
        int i10 = (~(i7 | i9)) | i8;
        int i11 = ~(i9 | i8 | i7);
        int i12 = i3 + i + i2 + ((-112346298) * i4) + (505796074 * i6);
        int i13 = i12 * i12;
        int i14 = ((1543607772 * i3) - 1525940224) + (1734765094 * i) + (i7 * 95578661) + ((-95578661) * i10) + (95578661 * i11) + (1639186432 * i2) + (859308032 * i4) + (310902784 * i6) + (417529856 * i13);
        int i15 = (i3 * (-1233303660)) + 1670658458 + (i * (-1233302158)) + (i7 * 751) + (i10 * (-751)) + (i11 * 751) + (i2 * (-1233302909)) + (i4 * 1075253458) + (i6 * 745806526) + (i13 * 1512636416);
        return i14 + ((i15 * i15) * (-1737162752)) != 1 ? onWarmupCompleted(objArr) : onNavigationEvent(objArr);
    }

    public static /* synthetic */ Unit onExtraCallback(getDnsokhttp getdnsokhttp, Object obj, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = access000 + 77;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            return IAuthTabCallback(getdnsokhttp, obj, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        IAuthTabCallback(getdnsokhttp, obj, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        getDnsokhttp getdnsokhttp = (getDnsokhttp) objArr[0];
        areAllItemsEnabled areallitemsenabled = (areAllItemsEnabled) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue2 = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = access000 + 93;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(getdnsokhttp, areallitemsenabled, iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        int i4 = asBinder + 11;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    private static final Unit onNavigationEvent(getDnsokhttp getdnsokhttp, y1a y1aVar, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = asBinder + 113;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        getdnsokhttp.onWarmupCompleted(y1aVar, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = asBinder + 53;
        access000 = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(getDnsokhttp getdnsokhttp, areAllItemsEnabled areallitemsenabled, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = asBinder + 99;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallback(-1791688305, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), new Object[]{getdnsokhttp, areallitemsenabled, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1))}, 1791688305, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i6 = access000 + 43;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = access000 + 83;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            this.IAuthTabCallback.IAuthTabCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getSupportedHighSpeedResolutionsFor<setByteOrder> getsupportedhighspeedresolutionsforIAuthTabCallback = this.IAuthTabCallback.IAuthTabCallback();
        int i3 = access000 + 23;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return getsupportedhighspeedresolutionsforIAuthTabCallback;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getDnsokhttp)) {
            int i2 = access000 + 45;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        getDnsokhttp getdnsokhttp = (getDnsokhttp) obj;
        if (!Intrinsics.areEqual(this.onTransact, getdnsokhttp.onTransact)) {
            int i4 = asBinder + 63;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!setByteOrder.onExtraCallbackWithResult(this.IAuthTabCallbackDefault, getdnsokhttp.IAuthTabCallbackDefault)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallbackStub, getdnsokhttp.IAuthTabCallbackStub)) {
            int i6 = access000 + 25;
            asBinder = i6 % 128;
            return i6 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.asInterface, getdnsokhttp.asInterface)) {
            int i7 = asBinder + 27;
            access000 = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 22 / 0;
            }
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallback, getdnsokhttp.onExtraCallback)) {
            return false;
        }
        if (Intrinsics.areEqual(this.onNavigationEvent, getdnsokhttp.onNavigationEvent)) {
            return true;
        }
        int i9 = access000 + 31;
        asBinder = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = asBinder + 95;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        hasProvider hasprovider = this.onTransact;
        int iHashCode = ((((((((((hasprovider == null ? 0 : hasprovider.hashCode()) * 31) + setByteOrder.onTransact(this.IAuthTabCallbackDefault)) * 31) + this.IAuthTabCallbackStub.hashCode()) * 31) + this.asInterface.hashCode()) * 31) + this.onExtraCallback.hashCode()) * 31) + this.onNavigationEvent.hashCode();
        int i4 = access000 + 125;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    @Override // o.getNetworkInterceptorsokhttp
    public void onExtraCallbackWithResult(@Nullable setByteOrder setbyteorder) {
        int i = 2 % 2;
        int i2 = asBinder + 125;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallback.onExtraCallbackWithResult(setbyteorder);
        int i4 = access000 + 59;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.getNetworkInterceptorsokhttp
    public void onNavigationEvent(@Nullable Integer num) {
        int i = 2 % 2;
        int i2 = access000 + 57;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallback.onNavigationEvent(num);
        int i4 = asBinder + 9;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.getFollowSslRedirectsokhttp
    public void onNavigationEvent(@Nullable String str) {
        int i = 2 % 2;
        int i2 = access000 + 77;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        this.onWarmupCompleted.onNavigationEvent(str);
        int i4 = access000 + 123;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onNavigationEvent(@Nullable Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = access000 + 113;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallbackWithResult.onExtraCallback(function0);
        if (i3 != 0) {
            throw null;
        }
    }

    @Override // o.getFollowSslRedirectsokhttp
    public void onNavigationEvent(@Nullable hasProvider hasprovider) {
        int i = 2 % 2;
        int i2 = asBinder + 83;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        this.onWarmupCompleted.onNavigationEvent(hasprovider);
        if (i3 == 0) {
            int i4 = 98 / 0;
        }
    }

    public CameraPresenceProviderExternalSyntheticLambda6<hasProvider> onTransact() {
        getSupportedHighSpeedResolutionsFor<hasProvider> getsupportedhighspeedresolutionsforOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = access000 + 27;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            getsupportedhighspeedresolutionsforOnWarmupCompleted = this.onWarmupCompleted.onWarmupCompleted();
            int i3 = 99 / 0;
        } else {
            getsupportedhighspeedresolutionsforOnWarmupCompleted = this.onWarmupCompleted.onWarmupCompleted();
        }
        int i4 = asBinder + 93;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return getsupportedhighspeedresolutionsforOnWarmupCompleted;
    }

    public CameraPresenceProviderExternalSyntheticLambda6<Function0<Unit>> onWarmupCompleted() {
        getSupportedHighSpeedResolutionsFor<Function0<Unit>> getsupportedhighspeedresolutionsforOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = access000 + 43;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            getsupportedhighspeedresolutionsforOnExtraCallbackWithResult = this.onExtraCallbackWithResult.onExtraCallbackWithResult();
            int i3 = 45 / 0;
        } else {
            getsupportedhighspeedresolutionsforOnExtraCallbackWithResult = this.onExtraCallbackWithResult.onExtraCallbackWithResult();
        }
        int i4 = asBinder + 59;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return getsupportedhighspeedresolutionsforOnExtraCallbackWithResult;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SelectorState(initialText=" + this.onTransact + ", initialTextColor=" + setByteOrder.IAuthTabCallbackDefault(this.IAuthTabCallbackDefault) + ", style=" + this.IAuthTabCallbackStub + ", textSize=" + this.asInterface + ", arrowColor=" + this.onExtraCallback + ", fontWeight=" + this.onNavigationEvent + ")";
        int i2 = asBinder + 119;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private getDnsokhttp(hasProvider hasprovider, long j, getSupportedHighSpeedResolutionsFor<getHumanReadableName> getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor<AvoidCaptureProcessProgressAvailabilityCheckQuirk> getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor<setByteOrder> getsupportedhighspeedresolutionsfor3, getSupportedHighSpeedResolutionsFor<GraphicDeviceInfo> getsupportedhighspeedresolutionsfor4) {
        Intrinsics.checkNotNullParameter(getsupportedhighspeedresolutionsfor, "");
        Intrinsics.checkNotNullParameter(getsupportedhighspeedresolutionsfor2, "");
        Intrinsics.checkNotNullParameter(getsupportedhighspeedresolutionsfor3, "");
        Intrinsics.checkNotNullParameter(getsupportedhighspeedresolutionsfor4, "");
        this.onWarmupCompleted = new getCallTimeoutokhttp(hasprovider);
        this.IAuthTabCallback = new getConnectionSpecsokhttp(j, null);
        this.onExtraCallbackWithResult = new addNetworkInterceptor();
        this.onTransact = hasprovider;
        this.IAuthTabCallbackDefault = j;
        this.IAuthTabCallbackStub = getsupportedhighspeedresolutionsfor;
        this.asInterface = getsupportedhighspeedresolutionsfor2;
        this.onExtraCallback = getsupportedhighspeedresolutionsfor3;
        this.onNavigationEvent = getsupportedhighspeedresolutionsfor4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getDnsokhttp(hasProvider hasprovider, long j, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        long jOnTransact;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted2;
        hasProvider hasprovider2 = (i & 1) != 0 ? null : hasprovider;
        if ((i & 2) != 0) {
            int i2 = asBinder + 7;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            jOnTransact = setByteOrder.Companion.onTransact();
        } else {
            jOnTransact = j;
        }
        if ((i & 4) != 0) {
            getsupportedhighspeedresolutionsforOnWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
            int i4 = access000 + 81;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        } else {
            getsupportedhighspeedresolutionsforOnWarmupCompleted = getsupportedhighspeedresolutionsfor;
        }
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted3 = (i & 8) != 0 ? CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(AvoidCaptureProcessProgressAvailabilityCheckQuirk.onExtraCallbackWithResult(AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent()), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null) : getsupportedhighspeedresolutionsfor2;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted4 = (i & 16) != 0 ? CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(setByteOrder.onNavigationEvent(setByteOrder.Companion.onTransact()), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null) : getsupportedhighspeedresolutionsfor3;
        if ((i & 32) != 0) {
            getsupportedhighspeedresolutionsforOnWarmupCompleted2 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
            int i6 = asBinder + 15;
            access000 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 3 % 4;
            } else {
                int i8 = 2 % 2;
            }
        } else {
            getsupportedhighspeedresolutionsforOnWarmupCompleted2 = getsupportedhighspeedresolutionsfor4;
        }
        this(hasprovider2, jOnTransact, getsupportedhighspeedresolutionsforOnWarmupCompleted, getsupportedhighspeedresolutionsforOnWarmupCompleted3, getsupportedhighspeedresolutionsforOnWarmupCompleted4, getsupportedhighspeedresolutionsforOnWarmupCompleted2, (DefaultConstructorMarker) null);
    }

    public final getSupportedHighSpeedResolutionsFor<getHumanReadableName> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 63;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        getSupportedHighSpeedResolutionsFor<getHumanReadableName> getsupportedhighspeedresolutionsfor = this.IAuthTabCallbackStub;
        int i5 = i2 + 65;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 77 / 0;
        }
        return getsupportedhighspeedresolutionsfor;
    }

    public final getSupportedHighSpeedResolutionsFor<AvoidCaptureProcessProgressAvailabilityCheckQuirk> asBinder() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 91;
        access000 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        getSupportedHighSpeedResolutionsFor<AvoidCaptureProcessProgressAvailabilityCheckQuirk> getsupportedhighspeedresolutionsfor = this.asInterface;
        int i4 = i2 + 123;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return getsupportedhighspeedresolutionsfor;
        }
        throw null;
    }

    public final getSupportedHighSpeedResolutionsFor<setByteOrder> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = access000 + 5;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallback;
        }
        throw null;
    }

    public final getSupportedHighSpeedResolutionsFor<GraphicDeviceInfo> onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 11;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        getSupportedHighSpeedResolutionsFor<GraphicDeviceInfo> getsupportedhighspeedresolutionsfor = this.onNavigationEvent;
        int i5 = i3 + 7;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return getsupportedhighspeedresolutionsfor;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getDnsokhttp(hasProvider hasprovider, getHumanReadableName gethumanreadablename, long j, long j2, long j3, GraphicDeviceInfo graphicDeviceInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        getHumanReadableName gethumanreadablename2;
        long jOnTransact;
        long jOnNavigationEvent;
        GraphicDeviceInfo graphicDeviceInfo2;
        Object obj = null;
        if ((i & 2) != 0) {
            int i2 = asBinder + 39;
            access000 = i2 % 128;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            gethumanreadablename2 = null;
        } else {
            gethumanreadablename2 = gethumanreadablename;
        }
        if ((i & 4) != 0) {
            int i3 = access000 + 31;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            jOnTransact = setByteOrder.Companion.onTransact();
        } else {
            jOnTransact = j;
        }
        if ((i & 8) != 0) {
            int i6 = access000 + 71;
            asBinder = i6 % 128;
            if (i6 % 2 != 0) {
                AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
                throw null;
            }
            jOnNavigationEvent = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
        } else {
            jOnNavigationEvent = j2;
        }
        long jOnTransact2 = (i & 16) != 0 ? setByteOrder.Companion.onTransact() : j3;
        if ((i & 32) != 0) {
            int i7 = 2 % 2;
            graphicDeviceInfo2 = null;
        } else {
            graphicDeviceInfo2 = graphicDeviceInfo;
        }
        this(hasprovider, gethumanreadablename2, jOnTransact, jOnNavigationEvent, jOnTransact2, graphicDeviceInfo2, (DefaultConstructorMarker) null);
    }

    private getDnsokhttp(hasProvider hasprovider, getHumanReadableName gethumanreadablename, long j, long j2, long j3, GraphicDeviceInfo graphicDeviceInfo) {
        this(hasprovider, j, CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(gethumanreadablename, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null), CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(AvoidCaptureProcessProgressAvailabilityCheckQuirk.onExtraCallbackWithResult(j2), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null), CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(setByteOrder.onNavigationEvent(j3), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null), CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(graphicDeviceInfo, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null), (DefaultConstructorMarker) null);
    }

    @Override // o.eventListener
    public <T> getBacktraceNote<T, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent() {
        int i = 2 % 2;
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(-7228692, true, new getBacktraceNote() { // from class: im.toss.tds.view.compat.component.state.SelectorState$$ExternalSyntheticLambda2
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 31;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallback = getDnsokhttp.onExtraCallback(this.f$0, obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i5 = onExtraCallbackWithResult + 95;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return unitOnExtraCallback;
            }
        });
        int i2 = asBinder + 3;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            return encoderProfilesProxyVideoProfileProxyOnExtraCallbackWithResult;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x01b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(getDnsokhttp getdnsokhttp, Object obj, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean zOnExtraCallback;
        int i2;
        int i3 = 2 % 2;
        int i4 = asBinder + 23;
        access000 = i4 % 128;
        if (i4 % 2 != 0 ? (i & 6) != 0 : (i & 107) != 0) {
            i2 = i;
        } else {
            if ((i & 8) == 0) {
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(obj);
            } else {
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(obj);
                int i5 = access000 + 41;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
            }
            i2 = i | (zOnExtraCallback ? 4 : 2);
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i7 = access000 + 39;
            asBinder = i7 % 128;
            Object obj2 = null;
            if (i7 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                obj2.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-7228692, i2, -1, "im.toss.tds.view.compat.component.state.SelectorState.toComposable.<anonymous> (SelectorState.kt:75)");
            }
            if (obj instanceof areAllItemsEnabled) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1643164277);
                onExtraCallback(-1791688305, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), new Object[]{getdnsokhttp, (areAllItemsEnabled) obj, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2 & 14)}, 1791688305, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult());
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else if (obj instanceof y1a) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1643165909);
                getdnsokhttp.onWarmupCompleted((y1a) obj, cameraCaptureResultEmptyCameraCaptureResult, i2 & 14);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-601418460);
                getHumanReadableName gethumanreadablename = (getHumanReadableName) getdnsokhttp.IAuthTabCallbackStub.onExtraCallbackWithResult();
                if (gethumanreadablename == null) {
                    int i8 = access000 + 75;
                    asBinder = i8 % 128;
                    int i9 = i8 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1643168787);
                    gethumanreadablename = (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted());
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1643167857);
                }
                getHumanReadableName gethumanreadablename2 = gethumanreadablename;
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                int i10 = access000 + 87;
                asBinder = i10 % 128;
                if (i10 % 2 != 0) {
                    obj2.hashCode();
                    throw null;
                }
                hasProvider hasprovider = (hasProvider) getdnsokhttp.onTransact().onExtraCallbackWithResult();
                if (hasprovider == null) {
                    hasprovider = new hasProvider("", (List) null, 2, (DefaultConstructorMarker) null);
                }
                long jIAuthTabCallback = ((AvoidCaptureProcessProgressAvailabilityCheckQuirk) getdnsokhttp.asInterface.onExtraCallbackWithResult()).IAuthTabCallback();
                if (AvoidCaptureProcessProgressAvailabilityCheckQuirk.IAuthTabCallback(jIAuthTabCallback) == 0) {
                    int i11 = asBinder + 27;
                    access000 = i11 % 128;
                    int i12 = i11 % 2;
                    jIAuthTabCallback = gethumanreadablename2.IAuthTabCallbackStub();
                }
                getEventListenerFactoryokhttp.onNavigationEvent(hasprovider, null, getHumanReadableName.onNavigationEvent(gethumanreadablename2, 0L, jIAuthTabCallback, (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777213, (Object) null), ((setByteOrder) getdnsokhttp.IAuthTabCallbackDefault().onExtraCallbackWithResult()).access100(), (GraphicDeviceInfo) getdnsokhttp.onNavigationEvent.onExtraCallbackWithResult(), ((setByteOrder) getdnsokhttp.onExtraCallback.onExtraCallbackWithResult()).access100(), null, null, null, (Function0) getdnsokhttp.onWarmupCompleted().onExtraCallbackWithResult(), null, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 15810);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i13 = access000 + 57;
                    asBinder = i13 % 128;
                    int i14 = i13 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws NoWhenBranchMatchedException {
        int i;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        Object obj;
        int i2;
        int i3;
        int i4;
        final getDnsokhttp getdnsokhttp = (getDnsokhttp) objArr[0];
        final areAllItemsEnabled areallitemsenabled = (areAllItemsEnabled) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(areallitemsenabled, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(-1552834137);
        if ((iIntValue & 6) == 0) {
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(areallitemsenabled)) {
                int i6 = asBinder + 23;
                access000 = i6 % 128;
                int i7 = i6 % 2;
                i4 = 2;
            } else {
                int i8 = asBinder + 9;
                access000 = i8 % 128;
                int i9 = i8 % 2;
                i4 = 4;
            }
            i = i4 | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getdnsokhttp)) {
                int i10 = access000 + 27;
                asBinder = i10 % 128;
                i3 = i10 % 2 != 0 ? 60 : 32;
            } else {
                i3 = 16;
            }
            i |= i3;
        }
        Object obj2 = null;
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(!((i & 19) == 18), i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            obj = null;
            i2 = iIntValue;
        } else {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i11 = access000 + 11;
                asBinder = i11 % 128;
                if (i11 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1552834137, i, -1, "im.toss.tds.view.compat.component.state.SelectorState.Content (SelectorState.kt:95)");
                    obj2.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1552834137, i, -1, "im.toss.tds.view.compat.component.state.SelectorState.Content (SelectorState.kt:95)");
            }
            hasProvider hasprovider = (hasProvider) getdnsokhttp.onTransact().onExtraCallbackWithResult();
            if (hasprovider == null) {
                hasprovider = new hasProvider("", (List) null, 2, (DefaultConstructorMarker) null);
            }
            hasProvider hasprovider2 = hasprovider;
            getHumanReadableName gethumanreadablename = (getHumanReadableName) getdnsokhttp.IAuthTabCallbackStub.onExtraCallbackWithResult();
            if (gethumanreadablename == null) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1919948754);
                gethumanreadablename = (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted());
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1919949684);
            }
            getHumanReadableName gethumanreadablename2 = gethumanreadablename;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            obj = null;
            i2 = iIntValue;
            areallitemsenabled.onNavigationEvent(hasprovider2, null, gethumanreadablename2, ((setByteOrder) getdnsokhttp.IAuthTabCallbackDefault().onExtraCallbackWithResult()).access100(), ((AvoidCaptureProcessProgressAvailabilityCheckQuirk) getdnsokhttp.asInterface.onExtraCallbackWithResult()).IAuthTabCallback(), ((setByteOrder) getdnsokhttp.onExtraCallback.onExtraCallbackWithResult()).access100(), (GraphicDeviceInfo) getdnsokhttp.onNavigationEvent.onExtraCallbackWithResult(), (Function0) getdnsokhttp.onWarmupCompleted().onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, (i << 24) & 234881024, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i12 = asBinder + 97;
                access000 = i12 % 128;
                int i13 = i12 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            final int i14 = i2;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.view.compat.component.state.SelectorState$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj3, Object obj4) {
                    int i15 = 2 % 2;
                    int i16 = IAuthTabCallback + 17;
                    onNavigationEvent = i16 % 128;
                    if (i16 % 2 != 0) {
                        Object obj5 = null;
                        obj5.hashCode();
                        throw null;
                    }
                    return (Unit) getDnsokhttp.onExtraCallback(-1779665426, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), new Object[]{this.f$0, areallitemsenabled, Integer.valueOf(i14), (CameraCaptureResultEmptyCameraCaptureResult) obj3, Integer.valueOf(((Integer) obj4).intValue())}, 1779665427, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult());
                }
            });
        }
        return obj;
    }

    public final void onWarmupCompleted(@NotNull final y1a y1aVar, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1aVar, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1552834137);
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(y1aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this)) {
                int i5 = asBinder + 81;
                access000 = i5 % 128;
                int i6 = i5 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            int i7 = access000 + 15;
            int i8 = i7 % 128;
            asBinder = i8;
            int i9 = i7 % 2;
            int i10 = i8 + 111;
            access000 = i10 % 128;
            int i11 = i10 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
            int i12 = asBinder + 77;
            access000 = i12 % 128;
            Object obj = null;
            if (i12 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i13 = access000 + 53;
                asBinder = i13 % 128;
                int i14 = i13 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1552834137, i2, -1, "im.toss.tds.view.compat.component.state.SelectorState.Content (SelectorState.kt:108)");
            }
            hasProvider hasprovider = (hasProvider) onTransact().onExtraCallbackWithResult();
            if (hasprovider == null) {
                hasprovider = new hasProvider("", (List) null, 2, (DefaultConstructorMarker) null);
            }
            hasProvider hasprovider2 = hasprovider;
            getHumanReadableName gethumanreadablename = (getHumanReadableName) this.IAuthTabCallbackStub.onExtraCallbackWithResult();
            if (gethumanreadablename == null) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1919948978);
                gethumanreadablename = (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted());
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1919949908);
            }
            getHumanReadableName gethumanreadablename2 = gethumanreadablename;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            y1aVar.onExtraCallback(hasprovider2, (QuirksExternalSyntheticBackport0) null, (Function0<Unit>) onWarmupCompleted().onExtraCallbackWithResult(), ((setByteOrder) this.onExtraCallback.onExtraCallbackWithResult()).access100(), gethumanreadablename2, ((setByteOrder) IAuthTabCallbackDefault().onExtraCallbackWithResult()).access100(), ((AvoidCaptureProcessProgressAvailabilityCheckQuirk) this.asInterface.onExtraCallbackWithResult()).IAuthTabCallback(), (GraphicDeviceInfo) this.onNavigationEvent.onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i2 << 24) & 234881024, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.view.compat.component.state.SelectorState$$ExternalSyntheticLambda1
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj2, Object obj3) {
                    int i15 = 2 % 2;
                    int i16 = onExtraCallbackWithResult + 115;
                    onNavigationEvent = i16 % 128;
                    int i17 = i16 % 2;
                    Unit unitIAuthTabCallback = getDnsokhttp.IAuthTabCallback(this.f$0, y1aVar, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i18 = onNavigationEvent + 95;
                    onExtraCallbackWithResult = i18 % 128;
                    if (i18 % 2 != 0) {
                        return unitIAuthTabCallback;
                    }
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
            });
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(getDnsokhttp getdnsokhttp, areAllItemsEnabled areallitemsenabled, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        return (Unit) onExtraCallback(-1779665426, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), new Object[]{getdnsokhttp, areallitemsenabled, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, 1779665427, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult());
    }

    public final void onExtraCallbackWithResult(@NotNull areAllItemsEnabled areallitemsenabled, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        onExtraCallback(-1791688305, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), new Object[]{this, areallitemsenabled, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, 1791688305, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult());
    }
}
