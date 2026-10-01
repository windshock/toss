package o;

import im.toss.features.credit.data.response.DisclaimerV2;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RuntimeEnvironmentRuntimeEnvironmentInner {
    private static int IAuthTabCallback_Parcel = 1;
    private static int getInterfaceDescriptor;
    private final enableNebulaServiceInitOpt IAuthTabCallback;
    private final onAvailable IAuthTabCallbackDefault;
    private final String IAuthTabCallbackStub;
    private final networkInfoOpt asBinder;
    private final onNavigationEvent asInterface;
    private final onUnavailable onExtraCallback;
    private final int onExtraCallbackWithResult;
    private final DisclaimerV2 onNavigationEvent;
    private final WifiConnectorExternalSyntheticApiModelOutline1 onTransact;
    private final int onWarmupCompleted;

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i4;
        int i8 = ~((~i5) | i7);
        int i9 = (~i3) | (~(i7 | i5));
        int i10 = i5 | i3 | i7;
        int i11 = i3 + i4 + i6 + (1635157569 * i2) + ((-1141649966) * i);
        int i12 = i11 * i11;
        int i13 = (((-1186836012) * i3) - 711983104) + (488484398 * i4) + (i8 * 1309823443) + (1309823443 * i9) + ((-1309823443) * i10) + (1798307840 * i6) + (1462763520 * i2) + (1566572544 * i) + (1631846400 * i12);
        int i14 = (i3 * 1521345644) + 2088555610 + (i4 * 1521346098) + (i8 * (-227)) + (i9 * (-227)) + (i10 * 227) + (i6 * 1521345871) + (i2 * (-1382509809)) + (i * 37969358) + (i12 * (-671350784));
        return i13 + ((i14 * i14) * (-1069809664)) != 1 ? onWarmupCompleted(objArr) : onExtraCallback(objArr);
    }

    public static /* synthetic */ RuntimeEnvironmentRuntimeEnvironmentInner onNavigationEvent(RuntimeEnvironmentRuntimeEnvironmentInner runtimeEnvironmentRuntimeEnvironmentInner, int i, int i2, enableNebulaServiceInitOpt enablenebulaserviceinitopt, WifiConnectorExternalSyntheticApiModelOutline1 wifiConnectorExternalSyntheticApiModelOutline1, onAvailable onavailable, onUnavailable onunavailable, networkInfoOpt networkinfoopt, String str, onNavigationEvent onnavigationevent, DisclaimerV2 disclaimerV2, int i3, Object obj) {
        int i4;
        onUnavailable onunavailable2;
        String str2;
        onNavigationEvent onnavigationevent2;
        DisclaimerV2 disclaimerV22;
        int i5 = 2 % 2;
        int i6 = IAuthTabCallback_Parcel + 27;
        int i7 = i6 % 128;
        getInterfaceDescriptor = i7;
        if (i6 % 2 == 0 && (i3 & 1) != 0) {
            i4 = runtimeEnvironmentRuntimeEnvironmentInner.onExtraCallbackWithResult;
            int i8 = i7 + 29;
            IAuthTabCallback_Parcel = i8 % 128;
            int i9 = i8 % 2;
        } else {
            i4 = i;
        }
        int i10 = (i3 & 2) != 0 ? runtimeEnvironmentRuntimeEnvironmentInner.onWarmupCompleted : i2;
        enableNebulaServiceInitOpt enablenebulaserviceinitopt2 = (i3 & 4) != 0 ? runtimeEnvironmentRuntimeEnvironmentInner.IAuthTabCallback : enablenebulaserviceinitopt;
        WifiConnectorExternalSyntheticApiModelOutline1 wifiConnectorExternalSyntheticApiModelOutline12 = (i3 & 8) != 0 ? runtimeEnvironmentRuntimeEnvironmentInner.onTransact : wifiConnectorExternalSyntheticApiModelOutline1;
        onAvailable onavailable2 = (i3 & 16) != 0 ? runtimeEnvironmentRuntimeEnvironmentInner.IAuthTabCallbackDefault : onavailable;
        if ((i3 & 32) != 0) {
            int i11 = i7 + 19;
            IAuthTabCallback_Parcel = i11 % 128;
            int i12 = i11 % 2;
            onunavailable2 = runtimeEnvironmentRuntimeEnvironmentInner.onExtraCallback;
        } else {
            onunavailable2 = onunavailable;
        }
        networkInfoOpt networkinfoopt2 = (i3 & 64) != 0 ? runtimeEnvironmentRuntimeEnvironmentInner.asBinder : networkinfoopt;
        if ((i3 & 128) != 0) {
            str2 = runtimeEnvironmentRuntimeEnvironmentInner.IAuthTabCallbackStub;
            int i13 = IAuthTabCallback_Parcel + 111;
            getInterfaceDescriptor = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 3 / 2;
            }
        } else {
            str2 = str;
        }
        if ((i3 & 256) != 0) {
            int i15 = IAuthTabCallback_Parcel + 51;
            getInterfaceDescriptor = i15 % 128;
            if (i15 % 2 != 0) {
                onNavigationEvent onnavigationevent3 = runtimeEnvironmentRuntimeEnvironmentInner.asInterface;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            onnavigationevent2 = runtimeEnvironmentRuntimeEnvironmentInner.asInterface;
        } else {
            onnavigationevent2 = onnavigationevent;
        }
        if ((i3 & 512) != 0) {
            int i16 = getInterfaceDescriptor + 37;
            IAuthTabCallback_Parcel = i16 % 128;
            int i17 = i16 % 2;
            disclaimerV22 = runtimeEnvironmentRuntimeEnvironmentInner.onNavigationEvent;
        } else {
            disclaimerV22 = disclaimerV2;
        }
        return runtimeEnvironmentRuntimeEnvironmentInner.onWarmupCompleted(i4, i10, enablenebulaserviceinitopt2, wifiConnectorExternalSyntheticApiModelOutline12, onavailable2, onunavailable2, networkinfoopt2, str2, onnavigationevent2, disclaimerV22);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RuntimeEnvironmentRuntimeEnvironmentInner)) {
            return false;
        }
        RuntimeEnvironmentRuntimeEnvironmentInner runtimeEnvironmentRuntimeEnvironmentInner = (RuntimeEnvironmentRuntimeEnvironmentInner) obj;
        if (this.onExtraCallbackWithResult != runtimeEnvironmentRuntimeEnvironmentInner.onExtraCallbackWithResult || this.onWarmupCompleted != runtimeEnvironmentRuntimeEnvironmentInner.onWarmupCompleted || this.IAuthTabCallback != runtimeEnvironmentRuntimeEnvironmentInner.IAuthTabCallback || this.onTransact != runtimeEnvironmentRuntimeEnvironmentInner.onTransact || !Intrinsics.areEqual(this.IAuthTabCallbackDefault, runtimeEnvironmentRuntimeEnvironmentInner.IAuthTabCallbackDefault) || !Intrinsics.areEqual(this.onExtraCallback, runtimeEnvironmentRuntimeEnvironmentInner.onExtraCallback) || this.asBinder != runtimeEnvironmentRuntimeEnvironmentInner.asBinder) {
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallbackStub, runtimeEnvironmentRuntimeEnvironmentInner.IAuthTabCallbackStub)) {
            int i2 = getInterfaceDescriptor + 11;
            IAuthTabCallback_Parcel = i2 % 128;
            if (i2 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (Intrinsics.areEqual(this.asInterface, runtimeEnvironmentRuntimeEnvironmentInner.asInterface)) {
            return Intrinsics.areEqual(this.onNavigationEvent, runtimeEnvironmentRuntimeEnvironmentInner.onNavigationEvent);
        }
        int i3 = IAuthTabCallback_Parcel + 81;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = Integer.hashCode(this.onExtraCallbackWithResult);
        int iHashCode3 = Integer.hashCode(this.onWarmupCompleted);
        int iHashCode4 = this.IAuthTabCallback.hashCode();
        WifiConnectorExternalSyntheticApiModelOutline1 wifiConnectorExternalSyntheticApiModelOutline1 = this.onTransact;
        int iHashCode5 = 0;
        int iHashCode6 = wifiConnectorExternalSyntheticApiModelOutline1 == null ? 0 : wifiConnectorExternalSyntheticApiModelOutline1.hashCode();
        int iHashCode7 = this.IAuthTabCallbackDefault.hashCode();
        onUnavailable onunavailable = this.onExtraCallback;
        if (onunavailable == null) {
            int i2 = getInterfaceDescriptor + 3;
            IAuthTabCallback_Parcel = i2 % 128;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = onunavailable.hashCode();
        }
        int iHashCode8 = this.asBinder.hashCode();
        int iHashCode9 = this.IAuthTabCallbackStub.hashCode();
        onNavigationEvent onnavigationevent = this.asInterface;
        int iHashCode10 = onnavigationevent == null ? 0 : onnavigationevent.hashCode();
        DisclaimerV2 disclaimerV2 = this.onNavigationEvent;
        if (disclaimerV2 != null) {
            int i3 = getInterfaceDescriptor + 89;
            IAuthTabCallback_Parcel = i3 % 128;
            if (i3 % 2 == 0) {
                disclaimerV2.hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            iHashCode5 = disclaimerV2.hashCode();
        }
        return (((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode5;
    }

    public final RuntimeEnvironmentRuntimeEnvironmentInner onWarmupCompleted(int i, int i2, @NotNull enableNebulaServiceInitOpt enablenebulaserviceinitopt, @Nullable WifiConnectorExternalSyntheticApiModelOutline1 wifiConnectorExternalSyntheticApiModelOutline1, @NotNull onAvailable onavailable, @Nullable onUnavailable onunavailable, @NotNull networkInfoOpt networkinfoopt, @NotNull String str, @Nullable onNavigationEvent onnavigationevent, @Nullable DisclaimerV2 disclaimerV2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(enablenebulaserviceinitopt, "");
        Intrinsics.checkNotNullParameter(onavailable, "");
        Intrinsics.checkNotNullParameter(networkinfoopt, "");
        Intrinsics.checkNotNullParameter(str, "");
        RuntimeEnvironmentRuntimeEnvironmentInner runtimeEnvironmentRuntimeEnvironmentInner = new RuntimeEnvironmentRuntimeEnvironmentInner(i, i2, enablenebulaserviceinitopt, wifiConnectorExternalSyntheticApiModelOutline1, onavailable, onunavailable, networkinfoopt, str, onnavigationevent, disclaimerV2);
        int i4 = IAuthTabCallback_Parcel + 87;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return runtimeEnvironmentRuntimeEnvironmentInner;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CreditHistoryDetailScreenData(creditScore=" + this.onExtraCallbackWithResult + ", cachedScore=" + this.onWarmupCompleted + ", creditBureauType=" + this.IAuthTabCallback + ", screenType=" + this.onTransact + ", historyDetail=" + this.IAuthTabCallbackDefault + ", adBanner=" + this.onExtraCallback + ", scoreChangeType=" + this.asBinder + ", infoType=" + this.IAuthTabCallbackStub + ", loanBanner=" + this.asInterface + ", disclaimer=" + this.onNavigationEvent + ")";
        int i2 = IAuthTabCallback_Parcel + 121;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public RuntimeEnvironmentRuntimeEnvironmentInner(int i, int i2, @NotNull enableNebulaServiceInitOpt enablenebulaserviceinitopt, @Nullable WifiConnectorExternalSyntheticApiModelOutline1 wifiConnectorExternalSyntheticApiModelOutline1, @NotNull onAvailable onavailable, @Nullable onUnavailable onunavailable, @NotNull networkInfoOpt networkinfoopt, @NotNull String str, @Nullable onNavigationEvent onnavigationevent, @Nullable DisclaimerV2 disclaimerV2) {
        Intrinsics.checkNotNullParameter(enablenebulaserviceinitopt, "");
        Intrinsics.checkNotNullParameter(onavailable, "");
        Intrinsics.checkNotNullParameter(networkinfoopt, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.onExtraCallbackWithResult = i;
        this.onWarmupCompleted = i2;
        this.IAuthTabCallback = enablenebulaserviceinitopt;
        this.onTransact = wifiConnectorExternalSyntheticApiModelOutline1;
        this.IAuthTabCallbackDefault = onavailable;
        this.onExtraCallback = onunavailable;
        this.asBinder = networkinfoopt;
        this.IAuthTabCallbackStub = str;
        this.asInterface = onnavigationevent;
        this.onNavigationEvent = disclaimerV2;
    }

    public final int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 35;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = this.onExtraCallbackWithResult;
        int i5 = i2 + 85;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        RuntimeEnvironmentRuntimeEnvironmentInner runtimeEnvironmentRuntimeEnvironmentInner = (RuntimeEnvironmentRuntimeEnvironmentInner) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 61;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int i4 = runtimeEnvironmentRuntimeEnvironmentInner.onWarmupCompleted;
        if (i3 == 0) {
            return Integer.valueOf(i4);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final WifiConnectorExternalSyntheticApiModelOutline1 asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 25;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onTransact;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        RuntimeEnvironmentRuntimeEnvironmentInner runtimeEnvironmentRuntimeEnvironmentInner = (RuntimeEnvironmentRuntimeEnvironmentInner) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 105;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        onAvailable onavailable = runtimeEnvironmentRuntimeEnvironmentInner.IAuthTabCallbackDefault;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 73;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            return onavailable;
        }
        throw null;
    }

    public final onUnavailable IAuthTabCallback() {
        onUnavailable onunavailable;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 103;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        if (i2 % 2 != 0) {
            onunavailable = this.onExtraCallback;
            int i4 = 85 / 0;
        } else {
            onunavailable = this.onExtraCallback;
        }
        int i5 = i3 + 93;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return onunavailable;
    }

    public final networkInfoOpt IAuthTabCallbackStub() {
        networkInfoOpt networkinfoopt;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 87;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        if (i2 % 2 == 0) {
            networkinfoopt = this.asBinder;
            int i4 = 62 / 0;
        } else {
            networkinfoopt = this.asBinder;
        }
        int i5 = i3 + 123;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return networkinfoopt;
    }

    public final String onTransact() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 61;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        if (i2 % 2 != 0) {
            str = this.IAuthTabCallbackStub;
            int i4 = 45 / 0;
        } else {
            str = this.IAuthTabCallbackStub;
        }
        int i5 = i3 + 71;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final onNavigationEvent IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 75;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        onNavigationEvent onnavigationevent = this.asInterface;
        int i5 = i3 + 103;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return onnavigationevent;
    }

    public final DisclaimerV2 onNavigationEvent() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 121;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        DisclaimerV2 disclaimerV2 = this.onNavigationEvent;
        int i4 = i2 + 97;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return disclaimerV2;
    }

    public final int onExtraCallback() {
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        return ((Integer) onExtraCallbackWithResult(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback3, -619014049, 619014050, iIAuthTabCallback, iIAuthTabCallback2, new Object[]{this})).intValue();
    }

    public static final class onNavigationEvent {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private final setHeaders onExtraCallback;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onNavigationEvent)) {
                int i2 = onExtraCallbackWithResult + 37;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.onExtraCallback, ((onNavigationEvent) obj).onExtraCallback)) {
                return true;
            }
            int i4 = onNavigationEvent + 47;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 27;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.onExtraCallback.hashCode();
            int i4 = onExtraCallbackWithResult + 25;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 66 / 0;
            }
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "LoanBanner(creditLoanNeedsInfo=" + this.onExtraCallback + ")";
            int i2 = onNavigationEvent + 125;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onNavigationEvent(@NotNull setHeaders setheaders) {
            Intrinsics.checkNotNullParameter(setheaders, "");
            this.onExtraCallback = setheaders;
        }

        public final setHeaders onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 123;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            setHeaders setheaders = this.onExtraCallback;
            int i5 = i3 + 93;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return setheaders;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final onAvailable onWarmupCompleted() {
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        return (onAvailable) onExtraCallbackWithResult(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback3, 778267545, -778267545, iIAuthTabCallback, iIAuthTabCallback2, new Object[]{this});
    }
}
