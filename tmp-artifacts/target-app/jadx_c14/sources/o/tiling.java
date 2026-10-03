package o;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebStorage;
import android.widget.ExpandableListView;
import com.google.common.collect.Synchronized;
import im.toss.features.applock.model.AppProfile;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.features.usshome.UssHomeItemAdapter$;
import im.toss.features.verify.oneclicklogin.impl.view.presentation.LoginTokenConsentViewModel_HiltModules;
import im.toss.featurescommon.overseas.company.presentation.screen.ComposableSingletons$OverseasCompanyInfoScreenKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import im.toss.state.spec.SessionState;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.rx2.RxCompletableKt;
import kotlinx.coroutines.rx2.RxSingleKt;
import o.IAPIntegrationHelper4;
import o.JsonReaderErrorInfo;
import o.deserializeIp;
import o.getSegmentCollection;
import o.setSegmentCollection;
import o.tiling;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.core.AppStateManager;
import viva.republica.toss.network.model.init.v2.CheckoutResult;
import viva.republica.toss.network.model.verify.guest.GlobalCrossRegionSignUpRequest;
import viva.republica.toss.network.model.verify.guest.GlobalCrossRegionSignUpWithResetPasswordRequest;
import viva.republica.toss.network.model.verify.guest.GlobalSignInRequest;
import viva.republica.toss.network.model.verify.guest.GlobalSignUpRequest;
import viva.republica.toss.network.model.verify.guest.SignInRequest;
import viva.republica.toss.network.model.verify.guest.SignInResponse;
import viva.republica.toss.network.model.verify.guest.SignUpRequest;
import viva.republica.toss.network.model.verify.guest.VisitorSignInRequest;
import viva.republica.toss.network.model.verify.guest.VisitorSignUpRequest;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class tiling {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final Lazy IAuthTabCallback;
    private static final Lazy IAuthTabCallbackDefault;
    private static final Lazy IAuthTabCallbackStub;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int IAuthTabCallback_Parcel = 0;
    private static int ICustomTabsCallback = 0;
    private static boolean access000 = false;
    private static boolean access100 = false;
    private static char[] asBinder = null;
    private static final Lazy asInterface;
    private static int extraCallbackWithResult = 1;
    private static int getInterfaceDescriptor;
    private static final Lazy onExtraCallback;
    private static final Lazy onExtraCallbackWithResult;
    public static final tiling onNavigationEvent;
    private static String onTransact;
    public static final int onWarmupCompleted;

    public static /* synthetic */ deserializeIp IAuthTabCallback(boolean z, long j, asArray asarray, Long l, boolean z2, String str) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 89;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        deserializeIp deserializeip = (deserializeIp) onWarmupCompleted(-1376838856, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), 1376838875, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), new Object[]{Boolean.valueOf(z), Long.valueOf(j), asarray, l, Boolean.valueOf(z2), str}, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted());
        int i4 = IAuthTabCallbackStubProxy + 67;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return deserializeip;
    }

    public static /* synthetic */ deserializeIp IAuthTabCallback(boolean z, long j, asArray asarray, String str) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 81;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(z, j, asarray, str);
            throw null;
        }
        deserializeIp deserializeipOnExtraCallbackWithResult = onExtraCallbackWithResult(z, j, asarray, str);
        int i3 = IAuthTabCallbackStubProxy + 37;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 85 / 0;
        }
        return deserializeipOnExtraCallbackWithResult;
    }

    public static /* synthetic */ getBillingPeriod IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 65;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
            int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
            int iOnWarmupCompleted3 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
            return (getBillingPeriod) onWarmupCompleted(-672008578, iOnWarmupCompleted, 672008582, iOnWarmupCompleted2, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), new Object[0], iOnWarmupCompleted3);
        }
        int iOnWarmupCompleted4 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted5 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted6 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int i3 = 66 / 0;
        return (getBillingPeriod) onWarmupCompleted(-672008578, iOnWarmupCompleted4, 672008582, iOnWarmupCompleted5, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), new Object[0], iOnWarmupCompleted6);
    }

    public static /* synthetic */ void IAuthTabCallback(Context context, SignInResponse signInResponse) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 59;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {context, signInResponse};
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        if (i3 == 0) {
            onWarmupCompleted(1209861710, iOnWarmupCompleted, -1209861699, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), objArr, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted());
            throw null;
        }
        onWarmupCompleted(1209861710, iOnWarmupCompleted, -1209861699, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), objArr, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted());
        int i4 = IAuthTabCallbackStubProxy + 101;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ deserializeIp IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 25;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return extraCallbackWithResult(function1, obj);
        }
        extraCallbackWithResult(function1, obj);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 81;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        onPostMessage();
        int i4 = getInterfaceDescriptor + 19;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ deserializeIp IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 95;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return extraCallback(function1, obj);
        }
        extraCallback(function1, obj);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 117;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStubProxy();
        int i4 = IAuthTabCallbackStubProxy + 39;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 63 / 0;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        Unit unit;
        Throwable th = (Throwable) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 85;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {th};
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted3 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted4 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        if (i3 == 0) {
            unit = (Unit) onWarmupCompleted(1113389174, iOnWarmupCompleted, -1113389156, iOnWarmupCompleted2, iOnWarmupCompleted4, objArr2, iOnWarmupCompleted3);
            int i4 = 22 / 0;
        } else {
            unit = (Unit) onWarmupCompleted(1113389174, iOnWarmupCompleted, -1113389156, iOnWarmupCompleted2, iOnWarmupCompleted4, objArr2, iOnWarmupCompleted3);
        }
        int i5 = getInterfaceDescriptor + 71;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ JsonReaderErrorInfo IAuthTabCallback_Parcel(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 19;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        JsonReaderErrorInfo jsonReaderErrorInfoWriteTypedObject = writeTypedObject(function1, obj);
        int i4 = IAuthTabCallbackStubProxy + 61;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 80 / 0;
        }
        return jsonReaderErrorInfoWriteTypedObject;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 21;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        JsonReaderErrorInfo typedObject = readTypedObject(function1, obj);
        int i4 = IAuthTabCallbackStubProxy + 9;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return typedObject;
    }

    public static /* synthetic */ JsonReaderErrorInfo access100(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 53;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        JsonReaderErrorInfo jsonReaderErrorInfoAccess000 = access000(function1, obj);
        int i4 = IAuthTabCallbackStubProxy + 11;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return jsonReaderErrorInfoAccess000;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        long jLongValue = ((Number) objArr[1]).longValue();
        asArray asarray = (asArray) objArr[2];
        Long l = (Long) objArr[3];
        String str = (String) objArr[4];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 27;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(zBooleanValue, jLongValue, asarray, l, str);
        }
        IAuthTabCallback(zBooleanValue, jLongValue, asarray, l, str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ calcThumbnailOptions asBinder() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 67;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        calcThumbnailOptions calcthumbnailoptionsICustomTabsCallbackDefault = ICustomTabsCallbackDefault();
        int i4 = getInterfaceDescriptor + 51;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return calcthumbnailoptionsICustomTabsCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ deserializeIp asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 91;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            ICustomTabsCallbackStub(function1, obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        deserializeIp deserializeipICustomTabsCallbackStub = ICustomTabsCallbackStub(function1, obj);
        int i3 = IAuthTabCallbackStubProxy + 71;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return deserializeipICustomTabsCallbackStub;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 123;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return onActivityResized(function1, obj);
        }
        onActivityResized(function1, obj);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ IAPIntegrationHelper4 asInterface() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 39;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            ICustomTabsCallbackStub();
            throw null;
        }
        IAPIntegrationHelper4 iAPIntegrationHelper4ICustomTabsCallbackStub = ICustomTabsCallbackStub();
        int i3 = IAuthTabCallbackStubProxy + 11;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            return iAPIntegrationHelper4ICustomTabsCallbackStub;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) throws Throwable {
        long jLongValue = ((Number) objArr[0]).longValue();
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 41;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(jLongValue, zBooleanValue, setDetectableSize);
        if (i3 == 0) {
            int i4 = 17 / 0;
        }
        int i5 = getInterfaceDescriptor + 15;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 28 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ JsonReaderErrorInfo onExtraCallback(long j, Context context, GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, boolean z, Long l, String str, boolean z2, boolean z3, boolean z4, boolean z5, getLogUploadURLMap getloguploadurlmap, SignInResponse signInResponse) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 63;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        JsonReaderErrorInfo jsonReaderErrorInfoOnWarmupCompleted = onWarmupCompleted(j, context, graniteBrownfieldModule_closeView, z, l, str, z2, z3, z4, z5, getloguploadurlmap, signInResponse);
        if (i3 == 0) {
            int i4 = 27 / 0;
        }
        int i5 = getInterfaceDescriptor + 99;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return jsonReaderErrorInfoOnWarmupCompleted;
    }

    public static /* synthetic */ JsonReaderErrorInfo onExtraCallback(writeRaw writeraw, boolean z, long j, Context context, GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, Long l, String str, boolean z2, boolean z3, boolean z4, getLogUploadURLMap getloguploadurlmap, SignInResponse signInResponse) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 57;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        JsonReaderErrorInfo jsonReaderErrorInfoOnNavigationEvent = onNavigationEvent(writeraw, z, j, context, graniteBrownfieldModule_closeView, l, str, z2, z3, z4, getloguploadurlmap, signInResponse);
        if (i3 == 0) {
            int i4 = 50 / 0;
        }
        return jsonReaderErrorInfoOnNavigationEvent;
    }

    public static /* synthetic */ copyFile onExtraCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 45;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted3 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        copyFile copyfile = (copyFile) onWarmupCompleted(-610580484, iOnWarmupCompleted, 610580497, iOnWarmupCompleted2, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), new Object[0], iOnWarmupCompleted3);
        int i4 = getInterfaceDescriptor + 89;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return copyfile;
        }
        throw null;
    }

    public static /* synthetic */ deserializeIp onExtraCallback(long j, asArray asarray, Pair pair) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 75;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        deserializeIp deserializeipIAuthTabCallback = IAuthTabCallback(j, asarray, pair);
        if (i3 != 0) {
            int i4 = 24 / 0;
        }
        return deserializeipIAuthTabCallback;
    }

    public static /* synthetic */ deserializeIp onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 27;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
            int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
            int iOnWarmupCompleted3 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
            return (deserializeIp) onWarmupCompleted(-203198433, iOnWarmupCompleted, 203198438, iOnWarmupCompleted2, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), new Object[]{function1, obj}, iOnWarmupCompleted3);
        }
        int iOnWarmupCompleted4 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted5 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted6 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        deserializeIp deserializeip = (deserializeIp) onWarmupCompleted(-203198433, iOnWarmupCompleted4, 203198438, iOnWarmupCompleted5, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), new Object[]{function1, obj}, iOnWarmupCompleted6);
        int i3 = 6 / 0;
        return deserializeip;
    }

    public static /* synthetic */ JsonReaderErrorInfo onExtraCallbackWithResult(long j, Context context, GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, boolean z, Long l, String str, boolean z2, boolean z3, boolean z4, boolean z5, getLogUploadURLMap getloguploadurlmap, SignInResponse signInResponse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 15;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {Long.valueOf(j), context, graniteBrownfieldModule_closeView, Boolean.valueOf(z), l, str, Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4), Boolean.valueOf(z5), getloguploadurlmap, signInResponse};
        if (i3 == 0) {
            return (JsonReaderErrorInfo) onWarmupCompleted(2025434195, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), -2025434181, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), objArr, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted());
        }
        int i4 = 39 / 0;
        return (JsonReaderErrorInfo) onWarmupCompleted(2025434195, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), -2025434181, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), objArr, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted());
    }

    public static /* synthetic */ deserializeIp onExtraCallbackWithResult(long j, asArray asarray, Pair pair) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 71;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        deserializeIp deserializeipOnNavigationEvent = onNavigationEvent(j, asarray, pair);
        int i4 = getInterfaceDescriptor + 121;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 16 / 0;
        }
        return deserializeipOnNavigationEvent;
    }

    public static /* synthetic */ deserializeIp onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 27;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted3 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        deserializeIp deserializeip = (deserializeIp) onWarmupCompleted(-1754137018, iOnWarmupCompleted, 1754137018, iOnWarmupCompleted2, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), new Object[]{function1, obj}, iOnWarmupCompleted3);
        int i4 = IAuthTabCallbackStubProxy + 75;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return deserializeip;
        }
        throw null;
    }

    public static /* synthetic */ getSRegion onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 23;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        getSRegion getsregionExtraCallbackWithResult = extraCallbackWithResult();
        if (i3 != 0) {
            int i4 = 22 / 0;
        }
        return getsregionExtraCallbackWithResult;
    }

    public static /* synthetic */ JsonReaderErrorInfo onNavigationEvent(long j, Context context, GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, boolean z, Long l, String str, boolean z2, boolean z3, boolean z4, getLogUploadURLMap getloguploadurlmap, SignInResponse signInResponse) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 21;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        JsonReaderErrorInfo jsonReaderErrorInfoIAuthTabCallback = IAuthTabCallback(j, context, graniteBrownfieldModule_closeView, z, l, str, z2, z3, z4, getloguploadurlmap, signInResponse);
        int i4 = getInterfaceDescriptor + 125;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return jsonReaderErrorInfoIAuthTabCallback;
    }

    public static /* synthetic */ JsonReaderErrorInfo onNavigationEvent(SignInResponse signInResponse, long j, Context context, GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, Long l, String str, boolean z, boolean z2, boolean z3, getLogUploadURLMap getloguploadurlmap, Boolean bool) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 121;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(signInResponse, j, context, graniteBrownfieldModule_closeView, l, str, z, z2, z3, getloguploadurlmap, bool);
        }
        IAuthTabCallback(signInResponse, j, context, graniteBrownfieldModule_closeView, l, str, z, z2, z3, getloguploadurlmap, bool);
        throw null;
    }

    public static /* synthetic */ deserializeIp onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 45;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        deserializeIp deserializeipIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(function1, obj);
        int i4 = getInterfaceDescriptor + 99;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return deserializeipIAuthTabCallbackStubProxy;
    }

    public static /* synthetic */ getNotificationsEnabledCompatKitkat onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 89;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            access100();
            throw null;
        }
        getNotificationsEnabledCompatKitkat getnotificationsenabledcompatkitkatAccess100 = access100();
        int i3 = getInterfaceDescriptor + 101;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return getnotificationsenabledcompatkitkatAccess100;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 77;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(zBooleanValue, zBooleanValue2);
        if (i3 != 0) {
            return null;
        }
        int i4 = 68 / 0;
        return null;
    }

    public static /* synthetic */ JsonReaderErrorInfo onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 89;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        JsonReaderErrorInfo jsonReaderErrorInfoOnActivityLayout = onActivityLayout(function1, obj);
        int i4 = getInterfaceDescriptor + 99;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return jsonReaderErrorInfoOnActivityLayout;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) throws Throwable {
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray;
        String str;
        String message;
        Map map;
        int i7;
        int i8 = ~i;
        int i9 = ~i2;
        int i10 = ~(i8 | i9);
        int i11 = ~((~i3) | i);
        int i12 = i10 | i11 | (~(i | i2));
        int i13 = (~(i2 | i3)) | (~(i8 | i3));
        int i14 = i9 | i11;
        int i15 = i3 + i + i4 + (793188503 * i6) + (2090109681 * i5);
        int i16 = i15 * i15;
        int i17 = ((i3 * 1389925299) - 652765764) + (i * 1389927018) + (i12 * 573) + (i13 * (-1146)) + (i14 * 573) + (1389926445 * i4) + ((-1551828341) * i6) + ((-2047638435) * i5) + (i16 * 1214709760);
        switch ((837707615 * i3) + 1286602752 + ((-1676358574) * i) + (i12 * (-838022063)) + (1676044126 * i13) + ((-838022063) * i14) + ((-838336512) * i4) + (1186463744 * i6) + (1166540800 * i5) + ((-1956446208) * i16) + (i17 * i17 * 445972480)) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onNavigationEvent(objArr);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return IAuthTabCallbackStub(objArr);
            case 6:
                long jLongValue = ((Number) objArr[0]).longValue();
                boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                boolean zBooleanValue2 = ((Boolean) objArr[2]).booleanValue();
                boolean zBooleanValue3 = ((Boolean) objArr[3]).booleanValue();
                boolean zBooleanValue4 = ((Boolean) objArr[4]).booleanValue();
                boolean zBooleanValue5 = ((Boolean) objArr[5]).booleanValue();
                boolean zBooleanValue6 = ((Boolean) objArr[6]).booleanValue();
                boolean zBooleanValue7 = ((Boolean) objArr[7]).booleanValue();
                Context context = (Context) objArr[8];
                int i18 = 2 % 2;
                int i19 = IAuthTabCallbackStubProxy + 55;
                getInterfaceDescriptor = i19 % 128;
                int i20 = i19 % 2;
                IAuthTabCallback(jLongValue, zBooleanValue, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, zBooleanValue6, zBooleanValue7, context);
                int i21 = IAuthTabCallbackStubProxy + 31;
                getInterfaceDescriptor = i21 % 128;
                int i22 = i21 % 2;
                return null;
            case 7:
                return asBinder(objArr);
            case 8:
                return onTransact(objArr);
            case 9:
                return IAuthTabCallbackDefault(objArr);
            case 10:
                return asInterface(objArr);
            case 11:
                Context context2 = (Context) objArr[0];
                SignInResponse signInResponse = (SignInResponse) objArr[1];
                int i23 = 2 % 2;
                int i24 = IAuthTabCallbackStubProxy + 19;
                getInterfaceDescriptor = i24 % 128;
                int i25 = i24 % 2;
                onWarmupCompleted(-747475232, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), 747475241, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), new Object[]{onNavigationEvent, context2, signInResponse.onWarmupCompleted()}, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted());
                AppStateManager.onExtraCallbackWithResult.onActivityLayout().onEvent(getSegmentCollection.onWarmupCompleted.access100.onExtraCallback);
                SessionState.Companion.onExtraCallback().onWarmupCompleted(SessionState.Event.OnUserLogIn.onWarmupCompleted);
                int i26 = IAuthTabCallbackStubProxy + 101;
                getInterfaceDescriptor = i26 % 128;
                int i27 = i26 % 2;
                return null;
            case 12:
                return getInterfaceDescriptor(objArr);
            case 13:
                int i28 = 2 % 2;
                int i29 = IAuthTabCallbackStubProxy + 43;
                getInterfaceDescriptor = i29 % 128;
                int i30 = i29 % 2;
                copyFile copyfileOnUnminimized = onNavigationEvent.extraCallback().onUnminimized();
                int i31 = getInterfaceDescriptor + 107;
                IAuthTabCallbackStubProxy = i31 % 128;
                int i32 = i31 % 2;
                return copyfileOnUnminimized;
            case 14:
                return access000(objArr);
            case 15:
                final long jLongValue2 = ((Number) objArr[1]).longValue();
                final Context context3 = (Context) objArr[2];
                final GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView = (GraniteBrownfieldModule_closeView) objArr[3];
                final boolean zBooleanValue8 = ((Boolean) objArr[4]).booleanValue();
                final Long l = (Long) objArr[5];
                final String str2 = (String) objArr[6];
                final boolean zBooleanValue9 = ((Boolean) objArr[7]).booleanValue();
                final boolean zBooleanValue10 = ((Boolean) objArr[8]).booleanValue();
                final getLogUploadURLMap getloguploadurlmap = (getLogUploadURLMap) objArr[9];
                final boolean zBooleanValue11 = ((Boolean) objArr[10]).booleanValue();
                final Long l2 = (Long) objArr[11];
                final boolean zBooleanValue12 = ((Boolean) objArr[12]).booleanValue();
                int i33 = 2 % 2;
                Intrinsics.checkNotNullParameter(context3, "");
                Intrinsics.checkNotNullParameter(graniteBrownfieldModule_closeView, "");
                Intrinsics.checkNotNullParameter(getloguploadurlmap, "");
                final asArray asarrayOnTransact = setTestMode.onExtraCallback.onTransact();
                writeRaw writerawIAuthTabCallback = RxSingleKt.IAuthTabCallback((CoroutineContext) null, new access000(graniteBrownfieldModule_closeView, asarrayOnTransact, null), 1, (Object) null);
                final Function1 function1 = new Function1() { // from class: viva.republica.toss.guest.GuestManager$$ExternalSyntheticLambda11
                    public final Object invoke(Object obj) {
                        boolean z = zBooleanValue11;
                        long j = jLongValue2;
                        Object[] objArr2 = {Boolean.valueOf(z), Long.valueOf(j), asarrayOnTransact, l2, (String) obj};
                        return (deserializeIp) tiling.onWarmupCompleted(-1090841598, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), 1090841605, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), objArr2, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted());
                    }
                };
                writeRaw writerawOnExtraCallbackWithResult = writerawIAuthTabCallback.onExtraCallbackWithResult(new deserializeIntNullableCollection() { // from class: viva.republica.toss.guest.GuestManager$$ExternalSyntheticLambda12
                    public final Object apply(Object obj) {
                        return tiling.IAuthTabCallbackStub(function1, obj);
                    }
                });
                final Function1 function12 = new Function1() { // from class: viva.republica.toss.guest.GuestManager$$ExternalSyntheticLambda13
                    public final Object invoke(Object obj) {
                        return tiling.onExtraCallback(jLongValue2, context3, graniteBrownfieldModule_closeView, zBooleanValue8, l, str2, zBooleanValue9, zBooleanValue10, zBooleanValue11, zBooleanValue12, getloguploadurlmap, (SignInResponse) obj);
                    }
                };
                wasLastName waslastnameOnNavigationEvent = writerawOnExtraCallbackWithResult.onNavigationEvent(new deserializeIntNullableCollection() { // from class: viva.republica.toss.guest.GuestManager$$ExternalSyntheticLambda14
                    public final Object apply(Object obj) {
                        Object[] objArr2 = {function12, obj};
                        return (JsonReaderErrorInfo) tiling.onWarmupCompleted(-487895814, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), 487895834, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), objArr2, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted());
                    }
                }).onNavigationEvent(NetConverter3.onExtraCallback());
                Intrinsics.checkNotNullExpressionValue(waslastnameOnNavigationEvent, "");
                int i34 = getInterfaceDescriptor + 97;
                IAuthTabCallbackStubProxy = i34 % 128;
                int i35 = i34 % 2;
                return waslastnameOnNavigationEvent;
            case 16:
                return IAuthTabCallbackStubProxy(objArr);
            case 17:
                return access100(objArr);
            case 18:
                Throwable th = (Throwable) objArr[0];
                int i36 = 2 % 2;
                int i37 = getInterfaceDescriptor + 7;
                IAuthTabCallbackStubProxy = i37 % 128;
                if (i37 % 2 == 0) {
                    convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                    str = "GuestManager";
                    message = th.getMessage();
                    map = null;
                    i7 = 84;
                } else {
                    convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                    str = "GuestManager";
                    message = th.getMessage();
                    map = null;
                    i7 = 8;
                }
                ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, str, message, th, map, i7, (Object) null);
                return Unit.INSTANCE;
            case 19:
                return IAuthTabCallback_Parcel(objArr);
            case 20:
                return readTypedObject(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    public static /* synthetic */ JsonReaderErrorInfo onWarmupCompleted(long j, Context context, GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, boolean z, Long l, String str, boolean z2, boolean z3, boolean z4, getLogUploadURLMap getloguploadurlmap, SignInResponse signInResponse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 33;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        JsonReaderErrorInfo jsonReaderErrorInfoOnExtraCallback = onExtraCallback(j, context, graniteBrownfieldModule_closeView, z, l, str, z2, z3, z4, getloguploadurlmap, signInResponse);
        int i4 = getInterfaceDescriptor + 25;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return jsonReaderErrorInfoOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ deserializeIp onWarmupCompleted(boolean z, long j, asArray asarray, Pair pair) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 121;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {Boolean.valueOf(z), Long.valueOf(j), asarray, pair};
        deserializeIp deserializeip = (deserializeIp) onWarmupCompleted(953596614, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), -953596612, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), objArr, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted());
        int i4 = getInterfaceDescriptor + 83;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return deserializeip;
    }

    public static /* synthetic */ void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 99;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        access000();
        int i4 = IAuthTabCallbackStubProxy + 83;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 49;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted3 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        onWarmupCompleted(-1816058957, iOnWarmupCompleted, 1816058958, iOnWarmupCompleted2, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), new Object[]{function1, obj}, iOnWarmupCompleted3);
        int i4 = IAuthTabCallbackStubProxy + 53;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object readTypedObject(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 9;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        JsonReaderErrorInfo jsonReaderErrorInfoOnMessageChannelReady = onMessageChannelReady(function1, obj);
        int i4 = getInterfaceDescriptor + 19;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return jsonReaderErrorInfoOnMessageChannelReady;
        }
        throw null;
    }

    public static final class IAuthTabCallbackStubProxy<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter onExtraCallback;
        final /* synthetic */ MapConverter onWarmupCompleted;

        public IAuthTabCallbackStubProxy(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onWarmupCompleted = mapConverter;
            this.onExtraCallback = mapConverter2;
        }

        public final deserializeIp<SignInResponse> apply(writeRaw<BaseApiResponse<SignInResponse>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$startActivityForResult(new Function1<BaseApiResponse<SignInResponse>, deserializeIp<? extends SignInResponse>>() { // from class: o.tiling.IAuthTabCallbackStubProxy.2
                /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends SignInResponse> invoke(BaseApiResponse<SignInResponse> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = SignInResponse.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            }));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onWarmupCompleted;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onExtraCallback;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    public static final class getInterfaceDescriptor<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter IAuthTabCallback;
        final /* synthetic */ MapConverter onExtraCallback;

        public getInterfaceDescriptor(MapConverter mapConverter, MapConverter mapConverter2) {
            this.IAuthTabCallback = mapConverter;
            this.onExtraCallback = mapConverter2;
        }

        public final deserializeIp<SignInResponse> apply(writeRaw<BaseApiResponse<SignInResponse>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$startActivityForResult(new Function1<BaseApiResponse<SignInResponse>, deserializeIp<? extends SignInResponse>>() { // from class: o.tiling.getInterfaceDescriptor.2
                /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends SignInResponse> invoke(BaseApiResponse<SignInResponse> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = SignInResponse.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            }));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.IAuthTabCallback;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onExtraCallback;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    public static final class onExtraCallback<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter IAuthTabCallback;
        final /* synthetic */ MapConverter onExtraCallbackWithResult;

        public onExtraCallback(MapConverter mapConverter, MapConverter mapConverter2) {
            this.IAuthTabCallback = mapConverter;
            this.onExtraCallbackWithResult = mapConverter2;
        }

        public final deserializeIp<Boolean> apply(writeRaw<BaseApiResponse<Boolean>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$startActivityForResult(new Function1<BaseApiResponse<Boolean>, deserializeIp<? extends Boolean>>() { // from class: o.tiling.onExtraCallback.3
                /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends Boolean> invoke(BaseApiResponse<Boolean> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = Boolean.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            }));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.IAuthTabCallback;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onExtraCallbackWithResult;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    public static final class onExtraCallbackWithResult<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter onExtraCallback;
        final /* synthetic */ MapConverter onWarmupCompleted;

        public onExtraCallbackWithResult(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onExtraCallback = mapConverter;
            this.onWarmupCompleted = mapConverter2;
        }

        public final deserializeIp<SignInResponse> apply(writeRaw<BaseApiResponse<SignInResponse>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$startActivityForResult(new Function1<BaseApiResponse<SignInResponse>, deserializeIp<? extends SignInResponse>>() { // from class: o.tiling.onExtraCallbackWithResult.1
                /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends SignInResponse> invoke(BaseApiResponse<SignInResponse> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = SignInResponse.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            }));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onExtraCallback;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onWarmupCompleted;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    public static final class onWarmupCompleted<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter onExtraCallback;
        final /* synthetic */ MapConverter onExtraCallbackWithResult;

        public onWarmupCompleted(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onExtraCallbackWithResult = mapConverter;
            this.onExtraCallback = mapConverter2;
        }

        public final deserializeIp<SignInResponse> apply(writeRaw<BaseApiResponse<SignInResponse>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$startActivityForResult(new Function1<BaseApiResponse<SignInResponse>, deserializeIp<? extends SignInResponse>>() { // from class: o.tiling.onWarmupCompleted.3
                /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends SignInResponse> invoke(BaseApiResponse<SignInResponse> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = SignInResponse.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            }));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onExtraCallbackWithResult;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onExtraCallback;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    public static final class readTypedObject<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter onExtraCallback;
        final /* synthetic */ MapConverter onWarmupCompleted;

        public readTypedObject(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onWarmupCompleted = mapConverter;
            this.onExtraCallback = mapConverter2;
        }

        public final deserializeIp<Object> apply(writeRaw<BaseApiResponse<Object>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$startActivityForResult(new Function1<BaseApiResponse<Object>, deserializeIp<? extends Object>>() { // from class: o.tiling.readTypedObject.3
                /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends Object> invoke(BaseApiResponse<Object> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = Object.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            }));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onWarmupCompleted;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onExtraCallback;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    public static final class writeTypedObject<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter onExtraCallback;
        final /* synthetic */ MapConverter onWarmupCompleted;

        public writeTypedObject(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onWarmupCompleted = mapConverter;
            this.onExtraCallback = mapConverter2;
        }

        public final deserializeIp<SignInResponse> apply(writeRaw<BaseApiResponse<SignInResponse>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$startActivityForResult(new Function1<BaseApiResponse<SignInResponse>, deserializeIp<? extends SignInResponse>>() { // from class: o.tiling.writeTypedObject.5
                /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends SignInResponse> invoke(BaseApiResponse<SignInResponse> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = SignInResponse.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            }));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onWarmupCompleted;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onExtraCallback;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    private tiling() {
    }

    public static final /* synthetic */ IAPIntegrationHelper4 onNavigationEvent(tiling tilingVar) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 41;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        IAPIntegrationHelper4 iAPIntegrationHelper4OnActivityResized = tilingVar.onActivityResized();
        int i4 = IAuthTabCallbackStubProxy + 95;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return iAPIntegrationHelper4OnActivityResized;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onTransact();
        onNavigationEvent = new tiling();
        IAuthTabCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.guest.GuestManager$$ExternalSyntheticLambda22
            public final Object invoke() {
                return tiling.onExtraCallbackWithResult();
            }
        });
        onExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.guest.GuestManager$$ExternalSyntheticLambda23
            public final Object invoke() {
                return tiling.onNavigationEvent();
            }
        });
        IAuthTabCallbackDefault = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.guest.GuestManager$$ExternalSyntheticLambda24
            public final Object invoke() {
                return tiling.asInterface();
            }
        });
        IAuthTabCallbackStub = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.guest.GuestManager$$ExternalSyntheticLambda25
            public final Object invoke() {
                return tiling.IAuthTabCallback();
            }
        });
        asInterface = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.guest.GuestManager$$ExternalSyntheticLambda26
            public final Object invoke() {
                return tiling.asBinder();
            }
        });
        onExtraCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.guest.GuestManager$$ExternalSyntheticLambda27
            public final Object invoke() {
                return tiling.onExtraCallback();
            }
        });
        onWarmupCompleted = 8;
        int i = ICustomTabsCallback + 25;
        extraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private final getSRegion extraCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 97;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        getSRegion getsregion = (getSRegion) IAuthTabCallback.getValue();
        if (i3 != 0) {
            return getsregion;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final getSRegion extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 107;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        getSRegion getsregion = (getSRegion) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), getSRegion.class);
        int i4 = getInterfaceDescriptor + 21;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return getsregion;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final getNotificationsEnabledCompatKitkat writeTypedObject() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 7;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        getNotificationsEnabledCompatKitkat getnotificationsenabledcompatkitkat = (getNotificationsEnabledCompatKitkat) onExtraCallbackWithResult.getValue();
        int i4 = getInterfaceDescriptor + 15;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return getnotificationsenabledcompatkitkat;
    }

    private static final getNotificationsEnabledCompatKitkat access100() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 23;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        getSRegion getsregionExtraCallback = onNavigationEvent.extraCallback();
        if (i3 != 0) {
            return getsregionExtraCallback.ReportDrawnKt();
        }
        getsregionExtraCallback.ReportDrawnKt();
        throw null;
    }

    private final IAPIntegrationHelper4 onActivityResized() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 19;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        IAPIntegrationHelper4 iAPIntegrationHelper4 = (IAPIntegrationHelper4) IAuthTabCallbackDefault.getValue();
        int i4 = getInterfaceDescriptor + 79;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return iAPIntegrationHelper4;
    }

    private static final IAPIntegrationHelper4 ICustomTabsCallbackStub() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 77;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        IAPIntegrationHelper4.IAuthTabCallback iAuthTabCallback = IAPIntegrationHelper4.Companion;
        if (i3 != 0) {
            return iAuthTabCallback.onExtraCallback();
        }
        iAuthTabCallback.onExtraCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final getBillingPeriod ICustomTabsCallback() {
        getBillingPeriod getbillingperiod;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 69;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            getbillingperiod = (getBillingPeriod) IAuthTabCallbackStub.getValue();
            int i3 = 93 / 0;
        } else {
            getbillingperiod = (getBillingPeriod) IAuthTabCallbackStub.getValue();
        }
        int i4 = IAuthTabCallbackStubProxy + 73;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return getbillingperiod;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        getBillingPeriod getbillingperiodAddOnContextAvailableListener;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 13;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            getbillingperiodAddOnContextAvailableListener = onNavigationEvent.extraCallback().addOnContextAvailableListener();
            int i3 = 33 / 0;
        } else {
            getbillingperiodAddOnContextAvailableListener = onNavigationEvent.extraCallback().addOnContextAvailableListener();
        }
        int i4 = getInterfaceDescriptor + 9;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 29 / 0;
        }
        return getbillingperiodAddOnContextAvailableListener;
    }

    private final calcThumbnailOptions onActivityLayout() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 119;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        calcThumbnailOptions calcthumbnailoptions = (calcThumbnailOptions) asInterface.getValue();
        int i4 = IAuthTabCallbackStubProxy + 111;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return calcthumbnailoptions;
    }

    private static final calcThumbnailOptions ICustomTabsCallbackDefault() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 23;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onNavigationEvent.extraCallback().AppCompatDelegateImplListMenuDecorView();
            throw null;
        }
        calcThumbnailOptions calcthumbnailoptionsAppCompatDelegateImplListMenuDecorView = onNavigationEvent.extraCallback().AppCompatDelegateImplListMenuDecorView();
        int i3 = getInterfaceDescriptor + 3;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            return calcthumbnailoptionsAppCompatDelegateImplListMenuDecorView;
        }
        obj.hashCode();
        throw null;
    }

    private final copyFile readTypedObject() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 125;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object value = onExtraCallback.getValue();
        if (i3 != 0) {
            return (copyFile) value;
        }
        int i4 = 63 / 0;
        return (copyFile) value;
    }

    static final class ICustomTabsCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super String>, Object> {
        final /* synthetic */ asArray $currentPasswordFormat;
        final /* synthetic */ GraniteBrownfieldModule_closeView $password;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ICustomTabsCallback(GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, asArray asarray, access13800<? super ICustomTabsCallback> access13800Var) {
            super(2, access13800Var);
            this.$password = graniteBrownfieldModule_closeView;
            this.$currentPasswordFormat = asarray;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new ICustomTabsCallback(this.$password, this.$currentPasswordFormat, access13800Var);
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super String> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                return obj;
            }
            ResultKt.onNavigationEvent(obj);
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getWindowTouchSlop() >> 8) + 30, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 24886, -265239605, false, "onWarmupCompleted", (Class[]) null);
            }
            Object obj2 = ((Field) objOnExtraCallback).get(null);
            GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView = this.$password;
            asArray asarray = this.$currentPasswordFormat;
            this.label = 1;
            try {
                Object[] objArr = {graniteBrownfieldModule_closeView, asarray, this};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1510310677);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getCapsMode("", 0, 0), 30 - View.resolveSizeAndState(0, 0, 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 24887, -1799716229, false, "onExtraCallbackWithResult", new Class[]{GraniteBrownfieldModule_closeView.class, asArray.class, access13800.class});
                }
                Object objInvoke = ((Method) objOnExtraCallback2).invoke(obj2, objArr);
                return objInvoke == objOnWarmupCompleted ? objOnWarmupCompleted : objInvoke;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
    }

    private static final deserializeIp ICustomTabsCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 51;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        deserializeIp deserializeip = (deserializeIp) function1.invoke(obj);
        int i4 = getInterfaceDescriptor + 29;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return deserializeip;
    }

    public final wasLastName IAuthTabCallback(final long j, @NotNull GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, final boolean z) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(graniteBrownfieldModule_closeView, "");
        final asArray asarrayOnTransact = setTestMode.onExtraCallback.onTransact();
        writeRaw writerawIAuthTabCallback = RxSingleKt.IAuthTabCallback((CoroutineContext) null, new ICustomTabsCallback(graniteBrownfieldModule_closeView, asarrayOnTransact, null), 1, (Object) null);
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.guest.GuestManager$$ExternalSyntheticLambda28
            public final Object invoke(Object obj) {
                return tiling.IAuthTabCallback(z, j, asarrayOnTransact, (String) obj);
            }
        };
        wasLastName waslastnameBI_ = writerawIAuthTabCallback.onExtraCallbackWithResult(new deserializeIntNullableCollection() { // from class: viva.republica.toss.guest.GuestManager$$ExternalSyntheticLambda29
            public final Object apply(Object obj) {
                return tiling.asBinder(function1, obj);
            }
        }).bI_();
        Intrinsics.checkNotNullExpressionValue(waslastnameBI_, "");
        int i2 = getInterfaceDescriptor + 1;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        return waslastnameBI_;
    }

    public static /* synthetic */ wasLastName onWarmupCompleted(tiling tilingVar, long j, Context context, GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, boolean z, Long l, String str, boolean z2, boolean z3, getLogUploadURLMap getloguploadurlmap, boolean z4, Long l2, boolean z5, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 115;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        wasLastName waslastname = (wasLastName) onWarmupCompleted(1846285751, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), -1846285736, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), new Object[]{tilingVar, Long.valueOf(j), context, graniteBrownfieldModule_closeView, Boolean.valueOf(z), l, str, Boolean.valueOf(z2), Boolean.valueOf(z3), getloguploadurlmap, Boolean.valueOf(z4), (i & 1024) != 0 ? null : l2, Boolean.valueOf(z5)}, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted());
        int i5 = getInterfaceDescriptor + 31;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return waslastname;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class access000 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super String>, Object> {
        final /* synthetic */ asArray $currentPasswordFormat;
        final /* synthetic */ GraniteBrownfieldModule_closeView $password;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        access000(GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, asArray asarray, access13800<? super access000> access13800Var) {
            super(2, access13800Var);
            this.$password = graniteBrownfieldModule_closeView;
            this.$currentPasswordFormat = asarray;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super String> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new access000(this.$password, this.$currentPasswordFormat, access13800Var);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                return obj;
            }
            ResultKt.onNavigationEvent(obj);
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), 30 - Color.green(0), ((byte) KeyEvent.getModifierMetaStateMask()) + 24888, -265239605, false, "onWarmupCompleted", (Class[]) null);
            }
            Object obj2 = ((Field) objOnExtraCallback).get(null);
            GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView = this.$password;
            asArray asarray = this.$currentPasswordFormat;
            this.label = 1;
            try {
                Object[] objArr = {graniteBrownfieldModule_closeView, asarray, this};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1510310677);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 29 - TextUtils.lastIndexOf("", '0', 0), 24887 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -1799716229, false, "onExtraCallbackWithResult", new Class[]{GraniteBrownfieldModule_closeView.class, asArray.class, access13800.class});
                }
                Object objInvoke = ((Method) objOnExtraCallback2).invoke(obj2, objArr);
                return objInvoke == objOnWarmupCompleted ? objOnWarmupCompleted : objInvoke;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
    }

    private static final deserializeIp extraCallback(Function1 function1, Object obj) {
        deserializeIp deserializeip;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 19;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            deserializeip = (deserializeIp) function1.invoke(obj);
            int i3 = 67 / 0;
        } else {
            Intrinsics.checkNotNullParameter(obj, "");
            deserializeip = (deserializeIp) function1.invoke(obj);
        }
        int i4 = IAuthTabCallbackStubProxy + 105;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return deserializeip;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        Object obj;
        int length;
        char[] cArr2;
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = asBinder;
        long j = 0;
        if (cArr3 != null) {
            int i4 = $10 + 67;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i2 = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i2])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)) - 1), 77 - View.MeasureSpec.makeMeasureSpec(0, 0), KeyEvent.normalizeMetaState(0) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr2[i2] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i2++;
                    j = 0;
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
        Object[] objArr3 = {Integer.valueOf(IAuthTabCallback_Parcel)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), (ViewConfiguration.getEdgeSlop() >> 16) + 75, 16038 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        int i5 = 1052772399;
        if (access100) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 63, TextUtils.getTrimmedLength("") + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i5 = 1052772399;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!access000) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i6 = $11 + 85;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i8 = $10 + 27;
        $11 = i8 % 128;
        int i9 = i8 % 2;
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i10 = $10 + 99;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback >>> 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] >>> i] % iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), 63 - TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 12213, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                obj = null;
            } else {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                try {
                    Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), KeyEvent.normalizeMetaState(0) + 63, 12262 - AndroidCharacter.getMirror('0'), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    obj = null;
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
        }
        objArr[0] = new String(cArr6);
    }

    private static final JsonReaderErrorInfo onMessageChannelReady(Function1 function1, Object obj) {
        JsonReaderErrorInfo jsonReaderErrorInfo;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 89;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            jsonReaderErrorInfo = (JsonReaderErrorInfo) function1.invoke(obj);
            int i3 = 43 / 0;
        } else {
            Intrinsics.checkNotNullParameter(obj, "");
            jsonReaderErrorInfo = (JsonReaderErrorInfo) function1.invoke(obj);
        }
        int i4 = getInterfaceDescriptor + 41;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return jsonReaderErrorInfo;
    }

    private static final JsonReaderErrorInfo onWarmupCompleted(long j, Context context, GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, boolean z, Long l, String str, boolean z2, boolean z3, boolean z4, boolean z5, getLogUploadURLMap getloguploadurlmap, SignInResponse signInResponse) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 15;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(signInResponse, "");
        wasLastName waslastnameIAuthTabCallback = onNavigationEvent.IAuthTabCallback(j, context, graniteBrownfieldModule_closeView, signInResponse, z, false, l, str, z2, z3, z4, z5, getloguploadurlmap);
        int i4 = IAuthTabCallbackStubProxy + 43;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 86 / 0;
        }
        return waslastnameIAuthTabCallback;
    }

    static final class IAuthTabCallback_Parcel extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Pair<? extends String, ? extends Map<String, ? extends String>>>, Object> {
        final /* synthetic */ asArray $newPasswordFormat;
        final /* synthetic */ GraniteBrownfieldModule_closeView $password;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback_Parcel(GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, asArray asarray, access13800<? super IAuthTabCallback_Parcel> access13800Var) {
            super(2, access13800Var);
            this.$password = graniteBrownfieldModule_closeView;
            this.$newPasswordFormat = asarray;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new IAuthTabCallback_Parcel(this.$password, this.$newPasswordFormat, access13800Var);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Pair<String, ? extends Map<String, String>>> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objInvoke;
            Object objInvoke2;
            String str;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 29, 24886 - ((byte) KeyEvent.getModifierMetaStateMask()), -265239605, false, "onWarmupCompleted", (Class[]) null);
                }
                Object obj2 = ((Field) objOnExtraCallback).get(null);
                GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView = this.$password;
                asArray asarray = this.$newPasswordFormat;
                this.label = 1;
                try {
                    Object[] objArr = {graniteBrownfieldModule_closeView, asarray, this};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1510310677);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 29, 24887 - (ViewConfiguration.getTouchSlop() >> 8), -1799716229, false, "onExtraCallbackWithResult", new Class[]{GraniteBrownfieldModule_closeView.class, asArray.class, access13800.class});
                    }
                    objInvoke = ((Method) objOnExtraCallback2).invoke(obj2, objArr);
                    if (objInvoke == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) this.L$0;
                    ResultKt.onNavigationEvent(obj);
                    objInvoke2 = obj;
                    return getWrite.IAuthTabCallback(str, (Map) objInvoke2);
                }
                ResultKt.onNavigationEvent(obj);
                objInvoke = obj;
            }
            String str2 = (String) objInvoke;
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 30, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 24887, -265239605, false, "onWarmupCompleted", (Class[]) null);
            }
            Object obj3 = ((Field) objOnExtraCallback3).get(null);
            GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView2 = this.$password;
            this.L$0 = str2;
            this.label = 2;
            Object[] objArr2 = {graniteBrownfieldModule_closeView2, this};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(911847175);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 1), (ViewConfiguration.getPressedStateDuration() >> 16) + 30, TextUtils.indexOf("", "") + 24887, 119099799, false, "onNavigationEvent", new Class[]{GraniteBrownfieldModule_closeView.class, access13800.class});
            }
            objInvoke2 = ((Method) objOnExtraCallback4).invoke(obj3, objArr2);
            if (objInvoke2 == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
            str = str2;
            return getWrite.IAuthTabCallback(str, (Map) objInvoke2);
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 49;
        getInterfaceDescriptor = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        deserializeIp deserializeip = (deserializeIp) function1.invoke(obj);
        int i3 = IAuthTabCallbackStubProxy + 39;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            return deserializeip;
        }
        throw null;
    }

    private static final JsonReaderErrorInfo onActivityLayout(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 55;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (JsonReaderErrorInfo) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        JsonReaderErrorInfo jsonReaderErrorInfo = (JsonReaderErrorInfo) function1.invoke(obj);
        int i3 = 70 / 0;
        return jsonReaderErrorInfo;
    }

    public final wasLastName onWarmupCompleted(final long j, @NotNull final Context context, @NotNull final GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, final boolean z, @Nullable final Long l, @Nullable final String str, final boolean z2, final boolean z3, @NotNull final getLogUploadURLMap getloguploadurlmap, final boolean z4, final boolean z5) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(graniteBrownfieldModule_closeView, "");
        Intrinsics.checkNotNullParameter(getloguploadurlmap, "");
        final asArray interfaceDescriptor = setTestMode.onExtraCallback.getInterfaceDescriptor();
        writeRaw writerawIAuthTabCallback = RxSingleKt.IAuthTabCallback((CoroutineContext) null, new IAuthTabCallback_Parcel(graniteBrownfieldModule_closeView, interfaceDescriptor, null), 1, (Object) null);
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.guest.GuestManager$$ExternalSyntheticLambda35
            public final Object invoke(Object obj) {
                return tiling.onWarmupCompleted(z4, j, interfaceDescriptor, (Pair) obj);
            }
        };
        writeRaw writerawOnExtraCallbackWithResult = writerawIAuthTabCallback.onExtraCallbackWithResult(new deserializeIntNullableCollection() { // from class: viva.republica.toss.guest.GuestManager$$ExternalSyntheticLambda36
            public final Object apply(Object obj) {
                return tiling.onExtraCallbackWithResult(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.guest.GuestManager$$ExternalSyntheticLambda37
            public final Object invoke(Object obj) {
                return tiling.onNavigationEvent(j, context, graniteBrownfieldModule_closeView, z, l, str, z2, z3, z5, getloguploadurlmap, (SignInResponse) obj);
            }
        };
        wasLastName waslastnameOnNavigationEvent = writerawOnExtraCallbackWithResult.onNavigationEvent(new deserializeIntNullableCollection() { // from class: viva.republica.toss.guest.GuestManager$$ExternalSyntheticLambda38
            public final Object apply(Object obj) {
                return tiling.onTransact(function12, obj);
            }
        }).onNavigationEvent(NetConverter3.onExtraCallback());
        Intrinsics.checkNotNullExpressionValue(waslastnameOnNavigationEvent, "");
        int i2 = getInterfaceDescriptor + 103;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        return waslastnameOnNavigationEvent;
    }

    private static final JsonReaderErrorInfo IAuthTabCallback(long j, Context context, GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, boolean z, Long l, String str, boolean z2, boolean z3, boolean z4, getLogUploadURLMap getloguploadurlmap, SignInResponse signInResponse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 77;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(signInResponse, "");
        Object[] objArr = {onNavigationEvent, Long.valueOf(j), context, graniteBrownfieldModule_closeView, signInResponse, Boolean.valueOf(z), false, l, str, Boolean.valueOf(z2), Boolean.valueOf(z3), false, Boolean.valueOf(z4), getloguploadurlmap, 1024, null};
        wasLastName waslastname = (wasLastName) onWarmupCompleted(-91047791, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), 91047794, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), objArr, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted());
        int i4 = getInterfaceDescriptor + 59;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return waslastname;
        }
        throw null;
    }

    public static /* synthetic */ wasLastName IAuthTabCallback(tiling tilingVar, long j, Context context, GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, boolean z, Long l, String str, boolean z2, boolean z3, getLogUploadURLMap getloguploadurlmap, boolean z4, Long l2, boolean z5, int i, Object obj) {
        Long l3;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy;
        int i4 = i3 + 23;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1024) != 0) {
            int i6 = i3 + 35;
            getInterfaceDescriptor = i6 % 128;
            int i7 = i6 % 2;
            l3 = null;
        } else {
            l3 = l2;
        }
        return tilingVar.onNavigationEvent(j, context, graniteBrownfieldModule_closeView, z, l, str, z2, z3, getloguploadurlmap, z4, l3, z5);
    }

    static final class access100 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super String>, Object> {
        final /* synthetic */ asArray $newPasswordFormat;
        final /* synthetic */ GraniteBrownfieldModule_closeView $password;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        access100(GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, asArray asarray, access13800<? super access100> access13800Var) {
            super(2, access13800Var);
            this.$password = graniteBrownfieldModule_closeView;
            this.$newPasswordFormat = asarray;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new access100(this.$password, this.$newPasswordFormat, access13800Var);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super String> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                return obj;
            }
            ResultKt.onNavigationEvent(obj);
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 30, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 24886, -265239605, false, "onWarmupCompleted", (Class[]) null);
            }
            Object obj2 = ((Field) objOnExtraCallback).get(null);
            GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView = this.$password;
            asArray asarray = this.$newPasswordFormat;
            this.label = 1;
            try {
                Object[] objArr = {graniteBrownfieldModule_closeView, asarray, this};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1510310677);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", ""), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 30, (ViewConfiguration.getFadingEdgeLength() >> 16) + 24887, -1799716229, false, "onExtraCallbackWithResult", new Class[]{GraniteBrownfieldModule_closeView.class, asArray.class, access13800.class});
                }
                Object objInvoke = ((Method) objOnExtraCallback2).invoke(obj2, objArr);
                return objInvoke == objOnWarmupCompleted ? objOnWarmupCompleted : objInvoke;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 3;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (deserializeIp) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        throw null;
    }

    private static final JsonReaderErrorInfo onActivityResized(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 39;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        JsonReaderErrorInfo jsonReaderErrorInfo = (JsonReaderErrorInfo) function1.invoke(obj);
        int i3 = getInterfaceDescriptor + 123;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 68 / 0;
        }
        return jsonReaderErrorInfo;
    }

    public final wasLastName onNavigationEvent(final long j, @NotNull final Context context, @NotNull final GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, final boolean z, @Nullable final Long l, @Nullable final String str, final boolean z2, final boolean z3, @NotNull final getLogUploadURLMap getloguploadurlmap, final boolean z4, @Nullable final Long l2, final boolean z5) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(graniteBrownfieldModule_closeView, "");
        Intrinsics.checkNotNullParameter(getloguploadurlmap, "");
        final asArray interfaceDescriptor = setTestMode.onExtraCallback.getInterfaceDescriptor();
        final boolean zOnExtraCallback = ICustomTabsCallback().onExtraCallback();
        writeRaw writerawIAuthTabCallback = RxSingleKt.IAuthTabCallback((CoroutineContext) null, new access100(graniteBrownfieldModule_closeView, interfaceDescriptor, null), 1, (Object) null);
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.guest.GuestManager$$ExternalSyntheticLambda6
            public final Object invoke(Object obj) {
                return tiling.IAuthTabCallback(z4, j, interfaceDescriptor, l2, zOnExtraCallback, (String) obj);
            }
        };
        writeRaw writerawOnExtraCallbackWithResult = writerawIAuthTabCallback.onExtraCallbackWithResult(new deserializeIntNullableCollection() { // from class: viva.republica.toss.guest.GuestManager$$ExternalSyntheticLambda7
            public final Object apply(Object obj) {
                return tiling.onExtraCallback(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.guest.GuestManager$$ExternalSyntheticLambda8
            public final Object invoke(Object obj) {
                return tiling.onExtraCallbackWithResult(j, context, graniteBrownfieldModule_closeView, z, l, str, z2, z3, z4, z5, getloguploadurlmap, (SignInResponse) obj);
            }
        };
        wasLastName waslastnameOnNavigationEvent = writerawOnExtraCallbackWithResult.onNavigationEvent(new deserializeIntNullableCollection() { // from class: viva.republica.toss.guest.GuestManager$$ExternalSyntheticLambda9
            public final Object apply(Object obj) {
                Object[] objArr = {function12, obj};
                return (JsonReaderErrorInfo) tiling.onWarmupCompleted(1953490194, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), -1953490184, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), objArr, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted());
            }
        }).IAuthTabCallback(new deserializeDecimalCollection() { // from class: viva.republica.toss.guest.GuestManager$$ExternalSyntheticLambda10
            public final void run() throws Throwable {
                Object[] objArr = {Boolean.valueOf(zOnExtraCallback), Boolean.valueOf(z4)};
                tiling.onWarmupCompleted(62056884, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), -62056876, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), objArr, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted());
            }
        }).onNavigationEvent(NetConverter3.onExtraCallback());
        Intrinsics.checkNotNullExpressionValue(waslastnameOnNavigationEvent, "");
        int i2 = IAuthTabCallbackStubProxy + 35;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        return waslastnameOnNavigationEvent;
    }

    private static /* synthetic */ Object access000(Object[] objArr) throws Throwable {
        tiling tilingVar;
        boolean z;
        long jLongValue = ((Number) objArr[0]).longValue();
        Context context = (Context) objArr[1];
        GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView = (GraniteBrownfieldModule_closeView) objArr[2];
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        Long l = (Long) objArr[4];
        String str = (String) objArr[5];
        boolean zBooleanValue2 = ((Boolean) objArr[6]).booleanValue();
        boolean zBooleanValue3 = ((Boolean) objArr[7]).booleanValue();
        boolean zBooleanValue4 = ((Boolean) objArr[8]).booleanValue();
        boolean zBooleanValue5 = ((Boolean) objArr[9]).booleanValue();
        getLogUploadURLMap getloguploadurlmap = (getLogUploadURLMap) objArr[10];
        SignInResponse signInResponse = (SignInResponse) objArr[11];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 49;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(signInResponse, "");
            tilingVar = onNavigationEvent;
            z = false;
        } else {
            Intrinsics.checkNotNullParameter(signInResponse, "");
            tilingVar = onNavigationEvent;
            z = true;
        }
        wasLastName waslastnameIAuthTabCallback = tilingVar.IAuthTabCallback(jLongValue, context, graniteBrownfieldModule_closeView, signInResponse, zBooleanValue, z, l, str, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, getloguploadurlmap);
        int i3 = getInterfaceDescriptor + 55;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 83 / 0;
        }
        return waslastnameIAuthTabCallback;
    }

    private static final void onExtraCallback(boolean z, boolean z2) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 17;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent.IAuthTabCallback(z, z2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        onNavigationEvent.IAuthTabCallback(z, z2);
        int i3 = getInterfaceDescriptor + 35;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Pair<? extends String, ? extends Map<String, ? extends String>>>, Object> {
        final /* synthetic */ GraniteBrownfieldModule_closeView $password;
        final /* synthetic */ asArray $passwordFormat;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, asArray asarray, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$password = graniteBrownfieldModule_closeView;
            this.$passwordFormat = asarray;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new IAuthTabCallback(this.$password, this.$passwordFormat, access13800Var);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Pair<String, ? extends Map<String, String>>> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objInvoke;
            Object objInvoke2;
            String str;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), Process.getGidForName("") + 31, View.resolveSize(0, 0) + 24887, -265239605, false, "onWarmupCompleted", (Class[]) null);
                }
                Object obj2 = ((Field) objOnExtraCallback).get(null);
                GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView = this.$password;
                asArray asarray = this.$passwordFormat;
                this.label = 1;
                try {
                    Object[] objArr = {graniteBrownfieldModule_closeView, asarray, this};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1510310677);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getMaxKeyCode() >> 16), 30 - Color.argb(0, 0, 0, 0), 24887 - TextUtils.indexOf("", "", 0), -1799716229, false, "onExtraCallbackWithResult", new Class[]{GraniteBrownfieldModule_closeView.class, asArray.class, access13800.class});
                    }
                    objInvoke = ((Method) objOnExtraCallback2).invoke(obj2, objArr);
                    if (objInvoke == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) this.L$0;
                    ResultKt.onNavigationEvent(obj);
                    objInvoke2 = obj;
                    return getWrite.IAuthTabCallback(str, (Map) objInvoke2);
                }
                ResultKt.onNavigationEvent(obj);
                objInvoke = obj;
            }
            String str2 = (String) objInvoke;
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", ""), 29 - TextUtils.lastIndexOf("", '0'), Color.green(0) + 24887, -265239605, false, "onWarmupCompleted", (Class[]) null);
            }
            Object obj3 = ((Field) objOnExtraCallback3).get(null);
            GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView2 = this.$password;
            this.L$0 = str2;
            this.label = 2;
            Object[] objArr2 = {graniteBrownfieldModule_closeView2, this};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(911847175);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 30 - ExpandableListView.getPackedPositionGroup(0L), 24888 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 119099799, false, "onNavigationEvent", new Class[]{GraniteBrownfieldModule_closeView.class, access13800.class});
            }
            objInvoke2 = ((Method) objOnExtraCallback4).invoke(obj3, objArr2);
            if (objInvoke2 == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
            str = str2;
            return getWrite.IAuthTabCallback(str, (Map) objInvoke2);
        }
    }

    private static final deserializeIp IAuthTabCallbackStubProxy(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 99;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (deserializeIp) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        deserializeIp deserializeip = (deserializeIp) function1.invoke(obj);
        int i3 = 43 / 0;
        return deserializeip;
    }

    private static final JsonReaderErrorInfo readTypedObject(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 85;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        JsonReaderErrorInfo jsonReaderErrorInfo = (JsonReaderErrorInfo) function1.invoke(obj);
        int i3 = IAuthTabCallbackStubProxy + 71;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            return jsonReaderErrorInfo;
        }
        throw null;
    }

    public final wasLastName onExtraCallbackWithResult(final long j, @NotNull final Context context, @NotNull final GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, final boolean z, @Nullable final Long l, @Nullable final String str, final boolean z2, final boolean z3, @NotNull final getLogUploadURLMap getloguploadurlmap, final boolean z4, @Nullable final writeRaw<Boolean> writeraw) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(graniteBrownfieldModule_closeView, "");
        Intrinsics.checkNotNullParameter(getloguploadurlmap, "");
        final asArray asarray = asArray.PW_6_DIGIT;
        writeRaw writerawIAuthTabCallback = RxSingleKt.IAuthTabCallback((CoroutineContext) null, new IAuthTabCallback(graniteBrownfieldModule_closeView, asarray, null), 1, (Object) null);
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.guest.GuestManager$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return tiling.onExtraCallback(j, asarray, (Pair) obj);
            }
        };
        writeRaw writerawOnExtraCallbackWithResult = writerawIAuthTabCallback.onExtraCallbackWithResult(new deserializeIntNullableCollection() { // from class: viva.republica.toss.guest.GuestManager$$ExternalSyntheticLambda1
            public final Object apply(Object obj) {
                return tiling.onNavigationEvent(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.guest.GuestManager$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return tiling.onExtraCallback(writeraw, z, j, context, graniteBrownfieldModule_closeView, l, str, z2, z3, z4, getloguploadurlmap, (SignInResponse) obj);
            }
        };
        wasLastName waslastnameOnNavigationEvent = writerawOnExtraCallbackWithResult.onNavigationEvent(new deserializeIntNullableCollection() { // from class: viva.republica.toss.guest.GuestManager$$ExternalSyntheticLambda3
            public final Object apply(Object obj) {
                Object[] objArr = {function12, obj};
                return (JsonReaderErrorInfo) tiling.onWarmupCompleted(1603018691, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), -1603018674, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), objArr, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted());
            }
        }).IAuthTabCallback(new deserializeDecimalCollection() { // from class: viva.republica.toss.guest.GuestManager$$ExternalSyntheticLambda4
            public final void run() {
                tiling.IAuthTabCallbackStub();
            }
        }).onNavigationEvent(NetConverter3.onExtraCallback());
        Intrinsics.checkNotNullExpressionValue(waslastnameOnNavigationEvent, "");
        int i2 = IAuthTabCallbackStubProxy + 71;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        return waslastnameOnNavigationEvent;
    }

    private static final JsonReaderErrorInfo access000(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 53;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        JsonReaderErrorInfo jsonReaderErrorInfo = (JsonReaderErrorInfo) function1.invoke(obj);
        int i4 = IAuthTabCallbackStubProxy + 7;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return jsonReaderErrorInfo;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final o.JsonReaderErrorInfo onNavigationEvent(o.writeRaw r15, boolean r16, final long r17, final android.content.Context r19, final o.GraniteBrownfieldModule_closeView r20, final java.lang.Long r21, final java.lang.String r22, final boolean r23, final boolean r24, final boolean r25, final o.getLogUploadURLMap r26, final viva.republica.toss.network.model.verify.guest.SignInResponse r27) {
        /*
            r1 = r27
            r0 = 2
            int r2 = r0 % r0
            int r2 = o.tiling.IAuthTabCallbackStubProxy
            int r2 = r2 + 81
            int r3 = r2 % 128
            o.tiling.getInterfaceDescriptor = r3
            int r2 = r2 % r0
            java.lang.String r3 = ""
            if (r2 == 0) goto L1c
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            r2 = 62
            int r2 = r2 / 0
            if (r15 != 0) goto L34
            goto L21
        L1c:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            if (r15 != 0) goto L34
        L21:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r16)
            o.writeRaw r2 = o.writeRaw.onExtraCallback(r2)
            int r3 = o.tiling.IAuthTabCallbackStubProxy
            int r3 = r3 + 25
            int r4 = r3 % 128
            o.tiling.getInterfaceDescriptor = r4
            int r3 = r3 % r0
            r12 = r2
            goto L35
        L34:
            r12 = r15
        L35:
            viva.republica.toss.guest.GuestManager$$ExternalSyntheticLambda20 r13 = new viva.republica.toss.guest.GuestManager$$ExternalSyntheticLambda20
            viva.republica.toss.guest.GuestManager$$ExternalSyntheticLambda19 r14 = new viva.republica.toss.guest.GuestManager$$ExternalSyntheticLambda19
            r0 = r14
            r1 = r27
            r2 = r17
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r25
            r11 = r26
            r0.<init>()
            r13.<init>()
            o.wasLastName r0 = r12.onNavigationEvent(r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.tiling.onNavigationEvent(o.writeRaw, boolean, long, android.content.Context, o.GraniteBrownfieldModule_closeView, java.lang.Long, java.lang.String, boolean, boolean, boolean, o.getLogUploadURLMap, viva.republica.toss.network.model.verify.guest.SignInResponse):o.JsonReaderErrorInfo");
    }

    private static final JsonReaderErrorInfo IAuthTabCallback(SignInResponse signInResponse, long j, Context context, GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, Long l, String str, boolean z, boolean z2, boolean z3, getLogUploadURLMap getloguploadurlmap, Boolean bool) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 95;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(bool, "");
        tiling tilingVar = onNavigationEvent;
        Intrinsics.checkNotNull(signInResponse);
        wasLastName waslastnameIAuthTabCallback = tilingVar.IAuthTabCallback(j, context, graniteBrownfieldModule_closeView, signInResponse, bool.booleanValue(), true, l, str, z, z2, false, z3, getloguploadurlmap);
        int i4 = getInterfaceDescriptor + 27;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return waslastnameIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 7;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent.IAuthTabCallback(true, true);
        } else {
            onNavigationEvent.IAuthTabCallback(true, false);
        }
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Pair<? extends String, ? extends Map<String, ? extends String>>>, Object> {
        final /* synthetic */ GraniteBrownfieldModule_closeView $password;
        final /* synthetic */ asArray $passwordFormat;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, asArray asarray, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$password = graniteBrownfieldModule_closeView;
            this.$passwordFormat = asarray;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onNavigationEvent(this.$password, this.$passwordFormat, access13800Var);
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Pair<String, ? extends Map<String, String>>> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objInvoke;
            Object objInvoke2;
            String str;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ImageFormat.getBitsPerPixel(0)), TextUtils.lastIndexOf("", '0', 0) + 31, 24887 - View.resolveSizeAndState(0, 0, 0), -265239605, false, "onWarmupCompleted", (Class[]) null);
                }
                Object obj2 = ((Field) objOnExtraCallback).get(null);
                GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView = this.$password;
                asArray asarray = this.$passwordFormat;
                this.label = 1;
                try {
                    Object[] objArr = {graniteBrownfieldModule_closeView, asarray, this};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1510310677);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), TextUtils.getOffsetAfter("", 0) + 30, 24887 - TextUtils.indexOf("", ""), -1799716229, false, "onExtraCallbackWithResult", new Class[]{GraniteBrownfieldModule_closeView.class, asArray.class, access13800.class});
                    }
                    objInvoke = ((Method) objOnExtraCallback2).invoke(obj2, objArr);
                    if (objInvoke == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) this.L$0;
                    ResultKt.onNavigationEvent(obj);
                    objInvoke2 = obj;
                    return getWrite.IAuthTabCallback(str, (Map) objInvoke2);
                }
                ResultKt.onNavigationEvent(obj);
                objInvoke = obj;
            }
            String str2 = (String) objInvoke;
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), View.MeasureSpec.getMode(0) + 30, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 24887, -265239605, false, "onWarmupCompleted", (Class[]) null);
            }
            Object obj3 = ((Field) objOnExtraCallback3).get(null);
            GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView2 = this.$password;
            this.L$0 = str2;
            this.label = 2;
            Object[] objArr2 = {graniteBrownfieldModule_closeView2, this};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(911847175);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), Color.green(0) + 30, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 24887, 119099799, false, "onNavigationEvent", new Class[]{GraniteBrownfieldModule_closeView.class, access13800.class});
            }
            objInvoke2 = ((Method) objOnExtraCallback4).invoke(obj3, objArr2);
            if (objInvoke2 == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
            str = str2;
            return getWrite.IAuthTabCallback(str, (Map) objInvoke2);
        }
    }

    private static final deserializeIp extraCallbackWithResult(Function1 function1, Object obj) {
        deserializeIp deserializeip;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 105;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            deserializeip = (deserializeIp) function1.invoke(obj);
            int i3 = 20 / 0;
        } else {
            Intrinsics.checkNotNullParameter(obj, "");
            deserializeip = (deserializeIp) function1.invoke(obj);
        }
        int i4 = getInterfaceDescriptor + 41;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return deserializeip;
    }

    private static final JsonReaderErrorInfo writeTypedObject(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 37;
        getInterfaceDescriptor = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        JsonReaderErrorInfo jsonReaderErrorInfo = (JsonReaderErrorInfo) function1.invoke(obj);
        int i3 = IAuthTabCallbackStubProxy + 9;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            return jsonReaderErrorInfo;
        }
        throw null;
    }

    public final wasLastName onExtraCallback(final long j, @NotNull final Context context, @NotNull final GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, final boolean z, @Nullable final Long l, @Nullable final String str, final boolean z2, final boolean z3, @NotNull final getLogUploadURLMap getloguploadurlmap, final boolean z4) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(graniteBrownfieldModule_closeView, "");
        Intrinsics.checkNotNullParameter(getloguploadurlmap, "");
        final asArray asarray = asArray.PW_6_DIGIT;
        writeRaw writerawIAuthTabCallback = RxSingleKt.IAuthTabCallback((CoroutineContext) null, new onNavigationEvent(graniteBrownfieldModule_closeView, asarray, null), 1, (Object) null);
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.guest.GuestManager$$ExternalSyntheticLambda30
            public final Object invoke(Object obj) {
                return tiling.onExtraCallbackWithResult(j, asarray, (Pair) obj);
            }
        };
        writeRaw writerawOnExtraCallbackWithResult = writerawIAuthTabCallback.onExtraCallbackWithResult(new deserializeIntNullableCollection() { // from class: viva.republica.toss.guest.GuestManager$$ExternalSyntheticLambda31
            public final Object apply(Object obj) {
                return tiling.IAuthTabCallbackDefault(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.guest.GuestManager$$ExternalSyntheticLambda32
            public final Object invoke(Object obj) {
                return tiling.onWarmupCompleted(j, context, graniteBrownfieldModule_closeView, z, l, str, z2, z3, z4, getloguploadurlmap, (SignInResponse) obj);
            }
        };
        wasLastName waslastnameOnNavigationEvent = writerawOnExtraCallbackWithResult.onNavigationEvent(new deserializeIntNullableCollection() { // from class: viva.republica.toss.guest.GuestManager$$ExternalSyntheticLambda33
            public final Object apply(Object obj) {
                return tiling.IAuthTabCallback_Parcel(function12, obj);
            }
        }).IAuthTabCallback(new deserializeDecimalCollection() { // from class: viva.republica.toss.guest.GuestManager$$ExternalSyntheticLambda34
            public final void run() {
                tiling.onWarmupCompleted();
            }
        }).onNavigationEvent(NetConverter3.onExtraCallback());
        Intrinsics.checkNotNullExpressionValue(waslastnameOnNavigationEvent, "");
        int i2 = getInterfaceDescriptor + 117;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        return waslastnameOnNavigationEvent;
    }

    private static final JsonReaderErrorInfo onExtraCallback(long j, Context context, GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, boolean z, Long l, String str, boolean z2, boolean z3, boolean z4, getLogUploadURLMap getloguploadurlmap, SignInResponse signInResponse) {
        tiling tilingVar;
        boolean z5;
        boolean z6;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 67;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(signInResponse, "");
            tilingVar = onNavigationEvent;
            z5 = true;
            z6 = true;
        } else {
            Intrinsics.checkNotNullParameter(signInResponse, "");
            tilingVar = onNavigationEvent;
            z5 = true;
            z6 = false;
        }
        return tilingVar.IAuthTabCallback(j, context, graniteBrownfieldModule_closeView, signInResponse, z, z5, l, str, z2, z3, z6, z4, getloguploadurlmap);
    }

    private static final void access000() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 57;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent.IAuthTabCallback(false, true);
        } else {
            onNavigationEvent.IAuthTabCallback(true, false);
        }
        int i3 = getInterfaceDescriptor + 119;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
    }

    private final void IAuthTabCallback(boolean z, boolean z2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 123;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        if (z) {
            int i5 = i2 + 59;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "sign_up_global", clearFaultAdjacentMetadata.onExtraCallback(new r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc[]{r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc.APPSFLYER, r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc.FIREBASE, r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc.FACEBOOK}), false, (String) null, (Map) null, (Function1) null, 60, (Object) null);
            int i7 = getInterfaceDescriptor + 31;
            IAuthTabCallbackStubProxy = i7 % 128;
            int i8 = i7 % 2;
        } else {
            onExtraCallback(z2);
        }
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "fb_mobile_complete_registration", r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc.FACEBOOK, false, (String) null, (Map) null, (Function1) null, 60, (Object) null);
    }

    private final void onExtraCallback(boolean z) {
        int iIntValue;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 105;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("core_user_types", ((Set) PlayerErrorCode.IAuthTabCallback(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 919341768, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -919341764, new Object[0], LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent())).toString());
        PlayerErrorCode playerErrorCode = PlayerErrorCode.onWarmupCompleted;
        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "GuestManager", "reportKoreaSignUpEvent called", access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback("core_is_visitor", Boolean.valueOf(addExtra.extraCallback(playerErrorCode))), getWrite.IAuthTabCallback("core_is_foreigner", Boolean.valueOf(addExtra.onExtraCallback(playerErrorCode)))}), (String) null, false, (String) null, 56, (Object) null);
        onMessageChannelReady();
        if (addExtra.onExtraCallback(playerErrorCode) || createPaints.IAuthTabCallback.extraCallbackWithResult()) {
            ConvertFloatArrayToByteArray.onWarmupCompleted(convertFloatArrayToByteArray, "sign_up_foreigner", r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc.FIREBASE, false, (String) null, (Map) null, (Function1) null, 60, (Object) null);
        } else {
            int i4 = IAuthTabCallbackStubProxy + 79;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            if (addExtra.extraCallback(playerErrorCode) || !(!z)) {
                onRelationshipValidationResult();
                int i6 = IAuthTabCallbackStubProxy + 89;
                getInterfaceDescriptor = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        Date dateOnUnminimized = playerErrorCode.onUnminimized();
        if (dateOnUnminimized != null) {
            int i8 = getInterfaceDescriptor + 61;
            IAuthTabCallbackStubProxy = i8 % 128;
            int i9 = i8 % 2;
            iIntValue = zzan.IAuthTabCallback(dateOnUnminimized);
            int i10 = getInterfaceDescriptor + 91;
            IAuthTabCallbackStubProxy = i10 % 128;
            int i11 = i10 % 2;
        } else {
            Integer numOnExtraCallbackWithResult = createPaints.IAuthTabCallback.onExtraCallbackWithResult();
            if (numOnExtraCallbackWithResult == null) {
                return;
            }
            int i12 = getInterfaceDescriptor + 45;
            IAuthTabCallbackStubProxy = i12 % 128;
            int i13 = i12 % 2;
            iIntValue = numOnExtraCallbackWithResult.intValue();
        }
        if (iIntValue >= 17) {
            if (iIntValue >= 40) {
                ConvertFloatArrayToByteArray.onWarmupCompleted(convertFloatArrayToByteArray, "init_complete_over_forty", r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc.APPSFLYER, false, (String) null, (Map) null, (Function1) null, 60, (Object) null);
            }
        } else {
            int i14 = getInterfaceDescriptor + 23;
            IAuthTabCallbackStubProxy = i14 % 128;
            int i15 = i14 % 2;
            ConvertFloatArrayToByteArray.onWarmupCompleted(convertFloatArrayToByteArray, "init_complete_under_seventeen", r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc.APPSFLYER, false, (String) null, (Map) null, (Function1) null, 60, (Object) null);
        }
    }

    private final void onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 95;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        ConvertFloatArrayToByteArray.onWarmupCompleted(convertFloatArrayToByteArray, "init_complete", r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc.APPSFLYER, false, (String) null, (Map) null, (Function1) null, 60, (Object) null);
        ConvertFloatArrayToByteArray.onWarmupCompleted(convertFloatArrayToByteArray, "sign_up", r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc.FIREBASE, false, (String) null, (Map) null, (Function1) null, 60, (Object) null);
        int i4 = getInterfaceDescriptor + 51;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private final void onRelationshipValidationResult() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 51;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "sign_up_visitor", clearFaultAdjacentMetadata.onExtraCallback(new r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc[]{r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc.FIREBASE, r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc.FACEBOOK}), false, (String) null, (Map) null, (Function1) null, 60, (Object) null);
        ConvertFloatArrayToByteArray.onWarmupCompleted(convertFloatArrayToByteArray, "init_complete_visitor", r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc.APPSFLYER, false, (String) null, (Map) null, (Function1) null, 60, (Object) null);
        int i4 = IAuthTabCallbackStubProxy + 89;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        getLogUploadURLMap getloguploadurlmap;
        tiling tilingVar = (tiling) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        Context context = (Context) objArr[2];
        GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView = (GraniteBrownfieldModule_closeView) objArr[3];
        SignInResponse signInResponse = (SignInResponse) objArr[4];
        boolean zBooleanValue = ((Boolean) objArr[5]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[6]).booleanValue();
        Long l = (Long) objArr[7];
        String str = (String) objArr[8];
        boolean zBooleanValue3 = ((Boolean) objArr[9]).booleanValue();
        boolean zBooleanValue4 = ((Boolean) objArr[10]).booleanValue();
        boolean zBooleanValue5 = ((Boolean) objArr[11]).booleanValue();
        boolean zBooleanValue6 = ((Boolean) objArr[12]).booleanValue();
        getLogUploadURLMap getloguploadurlmap2 = (getLogUploadURLMap) objArr[13];
        int iIntValue = ((Number) objArr[14]).intValue();
        Object obj = objArr[15];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 1;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        if (i2 % 2 != 0 ? (iIntValue & 64) != 0 : (iIntValue & 22) != 0) {
            int i4 = i3 + 61;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 % 5;
            }
            l = null;
        }
        if ((iIntValue & 128) != 0) {
            int i6 = i3 + 5;
            getInterfaceDescriptor = i6 % 128;
            int i7 = i6 % 2;
            str = null;
        }
        if ((iIntValue & 256) != 0) {
            int i8 = getInterfaceDescriptor + 49;
            IAuthTabCallbackStubProxy = i8 % 128;
            int i9 = i8 % 2;
            zBooleanValue3 = false;
        }
        if ((iIntValue & 512) != 0) {
            zBooleanValue4 = false;
        }
        if ((iIntValue & 1024) != 0) {
            zBooleanValue5 = false;
        }
        if ((iIntValue & 2048) != 0) {
            zBooleanValue6 = false;
        }
        if ((iIntValue & 4096) != 0) {
            int i10 = getInterfaceDescriptor + 49;
            IAuthTabCallbackStubProxy = i10 % 128;
            if (i10 % 2 == 0) {
                getLogUploadURLMap getloguploadurlmap3 = getLogUploadURLMap.None;
                throw null;
            }
            getloguploadurlmap = getLogUploadURLMap.None;
        } else {
            getloguploadurlmap = getloguploadurlmap2;
        }
        return tilingVar.IAuthTabCallback(jLongValue, context, graniteBrownfieldModule_closeView, signInResponse, zBooleanValue, zBooleanValue2, l, str, zBooleanValue3, zBooleanValue4, zBooleanValue5, zBooleanValue6, getloguploadurlmap);
    }

    private final wasLastName IAuthTabCallback(long j, Context context, GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, SignInResponse signInResponse, boolean z, boolean z2, Long l, String str, boolean z3, boolean z4, boolean z5, boolean z6, getLogUploadURLMap getloguploadurlmap) throws Throwable {
        int i = 2 % 2;
        wasLastName waslastnameOnExtraCallbackWithResult = onExtraCallbackWithResult(j, context, signInResponse, z2, l, str, z3, z4, z5, z6, getloguploadurlmap, new IAuthTabCallbackStub(context, graniteBrownfieldModule_closeView, signInResponse, z, null));
        int i2 = IAuthTabCallbackStubProxy + 89;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        return waslastnameOnExtraCallbackWithResult;
    }

    static final class IAuthTabCallbackStub extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ boolean $needFingerprintRegister;
        final /* synthetic */ GraniteBrownfieldModule_closeView $password;
        final /* synthetic */ SignInResponse $signInResponse;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackStub(Context context, GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, SignInResponse signInResponse, boolean z, access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(1, access13800Var);
            this.$context = context;
            this.$password = graniteBrownfieldModule_closeView;
            this.$signInResponse = signInResponse;
            this.$needFingerprintRegister = z;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            return new IAuthTabCallbackStub(this.$context, this.$password, this.$signInResponse, this.$needFingerprintRegister, access13800Var);
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(access13800<? super Unit> access13800Var) {
            return create(access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), 30 - Color.blue(0), View.combineMeasuredStates(0, 0) + 24887, -265239605, false, "onWarmupCompleted", (Class[]) null);
                }
                Object obj2 = ((Field) objOnExtraCallback).get(null);
                Context context = this.$context;
                GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView = this.$password;
                String strIAuthTabCallbackStub = this.$signInResponse.IAuthTabCallbackStub();
                boolean z = this.$needFingerprintRegister;
                asArray asarrayIAuthTabCallback = accesssetIndexp.IAuthTabCallback(this.$signInResponse.onExtraCallbackWithResult());
                this.label = 1;
                try {
                    Object[] objArr = {context, graniteBrownfieldModule_closeView, strIAuthTabCallbackStub, Boolean.valueOf(z), asarrayIAuthTabCallback, true, this};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1054471692);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getPressedStateDuration() >> 16), (KeyEvent.getMaxKeyCode() >> 16) + 30, Color.red(0) + 24887, 261687452, false, "onExtraCallback", new Class[]{Context.class, GraniteBrownfieldModule_closeView.class, String.class, Boolean.TYPE, asArray.class, Boolean.TYPE, access13800.class});
                    }
                    if (((Method) objOnExtraCallback2).invoke(obj2, objArr) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final wasLastName IAuthTabCallback(long j, @NotNull Context context, @NotNull SignInResponse signInResponse, @NotNull String str, @NotNull String str2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(signInResponse, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        wasLastName waslastnameOnNavigationEvent = onNavigationEvent(this, j, context, signInResponse, false, null, "DEV_SUPPORT_SUPER_LOGIN", false, false, false, false, null, new asInterface(context, str, str2, signInResponse, null), 2000, null);
        int i2 = IAuthTabCallbackStubProxy + 69;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        return waslastnameOnNavigationEvent;
    }

    static final class asInterface extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        final /* synthetic */ String $authPasswordHash;
        final /* synthetic */ Context $context;
        final /* synthetic */ String $loginPasswordHash;
        final /* synthetic */ SignInResponse $signInResponse;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asInterface(Context context, String str, String str2, SignInResponse signInResponse, access13800<? super asInterface> access13800Var) {
            super(1, access13800Var);
            this.$context = context;
            this.$loginPasswordHash = str;
            this.$authPasswordHash = str2;
            this.$signInResponse = signInResponse;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            return new asInterface(this.$context, this.$loginPasswordHash, this.$authPasswordHash, this.$signInResponse, access13800Var);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(access13800<? super Unit> access13800Var) {
            return create(access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(0, 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 30, 24888 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -265239605, false, "onWarmupCompleted", (Class[]) null);
                }
                Object obj2 = ((Field) objOnExtraCallback).get(null);
                Context context = this.$context;
                String str = this.$loginPasswordHash;
                String str2 = this.$authPasswordHash;
                String strIAuthTabCallbackStub = this.$signInResponse.IAuthTabCallbackStub();
                asArray asarrayIAuthTabCallback = accesssetIndexp.IAuthTabCallback(this.$signInResponse.onExtraCallbackWithResult());
                this.label = 1;
                try {
                    Object[] objArr = {context, str, str2, strIAuthTabCallbackStub, false, asarrayIAuthTabCallback, true, this};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(666171985);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), Color.rgb(0, 0, 0) + 16777246, Color.red(0) + 24887, 385090753, false, "onExtraCallback", new Class[]{Context.class, String.class, String.class, String.class, Boolean.TYPE, asArray.class, Boolean.TYPE, access13800.class});
                    }
                    if (((Method) objOnExtraCallback2).invoke(obj2, objArr) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    static /* synthetic */ wasLastName onNavigationEvent(tiling tilingVar, long j, Context context, SignInResponse signInResponse, boolean z, Long l, String str, boolean z2, boolean z3, boolean z4, boolean z5, getLogUploadURLMap getloguploadurlmap, Function1 function1, int i, Object obj) {
        Long l2;
        boolean z6;
        getLogUploadURLMap getloguploadurlmap2;
        int i2 = 2 % 2;
        Object obj2 = null;
        if ((i & 16) != 0) {
            int i3 = getInterfaceDescriptor + 37;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            l2 = null;
        } else {
            l2 = l;
        }
        String str2 = (i & 32) != 0 ? null : str;
        boolean z7 = (i & 64) != 0 ? false : z2;
        boolean z8 = (i & 128) != 0 ? false : z3;
        boolean z9 = (i & 256) != 0 ? false : z4;
        if ((i & 512) != 0) {
            int i5 = IAuthTabCallbackStubProxy + 95;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            z6 = false;
        } else {
            z6 = z5;
        }
        if ((i & 1024) != 0) {
            int i7 = getInterfaceDescriptor + 59;
            IAuthTabCallbackStubProxy = i7 % 128;
            if (i7 % 2 == 0) {
                getLogUploadURLMap getloguploadurlmap3 = getLogUploadURLMap.None;
                obj2.hashCode();
                throw null;
            }
            getloguploadurlmap2 = getLogUploadURLMap.None;
        } else {
            getloguploadurlmap2 = getloguploadurlmap;
        }
        return tilingVar.onExtraCallbackWithResult(j, context, signInResponse, z, l2, str2, z7, z8, z9, z6, getloguploadurlmap2, (Function1<? super access13800<? super Unit>, ? extends Object>) function1);
    }

    static final class asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ Function1<access13800<? super Unit>, Object> $savePrivateKey;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asBinder(Function1<? super access13800<? super Unit>, ? extends Object> function1, access13800<? super asBinder> access13800Var) {
            super(2, access13800Var);
            this.$savePrivateKey = function1;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new asBinder(this.$savePrivateKey, access13800Var);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                Function1<access13800<? super Unit>, Object> function1 = this.$savePrivateKey;
                this.label = 1;
                if (function1.invoke(this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    static final class IAuthTabCallbackDefault extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ getLogUploadURLMap $updateLoginTokenConsentType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackDefault(getLogUploadURLMap getloguploadurlmap, access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(2, access13800Var);
            this.$updateLoginTokenConsentType = getloguploadurlmap;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new IAuthTabCallbackDefault(this.$updateLoginTokenConsentType, access13800Var);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                IAPIntegrationHelper4 iAPIntegrationHelper4OnNavigationEvent = tiling.onNavigationEvent(tiling.onNavigationEvent);
                getLogUploadURLMap getloguploadurlmap = this.$updateLoginTokenConsentType;
                this.label = 1;
                if (iAPIntegrationHelper4OnNavigationEvent.onExtraCallback(getloguploadurlmap, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit IAuthTabCallback(long r6, boolean r8, o.SetDetectableSize r9) throws java.lang.Throwable {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.tiling.IAuthTabCallbackStubProxy
            int r1 = r1 + 79
            int r2 = r1 % 128
            o.tiling.getInterfaceDescriptor = r2
            int r1 = r1 % r0
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            r1 = 16
            byte[] r1 = new byte[r1]
            r1 = {x0078: FILL_ARRAY_DATA , data: [-112, -117, -123, -116, -119, -117, -113, -113, -125, -113, -123, -115, -113, -125, -114, -118} // fill-array
            int r2 = android.view.ViewConfiguration.getScrollBarSize()
            int r2 = r2 >> 8
            int r2 = r2 + 127
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r5 = 0
            a(r5, r5, r1, r2, r4)
            r1 = 0
            r2 = r4[r1]
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r2.intern()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r9.onExtraCallback(r2, r6)
            java.lang.String r6 = "new_user_yn"
            java.lang.String r7 = o.zzaz.onExtraCallbackWithResult(r8)
            r9.onExtraCallback(r6, r7)
            o.tiling r6 = o.tiling.onNavigationEvent
            o.calcThumbnailOptions r7 = r6.onActivityLayout()
            java.lang.String r7 = r7.onExtraCallbackWithResult()
            java.lang.String r8 = "onboarding_session_id"
            r9.onExtraCallback(r8, r7)
            o.copyFile r6 = r6.readTypedObject()
            java.lang.String r6 = r6.IAuthTabCallbackStub()
            if (r6 == 0) goto L69
            int r7 = o.tiling.getInterfaceDescriptor
            int r7 = r7 + 97
            int r8 = r7 % 128
            o.tiling.IAuthTabCallbackStubProxy = r8
            int r7 = r7 % r0
            int r6 = r6.length()
            if (r6 == 0) goto L69
            goto L6a
        L69:
            r1 = r3
        L6a:
            r6 = r1 ^ 1
            java.lang.String r6 = o.zzaz.onExtraCallbackWithResult(r6)
            java.lang.String r7 = "onelink_yn"
            r9.onExtraCallback(r7, r6)
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.tiling.IAuthTabCallback(long, boolean, o.SetDetectableSize):kotlin.Unit");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void IAuthTabCallback(final long r19, final boolean r21, boolean r22, boolean r23, boolean r24, boolean r25, boolean r26, boolean r27, android.content.Context r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.tiling.IAuthTabCallback(long, boolean, boolean, boolean, boolean, boolean, boolean, boolean, android.content.Context):void");
    }

    private final wasLastName onExtraCallbackWithResult(final long j, final Context context, final SignInResponse signInResponse, final boolean z, Long l, String str, final boolean z2, final boolean z3, final boolean z4, final boolean z5, getLogUploadURLMap getloguploadurlmap, Function1<? super access13800<? super Unit>, ? extends Object> function1) throws Throwable {
        wasLastName waslastnameIAuthTabCallback;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 73;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            onTransact = str;
            if (((Boolean) CheckoutResult.onNavigationEvent(-1946883688, 1946883689, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{signInResponse.IAuthTabCallback()}, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent())).booleanValue()) {
                int i3 = getInterfaceDescriptor + 1;
                IAuthTabCallbackStubProxy = i3 % 128;
                int i4 = i3 % 2;
                setTestMode.onExtraCallback.onExtraCallback(signInResponse.IAuthTabCallback());
            }
            setTestMode.onExtraCallback.onNavigationEvent(accesssetIndexp.IAuthTabCallback(signInResponse.onExtraCallbackWithResult()));
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), TextUtils.indexOf("", "", 0, 0) + 30, Color.blue(0) + 24887, -265239605, false, "onWarmupCompleted", (Class[]) null);
            }
            Object obj = ((Field) objOnExtraCallback).get(null);
            try {
                Object[] objArr = {true};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1003708790);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 30, Drawable.resolveOpacity(0, 0) + 24887, -177446886, false, "onWarmupCompleted", new Class[]{Boolean.TYPE});
                }
                ((Method) objOnExtraCallback2).invoke(obj, objArr);
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub = addPolicy.ITrustedWebActivityServiceStub();
                Object[] objArr2 = new Object[1];
                a(null, null, new byte[]{-126, -125, -126, -126, -125, -124, -125, -126, -123, -116, -125, -122, -119, -115, -123, -116, -117, -118, -119, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, Drawable.resolveOpacity(0, 0) + 127, objArr2);
                String strOnExtraCallbackWithResult = textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub.onExtraCallbackWithResult(((String) objArr2[0]).intern(), "");
                final boolean zAreEqual = Intrinsics.areEqual(strOnExtraCallbackWithResult, "passkey");
                final boolean zAreEqual2 = Intrinsics.areEqual(strOnExtraCallbackWithResult, "kakao");
                wasLastName waslastnameOnWarmupCompleted = RxCompletableKt.onExtraCallback((CoroutineContext) null, new asBinder(function1, null), 1, (Object) null).IAuthTabCallback(new deserializeDecimalCollection() { // from class: viva.republica.toss.guest.GuestManager$$ExternalSyntheticLambda15
                    public final void run() throws Throwable {
                        tiling.IAuthTabCallback(context, signInResponse);
                    }
                }).onWarmupCompleted(disableOldAndroidAttachmentMetricsWorkarounds.IAuthTabCallback.IAuthTabCallbackStub()).onWarmupCompleted(UST_CERT_GetPublicKeyInfo.IAuthTabCallback(UST_CERT_GetPublicKeyInfo.onWarmupCompleted, "postProcessGuestSession", false, 2, null));
                if (zzaj.onNavigationEvent().AudioAttributesImplApi21Parcelizer()) {
                    waslastnameIAuthTabCallback = RxCompletableKt.onExtraCallback((CoroutineContext) null, new IAuthTabCallbackDefault(getloguploadurlmap, null), 1, (Object) null).onWarmupCompleted(clearTid.onExtraCallback());
                } else {
                    waslastnameIAuthTabCallback = wasLastName.IAuthTabCallback();
                }
                wasLastName waslastnameIAuthTabCallback2 = waslastnameOnWarmupCompleted.onExtraCallback(waslastnameIAuthTabCallback).IAuthTabCallback(new deserializeDecimalCollection() { // from class: viva.republica.toss.guest.GuestManager$$ExternalSyntheticLambda16
                    public final void run() throws Throwable {
                        long j2 = j;
                        boolean z6 = z;
                        boolean z7 = z4;
                        boolean z8 = z5;
                        boolean z9 = z3;
                        boolean z10 = z2;
                        boolean z11 = zAreEqual;
                        boolean z12 = zAreEqual2;
                        Object[] objArr3 = {Long.valueOf(j2), Boolean.valueOf(z6), Boolean.valueOf(z7), Boolean.valueOf(z8), Boolean.valueOf(z9), Boolean.valueOf(z10), Boolean.valueOf(z11), Boolean.valueOf(z12), context};
                        tiling.onWarmupCompleted(-1152820079, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), 1152820085, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), objArr3, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted());
                    }
                });
                final Function1 function12 = new Function1() { // from class: viva.republica.toss.guest.GuestManager$$ExternalSyntheticLambda17
                    public final Object invoke(Object obj2) {
                        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
                        int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
                        int iOnWarmupCompleted3 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
                        return (Unit) tiling.onWarmupCompleted(-1300745859, iOnWarmupCompleted, 1300745875, iOnWarmupCompleted2, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), new Object[]{(Throwable) obj2}, iOnWarmupCompleted3);
                    }
                };
                wasLastName waslastnameOnExtraCallbackWithResult = waslastnameIAuthTabCallback2.onExtraCallbackWithResult(new deserializeFloat() { // from class: viva.republica.toss.guest.GuestManager$$ExternalSyntheticLambda18
                    public final void accept(Object obj2) throws Throwable {
                        tiling.onWarmupCompleted(function12, obj2);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(waslastnameOnExtraCallbackWithResult, "");
                int i5 = getInterfaceDescriptor + 1;
                IAuthTabCallbackStubProxy = i5 % 128;
                int i6 = i5 % 2;
                return waslastnameOnExtraCallbackWithResult;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        onTransact = str;
        ((Boolean) CheckoutResult.onNavigationEvent(-1946883688, 1946883689, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{signInResponse.IAuthTabCallback()}, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent())).booleanValue();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 31;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallbackStubProxy + 115;
        getInterfaceDescriptor = i4 % 128;
        Object obj2 = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    private final void IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 59;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            getTypeID.IAuthTabCallback.IAuthTabCallbackStub();
            DefaultDevLoadingViewImplementationExternalSyntheticLambda0.IAuthTabCallback(-1380366303, new Object[]{DefaultDevLoadingViewImplementationExternalSyntheticLambda0.IAuthTabCallback}, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1380366306, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
            int i3 = IAuthTabCallbackStubProxy + 23;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        getTypeID.IAuthTabCallback.IAuthTabCallbackStub();
        DefaultDevLoadingViewImplementationExternalSyntheticLambda0.IAuthTabCallback(-1380366303, new Object[]{DefaultDevLoadingViewImplementationExternalSyntheticLambda0.IAuthTabCallback}, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1380366306, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onPostMessage() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 27;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        WebStorage.getInstance().deleteAllData();
        if (i3 != 0) {
            int i4 = 41 / 0;
        }
    }

    static final class onTransact extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int I$0;
        int I$1;
        Object L$0;
        int label;

        onTransact(access13800<? super onTransact> access13800Var) {
            super(2, access13800Var);
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onTransact(access13800Var);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    Result.Companion companion = Result.Companion;
                    CompassSensorService compassSensorServiceIAuthTabCallback = ChangeBundleLocationDialogExternalSyntheticLambda0.onExtraCallbackWithResult.IAuthTabCallback();
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    if (compassSensorServiceIAuthTabCallback.onWarmupCompleted(true, this) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                Result.constructor-impl(Unit.INSTANCE);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                Result.Companion companion2 = Result.Companion;
                Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (WebResourceResponseModel e3) {
                Result.Companion companion3 = Result.Companion;
                Result.constructor-impl(ResultKt.createFailure(e3));
            }
            return Unit.INSTANCE;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) throws Throwable {
        Context context = (Context) objArr[1];
        AppProfile appProfile = (AppProfile) objArr[2];
        int i = 2 % 2;
        setSegmentCollection.onNavigationEvent onnavigationevent = setSegmentCollection.Companion;
        onnavigationevent.onWarmupCompleted().onExtraCallback(true);
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub = addPolicy.ITrustedWebActivityServiceStub();
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-116, -117, -118, -119, -120, -123, -126, -125, -115, -124, -110, -123, -125, -111, -116, -119, -123, -121, -120, -116, -119, -123, -121, -125, -122}, ImageFormat.getBitsPerPixel(0) + 128, objArr2);
        textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub.onNavigationEvent(((String) objArr2[0]).intern(), false);
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub2 = addPolicy.ITrustedWebActivityServiceStub();
        Object[] objArr3 = new Object[1];
        a(null, null, new byte[]{-121, -125, -122, -123, -122, -111, -110, -108, -123, -125, -120, -112, -116, -110, -109, -123, -125, -111, -116, -119, -123, -121, -120, -116, -119, -123, -116, -110, -111, -123, -121, -125, -122}, 127 - Color.alpha(0), objArr3);
        textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub2.onNavigationEvent(((String) objArr3[0]).intern(), true);
        int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        int iOnNavigationEvent2 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        if (((String) PlayerErrorCode.IAuthTabCallback(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1756374204, iOnNavigationEvent2, iOnNavigationEvent, 1756374207, new Object[0], LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent())).length() == 0) {
            createPaints createpaints = createPaints.IAuthTabCallback;
            if (createpaints.IAuthTabCallback().length() > 0) {
                int i2 = getInterfaceDescriptor + 19;
                IAuthTabCallbackStubProxy = i2 % 128;
                if (i2 % 2 == 0) {
                    PlayerErrorCode.asBinder(createpaints.IAuthTabCallback());
                    int i3 = 25 / 0;
                } else {
                    PlayerErrorCode.asBinder(createpaints.IAuthTabCallback());
                }
            }
        }
        onnavigationevent.onWarmupCompleted().onWarmupCompleted();
        getMaxScale.IAuthTabCallback.onExtraCallbackWithResult();
        fileSRect.onNavigationEvent.IAuthTabCallback();
        if (EncoderImplExternalSyntheticLambda9.onExtraCallbackWithResult(context, "android.permission.READ_CONTACTS") == 0) {
            new H5TinyPopMenu(context).onNavigationEvent();
            int i4 = getInterfaceDescriptor + 43;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
        }
        GuardedAsyncTask.IAuthTabCallback.onExtraCallback(context);
        if (appProfile != null) {
            onNavigationEvent.writeTypedObject().onWarmupCompleted(appProfile);
        }
        clearTid.onExtraCallback().onExtraCallback(new Runnable() { // from class: viva.republica.toss.guest.GuestManager$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                tiling.IAuthTabCallbackDefault();
            }
        });
        if (zzaj.onNavigationEvent().AudioAttributesImplApi21Parcelizer() && !addExtra.extraCallback(PlayerErrorCode.onWarmupCompleted)) {
            maybeUpdateAnimatable.onNavigationEvent(ComponentModelb.onExtraCallback, (CoroutineContext) null, (setRandomHost) null, new onTransact(null), 3, (Object) null);
        }
        return null;
    }

    public final writeRaw<Boolean> onExtraCallback(long j, long j2) {
        int i = 2 % 2;
        writeRaw<BaseApiResponse<Boolean>> writerawOnWarmupCompleted = AdSettingsIntegrationErrorMode.onNavigationEvent.newSession().onWarmupCompleted(new incrementPendingJSCalls(j, j2));
        MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
        writeRaw<Boolean> writerawIAuthTabCallback = writerawOnWarmupCompleted.IAuthTabCallback(new onExtraCallback(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        int i2 = IAuthTabCallbackStubProxy + 57;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        return writerawIAuthTabCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0057 A[PHI: r1
      0x0057: PHI (r1v8 boolean) = (r1v6 boolean), (r1v11 boolean) binds: [B:8:0x0031, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final o.deserializeIp onExtraCallbackWithResult(boolean r11, long r12, o.asArray r14, java.lang.String r15) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.tiling.getInterfaceDescriptor
            int r1 = r1 + 107
            int r2 = r1 % 128
            o.tiling.IAuthTabCallbackStubProxy = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            if (r1 != 0) goto L24
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r2)
            o.tiling r1 = o.tiling.onNavigationEvent
            o.getBillingPeriod r1 = r1.ICustomTabsCallback()
            boolean r1 = r1.onExtraCallback()
            r3 = 30
            int r3 = r3 / 0
            if (r11 == 0) goto L57
            goto L33
        L24:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r2)
            o.tiling r1 = o.tiling.onNavigationEvent
            o.getBillingPeriod r1 = r1.ICustomTabsCallback()
            boolean r1 = r1.onExtraCallback()
            if (r11 == 0) goto L57
        L33:
            o.AdSettingsIntegrationErrorMode r11 = o.AdSettingsIntegrationErrorMode.onNavigationEvent
            o.getNativeAdApi r11 = r11.requestPostMessageChannel()
            viva.republica.toss.network.model.verify.guest.VisitorSignInRequest r1 = new viva.republica.toss.network.model.verify.guest.VisitorSignInRequest
            o.nativeReadByte r7 = o.accesssetIndexp.onExtraCallback(r14)
            r8 = 0
            r9 = 8
            r10 = 0
            r3 = r1
            r4 = r12
            r6 = r15
            r3.<init>(r4, r6, r7, r8, r9, r10)
            o.writeRaw r11 = r11.onNavigationEvent(r1)
            int r12 = o.tiling.IAuthTabCallbackStubProxy
            int r12 = r12 + 57
            int r13 = r12 % 128
            o.tiling.getInterfaceDescriptor = r13
            int r12 = r12 % r0
            goto L87
        L57:
            if (r1 == 0) goto L74
            o.AdSettingsIntegrationErrorMode r11 = o.AdSettingsIntegrationErrorMode.onNavigationEvent
            o.onVolumeChanged r11 = r11.postMessage()
            viva.republica.toss.network.model.verify.guest.GlobalSignInRequest r0 = new viva.republica.toss.network.model.verify.guest.GlobalSignInRequest
            o.nativeReadByte r7 = o.accesssetIndexp.onExtraCallback(r14)
            r8 = 0
            r9 = 8
            r10 = 0
            r3 = r0
            r4 = r12
            r6 = r15
            r3.<init>(r4, r6, r7, r8, r9, r10)
            o.writeRaw r11 = r11.IAuthTabCallback(r0)
            goto L87
        L74:
            o.AdSettingsIntegrationErrorMode r11 = o.AdSettingsIntegrationErrorMode.onNavigationEvent
            o.setVolume r11 = r11.newSession()
            viva.republica.toss.network.model.verify.guest.SignInRequest r0 = new viva.republica.toss.network.model.verify.guest.SignInRequest
            o.nativeReadByte r14 = o.accesssetIndexp.onExtraCallback(r14)
            r0.<init>(r12, r15, r14)
            o.writeRaw r11 = r11.onNavigationEvent(r0)
        L87:
            o.MapConverter r12 = o.clearTid.onExtraCallback()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r2)
            o.MapConverter r13 = o.NetConverter3.onExtraCallback()
            o.tiling$readTypedObject r14 = new o.tiling$readTypedObject
            r14.<init>(r12, r13)
            o.writeRaw r11 = r11.IAuthTabCallback(r14)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r2)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o.tiling.onExtraCallbackWithResult(boolean, long, o.asArray, java.lang.String):o.deserializeIp");
    }

    private static final deserializeIp IAuthTabCallback(boolean z, long j, asArray asarray, Long l, String str) {
        writeRaw<BaseApiResponse<SignInResponse>> writerawOnExtraCallbackWithResult;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        boolean zOnExtraCallback = onNavigationEvent.ICustomTabsCallback().onExtraCallback();
        if (z) {
            writerawOnExtraCallbackWithResult = AdSettingsIntegrationErrorMode.onNavigationEvent.requestPostMessageChannel().onWarmupCompleted(new VisitorSignInRequest(j, str, accesssetIndexp.onExtraCallback(asarray), l));
        } else {
            if (zOnExtraCallback) {
                writerawOnExtraCallbackWithResult = AdSettingsIntegrationErrorMode.onNavigationEvent.postMessage().onNavigationEvent(new GlobalSignInRequest(j, str, accesssetIndexp.onExtraCallback(asarray), (Map) null, 8, (DefaultConstructorMarker) null));
                i = getInterfaceDescriptor + 11;
            } else {
                writerawOnExtraCallbackWithResult = AdSettingsIntegrationErrorMode.onNavigationEvent.newSession().onExtraCallbackWithResult(new SignInRequest(j, str, accesssetIndexp.onExtraCallback(asarray)));
                i = getInterfaceDescriptor + 97;
            }
            IAuthTabCallbackStubProxy = i % 128;
            int i3 = i % 2;
        }
        MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
        writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(new getInterfaceDescriptor(mapConverterOnExtraCallback, null));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        return writerawIAuthTabCallback;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws NoWhenBranchMatchedException {
        writeRaw<BaseApiResponse<SignInResponse>> writerawIAuthTabCallback;
        Map map;
        boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        long jLongValue = ((Number) objArr[1]).longValue();
        asArray asarray = (asArray) objArr[2];
        Pair pair = (Pair) objArr[3];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(pair, "");
        String str = (String) pair.onExtraCallbackWithResult();
        Map map2 = (Map) pair.IAuthTabCallback();
        boolean zOnExtraCallback = onNavigationEvent.ICustomTabsCallback().onExtraCallback();
        if (zBooleanValue) {
            writerawIAuthTabCallback = AdSettingsIntegrationErrorMode.onNavigationEvent.requestPostMessageChannel().onExtraCallback(new VisitorSignInRequest(jLongValue, str, accesssetIndexp.onExtraCallback(asarray), (Long) null, 8, (DefaultConstructorMarker) null));
        } else if (zOnExtraCallback) {
            int i2 = IAuthTabCallbackStubProxy + 61;
            getInterfaceDescriptor = i2 % 128;
            if (i2 % 2 != 0) {
                AdSettingsIntegrationErrorMode.onNavigationEvent.postMessage();
                accesssetIndexp.onExtraCallback(asarray);
                map2.isEmpty();
                throw null;
            }
            onVolumeChanged onvolumechangedPostMessage = AdSettingsIntegrationErrorMode.onNavigationEvent.postMessage();
            nativeReadByte nativereadbyteOnExtraCallback = accesssetIndexp.onExtraCallback(asarray);
            if (map2.isEmpty()) {
                map = null;
            } else {
                int i3 = IAuthTabCallbackStubProxy + 29;
                getInterfaceDescriptor = i3 % 128;
                int i4 = i3 % 2;
                map = map2;
            }
            writerawIAuthTabCallback = onvolumechangedPostMessage.onExtraCallback(new GlobalSignInRequest(jLongValue, str, nativereadbyteOnExtraCallback, map));
        } else {
            writerawIAuthTabCallback = AdSettingsIntegrationErrorMode.onNavigationEvent.newSession().IAuthTabCallback(new SignInRequest(jLongValue, str, accesssetIndexp.onExtraCallback(asarray)));
        }
        MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
        writeRaw writerawIAuthTabCallback2 = writerawIAuthTabCallback.IAuthTabCallback(new IAuthTabCallbackStubProxy(mapConverterOnExtraCallback, null));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback2, "");
        return writerawIAuthTabCallback2;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        writeRaw<BaseApiResponse<SignInResponse>> writerawOnExtraCallback;
        boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        long jLongValue = ((Number) objArr[1]).longValue();
        asArray asarray = (asArray) objArr[2];
        Long l = (Long) objArr[3];
        boolean zBooleanValue2 = ((Boolean) objArr[4]).booleanValue();
        String str = (String) objArr[5];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 107;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        if (zBooleanValue) {
            writerawOnExtraCallback = AdSettingsIntegrationErrorMode.onNavigationEvent.requestPostMessageChannel().onNavigationEvent(new VisitorSignUpRequest(jLongValue, str, accesssetIndexp.onExtraCallback(asarray), l));
        } else if (zBooleanValue2) {
            writerawOnExtraCallback = AdSettingsIntegrationErrorMode.onNavigationEvent.postMessage().onExtraCallbackWithResult(new GlobalSignUpRequest(jLongValue, str, accesssetIndexp.onExtraCallback(asarray)));
            int i3 = IAuthTabCallbackStubProxy + 55;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
        } else {
            writerawOnExtraCallback = AdSettingsIntegrationErrorMode.onNavigationEvent.newSession().onExtraCallback(new SignUpRequest(jLongValue, str, accesssetIndexp.onExtraCallback(asarray)));
        }
        MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
        writeRaw writerawIAuthTabCallback = writerawOnExtraCallback.IAuthTabCallback(new writeTypedObject(mapConverterOnExtraCallback, null));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        return writerawIAuthTabCallback;
    }

    private static final deserializeIp IAuthTabCallback(long j, asArray asarray, Pair pair) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 13;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(pair, "");
        String str = (String) pair.onExtraCallbackWithResult();
        Map map = (Map) pair.IAuthTabCallback();
        onVolumeChanged onvolumechangedPostMessage = AdSettingsIntegrationErrorMode.onNavigationEvent.postMessage();
        nativeReadByte nativereadbyteOnExtraCallback = accesssetIndexp.onExtraCallback(asarray);
        String typedObject = setTestMode.onExtraCallback.readTypedObject();
        writeRaw<BaseApiResponse<SignInResponse>> writerawIAuthTabCallback = onvolumechangedPostMessage.IAuthTabCallback(new GlobalCrossRegionSignUpRequest(j, str, map, nativereadbyteOnExtraCallback, typedObject.length() <= 0 ? null : typedObject));
        MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
        writeRaw writerawIAuthTabCallback2 = writerawIAuthTabCallback.IAuthTabCallback(new onExtraCallbackWithResult(mapConverterOnExtraCallback, null));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback2, "");
        int i4 = getInterfaceDescriptor + 91;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return writerawIAuthTabCallback2;
    }

    private static final deserializeIp onNavigationEvent(long j, asArray asarray, Pair pair) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(pair, "");
        writeRaw<BaseApiResponse<SignInResponse>> writerawIAuthTabCallback = AdSettingsIntegrationErrorMode.onNavigationEvent.postMessage().IAuthTabCallback(new GlobalCrossRegionSignUpWithResetPasswordRequest(j, (String) pair.onExtraCallbackWithResult(), (Map) pair.IAuthTabCallback(), accesssetIndexp.onExtraCallback(asarray)));
        MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
        writeRaw writerawIAuthTabCallback2 = writerawIAuthTabCallback.IAuthTabCallback(new onWarmupCompleted(mapConverterOnExtraCallback, null));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback2, "");
        int i2 = IAuthTabCallbackStubProxy + 117;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        return writerawIAuthTabCallback2;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(boolean z, boolean z2) throws Throwable {
        Object[] objArr = {Boolean.valueOf(z), Boolean.valueOf(z2)};
        onWarmupCompleted(62056884, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), -62056876, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), objArr, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onWarmupCompleted(Throwable th) {
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted3 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        return (Unit) onWarmupCompleted(-1300745859, iOnWarmupCompleted, 1300745875, iOnWarmupCompleted2, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), new Object[]{th}, iOnWarmupCompleted3);
    }

    public static /* synthetic */ Unit onNavigationEvent(long j, boolean z, SetDetectableSize setDetectableSize) {
        Object[] objArr = {Long.valueOf(j), Boolean.valueOf(z), setDetectableSize};
        return (Unit) onWarmupCompleted(227861813, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), -227861801, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), objArr, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted());
    }

    public static /* synthetic */ void onNavigationEvent(long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, Context context) throws Throwable {
        Object[] objArr = {Long.valueOf(j), Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4), Boolean.valueOf(z5), Boolean.valueOf(z6), Boolean.valueOf(z7), context};
        onWarmupCompleted(-1152820079, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), 1152820085, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), objArr, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted());
    }

    public static /* synthetic */ JsonReaderErrorInfo IAuthTabCallback(Function1 function1, Object obj) {
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted3 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        return (JsonReaderErrorInfo) onWarmupCompleted(1953490194, iOnWarmupCompleted, -1953490184, iOnWarmupCompleted2, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), new Object[]{function1, obj}, iOnWarmupCompleted3);
    }

    public static /* synthetic */ JsonReaderErrorInfo asInterface(Function1 function1, Object obj) {
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted3 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        return (JsonReaderErrorInfo) onWarmupCompleted(-487895814, iOnWarmupCompleted, 487895834, iOnWarmupCompleted2, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), new Object[]{function1, obj}, iOnWarmupCompleted3);
    }

    public static /* synthetic */ deserializeIp onExtraCallback(boolean z, long j, asArray asarray, Long l, String str) {
        Object[] objArr = {Boolean.valueOf(z), Long.valueOf(j), asarray, l, str};
        return (deserializeIp) onWarmupCompleted(-1090841598, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), 1090841605, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), objArr, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted());
    }

    public static /* synthetic */ JsonReaderErrorInfo getInterfaceDescriptor(Function1 function1, Object obj) {
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted3 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        return (JsonReaderErrorInfo) onWarmupCompleted(1603018691, iOnWarmupCompleted, -1603018674, iOnWarmupCompleted2, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), new Object[]{function1, obj}, iOnWarmupCompleted3);
    }

    private static final copyFile getInterfaceDescriptor() {
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted3 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        return (copyFile) onWarmupCompleted(-610580484, iOnWarmupCompleted, 610580497, iOnWarmupCompleted2, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), new Object[0], iOnWarmupCompleted3);
    }

    static /* synthetic */ wasLastName IAuthTabCallback(tiling tilingVar, long j, Context context, GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, SignInResponse signInResponse, boolean z, boolean z2, Long l, String str, boolean z3, boolean z4, boolean z5, boolean z6, getLogUploadURLMap getloguploadurlmap, int i, Object obj) {
        Object[] objArr = {tilingVar, Long.valueOf(j), context, graniteBrownfieldModule_closeView, signInResponse, Boolean.valueOf(z), Boolean.valueOf(z2), l, str, Boolean.valueOf(z3), Boolean.valueOf(z4), Boolean.valueOf(z5), Boolean.valueOf(z6), getloguploadurlmap, Integer.valueOf(i), obj};
        return (wasLastName) onWarmupCompleted(-91047791, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), 91047794, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), objArr, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted());
    }

    private static final void onExtraCallbackWithResult(Context context, SignInResponse signInResponse) throws Throwable {
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted3 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        onWarmupCompleted(1209861710, iOnWarmupCompleted, -1209861699, iOnWarmupCompleted2, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), new Object[]{context, signInResponse}, iOnWarmupCompleted3);
    }

    private static final Unit onExtraCallbackWithResult(Throwable th) {
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted3 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        return (Unit) onWarmupCompleted(1113389174, iOnWarmupCompleted, -1113389156, iOnWarmupCompleted2, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), new Object[]{th}, iOnWarmupCompleted3);
    }

    private static final void ICustomTabsCallback(Function1 function1, Object obj) throws Throwable {
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted3 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        onWarmupCompleted(-1816058957, iOnWarmupCompleted, 1816058958, iOnWarmupCompleted2, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), new Object[]{function1, obj}, iOnWarmupCompleted3);
    }

    private final void onExtraCallback(Context context, AppProfile appProfile) throws Throwable {
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted3 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        onWarmupCompleted(-747475232, iOnWarmupCompleted, 747475241, iOnWarmupCompleted2, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), new Object[]{this, context, appProfile}, iOnWarmupCompleted3);
    }

    private static final getBillingPeriod onMinimized() {
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted3 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        return (getBillingPeriod) onWarmupCompleted(-672008578, iOnWarmupCompleted, 672008582, iOnWarmupCompleted2, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), new Object[0], iOnWarmupCompleted3);
    }

    private static final deserializeIp onExtraCallbackWithResult(boolean z, long j, asArray asarray, Pair pair) {
        Object[] objArr = {Boolean.valueOf(z), Long.valueOf(j), asarray, pair};
        return (deserializeIp) onWarmupCompleted(953596614, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), -953596612, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), objArr, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted());
    }

    private static final deserializeIp onMinimized(Function1 function1, Object obj) {
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted3 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        return (deserializeIp) onWarmupCompleted(-1754137018, iOnWarmupCompleted, 1754137018, iOnWarmupCompleted2, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), new Object[]{function1, obj}, iOnWarmupCompleted3);
    }

    private static final deserializeIp onNavigationEvent(boolean z, long j, asArray asarray, Long l, boolean z2, String str) {
        Object[] objArr = {Boolean.valueOf(z), Long.valueOf(j), asarray, l, Boolean.valueOf(z2), str};
        return (deserializeIp) onWarmupCompleted(-1376838856, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), 1376838875, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), objArr, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted());
    }

    private static final deserializeIp onPostMessage(Function1 function1, Object obj) {
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted3 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        return (deserializeIp) onWarmupCompleted(-203198433, iOnWarmupCompleted, 203198438, iOnWarmupCompleted2, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), new Object[]{function1, obj}, iOnWarmupCompleted3);
    }

    private static final JsonReaderErrorInfo IAuthTabCallback(long j, Context context, GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, boolean z, Long l, String str, boolean z2, boolean z3, boolean z4, boolean z5, getLogUploadURLMap getloguploadurlmap, SignInResponse signInResponse) {
        Object[] objArr = {Long.valueOf(j), context, graniteBrownfieldModule_closeView, Boolean.valueOf(z), l, str, Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4), Boolean.valueOf(z5), getloguploadurlmap, signInResponse};
        return (JsonReaderErrorInfo) onWarmupCompleted(2025434195, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), -2025434181, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), objArr, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted());
    }

    public final wasLastName onExtraCallback(long j, @NotNull Context context, @NotNull GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, boolean z, @Nullable Long l, @Nullable String str, boolean z2, boolean z3, @NotNull getLogUploadURLMap getloguploadurlmap, boolean z4, @Nullable Long l2, boolean z5) {
        Object[] objArr = {this, Long.valueOf(j), context, graniteBrownfieldModule_closeView, Boolean.valueOf(z), l, str, Boolean.valueOf(z2), Boolean.valueOf(z3), getloguploadurlmap, Boolean.valueOf(z4), l2, Boolean.valueOf(z5)};
        return (wasLastName) onWarmupCompleted(1846285751, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), -1846285736, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), objArr, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted());
    }

    static void onTransact() {
        asBinder = new char[]{32617, 32623, 32636, 32627, 32634, 32630, 32608, 32629, 32618, 32626, 32624, 32619, 32621, 32620, 32622, 32637, 32638, 32632, 32625, 32639};
        IAuthTabCallback_Parcel = -1184334055;
        access000 = true;
        access100 = true;
    }
}
