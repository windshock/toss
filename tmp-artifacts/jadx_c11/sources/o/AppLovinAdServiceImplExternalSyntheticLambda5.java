package o;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.collect.Synchronized;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeepLinkHandler;
import im.toss.deeplink.DeepLinkResult;
import im.toss.deeplink.DeeplinkConditionalRouter;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.RootActivity;
import im.toss.securities.core.router.spec.TossSecRoute;
import im.toss.splittarget.impl.R;
import im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import o.AppLovinAdServiceImplExternalSyntheticLambda5;
import o.SessionTrackerb;
import o.SetDetectableSize;
import o.onAdViewAdDisplayFailed;
import o.trackEventSynchronously;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.core.AppStateManager;
import viva.republica.toss.splash.InternalSchemeActivity;

@Singleton
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinAdServiceImplExternalSyntheticLambda5 implements SessionTrackerb {
    public static final onExtraCallbackWithResult Companion;
    private static int ICustomTabsCallbackStub;
    private static char[] onActivityLayout;
    private static char[] onActivityResized;
    private static long onPostMessage;
    private final Lazy IAuthTabCallbackDefault;
    private final zzad IAuthTabCallbackStubProxy;
    private final getCurrentApplicationState IAuthTabCallback_Parcel;
    private final Object ICustomTabsCallback;
    private final trackCheckout access100;
    private final boolean asBinder;
    private final SessionTrackere extraCallback;
    private final DeepLinkBaseRegistry extraCallbackWithResult;
    private final setAdUnitIds getInterfaceDescriptor;
    private final getPricingPhaseList readTypedObject;
    private final r8lambdaTHwX0EypPm4QoWgPdxcVS7H_t0 writeTypedObject;
    private static final byte[] $$d = {4, 8, -22, -73};
    private static final int $$e = 159;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ICustomTabsCallbackDefault = 0;
    private static int onMinimized = 0;
    private static int onMessageChannelReady = 1;

    private static String $$f(byte b, int i, int i2) {
        int i3 = 3 - (i2 * 2);
        int i4 = 97 - (i * 3);
        int i5 = b * 2;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[i5 + 1];
        int i6 = -1;
        if (bArr == null) {
            i4 += i3;
            i3 = i3;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            int i8 = i3 + 1;
            bArr2[i7] = (byte) i4;
            if (i7 == i5) {
                return new String(bArr2, 0);
            }
            i4 = bArr[i8] + i4;
            i3 = i8;
            i6 = i7;
        }
    }

    static {
        ICustomTabsCallbackStub = 1;
        onExtraCallbackWithResult();
        Companion = new onExtraCallbackWithResult(null);
        int i = ICustomTabsCallbackDefault + 77;
        ICustomTabsCallbackStub = i % 128;
        if (i % 2 == 0) {
            int i2 = 6 / 0;
        }
    }

    public static /* synthetic */ CharSequence IAuthTabCallback(String str) {
        int i = 2 % 2;
        int i2 = onMinimized + 71;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        CharSequence charSequenceIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(str);
        if (i3 == 0) {
            int i4 = 38 / 0;
        }
        int i5 = onMinimized + 93;
        onMessageChannelReady = i5 % 128;
        if (i5 % 2 != 0) {
            return charSequenceIAuthTabCallbackStubProxy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object onExtraCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) throws Throwable {
        DeepLinkResult deepLinkHandler;
        boolean z;
        Pair pairIAuthTabCallback;
        String string;
        String string2;
        String string3;
        int i7 = ~i3;
        int i8 = (~(i7 | i2)) | i6;
        int i9 = ~i2;
        int i10 = i7 | i6;
        int i11 = (~(i3 | i9 | i6)) | (~(i10 | i2));
        int i12 = (~i10) | (~(i9 | (~i6)));
        int i13 = i6 + i2 + i4 + (1353909401 * i) + ((-1351514252) * i5);
        int i14 = i13 * i13;
        int i15 = ((i6 * 521834465) - 1171472169) + (i2 * 521833829) + (i8 * (-424)) + (i11 * 212) + (i12 * 212) + (521834041 * i4) + (1123214353 * i) + ((-684621612) * i5) + (i14 * 1028784128);
        int i16 = (1883508457 * i6) + 799145984 + ((-1483212659) * i2) + (2050486552 * i8) + (i11 * 1122240372) + (1122240372 * i12) + ((-360972288) * i4) + (337379328 * i) + ((-1540358144) * i5) + (669122560 * i14) + (i15 * i15 * 1635647488);
        if (i16 == 1) {
            Activity activity = (Activity) objArr[0];
            AppLovinAdServiceImplExternalSyntheticLambda5 appLovinAdServiceImplExternalSyntheticLambda5 = (AppLovinAdServiceImplExternalSyntheticLambda5) objArr[1];
            String str = (String) objArr[2];
            DeepLinkResult deepLinkResult = (DeepLinkResult) objArr[3];
            trackEventSynchronously trackeventsynchronously = (trackEventSynchronously) objArr[4];
            int i17 = 2 % 2;
            int i18 = onMinimized + 71;
            onMessageChannelReady = i18 % 128;
            int i19 = i18 % 2;
            Unit unitOnExtraCallback = onExtraCallback(activity, appLovinAdServiceImplExternalSyntheticLambda5, str, deepLinkResult, trackeventsynchronously);
            int i20 = onMinimized + 95;
            onMessageChannelReady = i20 % 128;
            int i21 = i20 % 2;
            return unitOnExtraCallback;
        }
        if (i16 == 2) {
            int i22 = 2 % 2;
            deepLinkHandler = new DeepLinkHandler(((AppLovinAdServiceImplExternalSyntheticLambda5) objArr[0]).extraCallbackWithResult);
            int i23 = onMinimized + 69;
            onMessageChannelReady = i23 % 128;
            int i24 = i23 % 2;
        } else {
            if (i16 == 3) {
                return onExtraCallback(objArr);
            }
            if (i16 != 4) {
                return onExtraCallbackWithResult(objArr);
            }
            AppLovinAdServiceImplExternalSyntheticLambda5 appLovinAdServiceImplExternalSyntheticLambda52 = (AppLovinAdServiceImplExternalSyntheticLambda5) objArr[0];
            Activity activity2 = (Activity) objArr[1];
            String str2 = (String) objArr[2];
            boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
            Function1 function1 = (Function1) objArr[4];
            Bundle bundle = (Bundle) objArr[5];
            boolean zBooleanValue2 = ((Boolean) objArr[6]).booleanValue();
            int i25 = 2 % 2;
            boolean zAreEqual = Intrinsics.areEqual(Uri.parse(str2).getQueryParameter("scale_transition"), "true");
            Uri uriBuild = Uri.parse(appLovinAdServiceImplExternalSyntheticLambda52.onWarmupCompleted(str2));
            if (zAreEqual) {
                int i26 = onMinimized + 97;
                onMessageChannelReady = i26 % 128;
                int i27 = i26 % 2;
                if (!Intrinsics.areEqual(uriBuild.getQueryParameter("scale_transition"), "true")) {
                    int i28 = onMessageChannelReady + 93;
                    onMinimized = i28 % 128;
                    int i29 = i28 % 2;
                    uriBuild = uriBuild.buildUpon().appendQueryParameter("scale_transition", "true").build();
                }
            }
            if (setForeground.onExtraCallback.asBinder() && zAreEqual) {
                int i30 = onMessageChannelReady + 83;
                onMinimized = i30 % 128;
                if (i30 % 2 != 0) {
                    int i31 = 2 / 3;
                }
                z = true;
            } else {
                z = false;
            }
            String string4 = uriBuild.toString();
            Intrinsics.checkNotNullExpressionValue(string4, "");
            if (!zBooleanValue && appLovinAdServiceImplExternalSyntheticLambda52.IAuthTabCallback_Parcel.onExtraCallback(activity2, uriBuild, true, zBooleanValue2, bundle)) {
                pairIAuthTabCallback = getWrite.IAuthTabCallback(new DeepLinkResult.Intercepted(string4, appLovinAdServiceImplExternalSyntheticLambda52.IAuthTabCallbackDefault(string4)), SessionTrackerb.onExtraCallbackWithResult.INTERCEPTOR);
            } else if (function1 != null) {
                Intrinsics.checkNotNull(uriBuild);
                if (((Boolean) function1.invoke(uriBuild)).booleanValue()) {
                    pairIAuthTabCallback = getWrite.IAuthTabCallback(new DeepLinkResult.Intercepted(string4, appLovinAdServiceImplExternalSyntheticLambda52.IAuthTabCallbackDefault(string4)), SessionTrackerb.onExtraCallbackWithResult.PRE_ACTION);
                } else if (!enableModuleArgumentNSNullConversionIOS.asInterface.onNavigationEvent(uriBuild)) {
                    Intrinsics.checkNotNull(uriBuild);
                    if (appLovinAdServiceImplExternalSyntheticLambda52.IAuthTabCallback(activity2, uriBuild, bundle, zBooleanValue2)) {
                        int i32 = onMessageChannelReady + 31;
                        onMinimized = i32 % 128;
                        int i33 = i32 % 2;
                        if (z) {
                            getTags.IAuthTabCallback.onWarmupCompleted();
                        }
                        pairIAuthTabCallback = getWrite.IAuthTabCallback(new DeepLinkResult.Intercepted(string4, appLovinAdServiceImplExternalSyntheticLambda52.IAuthTabCallbackDefault(string4)), SessionTrackerb.onExtraCallbackWithResult.EXTERNAL);
                    } else {
                        Intrinsics.checkNotNull(uriBuild);
                        pairIAuthTabCallback = getWrite.IAuthTabCallback(appLovinAdServiceImplExternalSyntheticLambda52.onNavigationEvent(activity2, uriBuild, bundle, zBooleanValue2, z), SessionTrackerb.onExtraCallbackWithResult.HANDLER);
                    }
                }
            }
            deepLinkHandler = (DeepLinkResult) pairIAuthTabCallback.onExtraCallbackWithResult();
            SessionTrackerb.onExtraCallbackWithResult onextracallbackwithresult = (SessionTrackerb.onExtraCallbackWithResult) pairIAuthTabCallback.IAuthTabCallback();
            if (bundle != null) {
                Object[] objArr2 = new Object[1];
                c(14 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (TextUtils.lastIndexOf("", '0') + 4828), View.getDefaultSize(0, 0) + 33, objArr2);
                string = bundle.getString(((String) objArr2[0]).intern());
            } else {
                string = null;
            }
            if (bundle != null) {
                Object[] objArr3 = new Object[1];
                c(MotionEvent.axisFromString("") + 13, (char) (817 - MotionEvent.axisFromString("")), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 47, objArr3);
                string2 = bundle.getString(((String) objArr3[0]).intern());
            } else {
                string2 = null;
            }
            if (bundle != null) {
                int i34 = onMinimized + 57;
                onMessageChannelReady = i34 % 128;
                int i35 = i34 % 2;
                Object[] objArr4 = new Object[1];
                b(false, new byte[]{0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1}, new int[]{195, 15, 29, 5}, objArr4);
                string3 = bundle.getString(((String) objArr4[0]).intern());
            } else {
                string3 = null;
            }
            appLovinAdServiceImplExternalSyntheticLambda52.IAuthTabCallback(activity2, deepLinkHandler, onextracallbackwithresult, string, string2, string3);
            onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{appLovinAdServiceImplExternalSyntheticLambda52, deepLinkHandler.getUriString()}, -987142228, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 987142231);
        }
        return deepLinkHandler;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onMinimized + 37;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(str, setDetectableSize);
        int i4 = onMessageChannelReady + 5;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(DeepLinkResult deepLinkResult, SessionTrackerb.onExtraCallbackWithResult onextracallbackwithresult, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onMinimized + 111;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(deepLinkResult, onextracallbackwithresult, setDetectableSize);
        int i4 = onMessageChannelReady + 25;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(DeepLinkResult deepLinkResult, trackEventSynchronously trackeventsynchronously) {
        int i = 2 % 2;
        int i2 = onMinimized + 35;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnExtraCallbackWithResult3 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{deepLinkResult, trackeventsynchronously}, 1461062454, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult4, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -1461062454);
        int i3 = onMessageChannelReady + 55;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ DeepLinkHandler onWarmupCompleted(AppLovinAdServiceImplExternalSyntheticLambda5 appLovinAdServiceImplExternalSyntheticLambda5) {
        DeepLinkHandler deepLinkHandler;
        int i = 2 % 2;
        int i2 = onMinimized + 107;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {appLovinAdServiceImplExternalSyntheticLambda5};
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        if (i3 == 0) {
            deepLinkHandler = (DeepLinkHandler) onExtraCallback(iOnExtraCallbackWithResult3, objArr, 151089341, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult4, -151089339);
            int i4 = 62 / 0;
        } else {
            deepLinkHandler = (DeepLinkHandler) onExtraCallback(iOnExtraCallbackWithResult3, objArr, 151089341, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult4, -151089339);
        }
        int i5 = onMessageChannelReady + 51;
        onMinimized = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 45 / 0;
        }
        return deepLinkHandler;
    }

    @Inject
    public AppLovinAdServiceImplExternalSyntheticLambda5(@NotNull zzad zzadVar, @NotNull getCurrentApplicationState getcurrentapplicationstate, @NotNull trackCheckout trackcheckout, @NotNull SessionTrackere sessionTrackere, @NotNull r8lambdaTHwX0EypPm4QoWgPdxcVS7H_t0 r8lambdathwx0eyppm4qowgpdxcvs7h_t0, @NotNull Object obj, @NotNull DeepLinkBaseRegistry deepLinkBaseRegistry, @NotNull setAdUnitIds setadunitids, @NotNull getPricingPhaseList getpricingphaselist) {
        Intrinsics.checkNotNullParameter(zzadVar, "");
        Intrinsics.checkNotNullParameter(getcurrentapplicationstate, "");
        Intrinsics.checkNotNullParameter(trackcheckout, "");
        Intrinsics.checkNotNullParameter(sessionTrackere, "");
        Intrinsics.checkNotNullParameter(r8lambdathwx0eyppm4qowgpdxcvs7h_t0, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(deepLinkBaseRegistry, "");
        Intrinsics.checkNotNullParameter(setadunitids, "");
        Intrinsics.checkNotNullParameter(getpricingphaselist, "");
        this.IAuthTabCallbackStubProxy = zzadVar;
        this.IAuthTabCallback_Parcel = getcurrentapplicationstate;
        this.access100 = trackcheckout;
        this.extraCallback = sessionTrackere;
        this.writeTypedObject = r8lambdathwx0eyppm4qowgpdxcvs7h_t0;
        this.ICustomTabsCallback = obj;
        this.extraCallbackWithResult = deepLinkBaseRegistry;
        this.getInterfaceDescriptor = setadunitids;
        this.readTypedObject = getpricingphaselist;
        this.asBinder = zzadVar.onActivityLayout();
        this.IAuthTabCallbackDefault = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.splittarget.impl.util.TossRouterImpl$$ExternalSyntheticLambda5
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 109;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                AppLovinAdServiceImplExternalSyntheticLambda5 appLovinAdServiceImplExternalSyntheticLambda5 = this.f$0;
                if (i3 == 0) {
                    return AppLovinAdServiceImplExternalSyntheticLambda5.onWarmupCompleted(appLovinAdServiceImplExternalSyntheticLambda5);
                }
                AppLovinAdServiceImplExternalSyntheticLambda5.onWarmupCompleted(appLovinAdServiceImplExternalSyntheticLambda5);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
    }

    @Override // o.SessionTrackerb
    public /* bridge */ String onWarmupCompleted() throws Throwable {
        int i = 2 % 2;
        int i2 = onMinimized + 67;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        String strOnWarmupCompleted = super.onWarmupCompleted();
        if (i3 == 0) {
            int i4 = 35 / 0;
        }
        return strOnWarmupCompleted;
    }

    private final DeepLinkHandler onExtraCallback() {
        int i = 2 % 2;
        int i2 = onMinimized + 113;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        DeepLinkHandler deepLinkHandler = (DeepLinkHandler) this.IAuthTabCallbackDefault.getValue();
        int i4 = onMessageChannelReady + 79;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return deepLinkHandler;
    }

    public boolean onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onMinimized + 55;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        boolean zIAuthTabCallbackDefault = enableModuleArgumentNSNullConversionIOS.asInterface.IAuthTabCallbackDefault(str);
        int i4 = onMessageChannelReady + 53;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return zIAuthTabCallbackDefault;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // o.SessionTrackerb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onExtraCallbackWithResult(@Nullable Context context, @Nullable String str, boolean z, @Nullable Function1<? super Uri, Boolean> function1, @Nullable Bundle bundle, boolean z2) {
        Activity typedObject;
        int i = 2 % 2;
        if (context != null) {
            int i2 = onMessageChannelReady + 1;
            onMinimized = i2 % 128;
            int i3 = i2 % 2;
            typedObject = hasVaryAll.IAuthTabCallback(context);
            if (typedObject == null) {
                typedObject = AppStateManager.onExtraCallbackWithResult.readTypedObject();
                if (typedObject == null) {
                    int i4 = onMessageChannelReady;
                    int i5 = i4 + 29;
                    onMinimized = i5 % 128;
                    int i6 = i5 % 2;
                    int i7 = i4 + 99;
                    onMinimized = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i8 = 11 / 0;
                    }
                    return false;
                }
            }
        }
        return onExtraCallbackWithResult(typedObject, str, z, function1, bundle, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(int i, char c, int i2, Object[] objArr) throws Throwable {
        float f;
        Throwable cause;
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (true) {
            f = 0.0f;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i) {
                break;
            }
            int i4 = $10 + 77;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(onActivityLayout[i2 << i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 59697), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 17, 10973 - View.MeasureSpec.getMode(0), 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(onPostMessage), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 31 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 20220 - TextUtils.getOffsetBefore("", 0), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - View.MeasureSpec.getMode(0)), 44 - Color.red(0), 1494 - ExpandableListView.getPackedPositionType(0L), -1657859959, false, $$f(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                    }
                }
            } else {
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                Object[] objArr5 = {Integer.valueOf(onActivityLayout[i2 + i6])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionType(0L) + 59697), 18 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 10973 - Color.blue(0), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(onPostMessage), Integer.valueOf(c)};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 46135), 30 - MotionEvent.axisFromString(""), 20220 - (ViewConfiguration.getFadingEdgeLength() >> 16), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback6 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString("") + 49124), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 43, 1493 - ((byte) KeyEvent.getModifierMetaStateMask()), -1657859959, false, $$f(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i) {
            int i7 = $11 + 5;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback7 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetBefore("", 0) + 49123), 44 - TextUtils.indexOf("", "", 0, 0), 1494 - KeyEvent.keyCodeFromString(""), -1657859959, false, $$f(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                Object obj = null;
                ((Method) objOnExtraCallback7).invoke(null, objArr8);
                obj.hashCode();
                throw null;
            }
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            try {
                Object[] objArr9 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback8 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback8 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    objOnExtraCallback8 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 44 - (ViewConfiguration.getWindowTouchSlop() >> 8), (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)) + 1494, -1657859959, false, $$f(b7, b8, b8), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback8).invoke(null, objArr9);
                f = 0.0f;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr);
    }

    @Override // o.SessionTrackerb
    public boolean onExtraCallbackWithResult(@Nullable Activity activity, @Nullable String str, boolean z, @Nullable Function1<? super Uri, Boolean> function1, @Nullable Bundle bundle, boolean z2) {
        int i = 2 % 2;
        int i2 = onMinimized + 33;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        DeepLinkResult deepLinkResultOnWarmupCompleted = onWarmupCompleted(activity, str, z, function1, bundle, z2);
        if (deepLinkResultOnWarmupCompleted == null) {
            return false;
        }
        int i4 = onMinimized + 89;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
        return deepLinkResultOnWarmupCompleted.isSuccessful();
    }

    @Override // o.SessionTrackerb
    public DeepLinkResult onWarmupCompleted(@Nullable Activity activity, @Nullable String str, boolean z, @Nullable Function1<? super Uri, Boolean> function1, @Nullable Bundle bundle, boolean z2) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady;
        int i3 = i2 + 57;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        if (activity != null) {
            int i5 = i2 + 109;
            onMinimized = i5 % 128;
            int i6 = i5 % 2;
            if (str != null && str.length() != 0) {
                int i7 = onMessageChannelReady + 27;
                onMinimized = i7 % 128;
                int i8 = i7 % 2;
                Object[] objArr = {this, activity, str, Boolean.valueOf(z), function1, bundle, Boolean.valueOf(z2)};
                int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult3 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult4 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
                if (i8 == 0) {
                    return (DeepLinkResult) onExtraCallback(iOnExtraCallbackWithResult3, objArr, -1363593958, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult4, 1363593962);
                }
                throw null;
            }
        }
        return null;
    }

    private final DeepLinkResult onNavigationEvent(Activity activity, Uri uri, Bundle bundle, boolean z, boolean z2) throws Throwable {
        String[] strArr;
        int i;
        Intent intentPutExtra;
        String strOnNavigationEvent;
        String string;
        String string2;
        Object obj;
        int i2 = 2 % 2;
        String string3 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string3, "");
        String strIAuthTabCallbackDefault = IAuthTabCallbackDefault(string3);
        List targetRegions = onExtraCallback().getTargetRegions(uri);
        if (targetRegions != null) {
            List list = targetRegions;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int i3 = onMessageChannelReady + 101;
                onMinimized = i3 % 128;
                int i4 = i3 % 2;
                arrayList.add(((TargetRegion) it.next()).getCode());
            }
            strArr = (String[]) arrayList.toArray(new String[0]);
        } else {
            strArr = null;
        }
        ProductDetailsSubscriptionOfferDetails productDetailsSubscriptionOfferDetailsOnExtraCallbackWithResult = strArr != null ? ProductDetailsSubscriptionOfferDetails.Companion.onExtraCallbackWithResult(strArr) : null;
        if (productDetailsSubscriptionOfferDetailsOnExtraCallbackWithResult != null && !productDetailsSubscriptionOfferDetailsOnExtraCallbackWithResult.onExtraCallback(this.readTypedObject)) {
            DeepLinkResult.InvalidRegion invalidRegion = new DeepLinkResult.InvalidRegion(string3, strIAuthTabCallbackDefault, ArraysKt.toList(strArr));
            SessionTrackerb.onExtraCallbackWithResult onextracallbackwithresult = SessionTrackerb.onExtraCallbackWithResult.HANDLER;
            if (bundle != null) {
                int i5 = onMinimized + 51;
                onMessageChannelReady = i5 % 128;
                if (i5 % 2 == 0) {
                    Object[] objArr = new Object[1];
                    c(80 / TextUtils.getOffsetAfter("", 0), (char) (672 >> (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 36 / TextUtils.getCapsMode("", 0, 0), objArr);
                    obj = objArr[0];
                } else {
                    Object[] objArr2 = new Object[1];
                    c(15 - TextUtils.getOffsetAfter("", 0), (char) (4828 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), TextUtils.getCapsMode("", 0, 0) + 33, objArr2);
                    obj = objArr2[0];
                }
                string = bundle.getString(((String) obj).intern());
            } else {
                int i6 = onMessageChannelReady + 5;
                onMinimized = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 3 / 4;
                }
                string = null;
            }
            if (bundle != null) {
                int i8 = onMessageChannelReady + 33;
                onMinimized = i8 % 128;
                int i9 = i8 % 2;
                Object[] objArr3 = new Object[1];
                c(TextUtils.indexOf("", "", 0, 0) + 12, (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 818), 47 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr3);
                string2 = bundle.getString(((String) objArr3[0]).intern());
            } else {
                string2 = null;
            }
            SessionTrackerb.IAuthTabCallback((SessionTrackerb) this, activity, (DeepLinkResult) invalidRegion, onextracallbackwithresult, string, string2, (String) null, 32, (Object) null);
            if (!this.asBinder) {
                int i10 = onMinimized + 69;
                onMessageChannelReady = i10 % 128;
                int i11 = i10 % 2;
                return invalidRegion;
            }
        }
        DeeplinkConditionalRouter conditionalRouter = onExtraCallback().getConditionalRouter(uri);
        if (conditionalRouter != null) {
            conditionalRouter.execute(activity, uri);
            return new DeepLinkResult.Intercepted(string3, strIAuthTabCallbackDefault);
        }
        boolean zOnExtraCallback = onExtraCallback(activity, uri);
        if (zOnExtraCallback) {
            Intent parentActivityIntent = activity.getParentActivityIntent();
            if (parentActivityIntent == null) {
                parentActivityIntent = onExtraCallbackWithResult(activity);
                int i12 = onMinimized + 53;
                onMessageChannelReady = i12 % 128;
                int i13 = i12 % 2;
            }
            i = 1;
            intentPutExtra = parentActivityIntent.putExtra("im.toss.is_parent_activity_flag", true).putExtra("scale_transition", String.valueOf(z2)).putExtra("transition_session_id", setForeground.onExtraCallback.onNavigationEvent());
        } else {
            i = 1;
            intentPutExtra = null;
        }
        onNavigationEvent(zOnExtraCallback, intentPutExtra);
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        Object[] objArr4 = new Object[i];
        c(12 - (KeyEvent.getMaxKeyCode() >> 16), (char) (TextUtils.lastIndexOf("", '0', 0) + 819), 48 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr4);
        bundle2.remove(((String) objArr4[0]).intern());
        if (z2 && (strOnNavigationEvent = setForeground.onExtraCallback.onNavigationEvent()) != null) {
            bundle2.putString("transition_session_id", strOnNavigationEvent);
        }
        return onExtraCallback().dispatchFrom(activity, uri, bundle2, intentPutExtra, z);
    }

    private static void b(boolean z, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = onActivityResized;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - TextUtils.getCapsMode("", 0, 0)), 35 - View.getDefaultSize(0, 0), View.getDefaultSize(0, 0) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i7 = $11 + 109;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i9 = $10 + 45;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.keyCodeFromString("") + 10935), View.resolveSize(0, 0) + 65, 16718 - ExpandableListView.getPackedPositionType(0L), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getCapsMode("", 0, 0), 30 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), TextUtils.getOffsetAfter("", 0) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i12] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 49467), TextUtils.indexOf("", "", 0, 0) + 70, MotionEvent.axisFromString("") + 12487, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i13 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i13, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i13);
        }
        if (z) {
            int i14 = $11 + 43;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            char[] cArr6 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        String str = new String(cArr3);
        int i16 = $11 + 35;
        $10 = i16 % 128;
        if (i16 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i17 = 82 / 0;
            objArr[0] = str;
        }
    }

    private final boolean onExtraCallback(Activity activity, Uri uri) {
        int i = 2 % 2;
        int i2 = onMinimized + 11;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 == 0) {
            activity.isTaskRoot();
            throw null;
        }
        if ((!activity.isTaskRoot()) || activity.getClass().isAnnotationPresent(RootActivity.class)) {
            return false;
        }
        int i3 = onMessageChannelReady + 13;
        onMinimized = i3 % 128;
        if (i3 % 2 != 0) {
            this.getInterfaceDescriptor.IAuthTabCallback();
            throw null;
        }
        if (!this.getInterfaceDescriptor.IAuthTabCallback()) {
            return false;
        }
        int i4 = onMessageChannelReady + 5;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        if (onExtraCallback().isRootActivity(uri)) {
            return false;
        }
        int i6 = onMessageChannelReady + 125;
        onMinimized = i6 % 128;
        int i7 = i6 % 2;
        if (IAuthTabCallback()) {
            return false;
        }
        int i8 = onMessageChannelReady + 75;
        onMinimized = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    private final boolean IAuthTabCallback(Activity activity, Uri uri, Bundle bundle, boolean z) throws Throwable {
        Object obj;
        int i = 2 % 2;
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        if (bundle != null) {
            Bundle bundle2 = new Bundle(bundle);
            Object[] objArr = new Object[1];
            c(Color.argb(0, 0, 0, 0) + 15, (char) (View.MeasureSpec.getMode(0) + 4827), Drawable.resolveOpacity(0, 0) + 33, objArr);
            bundle2.remove(((String) objArr[0]).intern());
            Object[] objArr2 = new Object[1];
            c(12 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (Color.red(0) + 818), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 47, objArr2);
            bundle2.remove(((String) objArr2[0]).intern());
            intent.putExtras(bundle2);
        }
        if (z) {
            int i2 = onMinimized + 75;
            onMessageChannelReady = i2 % 128;
            int i3 = i2 % 2;
            intent.addFlags(33554432);
        }
        try {
            Result.Companion companion = Result.Companion;
            activity.startActivity(intent);
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        boolean zOnNavigationEvent = Result.onNavigationEvent(obj);
        int i4 = onMinimized + 97;
        onMessageChannelReady = i4 % 128;
        if (i4 % 2 != 0) {
            return zOnNavigationEvent;
        }
        throw null;
    }

    @Override // o.SessionTrackerb
    public boolean onExtraCallbackWithResult(@NotNull Activity activity, @Nullable String str, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 9;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(activity, "");
            return SessionTrackerb.IAuthTabCallback((SessionTrackerb) this, activity, str, false, (Function1) null, bundle, false, 98, (Object) null);
        }
        Intrinsics.checkNotNullParameter(activity, "");
        return SessionTrackerb.IAuthTabCallback((SessionTrackerb) this, activity, str, false, (Function1) null, bundle, false, 32, (Object) null);
    }

    @Override // o.SessionTrackerb
    public void onExtraCallbackWithResult(@NotNull Activity activity, @Nullable String str, int i, @Nullable Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = onMinimized + 1;
        onMessageChannelReady = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(activity, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(activity, "");
        if (str != null) {
            activity.startActivityForResult(InternalSchemeActivity.Companion.onWarmupCompleted(activity, Uri.parse(str), bundle), i);
            return;
        }
        int i4 = onMinimized + 63;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.SessionTrackerb
    public void onWarmupCompleted(@NotNull Context context, @Nullable String str, @NotNull IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 101;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallback_Parcel, "");
        if (str == null) {
            return;
        }
        iEngagementSignalsCallback_Parcel.onNavigationEvent(InternalSchemeActivity.Companion.onWarmupCompleted(context, Uri.parse(str), bundle));
        int i4 = onMinimized + 107;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.SessionTrackerb
    public boolean onNavigationEvent(@Nullable String str) throws Throwable {
        int i = 2 % 2;
        if (str == null) {
            int i2 = onMinimized + 107;
            onMessageChannelReady = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        String strOnWarmupCompleted = onWarmupCompleted(str);
        if (TextUtils.isEmpty(strOnWarmupCompleted) || !onExtraCallback().supportsUri(strOnWarmupCompleted)) {
            return false;
        }
        int i4 = onMinimized + 97;
        onMessageChannelReady = i4 % 128;
        return i4 % 2 != 0;
    }

    @Override // o.SessionTrackerb
    public Class<?> onExtraCallbackWithResult(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onMinimized + 85;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        DeepLinkHandler deepLinkHandlerOnExtraCallback = onExtraCallback();
        if (i3 != 0) {
            return deepLinkHandlerOnExtraCallback.findClass(str);
        }
        deepLinkHandlerOnExtraCallback.findClass(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.SessionTrackerb
    public boolean onWarmupCompleted(@NotNull Uri uri) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 51;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(uri, "");
            return onExtraCallback().isPrivateDeepLink(uri);
        }
        Intrinsics.checkNotNullParameter(uri, "");
        onExtraCallback().isPrivateDeepLink(uri);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String onTransact(@NotNull String str) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        enableModuleArgumentNSNullConversionIOS enablemoduleargumentnsnullconversionios = enableModuleArgumentNSNullConversionIOS.asInterface;
        String str2 = enablemoduleargumentnsnullconversionios.onWarmupCompleted() + "://";
        Object[] objArr = new Object[1];
        c(11 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 35068), (ViewConfiguration.getPressedStateDuration() >> 16) + 84, objArr);
        String strReplace$default = StringsKt.replace$default(str, str2, ((String) objArr[0]).intern(), false, 4, (Object) null);
        String str3 = ((String) enableModuleArgumentNSNullConversionIOS.IAuthTabCallback(new Object[]{enablemoduleargumentnsnullconversionios}, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -295968610, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 295968611)) + "://";
        Object[] objArr2 = new Object[1];
        b(true, new byte[]{0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0}, new int[]{123, 14, 37, 0}, objArr2);
        String strReplace$default2 = StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(strReplace$default, str3, ((String) objArr2[0]).intern(), false, 4, (Object) null), enablemoduleargumentnsnullconversionios.onNavigationEvent() + "://", "banktoss://", false, 4, (Object) null), enablemoduleargumentnsnullconversionios.IAuthTabCallback() + "://", "securitiestoss://", false, 4, (Object) null);
        int i2 = onMinimized + 31;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        return strReplace$default2;
    }

    @Override // o.SessionTrackerb
    public String onWarmupCompleted(@NotNull String str) throws Throwable {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 29;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            return asInterface(asBinder(access000(IAuthTabCallback_Parcel(onTransact(str)))));
        }
        Intrinsics.checkNotNullParameter(str, "");
        asInterface(asBinder(access000(IAuthTabCallback_Parcel(onTransact(str)))));
        throw null;
    }

    private final String access000(String str) throws Throwable {
        int i = 2 % 2;
        int i2 = onMinimized + 79;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        b(true, new byte[]{1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0}, new int[]{43, 19, 0, 19}, objArr);
        if (StringsKt.startsWith$default(str, ((String) objArr[0]).intern(), false, 2, (Object) null)) {
            String str2 = this.IAuthTabCallbackStubProxy.ITrustedWebActivityCallback_Parcel() + TossSecRoute.Main.PATH;
            Object[] objArr2 = new Object[1];
            b(true, new byte[]{1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0}, new int[]{43, 19, 0, 19}, objArr2);
            return IAuthTabCallbackStub(StringsKt.replaceFirst$default(str, ((String) objArr2[0]).intern(), str2, false, 4, (Object) null));
        }
        Object[] objArr3 = new Object[1];
        b(true, new byte[]{1, 0, 0, 1, 1, 1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0}, new int[]{62, 19, 0, 18}, objArr3);
        if (StringsKt.startsWith$default(str, ((String) objArr3[0]).intern(), false, 2, (Object) null)) {
            String str3 = this.IAuthTabCallbackStubProxy.IEngagementSignalsCallbackStubProxy() + TossSecRoute.Main.PATH;
            Object[] objArr4 = new Object[1];
            b(true, new byte[]{1, 0, 0, 1, 1, 1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0}, new int[]{62, 19, 0, 18}, objArr4);
            return IAuthTabCallbackStub(StringsKt.replaceFirst$default(str, ((String) objArr4[0]).intern(), str3, false, 4, (Object) null));
        }
        Object[] objArr5 = new Object[1];
        c(View.resolveSizeAndState(0, 0, 0) + 21, (char) Drawable.resolveOpacity(0, 0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2, objArr5);
        if (StringsKt.startsWith$default(str, ((String) objArr5[0]).intern(), false, 2, (Object) null)) {
            String str4 = newChunkedSink.onExtraCallbackWithResult().ResultReceiver() + TossSecRoute.Main.PATH;
            Object[] objArr6 = new Object[1];
            c(TextUtils.indexOf("", "") + 21, (char) (ViewConfiguration.getTouchSlop() >> 8), 2 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr6);
            return IAuthTabCallbackStub(StringsKt.replaceFirst$default(str, ((String) objArr6[0]).intern(), str4, false, 4, (Object) null));
        }
        Object[] objArr7 = new Object[1];
        b(false, new byte[]{1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0}, new int[]{81, 21, 0, 0}, objArr7);
        if (StringsKt.startsWith$default(str, ((String) objArr7[0]).intern(), false, 2, (Object) null)) {
            String str5 = this.IAuthTabCallbackStubProxy.ITrustedWebActivityCallbackStub() + TossSecRoute.Main.PATH;
            Object[] objArr8 = new Object[1];
            b(false, new byte[]{1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0}, new int[]{81, 21, 0, 0}, objArr8);
            return IAuthTabCallbackStub(StringsKt.replaceFirst$default(str, ((String) objArr8[0]).intern(), str5, false, 4, (Object) null));
        }
        Object[] objArr9 = new Object[1];
        b(false, new byte[]{0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0}, new int[]{102, 21, 31, 0}, objArr9);
        if (StringsKt.startsWith$default(str, ((String) objArr9[0]).intern(), false, 2, (Object) null)) {
            String str6 = this.IAuthTabCallbackStubProxy.IPostMessageService() + TossSecRoute.Main.PATH;
            Object[] objArr10 = new Object[1];
            b(false, new byte[]{0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0}, new int[]{102, 21, 31, 0}, objArr10);
            return IAuthTabCallbackStub(StringsKt.replaceFirst$default(str, ((String) objArr10[0]).intern(), str6, false, 4, (Object) null));
        }
        Object[] objArr11 = new Object[1];
        b(true, new byte[]{0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0}, new int[]{123, 14, 37, 0}, objArr11);
        if (StringsKt.startsWith$default(str, ((String) objArr11[0]).intern(), false, 2, (Object) null)) {
            String str7 = this.IAuthTabCallbackStubProxy.ITrustedWebActivityCallback_Parcel() + TossSecRoute.Main.PATH;
            Object[] objArr12 = new Object[1];
            b(true, new byte[]{0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0}, new int[]{123, 14, 37, 0}, objArr12);
            return IAuthTabCallbackStub(StringsKt.replaceFirst$default(str, ((String) objArr12[0]).intern(), str7, false, 4, (Object) null));
        }
        if (StringsKt.startsWith$default(str, "banktoss://", false, 2, (Object) null)) {
            String strIAuthTabCallbackStub = IAuthTabCallbackStub(StringsKt.replaceFirst$default(str, "banktoss://", this.IAuthTabCallbackStubProxy.IEngagementSignalsCallbackStubProxy() + TossSecRoute.Main.PATH, false, 4, (Object) null));
            int i4 = onMinimized + 121;
            onMessageChannelReady = i4 % 128;
            int i5 = i4 % 2;
            return strIAuthTabCallbackStub;
        }
        if (StringsKt.startsWith$default(str, "securitiestoss://", false, 2, (Object) null)) {
            return convertAnyToMap.IAuthTabCallback(IAuthTabCallbackStub(new Regex("^securitiestoss:/{2,3}").replace(str, newChunkedSink.onExtraCallbackWithResult().ResultReceiver() + TossSecRoute.Main.PATH)), "canIntercept", "true");
        }
        Object[] objArr13 = new Object[1];
        b(true, new byte[]{1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0}, new int[]{137, 23, 0, 0}, objArr13);
        if (!StringsKt.startsWith$default(str, ((String) objArr13[0]).intern(), false, 2, (Object) null)) {
            return str;
        }
        int i6 = onMinimized + 113;
        onMessageChannelReady = i6 % 128;
        int i7 = i6 % 2;
        String strITrustedWebActivityCallbackStub = this.IAuthTabCallbackStubProxy.ITrustedWebActivityCallbackStub();
        Object[] objArr14 = new Object[1];
        b(true, new byte[]{1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0}, new int[]{137, 23, 0, 0}, objArr14);
        return IAuthTabCallbackStub(StringsKt.replaceFirst$default(str, ((String) objArr14[0]).intern(), strITrustedWebActivityCallbackStub, false, 4, (Object) null));
    }

    private final String IAuthTabCallback_Parcel(String str) {
        int i = 2 % 2;
        if (((Boolean) DERSet.onExtraCallback(-1960796500, new Object[]{DERSet.onExtraCallback}, 1960796517, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback())).booleanValue()) {
            int i2 = onMinimized + 19;
            onMessageChannelReady = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                Object objOnWarmupCompleted = this.extraCallback.onWarmupCompleted(str);
                Throwable th = Result.exceptionOrNull-impl(objOnWarmupCompleted);
                if (th != null) {
                    ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult("CorrectSchemeError", (String) null, th, access8100.onNavigationEvent(getWrite.IAuthTabCallback("srcUrl", str)));
                    int i3 = onMinimized + 65;
                    onMessageChannelReady = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 3 / 4;
                    }
                }
                if (Result.onExtraCallback(objOnWarmupCompleted)) {
                    objOnWarmupCompleted = null;
                }
                String str2 = (String) objOnWarmupCompleted;
                if (str2 != null) {
                    int i5 = onMinimized + 31;
                    onMessageChannelReady = i5 % 128;
                    if (i5 % 2 != 0) {
                        return str2;
                    }
                    obj.hashCode();
                    throw null;
                }
            } else {
                Result.exceptionOrNull-impl(this.extraCallback.onWarmupCompleted(str));
                obj.hashCode();
                throw null;
            }
        }
        int i6 = onMinimized + 23;
        onMessageChannelReady = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d A[PHI: r1
      0x002d: PHI (r1v8 java.lang.String) = (r1v7 java.lang.String), (r1v10 java.lang.String) binds: [B:11:0x002b, B:8:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String asBinder(String str) {
        String strIAuthTabCallback;
        int i = 2 % 2;
        if (DERSet.onExtraCallback.getOnBackPressedInput()) {
            int i2 = onMessageChannelReady + 45;
            onMinimized = i2 % 128;
            if (i2 % 2 != 0) {
                strIAuthTabCallback = this.writeTypedObject.IAuthTabCallback(str);
                int i3 = 24 / 0;
                if (strIAuthTabCallback != null) {
                    int i4 = onMinimized + 31;
                    onMessageChannelReady = i4 % 128;
                    int i5 = i4 % 2;
                    if (strIAuthTabCallback.length() > 0) {
                        ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "WebToRnRedirector", "originUrl: " + str + ", redirectionScheme: " + strIAuthTabCallback, (Map) null, (String) null, false, (String) null, 60, (Object) null);
                        int i6 = onMinimized + 71;
                        onMessageChannelReady = i6 % 128;
                        int i7 = i6 % 2;
                        return strIAuthTabCallback;
                    }
                }
            } else {
                strIAuthTabCallback = this.writeTypedObject.IAuthTabCallback(str);
                if (strIAuthTabCallback != null) {
                }
            }
        }
        return str;
    }

    private final String asInterface(String str) throws Throwable {
        int i = 2 % 2;
        int i2 = onMinimized + 1;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 != 0 ? !StringsKt.startsWith$default(str, "mobileid-toss://verify", false, 2, (Object) null) : !StringsKt.startsWith$default(str, "mobileid-toss://verify", false, 5, (Object) null)) {
            return str;
        }
        Object[] objArr = new Object[1];
        b(true, new byte[]{1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1}, new int[]{15, 28, 0, 26}, objArr);
        String strReplaceFirst$default = StringsKt.replaceFirst$default(str, "mobileid-toss://verify", ((String) objArr[0]).intern(), false, 4, (Object) null);
        int i3 = onMinimized + 41;
        onMessageChannelReady = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 93 / 0;
        }
        return strReplaceFirst$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String IAuthTabCallbackStub(String str) throws Throwable {
        int i;
        int i2 = 2 % 2;
        Uri uri = Uri.parse(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames != null) {
            for (String str2 : queryParameterNames) {
                int i3 = onMessageChannelReady + 71;
                onMinimized = i3 % 128;
                int i4 = i3 % 2;
                String queryParameter = uri.getQueryParameter(str2);
                if (!Intrinsics.areEqual(str2, "_auth_type")) {
                    int i5 = onMessageChannelReady + 33;
                    onMinimized = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 71 / 0;
                        if (!Intrinsics.areEqual(str2, "redirect")) {
                            i = onMinimized + 65;
                            onMessageChannelReady = i % 128;
                            if (i % 2 != 0) {
                                Intrinsics.checkNotNull(str2);
                                if (!(!StringsKt.startsWith$default(str2, "_", false, 4, (Object) null))) {
                                    String strSubstring = str2.substring(1);
                                    Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                                    linkedHashMap.put(strSubstring, queryParameter);
                                }
                            } else {
                                Intrinsics.checkNotNull(str2);
                                if (StringsKt.startsWith$default(str2, "_", false, 2, (Object) null)) {
                                    String strSubstring2 = str2.substring(1);
                                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                                    linkedHashMap.put(strSubstring2, queryParameter);
                                }
                            }
                        }
                    } else if (!Intrinsics.areEqual(str2, "redirect")) {
                        i = onMinimized + 65;
                        onMessageChannelReady = i % 128;
                        if (i % 2 != 0) {
                        }
                    }
                }
                linkedHashMap.put(str2, queryParameter);
            }
        }
        Object[] objArr = new Object[1];
        b(true, new byte[]{0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0}, new int[]{0, 15, 0, 0}, objArr);
        Uri.Builder builderBuildUpon = Uri.parse(((String) objArr[0]).intern()).buildUpon();
        Object[] objArr2 = new Object[1];
        c(3 - View.combineMeasuredStates(0, 0), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr2);
        Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendQueryParameter(((String) objArr2[0]).intern(), str);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            builderAppendQueryParameter.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String string = builderAppendQueryParameter.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // o.SessionTrackerb
    public Intent onExtraCallbackWithResult(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 95;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Intent intentOnExtraCallback = onExtraCallback(context, this.IAuthTabCallbackStubProxy.onSessionEnded());
            Intrinsics.checkNotNull(intentOnExtraCallback);
            return intentOnExtraCallback;
        }
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNull(onExtraCallback(context, this.IAuthTabCallbackStubProxy.onSessionEnded()));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.SessionTrackerb
    public Intent onExtraCallback(@NotNull Context context, @NotNull String str) {
        int i = 2 % 2;
        int i2 = onMinimized + 95;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            return onWarmupCompleted(context, Uri.parse(onWarmupCompleted(str)));
        }
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        onWarmupCompleted(context, Uri.parse(onWarmupCompleted(str)));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.SessionTrackerb
    public Intent onWarmupCompleted(@NotNull Context context, @NotNull Uri uri) {
        DeepLinkResult.Found found;
        Intent intent;
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 13;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(uri, "");
        Activity activityIAuthTabCallback = hasVaryAll.IAuthTabCallback(context);
        if (activityIAuthTabCallback == null) {
            int i4 = onMessageChannelReady + 65;
            onMinimized = i4 % 128;
            int i5 = i4 % 2;
            activityIAuthTabCallback = AppStateManager.onExtraCallbackWithResult.readTypedObject();
            if (activityIAuthTabCallback == null) {
                return null;
            }
        }
        DeepLinkResult.Found foundCreateResult$default = DeepLinkHandler.createResult$default(onExtraCallback(), activityIAuthTabCallback, uri, (Bundle) null, false, 12, (Object) null);
        if (foundCreateResult$default instanceof DeepLinkResult.Found) {
            found = foundCreateResult$default;
        } else {
            int i6 = onMinimized + 21;
            onMessageChannelReady = i6 % 128;
            int i7 = i6 % 2;
            found = null;
        }
        if (found == null || (intent = found.getIntent()) == null) {
            return null;
        }
        return IAuthTabCallback(intent, uri);
    }

    private final Intent IAuthTabCallback(Intent intent, Uri uri) {
        int i = 2 % 2;
        setForeground setforeground = setForeground.onExtraCallback;
        if (setforeground.IAuthTabCallbackDefault()) {
            intent.putExtra("scale_transition", String.valueOf(uri.getQueryParameter("scale_transition")));
            String strOnNavigationEvent = setforeground.onNavigationEvent();
            if (strOnNavigationEvent != null) {
                int i2 = onMinimized + 59;
                onMessageChannelReady = i2 % 128;
                int i3 = i2 % 2;
                intent.putExtra("transition_session_id", strOnNavigationEvent);
            }
        }
        int i4 = onMinimized + 91;
        onMessageChannelReady = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 34 / 0;
        }
        return intent;
    }

    @Override // o.SessionTrackerb
    public void onExtraCallbackWithResult(@NotNull String str, @NotNull SessionTrackerb.onExtraCallbackWithResult onextracallbackwithresult, @Nullable String str2, @Nullable String str3) {
        AttributeCertificateInfo attributeCertificateInfo;
        String strName;
        String str4;
        boolean z;
        boolean z2;
        String str5;
        String str6;
        int i;
        int i2 = 2 % 2;
        int i3 = onMinimized + 35;
        onMessageChannelReady = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            attributeCertificateInfo = AttributeCertificateInfo.onNavigationEvent;
            strName = onextracallbackwithresult.name();
            str4 = null;
            z = true;
            z2 = false;
            str5 = null;
            str6 = null;
            i = 18;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            attributeCertificateInfo = AttributeCertificateInfo.onNavigationEvent;
            strName = onextracallbackwithresult.name();
            str4 = null;
            z = false;
            z2 = false;
            str5 = null;
            str6 = null;
            i = 124;
        }
        AttributeCertificateInfo.onWarmupCompleted(attributeCertificateInfo, str, strName, str4, z, z2, str5, str6, str2, str3, i, (Object) null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // o.SessionTrackerb
    public void IAuthTabCallback(@NotNull final Activity activity, @NotNull final DeepLinkResult deepLinkResult, @NotNull final SessionTrackerb.onExtraCallbackWithResult onextracallbackwithresult, @Nullable String str, @Nullable String str2, @Nullable String str3) throws Throwable {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 85;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(deepLinkResult, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        if (!(deepLinkResult instanceof DeepLinkResult.Found)) {
            int i4 = onMinimized;
            int i5 = i4 + 89;
            onMessageChannelReady = i5 % 128;
            int i6 = i5 % 2;
            if (!(deepLinkResult instanceof DeepLinkResult.Intercepted)) {
                int i7 = i4 + 75;
                onMessageChannelReady = i7 % 128;
                final String strJoinToString$default = null;
                if (i7 % 2 == 0) {
                    boolean z = deepLinkResult instanceof DeepLinkResult.InvalidRegion;
                    throw null;
                }
                if (!(deepLinkResult instanceof DeepLinkResult.InvalidRegion)) {
                    if (!(deepLinkResult instanceof DeepLinkResult.NotFound)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "unsupportedScheme", false, (String) null, (List) null, (Map) null, new Function1() { // from class: im.toss.splittarget.impl.util.TossRouterImpl$$ExternalSyntheticLambda3
                        private static int onExtraCallbackWithResult = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj) {
                            int i8 = 2 % 2;
                            int i9 = onNavigationEvent + 103;
                            onExtraCallbackWithResult = i9 % 128;
                            int i10 = i9 % 2;
                            Unit unitOnNavigationEvent = AppLovinAdServiceImplExternalSyntheticLambda5.onNavigationEvent(deepLinkResult, onextracallbackwithresult, (SetDetectableSize) obj);
                            int i11 = onExtraCallbackWithResult + 45;
                            onNavigationEvent = i11 % 128;
                            int i12 = i11 % 2;
                            return unitOnNavigationEvent;
                        }
                    }, 30, (Object) null);
                    if (this.IAuthTabCallbackStubProxy.onActivityLayout()) {
                        trackCheckout.IAuthTabCallback(this.access100, "UNSUPPORTED_SCHEME", 0, new Function1() { // from class: im.toss.splittarget.impl.util.TossRouterImpl$$ExternalSyntheticLambda4
                            private static int onExtraCallbackWithResult = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke(Object obj) {
                                Unit unitOnNavigationEvent;
                                int i8 = 2 % 2;
                                int i9 = onWarmupCompleted + 109;
                                onExtraCallbackWithResult = i9 % 128;
                                if (i9 % 2 != 0) {
                                    unitOnNavigationEvent = AppLovinAdServiceImplExternalSyntheticLambda5.onNavigationEvent(deepLinkResult, (trackEventSynchronously) obj);
                                    int i10 = 12 / 0;
                                } else {
                                    unitOnNavigationEvent = AppLovinAdServiceImplExternalSyntheticLambda5.onNavigationEvent(deepLinkResult, (trackEventSynchronously) obj);
                                }
                                int i11 = onWarmupCompleted + 1;
                                onExtraCallbackWithResult = i11 % 128;
                                int i12 = i11 % 2;
                                return unitOnNavigationEvent;
                            }
                        }, 2, null);
                        return;
                    }
                    return;
                }
                DeepLinkResult.InvalidRegion invalidRegion = (DeepLinkResult.InvalidRegion) deepLinkResult;
                List deepLinkRegions = invalidRegion.getDeepLinkRegions();
                if (deepLinkRegions != null) {
                    strJoinToString$default = CollectionsKt.joinToString$default(deepLinkRegions, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: im.toss.splittarget.impl.util.TossRouterImpl$$ExternalSyntheticLambda1
                        private static int onExtraCallback = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke(Object obj) {
                            int i8 = 2 % 2;
                            int i9 = onNavigationEvent + 123;
                            onExtraCallback = i9 % 128;
                            int i10 = i9 % 2;
                            CharSequence charSequenceIAuthTabCallback = AppLovinAdServiceImplExternalSyntheticLambda5.IAuthTabCallback((String) obj);
                            int i11 = onExtraCallback + 99;
                            onNavigationEvent = i11 % 128;
                            int i12 = i11 % 2;
                            return charSequenceIAuthTabCallback;
                        }
                    }, 30, (Object) null);
                } else {
                    int i8 = onMinimized + 107;
                    onMessageChannelReady = i8 % 128;
                    int i9 = i8 % 2;
                }
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                Object[] objArr = new Object[1];
                c(2 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (ViewConfiguration.getTouchSlop() >> 8), KeyEvent.normalizeMetaState(0), objArr);
                ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, "global_fallback_scheme", false, (String) null, (List) null, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(((String) objArr[0]).intern(), invalidRegion.getUriString()), getWrite.IAuthTabCallback("supported_region", strJoinToString$default), getWrite.IAuthTabCallback("current_region", this.readTypedObject)}), (Function1) null, 46, (Object) null);
                if (this.IAuthTabCallbackStubProxy.onActivityLayout()) {
                    trackCheckout.IAuthTabCallback(this.access100, "INVALID_DEEPLINK_REGION", 0, new Function1() { // from class: im.toss.splittarget.impl.util.TossRouterImpl$$ExternalSyntheticLambda2
                        private static int onExtraCallbackWithResult = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj) {
                            int i10 = 2 % 2;
                            int i11 = onExtraCallbackWithResult + 51;
                            onNavigationEvent = i11 % 128;
                            int i12 = i11 % 2;
                            Activity activity2 = activity;
                            if (i12 == 0) {
                                return (Unit) AppLovinAdServiceImplExternalSyntheticLambda5.onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{activity2, this, strJoinToString$default, deepLinkResult, (trackEventSynchronously) obj}, 296523478, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -296523477);
                            }
                            Object[] objArr2 = {activity2, this, strJoinToString$default, deepLinkResult, (trackEventSynchronously) obj};
                            int i13 = 7 / 0;
                            return (Unit) AppLovinAdServiceImplExternalSyntheticLambda5.onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), objArr2, 296523478, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -296523477);
                        }
                    }, 2, null);
                    return;
                }
                return;
            }
        }
        if (onextracallbackwithresult != SessionTrackerb.onExtraCallbackWithResult.EXTERNAL) {
            int i10 = onMessageChannelReady + 67;
            onMinimized = i10 % 128;
            int i11 = i10 % 2;
            AFj1nSDK5.onNavigationEvent.onNavigationEvent(deepLinkResult.getUriString(), false, false);
            AttributeCertificateInfo attributeCertificateInfo = AttributeCertificateInfo.onNavigationEvent;
            String uriString = deepLinkResult.getUriString();
            AttributeCertificateInfo.onWarmupCompleted(attributeCertificateInfo, uriString == null ? "" : uriString, onextracallbackwithresult.name(), (String) null, false, false, str, str2, (String) null, str3, 156, (Object) null);
            writeTypedObject(deepLinkResult.getUriString());
        }
    }

    private static final CharSequence IAuthTabCallbackStubProxy(String str) {
        int i = 2 % 2;
        int i2 = onMinimized + 51;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String upperCase = str.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        int i4 = onMessageChannelReady + 5;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 74 / 0;
        }
        return upperCase;
    }

    private static final Unit onExtraCallback(Activity activity, AppLovinAdServiceImplExternalSyntheticLambda5 appLovinAdServiceImplExternalSyntheticLambda5, String str, DeepLinkResult deepLinkResult, trackEventSynchronously trackeventsynchronously) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 105;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(trackeventsynchronously, "");
        trackeventsynchronously.onExtraCallbackWithResult(activity.getString(R.string.split_target_impl_invalid_deeplink_regions_title));
        Object[] objArr = {trackeventsynchronously, activity.getString(R.string.split_target_impl_invalid_deeplink_regions_message, appLovinAdServiceImplExternalSyntheticLambda5.readTypedObject, str, ((DeepLinkResult.InvalidRegion) deepLinkResult).getUriString())};
        trackEventSynchronously.onExtraCallbackWithResult(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -1173521210, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1173521212, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), objArr, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
        trackeventsynchronously.onExtraCallbackWithResult(EventServiceImplExternalSyntheticLambda0.IMPORTANT);
        trackeventsynchronously.onNavigationEvent(5);
        Unit unit = Unit.INSTANCE;
        int i4 = onMessageChannelReady + 33;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(DeepLinkResult deepLinkResult, SessionTrackerb.onExtraCallbackWithResult onextracallbackwithresult, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        DeepLinkResult.NotFound notFound = (DeepLinkResult.NotFound) deepLinkResult;
        setDetectableSize.onExtraCallback().put("schemeURL", notFound.getUriString());
        String uriTemplate = notFound.getUriTemplate();
        if (uriTemplate != null) {
            int i2 = onMessageChannelReady + 97;
            onMinimized = i2 % 128;
            int i3 = i2 % 2;
            if (uriTemplate.length() != 0) {
                int i4 = onMessageChannelReady + 63;
                onMinimized = i4 % 128;
                if (i4 % 2 != 0) {
                    setDetectableSize.onExtraCallback("baseURL", notFound.getUriTemplate());
                    int i5 = 69 / 0;
                } else {
                    setDetectableSize.onExtraCallback("baseURL", notFound.getUriTemplate());
                }
            }
        }
        setDetectableSize.onExtraCallback("consumer", onextracallbackwithresult.name());
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        DeepLinkResult.NotFound notFound = (DeepLinkResult) objArr[0];
        trackEventSynchronously trackeventsynchronously = (trackEventSynchronously) objArr[1];
        int i = 2 % 2;
        int i2 = onMinimized + 87;
        onMessageChannelReady = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(trackeventsynchronously, "");
            trackeventsynchronously.onExtraCallbackWithResult(EventServiceImplExternalSyntheticLambda0.IMPORTANT);
            trackeventsynchronously.onExtraCallbackWithResult("(DEBUG) 등록되지 않은 스킴이 실행되었습니다.\nSuperTossModule.init 시점에 레지스트리를 등록했는지 확인해주세요.");
            Object[] objArr2 = {trackeventsynchronously, notFound.getUriString()};
            trackEventSynchronously.onExtraCallbackWithResult(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -1173521210, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1173521212, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), objArr2, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
            Unit unit = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(trackeventsynchronously, "");
        trackeventsynchronously.onExtraCallbackWithResult(EventServiceImplExternalSyntheticLambda0.IMPORTANT);
        trackeventsynchronously.onExtraCallbackWithResult("(DEBUG) 등록되지 않은 스킴이 실행되었습니다.\nSuperTossModule.init 시점에 레지스트리를 등록했는지 확인해주세요.");
        Object[] objArr3 = {trackeventsynchronously, notFound.getUriString()};
        trackEventSynchronously.onExtraCallbackWithResult(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -1173521210, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1173521212, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), objArr3, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
        Unit unit2 = Unit.INSTANCE;
        int i3 = onMinimized + 13;
        onMessageChannelReady = i3 % 128;
        if (i3 % 2 != 0) {
            return unit2;
        }
        throw null;
    }

    private final void writeTypedObject(String str) throws Throwable {
        int i = 2 % 2;
        int i2 = onMinimized + 33;
        onMessageChannelReady = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            final String strAccess100 = access100(str);
            if (strAccess100 != null) {
                ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 5181236L, false, (String) null, (Map) null, new Function1() { // from class: im.toss.splittarget.impl.util.TossRouterImpl$$ExternalSyntheticLambda0
                    private static int onExtraCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj2) {
                        int i3 = 2 % 2;
                        int i4 = onNavigationEvent + 75;
                        onExtraCallback = i4 % 128;
                        int i5 = i4 % 2;
                        Unit unitOnExtraCallbackWithResult = AppLovinAdServiceImplExternalSyntheticLambda5.onExtraCallbackWithResult(strAccess100, (SetDetectableSize) obj2);
                        int i6 = onNavigationEvent + 111;
                        onExtraCallback = i6 % 128;
                        if (i6 % 2 != 0) {
                            int i7 = 41 / 0;
                        }
                        return unitOnExtraCallbackWithResult;
                    }
                }, 14, (Object) null);
                return;
            }
            int i3 = onMinimized + 85;
            onMessageChannelReady = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        access100(str);
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(String str, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 3;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("entry_id", str);
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("entry_id", str);
        Unit unit2 = Unit.INSTANCE;
        int i3 = onMessageChannelReady + 59;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private final String access100(String str) throws Throwable {
        Object obj;
        String queryParameter;
        int i = 2 % 2;
        if (str == null) {
            return null;
        }
        int i2 = onMinimized + 35;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        if (!(!StringsKt.isBlank(str))) {
            return null;
        }
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(Uri.parse(str));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.onExtraCallback(obj)) {
            obj = null;
        }
        Uri uri = (Uri) obj;
        if (uri == null) {
            return null;
        }
        String queryParameter2 = uri.getQueryParameter("_recent_entry_id");
        if (queryParameter2 != null) {
            if (StringsKt.isBlank(queryParameter2)) {
                queryParameter2 = null;
            }
            if (queryParameter2 != null) {
                int i4 = onMessageChannelReady + 123;
                int i5 = i4 % 128;
                onMinimized = i5;
                int i6 = i4 % 2;
                int i7 = i5 + 71;
                onMessageChannelReady = i7 % 128;
                int i8 = i7 % 2;
                return queryParameter2;
            }
        }
        String scheme = uri.getScheme();
        Object[] objArr = new Object[1];
        c(10 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (TextUtils.getOffsetAfter("", 0) + 46792), 24 - View.resolveSizeAndState(0, 0, 0), objArr);
        if (!Intrinsics.areEqual(scheme, ((String) objArr[0]).intern())) {
            return null;
        }
        int i9 = onMessageChannelReady + 5;
        onMinimized = i9 % 128;
        int i10 = i9 % 2;
        if ((!Intrinsics.areEqual(uri.getHost(), "lab")) || (queryParameter = uri.getQueryParameter("recent_entry_id")) == null) {
            return null;
        }
        int i11 = onMinimized + 39;
        onMessageChannelReady = i11 % 128;
        int i12 = i11 % 2;
        boolean zIsBlank = StringsKt.isBlank(queryParameter);
        if (i12 == 0) {
            int i13 = 93 / 0;
            if (zIsBlank) {
                return null;
            }
        } else if (zIsBlank) {
            return null;
        }
        return queryParameter;
    }

    private final void onNavigationEvent(boolean z, Intent intent) {
        ComponentName component;
        int i = 2 % 2;
        int i2 = onMinimized + 71;
        onMessageChannelReady = i2 % 128;
        String shortClassName = null;
        if (i2 % 2 == 0) {
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            getWrite.IAuthTabCallback("needParentActivity", Boolean.valueOf(z));
            throw null;
        }
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray2 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("needParentActivity", Boolean.valueOf(z));
        if (intent != null && (component = intent.getComponent()) != null) {
            int i3 = onMinimized + 97;
            onMessageChannelReady = i3 % 128;
            int i4 = i3 % 2;
            shortClassName = component.getShortClassName();
            int i5 = onMinimized + 101;
            onMessageChannelReady = i5 % 128;
            int i6 = i5 % 2;
        }
        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray2, "schemeParentIntent", (String) null, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback("parentActivityIntent", shortClassName)}), (String) null, false, (String) null, 58, (Object) null);
    }

    @Override // o.SessionTrackerb
    public String IAuthTabCallbackDefault(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onMinimized + 33;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        String baseUrl = onExtraCallback().parseBaseUrl(str);
        if (i3 == 0) {
            int i4 = 85 / 0;
        }
        return baseUrl;
    }

    @Override // o.SessionTrackerb
    public boolean onWarmupCompleted(@NotNull Activity activity, @NotNull Uri uri) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 41;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(uri, "");
            String string = uri.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            enableModuleArgumentNSNullConversionIOS.asInterface.onNavigationEvent(Uri.parse(onWarmupCompleted(string)));
            throw null;
        }
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(uri, "");
        String string2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "");
        Uri uri2 = Uri.parse(onWarmupCompleted(string2));
        if (!enableModuleArgumentNSNullConversionIOS.asInterface.onNavigationEvent(uri2)) {
            return false;
        }
        String string3 = uri2.toString();
        Intrinsics.checkNotNullExpressionValue(string3, "");
        if (!onExtraCallback(string3)) {
            return false;
        }
        if (!onExtraCallback().isRootActivity(uri2)) {
            int i3 = onMessageChannelReady + 39;
            onMinimized = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        int i5 = onMessageChannelReady + 17;
        onMinimized = i5 % 128;
        if (i5 % 2 == 0) {
            return false;
        }
        throw null;
    }

    private final boolean IAuthTabCallback() throws Throwable {
        int i = 2 % 2;
        if (addExtra.onExtraCallback(PlayerErrorCode.onWarmupCompleted)) {
            return false;
        }
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub = addPolicy.ITrustedWebActivityServiceStub();
        Object[] objArr = new Object[1];
        c(KeyEvent.normalizeMetaState(0) + 24, (char) (21168 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 60, objArr);
        if (!textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub.onExtraCallback(((String) objArr[0]).intern(), false)) {
            TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub2 = addPolicy.ITrustedWebActivityServiceStub();
            b(false, new byte[]{1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1}, new int[]{160, 35, 104, 7}, new Object[1]);
            if (!textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub2.onExtraCallback(((String) r5[0]).intern(), false)) {
                int i2 = onMessageChannelReady + 53;
                int i3 = i2 % 128;
                onMinimized = i3;
                boolean z = !(i2 % 2 == 0);
                int i4 = i3 + 79;
                onMessageChannelReady = i4 % 128;
                int i5 = i4 % 2;
                return z;
            }
        }
        return true;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        AppLovinAdServiceImplExternalSyntheticLambda5 appLovinAdServiceImplExternalSyntheticLambda5 = (AppLovinAdServiceImplExternalSyntheticLambda5) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = onMinimized + 77;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        if (str == null) {
            return null;
        }
        Object obj2 = appLovinAdServiceImplExternalSyntheticLambda5.ICustomTabsCallback;
        try {
            Object[] objArr2 = {str};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(828825841);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(0, 0), 10 - (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 11132, 2498145, false, "onNavigationEvent", new Class[]{String.class});
            }
            ((Method) objOnExtraCallback).invoke(obj2, objArr2);
            int i4 = onMessageChannelReady + 53;
            onMinimized = i4 % 128;
            if (i4 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(Activity activity, AppLovinAdServiceImplExternalSyntheticLambda5 appLovinAdServiceImplExternalSyntheticLambda5, String str, DeepLinkResult deepLinkResult, trackEventSynchronously trackeventsynchronously) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{activity, appLovinAdServiceImplExternalSyntheticLambda5, str, deepLinkResult, trackeventsynchronously}, 296523478, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -296523477);
    }

    private static final DeepLinkHandler onExtraCallbackWithResult(AppLovinAdServiceImplExternalSyntheticLambda5 appLovinAdServiceImplExternalSyntheticLambda5) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return (DeepLinkHandler) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{appLovinAdServiceImplExternalSyntheticLambda5}, 151089341, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -151089339);
    }

    private final DeepLinkResult onExtraCallback(Activity activity, String str, boolean z, Function1<? super Uri, Boolean> function1, Bundle bundle, boolean z2) {
        return (DeepLinkResult) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{this, activity, str, Boolean.valueOf(z), function1, bundle, Boolean.valueOf(z2)}, -1363593958, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 1363593962);
    }

    private final void getInterfaceDescriptor(String str) throws Throwable {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{this, str}, -987142228, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 987142231);
    }

    private static final Unit onWarmupCompleted(DeepLinkResult deepLinkResult, trackEventSynchronously trackeventsynchronously) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{deepLinkResult, trackeventsynchronously}, 1461062454, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -1461062454);
    }

    static void onExtraCallbackWithResult() {
        onActivityResized = new char[]{27263, 27183, 27176, 27139, 27233, 27258, 27160, 27197, 27199, 27199, 27197, 27173, 27172, 27196, 27194, 27258, 27171, 27173, 27171, 27164, 27143, 27176, 27141, 27143, 27174, 27172, 27179, 27174, 27168, 27136, 27233, 27258, 27160, 27197, 27199, 27199, 27197, 27173, 27172, 27196, 27194, 27192, 27169, 27225, 27165, 27165, 27140, 27173, 27198, 27175, 27143, 27233, 27258, 27160, 27197, 27199, 27199, 27197, 27173, 27172, 27196, 27194, 27253, 27165, 27139, 27170, 27177, 27183, 27142, 27233, 27258, 27160, 27197, 27199, 27199, 27197, 27173, 27172, 27196, 27194, 27167, 27255, 27194, 27196, 27172, 27173, 27197, 27199, 27199, 27197, 27160, 27258, 27233, 27136, 27168, 27174, 27179, 27172, 27174, 27140, 27165, 27165, 27143, 27357, 27359, 27335, 27332, 27356, 27358, 27358, 27356, 27195, 27165, 27136, 27173, 27332, 27337, 27334, 27331, 27334, 27175, 27196, 27196, 27236, 27162, 27159, 27189, 27350, 27352, 27352, 27359, 27335, 27333, 27354, 27351, 27358, 27359, 27260, 27174, 27172, 27179, 27174, 27168, 27139, 27166, 27197, 27199, 27199, 27167, 27233, 27258, 27160, 27197, 27199, 27199, 27197, 27173, 27172, 27196, 27194, 27172, 27264, 27267, 27291, 27293, 27294, 27293, 27287, 27287, 27287, 27285, 27287, 27288, 27291, 27286, 27293, 27268, 27295, 27291, 27293, 27284, 27286, 27294, 27271, 27267, 27264, 27265, 27295, 27264, 27293, 27292, 27269, 27268, 27290, 27286, 27150, 27340, 27341, 27336, 27336, 27185, 27338, 27331, 27332, 27339, 27339, 27334, 27338, 27341, 27186};
        onActivityLayout = new char[]{60833, 65377, 51254, 60839, 65382, 51242, 54756, 42682, 45123, 40209, 28374, 31647, 17681, 22077, 9078, 3305, 6561, 60224, 62488, 49623, 53911, 48133, 35174, 39543, 23407, 18862, 32482, 25388, 4210, 1675, 11225, 55326, 52567, 65360, 60846, 56051, 50997, 46206, 41659, 36800, 31772, 26977, 22425, 17580, 12789, 7694, 2918, 63873, 61113, 64595, 51975, 54982, 42382, 45920, 40451, 28133, 30903, 18046, 21833, 8197, 48912, 44492, 39577, 34626, 62472, 58091, 53153, 15463, 10553, 6084, 1233, 29057, 24159, 19210, 47594, 42665, 37707, 32831, 61179, 56271, 51340, 13662, 8720, 4322, 25948, 30621, 16593, 23839, 11841, 14520, 5610, 58925, 62308, 52714, 57030, 43917};
        onPostMessage = 2290252575132876563L;
    }
}
