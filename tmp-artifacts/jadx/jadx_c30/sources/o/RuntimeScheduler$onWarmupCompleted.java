package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.google.firebase.messaging.FcmBroadcastProcessor$;
import com.google.gson.JsonObject;
import com.iap.ac.android.biz.common.rpc.request.MobilePaymentInquireQuoteRequest;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.features.tosscert.ui.R;
import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import o.RuntimeScheduler$onWarmupCompleted;
import o.startRunning;
import okhttp3.ResponseBody;
import org.bouncycastle.crypto.signers.PSSSigner;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RuntimeScheduler$onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static short[] onNavigationEvent;
    final /* synthetic */ WebView $view;
    int label;
    final /* synthetic */ RuntimeScheduler this$0;
    private static final byte[] $$a = {35, -27, ISOFileInfo.DATA_BYTES1, ISO7816.INS_INCREASE};
    private static final int $$b = 247;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static int onWarmupCompleted = 2077205943;
    private static int IAuthTabCallback = -1538795461;
    private static int onExtraCallbackWithResult = 1673417906;
    private static byte[] onExtraCallback = {11, -11, 8, 5, -9, -15, 11, 0, -13, 78, ISO7816.INS_READ_BINARY_STAMPED, 11, -6, 43, ISO7816.INS_WRITE_BINARY, 12, 15, -1, 7, -8, -10, ISO7816.INS_ERASE_BINARY, -26, 8, 6, -16, -1, 13, -3, -9, ISO7816.INS_ERASE_BINARY, -11, 11, 4, 75, ISO7816.INS_READ_BINARY, -4, 3, -6, 95, -15, ISO7816.INS_GET_DATA, -14, -12, -15, 0, 13, 74, 15, ISO7816.INS_READ_RECORD2, -5, 11, 1, 9, 11, 74, -15, ISO7816.INS_GET_DATA, -16, -16, 10, 6, -5, 67, 15, -71, -13, 92, PSSSigner.TRAILER_IMPLICIT, 8, 3, -10, 8, 6, 10, 8, -26, 10, 91, ISO7816.INS_READ_BINARY_STAMPED, 11, -6, 43, ISO7816.INS_WRITE_BINARY, 12, 15, -1, 7, -8, -14, 21, -23, 12, 15, -1, 7, -8, 8, 8, 8, 8, 8, 8};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, int i2, short s) {
        int i3;
        int i4 = (i2 * 3) + 4;
        int i5 = s * 2;
        int i6 = (i * 2) + 115;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i5];
        int i7 = 0 - i5;
        if (bArr == null) {
            int i8 = i4;
            int i9 = 0;
            i6 += i4;
            i4 = i8 + 1;
            i3 = i9;
            bArr2[i3] = (byte) i6;
            if (i3 == i7) {
                return new String(bArr2, 0);
            }
            int i10 = i3 + 1;
            i8 = i4;
            i4 = bArr[i4];
            i9 = i10;
            i6 += i4;
            i4 = i8 + 1;
            i3 = i9;
            bArr2[i3] = (byte) i6;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i6;
            if (i3 == i7) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RuntimeScheduler$onWarmupCompleted(WebView webView, RuntimeScheduler runtimeScheduler, access13800<? super RuntimeScheduler$onWarmupCompleted> access13800Var) {
        super(2, access13800Var);
        this.$view = webView;
        this.this$0 = runtimeScheduler;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Exception exc, startRunning startrunning) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 25;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(exc, startrunning);
        int i4 = asInterface + 81;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 87 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        RuntimeScheduler$onWarmupCompleted runtimeScheduler$onWarmupCompleted = new RuntimeScheduler$onWarmupCompleted(this.$view, this.this$0, access13800Var);
        int i2 = asBinder + 11;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return runtimeScheduler$onWarmupCompleted;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 37;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
        int i4 = asInterface + 5;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return objOnWarmupCompleted;
        }
        throw null;
    }

    public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 117;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        int i4 = asInterface + 23;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return objInvokeSuspend;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x01be A[PHI: r0
      0x01be: PHI (r0v9 int) = (r0v8 int), (r0v37 int) binds: [B:39:0x01bc, B:36:0x01aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01c0 A[PHI: r0
      0x01c0: PHI (r0v34 int) = (r0v8 int), (r0v37 int) binds: [B:39:0x01bc, B:36:0x01aa] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5;
        boolean z;
        int length;
        byte[] bArr;
        int i6;
        int i7 = 2;
        int i8 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(IAuthTabCallback)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            long j = 0;
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0) + 43424), 43 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 22439 - ExpandableListView.getPackedPositionType(0L), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z2 = iIntValue == -1;
            if (z2) {
                byte[] bArr2 = onExtraCallback;
                if (bArr2 != null) {
                    int i9 = $11 + 125;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    int length2 = bArr2.length;
                    byte[] bArr3 = new byte[length2];
                    int i11 = 0;
                    while (i11 < length2) {
                        int i12 = $11 + 97;
                        $10 = i12 % 128;
                        int i13 = i12 % i7;
                        Object[] objArr3 = {Integer.valueOf(bArr2[i11])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            char offsetAfter = (char) (TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0) + 12843);
                            int tapTimeout = 55 - (ViewConfiguration.getTapTimeout() >> 16);
                            int i14 = 2168 - (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1));
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(offsetAfter, tapTimeout, i14, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr3[i11] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i11++;
                        int i15 = $11 + 69;
                        $10 = i15 % 128;
                        int i16 = i15 % 2;
                        i7 = 2;
                        j = 0;
                    }
                    bArr2 = bArr3;
                }
                if (bArr2 != null) {
                    byte[] bArr4 = onExtraCallback;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') + 43376), ExpandableListView.getPackedPositionGroup(0L) + 42, 22438 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0'), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr4[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))));
                    int i17 = $11 + 53;
                    $10 = i17 % 128;
                    int i18 = i17 % 2;
                } else {
                    iIntValue = (short) (((short) (onNavigationEvent[i + ((int) (onWarmupCompleted ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i19 = $10 + 21;
                $11 = i19 % 128;
                if (i19 % 2 == 0) {
                    i4 = ((i + iIntValue) << 3) + ((int) (onWarmupCompleted - (-4629411779493505016L)));
                    i5 = z2 ? 1 : 0;
                } else {
                    i4 = ((i + iIntValue) - 2) + ((int) (onWarmupCompleted ^ (-4629411779493505016L)));
                    if (z2) {
                    }
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i4 + i5;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onExtraCallbackWithResult), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), 86 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0), MotionEvent.axisFromString(BuildConfig.FLAVOR) + 9568, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr5 = onExtraCallback;
                if (bArr5 != null) {
                    int i20 = $11 + 67;
                    $10 = i20 % 128;
                    if (i20 % 2 != 0) {
                        length = bArr5.length;
                        bArr = new byte[length];
                        i6 = 1;
                    } else {
                        length = bArr5.length;
                        bArr = new byte[length];
                        i6 = 0;
                    }
                    while (i6 < length) {
                        bArr[i6] = (byte) (bArr5[i6] ^ (-4629411779493505016L));
                        i6++;
                    }
                    bArr5 = bArr;
                }
                if (bArr5 != null) {
                    int i21 = $11 + 61;
                    $10 = i21 % 128;
                    int i22 = i21 % 2;
                    z = true;
                } else {
                    z = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z) {
                        byte[] bArr6 = onExtraCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = onNavigationEvent;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super String>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        int label;
        final /* synthetic */ RuntimeScheduler this$0;
        private static char[] onNavigationEvent = {64984, 65064, 64966, 64915, 64982, 64988, 64991, 64967, 64990, 64916, 65065, 64979, 64960, 64977, 64981, 64978, 64980, 64986, 64965, 64989, 64964, 64961, 64983, 64976, 64987};
        private static char onExtraCallback = 51244;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(RuntimeScheduler runtimeScheduler, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.this$0 = runtimeScheduler;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.this$0, access13800Var);
            int i2 = onWarmupCompleted + 19;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return onextracallback;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            Object objOnWarmupCompleted;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 97;
            onWarmupCompleted = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super String> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
                int i3 = 86 / 0;
            } else {
                objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
            }
            int i4 = onWarmupCompleted + 99;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super String> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 103;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 63;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                String strIAuthTabCallback = RuntimeScheduler.IAuthTabCallback(this.this$0);
                if (strIAuthTabCallback != null) {
                    return strIAuthTabCallback;
                }
                extraData extradataIAuthTabCallbackDefault = AdSettingsIntegrationErrorMode.onNavigationEvent.IAuthTabCallbackDefault();
                Object[] objArr = {this.this$0};
                int iIAuthTabCallback = R.drawable.IAuthTabCallback();
                String str = (String) RuntimeScheduler.onNavigationEvent(objArr, R.drawable.IAuthTabCallback(), 664109897, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -664109880, iIAuthTabCallback);
                this.label = 1;
                obj = extradataIAuthTabCallbackDefault.onWarmupCompleted(str, this);
                if (obj == objOnWarmupCompleted) {
                    int i3 = IAuthTabCallback + 43;
                    onWarmupCompleted = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 22 / 0;
                    }
                    return objOnWarmupCompleted;
                }
            } else {
                if (i2 != 1) {
                    Object[] objArr2 = new Object[1];
                    a(new char[]{20, 18, 13928, 13928, 2, '\b', '\b', 0, 6, 24, 2, 14, 3, 7, '\t', 14, '\b', 18, '\t', 19, 6, 20, 0, 4, 7, 19, 15, 19, '\n', 5, '\t', 14, 0, 23, 22, '\f', 23, 4, 20, '\b', 20, 6, 7, '\f', 18, 15, 13937}, (byte) (114 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 47, objArr2);
                    throw new IllegalStateException(((String) objArr2[0]).intern());
                }
                int i5 = IAuthTabCallback + 113;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                ResultKt.onNavigationEvent(obj);
                int i7 = onWarmupCompleted + 21;
                IAuthTabCallback = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 3 / 4;
                }
            }
            String strString = ((ResponseBody) obj).string();
            Object[] objArr3 = {this.this$0, strString};
            int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
            RuntimeScheduler.onNavigationEvent(objArr3, R.drawable.IAuthTabCallback(), 1848638224, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -1848638201, iIAuthTabCallback2);
            return strString;
        }

        private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr2 = onNavigationEvent;
            Object obj2 = null;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                for (int i4 = 0; i4 < length; i4++) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 25, 23139 - View.resolveSizeAndState(0, 0, 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0') + 1), TextUtils.getTrimmedLength(BuildConfig.FLAVOR) + 26, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 23138, -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                int i5 = $10 + 97;
                $11 = i5 % 128;
                int i6 = i5 % 2;
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
                        int i7 = $11 + 31;
                        $10 = i7 % 128;
                        if (i7 % 2 != 0) {
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback >> b);
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent % 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback + b);
                        } else {
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        }
                        obj = obj2;
                    } else {
                        try {
                            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myPid() >> 22) + 24824), 74 - Color.argb(0, 0, 0, 0), TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0) + 8089, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                                int i8 = $11 + 61;
                                $10 = i8 % 128;
                                int i9 = i8 % 2;
                                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                if (objOnExtraCallback4 == null) {
                                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0') + 1), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 30, 19488 - Color.alpha(0), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                                int i10 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i10];
                                int i11 = $11 + 107;
                                $10 = i11 % 128;
                                int i12 = i11 % 2;
                            } else {
                                obj = null;
                                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                    defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                    int i13 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i13];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i14];
                                } else {
                                    int i15 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    int i16 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i15];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i16];
                                }
                            }
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    obj2 = obj;
                }
            }
            for (int i17 = 0; i17 < i; i17++) {
                cArr4[i17] = (char) (cArr4[i17] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        }
    }

    private static final Unit onExtraCallbackWithResult(Exception exc, startRunning startrunning) throws Throwable {
        int i = 2 % 2;
        JsonObject jsonObject = new JsonObject();
        Object[] objArr = new Object[1];
        a((short) (ViewConfiguration.getPressedStateDuration() >> 16), (byte) (KeyEvent.getMaxKeyCode() >> 16), 544703040 + (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), ExpandableListView.getPackedPositionChild(0L) + 939946924, (-46) - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((short) ExpandableListView.getPackedPositionGroup(0L), (byte) (TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0) + 1), 544703045 - (Process.myTid() >> 22), 939946937 + (ViewConfiguration.getDoubleTapTimeout() >> 16), (-34) - View.resolveSizeAndState(0, 0, 0), objArr2);
        jsonObject.addProperty(strIntern, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a((short) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), (byte) (ViewConfiguration.getScrollDefaultDelay() >> 16), 544703061 - Drawable.resolveOpacity(0, 0), 939946931 + (ViewConfiguration.getScrollBarSize() >> 8), (-44) - TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0), objArr3);
        jsonObject.addProperty(((String) objArr3[0]).intern(), exc.getMessage());
        startRunning.onExtraCallbackWithResult(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -1586593611, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{startrunning, jsonObject}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1586593612, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
        startrunning.onNavigationEvent(Boolean.TRUE);
        Unit unit = Unit.INSTANCE;
        int i2 = asInterface + 75;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOnExtraCallback;
        int i = 2 % 2;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = this.label;
        try {
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                onExtraCallback onextracallback = new onExtraCallback(this.this$0, null);
                this.label = 1;
                objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, onextracallback, this);
                if (objOnExtraCallback == objOnWarmupCompleted) {
                    int i3 = asInterface + 101;
                    asBinder = i3 % 128;
                    if (i3 % 2 == 0) {
                        return objOnWarmupCompleted;
                    }
                    throw null;
                }
            } else {
                if (i2 != 1) {
                    Object[] objArr = new Object[1];
                    a((short) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), (byte) View.resolveSizeAndState(0, 0, 0), View.MeasureSpec.getMode(0) + 544703067, 939946921 - View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 5, objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                ResultKt.onNavigationEvent(obj);
                int i4 = asBinder + 11;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                objOnExtraCallback = obj;
            }
            String str = (String) objOnExtraCallback;
            PermissionUtil.onExtraCallback(new Object[]{this.$view, str, null, 2, null}, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -674446658, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 674446659);
            RuntimeScheduler.onNavigationEvent(new Object[]{this.this$0, str}, R.drawable.IAuthTabCallback(), -1573470719, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 1573470724, R.drawable.IAuthTabCallback());
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            String str2 = (String) RuntimeScheduler.onNavigationEvent(new Object[0], R.drawable.IAuthTabCallback(), -2082767514, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 2082767524, R.drawable.IAuthTabCallback());
            Object[] objArr2 = new Object[1];
            a((short) (ViewConfiguration.getScrollDefaultDelay() >> 16), (byte) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 544703113, TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0) + 939946938, (-33) - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            a((short) (ViewConfiguration.getDoubleTapTimeout() >> 16), (byte) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 544703130 - (ViewConfiguration.getWindowTouchSlop() >> 8), TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0) + 939946937, Color.alpha(0) - 42, objArr3);
            ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, str2, strIntern, access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), (String) RuntimeScheduler.onNavigationEvent(new Object[]{this.this$0}, R.drawable.IAuthTabCallback(), 664109897, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -664109880, R.drawable.IAuthTabCallback()))), (String) null, false, (String) null, 56, (Object) null);
            RuntimeScheduler.onWarmupCompleted(this.this$0, false);
            ArrayList arrayListIAuthTabCallbackStub = RuntimeScheduler.IAuthTabCallbackStub(this.this$0);
            WebView webView = this.$view;
            Iterator it = arrayListIAuthTabCallbackStub.iterator();
            while (it.hasNext()) {
                UIManagerProvider.onNavigationEvent(-1260800613, new Object[]{UIManagerProvider.IAuthTabCallback, webView, (r8lambdat6IP3VtaKQato4RQdny3DO2pjOI) it.next()}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1260800614, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
            }
        } catch (Exception e) {
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray2 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            String str3 = (String) RuntimeScheduler.onNavigationEvent(new Object[0], R.drawable.IAuthTabCallback(), -2082767514, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 2082767524, R.drawable.IAuthTabCallback());
            Object[] objArr4 = new Object[1];
            a((short) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), (byte) ExpandableListView.getPackedPositionType(0L), TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0) + 544703045, 939946938 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (ViewConfiguration.getScrollBarSize() >> 8) - 34, objArr4);
            String strIntern2 = ((String) objArr4[0]).intern();
            Object[] objArr5 = new Object[1];
            a((short) KeyEvent.getDeadChar(0, 0), (byte) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), View.MeasureSpec.makeMeasureSpec(0, 0) + 544703130, TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0) + 939946937, (-43) - ImageFormat.getBitsPerPixel(0), objArr5);
            convertFloatArrayToByteArray2.onExtraCallbackWithResult(str3, strIntern2, e, access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr5[0]).intern(), (String) RuntimeScheduler.onNavigationEvent(new Object[]{this.this$0}, R.drawable.IAuthTabCallback(), 664109897, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -664109880, R.drawable.IAuthTabCallback()))));
            String strAsInterface = this.this$0.asInterface();
            if (strAsInterface != null) {
                setTopGuideFontSize.IAuthTabCallback(new Object[]{RuntimeScheduler.asBinder(this.this$0), strAsInterface, new Function1() { // from class: viva.republica.toss.service.CaWebViewScraper$applyCaScript$1$$ExternalSyntheticLambda0
                    public final Object invoke(Object obj2) {
                        return RuntimeScheduler$onWarmupCompleted.IAuthTabCallback(e, (startRunning) obj2);
                    }
                }}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 1755743383, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -1755743382);
                int i6 = asBinder + 103;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        return Unit.INSTANCE;
    }
}
