package o;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ExtHubInitializer implements ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1 {
    private final Map<Class<? extends drawTextBox>, List<String>> onExtraCallback;
    private final int onExtraCallbackWithResult;
    private final Map<String, Class<? extends drawTextBox>> onWarmupCompleted;
    private static final byte[] $$a = {87, -2, 11, -41};
    private static final int $$b = 77;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static long onNavigationEvent = 7798559133331975163L;
    private static int IAuthTabCallback = -1776194565;
    private static char asInterface = 41879;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, short s, int i) {
        int i2;
        int i3 = b + 109;
        int i4 = s * 3;
        byte[] bArr = $$a;
        int i5 = 3 - (i * 4);
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            i3 = i4;
            int i6 = i5;
            int i7 = 0;
            i3 += i5;
            i5 = i6;
            i2 = i7;
            bArr2[i2] = (byte) i3;
            i7 = i2 + 1;
            int i8 = i5 + 1;
            if (i2 == i4) {
                return new String(bArr2, 0);
            }
            i6 = i8;
            i5 = bArr[i8];
            i3 += i5;
            i5 = i6;
            i2 = i7;
            bArr2[i2] = (byte) i3;
            i7 = i2 + 1;
            int i82 = i5 + 1;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            i7 = i2 + 1;
            int i822 = i5 + 1;
            if (i2 == i4) {
            }
        }
    }

    public ExtHubInitializer() throws Throwable {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.onWarmupCompleted = linkedHashMap;
        this.onExtraCallback = access8100.onNavigationEvent();
        this.onExtraCallbackWithResult = linkedHashMap.size();
        linkedHashMap.put("closeTossBankTransferWeb", reportNoCallback.class);
        linkedHashMap.put("finishTossBankTransferSession", reportNoTrigger.class);
        linkedHashMap.put("getIsPasswordRequiredForSend", firstTrigger.class);
        linkedHashMap.put("getSendInfoFromText", ShakeAnalyse.class);
        linkedHashMap.put("getTossBankTransferInfo", report.class);
        linkedHashMap.put("setTossBankDepositMemo", setGyrState.class);
        Object[] objArr = new Object[1];
        a((char) (28870 - ((Process.getThreadPriority(0) + 20) >> 6)), View.MeasureSpec.getSize(0) + 1231469358, new char[]{48072, 15576, 40945, 1637, 16984, 61750, 17789, 44541, 7694, 41215, 44217, 38657, 12140, 48269, 39158, 12945, 61153, 33324, 3197, 27375, 57802, 57237, 60323, 1179, 34925, 63493, 51216}, new char[]{0, 0, 0, 0}, new char[]{11854, 26299, 50761, 42096}, objArr);
        linkedHashMap.put(((String) objArr[0]).intern(), reportSupport.class);
        linkedHashMap.put("tossBankCertRequestMultiSign", setSubType.class);
        linkedHashMap.put("tossBankCertRequestSignV2", reportTrigger.class);
        linkedHashMap.put("tossBankCertRequestSignV3", setBizType.class);
        linkedHashMap.put("tossBankCertRestore", ShakeHelper.class);
        linkedHashMap.put("tossBankDecryptPayload", setValueZero.class);
        linkedHashMap.put("tossBankDecryptPayloadWithRandomIv", analyseNoTriggerReason.class);
        linkedHashMap.put("tossBankEncryptPayloadWithRandomIv", ShakeHelper1.class);
        linkedHashMap.put("tossBankGetDeviceSession", access408.class);
        linkedHashMap.put("tossBankGetSecureStorageValue", ShakeHelperInterface.class);
        linkedHashMap.put("tossBankSetSecureStorageValue", ShakeHelperInterface.class);
        linkedHashMap.put("tossBankRemoveSecureStorageValue", ShakeHelperInterface.class);
        linkedHashMap.put("tossBankTransactionMemo", isTrigger.class);
        linkedHashMap.put("tossBankUnifiedLaunchV2", formatFileSize.class);
    }

    @Override // o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1
    public Map<Class<? extends drawTextBox>, List<String>> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 103;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Map<Class<? extends drawTextBox>, List<String>> map = this.onExtraCallback;
        int i5 = i2 + 123;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    @Override // o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1
    public drawTextBox IAuthTabCallback(@NotNull String str) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            Class<? extends drawTextBox> cls = this.onWarmupCompleted.get(str);
            if (cls == null) {
                return null;
            }
            return cls.newInstance();
        }
    }

    @Override // o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1
    public Set<String> onExtraCallbackWithResult() {
        Set<String> setKeySet;
        synchronized (this) {
            setKeySet = this.onWarmupCompleted.keySet();
        }
        return setKeySet;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
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
            int i4 = $10 + 81;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                    int tapTimeout = 43 - (ViewConfiguration.getTapTimeout() >> 16);
                    int iAlpha = 1451 - Color.alpha(0);
                    byte b = (byte) ($$b & 3);
                    byte b2 = (byte) (b - 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(offsetBefore, tapTimeout, iAlpha, 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - TextUtils.indexOf("", "")), (ViewConfiguration.getWindowTouchSlop() >> 8) + 44, TextUtils.indexOf((CharSequence) "", '0', 0) + 1495, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - ExpandableListView.getPackedPositionGroup(0L)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 50, TextUtils.lastIndexOf("", '0', 0) + 22940, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0') + 45849), (-16777187) - Color.rgb(0, 0, 0), 12577 - (KeyEvent.getMaxKeyCode() >> 16), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                            cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onNavigationEvent ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallback ^ 7798559133331975163L))) ^ ((char) (asInterface ^ 7798559133331975163L)));
                            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                            int i6 = $11 + 111;
                            $10 = i6 % 128;
                            int i7 = i6 % 2;
                            i2 = 2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr6);
    }
}
