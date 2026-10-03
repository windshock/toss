package o;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.internal.ads.zzgc;
import im.toss.base.BaseActivity;
import im.toss.deeplink.DeeplinkConditionalRouter;
import im.toss.deeplink.annotation.ConditionalDeepLink;
import im.toss.features.payment.ui.offline.compose.screen.FullPage2DCodeScreenKt$;
import im.toss.rn.appsintoss.api.model.contacts_common.PushInfo;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.SessionTrackerb;
import o.setSingleIcon;
import viva.republica.toss.core.AppStateManager;
import viva.republica.toss.main.SchemeWebActivity;
import viva.republica.toss.main.pullupweb.PullUpWebActivity;
import viva.republica.toss.main.pullupweb.PullUpWebSchemeRouter$deferOverlayToNextHost$callback$1$;
import viva.republica.toss.splash.BaseSchemeActivity;

@ConditionalDeepLink
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class setOnAdClosedListener extends DeeplinkConditionalRouter {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallback Companion;
    private static char IAuthTabCallback = 0;
    private static char IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static char onExtraCallback;
    public static final int onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static int onTransact;
    private static Function0<Unit> onWarmupCompleted;

    static {
        onExtraCallback();
        Companion = new onExtraCallback(null);
        onExtraCallbackWithResult = 8;
        int i = onTransact + 115;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = i3 | i;
        int i8 = ~((~i) | i3);
        int i9 = ~i3;
        int i10 = i8 | (~(i9 | i2 | i));
        int i11 = (~(i | i9)) | i2;
        int i12 = i3 + i2 + i6 + (2127773517 * i4) + (1026174006 * i5);
        int i13 = i12 * i12;
        int i14 = (i3 * (-484454144)) + 743702528 + ((-484454144) * i2) + (i7 * (-1605095679)) + (1605095679 * i10) + ((-1605095679) * i11) + ((-2089549824) * i6) + (367263744 * i4) + ((-1434976256) * i5) + (1105526784 * i13);
        int i15 = (i3 * 21308160) + 1622758390 + (i2 * 21308160) + (i7 * 947) + (i10 * (-947)) + (i11 * 947) + (i6 * 21309107) + (i4 * 1708896471) + (i5 * 664464834) + (i13 * 287244288);
        int i16 = i14 + (i15 * i15 * 966983680);
        return i16 != 1 ? i16 != 2 ? i16 != 3 ? onNavigationEvent(objArr) : IAuthTabCallback(objArr) : onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        String str = (String) objArr[0];
        Throwable th = (Throwable) objArr[1];
        int i = 2 % 2;
        int i2 = asBinder + 71;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(str, th);
        if (i3 == 0) {
            int i4 = 8 / 0;
        }
        return unitOnExtraCallback;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Ref.BooleanRef booleanRef = (Ref.BooleanRef) objArr[0];
        Handler handler = (Handler) objArr[1];
        Application application = (Application) objArr[2];
        onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) objArr[3];
        int i = 2 % 2;
        int i2 = asBinder + 105;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(booleanRef, handler, application, onextracallbackwithresult);
        }
        onExtraCallbackWithResult(booleanRef, handler, application, onextracallbackwithresult);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(setOnAdClosedListener setonadclosedlistener, Context context, Uri uri, Bundle bundle, AdOptionsView adOptionsView) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 81;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(setonadclosedlistener, context, uri, bundle, adOptionsView);
        int i4 = asInterface + 61;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ void onNavigationEvent(Ref.BooleanRef booleanRef, Application application, onExtraCallbackWithResult onextracallbackwithresult, setOnAdClosedListener setonadclosedlistener, Bundle bundle, AdSDKNotificationListener adSDKNotificationListener) {
        int i = 2 % 2;
        int i2 = asInterface + 49;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(booleanRef, application, onextracallbackwithresult, setonadclosedlistener, bundle, adSDKNotificationListener);
        int i4 = asBinder + 101;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void IAuthTabCallback(Function0 function0) {
        int i = 2 % 2;
        int i2 = asInterface + 81;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        onWarmupCompleted = function0;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 57;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void IAuthTabCallback(setOnAdClosedListener setonadclosedlistener, Context context, Bundle bundle, AdSDKNotificationListener adSDKNotificationListener) {
        int i = 2 % 2;
        int i2 = asBinder + 89;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        setonadclosedlistener.onExtraCallbackWithResult(context, bundle, adSDKNotificationListener);
        int i4 = asInterface + 15;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void IAuthTabCallback(setOnAdClosedListener setonadclosedlistener, FragmentActivity fragmentActivity, Bundle bundle, AdSDKNotificationListener adSDKNotificationListener) {
        int i = 2 % 2;
        int i2 = asInterface + 87;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        setonadclosedlistener.onExtraCallback(fragmentActivity, bundle, adSDKNotificationListener);
        if (i3 != 0) {
            throw null;
        }
        int i4 = asBinder + 85;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ boolean onExtraCallback(setOnAdClosedListener setonadclosedlistener, FragmentActivity fragmentActivity) {
        int i = 2 % 2;
        int i2 = asBinder + 117;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
            return ((Boolean) onExtraCallback(iOnExtraCallbackWithResult, -2060633388, 2060633390, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{setonadclosedlistener, fragmentActivity}, iOnExtraCallbackWithResult2)).booleanValue();
        }
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        ((Boolean) onExtraCallback(iOnExtraCallbackWithResult3, -2060633388, 2060633390, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{setonadclosedlistener, fragmentActivity}, iOnExtraCallbackWithResult4)).booleanValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0066 A[PHI: r3
      0x0066: PHI (r3v9 java.lang.String) = (r3v8 java.lang.String), (r3v18 java.lang.String) binds: [B:8:0x0064, B:5:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void execute(@org.jetbrains.annotations.NotNull android.content.Context r21, @org.jetbrains.annotations.NotNull android.net.Uri r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setOnAdClosedListener.execute(android.content.Context, android.net.Uri):void");
    }

    private static final Unit onExtraCallback(setOnAdClosedListener setonadclosedlistener, Context context, Uri uri, Bundle bundle, AdOptionsView adOptionsView) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 85;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(context);
        setonadclosedlistener.IAuthTabCallback(context, uri, bundle, adOptionsView);
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 119;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 54 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallback(String str, Throwable th) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "PullUpWebSchemeRouter", "verify_failed url=" + str, null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = asBinder + 51;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void IAuthTabCallback(Context context, Uri uri, Bundle bundle, AdOptionsView adOptionsView) throws Throwable {
        FragmentActivity fragmentActivity;
        Fragment fragment;
        Object obj;
        FlowMeasureLazyPolicyExternalSyntheticLambda3 supportFragmentManager;
        Context context2 = context;
        int i = 2 % 2;
        setSingleIcon setsingleiconIAuthTabCallback = AdOptionsViewOrientation.onNavigationEvent.IAuthTabCallback(adOptionsView, filterCreatePageParams.onTransact(uri));
        if (setsingleiconIAuthTabCallback instanceof setSingleIcon.onWarmupCompleted) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "supertoss-pull-up-web-fallback", "reason=" + ((setSingleIcon.onWarmupCompleted) setsingleiconIAuthTabCallback).onWarmupCompleted(), null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
            Activity typedObject = AppStateManager.onExtraCallbackWithResult.readTypedObject();
            if (typedObject != null) {
                int i2 = asBinder + 27;
                asInterface = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
                context2 = typedObject;
            }
            Intent intentPutExtras = new Intent(context2, (Class<?>) SchemeWebActivity.class).putExtras(bundle);
            Intrinsics.checkNotNullExpressionValue(intentPutExtras, "");
            if (!(context2 instanceof Activity)) {
                intentPutExtras.addFlags(268435456);
            }
            context2.startActivity(intentPutExtras);
            return;
        }
        if (!(setsingleiconIAuthTabCallback instanceof setSingleIcon.onNavigationEvent)) {
            throw new NoWhenBranchMatchedException();
        }
        Activity typedObject2 = AppStateManager.onExtraCallbackWithResult.readTypedObject();
        if (!(typedObject2 instanceof FragmentActivity)) {
            fragmentActivity = null;
        } else {
            int i3 = asBinder + 23;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            fragmentActivity = (FragmentActivity) typedObject2;
        }
        if (fragmentActivity == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null) {
            fragment = null;
        } else {
            Fragment fragmentFindFragmentByTag = supportFragmentManager.findFragmentByTag("pull_up_web_host");
            int i5 = asBinder + 93;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            fragment = fragmentFindFragmentByTag;
        }
        AdExperienceType adExperienceType = fragment instanceof AdExperienceType ? (AdExperienceType) fragment : null;
        if (adExperienceType != null) {
            if (((Boolean) AdExperienceType.IAuthTabCallback(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), -1594112689, new Object[]{adExperienceType}, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), 1594112692)).booleanValue()) {
                ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "supertoss-pull-up-web", "single_top_replace", null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
                adExperienceType.onWarmupCompleted(bundle, ((setSingleIcon.onNavigationEvent) setsingleiconIAuthTabCallback).onExtraCallback());
                int i7 = asBinder + 117;
                asInterface = i7 % 128;
                int i8 = i7 % 2;
                return;
            }
        }
        if (fragmentActivity != null) {
            int i9 = asInterface + 25;
            asBinder = i9 % 128;
            int i10 = i9 % 2;
            if (onNavigationEvent(fragmentActivity)) {
                try {
                    Result.Companion companion = Result.Companion;
                    onExtraCallback(fragmentActivity, bundle, ((setSingleIcon.onNavigationEvent) setsingleiconIAuthTabCallback).onExtraCallback());
                    obj = Result.constructor-impl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    obj = Result.constructor-impl(ResultKt.createFailure(th));
                }
                Throwable th2 = Result.exceptionOrNull-impl(obj);
                if (th2 != null) {
                    ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "supertoss-pull-up-web", "overlay_failed_fallback err=" + th2, null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
                    onExtraCallbackWithResult(context2, bundle, ((setSingleIcon.onNavigationEvent) setsingleiconIAuthTabCallback).onExtraCallback());
                }
                Result.IAuthTabCallback(obj);
                return;
            }
        }
        onExtraCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -91461335, 91461338, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{this, context2, bundle, ((setSingleIcon.onNavigationEvent) setsingleiconIAuthTabCallback).onExtraCallback()}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            int i4 = 1;
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i5 = $10 + 99;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 58224;
            int i8 = i3;
            while (i8 < 16) {
                int i9 = $10 + i4;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                char c = cArr3[i4];
                char c2 = cArr3[i3];
                char[] cArr4 = cArr3;
                int i11 = (c2 + i7) ^ ((c2 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)));
                int i12 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(IAuthTabCallbackDefault);
                    objArr2[2] = Integer.valueOf(i12);
                    objArr2[i4] = Integer.valueOf(i11);
                    objArr2[0] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cBlue = (char) Color.blue(0);
                        int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 10;
                        int capsMode = TextUtils.getCapsMode("", 0, 0) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[i4] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cBlue, edgeSlop, capsMode, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr4[i4] = cCharValue;
                    int i13 = i8;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), 10 - (Process.myPid() >> 22), 12434 - Color.blue(0), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                    i8 = i13 + 1;
                    cArr3 = cArr4;
                    i3 = 0;
                    i4 = 1;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - TextUtils.getOffsetAfter("", 0)), 14 - (ViewConfiguration.getLongPressTimeout() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 19902, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private final void onExtraCallback(FragmentActivity fragmentActivity, Bundle bundle, AdSDKNotificationListener adSDKNotificationListener) {
        int i = 2 % 2;
        int i2 = asInterface + 77;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            FlowMeasureLazyPolicyExternalSyntheticLambda3 supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            if (supportFragmentManager.findFragmentByTag("pull_up_web_host") != null) {
                int i3 = asBinder + 65;
                asInterface = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
                return;
            }
            supportFragmentManager.onExtraCallbackWithResult().IAuthTabCallback(R.id.content, AdExperienceType.Companion.onExtraCallbackWithResult(bundle, adSDKNotificationListener), "pull_up_web_host").onExtraCallbackWithResult();
            int i4 = asBinder + 123;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        FlowMeasureLazyPolicyExternalSyntheticLambda3 supportFragmentManager2 = fragmentActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
        supportFragmentManager2.findFragmentByTag("pull_up_web_host");
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallbackWithResult implements Application.ActivityLifecycleCallbacks {
        final /* synthetic */ Bundle IAuthTabCallback;
        final /* synthetic */ setOnAdClosedListener asInterface;
        final /* synthetic */ Ref.BooleanRef onExtraCallback;
        final /* synthetic */ Application onExtraCallbackWithResult;
        final /* synthetic */ AdSDKNotificationListener onNavigationEvent;
        final /* synthetic */ Handler onWarmupCompleted;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(bundle, "");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
        }

        onExtraCallbackWithResult(Ref.BooleanRef booleanRef, setOnAdClosedListener setonadclosedlistener, Handler handler, Application application, Bundle bundle, AdSDKNotificationListener adSDKNotificationListener) {
            this.onExtraCallback = booleanRef;
            this.asInterface = setonadclosedlistener;
            this.onWarmupCompleted = handler;
            this.onExtraCallbackWithResult = application;
            this.IAuthTabCallback = bundle;
            this.onNavigationEvent = adSDKNotificationListener;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
            if (this.onExtraCallback.element) {
                return;
            }
            FragmentActivity fragmentActivity = activity instanceof FragmentActivity ? (FragmentActivity) activity : null;
            if (fragmentActivity == null || !setOnAdClosedListener.onExtraCallback(this.asInterface, fragmentActivity)) {
                return;
            }
            this.onExtraCallback.element = true;
            onExtraCallback onextracallback = setOnAdClosedListener.Companion;
            setOnAdClosedListener.IAuthTabCallback((Function0) null);
            this.onWarmupCompleted.removeCallbacksAndMessages(null);
            this.onExtraCallbackWithResult.unregisterActivityLifecycleCallbacks(this);
            fragmentActivity.getWindow().getDecorView().post(new PullUpWebSchemeRouter$deferOverlayToNextHost$callback$1$.ExternalSyntheticLambda0(this.asInterface, fragmentActivity, this, this.IAuthTabCallback, this.onNavigationEvent, this.onExtraCallbackWithResult));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onExtraCallback(setOnAdClosedListener setonadclosedlistener, FragmentActivity fragmentActivity, onExtraCallbackWithResult onextracallbackwithresult, Bundle bundle, AdSDKNotificationListener adSDKNotificationListener, Application application) {
            Object obj;
            if (setOnAdClosedListener.onExtraCallback(setonadclosedlistener, fragmentActivity)) {
                try {
                    Result.Companion companion = Result.Companion;
                    setOnAdClosedListener.IAuthTabCallback(setonadclosedlistener, fragmentActivity, bundle, adSDKNotificationListener);
                    obj = Result.constructor-impl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    obj = Result.constructor-impl(ResultKt.createFailure(th));
                }
                if (Result.exceptionOrNull-impl(obj) != null) {
                    setOnAdClosedListener.IAuthTabCallback(setonadclosedlistener, application, bundle, adSDKNotificationListener);
                }
            }
        }
    }

    private static final void onWarmupCompleted(Ref.BooleanRef booleanRef, Application application, onExtraCallbackWithResult onextracallbackwithresult, setOnAdClosedListener setonadclosedlistener, Bundle bundle, AdSDKNotificationListener adSDKNotificationListener) {
        int i = 2 % 2;
        int i2 = asInterface + 87;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if (!booleanRef.element) {
            booleanRef.element = true;
            onWarmupCompleted = null;
            application.unregisterActivityLifecycleCallbacks(onextracallbackwithresult);
            setonadclosedlistener.onExtraCallbackWithResult(application, bundle, adSDKNotificationListener);
            return;
        }
        int i4 = asInterface + 15;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 69 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002e A[PHI: r4
      0x002e: PHI (r4v7 kotlin.jvm.functions.Function0<kotlin.Unit>) = (r4v6 kotlin.jvm.functions.Function0<kotlin.Unit>), (r4v15 kotlin.jvm.functions.Function0<kotlin.Unit>) binds: [B:8:0x002c, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object IAuthTabCallback(java.lang.Object[] r15) {
        /*
            r0 = 0
            r1 = r15[r0]
            o.setOnAdClosedListener r1 = (o.setOnAdClosedListener) r1
            r2 = 1
            r2 = r15[r2]
            android.content.Context r2 = (android.content.Context) r2
            r3 = 2
            r4 = r15[r3]
            r9 = r4
            android.os.Bundle r9 = (android.os.Bundle) r9
            r4 = 3
            r15 = r15[r4]
            o.AdSDKNotificationListener r15 = (o.AdSDKNotificationListener) r15
            int r4 = r3 % r3
            int r4 = o.setOnAdClosedListener.asInterface
            int r4 = r4 + 69
            int r5 = r4 % 128
            o.setOnAdClosedListener.asBinder = r5
            int r4 = r4 % r3
            if (r4 == 0) goto L2a
            kotlin.jvm.functions.Function0<kotlin.Unit> r4 = o.setOnAdClosedListener.onWarmupCompleted
            r5 = 71
            int r5 = r5 / r0
            if (r4 == 0) goto L31
            goto L2e
        L2a:
            kotlin.jvm.functions.Function0<kotlin.Unit> r4 = o.setOnAdClosedListener.onWarmupCompleted
            if (r4 == 0) goto L31
        L2e:
            r4.invoke()
        L31:
            r10 = 0
            o.setOnAdClosedListener.onWarmupCompleted = r10
            android.content.Context r4 = r2.getApplicationContext()
            boolean r5 = r4 instanceof android.app.Application
            if (r5 == 0) goto L40
            android.app.Application r4 = (android.app.Application) r4
            r11 = r4
            goto L41
        L40:
            r11 = r10
        L41:
            if (r11 != 0) goto L61
            int r4 = o.setOnAdClosedListener.asBinder
            int r4 = r4 + 75
            int r5 = r4 % 128
            o.setOnAdClosedListener.asInterface = r5
            int r4 = r4 % r3
            if (r4 != 0) goto L54
            r1.onExtraCallbackWithResult(r2, r9, r15)
            r15 = 5
            int r15 = r15 / r0
            goto L57
        L54:
            r1.onExtraCallbackWithResult(r2, r9, r15)
        L57:
            int r15 = o.setOnAdClosedListener.asBinder
            int r15 = r15 + 39
            int r0 = r15 % 128
            o.setOnAdClosedListener.asInterface = r0
            int r15 = r15 % r3
            return r10
        L61:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r0.<init>(r2)
            kotlin.jvm.internal.Ref$BooleanRef r12 = new kotlin.jvm.internal.Ref$BooleanRef
            r12.<init>()
            o.setOnAdClosedListener$onExtraCallbackWithResult r13 = new o.setOnAdClosedListener$onExtraCallbackWithResult
            r2 = r13
            r3 = r12
            r4 = r1
            r5 = r0
            r6 = r11
            r7 = r9
            r8 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r11.registerActivityLifecycleCallbacks(r13)
            viva.republica.toss.main.pullupweb.PullUpWebSchemeRouter$$ExternalSyntheticLambda0 r14 = new viva.republica.toss.main.pullupweb.PullUpWebSchemeRouter$$ExternalSyntheticLambda0
            r2 = r14
            r4 = r11
            r5 = r13
            r6 = r1
            r2.<init>()
            r1 = 5000(0x1388, double:2.4703E-320)
            r0.postDelayed(r14, r1)
            viva.republica.toss.main.pullupweb.PullUpWebSchemeRouter$$ExternalSyntheticLambda1 r15 = new viva.republica.toss.main.pullupweb.PullUpWebSchemeRouter$$ExternalSyntheticLambda1
            r15.<init>()
            o.setOnAdClosedListener.onWarmupCompleted = r15
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setOnAdClosedListener.IAuthTabCallback(java.lang.Object[]):java.lang.Object");
    }

    private static final Unit onExtraCallbackWithResult(Ref.BooleanRef booleanRef, Handler handler, Application application, onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = asInterface + 3;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if (!booleanRef.element) {
            int i4 = asInterface + 33;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            booleanRef.element = true;
            handler.removeCallbacksAndMessages(null);
            application.unregisterActivityLifecycleCallbacks(onextracallbackwithresult);
            int i6 = asInterface + 1;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
        }
        return Unit.INSTANCE;
    }

    private final void onExtraCallbackWithResult(Context context, Bundle bundle, AdSDKNotificationListener adSDKNotificationListener) {
        int i = 2 % 2;
        Intent intentOnExtraCallbackWithResult = PullUpWebActivity.Companion.onExtraCallbackWithResult(context, bundle, adSDKNotificationListener);
        if (!(context instanceof Activity)) {
            int i2 = asBinder + 91;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            intentOnExtraCallbackWithResult.addFlags(268435456);
            int i4 = asBinder + 99;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }
        context.startActivity(intentOnExtraCallbackWithResult);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        FragmentActivity fragmentActivity = (FragmentActivity) objArr[1];
        int i = 2 % 2;
        if (!fragmentActivity.isFinishing() && !fragmentActivity.isDestroyed() && !(fragmentActivity instanceof PullUpWebActivity)) {
            int i2 = asBinder + 49;
            int i3 = i2 % 128;
            asInterface = i3;
            int i4 = i2 % 2;
            if (!(fragmentActivity instanceof BaseSchemeActivity)) {
                int i5 = i3 + 83;
                int i6 = i5 % 128;
                asBinder = i6;
                int i7 = i5 % 2;
                if (!(fragmentActivity instanceof BaseActivity) && !(fragmentActivity instanceof matchNames)) {
                    int i8 = i6 + 115;
                    asInterface = i8 % 128;
                    int i9 = i8 % 2;
                    return false;
                }
                if (fragmentActivity.getSupportFragmentManager().findFragmentByTag("pull_up_web_host") == null) {
                    int i10 = asBinder + 63;
                    int i11 = i10 % 128;
                    asInterface = i11;
                    int i12 = i10 % 2;
                    int i13 = i11 + 3;
                    asBinder = i13 % 128;
                    if (i13 % 2 == 0) {
                        return true;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0068, code lost:
    
        if ((r12 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x006a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006b, code lost:
    
        r12 = null;
        r12.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007e, code lost:
    
        if (r12.getLifecycle().IAuthTabCallback().isAtLeast(o.TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.RESUMED) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0080, code lost:
    
        r12 = o.setOnAdClosedListener.asInterface + 35;
        o.setOnAdClosedListener.asBinder = r12 % 128;
        r12 = r12 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0089, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0094, code lost:
    
        return !r12.getSupportFragmentManager().ICustomTabsService();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0036, code lost:
    
        if (((java.lang.Boolean) onExtraCallback(im.toss.features.payment.ui.offline.compose.screen.FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -2060633388, 2060633390, im.toss.features.payment.ui.offline.compose.screen.FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), im.toss.features.payment.ui.offline.compose.screen.FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new java.lang.Object[]{r11, r12}, im.toss.features.payment.ui.offline.compose.screen.FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult())).booleanValue() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x005d, code lost:
    
        if (((java.lang.Boolean) onExtraCallback(im.toss.features.payment.ui.offline.compose.screen.FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -2060633388, 2060633390, im.toss.features.payment.ui.offline.compose.screen.FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), im.toss.features.payment.ui.offline.compose.screen.FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new java.lang.Object[]{r11, r12}, im.toss.features.payment.ui.offline.compose.screen.FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult())).booleanValue() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005f, code lost:
    
        r12 = o.setOnAdClosedListener.asBinder + 99;
        o.setOnAdClosedListener.asInterface = r12 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean onNavigationEvent(androidx.fragment.app.FragmentActivity r12) {
        /*
            r11 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.setOnAdClosedListener.asInterface
            int r1 = r1 + 115
            int r2 = r1 % 128
            o.setOnAdClosedListener.asBinder = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L39
            java.lang.Object[] r8 = new java.lang.Object[]{r11, r12}
            int r3 = im.toss.features.payment.ui.offline.compose.screen.FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult()
            int r9 = im.toss.features.payment.ui.offline.compose.screen.FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult()
            int r6 = im.toss.features.payment.ui.offline.compose.screen.FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult()
            int r7 = im.toss.features.payment.ui.offline.compose.screen.FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult()
            r5 = 2060633390(0x7ad2c52e, float:5.471908E35)
            r4 = -2060633388(0xffffffff852d3ad4, float:-8.145226E-36)
            java.lang.Object r1 = onExtraCallback(r3, r4, r5, r6, r7, r8, r9)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r3 = 92
            int r3 = r3 / r2
            if (r1 != 0) goto L70
            goto L5f
        L39:
            java.lang.Object[] r9 = new java.lang.Object[]{r11, r12}
            int r4 = im.toss.features.payment.ui.offline.compose.screen.FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult()
            int r10 = im.toss.features.payment.ui.offline.compose.screen.FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult()
            int r7 = im.toss.features.payment.ui.offline.compose.screen.FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult()
            int r8 = im.toss.features.payment.ui.offline.compose.screen.FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult()
            r6 = 2060633390(0x7ad2c52e, float:5.471908E35)
            r5 = -2060633388(0xffffffff852d3ad4, float:-8.145226E-36)
            java.lang.Object r1 = onExtraCallback(r4, r5, r6, r7, r8, r9, r10)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L70
        L5f:
            int r12 = o.setOnAdClosedListener.asBinder
            int r12 = r12 + 99
            int r1 = r12 % 128
            o.setOnAdClosedListener.asInterface = r1
            int r12 = r12 % r0
            if (r12 == 0) goto L6b
            return r2
        L6b:
            r12 = 0
            r12.hashCode()
            throw r12
        L70:
            o.TextFieldKeyInputExternalSyntheticLambda9 r1 = r12.getLifecycle()
            o.TextFieldKeyInputExternalSyntheticLambda9$onExtraCallback r1 = r1.IAuthTabCallback()
            o.TextFieldKeyInputExternalSyntheticLambda9$onExtraCallback r3 = o.TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.RESUMED
            boolean r1 = r1.isAtLeast(r3)
            if (r1 != 0) goto L8a
            int r12 = o.setOnAdClosedListener.asInterface
            int r12 = r12 + 35
            int r1 = r12 % 128
            o.setOnAdClosedListener.asBinder = r1
            int r12 = r12 % r0
            return r2
        L8a:
            o.FlowMeasureLazyPolicyExternalSyntheticLambda3 r12 = r12.getSupportFragmentManager()
            boolean r12 = r12.ICustomTabsService()
            r12 = r12 ^ 1
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setOnAdClosedListener.onNavigationEvent(androidx.fragment.app.FragmentActivity):boolean");
    }

    private final Bundle onNavigationEvent(Uri uri) {
        int i = 2 % 2;
        Bundle bundle = new Bundle();
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Intrinsics.checkNotNullExpressionValue(queryParameterNames, "");
        Iterator<T> it = queryParameterNames.iterator();
        while (it.hasNext()) {
            int i2 = asInterface + 89;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                String str = (String) it.next();
                bundle.putString(str, uri.getQueryParameter(str));
                int i3 = 79 / 0;
            } else {
                String str2 = (String) it.next();
                bundle.putString(str2, uri.getQueryParameter(str2));
            }
        }
        int i4 = asInterface + 13;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return bundle;
    }

    private final SessionTrackerb onExtraCallback(Context context) {
        int i = 2 % 2;
        int i2 = asBinder + 41;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Response response = Response.onNavigationEvent;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        SessionTrackerb smallIconId = ((SessionTrackerb.onExtraCallback) Response.onExtraCallback(applicationContext, SessionTrackerb.onExtraCallback.class)).getSmallIconId();
        int i4 = asInterface + 95;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return smallIconId;
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, Throwable th) {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(iOnExtraCallbackWithResult, 2009877220, -2009877219, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{str, th}, iOnExtraCallbackWithResult2);
    }

    public static /* synthetic */ Unit onExtraCallback(Ref.BooleanRef booleanRef, Handler handler, Application application, onExtraCallbackWithResult onextracallbackwithresult) {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(iOnExtraCallbackWithResult, -1229227216, 1229227216, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{booleanRef, handler, application, onextracallbackwithresult}, iOnExtraCallbackWithResult2);
    }

    private final void IAuthTabCallback(Context context, Bundle bundle, AdSDKNotificationListener adSDKNotificationListener) {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        onExtraCallback(iOnExtraCallbackWithResult, -91461335, 91461338, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{this, context, bundle, adSDKNotificationListener}, iOnExtraCallbackWithResult2);
    }

    private final boolean onExtraCallbackWithResult(FragmentActivity fragmentActivity) {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return ((Boolean) onExtraCallback(iOnExtraCallbackWithResult, -2060633388, 2060633390, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{this, fragmentActivity}, iOnExtraCallbackWithResult2)).booleanValue();
    }

    static void onExtraCallback() {
        onNavigationEvent = (char) 21776;
        onExtraCallback = (char) 21005;
        IAuthTabCallback = (char) 39454;
        IAuthTabCallbackDefault = (char) 949;
    }
}
