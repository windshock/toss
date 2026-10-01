package im.toss.feature.credit.ui.kcbsurvey.result;

import android.content.Context;
import android.content.Intent;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.LiveCheckConstants;
import im.toss.TossApplication;
import im.toss.feature.credit.ui.kcbsurvey.notification.KcbSurveyNotificationTermActivity;
import im.toss.feature.credit.ui.kcbsurvey.result.KcbSurveyResultScoreRaisedActivity;
import java.lang.reflect.Method;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.access13800;
import o.getAppAlias;
import o.getHostnameVerifierokhttp;
import o.h5ScreenShotObserverOnChangeOpt;
import o.maybeUpdateAnimatable;
import o.setRandomHost;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class KcbSurveyResultActivity extends Hilt_KcbSurveyResultActivity {
    private static int IAuthTabCallbackStubProxy = 1;
    private static int access100 = 0;
    private static int asInterface = 0;
    private static int getInterfaceDescriptor = 1;

    @Inject
    public getAppAlias creditGatewayApi;
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    public static final int onTransact = 8;
    private final Lazy asBinder = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.feature.credit.ui.kcbsurvey.result.KcbSurveyResultActivity$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 113;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            String strOnExtraCallback = KcbSurveyResultActivity.onExtraCallback(this.f$0);
            int i4 = IAuthTabCallback + 63;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return strOnExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    });
    private final Lazy IAuthTabCallbackDefault = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.feature.credit.ui.kcbsurvey.result.KcbSurveyResultActivity$$ExternalSyntheticLambda1
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 35;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Long.valueOf(KcbSurveyResultActivity.onExtraCallbackWithResult(this.f$0));
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Long lValueOf = Long.valueOf(KcbSurveyResultActivity.onExtraCallbackWithResult(this.f$0));
            int i3 = onWarmupCompleted + 13;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 29 / 0;
            }
            return lValueOf;
        }
    });
    private final Lazy IAuthTabCallbackStub = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.feature.credit.ui.kcbsurvey.result.KcbSurveyResultActivity$$ExternalSyntheticLambda2
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 53;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Long lValueOf = Long.valueOf(KcbSurveyResultActivity.onNavigationEvent(this.f$0));
            int i4 = IAuthTabCallback + 83;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 70 / 0;
            }
            return lValueOf;
        }
    });

    static {
        int i = access100 + 51;
        IAuthTabCallbackStubProxy = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i3;
        int i8 = i2 | i7 | (~i4);
        int i9 = ~i2;
        int i10 = (~(i4 | i7)) | (~(i7 | i9));
        int i11 = i3 + i2 + i + ((-92689393) * i6) + (1942122663 * i5);
        int i12 = i11 * i11;
        int i13 = (((-665130586) * i3) - 357761024) + ((-674687396) * i2) + (4778405 * i8) + (i9 * (-4778405)) + ((-4778405) * i10) + ((-669908992) * i) + ((-1056047104) * i6) + ((-742522880) * i5) + ((-592117760) * i12);
        int i14 = (i3 * 1048061654) + 1366922925 + (i2 * 1048062268) + (i8 * (-307)) + (i9 * 307) + (i10 * 307) + (i * 1048061961) + (i6 * 439444615) + (i5 * (-1279783457)) + (i12 * 173867008);
        return i13 + ((i14 * i14) * (-1898250240)) != 1 ? onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr);
    }

    public static /* synthetic */ String onExtraCallback(KcbSurveyResultActivity kcbSurveyResultActivity) {
        int i = 2 % 2;
        int i2 = asInterface + 81;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback2 = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback3 = TossApplication.onSessionEnded.onExtraCallback();
        String str = (String) IAuthTabCallback(iOnExtraCallback2, -772840485, 772840485, iOnExtraCallback, TossApplication.onSessionEnded.onExtraCallback(), new Object[]{kcbSurveyResultActivity}, iOnExtraCallback3);
        int i4 = getInterfaceDescriptor + 125;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ long onExtraCallbackWithResult(KcbSurveyResultActivity kcbSurveyResultActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 63;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            asInterface(kcbSurveyResultActivity);
            obj.hashCode();
            throw null;
        }
        long jAsInterface = asInterface(kcbSurveyResultActivity);
        int i3 = asInterface + 125;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            return jAsInterface;
        }
        throw null;
    }

    public static /* synthetic */ long onNavigationEvent(KcbSurveyResultActivity kcbSurveyResultActivity) {
        int i = 2 % 2;
        int i2 = asInterface + 55;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        long jIAuthTabCallbackDefault = IAuthTabCallbackDefault(kcbSurveyResultActivity);
        int i4 = asInterface + 43;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return jIAuthTabCallbackDefault;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = asInterface + 73;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return -1L;
        }
        int i3 = 52 / 0;
        return -1L;
    }

    public static final /* synthetic */ void IAuthTabCallback(KcbSurveyResultActivity kcbSurveyResultActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 43;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        kcbSurveyResultActivity.ICustomTabsServiceStub();
        if (i3 != 0) {
            int i4 = 62 / 0;
        }
    }

    public static final /* synthetic */ void onWarmupCompleted(KcbSurveyResultActivity kcbSurveyResultActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 55;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        kcbSurveyResultActivity.ICustomTabsServiceDefault();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = getInterfaceDescriptor + 57;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final getAppAlias IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 31;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        getAppAlias getappalias = this.creditGatewayApi;
        if (getappalias != null) {
            return getappalias;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i3 = asInterface + 35;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 30 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        getHostnameVerifierokhttp gethostnameverifierokhttp = (KcbSurveyResultActivity) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 57;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        String strOnNavigationEvent = h5ScreenShotObserverOnChangeOpt.Companion.onNavigationEvent(gethostnameverifierokhttp.getIntent());
        int i4 = asInterface + 13;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return strOnNavigationEvent;
    }

    private final String updateVisuals() {
        int i = 2 % 2;
        int i2 = asInterface + 5;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.asBinder.getValue();
        if (i3 != 0) {
            return (String) value;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final long asInterface(KcbSurveyResultActivity kcbSurveyResultActivity) {
        int i = 2 % 2;
        int i2 = asInterface + 25;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            kcbSurveyResultActivity.getIntent();
            throw null;
        }
        Intent intent = kcbSurveyResultActivity.getIntent();
        long longExtra = intent != null ? intent.getLongExtra("raisedScore", -1L) : -1L;
        int i3 = asInterface + 3;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return longExtra;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        KcbSurveyResultActivity kcbSurveyResultActivity = (KcbSurveyResultActivity) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 123;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object value = kcbSurveyResultActivity.IAuthTabCallbackDefault.getValue();
        if (i3 != 0) {
            ((Number) value).longValue();
            throw null;
        }
        long jLongValue = ((Number) value).longValue();
        int i4 = asInterface + 115;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return Long.valueOf(jLongValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final long IAuthTabCallbackDefault(KcbSurveyResultActivity kcbSurveyResultActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 39;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = kcbSurveyResultActivity.getIntent();
        if (intent == null) {
            return -1L;
        }
        int i4 = getInterfaceDescriptor + 1;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return intent.getLongExtra("finalScore", -1L);
        }
        intent.getLongExtra("finalScore", -1L);
        throw null;
    }

    private final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 13;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        long jLongValue = ((Number) this.IAuthTabCallbackStub.getValue()).longValue();
        int i4 = asInterface + 107;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return jLongValue;
    }

    @Override // im.toss.feature.credit.ui.kcbsurvey.result.Hilt_KcbSurveyResultActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 53;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback2 = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback3 = TossApplication.onSessionEnded.onExtraCallback();
        if (((Long) IAuthTabCallback(iOnExtraCallback2, 517567178, -517567177, iOnExtraCallback, TossApplication.onSessionEnded.onExtraCallback(), new Object[]{this}, iOnExtraCallback3)).longValue() > 0) {
            ICustomTabsServiceDefault();
            return;
        }
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(this, (access13800) null), 3, (Object) null);
        int i4 = getInterfaceDescriptor + 51;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ICustomTabsServiceDefault() throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 103;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            KcbSurveyResultScoreRaisedActivity.onWarmupCompleted onwarmupcompleted = KcbSurveyResultScoreRaisedActivity.Companion;
            String strUpdateVisuals = updateVisuals();
            int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
            int iOnExtraCallback2 = TossApplication.onSessionEnded.onExtraCallback();
            int iOnExtraCallback3 = TossApplication.onSessionEnded.onExtraCallback();
            startActivity(onwarmupcompleted.onWarmupCompleted(this, strUpdateVisuals, ((Long) IAuthTabCallback(iOnExtraCallback2, 517567178, -517567177, iOnExtraCallback, TossApplication.onSessionEnded.onExtraCallback(), new Object[]{this}, iOnExtraCallback3)).longValue(), onNavigationEvent()));
            finish();
            return;
        }
        KcbSurveyResultScoreRaisedActivity.onWarmupCompleted onwarmupcompleted2 = KcbSurveyResultScoreRaisedActivity.Companion;
        String strUpdateVisuals2 = updateVisuals();
        int iOnExtraCallback4 = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback5 = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback6 = TossApplication.onSessionEnded.onExtraCallback();
        startActivity(onwarmupcompleted2.onWarmupCompleted(this, strUpdateVisuals2, ((Long) IAuthTabCallback(iOnExtraCallback5, 517567178, -517567177, iOnExtraCallback4, TossApplication.onSessionEnded.onExtraCallback(), new Object[]{this}, iOnExtraCallback6)).longValue(), onNavigationEvent()));
        finish();
        int i3 = 38 / 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ICustomTabsServiceStub() throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 117;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        startActivity(KcbSurveyNotificationTermActivity.Companion.onExtraCallback(this, updateVisuals(), "completed", false));
        finish();
        int i4 = getInterfaceDescriptor + 97;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    private final long setEngagementSignalsCallback() {
        int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback2 = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback3 = TossApplication.onSessionEnded.onExtraCallback();
        return ((Long) IAuthTabCallback(iOnExtraCallback2, 517567178, -517567177, iOnExtraCallback, TossApplication.onSessionEnded.onExtraCallback(), new Object[]{this}, iOnExtraCallback3)).longValue();
    }

    public static final class IAuthTabCallback {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static char[] onExtraCallback = {64961, 64960, 64981, 64982};
        private static char IAuthTabCallback = 51243;

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public final Intent IAuthTabCallback(@NotNull Context context, @NotNull String str, long j, long j2) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intent intent = new Intent(context, (Class<?>) KcbSurveyResultActivity.class);
            Object[] objArr = new Object[1];
            a(new char[]{1, 2, 3, 2, 13913, 13913, 2, 1}, (byte) (113 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 8, objArr);
            Intent intentPutExtra = intent.putExtra(((String) objArr[0]).intern(), str).putExtra("raisedScore", j).putExtra("finalScore", j2);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            int i2 = onNavigationEvent + 83;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return intentPutExtra;
        }

        private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            int i3 = 2;
            int i4 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr2 = onExtraCallback;
            long j = 0;
            Object obj2 = null;
            if (cArr2 != null) {
                int i5 = $11 + 5;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i7 = 0;
                while (i7 < length) {
                    int i8 = $11 + 93;
                    $10 = i8 % 128;
                    if (i8 % i3 != 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), 26 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) + 23138, -2137011959, false, "z", new Class[]{Integer.TYPE});
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
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", ""), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 25, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr3[i7] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i7++;
                    }
                    i3 = 2;
                    j = 0;
                }
                cArr2 = cArr3;
            }
            try {
                Object[] objArr4 = {Integer.valueOf(IAuthTabCallback)};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 25 - TextUtils.lastIndexOf("", '0'), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                }
                char cCharValue = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
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
                            int i9 = $10 + 59;
                            $11 = i9 % 128;
                            int i10 = i9 % 2;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                            int i11 = $10 + 95;
                            $11 = i11 % 128;
                            int i12 = i11 % 2;
                            obj = obj2;
                        } else {
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((KeyEvent.getMaxKeyCode() >> 16) + 24824), TextUtils.getOffsetBefore("", 0) + 74, 8088 - (ViewConfiguration.getPressedStateDuration() >> 16), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                if (objOnExtraCallback5 == null) {
                                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 30, 19488 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                                int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                            } else {
                                obj = null;
                                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                    defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                    int i14 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i14];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i15];
                                } else {
                                    int i16 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    int i17 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i16];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i17];
                                }
                            }
                        }
                        defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                        obj2 = obj;
                    }
                }
                for (int i18 = 0; i18 < i; i18++) {
                    cArr4[i18] = (char) (cArr4[i18] ^ 13722);
                }
                objArr[0] = new String(cArr4);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
    }

    private static final String asBinder(KcbSurveyResultActivity kcbSurveyResultActivity) {
        int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback2 = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback3 = TossApplication.onSessionEnded.onExtraCallback();
        return (String) IAuthTabCallback(iOnExtraCallback2, -772840485, 772840485, iOnExtraCallback, TossApplication.onSessionEnded.onExtraCallback(), new Object[]{kcbSurveyResultActivity}, iOnExtraCallback3);
    }

    @Override // im.toss.feature.credit.ui.kcbsurvey.result.Hilt_KcbSurveyResultActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onStart() {
        super.onStart();
    }

    @Override // im.toss.feature.credit.ui.kcbsurvey.result.Hilt_KcbSurveyResultActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onResume() {
        super.onResume();
    }

    @Override // im.toss.feature.credit.ui.kcbsurvey.result.Hilt_KcbSurveyResultActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onPause() {
        super.onPause();
    }

    @Override // im.toss.feature.credit.ui.kcbsurvey.result.Hilt_KcbSurveyResultActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
