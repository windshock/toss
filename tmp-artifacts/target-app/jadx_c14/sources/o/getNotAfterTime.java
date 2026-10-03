package o;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.getNotAfterTime;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import viva.republica.toss.network.model.SchemeManagerInfoResponse;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getNotAfterTime {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char ICustomTabsCallback = 1614;
    private static int extraCallback = 0;
    private static char extraCallbackWithResult = 9634;
    private static int onMinimized = 1;
    private static char readTypedObject = 5756;
    private static char writeTypedObject = 16745;
    private final Map<String, String> IAuthTabCallback;
    private final SchemeManagerInfoResponse IAuthTabCallbackDefault;
    private final getPricingPhaseList IAuthTabCallbackStub;
    private final String IAuthTabCallbackStubProxy;
    private final Long IAuthTabCallback_Parcel;
    private final Lazy access000;
    private final Lazy access100;
    private final Map<String, String> asBinder;
    private final String asInterface;
    private final String getInterfaceDescriptor;
    private final Lazy onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final boolean onTransact;
    private final Enum onWarmupCompleted;

    public static /* synthetic */ ConstraintsSizeResolverExternalSyntheticLambda0 IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = extraCallback + 73;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback_Parcel();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ConstraintsSizeResolverExternalSyntheticLambda0 constraintsSizeResolverExternalSyntheticLambda0IAuthTabCallback_Parcel = IAuthTabCallback_Parcel();
        int i3 = extraCallback + 15;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        return constraintsSizeResolverExternalSyntheticLambda0IAuthTabCallback_Parcel;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = i6 | i7;
        int i9 = (~(i4 | i5)) | i6;
        int i10 = ~i4;
        int i11 = (~(i5 | i4 | i6)) | (~(i7 | i10)) | (~((~i6) | i10));
        int i12 = i4 + i6 + i2 + (1609234610 * i) + (1307081305 * i3);
        int i13 = i12 * i12;
        int i14 = (((-490261092) * i4) - 1772093440) + (1576585830 * i6) + (i8 * 1033423461) + ((-2066846922) * i9) + (1033423461 * i11) + (543162368 * i2) + ((-2101346304) * i) + (23068672 * i3) + ((-2103967744) * i13);
        int i15 = (i4 * 273352028) + 245730370 + (i6 * 273352646) + (i8 * 309) + (i9 * (-618)) + (i11 * 309) + (i2 * 273352337) + (i * (-770635566)) + (i3 * (-73506199)) + (i13 * (-2011693056));
        int i16 = i14 + (i15 * i15 * 1080557568);
        if (i16 == 1) {
            return onExtraCallback(objArr);
        }
        if (i16 != 2) {
            return onExtraCallbackWithResult(objArr);
        }
        int i17 = 2 % 2;
        int i18 = extraCallback + 33;
        onMinimized = i18 % 128;
        int i19 = i18 % 2;
        long jOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i20 = onMinimized + 63;
        extraCallback = i20 % 128;
        int i21 = i20 % 2;
        return Long.valueOf(jOnExtraCallbackWithResult);
    }

    public static /* synthetic */ String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onMinimized + 83;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return access000();
        }
        access000();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public getNotAfterTime(@NotNull String str, @NotNull String str2, @NotNull Enum r14, @Nullable Long l, @Nullable SchemeManagerInfoResponse schemeManagerInfoResponse, @NotNull getPricingPhaseList getpricingphaselist, @Nullable String str3, @NotNull Map<String, String> map, @NotNull String str4, @NotNull Map<String, String> map2) {
        String str5;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(r14, "");
        Intrinsics.checkNotNullParameter(getpricingphaselist, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(map2, "");
        this.IAuthTabCallbackStubProxy = str;
        this.onExtraCallbackWithResult = str2;
        this.onWarmupCompleted = r14;
        this.IAuthTabCallback_Parcel = l;
        this.IAuthTabCallbackDefault = schemeManagerInfoResponse;
        this.IAuthTabCallbackStub = getpricingphaselist;
        this.asInterface = str3;
        this.IAuthTabCallback = map;
        this.getInterfaceDescriptor = str4;
        this.asBinder = map2;
        this.access100 = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.common.DebugInfo$$ExternalSyntheticLambda0
            public final Object invoke() {
                return getNotAfterTime.IAuthTabCallback();
            }
        });
        this.access000 = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.common.DebugInfo$$ExternalSyntheticLambda1
            public final Object invoke() {
                return getNotAfterTime.onWarmupCompleted();
            }
        });
        this.onExtraCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.common.DebugInfo$$ExternalSyntheticLambda2
            public final Object invoke() {
                int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                return Long.valueOf(((Long) getNotAfterTime.onExtraCallback(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2, new Object[0], VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 2130617299, iIAuthTabCallback, -2130617297)).longValue());
            }
        });
        if (zzaj.onNavigationEvent().RemoteActionCompatParcelizer()) {
            str5 = "Alpha";
            int i = onMinimized + 3;
            extraCallback = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } else if (zzaj.onNavigationEvent().MediaDescriptionCompat()) {
            int i4 = extraCallback + 91;
            onMinimized = i4 % 128;
            if (i4 % 2 == 0) {
                zzaj.onNavigationEvent().MediaBrowserCompatMediaItem();
                throw null;
            }
            str5 = zzaj.onNavigationEvent().MediaBrowserCompatMediaItem() ? "QA Production" : "Production";
        } else {
            int i5 = 2 % 2;
            str5 = "Other";
        }
        this.onNavigationEvent = str5;
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(953707182);
        this.onTransact = r14 == ((Field) (objOnExtraCallback == null ? BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getMaxKeyCode() >> 16), 34 - (Process.myTid() >> 22), Color.red(0) + 7094, 160994366, false, "INVEST", (Class[]) null) : objOnExtraCallback)).get(null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getNotAfterTime(String str, String str2, Enum r18, Long l, SchemeManagerInfoResponse schemeManagerInfoResponse, getPricingPhaseList getpricingphaselist, String str3, Map map, String str4, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Long l2;
        SchemeManagerInfoResponse schemeManagerInfoResponse2;
        String str5;
        Map mapOnNavigationEvent;
        String str6;
        Object obj = null;
        if ((i & 8) != 0) {
            int i2 = extraCallback + 123;
            int i3 = i2 % 128;
            onMinimized = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            int i4 = i3 + 33;
            extraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
            l2 = null;
        } else {
            l2 = l;
        }
        if ((i & 16) != 0) {
            int i6 = extraCallback + 59;
            onMinimized = i6 % 128;
            if (i6 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i7 = 2 % 2;
            schemeManagerInfoResponse2 = null;
        } else {
            schemeManagerInfoResponse2 = schemeManagerInfoResponse;
        }
        if ((i & 64) != 0) {
            int i8 = extraCallback + 59;
            onMinimized = i8 % 128;
            int i9 = i8 % 2;
            str5 = null;
        } else {
            str5 = str3;
        }
        if ((i & 128) != 0) {
            int i10 = extraCallback + 1;
            onMinimized = i10 % 128;
            int i11 = i10 % 2;
            mapOnNavigationEvent = access8100.onNavigationEvent();
        } else {
            mapOnNavigationEvent = map;
        }
        if ((i & 256) != 0) {
            int i12 = 2 % 2;
            str6 = "";
        } else {
            str6 = str4;
        }
        this(str, str2, r18, l2, schemeManagerInfoResponse2, getpricingphaselist, str5, mapOnNavigationEvent, str6, (i & 512) != 0 ? access8100.onNavigationEvent() : map2);
    }

    private final ConstraintsSizeResolverExternalSyntheticLambda0 IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = extraCallback + 23;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        ConstraintsSizeResolverExternalSyntheticLambda0 constraintsSizeResolverExternalSyntheticLambda0 = (ConstraintsSizeResolverExternalSyntheticLambda0) this.access100.getValue();
        int i4 = onMinimized + 23;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return constraintsSizeResolverExternalSyntheticLambda0;
        }
        throw null;
    }

    private static final ConstraintsSizeResolverExternalSyntheticLambda0 IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onMinimized + 79;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Response response = Response.onNavigationEvent;
            ConstraintsSizeResolverExternalSyntheticLambda0 constraintsSizeResolverExternalSyntheticLambda0IAuthTabCallback_Parcel = ((LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0.class)).IAuthTabCallback_Parcel();
            int i3 = onMinimized + 41;
            extraCallback = i3 % 128;
            int i4 = i3 % 2;
            return constraintsSizeResolverExternalSyntheticLambda0IAuthTabCallback_Parcel;
        }
        Response response2 = Response.onNavigationEvent;
        ((LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0.class)).IAuthTabCallback_Parcel();
        throw null;
    }

    private final String onTransact() {
        int i = 2 % 2;
        int i2 = onMinimized + 41;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.access000.getValue();
        if (i3 == 0) {
            return str;
        }
        throw null;
    }

    private static final String access000() {
        int i = 2 % 2;
        int i2 = extraCallback + 35;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Response response = Response.onNavigationEvent;
        String strIAuthTabCallback = ((startRearDisplayPresentationSession) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), startRearDisplayPresentationSession.class)).IAuthTabCallbackStub().IAuthTabCallback();
        int i4 = extraCallback + 53;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return strIAuthTabCallback;
    }

    private final long asBinder() {
        int i = 2 % 2;
        int i2 = onMinimized + 87;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        long jLongValue = ((Number) this.onExtraCallback.getValue()).longValue();
        int i4 = onMinimized + 51;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return jLongValue;
    }

    private static final long onExtraCallbackWithResult() {
        PackageManager packageManager;
        String packageName;
        int i = 2 % 2;
        int i2 = extraCallback + 57;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            UserChoiceBillingListener userChoiceBillingListener = UserChoiceBillingListener.onExtraCallback;
            packageManager = userChoiceBillingListener.onExtraCallback().getPackageManager();
            packageName = userChoiceBillingListener.onExtraCallback().getPackageName();
        } else {
            UserChoiceBillingListener userChoiceBillingListener2 = UserChoiceBillingListener.onExtraCallback;
            packageManager = userChoiceBillingListener2.onExtraCallback().getPackageManager();
            packageName = userChoiceBillingListener2.onExtraCallback().getPackageName();
        }
        long jOnNavigationEvent = EncoderImplByteBufferInputExternalSyntheticLambda4.onNavigationEvent(packageManager.getPackageInfo(packageName, 0));
        int i3 = onMinimized + 3;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        return jOnNavigationEvent;
    }

    private final String asInterface() {
        String strIAuthTabCallback;
        String strOnNavigationEvent;
        int i = 2 % 2;
        SchemeManagerInfoResponse schemeManagerInfoResponse = this.IAuthTabCallbackDefault;
        Object obj = null;
        if (schemeManagerInfoResponse != null) {
            strIAuthTabCallback = schemeManagerInfoResponse.IAuthTabCallback();
            int i2 = onMinimized + 7;
            extraCallback = i2 % 128;
            int i3 = i2 % 2;
        } else {
            strIAuthTabCallback = null;
        }
        if (strIAuthTabCallback == null) {
            SchemeManagerInfoResponse schemeManagerInfoResponse2 = this.IAuthTabCallbackDefault;
            if (schemeManagerInfoResponse2 != null) {
                int i4 = onMinimized + 87;
                extraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    schemeManagerInfoResponse2.onNavigationEvent();
                    throw null;
                }
                strOnNavigationEvent = schemeManagerInfoResponse2.onNavigationEvent();
            } else {
                strOnNavigationEvent = null;
            }
            if (strOnNavigationEvent == null) {
                return "schemeId가 없어요. 매핑할 수 있도록 PPT팀(#team-product-platform-request)에 알려주세요. 🙏";
            }
        }
        String strOnNavigationEvent2 = this.IAuthTabCallbackDefault.onNavigationEvent();
        String str = "없음. 매핑할 수 있도록 PPT팀(#team-product-platform-request)에 알려주세요. 🙏";
        if (strOnNavigationEvent2 == null) {
            strOnNavigationEvent2 = "없음. 매핑할 수 있도록 PPT팀(#team-product-platform-request)에 알려주세요. 🙏";
        }
        String strIAuthTabCallback2 = this.IAuthTabCallbackDefault.IAuthTabCallback();
        if (strIAuthTabCallback2 != null) {
            int i5 = onMinimized + 23;
            extraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            str = strIAuthTabCallback2;
        }
        return StringsKt.trimIndent("\n                [담당팀: " + strOnNavigationEvent2 + "]\n                [담당자: " + str + "]\n            ");
    }

    public final String onExtraCallback() {
        String strOnNavigationEvent;
        int i = 2 % 2;
        int i2 = extraCallback + 59;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            SchemeManagerInfoResponse schemeManagerInfoResponse = this.IAuthTabCallbackDefault;
            if ((schemeManagerInfoResponse != null ? schemeManagerInfoResponse.IAuthTabCallback() : null) == null) {
                SchemeManagerInfoResponse schemeManagerInfoResponse2 = this.IAuthTabCallbackDefault;
                if (schemeManagerInfoResponse2 != null) {
                    int i3 = onMinimized + 125;
                    extraCallback = i3 % 128;
                    if (i3 % 2 != 0) {
                        schemeManagerInfoResponse2.onNavigationEvent();
                        throw null;
                    }
                    strOnNavigationEvent = schemeManagerInfoResponse2.onNavigationEvent();
                } else {
                    strOnNavigationEvent = null;
                }
                if (strOnNavigationEvent == null) {
                    return null;
                }
            }
            String strOnNavigationEvent2 = this.IAuthTabCallbackDefault.onNavigationEvent();
            if (strOnNavigationEvent2 == null) {
                int i4 = onMinimized + 1;
                extraCallback = i4 % 128;
                int i5 = i4 % 2;
                strOnNavigationEvent2 = "N/A";
            }
            String strIAuthTabCallback = this.IAuthTabCallbackDefault.IAuthTabCallback();
            return "[" + strOnNavigationEvent2 + " | " + (strIAuthTabCallback != null ? strIAuthTabCallback : "N/A") + "]";
        }
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        int i4 = $11 + 45;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $10 + 79;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (extraCallbackWithResult ^ 1094535280733222934L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(readTypedObject);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char c3 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(i3) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i3) == 0.0d ? 0 : -1));
                        int iNormalizeMetaState = 10 - KeyEvent.normalizeMetaState(i3);
                        int iResolveSize = View.resolveSize(i3, i3) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c3, iNormalizeMetaState, iResolveSize, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (ICustomTabsCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(writeTypedObject)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter("", 0), ExpandableListView.getPackedPositionGroup(0L) + 10, 12434 - (ViewConfiguration.getEdgeSlop() >> 16), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16015 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 14 - Color.blue(0), View.MeasureSpec.getSize(0) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c A[Catch: all -> 0x00d1, PHI: r2 r4
      0x002c: PHI (r2v6 o.generateTBSCertList$onWarmupCompleted) = (r2v5 o.generateTBSCertList$onWarmupCompleted), (r2v14 o.generateTBSCertList$onWarmupCompleted) binds: [B:9:0x002a, B:6:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x002c: PHI (r4v1 java.lang.String) = (r4v0 java.lang.String), (r4v11 java.lang.String) binds: [B:9:0x002a, B:6:0x001f] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x00d1, blocks: (B:4:0x0014, B:13:0x0053, B:15:0x0065, B:37:0x00cc, B:19:0x006c, B:21:0x0072, B:23:0x0078, B:26:0x008c, B:28:0x0092, B:32:0x00bf, B:33:0x00c4, B:10:0x002c, B:12:0x004e, B:8:0x0022), top: B:47:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0053 A[Catch: all -> 0x00d1, TryCatch #0 {all -> 0x00d1, blocks: (B:4:0x0014, B:13:0x0053, B:15:0x0065, B:37:0x00cc, B:19:0x006c, B:21:0x0072, B:23:0x0078, B:26:0x008c, B:28:0x0092, B:32:0x00bf, B:33:0x00c4, B:10:0x002c, B:12:0x004e, B:8:0x0022), top: B:47:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onExtraCallbackWithResult(java.lang.Object[] r14) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getNotAfterTime.onExtraCallbackWithResult(java.lang.Object[]):java.lang.Object");
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = extraCallback + 123;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        int iIndexOf$default = StringsKt.indexOf$default(str, "- 다국어 정보", 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            int i4 = extraCallback + 117;
            onMinimized = i4 % 128;
            if (i4 % 2 != 0) {
                return null;
            }
            throw null;
        }
        String strSubstring = str.substring(iIndexOf$default + 8);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        String string = StringsKt.trim(strSubstring).toString();
        int iIndexOf$default2 = StringsKt.indexOf$default(string, '{', 0, false, 6, (Object) null);
        if (iIndexOf$default2 == -1) {
            int i5 = extraCallback + 17;
            onMinimized = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }
        int iLastIndexOf$default = StringsKt.lastIndexOf$default(string, '}', 0, false, 6, (Object) null);
        if (iLastIndexOf$default != -1 && iLastIndexOf$default > iIndexOf$default2) {
            String strSubstring2 = string.substring(iIndexOf$default2, iLastIndexOf$default + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
            return new JSONObject(strSubstring2).toString(2);
        }
        int i7 = extraCallback + 103;
        onMinimized = i7 % 128;
        int i8 = i7 % 2;
        return null;
    }

    private final void onWarmupCompleted(ClipboardManager clipboardManager, ClipData clipData, int i) {
        int i2 = 2 % 2;
        if (clipData.getItemCount() <= 1) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText("", ""));
            int i3 = onMinimized + 113;
            extraCallback = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        int itemCount = clipData.getItemCount();
        ClipData clipDataNewPlainText = null;
        for (int i5 = 0; i5 < itemCount; i5++) {
            if (i5 != i) {
                ClipData.Item itemAt = clipData.getItemAt(i5);
                if (clipDataNewPlainText == null) {
                    int i6 = extraCallback + 15;
                    onMinimized = i6 % 128;
                    if (i6 % 2 == 0) {
                        clipDataNewPlainText = ClipData.newPlainText(clipData.getDescription().getLabel(), itemAt.getText());
                        int i7 = 66 / 0;
                    } else {
                        clipDataNewPlainText = ClipData.newPlainText(clipData.getDescription().getLabel(), itemAt.getText());
                    }
                } else {
                    clipDataNewPlainText.addItem(itemAt);
                }
            }
        }
        if (clipDataNewPlainText != null) {
            clipboardManager.setPrimaryClip(clipDataNewPlainText);
        }
    }

    private final void onExtraCallbackWithResult(StringBuilder sb) {
        int i = 2 % 2;
        sb.append("- 증권 정보");
        sb.append('\n');
        for (Map.Entry<String, String> entry : this.IAuthTabCallback.entrySet()) {
            sb.append("[" + entry.getKey() + ": " + entry.getValue() + "]");
            sb.append('\n');
        }
        String str = this.getInterfaceDescriptor;
        if (str.length() <= 0) {
            int i2 = onMinimized + 123;
            extraCallback = i2 % 128;
            int i3 = i2 % 2;
            str = null;
        }
        if (str != null) {
            sb.append(str);
            sb.append('\n');
            int i4 = extraCallback + 23;
            onMinimized = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 4 % 5;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getNotAfterTime.toString():java.lang.String");
    }

    public static /* synthetic */ long onNavigationEvent() {
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        return ((Long) onExtraCallback(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2, new Object[0], VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 2130617299, iIAuthTabCallback, -2130617297)).longValue();
    }

    private final String IAuthTabCallbackStub() {
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        return (String) onExtraCallback(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{this}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -987766602, iIAuthTabCallback, 987766602);
    }

    private final String onNavigationEvent(String str) {
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        return (String) onExtraCallback(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{this, str}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 811373600, iIAuthTabCallback, -811373599);
    }
}
