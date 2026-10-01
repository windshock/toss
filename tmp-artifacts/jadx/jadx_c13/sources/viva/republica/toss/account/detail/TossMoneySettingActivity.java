package viva.republica.toss.account.detail;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.TextView;
import com.google.common.collect.Synchronized;
import im.toss.base.BaseActivity;
import im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageActivity;
import im.toss.features.verify.oneclicklogin.impl.view.presentation.LoginTokenConsentViewModel_HiltModules;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertByteArrayToFloatArray;
import o.ConvertFloatArrayToByteArray;
import o.IPostMessageServiceStubProxy;
import o.KeyBoardVisiblePoint;
import o.PageShowPoint;
import o.PlayerErrorCode;
import o.SessionTrackerb;
import o.SetDetectableSize;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.UST_CERT_GetSignatureAlgorithm;
import o.UtilsKtExternalSyntheticLambda11;
import o.UtilsKtExternalSyntheticLambda3;
import o.VideoConfig;
import o.WebResourceResponseModel;
import o.access13800;
import o.access14000;
import o.access14100;
import o.access15400;
import o.access8000;
import o.addExtra;
import o.disableImageViewPreallocationAndroid;
import o.findResAndMsg;
import o.getAdService;
import o.getNavigationBar;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.getWrite;
import o.onDisclaimerClick;
import o.onLoadStarted;
import o.readIntokhttp;
import o.writeRaw;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;
import viva.republica.toss.R;
import viva.republica.toss.account.detail.TossMoneySettingActivity$;
import viva.republica.toss.network.model.init.v2.CheckoutResult;
import viva.republica.toss.send.periodic.PeriodicTransferListActivity;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TossMoneySettingActivity extends Hilt_TossMoneySettingActivity {
    public static final onExtraCallbackWithResult Companion;
    public static final int IAuthTabCallbackStub;
    private static long ICustomTabsCallback;
    private static int extraCallbackWithResult;
    private static int onMessageChannelReady;
    private static char onMinimized;
    private static int onPostMessage;
    private final Lazy IAuthTabCallbackDefault = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: viva.republica.toss.account.detail.TossMoneySettingActivity$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TossMoneySettingActivity.onWarmupCompleted(this.f$0);
        }
    });
    private TdsListRowV1View IAuthTabCallbackStubProxy;
    private TdsListRowV1View IAuthTabCallback_Parcel;
    private TdsListRowV1View access000;
    private TdsListRowV1View access100;
    private TdsListRowV1View asBinder;
    private TextView asInterface;
    private TdsListRowV1View extraCallback;
    private TdsListRowV1View getInterfaceDescriptor;
    private TextView onTransact;
    private TdsListRowV1View readTypedObject;

    @Inject
    public SessionTrackerb tossRouter;
    private KeyBoardVisiblePoint writeTypedObject;
    private static final byte[] $$a = {87, -2, 11, -41};
    private static final int $$b = 220;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ICustomTabsCallbackDefault = 1;
    private static int onActivityLayout = 0;
    private static int onActivityResized = 1;

    static final class onWarmupCompleted extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TossMoneySettingActivity.onWarmupCompleted(TossMoneySettingActivity.this, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, short s, byte b2) {
        int i;
        int i2;
        int i3 = b2 + 105;
        int i4 = 4 - (s * 3);
        int i5 = (b * 3) + 1;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i6 = i3;
            i2 = 0;
            int i7 = i4;
            int i8 = i4 + i6;
            int i9 = i7 + 1;
            i = i2;
            i3 = i8;
            i4 = i9;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i5) {
                return new String(bArr2, 0);
            }
            int i10 = i3;
            i7 = i4;
            i4 = bArr[i4];
            i6 = i10;
            int i82 = i4 + i6;
            int i92 = i7 + 1;
            i = i2;
            i3 = i82;
            i4 = i92;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i5) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i5) {
            }
        }
    }

    static {
        onMessageChannelReady = 0;
        onNavigationEvent();
        Companion = new onExtraCallbackWithResult(null);
        IAuthTabCallbackStub = 8;
        int i = ICustomTabsCallbackDefault + 105;
        onMessageChannelReady = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(TossMoneySettingActivity tossMoneySettingActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onActivityResized + 17;
        onActivityLayout = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted();
            int iOnWarmupCompleted2 = OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted();
            int iOnWarmupCompleted3 = OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted();
            return (Unit) onExtraCallbackWithResult(OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted(), -2066529741, iOnWarmupCompleted3, new Object[]{tossMoneySettingActivity, setDetectableSize}, 2066529743, iOnWarmupCompleted, iOnWarmupCompleted2);
        }
        int iOnWarmupCompleted4 = OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted5 = OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted6 = OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(TossMoneySettingActivity tossMoneySettingActivity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityLayout + 31;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted();
        onExtraCallbackWithResult(OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted(), 764377866, iOnWarmupCompleted3, new Object[]{tossMoneySettingActivity, view}, -764377862, iOnWarmupCompleted, iOnWarmupCompleted2);
        int i4 = onActivityLayout + 29;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(TossMoneySettingActivity tossMoneySettingActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 15;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess000 = access000(tossMoneySettingActivity, setDetectableSize);
        if (i3 == 0) {
            int i4 = 35 / 0;
        }
        int i5 = onActivityLayout + 39;
        onActivityResized = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 6 / 0;
        }
        return unitAccess000;
    }

    public static /* synthetic */ void IAuthTabCallbackStub(TossMoneySettingActivity tossMoneySettingActivity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityResized + 93;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackDefault(tossMoneySettingActivity, view);
        int i4 = onActivityResized + 105;
        onActivityLayout = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 32 / 0;
        }
    }

    public static /* synthetic */ void asInterface(TossMoneySettingActivity tossMoneySettingActivity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityLayout + 1;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted();
            int iOnWarmupCompleted2 = OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted();
            int iOnWarmupCompleted3 = OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted();
            onExtraCallbackWithResult(OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted(), 1880616632, iOnWarmupCompleted3, new Object[]{tossMoneySettingActivity, view}, -1880616632, iOnWarmupCompleted, iOnWarmupCompleted2);
            int i3 = 28 / 0;
        } else {
            int iOnWarmupCompleted4 = OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted();
            int iOnWarmupCompleted5 = OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted();
            int iOnWarmupCompleted6 = OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted();
            onExtraCallbackWithResult(OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted(), 1880616632, iOnWarmupCompleted6, new Object[]{tossMoneySettingActivity, view}, -1880616632, iOnWarmupCompleted4, iOnWarmupCompleted5);
        }
        int i4 = onActivityResized + 97;
        onActivityLayout = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [android.app.Activity, java.lang.Object, viva.republica.toss.account.detail.TossMoneySettingActivity] */
    /* JADX WARN: Type inference failed for: r11v3, types: [android.app.Activity, java.lang.Object, viva.republica.toss.account.detail.TossMoneySettingActivity] */
    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) throws Throwable {
        String strIntern;
        Object obj;
        int i7 = ~((~i5) | i2);
        int i8 = ~((~i2) | i4);
        int i9 = i8 | i7;
        int i10 = i8 | (~((~i4) | i2));
        int i11 = i2 + i4 + i6 + (762724209 * i3) + (1201824936 * i);
        int i12 = i11 * i11;
        int i13 = ((i2 * 162561953) - 555857873) + (i4 * 162559997) + (i7 * 1956) + (i9 * (-1956)) + (i10 * 978) + (162560975 * i6) + (701011807 * i3) + (237771736 * i) + (i12 * (-223608832));
        switch (((-126223985) * i2) + 43253760 + (1339426419 * i4) + ((-1465650404) * i7) + (1465650404 * i9) + (1414658446 * i10) + ((-1540882432) * i6) + (1302855680 * i3) + (1514143744 * i) + (1905524736 * i12) + (i13 * i13 * 703332352)) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                ?? r11 = (TossMoneySettingActivity) objArr[0];
                int i14 = 2 % 2;
                ConvertByteArrayToFloatArray.onExtraCallback(1820304L, false, (String) null, (Map) null, new TossMoneySettingActivity$.ExternalSyntheticLambda1((TossMoneySettingActivity) r11), 14, (Object) null);
                int iOnWarmupCompleted = CreditQuizMyPageActivity.IAuthTabCallbackDefault.onWarmupCompleted();
                int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022053).substring(11, 12).codePointAt(0) + 1105440407;
                SessionTrackerb sessionTrackerb = (SessionTrackerb) onExtraCallbackWithResult(CreditQuizMyPageActivity.IAuthTabCallbackDefault.onWarmupCompleted(), 941146737, OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{r11}, -941146734, iOnWarmupCompleted, iCodePointAt);
                Object[] objArr2 = new Object[1];
                a((ViewConfiguration.getJumpTapTimeout() >> 16) + 67, 17 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), new char[]{3, 16, 65481, 65481, 65492, '\r', '\r', '\t', 14, 65535, 65533, 3, 16, '\f', 65535, '\r', '\r', 1, '\b', 3, 14, 14, 65535, '\r', 65529, 19, 65535, '\b', '\t', 7, '\r', '\r', '\t', 14, 65495, '\f', 65535, '\f', '\f', 65535, 0, 65535, '\f', 65497, 17, 65531, '\f', 65534, 2, 14, 3, 17, 65481, 2, '\r', 65531, 65533, 65481, '\r', 16, 65533, 65481, '\f', '\t', 14, 3, '\r'}, true, 264 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr2);
                SessionTrackerb.IAuthTabCallback(sessionTrackerb, (Activity) r11, ((String) objArr2[0]).intern(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
                int i15 = onActivityResized + 11;
                onActivityLayout = i15 % 128;
                int i16 = i15 % 2;
                break;
            case 5:
                break;
            case 6:
                TossMoneySettingActivity tossMoneySettingActivity = (TossMoneySettingActivity) objArr[0];
                int i17 = 2 % 2;
                int i18 = onActivityResized;
                int i19 = i18 + 49;
                onActivityLayout = i19 % 128;
                int i20 = i19 % 2;
                TdsListRowV1View tdsListRowV1View = tossMoneySettingActivity.access100;
                int i21 = i18 + 47;
                onActivityLayout = i21 % 128;
                int i22 = i21 % 2;
                break;
            case 7:
                break;
            case 8:
                ?? r112 = (TossMoneySettingActivity) objArr[0];
                int i23 = 2 % 2;
                ConvertByteArrayToFloatArray.onExtraCallback(1232751L, false, (String) null, (Map) null, new TossMoneySettingActivity$.ExternalSyntheticLambda13((TossMoneySettingActivity) r112), 14, (Object) null);
                if (addExtra.extraCallback(PlayerErrorCode.onWarmupCompleted)) {
                    int i24 = onActivityResized + 37;
                    onActivityLayout = i24 % 128;
                    if (i24 % 2 != 0) {
                        Object[] objArr3 = new Object[1];
                        c(new char[]{14728, 5677, 15331, 31907, 7985, 25470, 37846, 43038, 45932, 19199, 37396, 48806, 4231, 47708, 63294, 63427, 2439, 36765, 986, 6894, 12378, 5853, 2359, 25947, 1096, 57464, 21650, 28024, 4744, 52623, 30175, 10193, 10823, 21946, 49908, 31671, 1862, 8434, 33905, 21589, 6024, 45409, 15768, 26832, 51086, 23915, 46749, 32422, 52304, 43685, 4057, 22843, 56418, 27279, 62956, 61865, 58627, 15789, 49134, 46106, 37208, 61786, 61144, 55139, 4562, 18579, 32251, 4714, 15181, 52626, 39801, 9725, 49508, 46024, 44409, 20299, 8549, 16389, 57038}, (-334849437) + View.resolveSizeAndState(0, 0, 0), new char[]{0, 0, 0, 0}, (char) (34997 / TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '@', 0)), new char[]{25419, 2714, 46316, 51592}, objArr3);
                        obj = objArr3[0];
                    } else {
                        Object[] objArr4 = new Object[1];
                        c(new char[]{14728, 5677, 15331, 31907, 7985, 25470, 37846, 43038, 45932, 19199, 37396, 48806, 4231, 47708, 63294, 63427, 2439, 36765, 986, 6894, 12378, 5853, 2359, 25947, 1096, 57464, 21650, 28024, 4744, 52623, 30175, 10193, 10823, 21946, 49908, 31671, 1862, 8434, 33905, 21589, 6024, 45409, 15768, 26832, 51086, 23915, 46749, 32422, 52304, 43685, 4057, 22843, 56418, 27279, 62956, 61865, 58627, 15789, 49134, 46106, 37208, 61786, 61144, 55139, 4562, 18579, 32251, 4714, 15181, 52626, 39801, 9725, 49508, 46024, 44409, 20299, 8549, 16389, 57038}, (-334849437) - View.resolveSizeAndState(0, 0, 0), new char[]{0, 0, 0, 0}, (char) (TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0) + 34997), new char[]{25419, 2714, 46316, 51592}, objArr4);
                        obj = objArr4[0];
                    }
                    strIntern = ((String) obj).intern();
                } else {
                    Object[] objArr5 = new Object[1];
                    a(View.resolveSizeAndState(0, 0, 0) + 61, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 46, new char[]{'\f', '\b', '\r', 65494, 11, 65534, 11, 11, 65534, 65535, 65534, 11, 65496, '\r', 2, 6, 2, 5, 65480, 18, 65534, 7, '\b', 6, '\f', '\f', '\b', '\r', 65480, '\f', 7, 65534, 65534, '\r', 65480, 65480, 65491, '\f', '\f', '\b', '\r', 11, 65534, '\t', 14, '\f', '\f', 0, 7, 2, '\r', '\r', 65534, '\f', 65528, 18, 65534, 7, '\b', 6, '\f'}, true, 264 - (ViewConfiguration.getTouchSlop() >> 8), objArr5);
                    strIntern = ((String) objArr5[0]).intern();
                }
                int iOnWarmupCompleted2 = CreditQuizMyPageActivity.IAuthTabCallbackDefault.onWarmupCompleted();
                int iCodePointAt2 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022053).substring(11, 12).codePointAt(0) + 1105440407;
                SessionTrackerb.IAuthTabCallback((SessionTrackerb) onExtraCallbackWithResult(CreditQuizMyPageActivity.IAuthTabCallbackDefault.onWarmupCompleted(), 941146737, OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{r112}, -941146734, iOnWarmupCompleted2, iCodePointAt2), (Activity) r112, strIntern, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
                int i25 = onActivityResized + 17;
                onActivityLayout = i25 % 128;
                int i26 = i25 % 2;
                break;
            default:
                BaseActivity baseActivity = (TossMoneySettingActivity) objArr[0];
                int i27 = 2 % 2;
                int i28 = onActivityResized + 21;
                onActivityLayout = i28 % 128;
                int i29 = i28 % 2;
                ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 5203474L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
                int iOnWarmupCompleted3 = CreditQuizMyPageActivity.IAuthTabCallbackDefault.onWarmupCompleted();
                int iCodePointAt3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022053).substring(11, 12).codePointAt(0) + 1105440407;
                SessionTrackerb sessionTrackerb2 = (SessionTrackerb) onExtraCallbackWithResult(CreditQuizMyPageActivity.IAuthTabCallbackDefault.onWarmupCompleted(), 941146737, OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{baseActivity}, -941146734, iOnWarmupCompleted3, iCodePointAt3);
                Object[] objArr6 = new Object[1];
                c(new char[]{46578, 8643, 35957, 3354, 10781, 31050, 37885, 18172, 29418, 55712, 32683, 19182, 57259, 22077, 55432, 17573, 11667, 25738, 17672, 37636, 594, 605, 38342, 43010, 4849, 55882, 10171, 7330, 39296, 41869, 33123, 39594, 11907, 61059, 50178, 37424, 49639, 4920, 45156, 16041, 9856, 18868, 19693, 46941, 25807, 60972, 4804, 35822, 16132, 15293, 1364, 23155, 31825, 46272, 43061, 61479, 23201, 10117, 22032, 27860, 51911, 44642, 47592, 57554, '\f', 36658, 37726, 32654, 38389, 9081, 6019, 10982}, ViewConfiguration.getTapTimeout() >> 16, new char[]{0, 0, 0, 0}, (char) View.MeasureSpec.makeMeasureSpec(0, 0), new char[]{53681, 349, 2126, 18280}, objArr6);
                SessionTrackerb.IAuthTabCallback(sessionTrackerb2, baseActivity, ((String) objArr6[0]).intern(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
                int i30 = onActivityResized + 37;
                onActivityLayout = i30 % 128;
                int i31 = i30 % 2;
                break;
        }
        return null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        TossMoneySettingActivity tossMoneySettingActivity = (TossMoneySettingActivity) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = onActivityResized + 105;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(tossMoneySettingActivity, setDetectableSize);
        int i4 = onActivityLayout + 15;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback_Parcel;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TossMoneySettingActivity tossMoneySettingActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 19;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(tossMoneySettingActivity, setDetectableSize);
        int i4 = onActivityLayout + 85;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnTransact;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(TossMoneySettingActivity tossMoneySettingActivity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityResized + 107;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        onTransact(tossMoneySettingActivity, view);
        int i4 = onActivityLayout + 29;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onNavigationEvent(int i, TossMoneySettingActivity tossMoneySettingActivity, SetDetectableSize setDetectableSize) {
        int i2 = 2 % 2;
        int i3 = onActivityResized + 31;
        onActivityLayout = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(i, tossMoneySettingActivity, setDetectableSize);
        if (i4 != 0) {
            int i5 = 84 / 0;
        }
        int i6 = onActivityResized + 97;
        onActivityLayout = i6 % 128;
        if (i6 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(TossMoneySettingActivity tossMoneySettingActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onActivityResized + 15;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(tossMoneySettingActivity, setDetectableSize);
        int i4 = onActivityLayout + 109;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallbackStub;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(TossMoneySettingActivity tossMoneySettingActivity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityResized + Imgproc.COLOR_YUV2RGBA_YVYU;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        asBinder(tossMoneySettingActivity, view);
        int i4 = onActivityLayout + 93;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        TossMoneySettingActivity tossMoneySettingActivity = (TossMoneySettingActivity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = onActivityResized + 113;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        access000(tossMoneySettingActivity, view);
        if (i3 == 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ String onWarmupCompleted(TossMoneySettingActivity tossMoneySettingActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityLayout + 97;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        String strOnNavigationEvent = onNavigationEvent(tossMoneySettingActivity);
        int i4 = onActivityLayout + 9;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return strOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(TossMoneySettingActivity tossMoneySettingActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onActivityResized + 99;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(tossMoneySettingActivity, setDetectableSize);
        int i4 = onActivityResized + 21;
        onActivityLayout = i4 % 128;
        if (i4 % 2 == 0) {
            return unitAsInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(TossMoneySettingActivity tossMoneySettingActivity, int i, View view) {
        int i2 = 2 % 2;
        int i3 = onActivityResized + 9;
        onActivityLayout = i3 % 128;
        int i4 = i3 % 2;
        onNavigationEvent(tossMoneySettingActivity, i, view);
        if (i4 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onWarmupCompleted(TossMoneySettingActivity tossMoneySettingActivity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityResized + 71;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted();
        onExtraCallbackWithResult(OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted(), -1342320404, iOnWarmupCompleted3, new Object[]{tossMoneySettingActivity, view}, 1342320412, iOnWarmupCompleted, iOnWarmupCompleted2);
        int i4 = onActivityResized + 115;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = onActivityResized;
        int i3 = i2 + 33;
        onActivityLayout = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 43;
        onActivityLayout = i5 % 128;
        int i6 = i5 % 2;
        return 1232749L;
    }

    public static final class onTransact implements getAdService {
        final /* synthetic */ Configuration IAuthTabCallback;

        public onTransact(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.IAuthTabCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        TossMoneySettingActivity tossMoneySettingActivity = (TossMoneySettingActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onActivityResized;
        int i3 = i2 + 49;
        onActivityLayout = i3 % 128;
        int i4 = i3 % 2;
        TdsListRowV1View tdsListRowV1View = tossMoneySettingActivity.access000;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 21;
        onActivityLayout = i5 % 128;
        int i6 = i5 % 2;
        return tdsListRowV1View;
    }

    public static final /* synthetic */ KeyBoardVisiblePoint IAuthTabCallback(TossMoneySettingActivity tossMoneySettingActivity) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 59;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        KeyBoardVisiblePoint keyBoardVisiblePoint = tossMoneySettingActivity.writeTypedObject;
        if (i3 != 0) {
            return keyBoardVisiblePoint;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Object onWarmupCompleted(TossMoneySettingActivity tossMoneySettingActivity, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 87;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Object objOnNavigationEvent = tossMoneySettingActivity.onNavigationEvent((access13800<? super Boolean>) access13800Var);
        int i4 = onActivityResized + 75;
        onActivityLayout = i4 % 128;
        if (i4 % 2 == 0) {
            return objOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(TossMoneySettingActivity tossMoneySettingActivity, int i) {
        int i2 = 2 % 2;
        int i3 = onActivityLayout + 45;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        tossMoneySettingActivity.IAuthTabCallback(i);
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = onActivityResized + 55;
        onActivityLayout = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        TossMoneySettingActivity tossMoneySettingActivity = (TossMoneySettingActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onActivityLayout + 31;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        SessionTrackerb sessionTrackerb = tossMoneySettingActivity.tossRouter;
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        if (sessionTrackerb != null) {
            return sessionTrackerb;
        }
        Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
        int i4 = onActivityResized + 113;
        onActivityLayout = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallbackWithResult {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 0;
        private static long onExtraCallbackWithResult = -7564180614687868744L;
        private static int onNavigationEvent = 1;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final Intent onWarmupCompleted(@NotNull Context context, @NotNull String str) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intent intent = new Intent(context, (Class<?>) TossMoneySettingActivity.class);
            Object[] objArr = new Object[1];
            a(new char[]{48637, 30853, 14135, 60839, 43073, 26326, 7536, 56308}, TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0) + 50544, objArr);
            Intent intentPutExtra = intent.putExtra(((String) objArr[0]).intern(), str);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            int i2 = onNavigationEvent + 79;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return intentPutExtra;
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x0186  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0187  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            Object obj;
            Throwable cause;
            int i2 = 2 % 2;
            AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            int i3 = $11 + 107;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            while (true) {
                obj = null;
                if (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback >= cArr.length) {
                    break;
                }
                int i5 = $11 + 15;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                int i7 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 25 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 19626 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i7] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onExtraCallbackWithResult ^ 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 59, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                    }
                }
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            char[] cArr2 = new char[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i8 = $11 + 69;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                    Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 60 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    obj.hashCode();
                    throw null;
                }
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), 59 - (KeyEvent.getMaxKeyCode() >> 16), View.combineMeasuredStates(0, 0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr2);
        }
    }

    public String getScreenName() {
        int i = 2 % 2;
        int i2 = onActivityResized;
        int i3 = i2 + 73;
        onActivityLayout = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 101;
        onActivityLayout = i5 % 128;
        if (i5 % 2 == 0) {
            return "toss__money_management";
        }
        throw null;
    }

    public Map<String, Object> getScreenParams() throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityResized + 51;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(7 - Process.getGidForName(_UrlKt.FRAGMENT_ENCODE_SET), 3 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), new char[]{65530, 7, 7, 65530, 7, 7, 65530, 65531}, true, 268 - View.combineMeasuredStates(0, 0), objArr);
        Map<String, Object> mapIAuthTabCallbackStubProxy = access8000.IAuthTabCallbackStubProxy(getWrite.IAuthTabCallback(((String) objArr[0]).intern(), setEngagementSignalsCallback()), getWrite.IAuthTabCallback("user_type", ICustomTabsServiceStub()));
        int i4 = onActivityResized + 119;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
        return mapIAuthTabCallbackStubProxy;
    }

    private final String setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = onActivityResized + 125;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.IAuthTabCallbackDefault.getValue();
        if (i3 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String onNavigationEvent(TossMoneySettingActivity tossMoneySettingActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityResized + 71;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = tossMoneySettingActivity.getIntent();
        Object[] objArr = new Object[1];
        a(KeyEvent.keyCodeFromString(_UrlKt.FRAGMENT_ENCODE_SET) + 8, View.MeasureSpec.getMode(0) + 2, new char[]{65530, 7, 7, 65530, 7, 7, 65530, 65531}, true, 267 - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0), objArr);
        String stringExtra = intent.getStringExtra(((String) objArr[0]).intern());
        int i4 = onActivityResized + 13;
        onActivityLayout = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 57 / 0;
        }
        return stringExtra;
    }

    private final String ICustomTabsServiceStub() {
        int i = 2 % 2;
        PlayerErrorCode playerErrorCode = PlayerErrorCode.onWarmupCompleted;
        if (!addExtra.extraCallback(playerErrorCode)) {
            return addExtra.IAuthTabCallback(playerErrorCode) ^ true ? "TEENS" : "NORMAL";
        }
        int i2 = onActivityLayout;
        int i3 = i2 + 7;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 25;
        onActivityResized = i5 % 128;
        int i6 = i5 % 2;
        return "VISITOR";
    }

    @Override // viva.republica.toss.account.detail.Hilt_TossMoneySettingActivity
    public void onCreate(@Nullable Bundle bundle) {
        Object next;
        int i = 2 % 2;
        super.onCreate(bundle);
        setContentView(R.layout.activity_toss_money_setting);
        View viewFindViewById = findViewById(R.id.rootView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        disableImageViewPreallocationAndroid.onNavigationEvent(viewFindViewById, findViewById(R.id.appBarLayout), (View) null, (View) null, false, 14, (Object) null);
        View viewFindViewById2 = findViewById(R.id.header_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        this.onTransact = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.header_description);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
        this.asInterface = (TextView) viewFindViewById3;
        TdsListRowV1View tdsListRowV1ViewFindViewById = findViewById(R.id.row_periodic);
        Intrinsics.checkNotNullExpressionValue(tdsListRowV1ViewFindViewById, "");
        this.IAuthTabCallbackStubProxy = tdsListRowV1ViewFindViewById;
        TdsListRowV1View tdsListRowV1ViewFindViewById2 = findViewById(R.id.row_atm);
        Intrinsics.checkNotNullExpressionValue(tdsListRowV1ViewFindViewById2, "");
        this.asBinder = tdsListRowV1ViewFindViewById2;
        TdsListRowV1View tdsListRowV1ViewFindViewById3 = findViewById(R.id.row_tossmoney_guide);
        Intrinsics.checkNotNullExpressionValue(tdsListRowV1ViewFindViewById3, "");
        this.readTypedObject = tdsListRowV1ViewFindViewById3;
        TdsListRowV1View tdsListRowV1ViewFindViewById4 = findViewById(R.id.row_tossmoney_limit);
        Intrinsics.checkNotNullExpressionValue(tdsListRowV1ViewFindViewById4, "");
        this.extraCallback = tdsListRowV1ViewFindViewById4;
        TdsListRowV1View tdsListRowV1ViewFindViewById5 = findViewById(R.id.row_limit_increase);
        Intrinsics.checkNotNullExpressionValue(tdsListRowV1ViewFindViewById5, "");
        this.access100 = tdsListRowV1ViewFindViewById5;
        TdsListRowV1View tdsListRowV1ViewFindViewById6 = findViewById(R.id.row_easypay_cancel);
        Intrinsics.checkNotNullExpressionValue(tdsListRowV1ViewFindViewById6, "");
        this.access000 = tdsListRowV1ViewFindViewById6;
        TdsListRowV1View tdsListRowV1ViewFindViewById7 = findViewById(R.id.row_cvs_charge);
        Intrinsics.checkNotNullExpressionValue(tdsListRowV1ViewFindViewById7, "");
        this.getInterfaceDescriptor = tdsListRowV1ViewFindViewById7;
        TdsListRowV1View tdsListRowV1ViewFindViewById8 = findViewById(R.id.row_cvs_withdraw);
        Intrinsics.checkNotNullExpressionValue(tdsListRowV1ViewFindViewById8, "");
        this.IAuthTabCallback_Parcel = tdsListRowV1ViewFindViewById8;
        IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            int i2 = onActivityLayout + 125;
            onActivityResized = i2 % 128;
            int i3 = i2 % 2;
            supportActionBar.onNavigationEvent(true);
        }
        Iterator it = PageShowPoint.Companion.asInterface().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((onDisclaimerClick) next).access000()) {
                    break;
                }
            }
        }
        onDisclaimerClick ondisclaimerclick = (onDisclaimerClick) next;
        if (ondisclaimerclick == null) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TossMoneySettingActivity", "TossMoney Not Found", (Throwable) null, (Map) null, 12, (Object) null);
            finish();
            int i4 = onActivityLayout + 25;
            onActivityResized = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            return;
        }
        this.writeTypedObject = ondisclaimerclick;
        validateRelationship();
        ICustomTabsServiceDefault();
        updateVisuals();
    }

    @Override // viva.republica.toss.account.detail.Hilt_TossMoneySettingActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 11;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        ICustomTabsServiceStubProxy();
        int i4 = onActivityLayout + 119;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static void c(char[] cArr, int i, char[] cArr2, char c, char[] cArr3, Object[] objArr) throws Throwable {
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
            int i4 = $11 + 83;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 42, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1450, 228868077, false, $$c(b, b2, (byte) (b2 + 5)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 49123), 44 - (ViewConfiguration.getPressedStateDuration() >> 16), 1493 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 1533236389, false, $$c(b3, b3, (byte) $$a.length), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23971 - ImageFormat.getBitsPerPixel(0)), TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0) + 51, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 22938, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 45848), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 29, 12576 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0'), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (ICustomTabsCallback ^ 7798559133331975163L)) ^ ((int) (onPostMessage ^ 7798559133331975163L))) ^ ((char) (onMinimized ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i6 = $10 + 5;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        Object L$0;
        int label;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return TossMoneySettingActivity.this.new onExtraCallback(access13800Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return ((onExtraCallback) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            View view;
            View view2;
            View view3;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i = this.label;
            boolean z = true;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                view = (TdsListRowV1View) TossMoneySettingActivity.onExtraCallbackWithResult(OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted(), 125137651, OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{TossMoneySettingActivity.this}, -125137645, OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted());
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                    view = null;
                }
                if (addExtra.extraCallback(PlayerErrorCode.onWarmupCompleted)) {
                    UtilsKtExternalSyntheticLambda11 utilsKtExternalSyntheticLambda11 = UtilsKtExternalSyntheticLambda11.IAuthTabCallback;
                    this.L$0 = view;
                    this.label = 1;
                    Object objOnExtraCallback2 = UtilsKtExternalSyntheticLambda11.onExtraCallback(utilsKtExternalSyntheticLambda11, "visitor.tossmoney.limitIncrease.enabled", (UtilsKtExternalSyntheticLambda3) null, this, 2, (Object) null);
                    if (objOnExtraCallback2 != objOnExtraCallback) {
                        view2 = view;
                        obj = objOnExtraCallback2;
                    }
                    return objOnExtraCallback;
                }
                view3 = view;
                z = false;
                view3.setVisibility(z ? 0 : 8);
                return Unit.INSTANCE;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                view3 = (View) this.L$0;
                ResultKt.onNavigationEvent(obj);
                if (((Boolean) obj).booleanValue()) {
                    view = view3;
                    view3 = view;
                    z = false;
                }
                view3.setVisibility(z ? 0 : 8);
                return Unit.INSTANCE;
            }
            view2 = (View) this.L$0;
            ResultKt.onNavigationEvent(obj);
            if (((Boolean) obj).booleanValue()) {
                TossMoneySettingActivity tossMoneySettingActivity = TossMoneySettingActivity.this;
                this.L$0 = view2;
                this.label = 2;
                obj = TossMoneySettingActivity.onWarmupCompleted(tossMoneySettingActivity, this);
                if (obj != objOnExtraCallback) {
                    view3 = view2;
                    if (((Boolean) obj).booleanValue()) {
                    }
                    view3.setVisibility(z ? 0 : 8);
                    return Unit.INSTANCE;
                }
                return objOnExtraCallback;
            }
            view = view2;
            view3 = view;
            z = false;
            view3.setVisibility(z ? 0 : 8);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            int i6 = $11 + 113;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(extraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSize(0, 0) + 35125), 23 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getEdgeSlop() >> 16) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (Process.myPid() >> 22)), 55 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0, 0), (ViewConfiguration.getTouchSlop() >> 8) + 2167, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i2 > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            int i9 = $10 + 3;
            $11 = i9 % 128;
            int i10 = i9 % 2;
        }
        if (z) {
            int i11 = $11 + 73;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i13 = $11 + 41;
                $10 = i13 % 128;
                int i14 = i13 % 2;
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 12843), View.combineMeasuredStates(0, 0) + 55, ((byte) KeyEvent.getModifierMetaStateMask()) + 2168, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private final void ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        Object obj = null;
        onLoadStarted.onExtraCallback(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), null, null, new onExtraCallback(null), 3, null);
        int i2 = onActivityLayout + 85;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final void updateVisuals() {
        int i = 2 % 2;
        onLoadStarted.onExtraCallback(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), null, null, new onNavigationEvent(this, (access13800) null), 3, null);
        int i2 = onActivityLayout + 105;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IAuthTabCallback(int i) {
        int i2 = 2 % 2;
        TdsListRowV1View tdsListRowV1View = this.IAuthTabCallbackStubProxy;
        if (tdsListRowV1View == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            tdsListRowV1View = null;
        }
        tdsListRowV1View.setRightText1(getString(R.string.app_account_detail___37357a11da, Integer.valueOf(i)));
        BaseTextView baseTextView = (BaseTextView) TdsListRowV1View.IAuthTabCallback(new Object[]{tdsListRowV1View}, -1111713185, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1111713194, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
        if (baseTextView != null) {
            int i3 = onActivityLayout + 101;
            onActivityResized = i3 % 128;
            int i4 = i3 % 2;
            baseTextView.setVisibility(!((i <= 0) ^ true) ? 8 : 0);
            int i5 = onActivityResized + 5;
            onActivityLayout = i5 % 128;
            int i6 = i5 % 2;
        }
        if (i > 0) {
            Context context = tdsListRowV1View.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            tdsListRowV1View.setRightText1Color(new getUrlokhttp(new onTransact(configuration)).asBinder());
        }
        tdsListRowV1View.setOnClickListener(new TossMoneySettingActivity$.ExternalSyntheticLambda14(this, i));
    }

    private static final Unit onExtraCallbackWithResult(int i, TossMoneySettingActivity tossMoneySettingActivity, SetDetectableSize setDetectableSize) {
        int i2 = 2 % 2;
        int i3 = onActivityResized + 29;
        onActivityLayout = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("auto_transfer_cnt", Integer.valueOf(i));
        setDetectableSize.onExtraCallback("user_type", tossMoneySettingActivity.ICustomTabsServiceStub());
        Unit unit = Unit.INSTANCE;
        int i5 = onActivityResized + 63;
        onActivityLayout = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onNavigationEvent(TossMoneySettingActivity tossMoneySettingActivity, int i, View view) {
        KeyBoardVisiblePoint keyBoardVisiblePoint;
        int i2 = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1232757L, false, (String) null, (Map) null, new TossMoneySettingActivity$.ExternalSyntheticLambda4(i, tossMoneySettingActivity), 14, (Object) null);
        PeriodicTransferListActivity.IAuthTabCallback iAuthTabCallback = PeriodicTransferListActivity.Companion;
        KeyBoardVisiblePoint keyBoardVisiblePoint2 = tossMoneySettingActivity.writeTypedObject;
        if (keyBoardVisiblePoint2 == null) {
            int i3 = onActivityResized + 93;
            onActivityLayout = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                obj.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            keyBoardVisiblePoint = null;
        } else {
            keyBoardVisiblePoint = keyBoardVisiblePoint2;
        }
        getNavigationBar.IAuthTabCallback(PeriodicTransferListActivity.IAuthTabCallback.onWarmupCompleted(iAuthTabCallback, tossMoneySettingActivity, keyBoardVisiblePoint, (Collection) null, false, 12, (Object) null), tossMoneySettingActivity);
        int i4 = onActivityLayout + Imgproc.COLOR_YUV2RGBA_YVYU;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 27 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void ICustomTabsServiceDefault() {
        TextView textView;
        int i = 2 % 2;
        TextView textView2 = null;
        if (addExtra.extraCallback(PlayerErrorCode.onWarmupCompleted)) {
            int i2 = onActivityResized + 101;
            onActivityLayout = i2 % 128;
            if (i2 % 2 != 0) {
                textView = this.onTransact;
                int i3 = 60 / 0;
                if (textView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                    textView = null;
                }
            } else {
                textView = this.onTransact;
                if (textView == null) {
                }
            }
            textView.setText(getString(R.string.toss_money));
            TextView textView3 = this.asInterface;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            } else {
                textView2 = textView3;
            }
            textView2.setVisibility(8);
            return;
        }
        TextView textView4 = this.onTransact;
        if (textView4 == null) {
            int i4 = onActivityResized + 81;
            onActivityLayout = i4 % 128;
            if (i4 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                int i5 = 7 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            }
            textView4 = null;
        }
        textView4.setText(getString(R.string.app_account_detail___ed17bd4881, PlayerErrorCode.onPostMessage()));
        TextView textView5 = this.asInterface;
        if (textView5 == null) {
            int i6 = onActivityResized + 43;
            onActivityLayout = i6 % 128;
            int i7 = i6 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            textView5 = null;
        }
        int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        textView5.setText(String.valueOf(VideoConfig.onWarmupCompleted((String) PlayerErrorCode.IAuthTabCallback(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1756374204, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), iOnNavigationEvent, 1756374207, new Object[0], LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent()), (String) null, 1, (Object) null)));
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return TossMoneySettingActivity.this.new IAuthTabCallback(access13800Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return ((IAuthTabCallback) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                if (addExtra.extraCallback(PlayerErrorCode.onWarmupCompleted)) {
                    UtilsKtExternalSyntheticLambda11 utilsKtExternalSyntheticLambda11 = UtilsKtExternalSyntheticLambda11.IAuthTabCallback;
                    this.label = 1;
                    obj = UtilsKtExternalSyntheticLambda11.onExtraCallback(utilsKtExternalSyntheticLambda11, "visitor.tossmoney.easypay.enabled", (UtilsKtExternalSyntheticLambda3) null, this, 2, (Object) null);
                    if (obj == objOnExtraCallback) {
                        return objOnExtraCallback;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            if (((Boolean) obj).booleanValue()) {
                Object[] objArr = {TossMoneySettingActivity.this};
                int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted();
                int iOnWarmupCompleted2 = OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted();
                View view = (TdsListRowV1View) TossMoneySettingActivity.onExtraCallbackWithResult(OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted(), 950032957, OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted(), objArr, -950032956, iOnWarmupCompleted, iOnWarmupCompleted2);
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                    view = null;
                }
                view.setVisibility(0);
            }
            return Unit.INSTANCE;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        TossMoneySettingActivity tossMoneySettingActivity = (TossMoneySettingActivity) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = onActivityResized + 35;
        onActivityLayout = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("user_type", tossMoneySettingActivity.ICustomTabsServiceStub());
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("user_type", tossMoneySettingActivity.ICustomTabsServiceStub());
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void IAuthTabCallbackDefault(TossMoneySettingActivity tossMoneySettingActivity, View view) throws Throwable {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1232755L, false, (String) null, (Map) null, new TossMoneySettingActivity$.ExternalSyntheticLambda0(tossMoneySettingActivity), 14, (Object) null);
        int iOnWarmupCompleted = CreditQuizMyPageActivity.IAuthTabCallbackDefault.onWarmupCompleted();
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022053).substring(11, 12).codePointAt(0) + 1105440407;
        int iOnWarmupCompleted2 = OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted();
        SessionTrackerb sessionTrackerb = (SessionTrackerb) onExtraCallbackWithResult(CreditQuizMyPageActivity.IAuthTabCallbackDefault.onWarmupCompleted(), 941146737, iOnWarmupCompleted2, new Object[]{tossMoneySettingActivity}, -941146734, iOnWarmupCompleted, iCodePointAt);
        Object[] objArr = new Object[1];
        a(40 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 15, new char[]{65532, 65482, 65482, 65493, 14, 14, '\n', 15, 0, 65534, 4, 17, '\r', 0, 14, 0, 17, 4, 15, 11, 65532, 65535, 65532, 65496, 15, '\t', 0, '\r', 65532, 11, 14, '\t', 65532, '\r', 15, 65530, 65498, '\b', 15}, true, View.MeasureSpec.getMode(0) + 262, objArr);
        SessionTrackerb.IAuthTabCallback(sessionTrackerb, tossMoneySettingActivity, ((String) objArr[0]).intern(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        int i2 = onActivityLayout + 103;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit IAuthTabCallbackStub(TossMoneySettingActivity tossMoneySettingActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onActivityResized + 19;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("user_type", tossMoneySettingActivity.ICustomTabsServiceStub());
        Unit unit = Unit.INSTANCE;
        int i4 = onActivityResized + 25;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onTransact(TossMoneySettingActivity tossMoneySettingActivity, View view) throws Throwable {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1820302L, false, (String) null, (Map) null, new TossMoneySettingActivity$.ExternalSyntheticLambda2(tossMoneySettingActivity), 14, (Object) null);
        int iOnWarmupCompleted = CreditQuizMyPageActivity.IAuthTabCallbackDefault.onWarmupCompleted();
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022053).substring(11, 12).codePointAt(0) + 1105440407;
        int iOnWarmupCompleted2 = OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted();
        SessionTrackerb sessionTrackerb = (SessionTrackerb) onExtraCallbackWithResult(CreditQuizMyPageActivity.IAuthTabCallbackDefault.onWarmupCompleted(), 941146737, iOnWarmupCompleted2, new Object[]{tossMoneySettingActivity}, -941146734, iOnWarmupCompleted, iCodePointAt);
        Object[] objArr = new Object[1];
        a(Color.argb(0, 0, 0, 0) + 82, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 11, new char[]{14, 14, '\n', 15, 0, 65534, 4, 17, '\r', 0, 14, 14, 2, '\t', 4, 15, 15, 0, 14, 65530, 20, 0, '\t', '\n', '\b', 14, 14, '\n', 15, 65496, '\r', 0, '\r', '\r', 0, 1, 0, '\r', 65498, 7, 0, 65534, '\t', 65532, 65534, 65482, 20, 65532, 11, 20, 14, 65532, 0, 65482, 0, 2, '\r', 65532, 3, 65534, 65482, 20, 0, '\t', '\n', '\b', 65480, 14, 14, '\n', 15, 65482, '\r', '\n', 15, 4, 14, 4, 17, 65482, 65482, 65493}, true, 262 - (KeyEvent.getMaxKeyCode() >> 16), objArr);
        SessionTrackerb.IAuthTabCallback(sessionTrackerb, tossMoneySettingActivity, ((String) objArr[0]).intern(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        int i2 = onActivityLayout + 105;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static final Unit asInterface(TossMoneySettingActivity tossMoneySettingActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onActivityResized + 41;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("user_type", tossMoneySettingActivity.ICustomTabsServiceStub());
        Unit unit = Unit.INSTANCE;
        int i4 = onActivityLayout + 93;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void asBinder(TossMoneySettingActivity tossMoneySettingActivity, View view) throws Throwable {
        Object obj;
        String strIntern;
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1232753L, false, (String) null, (Map) null, new TossMoneySettingActivity$.ExternalSyntheticLambda12(tossMoneySettingActivity), 14, (Object) null);
        if (!addExtra.extraCallback(PlayerErrorCode.onWarmupCompleted)) {
            Object[] objArr = new Object[1];
            a(((byte) KeyEvent.getModifierMetaStateMask()) + 57, 45 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), new char[]{'\t', 7, '\r', '\r', '\t', 14, 65495, '\f', 65535, '\f', '\f', 65535, 0, 65535, '\f', 65497, 2, '\r', 65531, 65533, 65479, '\r', 16, 65533, 65481, '\r', '\b', 65535, 65535, 14, 65481, 65481, 65492, '\r', '\r', '\t', 14, 65535, 65533, 3, 16, '\f', 65535, '\r', '\r', 1, '\b', 3, 14, 14, 65535, '\r', 65529, 19, 65535, '\b'}, true, 263 - Color.blue(0), objArr);
            strIntern = ((String) objArr[0]).intern();
            int i2 = onActivityLayout + 47;
            onActivityResized = i2 % 128;
            int i3 = i2 % 2;
        } else {
            int i4 = onActivityResized + 69;
            onActivityLayout = i4 % 128;
            if (i4 % 2 != 0) {
                Object[] objArr2 = new Object[1];
                c(new char[]{36688, 9440, 19521, 17550, 30732, '!', 26203, 4300, 1989, 13049, 12723, 49644, 42521, 10398, 10982, 11641, 10283, 33076, 30387, 32773, 12628, 16665, 40699, 3708, 32281, 22885, 56635, 20676, 7097, 36381, 30318, 38767, 5399, 40495, 43812, 28692, 25121, 34183, 1555, 50964, 27176, 59282, 35600, 60194, 54386, 38005, 3363, 47922, 50768, 16025, 43171, 11746, 38433, 26282, 38937, 63697, 56234, 2858, 523, 20658, 9912, 26698, 35739, 26139, 14301}, TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET) - 83929136, new char[]{0, 0, 0, 0}, (char) (6978 % TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 1)), new char[]{53261, 65367, 36090, 35184}, objArr2);
                obj = objArr2[0];
            } else {
                Object[] objArr3 = new Object[1];
                c(new char[]{36688, 9440, 19521, 17550, 30732, '!', 26203, 4300, 1989, 13049, 12723, 49644, 42521, 10398, 10982, 11641, 10283, 33076, 30387, 32773, 12628, 16665, 40699, 3708, 32281, 22885, 56635, 20676, 7097, 36381, 30318, 38767, 5399, 40495, 43812, 28692, 25121, 34183, 1555, 50964, 27176, 59282, 35600, 60194, 54386, 38005, 3363, 47922, 50768, 16025, 43171, 11746, 38433, 26282, 38937, 63697, 56234, 2858, 523, 20658, 9912, 26698, 35739, 26139, 14301}, TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET) - 83929136, new char[]{0, 0, 0, 0}, (char) (28812 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0)), new char[]{53261, 65367, 36090, 35184}, objArr3);
                obj = objArr3[0];
            }
            strIntern = ((String) obj).intern();
        }
        String str = strIntern;
        int iOnWarmupCompleted = CreditQuizMyPageActivity.IAuthTabCallbackDefault.onWarmupCompleted();
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022053).substring(11, 12).codePointAt(0) + 1105440407;
        SessionTrackerb.IAuthTabCallback((SessionTrackerb) onExtraCallbackWithResult(CreditQuizMyPageActivity.IAuthTabCallbackDefault.onWarmupCompleted(), 941146737, OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{tossMoneySettingActivity}, -941146734, iOnWarmupCompleted, iCodePointAt), tossMoneySettingActivity, str, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
    }

    private static final Unit onTransact(TossMoneySettingActivity tossMoneySettingActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 81;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("user_type", tossMoneySettingActivity.ICustomTabsServiceStub());
        Unit unit = Unit.INSTANCE;
        int i4 = onActivityResized + 25;
        onActivityLayout = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback_Parcel(TossMoneySettingActivity tossMoneySettingActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onActivityResized + 113;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("user_type", tossMoneySettingActivity.ICustomTabsServiceStub());
        Unit unit = Unit.INSTANCE;
        int i4 = onActivityLayout + 37;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 61 / 0;
        }
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void access000(TossMoneySettingActivity tossMoneySettingActivity, View view) throws Throwable {
        String strIntern;
        Object obj;
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1672134L, false, (String) null, (Map) null, new TossMoneySettingActivity$.ExternalSyntheticLambda15(tossMoneySettingActivity), 14, (Object) null);
        if (!addExtra.extraCallback(PlayerErrorCode.onWarmupCompleted)) {
            Object[] objArr = new Object[1];
            a(73 - (KeyEvent.getMaxKeyCode() >> 16), Color.blue(0) + 3, new char[]{'\b', 1, '\r', '\r', 65535, '\f', 16, 3, 65533, 65535, 14, '\t', '\r', '\r', 65492, 65481, 65481, 14, 65535, 65535, '\b', '\r', 65481, 14, '\t', '\r', '\r', 65479, 7, '\t', '\b', 65535, 19, 65481, 6, 3, 7, 3, 14, 65531, 14, 3, '\t', '\b', 65481, 11, '\b', 65531, 65497, '\f', 65535, 0, 65535, '\f', '\f', 65535, '\f', 65495, 14, '\t', '\r', '\r', 7, '\t', '\b', 65535, 19, 65529, '\r', 65535, 14, 14, 3}, false, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 263, objArr);
            strIntern = ((String) objArr[0]).intern();
        } else {
            int i2 = onActivityLayout + 3;
            onActivityResized = i2 % 128;
            if (i2 % 2 == 0) {
                Object[] objArr2 = new Object[1];
                a(2 / View.MeasureSpec.makeMeasureSpec(1, 1), 3 << AndroidCharacter.getMirror((char) 6), new char[]{'\f', 65535, 0, 65535, '\f', 65497, 65531, '\b', 11, 65481, '\b', '\t', 3, 14, 65531, 14, 3, 7, 3, 6, 65481, 19, 65535, '\b', '\t', 7, 65479, '\r', '\r', '\t', 14, 65481, '\f', '\t', 14, 3, '\r', 3, 16, 65481, 65481, 65492, '\r', '\r', '\t', 14, 65535, 65533, 3, 16, '\f', 65535, '\r', '\r', 1, '\b', 3, 14, 14, 65535, '\r', 65529, 19, 65535, '\b', '\t', 7, '\r', '\r', '\t', 14, 65495, '\f', 65535, '\f'}, false, 3909 >> TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, 'T', 1), objArr2);
                obj = objArr2[0];
            } else {
                Object[] objArr3 = new Object[1];
                a(View.MeasureSpec.makeMeasureSpec(0, 0) + 75, AndroidCharacter.getMirror('0') + 5, new char[]{'\f', 65535, 0, 65535, '\f', 65497, 65531, '\b', 11, 65481, '\b', '\t', 3, 14, 65531, 14, 3, 7, 3, 6, 65481, 19, 65535, '\b', '\t', 7, 65479, '\r', '\r', '\t', 14, 65481, '\f', '\t', 14, 3, '\r', 3, 16, 65481, 65481, 65492, '\r', '\r', '\t', 14, 65535, 65533, 3, 16, '\f', 65535, '\r', '\r', 1, '\b', 3, 14, 14, 65535, '\r', 65529, 19, 65535, '\b', '\t', 7, '\r', '\r', '\t', 14, 65495, '\f', 65535, '\f'}, true, TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0) + 264, objArr3);
                obj = objArr3[0];
            }
            strIntern = ((String) obj).intern();
        }
        String str = strIntern;
        int iOnWarmupCompleted = CreditQuizMyPageActivity.IAuthTabCallbackDefault.onWarmupCompleted();
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022053).substring(11, 12).codePointAt(0) + 1105440407;
        int iOnWarmupCompleted2 = OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted();
        SessionTrackerb.IAuthTabCallback((SessionTrackerb) onExtraCallbackWithResult(CreditQuizMyPageActivity.IAuthTabCallbackDefault.onWarmupCompleted(), 941146737, iOnWarmupCompleted2, new Object[]{tossMoneySettingActivity}, -941146734, iOnWarmupCompleted, iCodePointAt), tossMoneySettingActivity, str, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        int i3 = onActivityResized + 11;
        onActivityLayout = i3 % 128;
        int i4 = i3 % 2;
    }

    private static final Unit access000(TossMoneySettingActivity tossMoneySettingActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 81;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("user_type", tossMoneySettingActivity.ICustomTabsServiceStub());
        Unit unit = Unit.INSTANCE;
        int i4 = onActivityResized + 105;
        onActivityLayout = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 3 / 0;
        }
        return unit;
    }

    private final void validateRelationship() {
        int i;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = onActivityLayout + 119;
        int i6 = i5 % 128;
        onActivityResized = i6;
        int i7 = i5 % 2;
        View view = this.readTypedObject;
        TdsListRowV1View tdsListRowV1View = null;
        if (view == null) {
            int i8 = i6 + 69;
            onActivityLayout = i8 % 128;
            if (i8 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                int i9 = 3 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            }
            view = null;
        }
        PlayerErrorCode playerErrorCode = PlayerErrorCode.onWarmupCompleted;
        if (addExtra.extraCallback(playerErrorCode) || !addExtra.IAuthTabCallback(playerErrorCode)) {
            int i10 = onActivityResized + 41;
            onActivityLayout = i10 % 128;
            int i11 = i10 % 2;
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        View view2 = this.extraCallback;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            view2 = null;
        }
        if (addExtra.extraCallback(playerErrorCode)) {
            i2 = 0;
        } else if (addExtra.IAuthTabCallback(playerErrorCode)) {
            i2 = 8;
        } else {
            int i12 = onActivityResized + 103;
            onActivityLayout = i12 % 128;
            int i13 = i12 % 2;
            i2 = 0;
        }
        view2.setVisibility(i2);
        View view3 = this.IAuthTabCallback_Parcel;
        if (view3 == null) {
            int i14 = onActivityResized + 37;
            onActivityLayout = i14 % 128;
            if (i14 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            view3 = null;
        }
        if (addExtra.extraCallback(playerErrorCode)) {
            int i15 = onActivityResized + 71;
            onActivityLayout = i15 % 128;
            int i16 = i15 % 2;
            i3 = 0;
        } else {
            i3 = 8;
        }
        view3.setVisibility(i3);
        View view4 = this.asBinder;
        if (view4 == null) {
            int i17 = onActivityLayout + 39;
            onActivityResized = i17 % 128;
            int i18 = i17 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            view4 = null;
        }
        view4.setVisibility(addExtra.extraCallback(playerErrorCode) ? 8 : 0);
        onLoadStarted.onExtraCallback(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), null, null, new IAuthTabCallback(null), 3, null);
        TdsListRowV1View tdsListRowV1View2 = this.asBinder;
        if (tdsListRowV1View2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            tdsListRowV1View2 = null;
        }
        tdsListRowV1View2.setOnClickListener(new TossMoneySettingActivity$.ExternalSyntheticLambda5(this));
        TdsListRowV1View tdsListRowV1View3 = this.access000;
        if (tdsListRowV1View3 == null) {
            int i19 = onActivityResized + 15;
            onActivityLayout = i19 % 128;
            int i20 = i19 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            tdsListRowV1View3 = null;
        }
        tdsListRowV1View3.setOnClickListener(new TossMoneySettingActivity$.ExternalSyntheticLambda6(this));
        TdsListRowV1View tdsListRowV1View4 = this.getInterfaceDescriptor;
        if (tdsListRowV1View4 == null) {
            int i21 = onActivityLayout + 67;
            onActivityResized = i21 % 128;
            if (i21 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            tdsListRowV1View4 = null;
        }
        tdsListRowV1View4.setOnClickListener(new TossMoneySettingActivity$.ExternalSyntheticLambda7(this));
        TdsListRowV1View tdsListRowV1View5 = this.IAuthTabCallback_Parcel;
        if (tdsListRowV1View5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            tdsListRowV1View5 = null;
        }
        tdsListRowV1View5.setOnClickListener(new TossMoneySettingActivity$.ExternalSyntheticLambda8(this));
        TdsListRowV1View tdsListRowV1View6 = this.readTypedObject;
        if (tdsListRowV1View6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            tdsListRowV1View6 = null;
        }
        tdsListRowV1View6.setOnClickListener(new TossMoneySettingActivity$.ExternalSyntheticLambda9(this));
        TdsListRowV1View tdsListRowV1View7 = this.extraCallback;
        if (tdsListRowV1View7 == null) {
            int i22 = onActivityLayout + 77;
            onActivityResized = i22 % 128;
            if (i22 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            tdsListRowV1View7 = null;
        }
        tdsListRowV1View7.setOnClickListener(new TossMoneySettingActivity$.ExternalSyntheticLambda10(this));
        TdsListRowV1View tdsListRowV1View8 = this.access100;
        if (tdsListRowV1View8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
        } else {
            tdsListRowV1View = tdsListRowV1View8;
        }
        tdsListRowV1View.setOnClickListener(new TossMoneySettingActivity$.ExternalSyntheticLambda11(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onNavigationEvent(access13800<? super Boolean> access13800Var) {
        onWarmupCompleted onwarmupcompleted;
        Object objM31constructorimpl;
        int i = 2 % 2;
        if (access13800Var instanceof onWarmupCompleted) {
            onwarmupcompleted = (onWarmupCompleted) access13800Var;
            int i2 = onwarmupcompleted.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                onwarmupcompleted.label = i2 - 2147483648;
            } else {
                onwarmupcompleted = new onWarmupCompleted(access13800Var);
            }
        }
        Object objOnWarmupCompleted = onwarmupcompleted.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i3 = onwarmupcompleted.label;
        try {
            if (i3 != 0) {
                int i4 = onActivityResized + 57;
                onActivityLayout = i4 % 128;
                if (i4 % 2 == 0 ? i3 != 1 : i3 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(objOnWarmupCompleted);
            } else {
                ResultKt.onNavigationEvent(objOnWarmupCompleted);
                Result.Companion companion = Result.Companion;
                writeRaw writerawOnTransact = UST_CERT_GetSignatureAlgorithm.onExtraCallback.onExtraCallback().onTransact();
                Intrinsics.checkNotNullExpressionValue(writerawOnTransact, "");
                onwarmupcompleted.L$0 = access15400.onNavigationEvent(onwarmupcompleted);
                onwarmupcompleted.I$0 = 0;
                onwarmupcompleted.I$1 = 0;
                onwarmupcompleted.label = 1;
                objOnWarmupCompleted = RxAwaitKt.onWarmupCompleted(writerawOnTransact, onwarmupcompleted);
                if (objOnWarmupCompleted == objOnExtraCallback) {
                    int i5 = onActivityResized + 9;
                    onActivityLayout = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 47 / 0;
                    }
                    return objOnExtraCallback;
                }
            }
            objM31constructorimpl = Result.m31constructorimpl(objOnWarmupCompleted);
        } catch (WebResourceResponseModel e) {
            Result.Companion companion2 = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e));
        } catch (CancellationException e2) {
            throw e2;
        } catch (Exception e3) {
            Result.Companion companion3 = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e3));
        }
        String strIAuthTabCallbackDefault = null;
        if (Result.onExtraCallback(objM31constructorimpl)) {
            objM31constructorimpl = null;
        }
        CheckoutResult checkoutResult = (CheckoutResult) objM31constructorimpl;
        if (checkoutResult != null) {
            int i7 = onActivityResized + 73;
            onActivityLayout = i7 % 128;
            int i8 = i7 % 2;
            strIAuthTabCallbackDefault = checkoutResult.IAuthTabCallbackDefault();
        }
        return access14000.onNavigationEvent(Intrinsics.areEqual(strIAuthTabCallbackDefault, "PASSPORT_ENHANCED_VERIFY"));
    }

    public static /* synthetic */ Unit onExtraCallback(TossMoneySettingActivity tossMoneySettingActivity, SetDetectableSize setDetectableSize) {
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted(), -1937332451, iOnWarmupCompleted3, new Object[]{tossMoneySettingActivity, setDetectableSize}, 1937332458, iOnWarmupCompleted, iOnWarmupCompleted2);
    }

    public static /* synthetic */ void onExtraCallback(TossMoneySettingActivity tossMoneySettingActivity, View view) throws Throwable {
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted();
        onExtraCallbackWithResult(OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted(), 672245542, iOnWarmupCompleted3, new Object[]{tossMoneySettingActivity, view}, -672245537, iOnWarmupCompleted, iOnWarmupCompleted2);
    }

    public static final /* synthetic */ TdsListRowV1View onExtraCallback(TossMoneySettingActivity tossMoneySettingActivity) {
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted();
        return (TdsListRowV1View) onExtraCallbackWithResult(OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted(), 950032957, iOnWarmupCompleted3, new Object[]{tossMoneySettingActivity}, -950032956, iOnWarmupCompleted, iOnWarmupCompleted2);
    }

    public static final /* synthetic */ TdsListRowV1View onExtraCallbackWithResult(TossMoneySettingActivity tossMoneySettingActivity) {
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted();
        return (TdsListRowV1View) onExtraCallbackWithResult(OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted(), 125137651, iOnWarmupCompleted3, new Object[]{tossMoneySettingActivity}, -125137645, iOnWarmupCompleted, iOnWarmupCompleted2);
    }

    private static final Unit asBinder(TossMoneySettingActivity tossMoneySettingActivity, SetDetectableSize setDetectableSize) {
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted(), -2066529741, iOnWarmupCompleted3, new Object[]{tossMoneySettingActivity, setDetectableSize}, 2066529743, iOnWarmupCompleted, iOnWarmupCompleted2);
    }

    private static final void IAuthTabCallbackStubProxy(TossMoneySettingActivity tossMoneySettingActivity, View view) throws Throwable {
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted();
        onExtraCallbackWithResult(OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted(), 764377866, iOnWarmupCompleted3, new Object[]{tossMoneySettingActivity, view}, -764377862, iOnWarmupCompleted, iOnWarmupCompleted2);
    }

    private static final void access100(TossMoneySettingActivity tossMoneySettingActivity, View view) throws Throwable {
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted();
        onExtraCallbackWithResult(OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted(), -1342320404, iOnWarmupCompleted3, new Object[]{tossMoneySettingActivity, view}, 1342320412, iOnWarmupCompleted, iOnWarmupCompleted2);
    }

    private static final void getInterfaceDescriptor(TossMoneySettingActivity tossMoneySettingActivity, View view) throws Throwable {
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted();
        onExtraCallbackWithResult(OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted(), 1880616632, iOnWarmupCompleted3, new Object[]{tossMoneySettingActivity, view}, -1880616632, iOnWarmupCompleted, iOnWarmupCompleted2);
    }

    public final SessionTrackerb IAuthTabCallback() {
        int iOnWarmupCompleted = CreditQuizMyPageActivity.IAuthTabCallbackDefault.onWarmupCompleted();
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022053).substring(11, 12).codePointAt(0) + 1105440407;
        int iOnWarmupCompleted2 = OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted();
        return (SessionTrackerb) onExtraCallbackWithResult(CreditQuizMyPageActivity.IAuthTabCallbackDefault.onWarmupCompleted(), 941146737, iOnWarmupCompleted2, new Object[]{this}, -941146734, iOnWarmupCompleted, iCodePointAt);
    }

    @Override // viva.republica.toss.account.detail.Hilt_TossMoneySettingActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = onActivityResized + 95;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.account.detail.Hilt_TossMoneySettingActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 111;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            int i4 = 8 / 0;
        }
    }

    @Override // viva.republica.toss.account.detail.Hilt_TossMoneySettingActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = onActivityResized + 53;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void onNavigationEvent() {
        extraCallbackWithResult = 478309000;
        ICustomTabsCallback = 7798559133331975163L;
        onPostMessage = -1776194565;
        onMinimized = (char) 10855;
    }
}
