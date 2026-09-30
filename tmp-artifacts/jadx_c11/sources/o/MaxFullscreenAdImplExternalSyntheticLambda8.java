package o;

import im.toss.features.tosscert.ui.R;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.n0c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxFullscreenAdImplExternalSyntheticLambda8 {
    private static int onActivityResized = 1;
    private static int onMessageChannelReady;
    private final String IAuthTabCallback;
    private final Throwable IAuthTabCallbackDefault;
    private final hbExternalSyntheticLambda2 IAuthTabCallbackStub;
    private final hcExternalSyntheticLambda0 IAuthTabCallbackStubProxy;
    private final getAdViewTracker IAuthTabCallback_Parcel;
    private final n0c ICustomTabsCallback;
    private final r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos access000;
    private final String access100;
    private final o4 asBinder;
    private final n1a asInterface;
    private final MaxFullscreenAdImpl extraCallback;
    private final n1 extraCallbackWithResult;
    private final MaxFullscreenAdImpl getInterfaceDescriptor;
    private final hbExternalSyntheticLambda4 onExtraCallback;
    private final n3 onExtraCallbackWithResult;
    private final n6 onMinimized;
    private final boolean onNavigationEvent;
    private final n5 onPostMessage;
    private final n0c.onExtraCallbackWithResult onTransact;
    private final Map<String, String> onWarmupCompleted;
    private final MaxNativeAdImpl readTypedObject;
    private final r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos writeTypedObject;

    public MaxFullscreenAdImplExternalSyntheticLambda8() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 4194303, null);
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~(i7 | i2);
        int i9 = (~(i7 | i3)) | i8;
        int i10 = ~i2;
        int i11 = ~(i10 | i6);
        int i12 = i8 | i11 | (~(i10 | i3));
        int i13 = (~((~i3) | i10)) | i8 | i11;
        int i14 = i6 + i2 + i4 + ((-369695973) * i) + (1794320298 * i5);
        int i15 = i14 * i14;
        int i16 = ((-1820121865) * i6) + 1478230016 + (776760710 * i2) + ((-1698084721) * i9) + ((-1731255050) * i12) + (865627525 * i13) + ((-88866816) * i4) + (217841664 * i) + ((-410517504) * i5) + ((-175177728) * i15);
        int i17 = ((i6 * 1872133577) - 2052485254) + (i2 * 1872135674) + (i9 * 2097) + (i12 * (-1398)) + (i13 * 699) + (i4 * 1872134975) + (i * (-1328892763)) + (i5 * (-1296121642)) + (i15 * (-1691287552));
        int i18 = i16 + (i17 * i17 * (-1729036288));
        if (i18 == 1) {
            MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8 = (MaxFullscreenAdImplExternalSyntheticLambda8) objArr[0];
            int i19 = 2 % 2;
            int i20 = onActivityResized + 25;
            int i21 = i20 % 128;
            onMessageChannelReady = i21;
            int i22 = i20 % 2;
            n0c n0cVar = maxFullscreenAdImplExternalSyntheticLambda8.ICustomTabsCallback;
            int i23 = i21 + 61;
            onActivityResized = i23 % 128;
            int i24 = i23 % 2;
            return n0cVar;
        }
        if (i18 == 2) {
            return onNavigationEvent(objArr);
        }
        if (i18 != 3) {
            return onExtraCallbackWithResult(objArr);
        }
        MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda82 = (MaxFullscreenAdImplExternalSyntheticLambda8) objArr[0];
        int i25 = 2 % 2;
        int i26 = onMessageChannelReady;
        int i27 = i26 + 29;
        onActivityResized = i27 % 128;
        int i28 = i27 % 2;
        MaxFullscreenAdImpl maxFullscreenAdImpl = maxFullscreenAdImplExternalSyntheticLambda82.getInterfaceDescriptor;
        int i29 = i26 + 1;
        onActivityResized = i29 % 128;
        int i30 = i29 % 2;
        return maxFullscreenAdImpl;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        n6 n6Var;
        MaxNativeAdImpl maxNativeAdImpl;
        n1a n1aVar;
        hbExternalSyntheticLambda2 hbexternalsyntheticlambda2;
        hbExternalSyntheticLambda4 hbexternalsyntheticlambda4;
        boolean z;
        n0c.onExtraCallbackWithResult onextracallbackwithresult;
        MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8 = (MaxFullscreenAdImplExternalSyntheticLambda8) objArr[0];
        String str = (String) objArr[1];
        hcExternalSyntheticLambda0 hcexternalsyntheticlambda0 = (hcExternalSyntheticLambda0) objArr[2];
        String str2 = (String) objArr[3];
        Map<String, String> map = (Map) objArr[4];
        getAdViewTracker getadviewtracker = (getAdViewTracker) objArr[5];
        n6 n6Var2 = (n6) objArr[6];
        MaxNativeAdImpl maxNativeAdImpl2 = (MaxNativeAdImpl) objArr[7];
        n0c n0cVar = (n0c) objArr[8];
        Throwable th = (Throwable) objArr[9];
        n1a n1aVar2 = (n1a) objArr[10];
        n1 n1Var = (n1) objArr[11];
        hbExternalSyntheticLambda2 hbexternalsyntheticlambda22 = (hbExternalSyntheticLambda2) objArr[12];
        hbExternalSyntheticLambda4 hbexternalsyntheticlambda42 = (hbExternalSyntheticLambda4) objArr[13];
        n5 n5Var = (n5) objArr[14];
        n3 n3Var = (n3) objArr[15];
        MaxFullscreenAdImpl maxFullscreenAdImpl = (MaxFullscreenAdImpl) objArr[16];
        MaxFullscreenAdImpl maxFullscreenAdImpl2 = (MaxFullscreenAdImpl) objArr[17];
        r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yos = (r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos) objArr[18];
        r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yos2 = (r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos) objArr[19];
        n0c.onExtraCallbackWithResult onextracallbackwithresult2 = (n0c.onExtraCallbackWithResult) objArr[20];
        o4 o4Var = (o4) objArr[21];
        boolean zBooleanValue = ((Boolean) objArr[22]).booleanValue();
        int iIntValue = ((Number) objArr[23]).intValue();
        Object obj = objArr[24];
        int i = 2 % 2;
        if ((iIntValue & 1) != 0) {
            str = maxFullscreenAdImplExternalSyntheticLambda8.access100;
        }
        if ((iIntValue & 2) != 0) {
            hcexternalsyntheticlambda0 = maxFullscreenAdImplExternalSyntheticLambda8.IAuthTabCallbackStubProxy;
        }
        if ((iIntValue & 4) != 0) {
            str2 = maxFullscreenAdImplExternalSyntheticLambda8.IAuthTabCallback;
        }
        if ((iIntValue & 8) != 0) {
            map = maxFullscreenAdImplExternalSyntheticLambda8.onWarmupCompleted;
        }
        if ((iIntValue & 16) != 0) {
            getadviewtracker = maxFullscreenAdImplExternalSyntheticLambda8.IAuthTabCallback_Parcel;
        }
        if ((iIntValue & 32) != 0) {
            int i2 = onActivityResized + 101;
            onMessageChannelReady = i2 % 128;
            int i3 = i2 % 2;
            n6Var = maxFullscreenAdImplExternalSyntheticLambda8.onMinimized;
        } else {
            n6Var = n6Var2;
        }
        if ((iIntValue & 64) != 0) {
            int i4 = onMessageChannelReady + 95;
            onActivityResized = i4 % 128;
            int i5 = i4 % 2;
            maxNativeAdImpl = maxFullscreenAdImplExternalSyntheticLambda8.readTypedObject;
        } else {
            maxNativeAdImpl = maxNativeAdImpl2;
        }
        n0c n0cVar2 = (iIntValue & 128) != 0 ? maxFullscreenAdImplExternalSyntheticLambda8.ICustomTabsCallback : n0cVar;
        Throwable th2 = (iIntValue & 256) != 0 ? maxFullscreenAdImplExternalSyntheticLambda8.IAuthTabCallbackDefault : th;
        if ((iIntValue & 512) != 0) {
            int i6 = onMessageChannelReady + 101;
            onActivityResized = i6 % 128;
            int i7 = i6 % 2;
            n1aVar = maxFullscreenAdImplExternalSyntheticLambda8.asInterface;
        } else {
            n1aVar = n1aVar2;
        }
        n1 n1Var2 = (iIntValue & 1024) != 0 ? maxFullscreenAdImplExternalSyntheticLambda8.extraCallbackWithResult : n1Var;
        if ((iIntValue & 2048) != 0) {
            int i8 = onMessageChannelReady + 107;
            onActivityResized = i8 % 128;
            int i9 = i8 % 2;
            hbexternalsyntheticlambda2 = maxFullscreenAdImplExternalSyntheticLambda8.IAuthTabCallbackStub;
        } else {
            hbexternalsyntheticlambda2 = hbexternalsyntheticlambda22;
        }
        hbExternalSyntheticLambda4 hbexternalsyntheticlambda43 = (iIntValue & 4096) != 0 ? maxFullscreenAdImplExternalSyntheticLambda8.onExtraCallback : hbexternalsyntheticlambda42;
        if ((iIntValue & 8192) != 0) {
            n5Var = maxFullscreenAdImplExternalSyntheticLambda8.onPostMessage;
        }
        if ((iIntValue & 16384) != 0) {
            n3Var = maxFullscreenAdImplExternalSyntheticLambda8.onExtraCallbackWithResult;
        }
        if ((32768 & iIntValue) != 0) {
            int i10 = onMessageChannelReady + 89;
            hbexternalsyntheticlambda4 = hbexternalsyntheticlambda43;
            onActivityResized = i10 % 128;
            int i11 = i10 % 2;
            maxFullscreenAdImpl = maxFullscreenAdImplExternalSyntheticLambda8.extraCallback;
        } else {
            hbexternalsyntheticlambda4 = hbexternalsyntheticlambda43;
        }
        if ((65536 & iIntValue) != 0) {
            int i12 = onMessageChannelReady + 1;
            onActivityResized = i12 % 128;
            int i13 = i12 % 2;
            maxFullscreenAdImpl2 = maxFullscreenAdImplExternalSyntheticLambda8.getInterfaceDescriptor;
        }
        if ((131072 & iIntValue) != 0) {
            r8lambdadtqrzfihm2ghoddvkfg5vm2yos = maxFullscreenAdImplExternalSyntheticLambda8.writeTypedObject;
        }
        if ((262144 & iIntValue) != 0) {
            r8lambdadtqrzfihm2ghoddvkfg5vm2yos2 = maxFullscreenAdImplExternalSyntheticLambda8.access000;
        }
        if ((524288 & iIntValue) != 0) {
            int i14 = onMessageChannelReady + 125;
            onActivityResized = i14 % 128;
            if (i14 % 2 == 0) {
                onextracallbackwithresult = maxFullscreenAdImplExternalSyntheticLambda8.onTransact;
                int i15 = 74 / 0;
            } else {
                onextracallbackwithresult = maxFullscreenAdImplExternalSyntheticLambda8.onTransact;
            }
            onextracallbackwithresult2 = onextracallbackwithresult;
        }
        if ((1048576 & iIntValue) != 0) {
            int i16 = onMessageChannelReady + 57;
            onActivityResized = i16 % 128;
            int i17 = i16 % 2;
            o4Var = maxFullscreenAdImplExternalSyntheticLambda8.asBinder;
        }
        if ((iIntValue & 2097152) != 0) {
            z = maxFullscreenAdImplExternalSyntheticLambda8.onNavigationEvent;
            int i18 = onActivityResized + 73;
            onMessageChannelReady = i18 % 128;
            int i19 = i18 % 2;
        } else {
            z = zBooleanValue;
        }
        return maxFullscreenAdImplExternalSyntheticLambda8.IAuthTabCallback(str, hcexternalsyntheticlambda0, str2, map, getadviewtracker, n6Var, maxNativeAdImpl, n0cVar2, th2, n1aVar, n1Var2, hbexternalsyntheticlambda2, hbexternalsyntheticlambda4, n5Var, n3Var, maxFullscreenAdImpl, maxFullscreenAdImpl2, r8lambdadtqrzfihm2ghoddvkfg5vm2yos, r8lambdadtqrzfihm2ghoddvkfg5vm2yos2, onextracallbackwithresult2, o4Var, z);
    }

    public final MaxFullscreenAdImplExternalSyntheticLambda8 IAuthTabCallback(@Nullable String str, @Nullable hcExternalSyntheticLambda0 hcexternalsyntheticlambda0, @Nullable String str2, @NotNull Map<String, String> map, @Nullable getAdViewTracker getadviewtracker, @Nullable n6 n6Var, @Nullable MaxNativeAdImpl maxNativeAdImpl, @Nullable n0c n0cVar, @Nullable Throwable th, @Nullable n1a n1aVar, @Nullable n1 n1Var, @Nullable hbExternalSyntheticLambda2 hbexternalsyntheticlambda2, @Nullable hbExternalSyntheticLambda4 hbexternalsyntheticlambda4, @NotNull n5 n5Var, @Nullable n3 n3Var, @Nullable MaxFullscreenAdImpl maxFullscreenAdImpl, @Nullable MaxFullscreenAdImpl maxFullscreenAdImpl2, @Nullable r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yos, @Nullable r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yos2, @Nullable n0c.onExtraCallbackWithResult onextracallbackwithresult, @Nullable o4 o4Var, boolean z) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(n5Var, "");
        MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8 = new MaxFullscreenAdImplExternalSyntheticLambda8(str, hcexternalsyntheticlambda0, str2, map, getadviewtracker, n6Var, maxNativeAdImpl, n0cVar, th, n1aVar, n1Var, hbexternalsyntheticlambda2, hbexternalsyntheticlambda4, n5Var, n3Var, maxFullscreenAdImpl, maxFullscreenAdImpl2, r8lambdadtqrzfihm2ghoddvkfg5vm2yos, r8lambdadtqrzfihm2ghoddvkfg5vm2yos2, onextracallbackwithresult, o4Var, z);
        int i2 = onMessageChannelReady + 87;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            return maxFullscreenAdImplExternalSyntheticLambda8;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MaxFullscreenAdImplExternalSyntheticLambda8)) {
            int i2 = onActivityResized + 93;
            onMessageChannelReady = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8 = (MaxFullscreenAdImplExternalSyntheticLambda8) obj;
        if (!Intrinsics.areEqual(this.access100, maxFullscreenAdImplExternalSyntheticLambda8.access100) || !Intrinsics.areEqual(this.IAuthTabCallbackStubProxy, maxFullscreenAdImplExternalSyntheticLambda8.IAuthTabCallbackStubProxy)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallback, maxFullscreenAdImplExternalSyntheticLambda8.IAuthTabCallback)) {
            int i4 = onActivityResized + 1;
            onMessageChannelReady = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onWarmupCompleted, maxFullscreenAdImplExternalSyntheticLambda8.onWarmupCompleted) || !Intrinsics.areEqual(this.IAuthTabCallback_Parcel, maxFullscreenAdImplExternalSyntheticLambda8.IAuthTabCallback_Parcel)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onMinimized, maxFullscreenAdImplExternalSyntheticLambda8.onMinimized)) {
            int i6 = onActivityResized + 45;
            onMessageChannelReady = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.readTypedObject, maxFullscreenAdImplExternalSyntheticLambda8.readTypedObject) || !Intrinsics.areEqual(this.ICustomTabsCallback, maxFullscreenAdImplExternalSyntheticLambda8.ICustomTabsCallback) || !Intrinsics.areEqual(this.IAuthTabCallbackDefault, maxFullscreenAdImplExternalSyntheticLambda8.IAuthTabCallbackDefault)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.asInterface, maxFullscreenAdImplExternalSyntheticLambda8.asInterface)) {
            int i8 = onActivityResized + 61;
            onMessageChannelReady = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.extraCallbackWithResult, maxFullscreenAdImplExternalSyntheticLambda8.extraCallbackWithResult) || !Intrinsics.areEqual(this.IAuthTabCallbackStub, maxFullscreenAdImplExternalSyntheticLambda8.IAuthTabCallbackStub)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallback, maxFullscreenAdImplExternalSyntheticLambda8.onExtraCallback)) {
            int i10 = onMessageChannelReady + 83;
            onActivityResized = i10 % 128;
            return i10 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.onPostMessage, maxFullscreenAdImplExternalSyntheticLambda8.onPostMessage)) {
            int i11 = onMessageChannelReady + 7;
            onActivityResized = i11 % 128;
            return i11 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, maxFullscreenAdImplExternalSyntheticLambda8.onExtraCallbackWithResult)) {
            int i12 = onMessageChannelReady + 67;
            onActivityResized = i12 % 128;
            return i12 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.extraCallback, maxFullscreenAdImplExternalSyntheticLambda8.extraCallback) || !Intrinsics.areEqual(this.getInterfaceDescriptor, maxFullscreenAdImplExternalSyntheticLambda8.getInterfaceDescriptor)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.writeTypedObject, maxFullscreenAdImplExternalSyntheticLambda8.writeTypedObject)) {
            int i13 = onActivityResized + 109;
            onMessageChannelReady = i13 % 128;
            int i14 = i13 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.access000, maxFullscreenAdImplExternalSyntheticLambda8.access000)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onTransact, maxFullscreenAdImplExternalSyntheticLambda8.onTransact)) {
            int i15 = onActivityResized + 7;
            onMessageChannelReady = i15 % 128;
            int i16 = i15 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.asBinder, maxFullscreenAdImplExternalSyntheticLambda8.asBinder)) {
            return false;
        }
        if (this.onNavigationEvent == maxFullscreenAdImplExternalSyntheticLambda8.onNavigationEvent) {
            return true;
        }
        int i17 = onMessageChannelReady + 87;
        onActivityResized = i17 % 128;
        return i17 % 2 == 0;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int i;
        int iHashCode5;
        int i2;
        int i3;
        int i4;
        int iHashCode6;
        int i5 = 2 % 2;
        String str = this.access100;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        hcExternalSyntheticLambda0 hcexternalsyntheticlambda0 = this.IAuthTabCallbackStubProxy;
        int iHashCode8 = hcexternalsyntheticlambda0 == null ? 0 : hcexternalsyntheticlambda0.hashCode();
        String str2 = this.IAuthTabCallback;
        int iHashCode9 = str2 == null ? 0 : str2.hashCode();
        int iHashCode10 = this.onWarmupCompleted.hashCode();
        getAdViewTracker getadviewtracker = this.IAuthTabCallback_Parcel;
        int iHashCode11 = getadviewtracker == null ? 0 : getadviewtracker.hashCode();
        n6 n6Var = this.onMinimized;
        int iHashCode12 = n6Var == null ? 0 : n6Var.hashCode();
        MaxNativeAdImpl maxNativeAdImpl = this.readTypedObject;
        if (maxNativeAdImpl == null) {
            int i6 = onMessageChannelReady + 53;
            onActivityResized = i6 % 128;
            int i7 = i6 % 2;
            iHashCode = 0;
        } else {
            iHashCode = maxNativeAdImpl.hashCode();
        }
        n0c n0cVar = this.ICustomTabsCallback;
        int iHashCode13 = 1;
        if (n0cVar == null) {
            int i8 = onMessageChannelReady + 29;
            onActivityResized = i8 % 128;
            iHashCode2 = i8 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode2 = n0cVar.hashCode();
        }
        Throwable th = this.IAuthTabCallbackDefault;
        if (th == null) {
            int i9 = onActivityResized + 81;
            onMessageChannelReady = i9 % 128;
            int i10 = i9 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = th.hashCode();
        }
        n1a n1aVar = this.asInterface;
        if (n1aVar == null) {
            int i11 = onMessageChannelReady + 3;
            onActivityResized = i11 % 128;
            int i12 = i11 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = n1aVar.hashCode();
        }
        n1 n1Var = this.extraCallbackWithResult;
        int iHashCode14 = n1Var == null ? 0 : n1Var.hashCode();
        hbExternalSyntheticLambda2 hbexternalsyntheticlambda2 = this.IAuthTabCallbackStub;
        if (hbexternalsyntheticlambda2 == null) {
            int i13 = onMessageChannelReady + 109;
            onActivityResized = i13 % 128;
            if (i13 % 2 != 0) {
                iHashCode13 = 0;
            }
        } else {
            iHashCode13 = hbexternalsyntheticlambda2.hashCode();
        }
        hbExternalSyntheticLambda4 hbexternalsyntheticlambda4 = this.onExtraCallback;
        int iHashCode15 = hbexternalsyntheticlambda4 == null ? 0 : hbexternalsyntheticlambda4.hashCode();
        int iHashCode16 = this.onPostMessage.hashCode();
        n3 n3Var = this.onExtraCallbackWithResult;
        if (n3Var == null) {
            int i14 = onActivityResized + 113;
            i = iHashCode16;
            onMessageChannelReady = i14 % 128;
            int i15 = i14 % 2;
            iHashCode5 = 0;
        } else {
            i = iHashCode16;
            iHashCode5 = n3Var.hashCode();
        }
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.extraCallback;
        int iHashCode17 = maxFullscreenAdImpl == null ? 0 : maxFullscreenAdImpl.hashCode();
        MaxFullscreenAdImpl maxFullscreenAdImpl2 = this.getInterfaceDescriptor;
        int iHashCode18 = maxFullscreenAdImpl2 == null ? 0 : maxFullscreenAdImpl2.hashCode();
        r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yos = this.writeTypedObject;
        int iHashCode19 = r8lambdadtqrzfihm2ghoddvkfg5vm2yos == null ? 0 : r8lambdadtqrzfihm2ghoddvkfg5vm2yos.hashCode();
        r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yos2 = this.access000;
        if (r8lambdadtqrzfihm2ghoddvkfg5vm2yos2 == null) {
            i2 = iHashCode5;
            i3 = 0;
        } else {
            int iHashCode20 = r8lambdadtqrzfihm2ghoddvkfg5vm2yos2.hashCode();
            int i16 = onActivityResized + 113;
            i2 = iHashCode5;
            onMessageChannelReady = i16 % 128;
            int i17 = i16 % 2;
            i3 = iHashCode20;
        }
        n0c.onExtraCallbackWithResult onextracallbackwithresult = this.onTransact;
        int iHashCode21 = onextracallbackwithresult == null ? 0 : onextracallbackwithresult.hashCode();
        o4 o4Var = this.asBinder;
        if (o4Var != null) {
            int i18 = onActivityResized + 71;
            i4 = i3;
            onMessageChannelReady = i18 % 128;
            int i19 = i18 % 2;
            iHashCode6 = o4Var.hashCode();
        } else {
            i4 = i3;
            iHashCode6 = 0;
        }
        return (((((((((((((((((((((((((((((((((((((((((iHashCode7 * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode14) * 31) + iHashCode13) * 31) + iHashCode15) * 31) + i) * 31) + i2) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + i4) * 31) + iHashCode21) * 31) + iHashCode6) * 31) + Boolean.hashCode(this.onNavigationEvent);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TossReactNativeFragmentRuntimeState(requestedImportLazyServiceBundleName=" + this.access100 + ", requestedServiceBundleImportLazyParams=" + this.IAuthTabCallbackStubProxy + ", embeddedRnPresentUrl=" + this.IAuthTabCallback + ", embeddedRnPresentRouteParameters=" + this.onWarmupCompleted + ", serviceBundleImportLazyResult=" + this.IAuthTabCallback_Parcel + ", warmupRequest=" + this.onMinimized + ", sharedBundleLoadRequest=" + this.readTypedObject + ", sharedBundleLoadResult=" + this.ICustomTabsCallback + ", reactHostStartFailure=" + this.IAuthTabCallbackDefault + ", lastWarmupEvent=" + this.asInterface + ", warmupFailureState=" + this.extraCallbackWithResult + ", lastPreHideLifecycleEvent=" + this.IAuthTabCallbackStub + ", lastPostShowLifecycleEvent=" + this.onExtraCallback + ", warmupState=" + this.onPostMessage + ", activeWarmupPolicy=" + this.onExtraCallbackWithResult + ", sharedBundleState=" + this.extraCallback + ", serviceBundleState=" + this.getInterfaceDescriptor + ", sharedBundleInfo=" + this.writeTypedObject + ", serviceBundleInfo=" + this.access000 + ", loadedSharedBundleForInternalHost=" + this.onTransact + ", preloadedServiceBundle=" + this.asBinder + ", internalReactSurfaceStarted=" + this.onNavigationEvent + ")";
        int i2 = onMessageChannelReady + 43;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public MaxFullscreenAdImplExternalSyntheticLambda8(@Nullable String str, @Nullable hcExternalSyntheticLambda0 hcexternalsyntheticlambda0, @Nullable String str2, @NotNull Map<String, String> map, @Nullable getAdViewTracker getadviewtracker, @Nullable n6 n6Var, @Nullable MaxNativeAdImpl maxNativeAdImpl, @Nullable n0c n0cVar, @Nullable Throwable th, @Nullable n1a n1aVar, @Nullable n1 n1Var, @Nullable hbExternalSyntheticLambda2 hbexternalsyntheticlambda2, @Nullable hbExternalSyntheticLambda4 hbexternalsyntheticlambda4, @NotNull n5 n5Var, @Nullable n3 n3Var, @Nullable MaxFullscreenAdImpl maxFullscreenAdImpl, @Nullable MaxFullscreenAdImpl maxFullscreenAdImpl2, @Nullable r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yos, @Nullable r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yos2, @Nullable n0c.onExtraCallbackWithResult onextracallbackwithresult, @Nullable o4 o4Var, boolean z) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(n5Var, "");
        this.access100 = str;
        this.IAuthTabCallbackStubProxy = hcexternalsyntheticlambda0;
        this.IAuthTabCallback = str2;
        this.onWarmupCompleted = map;
        this.IAuthTabCallback_Parcel = getadviewtracker;
        this.onMinimized = n6Var;
        this.readTypedObject = maxNativeAdImpl;
        this.ICustomTabsCallback = n0cVar;
        this.IAuthTabCallbackDefault = th;
        this.asInterface = n1aVar;
        this.extraCallbackWithResult = n1Var;
        this.IAuthTabCallbackStub = hbexternalsyntheticlambda2;
        this.onExtraCallback = hbexternalsyntheticlambda4;
        this.onPostMessage = n5Var;
        this.onExtraCallbackWithResult = n3Var;
        this.extraCallback = maxFullscreenAdImpl;
        this.getInterfaceDescriptor = maxFullscreenAdImpl2;
        this.writeTypedObject = r8lambdadtqrzfihm2ghoddvkfg5vm2yos;
        this.access000 = r8lambdadtqrzfihm2ghoddvkfg5vm2yos2;
        this.onTransact = onextracallbackwithresult;
        this.asBinder = o4Var;
        this.onNavigationEvent = z;
    }

    public final String IAuthTabCallbackDefault() {
        String str;
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 45;
        int i3 = i2 % 128;
        onActivityResized = i3;
        if (i2 % 2 == 0) {
            str = this.access100;
            int i4 = 99 / 0;
        } else {
            str = this.access100;
        }
        int i5 = i3 + 21;
        onMessageChannelReady = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final hcExternalSyntheticLambda0 asInterface() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady;
        int i3 = i2 + 77;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        hcExternalSyntheticLambda0 hcexternalsyntheticlambda0 = this.IAuthTabCallbackStubProxy;
        int i5 = i2 + 53;
        onActivityResized = i5 % 128;
        if (i5 % 2 != 0) {
            return hcexternalsyntheticlambda0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onActivityResized;
        int i3 = i2 + 91;
        onMessageChannelReady = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.IAuthTabCallback;
        int i4 = i2 + 123;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MaxFullscreenAdImplExternalSyntheticLambda8(String str, hcExternalSyntheticLambda0 hcexternalsyntheticlambda0, String str2, Map map, getAdViewTracker getadviewtracker, n6 n6Var, MaxNativeAdImpl maxNativeAdImpl, n0c n0cVar, Throwable th, n1a n1aVar, n1 n1Var, hbExternalSyntheticLambda2 hbexternalsyntheticlambda2, hbExternalSyntheticLambda4 hbexternalsyntheticlambda4, n5 n5Var, n3 n3Var, MaxFullscreenAdImpl maxFullscreenAdImpl, MaxFullscreenAdImpl maxFullscreenAdImpl2, r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yos, r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yos2, n0c.onExtraCallbackWithResult onextracallbackwithresult, o4 o4Var, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        hcExternalSyntheticLambda0 hcexternalsyntheticlambda02;
        String str3;
        Map mapOnNavigationEvent;
        MaxNativeAdImpl maxNativeAdImpl2;
        n1a n1aVar2;
        hbExternalSyntheticLambda4 hbexternalsyntheticlambda42;
        hbExternalSyntheticLambda4 hbexternalsyntheticlambda43;
        n5 n5VarAsBinder;
        n3 n3Var2;
        r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yos3;
        r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yos4;
        int i2;
        r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yos5;
        o4 o4Var2;
        Object obj = null;
        String str4 = (i & 1) != 0 ? null : str;
        if ((i & 2) != 0) {
            int i3 = onActivityResized + 65;
            onMessageChannelReady = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            hcexternalsyntheticlambda02 = null;
        } else {
            hcexternalsyntheticlambda02 = hcexternalsyntheticlambda0;
        }
        if ((i & 4) != 0) {
            int i4 = 2 % 2;
            str3 = null;
        } else {
            str3 = str2;
        }
        if ((i & 8) != 0) {
            int i5 = onMessageChannelReady + 117;
            onActivityResized = i5 % 128;
            if (i5 % 2 == 0) {
                access8100.onNavigationEvent();
                obj.hashCode();
                throw null;
            }
            mapOnNavigationEvent = access8100.onNavigationEvent();
        } else {
            mapOnNavigationEvent = map;
        }
        getAdViewTracker getadviewtracker2 = (i & 16) != 0 ? null : getadviewtracker;
        n6 n6Var2 = (i & 32) != 0 ? null : n6Var;
        if ((i & 64) != 0) {
            int i6 = onMessageChannelReady + 63;
            onActivityResized = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 1 / 0;
            }
            maxNativeAdImpl2 = null;
        } else {
            maxNativeAdImpl2 = maxNativeAdImpl;
        }
        n0c n0cVar2 = (i & 128) != 0 ? null : n0cVar;
        Throwable th2 = (i & 256) != 0 ? null : th;
        if ((i & 512) != 0) {
            int i8 = onMessageChannelReady + 117;
            onActivityResized = i8 % 128;
            int i9 = i8 % 2;
            n1aVar2 = null;
        } else {
            n1aVar2 = n1aVar;
        }
        n1 n1Var2 = (i & 1024) != 0 ? null : n1Var;
        hbExternalSyntheticLambda2 hbexternalsyntheticlambda22 = (i & 2048) != 0 ? null : hbexternalsyntheticlambda2;
        if ((i & 4096) != 0) {
            int i10 = onMessageChannelReady + 79;
            onActivityResized = i10 % 128;
            Object obj2 = null;
            if (i10 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            hbexternalsyntheticlambda42 = null;
        } else {
            hbexternalsyntheticlambda42 = hbexternalsyntheticlambda4;
        }
        if ((i & 8192) != 0) {
            int i11 = onActivityResized + 19;
            hbexternalsyntheticlambda43 = hbexternalsyntheticlambda42;
            onMessageChannelReady = i11 % 128;
            int i12 = i11 % 2;
            n5VarAsBinder = n3.Companion.onWarmupCompleted().asBinder();
        } else {
            hbexternalsyntheticlambda43 = hbexternalsyntheticlambda42;
            n5VarAsBinder = n5Var;
        }
        n3 n3Var3 = (i & 16384) != 0 ? null : n3Var;
        MaxFullscreenAdImpl maxFullscreenAdImpl3 = (i & 32768) != 0 ? null : maxFullscreenAdImpl;
        MaxFullscreenAdImpl maxFullscreenAdImpl4 = (i & 65536) != 0 ? null : maxFullscreenAdImpl2;
        if ((i & 131072) != 0) {
            int i13 = onActivityResized + 69;
            n3Var2 = n3Var3;
            onMessageChannelReady = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 2 % 2;
            }
            r8lambdadtqrzfihm2ghoddvkfg5vm2yos3 = null;
        } else {
            n3Var2 = n3Var3;
            r8lambdadtqrzfihm2ghoddvkfg5vm2yos3 = r8lambdadtqrzfihm2ghoddvkfg5vm2yos;
        }
        if ((262144 & i) != 0) {
            int i15 = onActivityResized + 79;
            r8lambdadtqrzfihm2ghoddvkfg5vm2yos4 = r8lambdadtqrzfihm2ghoddvkfg5vm2yos3;
            onMessageChannelReady = i15 % 128;
            i2 = 2;
            int i16 = i15 % 2;
            int i17 = 2 % 2;
            r8lambdadtqrzfihm2ghoddvkfg5vm2yos5 = null;
        } else {
            r8lambdadtqrzfihm2ghoddvkfg5vm2yos4 = r8lambdadtqrzfihm2ghoddvkfg5vm2yos3;
            i2 = 2;
            r8lambdadtqrzfihm2ghoddvkfg5vm2yos5 = r8lambdadtqrzfihm2ghoddvkfg5vm2yos2;
        }
        n0c.onExtraCallbackWithResult onextracallbackwithresult2 = (i & 524288) != 0 ? null : onextracallbackwithresult;
        if ((i & 1048576) != 0) {
            int i18 = i2 % i2;
            o4Var2 = null;
        } else {
            o4Var2 = o4Var;
        }
        this(str4, hcexternalsyntheticlambda02, str3, mapOnNavigationEvent, getadviewtracker2, n6Var2, maxNativeAdImpl2, n0cVar2, th2, n1aVar2, n1Var2, hbexternalsyntheticlambda22, hbexternalsyntheticlambda43, n5VarAsBinder, n3Var2, maxFullscreenAdImpl3, maxFullscreenAdImpl4, r8lambdadtqrzfihm2ghoddvkfg5vm2yos4, r8lambdadtqrzfihm2ghoddvkfg5vm2yos5, onextracallbackwithresult2, o4Var2, (i & 2097152) != 0 ? false : z);
    }

    public final getAdViewTracker IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady;
        int i3 = i2 + 41;
        onActivityResized = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        getAdViewTracker getadviewtracker = this.IAuthTabCallback_Parcel;
        int i4 = i2 + 31;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 10 / 0;
        }
        return getadviewtracker;
    }

    public final n6 ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 105;
        int i3 = i2 % 128;
        onActivityResized = i3;
        int i4 = i2 % 2;
        n6 n6Var = this.onMinimized;
        int i5 = i3 + 53;
        onMessageChannelReady = i5 % 128;
        int i6 = i5 % 2;
        return n6Var;
    }

    public final MaxNativeAdImpl IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onActivityResized + 89;
        int i3 = i2 % 128;
        onMessageChannelReady = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        MaxNativeAdImpl maxNativeAdImpl = this.readTypedObject;
        int i4 = i3 + 45;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 82 / 0;
        }
        return maxNativeAdImpl;
    }

    public final Throwable asBinder() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 69;
        int i3 = i2 % 128;
        onActivityResized = i3;
        int i4 = i2 % 2;
        Throwable th = this.IAuthTabCallbackDefault;
        int i5 = i3 + 101;
        onMessageChannelReady = i5 % 128;
        int i6 = i5 % 2;
        return th;
    }

    public final n1a IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onActivityResized;
        int i3 = i2 + 93;
        onMessageChannelReady = i3 % 128;
        int i4 = i3 % 2;
        n1a n1aVar = this.asInterface;
        int i5 = i2 + 123;
        onMessageChannelReady = i5 % 128;
        int i6 = i5 % 2;
        return n1aVar;
    }

    public final n1 extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 119;
        int i3 = i2 % 128;
        onActivityResized = i3;
        int i4 = i2 % 2;
        n1 n1Var = this.extraCallbackWithResult;
        int i5 = i3 + 23;
        onMessageChannelReady = i5 % 128;
        if (i5 % 2 == 0) {
            return n1Var;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final n5 readTypedObject() {
        int i = 2 % 2;
        int i2 = onActivityResized + 111;
        int i3 = i2 % 128;
        onMessageChannelReady = i3;
        int i4 = i2 % 2;
        n5 n5Var = this.onPostMessage;
        int i5 = i3 + 109;
        onActivityResized = i5 % 128;
        int i6 = i5 % 2;
        return n5Var;
    }

    public final n3 onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 93;
        int i3 = i2 % 128;
        onActivityResized = i3;
        int i4 = i2 % 2;
        n3 n3Var = this.onExtraCallbackWithResult;
        int i5 = i3 + 27;
        onMessageChannelReady = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 23 / 0;
        }
        return n3Var;
    }

    public final MaxFullscreenAdImpl writeTypedObject() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady;
        int i3 = i2 + 81;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.extraCallback;
        int i5 = i2 + 19;
        onActivityResized = i5 % 128;
        if (i5 % 2 != 0) {
            return maxFullscreenAdImpl;
        }
        throw null;
    }

    public final r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos access100() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady;
        int i3 = i2 + 25;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yos = this.writeTypedObject;
        int i5 = i2 + 89;
        onActivityResized = i5 % 128;
        int i6 = i5 % 2;
        return r8lambdadtqrzfihm2ghoddvkfg5vm2yos;
    }

    public final r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onActivityResized;
        int i3 = i2 + 53;
        onMessageChannelReady = i3 % 128;
        int i4 = i3 % 2;
        r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yos = this.access000;
        int i5 = i2 + 85;
        onMessageChannelReady = i5 % 128;
        int i6 = i5 % 2;
        return r8lambdadtqrzfihm2ghoddvkfg5vm2yos;
    }

    public final n0c.onExtraCallbackWithResult onExtraCallback() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady;
        int i3 = i2 + 37;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        n0c.onExtraCallbackWithResult onextracallbackwithresult = this.onTransact;
        int i5 = i2 + 107;
        onActivityResized = i5 % 128;
        if (i5 % 2 != 0) {
            return onextracallbackwithresult;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8 = (MaxFullscreenAdImplExternalSyntheticLambda8) objArr[0];
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 93;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        o4 o4Var = maxFullscreenAdImplExternalSyntheticLambda8.asBinder;
        if (i3 != 0) {
            return o4Var;
        }
        throw null;
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onActivityResized + 47;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ MaxFullscreenAdImplExternalSyntheticLambda8 IAuthTabCallback(MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8, String str, hcExternalSyntheticLambda0 hcexternalsyntheticlambda0, String str2, Map map, getAdViewTracker getadviewtracker, n6 n6Var, MaxNativeAdImpl maxNativeAdImpl, n0c n0cVar, Throwable th, n1a n1aVar, n1 n1Var, hbExternalSyntheticLambda2 hbexternalsyntheticlambda2, hbExternalSyntheticLambda4 hbexternalsyntheticlambda4, n5 n5Var, n3 n3Var, MaxFullscreenAdImpl maxFullscreenAdImpl, MaxFullscreenAdImpl maxFullscreenAdImpl2, r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yos, r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yos2, n0c.onExtraCallbackWithResult onextracallbackwithresult, o4 o4Var, boolean z, int i, Object obj) {
        Object[] objArr = {maxFullscreenAdImplExternalSyntheticLambda8, str, hcexternalsyntheticlambda0, str2, map, getadviewtracker, n6Var, maxNativeAdImpl, n0cVar, th, n1aVar, n1Var, hbexternalsyntheticlambda2, hbexternalsyntheticlambda4, n5Var, n3Var, maxFullscreenAdImpl, maxFullscreenAdImpl2, r8lambdadtqrzfihm2ghoddvkfg5vm2yos, r8lambdadtqrzfihm2ghoddvkfg5vm2yos2, onextracallbackwithresult, o4Var, Boolean.valueOf(z), Integer.valueOf(i), obj};
        return (MaxFullscreenAdImplExternalSyntheticLambda8) onNavigationEvent(R.drawable.IAuthTabCallback(), -1651567372, R.drawable.IAuthTabCallback(), objArr, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 1651567374);
    }

    public final o4 onTransact() {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        return (o4) onNavigationEvent(R.drawable.IAuthTabCallback(), -1940463639, iIAuthTabCallback, new Object[]{this}, iIAuthTabCallback2, R.drawable.IAuthTabCallback(), 1940463639);
    }

    public final MaxFullscreenAdImpl getInterfaceDescriptor() {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        return (MaxFullscreenAdImpl) onNavigationEvent(R.drawable.IAuthTabCallback(), 1619884573, iIAuthTabCallback, new Object[]{this}, iIAuthTabCallback2, R.drawable.IAuthTabCallback(), -1619884570);
    }

    public final n0c access000() {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        return (n0c) onNavigationEvent(R.drawable.IAuthTabCallback(), -2125379858, iIAuthTabCallback, new Object[]{this}, iIAuthTabCallback2, R.drawable.IAuthTabCallback(), 2125379859);
    }
}
