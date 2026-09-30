package o;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Base64;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.opencv.core.Mat;
import org.tensorflow.lite.Delegate;
import org.tensorflow.lite.Interpreter;
import org.tensorflow.lite.RuntimeFlavor;
import org.tensorflow.lite.gpu.GpuDelegateFactory;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class putPluginConfig<T> {
    public static final onExtraCallbackWithResult Companion;
    private static int IAuthTabCallback_Parcel;
    private static int asInterface;
    private static volatile Boolean onExtraCallbackWithResult;
    private static final String onNavigationEvent;
    private static char[] onTransact;
    private Delegate IAuthTabCallback;
    private final jni_YGNodeStyleGetFlexBasisJNI IAuthTabCallbackStub;
    private final InterfaceC0060error<T> asBinder;
    private final Context onExtraCallback;
    private Interpreter onWarmupCompleted;
    private static final byte[] $$a = {15, -112, -70, -94};
    private static final int $$b = 5;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int access000 = 0;
    private static int getInterfaceDescriptor = 1;
    private static int IAuthTabCallbackDefault = 0;

    static final class onNavigationEvent extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ putPluginConfig<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(putPluginConfig<T> putpluginconfig, access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
            this.this$0 = putpluginconfig;
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 15;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object obj2 = null;
            Object objOnExtraCallback = this.this$0.onExtraCallback((Mat) null, (access13800) this);
            int i4 = onWarmupCompleted + 103;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnExtraCallback;
            }
            obj2.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, short s, int i2) {
        int i3;
        int i4;
        int i5 = (i2 * 2) + 4;
        int i6 = 1 - (i * 3);
        int i7 = (s * 4) + 105;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i8 = i6;
            i4 = 0;
            i7 += i8;
            i5++;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i4 == i6) {
                return new String(bArr2, 0);
            }
            i8 = bArr[i5];
            i7 += i8;
            i5++;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i4 == i6) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i4 == i6) {
            }
        }
    }

    static {
        IAuthTabCallback_Parcel = 1;
        onWarmupCompleted();
        Object[] objArr = new Object[1];
        a(new int[]{0, 23, 135, 1}, false, new byte[]{1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0}, objArr);
        onNavigationEvent = ((String) objArr[0]).intern();
        Companion = new onExtraCallbackWithResult(null);
        int i = IAuthTabCallbackDefault + 91;
        IAuthTabCallback_Parcel = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i3;
        int i8 = ~(i7 | i5);
        int i9 = (~(i7 | i6)) | i8;
        int i10 = ~i5;
        int i11 = ~(i10 | i3);
        int i12 = i8 | i11 | (~(i10 | i6));
        int i13 = (~((~i6) | i10)) | i8 | i11;
        int i14 = i3 + i5 + i2 + ((-369695973) * i) + (1794320298 * i4);
        int i15 = i14 * i14;
        int i16 = ((-1820121865) * i3) + 1478230016 + (776760710 * i5) + ((-1698084721) * i9) + ((-1731255050) * i12) + (865627525 * i13) + ((-88866816) * i2) + (217841664 * i) + ((-410517504) * i4) + ((-175177728) * i15);
        int i17 = ((i3 * 1872133577) - 2052485254) + (i5 * 1872135674) + (i9 * 2097) + (i12 * (-1398)) + (i13 * 699) + (i2 * 1872134975) + (i * (-1328892763)) + (i4 * (-1296121642)) + (i15 * (-1691287552));
        return i16 + ((i17 * i17) * (-1729036288)) != 1 ? onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr);
    }

    public putPluginConfig(@NotNull Context context, @NotNull InterfaceC0060error<T> interfaceC0060error) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC0060error, "");
        this.onExtraCallback = context;
        this.asBinder = interfaceC0060error;
        this.IAuthTabCallbackStub = jni_YGNodeStyleGetFlexGrowJNI.IAuthTabCallback(false, 1, (Object) null);
    }

    public static final /* synthetic */ Context IAuthTabCallback(putPluginConfig putpluginconfig) {
        int i = 2 % 2;
        int i2 = access000 + 1;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        Object obj = null;
        Context context = putpluginconfig.onExtraCallback;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 85;
        access000 = i5 % 128;
        if (i5 % 2 == 0) {
            return context;
        }
        throw null;
    }

    public static final /* synthetic */ void onExtraCallback(putPluginConfig putpluginconfig, Context context) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 117;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        putpluginconfig.onNavigationEvent(context);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = getInterfaceDescriptor + 73;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws IOException {
        putPluginConfig putpluginconfig = (putPluginConfig) objArr[0];
        Context context = (Context) objArr[1];
        String str = (String) objArr[2];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 63;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        ByteBuffer byteBufferOnNavigationEvent = putpluginconfig.onNavigationEvent(context, str);
        int i4 = access000 + 97;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return byteBufferOnNavigationEvent;
    }

    public static final /* synthetic */ jni_YGNodeStyleGetFlexBasisJNI onExtraCallbackWithResult(putPluginConfig putpluginconfig) {
        int i = 2 % 2;
        int i2 = access000 + 73;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni = putpluginconfig.IAuthTabCallbackStub;
        int i5 = i3 + 37;
        access000 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 14 / 0;
        }
        return jni_ygnodestylegetflexbasisjni;
    }

    public static final /* synthetic */ void onNavigationEvent(putPluginConfig putpluginconfig, ByteBuffer byteBuffer, int i, boolean z) {
        int i2 = 2 % 2;
        int i3 = access000 + 109;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        putpluginconfig.onExtraCallbackWithResult(byteBuffer, i, z);
        int i5 = getInterfaceDescriptor + 119;
        access000 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final Object onNavigationEvent(@NotNull String str, int i, boolean z, @NotNull access13800<? super Unit> access13800Var) {
        int i2 = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new onWarmupCompleted(this, str, i, z, null), access13800Var);
        if (objOnExtraCallback != access14300.onWarmupCompleted()) {
            return Unit.INSTANCE;
        }
        int i3 = getInterfaceDescriptor + 9;
        access000 = i3 % 128;
        if (i3 % 2 == 0) {
            return objOnExtraCallback;
        }
        throw null;
    }

    public static final class onExtraCallbackWithResult {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent = 0;
        private static long onWarmupCompleted = -6215609328077449322L;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
            char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onWarmupCompleted ^ (-7907085296252847348L), cArr, i);
            timelineExternalSyntheticLambda0.onNavigationEvent = 4;
            while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
                int i3 = $10 + 59;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 45813), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 83, 21233 - Color.blue(0), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - (ViewConfiguration.getScrollBarSize() >> 8)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 19, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 8807, 64918803, false, "d", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
            int i6 = $11 + 31;
            $10 = i6 % 128;
            if (i6 % 2 == 0) {
                objArr[0] = str;
            } else {
                int i7 = 8 / 0;
                objArr[0] = str;
            }
        }

        private onExtraCallbackWithResult() {
        }

        public static final /* synthetic */ String onWarmupCompleted(onExtraCallbackWithResult onextracallbackwithresult) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 85;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            String strIAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            int i4 = IAuthTabCallback + 15;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return strIAuthTabCallback;
        }

        private final String IAuthTabCallback() throws Throwable {
            Object obj;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 63;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                Object[] objArr = new Object[1];
                a(new char[]{20986, 20898, 15011, 38495, 2128, 20741, 65466, 64003, 58309, 26063, 23292, 18366, 13680, 11197, 61257, 38240, 18097, 63785, 8476, 58064, 38922, 19669, 29609, 12449, 11684, 4713, 33800, 32288, 32767, 57800, 54932, 52210, 45414, 47080, 27452, 6516, 49809, 1309, 48442, 26316, 5219, 51340, 53131, 46237, 43435, 40525, '&', 601}, ViewConfiguration.getTouchSlop() + 116, objArr);
                obj = objArr[0];
            } else {
                Object[] objArr2 = new Object[1];
                a(new char[]{20986, 20898, 15011, 38495, 2128, 20741, 65466, 64003, 58309, 26063, 23292, 18366, 13680, 11197, 61257, 38240, 18097, 63785, 8476, 58064, 38922, 19669, 29609, 12449, 11684, 4713, 33800, 32288, 32767, 57800, 54932, 52210, 45414, 47080, 27452, 6516, 49809, 1309, 48442, 26316, 5219, 51340, 53131, 46237, 43435, 40525, '&', 601}, ViewConfiguration.getTouchSlop() >> 8, objArr2);
                obj = objArr2[0];
            }
            String strIntern = ((String) obj).intern();
            int i3 = onNavigationEvent + 107;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return strIntern;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    private final void onExtraCallbackWithResult(ByteBuffer byteBuffer, int i, boolean z) {
        int i2 = 2 % 2;
        Interpreter interpreter = this.onWarmupCompleted;
        if (interpreter != null) {
            interpreter.close();
        }
        Delegate delegateOnExtraCallback = null;
        this.onWarmupCompleted = null;
        Delegate delegate = this.IAuthTabCallback;
        if (delegate != null) {
            int i3 = getInterfaceDescriptor + 45;
            access000 = i3 % 128;
            int i4 = i3 % 2;
            delegate.close();
        }
        this.IAuthTabCallback = null;
        if (z) {
            int i5 = access000 + 67;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            delegateOnExtraCallback = onExtraCallback();
        }
        Interpreter.Options numThreads = new Interpreter.Options().setNumThreads(i);
        if (delegateOnExtraCallback != null) {
            numThreads.addDelegate(delegateOnExtraCallback);
        }
        Intrinsics.checkNotNullExpressionValue(numThreads, "");
        Interpreter interpreter2 = new Interpreter(byteBuffer, numThreads);
        interpreter2.allocateTensors();
        this.asBinder.onNavigationEvent(interpreter2);
        this.onWarmupCompleted = interpreter2;
        this.IAuthTabCallback = delegateOnExtraCallback;
    }

    private final Delegate onExtraCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 7;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        if (!Intrinsics.areEqual(onExtraCallbackWithResult, Boolean.FALSE)) {
            try {
                Delegate delegateCreate = new GpuDelegateFactory(new GpuDelegateFactory.Options().setForceBackend(GpuDelegateFactory.Options.GpuBackend.OPENCL).setPrecisionLossAllowed(false)).create(RuntimeFlavor.APPLICATION);
                onExtraCallbackWithResult = Boolean.TRUE;
                return delegateCreate;
            } catch (Throwable unused) {
                onExtraCallbackWithResult = Boolean.FALSE;
                return null;
            }
        }
        int i4 = access000 + 37;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static final byte[] $$a = {121, -58, 81, 67};
        private static final int $$b = 238;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 478308992;
        final /* synthetic */ String $assetFilePath;
        final /* synthetic */ int $threadCount;
        final /* synthetic */ boolean $useGpu;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        final /* synthetic */ putPluginConfig<T> this$0;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(short s, int i, int i2) {
            int i3;
            int i4;
            int i5 = 1 - (s * 4);
            int i6 = i + 4;
            int i7 = (i2 * 3) + 105;
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[i5];
            if (bArr == null) {
                int i8 = i5;
                i4 = 0;
                i7 = (-i7) + i8;
                i3 = i4;
                i4 = i3 + 1;
                bArr2[i3] = (byte) i7;
                if (i4 == i5) {
                    return new String(bArr2, 0);
                }
                i6++;
                i8 = i7;
                i7 = bArr[i6];
                i7 = (-i7) + i8;
                i3 = i4;
                i4 = i3 + 1;
                bArr2[i3] = (byte) i7;
                if (i4 == i5) {
                }
            } else {
                i3 = 0;
                i4 = i3 + 1;
                bArr2[i3] = (byte) i7;
                if (i4 == i5) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(putPluginConfig<T> putpluginconfig, String str, int i, boolean z, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.this$0 = putpluginconfig;
            this.$assetFilePath = str;
            this.$threadCount = i;
            this.$useGpu = z;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.this$0, this.$assetFilePath, this.$threadCount, this.$useGpu, access13800Var);
            int i2 = onExtraCallbackWithResult + 103;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 25;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onNavigationEvent(findresandmsg, access13800Var);
            }
            onNavigationEvent(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 57;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 95;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
            int i4;
            char c;
            char[] cArr2;
            int i5 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
            char[] cArr3 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            int i6 = $11 + 93;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            while (true) {
                i4 = 2083011369;
                c = '0';
                if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                    break;
                }
                int i8 = $11 + 119;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                cArr3[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
                int i10 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i10]), Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - KeyEvent.keyCodeFromString("")), 22 - TextUtils.lastIndexOf("", '0', 0, 0), TextUtils.indexOf((CharSequence) "", '0') + 10279, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[i10] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback2 == null) {
                        byte b = (byte) 0;
                        byte b2 = (byte) (b - 1);
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - TextUtils.getTrimmedLength("")), AndroidCharacter.getMirror('0') + 7, 2167 - TextUtils.getTrimmedLength(""), 1298711993, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            if (i2 > 0) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
                char[] cArr4 = new char[i];
                System.arraycopy(cArr3, 0, cArr4, 0, i);
                System.arraycopy(cArr4, 0, cArr3, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
                System.arraycopy(cArr4, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr3, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            }
            if (z) {
                int i11 = $11 + 61;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    cArr2 = new char[i];
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 1;
                } else {
                    cArr2 = new char[i];
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
                }
                while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                    cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr3[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    try {
                        Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                        if (objOnExtraCallback3 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = (byte) (b3 - 1);
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", c) + 12844), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 54, 2167 - (ViewConfiguration.getEdgeSlop() >> 16), 1298711993, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        i4 = 2083011369;
                        c = '0';
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                cArr3 = cArr2;
            }
            objArr[0] = new String(cArr3);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjniOnExtraCallbackWithResult;
            putPluginConfig<T> putpluginconfig;
            int i;
            String str;
            boolean z;
            int i2 = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                jni_ygnodestylegetflexbasisjniOnExtraCallbackWithResult = putPluginConfig.onExtraCallbackWithResult(this.this$0);
                putpluginconfig = this.this$0;
                String str2 = this.$assetFilePath;
                i = this.$threadCount;
                boolean z2 = this.$useGpu;
                this.L$0 = jni_ygnodestylegetflexbasisjniOnExtraCallbackWithResult;
                this.L$1 = putpluginconfig;
                this.L$2 = str2;
                this.I$0 = i;
                this.Z$0 = z2;
                this.label = 1;
                if (jni_ygnodestylegetflexbasisjniOnExtraCallbackWithResult.IAuthTabCallback((Object) null, this) == objOnWarmupCompleted) {
                    int i4 = IAuthTabCallback + 35;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    return objOnWarmupCompleted;
                }
                str = str2;
                z = z2;
            } else {
                if (i3 != 1) {
                    Object[] objArr = new Object[1];
                    a(47 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 3 - KeyEvent.keyCodeFromString(""), new char[]{16, 5, 7, '\t', 18, '\r', 24, 25, 19, 22, 19, 7, 65476, '\f', 24, '\r', 27, 65476, 65483, '\t', 15, 19, 26, 18, '\r', 65483, 65476, '\t', 22, 19, '\n', '\t', 6, 65476, 65483, '\t', 17, 25, 23, '\t', 22, 65483, 65476, 19, 24, 65476, 16}, true, 262 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                int i6 = IAuthTabCallback + 77;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                z = this.Z$0;
                i = this.I$0;
                str = (String) this.L$2;
                putpluginconfig = (putPluginConfig) this.L$1;
                jni_ygnodestylegetflexbasisjniOnExtraCallbackWithResult = (jni_YGNodeStyleGetFlexBasisJNI) this.L$0;
                ResultKt.onNavigationEvent(obj);
                int i8 = IAuthTabCallback + 11;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
            }
            try {
                putPluginConfig.onExtraCallback(putpluginconfig, putPluginConfig.IAuthTabCallback(putpluginconfig));
                Object[] objArr2 = {putpluginconfig, putPluginConfig.IAuthTabCallback(putpluginconfig), str};
                int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
                putPluginConfig.onNavigationEvent(putpluginconfig, (ByteBuffer) putPluginConfig.onExtraCallback(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), 1352628322, forceDomainCheck.IAuthTabCallback(), -1352628322, objArr2, iIAuthTabCallback), i, z);
                return Unit.INSTANCE;
            } finally {
                jni_ygnodestylegetflexbasisjniOnExtraCallbackWithResult.onWarmupCompleted((Object) null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, char[] cArr, int i3, boolean z, Object[] objArr) throws Throwable {
        int i4;
        char c;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i2];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            c = '0';
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i2) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(asInterface)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 35125), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 23, 10277 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) ($$b - 5);
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 55 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 2168 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
        if (i > 0) {
            int i7 = $11 + 53;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i2) {
                int i9 = $10 + 113;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) ($$b - 5);
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12842 - TextUtils.indexOf("", c)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 55, TextUtils.getTrimmedLength("") + 2167, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 2083011369;
                c = '0';
            }
            cArr2 = cArr4;
        }
        String str = new String(cArr2);
        int i11 = $10 + 123;
        $11 = i11 % 128;
        int i12 = i11 % 2;
        objArr[0] = str;
    }

    private final ByteBuffer onNavigationEvent(Context context, String str) throws IOException {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 45;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        byte[] bArrDecode = Base64.decode(onExtraCallbackWithResult.onWarmupCompleted(Companion), 2);
        Intrinsics.checkNotNullExpressionValue(bArrDecode, "");
        InputStream inputStreamOpen = context.getAssets().open(str);
        try {
            int iAvailable = inputStreamOpen.available();
            ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iAvailable - 28).order(ByteOrder.nativeOrder());
            Intrinsics.checkNotNullExpressionValue(byteBufferOrder, "");
            byte[] bArr = new byte[12];
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[10240];
            byte[] bArr4 = new byte[10240];
            Intrinsics.checkNotNull(inputStreamOpen);
            onWarmupCompleted(this, inputStreamOpen, bArr3, 0, 0, 6, null);
            onWarmupCompleted(this, inputStreamOpen, bArr, 0, 0, 6, null);
            onWarmupCompleted(this, inputStreamOpen, bArr2, 0, 0, 6, null);
            byte[] bArr5 = new byte[iAvailable - 20508];
            onWarmupCompleted(this, inputStreamOpen, bArr5, 0, 0, 6, null);
            onWarmupCompleted(this, inputStreamOpen, bArr4, 0, 0, 6, null);
            byte[] bArr6 = new byte[20480];
            onNavigationEvent(bArrDecode, bArr, bArr2, bArr3, bArr4, bArr6, 0);
            byteBufferOrder.position(0);
            byteBufferOrder.put(bArr6, 0, 10240);
            byteBufferOrder.put(bArr5);
            byteBufferOrder.put(bArr6, 10240, 10240);
            byteBufferOrder.rewind();
            ArraysKt.fill$default(bArrDecode, (byte) 0, 0, 0, 6, (Object) null);
            ArraysKt.fill$default(bArr6, (byte) 0, 0, 0, 6, (Object) null);
            ArraysKt.fill$default(bArr5, (byte) 0, 0, 0, 6, (Object) null);
            ArraysKt.fill$default(bArr3, (byte) 0, 0, 0, 6, (Object) null);
            ArraysKt.fill$default(bArr4, (byte) 0, 0, 0, 6, (Object) null);
            CloseableKt.closeFinally(inputStreamOpen, (Throwable) null);
            int i4 = getInterfaceDescriptor + 45;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            return byteBufferOrder;
        } finally {
        }
    }

    static /* synthetic */ void onWarmupCompleted(putPluginConfig putpluginconfig, InputStream inputStream, byte[] bArr, int i, int i2, int i3, Object obj) {
        int i4 = 2 % 2;
        int i5 = access000;
        int i6 = i5 + 5;
        getInterfaceDescriptor = i6 % 128;
        int i7 = i6 % 2;
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            int i8 = i5 + 79;
            getInterfaceDescriptor = i8 % 128;
            int i9 = i8 % 2;
            i2 = bArr.length;
        }
        Object[] objArr = {putpluginconfig, inputStream, bArr, Integer.valueOf(i), Integer.valueOf(i2)};
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        onExtraCallback(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), 195757426, forceDomainCheck.IAuthTabCallback(), -195757425, objArr, iIAuthTabCallback);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        InputStream inputStream = (InputStream) objArr[1];
        byte[] bArr = (byte[]) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int iIntValue2 = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = access000 + 77;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 20 / 0;
        }
        int i4 = iIntValue2;
        while (i4 > 0) {
            int i5 = getInterfaceDescriptor + 115;
            access000 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = inputStream.read(bArr, iIntValue, i4);
            if (i7 == -1) {
                StringBuilder sb = new StringBuilder();
                Object[] objArr2 = new Object[1];
                a(new int[]{40, 35, 0, 12}, false, new byte[]{1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0}, objArr2);
                sb.append(((String) objArr2[0]).intern());
                sb.append(iIntValue2);
                Object[] objArr3 = new Object[1];
                a(new int[]{75, 12, 105, 0}, false, new byte[]{1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0}, objArr3);
                sb.append(((String) objArr3[0]).intern());
                sb.append(iIntValue2 - i4);
                throw new EOFException(sb.toString());
            }
            int i8 = access000 + 47;
            getInterfaceDescriptor = i8 % 128;
            int i9 = i8 % 2;
            iIntValue += i7;
            i4 -= i7;
        }
        return null;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr;
        int i;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = onTransact;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i7 = 0; i7 < length; i7++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 35283), 35 - Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
        char[] cArr4 = new char[i4];
        System.arraycopy(cArr2, i3, cArr4, 0, i4);
        if (bArr != null) {
            int i8 = $11 + 125;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            char[] cArr5 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10983 - AndroidCharacter.getMirror('0')), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 64, Color.alpha(0) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i10] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 29 - Color.alpha(0), 17656 - TextUtils.indexOf((CharSequence) "", '0', 0), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i11] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr5[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49466 - ImageFormat.getBitsPerPixel(0)), 70 - TextUtils.indexOf("", "", 0, 0), 12486 - TextUtils.getOffsetBefore("", 0), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr4 = cArr5;
        }
        if (i6 > 0) {
            char[] cArr6 = new char[i4];
            System.arraycopy(cArr4, 0, cArr6, 0, i4);
            int i12 = i4 - i6;
            System.arraycopy(cArr6, 0, cArr4, i12, i6);
            System.arraycopy(cArr6, i6, cArr4, 0, i12);
        }
        if (z) {
            int i13 = $11 + 117;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                cArr = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
            } else {
                cArr = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            }
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i14 = $10 + 71;
                $11 = i14 % 128;
                if (i14 % 2 == 0) {
                    int i15 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    int i16 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    cArr[i15] = cArr4[0];
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                } else {
                    cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
            }
            cArr4 = cArr;
        }
        if (i5 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i17 = $10 + 7;
                $11 = i17 % 128;
                int i18 = i17 % 2;
                cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        String str = new String(cArr4);
        int i19 = $10 + 33;
        $11 = i19 % 128;
        if (i19 % 2 != 0) {
            objArr[0] = str;
        } else {
            int i20 = 66 / 0;
            objArr[0] = str;
        }
    }

    private final int onNavigationEvent(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, int i) throws Throwable {
        int i2 = 2 % 2;
        Object[] objArr = new Object[1];
        a(new int[]{23, 17, 0, 0}, true, new byte[]{1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0}, objArr);
        Cipher cipher = Cipher.getInstance(((String) objArr[0]).intern());
        Intrinsics.checkNotNullExpressionValue(cipher, "");
        Object[] objArr2 = new Object[1];
        b(2 - TextUtils.getTrimmedLength(""), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2, new char[]{65533, 11, 65529}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 122, false, objArr2);
        cipher.init(2, new SecretKeySpec(bArr, ((String) objArr2[0]).intern()), new GCMParameterSpec(128, bArr2));
        byte[] bArrPlus = ArraysKt.plus(ArraysKt.plus(bArr4, bArr5), bArr3);
        int iDoFinal = cipher.doFinal(bArrPlus, 0, bArrPlus.length, bArr6, i);
        int i3 = access000 + 19;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return iDoFinal;
    }

    private final void onNavigationEvent(Context context) {
        int i = 2 % 2;
        try {
            File[] fileArrListFiles = context.getCacheDir().listFiles();
            if (fileArrListFiles == null) {
                fileArrListFiles = new File[0];
            }
            ArrayList arrayList = new ArrayList();
            int i2 = access000 + 19;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            for (File file : fileArrListFiles) {
                int i4 = getInterfaceDescriptor + 7;
                access000 = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.checkNotNull(file);
                String extension = FilesKt.getExtension(file);
                Object[] objArr = new Object[1];
                b(6 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 5, new char[]{'\b', 65533, 0, 65530, '\b', 65529}, 159 - (ViewConfiguration.getTapTimeout() >> 16), true, objArr);
                if (Intrinsics.areEqual(extension, ((String) objArr[0]).intern())) {
                    arrayList.add(file);
                }
            }
            Iterator<T> it = arrayList.iterator();
            int i6 = getInterfaceDescriptor + 103;
            access000 = i6 % 128;
            int i7 = i6 % 2;
            while (it.hasNext()) {
                int i8 = getInterfaceDescriptor + 125;
                access000 = i8 % 128;
                int i9 = i8 % 2;
                ((File) it.next()).delete();
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c1, code lost:
    
        if (r13 == r2) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onExtraCallback(@NotNull Mat mat, @NotNull access13800<? super T> access13800Var) throws Throwable {
        onNavigationEvent onnavigationevent;
        putPluginConfig<T> putpluginconfig;
        Mat mat2;
        int i = 2 % 2;
        if (Class.forName("o.putPluginConfig$onNavigationEvent").isInstance(access13800Var)) {
            onnavigationevent = (onNavigationEvent) access13800Var;
            int i2 = onnavigationevent.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = getInterfaceDescriptor + 21;
                access000 = i3 % 128;
                int i4 = i3 % 2;
                onnavigationevent.label = i2 - 2147483648;
            } else {
                onnavigationevent = new onNavigationEvent(this, access13800Var);
            }
        }
        Object objOnNavigationEvent = onnavigationevent.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = onnavigationevent.label;
        try {
            if (i5 == 0) {
                ResultKt.onNavigationEvent(objOnNavigationEvent);
                Mat mat3 = this.IAuthTabCallbackStub;
                onnavigationevent.L$0 = this;
                onnavigationevent.L$1 = mat;
                onnavigationevent.L$2 = mat3;
                onnavigationevent.label = 1;
                if (mat3.IAuthTabCallback((Object) null, onnavigationevent) != objOnWarmupCompleted) {
                    putpluginconfig = this;
                    mat2 = mat;
                    mat = mat3;
                }
                return objOnWarmupCompleted;
            }
            if (i5 != 1) {
                int i6 = getInterfaceDescriptor + 61;
                access000 = i6 % 128;
                if (i6 % 2 == 0 ? i5 == 2 : i5 == 2) {
                    mat = (jni_YGNodeStyleGetFlexBasisJNI) onnavigationevent.L$0;
                    ResultKt.onNavigationEvent(objOnNavigationEvent);
                    return objOnNavigationEvent;
                }
                Object[] objArr = new Object[1];
                b(View.MeasureSpec.makeMeasureSpec(0, 0) + 9, 47 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new char[]{7, 19, 22, 19, 25, 24, '\r', 18, '\t', 7, 5, 16, 16, 65476, 24, 19, 65476, 65483, 22, '\t', 23, 25, 17, '\t', 65483, 65476, 6, '\t', '\n', 19, 22, '\t', 65476, 65483, '\r', 18, 26, 19, 15, '\t', 65483, 65476, 27, '\r', 24, '\f', 65476}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 143, false, objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            mat = (jni_YGNodeStyleGetFlexBasisJNI) onnavigationevent.L$2;
            mat2 = (Mat) onnavigationevent.L$1;
            putpluginconfig = (putPluginConfig) onnavigationevent.L$0;
            ResultKt.onNavigationEvent(objOnNavigationEvent);
            InterfaceC0060error<T> interfaceC0060error = putpluginconfig.asBinder;
            Interpreter interpreter = putpluginconfig.onWarmupCompleted;
            onnavigationevent.L$0 = mat;
            onnavigationevent.L$1 = null;
            onnavigationevent.L$2 = null;
            onnavigationevent.label = 2;
            objOnNavigationEvent = interfaceC0060error.onNavigationEvent(interpreter, mat2, onnavigationevent);
        } finally {
            mat.onWarmupCompleted((Object) null);
        }
    }

    public static final /* synthetic */ ByteBuffer onExtraCallbackWithResult(putPluginConfig putpluginconfig, Context context, String str) {
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
        return (ByteBuffer) onExtraCallback(forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback2, 1352628322, forceDomainCheck.IAuthTabCallback(), -1352628322, new Object[]{putpluginconfig, context, str}, iIAuthTabCallback);
    }

    private final void IAuthTabCallback(InputStream inputStream, byte[] bArr, int i, int i2) {
        Object[] objArr = {this, inputStream, bArr, Integer.valueOf(i), Integer.valueOf(i2)};
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        onExtraCallback(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), 195757426, forceDomainCheck.IAuthTabCallback(), -195757425, objArr, iIAuthTabCallback);
    }

    static void onWarmupCompleted() {
        onTransact = new char[]{27186, 27300, 27309, 27326, 27321, 27318, 27321, 27325, 27326, 27322, 27316, 27302, 27311, 27323, 27325, 27311, 27302, 27321, 27326, 27301, 27325, 27316, 27318, 27261, 27172, 27173, 27176, 27178, 27180, 27158, 27153, 27152, 27248, 27248, 27142, 27147, 27253, 27151, 27138, 27149, 27256, 27165, 27235, 27148, 27168, 27194, 27172, 27178, 27173, 27170, 27178, 27148, 27252, 27183, 27175, 27168, 27194, 27172, 27178, 27173, 27170, 27178, 27148, 27148, 27175, 27175, 27148, 27145, 27172, 27149, 27143, 27197, 27197, 27173, 27181, 27146, 27364, 27288, 27281, 27291, 27291, 27382, 27329, 27362, 27290, 27284, 27389, 27168, 27310, 27305, 27265, 27289, 27319, 27315, 27315, 27317, 27319, 27313, 27471, 27289, 27288, 27313, 27470, 27318, 27313, 27471, 27319, 27289, 27280, 27463, 27471, 27318, 27319, 27471, 27462, 27471, 27468, 27467, 27471, 27465, 27258, 27169, 27171, 27177, 27175, 27173, 27173, 27177, 27147, 27251, 27163, 27138, 27258, 27144, 27171, 27168, 27199, 27193, 27139, 27239, 27141, 27173, 27172, 27178, 27175, 27171, 27174, 27168, 27168, 27172, 27194, 27139, 27147, 27169, 27171, 27177, 27175, 27173, 27173, 27177, 27147, 27251, 27163, 27136};
        asInterface = 478308890;
    }
}
