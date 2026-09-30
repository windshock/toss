package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
import im.toss.features.home.core.local.model.dst.handler.HandlerLocal$LocalAction$BubbleTooltip;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class setWorkerReady extends onReceiveCdp<HandlerLocal.LocalAction> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static boolean IAuthTabCallback = false;
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    private static int onExtraCallback;
    private static boolean onExtraCallbackWithResult;
    private static char[] onNavigationEvent;
    public static final setWorkerReady onWarmupCompleted;

    static {
        onExtraCallbackWithResult();
        onWarmupCompleted = new setWorkerReady();
        int i = asBinder + 125;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private setWorkerReady() throws Throwable {
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(HandlerLocal.LocalAction.class);
        Pair[] pairArr = {getWrite.IAuthTabCallback("DEFAULT_LOCAL_ACTION", Reflection.getOrCreateKotlinClass(HandlerLocal.LocalAction.Default.class)), getWrite.IAuthTabCallback("SHOW_YEAR_MONTH_BOTTOM_SHEET", Reflection.getOrCreateKotlinClass(HandlerLocal.LocalAction.ShowYearMonthBottomSheet.class)), getWrite.IAuthTabCallback("SELECT_YEAR_MONTH", Reflection.getOrCreateKotlinClass(HandlerLocal.LocalAction.SelectYearMonth.class)), getWrite.IAuthTabCallback("SHOW_CARD_BILL_DETAIL_PAYMENT_DATE_BOTTOM_SHEET", Reflection.getOrCreateKotlinClass(HandlerLocal.LocalAction.ShowCardBillDetailPaymentDateBottomSheet.class)), getWrite.IAuthTabCallback("SELECT_CARD_BILL_DETAIL_PAYMENT_DATE", Reflection.getOrCreateKotlinClass(HandlerLocal.LocalAction.CardBillSelectYearMonth.class)), getWrite.IAuthTabCallback("COPY", Reflection.getOrCreateKotlinClass(HandlerLocal.LocalAction.Copy.class)), getWrite.IAuthTabCallback("BUBBLE_TOOLTIP", Reflection.getOrCreateKotlinClass(HandlerLocal$LocalAction$BubbleTooltip.class)), getWrite.IAuthTabCallback("SHOW_EXPIRED_ACCOUNT_NUDGE", Reflection.getOrCreateKotlinClass(HandlerLocal.LocalAction.ShowExpiredAccountNudge.class)), getWrite.IAuthTabCallback("REMOVE_CARD_BILL_LIST_CONTAINER_ITEM", Reflection.getOrCreateKotlinClass(HandlerLocal.LocalAction.RemoveCardBillListContainerItem.class))};
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-124, -125, -126, -127}, 128 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr);
        super(orCreateKotlinClass, ((String) objArr[0]).intern(), access8100.onWarmupCompleted(pairArr), "DEFAULT_LOCAL_ACTION");
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2;
        char[] cArr2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = onNavigationEvent;
        char c = '0';
        Object obj = null;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 77 - TextUtils.getOffsetBefore("", 0), 20951 - TextUtils.indexOf("", c), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr4[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i4++;
                    c = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 75, (ViewConfiguration.getScrollBarSize() >> 8) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        int i5 = 1052772399;
        if (IAuthTabCallback) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), TextUtils.indexOf((CharSequence) "", '0') + 64, 12214 - Color.green(0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i5 = 1052772399;
            }
            String str = new String(cArr5);
            int i6 = $11 + 57;
            $10 = i6 % 128;
            if (i6 % 2 == 0) {
                objArr[0] = str;
                return;
            } else {
                obj.hashCode();
                throw null;
            }
        }
        if (!onExtraCallbackWithResult) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i7 = $10 + 53;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback % 1) >> defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] << i] >>> iIntValue);
                    i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted;
                } else {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted + 1;
                }
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = i2;
            }
            objArr[0] = new String(cArr6);
            return;
        }
        int i8 = $10 + 5;
        $11 = i8 % 128;
        if (i8 % 2 == 0) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
        } else {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        }
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i9 = $10 + 59;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 63 - Gravity.getAbsoluteGravity(0, 0), 12214 - TextUtils.getTrimmedLength(""), 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2);
    }

    static void onExtraCallbackWithResult() {
        onNavigationEvent = new char[]{32408, 32621, 32409, 32609};
        onExtraCallback = -1184334066;
        onExtraCallbackWithResult = true;
        IAuthTabCallback = true;
    }
}
