package im.toss.rn.toss.core.remoteprocess;

import android.content.Context;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.rn.toss.core.remoteprocess.RnRemoteProcessBundlePreparer$prepare$2$;
import im.toss.rn.toss.core.remoteprocess.RnRemoteProcessPrepareResult;
import java.lang.reflect.Method;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.MaxFullscreenAdImplExternalSyntheticLambda6;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.access13800;
import o.access14300;
import o.findResAndMsg;
import o.hExternalSyntheticLambda4;
import o.onInterstitialAdLoaded;
import o.transGetKmCert;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class RnRemoteProcessBundlePreparer$prepare$2 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super RnRemoteProcessPrepareResult>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ RnRemoteProcessBundleRequest $request;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ RnRemoteProcessBundlePreparer this$0;
    private static final byte[] $$a = {107, -21, -54, -113};
    private static final int $$b = 158;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onNavigationEvent = 0;
    private static int onExtraCallback = 1;
    private static long onWarmupCompleted = 7798559133331975163L;
    private static int IAuthTabCallback = -1402654249;
    private static char onExtraCallbackWithResult = 27643;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, short s, short s2) {
        int i;
        int i2;
        int i3 = (b * 2) + 1;
        int i4 = 4 - (s2 * 3);
        byte[] bArr = $$a;
        int i5 = 110 - s;
        byte[] bArr2 = new byte[i3];
        if (bArr == null) {
            int i6 = i4;
            i2 = 0;
            i5 += -i4;
            i4 = i6 + 1;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i3) {
                return new String(bArr2, 0);
            }
            i6 = i4;
            i4 = bArr[i4];
            i5 += -i4;
            i4 = i6 + 1;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i3) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i3) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RnRemoteProcessBundlePreparer$prepare$2(RnRemoteProcessBundlePreparer rnRemoteProcessBundlePreparer, RnRemoteProcessBundleRequest rnRemoteProcessBundleRequest, Context context, access13800<? super RnRemoteProcessBundlePreparer$prepare$2> access13800Var) {
        super(2, access13800Var);
        this.this$0 = rnRemoteProcessBundlePreparer;
        this.$request = rnRemoteProcessBundleRequest;
        this.$context = context;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Context context, RnRemoteProcessBundleRequest rnRemoteProcessBundleRequest, String str, RnRemoteProcessBundlePreparer rnRemoteProcessBundlePreparer, String str2, MaxFullscreenAdImplExternalSyntheticLambda6.onNavigationEvent onnavigationevent) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(context, rnRemoteProcessBundleRequest, str, rnRemoteProcessBundlePreparer, str2, onnavigationevent);
        if (i3 != 0) {
            int i4 = 73 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        RnRemoteProcessBundlePreparer$prepare$2 rnRemoteProcessBundlePreparer$prepare$2 = new RnRemoteProcessBundlePreparer$prepare$2(this.this$0, this.$request, this.$context, access13800Var);
        int i2 = onExtraCallback + 31;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return rnRemoteProcessBundlePreparer$prepare$2;
        }
        throw null;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
        int i4 = onExtraCallback + 43;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return objOnNavigationEvent;
        }
        throw null;
    }

    public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super RnRemoteProcessPrepareResult> access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        int i4 = onNavigationEvent + 29;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    private static final Unit onWarmupCompleted(Context context, RnRemoteProcessBundleRequest rnRemoteProcessBundleRequest, String str, RnRemoteProcessBundlePreparer rnRemoteProcessBundlePreparer, String str2, MaxFullscreenAdImplExternalSyntheticLambda6.onNavigationEvent onnavigationevent) throws Throwable {
        boolean z;
        int i = 2 % 2;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        onnavigationevent.IAuthTabCallbackDefault(rnRemoteProcessBundleRequest.IAuthTabCallback());
        Object[] objArr = new Object[1];
        a((char) (53269 - AndroidCharacter.getMirror('0')), ViewConfiguration.getKeyRepeatDelay() >> 16, new char[]{52170, 23869, 63449, 57280, 56007, 57894}, new char[]{0, 0, 0, 0}, new char[]{52020, 22584, 58692, 11471}, objArr);
        onnavigationevent.onExtraCallback(rnRemoteProcessBundleRequest.onWarmupCompleted());
        onnavigationevent.onWarmupCompleted(rnRemoteProcessBundleRequest.onNavigationEvent());
        onnavigationevent.IAuthTabCallback(Long.valueOf(rnRemoteProcessBundleRequest.onExtraCallbackWithResult()));
        if (rnRemoteProcessBundleRequest.onExtraCallbackWithResult() == 0) {
            int i2 = onExtraCallback + 105;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        } else {
            z = false;
        }
        onnavigationevent.onWarmupCompleted(z);
        onnavigationevent.onExtraCallbackWithResult(RnRemoteProcessBundlePreparer.IAuthTabCallback(rnRemoteProcessBundlePreparer).IAuthTabCallbackStub());
        onnavigationevent.onNavigationEvent(false);
        onnavigationevent.asBinder(RnRemoteProcessBundlePreparer.onExtraCallback(rnRemoteProcessBundlePreparer, str, rnRemoteProcessBundleRequest.onWarmupCompleted(), str2, rnRemoteProcessBundleRequest.IAuthTabCallback()));
        String strOnWarmupCompleted = rnRemoteProcessBundleRequest.onWarmupCompleted();
        Object[] objArr2 = new Object[1];
        a((char) (53221 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), View.getDefaultSize(0, 0), new char[]{52170, 23869, 63449, 57280, 56007, 57894}, new char[]{0, 0, 0, 0}, new char[]{52020, 22584, 58692, 11471}, objArr2);
        onnavigationevent.onWarmupCompleted(RnRemoteProcessBundlePreparer.onExtraCallback(rnRemoteProcessBundlePreparer, str, strOnWarmupCompleted, str2, ((String) objArr2[0]).intern()));
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 95;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda6;
        String str2;
        String str3;
        int i = 2 % 2;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = this.label;
        if (i2 != 0) {
            int i3 = onExtraCallback + 53;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda62 = (MaxFullscreenAdImplExternalSyntheticLambda6) this.L$3;
            String str4 = (String) this.L$2;
            String str5 = (String) this.L$1;
            String str6 = (String) this.L$0;
            ResultKt.onNavigationEvent(obj);
            str2 = str4;
            str = str5;
            str3 = str6;
            maxFullscreenAdImplExternalSyntheticLambda6 = maxFullscreenAdImplExternalSyntheticLambda62;
        } else {
            ResultKt.onNavigationEvent(obj);
            String code = RnRemoteProcessBundlePreparer.onNavigationEvent(this.this$0).onExtraCallbackWithResult().getCode();
            if (code == null) {
                int i5 = onExtraCallback + 29;
                int i6 = i5 % 128;
                onNavigationEvent = i6;
                int i7 = i5 % 2;
                int i8 = i6 + 35;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                code = "kr";
            }
            String baseUrl = hExternalSyntheticLambda4.Companion.IAuthTabCallback(code, this.$request.onWarmupCompleted()).getBaseUrl();
            String strOnWarmupCompleted = RnRemoteProcessBundlePreparer.onExtraCallback(this.this$0).onWarmupCompleted();
            MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda6IAuthTabCallback = MaxFullscreenAdImplExternalSyntheticLambda6.Companion.IAuthTabCallback(new RnRemoteProcessBundlePreparer$prepare$2$.ExternalSyntheticLambda0(this.$context, this.$request, code, this.this$0, strOnWarmupCompleted));
            this.L$0 = code;
            this.L$1 = baseUrl;
            this.L$2 = strOnWarmupCompleted;
            this.L$3 = maxFullscreenAdImplExternalSyntheticLambda6IAuthTabCallback;
            this.label = 1;
            Object objOnWarmupCompleted2 = maxFullscreenAdImplExternalSyntheticLambda6IAuthTabCallback.onWarmupCompleted((access13800<? super transGetKmCert>) this);
            if (objOnWarmupCompleted2 == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
            str = baseUrl;
            maxFullscreenAdImplExternalSyntheticLambda6 = maxFullscreenAdImplExternalSyntheticLambda6IAuthTabCallback;
            str2 = strOnWarmupCompleted;
            str3 = code;
            obj = objOnWarmupCompleted2;
        }
        transGetKmCert transgetkmcert = (transGetKmCert) obj;
        if (!(transgetkmcert instanceof transGetKmCert.onWarmupCompleted)) {
            if (transgetkmcert instanceof transGetKmCert.onNavigationEvent) {
                return new RnRemoteProcessPrepareResult.MainProcessFallback(RnRemoteProcessPrepareResult.Reason.METRO_DEV_SERVER);
            }
            throw new NoWhenBranchMatchedException();
        }
        Context applicationContext = this.$context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        RnRemoteProcessPrepareResult.Prepared prepared = new RnRemoteProcessPrepareResult.Prepared(new onInterstitialAdLoaded(applicationContext).onWarmupCompleted(maxFullscreenAdImplExternalSyntheticLambda6, str3, this.$request.onWarmupCompleted(), str, str2, RnRemoteProcessBundlePreparer.onExtraCallbackWithResult(this.this$0).onWarmupCompleted()));
        int i10 = onNavigationEvent + 101;
        onExtraCallback = i10 % 128;
        if (i10 % 2 != 0) {
            return prepared;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i4 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i5 = $11 + 55;
            $10 = i5 % 128;
            int i6 = i5 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                    int i7 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 42;
                    int offsetBefore = 1451 - TextUtils.getOffsetBefore("", i4);
                    byte b = (byte) i4;
                    byte b2 = b;
                    String str$$c = $$c(b, b2, b2);
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(packedPositionGroup, i7, offsetBefore, 228868077, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) i4;
                        byte b4 = (byte) (b3 + 1);
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 49123), 45 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 1494 - KeyEvent.keyCodeFromString(""), 1533236389, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23973 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 49 - TextUtils.lastIndexOf("", '0', 0), 22940 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - TextUtils.getCapsMode("", 0, 0)), 29 - KeyEvent.normalizeMetaState(0), (KeyEvent.getMaxKeyCode() >> 16) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                            cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onWarmupCompleted ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallback ^ 7798559133331975163L))) ^ ((char) (onExtraCallbackWithResult ^ 7798559133331975163L)));
                            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                            int i8 = $11 + 121;
                            $10 = i8 % 128;
                            int i9 = i8 % 2;
                            i2 = 2;
                            i4 = 0;
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
