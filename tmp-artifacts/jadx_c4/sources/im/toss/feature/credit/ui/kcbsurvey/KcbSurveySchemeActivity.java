package im.toss.feature.credit.ui.kcbsurvey;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import com.tmoney.LiveCheckConstants;
import im.toss.feature.credit.ui.kcbsurvey.KcbSurveyErrorActivity;
import im.toss.feature.credit.ui.kcbsurvey.KcbSurveySchemeActivity;
import im.toss.feature.credit.ui.kcbsurvey.notification.KcbSurveyNotificationTermActivity;
import im.toss.feature.credit.ui.kcbsurvey.result.KcbSurveyResultActivity;
import im.toss.features.credit.data.request.KcbSurveyRoundRequest;
import im.toss.features.credit.data.response.kcbsurvey.KcbSurveyEndLogResponse;
import im.toss.features.credit.data.response.kcbsurvey.KcbSurveyScheduleResponse;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AOMPFileConstant;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.GeckoHubImp;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.WebResourceResponseModel;
import o.access13800;
import o.access14300;
import o.access15300;
import o.access15400;
import o.findResAndMsg;
import o.getDevicePerformance;
import o.getHostnameVerifierokhttp;
import o.getParamImp;
import o.h5ScreenShotObserverOnChangeOpt;
import o.maybeUpdateAnimatable;
import o.putChannelInfo;
import o.rvInitOpt;
import o.setRandomHost;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class KcbSurveySchemeActivity extends Hilt_KcbSurveySchemeActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onWarmupCompleted Companion;
    private static int[] IAuthTabCallbackDefault = null;
    private static int IAuthTabCallbackStub = 1;
    private static int access000 = 0;
    private static int access100 = 1;
    private static int asBinder;
    public static final int asInterface;

    @Inject
    public getDevicePerformance kcbSurveyApi;
    private final Lazy onTransact = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.feature.credit.ui.kcbsurvey.KcbSurveySchemeActivity$$ExternalSyntheticLambda1
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 33;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            String strIAuthTabCallback = KcbSurveySchemeActivity.IAuthTabCallback(this.f$0);
            int i4 = onExtraCallback + 59;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return strIAuthTabCallback;
            }
            throw null;
        }
    });

    static final class IAuthTabCallbackDefault extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallbackDefault(access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 23;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            KcbSurveySchemeActivity kcbSurveySchemeActivity = KcbSurveySchemeActivity.this;
            if (i3 == 0) {
                int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
                KcbSurveySchemeActivity.IAuthTabCallback(JsParamKeys.onExtraCallbackWithResult(), -1231922225, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1231922226, iOnExtraCallbackWithResult2, new Object[]{kcbSurveySchemeActivity, this});
                throw null;
            }
            int iOnExtraCallbackWithResult3 = JsParamKeys.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult4 = JsParamKeys.onExtraCallbackWithResult();
            Object objIAuthTabCallback = KcbSurveySchemeActivity.IAuthTabCallback(JsParamKeys.onExtraCallbackWithResult(), -1231922225, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, 1231922226, iOnExtraCallbackWithResult4, new Object[]{kcbSurveySchemeActivity, this});
            int i4 = onExtraCallbackWithResult + 41;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }
    }

    public static final /* synthetic */ class onExtraCallbackWithResult {
        private static int IAuthTabCallback = 0;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        private static int onNavigationEvent = 1;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[IAuthTabCallback.values().length];
            try {
                iArr[IAuthTabCallback.COMPLETED.ordinal()] = 1;
                int i = IAuthTabCallback + 93;
                onNavigationEvent = i % 128;
                if (i % 2 != 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IAuthTabCallback.TIMEOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IAuthTabCallback.ETC.ordinal()] = 3;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IAuthTabCallback.EXPIRED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[IAuthTabCallback.DENIED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[IAuthTabCallback.ALREADY_COMPLETED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            onExtraCallbackWithResult = iArr;
            int[] iArr2 = new int[AOMPFileConstant.values().length];
            try {
                iArr2[AOMPFileConstant.NOT_YET.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[AOMPFileConstant.PARTICIPABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[AOMPFileConstant.NOT_PERIOD.ordinal()] = 3;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[AOMPFileConstant.DROP_OUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[AOMPFileConstant.TIMEOUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[AOMPFileConstant.EXPIRED.ordinal()] = 6;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[AOMPFileConstant.DENIED.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[AOMPFileConstant.ETC.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[AOMPFileConstant.ALREADY_COMPLETED.ordinal()] = 9;
                int i6 = IAuthTabCallback + 109;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 2 % 2;
                }
            } catch (NoSuchFieldError unused15) {
            }
            onWarmupCompleted = iArr2;
        }
    }

    static {
        onNavigationEvent();
        Companion = new onWarmupCompleted(null);
        asInterface = 8;
        int i = access100 + 109;
        access000 = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i5;
        int i8 = ~i2;
        int i9 = ~i4;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = (~(i4 | i2)) | (~(i7 | i9));
        int i12 = ~(i9 | i5 | i2);
        int i13 = i5 + i2 + i6 + ((-194346734) * i3) + (9035316 * i);
        int i14 = i13 * i13;
        int i15 = (((-787818500) * i5) - 443744256) + ((-1492047866) * i2) + (352114683 * i10) + (i11 * (-352114683)) + ((-352114683) * i12) + ((-1139933184) * i6) + (1190920192 * i3) + (1456996352 * i) + ((-1774911488) * i14);
        int i16 = (i5 * 1174986172) + 1294669563 + (i2 * 1174986598) + (i10 * (-213)) + (i11 * 213) + (i12 * 213) + (i6 * 1174986385) + (i3 * (-1060063438)) + (i * 107475828) + (i14 * 168099840);
        int i17 = i15 + (i16 * i16 * 40566784);
        return i17 != 1 ? i17 != 2 ? onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr) : onExtraCallback(objArr);
    }

    public static /* synthetic */ String IAuthTabCallback(KcbSurveySchemeActivity kcbSurveySchemeActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 95;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = JsParamKeys.onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnExtraCallbackWithResult4 = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = JsParamKeys.onExtraCallbackWithResult();
        String str = (String) IAuthTabCallback(JsParamKeys.onExtraCallbackWithResult(), -1086942128, iOnExtraCallbackWithResult6, iOnExtraCallbackWithResult4, 1086942130, iOnExtraCallbackWithResult5, new Object[]{kcbSurveySchemeActivity});
        int i3 = asBinder + 3;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 96 / 0;
        }
        return str;
    }

    public static /* synthetic */ Unit IAuthTabCallback(KcbSurveySchemeActivity kcbSurveySchemeActivity, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 87;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(kcbSurveySchemeActivity, dialogInterface);
        if (i3 != 0) {
            int i4 = 69 / 0;
        }
        int i5 = IAuthTabCallbackStub + 103;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 35;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 85;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 84 / 0;
        }
        return -1L;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        KcbSurveySchemeActivity kcbSurveySchemeActivity = (KcbSurveySchemeActivity) objArr[0];
        access13800<? super Unit> access13800Var = (access13800) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 29;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback = kcbSurveySchemeActivity.onExtraCallback(access13800Var);
        int i4 = asBinder + 39;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return objOnExtraCallback;
        }
        throw null;
    }

    public static final /* synthetic */ void onExtraCallback(KcbSurveySchemeActivity kcbSurveySchemeActivity, long j, long j2) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 107;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        kcbSurveySchemeActivity.onNavigationEvent(j, j2);
        if (i3 == 0) {
            throw null;
        }
        int i4 = asBinder + 55;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void onNavigationEvent(KcbSurveySchemeActivity kcbSurveySchemeActivity, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 55;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        kcbSurveySchemeActivity.onExtraCallback(str);
        int i4 = asBinder + 119;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public final getDevicePerformance onExtraCallback() {
        int i = 2 % 2;
        getDevicePerformance getdeviceperformance = this.kcbSurveyApi;
        Object obj = null;
        if (getdeviceperformance == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 61;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = i2 + 19;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return getdeviceperformance;
        }
        obj.hashCode();
        throw null;
    }

    private final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 67;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.onTransact.getValue();
        int i4 = IAuthTabCallbackStub + 63;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        getHostnameVerifierokhttp gethostnameverifierokhttp = (KcbSurveySchemeActivity) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 19;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        String strOnNavigationEvent = h5ScreenShotObserverOnChangeOpt.Companion.onNavigationEvent(gethostnameverifierokhttp.getIntent());
        int i4 = IAuthTabCallbackStub + 115;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return strOnNavigationEvent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.toss.feature.credit.ui.kcbsurvey.Hilt_KcbSurveySchemeActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        String stringExtra;
        String str;
        Object next;
        String upperCase;
        int i = 2 % 2;
        super.onCreate(bundle);
        Intent intent = getIntent();
        Object obj = null;
        if (intent != null) {
            int i2 = asBinder + 39;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            a(new int[]{187906010, -147292919, 1285197234, -1700775042}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(16) - 105, objArr);
            stringExtra = intent.getStringExtra(((String) objArr[0]).intern());
        } else {
            stringExtra = null;
        }
        Iterator it = IAuthTabCallback.getEntries().iterator();
        while (true) {
            str = "";
            if (!it.hasNext()) {
                next = null;
                break;
            }
            int i4 = asBinder + 17;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            next = it.next();
            String strName = ((IAuthTabCallback) next).name();
            if (stringExtra != null) {
                upperCase = stringExtra.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "");
            } else {
                upperCase = null;
            }
            if (Intrinsics.areEqual(strName, upperCase)) {
                int i6 = IAuthTabCallbackStub + 27;
                asBinder = i6 % 128;
                if (i6 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
            }
        }
        IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) next;
        if (iAuthTabCallback == null) {
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new asInterface(this, (access13800) null), 3, (Object) null);
            int i7 = asBinder + 19;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
            return;
        }
        int i9 = IAuthTabCallbackStub + 83;
        asBinder = i9 % 128;
        int i10 = i9 % 2;
        if (onExtraCallbackWithResult.onExtraCallbackWithResult[iAuthTabCallback.ordinal()] == 1) {
            Object[] objArr2 = {this, Integer.valueOf(rvInitOpt.onExtraCallbackWithResult.IAuthTabCallback())};
            IAuthTabCallback(JsParamKeys.onExtraCallbackWithResult(), -512650880, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 512650880, JsParamKeys.onExtraCallbackWithResult(), objArr2);
            return;
        }
        if (stringExtra != null) {
            String lowerCase = stringExtra.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (lowerCase != null) {
                str = lowerCase;
            }
        }
        onExtraCallback(str);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IAuthTabCallback {
        private static int $10 = 0;
        private static int $11 = 1;
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IAuthTabCallback[] $VALUES;
        public static final IAuthTabCallback ALREADY_COMPLETED;
        public static final IAuthTabCallback COMPLETED;
        public static final IAuthTabCallback DENIED;
        public static final IAuthTabCallback ETC;
        public static final IAuthTabCallback EXPIRED;
        private static int IAuthTabCallback = 1;
        public static final IAuthTabCallback TIMEOUT;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static long onWarmupCompleted;

        private static final /* synthetic */ IAuthTabCallback[] $values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 19;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            IAuthTabCallback[] iAuthTabCallbackArr = {COMPLETED, TIMEOUT, EXPIRED, DENIED, ETC, ALREADY_COMPLETED};
            int i5 = i2 + 115;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 41 / 0;
            }
            return iAuthTabCallbackArr;
        }

        public static EnumEntries<IAuthTabCallback> getEntries() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 55;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return $ENTRIES;
            }
            throw null;
        }

        public static IAuthTabCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 33;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
            int i4 = IAuthTabCallback + 23;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return iAuthTabCallback;
        }

        public static IAuthTabCallback[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 113;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback[] iAuthTabCallbackArr = (IAuthTabCallback[]) $VALUES.clone();
            int i4 = IAuthTabCallback + 39;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return iAuthTabCallbackArr;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i3 = $11 + 75;
                $10 = i3 % 128;
                int i4 = i3 % 2;
                int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 23 - TextUtils.lastIndexOf("", '0', 0), 19627 - KeyEvent.normalizeMetaState(0), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onWarmupCompleted ^ 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ImageFormat.getBitsPerPixel(0)), 58 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 6383 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
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
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 59, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i6 = $10 + 63;
                $11 = i6 % 128;
                int i7 = i6 % 2;
            }
            objArr[0] = new String(cArr2);
        }

        private IAuthTabCallback(String str, int i) {
        }

        static {
            onExtraCallbackWithResult();
            COMPLETED = new IAuthTabCallback("COMPLETED", 0);
            TIMEOUT = new IAuthTabCallback("TIMEOUT", 1);
            EXPIRED = new IAuthTabCallback("EXPIRED", 2);
            Object[] objArr = new Object[1];
            a(new char[]{44572, 29096, 4476, 12558, 53449, 61589}, 57270 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr);
            DENIED = new IAuthTabCallback(((String) objArr[0]).intern(), 3);
            ETC = new IAuthTabCallback("ETC", 4);
            ALREADY_COMPLETED = new IAuthTabCallback("ALREADY_COMPLETED", 5);
            IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
            $VALUES = iAuthTabCallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
            int i = onExtraCallback + 119;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        static void onExtraCallbackWithResult() {
            onWarmupCompleted = -5174122721661867153L;
        }
    }

    private static final Unit onExtraCallback(KcbSurveySchemeActivity kcbSurveySchemeActivity, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 125;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        kcbSurveySchemeActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 97;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 56 / 0;
        }
        return unit;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onExtraCallback(access13800<? super Unit> access13800Var) throws Throwable {
        IAuthTabCallbackDefault iAuthTabCallbackDefault;
        Object obj;
        int iIntValue;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 93;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if (access13800Var instanceof IAuthTabCallbackDefault) {
            iAuthTabCallbackDefault = (IAuthTabCallbackDefault) access13800Var;
            int i4 = iAuthTabCallbackDefault.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                iAuthTabCallbackDefault.label = i4 - 2147483648;
            } else {
                iAuthTabCallbackDefault = new IAuthTabCallbackDefault(access13800Var);
            }
        }
        Object objOnExtraCallback = iAuthTabCallbackDefault.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = iAuthTabCallbackDefault.label;
        int i6 = 1;
        try {
            if (i5 != 0) {
                int i7 = asBinder + 33;
                int i8 = i7 % 128;
                IAuthTabCallbackStub = i8;
                int i9 = i7 % 2;
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i10 = i8 + 59;
                asBinder = i10 % 128;
                int i11 = i10 % 2;
                ResultKt.onNavigationEvent(objOnExtraCallback);
            } else {
                ResultKt.onNavigationEvent(objOnExtraCallback);
                Result.Companion companion = Result.Companion;
                GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                onExtraCallback onextracallback = new onExtraCallback(null, this);
                iAuthTabCallbackDefault.L$0 = access15400.onNavigationEvent(iAuthTabCallbackDefault);
                iAuthTabCallbackDefault.I$0 = 0;
                iAuthTabCallbackDefault.I$1 = 0;
                iAuthTabCallbackDefault.I$2 = 0;
                iAuthTabCallbackDefault.label = 1;
                objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, onextracallback, iAuthTabCallbackDefault);
                if (objOnExtraCallback == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            obj = Result.constructor-impl(objOnExtraCallback);
        } catch (WebResourceResponseModel e) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(e));
        } catch (CancellationException e2) {
            throw e2;
        } catch (Exception e3) {
            Result.Companion companion3 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(e3));
        }
        if (Result.onNavigationEvent(obj)) {
            KcbSurveyScheduleResponse kcbSurveyScheduleResponse = (KcbSurveyScheduleResponse) obj;
            rvInitOpt rvinitopt = rvInitOpt.onExtraCallbackWithResult;
            Integer numOnNavigationEvent = kcbSurveyScheduleResponse.onNavigationEvent();
            if (numOnNavigationEvent != null) {
                int i12 = asBinder + 85;
                IAuthTabCallbackStub = i12 % 128;
                if (i12 % 2 == 0) {
                    iIntValue = numOnNavigationEvent.intValue();
                    int i13 = 65 / 0;
                } else {
                    iIntValue = numOnNavigationEvent.intValue();
                }
                i6 = iIntValue;
            }
            rvinitopt.onWarmupCompleted(i6);
            switch (onExtraCallbackWithResult.onWarmupCompleted[kcbSurveyScheduleResponse.onTransact().ordinal()]) {
                case 1:
                    ICustomTabsServiceDefault();
                    break;
                case 2:
                case 3:
                    setEngagementSignalsCallback();
                    int i14 = IAuthTabCallbackStub + 55;
                    asBinder = i14 % 128;
                    int i15 = i14 % 2;
                    break;
                case 4:
                case 5:
                    onExtraCallbackWithResult(IAuthTabCallback.TIMEOUT);
                    break;
                case 6:
                    onExtraCallbackWithResult(IAuthTabCallback.EXPIRED);
                    break;
                case 7:
                    onExtraCallbackWithResult(IAuthTabCallback.DENIED);
                    break;
                case 8:
                    onExtraCallbackWithResult(IAuthTabCallback.ETC);
                    break;
                case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                    onExtraCallbackWithResult(IAuthTabCallback.ALREADY_COMPLETED);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        Throwable th = Result.exceptionOrNull-impl(obj);
        if (th != null) {
            getParamImp.onWarmupCompleted(th, this, false, null, null, new Function1() { // from class: im.toss.feature.credit.ui.kcbsurvey.KcbSurveySchemeActivity$$ExternalSyntheticLambda0
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2) throws Throwable {
                    int i16 = 2 % 2;
                    int i17 = onWarmupCompleted + 105;
                    onExtraCallbackWithResult = i17 % 128;
                    int i18 = i17 % 2;
                    Unit unitIAuthTabCallback = KcbSurveySchemeActivity.IAuthTabCallback(this.f$0, (DialogInterface) obj2);
                    int i19 = onExtraCallbackWithResult + 89;
                    onWarmupCompleted = i19 % 128;
                    int i20 = i19 % 2;
                    return unitIAuthTabCallback;
                }
            }, 14, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ICustomTabsServiceDefault() throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 73;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        startActivity(KcbSurveyIntroActivity.Companion.IAuthTabCallback(this, IAuthTabCallback(), 1));
        finish();
        int i4 = IAuthTabCallbackStub + 37;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 87 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setEngagementSignalsCallback() throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 45;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            startActivity(KcbSurveyHistoryActivity.Companion.onWarmupCompleted(this, IAuthTabCallback()));
            finish();
            int i3 = 44 / 0;
        } else {
            startActivity(KcbSurveyHistoryActivity.Companion.onWarmupCompleted(this, IAuthTabCallback()));
            finish();
        }
        int i4 = IAuthTabCallbackStub + 27;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallback(String str) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 113;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        startActivity(KcbSurveyNotificationTermActivity.Companion.onExtraCallback(this, IAuthTabCallback(), str, true));
        finish();
        int i4 = asBinder + 79;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ int $round;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(int i, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$round = i;
        }

        public static /* synthetic */ Unit onExtraCallbackWithResult(KcbSurveySchemeActivity kcbSurveySchemeActivity, DialogInterface dialogInterface) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 91;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnNavigationEvent = onNavigationEvent(kcbSurveySchemeActivity, dialogInterface);
            if (i3 == 0) {
                int i4 = 23 / 0;
            }
            int i5 = onExtraCallbackWithResult + 67;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return unitOnNavigationEvent;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 13;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 111;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = KcbSurveySchemeActivity.this.new onNavigationEvent(this.$round, access13800Var);
            int i2 = onNavigationEvent + 41;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return onnavigationevent;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 77;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 69;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        public static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super KcbSurveyEndLogResponse>, Object> {
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;
            final /* synthetic */ int $round$inlined;
            int I$0;
            Object L$0;
            int label;
            final /* synthetic */ KcbSurveySchemeActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public onExtraCallbackWithResult(access13800 access13800Var, KcbSurveySchemeActivity kcbSurveySchemeActivity, int i) {
                super(2, access13800Var);
                this.this$0 = kcbSurveySchemeActivity;
                this.$round$inlined = i;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var, this.this$0, this.$round$inlined);
                int i2 = onExtraCallbackWithResult + 109;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 74 / 0;
                }
                return onextracallbackwithresult;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) throws TossApiCallException.ApiError {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 19;
                onWarmupCompleted = i2 % 128;
                Object obj3 = null;
                findResAndMsg findresandmsg = (findResAndMsg) obj;
                access13800<? super KcbSurveyEndLogResponse> access13800Var = (access13800) obj2;
                if (i2 % 2 == 0) {
                    onExtraCallbackWithResult(findresandmsg, access13800Var);
                    obj3.hashCode();
                    throw null;
                }
                Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
                int i3 = onExtraCallbackWithResult + 121;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    return objOnExtraCallbackWithResult;
                }
                obj3.hashCode();
                throw null;
            }

            public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super KcbSurveyEndLogResponse> access13800Var) throws TossApiCallException.ApiError {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 83;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                onExtraCallbackWithResult onextracallbackwithresultCreate = create(findresandmsg, access13800Var);
                Unit unit = Unit.INSTANCE;
                if (i3 == 0) {
                    return onextracallbackwithresultCreate.invokeSuspend(unit);
                }
                onextracallbackwithresultCreate.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
            public final Object invokeSuspend(Object obj) throws TossApiCallException.ApiError {
                int i = 2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    getDevicePerformance getdeviceperformanceOnExtraCallback = this.this$0.onExtraCallback();
                    KcbSurveyRoundRequest kcbSurveyRoundRequest = new KcbSurveyRoundRequest(this.$round$inlined);
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.label = 1;
                    obj = getdeviceperformanceOnExtraCallback.onExtraCallback(kcbSurveyRoundRequest, this);
                    if (obj == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i3 = onExtraCallbackWithResult + 61;
                    onWarmupCompleted = i3 % 128;
                    if (i3 % 2 == 0) {
                        ResultKt.onNavigationEvent(obj);
                        int i4 = 16 / 0;
                    } else {
                        ResultKt.onNavigationEvent(obj);
                    }
                }
                BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
                int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                if (!((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    throw apiErrorExtraCallbackWithResult;
                }
                int i5 = onWarmupCompleted + 17;
                onExtraCallbackWithResult = i5 % 128;
                Object obj2 = null;
                try {
                    if (i5 % 2 != 0) {
                        baseApiResponse.onTransact();
                        obj2.hashCode();
                        throw null;
                    }
                    Object objOnTransact = baseApiResponse.onTransact();
                    if (objOnTransact == null) {
                        throw new NullPointerException("null cannot be cast to non-null type im.toss.features.credit.data.response.kcbsurvey.KcbSurveyEndLogResponse");
                    }
                    int i6 = onExtraCallbackWithResult + 7;
                    onWarmupCompleted = i6 % 128;
                    if (i6 % 2 != 0) {
                        return (KcbSurveyEndLogResponse) objOnTransact;
                    }
                    obj2.hashCode();
                    throw null;
                } catch (NullPointerException e) {
                    if (!Intrinsics.areEqual(KcbSurveyEndLogResponse.class, Object.class)) {
                        int i7 = onWarmupCompleted + 109;
                        onExtraCallbackWithResult = i7 % 128;
                        int i8 = i7 % 2;
                        if (!Intrinsics.areEqual(KcbSurveyEndLogResponse.class, Unit.class)) {
                            TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                            apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                            throw apiErrorOnExtraCallbackWithResult;
                        }
                    }
                    KcbSurveyEndLogResponse kcbSurveyEndLogResponse = Unit.INSTANCE;
                    int i9 = onWarmupCompleted + 109;
                    onExtraCallbackWithResult = i9 % 128;
                    if (i9 % 2 == 0) {
                        return kcbSurveyEndLogResponse;
                    }
                    obj2.hashCode();
                    throw null;
                }
            }
        }

        private static final Unit onNavigationEvent(KcbSurveySchemeActivity kcbSurveySchemeActivity, DialogInterface dialogInterface) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 87;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            kcbSurveySchemeActivity.finish();
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 83;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
        /* JADX WARN: Type inference failed for: r3v2, types: [android.content.Context, im.toss.feature.credit.ui.kcbsurvey.KcbSurveySchemeActivity] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 91;
            onExtraCallbackWithResult = i2 % 128;
            Object obj3 = null;
            if (i2 % 2 != 0) {
                access14300.onWarmupCompleted();
                obj3.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            try {
                if (i3 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    KcbSurveySchemeActivity kcbSurveySchemeActivity = KcbSurveySchemeActivity.this;
                    int i4 = this.$round;
                    Result.Companion companion = Result.Companion;
                    GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                    onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(null, kcbSurveySchemeActivity, i4);
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.I$2 = 0;
                    this.label = 1;
                    obj = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, onextracallbackwithresult, this);
                    if (obj == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                obj2 = Result.constructor-impl(obj);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (WebResourceResponseModel e3) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
            }
            int i5 = this.$round;
            KcbSurveySchemeActivity kcbSurveySchemeActivity2 = KcbSurveySchemeActivity.this;
            if (Result.onNavigationEvent(obj2)) {
                KcbSurveyEndLogResponse kcbSurveyEndLogResponse = (KcbSurveyEndLogResponse) obj2;
                Long lOnExtraCallback = kcbSurveyEndLogResponse.onExtraCallback();
                Long lOnExtraCallbackWithResult = kcbSurveyEndLogResponse.onExtraCallbackWithResult();
                if (i5 == 6) {
                    int i6 = onExtraCallbackWithResult;
                    int i7 = i6 + 121;
                    onNavigationEvent = i7 % 128;
                    if (i7 % 2 == 0) {
                        throw null;
                    }
                    if (lOnExtraCallback != null) {
                        int i8 = i6 + 37;
                        onNavigationEvent = i8 % 128;
                        int i9 = i8 % 2;
                        if (lOnExtraCallbackWithResult != null) {
                            KcbSurveySchemeActivity.onExtraCallback(kcbSurveySchemeActivity2, lOnExtraCallback.longValue(), lOnExtraCallbackWithResult.longValue());
                        } else {
                            KcbSurveySchemeActivity.onNavigationEvent(kcbSurveySchemeActivity2, "completed");
                            int i10 = onNavigationEvent + 97;
                            onExtraCallbackWithResult = i10 % 128;
                            int i11 = i10 % 2;
                        }
                    }
                }
            }
            final ?? r3 = KcbSurveySchemeActivity.this;
            Throwable th = Result.exceptionOrNull-impl(obj2);
            if (th != null) {
                getParamImp.onWarmupCompleted(th, r3, false, null, null, new Function1() { // from class: im.toss.feature.credit.ui.kcbsurvey.KcbSurveySchemeActivity$endSurvey$1$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj4) throws Throwable {
                        int i12 = 2 % 2;
                        int i13 = onExtraCallbackWithResult + 3;
                        IAuthTabCallback = i13 % 128;
                        if (i13 % 2 != 0) {
                            KcbSurveySchemeActivity.onNavigationEvent.onExtraCallbackWithResult(r3, (DialogInterface) obj4);
                            Object obj5 = null;
                            obj5.hashCode();
                            throw null;
                        }
                        Unit unitOnExtraCallbackWithResult = KcbSurveySchemeActivity.onNavigationEvent.onExtraCallbackWithResult(r3, (DialogInterface) obj4);
                        int i14 = onExtraCallbackWithResult + 15;
                        IAuthTabCallback = i14 % 128;
                        int i15 = i14 % 2;
                        return unitOnExtraCallbackWithResult;
                    }
                }, 14, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super KcbSurveyScheduleResponse>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        int I$0;
        Object L$0;
        int label;
        final /* synthetic */ KcbSurveySchemeActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallback(access13800 access13800Var, KcbSurveySchemeActivity kcbSurveySchemeActivity) {
            super(2, access13800Var);
            this.this$0 = kcbSurveySchemeActivity;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(access13800Var, this.this$0);
            int i2 = onNavigationEvent + 5;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 77;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super KcbSurveyScheduleResponse> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                onNavigationEvent(findresandmsg, access13800Var);
                throw null;
            }
            Object objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
            int i3 = onNavigationEvent + 15;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 7 / 0;
            }
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super KcbSurveyScheduleResponse> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 109;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallbackCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                return onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i4 = 36 / 0;
            return onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
        public final Object invokeSuspend(Object obj) throws TossApiCallException.ApiError {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 93;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                getDevicePerformance getdeviceperformanceOnExtraCallback = this.this$0.onExtraCallback();
                this.L$0 = access15400.onNavigationEvent(this);
                this.I$0 = 0;
                this.label = 1;
                obj = getdeviceperformanceOnExtraCallback.onExtraCallback(this);
                if (obj == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
            int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            if (!((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                if (apiErrorExtraCallbackWithResult == null) {
                    throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                }
                throw apiErrorExtraCallbackWithResult;
            }
            try {
                Object objOnTransact = baseApiResponse.onTransact();
                if (objOnTransact != null) {
                    return (KcbSurveyScheduleResponse) objOnTransact;
                }
                throw new NullPointerException("null cannot be cast to non-null type im.toss.features.credit.data.response.kcbsurvey.KcbSurveyScheduleResponse");
            } catch (NullPointerException e) {
                if (!Intrinsics.areEqual(KcbSurveyScheduleResponse.class, Object.class)) {
                    int i5 = onNavigationEvent + 115;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 == 0) {
                        Intrinsics.areEqual(KcbSurveyScheduleResponse.class, Unit.class);
                        throw null;
                    }
                    if (!Intrinsics.areEqual(KcbSurveyScheduleResponse.class, Unit.class)) {
                        TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                        apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                        throw apiErrorOnExtraCallbackWithResult;
                    }
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onNavigationEvent(long j, long j2) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 71;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            startActivity(KcbSurveyResultActivity.Companion.IAuthTabCallback(this, IAuthTabCallback(), j, j2));
            finish();
        } else {
            startActivity(KcbSurveyResultActivity.Companion.IAuthTabCallback(this, IAuthTabCallback(), j, j2));
            finish();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = IAuthTabCallbackDefault;
        int i4 = -1469660336;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 1), 72 - (ViewConfiguration.getPressedStateDuration() >> 16), 8848 - View.MeasureSpec.makeMeasureSpec(0, 0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i5] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i5++;
                    i4 = -1469660336;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = IAuthTabCallbackDefault;
        if (iArr5 != null) {
            int i6 = $11 + 13;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i8 = 0;
            while (i8 < length3) {
                int i9 = $10 + 29;
                $11 = i9 % 128;
                if (i9 % i2 == 0) {
                    Object[] objArr3 = {Integer.valueOf(iArr5[i8])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 73 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (ViewConfiguration.getLongPressTimeout() >> 16) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i8] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i8 >>>= 1;
                } else {
                    Object[] objArr4 = {Integer.valueOf(iArr5[i8])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 73 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 8848 - (ViewConfiguration.getTouchSlop() >> 8), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i8] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    i8++;
                }
                i2 = 2;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i10 = 0;
            for (int i11 = 16; i10 < i11; i11 = 16) {
                int i12 = $10 + 111;
                $11 = i12 % 128;
                if (i12 % 2 == 0) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i10];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0) + 22253), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 38, 10301 - View.resolveSizeAndState(0, 0, 0), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i10 += 117;
                } else {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i10];
                    Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 22253), KeyEvent.normalizeMetaState(0) + 39, View.getDefaultSize(0, 0) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue2;
                    i10++;
                }
                int i13 = $10 + 1;
                $11 = i13 % 128;
                int i14 = i13 % 2;
            }
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i15;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr7 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback6 == null) {
                objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 78 - KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback6).invoke(null, objArr7);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        KcbSurveySchemeActivity kcbSurveySchemeActivity = (KcbSurveySchemeActivity) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 25;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (iIntValue <= 0) {
            int i4 = i2 + 97;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                kcbSurveySchemeActivity.finish();
                return null;
            }
            kcbSurveySchemeActivity.finish();
            throw null;
        }
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(kcbSurveySchemeActivity), (CoroutineContext) null, (setRandomHost) null, kcbSurveySchemeActivity.new onNavigationEvent(iIntValue, null), 3, (Object) null);
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallbackWithResult(IAuthTabCallback iAuthTabCallback) throws Throwable {
        KcbSurveyErrorActivity.IAuthTabCallback iAuthTabCallback2;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 19;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        KcbSurveyErrorActivity.onExtraCallback onextracallback = KcbSurveyErrorActivity.Companion;
        String strIAuthTabCallback = IAuthTabCallback();
        switch (onExtraCallbackWithResult.onExtraCallbackWithResult[iAuthTabCallback.ordinal()]) {
            case 1:
                int i4 = IAuthTabCallbackStub + 13;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
            case 2:
                iAuthTabCallback2 = KcbSurveyErrorActivity.IAuthTabCallback.TIME_OUT;
                break;
            case 3:
                iAuthTabCallback2 = KcbSurveyErrorActivity.IAuthTabCallback.ETC;
                break;
            case 4:
                iAuthTabCallback2 = KcbSurveyErrorActivity.IAuthTabCallback.EXPIRED;
                break;
            case 5:
                iAuthTabCallback2 = KcbSurveyErrorActivity.IAuthTabCallback.DENIED;
                int i6 = asBinder + 65;
                IAuthTabCallbackStub = i6 % 128;
                int i7 = i6 % 2;
                break;
            case 6:
                iAuthTabCallback2 = KcbSurveyErrorActivity.IAuthTabCallback.ALREADY_COMPLETED;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        startActivity(onextracallback.onExtraCallback(this, strIAuthTabCallback, iAuthTabCallback2));
        finish();
        int i42 = IAuthTabCallbackStub + 13;
        asBinder = i42 % 128;
        int i52 = i42 % 2;
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    public static final /* synthetic */ Object onExtraCallbackWithResult(KcbSurveySchemeActivity kcbSurveySchemeActivity, access13800 access13800Var) {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = JsParamKeys.onExtraCallbackWithResult();
        return IAuthTabCallback(JsParamKeys.onExtraCallbackWithResult(), -1231922225, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult, 1231922226, iOnExtraCallbackWithResult2, new Object[]{kcbSurveySchemeActivity, access13800Var});
    }

    private final void onWarmupCompleted(int i) {
        Object[] objArr = {this, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        IAuthTabCallback(JsParamKeys.onExtraCallbackWithResult(), -512650880, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 512650880, iOnExtraCallbackWithResult2, objArr);
    }

    private static final String onExtraCallback(KcbSurveySchemeActivity kcbSurveySchemeActivity) {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = JsParamKeys.onExtraCallbackWithResult();
        return (String) IAuthTabCallback(JsParamKeys.onExtraCallbackWithResult(), -1086942128, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult, 1086942130, iOnExtraCallbackWithResult2, new Object[]{kcbSurveySchemeActivity});
    }

    @Override // im.toss.feature.credit.ui.kcbsurvey.Hilt_KcbSurveySchemeActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = asBinder + 11;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            int i4 = 79 / 0;
        }
    }

    @Override // im.toss.feature.credit.ui.kcbsurvey.Hilt_KcbSurveySchemeActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 37;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = IAuthTabCallbackStub + 9;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.feature.credit.ui.kcbsurvey.Hilt_KcbSurveySchemeActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 59;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = asBinder + 25;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 12 / 0;
        }
    }

    @Override // im.toss.feature.credit.ui.kcbsurvey.Hilt_KcbSurveySchemeActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 37;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = asBinder + 35;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    static void onNavigationEvent() {
        IAuthTabCallbackDefault = new int[]{1588030698, 1848578257, -105945599, 1193107441, -687418548, -595803018, -899957731, 69769559, -109335644, -1392482204, -711334975, 342502947, 842045548, -312922508, -1336243970, -1631343777, -231739718, 1062221744};
    }
}
