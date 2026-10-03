package viva.republica.toss.common.web.message.handlers.tossbank.ssenstone;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.ads.zzgc;
import com.google.gson.JsonObject;
import com.ssenstone.libotac_sdk.OtacManager;
import im.toss.splittarget.impl.fsm.AppStateImpl$;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertFloatArrayToByteArray;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.EndMotionInteraction;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.UST_API_SetCryptoKCMVPMode;
import o.UST_CERT_ChangePrikeyPassword;
import o.UST_CERT_DecryptPrikey;
import o.UST_CERT_EncryptPrikey;
import o.UST_CERT_Finalize;
import o.getEmbedViewManager;
import o.liq;
import o.okycx;
import o.vyl;
import o.wie2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.common.web.message.handlers.tossbank.ssenstone.OtpCredential;
import viva.republica.toss.common.web.message.handlers.tossbank.ssenstone.SsenStoneOtacClient;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class SsenStoneOtacClient {
    private static int IAuthTabCallback;
    private static int asInterface;
    private static char onExtraCallback;
    private static char[] onExtraCallbackWithResult;
    private static final String onNavigationEvent;
    public static final SsenStoneOtacClient onWarmupCompleted;
    private static final byte[] $$a = {109, 5, -57, 108};
    private static final int $$b = 56;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int asBinder = 1;
    private static int IAuthTabCallbackStub = 1;

    public static final /* synthetic */ class IAuthTabCallback {
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[UST_CERT_DecryptPrikey.values().length];
            try {
                iArr[UST_CERT_DecryptPrikey.Pin.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UST_CERT_DecryptPrikey.Card.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            onWarmupCompleted = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, int r7, short r8) {
        /*
            int r7 = r7 * 4
            int r7 = 105 - r7
            int r6 = r6 + 4
            int r8 = r8 * 3
            int r8 = r8 + 1
            byte[] r0 = viva.republica.toss.common.web.message.handlers.tossbank.ssenstone.SsenStoneOtacClient.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            int r6 = r6 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = -r6
            int r6 = r6 + r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.common.web.message.handlers.tossbank.ssenstone.SsenStoneOtacClient.$$c(int, int, short):java.lang.String");
    }

    static {
        asInterface = 0;
        onWarmupCompleted();
        Object[] objArr = new Object[1];
        a(new char[]{'\n', 3, 15, '\b', 14, '\f', 0, 6, 16, '\b', '\f', 6, 7, 19, 4, 18, 15, '\b', 13903}, (byte) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 97), 19 - Color.alpha(0), objArr);
        onNavigationEvent = ((String) objArr[0]).intern();
        onWarmupCompleted = new SsenStoneOtacClient();
        int i = IAuthTabCallbackStub + 73;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    private SsenStoneOtacClient() {
    }

    public final UST_API_SetCryptoKCMVPMode IAuthTabCallback(@NotNull Context context) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        try {
            OtacSdkResponse otacSdkResponseOnExtraCallback = onExtraCallback(UST_CERT_Finalize.onWarmupCompleted(new OtacManager(context)));
            if (otacSdkResponseOnExtraCallback.asBinder()) {
                return new UST_API_SetCryptoKCMVPMode.IAuthTabCallback(otacSdkResponseOnExtraCallback.onExtraCallbackWithResult(), null, null, 6, null);
            }
            UST_API_SetCryptoKCMVPMode.onExtraCallback.IAuthTabCallback iAuthTabCallback = new UST_API_SetCryptoKCMVPMode.onExtraCallback.IAuthTabCallback(otacSdkResponseOnExtraCallback.onWarmupCompleted(), null, 2, null);
            int i2 = onTransact + 47;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback;
        } catch (Exception e) {
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr = new Object[1];
            a(new char[]{'\n', 3, 15, '\b', 14, '\f', 0, 6, 16, '\b', '\f', 6, 7, 19, 4, 18, 15, '\b', 13903}, (byte) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 96), 19 - TextUtils.indexOf("", "", 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            b((-16777200) - Color.rgb(0, 0, 0), Color.blue(0) + 29, new char[]{6, 20, 3, 65509, 22, 7, '\t', 65474, 16, 17, 65474, 20, 17, 20, 20, 7, 27, 7, 65517, 5, 11, 14, 4, 23, 65522, 65509, 65507, 65526, 65521}, MotionEvent.axisFromString("") + 106, true, objArr2);
            ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, strIntern, ((String) objArr2[0]).intern(), e, (Map) null, 8, (Object) null);
            return new UST_API_SetCryptoKCMVPMode.onExtraCallback.IAuthTabCallback("", e.getMessage());
        }
    }

    public final UST_API_SetCryptoKCMVPMode onNavigationEvent(@NotNull Context context, @NotNull UST_CERT_ChangePrikeyPassword uST_CERT_ChangePrikeyPassword, @NotNull String str) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(uST_CERT_ChangePrikeyPassword, "");
        Intrinsics.checkNotNullParameter(str, "");
        Object obj = null;
        try {
            OtacSdkResponse otacSdkResponseOnExtraCallback = onExtraCallback(UST_CERT_Finalize.IAuthTabCallback(new OtacManager(context), uST_CERT_ChangePrikeyPassword.onExtraCallbackWithResult(), uST_CERT_ChangePrikeyPassword.onWarmupCompleted(), str));
            return otacSdkResponseOnExtraCallback.asBinder() ? new UST_API_SetCryptoKCMVPMode.IAuthTabCallback(otacSdkResponseOnExtraCallback.onExtraCallbackWithResult(), otacSdkResponseOnExtraCallback.onTransact(), otacSdkResponseOnExtraCallback.onNavigationEvent()) : new UST_API_SetCryptoKCMVPMode.onExtraCallback.IAuthTabCallback(otacSdkResponseOnExtraCallback.onWarmupCompleted(), null, 2, null);
        } catch (Exception e) {
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr = new Object[1];
            a(new char[]{'\n', 3, 15, '\b', 14, '\f', 0, 6, 16, '\b', '\f', 6, 7, 19, 4, 18, 15, '\b', 13903}, (byte) (97 - View.MeasureSpec.getMode(0)), (ViewConfiguration.getTouchSlop() >> 8) + 19, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            b(24 - (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 27, new char[]{20, 65474, 17, 16, 65474, '\t', 7, 22, 65522, 11, 16, 65521, 65526, 65507, 65509, 65522, 23, 4, 14, 11, 5, 65517, 7, 27, 7, 20, 20, 17}, 105 - TextUtils.indexOf("", ""), false, objArr2);
            ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, strIntern, ((String) objArr2[0]).intern(), e, (Map) null, 8, (Object) null);
            UST_API_SetCryptoKCMVPMode.onExtraCallback.IAuthTabCallback iAuthTabCallback = new UST_API_SetCryptoKCMVPMode.onExtraCallback.IAuthTabCallback("", e.getMessage());
            int i2 = onTransact + 117;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                return iAuthTabCallback;
            }
            obj.hashCode();
            throw null;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final UST_API_SetCryptoKCMVPMode onExtraCallback(@NotNull Context context, @NotNull UST_CERT_ChangePrikeyPassword uST_CERT_ChangePrikeyPassword, @NotNull UST_CERT_DecryptPrikey uST_CERT_DecryptPrikey, @NotNull String str, @NotNull String str2, @NotNull String str3) throws Throwable {
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(uST_CERT_ChangePrikeyPassword, "");
        Intrinsics.checkNotNullParameter(uST_CERT_DecryptPrikey, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        UST_API_SetCryptoKCMVPMode uST_API_SetCryptoKCMVPModeOnExtraCallback = onExtraCallback(context, uST_CERT_ChangePrikeyPassword, uST_CERT_DecryptPrikey, str2, str3);
        if (uST_API_SetCryptoKCMVPModeOnExtraCallback instanceof UST_API_SetCryptoKCMVPMode.IAuthTabCallback) {
            int i3 = onTransact + 41;
            asBinder = i3 % 128;
            if (i3 % 2 != 0 ? (i = IAuthTabCallback.onWarmupCompleted[uST_CERT_DecryptPrikey.ordinal()]) != 1 : (i = IAuthTabCallback.onWarmupCompleted[uST_CERT_DecryptPrikey.ordinal()]) != 0) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                UST_CERT_EncryptPrikey.onExtraCallbackWithResult.onExtraCallbackWithResult(uST_CERT_ChangePrikeyPassword, new OtpCredential.Card.Stored(str, ((UST_API_SetCryptoKCMVPMode.IAuthTabCallback) uST_API_SetCryptoKCMVPModeOnExtraCallback).onWarmupCompleted()));
                return uST_API_SetCryptoKCMVPModeOnExtraCallback;
            }
            UST_CERT_EncryptPrikey.onExtraCallbackWithResult.onNavigationEvent(uST_CERT_ChangePrikeyPassword, new OtpCredential.Pin(((UST_API_SetCryptoKCMVPMode.IAuthTabCallback) uST_API_SetCryptoKCMVPModeOnExtraCallback).onWarmupCompleted()));
        }
        int i4 = asBinder + 23;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return uST_API_SetCryptoKCMVPModeOnExtraCallback;
    }

    @liq
    static final class OtacSdkResponse {
        public static final Companion Companion;
        private static int IAuthTabCallback;
        private static char IAuthTabCallbackDefault;
        private static char IAuthTabCallbackStub;
        private static int IAuthTabCallback_Parcel;
        private static char asBinder;
        private static char asInterface;
        private static int onExtraCallback;
        private static short[] onExtraCallbackWithResult;
        private static byte[] onNavigationEvent;
        private static int onWarmupCompleted;
        private final String errorCode;
        private final Lazy isSuccess$delegate;
        private final String otac;
        private final String publicKey;
        private final String result;
        private final String secret;
        private final String signValue;
        private final String userData;
        private static final byte[] $$a = {79, -25, -14, 102};
        private static final int $$b = 38;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int access000 = 0;
        private static int onTransact = 0;
        private static int getInterfaceDescriptor = 1;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(int r5, int r6, short r7) {
            /*
                int r7 = r7 + 4
                int r6 = r6 * 3
                int r0 = r6 + 1
                int r5 = r5 * 4
                int r5 = r5 + 115
                byte[] r1 = viva.republica.toss.common.web.message.handlers.tossbank.ssenstone.SsenStoneOtacClient.OtacSdkResponse.$$a
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L14
                r4 = r6
                r3 = r2
                goto L26
            L14:
                r3 = r2
            L15:
                byte r4 = (byte) r5
                r0[r3] = r4
                int r7 = r7 + 1
                if (r3 != r6) goto L22
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                return r5
            L22:
                int r3 = r3 + 1
                r4 = r1[r7]
            L26:
                int r4 = -r4
                int r5 = r5 + r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.common.web.message.handlers.tossbank.ssenstone.SsenStoneOtacClient.OtacSdkResponse.$$c(int, int, short):java.lang.String");
        }

        static {
            IAuthTabCallback_Parcel = 1;
            IAuthTabCallbackDefault();
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion = new Companion(defaultConstructorMarker);
            int i = access000 + 71;
            IAuthTabCallback_Parcel = i % 128;
            if (i % 2 != 0) {
                return;
            }
            defaultConstructorMarker.hashCode();
            throw null;
        }

        public OtacSdkResponse() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
            int i7 = ~i4;
            int i8 = ~i6;
            int i9 = ~(i7 | i8);
            int i10 = i7 | i;
            int i11 = (~i10) | i9;
            int i12 = ~i;
            int i13 = (~(i6 | i10)) | (~(i8 | i12)) | (~(i12 | i4));
            int i14 = i4 + i + i5 + ((-1017789379) * i3) + (461141949 * i2);
            int i15 = i14 * i14;
            int i16 = ((-551480932) * i4) + 431816704 + ((-1613042074) * i) + ((-1061561142) * i11) + (i13 * (-1616703077)) + ((-1616703077) * i9) + (1065222144 * i5) + ((-1727660032) * i3) + (1912995840 * i2) + ((-1005256704) * i15);
            int i17 = ((i4 * (-1063000396)) - 360994079) + (i * (-1063001374)) + (i11 * (-978)) + (i13 * 489) + (i9 * 489) + (i5 * (-1063000885)) + (i3 * (-90181537)) + (i2 * (-1548859681)) + (i15 * 816250880);
            return i16 + ((i17 * i17) * 1493368832) != 1 ? onExtraCallback(objArr) : onWarmupCompleted(objArr);
        }

        public static /* synthetic */ boolean onNavigationEvent(OtacSdkResponse otacSdkResponse) throws Throwable {
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor + 81;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(otacSdkResponse);
            int i4 = getInterfaceDescriptor + 103;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                return zOnExtraCallbackWithResult;
            }
            throw null;
        }

        public static /* synthetic */ boolean onWarmupCompleted(OtacSdkResponse otacSdkResponse) {
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor + 43;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            Object[] objArr = {otacSdkResponse};
            int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
            int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
            int iOnWarmupCompleted3 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
            int iOnWarmupCompleted4 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
            if (i3 != 0) {
                ((Boolean) onExtraCallbackWithResult(-149032077, iOnWarmupCompleted4, iOnWarmupCompleted3, 149032077, objArr, iOnWarmupCompleted2, iOnWarmupCompleted)).booleanValue();
                obj.hashCode();
                throw null;
            }
            boolean zBooleanValue = ((Boolean) onExtraCallbackWithResult(-149032077, iOnWarmupCompleted4, iOnWarmupCompleted3, 149032077, objArr, iOnWarmupCompleted2, iOnWarmupCompleted)).booleanValue();
            int i4 = onTransact + 55;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 != 0) {
                return zBooleanValue;
            }
            throw null;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OtacSdkResponse)) {
                return false;
            }
            OtacSdkResponse otacSdkResponse = (OtacSdkResponse) obj;
            if (!Intrinsics.areEqual(this.result, otacSdkResponse.result)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.publicKey, otacSdkResponse.publicKey)) {
                int i2 = getInterfaceDescriptor + 115;
                onTransact = i2 % 128;
                return i2 % 2 != 0;
            }
            if (!Intrinsics.areEqual(this.userData, otacSdkResponse.userData) || !Intrinsics.areEqual(this.signValue, otacSdkResponse.signValue) || !Intrinsics.areEqual(this.secret, otacSdkResponse.secret)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.otac, otacSdkResponse.otac)) {
                int i3 = getInterfaceDescriptor + 5;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.errorCode, otacSdkResponse.errorCode)) {
                return true;
            }
            int i5 = getInterfaceDescriptor + 117;
            onTransact = i5 % 128;
            return i5 % 2 != 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor + 69;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((((((((((this.result.hashCode() * 31) + this.publicKey.hashCode()) * 31) + this.userData.hashCode()) * 31) + this.signValue.hashCode()) * 31) + this.secret.hashCode()) * 31) + this.otac.hashCode()) * 31) + this.errorCode.hashCode();
            int i4 = getInterfaceDescriptor + 113;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() throws Throwable {
            int i = 2 % 2;
            String str = this.result;
            String str2 = this.publicKey;
            String str3 = this.userData;
            String str4 = this.signValue;
            String str5 = this.secret;
            String str6 = this.otac;
            String str7 = this.errorCode;
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            b(new char[]{41889, 46967, 59458, 7438, 9333, 43488, 9853, 37435, 16666, 63577, 15420, 10197, 38097, 24273, 3304, 12878, 51777, 65227, 6339, 57498, 47889, 52782, 8562, 45577}, 23 - Color.red(0), objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(str);
            Object[] objArr2 = new Object[1];
            b(new char[]{24406, 30932, 56088, 41504, 26462, 44730, 43712, 4447, 39938, 14576, 35220, 54495}, 12 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr2);
            sb.append(((String) objArr2[0]).intern());
            sb.append(str2);
            Object[] objArr3 = new Object[1];
            a((short) View.resolveSize(0, 0), (byte) (58 - (ViewConfiguration.getPressedStateDuration() >> 16)), Color.blue(0) - 1501282964, TextUtils.getOffsetAfter("", 0) + 5394954, (ViewConfiguration.getLongPressTimeout() >> 16) - 41, objArr3);
            sb.append(((String) objArr3[0]).intern());
            sb.append(str3);
            Object[] objArr4 = new Object[1];
            a((short) View.MeasureSpec.getMode(0), (byte) ((-14) - KeyEvent.getDeadChar(0, 0)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) - 1501282954, 5394954 - TextUtils.getOffsetAfter("", 0), TextUtils.indexOf((CharSequence) "", '0') - 39, objArr4);
            sb.append(((String) objArr4[0]).intern());
            sb.append(str4);
            Object[] objArr5 = new Object[1];
            b(new char[]{24406, 30932, 27902, 59284, 17200, 64491, 18138, 1802, 8562, 45577}, 9 - (ViewConfiguration.getTapTimeout() >> 16), objArr5);
            sb.append(((String) objArr5[0]).intern());
            sb.append(str5);
            Object[] objArr6 = new Object[1];
            b(new char[]{24406, 30932, 43456, 62708, 59458, 7438, 8562, 45577}, Process.getGidForName("") + 8, objArr6);
            sb.append(((String) objArr6[0]).intern());
            sb.append(str6);
            Object[] objArr7 = new Object[1];
            a((short) (ViewConfiguration.getFadingEdgeLength() >> 16), (byte) (TextUtils.lastIndexOf("", '0', 0, 0) - 30), (-1501282942) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), ExpandableListView.getPackedPositionChild(0L) + 5394955, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 41, objArr7);
            sb.append(((String) objArr7[0]).intern());
            sb.append(str7);
            Object[] objArr8 = new Object[1];
            b(new char[]{5915, 31514}, -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr8);
            sb.append(((String) objArr8[0]).intern());
            String string = sb.toString();
            int i2 = getInterfaceDescriptor + 81;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                return string;
            }
            throw null;
        }

        private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
            char[] cArr2 = new char[cArr.length];
            int i3 = 0;
            defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
            char[] cArr3 = new char[2];
            while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
                int i4 = $11 + 37;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                int i6 = 58224;
                int i7 = i3;
                while (i7 < 16) {
                    char c = cArr3[1];
                    char c2 = cArr3[i3];
                    int i8 = (c2 + i6) ^ ((c2 << 4) + ((char) (IAuthTabCallbackDefault ^ 1094535280733222934L)));
                    int i9 = c2 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(asBinder);
                        objArr2[2] = Integer.valueOf(i9);
                        objArr2[1] = Integer.valueOf(i8);
                        objArr2[i3] = Integer.valueOf(c);
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback == null) {
                            char cIndexOf = (char) TextUtils.indexOf("", "", i3);
                            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10;
                            int defaultSize = View.getDefaultSize(i3, i3) + 12434;
                            Class[] clsArr = new Class[4];
                            clsArr[i3] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, minimumFlingVelocity, defaultSize, -787580090, false, "C", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        char[] cArr4 = cArr3;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (IAuthTabCallbackStub ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(asInterface)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getTouchSlop() >> 8) + 10, 12435 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i6 -= 40503;
                        i7++;
                        cArr3 = cArr4;
                        i3 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                char[] cArr5 = cArr3;
                cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
                cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myPid() >> 22) + 16014), (ViewConfiguration.getTouchSlop() >> 8) + 14, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                cArr3 = cArr5;
                i3 = 0;
            }
            String str = new String(cArr2, 0, i);
            int i10 = $11 + 121;
            $10 = i10 % 128;
            if (i10 % 2 == 0) {
                objArr[0] = str;
            } else {
                int i11 = 17 / 0;
                objArr[0] = str;
            }
        }

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<OtacSdkResponse> serializer() {
                return SsenStoneOtacClient$OtacSdkResponse$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ OtacSdkResponse(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, okycx okycxVar) {
            if ((i & 1) == 0) {
                this.result = "";
            } else {
                this.result = str;
                int i2 = getInterfaceDescriptor + 123;
                onTransact = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 2 % 2;
                }
            }
            if ((i & 2) == 0) {
                this.publicKey = "";
            } else {
                this.publicKey = str2;
            }
            if ((i & 4) == 0) {
                int i4 = getInterfaceDescriptor + 15;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                this.userData = "";
            } else {
                this.userData = str3;
            }
            if ((i & 8) == 0) {
                this.signValue = "";
                int i6 = getInterfaceDescriptor + 51;
                onTransact = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 2 % 2;
                }
            } else {
                this.signValue = str4;
            }
            if ((i & 16) == 0) {
                this.secret = "";
            } else {
                this.secret = str5;
                int i8 = 2 % 2;
            }
            if ((i & 32) == 0) {
                this.otac = "";
            } else {
                this.otac = str6;
                int i9 = getInterfaceDescriptor + 21;
                onTransact = i9 % 128;
                int i10 = i9 % 2;
                int i11 = 2 % 2;
            }
            if ((i & 64) == 0) {
                this.errorCode = "";
                int i12 = onTransact + 65;
                getInterfaceDescriptor = i12 % 128;
                if (i12 % 2 != 0) {
                    int i13 = 2 % 2;
                }
            } else {
                this.errorCode = str7;
            }
            this.isSuccess$delegate = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.common.web.message.handlers.tossbank.ssenstone.SsenStoneOtacClient$OtacSdkResponse$$ExternalSyntheticLambda0
                public final Object invoke() {
                    return Boolean.valueOf(SsenStoneOtacClient.OtacSdkResponse.onNavigationEvent(this.f$0));
                }
            });
        }

        public OtacSdkResponse(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            this.result = str;
            this.publicKey = str2;
            this.userData = str3;
            this.signValue = str4;
            this.secret = str5;
            this.otac = str6;
            this.errorCode = str7;
            this.isSuccess$delegate = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.common.web.message.handlers.tossbank.ssenstone.SsenStoneOtacClient$OtacSdkResponse$$ExternalSyntheticLambda1
                public final Object invoke() {
                    return Boolean.valueOf(SsenStoneOtacClient.OtacSdkResponse.onWarmupCompleted(this.f$0));
                }
            });
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00c0  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static /* synthetic */ java.lang.Object onWarmupCompleted(java.lang.Object[] r9) {
            /*
                r0 = 0
                r1 = r9[r0]
                viva.republica.toss.common.web.message.handlers.tossbank.ssenstone.SsenStoneOtacClient$OtacSdkResponse r1 = (viva.republica.toss.common.web.message.handlers.tossbank.ssenstone.SsenStoneOtacClient.OtacSdkResponse) r1
                r2 = 1
                r3 = r9[r2]
                o.vyl r3 = (o.vyl) r3
                r4 = 2
                r9 = r9[r4]
                kotlinx.serialization.descriptors.SerialDescriptor r9 = (kotlinx.serialization.descriptors.SerialDescriptor) r9
                int r5 = r4 % r4
                int r5 = viva.republica.toss.common.web.message.handlers.tossbank.ssenstone.SsenStoneOtacClient.OtacSdkResponse.onTransact
                int r5 = r5 + 107
                int r6 = r5 % 128
                viva.republica.toss.common.web.message.handlers.tossbank.ssenstone.SsenStoneOtacClient.OtacSdkResponse.getInterfaceDescriptor = r6
                int r5 = r5 % r4
                java.lang.String r6 = ""
                if (r5 != 0) goto L25
                boolean r5 = r3.onWarmupCompleted(r9, r0)
                if (r5 != 0) goto L33
                goto L2b
            L25:
                boolean r5 = r3.onWarmupCompleted(r9, r0)
                if (r5 != 0) goto L33
            L2b:
                java.lang.String r5 = r1.result
                boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r6)
                if (r5 != 0) goto L41
            L33:
                java.lang.String r5 = r1.result
                r3.onExtraCallback(r9, r0, r5)
                int r5 = viva.republica.toss.common.web.message.handlers.tossbank.ssenstone.SsenStoneOtacClient.OtacSdkResponse.getInterfaceDescriptor
                int r5 = r5 + 125
                int r7 = r5 % 128
                viva.republica.toss.common.web.message.handlers.tossbank.ssenstone.SsenStoneOtacClient.OtacSdkResponse.onTransact = r7
                int r5 = r5 % r4
            L41:
                boolean r5 = r3.onWarmupCompleted(r9, r2)
                r5 = r5 ^ r2
                if (r5 == r2) goto L49
                goto L51
            L49:
                java.lang.String r5 = r1.publicKey
                boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r6)
                if (r5 != 0) goto L56
            L51:
                java.lang.String r5 = r1.publicKey
                r3.onExtraCallback(r9, r2, r5)
            L56:
                boolean r5 = r3.onWarmupCompleted(r9, r4)
                if (r5 != 0) goto L64
                java.lang.String r5 = r1.userData
                boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r6)
                if (r5 != 0) goto L69
            L64:
                java.lang.String r5 = r1.userData
                r3.onExtraCallback(r9, r4, r5)
            L69:
                r5 = 3
                boolean r7 = r3.onWarmupCompleted(r9, r5)
                if (r7 == 0) goto L71
                goto L8f
            L71:
                int r7 = viva.republica.toss.common.web.message.handlers.tossbank.ssenstone.SsenStoneOtacClient.OtacSdkResponse.onTransact
                int r7 = r7 + 107
                int r8 = r7 % 128
                viva.republica.toss.common.web.message.handlers.tossbank.ssenstone.SsenStoneOtacClient.OtacSdkResponse.getInterfaceDescriptor = r8
                int r7 = r7 % r4
                if (r7 != 0) goto L87
                java.lang.String r7 = r1.signValue
                boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r6)
                int r0 = r2 / 0
                if (r7 != 0) goto L94
                goto L8f
            L87:
                java.lang.String r0 = r1.signValue
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r6)
                if (r0 != 0) goto L94
            L8f:
                java.lang.String r0 = r1.signValue
                r3.onExtraCallback(r9, r5, r0)
            L94:
                r0 = 4
                boolean r5 = r3.onWarmupCompleted(r9, r0)
                if (r5 != 0) goto La3
                java.lang.String r5 = r1.secret
                boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r6)
                if (r5 != 0) goto La8
            La3:
                java.lang.String r5 = r1.secret
                r3.onExtraCallback(r9, r0, r5)
            La8:
                r0 = 5
                boolean r5 = r3.onWarmupCompleted(r9, r0)
                if (r5 != 0) goto Lc0
                int r5 = viva.republica.toss.common.web.message.handlers.tossbank.ssenstone.SsenStoneOtacClient.OtacSdkResponse.onTransact
                int r5 = r5 + 115
                int r7 = r5 % 128
                viva.republica.toss.common.web.message.handlers.tossbank.ssenstone.SsenStoneOtacClient.OtacSdkResponse.getInterfaceDescriptor = r7
                int r5 = r5 % r4
                java.lang.String r4 = r1.otac
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r6)
                if (r4 == r2) goto Lc5
            Lc0:
                java.lang.String r4 = r1.otac
                r3.onExtraCallback(r9, r0, r4)
            Lc5:
                r0 = 6
                boolean r4 = r3.onWarmupCompleted(r9, r0)
                if (r4 == r2) goto Ld4
                java.lang.String r2 = r1.errorCode
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r6)
                if (r2 != 0) goto Ld9
            Ld4:
                java.lang.String r1 = r1.errorCode
                r3.onExtraCallback(r9, r0, r1)
            Ld9:
                r9 = 0
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.common.web.message.handlers.tossbank.ssenstone.SsenStoneOtacClient.OtacSdkResponse.onWarmupCompleted(java.lang.Object[]):java.lang.Object");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ OtacSdkResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
            String str8;
            String str9;
            String str10;
            String str11;
            String str12 = (i & 1) != 0 ? "" : str;
            String str13 = (i & 2) != 0 ? "" : str2;
            if ((i & 4) != 0) {
                int i2 = onTransact + 71;
                getInterfaceDescriptor = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 2 % 2;
                }
                str8 = "";
            } else {
                str8 = str3;
            }
            if ((i & 8) != 0) {
                int i4 = onTransact + 49;
                int i5 = i4 % 128;
                getInterfaceDescriptor = i5;
                int i6 = i4 % 2;
                int i7 = i5 + 85;
                onTransact = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 2 % 2;
                }
                str9 = "";
            } else {
                str9 = str4;
            }
            String str14 = (i & 16) != 0 ? "" : str5;
            Object obj = null;
            if ((i & 32) != 0) {
                int i9 = getInterfaceDescriptor + 21;
                onTransact = i9 % 128;
                if (i9 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                str10 = "";
            } else {
                str10 = str6;
            }
            if ((i & 64) != 0) {
                int i10 = getInterfaceDescriptor + 83;
                onTransact = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
                str11 = "";
            } else {
                str11 = str7;
            }
            this(str12, str13, str8, str9, str14, str10, str11);
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor + 15;
            int i3 = i2 % 128;
            onTransact = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            String str = this.publicKey;
            int i4 = i3 + 61;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 != 0) {
                return str;
            }
            throw null;
        }

        private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
            long j;
            boolean z;
            int length;
            byte[] bArr;
            int i4;
            int i5 = 2 % 2;
            TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 43424), (KeyEvent.getMaxKeyCode() >> 16) + 42, 22439 - View.getDefaultSize(0, 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                int i6 = iIntValue == -1 ? 1 : 0;
                if (i6 == 0) {
                    j = -4629411779493505016L;
                } else {
                    byte[] bArr2 = onNavigationEvent;
                    if (bArr2 != null) {
                        int i7 = $10 + 45;
                        $11 = i7 % 128;
                        if (i7 % 2 == 0) {
                            length = bArr2.length;
                            bArr = new byte[length];
                            i4 = 1;
                        } else {
                            length = bArr2.length;
                            bArr = new byte[length];
                            i4 = 0;
                        }
                        while (i4 < length) {
                            Object[] objArr3 = {Integer.valueOf(bArr2[i4])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 12843), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 54, 2167 - TextUtils.getOffsetAfter("", 0), -299036574, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                            }
                            bArr[i4] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            i4++;
                        }
                        bArr2 = bArr;
                    }
                    if (bArr2 != null) {
                        byte[] bArr3 = onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallback)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "", 0, 0) + 43424), (-16777174) - Color.rgb(0, 0, 0), 22439 - Drawable.resolveOpacity(0, 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                        j = -4629411779493505016L;
                    } else {
                        j = -4629411779493505016L;
                        iIntValue = (short) (((short) (onExtraCallbackWithResult[i + ((int) (IAuthTabCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                    }
                }
                if (iIntValue > 0) {
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (IAuthTabCallback ^ j)) + i6;
                    Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onExtraCallback), sb};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), View.resolveSize(0, 0) + 86, View.resolveSizeAndState(0, 0, 0) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr4 = onNavigationEvent;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        for (int i8 = 0; i8 < length2; i8++) {
                            bArr5[i8] = (byte) (bArr4[i8] ^ (-4629411779493505016L));
                        }
                        bArr4 = bArr5;
                    }
                    if (bArr4 != null) {
                        z = true;
                    } else {
                        int i9 = $11 + 121;
                        $10 = i9 % 128;
                        int i10 = i9 % 2;
                        z = false;
                    }
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        if (z) {
                            int i11 = $11 + 125;
                            $10 = i11 % 128;
                            int i12 = i11 % 2;
                            byte[] bArr6 = onNavigationEvent;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            short[] sArr = onExtraCallbackWithResult;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        public final String onTransact() {
            int i = 2 % 2;
            int i2 = onTransact + 13;
            int i3 = i2 % 128;
            getInterfaceDescriptor = i3;
            int i4 = i2 % 2;
            String str = this.userData;
            int i5 = i3 + 19;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onTransact + 101;
            int i3 = i2 % 128;
            getInterfaceDescriptor = i3;
            int i4 = i2 % 2;
            String str = this.signValue;
            int i5 = i3 + 7;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor + 103;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            String str = this.secret;
            if (i3 != 0) {
                int i4 = 72 / 0;
            }
            return str;
        }

        public final String onExtraCallback() {
            String str;
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor + 5;
            int i3 = i2 % 128;
            onTransact = i3;
            if (i2 % 2 != 0) {
                str = this.otac;
                int i4 = 64 / 0;
            } else {
                str = this.otac;
            }
            int i5 = i3 + 59;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor + 33;
            int i3 = i2 % 128;
            onTransact = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.errorCode;
            int i4 = i3 + 33;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public final boolean asBinder() {
            boolean zBooleanValue;
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor + 29;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                zBooleanValue = ((Boolean) this.isSuccess$delegate.getValue()).booleanValue();
                int i3 = 61 / 0;
            } else {
                zBooleanValue = ((Boolean) this.isSuccess$delegate.getValue()).booleanValue();
            }
            int i4 = getInterfaceDescriptor + 93;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return zBooleanValue;
        }

        private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
            OtacSdkResponse otacSdkResponse = (OtacSdkResponse) objArr[0];
            int i = 2 % 2;
            int i2 = onTransact + 79;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            String str = otacSdkResponse.result;
            Object[] objArr2 = new Object[1];
            a((short) TextUtils.getOffsetBefore("", 0), (byte) (TextUtils.indexOf("", "", 0) + 82), (-1501282971) + (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 5394992 - ExpandableListView.getPackedPositionChild(0L), (-46) - TextUtils.indexOf((CharSequence) "", '0', 0), objArr2);
            boolean zEquals = StringsKt.equals(str, ((String) objArr2[0]).intern(), true);
            int i4 = getInterfaceDescriptor + 109;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                return Boolean.valueOf(zEquals);
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final boolean onExtraCallbackWithResult(OtacSdkResponse otacSdkResponse) throws Throwable {
            int i = 2 % 2;
            int i2 = onTransact + 5;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            String str = otacSdkResponse.result;
            Object[] objArr = new Object[1];
            a((short) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (byte) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 82), (-1501282970) + Gravity.getAbsoluteGravity(0, 0), 5394993 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getEdgeSlop() >> 16) - 45, objArr);
            boolean zEquals = StringsKt.equals(str, ((String) objArr[0]).intern(), true);
            int i4 = onTransact + 99;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 != 0) {
                return zEquals;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final boolean onExtraCallback(OtacSdkResponse otacSdkResponse) {
            int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
            int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
            int iOnWarmupCompleted3 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
            return ((Boolean) onExtraCallbackWithResult(-149032077, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted3, 149032077, new Object[]{otacSdkResponse}, iOnWarmupCompleted2, iOnWarmupCompleted)).booleanValue();
        }

        @JvmStatic
        public static final /* synthetic */ void IAuthTabCallback(OtacSdkResponse otacSdkResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
            int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
            int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
            int iOnWarmupCompleted3 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
            onExtraCallbackWithResult(648285698, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted3, -648285697, new Object[]{otacSdkResponse, vylVar, serialDescriptor}, iOnWarmupCompleted2, iOnWarmupCompleted);
        }

        static void IAuthTabCallbackDefault() {
            IAuthTabCallback = -46392686;
            onWarmupCompleted = -1538795460;
            onExtraCallback = 1542092330;
            onNavigationEvent = new byte[]{90, 84, 88, 90, -76, 88, -18, -33, 33, 47, -32, 63, -64, -52, 103, -58, 34, 10, -13, -15, -15, 18, -3, 4, 12, -87, 14, 49, -24, 28, -59, 56, -22, 20, -23, -28, -84, 29, 8, 8, 8, 8};
            IAuthTabCallbackStub = (char) 58071;
            asInterface = (char) 19524;
            IAuthTabCallbackDefault = (char) 33075;
            asBinder = (char) 20022;
        }
    }

    public final UST_API_SetCryptoKCMVPMode onWarmupCompleted(@NotNull Context context, @NotNull UST_CERT_ChangePrikeyPassword uST_CERT_ChangePrikeyPassword, @NotNull JsonObject jsonObject, @NotNull String str) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(uST_CERT_ChangePrikeyPassword, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            OtpCredential.Card cardIAuthTabCallback = UST_CERT_EncryptPrikey.onExtraCallbackWithResult.IAuthTabCallback(uST_CERT_ChangePrikeyPassword);
            if (cardIAuthTabCallback == null) {
                UST_API_SetCryptoKCMVPMode.onExtraCallback.onWarmupCompleted onwarmupcompleted = UST_API_SetCryptoKCMVPMode.onExtraCallback.onWarmupCompleted.IAuthTabCallback;
                int i2 = onTransact + 103;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                return onwarmupcompleted;
            }
            Object[] objArr = new Object[1];
            a(new char[]{13795}, (byte) (Color.argb(0, 0, 0, 0) + 18), Color.red(0) + 1, objArr);
            if (!Intrinsics.areEqual(getEmbedViewManager.onExtraCallbackWithResult(jsonObject, ((String) objArr[0]).intern()), cardIAuthTabCallback.onExtraCallbackWithResult())) {
                int i4 = asBinder + 123;
                onTransact = i4 % 128;
                if (i4 % 2 == 0) {
                    return UST_API_SetCryptoKCMVPMode.onExtraCallback.onExtraCallbackWithResult.onExtraCallbackWithResult;
                }
                UST_API_SetCryptoKCMVPMode.onExtraCallback.onExtraCallbackWithResult onextracallbackwithresult = UST_API_SetCryptoKCMVPMode.onExtraCallback.onExtraCallbackWithResult.onExtraCallbackWithResult;
                throw null;
            }
            UST_API_SetCryptoKCMVPMode uST_API_SetCryptoKCMVPModeOnExtraCallback = onExtraCallback(context, uST_CERT_ChangePrikeyPassword, cardIAuthTabCallback);
            if (!(uST_API_SetCryptoKCMVPModeOnExtraCallback instanceof UST_API_SetCryptoKCMVPMode.IAuthTabCallback)) {
                int i5 = asBinder + 47;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
                return uST_API_SetCryptoKCMVPModeOnExtraCallback;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            OtacManager otacManager = new OtacManager(context);
            String strOnWarmupCompleted = ((UST_API_SetCryptoKCMVPMode.IAuthTabCallback) uST_API_SetCryptoKCMVPModeOnExtraCallback).onWarmupCompleted();
            String string = jsonObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            OtacSdkResponse otacSdkResponseOnExtraCallback = onExtraCallback(UST_CERT_Finalize.IAuthTabCallback(otacManager, strOnWarmupCompleted, string, String.valueOf(jCurrentTimeMillis), null, str, onExtraCallback()));
            if (otacSdkResponseOnExtraCallback.asBinder()) {
                return new UST_API_SetCryptoKCMVPMode.IAuthTabCallback(otacSdkResponseOnExtraCallback.onExtraCallback(), null, null, 6, null);
            }
            UST_API_SetCryptoKCMVPMode.onExtraCallback.C0004onExtraCallback c0004onExtraCallback = new UST_API_SetCryptoKCMVPMode.onExtraCallback.C0004onExtraCallback(otacSdkResponseOnExtraCallback.onWarmupCompleted(), null, 2, null);
            int i7 = asBinder + 91;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
            return c0004onExtraCallback;
        } catch (Exception e) {
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr2 = new Object[1];
            a(new char[]{'\n', 3, 15, '\b', 14, '\f', 0, 6, 16, '\b', '\f', 6, 7, 19, 4, 18, 15, '\b', 13903}, (byte) (TextUtils.getOffsetBefore("", 0) + 97), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 18, objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            a(new char[]{16, 23, 1, 6, 1, 21, 0, 6, 18, 6, 15, '\b', 16, 23, 6, '\f', 19, 18, 6, 22, 11, 7, '\f', 6, 13889}, (byte) (View.MeasureSpec.getSize(0) + 72), TextUtils.getCapsMode("", 0, 0) + 25, objArr3);
            ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, strIntern, ((String) objArr3[0]).intern(), e, (Map) null, 8, (Object) null);
            return new UST_API_SetCryptoKCMVPMode.onExtraCallback.C0004onExtraCallback("", e.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(int r22, int r23, char[] r24, int r25, boolean r26, java.lang.Object[] r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.common.web.message.handlers.tossbank.ssenstone.SsenStoneOtacClient.b(int, int, char[], int, boolean, java.lang.Object[]):void");
    }

    public final UST_API_SetCryptoKCMVPMode IAuthTabCallback(@NotNull Context context, @NotNull UST_CERT_ChangePrikeyPassword uST_CERT_ChangePrikeyPassword, @NotNull String str, @NotNull String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 111;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(uST_CERT_ChangePrikeyPassword, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        try {
            OtpCredential.Pin pinOnNavigationEvent = UST_CERT_EncryptPrikey.onExtraCallbackWithResult.onNavigationEvent(uST_CERT_ChangePrikeyPassword);
            if (pinOnNavigationEvent == null) {
                return UST_API_SetCryptoKCMVPMode.onExtraCallback.onWarmupCompleted.IAuthTabCallback;
            }
            UST_API_SetCryptoKCMVPMode uST_API_SetCryptoKCMVPModeOnExtraCallback = onExtraCallback(context, uST_CERT_ChangePrikeyPassword, pinOnNavigationEvent);
            if (uST_API_SetCryptoKCMVPModeOnExtraCallback instanceof UST_API_SetCryptoKCMVPMode.IAuthTabCallback) {
                OtacSdkResponse otacSdkResponseOnExtraCallback = onExtraCallback(UST_CERT_Finalize.onExtraCallbackWithResult(new OtacManager(context), uST_CERT_ChangePrikeyPassword.onExtraCallbackWithResult(), uST_CERT_ChangePrikeyPassword.onWarmupCompleted(), ((UST_API_SetCryptoKCMVPMode.IAuthTabCallback) uST_API_SetCryptoKCMVPModeOnExtraCallback).onWarmupCompleted(), str, String.valueOf(System.currentTimeMillis() / 1000), null, str2, onExtraCallback()));
                return otacSdkResponseOnExtraCallback.asBinder() ? new UST_API_SetCryptoKCMVPMode.IAuthTabCallback(otacSdkResponseOnExtraCallback.onExtraCallback(), null, null, 6, null) : new UST_API_SetCryptoKCMVPMode.onExtraCallback.C0004onExtraCallback(otacSdkResponseOnExtraCallback.onWarmupCompleted(), null, 2, null);
            }
            int i4 = onTransact + 25;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return uST_API_SetCryptoKCMVPModeOnExtraCallback;
        } catch (Exception e) {
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr = new Object[1];
            a(new char[]{'\n', 3, 15, '\b', 14, '\f', 0, 6, 16, '\b', '\f', 6, 7, 19, 4, 18, 15, '\b', 13903}, (byte) (Color.blue(0) + 97), View.MeasureSpec.getSize(0) + 19, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            b((ViewConfiguration.getFadingEdgeLength() >> 16) + 5, TextUtils.lastIndexOf("", '0', 0) + 25, new char[]{16, '\r', 16, 16, 3, 1, 65535, 18, 65517, '\f', 7, 65518, 3, 18, 65535, 16, 3, '\f', 3, 5, 65470, '\f', '\r', 65470}, 109 - Color.alpha(0), true, objArr2);
            ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, strIntern, ((String) objArr2[0]).intern(), e, (Map) null, 8, (Object) null);
            return new UST_API_SetCryptoKCMVPMode.onExtraCallback.C0004onExtraCallback("", e.getMessage());
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final UST_API_SetCryptoKCMVPMode onExtraCallback(Context context, UST_CERT_ChangePrikeyPassword uST_CERT_ChangePrikeyPassword, OtpCredential otpCredential) throws Throwable {
        int i = 2 % 2;
        if (otpCredential instanceof OtpCredential.Pin) {
            return new UST_API_SetCryptoKCMVPMode.IAuthTabCallback(((OtpCredential.Pin) otpCredential).onExtraCallbackWithResult(), null, null, 6, null);
        }
        if (otpCredential instanceof OtpCredential.Card.Stored) {
            UST_API_SetCryptoKCMVPMode.IAuthTabCallback iAuthTabCallback = new UST_API_SetCryptoKCMVPMode.IAuthTabCallback(((OtpCredential.Card.Stored) otpCredential).onNavigationEvent(), null, null, 6, null);
            int i2 = asBinder + 111;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback;
        }
        if (!(otpCredential instanceof OtpCredential.Card.PendingMigration_5_255_256)) {
            throw new NoWhenBranchMatchedException();
        }
        OtpCredential.Card.PendingMigration_5_255_256 pendingMigration_5_255_256 = (OtpCredential.Card.PendingMigration_5_255_256) otpCredential;
        UST_API_SetCryptoKCMVPMode uST_API_SetCryptoKCMVPModeOnExtraCallback = onExtraCallback(context, uST_CERT_ChangePrikeyPassword, UST_CERT_DecryptPrikey.Card, pendingMigration_5_255_256.onNavigationEvent(), pendingMigration_5_255_256.onExtraCallback());
        if (uST_API_SetCryptoKCMVPModeOnExtraCallback instanceof UST_API_SetCryptoKCMVPMode.IAuthTabCallback) {
            UST_CERT_EncryptPrikey.onExtraCallbackWithResult.onExtraCallbackWithResult(uST_CERT_ChangePrikeyPassword, new OtpCredential.Card.Stored(pendingMigration_5_255_256.onExtraCallbackWithResult(), ((UST_API_SetCryptoKCMVPMode.IAuthTabCallback) uST_API_SetCryptoKCMVPModeOnExtraCallback).onWarmupCompleted()));
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr = new Object[1];
            a(new char[]{'\n', 3, 15, '\b', 14, '\f', 0, 6, 16, '\b', '\f', 6, 7, 19, 4, 18, 15, '\b', 13903}, (byte) (96 - ((byte) KeyEvent.getModifierMetaStateMask())), TextUtils.indexOf((CharSequence) "", '0', 0) + 20, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            b((ViewConfiguration.getFadingEdgeLength() >> 16) + 7, 53 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), new char[]{65391, 65406, 65387, 65404, 65393, 65395, 65399, 65390, 65391, 65404, 65401, 65406, 65373, 65336, 65390, 65404, 65387, 65357, 65322, 8348, 65322, 65344, 65343, 65340, 65385, 65343, 65343, 65340, 65385, 65343, 65385, 65400, 65401, 65395, 65406, 65387, 65404, 65393, 65395, 65367, 65393, 65400, 65395, 65390, 65400, 65391, 65370, 65336, 65390, 65404, 65387, 65357, 65322, 65390}, 257 - TextUtils.indexOf("", "", 0), true, objArr2);
            ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{convertFloatArrayToByteArray, strIntern, ((String) objArr2[0]).intern(), null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        }
        int i4 = onTransact + 115;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return uST_API_SetCryptoKCMVPModeOnExtraCallback;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final UST_API_SetCryptoKCMVPMode onExtraCallback(Context context, UST_CERT_ChangePrikeyPassword uST_CERT_ChangePrikeyPassword, UST_CERT_DecryptPrikey uST_CERT_DecryptPrikey, String str, String str2) throws Throwable {
        String strOnWarmupCompleted;
        int i = 2 % 2;
        try {
            OtacManager otacManager = new OtacManager(context);
            int i2 = IAuthTabCallback.onWarmupCompleted[uST_CERT_DecryptPrikey.ordinal()];
            if (i2 == 1) {
                strOnWarmupCompleted = UST_CERT_Finalize.onWarmupCompleted(otacManager, uST_CERT_ChangePrikeyPassword.onExtraCallbackWithResult(), uST_CERT_ChangePrikeyPassword.onWarmupCompleted(), str, str2);
                int i3 = asBinder + 53;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int i5 = asBinder + 29;
                onTransact = i5 % 128;
                if (i5 % 2 != 0) {
                    strOnWarmupCompleted = UST_CERT_Finalize.onNavigationEvent(otacManager, str, str2);
                    int i6 = 24 / 0;
                } else {
                    strOnWarmupCompleted = UST_CERT_Finalize.onNavigationEvent(otacManager, str, str2);
                }
            }
            OtacSdkResponse otacSdkResponseOnExtraCallback = onExtraCallback(strOnWarmupCompleted);
            return otacSdkResponseOnExtraCallback.asBinder() ? new UST_API_SetCryptoKCMVPMode.IAuthTabCallback(otacSdkResponseOnExtraCallback.IAuthTabCallback(), null, null, 6, null) : new UST_API_SetCryptoKCMVPMode.onExtraCallback.onNavigationEvent(otacSdkResponseOnExtraCallback.onWarmupCompleted(), null, 2, null);
        } catch (Exception e) {
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr = new Object[1];
            a(new char[]{'\n', 3, 15, '\b', 14, '\f', 0, 6, 16, '\b', '\f', 6, 7, 19, 4, 18, 15, '\b', 13903}, (byte) (96 - TextUtils.indexOf((CharSequence) "", '0')), View.MeasureSpec.getMode(0) + 19, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a(new char[]{16, 23, 1, 6, 1, 21, 0, 6, 17, 15, '\t', 15, 14, 16, '\b', 2, 24, '\t', 16, '\b', '\f', 6, 13848}, (byte) (31 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), View.resolveSizeAndState(0, 0, 0) + 23, objArr2);
            ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, strIntern, ((String) objArr2[0]).intern(), e, (Map) null, 8, (Object) null);
            return new UST_API_SetCryptoKCMVPMode.onExtraCallback.onNavigationEvent("", e.getMessage());
        }
    }

    private final String onExtraCallback() throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = onTransact + 31;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = new Object[1];
            a(new char[]{13804}, (byte) (28 % (PointF.length(1.0f, 0.0f) > 1.0f ? 1 : (PointF.length(1.0f, 0.0f) == 1.0f ? 0 : -1))), 0 % Color.red(1), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(new char[]{13804}, (byte) (65 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), Color.red(0) + 1, objArr2);
            obj = objArr2[0];
        }
        return ((String) obj).intern();
    }

    private final OtacSdkResponse onExtraCallback(String str) {
        Object obj;
        int i = 2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            wie2 wie2VarOnExtraCallback = EndMotionInteraction.onExtraCallback();
            if (str == null) {
                int i2 = onTransact + 43;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                str = "";
            }
            wie2VarOnExtraCallback.onExtraCallback();
            obj = Result.constructor-impl((OtacSdkResponse) wie2VarOnExtraCallback.onExtraCallback(OtacSdkResponse.Companion.serializer(), str));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        OtacSdkResponse otacSdkResponse = new OtacSdkResponse((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
        if (Result.onExtraCallback(obj)) {
            int i4 = asBinder + 43;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            obj = otacSdkResponse;
        }
        return (OtacSdkResponse) obj;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onExtraCallbackWithResult;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = $10 + 31;
                $11 = i6 % 128;
                int i7 = i6 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), 26 - KeyEvent.normalizeMetaState(0), TextUtils.indexOf((CharSequence) "", '0', 0) + 23140, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i5++;
                    i3 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), View.resolveSize(0, 0) + 26, 23139 - TextUtils.indexOf("", "", 0, 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i8 = $10 + 49;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                i2 = i + 7;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i9 = $10 + 75;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                int i11 = $11 + 57;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.blue(0) + 24824), ExpandableListView.getPackedPositionChild(0L) + 75, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 8087, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        try {
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", ""), 30 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 19489, 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                            int i14 = $10 + 45;
                            $11 = i14 % 128;
                            int i15 = i14 % 2;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            int i16 = $11 + 99;
                            $10 = i16 % 128;
                            int i17 = i16 % 2;
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i18 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i19 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i18];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i19];
                        } else {
                            int i20 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i21 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i20];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i21];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                int i22 = $11 + 33;
                $10 = i22 % 128;
                if (i22 % 2 != 0) {
                    int i23 = 3 % 3;
                }
                obj2 = obj;
            }
        }
        int i24 = $11 + 15;
        $10 = i24 % 128;
        int i25 = i24 % 2;
        for (int i26 = 0; i26 < i; i26++) {
            cArr4[i26] = (char) (cArr4[i26] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    static void onWarmupCompleted() {
        onExtraCallbackWithResult = new char[]{64960, 64988, 64966, 64991, 64969, 64989, 65020, 64978, 64980, 64976, 64985, 64967, 64983, 64992, 64962, 64964, 64915, 65008, 64982, 64986, 64963, 64961, 64898, 64965, 65016};
        onExtraCallback = (char) 51244;
        IAuthTabCallback = 478308898;
    }
}
