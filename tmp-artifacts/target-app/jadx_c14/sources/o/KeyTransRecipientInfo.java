package o;

import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import im.toss.uikit.widget.TdsResultV0View;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.KeyTransRecipientInfo;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class KeyTransRecipientInfo extends RecipientIdentifier<EncryptedData> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallback Companion;
    private static final String ICustomTabsCallback;
    public static final int extraCallback;
    private static int onActivityLayout = 1;
    private static int onActivityResized = 1;
    private static int onMessageChannelReady;
    private static int[] onMinimized;
    private static int onPostMessage;
    private final TdsResultV0View writeTypedObject;

    static {
        onNavigationEvent();
        Object[] objArr = new Object[1];
        a(new int[]{-1275358866, 1687925985, 821460307, -942449940, -1020442441, -178414828, -594832251, -1364545086, 683723429, 1242504477, 1980057667, -1430890001, 1672460246, 740880230, -241498413, 1273265632, -835124946, 1859740813, 1095336327, 1753987883, -989971237, -1081060141, 1810437137, 425274295, -2083209062, 1402761695, 959145033, -1396792926}, 54 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr);
        ICustomTabsCallback = ((String) objArr[0]).intern();
        Companion = new onExtraCallback(null);
        extraCallback = 8;
        int i = onPostMessage + 97;
        onActivityLayout = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(EncryptedData encryptedData, View view) {
        int i = 2 % 2;
        int i2 = onActivityResized + 93;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(encryptedData, view);
        }
        onExtraCallback(encryptedData, view);
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyTransRecipientInfo(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        this.writeTypedObject = (TdsResultV0View) view;
    }

    @Override // o.RecipientIdentifier
    public /* synthetic */ void IAuthTabCallback(getOther getother) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityResized + 79;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted((EncryptedData) getother);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onActivityResized + 47;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0026 A[PHI: r3
      0x0026: PHI (r3v2 kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit>) = 
      (r3v1 kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit>)
      (r3v4 kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit>)
     binds: [B:8:0x0024, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onExtraCallback(o.EncryptedData r3, android.view.View r4) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.KeyTransRecipientInfo.onMessageChannelReady
            int r1 = r1 + 45
            int r2 = r1 % 128
            o.KeyTransRecipientInfo.onActivityResized = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            if (r1 != 0) goto L1d
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            kotlin.jvm.functions.Function1 r3 = r3.IAuthTabCallbackStub()
            r1 = 5
            int r1 = r1 / 0
            if (r3 == 0) goto L29
            goto L26
        L1d:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            kotlin.jvm.functions.Function1 r3 = r3.IAuthTabCallbackStub()
            if (r3 == 0) goto L29
        L26:
            r3.invoke(r4)
        L29:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            int r4 = o.KeyTransRecipientInfo.onMessageChannelReady
            int r4 = r4 + 101
            int r1 = r4 % 128
            o.KeyTransRecipientInfo.onActivityResized = r1
            int r4 = r4 % r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.KeyTransRecipientInfo.onExtraCallback(o.EncryptedData, android.view.View):kotlin.Unit");
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    public void onWarmupCompleted(@NotNull final EncryptedData encryptedData) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(encryptedData, "");
        TdsResultV0View tdsResultV0View = this.writeTypedObject;
        String strIAuthTabCallback = encryptedData.IAuthTabCallback();
        if (strIAuthTabCallback == null) {
            Object[] objArr = new Object[1];
            a(new int[]{-1275358866, 1687925985, 821460307, -942449940, -1020442441, -178414828, -594832251, -1364545086, 683723429, 1242504477, 1980057667, -1430890001, 1672460246, 740880230, -241498413, 1273265632, -835124946, 1859740813, 1095336327, 1753987883, -989971237, -1081060141, 1810437137, 425274295, -2083209062, 1402761695, 959145033, -1396792926}, 55 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr);
            strIAuthTabCallback = ((String) objArr[0]).intern();
            int i2 = onMessageChannelReady + 109;
            onActivityResized = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 5 % 2;
            }
        }
        tdsResultV0View.setLottieImageFromUrl(strIAuthTabCallback);
        tdsResultV0View.setTitle(encryptedData.asInterface());
        tdsResultV0View.setSubtitle(encryptedData.IAuthTabCallbackDefault());
        tdsResultV0View.setButtonLabel(encryptedData.onExtraCallback());
        tdsResultV0View.setButtonStyle(encryptedData.onWarmupCompleted());
        tdsResultV0View.setButtonType(encryptedData.onExtraCallbackWithResult());
        tdsResultV0View.setOnButtonClickListener(new Function1() { // from class: viva.republica.toss.card.viewholder.EmptyViewHolder$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return KeyTransRecipientInfo.onExtraCallbackWithResult(encryptedData, (View) obj);
            }
        });
        ViewGroup.LayoutParams layoutParams = tdsResultV0View.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        int i4 = onActivityResized + 23;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        float fAsBinder = encryptedData.asBinder();
        DisplayMetrics displayMetrics = tdsResultV0View.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        marginLayoutParams.topMargin = varyMatches.onNavigationEvent(Float.valueOf(fAsBinder), displayMetrics);
        float fOnNavigationEvent = encryptedData.onNavigationEvent();
        DisplayMetrics displayMetrics2 = tdsResultV0View.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        marginLayoutParams.bottomMargin = varyMatches.onNavigationEvent(Float.valueOf(fOnNavigationEvent), displayMetrics2);
        tdsResultV0View.setLayoutParams(marginLayoutParams);
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = onMinimized;
        int i5 = -1469660336;
        int i6 = 0;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i7 = $10 + 111;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 0;
            while (i9 < length2) {
                int i10 = $10 + 43;
                $11 = i10 % 128;
                if (i10 % i3 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr3[i9])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(""), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 73, 8847 - Process.getGidForName(""), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr4[i9] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(iArr3[i9])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (KeyEvent.getMaxKeyCode() >> 16) + 72, 8848 - (ViewConfiguration.getTouchSlop() >> 8), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr4[i9] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        i9++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i3 = 2;
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = onMinimized;
        if (iArr6 != null) {
            int i11 = $10 + 3;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 0;
            }
            while (i2 < length) {
                int i12 = $11 + 7;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    try {
                        Object[] objArr4 = new Object[1];
                        objArr4[i6] = Integer.valueOf(iArr6[i2]);
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(""), 71 - ((byte) KeyEvent.getModifierMetaStateMask()), 8849 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr2[i2] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } else {
                    Object[] objArr5 = {Integer.valueOf(iArr6[i2])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getScrollBarSize() >> 8) + 72, TextUtils.indexOf((CharSequence) "", '0') + 8849, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr2[i2] = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                    i2++;
                }
                i5 = -1469660336;
                i6 = 0;
            }
            iArr6 = iArr2;
        }
        int i13 = i6;
        System.arraycopy(iArr6, i13, iArr5, i13, length3);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i13;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[i13] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            int i14 = 0;
            for (int i15 = 16; i14 < i15; i15 = 16) {
                int i16 = $11 + 61;
                $10 = i16 % 128;
                int i17 = i16 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[i14];
                Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22251 - ImageFormat.getBitsPerPixel(0)), 39 - (ViewConfiguration.getTouchSlop() >> 8), 10302 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i14++;
            }
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i18;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr5[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[17];
            int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr7 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback6 == null) {
                objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "") + 4033), TextUtils.lastIndexOf("", '0') + 79, 7398 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback6).invoke(null, objArr7);
            i13 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onNavigationEvent() {
        onMinimized = new int[]{-1470971251, 1783771689, 192119941, -1010549298, 1807951130, 507369748, -375118770, -581438129, 168728984, -1655853025, -1403264306, -1315346284, 2007654549, -1579661635, -1596017459, -63723269, -974551102, 253823609};
    }
}
