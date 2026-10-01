package o;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.ads.zzgsa;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.securities.core.router.spec.TossSecRoute;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import o.onConsentFormLoadFailure;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class onConsentFormLoadFailure implements r8lambdatXGUzCGUxx0hG43Y4a9qHQvkAnU {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onNavigationEvent Companion;
    private static char IAuthTabCallbackDefault = 0;
    private static char[] IAuthTabCallbackStub = null;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access100 = 1;
    private static int getInterfaceDescriptor;
    private static final String onExtraCallback;
    private static int onTransact;
    private final Context IAuthTabCallback;
    private final SessionTrackerb asBinder;
    private final Function0<Boolean> asInterface;
    private final Function0<Boolean> onExtraCallbackWithResult;
    private final qExternalSyntheticLambda0 onNavigationEvent;
    private final Function0<Boolean> onWarmupCompleted;

    static {
        onNavigationEvent();
        Object[] objArr = new Object[1];
        a(new char[]{'\f', '\r', '\t', 7, 7, 2, 7, '\f', '\r', 11, 13830, 13830, '\f', 5, 4, 6}, (byte) (81 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 16 - ExpandableListView.getPackedPositionGroup(0L), objArr);
        onExtraCallback = ((String) objArr[0]).intern();
        Companion = new onNavigationEvent(null);
        int i = getInterfaceDescriptor + 39;
        IAuthTabCallback_Parcel = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 115;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        boolean zAsBinder = asBinder();
        int i4 = onTransact + 113;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 25 / 0;
        }
        return zAsBinder;
    }

    public static /* synthetic */ boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = access100 + 69;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = onWarmupCompleted();
        int i4 = onTransact + 81;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return zOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~((~i2) | i7 | i5);
        int i9 = (~i5) | i7;
        int i10 = i8 | (~(i9 | i2)) | (~(i3 | i2 | i5));
        int i11 = ~i9;
        int i12 = (~(i5 | i3)) | i2 | i11;
        int i13 = (~(i7 | i2)) | i11;
        int i14 = i3 + i2 + i + (933655473 * i6) + ((-1037598838) * i4);
        int i15 = i14 * i14;
        int i16 = (((-1556109539) * i3) - 925892608) + (470833381 * i2) + (i10 * (-1134012188)) + (1134012188 * i12) + ((-1134012188) * i13) + (1604845568 * i) + ((-1691877376) * i6) + ((-393216000) * i4) + ((-1633878016) * i15);
        int i17 = ((i3 * (-727610197)) - 1081761860) + (i2 * (-727608285)) + (i10 * 956) + (i12 * (-956)) + (i13 * 956) + (i * (-727609241)) + (i6 * 1532828727) + (i4 * (-747900794)) + (i15 * 556466176);
        return i16 + ((i17 * i17) * (-1911357440)) != 1 ? onWarmupCompleted(objArr) : onExtraCallback(objArr);
    }

    public onConsentFormLoadFailure(@NotNull Context context, @NotNull SessionTrackerb sessionTrackerb, @NotNull qExternalSyntheticLambda0 qexternalsyntheticlambda0, @Nullable Function0<Boolean> function0, @NotNull Function0<Boolean> function02, @NotNull Function0<Boolean> function03) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(sessionTrackerb, "");
        Intrinsics.checkNotNullParameter(qexternalsyntheticlambda0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        Intrinsics.checkNotNullParameter(function03, "");
        this.IAuthTabCallback = context;
        this.asBinder = sessionTrackerb;
        this.onNavigationEvent = qexternalsyntheticlambda0;
        this.asInterface = function0;
        this.onExtraCallbackWithResult = function02;
        this.onWarmupCompleted = function03;
    }

    public /* synthetic */ onConsentFormLoadFailure(Context context, SessionTrackerb sessionTrackerb, qExternalSyntheticLambda0 qexternalsyntheticlambda0, Function0 function0, Function0 function02, Function0 function03, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Function0 function04;
        Function0 function05;
        Function0 function06;
        if ((i & 8) != 0) {
            int i2 = access100 + 49;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            function04 = null;
        } else {
            function04 = function0;
        }
        if ((i & 16) != 0) {
            Function0 function07 = new Function0() { // from class: im.toss.securities.core.router.impl.TossSecRouterImpl$$ExternalSyntheticLambda0
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke() {
                    int i5 = 2 % 2;
                    int i6 = onExtraCallback + 111;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    Boolean boolValueOf = Boolean.valueOf(onConsentFormLoadFailure.onExtraCallback());
                    if (i7 != 0) {
                        int i8 = 14 / 0;
                    }
                    return boolValueOf;
                }
            };
            int i5 = access100 + 69;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            function05 = function07;
        } else {
            function05 = function02;
        }
        if ((i & 32) != 0) {
            int i7 = 2 % 2;
            function06 = new Function0() { // from class: im.toss.securities.core.router.impl.TossSecRouterImpl$$ExternalSyntheticLambda1
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke() {
                    int i8 = 2 % 2;
                    int i9 = IAuthTabCallback + 109;
                    onExtraCallbackWithResult = i9 % 128;
                    int i10 = i9 % 2;
                    Boolean boolValueOf = Boolean.valueOf(onConsentFormLoadFailure.IAuthTabCallback());
                    int i11 = IAuthTabCallback + 63;
                    onExtraCallbackWithResult = i11 % 128;
                    if (i11 % 2 == 0) {
                        int i12 = 87 / 0;
                    }
                    return boolValueOf;
                }
            };
        } else {
            function06 = function03;
        }
        this(context, sessionTrackerb, qexternalsyntheticlambda0, function04, function05, function06);
    }

    private static final boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = access100 + 69;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = newKnownLengthSink.Companion.onWarmupCompleted(Http1ExchangeCodecAbstractSource.SEAND_4041);
        int i4 = onTransact + 21;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return zOnWarmupCompleted;
        }
        throw null;
    }

    private static final boolean asBinder() {
        int i = 2 % 2;
        int i2 = onTransact + 37;
        access100 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            ((Boolean) isUserSubjectToGDPR.onNavigationEvent(new Object[]{isUserSubjectToGDPR.onWarmupCompleted}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 655245496, -655245488, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent())).booleanValue();
            throw null;
        }
        boolean zBooleanValue = ((Boolean) isUserSubjectToGDPR.onNavigationEvent(new Object[]{isUserSubjectToGDPR.onWarmupCompleted}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 655245496, -655245488, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent())).booleanValue();
        int i3 = access100 + 49;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return zBooleanValue;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.r8lambdatXGUzCGUxx0hG43Y4a9qHQvkAnU
    public boolean onExtraCallback(@NotNull String str) {
        String str2;
        Object obj;
        int i = 2 % 2;
        int i2 = access100 + 75;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt.isBlank(str)) {
            int i4 = access100 + 75;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            str2 = null;
        } else {
            int i6 = access100 + 117;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            str2 = str;
        }
        if (str2 == null) {
            int i8 = onTransact + 61;
            access100 = i8 % 128;
            return i8 % 2 == 0;
        }
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(Uri.parse(str));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        return r8lambdatXGUzCGUxx0hG43Y4a9qHQvkAnU.IAuthTabCallback(this, (Uri) (Result.onExtraCallback(obj) ? null : obj), false, false, 6, null);
    }

    @Override // o.r8lambdatXGUzCGUxx0hG43Y4a9qHQvkAnU
    public boolean IAuthTabCallback(@Nullable Uri uri, boolean z, boolean z2) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 69;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = onWarmupCompleted(uri, z, z2, 0);
        int i4 = access100 + 31;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return zOnWarmupCompleted;
    }

    private final boolean onWarmupCompleted(Uri uri, boolean z, boolean z2, int i) throws Throwable {
        Uri uri2;
        int i2 = 2 % 2;
        if (uri == null) {
            int i3 = onTransact + 69;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        Uri uri3 = (!z2 || i >= 10) ? null : uri;
        if (uri3 != null) {
            int i5 = onTransact + 41;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            uri2 = (Uri) onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), new Object[]{this, uri3}, -1574214535, 1574214536, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted());
        } else {
            uri2 = null;
        }
        Uri uriAsInterface = asInterface(uri);
        boolean zAreEqual = Intrinsics.areEqual(uriAsInterface.getHost(), "native-securities");
        String path = uriAsInterface.getPath();
        if (path == null) {
            path = "";
        }
        TossSecRoute tossSecRouteIAuthTabCallback = IAuthTabCallback(uriAsInterface, path);
        if ((tossSecRouteIAuthTabCallback instanceof TossSecRoute.OptionPracticeIntroVideo) && !((Boolean) this.onExtraCallbackWithResult.invoke()).booleanValue()) {
            return false;
        }
        if (zAreEqual && tossSecRouteIAuthTabCallback == null) {
            return false;
        }
        if (!zAreEqual) {
            int i7 = access100 + 91;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
            if (onExtraCallback(uri)) {
                return SessionTrackerb.onExtraCallbackWithResult(this.asBinder, this.IAuthTabCallback, uri.toString(), false, null, null, false, 60, null);
            }
        }
        if (tossSecRouteIAuthTabCallback != null && (((Boolean) this.onWarmupCompleted.invoke()).booleanValue() || (tossSecRouteIAuthTabCallback instanceof TossSecRoute.OptionPracticeIntroVideo))) {
            if (z) {
                this.onNavigationEvent.onWarmupCompleted();
            }
            onNavigationEvent(tossSecRouteIAuthTabCallback, uriAsInterface);
            if (uri2 != null) {
                onWarmupCompleted(uri2, false, true, i + 1);
            }
        } else {
            if (!(!zAreEqual)) {
                return false;
            }
            if (z) {
                int i9 = onTransact + 21;
                access100 = i9 % 128;
                if (i9 % 2 == 0) {
                    this.onNavigationEvent.onWarmupCompleted();
                    throw null;
                }
                this.onNavigationEvent.onWarmupCompleted();
            }
            qExternalSyntheticLambda0 qexternalsyntheticlambda0 = this.onNavigationEvent;
            String string = uri.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            qExternalSyntheticLambda0.onExtraCallbackWithResult(qexternalsyntheticlambda0, new TossSecRoute.Web(string, (String) null, 2, (DefaultConstructorMarker) null), null, 2, null);
            int i10 = access100 + 61;
            onTransact = i10 % 128;
            int i11 = i10 % 2;
        }
        return true;
    }

    @Override // o.r8lambdatXGUzCGUxx0hG43Y4a9qHQvkAnU
    public boolean onExtraCallbackWithResult() throws Throwable {
        boolean zBooleanValue;
        int i = 2 % 2;
        int i2 = access100 + 57;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        Function0<Boolean> function0 = this.asInterface;
        if (function0 == null) {
            SessionTrackerb sessionTrackerb = this.asBinder;
            Context context = this.IAuthTabCallback;
            Object[] objArr = new Object[1];
            a(new char[]{'\f', '\r', '\t', 7, 7, 2, 7, '\f', '\r', 11, 13830, 13830, '\f', 5, 4, 6}, (byte) (MotionEvent.axisFromString("") + 82), 16 - Color.alpha(0), objArr);
            return SessionTrackerb.onExtraCallbackWithResult(sessionTrackerb, context, ((String) objArr[0]).intern(), false, null, null, false, 60, null);
        }
        int i5 = i3 + 113;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            zBooleanValue = ((Boolean) function0.invoke()).booleanValue();
            int i6 = 45 / 0;
        } else {
            zBooleanValue = ((Boolean) function0.invoke()).booleanValue();
        }
        int i7 = access100 + 5;
        onTransact = i7 % 128;
        int i8 = i7 % 2;
        return zBooleanValue;
    }

    @Override // o.r8lambdatXGUzCGUxx0hG43Y4a9qHQvkAnU
    public void onWarmupCompleted(@NotNull TossSecRoute tossSecRoute) {
        int i = 2 % 2;
        int i2 = onTransact + 31;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(tossSecRoute, "");
            onNavigationEvent(tossSecRoute, null);
            int i3 = 31 / 0;
        } else {
            Intrinsics.checkNotNullParameter(tossSecRoute, "");
            onNavigationEvent(tossSecRoute, null);
        }
        int i4 = onTransact + 49;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.r8lambdatXGUzCGUxx0hG43Y4a9qHQvkAnU
    public boolean onExtraCallbackWithResult(@NotNull Uri uri) {
        int i = 2 % 2;
        String str = "";
        Intrinsics.checkNotNullParameter(uri, "");
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        Uri uri2 = (Uri) onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), new Object[]{this, uri}, -1219650473, 1219650473, zzgsa.onWarmupCompleted(), iOnWarmupCompleted, zzgsa.onWarmupCompleted());
        String path = uri2.getPath();
        if (path == null) {
            int i2 = onTransact + 95;
            access100 = i2 % 128;
            int i3 = i2 % 2;
        } else {
            str = path;
        }
        if (IAuthTabCallback(uri2, str) == null) {
            return true;
        }
        int i4 = onTransact + 91;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b6 A[PHI: r2
      0x00b6: PHI (r2v6 im.toss.securities.core.router.spec.TossSecRoute) = (r2v5 im.toss.securities.core.router.spec.TossSecRoute), (r2v9 im.toss.securities.core.router.spec.TossSecRoute) binds: [B:40:0x00b4, B:37:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent(TossSecRoute tossSecRoute, Uri uri) {
        TossSecRoute tossSecRouteIAuthTabCallbackStub;
        int i = 2 % 2;
        Object obj = null;
        List<Pair<String, String>> listOnExtraCallback = uri != null ? onConsentInfoUpdateFailure.onExtraCallback(uri) : null;
        if (listOnExtraCallback == null) {
            listOnExtraCallback = CollectionsKt.emptyList();
        }
        if (tossSecRoute instanceof TossSecRoute.OptionPracticeIntroVideo) {
            int i2 = onTransact + 93;
            access100 = i2 % 128;
            if (i2 % 2 == 0) {
                ((Boolean) this.onExtraCallbackWithResult.invoke()).booleanValue();
                throw null;
            }
            if (!((Boolean) this.onExtraCallbackWithResult.invoke()).booleanValue()) {
                return;
            }
        }
        if (!(!(tossSecRoute instanceof TossSecRoute.Main))) {
            this.onNavigationEvent.onExtraCallbackWithResult(tossSecRoute, Reflection.getOrCreateKotlinClass(TossSecRoute.Main.class), false, listOnExtraCallback);
            int i3 = onTransact + 21;
            access100 = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        if (tossSecRoute instanceof TossSecRoute.EarningCallDetail) {
            if (((TossSecRoute.EarningCallDetail) tossSecRoute).IAuthTabCallbackDefault()) {
                qExternalSyntheticLambda0.IAuthTabCallback(this.onNavigationEvent, tossSecRoute, Reflection.getOrCreateKotlinClass(TossSecRoute.EarningCallDetail.class), false, null, 8, null);
                return;
            } else {
                qExternalSyntheticLambda0.onExtraCallbackWithResult(this.onNavigationEvent, tossSecRoute, null, 2, null);
                return;
            }
        }
        if (!(tossSecRoute instanceof TossSecRoute.EarningCallHome)) {
            qExternalSyntheticLambda0.onExtraCallbackWithResult(this.onNavigationEvent, tossSecRoute, null, 2, null);
            int i4 = access100 + 27;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 47 / 0;
                return;
            }
            return;
        }
        int i6 = access100 + 123;
        onTransact = i6 % 128;
        if (i6 % 2 != 0) {
            TossSecRoute tossSecRouteOnExtraCallback = this.onNavigationEvent.onExtraCallback();
            tossSecRouteIAuthTabCallbackStub = this.onNavigationEvent.IAuthTabCallbackStub();
            int i7 = 90 / 0;
            if (!(tossSecRouteOnExtraCallback instanceof TossSecRoute.EarningCallHome)) {
                int i8 = onTransact + 5;
                access100 = i8 % 128;
                if (i8 % 2 == 0) {
                    boolean z = tossSecRouteIAuthTabCallbackStub instanceof TossSecRoute.EarningCallHome;
                    throw null;
                }
                if (!(tossSecRouteIAuthTabCallbackStub instanceof TossSecRoute.EarningCallHome)) {
                    qExternalSyntheticLambda0.onExtraCallbackWithResult(this.onNavigationEvent, tossSecRoute, null, 2, null);
                    return;
                }
            }
        } else {
            TossSecRoute tossSecRouteOnExtraCallback2 = this.onNavigationEvent.onExtraCallback();
            tossSecRouteIAuthTabCallbackStub = this.onNavigationEvent.IAuthTabCallbackStub();
            if (!(tossSecRouteOnExtraCallback2 instanceof TossSecRoute.EarningCallHome)) {
            }
        }
        qExternalSyntheticLambda0.IAuthTabCallback(this.onNavigationEvent, tossSecRoute, Reflection.getOrCreateKotlinClass(TossSecRoute.EarningCallHome.class), false, null, 8, null);
    }

    private final TossSecRoute IAuthTabCallback(Uri uri, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 51;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        if (!uri.isHierarchical()) {
            Object[] objArr = new Object[1];
            a(new char[]{14, 4, 13870}, (byte) (59 - TextUtils.indexOf("", "", 0)), (ViewConfiguration.getEdgeSlop() >> 16) + 3, objArr);
            AFd1mSDK.onWarmupCompleted("resolveUriToRoute skipped opaque uri", access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr[0]).intern(), uri.toString())), false, (Function1) null, 12, (Object) null);
            return null;
        }
        String str2 = TossSecRoute.Main.PATH + StringsKt.trimEnd(StringsKt.removePrefix(str, TossSecRoute.Main.PATH), new char[]{'/'});
        if (!(!Intrinsics.areEqual(str2, TossSecRoute.Main.PATH))) {
            int i4 = onTransact + 7;
            access100 = i4 % 128;
            if (i4 % 2 != 0) {
                String strIAuthTabCallback = q2.IAuthTabCallback(uri, "tab");
                String strIAuthTabCallback2 = q2.IAuthTabCallback(uri, TossSecRoute.Main.PARAM_RESTORE_TARGET_TAB);
                String strIAuthTabCallback3 = q2.IAuthTabCallback(uri, TossSecRoute.Main.PARAM_SCROLL_TO_SECTION);
                String strIAuthTabCallback4 = q2.IAuthTabCallback(uri, TossSecRoute.Main.PARAM_WATCHLIST_ID);
                return new TossSecRoute.Main(strIAuthTabCallback, strIAuthTabCallback2, strIAuthTabCallback3, strIAuthTabCallback4 != null ? StringsKt.toLongOrNull(strIAuthTabCallback4) : null);
            }
            q2.IAuthTabCallback(uri, "tab");
            q2.IAuthTabCallback(uri, TossSecRoute.Main.PARAM_RESTORE_TARGET_TAB);
            q2.IAuthTabCallback(uri, TossSecRoute.Main.PARAM_SCROLL_TO_SECTION);
            q2.IAuthTabCallback(uri, TossSecRoute.Main.PARAM_WATCHLIST_ID);
            throw null;
        }
        TossSecRoute.EarningCallHome earningCallHome = TossSecRoute.EarningCallHome.INSTANCE;
        if (Intrinsics.areEqual(str2, earningCallHome.onExtraCallbackWithResult())) {
            return earningCallHome;
        }
        if (Intrinsics.areEqual(str2, TossSecRoute.EarningCallDetail.PATH)) {
            String strIAuthTabCallback5 = q2.IAuthTabCallback(uri, "eventId");
            if (strIAuthTabCallback5 != null) {
                if (StringsKt.toLongOrNull(strIAuthTabCallback5) == null) {
                    strIAuthTabCallback5 = null;
                }
                if (strIAuthTabCallback5 != null) {
                    return onExtraCallbackWithResult(uri, strIAuthTabCallback5);
                }
            }
            return null;
        }
        if (!TossSecRoute.EarningCallDetail.Companion.onExtraCallback(str2)) {
            if (Intrinsics.areEqual(str2, TossSecRoute.OptionPracticeIntroVideo.PATH)) {
                return new TossSecRoute.OptionPracticeIntroVideo(q2.IAuthTabCallback(uri, TossSecRoute.OptionPracticeIntroVideo.PARAM_ENTRY_ID), q2.IAuthTabCallback(uri, "beforeEntryId"), q2.IAuthTabCallback(uri, TossSecRoute.OptionPracticeIntroVideo.PARAM_START_IN_PIP), q2.IAuthTabCallback(uri, TossSecRoute.OptionPracticeIntroVideo.PARAM_FROM_NOTIFICATION));
            }
            return null;
        }
        List<String> pathSegments = uri.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "");
        String str3 = (String) CollectionsKt.lastOrNull(pathSegments);
        if (str3 != null) {
            if (StringsKt.toLongOrNull(str3) == null) {
                str3 = null;
            }
            if (str3 != null) {
                TossSecRoute.EarningCallDetail earningCallDetailOnExtraCallbackWithResult = onExtraCallbackWithResult(uri, str3);
                int i5 = onTransact + 43;
                access100 = i5 % 128;
                if (i5 % 2 != 0) {
                    return earningCallDetailOnExtraCallbackWithResult;
                }
                l.hashCode();
                throw null;
            }
        }
        return null;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = IAuthTabCallbackStub;
        long j = 0;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = $10 + 125;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), Gravity.getAbsoluteGravity(0, 0) + 26, (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i6++;
                    j = 0;
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
        Object[] objArr3 = {Integer.valueOf(IAuthTabCallbackDefault)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - MotionEvent.axisFromString("")), 27 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 23140 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
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
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString("") + 24825), 75 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (Process.myTid() >> 22) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getLongPressTimeout() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 29, 19488 - ((Process.getThreadPriority(0) + 20) >> 6), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        int i7 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i7];
                        int i8 = $11 + 39;
                        $10 = i8 % 128;
                        if (i8 % 2 != 0) {
                            int i9 = 2 % 4;
                        }
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i10 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i10];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i11];
                        } else {
                            int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i12];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
            }
        }
        for (int i14 = 0; i14 < i; i14++) {
            int i15 = $10 + 45;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            cArr4[i14] = (char) (cArr4[i14] ^ 13722);
        }
        String str = new String(cArr4);
        int i17 = $11 + 101;
        $10 = i17 % 128;
        if (i17 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i18 = 13 / 0;
            objArr[0] = str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Uri asInterface(Uri uri) {
        Uri uri2;
        Iterator it;
        int i = 2 % 2;
        if (!uri.isHierarchical()) {
            return uri;
        }
        Set setOnExtraCallback = clearFaultAdjacentMetadata.onExtraCallback(new String[]{"nextLandingUrl", "nextLandingScheme"});
        try {
            Result.Companion companion = Result.Companion;
            Set set = setOnExtraCallback;
            if (!(!(set instanceof Collection))) {
                int i2 = onTransact + 1;
                access100 = i2 % 128;
                int i3 = i2 % 2;
                if (set.isEmpty()) {
                    return uri;
                }
            }
            it = set.iterator();
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Object obj = Result.constructor-impl(ResultKt.createFailure(th));
            int i4 = access100 + 75;
            onTransact = i4 % 128;
            uri2 = obj;
            if (i4 % 2 != 0) {
                int i5 = 2 % 5;
                uri2 = obj;
            }
        }
        while (it.hasNext()) {
            if (uri.getQueryParameter((String) it.next()) != null) {
                Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                Intrinsics.checkNotNullExpressionValue(queryParameterNames, "");
                ArrayList<String> arrayList = new ArrayList();
                Iterator<T> it2 = queryParameterNames.iterator();
                while (it2.hasNext()) {
                    int i6 = onTransact + 7;
                    access100 = i6 % 128;
                    if (i6 % 2 == 0) {
                        setOnExtraCallback.contains((String) it2.next());
                        throw null;
                    }
                    Object next = it2.next();
                    if (!setOnExtraCallback.contains((String) next)) {
                        arrayList.add(next);
                    }
                }
                for (String str : arrayList) {
                    List<String> queryParameters = uri.getQueryParameters(str);
                    Intrinsics.checkNotNullExpressionValue(queryParameters, "");
                    Iterator<T> it3 = queryParameters.iterator();
                    while (it3.hasNext()) {
                        builderClearQuery.appendQueryParameter(str, (String) it3.next());
                    }
                }
                uri2 = Result.constructor-impl(builderClearQuery.build());
                if (!Result.onExtraCallback(uri2)) {
                    uri = uri2;
                }
                return uri;
            }
        }
        return uri;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        Uri uri;
        onConsentFormLoadFailure onconsentformloadfailure = (onConsentFormLoadFailure) objArr[0];
        Uri uri2 = (Uri) objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 93;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallback = q2.IAuthTabCallback(uri2, "nextLandingUrl");
        if (strIAuthTabCallback != null) {
            int i4 = access100 + 5;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                uri = Uri.parse(strIAuthTabCallback);
                int i5 = 35 / 0;
            } else {
                uri = Uri.parse(strIAuthTabCallback);
            }
        } else {
            uri = null;
        }
        if (uri == null) {
            return uri2;
        }
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        return (Uri) onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), new Object[]{onconsentformloadfailure, uri}, -1219650473, 1219650473, zzgsa.onWarmupCompleted(), iOnWarmupCompleted, zzgsa.onWarmupCompleted());
    }

    private final TossSecRoute.EarningCallDetail onExtraCallbackWithResult(Uri uri, String str) {
        int i = 2 % 2;
        TossSecRoute.EarningCallDetail earningCallDetail = new TossSecRoute.EarningCallDetail(str, q2.IAuthTabCallback(uri, TossSecRoute.EarningCallDetail.PARAM_PRODUCT_CODE), q2.IAuthTabCallback(uri, "beforeEntryId"), IAuthTabCallback(uri), q2.IAuthTabCallback(uri, "tab"));
        int i2 = onTransact + 67;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 12 / 0;
        }
        return earningCallDetail;
    }

    private final boolean IAuthTabCallback(Uri uri) throws Throwable {
        Boolean booleanStrictOrNull;
        int i = 2 % 2;
        int i2 = onTransact + 49;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            q2.IAuthTabCallback(uri, TossSecRoute.EarningCallDetail.PARAM_HIDE_PAST_TAB);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String strIAuthTabCallback = q2.IAuthTabCallback(uri, TossSecRoute.EarningCallDetail.PARAM_HIDE_PAST_TAB);
        if (strIAuthTabCallback == null || (booleanStrictOrNull = StringsKt.toBooleanStrictOrNull(strIAuthTabCallback)) == null) {
            return false;
        }
        int i3 = onTransact + 53;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return booleanStrictOrNull.booleanValue();
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    private final boolean onExtraCallback(Uri uri) {
        int i = 2 % 2;
        int i2 = onTransact + 101;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = r8lambdakSJKa4RMkEAGCUl5MvtfoJNzSuU.onExtraCallback.IAuthTabCallback(uri);
        int i4 = access100 + 35;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return zIAuthTabCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        Uri uri;
        Uri uri2 = (Uri) objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 115;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallback = q2.IAuthTabCallback(uri2, "nextLandingUrl");
        if (strIAuthTabCallback == null) {
            strIAuthTabCallback = q2.IAuthTabCallback(uri2, "nextLandingScheme");
            int i4 = access100 + 119;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }
        if (strIAuthTabCallback == null) {
            uri = null;
        } else {
            if (StringsKt.isBlank(strIAuthTabCallback)) {
                strIAuthTabCallback = null;
            }
            if (strIAuthTabCallback != null) {
                uri = Uri.parse(strIAuthTabCallback);
            }
        }
        int i6 = onTransact + 13;
        access100 = i6 % 128;
        if (i6 % 2 != 0) {
            return uri;
        }
        throw null;
    }

    private final Uri onNavigationEvent(Uri uri) {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        return (Uri) onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), new Object[]{this, uri}, -1219650473, 1219650473, zzgsa.onWarmupCompleted(), iOnWarmupCompleted, zzgsa.onWarmupCompleted());
    }

    private final Uri onWarmupCompleted(Uri uri) {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        return (Uri) onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), new Object[]{this, uri}, -1574214535, 1574214536, zzgsa.onWarmupCompleted(), iOnWarmupCompleted, zzgsa.onWarmupCompleted());
    }

    static void onNavigationEvent() {
        IAuthTabCallbackStub = new char[]{64924, 64913, 64986, 64967, 64988, 64982, 64961, 64990, 64926, 64905, 64912, 64963, 64966, 64987, 64927, 64960};
        IAuthTabCallbackDefault = (char) 51245;
    }
}
