package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.JsonObject;
import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import o.getThemeData$IAuthTabCallback;
import o.startRunning;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getThemeData$IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    final /* synthetic */ setTopGuideBackgroundColor $callbackProxy;
    final /* synthetic */ JsonObject $data;
    final /* synthetic */ String $name;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ getThemeData this$0;
    private static char[] onExtraCallback = {64990, 65016, 64979, 64992, 64989, 65010, 64964, 64982, 64991, 65065, 65012, 65064, 64978, 64970, 64960, 64981, 64988, 64915, 64987, 64984, 64980, 64993, 64986, 64995, 64967, 64905, 64916, 64965, 65066, 65067, 64961, 64998, 64976, 64983, 64977, 64966};
    private static char onNavigationEvent = 51247;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    getThemeData$IAuthTabCallback(JsonObject jsonObject, String str, getThemeData getthemedata, setTopGuideBackgroundColor settopguidebackgroundcolor, access13800<? super getThemeData$IAuthTabCallback> access13800Var) {
        super(2, access13800Var);
        this.$data = jsonObject;
        this.$name = str;
        this.this$0 = getthemedata;
        this.$callbackProxy = settopguidebackgroundcolor;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        getThemeData$IAuthTabCallback getthemedata_iauthtabcallback = new getThemeData$IAuthTabCallback(this.$data, this.$name, this.this$0, this.$callbackProxy, access13800Var);
        int i2 = IAuthTabCallback + 11;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return getthemedata_iauthtabcallback;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        onExtraCallbackWithResult = i2 % 128;
        findResAndMsg findresandmsg = (findResAndMsg) obj;
        access13800<? super Unit> access13800Var = (access13800) obj2;
        if (i2 % 2 != 0) {
            return onExtraCallback(findresandmsg, access13800Var);
        }
        Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
        int i3 = 59 / 0;
        return objOnExtraCallback;
    }

    public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getThemeData$IAuthTabCallback getthemedata_iauthtabcallbackCreate = create(findresandmsg, access13800Var);
        if (i3 == 0) {
            return getthemedata_iauthtabcallbackCreate.invokeSuspend(Unit.INSTANCE);
        }
        getthemedata_iauthtabcallbackCreate.invokeSuspend(Unit.INSTANCE);
        throw null;
    }

    public static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ setTopGuideBackgroundColor $callbackProxy;
        final /* synthetic */ Object $message;
        int label;
        private static final byte[] $$a = {89, 120, -98, -110};
        private static final int $$b = 7;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        private static int onExtraCallback = 478308955;

        private static String $$c(byte b, int i, short s) {
            byte[] bArr = $$a;
            int i2 = 105 - (s * 2);
            int i3 = (i * 4) + 4;
            int i4 = b * 2;
            byte[] bArr2 = new byte[1 - i4];
            int i5 = 0 - i4;
            int i6 = -1;
            if (bArr == null) {
                i3++;
                i2 = i3 + i5;
            }
            while (true) {
                i6++;
                bArr2[i6] = (byte) i2;
                if (i6 == i5) {
                    return new String(bArr2, 0);
                }
                int i7 = bArr[i3];
                i3++;
                i2 += i7;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(setTopGuideBackgroundColor settopguidebackgroundcolor, Object obj, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$callbackProxy = settopguidebackgroundcolor;
            this.$message = obj;
        }

        public static /* synthetic */ Unit onExtraCallbackWithResult(Object obj, startRunning startrunning) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 81;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallback = onExtraCallback(obj, startrunning);
            int i4 = IAuthTabCallback + 93;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 18 / 0;
            }
            return unitOnExtraCallback;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 115;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 3;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 71 / 0;
            }
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$callbackProxy, this.$message, access13800Var);
            int i2 = onNavigationEvent + 111;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onwarmupcompleted;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 51;
            onNavigationEvent = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return IAuthTabCallback(findresandmsg, access13800Var);
            }
            IAuthTabCallback(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 53;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (this.label != 0) {
                Object[] objArr = new Object[1];
                a((ViewConfiguration.getKeyRepeatDelay() >> 16) + 47, 34 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0), new char[]{25, 17, '\t', 65483, 65476, 6, '\t', '\n', 19, 22, '\t', 65476, 65483, '\r', 18, 26, 19, 15, '\t', 65483, 65476, 27, '\r', 24, '\f', 65476, 7, 19, 22, 19, 25, 24, '\r', 18, '\t', 7, 5, 16, 16, 65476, 24, 19, 65476, 65483, 22, '\t', 23}, false, 206 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            ResultKt.onNavigationEvent(obj);
            setTopGuideBackgroundColor settopguidebackgroundcolor = this.$callbackProxy;
            final Object obj2 = this.$message;
            settopguidebackgroundcolor.IAuthTabCallback(new Function1() { // from class: viva.republica.toss.tosssecurities.web.tosssecurities.TossSecPrimaryAccountKeyHandler$onHandleWebMessage$1$2$1$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj3) {
                    int i4 = 2 % 2;
                    int i5 = IAuthTabCallback + 25;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 == 0) {
                        getThemeData$IAuthTabCallback.onWarmupCompleted.onExtraCallbackWithResult(obj2, (startRunning) obj3);
                        throw null;
                    }
                    Unit unitOnExtraCallbackWithResult = getThemeData$IAuthTabCallback.onWarmupCompleted.onExtraCallbackWithResult(obj2, (startRunning) obj3);
                    int i6 = onNavigationEvent + 25;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    return unitOnExtraCallbackWithResult;
                }
            });
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 105;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        private static final Unit onExtraCallback(Object obj, startRunning startrunning) {
            int i = 2 % 2;
            if (obj instanceof Boolean) {
                startrunning.onNavigationEvent((Boolean) obj);
            } else {
                Object obj2 = null;
                if (obj instanceof String) {
                    int i2 = IAuthTabCallback + 83;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 != 0) {
                        startRunning.onExtraCallbackWithResult(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -525269328, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{startrunning, (String) obj}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 525269328, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
                    } else {
                        startRunning.onExtraCallbackWithResult(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -525269328, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{startrunning, (String) obj}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 525269328, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
                        obj2.hashCode();
                        throw null;
                    }
                } else if (obj != null) {
                    Object[] objArr = {startrunning, obj.toString()};
                    startRunning.onExtraCallbackWithResult(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -525269328, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), objArr, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 525269328, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
                } else {
                    int i3 = IAuthTabCallback + 105;
                    onNavigationEvent = i3 % 128;
                    if (i3 % 2 == 0) {
                        startrunning.IAuthTabCallback();
                        obj2.hashCode();
                        throw null;
                    }
                    startrunning.IAuthTabCallback();
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x01b5  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x01b6  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
            char c;
            int i4;
            Object obj;
            Throwable cause;
            int i5 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
            char[] cArr2 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (true) {
                c = '0';
                i4 = 2083011369;
                obj = null;
                if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                    break;
                }
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
                int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(onExtraCallback)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.normalizeMetaState(0) + 35125), 23 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0), 10277 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback2 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 55, 2167 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
                int i7 = $11 + 93;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
                char[] cArr3 = new char[i];
                System.arraycopy(cArr2, 0, cArr3, 0, i);
                System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
                System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            }
            if (z) {
                char[] cArr4 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
                while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                    int i9 = $11 + 67;
                    $10 = i9 % 128;
                    if (i9 % 2 != 0) {
                        cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[i % simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                        Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                        if (objOnExtraCallback3 == null) {
                            char capsMode = (char) (TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 12843);
                            int iMyTid = 55 - (Process.myTid() >> 22);
                            int iLastIndexOf = TextUtils.lastIndexOf(BuildConfig.FLAVOR, c, 0) + 2168;
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(capsMode, iMyTid, iLastIndexOf, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(obj, objArr4);
                    } else {
                        cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                        Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                        if (objOnExtraCallback4 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 55 - (Process.myTid() >> 22), Color.blue(0) + 2167, 1298711993, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback4).invoke(null, objArr5);
                        obj = null;
                    }
                    c = '0';
                    i4 = 2083011369;
                }
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static short[] IAuthTabCallback;
        final /* synthetic */ setTopGuideBackgroundColor $callbackProxy;
        final /* synthetic */ Throwable $error;
        int label;
        private static final byte[] $$a = {0, ISOFileInfo.DATA_BYTES1, ISO7816.INS_MSE, -14, ISO7816.INS_REHABILITATE_CHV};
        private static final int $$b = 156;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackStub = 0;
        private static int IAuthTabCallbackDefault = 1;
        private static int onExtraCallbackWithResult = -687933497;
        private static int onExtraCallback = -1538795492;
        private static int onNavigationEvent = -578055004;
        private static byte[] onWarmupCompleted = {19, -12, 2, -14, 12, 3, 10, 0, 25, 64, -75, -15, 24, -1, 84, -10, -49, -9, 9, -10, 5, 2, 79, 4, -56, -16, 0, 6, ISO7816.INS_ERASE_BINARY, 0, 79, -10, -49, -11, -11, 15, 27, -16, 88, 4, -66, 8, 81, ISO7816.INS_READ_BINARY2, 13, 24, 11};

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(byte b, short s, byte b2) {
            int i;
            int i2;
            int i3 = 115 - (b2 * 3);
            int i4 = 5 - (s * 4);
            byte[] bArr = $$a;
            int i5 = 1 - (b * 2);
            byte[] bArr2 = new byte[i5];
            if (bArr == null) {
                int i6 = i5;
                int i7 = i4;
                i2 = 0;
                int i8 = (-i4) + i6;
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
                int i82 = (-i4) + i6;
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(setTopGuideBackgroundColor settopguidebackgroundcolor, Throwable th, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$callbackProxy = settopguidebackgroundcolor;
            this.$error = th;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$callbackProxy, this.$error, access13800Var);
            int i2 = IAuthTabCallbackStub + 25;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 29;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallbackDefault + 37;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 3;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationeventCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return onnavigationeventCreate.invokeSuspend(unit);
            }
            onnavigationeventCreate.invokeSuspend(unit);
            throw null;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 79;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this.label != 0) {
                Object[] objArr = new Object[1];
                a((short) ((-5) - View.combineMeasuredStates(0, 0)), (byte) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (ViewConfiguration.getJumpTapTimeout() >> 16) - 1924739023, (-2043432009) - (Process.myPid() >> 22), (-21) - ExpandableListView.getPackedPositionGroup(0L), objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            ResultKt.onNavigationEvent(obj);
            ALCFaceBox.onExtraCallbackWithResult(this.$callbackProxy, this.$error, (String) null, (Map) null, 6, (Object) null);
            Unit unit = Unit.INSTANCE;
            int i3 = IAuthTabCallbackDefault + 101;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x01b1 A[PHI: r0
          0x01b1: PHI (r0v9 int) = (r0v8 int), (r0v43 int) binds: [B:39:0x01af, B:36:0x019d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x01b3 A[PHI: r0
          0x01b3: PHI (r0v40 int) = (r0v8 int), (r0v43 int) binds: [B:39:0x01af, B:36:0x019d] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
            boolean z;
            int i4;
            int i5;
            boolean z2;
            int i6 = 2 % 2;
            TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') + 43376), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 42, 22439 - Color.argb(0, 0, 0, 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                if (iIntValue == -1) {
                    z = true;
                } else {
                    int i7 = $11 + 101;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    z = false;
                }
                if (z) {
                    byte[] bArr = onWarmupCompleted;
                    if (bArr != null) {
                        int i9 = $11 + 11;
                        $10 = i9 % 128;
                        int i10 = i9 % 2;
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        for (int i11 = 0; i11 < length; i11++) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i11])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                char keyRepeatDelay = (char) (12843 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                                int capsMode = 55 - TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0);
                                int keyRepeatDelay2 = 2167 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                byte b2 = $$a[0];
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(keyRepeatDelay, capsMode, keyRepeatDelay2, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i11] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        byte[] bArr3 = onWarmupCompleted;
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onExtraCallbackWithResult)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 42 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0) + 22440, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                    } else {
                        iIntValue = (short) (((short) (IAuthTabCallback[i + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                    }
                }
                if (iIntValue > 0) {
                    int i12 = $11 + 1;
                    int i13 = i12 % 128;
                    $10 = i13;
                    if (i12 % 2 != 0) {
                        i4 = ((i % iIntValue) - 4) >> ((int) (onExtraCallbackWithResult - 4629411779493505016L));
                        if (z) {
                            i5 = 1;
                        } else {
                            int i14 = i13 + 45;
                            $11 = i14 % 128;
                            int i15 = i14 % 2;
                            i5 = 0;
                        }
                    } else {
                        i4 = ((i + iIntValue) - 2) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)));
                        if (z) {
                        }
                    }
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i4 + i5;
                    Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onNavigationEvent), sb};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0')), 87 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 9568 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr4 = onWarmupCompleted;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        for (int i16 = 0; i16 < length2; i16++) {
                            bArr5[i16] = (byte) (bArr4[i16] ^ (-4629411779493505016L));
                        }
                        bArr4 = bArr5;
                    }
                    if (bArr4 != null) {
                        int i17 = $11 + 121;
                        $10 = i17 % 128;
                        int i18 = i17 % 2;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        int i19 = $10;
                        int i20 = i19 + 45;
                        $11 = i20 % 128;
                        if (i20 % 2 == 0) {
                            throw null;
                        }
                        if (z2) {
                            int i21 = i19 + 89;
                            $11 = i21 % 128;
                            int i22 = i21 % 2;
                            byte[] bArr6 = onWarmupCompleted;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            short[] sArr = IAuthTabCallback;
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
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00fc, code lost:
    
        if (r2.equals(((java.lang.String) r10[0]).intern()) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x017b, code lost:
    
        if (r15 != r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x020b, code lost:
    
        if (o.maybeUpdateAnimatable.onExtraCallback(r3, r4, r14) != r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0235, code lost:
    
        if (o.maybeUpdateAnimatable.onExtraCallback(r3, r4, r14) == r1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0237, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0216  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        Object obj3;
        Throwable th;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            access14300.onWarmupCompleted();
            throw null;
        }
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Result.Companion companion = Result.Companion;
            obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
        } catch (WebResourceResponseModel e3) {
            Result.Companion companion2 = Result.Companion;
            obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
            int i4 = IAuthTabCallback + 57;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        if (i3 == 0) {
            ResultKt.onNavigationEvent(obj);
            JsonObject jsonObject = this.$data;
            String str = this.$name;
            getThemeData getthemedata = this.this$0;
            Result.Companion companion3 = Result.Companion;
            JsonObject jsonObjectOnExtraCallbackWithResult = new setText(jsonObject).onExtraCallbackWithResult();
            int iHashCode = str.hashCode();
            if (iHashCode == -2084971957) {
                Object[] objArr = new Object[1];
                a(new char[]{28, '\f', 13811, 13811, 1, '\t', '!', 30, '\"', 18, 28, 18, '\b', '\r', 1, '\t', 29, 18, '\"', 18, 6, 18, 31, '\f', 2, '#', '\"', 14, '\"', 5, 25, 0, '\r', 19}, (byte) (10 - KeyEvent.getDeadChar(0, 0)), View.MeasureSpec.getMode(0) + 34, objArr);
                if (str.equals(((String) objArr[0]).intern())) {
                    int i6 = onExtraCallbackWithResult + 55;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.L$1 = access15400.onNavigationEvent(jsonObjectOnExtraCallbackWithResult);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    obj = getThemeData.onNavigationEvent(getthemedata, jsonObjectOnExtraCallbackWithResult, this);
                }
                StringBuilder sb = new StringBuilder();
                Object[] objArr2 = new Object[1];
                a(new char[]{'\"', 1, 22, 1, '\f', '\n', 5, 16, 1, 6, 13840, 13840, 14, 18, 11, '\r', 0, 16, 1, 6, 29, '\r'}, (byte) (39 - View.resolveSize(0, 0)), 21 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr2);
                sb.append(((String) objArr2[0]).intern());
                sb.append(str);
                throw new IllegalStateException(sb.toString());
            }
            if (iHashCode == -1474048553) {
                a(new char[]{28, '\f', 13805, 13805, 1, '\t', '!', 30, '\"', 18, 28, 18, '\b', '\r', 11, '\b', 29, 18, '\"', 18, 6, 18, 31, '\f', 2, '#', '\"', 14, '\"', 5, 25, 0, '\r', 19}, (byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 5), 34 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), new Object[1]);
                if (!(!str.equals(((String) r10[0]).intern()))) {
                    obj = getThemeData.IAuthTabCallback(getthemedata, jsonObjectOnExtraCallbackWithResult);
                }
                StringBuilder sb2 = new StringBuilder();
                Object[] objArr22 = new Object[1];
                a(new char[]{'\"', 1, 22, 1, '\f', '\n', 5, 16, 1, 6, 13840, 13840, 14, 18, 11, '\r', 0, 16, 1, 6, 29, '\r'}, (byte) (39 - View.resolveSize(0, 0)), 21 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr22);
                sb2.append(((String) objArr22[0]).intern());
                sb2.append(str);
                throw new IllegalStateException(sb2.toString());
            }
            if (iHashCode == 1178463191) {
                int i8 = onExtraCallbackWithResult + 29;
                IAuthTabCallback = i8 % 128;
                if (i8 % 2 != 0) {
                    Object[] objArr3 = new Object[1];
                    a(new char[]{28, '\f', 13914, 13914, 1, '\t', '!', 30, '\"', 18, 28, 18, '\b', '\r', 19, '\t', 4, '\f', 25, '\t', 18, '#', 18, 4, 18, 0, 17, 1, 13930, 13930, 17, '\"', 0, 28, 7, '\r', 13908}, (byte) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 76), 69 >> (ViewConfiguration.getMaximumDrawingCacheSize() % 112), objArr3);
                    if (str.equals(((String) objArr3[0]).intern())) {
                        obj = access14000.onNavigationEvent(getThemeData.onWarmupCompleted(getthemedata, jsonObjectOnExtraCallbackWithResult));
                    }
                } else {
                    Object[] objArr4 = new Object[1];
                    a(new char[]{28, '\f', 13914, 13914, 1, '\t', '!', 30, '\"', 18, 28, 18, '\b', '\r', 19, '\t', 4, '\f', 25, '\t', 18, '#', 18, 4, 18, 0, 17, 1, 13930, 13930, 17, '\"', 0, 28, 7, '\r', 13908}, (byte) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 112), 37 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr4);
                }
            }
            StringBuilder sb22 = new StringBuilder();
            Object[] objArr222 = new Object[1];
            a(new char[]{'\"', 1, 22, 1, '\f', '\n', 5, 16, 1, 6, 13840, 13840, 14, 18, 11, '\r', 0, 16, 1, 6, 29, '\r'}, (byte) (39 - View.resolveSize(0, 0)), 21 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr222);
            sb22.append(((String) objArr222[0]).intern());
            sb22.append(str);
            throw new IllegalStateException(sb22.toString());
            int i9 = IAuthTabCallback + 105;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            setTopGuideBackgroundColor settopguidebackgroundcolor = this.$callbackProxy;
            if (Result.onNavigationEvent(obj2)) {
                setPatch setpatchOnExtraCallback = putChannelInfo.onExtraCallback().onExtraCallback();
                onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(settopguidebackgroundcolor, obj2, null);
                this.L$0 = obj2;
                this.L$1 = access15400.onNavigationEvent(obj2);
                this.I$0 = 0;
                this.label = 2;
            }
            obj3 = obj2;
            setTopGuideBackgroundColor settopguidebackgroundcolor2 = this.$callbackProxy;
            th = Result.exceptionOrNull-impl(obj3);
            if (th != null) {
            }
            return Unit.INSTANCE;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    Object[] objArr5 = new Object[1];
                    a(new char[]{30, 14, 13930, 13930, '\f', 29, 17, '\f', 24, ' ', '\b', '\r', 30, 5, '\b', 25, 16, '#', '\t', '\r', '\f', '\"', 11, '\r', 28, 20, 3, 28, '\r', 22, '\b', 25, '\f', 11, 18, 28, 23, '\f', '\"', 14, '\"', '\f', 30, 29, 28, '\n', 13939}, (byte) (KeyEvent.normalizeMetaState(0) + 116), (Process.myPid() >> 22) + 47, objArr5);
                    throw new IllegalStateException(((String) objArr5[0]).intern());
                }
                ResultKt.onNavigationEvent(obj);
                int i11 = onExtraCallbackWithResult + 79;
                IAuthTabCallback = i11 % 128;
                int i12 = i11 % 2;
                return Unit.INSTANCE;
            }
            obj3 = this.L$0;
            ResultKt.onNavigationEvent(obj);
            setTopGuideBackgroundColor settopguidebackgroundcolor22 = this.$callbackProxy;
            th = Result.exceptionOrNull-impl(obj3);
            if (th != null) {
                setPatch setpatchOnExtraCallback2 = putChannelInfo.onExtraCallback().onExtraCallback();
                onNavigationEvent onnavigationevent = new onNavigationEvent(settopguidebackgroundcolor22, th, null);
                this.L$0 = obj3;
                this.L$1 = access15400.onNavigationEvent(th);
                this.I$0 = 0;
                this.label = 3;
            }
            return Unit.INSTANCE;
        }
        ResultKt.onNavigationEvent(obj);
        obj2 = Result.constructor-impl(obj);
        int i92 = IAuthTabCallback + 105;
        onExtraCallbackWithResult = i92 % 128;
        int i102 = i92 % 2;
        setTopGuideBackgroundColor settopguidebackgroundcolor3 = this.$callbackProxy;
        if (Result.onNavigationEvent(obj2)) {
        }
        obj3 = obj2;
        setTopGuideBackgroundColor settopguidebackgroundcolor222 = this.$callbackProxy;
        th = Result.exceptionOrNull-impl(obj3);
        if (th != null) {
        }
        return Unit.INSTANCE;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onExtraCallback;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 27, 23138 - ((byte) KeyEvent.getModifierMetaStateMask()), -2137011959, false, "z", new Class[]{Integer.TYPE});
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
        Object[] objArr3 = {Integer.valueOf(onNavigationEvent)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(0, 0), ImageFormat.getBitsPerPixel(0) + 27, 23139 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
            int i5 = $11 + 123;
            $10 = i5 % 128;
            int i6 = i5 % 2;
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    int i7 = $11 + 101;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0') + 24825), (ViewConfiguration.getTouchSlop() >> 8) + 74, 8087 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        int i9 = $10 + 81;
                        $11 = i9 % 128;
                        int i10 = i9 % 2;
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(0, 0), TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 30, 19488 - View.resolveSize(0, 0), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i11];
                    } else if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                        defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                        int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                        int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i12];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                    } else {
                        int i14 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i14];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i15];
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
            }
        }
        for (int i16 = 0; i16 < i; i16++) {
            cArr4[i16] = (char) (cArr4[i16] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }
}
