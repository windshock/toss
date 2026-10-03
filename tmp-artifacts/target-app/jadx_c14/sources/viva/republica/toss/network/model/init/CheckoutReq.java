package viva.republica.toss.network.model.init;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import o.AttCertValidityPeriod;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.PlayerErrorCode;
import o.UserChoiceBillingListener;
import o.liq;
import o.setMixedAudience;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.init.CheckoutReq$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CheckoutReq {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final String campaignId;
    private final Long clientGaNo;
    private final Long clientUserNo;
    private final String deviceInfo;
    private final int usimCount;
    private final String usimPhoneNumber;

    static {
        int i = IAuthTabCallback + 93;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            int i2 = 47 / 0;
        }
    }

    public CheckoutReq() {
        this((String) null, (String) null, (Long) null, (Long) null, 0, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof viva.republica.toss.network.model.init.CheckoutReq) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r1 = r1 + 81;
        viva.republica.toss.network.model.init.CheckoutReq.onWarmupCompleted = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r6 = (viva.republica.toss.network.model.init.CheckoutReq) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.usimPhoneNumber, r6.usimPhoneNumber) == true) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.campaignId, r6.campaignId) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        r6 = viva.republica.toss.network.model.init.CheckoutReq.onWarmupCompleted + 51;
        viva.republica.toss.network.model.init.CheckoutReq.onExtraCallbackWithResult = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.clientGaNo, r6.clientGaNo) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.clientUserNo, r6.clientUserNo) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        if (r5.usimCount == r6.usimCount) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.deviceInfo, r6.deviceInfo) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.init.CheckoutReq.onExtraCallbackWithResult
            int r2 = r1 + 71
            int r3 = r2 % 128
            viva.republica.toss.network.model.init.CheckoutReq.onWarmupCompleted = r3
            int r2 = r2 % r0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L16
            r2 = 8
            int r2 = r2 / r4
            if (r5 != r6) goto L19
            goto L18
        L16:
            if (r5 != r6) goto L19
        L18:
            return r3
        L19:
            boolean r2 = r6 instanceof viva.republica.toss.network.model.init.CheckoutReq
            if (r2 != 0) goto L25
            int r1 = r1 + 81
            int r6 = r1 % 128
            viva.republica.toss.network.model.init.CheckoutReq.onWarmupCompleted = r6
            int r1 = r1 % r0
            return r4
        L25:
            viva.republica.toss.network.model.init.CheckoutReq r6 = (viva.republica.toss.network.model.init.CheckoutReq) r6
            java.lang.String r1 = r5.usimPhoneNumber
            java.lang.String r2 = r6.usimPhoneNumber
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 == r3) goto L32
            return r4
        L32:
            java.lang.String r1 = r5.campaignId
            java.lang.String r2 = r6.campaignId
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L46
            int r6 = viva.republica.toss.network.model.init.CheckoutReq.onWarmupCompleted
            int r6 = r6 + 51
            int r1 = r6 % 128
            viva.republica.toss.network.model.init.CheckoutReq.onExtraCallbackWithResult = r1
            int r6 = r6 % r0
            return r4
        L46:
            java.lang.Long r0 = r5.clientGaNo
            java.lang.Long r1 = r6.clientGaNo
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 != 0) goto L51
            return r4
        L51:
            java.lang.Long r0 = r5.clientUserNo
            java.lang.Long r1 = r6.clientUserNo
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 != 0) goto L5c
            return r4
        L5c:
            int r0 = r5.usimCount
            int r1 = r6.usimCount
            if (r0 == r1) goto L63
            return r4
        L63:
            java.lang.String r0 = r5.deviceInfo
            java.lang.String r6 = r6.deviceInfo
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r6)
            if (r6 != 0) goto L6e
            return r4
        L6e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.init.CheckoutReq.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.usimPhoneNumber.hashCode();
        int iHashCode3 = this.campaignId.hashCode();
        Long l = this.clientGaNo;
        int iHashCode4 = 0;
        if (l == null) {
            int i2 = onExtraCallbackWithResult + 107;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = l.hashCode();
            int i4 = onExtraCallbackWithResult + 113;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
        Long l2 = this.clientUserNo;
        if (l2 != null) {
            int i6 = onExtraCallbackWithResult + 1;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                l2.hashCode();
                throw null;
            }
            iHashCode4 = l2.hashCode();
        }
        return (((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31) + iHashCode4) * 31) + Integer.hashCode(this.usimCount)) * 31) + this.deviceInfo.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CheckoutReq(usimPhoneNumber=" + this.usimPhoneNumber + ", campaignId=" + this.campaignId + ", clientGaNo=" + this.clientGaNo + ", clientUserNo=" + this.clientUserNo + ", usimCount=" + this.usimCount + ", deviceInfo=" + this.deviceInfo + ")";
        int i2 = onWarmupCompleted + 37;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CheckoutReq> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 9;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            CheckoutReq$.serializer serializerVar = CheckoutReq$.serializer.INSTANCE;
            if (i3 != 0) {
                int i4 = 17 / 0;
            }
            return serializerVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ CheckoutReq(int r15, java.lang.String r16, java.lang.String r17, java.lang.Long r18, java.lang.Long r19, int r20, java.lang.String r21, o.okycx r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.init.CheckoutReq.<init>(int, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, int, java.lang.String, o.okycx):void");
    }

    public CheckoutReq(@NotNull String str, @NotNull String str2, @Nullable Long l, @Nullable Long l2, int i, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.usimPhoneNumber = str;
        this.campaignId = str2;
        this.clientGaNo = l;
        this.clientUserNo = l2;
        this.usimCount = i;
        this.deviceInfo = str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011f  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onWarmupCompleted(viva.republica.toss.network.model.init.CheckoutReq r20, o.vyl r21, kotlinx.serialization.descriptors.SerialDescriptor r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.init.CheckoutReq.onWarmupCompleted(viva.republica.toss.network.model.init.CheckoutReq, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CheckoutReq(String str, String str2, Long l, Long l2, int i, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) throws Throwable {
        String str4;
        String str5;
        Long longOrNull;
        Long longOrNull2;
        int iOnWarmupCompleted;
        String str6;
        if ((i2 & 1) != 0) {
            int i3 = onWarmupCompleted + 21;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1564184796);
            Object obj = ((Field) (objOnExtraCallback == null ? BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 46479), Color.blue(0) + 13, 22731 - TextUtils.indexOf("", "", 0), -1820028492, false, "IAuthTabCallback", (Class[]) null) : objOnExtraCallback)).get(null);
            try {
                Object[] objArr = {UserChoiceBillingListener.onExtraCallback.onExtraCallback()};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1244859634);
                str4 = (String) ((Method) (objOnExtraCallback2 == null ? BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "") + 46480), View.MeasureSpec.getMode(0) + 13, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 22730, 2071196258, false, "onWarmupCompleted", new Class[]{Context.class}) : objOnExtraCallback2)).invoke(obj, objArr);
                int i5 = 2 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        } else {
            str4 = str;
        }
        if ((i2 & 2) != 0) {
            int i6 = onExtraCallbackWithResult + 117;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 80 / 0;
                str5 = (String) setMixedAudience.onExtraCallbackWithResult.onWarmupCompleted().onWarmupCompleted("");
            } else {
                str5 = (String) setMixedAudience.onExtraCallbackWithResult.onWarmupCompleted().onWarmupCompleted("");
            }
        } else {
            str5 = str2;
        }
        if ((i2 & 4) != 0) {
            longOrNull = StringsKt.toLongOrNull(PlayerErrorCode.onActivityLayout());
            int i8 = 2 % 2;
        } else {
            longOrNull = l;
        }
        if ((i2 & 8) != 0) {
            int i9 = onWarmupCompleted + 57;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            longOrNull2 = StringsKt.toLongOrNull(PlayerErrorCode.onMinimized());
            int i11 = 2 % 2;
        } else {
            longOrNull2 = l2;
        }
        if ((i2 & 16) != 0) {
            iOnWarmupCompleted = new AttCertValidityPeriod(UserChoiceBillingListener.onExtraCallback.onExtraCallback()).onWarmupCompleted();
            int i12 = onWarmupCompleted + 15;
            onExtraCallbackWithResult = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 2 % 2;
            }
        } else {
            iOnWarmupCompleted = i;
        }
        if ((i2 & 32) != 0) {
            str6 = Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(str6, "");
        } else {
            str6 = str3;
        }
        this(str4, str5, longOrNull, longOrNull2, iOnWarmupCompleted, str6);
    }
}
