package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getUiManagerTypeannotations {
    public static final int $stable = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    @SerializedName("certificates")
    private final List<onWarmupCompleted> certificates;

    @SerializedName("deviceId")
    private final String deviceId;

    @SerializedName("originType")
    private final enqueueFrameCallback originType;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getUiManagerTypeannotations)) {
            int i4 = i3 + 77;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        getUiManagerTypeannotations getuimanagertypeannotations = (getUiManagerTypeannotations) obj;
        if (this.originType == getuimanagertypeannotations.originType) {
            return Intrinsics.areEqual(this.certificates, getuimanagertypeannotations.certificates) && !(Intrinsics.areEqual(this.deviceId, getuimanagertypeannotations.deviceId) ^ true);
        }
        int i6 = i3 + 99;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.originType.hashCode() * 31) + this.certificates.hashCode()) * 31) + this.deviceId.hashCode();
        int i4 = onNavigationEvent + 33;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 74 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ExternalDeviceCertRequest(originType=" + this.originType + ", certificates=" + this.certificates + ", deviceId=" + this.deviceId + ")";
        int i2 = onExtraCallbackWithResult + 19;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 47 / 0;
        }
        return str;
    }

    public getUiManagerTypeannotations(@NotNull enqueueFrameCallback enqueueframecallback, @NotNull List<onWarmupCompleted> list, @NotNull String str) {
        Intrinsics.checkNotNullParameter(enqueueframecallback, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.originType = enqueueframecallback;
        this.certificates = list;
        this.deviceId = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getUiManagerTypeannotations(enqueueFrameCallback enqueueframecallback, List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            int i2 = onNavigationEvent + 3;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                Response response = Response.onNavigationEvent;
                str = ((LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0.class)).IAuthTabCallback_Parcel().onNavigationEvent();
                int i3 = 99 / 0;
            } else {
                Response response2 = Response.onNavigationEvent;
                str = ((LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0.class)).IAuthTabCallback_Parcel().onNavigationEvent();
            }
            int i4 = onExtraCallbackWithResult + 97;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 5 / 4;
            } else {
                int i6 = 2 % 2;
            }
        }
        this(enqueueframecallback, list, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        r0 = 2 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public getUiManagerTypeannotations(@org.jetbrains.annotations.NotNull o.enqueueFrameCallback r7, @org.jetbrains.annotations.NotNull java.util.List<o.runOnNativeModulesQueueThread.IAuthTabCallback> r8) {
        /*
            r6 = this;
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r8, r0)
            r2.<init>(r0)
            java.util.Iterator r8 = r8.iterator()
            int r0 = o.getUiManagerTypeannotations.onNavigationEvent
            int r0 = r0 + 1
            int r1 = r0 % 128
            o.getUiManagerTypeannotations.onExtraCallbackWithResult = r1
            r1 = 2
            int r0 = r0 % r1
            if (r0 == 0) goto L29
            r0 = 4
            int r0 = r0 % 5
            goto L2b
        L29:
            int r0 = r1 % r1
        L2b:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L55
            java.lang.Object r0 = r8.next()
            o.runOnNativeModulesQueueThread$IAuthTabCallback r0 = (o.runOnNativeModulesQueueThread.IAuthTabCallback) r0
            o.getUiManagerTypeannotations$onWarmupCompleted r3 = new o.getUiManagerTypeannotations$onWarmupCompleted
            java.lang.String r4 = r0.onExtraCallback()
            java.lang.String r5 = r0.onExtraCallbackWithResult()
            boolean r0 = r0.onNavigationEvent()
            r3.<init>(r4, r5, r0)
            r2.add(r3)
            int r0 = o.getUiManagerTypeannotations.onNavigationEvent
            int r0 = r0 + 19
            int r3 = r0 % 128
            o.getUiManagerTypeannotations.onExtraCallbackWithResult = r3
            int r0 = r0 % r1
            goto L29
        L55:
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getUiManagerTypeannotations.<init>(o.enqueueFrameCallback, java.util.List):void");
    }

    public static final class onWarmupCompleted {
        public static final int $stable = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        @SerializedName("issuerDn")
        private final String issuerDn;

        @SerializedName("requiresRenew")
        private final boolean requiresRenew;

        @SerializedName("serial")
        private final String serial;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                return false;
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
            if (!Intrinsics.areEqual(this.issuerDn, onwarmupcompleted.issuerDn)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.serial, onwarmupcompleted.serial)) {
                int i2 = onNavigationEvent + 85;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            if (this.requiresRenew != onwarmupcompleted.requiresRenew) {
                return false;
            }
            int i4 = onWarmupCompleted + 119;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 7 / 0;
            }
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 95;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((this.issuerDn.hashCode() * 31) + this.serial.hashCode()) * 31) + Boolean.hashCode(this.requiresRenew);
            int i4 = onWarmupCompleted + 71;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Certificate(issuerDn=" + this.issuerDn + ", serial=" + this.serial + ", requiresRenew=" + this.requiresRenew + ")";
            int i2 = onWarmupCompleted + 73;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onWarmupCompleted(@NotNull String str, @NotNull String str2, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.issuerDn = str;
            this.serial = str2;
            this.requiresRenew = z;
        }
    }
}
