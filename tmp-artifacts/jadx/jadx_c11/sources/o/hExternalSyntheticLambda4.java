package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.security.PublicKey;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class hExternalSyntheticLambda4 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ hExternalSyntheticLambda4[] $VALUES;
    public static final hExternalSyntheticLambda4 AU_CORE;
    public static final onExtraCallback Companion;
    public static final hExternalSyntheticLambda4 EU_CORE;
    private static int IAuthTabCallback = 0;
    public static final hExternalSyntheticLambda4 KR_BANK;
    public static final hExternalSyntheticLambda4 KR_CORE;
    private static int onExtraCallback = 1;
    private static long onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String baseUrl;
    private final String bundleBaseUrl;
    private final String company;
    private final String regionCode;
    private final PublicKey verificationKey;

    private static final /* synthetic */ hExternalSyntheticLambda4[] $values() {
        hExternalSyntheticLambda4[] hexternalsyntheticlambda4Arr;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            hExternalSyntheticLambda4 hexternalsyntheticlambda4 = KR_CORE;
            hExternalSyntheticLambda4 hexternalsyntheticlambda42 = KR_BANK;
            hExternalSyntheticLambda4 hexternalsyntheticlambda43 = AU_CORE;
            hExternalSyntheticLambda4 hexternalsyntheticlambda44 = EU_CORE;
            hexternalsyntheticlambda4Arr = new hExternalSyntheticLambda4[]{hexternalsyntheticlambda4, hexternalsyntheticlambda42};
            hexternalsyntheticlambda4Arr[3] = hexternalsyntheticlambda43;
            hexternalsyntheticlambda4Arr[3] = hexternalsyntheticlambda44;
        } else {
            hexternalsyntheticlambda4Arr = new hExternalSyntheticLambda4[]{KR_CORE, KR_BANK, AU_CORE, EU_CORE};
        }
        int i4 = i3 + 23;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 46 / 0;
        }
        return hexternalsyntheticlambda4Arr;
    }

    public static EnumEntries<hExternalSyntheticLambda4> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        throw null;
    }

    public static hExternalSyntheticLambda4 valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        hExternalSyntheticLambda4 hexternalsyntheticlambda4 = (hExternalSyntheticLambda4) Enum.valueOf(hExternalSyntheticLambda4.class, str);
        if (i3 != 0) {
            return hexternalsyntheticlambda4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static hExternalSyntheticLambda4[] values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        hExternalSyntheticLambda4[] hexternalsyntheticlambda4Arr = $VALUES;
        if (i3 == 0) {
            return (hExternalSyntheticLambda4[]) hexternalsyntheticlambda4Arr.clone();
        }
        throw null;
    }

    private hExternalSyntheticLambda4(String str, int i, String str2, String str3, String str4, String str5, PublicKey publicKey) {
        this.company = str2;
        this.regionCode = str3;
        this.bundleBaseUrl = str4;
        this.baseUrl = str5;
        this.verificationKey = publicKey;
    }

    public final String getBaseUrl() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 111;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.baseUrl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getBundleBaseUrl() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 31;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.bundleBaseUrl;
        int i5 = i3 + 101;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getCompany() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.company;
        int i5 = i3 + 21;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getRegionCode() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 75;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.regionCode;
            int i4 = 71 / 0;
        } else {
            str = this.regionCode;
        }
        int i5 = i2 + 73;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final PublicKey getVerificationKey() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 75;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        PublicKey publicKey = this.verificationKey;
        int i5 = i2 + 25;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return publicKey;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onExtraCallbackWithResult();
        getPricingPhaseList getpricingphaselist = getPricingPhaseList.KR;
        String code = getpricingphaselist.getCode();
        String strWarmup = zzaj.onNavigationEvent().warmup();
        String strUpdateVisuals = zzaj.onNavigationEvent().updateVisuals();
        PublicKey publicKeyOnExtraCallbackWithResult = hExternalSyntheticLambda6.onExtraCallbackWithResult(zzaj.onNavigationEvent().ICustomTabsServiceStub());
        Object[] objArr = new Object[1];
        a(new char[]{62084, 24403, 43299, 64275}, Color.argb(0, 0, 0, 0) + 44507, objArr);
        KR_CORE = new hExternalSyntheticLambda4("KR_CORE", 0, ((String) objArr[0]).intern(), code, strWarmup, strUpdateVisuals, publicKeyOnExtraCallbackWithResult);
        KR_BANK = new hExternalSyntheticLambda4("KR_BANK", 1, "bank", getpricingphaselist.getCode(), zzaj.onNavigationEvent().ICustomTabsServiceDefault(), zzaj.onNavigationEvent().receiveFile(), hExternalSyntheticLambda6.onExtraCallbackWithResult(zzaj.onNavigationEvent().validateRelationship()));
        String code2 = getPricingPhaseList.AU.getCode();
        String strRequestPostMessageChannel = zzaj.onNavigationEvent().requestPostMessageChannel();
        String strPrefetchWithMultipleUrls = zzaj.onNavigationEvent().prefetchWithMultipleUrls();
        PublicKey publicKeyOnExtraCallbackWithResult2 = hExternalSyntheticLambda6.onExtraCallbackWithResult(zzaj.onNavigationEvent().setEngagementSignalsCallback());
        Object[] objArr2 = new Object[1];
        a(new char[]{62084, 24403, 43299, 64275}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 44507, objArr2);
        AU_CORE = new hExternalSyntheticLambda4("AU_CORE", 2, ((String) objArr2[0]).intern(), code2, strRequestPostMessageChannel, strPrefetchWithMultipleUrls, publicKeyOnExtraCallbackWithResult2);
        String code3 = getPricingPhaseList.EU.getCode();
        String strICustomTabsService_Parcel = zzaj.onNavigationEvent().ICustomTabsService_Parcel();
        String strICustomTabsServiceStubProxy = zzaj.onNavigationEvent().ICustomTabsServiceStubProxy();
        PublicKey publicKeyOnExtraCallbackWithResult3 = hExternalSyntheticLambda6.onExtraCallbackWithResult(zzaj.onNavigationEvent().writeTypedList());
        Object[] objArr3 = new Object[1];
        a(new char[]{62084, 24403, 43299, 64275}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 44507, objArr3);
        EU_CORE = new hExternalSyntheticLambda4("EU_CORE", 3, ((String) objArr3[0]).intern(), code3, strICustomTabsService_Parcel, strICustomTabsServiceStubProxy, publicKeyOnExtraCallbackWithResult3);
        hExternalSyntheticLambda4[] hexternalsyntheticlambda4Arr$values = $values();
        $VALUES = hexternalsyntheticlambda4Arr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(hexternalsyntheticlambda4Arr$values);
        Companion = new onExtraCallback(null);
        int i = onExtraCallback + 121;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            int i2 = 68 / 0;
        }
    }

    public static final class onExtraCallback {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final hExternalSyntheticLambda4 IAuthTabCallback(@NotNull String str, @NotNull String str2) {
            Object next;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 75;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Iterator it = hExternalSyntheticLambda4.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    int i4 = IAuthTabCallback + 69;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    next = null;
                    break;
                }
                next = it.next();
                hExternalSyntheticLambda4 hexternalsyntheticlambda4 = (hExternalSyntheticLambda4) next;
                if (Intrinsics.areEqual(hexternalsyntheticlambda4.getRegionCode(), str) && Intrinsics.areEqual(hexternalsyntheticlambda4.getCompany(), str2)) {
                    int i6 = onWarmupCompleted + 45;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    break;
                }
            }
            hExternalSyntheticLambda4 hexternalsyntheticlambda42 = (hExternalSyntheticLambda4) next;
            if (hexternalsyntheticlambda42 != null) {
                return hexternalsyntheticlambda42;
            }
            throw new IllegalArgumentException("Cannot find appropriate manifest object region: " + str + " company: " + str2);
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $11 + 61;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 25, 19627 - TextUtils.getCapsMode("", 0, 0), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onExtraCallbackWithResult ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 59 - View.MeasureSpec.getSize(0), 6383 - Gravity.getAbsoluteGravity(0, 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i6 = $11 + 29;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 5 % 5;
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 59 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 6382, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        String str = new String(cArr2);
        int i8 = $10 + 105;
        $11 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }

    static void onExtraCallbackWithResult() {
        onExtraCallbackWithResult = 6011039790403712976L;
    }
}
