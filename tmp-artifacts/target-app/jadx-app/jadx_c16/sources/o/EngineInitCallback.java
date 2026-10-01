package o;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.base.BaseActivity;
import im.toss.base.BaseFragment;
import im.toss.features.foreigner.home.R;
import im.toss.features.kyc.navigation.models.AddressModuleType;
import im.toss.features.kyc.navigation.models.CddProcessType;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.rx2.RxAwaitKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class EngineInitCallback {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static char[] onNavigationEvent = {27258, 27176, 27175, 27168, 27198, 27167, 27137, 27169, 27172, 27141, 27263, 27160, 27165, 27138, 27176, 27175, 27168, 27139, 27142, 27175, 27175, 27170, 27199, 27175, 27175, 27199, 27166, 27143, 27172, 27171, 27174, 27178, 27173, 27137, 27145, 27177, 27198, 27171, 27143, 27142, 27179, 27176, 27178, 27177, 27138, 27137, 27169, 27172, 27177, 27168, 27194, 27196, 27199, 27160, 27258, 27233, 27167, 27197, 27172, 27172, 27168, 27176, 27142, 27167, 27199, 27199, 27197, 27166, 27141, 27173, 27136, 27216, 27167, 27174, 27198, 27168, 27152, 27183, 27173, 27179, 27177, 27160, 27159, 27173, 27178, 27174, 27174, 27154, 27152, 27168, 27198, 27198, 27199, 27136, 27167, 27199, 27175, 27175, 27175, 27179, 27173, 27170, 27162, 27154, 27170, 27175, 27173, 27176, 27168, 27168, 27198, 27165, 27167, 27199, 27199, 27196, 27175, 27181, 27180, 27142, 27233, 27258, 27160, 27197, 27199, 27199, 27197, 27173, 27172, 27196, 27194};
    private static int onWarmupCompleted = 1;

    static final class onWarmupCompleted extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 83;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnNavigationEvent = EngineInitCallback.onNavigationEvent(null, null, false, this);
            int i4 = onExtraCallback + 25;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }
    }

    public static final void onWarmupCompleted(@NotNull BaseActivity baseActivity, @NotNull SessionTrackerb sessionTrackerb) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(baseActivity, "");
        Intrinsics.checkNotNullParameter(sessionTrackerb, "");
        String strEncode = URLEncoder.encode(baseActivity.getString(R.string.foreigner_home_withdraw_agreement_title), "UTF-8");
        Context context = baseActivity.getContext();
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new int[]{71, 60, 0, 0}, true, new byte[]{1, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0}, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(strEncode);
        SessionTrackerb.onExtraCallbackWithResult(sessionTrackerb, context, sb.toString(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        int i2 = onWarmupCompleted + 25;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(BaseFragment baseFragment, getEnableJsT2 getenablejst2, boolean z, access13800 access13800Var, int i, Object obj) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 5;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        if (i3 % 2 == 0 ? (i & 2) != 0 : (i & 2) != 0) {
            int i5 = i4 + 39;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        Object objOnNavigationEvent = onNavigationEvent(baseFragment, getenablejst2, z, access13800Var);
        int i7 = onWarmupCompleted + 5;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return objOnNavigationEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object onNavigationEvent(@NotNull BaseFragment baseFragment, @NotNull getEnableJsT2 getenablejst2, boolean z, @NotNull access13800<? super Unit> access13800Var) throws Throwable {
        onWarmupCompleted onwarmupcompleted;
        BaseFragment baseFragment2;
        Object obj;
        Throwable th;
        BaseFragment baseFragment3 = baseFragment;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        if (access13800Var instanceof onWarmupCompleted) {
            onwarmupcompleted = (onWarmupCompleted) access13800Var;
            int i4 = onwarmupcompleted.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = onExtraCallback + 31;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    onwarmupcompleted.label = i4 % Integer.MIN_VALUE;
                } else {
                    onwarmupcompleted.label = i4 - 2147483648;
                }
            } else {
                onwarmupcompleted = new onWarmupCompleted(access13800Var);
            }
        }
        onWarmupCompleted onwarmupcompleted2 = onwarmupcompleted;
        Object objOnWarmupCompleted = onwarmupcompleted2.result;
        Object objOnWarmupCompleted2 = access14300.onWarmupCompleted();
        int i6 = onwarmupcompleted2.label;
        try {
            if (i6 == 0) {
                ResultKt.onNavigationEvent(objOnWarmupCompleted);
                String string = z ? baseFragment3.getString(R.string.foreigner_home_kyc_funnel_title_home_opened) : baseFragment3.getString(R.string.foreigner_home_kyc_funnel_title_default);
                Intrinsics.checkNotNull(string);
                String string2 = baseFragment3.getString(R.string.foreigner_home_kyc_success, new Object[]{PlayerErrorCode.onPostMessage()});
                Intrinsics.checkNotNullExpressionValue(string2, "");
                Object[] objArr = new Object[1];
                a(new int[]{0, 71, 0, 48}, false, new byte[]{1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0}, objArr);
                getExtUrl getexturl = new getExtUrl(1L, -1L, new getExtModel(string, string2, "", new TemplateConfigModel(60, ((String) objArr[0]).intern())), setUcJsT2.PAGE, false, false, (AddressModuleType) null, (CddProcessType) null, 224, (DefaultConstructorMarker) null);
                try {
                    Result.Companion companion = Result.Companion;
                    writeRaw writerawOnExtraCallbackWithResult = getEnableJsT2.onExtraCallbackWithResult(getenablejst2, baseFragment, getexturl, false, false, 12, (Object) null);
                    onwarmupcompleted2.L$0 = baseFragment3;
                    onwarmupcompleted2.L$1 = access15400.onNavigationEvent(getenablejst2);
                    onwarmupcompleted2.L$2 = access15400.onNavigationEvent(string);
                    onwarmupcompleted2.L$3 = access15400.onNavigationEvent(getexturl);
                    onwarmupcompleted2.L$4 = access15400.onNavigationEvent(onwarmupcompleted2);
                    onwarmupcompleted2.Z$0 = z;
                    onwarmupcompleted2.I$0 = 0;
                    onwarmupcompleted2.I$1 = 0;
                    onwarmupcompleted2.label = 1;
                    objOnWarmupCompleted = RxAwaitKt.onWarmupCompleted(writerawOnExtraCallbackWithResult, onwarmupcompleted2);
                    if (objOnWarmupCompleted == objOnWarmupCompleted2) {
                        return objOnWarmupCompleted2;
                    }
                    baseFragment2 = baseFragment3;
                } catch (WebResourceResponseModel e) {
                    e = e;
                    Result.Companion companion2 = Result.Companion;
                    obj = Result.constructor-impl(ResultKt.createFailure(e));
                    baseFragment2 = baseFragment3;
                    th = Result.exceptionOrNull-impl(obj);
                    if (th != null) {
                    }
                    return Unit.INSTANCE;
                } catch (Exception e2) {
                    e = e2;
                    Result.Companion companion3 = Result.Companion;
                    obj = Result.constructor-impl(ResultKt.createFailure(e));
                    baseFragment2 = baseFragment3;
                    th = Result.exceptionOrNull-impl(obj);
                    if (th != null) {
                    }
                    return Unit.INSTANCE;
                }
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                baseFragment2 = (BaseFragment) onwarmupcompleted2.L$0;
                try {
                    ResultKt.onNavigationEvent(objOnWarmupCompleted);
                } catch (WebResourceResponseModel e3) {
                    e = e3;
                    baseFragment3 = baseFragment2;
                    Result.Companion companion22 = Result.Companion;
                    obj = Result.constructor-impl(ResultKt.createFailure(e));
                    baseFragment2 = baseFragment3;
                    th = Result.exceptionOrNull-impl(obj);
                    if (th != null) {
                    }
                    return Unit.INSTANCE;
                } catch (Exception e4) {
                    e = e4;
                    baseFragment3 = baseFragment2;
                    Result.Companion companion32 = Result.Companion;
                    obj = Result.constructor-impl(ResultKt.createFailure(e));
                    baseFragment2 = baseFragment3;
                    th = Result.exceptionOrNull-impl(obj);
                    if (th != null) {
                    }
                    return Unit.INSTANCE;
                }
            }
            obj = Result.constructor-impl(objOnWarmupCompleted);
            int i7 = onExtraCallback + 79;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            th = Result.exceptionOrNull-impl(obj);
            if (th != null) {
                String string3 = zzcy.onNavigationEvent(th, 0, 1, (Object) null) ? baseFragment2.getString(im.toss.base.R.string.base_network_error) : baseFragment2.getString(R.string.foreigner_home_unexpected_error);
                Intrinsics.checkNotNull(string3);
                View view = baseFragment2.getView();
                if (view != null) {
                    TdsToastV1.onNavigationEvent.onNavigationEvent(new TdsToastV1.onNavigationEvent(view, string3), im.toss.core.R.drawable.icn_attention_color, 0, 2, (Object) null).onNavigationEvent();
                    int i9 = onExtraCallback + 9;
                    onWarmupCompleted = i9 % 128;
                    int i10 = i9 % 2;
                }
            }
            return Unit.INSTANCE;
        } catch (CancellationException e5) {
            throw e5;
        }
    }

    public static final void IAuthTabCallback(@NotNull BaseFragment baseFragment, @NotNull SessionTrackerb sessionTrackerb) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(baseFragment, "");
        Intrinsics.checkNotNullParameter(sessionTrackerb, "");
        String strEncode = URLEncoder.encode(baseFragment.getString(R.string.foreigner_home_withdraw_agreement_title), "UTF-8");
        Context context = baseFragment.getContext();
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new int[]{71, 60, 0, 0}, true, new byte[]{1, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0}, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(strEncode);
        SessionTrackerb.onExtraCallbackWithResult(sessionTrackerb, context, sb.toString(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        int i2 = onExtraCallback + 57;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr;
        int i = 2;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = onNavigationEvent;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 93;
                $10 = i8 % 128;
                if (i8 % i != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 35283), 34 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), AndroidCharacter.getMirror('0') + 14191, -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr3[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i7--;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i7])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - TextUtils.getCapsMode("", 0, 0)), 35 - TextUtils.getOffsetAfter("", 0), KeyEvent.keyCodeFromString("") + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i7++;
                }
                i = 2;
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i4];
        System.arraycopy(cArr2, i3, cArr4, 0, i4);
        if (bArr != null) {
            int i9 = $10 + 47;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                cArr = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
            } else {
                cArr = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            }
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.normalizeMetaState(0) + 10935), 65 - ExpandableListView.getPackedPositionGroup(0L), 16718 - Color.alpha(0), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i10] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                } else {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr5 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 29, View.MeasureSpec.getSize(0) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i11] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                }
                c = cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.combineMeasuredStates(0, 0) + 49467), 70 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), Color.alpha(0) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            cArr4 = cArr;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr4, 0, cArr5, 0, i4);
            int i12 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr4, i12, i6);
            System.arraycopy(cArr5, i6, cArr4, 0, i12);
        }
        if (z) {
            int i13 = $10 + 115;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr4 = cArr6;
        }
        if (i5 > 0) {
            int i15 = $10 + 77;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr4);
    }
}
