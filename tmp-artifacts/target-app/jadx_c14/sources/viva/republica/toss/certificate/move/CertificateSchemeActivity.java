package viva.republica.toss.certificate.move;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import com.tbruyelle.rxpermissions2.RxPermissions;
import im.toss.base.BaseActivity;
import im.toss.features.payment.ui.online.activity.OnlinePayTossOneUserCompleteActivity$;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.IEngagementSignalsCallback_Parcel;
import o.getBagAttributes;
import o.getByteBuffer;
import o.getPrime2;
import o.getTrailerField;
import o.onJsBridgeReady;
import o.setMessageBytes;
import o.shouldBeKeptAsChild;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.certificate.move.CertificateListActivity;
import viva.republica.toss.certificate.move.CertificateSchemeActivity$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CertificateSchemeActivity extends BaseActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallback Companion;
    private static char IAuthTabCallbackDefault = 0;
    private static char IAuthTabCallbackStub = 0;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access000 = 0;
    private static int access100 = 1;
    private static char asBinder;
    private static char asInterface;
    private static long onTransact;

    static {
        onNavigationEvent();
        Companion = new onExtraCallback(null);
        int i = access100 + 125;
        IAuthTabCallback_Parcel = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CertificateSchemeActivity certificateSchemeActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = access000 + 67;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(certificateSchemeActivity, commonModule_setLeftEdgeTouchEnabled);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(certificateSchemeActivity, commonModule_setLeftEdgeTouchEnabled);
        int i3 = IAuthTabCallbackStubProxy + 125;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        CertificateSchemeActivity certificateSchemeActivity = (CertificateSchemeActivity) objArr[0];
        Throwable th = (Throwable) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 113;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(certificateSchemeActivity, th);
        int i4 = access000 + 101;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = (~((~i6) | i4)) | (~(i4 | i));
        int i8 = (~i4) | (~i);
        int i9 = i7 | (~(i8 | i6));
        int i10 = (~i8) | i6;
        int i11 = ~(i | i6);
        int i12 = i6 + i4 + i5 + ((-417414852) * i2) + (1247522396 * i3);
        int i13 = i12 * i12;
        int i14 = (i6 * (-1219797419)) + 1526988800 + ((-1219797419) * i4) + (825712212 * i9) + ((-1651424424) * i10) + ((-825712212) * i11) + ((-2045509632) * i5) + ((-2135949312) * i2) + ((-953155584) * i3) + ((-430374912) * i13);
        int i15 = ((i6 * 184508743) - 476012450) + (i4 * 184508743) + (i9 * (-996)) + (i10 * 1992) + (i11 * 996) + (i5 * 184509739) + (i2 * (-953474796)) + (i3 * (-288057996)) + (i13 * (-839712768));
        int i16 = i14 + (i15 * i15 * 1709113344);
        return i16 != 1 ? i16 != 2 ? onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr) : onExtraCallback(objArr);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CertificateSchemeActivity certificateSchemeActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 105;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(certificateSchemeActivity, dialogInterface);
        int i4 = access000 + 99;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CertificateSchemeActivity certificateSchemeActivity, shouldBeKeptAsChild shouldbekeptaschild) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 27;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        Unit unit = (Unit) onExtraCallback(new Object[]{certificateSchemeActivity, shouldbekeptaschild}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 936299768, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -936299766);
        int i3 = IAuthTabCallbackStubProxy + 111;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 5 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        CertificateSchemeActivity certificateSchemeActivity = (CertificateSchemeActivity) objArr[0];
        Throwable th = (Throwable) objArr[1];
        int i = 2 % 2;
        int i2 = access000 + 77;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(certificateSchemeActivity, th);
        int i4 = IAuthTabCallbackStubProxy + 9;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CertificateSchemeActivity certificateSchemeActivity, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 91;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(certificateSchemeActivity, dialogInterface);
        int i4 = access000 + 19;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CertificateSchemeActivity certificateSchemeActivity, List list) {
        int i = 2 % 2;
        int i2 = access000 + 15;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(certificateSchemeActivity, list);
        int i4 = IAuthTabCallbackStubProxy + 119;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CertificateSchemeActivity certificateSchemeActivity, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 39;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(certificateSchemeActivity, z);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(certificateSchemeActivity, z);
        int i3 = access000 + 55;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 57;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 37;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return -1L;
        }
        throw null;
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final Intent onExtraCallback(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return new Intent(context, (Class<?>) CertificateSchemeActivity.class);
        }
    }

    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 9;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            super.onCreate(bundle);
            if (getBagAttributes.onExtraCallback.onNavigationEvent()) {
                IAuthTabCallback();
                return;
            }
            setEngagementSignalsCallback();
            int i3 = access000 + 17;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        super.onCreate(bundle);
        getBagAttributes.onExtraCallback.onNavigationEvent();
        throw null;
    }

    private final void setEngagementSignalsCallback() throws Throwable {
        int i = 2 % 2;
        RxPermissions rxPermissions = new RxPermissions(this);
        Object[] objArr = new Object[1];
        c(new char[]{25428, 9179, 49454, 43736, 1468, 48407, 26810, 13056, 30989, 10420, 62943, 47832, 2621, 42500, 45130, 43795, 34544, 58041, 39428, 48302, 40607, 22778, 29044, 47617, 25954, 54812, 37960, 29558, 51158, 9031, 57816, 4072, 31794, 51543, 16073, 37409, 23572, 34139, 34315, 9080, 261, 3114}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 40, objArr);
        getByteBuffer getbytebufferAsBinder = rxPermissions.onExtraCallbackWithResult(new String[]{((String) objArr[0]).intern()}).onExtraCallback(1L).asBinder();
        Intrinsics.checkNotNullExpressionValue(getbytebufferAsBinder, "");
        setMessageBytes.onExtraCallbackWithResult(getbytebufferAsBinder, new CertificateSchemeActivity$.ExternalSyntheticLambda0(this), (Function0) null, new CertificateSchemeActivity$.ExternalSyntheticLambda1(this), 2, (Object) null);
        int i2 = IAuthTabCallbackStubProxy + 81;
        access000 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(CertificateSchemeActivity certificateSchemeActivity, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        Object[] objArr = new Object[1];
        a(new char[]{18633, 36101, 49994, 6547, 24523, 37902, 59998, 8403, 26307, 47894, 61762, 14269, 3557, 16929, 39013, 57014, 5302, 26906, 44878, 58753, 15320, 28702, 46633, 35948, 49844, 6378, 23849, 37751, 59811, 12283, 25655, 47713, 61577, 14018, 2818, 16722, 34715, 56788, 4639, 26697, 44676, 58586, 14616, 32558, 46463}, Color.green(0) + 50627, objArr);
        Intent intent = new Intent(((String) objArr[0]).intern());
        String packageName = certificateSchemeActivity.getApplicationContext().getPackageName();
        StringBuilder sb = new StringBuilder();
        Object[] objArr2 = new Object[1];
        c(new char[]{58274, 1068, 16027, 46955, 25922, 22737, 23196, 19075}, 9 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(packageName);
        intent.setData(Uri.parse(sb.toString()));
        certificateSchemeActivity.startActivity(intent);
        certificateSchemeActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStubProxy + 51;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 67 / 0;
        }
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(CertificateSchemeActivity certificateSchemeActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 67;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        certificateSchemeActivity.setResult(0);
        certificateSchemeActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 47;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(CertificateSchemeActivity certificateSchemeActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(certificateSchemeActivity.getString(R.string.app_certificate_move___370333620d));
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(commonModule_setLeftEdgeTouchEnabled, R.string.permission_action_go_to_setting, (TdsButtonV1View.asInterface) null, false, new CertificateSchemeActivity$.ExternalSyntheticLambda6(certificateSchemeActivity), 6, (Object) null)};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        String string = certificateSchemeActivity.getString(im.toss.uikit.R.string.uikit_cancel);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, string, (TdsButtonV1View.asInterface) null, false, new CertificateSchemeActivity$.ExternalSyntheticLambda7(certificateSchemeActivity), 6, (Object) null)};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, objArr2, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStubProxy + 79;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.content.Context, im.toss.base.BaseActivity, viva.republica.toss.certificate.move.CertificateSchemeActivity] */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        ?? r1 = (CertificateSchemeActivity) objArr[0];
        shouldBeKeptAsChild shouldbekeptaschild = (shouldBeKeptAsChild) objArr[1];
        int i = 2 % 2;
        if (!(!shouldbekeptaschild.onNavigationEvent)) {
            int i2 = IAuthTabCallbackStubProxy + 125;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            r1.IAuthTabCallback();
        } else if (!shouldbekeptaschild.onExtraCallbackWithResult) {
            CommonModule_setScreenAwakeMode.onExtraCallbackWithResult((Context) r1, new CertificateSchemeActivity$.ExternalSyntheticLambda5((CertificateSchemeActivity) r1));
            int i4 = IAuthTabCallbackStubProxy + 67;
            access000 = i4 % 128;
            int i5 = i4 % 2;
        } else {
            onJsBridgeReady.onNavigationEvent((Context) r1, r1.getString(R.string.app_certificate_move___90615125da), 0, 2, (Object) null);
            r1.finish();
        }
        return Unit.INSTANCE;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $10 + 63;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), View.getDefaultSize(0, 0) + 24, 19626 - TextUtils.lastIndexOf("", '0'), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onTransact ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSize(0, 0), KeyEvent.normalizeMetaState(0) + 59, ExpandableListView.getPackedPositionChild(0L) + 6384, -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
            int i6 = $11 + 123;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 59 - (ViewConfiguration.getScrollBarSize() >> 8), 6382 - ImageFormat.getBitsPerPixel(0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallback(CertificateSchemeActivity certificateSchemeActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = access000 + 27;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(th, "");
            onJsBridgeReady.onNavigationEvent(certificateSchemeActivity, certificateSchemeActivity.getString(R.string.app_certificate_move___ffdc7a2655), 1, 2, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(th, "");
            onJsBridgeReady.onNavigationEvent(certificateSchemeActivity, certificateSchemeActivity.getString(R.string.app_certificate_move___ffdc7a2655), 0, 2, (Object) null);
        }
        certificateSchemeActivity.finish();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IAuthTabCallback() throws Throwable {
        String lastPathSegment;
        int i = 2 % 2;
        Uri data = getIntent().getData();
        if (data != null) {
            lastPathSegment = data.getLastPathSegment();
        } else {
            int i2 = access000 + 63;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            lastPathSegment = null;
        }
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        int iHashCode = lastPathSegment.hashCode();
        if (iHashCode == -1396673086) {
            Object[] objArr = new Object[1];
            a(new char[]{18634, 36604, 50337, 6748, 20489, 38865}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 50741, objArr);
            if (lastPathSegment.equals(((String) objArr[0]).intern())) {
                getPrime2.onNavigationEvent(getPrime2.IAuthTabCallback, this, (IEngagementSignalsCallback_Parcel) null, new CertificateSchemeActivity$.ExternalSyntheticLambda2(this), 2, (Object) null);
                return;
            }
        } else if (iHashCode == -1184795739) {
            Object[] objArr2 = new Object[1];
            a(new char[]{18625, 37410, 64790, 55410, 9030, 3679}, 56039 - TextUtils.indexOf("", "", 0, 0), objArr2);
            if (lastPathSegment.equals(((String) objArr2[0]).intern())) {
                startActivity(CertificateReceiveActivity.Companion.onNavigationEvent(this));
                finish();
                int i4 = access000 + 39;
                IAuthTabCallbackStubProxy = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 46 / 0;
                    return;
                }
                return;
            }
        } else if (iHashCode == 3526536) {
            int i6 = IAuthTabCallbackStubProxy + 41;
            access000 = i6 % 128;
            int i7 = i6 % 2;
            Object[] objArr3 = new Object[1];
            a(new char[]{18651, 52642, 16920, 55425}, 34159 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr3);
            if (lastPathSegment.equals(((String) objArr3[0]).intern())) {
                startActivity(CertificateListActivity.onExtraCallback.onNavigationEvent(CertificateListActivity.Companion, this, (String) null, 2, (Object) null));
                finish();
                return;
            }
        }
        setMessageBytes.onExtraCallbackWithResult(new getTrailerField(this).IAuthTabCallback(), new CertificateSchemeActivity$.ExternalSyntheticLambda3(this), new CertificateSchemeActivity$.ExternalSyntheticLambda4(this));
    }

    private static final Unit onNavigationEvent(CertificateSchemeActivity certificateSchemeActivity, boolean z) {
        int i = 2 % 2;
        int i2 = access000 + 23;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        certificateSchemeActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 19;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 56 / 0;
        }
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit IAuthTabCallback(viva.republica.toss.certificate.move.CertificateSchemeActivity r10, java.util.List r11) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.certificate.move.CertificateSchemeActivity.access000
            int r1 = r1 + 19
            int r2 = r1 % 128
            viva.republica.toss.certificate.move.CertificateSchemeActivity.IAuthTabCallbackStubProxy = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            if (r1 != 0) goto L1e
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r2)
            boolean r11 = r11.isEmpty()
            r1 = 12
            int r1 = r1 / 0
            if (r11 == 0) goto L46
            goto L27
        L1e:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r2)
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L46
        L27:
            viva.republica.toss.certificate.move.CertificateReceiveEntranceActivity$onWarmupCompleted r1 = viva.republica.toss.certificate.move.CertificateReceiveEntranceActivity.Companion
            r3 = 1
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 60
            r9 = 0
            r2 = r10
            android.content.Intent r11 = viva.republica.toss.certificate.move.CertificateReceiveEntranceActivity.onWarmupCompleted.onExtraCallback(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.startActivity(r11)
            r10.finish()
            int r10 = viva.republica.toss.certificate.move.CertificateSchemeActivity.IAuthTabCallbackStubProxy
            int r10 = r10 + 41
            int r11 = r10 % 128
            viva.republica.toss.certificate.move.CertificateSchemeActivity.access000 = r11
            int r10 = r10 % r0
            goto L53
        L46:
            viva.republica.toss.certificate.move.CertificateListActivity$onExtraCallback r11 = viva.republica.toss.certificate.move.CertificateListActivity.Companion
            r1 = 0
            android.content.Intent r11 = viva.republica.toss.certificate.move.CertificateListActivity.onExtraCallback.onNavigationEvent(r11, r10, r1, r0, r1)
            r10.startActivity(r11)
            r10.finish()
        L53:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.certificate.move.CertificateSchemeActivity.IAuthTabCallback(viva.republica.toss.certificate.move.CertificateSchemeActivity, java.util.List):kotlin.Unit");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(CertificateSchemeActivity certificateSchemeActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = access000 + 37;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        certificateSchemeActivity.startActivity(CertificateListActivity.onExtraCallback.onNavigationEvent(CertificateListActivity.Companion, certificateSchemeActivity, (String) null, 2, (Object) null));
        certificateSchemeActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 71;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 51 / 0;
        }
        return unit;
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i4 = $11 + 17;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $11 + 57;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (asBinder ^ 1094535280733222934L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(IAuthTabCallbackStub);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char trimmedLength = (char) TextUtils.getTrimmedLength("");
                        int defaultSize = View.getDefaultSize(i3, i3) + 10;
                        int jumpTapTimeout = 12434 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(trimmedLength, defaultSize, jumpTapTimeout, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (IAuthTabCallbackDefault ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(asInterface)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSize(0, 0), 10 - View.MeasureSpec.makeMeasureSpec(0, 0), 12434 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16015 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), Color.blue(0) + 14, 19901 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i12 = $11 + 113;
        $10 = i12 % 128;
        int i13 = i12 % 2;
        objArr[0] = str;
    }

    public String getScreenName() throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 99;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new char[]{18635, 18996, 19752, 16439, 17189, 17939, 22807, 23556, 24321, 21021, 21879, 26692, 27497, 28258, 24896, 25690, 26471, 31358, 32089, 28848, 29620, 30368, 2467, 3218}, 761 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i4 = IAuthTabCallbackStubProxy + 49;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return strIntern;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CertificateSchemeActivity certificateSchemeActivity, Throwable th) {
        return (Unit) onExtraCallback(new Object[]{certificateSchemeActivity, th}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -1028289798, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 1028289799);
    }

    public static /* synthetic */ Unit IAuthTabCallback(CertificateSchemeActivity certificateSchemeActivity, Throwable th) {
        return (Unit) onExtraCallback(new Object[]{certificateSchemeActivity, th}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 1106081656, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -1106081656);
    }

    private static final Unit onWarmupCompleted(CertificateSchemeActivity certificateSchemeActivity, shouldBeKeptAsChild shouldbekeptaschild) {
        return (Unit) onExtraCallback(new Object[]{certificateSchemeActivity, shouldbekeptaschild}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 936299768, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -936299766);
    }

    public void onStart() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 37;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = access000 + 63;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onResume() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 125;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 != 0) {
            int i4 = 71 / 0;
        }
        int i5 = access000 + 99;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public void onPause() {
        int i = 2 % 2;
        int i2 = access000 + 29;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            int i4 = 26 / 0;
        }
        int i5 = IAuthTabCallbackStubProxy + 125;
        access000 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = access000 + 19;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackStubProxy + 55;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    static void onNavigationEvent() {
        onTransact = 214290307939224991L;
        IAuthTabCallbackDefault = (char) 52643;
        asInterface = (char) 59502;
        asBinder = (char) 26975;
        IAuthTabCallbackStub = (char) 29692;
    }
}
