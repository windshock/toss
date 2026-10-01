package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import net.sf.scuba.smartcards.BuildConfig;
import o.getObjectDigest;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class getObjectDigest$onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static char[] onNavigationEvent = {27260, 27175, 27173, 27168, 27194, 27196, 27198, 27198, 27175, 27151, 27146, 27168, 27168, 27198, 27141, 27245, 27144, 27174, 27171, 27196, 27196, 27173, 27142, 27245, 27148, 27173, 27198, 27172, 27179, 27181, 27151, 27245, 27144, 27175, 27199, 27194, 27170, 27173, 27138, 27245, 27145, 27199, 27140, 27144, 27170, 27176, 27180, 27382, 27382, 27363, 27269, 27278, 27381, 27380, 27390, 27391, 27277, 27381, 27170, 27280, 27307, 27309, 27309};
    private static int onWarmupCompleted = 1;
    final /* synthetic */ setOnOutOfMemeryErrorCallback $callbackProxy;
    int I$0;
    int I$1;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    getObjectDigest$onExtraCallbackWithResult(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, access13800<? super getObjectDigest$onExtraCallbackWithResult> access13800Var) {
        super(2, access13800Var);
        this.$callbackProxy = setonoutofmemeryerrorcallback;
    }

    public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getObjectDigest$onExtraCallbackWithResult getobjectdigest_onextracallbackwithresultCreate = create(findresandmsg, access13800Var);
        if (i3 == 0) {
            return getobjectdigest_onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
        }
        int i4 = 35 / 0;
        return getobjectdigest_onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        getObjectDigest$onExtraCallbackWithResult getobjectdigest_onextracallbackwithresult = new getObjectDigest$onExtraCallbackWithResult(this.$callbackProxy, access13800Var);
        int i2 = IAuthTabCallback + 29;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return getobjectdigest_onextracallbackwithresult;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
        int i4 = onWarmupCompleted + 41;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return objIAuthTabCallback;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super String>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 1;
        private static int[] onExtraCallbackWithResult = {1574474356, -885377398, -549666769, -911112401, 694764752, -1415589914, 320866428, -1625397208, -1364315576, -926782947, -1592536310, 1556345874, 523594574, 322875449, 997694803, -1871600428, 952756010, 2031104570};
        private static int onNavigationEvent;
        int label;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(access13800Var);
            int i2 = onNavigationEvent + 21;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 1;
            onNavigationEvent = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super String> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                onExtraCallback(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
            int i3 = onNavigationEvent + 91;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 51 / 0;
            }
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super String> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 71;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallbackCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return onextracallbackCreate.invokeSuspend(unit);
            }
            onextracallbackCreate.invokeSuspend(unit);
            throw null;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: o.getObjectDigest$onNavigationEvent */
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 115;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (this.label != 0) {
                Object[] objArr = new Object[1];
                a(new int[]{1112155702, 1121395210, 1048268081, -1736525778, 790516453, -742998081, 836339287, 544088172, 412082172, 1304206657, -217307742, -1484846891, -1816780384, -337974994, -1116359976, 26646149, -150298816, -169512124, 33120811, -2124648460, 633357403, 1306172194, 1164081571, 440446212}, 47 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            ResultKt.onNavigationEvent(obj);
            String id = AdvertisingIdClient.getAdvertisingIdInfo(UserChoiceBillingListener.onExtraCallback.onExtraCallback()).getId();
            if (id != null) {
                int i4 = onNavigationEvent + 43;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return id;
            }
            Object[] objArr2 = new Object[1];
            a(new int[]{-40633218, 271586127, -1620288026, 1400118702, 76821748, -1303449680, -577510467, -1632209911, -804669878, 1967067753, -1798826099, -783297778}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 23, objArr2);
            throw new getObjectDigest.onNavigationEvent(((String) objArr2[0]).intern());
        }

        private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
            int length;
            int[] iArr2;
            int i2;
            int i3 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr3 = onExtraCallbackWithResult;
            char c = '0';
            int i4 = -1469660336;
            int i5 = 0;
            if (iArr3 != null) {
                int i6 = $10 + 103;
                int i7 = i6 % 128;
                $11 = i7;
                if (i6 % 2 == 0) {
                    length = iArr3.length;
                    iArr2 = new int[length];
                    i2 = 1;
                } else {
                    length = iArr3.length;
                    iArr2 = new int[length];
                    i2 = 0;
                }
                int i8 = i7 + 31;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                int i10 = i2;
                while (i10 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr3[i10])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getSize(0), 72 - Gravity.getAbsoluteGravity(0, 0), TextUtils.lastIndexOf(BuildConfig.FLAVOR, c, 0) + 8849, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr2[i10] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        i10++;
                        c = '0';
                        i4 = -1469660336;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                iArr3 = iArr2;
            }
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = onExtraCallbackWithResult;
            if (iArr5 != null) {
                int i11 = $11 + 47;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i13 = 0;
                while (i13 < length3) {
                    Object[] objArr3 = new Object[1];
                    objArr3[i5] = Integer.valueOf(iArr5[i13]);
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(i5, i5), 71 - MotionEvent.axisFromString(BuildConfig.FLAVOR), TextUtils.getTrimmedLength(BuildConfig.FLAVOR) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i13] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i13++;
                    i5 = 0;
                }
                iArr5 = iArr6;
            }
            int i14 = i5;
            System.arraycopy(iArr5, i14, iArr4, i14, length2);
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i14;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                int i15 = $10 + 37;
                $11 = i15 % 128;
                int i16 = i15 % 2;
                cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                for (int i17 = 0; i17 < 16; i17++) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i17];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 22252), AndroidCharacter.getMirror('0') - '\t', 10301 - (ViewConfiguration.getLongPressTimeout() >> 16), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                }
                int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i18;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
                int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
                cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
                cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getTrimmedLength(BuildConfig.FLAVOR) + 4033), 78 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), ExpandableListView.getPackedPositionChild(0L) + 7399, 1888082611, false, "f", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                int i21 = $11 + 113;
                $10 = i21 % 128;
                int i22 = i21 % 2;
            }
            objArr[0] = new String(cArr2, 0, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062 A[PHI: r1
      0x0062: PHI (r1v22 java.lang.Object) = (r1v13 java.lang.Object), (r1v23 java.lang.Object) binds: [B:8:0x0025, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[PHI: r6
      0x0027: PHI (r6v9 int) = (r6v8 int), (r6v12 int) binds: [B:8:0x0025, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        Object objOnWarmupCompleted;
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 13;
        onWarmupCompleted = i3 % 128;
        try {
            if (i3 % 2 == 0) {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                int i4 = 43 / 0;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    Result.Companion companion = Result.Companion;
                    GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                    onExtraCallback onextracallback = new onExtraCallback(null);
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    obj = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, onextracallback, this);
                    if (obj == objOnWarmupCompleted) {
                        int i5 = IAuthTabCallback + 39;
                        onWarmupCompleted = i5 % 128;
                        int i6 = i5 % 2;
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i != 1) {
                        Object[] objArr = new Object[1];
                        a(new int[]{0, 47, 0, 0}, true, new byte[]{1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0}, objArr);
                        throw new IllegalStateException(((String) objArr[0]).intern());
                    }
                    int i7 = onWarmupCompleted + 31;
                    IAuthTabCallback = i7 % 128;
                    if (i7 % 2 != 0) {
                        ResultKt.onNavigationEvent(obj);
                        throw null;
                    }
                    ResultKt.onNavigationEvent(obj);
                }
            } else {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                if (i != 0) {
                }
            }
            obj2 = Result.constructor-impl(obj);
        } catch (Exception e) {
            Result.Companion companion2 = Result.Companion;
            obj2 = Result.constructor-impl(ResultKt.createFailure(e));
        } catch (WebResourceResponseModel e2) {
            Result.Companion companion3 = Result.Companion;
            obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
        } catch (CancellationException e3) {
            throw e3;
        }
        setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = this.$callbackProxy;
        if (Result.onNavigationEvent(obj2)) {
            int i8 = IAuthTabCallback + 33;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            ALCFaceBox.onExtraCallback(setonoutofmemeryerrorcallback, (String) obj2);
            int i10 = onWarmupCompleted + 37;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
        }
        setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback2 = this.$callbackProxy;
        Throwable th = Result.exceptionOrNull-impl(obj2);
        if (th != null) {
            if (!(th instanceof getObjectDigest.onNavigationEvent)) {
                Object[] objArr2 = new Object[1];
                a(new int[]{58, 5, 147, 0}, false, new byte[]{0, 1, 0, 1, 1}, objArr2);
                ALCFaceBox.onExtraCallbackWithResult(setonoutofmemeryerrorcallback2, th, ((String) objArr2[0]).intern(), (Map) null, 4, (Object) null);
            } else {
                Object[] objArr3 = new Object[1];
                a(new int[]{47, 11, 108, 7}, true, null, objArr3);
                ALCFaceBox.onExtraCallbackWithResult(setonoutofmemeryerrorcallback2, th, ((String) objArr3[0]).intern(), (Map) null, 4, (Object) null);
            }
        }
        return Unit.INSTANCE;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2;
        int i3 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = onNavigationEvent;
        float f = 0.0f;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i8 = $11 + 101;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 0;
            while (i10 < length) {
                int i11 = $11 + 101;
                $10 = i11 % 128;
                if (i11 % i2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i10])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35282 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0')), (ViewConfiguration.getFadingEdgeLength() >> 16) + 35, (TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i10] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr[i10])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), View.MeasureSpec.getSize(0) + 35, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i10] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i10++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i2 = 2;
                f = 0.0f;
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr, i4, cArr3, 0, i5);
        if (bArr != null) {
            char[] cArr4 = new char[i5];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                int i12 = $11 + 103;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i14 = $10 + 77;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                    int i16 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((Process.getThreadPriority(0) + 20) >> 6) + 10935), 65 - (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i16] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } else {
                    int i17 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ImageFormat.getBitsPerPixel(0)), 30 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 17656 - Process.getGidForName(BuildConfig.FLAVOR), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i17] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTouchSlop() >> 8) + 49467), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 70, 12486 - Color.red(0), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i18 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i18, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i18);
            int i19 = $10 + 97;
            $11 = i19 % 128;
            if (i19 % 2 == 0) {
                int i20 = 5 % 4;
            }
        }
        if (z) {
            char[] cArr6 = new char[i5];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                int i21 = $11 + 73;
                $10 = i21 % 128;
                if (i21 % 2 != 0) {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[i5 / trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                } else {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i5 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            int i22 = $11 + 101;
            $10 = i22 % 128;
            int i23 = i22 % 2;
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                int i24 = $11 + 23;
                $10 = i24 % 128;
                int i25 = i24 % 2;
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }
}
