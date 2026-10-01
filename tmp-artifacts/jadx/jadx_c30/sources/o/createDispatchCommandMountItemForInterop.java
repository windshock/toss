package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.base.BaseActivity;
import im.toss.define.TossAffiliate;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.cert.X509Certificate;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import o.AFKeystoreWrapper;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class createDispatchCommandMountItemForInterop {
    private static final byte[] $$a = {120, ISO7816.INS_WRITE_RECORD, ISOFileInfo.A1, -23};
    private static final int $$b = 245;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static char[] onWarmupCompleted = {60855, 29783, 56956, 8222, 35452, 60618, 30455, 55514, 8931, 34132, 61285, 28945, 56121, 15811, 34797, 59853, 29652, 54708, 15445, 34420, 59411, 29228, 54493, 16058, 32963, 60079, 19790, 55156, 14595, 33573, 58829, 20397, 53684, 15233, 40377, 58438, 20084, 53342, 14907, 40149, 59126, 18569, 53941, 13654, 40805, 57600, 19245};
    private static long onExtraCallbackWithResult = -468215628680891338L;

    static final class onExtraCallback extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            BaseActivity baseActivity;
            String str;
            long j;
            String str2;
            boolean z;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 49;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= PKIFailureInfo.systemUnavail;
            if (i3 == 0) {
                baseActivity = null;
                str = null;
                j = 1;
                str2 = null;
                z = true;
            } else {
                baseActivity = null;
                str = null;
                j = 0;
                str2 = null;
                z = false;
            }
            Object objOnExtraCallbackWithResult = createDispatchCommandMountItemForInterop.onExtraCallbackWithResult(baseActivity, str, j, str2, z, null, this);
            int i4 = onExtraCallbackWithResult + 59;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 6 / 0;
            }
            return objOnExtraCallbackWithResult;
        }
    }

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 109;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= PKIFailureInfo.systemUnavail;
            Object objOnWarmupCompleted = createDispatchCommandMountItemForInterop.onWarmupCompleted(null, null, i3 != 0, null, this);
            int i4 = onNavigationEvent + 47;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, short s2) {
        int i;
        byte[] bArr = $$a;
        int i2 = 3 - (s2 * 3);
        int i3 = (b * 2) + 97;
        int i4 = s * 4;
        byte[] bArr2 = new byte[1 - i4];
        int i5 = 0 - i4;
        if (bArr == null) {
            int i6 = i2;
            int i7 = 0;
            i3 += i2;
            i2 = i6;
            i = i7;
            int i8 = i2 + 1;
            bArr2[i] = (byte) i3;
            if (i == i5) {
                return new String(bArr2, 0);
            }
            byte b2 = bArr[i8];
            i2 = i3;
            i3 = b2;
            i7 = i + 1;
            i6 = i8;
            i3 += i2;
            i2 = i6;
            i = i7;
            int i82 = i2 + 1;
            bArr2[i] = (byte) i3;
            if (i == i5) {
            }
        } else {
            i = 0;
            int i822 = i2 + 1;
            bArr2[i] = (byte) i3;
            if (i == i5) {
            }
        }
    }

    public static final /* synthetic */ Object onWarmupCompleted(BaseActivity baseActivity, String str, boolean z, TossAffiliate tossAffiliate, access13800 access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(baseActivity, str, z, tossAffiliate, access13800Var);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object objIAuthTabCallback = IAuthTabCallback(baseActivity, str, z, tossAffiliate, access13800Var);
        int i3 = onExtraCallback + 57;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return objIAuthTabCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0123, code lost:
    
        if (r15 == r2) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object onExtraCallbackWithResult(@NotNull BaseActivity baseActivity, @NotNull String str, long j, @NotNull String str2, boolean z, @Nullable TossAffiliate tossAffiliate, @NotNull access13800<? super Pair<String, r8lambdaxBScxNhKIY1WzrH2Kap39VgO_58>> access13800Var) throws Throwable {
        onExtraCallback onextracallback;
        o7 o7VarRun;
        Object objOnExtraCallbackWithResult;
        Pair pairIAuthTabCallback;
        int i = 2 % 2;
        if (access13800Var instanceof onExtraCallback) {
            onextracallback = (onExtraCallback) access13800Var;
            int i2 = onextracallback.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                onextracallback.label = i2 + PKIFailureInfo.systemUnavail;
            } else {
                onextracallback = new onExtraCallback(access13800Var);
            }
        }
        Object objIAuthTabCallback = onextracallback.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = onextracallback.label;
        Object obj = null;
        if (i3 == 0) {
            ResultKt.onNavigationEvent(objIAuthTabCallback);
            Response response = Response.onNavigationEvent;
            o7VarRun = ((o5a) Response.onExtraCallback(baseActivity, o5a.class)).run();
            onextracallback.L$0 = baseActivity;
            onextracallback.L$1 = str;
            onextracallback.L$2 = str2;
            onextracallback.L$3 = tossAffiliate;
            onextracallback.L$4 = access15400.onNavigationEvent(o7VarRun);
            onextracallback.J$0 = j;
            onextracallback.Z$0 = z;
            onextracallback.label = 1;
            objOnExtraCallbackWithResult = o7VarRun.onExtraCallbackWithResult(onextracallback);
            if (objOnExtraCallbackWithResult != objOnWarmupCompleted) {
            }
            int i4 = IAuthTabCallback + 71;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnWarmupCompleted;
            }
            obj.hashCode();
            throw null;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                Object[] objArr = new Object[1];
                a(ExpandableListView.getPackedPositionType(0L), ExpandableListView.getPackedPositionType(0L) + 47, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            ResultKt.onNavigationEvent(objIAuthTabCallback);
            int i5 = onExtraCallback + 79;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            pairIAuthTabCallback = (Pair) objIAuthTabCallback;
            return getWrite.IAuthTabCallback((String) pairIAuthTabCallback.onExtraCallbackWithResult(), (r8lambdaxBScxNhKIY1WzrH2Kap39VgO_58) pairIAuthTabCallback.IAuthTabCallback());
        }
        z = onextracallback.Z$0;
        j = onextracallback.J$0;
        o7 o7Var = (o7) onextracallback.L$4;
        tossAffiliate = (TossAffiliate) onextracallback.L$3;
        str2 = (String) onextracallback.L$2;
        str = (String) onextracallback.L$1;
        BaseActivity baseActivity2 = (BaseActivity) onextracallback.L$0;
        ResultKt.onNavigationEvent(objIAuthTabCallback);
        Object objOnNavigationEvent = ((Result) objIAuthTabCallback).onNavigationEvent();
        o7VarRun = o7Var;
        baseActivity = baseActivity2;
        objOnExtraCallbackWithResult = objOnNavigationEvent;
        if (Result.onExtraCallback(objOnExtraCallbackWithResult)) {
            int i7 = IAuthTabCallback + 117;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            objOnExtraCallbackWithResult = null;
        }
        X509Certificate x509Certificate = (X509Certificate) objOnExtraCallbackWithResult;
        if (true ^ onExtraCallbackWithResult(x509Certificate, str2, j)) {
            pairIAuthTabCallback = getWrite.IAuthTabCallback(BuildConfig.FLAVOR, (Object) null);
            return getWrite.IAuthTabCallback((String) pairIAuthTabCallback.onExtraCallbackWithResult(), (r8lambdaxBScxNhKIY1WzrH2Kap39VgO_58) pairIAuthTabCallback.IAuthTabCallback());
        }
        int i9 = IAuthTabCallback + 101;
        onExtraCallback = i9 % 128;
        int i10 = i9 % 2;
        onextracallback.L$0 = access15400.onNavigationEvent(baseActivity);
        onextracallback.L$1 = access15400.onNavigationEvent(str);
        onextracallback.L$2 = access15400.onNavigationEvent(str2);
        onextracallback.L$3 = access15400.onNavigationEvent(tossAffiliate);
        onextracallback.L$4 = access15400.onNavigationEvent(o7VarRun);
        onextracallback.L$5 = access15400.onNavigationEvent(x509Certificate);
        onextracallback.J$0 = j;
        onextracallback.Z$0 = z;
        onextracallback.label = 2;
        objIAuthTabCallback = IAuthTabCallback(baseActivity, str, z, tossAffiliate, onextracallback);
    }

    private static final boolean onExtraCallbackWithResult(X509Certificate x509Certificate, String str, long j) {
        int i = 2 % 2;
        if (x509Certificate == null) {
            return false;
        }
        int i2 = IAuthTabCallback + 63;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        if (!Intrinsics.areEqual(measureLines.onExtraCallback.onExtraCallbackWithResult().onWarmupCompleted(x509Certificate), str)) {
            return false;
        }
        int i4 = onExtraCallback + 121;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        BigInteger serialNumber = x509Certificate.getSerialNumber();
        if (i5 == 0) {
            return serialNumber.longValue() == j;
        }
        serialNumber.longValue();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Object IAuthTabCallback(BaseActivity baseActivity, String str, boolean z, TossAffiliate tossAffiliate, access13800<? super Pair<String, r8lambdaxBScxNhKIY1WzrH2Kap39VgO_58>> access13800Var) throws Throwable {
        onExtraCallbackWithResult onextracallbackwithresult;
        String str2;
        boolean z2;
        Object objOnExtraCallbackWithResult;
        BaseActivity baseActivity2;
        TossAffiliate tossAffiliate2;
        r8lambdaxBScxNhKIY1WzrH2Kap39VgO_58 r8lambdaxbscxnhkiy1wzrh2kap39vgo_58;
        int i = 2 % 2;
        if (access13800Var instanceof onExtraCallbackWithResult) {
            onextracallbackwithresult = (onExtraCallbackWithResult) access13800Var;
            int i2 = onextracallbackwithresult.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                onextracallbackwithresult.label = i2 + PKIFailureInfo.systemUnavail;
            } else {
                onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var);
            }
        }
        Object objOnNavigationEvent = onextracallbackwithresult.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = onextracallbackwithresult.label;
        if (i3 == 0) {
            ResultKt.onNavigationEvent(objOnNavigationEvent);
            AFKeystoreWrapper aFKeystoreWrapperOnExtraCallback = measureLines.onExtraCallback.onExtraCallback();
            AFKeystoreWrapper.onWarmupCompleted onwarmupcompleted = AFKeystoreWrapper.onWarmupCompleted.REQUEST_SIGN;
            onextracallbackwithresult.L$0 = access15400.onNavigationEvent(baseActivity);
            str2 = str;
            onextracallbackwithresult.L$1 = str2;
            onextracallbackwithresult.L$2 = access15400.onNavigationEvent(tossAffiliate);
            z2 = z;
            onextracallbackwithresult.Z$0 = z2;
            onextracallbackwithresult.label = 1;
            objOnExtraCallbackWithResult = AFKeystoreWrapper.onExtraCallbackWithResult(aFKeystoreWrapperOnExtraCallback, baseActivity, onwarmupcompleted, z, (Long) null, (String) null, onextracallbackwithresult, 24, (Object) null);
            if (objOnExtraCallbackWithResult != objOnWarmupCompleted) {
                baseActivity2 = baseActivity;
                tossAffiliate2 = tossAffiliate;
            }
            int i4 = IAuthTabCallback + 49;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }
        int i6 = onExtraCallback + 17;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0 ? i3 != 1 : i3 != 0) {
            if (i3 != 2) {
                Object[] objArr = new Object[1];
                a(1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0) + 47, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            r8lambdaxbscxnhkiy1wzrh2kap39vgo_58 = (r8lambdaxBScxNhKIY1WzrH2Kap39VgO_58) onextracallbackwithresult.L$3;
            ResultKt.onNavigationEvent(objOnNavigationEvent);
            return getWrite.IAuthTabCallback(objOnNavigationEvent, r8lambdaxbscxnhkiy1wzrh2kap39vgo_58);
        }
        boolean z3 = onextracallbackwithresult.Z$0;
        tossAffiliate2 = (TossAffiliate) onextracallbackwithresult.L$2;
        String str3 = (String) onextracallbackwithresult.L$1;
        baseActivity2 = (BaseActivity) onextracallbackwithresult.L$0;
        ResultKt.onNavigationEvent(objOnNavigationEvent);
        z2 = z3;
        objOnExtraCallbackWithResult = objOnNavigationEvent;
        str2 = str3;
        r8lambdaxBScxNhKIY1WzrH2Kap39VgO_58 r8lambdaxbscxnhkiy1wzrh2kap39vgo_582 = (r8lambdaxBScxNhKIY1WzrH2Kap39VgO_58) objOnExtraCallbackWithResult;
        afErrorLogForExcManagerOnly aferrorlogforexcmanageronlyOnExtraCallbackWithResult = measureLines.onExtraCallback.onExtraCallbackWithResult();
        String strOnExtraCallbackWithResult = r8lambdaxbscxnhkiy1wzrh2kap39vgo_582.onExtraCallbackWithResult();
        onextracallbackwithresult.L$0 = access15400.onNavigationEvent(baseActivity2);
        onextracallbackwithresult.L$1 = access15400.onNavigationEvent(str2);
        onextracallbackwithresult.L$2 = access15400.onNavigationEvent(tossAffiliate2);
        onextracallbackwithresult.L$3 = r8lambdaxbscxnhkiy1wzrh2kap39vgo_582;
        onextracallbackwithresult.Z$0 = z2;
        onextracallbackwithresult.label = 2;
        objOnNavigationEvent = aferrorlogforexcmanageronlyOnExtraCallbackWithResult.onNavigationEvent(str2, strOnExtraCallbackWithResult, onextracallbackwithresult);
        if (objOnNavigationEvent != objOnWarmupCompleted) {
            r8lambdaxbscxnhkiy1wzrh2kap39vgo_58 = r8lambdaxbscxnhkiy1wzrh2kap39vgo_582;
            return getWrite.IAuthTabCallback(objOnNavigationEvent, r8lambdaxbscxnhkiy1wzrh2kap39vgo_58);
        }
        int i42 = IAuthTabCallback + 49;
        onExtraCallback = i42 % 128;
        int i52 = i42 % 2;
        return objOnWarmupCompleted;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0207  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        float f;
        Object obj;
        Throwable cause;
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (true) {
            f = 0.0f;
            obj = null;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                break;
            }
            int i4 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onWarmupCompleted[i + i4])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 17, AndroidCharacter.getMirror('0') + 10925, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(onExtraCallbackWithResult), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 46134), 31 - (ViewConfiguration.getFadingEdgeLength() >> 16), 20220 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i4] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - TextUtils.getTrimmedLength(BuildConfig.FLAVOR)), Color.argb(0, 0, 0, 0) + 44, 1493 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0'), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                    }
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i5 = $11 + 19;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1))), 44 - KeyEvent.normalizeMetaState(0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1493, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                throw null;
            }
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr6 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback5 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 49123), Process.getGidForName(BuildConfig.FLAVOR) + 45, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1495, -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
            f = 0.0f;
        }
        String str = new String(cArr);
        int i6 = $10 + 19;
        $11 = i6 % 128;
        if (i6 % 2 != 0) {
            objArr[0] = str;
        } else {
            obj.hashCode();
            throw null;
        }
    }
}
