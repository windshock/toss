package o;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.ads.zzgc;
import com.google.gson.JsonObject;
import im.toss.tds.compose.component.compound.tab.v1.ItemPreset$;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.getUsages;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class ExtendedKeyUsage$onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 1;
    private static char[] onExtraCallbackWithResult = {27256, 27144, 27140, 27199, 27145, 27245, 27138, 27173, 27170, 27194, 27199, 27175, 27144, 27245, 27151, 27181, 27179, 27172, 27198, 27173, 27148, 27245, 27142, 27173, 27196, 27196, 27171, 27174, 27144, 27245, 27141, 27198, 27168, 27168, 27146, 27151, 27175, 27198, 27198, 27196, 27194, 27168, 27173, 27175, 27178, 27180, 27176, 27355, 27516, 27516, 27488, 27512, 27501, 27477, 27495, 27488, 27512, 27517, 27490, 27490, 27490, 27518, 27161, 27371, 27344, 27371, 27371, 27370, 27372, 27344, 27363, 27360, 27370, 27373, 27347, 27368, 27364, 27367, 27390, 27385, 27389, 27364, 27246, 27164, 27178, 27165, 27164, 27176, 27174, 27175, 27175, 27180, 27175, 27157, 27155, 27171, 27175, 27199, 27152, 27162, 27177, 27175, 27174, 27174, 27173, 27262, 27180, 27178, 27176, 27173, 27172, 27149, 27151, 27180, 27176, 27174, 27175, 27175, 27180, 27175, 27143, 27148, 27171, 27171, 27175, 27199, 27199, 27168, 27145, 27141, 27194, 27171, 27168, 27172, 27183, 27177, 27174, 27148, 27151, 27180, 27176, 27174, 27175, 27175, 27180, 27175, 27143, 27149, 27172, 27196, 27199, 27175, 27148, 27141, 27169, 27174, 27172, 27174, 27148, 27140, 27348, 27348, 27351, 27353, 27357, 27196, 27197, 27355, 27357, 27199, 27190, 27372, 27189, 27197, 27355, 27351, 27349, 27352, 27354, 27344, 27372, 27348, 27344, 27344, 27197, 27188, 27348, 27242, 27147, 27149, 27164, 27159, 27167, 27143, 27139, 27139, 27164, 27167, 27146, 27148, 27148, 27146, 27142};
    private static int onWarmupCompleted;
    final /* synthetic */ setOnOutOfMemeryErrorCallback $callbackProxy;
    final /* synthetic */ Context $context;
    final /* synthetic */ JsonObject $data;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExtendedKeyUsage$onExtraCallback(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, JsonObject jsonObject, Context context, access13800<? super ExtendedKeyUsage$onExtraCallback> access13800Var) {
        super(2, access13800Var);
        this.$callbackProxy = setonoutofmemeryerrorcallback;
        this.$data = jsonObject;
        this.$context = context;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        ExtendedKeyUsage$onExtraCallback extendedKeyUsage$onExtraCallback = new ExtendedKeyUsage$onExtraCallback(this.$callbackProxy, this.$data, this.$context, access13800Var);
        int i2 = onExtraCallback + 77;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return extendedKeyUsage$onExtraCallback;
        }
        throw null;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        onWarmupCompleted = i2 % 128;
        findResAndMsg findresandmsg = (findResAndMsg) obj;
        access13800<? super Unit> access13800Var = (access13800) obj2;
        if (i2 % 2 == 0) {
            return onNavigationEvent(findresandmsg, access13800Var);
        }
        onNavigationEvent(findresandmsg, access13800Var);
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        int i4 = onExtraCallback + 99;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return objInvokeSuspend;
        }
        throw null;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super getUsages>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 1;
        private static char[] onExtraCallback = {27242, 27141, 27164, 27141, 27144, 27140, 27144, 27167, 27158, 27141, 27141, 27165, 27139, 27138, 27165, 27246, 27148, 27167, 27164, 27142, 27145, 27151, 27140, 27136, 27139, 27162, 27157, 27161, 27136, 27166, 27143, 27148, 27143, 27143, 27142, 27155, 27380, 27382, 27380, 27377, 27380, 27385, 27381, 27385, 27384, 27277, 27376, 27386, 27389, 27363, 27384, 27380, 27383, 27278, 27273, 27277, 27380, 27230, 27144, 27170, 27176, 27180, 27178, 27175, 27173, 27168, 27194, 27196, 27198, 27198, 27175, 27151, 27146, 27168, 27168, 27198, 27141, 27245, 27144, 27174, 27171, 27196, 27196, 27173, 27142, 27245, 27148, 27173, 27198, 27172, 27179, 27181, 27151, 27245, 27144, 27175, 27199, 27194, 27170, 27173, 27138, 27245, 27145, 27199};
        private static int onNavigationEvent;
        final /* synthetic */ Context $context;
        final /* synthetic */ JsonObject $data;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(JsonObject jsonObject, Context context, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$data = jsonObject;
            this.$context = context;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$data, this.$context, access13800Var);
            int i2 = onNavigationEvent + 109;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return iAuthTabCallback;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 1;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super getUsages> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                onExtraCallbackWithResult(findresandmsg, access13800Var);
                throw null;
            }
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
            int i3 = onNavigationEvent + 53;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 88 / 0;
            }
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super getUsages> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 5;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 53;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 15;
            onNavigationEvent = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
            if (this.label != 0) {
                Object[] objArr = new Object[1];
                a(new int[]{57, 47, 0, 5}, true, new byte[]{0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            ResultKt.onNavigationEvent(obj);
            GeneralSubtree generalSubtreeOnNavigationEvent = getMaximum.onNavigationEvent(new setText(this.$data));
            if (generalSubtreeOnNavigationEvent == null) {
                Object[] objArr2 = new Object[1];
                a(new int[]{0, 15, 0, 15}, false, new byte[]{1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1}, objArr2);
                return new getUsages.onExtraCallback(((String) objArr2[0]).intern());
            }
            if (!getMaximum.onExtraCallbackWithResult(this.$context) || !getMaximum.onNavigationEvent(this.$context)) {
                Object[] objArr3 = new Object[1];
                a(new int[]{35, 22, 108, 0}, true, new byte[]{0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1}, objArr3);
                return new getUsages.onExtraCallback(((String) objArr3[0]).intern());
            }
            int i3 = onNavigationEvent + 79;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                getMaximum.onWarmupCompleted(this.$context);
                throw null;
            }
            Long lOnWarmupCompleted = getMaximum.onWarmupCompleted(this.$context);
            if (lOnWarmupCompleted == null) {
                Object[] objArr4 = new Object[1];
                a(new int[]{15, 20, 0, 14}, true, new byte[]{1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1}, objArr4);
                return new getUsages.onExtraCallback(((String) objArr4[0]).intern());
            }
            getUsages.IAuthTabCallback iAuthTabCallback = new getUsages.IAuthTabCallback(getMaximum.IAuthTabCallback(this.$context, lOnWarmupCompleted.longValue(), generalSubtreeOnNavigationEvent));
            int i4 = IAuthTabCallback + 99;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return iAuthTabCallback;
        }

        private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            char[] cArr;
            int i = 2;
            int i2 = 2 % 2;
            TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
            int i3 = iArr[0];
            int i4 = iArr[1];
            int i5 = iArr[2];
            int i6 = iArr[3];
            char[] cArr2 = onExtraCallback;
            long j = 0;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i7 = 0;
                while (i7 < length) {
                    int i8 = $11 + 113;
                    $10 = i8 % 128;
                    if (i8 % i != 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)) + 35282), 35 - View.resolveSizeAndState(0, 0, 0), 14239 - View.getDefaultSize(0, 0), -884206168, false, "t", new Class[]{Integer.TYPE});
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
                        try {
                            Object[] objArr3 = {Integer.valueOf(cArr2[i7])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35284 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 35 - View.getDefaultSize(0, 0), 14239 - (ViewConfiguration.getFadingEdgeLength() >> 16), -884206168, false, "t", new Class[]{Integer.TYPE});
                            }
                            cArr3[i7] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                            i7++;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    i = 2;
                    j = 0;
                }
                cArr2 = cArr3;
            }
            char[] cArr4 = new char[i4];
            System.arraycopy(cArr2, i3, cArr4, 0, i4);
            if (bArr != null) {
                int i9 = $11 + 21;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    cArr = new char[i4];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
                } else {
                    cArr = new char[i4];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                }
                char c = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                        int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10934 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 65 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr[i10] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    } else {
                        int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr5 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 29 - TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0), 17657 - (ViewConfiguration.getWindowTouchSlop() >> 8), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr[i11] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    }
                    c = cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49468 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (Process.myTid() >> 22) + 70, 12486 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                }
                cArr4 = cArr;
            }
            if (i6 > 0) {
                char[] cArr5 = new char[i4];
                System.arraycopy(cArr4, 0, cArr5, 0, i4);
                int i12 = i4 - i6;
                System.arraycopy(cArr5, 0, cArr4, i12, i6);
                System.arraycopy(cArr5, i6, cArr4, 0, i12);
            }
            if (z) {
                char[] cArr6 = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
                cArr4 = cArr6;
            }
            if (i5 > 0) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                int i13 = $11 + 113;
                $10 = i13 % 128;
                int i14 = i13 % 2;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
            }
            objArr[0] = new String(cArr4);
        }
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOnExtraCallback;
        int i = 2 % 2;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = this.label;
        try {
            if (i2 != 0) {
                int i3 = onExtraCallback + 1;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 1) {
                    Object[] objArr = new Object[1];
                    a(new int[]{0, 47, 0, 44}, false, new byte[]{0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1}, objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                ResultKt.onNavigationEvent(obj);
                int i5 = onExtraCallback + 95;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                objOnExtraCallback = obj;
            } else {
                ResultKt.onNavigationEvent(obj);
                GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$data, this.$context, null);
                this.label = 1;
                objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, iAuthTabCallback, this);
                if (objOnExtraCallback == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            getUsages getusages = (getUsages) objOnExtraCallback;
            if (getusages instanceof getUsages.IAuthTabCallback) {
                setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = this.$callbackProxy;
                PangleEncryptManager pangleEncryptManager = new PangleEncryptManager();
                Object[] objArr2 = new Object[1];
                a(new int[]{47, 15, 197, 0}, false, new byte[]{0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1}, objArr2);
                dynamicTrack.onExtraCallback(pangleEncryptManager, ((String) objArr2[0]).intern(), ((getUsages.IAuthTabCallback) getusages).onWarmupCompleted());
                Object[] objArr3 = {setonoutofmemeryerrorcallback, pangleEncryptManager.onExtraCallbackWithResult()};
                ALCFaceBox.onWarmupCompleted(291820722, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), objArr3, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), -291820715);
            } else {
                if (!(getusages instanceof getUsages.onExtraCallback)) {
                    throw new NoWhenBranchMatchedException();
                }
                String strOnNavigationEvent = ((getUsages.onExtraCallback) getusages).onNavigationEvent();
                Object[] objArr4 = new Object[1];
                a(new int[]{62, 20, 92, 0}, true, new byte[]{0, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1}, objArr4);
                if (Intrinsics.areEqual(strOnNavigationEvent, ((String) objArr4[0]).intern())) {
                    int i7 = onWarmupCompleted + 105;
                    onExtraCallback = i7 % 128;
                    if (i7 % 2 == 0) {
                        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                        Object[] objArr5 = new Object[1];
                        a(new int[]{82, 23, 0, 0}, false, new byte[]{1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1}, objArr5);
                        String strIntern = ((String) objArr5[0]).intern();
                        Object[] objArr6 = new Object[1];
                        a(new int[]{105, 54, 0, 21}, true, new byte[]{1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1}, objArr6);
                        ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{convertFloatArrayToByteArray, strIntern, ((String) objArr6[0]).intern(), null, null, true, null, 113, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
                    } else {
                        ConvertFloatArrayToByteArray convertFloatArrayToByteArray2 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                        Object[] objArr7 = new Object[1];
                        a(new int[]{82, 23, 0, 0}, false, new byte[]{1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1}, objArr7);
                        String strIntern2 = ((String) objArr7[0]).intern();
                        Object[] objArr8 = new Object[1];
                        a(new int[]{105, 54, 0, 21}, false, new byte[]{1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1}, objArr8);
                        ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{convertFloatArrayToByteArray2, strIntern2, ((String) objArr8[0]).intern(), null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
                    }
                }
                setOnOutOfMemeryErrorCallback.onNavigationEvent(this.$callbackProxy, (String) null, ((getUsages.onExtraCallback) getusages).onNavigationEvent(), (Map) null, 5, (Object) null);
            }
        } catch (Throwable th) {
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray3 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr9 = new Object[1];
            a(new int[]{82, 23, 0, 0}, false, new byte[]{1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1}, objArr9);
            String strIntern3 = ((String) objArr9[0]).intern();
            Object[] objArr10 = new Object[1];
            a(new int[]{159, 28, 49, 20}, true, new byte[]{1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 1}, objArr10);
            ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray3, strIntern3, ((String) objArr10[0]).intern(), th, (Map) null, 8, (Object) null);
            setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback2 = this.$callbackProxy;
            Object[] objArr11 = new Object[1];
            a(new int[]{187, 16, 0, 13}, true, new byte[]{1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1}, objArr11);
            setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback2, (String) null, ((String) objArr11[0]).intern(), (Map) null, 5, (Object) null);
        }
        return Unit.INSTANCE;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = onExtraCallbackWithResult;
        Object obj = null;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i7 = 0; i7 < length; i7++) {
                int i8 = $10 + 95;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((Process.getThreadPriority(0) + 20) >> 6) + 35283), 35 - Color.argb(0, 0, 0, 0), ExpandableListView.getPackedPositionChild(0L) + 14240, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            int i10 = $10 + 99;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i12 = $11 + 59;
                $10 = i12 % 128;
                if (i12 % 2 == 0 ? bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1 : bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 0) {
                    int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 29 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getTapTimeout() >> 16) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objOnExtraCallback2).invoke(obj, objArr3)).charValue();
                } else {
                    int i14 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - (ViewConfiguration.getPressedStateDuration() >> 16)), KeyEvent.keyCodeFromString(BuildConfig.FLAVOR) + 65, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 16717, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i14] = ((Character) ((Method) objOnExtraCallback3).invoke(obj, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTapTimeout() >> 16) + 49467), (ViewConfiguration.getScrollBarSize() >> 8) + 70, 12487 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                obj = null;
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i15 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i15, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i15);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i16 = $11 + 39;
                $10 = i16 % 128;
                int i17 = i16 % 2;
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            int i18 = $11 + 41;
            $10 = i18 % 128;
            if (i18 % 2 != 0) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
            } else {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            }
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i19 = $11 + 49;
                $10 = i19 % 128;
                if (i19 % 2 != 0) {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] % iArr[3]);
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                } else {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
            }
        }
        objArr[0] = new String(cArr3);
    }
}
