package o;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.ui.dst.view.cardbill.detail.HomeDstCardBillDetailFilterActivity$;
import im.toss.rn.spec.bundle.TossReactBundleMeta;
import im.toss.rn.toss.core.observability.RnPhaseObserver;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.GeckoHubImp;
import o.MaxFullscreenAdImpl;
import o.MaxFullscreenAdImplExternalSyntheticLambda10;
import o.MaxFullscreenAdImplExternalSyntheticLambda6;
import o.MaxRewardedAdImplb;
import o.auth;
import o.logApiCall;
import o.pkcs5PBKDF2;
import o.setAdReviewListener;
import o.transGetKmCert;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxFullscreenAdImplExternalSyntheticLambda6 implements logicVerifyID, MaxFullscreenAdImplb, MaxFullscreenAdImplExternalSyntheticLambda7 {
    public static final onExtraCallback Companion;
    private static char ICustomTabsCallbackStubProxy;
    private static long onMessageChannelReady;
    private static int onMinimized;
    private static int onRelationshipValidationResult;
    private final boolean IAuthTabCallback;
    private final String IAuthTabCallbackDefault;
    private final String IAuthTabCallbackStub;
    private final Long IAuthTabCallbackStubProxy;
    private final boolean IAuthTabCallback_Parcel;
    private final String ICustomTabsCallback;
    private final boolean access000;
    private final boolean access100;
    private final String asBinder;
    private final String asInterface;
    private final Date extraCallback;
    private MaxFullscreenAdImpl extraCallbackWithResult;
    private String getInterfaceDescriptor;
    private final boolean onActivityLayout;
    private String onActivityResized;
    private final Map<String, String> onExtraCallback;
    private final Lazy onExtraCallbackWithResult;
    private final Context onNavigationEvent;
    private String onPostMessage;
    private MaxFullscreenAdImpl onTransact;
    private final Lazy onWarmupCompleted;
    private final String readTypedObject;
    private final String writeTypedObject;
    private static final byte[] $$a = {4, 8, -22, -73};
    private static final int $$b = 127;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ICustomTabsCallbackStub = 0;
    private static int onUnminimized = 0;
    private static int ICustomTabsCallbackDefault = 1;

    public interface IAuthTabCallback {
        RnPhaseObserver ComponentActivityExternalSyntheticLambda0();

        MaxRewardedAdImplb reportFullyDrawn();

        logApiCall setContentView();
    }

    private static String $$c(short s, int i, byte b) {
        byte[] bArr = $$a;
        int i2 = s + 4;
        int i3 = b + 109;
        int i4 = i * 4;
        byte[] bArr2 = new byte[1 - i4];
        int i5 = 0 - i4;
        int i6 = -1;
        if (bArr == null) {
            i3 += -i5;
        }
        while (true) {
            i6++;
            i2++;
            bArr2[i6] = (byte) i3;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            i3 += -bArr[i2];
        }
    }

    static {
        onRelationshipValidationResult = 1;
        getInterfaceDescriptor();
        Companion = new onExtraCallback(null);
        int i = ICustomTabsCallbackStub + 41;
        onRelationshipValidationResult = i % 128;
        if (i % 2 == 0) {
            int i2 = 79 / 0;
        }
    }

    public /* synthetic */ MaxFullscreenAdImplExternalSyntheticLambda6(Context context, String str, String str2, String str3, String str4, String str5, String str6, Date date, Long l, boolean z, boolean z2, boolean z3, boolean z4, String str7, boolean z5, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, str2, str3, str4, str5, str6, date, l, z, z2, z3, z4, str7, z5);
    }

    public static /* synthetic */ MaxRewardedAdImplb IAuthTabCallback(MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onUnminimized + 27;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        MaxRewardedAdImplb maxRewardedAdImplbOnMessageChannelReady = onMessageChannelReady(maxFullscreenAdImplExternalSyntheticLambda6);
        int i4 = ICustomTabsCallbackDefault + 51;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
        return maxRewardedAdImplbOnMessageChannelReady;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~(i7 | i6);
        int i9 = ~(i4 | i6);
        int i10 = ~i4;
        int i11 = ~i6;
        int i12 = i8 | i9 | (~(i10 | i11 | i3));
        int i13 = i8 | (~(i7 | i4)) | i9;
        int i14 = (~(i6 | i3)) | (~(i10 | i6)) | (~(i7 | i11 | i4));
        int i15 = i3 + i4 + i + (1880080305 * i2) + (458392769 * i5);
        int i16 = i15 * i15;
        int i17 = ((766573918 * i3) - 2147483648) + (1582236324 * i4) + (i12 * (-407831203)) + (815662406 * i13) + ((-407831203) * i14) + (1174405120 * i) + (1711276032 * i2) + ((-973078528) * i5) + (68288512 * i16);
        int i18 = ((i3 * 319678698) - 2002258816) + (i4 * 319678284) + (i12 * 207) + (i13 * (-414)) + (i14 * 207) + (i * 319678491) + (i2 * (-161570901)) + (i5 * (-1160779685)) + (i16 * (-1109000192));
        switch (i17 + (i18 * i18 * (-1432485888))) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                return asBinder(objArr);
            case 6:
                return IAuthTabCallbackStub(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    public static /* synthetic */ logApiCall onNavigationEvent(MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onUnminimized + 29;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        logApiCall logapicallOnActivityResized = onActivityResized(maxFullscreenAdImplExternalSyntheticLambda6);
        if (i3 == 0) {
            int i4 = 50 / 0;
        }
        int i5 = onUnminimized + 119;
        ICustomTabsCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return logapicallOnActivityResized;
    }

    private MaxFullscreenAdImplExternalSyntheticLambda6(Context context, String str, String str2, String str3, String str4, String str5, String str6, Date date, Long l, boolean z, boolean z2, boolean z3, boolean z4, String str7, boolean z5) {
        this.ICustomTabsCallback = str;
        this.asBinder = str2;
        this.readTypedObject = str3;
        this.IAuthTabCallbackStub = str4;
        this.writeTypedObject = str5;
        this.asInterface = str6;
        this.extraCallback = date;
        this.IAuthTabCallbackStubProxy = l;
        this.access100 = z;
        this.access000 = z2;
        this.IAuthTabCallback = z3;
        this.IAuthTabCallback_Parcel = z4;
        this.IAuthTabCallbackDefault = str7;
        this.onActivityLayout = z5;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        this.onNavigationEvent = applicationContext;
        this.onExtraCallback = new LinkedHashMap();
        this.onWarmupCompleted = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.rn.toss.core.TossBundleLoader$$ExternalSyntheticLambda0
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 85;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    MaxFullscreenAdImplExternalSyntheticLambda6.onNavigationEvent(this.f$0);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                logApiCall logapicallOnNavigationEvent = MaxFullscreenAdImplExternalSyntheticLambda6.onNavigationEvent(this.f$0);
                int i3 = onNavigationEvent + 91;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return logapicallOnNavigationEvent;
            }
        });
        this.onExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.rn.toss.core.TossBundleLoader$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 99;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                MaxRewardedAdImplb maxRewardedAdImplbIAuthTabCallback = MaxFullscreenAdImplExternalSyntheticLambda6.IAuthTabCallback(this.f$0);
                if (i3 != 0) {
                    int i4 = 23 / 0;
                }
                return maxRewardedAdImplbIAuthTabCallback;
            }
        });
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda6 = (MaxFullscreenAdImplExternalSyntheticLambda6) objArr[0];
        setRequestListener setrequestlistener = (setRequestListener) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 37;
        onUnminimized = i2 % 128;
        if (i2 % 2 != 0) {
            maxFullscreenAdImplExternalSyntheticLambda6.onExtraCallback(setrequestlistener);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        MaxFullscreenAdImpl.onExtraCallbackWithResult onextracallbackwithresultOnExtraCallback = maxFullscreenAdImplExternalSyntheticLambda6.onExtraCallback(setrequestlistener);
        int i3 = onUnminimized + 73;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return onextracallbackwithresultOnExtraCallback;
    }

    public static final /* synthetic */ void IAuthTabCallback(MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda6, String str) {
        int i = 2 % 2;
        int i2 = onUnminimized;
        int i3 = i2 + 115;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        maxFullscreenAdImplExternalSyntheticLambda6.onActivityResized = str;
        int i5 = i2 + 29;
        ICustomTabsCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 14 / 0;
        }
    }

    public static final /* synthetic */ String IAuthTabCallbackDefault(MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onUnminimized + 29;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        String str = maxFullscreenAdImplExternalSyntheticLambda6.IAuthTabCallbackStub;
        if (i3 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda6 = (MaxFullscreenAdImplExternalSyntheticLambda6) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 59;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        MaxFullscreenAdImplExternalSyntheticLambda10 maxFullscreenAdImplExternalSyntheticLambda10ExtraCallbackWithResult = maxFullscreenAdImplExternalSyntheticLambda6.extraCallbackWithResult();
        int i4 = ICustomTabsCallbackDefault + 115;
        onUnminimized = i4 % 128;
        if (i4 % 2 == 0) {
            return maxFullscreenAdImplExternalSyntheticLambda10ExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ logApiCall IAuthTabCallbackStub(MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 9;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        logApiCall logapicallAccess100 = maxFullscreenAdImplExternalSyntheticLambda6.access100();
        int i4 = ICustomTabsCallbackDefault + 99;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
        return logapicallAccess100;
    }

    public static final /* synthetic */ Date IAuthTabCallbackStubProxy(MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onUnminimized + 101;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        int i4 = i2 % 2;
        Date date = maxFullscreenAdImplExternalSyntheticLambda6.extraCallback;
        int i5 = i3 + 87;
        onUnminimized = i5 % 128;
        int i6 = i5 % 2;
        return date;
    }

    public static final /* synthetic */ String IAuthTabCallback_Parcel(MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onUnminimized + 103;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        int i4 = i2 % 2;
        String str = maxFullscreenAdImplExternalSyntheticLambda6.writeTypedObject;
        int i5 = i3 + 99;
        onUnminimized = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static final /* synthetic */ boolean ICustomTabsCallback(MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onUnminimized + 121;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        int i4 = i2 % 2;
        boolean z = maxFullscreenAdImplExternalSyntheticLambda6.access100;
        int i5 = i3 + 45;
        onUnminimized = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 36 / 0;
        }
        return z;
    }

    public static final /* synthetic */ String access100(MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault;
        int i3 = i2 + 3;
        onUnminimized = i3 % 128;
        int i4 = i3 % 2;
        String str = maxFullscreenAdImplExternalSyntheticLambda6.readTypedObject;
        int i5 = i2 + 101;
        onUnminimized = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static final /* synthetic */ String asBinder(MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 79;
        int i3 = i2 % 128;
        onUnminimized = i3;
        int i4 = i2 % 2;
        String str = maxFullscreenAdImplExternalSyntheticLambda6.asInterface;
        int i5 = i3 + 23;
        ICustomTabsCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ String asInterface(MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 33;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        String str = maxFullscreenAdImplExternalSyntheticLambda6.asBinder;
        if (i3 != 0) {
            int i4 = 76 / 0;
        }
        return str;
    }

    public static final /* synthetic */ boolean extraCallbackWithResult(MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault;
        int i3 = i2 + 109;
        onUnminimized = i3 % 128;
        int i4 = i3 % 2;
        boolean z = maxFullscreenAdImplExternalSyntheticLambda6.access000;
        int i5 = i2 + 59;
        onUnminimized = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Long getInterfaceDescriptor(MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onUnminimized + 105;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        int i4 = i2 % 2;
        Long l = maxFullscreenAdImplExternalSyntheticLambda6.IAuthTabCallbackStubProxy;
        int i5 = i3 + 37;
        onUnminimized = i5 % 128;
        int i6 = i5 % 2;
        return l;
    }

    public static final /* synthetic */ void onExtraCallback(MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda6, String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 85;
        int i3 = i2 % 128;
        onUnminimized = i3;
        int i4 = i2 % 2;
        maxFullscreenAdImplExternalSyntheticLambda6.getInterfaceDescriptor = str;
        int i5 = i3 + 79;
        ICustomTabsCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void onExtraCallback(MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda6, MaxFullscreenAdImpl maxFullscreenAdImpl) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 7;
        int i3 = i2 % 128;
        onUnminimized = i3;
        int i4 = i2 % 2;
        maxFullscreenAdImplExternalSyntheticLambda6.onTransact = maxFullscreenAdImpl;
        int i5 = i3 + 45;
        ICustomTabsCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda6 = (MaxFullscreenAdImplExternalSyntheticLambda6) objArr[0];
        int i = 2 % 2;
        int i2 = onUnminimized + 85;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        int i4 = i2 % 2;
        String str = maxFullscreenAdImplExternalSyntheticLambda6.IAuthTabCallbackDefault;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 77;
        onUnminimized = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static final /* synthetic */ MaxFullscreenAdImpl.onExtraCallbackWithResult onExtraCallbackWithResult(MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onUnminimized + 91;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        MaxFullscreenAdImpl.onExtraCallbackWithResult onextracallbackwithresult = (MaxFullscreenAdImpl.onExtraCallbackWithResult) onExtraCallbackWithResult(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{maxFullscreenAdImplExternalSyntheticLambda6}, -1531197396, 1531197401, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback);
        int i4 = onUnminimized + 103;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return onextracallbackwithresult;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda6 = (MaxFullscreenAdImplExternalSyntheticLambda6) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 65;
        int i3 = i2 % 128;
        onUnminimized = i3;
        int i4 = i2 % 2;
        boolean z = maxFullscreenAdImplExternalSyntheticLambda6.onActivityLayout;
        int i5 = i3 + 41;
        ICustomTabsCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return Boolean.valueOf(z);
        }
        int i6 = 89 / 0;
        return Boolean.valueOf(z);
    }

    public static final /* synthetic */ void onNavigationEvent(MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda6, String str) {
        int i = 2 % 2;
        int i2 = onUnminimized;
        int i3 = i2 + 85;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        maxFullscreenAdImplExternalSyntheticLambda6.onPostMessage = str;
        int i5 = i2 + 79;
        ICustomTabsCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 19 / 0;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda6 = (MaxFullscreenAdImplExternalSyntheticLambda6) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault;
        int i3 = i2 + 1;
        onUnminimized = i3 % 128;
        int i4 = i3 % 2;
        Map<String, String> map = maxFullscreenAdImplExternalSyntheticLambda6.onExtraCallback;
        if (i4 != 0) {
            int i5 = 41 / 0;
        }
        int i6 = i2 + 79;
        onUnminimized = i6 % 128;
        int i7 = i6 % 2;
        return map;
    }

    public static final /* synthetic */ Date onWarmupCompleted(MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda6, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 41;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        Date dateIAuthTabCallback = maxFullscreenAdImplExternalSyntheticLambda6.IAuthTabCallback(str);
        int i4 = onUnminimized + 13;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return dateIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda6, MaxFullscreenAdImpl maxFullscreenAdImpl) {
        int i = 2 % 2;
        int i2 = onUnminimized + 123;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        int i4 = i2 % 2;
        maxFullscreenAdImplExternalSyntheticLambda6.extraCallbackWithResult = maxFullscreenAdImpl;
        int i5 = i3 + 75;
        onUnminimized = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ boolean onWarmupCompleted(MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 47;
        int i3 = i2 % 128;
        onUnminimized = i3;
        int i4 = i2 % 2;
        boolean z = maxFullscreenAdImplExternalSyntheticLambda6.IAuthTabCallback;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 27;
        ICustomTabsCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 0 / 0;
        }
        return z;
    }

    public static final /* synthetic */ boolean readTypedObject(MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onUnminimized;
        int i3 = i2 + 99;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        boolean z = maxFullscreenAdImplExternalSyntheticLambda6.IAuthTabCallback_Parcel;
        int i5 = i2 + 73;
        ICustomTabsCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public static final /* synthetic */ RnPhaseObserver writeTypedObject(MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onUnminimized + 47;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        RnPhaseObserver rnPhaseObserverAccess000 = maxFullscreenAdImplExternalSyntheticLambda6.access000();
        int i4 = ICustomTabsCallbackDefault + 13;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
        return rnPhaseObserverAccess000;
    }

    private final RnPhaseObserver access000() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 117;
        onUnminimized = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 61 / 0;
            return ((IAuthTabCallback) Response.onExtraCallback(this.onNavigationEvent, IAuthTabCallback.class)).ComponentActivityExternalSyntheticLambda0();
        }
        return ((IAuthTabCallback) Response.onExtraCallback(this.onNavigationEvent, IAuthTabCallback.class)).ComponentActivityExternalSyntheticLambda0();
    }

    private final logApiCall access100() {
        int i = 2 % 2;
        int i2 = onUnminimized + 61;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.onWarmupCompleted.getValue();
        if (i3 != 0) {
            return (logApiCall) value;
        }
        int i4 = 0 / 0;
        return (logApiCall) value;
    }

    private static final logApiCall onActivityResized(MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onUnminimized + 61;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            logApiCall contentView = ((IAuthTabCallback) Response.onExtraCallback(maxFullscreenAdImplExternalSyntheticLambda6.onNavigationEvent, IAuthTabCallback.class)).setContentView();
            int i3 = ICustomTabsCallbackDefault + 119;
            onUnminimized = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 20 / 0;
            }
            return contentView;
        }
        ((IAuthTabCallback) Response.onExtraCallback(maxFullscreenAdImplExternalSyntheticLambda6.onNavigationEvent, IAuthTabCallback.class)).setContentView();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda6 = (MaxFullscreenAdImplExternalSyntheticLambda6) objArr[0];
        int i = 2 % 2;
        int i2 = onUnminimized + 125;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        MaxRewardedAdImplb maxRewardedAdImplb = (MaxRewardedAdImplb) maxFullscreenAdImplExternalSyntheticLambda6.onExtraCallbackWithResult.getValue();
        if (i3 == 0) {
            int i4 = 24 / 0;
        }
        int i5 = onUnminimized + 97;
        ICustomTabsCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return maxRewardedAdImplb;
    }

    private static final MaxRewardedAdImplb onMessageChannelReady(MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onUnminimized + 13;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        MaxRewardedAdImplb maxRewardedAdImplbReportFullyDrawn = ((IAuthTabCallback) Response.onExtraCallback(maxFullscreenAdImplExternalSyntheticLambda6.onNavigationEvent, IAuthTabCallback.class)).reportFullyDrawn();
        int i4 = ICustomTabsCallbackDefault + 57;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
        return maxRewardedAdImplbReportFullyDrawn;
    }

    private final MaxFullscreenAdImplExternalSyntheticLambda10 extraCallbackWithResult() {
        int i = 2 % 2;
        MaxFullscreenAdImplExternalSyntheticLambda10 maxFullscreenAdImplExternalSyntheticLambda10 = new MaxFullscreenAdImplExternalSyntheticLambda10(this.readTypedObject, this.ICustomTabsCallback, this.writeTypedObject, this.asInterface, this.extraCallback, this.IAuthTabCallbackStubProxy, this.access100, this.access000, this.IAuthTabCallback, this.IAuthTabCallback_Parcel, this.IAuthTabCallbackDefault, this.onActivityLayout);
        int i2 = onUnminimized + 51;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return maxFullscreenAdImplExternalSyntheticLambda10;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallback {
        private static final byte[] $$a = {79, 7, -80, -125};
        private static final int $$b = 77;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int IAuthTabCallback = 1;
        private static long onWarmupCompleted = 7099060410997787620L;
        private static int onNavigationEvent = -1776194565;
        private static char onExtraCallback = 27643;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(int i, int i2, byte b) {
            int i3;
            byte[] bArr = $$a;
            int i4 = i + 109;
            int i5 = (i2 * 3) + 4;
            int i6 = b * 3;
            byte[] bArr2 = new byte[1 - i6];
            int i7 = 0 - i6;
            if (bArr == null) {
                int i8 = i5;
                i4 = i7;
                int i9 = 0;
                i4 += -i5;
                i5 = i8 + 1;
                i3 = i9;
                bArr2[i3] = (byte) i4;
                i9 = i3 + 1;
                if (i3 == i7) {
                    return new String(bArr2, 0);
                }
                i8 = i5;
                i5 = bArr[i5];
                i4 += -i5;
                i5 = i8 + 1;
                i3 = i9;
                bArr2[i3] = (byte) i4;
                i9 = i3 + 1;
                if (i3 == i7) {
                }
            } else {
                i3 = 0;
                bArr2[i3] = (byte) i4;
                i9 = i3 + 1;
                if (i3 == i7) {
                }
            }
        }

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final MaxFullscreenAdImplExternalSyntheticLambda6 IAuthTabCallback(@NotNull Function1<? super onNavigationEvent, Unit> function1) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(function1, "");
            onNavigationEvent onnavigationevent = new onNavigationEvent();
            function1.invoke(onnavigationevent);
            MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda6OnExtraCallbackWithResult = onExtraCallbackWithResult(onnavigationevent);
            int i2 = IAuthTabCallback + 91;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return maxFullscreenAdImplExternalSyntheticLambda6OnExtraCallbackWithResult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int length2 = cArr2.length;
            char[] cArr5 = new char[length2];
            System.arraycopy(cArr3, 0, cArr4, 0, length);
            System.arraycopy(cArr2, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr.length;
            char[] cArr6 = new char[length3];
            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
            int i3 = $11 + 19;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
                try {
                    Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                    if (objOnExtraCallback == null) {
                        char gidForName = (char) ((-1) - Process.getGidForName(""));
                        int i5 = 44 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 1451;
                        byte b = (byte) ($$b & 3);
                        byte b2 = (byte) (b - 1);
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(gidForName, i5, maxKeyCode, 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 49124), 44 - Color.alpha(0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 1494, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23971 - TextUtils.indexOf((CharSequence) "", '0', 0)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 50, TextUtils.lastIndexOf("", '0', 0, 0) + 22940, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 45849), (-16777187) - Color.rgb(0, 0, 0), 12577 - TextUtils.getOffsetAfter("", 0), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                    cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onWarmupCompleted ^ 7798559133331975163L)) ^ ((int) (onNavigationEvent ^ 7798559133331975163L))) ^ ((char) (onExtraCallback ^ 7798559133331975163L)));
                    trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            String str = new String(cArr6);
            int i6 = $10 + 11;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            objArr[0] = str;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
        
            if (r1 != null) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
        
            r5 = r1;
            r6 = r21.onTransact();
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
        
            if (r6 == null) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
        
            r1 = o.MaxFullscreenAdImplExternalSyntheticLambda6.onExtraCallback.onExtraCallbackWithResult + 83;
            o.MaxFullscreenAdImplExternalSyntheticLambda6.onExtraCallback.IAuthTabCallback = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
        
            if ((r1 % 2) == 0) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
        
            r9 = o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
            r12 = o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
            r7 = (java.lang.String) o.MaxFullscreenAdImplExternalSyntheticLambda6.onNavigationEvent.onExtraCallbackWithResult(o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new java.lang.Object[]{r21}, r9, 1309118263, -1309118259, r12, o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
        
            if (r7 == null) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
        
            r10 = o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
            r13 = o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
            r8 = (java.lang.String) o.MaxFullscreenAdImplExternalSyntheticLambda6.onNavigationEvent.onExtraCallbackWithResult(o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new java.lang.Object[]{r21}, r10, 1416128862, -1416128861, r13, o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0082, code lost:
        
            if (r8 == null) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0084, code lost:
        
            r1 = r21.asBinder();
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0088, code lost:
        
            if (r1 != null) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x008a, code lost:
        
            r1 = "kr";
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x008c, code lost:
        
            r9 = r1;
            r1 = r21.IAuthTabCallback();
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0091, code lost:
        
            if (r1 != null) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0093, code lost:
        
            r1 = new java.lang.Object[1];
            a((char) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 8628), android.view.ViewConfiguration.getDoubleTapTimeout() >> 16, new char[]{48479, 13373, 3500, 38732}, new char[]{40991, 17070, 57826, 3774}, new char[]{3675, 45894, 46225, 32033}, r1);
            r1 = ((java.lang.String) r1[0]).intern();
            r3 = o.MaxFullscreenAdImplExternalSyntheticLambda6.onExtraCallback.onExtraCallbackWithResult + 23;
            o.MaxFullscreenAdImplExternalSyntheticLambda6.onExtraCallback.IAuthTabCallback = r3 % 128;
            r3 = r3 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00f3, code lost:
        
            return new o.MaxFullscreenAdImplExternalSyntheticLambda6(r4, r5, r6, r7, r8, r9, r1, r21.IAuthTabCallbackDefault(), r21.asInterface(), r21.access000(), r21.access100(), r21.onNavigationEvent(), r21.IAuthTabCallback_Parcel(), r21.onExtraCallbackWithResult(), r21.getInterfaceDescriptor(), null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00fb, code lost:
        
            throw new java.lang.IllegalStateException("Host bundle name is required");
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0103, code lost:
        
            throw new java.lang.IllegalStateException("Remote bundle name is required");
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0104, code lost:
        
            r4 = o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
            r7 = o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
            r0 = (java.lang.String) o.MaxFullscreenAdImplExternalSyntheticLambda6.onNavigationEvent.onExtraCallbackWithResult(o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new java.lang.Object[]{r21}, r4, 1309118263, -1309118259, r7, o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0125, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x012d, code lost:
        
            throw new java.lang.IllegalStateException("Host bundle URL is required");
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0135, code lost:
        
            throw new java.lang.IllegalStateException("Remote bundle URL is required");
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
        
            if (r1 != null) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final MaxFullscreenAdImplExternalSyntheticLambda6 onExtraCallbackWithResult(@NotNull onNavigationEvent onnavigationevent) throws Throwable {
            String strIAuthTabCallbackStubProxy;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            Context contextOnWarmupCompleted = onnavigationevent.onWarmupCompleted();
            if (contextOnWarmupCompleted == null) {
                throw new IllegalStateException("Context is required");
            }
            int i2 = IAuthTabCallback + 39;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                strIAuthTabCallbackStubProxy = onnavigationevent.IAuthTabCallbackStubProxy();
                int i3 = 54 / 0;
            } else {
                strIAuthTabCallbackStubProxy = onnavigationevent.IAuthTabCallbackStubProxy();
            }
        }
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i4 = $10 + 55;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), ExpandableListView.getPackedPositionGroup(0L) + 43, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1450, 228868077, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) (-1);
                    byte b4 = (byte) (b3 + 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 49124), 45 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 1494 - View.combineMeasuredStates(0, 0), 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 23972), 50 - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getEdgeSlop() >> 16) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 45849), View.MeasureSpec.getMode(0) + 29, TextUtils.getTrimmedLength("") + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onMessageChannelReady ^ 7798559133331975163L)) ^ ((int) (onMinimized ^ 7798559133331975163L))) ^ ((char) (ICustomTabsCallbackStubProxy ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i6 = $11 + 29;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    public static final class onNavigationEvent {
        private static int ICustomTabsCallback = 1;
        private static int writeTypedObject;
        private String IAuthTabCallback;
        private boolean IAuthTabCallbackDefault;
        private boolean IAuthTabCallbackStub;
        private String IAuthTabCallbackStubProxy;
        private boolean IAuthTabCallback_Parcel;
        private String access000;
        private Date access100;
        private String asBinder;
        private Long asInterface;
        private String getInterfaceDescriptor;
        private String onExtraCallback;
        private Context onExtraCallbackWithResult;
        private boolean onNavigationEvent = true;
        private boolean onTransact;
        private String onWarmupCompleted;

        public static /* synthetic */ Object onExtraCallbackWithResult(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
            int i7 = (~((~i2) | i4)) | i3;
            int i8 = ~i3;
            int i9 = (~(i8 | i4)) | (~(i8 | i2)) | (~(i4 | i2));
            int i10 = (~(i2 | (~i4))) | i8;
            int i11 = i3 + i4 + i5 + ((-2137991558) * i) + (111092868 * i6);
            int i12 = i11 * i11;
            int i13 = (((-431794203) * i3) - 566755328) + (427185167 * i4) + (i7 * 1717982222) + (1717982222 * i9) + ((-1717982222) * i10) + ((-1290797056) * i5) + ((-1247805440) * i) + ((-1807745024) * i6) + ((-591921152) * i12);
            int i14 = (i3 * (-1469267343)) + 1003592187 + (i4 * (-1469268429)) + (i7 * (-362)) + (i9 * (-362)) + (i10 * 362) + (i5 * (-1469268067)) + (i * 1951436498) + (i6 * (-746069772)) + (i12 * (-1529348096));
            int i15 = i13 + (i14 * i14 * 1762131968);
            if (i15 == 1) {
                onNavigationEvent onnavigationevent = (onNavigationEvent) objArr[0];
                int i16 = 2 % 2;
                int i17 = writeTypedObject;
                int i18 = i17 + 41;
                ICustomTabsCallback = i18 % 128;
                int i19 = i18 % 2;
                String str = onnavigationevent.IAuthTabCallback;
                int i20 = i17 + 93;
                ICustomTabsCallback = i20 % 128;
                int i21 = i20 % 2;
                return str;
            }
            if (i15 == 2) {
                return onWarmupCompleted(objArr);
            }
            if (i15 == 3) {
                return onNavigationEvent(objArr);
            }
            if (i15 != 4) {
                return IAuthTabCallback(objArr);
            }
            onNavigationEvent onnavigationevent2 = (onNavigationEvent) objArr[0];
            int i22 = 2 % 2;
            int i23 = ICustomTabsCallback;
            int i24 = i23 + 85;
            writeTypedObject = i24 % 128;
            int i25 = i24 % 2;
            String str2 = onnavigationevent2.IAuthTabCallbackStubProxy;
            int i26 = i23 + 19;
            writeTypedObject = i26 % 128;
            int i27 = i26 % 2;
            return str2;
        }

        public final Context onWarmupCompleted() {
            Context context;
            int i = 2 % 2;
            int i2 = writeTypedObject;
            int i3 = i2 + 71;
            ICustomTabsCallback = i3 % 128;
            if (i3 % 2 == 0) {
                context = this.onExtraCallbackWithResult;
                int i4 = 74 / 0;
            } else {
                context = this.onExtraCallbackWithResult;
            }
            int i5 = i2 + 55;
            ICustomTabsCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 55 / 0;
            }
            return context;
        }

        public final String IAuthTabCallbackStubProxy() {
            int i = 2 % 2;
            int i2 = ICustomTabsCallback + 53;
            int i3 = i2 % 128;
            writeTypedObject = i3;
            int i4 = i2 % 2;
            String str = this.getInterfaceDescriptor;
            int i5 = i3 + 51;
            ICustomTabsCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String onTransact() {
            int i = 2 % 2;
            int i2 = ICustomTabsCallback + 77;
            int i3 = i2 % 128;
            writeTypedObject = i3;
            int i4 = i2 % 2;
            String str = this.asBinder;
            int i5 = i3 + 89;
            ICustomTabsCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String asBinder() {
            int i = 2 % 2;
            int i2 = ICustomTabsCallback + 17;
            int i3 = i2 % 128;
            writeTypedObject = i3;
            int i4 = i2 % 2;
            String str = this.access000;
            int i5 = i3 + 119;
            ICustomTabsCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 98 / 0;
            }
            return str;
        }

        public final String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = writeTypedObject + 17;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            String str = this.onExtraCallback;
            if (i3 == 0) {
                int i4 = 14 / 0;
            }
            return str;
        }

        public final Date IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = writeTypedObject + 105;
            int i3 = i2 % 128;
            ICustomTabsCallback = i3;
            int i4 = i2 % 2;
            Date date = this.access100;
            int i5 = i3 + 101;
            writeTypedObject = i5 % 128;
            int i6 = i5 % 2;
            return date;
        }

        public final Long asInterface() {
            int i = 2 % 2;
            int i2 = writeTypedObject;
            int i3 = i2 + 59;
            ICustomTabsCallback = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Long l = this.asInterface;
            int i4 = i2 + 95;
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
            return l;
        }

        public final boolean access000() {
            int i = 2 % 2;
            int i2 = ICustomTabsCallback + 107;
            int i3 = i2 % 128;
            writeTypedObject = i3;
            int i4 = i2 % 2;
            boolean z = this.IAuthTabCallbackDefault;
            int i5 = i3 + 115;
            ICustomTabsCallback = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }

        public final boolean access100() {
            int i = 2 % 2;
            int i2 = writeTypedObject + 51;
            int i3 = i2 % 128;
            ICustomTabsCallback = i3;
            int i4 = i2 % 2;
            boolean z = this.onTransact;
            int i5 = i3 + 55;
            writeTypedObject = i5 % 128;
            if (i5 % 2 == 0) {
                return z;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final boolean onNavigationEvent() {
            int i = 2 % 2;
            int i2 = ICustomTabsCallback;
            int i3 = i2 + 67;
            writeTypedObject = i3 % 128;
            int i4 = i3 % 2;
            boolean z = this.onNavigationEvent;
            int i5 = i2 + 59;
            writeTypedObject = i5 % 128;
            if (i5 % 2 == 0) {
                return z;
            }
            throw null;
        }

        public final boolean IAuthTabCallback_Parcel() {
            int i = 2 % 2;
            int i2 = ICustomTabsCallback;
            int i3 = i2 + 47;
            writeTypedObject = i3 % 128;
            int i4 = i3 % 2;
            boolean z = this.IAuthTabCallbackStub;
            int i5 = i2 + 25;
            writeTypedObject = i5 % 128;
            if (i5 % 2 == 0) {
                return z;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = ICustomTabsCallback;
            int i3 = i2 + 93;
            writeTypedObject = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onWarmupCompleted;
            int i5 = i2 + 99;
            writeTypedObject = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 75 / 0;
            }
            return str;
        }

        public final boolean getInterfaceDescriptor() {
            int i = 2 % 2;
            int i2 = ICustomTabsCallback + 23;
            int i3 = i2 % 128;
            writeTypedObject = i3;
            int i4 = i2 % 2;
            boolean z = this.IAuthTabCallback_Parcel;
            int i5 = i3 + 97;
            ICustomTabsCallback = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }

        private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
            onNavigationEvent onnavigationevent = (onNavigationEvent) objArr[0];
            Context context = (Context) objArr[1];
            int i = 2 % 2;
            int i2 = ICustomTabsCallback + 69;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            onnavigationevent.onExtraCallbackWithResult = context;
            int i4 = ICustomTabsCallback + 39;
            writeTypedObject = i4 % 128;
            if (i4 % 2 == 0) {
                return onnavigationevent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final onNavigationEvent asBinder(@NotNull String str) {
            int i = 2 % 2;
            int i2 = writeTypedObject + 121;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            this.getInterfaceDescriptor = str;
            int i4 = ICustomTabsCallback + 87;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        public final onNavigationEvent onWarmupCompleted(@NotNull String str) {
            int i = 2 % 2;
            int i2 = ICustomTabsCallback + 53;
            writeTypedObject = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(str, "");
                this.asBinder = str;
                int i3 = 63 / 0;
            } else {
                Intrinsics.checkNotNullParameter(str, "");
                this.asBinder = str;
            }
            int i4 = writeTypedObject + 69;
            ICustomTabsCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final onNavigationEvent IAuthTabCallbackDefault(@NotNull String str) {
            int i = 2 % 2;
            int i2 = writeTypedObject + 59;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            this.IAuthTabCallbackStubProxy = str;
            int i4 = ICustomTabsCallback + 3;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
            onNavigationEvent onnavigationevent = (onNavigationEvent) objArr[0];
            String str = (String) objArr[1];
            int i = 2 % 2;
            int i2 = writeTypedObject + 33;
            ICustomTabsCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(str, "");
                onnavigationevent.IAuthTabCallback = str;
                return onnavigationevent;
            }
            Intrinsics.checkNotNullParameter(str, "");
            onnavigationevent.IAuthTabCallback = str;
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
            onNavigationEvent onnavigationevent = (onNavigationEvent) objArr[0];
            String str = (String) objArr[1];
            int i = 2 % 2;
            int i2 = ICustomTabsCallback + 27;
            writeTypedObject = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(str, "");
                onnavigationevent.access000 = str;
                int i3 = 57 / 0;
            } else {
                Intrinsics.checkNotNullParameter(str, "");
                onnavigationevent.access000 = str;
            }
            int i4 = ICustomTabsCallback + 51;
            writeTypedObject = i4 % 128;
            if (i4 % 2 == 0) {
                return onnavigationevent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final onNavigationEvent onExtraCallback(@NotNull String str) {
            int i = 2 % 2;
            int i2 = writeTypedObject + 43;
            ICustomTabsCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(str, "");
                this.onExtraCallback = str;
                return this;
            }
            Intrinsics.checkNotNullParameter(str, "");
            this.onExtraCallback = str;
            throw null;
        }

        public final onNavigationEvent onWarmupCompleted(@Nullable Date date) {
            int i = 2 % 2;
            int i2 = writeTypedObject + 111;
            int i3 = i2 % 128;
            ICustomTabsCallback = i3;
            int i4 = i2 % 2;
            this.access100 = date;
            int i5 = i3 + 123;
            writeTypedObject = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 65 / 0;
            }
            return this;
        }

        public final onNavigationEvent IAuthTabCallback(@Nullable Long l) {
            int i = 2 % 2;
            int i2 = ICustomTabsCallback + 11;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            this.asInterface = l;
            if (i3 == 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final onNavigationEvent onWarmupCompleted(boolean z) {
            int i = 2 % 2;
            int i2 = ICustomTabsCallback + 73;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            this.IAuthTabCallbackDefault = z;
            if (i3 != 0) {
                int i4 = 98 / 0;
            }
            return this;
        }

        public final onNavigationEvent onExtraCallbackWithResult(boolean z) {
            int i = 2 % 2;
            int i2 = ICustomTabsCallback;
            int i3 = i2 + 17;
            writeTypedObject = i3 % 128;
            int i4 = i3 % 2;
            this.onTransact = z;
            int i5 = i2 + 5;
            writeTypedObject = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final onNavigationEvent onNavigationEvent(boolean z) {
            int i = 2 % 2;
            int i2 = ICustomTabsCallback;
            int i3 = i2 + 123;
            writeTypedObject = i3 % 128;
            int i4 = i3 % 2;
            this.onNavigationEvent = z;
            int i5 = i2 + 27;
            writeTypedObject = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final onNavigationEvent IAuthTabCallback(boolean z) {
            int i = 2 % 2;
            int i2 = ICustomTabsCallback;
            int i3 = i2 + 95;
            writeTypedObject = i3 % 128;
            int i4 = i3 % 2;
            this.IAuthTabCallbackStub = z;
            if (i4 != 0) {
                int i5 = 57 / 0;
            }
            int i6 = i2 + 3;
            writeTypedObject = i6 % 128;
            int i7 = i6 % 2;
            return this;
        }

        public final onNavigationEvent onExtraCallbackWithResult(@Nullable String str) {
            int i = 2 % 2;
            int i2 = writeTypedObject + 13;
            int i3 = i2 % 128;
            ICustomTabsCallback = i3;
            int i4 = i2 % 2;
            this.onWarmupCompleted = str;
            int i5 = i3 + 31;
            writeTypedObject = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final String onExtraCallback() {
            int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
            int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
            return (String) onExtraCallbackWithResult(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{this}, iIAuthTabCallback, 1416128862, -1416128861, iIAuthTabCallback2, GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
        }

        public final String IAuthTabCallbackStub() {
            int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
            int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
            return (String) onExtraCallbackWithResult(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{this}, iIAuthTabCallback, 1309118263, -1309118259, iIAuthTabCallback2, GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
        }

        public final onNavigationEvent onNavigationEvent(@NotNull Context context) {
            int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
            int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
            return (onNavigationEvent) onExtraCallbackWithResult(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{this, context}, iIAuthTabCallback, -2111119973, 2111119976, iIAuthTabCallback2, GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
        }

        public final onNavigationEvent onNavigationEvent(@NotNull String str) {
            int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
            int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
            return (onNavigationEvent) onExtraCallbackWithResult(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{this, str}, iIAuthTabCallback, -1752206268, 1752206270, iIAuthTabCallback2, GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
        }

        public final onNavigationEvent IAuthTabCallback(@NotNull String str) {
            int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
            int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
            return (onNavigationEvent) onExtraCallbackWithResult(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{this, str}, iIAuthTabCallback, -217894557, 217894557, iIAuthTabCallback2, GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
        }
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super transGetKmCert>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        int label;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super transGetKmCert> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 93;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 73;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = MaxFullscreenAdImplExternalSyntheticLambda6.this.new onWarmupCompleted(access13800Var);
            int i2 = onExtraCallbackWithResult + 93;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 83;
            onWarmupCompleted = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super transGetKmCert> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                IAuthTabCallback(findresandmsg, access13800Var);
                throw null;
            }
            Object objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
            int i3 = onExtraCallbackWithResult + 19;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                return objIAuthTabCallback;
            }
            throw null;
        }

        /* renamed from: o.MaxFullscreenAdImplExternalSyntheticLambda6$onWarmupCompleted$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function1<access13800<? super transGetKmCert>, Object> {
            private static int $10 = 0;
            private static int $11 = 1;
            private static int IAuthTabCallback = 0;
            private static int IAuthTabCallbackDefault = 1;
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            Object L$4;
            Object L$5;
            int label;
            final /* synthetic */ MaxFullscreenAdImplExternalSyntheticLambda6 this$0;
            private static char[] onExtraCallback = {32257, 32278, 32256, 32262, 32271, 32263, 32269, 32264, 32268, 32260, 32274};
            private static int onWarmupCompleted = -1184334157;
            private static boolean onExtraCallbackWithResult = true;
            private static boolean onNavigationEvent = true;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda6, access13800<? super AnonymousClass1> access13800Var) {
                super(1, access13800Var);
                this.this$0 = maxFullscreenAdImplExternalSyntheticLambda6;
            }

            public final access13800<Unit> create(access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, access13800Var);
                int i2 = IAuthTabCallbackDefault + 85;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass1;
            }

            public /* synthetic */ Object invoke(Object obj) throws Exception {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackDefault + 99;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((access13800) obj);
                int i4 = IAuthTabCallback + 55;
                IAuthTabCallbackDefault = i4 % 128;
                int i5 = i4 % 2;
                return objOnExtraCallbackWithResult;
            }

            public final Object onExtraCallbackWithResult(access13800<? super transGetKmCert> access13800Var) throws Exception {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackDefault + 43;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = IAuthTabCallback + 93;
                IAuthTabCallbackDefault = i4 % 128;
                if (i4 % 2 != 0) {
                    return objInvokeSuspend;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
                int length;
                char[] cArr2;
                int i2 = 2 % 2;
                DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
                char[] cArr3 = onExtraCallback;
                if (cArr3 != null) {
                    int i3 = $10 + 45;
                    $11 = i3 % 128;
                    if (i3 % 2 == 0) {
                        length = cArr3.length;
                        cArr2 = new char[length];
                    } else {
                        length = cArr3.length;
                        cArr2 = new char[length];
                    }
                    for (int i4 = 0; i4 < length; i4++) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr3[i4])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 76 - ImageFormat.getBitsPerPixel(0), 20952 - View.resolveSizeAndState(0, 0, 0), 1064889259, false, "x", new Class[]{Integer.TYPE});
                            }
                            cArr2[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr3 = cArr2;
                }
                try {
                    Object[] objArr3 = {Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), 75 - View.MeasureSpec.getSize(0), 16036 - Process.getGidForName(""), -807942443, false, "y", new Class[]{Integer.TYPE});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    int i5 = 1052772399;
                    if (onNavigationEvent) {
                        int i6 = $11 + 91;
                        $10 = i6 % 128;
                        int i7 = i6 % 2;
                        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                        char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                            cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 63 - KeyEvent.getDeadChar(0, 0), ((byte) KeyEvent.getModifierMetaStateMask()) + 12215, 260110015, false, "v", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback3).invoke(null, objArr4);
                            int i8 = $11 + 111;
                            $10 = i8 % 128;
                            int i9 = i8 % 2;
                            i5 = 1052772399;
                        }
                        String str = new String(cArr4);
                        int i10 = $10 + 125;
                        $11 = i10 % 128;
                        int i11 = i10 % 2;
                        objArr[0] = str;
                        return;
                    }
                    if (!onExtraCallbackWithResult) {
                        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                        char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                            cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                        }
                        objArr[0] = new String(cArr5);
                        return;
                    }
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                    char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                    int i12 = $11 + 67;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                        cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), View.MeasureSpec.getSize(0) + 63, 12214 - (ViewConfiguration.getFadingEdgeLength() >> 16), 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    }
                    objArr[0] = new String(cArr6);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:106:0x045a  */
            /* JADX WARN: Removed duplicated region for block: B:124:0x0578  */
            /* JADX WARN: Removed duplicated region for block: B:129:0x058d  */
            /* JADX WARN: Removed duplicated region for block: B:59:0x025b A[PHI: r1 r2
              0x025b: PHI (r1v45 o.setRequestListener) = (r1v44 o.setRequestListener), (r1v59 o.setRequestListener) binds: [B:58:0x0259, B:55:0x0229] A[DONT_GENERATE, DONT_INLINE]
              0x025b: PHI (r2v44 java.util.Map) = (r2v43 java.util.Map), (r2v65 java.util.Map) binds: [B:58:0x0259, B:55:0x0229] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:60:0x025e A[PHI: r1 r2 r5
              0x025e: PHI (r1v56 o.setRequestListener) = (r1v44 o.setRequestListener), (r1v59 o.setRequestListener) binds: [B:58:0x0259, B:55:0x0229] A[DONT_GENERATE, DONT_INLINE]
              0x025e: PHI (r2v62 java.util.Map) = (r2v43 java.util.Map), (r2v65 java.util.Map) binds: [B:58:0x0259, B:55:0x0229] A[DONT_GENERATE, DONT_INLINE]
              0x025e: PHI (r5v52 java.lang.String) = (r5v36 java.lang.String), (r5v53 java.lang.String) binds: [B:58:0x0259, B:55:0x0229] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:91:0x03df  */
            /* JADX WARN: Type inference failed for: r14v0 */
            /* JADX WARN: Type inference failed for: r14v23 */
            /* JADX WARN: Type inference failed for: r14v25, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r14v28, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r14v3 */
            /* JADX WARN: Type inference failed for: r14v4 */
            /* JADX WARN: Type inference failed for: r14v42 */
            /* JADX WARN: Type inference failed for: r14v43 */
            /* JADX WARN: Type inference failed for: r14v45 */
            /* JADX WARN: Type inference failed for: r14v46 */
            /* JADX WARN: Type inference failed for: r14v47 */
            /* JADX WARN: Type inference failed for: r14v48 */
            /* JADX WARN: Type inference failed for: r14v49 */
            /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r14v50 */
            /* JADX WARN: Type inference failed for: r14v56 */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r9v0 */
            /* JADX WARN: Type inference failed for: r9v3 */
            /* JADX WARN: Type inference failed for: r9v34 */
            /* JADX WARN: Type inference failed for: r9v37 */
            /* JADX WARN: Type inference failed for: r9v38 */
            /* JADX WARN: Type inference failed for: r9v39 */
            /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.String] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws Exception {
                char c;
                Object obj2;
                char c2;
                Object obj3;
                Object obj4;
                AnonymousClass1 anonymousClass1;
                String str;
                AnonymousClass1 anonymousClass12;
                String str2;
                String string;
                Object obj5;
                AnonymousClass1 anonymousClass13;
                String str3;
                Pair pairIAuthTabCallback;
                Pair pairIAuthTabCallback2;
                String str4;
                Pair pairIAuthTabCallback3;
                Object obj6;
                Pair[] pairArr;
                Object obj7;
                AnonymousClass1 anonymousClass14;
                Object obj8;
                AnonymousClass1 anonymousClass15;
                String str5;
                MaxFullscreenAdImplExternalSyntheticLambda10 maxFullscreenAdImplExternalSyntheticLambda10;
                logApiCall logapicallIAuthTabCallbackStub;
                Object objIAuthTabCallback;
                Object obj9;
                String str6;
                AnonymousClass1 anonymousClass16;
                Object obj10;
                String str7;
                String str8;
                Object obj11;
                AnonymousClass1 anonymousClass17;
                Object obj12;
                boolean z;
                AnonymousClass1 anonymousClass18;
                Object obj13;
                Object obj14;
                String str9;
                int i;
                setRequestListener setrequestlistener;
                String str10;
                String strOnExtraCallback;
                char c3;
                Object obj15;
                Date dateOnWarmupCompleted;
                MaxFullscreenAdImplExternalSyntheticLambda10.IAuthTabCallback iAuthTabCallback;
                setRequestListener setrequestlistener2;
                Object objOnNavigationEvent;
                setAdReviewListener setadreviewlistener;
                Pair pairIAuthTabCallback4;
                Pair pairIAuthTabCallback5;
                Pair pairIAuthTabCallback6;
                setRequestListener setrequestlistenerIAuthTabCallback;
                Map map;
                String strOnWarmupCompleted;
                setRequestListener setrequestlistener3;
                String string2;
                Object obj16;
                AnonymousClass1 anonymousClass19;
                boolean zExtraCallbackWithResult;
                boolean typedObject;
                Long interfaceDescriptor;
                boolean zOnWarmupCompleted;
                String str11;
                boolean zBooleanValue;
                setRequestListener setrequestlistener4;
                ?? r14 = 2;
                ?? r142 = 2;
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 67;
                IAuthTabCallbackDefault = i3 % 128;
                int i4 = i3 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i5 = this.label;
                String str12 = "host";
                String str13 = "host-bundle";
                ?? r3 = "TossBundleLoader";
                ?? r9 = 1;
                try {
                    try {
                        try {
                            if (i5 == 0) {
                                ResultKt.onNavigationEvent(obj);
                                ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                                Pair pairIAuthTabCallback7 = getWrite.IAuthTabCallback("from", "TossBundleLoader");
                                Pair pairIAuthTabCallback8 = getWrite.IAuthTabCallback("serviceBundleName", MaxFullscreenAdImplExternalSyntheticLambda6.access100(this.this$0));
                                Pair pairIAuthTabCallback9 = getWrite.IAuthTabCallback("hostBundleName", MaxFullscreenAdImplExternalSyntheticLambda6.IAuthTabCallbackDefault(this.this$0));
                                try {
                                    Date dateIAuthTabCallbackStubProxy = MaxFullscreenAdImplExternalSyntheticLambda6.IAuthTabCallbackStubProxy(this.this$0);
                                    if (dateIAuthTabCallbackStubProxy != null) {
                                        try {
                                            string = dateIAuthTabCallbackStubProxy.toString();
                                            int i6 = IAuthTabCallback + 53;
                                            str2 = "react_native_debug";
                                            IAuthTabCallbackDefault = i6 % 128;
                                            int i7 = i6 % 2;
                                        } catch (Exception e) {
                                            e = e;
                                            str2 = "react_native_debug";
                                            obj5 = "TossBundleLoader";
                                            str12 = "from";
                                            str13 = "error";
                                            obj2 = "hostBundleName";
                                            anonymousClass13 = this;
                                            str3 = str2;
                                            c = 1;
                                            anonymousClass16 = anonymousClass13;
                                            str6 = str3;
                                            obj9 = obj5;
                                            c2 = 2;
                                            anonymousClass1 = anonymousClass16;
                                            r9 = str6;
                                            r142 = obj9;
                                            ConvertFloatArrayToByteArray convertFloatArrayToByteArray2 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                                            Pair pairIAuthTabCallback10 = getWrite.IAuthTabCallback(str12, (Object) r142);
                                            Pair pairIAuthTabCallback11 = getWrite.IAuthTabCallback("serviceBundleName", MaxFullscreenAdImplExternalSyntheticLambda6.access100(anonymousClass1.this$0));
                                            Pair pairIAuthTabCallback12 = getWrite.IAuthTabCallback(obj2, MaxFullscreenAdImplExternalSyntheticLambda6.IAuthTabCallbackDefault(anonymousClass1.this$0));
                                            Pair pairIAuthTabCallback13 = getWrite.IAuthTabCallback(str13, e.getMessage());
                                            Pair[] pairArr2 = new Pair[4];
                                            pairArr2[0] = pairIAuthTabCallback10;
                                            pairArr2[c] = pairIAuthTabCallback11;
                                            pairArr2[c2] = pairIAuthTabCallback12;
                                            pairArr2[3] = pairIAuthTabCallback13;
                                            convertFloatArrayToByteArray2.onExtraCallbackWithResult((String) r9, "bundle_load_error", e, access8100.onWarmupCompleted(pairArr2));
                                            throw e;
                                        }
                                    } else {
                                        str2 = "react_native_debug";
                                        string = null;
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    str12 = "from";
                                    obj4 = "react_native_debug";
                                    str13 = "error";
                                    obj2 = "hostBundleName";
                                    c2 = 2;
                                    c = 1;
                                    obj3 = "TossBundleLoader";
                                    anonymousClass1 = this;
                                    r9 = obj4;
                                    r142 = obj3;
                                    ConvertFloatArrayToByteArray convertFloatArrayToByteArray22 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                                    Pair pairIAuthTabCallback102 = getWrite.IAuthTabCallback(str12, (Object) r142);
                                    Pair pairIAuthTabCallback112 = getWrite.IAuthTabCallback("serviceBundleName", MaxFullscreenAdImplExternalSyntheticLambda6.access100(anonymousClass1.this$0));
                                    Pair pairIAuthTabCallback122 = getWrite.IAuthTabCallback(obj2, MaxFullscreenAdImplExternalSyntheticLambda6.IAuthTabCallbackDefault(anonymousClass1.this$0));
                                    Pair pairIAuthTabCallback132 = getWrite.IAuthTabCallback(str13, e.getMessage());
                                    Pair[] pairArr22 = new Pair[4];
                                    pairArr22[0] = pairIAuthTabCallback102;
                                    pairArr22[c] = pairIAuthTabCallback112;
                                    pairArr22[c2] = pairIAuthTabCallback122;
                                    pairArr22[3] = pairIAuthTabCallback132;
                                    convertFloatArrayToByteArray22.onExtraCallbackWithResult((String) r9, "bundle_load_error", e, access8100.onWarmupCompleted(pairArr22));
                                    throw e;
                                }
                                try {
                                    pairIAuthTabCallback = getWrite.IAuthTabCallback("minDeployedAt", string);
                                    pairIAuthTabCallback2 = getWrite.IAuthTabCallback("region", MaxFullscreenAdImplExternalSyntheticLambda6.IAuthTabCallback_Parcel(this.this$0));
                                    str4 = "error";
                                    try {
                                        pairIAuthTabCallback3 = getWrite.IAuthTabCallback("company", MaxFullscreenAdImplExternalSyntheticLambda6.asBinder(this.this$0));
                                        obj6 = "bundleName";
                                        pairArr = new Pair[6];
                                        pairArr[0] = pairIAuthTabCallback7;
                                        try {
                                            pairArr[1] = pairIAuthTabCallback8;
                                        } catch (Exception e3) {
                                            e = e3;
                                            c = 1;
                                            obj7 = "TossBundleLoader";
                                            str12 = "from";
                                        }
                                    } catch (Exception e4) {
                                        e = e4;
                                        obj5 = "TossBundleLoader";
                                        str12 = "from";
                                        obj2 = "hostBundleName";
                                        anonymousClass13 = this;
                                        str3 = str2;
                                        str13 = str4;
                                        c = 1;
                                        anonymousClass16 = anonymousClass13;
                                        str6 = str3;
                                        obj9 = obj5;
                                        c2 = 2;
                                        anonymousClass1 = anonymousClass16;
                                        r9 = str6;
                                        r142 = obj9;
                                        ConvertFloatArrayToByteArray convertFloatArrayToByteArray222 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                                        Pair pairIAuthTabCallback1022 = getWrite.IAuthTabCallback(str12, (Object) r142);
                                        Pair pairIAuthTabCallback1122 = getWrite.IAuthTabCallback("serviceBundleName", MaxFullscreenAdImplExternalSyntheticLambda6.access100(anonymousClass1.this$0));
                                        Pair pairIAuthTabCallback1222 = getWrite.IAuthTabCallback(obj2, MaxFullscreenAdImplExternalSyntheticLambda6.IAuthTabCallbackDefault(anonymousClass1.this$0));
                                        Pair pairIAuthTabCallback1322 = getWrite.IAuthTabCallback(str13, e.getMessage());
                                        Pair[] pairArr222 = new Pair[4];
                                        pairArr222[0] = pairIAuthTabCallback1022;
                                        pairArr222[c] = pairIAuthTabCallback1122;
                                        pairArr222[c2] = pairIAuthTabCallback1222;
                                        pairArr222[3] = pairIAuthTabCallback1322;
                                        convertFloatArrayToByteArray222.onExtraCallbackWithResult((String) r9, "bundle_load_error", e, access8100.onWarmupCompleted(pairArr222));
                                        throw e;
                                    }
                                } catch (Exception e5) {
                                    e = e5;
                                    obj5 = "TossBundleLoader";
                                    str12 = "from";
                                    str13 = "error";
                                    obj2 = "hostBundleName";
                                    anonymousClass13 = this;
                                    str3 = str2;
                                    c = 1;
                                    anonymousClass16 = anonymousClass13;
                                    str6 = str3;
                                    obj9 = obj5;
                                    c2 = 2;
                                    anonymousClass1 = anonymousClass16;
                                    r9 = str6;
                                    r142 = obj9;
                                    ConvertFloatArrayToByteArray convertFloatArrayToByteArray2222 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                                    Pair pairIAuthTabCallback10222 = getWrite.IAuthTabCallback(str12, (Object) r142);
                                    Pair pairIAuthTabCallback11222 = getWrite.IAuthTabCallback("serviceBundleName", MaxFullscreenAdImplExternalSyntheticLambda6.access100(anonymousClass1.this$0));
                                    Pair pairIAuthTabCallback12222 = getWrite.IAuthTabCallback(obj2, MaxFullscreenAdImplExternalSyntheticLambda6.IAuthTabCallbackDefault(anonymousClass1.this$0));
                                    Pair pairIAuthTabCallback13222 = getWrite.IAuthTabCallback(str13, e.getMessage());
                                    Pair[] pairArr2222 = new Pair[4];
                                    pairArr2222[0] = pairIAuthTabCallback10222;
                                    pairArr2222[c] = pairIAuthTabCallback11222;
                                    pairArr2222[c2] = pairIAuthTabCallback12222;
                                    pairArr2222[3] = pairIAuthTabCallback13222;
                                    convertFloatArrayToByteArray2222.onExtraCallbackWithResult((String) r9, "bundle_load_error", e, access8100.onWarmupCompleted(pairArr2222));
                                    throw e;
                                }
                                try {
                                    pairArr[2] = pairIAuthTabCallback9;
                                    pairArr[3] = pairIAuthTabCallback;
                                    pairArr[4] = pairIAuthTabCallback2;
                                    pairArr[5] = pairIAuthTabCallback3;
                                    ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "react_native_debug", "bundle_load_start", access8100.onWarmupCompleted(pairArr), (String) null, false, (String) null, 56, (Object) null);
                                    maxFullscreenAdImplExternalSyntheticLambda10 = (MaxFullscreenAdImplExternalSyntheticLambda10) MaxFullscreenAdImplExternalSyntheticLambda6.onExtraCallbackWithResult(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{this.this$0}, -662315012, 662315018, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
                                    logapicallIAuthTabCallbackStub = MaxFullscreenAdImplExternalSyntheticLambda6.IAuthTabCallbackStub(this.this$0);
                                } catch (Exception e6) {
                                    e = e6;
                                    c2 = 2;
                                    obj8 = "TossBundleLoader";
                                    str12 = "from";
                                    obj2 = "hostBundleName";
                                    anonymousClass15 = this;
                                    str5 = str2;
                                    str13 = str4;
                                    c = 1;
                                    anonymousClass1 = anonymousClass15;
                                    r9 = str5;
                                    r142 = obj8;
                                    ConvertFloatArrayToByteArray convertFloatArrayToByteArray22222 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                                    Pair pairIAuthTabCallback102222 = getWrite.IAuthTabCallback(str12, (Object) r142);
                                    Pair pairIAuthTabCallback112222 = getWrite.IAuthTabCallback("serviceBundleName", MaxFullscreenAdImplExternalSyntheticLambda6.access100(anonymousClass1.this$0));
                                    Pair pairIAuthTabCallback122222 = getWrite.IAuthTabCallback(obj2, MaxFullscreenAdImplExternalSyntheticLambda6.IAuthTabCallbackDefault(anonymousClass1.this$0));
                                    Pair pairIAuthTabCallback132222 = getWrite.IAuthTabCallback(str13, e.getMessage());
                                    Pair[] pairArr22222 = new Pair[4];
                                    pairArr22222[0] = pairIAuthTabCallback102222;
                                    pairArr22222[c] = pairIAuthTabCallback112222;
                                    pairArr22222[c2] = pairIAuthTabCallback122222;
                                    pairArr22222[3] = pairIAuthTabCallback132222;
                                    convertFloatArrayToByteArray22222.onExtraCallbackWithResult((String) r9, "bundle_load_error", e, access8100.onWarmupCompleted(pairArr22222));
                                    throw e;
                                }
                                try {
                                    this.label = 1;
                                    objIAuthTabCallback = maxFullscreenAdImplExternalSyntheticLambda10.IAuthTabCallback(logapicallIAuthTabCallbackStub, "TossBundleLoader", this);
                                    if (objIAuthTabCallback != objOnWarmupCompleted) {
                                    }
                                    int i8 = IAuthTabCallbackDefault + 93;
                                    IAuthTabCallback = i8 % 128;
                                    int i9 = i8 % 2;
                                    return objOnWarmupCompleted;
                                } catch (Exception e7) {
                                    e = e7;
                                    obj7 = "TossBundleLoader";
                                    str12 = "from";
                                    c = 1;
                                    obj2 = "hostBundleName";
                                    anonymousClass14 = this;
                                    obj10 = obj7;
                                    str6 = str2;
                                    str13 = str4;
                                    anonymousClass16 = anonymousClass14;
                                    obj9 = obj10;
                                    c2 = 2;
                                    anonymousClass1 = anonymousClass16;
                                    r9 = str6;
                                    r142 = obj9;
                                    ConvertFloatArrayToByteArray convertFloatArrayToByteArray222222 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                                    Pair pairIAuthTabCallback1022222 = getWrite.IAuthTabCallback(str12, (Object) r142);
                                    Pair pairIAuthTabCallback1122222 = getWrite.IAuthTabCallback("serviceBundleName", MaxFullscreenAdImplExternalSyntheticLambda6.access100(anonymousClass1.this$0));
                                    Pair pairIAuthTabCallback1222222 = getWrite.IAuthTabCallback(obj2, MaxFullscreenAdImplExternalSyntheticLambda6.IAuthTabCallbackDefault(anonymousClass1.this$0));
                                    Pair pairIAuthTabCallback1322222 = getWrite.IAuthTabCallback(str13, e.getMessage());
                                    Pair[] pairArr222222 = new Pair[4];
                                    pairArr222222[0] = pairIAuthTabCallback1022222;
                                    pairArr222222[c] = pairIAuthTabCallback1122222;
                                    pairArr222222[c2] = pairIAuthTabCallback1222222;
                                    pairArr222222[3] = pairIAuthTabCallback1322222;
                                    convertFloatArrayToByteArray222222.onExtraCallbackWithResult((String) r9, "bundle_load_error", e, access8100.onWarmupCompleted(pairArr222222));
                                    throw e;
                                }
                            }
                            int i10 = IAuthTabCallback + 25;
                            IAuthTabCallbackDefault = i10 % 128;
                            if (i10 % 2 != 0 ? i5 == 1 : i5 == 1) {
                                ResultKt.onNavigationEvent(obj);
                                objIAuthTabCallback = obj;
                                str2 = "react_native_debug";
                                str4 = "error";
                                obj6 = "bundleName";
                            } else if (i5 == 2) {
                                Date date = (Date) this.L$2;
                                setrequestlistener2 = (setRequestListener) this.L$1;
                                iAuthTabCallback = (MaxFullscreenAdImplExternalSyntheticLambda10.IAuthTabCallback) this.L$0;
                                ResultKt.onNavigationEvent(obj);
                                dateOnWarmupCompleted = date;
                                obj11 = "TossBundleLoader";
                                str8 = "from";
                                str = "react_native_debug";
                                str7 = "error";
                                obj13 = "bundleName";
                                str9 = "";
                                obj2 = "hostBundleName";
                                obj14 = "host-bundle";
                                obj15 = "host";
                                c2 = 2;
                                objOnNavigationEvent = obj;
                                setadreviewlistener = (setAdReviewListener) objOnNavigationEvent;
                                if (setadreviewlistener instanceof setAdReviewListener.onExtraCallback) {
                                    anonymousClass12 = this;
                                    r14 = obj11;
                                    str12 = str8;
                                    Object obj17 = obj15;
                                    i = 3;
                                    if (!(setadreviewlistener instanceof setAdReviewListener.IAuthTabCallback)) {
                                        Object obj18 = obj14;
                                        Object obj19 = obj13;
                                        c = 1;
                                        if (setadreviewlistener instanceof setAdReviewListener.onWarmupCompleted) {
                                            ConvertFloatArrayToByteArray convertFloatArrayToByteArray3 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                                            Pair pairIAuthTabCallback14 = getWrite.IAuthTabCallback(str12, (Object) r14);
                                            Pair pairIAuthTabCallback15 = getWrite.IAuthTabCallback(obj19, MaxFullscreenAdImplExternalSyntheticLambda6.IAuthTabCallbackDefault(anonymousClass12.this$0));
                                            Object[] objArr = new Object[1];
                                            a(null, null, new byte[]{-121, -119, -125, -117, -126, -127}, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 126, objArr);
                                            Pair pairIAuthTabCallback16 = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), ((setAdReviewListener.onWarmupCompleted) setadreviewlistener).onNavigationEvent());
                                            Pair[] pairArr3 = new Pair[3];
                                            pairArr3[0] = pairIAuthTabCallback14;
                                            pairArr3[1] = pairIAuthTabCallback15;
                                            pairArr3[c2] = pairIAuthTabCallback16;
                                            ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray3, "react_native_debug", "host_bundle_incorrect_version", (Throwable) null, access8100.onWarmupCompleted(pairArr3), 4, (Object) null);
                                            throw new IllegalStateException("Host bundle version mismatch: " + ((setAdReviewListener.onWarmupCompleted) setadreviewlistener).onNavigationEvent());
                                        }
                                        int i11 = IAuthTabCallback + 45;
                                        IAuthTabCallbackDefault = i11 % 128;
                                        int i12 = i11 % 2;
                                        if (!(setadreviewlistener instanceof setAdReviewListener.onNavigationEvent)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        ConvertFloatArrayToByteArray convertFloatArrayToByteArray4 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                                        Throwable thOnExtraCallbackWithResult = ((setAdReviewListener.onNavigationEvent) setadreviewlistener).onExtraCallbackWithResult();
                                        Pair pairIAuthTabCallback17 = getWrite.IAuthTabCallback(str12, (Object) r14);
                                        Pair pairIAuthTabCallback18 = getWrite.IAuthTabCallback(obj19, MaxFullscreenAdImplExternalSyntheticLambda6.IAuthTabCallbackDefault(anonymousClass12.this$0));
                                        str13 = str7;
                                        try {
                                            Pair pairIAuthTabCallback19 = getWrite.IAuthTabCallback(str13, ((setAdReviewListener.onNavigationEvent) setadreviewlistener).onExtraCallbackWithResult().getMessage());
                                            Pair[] pairArr4 = new Pair[3];
                                            pairArr4[0] = pairIAuthTabCallback17;
                                            pairArr4[1] = pairIAuthTabCallback18;
                                            pairArr4[c2] = pairIAuthTabCallback19;
                                            convertFloatArrayToByteArray4.onExtraCallbackWithResult(str, "host_bundle_load_failed", thOnExtraCallbackWithResult, access8100.onWarmupCompleted(pairArr4));
                                            auth authVar = auth.onNavigationEvent;
                                            Pair pairIAuthTabCallback20 = getWrite.IAuthTabCallback(obj19, MaxFullscreenAdImplExternalSyntheticLambda6.IAuthTabCallbackDefault(anonymousClass12.this$0));
                                            Pair pairIAuthTabCallback21 = getWrite.IAuthTabCallback("source", obj18);
                                            String str14 = str9;
                                            Object[] objArr2 = new Object[1];
                                            a(null, null, new byte[]{-122, -123, -124, -125, -126, -127}, TextUtils.indexOf(str14, str14, 0, 0) + 127, objArr2);
                                            Pair pairIAuthTabCallback22 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), str13);
                                            String message = ((setAdReviewListener.onNavigationEvent) setadreviewlistener).onExtraCallbackWithResult().getMessage();
                                            if (message == null) {
                                                Object[] objArr3 = new Object[1];
                                                a(null, null, new byte[]{-121, -118, -119, -121, -120, -121, -124}, 128 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr3);
                                                message = ((String) objArr3[0]).intern();
                                            }
                                            Pair pairIAuthTabCallback23 = getWrite.IAuthTabCallback(str13, message);
                                            Pair pairIAuthTabCallback24 = getWrite.IAuthTabCallback("errorType", ((setAdReviewListener.onNavigationEvent) setadreviewlistener).onExtraCallbackWithResult().getClass().getSimpleName());
                                            Pair[] pairArr5 = new Pair[5];
                                            pairArr5[0] = pairIAuthTabCallback20;
                                            pairArr5[1] = pairIAuthTabCallback21;
                                            pairArr5[c2] = pairIAuthTabCallback22;
                                            pairArr5[3] = pairIAuthTabCallback23;
                                            pairArr5[4] = pairIAuthTabCallback24;
                                            auth.IAuthTabCallback(authVar, "TossBundleLoader: host-bundle result=error", access8100.onWarmupCompleted(pairArr5), (auth.onExtraCallbackWithResult) null, 4, (Object) null);
                                            throw ((setAdReviewListener.onNavigationEvent) setadreviewlistener).onExtraCallbackWithResult();
                                        } catch (Exception e8) {
                                            e = e8;
                                            r9 = str;
                                            anonymousClass1 = anonymousClass12;
                                            r142 = r14;
                                            ConvertFloatArrayToByteArray convertFloatArrayToByteArray2222222 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                                            Pair pairIAuthTabCallback10222222 = getWrite.IAuthTabCallback(str12, (Object) r142);
                                            Pair pairIAuthTabCallback11222222 = getWrite.IAuthTabCallback("serviceBundleName", MaxFullscreenAdImplExternalSyntheticLambda6.access100(anonymousClass1.this$0));
                                            Pair pairIAuthTabCallback12222222 = getWrite.IAuthTabCallback(obj2, MaxFullscreenAdImplExternalSyntheticLambda6.IAuthTabCallbackDefault(anonymousClass1.this$0));
                                            Pair pairIAuthTabCallback13222222 = getWrite.IAuthTabCallback(str13, e.getMessage());
                                            Pair[] pairArr2222222 = new Pair[4];
                                            pairArr2222222[0] = pairIAuthTabCallback10222222;
                                            pairArr2222222[c] = pairIAuthTabCallback11222222;
                                            pairArr2222222[c2] = pairIAuthTabCallback12222222;
                                            pairArr2222222[3] = pairIAuthTabCallback13222222;
                                            convertFloatArrayToByteArray2222222.onExtraCallbackWithResult((String) r9, "bundle_load_error", e, access8100.onWarmupCompleted(pairArr2222222));
                                            throw e;
                                        }
                                    }
                                    int i13 = IAuthTabCallback + 27;
                                    IAuthTabCallbackDefault = i13 % 128;
                                    int i14 = i13 % 2;
                                    try {
                                        setRequestListener setrequestlistenerIAuthTabCallback2 = ((setAdReviewListener.IAuthTabCallback) setadreviewlistener).IAuthTabCallback();
                                        String strOnWarmupCompleted2 = setrequestlistenerIAuthTabCallback2.onWarmupCompleted();
                                        if (strOnWarmupCompleted2 == null) {
                                            throw new IllegalStateException("Host bundle filePath is null");
                                        }
                                        ((Map) MaxFullscreenAdImplExternalSyntheticLambda6.onExtraCallbackWithResult(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{anonymousClass12.this$0}, -1701456764, 1701456768, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback())).put(obj17, strOnWarmupCompleted2);
                                        MaxFullscreenAdImplExternalSyntheticLambda6.onExtraCallback(anonymousClass12.this$0, setrequestlistenerIAuthTabCallback2.onExtraCallback());
                                        MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda6 = anonymousClass12.this$0;
                                        MaxFullscreenAdImplExternalSyntheticLambda6.onExtraCallback(maxFullscreenAdImplExternalSyntheticLambda6, (MaxFullscreenAdImpl) MaxFullscreenAdImplExternalSyntheticLambda6.onExtraCallbackWithResult(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{maxFullscreenAdImplExternalSyntheticLambda6, setrequestlistenerIAuthTabCallback2}, 1477018296, -1477018293, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback()));
                                        RnPhaseObserver rnPhaseObserverWriteTypedObject = MaxFullscreenAdImplExternalSyntheticLambda6.writeTypedObject(anonymousClass12.this$0);
                                        anonymousClass12.L$0 = access15400.onNavigationEvent(iAuthTabCallback);
                                        anonymousClass12.L$1 = access15400.onNavigationEvent(setrequestlistener2);
                                        anonymousClass12.L$2 = access15400.onNavigationEvent(dateOnWarmupCompleted);
                                        anonymousClass12.L$3 = access15400.onNavigationEvent(setadreviewlistener);
                                        anonymousClass12.L$4 = setrequestlistenerIAuthTabCallback2;
                                        anonymousClass12.L$5 = strOnWarmupCompleted2;
                                        anonymousClass12.label = 3;
                                        if (rnPhaseObserverWriteTypedObject.onWarmupCompleted((access13800<? super Unit>) anonymousClass12) == objOnWarmupCompleted) {
                                            int i82 = IAuthTabCallbackDefault + 93;
                                            IAuthTabCallback = i82 % 128;
                                            int i92 = i82 % 2;
                                            return objOnWarmupCompleted;
                                        }
                                        setrequestlistener = setrequestlistenerIAuthTabCallback2;
                                        str10 = strOnWarmupCompleted2;
                                        anonymousClass12 = anonymousClass12;
                                        r14 = r14;
                                        ConvertFloatArrayToByteArray convertFloatArrayToByteArray5 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                                        Pair pairIAuthTabCallback25 = getWrite.IAuthTabCallback(str12, (Object) r14);
                                        Object obj20 = obj13;
                                        Pair pairIAuthTabCallback26 = getWrite.IAuthTabCallback(obj20, MaxFullscreenAdImplExternalSyntheticLambda6.IAuthTabCallbackDefault(anonymousClass12.this$0));
                                        Pair pairIAuthTabCallback27 = getWrite.IAuthTabCallback("filePath", str10);
                                        Pair[] pairArr6 = new Pair[i];
                                        pairArr6[0] = pairIAuthTabCallback25;
                                        c = 1;
                                        pairArr6[1] = pairIAuthTabCallback26;
                                        pairArr6[c2] = pairIAuthTabCallback27;
                                        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray5, "react_native_debug", "host_bundle_loaded", access8100.onWarmupCompleted(pairArr6), (String) null, false, (String) null, 56, (Object) null);
                                        auth authVar2 = auth.onNavigationEvent;
                                        Pair pairIAuthTabCallback28 = getWrite.IAuthTabCallback(obj20, MaxFullscreenAdImplExternalSyntheticLambda6.IAuthTabCallbackDefault(anonymousClass12.this$0));
                                        Pair pairIAuthTabCallback29 = getWrite.IAuthTabCallback("source", obj14);
                                        Object[] objArr4 = new Object[1];
                                        a(null, null, new byte[]{-122, -123, -124, -125, -126, -127}, 128 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr4);
                                        Pair pairIAuthTabCallback30 = getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), "success");
                                        strOnExtraCallback = setrequestlistener.onExtraCallback();
                                        if (strOnExtraCallback != null) {
                                        }
                                        Pair pairIAuthTabCallback31 = getWrite.IAuthTabCallback("deploymentId", strOnExtraCallback);
                                        Pair[] pairArr7 = new Pair[4];
                                        pairArr7[c3] = pairIAuthTabCallback28;
                                        pairArr7[1] = pairIAuthTabCallback29;
                                        pairArr7[c2] = pairIAuthTabCallback30;
                                        pairArr7[3] = pairIAuthTabCallback31;
                                        auth.IAuthTabCallback(authVar2, "TossBundleLoader: host-bundle result=success", access8100.onWarmupCompleted(pairArr7), (auth.onExtraCallbackWithResult) null, 4, (Object) null);
                                        return new transGetKmCert.onWarmupCompleted(new pkcs5PBKDF2.onExtraCallbackWithResult(str10), MaxFullscreenAdImplExternalSyntheticLambda6.IAuthTabCallbackDefault(anonymousClass12.this$0));
                                    } catch (Exception e9) {
                                        e = e9;
                                        c = 1;
                                        anonymousClass18 = anonymousClass12;
                                        z = r14;
                                        anonymousClass12 = anonymousClass18;
                                        r14 = z;
                                        str13 = str7;
                                        r9 = str;
                                        anonymousClass1 = anonymousClass12;
                                        r142 = r14;
                                        ConvertFloatArrayToByteArray convertFloatArrayToByteArray22222222 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                                        Pair pairIAuthTabCallback102222222 = getWrite.IAuthTabCallback(str12, (Object) r142);
                                        Pair pairIAuthTabCallback112222222 = getWrite.IAuthTabCallback("serviceBundleName", MaxFullscreenAdImplExternalSyntheticLambda6.access100(anonymousClass1.this$0));
                                        Pair pairIAuthTabCallback122222222 = getWrite.IAuthTabCallback(obj2, MaxFullscreenAdImplExternalSyntheticLambda6.IAuthTabCallbackDefault(anonymousClass1.this$0));
                                        Pair pairIAuthTabCallback132222222 = getWrite.IAuthTabCallback(str13, e.getMessage());
                                        Pair[] pairArr22222222 = new Pair[4];
                                        pairArr22222222[0] = pairIAuthTabCallback102222222;
                                        pairArr22222222[c] = pairIAuthTabCallback112222222;
                                        pairArr22222222[c2] = pairIAuthTabCallback122222222;
                                        pairArr22222222[3] = pairIAuthTabCallback132222222;
                                        convertFloatArrayToByteArray22222222.onExtraCallbackWithResult((String) r9, "bundle_load_error", e, access8100.onWarmupCompleted(pairArr22222222));
                                        throw e;
                                    }
                                }
                                anonymousClass17 = this;
                                try {
                                    MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda62 = anonymousClass17.this$0;
                                    MaxFullscreenAdImplExternalSyntheticLambda6.onExtraCallback(maxFullscreenAdImplExternalSyntheticLambda62, (MaxFullscreenAdImpl) MaxFullscreenAdImplExternalSyntheticLambda6.onExtraCallbackWithResult(maxFullscreenAdImplExternalSyntheticLambda62));
                                    ConvertFloatArrayToByteArray convertFloatArrayToByteArray6 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                                    obj12 = obj11;
                                    str12 = str8;
                                    try {
                                        pairIAuthTabCallback4 = getWrite.IAuthTabCallback(str12, obj12);
                                        pairIAuthTabCallback5 = getWrite.IAuthTabCallback(obj15, ((setAdReviewListener.onExtraCallback) setadreviewlistener).onExtraCallbackWithResult());
                                        pairIAuthTabCallback6 = getWrite.IAuthTabCallback("port", access14000.onNavigationEvent(((setAdReviewListener.onExtraCallback) setadreviewlistener).onNavigationEvent()));
                                    } catch (Exception e10) {
                                        e = e10;
                                        str13 = str7;
                                        str5 = str;
                                        anonymousClass15 = anonymousClass17;
                                        obj8 = obj12;
                                        c = 1;
                                        anonymousClass1 = anonymousClass15;
                                        r9 = str5;
                                        r142 = obj8;
                                        ConvertFloatArrayToByteArray convertFloatArrayToByteArray222222222 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                                        Pair pairIAuthTabCallback1022222222 = getWrite.IAuthTabCallback(str12, (Object) r142);
                                        Pair pairIAuthTabCallback1122222222 = getWrite.IAuthTabCallback("serviceBundleName", MaxFullscreenAdImplExternalSyntheticLambda6.access100(anonymousClass1.this$0));
                                        Pair pairIAuthTabCallback1222222222 = getWrite.IAuthTabCallback(obj2, MaxFullscreenAdImplExternalSyntheticLambda6.IAuthTabCallbackDefault(anonymousClass1.this$0));
                                        Pair pairIAuthTabCallback1322222222 = getWrite.IAuthTabCallback(str13, e.getMessage());
                                        Pair[] pairArr222222222 = new Pair[4];
                                        pairArr222222222[0] = pairIAuthTabCallback1022222222;
                                        pairArr222222222[c] = pairIAuthTabCallback1122222222;
                                        pairArr222222222[c2] = pairIAuthTabCallback1222222222;
                                        pairArr222222222[3] = pairIAuthTabCallback1322222222;
                                        convertFloatArrayToByteArray222222222.onExtraCallbackWithResult((String) r9, "bundle_load_error", e, access8100.onWarmupCompleted(pairArr222222222));
                                        throw e;
                                    }
                                    try {
                                        Pair[] pairArr8 = new Pair[3];
                                        pairArr8[0] = pairIAuthTabCallback4;
                                        pairArr8[1] = pairIAuthTabCallback5;
                                        pairArr8[c2] = pairIAuthTabCallback6;
                                        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray6, "react_native_debug", "metro_server_detected_host", access8100.onWarmupCompleted(pairArr8), (String) null, false, (String) null, 56, (Object) null);
                                        return new transGetKmCert.onNavigationEvent(((setAdReviewListener.onExtraCallback) setadreviewlistener).onExtraCallbackWithResult(), ((setAdReviewListener.onExtraCallback) setadreviewlistener).onNavigationEvent(), MaxFullscreenAdImplExternalSyntheticLambda6.IAuthTabCallbackDefault(anonymousClass17.this$0));
                                    } catch (Exception e11) {
                                        e = e11;
                                        str13 = str7;
                                        str5 = str;
                                        anonymousClass15 = anonymousClass17;
                                        obj8 = obj12;
                                        c = 1;
                                        anonymousClass1 = anonymousClass15;
                                        r9 = str5;
                                        r142 = obj8;
                                        ConvertFloatArrayToByteArray convertFloatArrayToByteArray2222222222 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                                        Pair pairIAuthTabCallback10222222222 = getWrite.IAuthTabCallback(str12, (Object) r142);
                                        Pair pairIAuthTabCallback11222222222 = getWrite.IAuthTabCallback("serviceBundleName", MaxFullscreenAdImplExternalSyntheticLambda6.access100(anonymousClass1.this$0));
                                        Pair pairIAuthTabCallback12222222222 = getWrite.IAuthTabCallback(obj2, MaxFullscreenAdImplExternalSyntheticLambda6.IAuthTabCallbackDefault(anonymousClass1.this$0));
                                        Pair pairIAuthTabCallback13222222222 = getWrite.IAuthTabCallback(str13, e.getMessage());
                                        Pair[] pairArr2222222222 = new Pair[4];
                                        pairArr2222222222[0] = pairIAuthTabCallback10222222222;
                                        pairArr2222222222[c] = pairIAuthTabCallback11222222222;
                                        pairArr2222222222[c2] = pairIAuthTabCallback12222222222;
                                        pairArr2222222222[3] = pairIAuthTabCallback13222222222;
                                        convertFloatArrayToByteArray2222222222.onExtraCallbackWithResult((String) r9, "bundle_load_error", e, access8100.onWarmupCompleted(pairArr2222222222));
                                        throw e;
                                    }
                                } catch (Exception e12) {
                                    e = e12;
                                    obj12 = obj11;
                                    str12 = str8;
                                }
                            } else {
                                if (i5 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                str10 = (String) this.L$5;
                                setrequestlistener = (setRequestListener) this.L$4;
                                ResultKt.onNavigationEvent(obj);
                                str12 = "from";
                                str = "react_native_debug";
                                str7 = "error";
                                obj13 = "bundleName";
                                str9 = "";
                                obj2 = "hostBundleName";
                                obj14 = "host-bundle";
                                c2 = 2;
                                r14 = "TossBundleLoader";
                                anonymousClass12 = this;
                                i = 3;
                                ConvertFloatArrayToByteArray convertFloatArrayToByteArray52 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                                Pair pairIAuthTabCallback252 = getWrite.IAuthTabCallback(str12, (Object) r14);
                                Object obj202 = obj13;
                                Pair pairIAuthTabCallback262 = getWrite.IAuthTabCallback(obj202, MaxFullscreenAdImplExternalSyntheticLambda6.IAuthTabCallbackDefault(anonymousClass12.this$0));
                                Pair pairIAuthTabCallback272 = getWrite.IAuthTabCallback("filePath", str10);
                                try {
                                    Pair[] pairArr62 = new Pair[i];
                                    pairArr62[0] = pairIAuthTabCallback252;
                                    c = 1;
                                    try {
                                        pairArr62[1] = pairIAuthTabCallback262;
                                        pairArr62[c2] = pairIAuthTabCallback272;
                                        try {
                                            ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray52, "react_native_debug", "host_bundle_loaded", access8100.onWarmupCompleted(pairArr62), (String) null, false, (String) null, 56, (Object) null);
                                            auth authVar22 = auth.onNavigationEvent;
                                            Pair pairIAuthTabCallback282 = getWrite.IAuthTabCallback(obj202, MaxFullscreenAdImplExternalSyntheticLambda6.IAuthTabCallbackDefault(anonymousClass12.this$0));
                                            Pair pairIAuthTabCallback292 = getWrite.IAuthTabCallback("source", obj14);
                                            try {
                                                Object[] objArr42 = new Object[1];
                                                a(null, null, new byte[]{-122, -123, -124, -125, -126, -127}, 128 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr42);
                                                Pair pairIAuthTabCallback302 = getWrite.IAuthTabCallback(((String) objArr42[0]).intern(), "success");
                                                strOnExtraCallback = setrequestlistener.onExtraCallback();
                                                if (strOnExtraCallback != null) {
                                                    int i15 = IAuthTabCallback + 121;
                                                    IAuthTabCallbackDefault = i15 % 128;
                                                    if (i15 % 2 == 0) {
                                                        c3 = 0;
                                                        int i16 = 45 / 0;
                                                    } else {
                                                        c3 = 0;
                                                    }
                                                    strOnExtraCallback = str9;
                                                } else {
                                                    c3 = 0;
                                                }
                                                Pair pairIAuthTabCallback312 = getWrite.IAuthTabCallback("deploymentId", strOnExtraCallback);
                                                Pair[] pairArr72 = new Pair[4];
                                                pairArr72[c3] = pairIAuthTabCallback282;
                                                pairArr72[1] = pairIAuthTabCallback292;
                                                pairArr72[c2] = pairIAuthTabCallback302;
                                                pairArr72[3] = pairIAuthTabCallback312;
                                                auth.IAuthTabCallback(authVar22, "TossBundleLoader: host-bundle result=success", access8100.onWarmupCompleted(pairArr72), (auth.onExtraCallbackWithResult) null, 4, (Object) null);
                                                return new transGetKmCert.onWarmupCompleted(new pkcs5PBKDF2.onExtraCallbackWithResult(str10), MaxFullscreenAdImplExternalSyntheticLambda6.IAuthTabCallbackDefault(anonymousClass12.this$0));
                                            } catch (Exception e13) {
                                                e = e13;
                                                anonymousClass18 = anonymousClass12;
                                                z = r14;
                                                anonymousClass12 = anonymousClass18;
                                                r14 = z;
                                                str13 = str7;
                                                r9 = str;
                                                anonymousClass1 = anonymousClass12;
                                                r142 = r14;
                                                ConvertFloatArrayToByteArray convertFloatArrayToByteArray22222222222 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                                                Pair pairIAuthTabCallback102222222222 = getWrite.IAuthTabCallback(str12, (Object) r142);
                                                Pair pairIAuthTabCallback112222222222 = getWrite.IAuthTabCallback("serviceBundleName", MaxFullscreenAdImplExternalSyntheticLambda6.access100(anonymousClass1.this$0));
                                                Pair pairIAuthTabCallback122222222222 = getWrite.IAuthTabCallback(obj2, MaxFullscreenAdImplExternalSyntheticLambda6.IAuthTabCallbackDefault(anonymousClass1.this$0));
                                                Pair pairIAuthTabCallback132222222222 = getWrite.IAuthTabCallback(str13, e.getMessage());
                                                Pair[] pairArr22222222222 = new Pair[4];
                                                pairArr22222222222[0] = pairIAuthTabCallback102222222222;
                                                pairArr22222222222[c] = pairIAuthTabCallback112222222222;
                                                pairArr22222222222[c2] = pairIAuthTabCallback122222222222;
                                                pairArr22222222222[3] = pairIAuthTabCallback132222222222;
                                                convertFloatArrayToByteArray22222222222.onExtraCallbackWithResult((String) r9, "bundle_load_error", e, access8100.onWarmupCompleted(pairArr22222222222));
                                                throw e;
                                            }
                                        } catch (Exception e14) {
                                            e = e14;
                                            anonymousClass18 = anonymousClass12;
                                            z = r14;
                                        }
                                    } catch (Exception e15) {
                                        e = e15;
                                        anonymousClass18 = anonymousClass12;
                                        z = r14;
                                    }
                                } catch (Exception e16) {
                                    e = e16;
                                    c = 1;
                                    anonymousClass18 = anonymousClass12;
                                    z = r14;
                                }
                            }
                            MaxFullscreenAdImplExternalSyntheticLambda10.IAuthTabCallback iAuthTabCallback2 = (MaxFullscreenAdImplExternalSyntheticLambda10.IAuthTabCallback) objIAuthTabCallback;
                            if (iAuthTabCallback2 instanceof MaxFullscreenAdImplExternalSyntheticLambda10.IAuthTabCallback.onExtraCallbackWithResult) {
                                MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda63 = this.this$0;
                                MaxFullscreenAdImplExternalSyntheticLambda6.onWarmupCompleted(maxFullscreenAdImplExternalSyntheticLambda63, (MaxFullscreenAdImpl) MaxFullscreenAdImplExternalSyntheticLambda6.onExtraCallbackWithResult(maxFullscreenAdImplExternalSyntheticLambda63));
                                MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda64 = this.this$0;
                                MaxFullscreenAdImplExternalSyntheticLambda6.onExtraCallback(maxFullscreenAdImplExternalSyntheticLambda64, (MaxFullscreenAdImpl) MaxFullscreenAdImplExternalSyntheticLambda6.onExtraCallbackWithResult(maxFullscreenAdImplExternalSyntheticLambda64));
                                ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "react_native_debug", "metro_server_detected", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("from", "TossBundleLoader"), getWrite.IAuthTabCallback("host", ((MaxFullscreenAdImplExternalSyntheticLambda10.IAuthTabCallback.onExtraCallbackWithResult) iAuthTabCallback2).onExtraCallback()), getWrite.IAuthTabCallback("port", access14000.onNavigationEvent(((MaxFullscreenAdImplExternalSyntheticLambda10.IAuthTabCallback.onExtraCallbackWithResult) iAuthTabCallback2).onExtraCallbackWithResult()))}), (String) null, false, (String) null, 56, (Object) null);
                                return new transGetKmCert.onNavigationEvent(((MaxFullscreenAdImplExternalSyntheticLambda10.IAuthTabCallback.onExtraCallbackWithResult) iAuthTabCallback2).onExtraCallback(), ((MaxFullscreenAdImplExternalSyntheticLambda10.IAuthTabCallback.onExtraCallbackWithResult) iAuthTabCallback2).onExtraCallbackWithResult(), MaxFullscreenAdImplExternalSyntheticLambda6.IAuthTabCallbackDefault(this.this$0));
                            }
                            if (!(iAuthTabCallback2 instanceof MaxFullscreenAdImplExternalSyntheticLambda10.IAuthTabCallback.onWarmupCompleted)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            int i17 = IAuthTabCallback + 115;
                            IAuthTabCallbackDefault = i17 % 128;
                            if (i17 % 2 == 0) {
                                setrequestlistenerIAuthTabCallback = ((MaxFullscreenAdImplExternalSyntheticLambda10.IAuthTabCallback.onWarmupCompleted) iAuthTabCallback2).IAuthTabCallback();
                                map = (Map) MaxFullscreenAdImplExternalSyntheticLambda6.onExtraCallbackWithResult(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{this.this$0}, -1701456764, 1701456768, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
                                strOnWarmupCompleted = setrequestlistenerIAuthTabCallback.onWarmupCompleted();
                                int i18 = 79 / 0;
                                if (strOnWarmupCompleted == null) {
                                    setrequestlistener3 = setrequestlistenerIAuthTabCallback;
                                    strOnWarmupCompleted = "";
                                } else {
                                    setrequestlistener3 = setrequestlistenerIAuthTabCallback;
                                }
                            } else {
                                setrequestlistenerIAuthTabCallback = ((MaxFullscreenAdImplExternalSyntheticLambda10.IAuthTabCallback.onWarmupCompleted) iAuthTabCallback2).IAuthTabCallback();
                                map = (Map) MaxFullscreenAdImplExternalSyntheticLambda6.onExtraCallbackWithResult(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{this.this$0}, -1701456764, 1701456768, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
                                strOnWarmupCompleted = setrequestlistenerIAuthTabCallback.onWarmupCompleted();
                                if (strOnWarmupCompleted == null) {
                                }
                            }
                            map.put("remote", strOnWarmupCompleted);
                            MaxFullscreenAdImplExternalSyntheticLambda6.IAuthTabCallback(this.this$0, setrequestlistener3.onExtraCallback());
                            MaxFullscreenAdImplExternalSyntheticLambda6.onNavigationEvent(this.this$0, setrequestlistener3.onTransact());
                            MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda65 = this.this$0;
                            MaxFullscreenAdImplExternalSyntheticLambda6.onWarmupCompleted(maxFullscreenAdImplExternalSyntheticLambda65, (MaxFullscreenAdImpl) MaxFullscreenAdImplExternalSyntheticLambda6.onExtraCallbackWithResult(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{maxFullscreenAdImplExternalSyntheticLambda65, setrequestlistener3}, 1477018296, -1477018293, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback()));
                            dateOnWarmupCompleted = MaxFullscreenAdImplExternalSyntheticLambda6.onWarmupCompleted(this.this$0, setrequestlistener3.onTransact());
                            ConvertFloatArrayToByteArray convertFloatArrayToByteArray7 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                            Pair pairIAuthTabCallback32 = getWrite.IAuthTabCallback("from", "TossBundleLoader");
                            Pair pairIAuthTabCallback33 = getWrite.IAuthTabCallback("hostBundleName", MaxFullscreenAdImplExternalSyntheticLambda6.IAuthTabCallbackDefault(this.this$0));
                            if (dateOnWarmupCompleted != null) {
                                int i19 = IAuthTabCallbackDefault + 121;
                                IAuthTabCallback = i19 % 128;
                                if (i19 % 2 != 0) {
                                    dateOnWarmupCompleted.toString();
                                    Object obj21 = null;
                                    obj21.hashCode();
                                    throw null;
                                }
                                string2 = dateOnWarmupCompleted.toString();
                            } else {
                                string2 = null;
                            }
                            Pair pairIAuthTabCallback34 = getWrite.IAuthTabCallback("hostMinDeployedAt", string2);
                            Pair[] pairArr9 = new Pair[3];
                            pairArr9[0] = pairIAuthTabCallback32;
                            try {
                                pairArr9[1] = pairIAuthTabCallback33;
                                try {
                                    pairArr9[2] = pairIAuthTabCallback34;
                                    ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray7, "react_native_debug", "host_bundle_min_deployed_at", access8100.onWarmupCompleted(pairArr9), (String) null, false, (String) null, 56, (Object) null);
                                    logApiCall logapicallIAuthTabCallbackStub2 = MaxFullscreenAdImplExternalSyntheticLambda6.IAuthTabCallbackStub(this.this$0);
                                    String strIAuthTabCallbackDefault = MaxFullscreenAdImplExternalSyntheticLambda6.IAuthTabCallbackDefault(this.this$0);
                                    String strAsInterface = MaxFullscreenAdImplExternalSyntheticLambda6.asInterface(this.this$0);
                                    String strIAuthTabCallback_Parcel = MaxFullscreenAdImplExternalSyntheticLambda6.IAuthTabCallback_Parcel(this.this$0);
                                    String strAsBinder = MaxFullscreenAdImplExternalSyntheticLambda6.asBinder(this.this$0);
                                    boolean zICustomTabsCallback = MaxFullscreenAdImplExternalSyntheticLambda6.ICustomTabsCallback(this.this$0);
                                    try {
                                        zExtraCallbackWithResult = MaxFullscreenAdImplExternalSyntheticLambda6.extraCallbackWithResult(this.this$0);
                                        typedObject = MaxFullscreenAdImplExternalSyntheticLambda6.readTypedObject(this.this$0);
                                        interfaceDescriptor = MaxFullscreenAdImplExternalSyntheticLambda6.getInterfaceDescriptor(this.this$0);
                                        zOnWarmupCompleted = MaxFullscreenAdImplExternalSyntheticLambda6.onWarmupCompleted(this.this$0);
                                        str11 = (String) MaxFullscreenAdImplExternalSyntheticLambda6.onExtraCallbackWithResult(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{this.this$0}, 919209163, -919209161, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
                                        zBooleanValue = ((Boolean) MaxFullscreenAdImplExternalSyntheticLambda6.onExtraCallbackWithResult(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{this.this$0}, -401471499, 401471499, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback())).booleanValue();
                                        this.L$0 = access15400.onNavigationEvent(iAuthTabCallback2);
                                        this.L$1 = access15400.onNavigationEvent(setrequestlistener3);
                                        this.L$2 = access15400.onNavigationEvent(dateOnWarmupCompleted);
                                    } catch (Exception e17) {
                                        e = e17;
                                        str12 = "from";
                                        obj2 = "hostBundleName";
                                        anonymousClass14 = this;
                                        c = 1;
                                        obj10 = "TossBundleLoader";
                                        str6 = str2;
                                        str13 = str4;
                                        anonymousClass16 = anonymousClass14;
                                        obj9 = obj10;
                                        c2 = 2;
                                        anonymousClass1 = anonymousClass16;
                                        r9 = str6;
                                        r142 = obj9;
                                        ConvertFloatArrayToByteArray convertFloatArrayToByteArray222222222222 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                                        Pair pairIAuthTabCallback1022222222222 = getWrite.IAuthTabCallback(str12, (Object) r142);
                                        Pair pairIAuthTabCallback1122222222222 = getWrite.IAuthTabCallback("serviceBundleName", MaxFullscreenAdImplExternalSyntheticLambda6.access100(anonymousClass1.this$0));
                                        Pair pairIAuthTabCallback1222222222222 = getWrite.IAuthTabCallback(obj2, MaxFullscreenAdImplExternalSyntheticLambda6.IAuthTabCallbackDefault(anonymousClass1.this$0));
                                        Pair pairIAuthTabCallback1322222222222 = getWrite.IAuthTabCallback(str13, e.getMessage());
                                        Pair[] pairArr222222222222 = new Pair[4];
                                        pairArr222222222222[0] = pairIAuthTabCallback1022222222222;
                                        pairArr222222222222[c] = pairIAuthTabCallback1122222222222;
                                        pairArr222222222222[c2] = pairIAuthTabCallback1222222222222;
                                        pairArr222222222222[3] = pairIAuthTabCallback1322222222222;
                                        convertFloatArrayToByteArray222222222222.onExtraCallbackWithResult((String) r9, "bundle_load_error", e, access8100.onWarmupCompleted(pairArr222222222222));
                                        throw e;
                                    }
                                    try {
                                        this.label = 2;
                                        c2 = 2;
                                        obj11 = "TossBundleLoader";
                                        str8 = "from";
                                        str7 = str4;
                                        Object obj22 = obj6;
                                        setrequestlistener4 = setrequestlistener3;
                                        str9 = "";
                                        str = str2;
                                        obj2 = "hostBundleName";
                                        obj14 = "host-bundle";
                                        obj15 = "host";
                                        obj13 = obj22;
                                    } catch (Exception e18) {
                                        e = e18;
                                        c2 = 2;
                                        str12 = "from";
                                        obj2 = "hostBundleName";
                                        anonymousClass19 = this;
                                        c = 1;
                                        obj16 = "TossBundleLoader";
                                        r9 = str2;
                                        str13 = str4;
                                        anonymousClass1 = anonymousClass19;
                                        r142 = obj16;
                                        ConvertFloatArrayToByteArray convertFloatArrayToByteArray2222222222222 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                                        Pair pairIAuthTabCallback10222222222222 = getWrite.IAuthTabCallback(str12, (Object) r142);
                                        Pair pairIAuthTabCallback11222222222222 = getWrite.IAuthTabCallback("serviceBundleName", MaxFullscreenAdImplExternalSyntheticLambda6.access100(anonymousClass1.this$0));
                                        Pair pairIAuthTabCallback12222222222222 = getWrite.IAuthTabCallback(obj2, MaxFullscreenAdImplExternalSyntheticLambda6.IAuthTabCallbackDefault(anonymousClass1.this$0));
                                        Pair pairIAuthTabCallback13222222222222 = getWrite.IAuthTabCallback(str13, e.getMessage());
                                        Pair[] pairArr2222222222222 = new Pair[4];
                                        pairArr2222222222222[0] = pairIAuthTabCallback10222222222222;
                                        pairArr2222222222222[c] = pairIAuthTabCallback11222222222222;
                                        pairArr2222222222222[c2] = pairIAuthTabCallback12222222222222;
                                        pairArr2222222222222[3] = pairIAuthTabCallback13222222222222;
                                        convertFloatArrayToByteArray2222222222222.onExtraCallbackWithResult((String) r9, "bundle_load_error", e, access8100.onWarmupCompleted(pairArr2222222222222));
                                        throw e;
                                    }
                                    try {
                                        objOnNavigationEvent = logapicallIAuthTabCallbackStub2.onNavigationEvent(strIAuthTabCallbackDefault, strAsInterface, strIAuthTabCallback_Parcel, strAsBinder, zICustomTabsCallback, zExtraCallbackWithResult, typedObject, false, interfaceDescriptor, dateOnWarmupCompleted, zOnWarmupCompleted, str11, zBooleanValue, this);
                                        if (objOnNavigationEvent == objOnWarmupCompleted) {
                                            int i822 = IAuthTabCallbackDefault + 93;
                                            IAuthTabCallback = i822 % 128;
                                            int i922 = i822 % 2;
                                            return objOnWarmupCompleted;
                                        }
                                        setrequestlistener2 = setrequestlistener4;
                                        iAuthTabCallback = iAuthTabCallback2;
                                        obj11 = obj11;
                                        setadreviewlistener = (setAdReviewListener) objOnNavigationEvent;
                                        if (setadreviewlistener instanceof setAdReviewListener.onExtraCallback) {
                                        }
                                    } catch (Exception e19) {
                                        e = e19;
                                        anonymousClass17 = this;
                                        obj12 = obj11;
                                        str12 = str8;
                                        str13 = str7;
                                        str5 = str;
                                        anonymousClass15 = anonymousClass17;
                                        obj8 = obj12;
                                        c = 1;
                                        anonymousClass1 = anonymousClass15;
                                        r9 = str5;
                                        r142 = obj8;
                                        ConvertFloatArrayToByteArray convertFloatArrayToByteArray22222222222222 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                                        Pair pairIAuthTabCallback102222222222222 = getWrite.IAuthTabCallback(str12, (Object) r142);
                                        Pair pairIAuthTabCallback112222222222222 = getWrite.IAuthTabCallback("serviceBundleName", MaxFullscreenAdImplExternalSyntheticLambda6.access100(anonymousClass1.this$0));
                                        Pair pairIAuthTabCallback122222222222222 = getWrite.IAuthTabCallback(obj2, MaxFullscreenAdImplExternalSyntheticLambda6.IAuthTabCallbackDefault(anonymousClass1.this$0));
                                        Pair pairIAuthTabCallback132222222222222 = getWrite.IAuthTabCallback(str13, e.getMessage());
                                        Pair[] pairArr22222222222222 = new Pair[4];
                                        pairArr22222222222222[0] = pairIAuthTabCallback102222222222222;
                                        pairArr22222222222222[c] = pairIAuthTabCallback112222222222222;
                                        pairArr22222222222222[c2] = pairIAuthTabCallback122222222222222;
                                        pairArr22222222222222[3] = pairIAuthTabCallback132222222222222;
                                        convertFloatArrayToByteArray22222222222222.onExtraCallbackWithResult((String) r9, "bundle_load_error", e, access8100.onWarmupCompleted(pairArr22222222222222));
                                        throw e;
                                    }
                                } catch (Exception e20) {
                                    e = e20;
                                    c2 = 2;
                                    obj16 = "TossBundleLoader";
                                    str12 = "from";
                                    obj2 = "hostBundleName";
                                    anonymousClass19 = this;
                                    c = 1;
                                }
                            } catch (Exception e21) {
                                e = e21;
                                obj10 = "TossBundleLoader";
                                str12 = "from";
                                obj2 = "hostBundleName";
                                anonymousClass14 = this;
                                c = 1;
                            }
                        } catch (Exception e22) {
                            e = e22;
                            str12 = "from";
                            str13 = "error";
                            c = 1;
                            obj2 = "hostBundleName";
                            c2 = 2;
                            obj3 = "TossBundleLoader";
                            obj4 = "react_native_debug";
                        }
                    } catch (Exception e23) {
                        e = e23;
                        anonymousClass1 = r3;
                    }
                } catch (Exception e24) {
                    e = e24;
                    anonymousClass12 = r3;
                }
            }
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 73;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                access14300.onWarmupCompleted();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 != 0) {
                int i4 = onWarmupCompleted + 71;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0 ? i3 != 1 : i3 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                return obj;
            }
            ResultKt.onNavigationEvent(obj);
            RnPhaseObserver rnPhaseObserverWriteTypedObject = MaxFullscreenAdImplExternalSyntheticLambda6.writeTypedObject(MaxFullscreenAdImplExternalSyntheticLambda6.this);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(MaxFullscreenAdImplExternalSyntheticLambda6.this, null);
            this.label = 1;
            Object objIAuthTabCallback = rnPhaseObserverWriteTypedObject.IAuthTabCallback((Function1) anonymousClass1, (access13800) this);
            if (objIAuthTabCallback != objOnWarmupCompleted) {
                return objIAuthTabCallback;
            }
            int i5 = onExtraCallbackWithResult + 27;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return objOnWarmupCompleted;
        }
    }

    public Object onWarmupCompleted(@NotNull access13800<? super transGetKmCert> access13800Var) {
        int i = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new onWarmupCompleted(null), access13800Var);
        int i2 = onUnminimized + 33;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return objOnExtraCallback;
        }
        throw null;
    }

    private final Date IAuthTabCallback(String str) throws Throwable {
        int i = 2 % 2;
        int i2 = onUnminimized + 119;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        if (str == null || StringsKt.isBlank(str)) {
            int i4 = onUnminimized + 15;
            ICustomTabsCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }
        Locale locale = Locale.US;
        Intrinsics.checkNotNullExpressionValue(locale, "");
        Object[] objArr = new Object[1];
        a((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 15994), ViewConfiguration.getFadingEdgeLength() >> 16, new char[]{7111, 4282, 47996, 62445, 46083, 22146, 6200, 29892, 19743, 44339, 44050, 26959, 996, 23252}, new char[]{0, 0, 0, 0}, new char[]{49920, 58552, 31291, 25406}, objArr);
        return setCampaign.onWarmupCompleted(new IdGeneratorExternalSyntheticLambda1(((String) objArr[0]).intern(), locale), str);
    }

    @Override // o.MaxFullscreenAdImplb
    public String asBinder() {
        int i = 2 % 2;
        String str = this.onExtraCallback.get("remote");
        if (str == null) {
            throw new IllegalStateException("Service bundle not loaded. Call loadBundle() first.");
        }
        int i2 = onUnminimized + 105;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "react_native_debug", "service_bundle_path", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("from", "TossBundleLoader"), getWrite.IAuthTabCallback("path", str)}), (String) null, false, (String) null, 56, (Object) null);
        int i4 = ICustomTabsCallbackDefault + 69;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 93;
        onUnminimized = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallback.get("host");
        }
        this.onExtraCallback.get("host");
        throw null;
    }

    @Override // o.MaxFullscreenAdImplb
    public String onTransact() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 21;
        int i3 = i2 % 128;
        onUnminimized = i3;
        int i4 = i2 % 2;
        String str = this.ICustomTabsCallback;
        int i5 = i3 + 101;
        ICustomTabsCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String onNavigationEvent() {
        String str;
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault;
        int i3 = i2 + 123;
        onUnminimized = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.asBinder;
            int i4 = 66 / 0;
        } else {
            str = this.asBinder;
        }
        int i5 = i2 + 9;
        onUnminimized = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Override // o.MaxFullscreenAdImplb
    public String asInterface() {
        int i = 2 % 2;
        int i2 = onUnminimized;
        int i3 = i2 + 113;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.readTypedObject;
        int i5 = i2 + 17;
        ICustomTabsCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Override // o.MaxFullscreenAdImplb
    public String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onUnminimized + 67;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        int i4 = i2 % 2;
        String str = this.IAuthTabCallbackStub;
        int i5 = i3 + 55;
        onUnminimized = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Override // o.MaxFullscreenAdImplb
    public String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        String str = this.onActivityResized;
        if (str == null) {
            int i2 = ICustomTabsCallbackDefault + 71;
            onUnminimized = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 40 / 0;
            }
            str = "";
        }
        int i4 = onUnminimized + 21;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // o.MaxFullscreenAdImplb
    public String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onUnminimized;
        int i3 = i2 + 15;
        ICustomTabsCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.getInterfaceDescriptor;
        if (str != null) {
            return str;
        }
        int i4 = i2 + 107;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return "";
    }

    @Override // o.MaxFullscreenAdImplb
    public MaxFullscreenAdImpl IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onUnminimized;
        int i3 = i2 + 73;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.extraCallbackWithResult;
        int i5 = i2 + 39;
        ICustomTabsCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return maxFullscreenAdImpl;
    }

    @Override // o.MaxFullscreenAdImplb
    public MaxFullscreenAdImpl onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onUnminimized + 103;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onTransact;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.MaxFullscreenAdImplExternalSyntheticLambda7
    public void onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 29;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "react_native_debug", "bundle_release", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("from", "TossBundleLoader"), getWrite.IAuthTabCallback("bundleName", str)}), (String) null, false, (String) null, 56, (Object) null);
        int i4 = ICustomTabsCallbackDefault + 7;
        onUnminimized = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 72 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r8lambdaiTbImbaMwL1H0tn71gozQUEliM onNavigationEvent(@NotNull String str) {
        r8lambdaiTbImbaMwL1H0tn71gozQUEliM r8lambdaitbimbamwl1h0tn71gozquelim;
        boolean z;
        int i = 2 % 2;
        int i2 = onUnminimized + 67;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        String str2 = this.onActivityResized;
        if (str2 == null) {
            int i3 = ICustomTabsCallbackDefault + 57;
            onUnminimized = i3 % 128;
            int i4 = i3 % 2;
            str2 = "";
        }
        String str3 = this.getInterfaceDescriptor;
        String str4 = str3 != null ? str3 : "";
        boolean zAreEqual = Intrinsics.areEqual(str, this.IAuthTabCallbackStub);
        String str5 = zAreEqual ? str4 : str2;
        if (!(!zAreEqual)) {
            r8lambdaitbimbamwl1h0tn71gozquelim = r8lambdaiTbImbaMwL1H0tn71gozQUEliM.SKIPPED_SHARED_BUNDLE;
        } else if (str2.length() != 0) {
            int i5 = ICustomTabsCallbackDefault + 95;
            onUnminimized = i5 % 128;
            int i6 = i5 % 2;
            r8lambdaitbimbamwl1h0tn71gozquelim = str4.length() == 0 ? r8lambdaiTbImbaMwL1H0tn71gozQUEliM.SKIPPED_NO_DEPLOYMENT_ID : r8lambdaiTbImbaMwL1H0tn71gozQUEliM.RECORDED;
        }
        try {
            if (r8lambdaitbimbamwl1h0tn71gozquelim == r8lambdaiTbImbaMwL1H0tn71gozQUEliM.RECORDED) {
                ((MaxRewardedAdImplb) onExtraCallbackWithResult(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{this}, 1897271136, -1897271135, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback())).onWarmupCompleted(str, this.writeTypedObject, this.asInterface, str5);
                z = true;
            } else {
                z = false;
            }
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "react_native_debug", "bundle_crash_recorded", (Throwable) null, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("from", "TossBundleLoader"), getWrite.IAuthTabCallback("bundleName", str), getWrite.IAuthTabCallback("region", this.writeTypedObject), getWrite.IAuthTabCallback("company", this.asInterface), getWrite.IAuthTabCallback("deploymentId", str5), getWrite.IAuthTabCallback("recorded", String.valueOf(z))}), 4, (Object) null);
            return r8lambdaitbimbamwl1h0tn71gozquelim;
        } catch (Throwable th) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "react_native_debug", "bundle_crash_recorded", (Throwable) null, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("from", "TossBundleLoader"), getWrite.IAuthTabCallback("bundleName", str), getWrite.IAuthTabCallback("region", this.writeTypedObject), getWrite.IAuthTabCallback("company", this.asInterface), getWrite.IAuthTabCallback("deploymentId", str5), getWrite.IAuthTabCallback("recorded", "false")}), 4, (Object) null);
            throw th;
        }
    }

    @Override // o.MaxFullscreenAdImplExternalSyntheticLambda7
    public void onNavigationEvent(@NotNull String str, @NotNull String str2) {
        int i = 2 % 2;
        int i2 = onUnminimized + 5;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        r8lambdaiTbImbaMwL1H0tn71gozQUEliM r8lambdaitbimbamwl1h0tn71gozquelim = r8lambdaiTbImbaMwL1H0tn71gozQUEliM.RECORD_FAILED;
        try {
            r8lambdaiTbImbaMwL1H0tn71gozQUEliM r8lambdaitbimbamwl1h0tn71gozquelimOnNavigationEvent = onNavigationEvent(str);
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, r8lambdaitbimbamwl1h0tn71gozquelimOnNavigationEvent.getLogName(), (String) null, r8lambdaitbimbamwl1h0tn71gozquelimOnNavigationEvent.withNotRecordedReason(IAuthTabCallback(str, str2)), (String) null, false, (String) null, 58, (Object) null);
            int i4 = onUnminimized + 67;
            ICustomTabsCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, r8lambdaitbimbamwl1h0tn71gozquelim.getLogName(), (String) null, r8lambdaitbimbamwl1h0tn71gozquelim.withNotRecordedReason(IAuthTabCallback(str, str2)), (String) null, false, (String) null, 58, (Object) null);
            throw th;
        }
    }

    @Override // o.MaxFullscreenAdImplExternalSyntheticLambda7
    public void onExtraCallback(@NotNull String str, @NotNull String str2) {
        int i = 2 % 2;
        int i2 = onUnminimized + 95;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "ReactNativeBundleLoadFailed", (String) null, IAuthTabCallback(str, str2), (String) null, false, (String) null, 58, (Object) null);
        int i4 = onUnminimized + 19;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private final Map<String, String> IAuthTabCallback(String str, String str2) {
        int i = 2 % 2;
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("bundleName", str);
        String str3 = this.getInterfaceDescriptor;
        String str4 = "";
        if (str3 == null) {
            int i2 = ICustomTabsCallbackDefault + 95;
            onUnminimized = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 66 / 0;
            }
            str3 = "";
        }
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("sharedDeploymentId", str3);
        String str5 = this.onActivityResized;
        Object obj = null;
        if (str5 == null) {
            int i4 = onUnminimized + 91;
            ICustomTabsCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
        } else {
            str4 = str5;
        }
        Map<String, String> mapOnWarmupCompleted = access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback("serviceDeploymentId", str4), getWrite.IAuthTabCallback("error", str2)});
        int i5 = ICustomTabsCallbackDefault + 71;
        onUnminimized = i5 % 128;
        if (i5 % 2 == 0) {
            return mapOnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }

    private final MaxFullscreenAdImpl.onExtraCallbackWithResult onExtraCallback(setRequestListener setrequestlistener) {
        String str;
        int i = 2 % 2;
        String strIAuthTabCallback = setrequestlistener.IAuthTabCallback();
        String strOnWarmupCompleted = setrequestlistener.onWarmupCompleted();
        if (strOnWarmupCompleted == null) {
            int i2 = ICustomTabsCallbackDefault + 93;
            onUnminimized = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 19 / 0;
            }
            strOnWarmupCompleted = "";
        }
        String strAsBinder = setrequestlistener.asBinder();
        String strOnExtraCallback = setrequestlistener.onExtraCallback();
        String strOnExtraCallbackWithResult = setrequestlistener.onExtraCallbackWithResult();
        String strOnTransact = setrequestlistener.onTransact();
        if (strOnTransact == null) {
            int i4 = ICustomTabsCallbackDefault + 77;
            onUnminimized = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            str = "";
        } else {
            str = strOnTransact;
        }
        Long lOnNavigationEvent = setrequestlistener.onNavigationEvent();
        long jLongValue = lOnNavigationEvent != null ? lOnNavigationEvent.longValue() : 0L;
        Long lIAuthTabCallbackStub = setrequestlistener.IAuthTabCallbackStub();
        MaxFullscreenAdImpl.onExtraCallbackWithResult onextracallbackwithresult = new MaxFullscreenAdImpl.onExtraCallbackWithResult(strIAuthTabCallback, strOnWarmupCompleted, new TossReactBundleMeta(strAsBinder, strOnExtraCallback, strOnExtraCallbackWithResult, str, jLongValue, lIAuthTabCallbackStub != null ? lIAuthTabCallbackStub.longValue() : 0L, (String) null, 64, (DefaultConstructorMarker) null), setrequestlistener.IAuthTabCallbackDefault());
        int i5 = ICustomTabsCallbackDefault + 123;
        onUnminimized = i5 % 128;
        if (i5 % 2 == 0) {
            return onextracallbackwithresult;
        }
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) throws Throwable {
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        a((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1, new char[]{20370, 575, 21377, 7793, 25965, 45683, 23334, 21935, 24967, 45993}, new char[]{0, 0, 0, 0}, new char[]{64661, 19881, 46054, 54131}, objArr2);
        MaxFullscreenAdImpl.onExtraCallbackWithResult onextracallbackwithresult = new MaxFullscreenAdImpl.onExtraCallbackWithResult("", "", new TossReactBundleMeta((String) null, ((String) objArr2[0]).intern(), (String) null, (String) null, 0L, 0L, (String) null, 125, (DefaultConstructorMarker) null), false, 8, (DefaultConstructorMarker) null);
        int i2 = onUnminimized + 25;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return onextracallbackwithresult;
        }
        throw null;
    }

    public static final /* synthetic */ Map onExtraCallback(MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda6) {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (Map) onExtraCallbackWithResult(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{maxFullscreenAdImplExternalSyntheticLambda6}, -1701456764, 1701456768, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback);
    }

    public static final /* synthetic */ String onTransact(MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda6) {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (String) onExtraCallbackWithResult(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{maxFullscreenAdImplExternalSyntheticLambda6}, 919209163, -919209161, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback);
    }

    public static final /* synthetic */ boolean access000(MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda6) {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        return ((Boolean) onExtraCallbackWithResult(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{maxFullscreenAdImplExternalSyntheticLambda6}, -401471499, 401471499, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback)).booleanValue();
    }

    public static final /* synthetic */ MaxFullscreenAdImplExternalSyntheticLambda10 extraCallback(MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda6) {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (MaxFullscreenAdImplExternalSyntheticLambda10) onExtraCallbackWithResult(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{maxFullscreenAdImplExternalSyntheticLambda6}, -662315012, 662315018, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback);
    }

    public static final /* synthetic */ MaxFullscreenAdImpl.onExtraCallbackWithResult onExtraCallback(MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda6, setRequestListener setrequestlistener) {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (MaxFullscreenAdImpl.onExtraCallbackWithResult) onExtraCallbackWithResult(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{maxFullscreenAdImplExternalSyntheticLambda6, setrequestlistener}, 1477018296, -1477018293, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback);
    }

    private final MaxFullscreenAdImpl.onExtraCallbackWithResult IAuthTabCallbackStubProxy() {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (MaxFullscreenAdImpl.onExtraCallbackWithResult) onExtraCallbackWithResult(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{this}, -1531197396, 1531197401, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback);
    }

    private final MaxRewardedAdImplb IAuthTabCallback_Parcel() {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (MaxRewardedAdImplb) onExtraCallbackWithResult(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{this}, 1897271136, -1897271135, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback);
    }

    static void getInterfaceDescriptor() {
        onMessageChannelReady = 7798559133331975163L;
        onMinimized = 210603250;
        ICustomTabsCallbackStubProxy = (char) 27643;
    }
}
