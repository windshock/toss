package im.toss.features.home.core.remote.model.consumption.transaction;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.features.home.core.remote.model.consumption.transaction.ConsumptionTransactionDetailResponse;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;
import o.aeu2;
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ConsumptionTransactionDetailResponse$TitleContent$$serializer implements aeu2<ConsumptionTransactionDetailResponse.TitleContent> {
    public static final ConsumptionTransactionDetailResponse$TitleContent$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback;
    private static long onExtraCallbackWithResult;
    private static char[] onNavigationEvent;
    private static final byte[] $$a = {84, -122, 19, 43};
    private static final int $$b = 214;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onTransact = 1;
    private static int onWarmupCompleted = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, byte b2, int i) {
        int i2;
        int i3 = 97 - (i * 4);
        int i4 = b + 4;
        byte[] bArr = $$a;
        int i5 = b2 * 2;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        if (bArr == null) {
            int i7 = i4;
            int i8 = i6;
            int i9 = 0;
            int i10 = (-i4) + i8;
            i2 = i9;
            int i11 = i7;
            i3 = i10;
            i4 = i11;
            bArr2[i2] = (byte) i3;
            int i12 = i4 + 1;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            int i13 = i3;
            i7 = i12;
            i4 = bArr[i12];
            i9 = i2 + 1;
            i8 = i13;
            int i102 = (-i4) + i8;
            i2 = i9;
            int i112 = i7;
            i3 = i102;
            i4 = i112;
            bArr2[i2] = (byte) i3;
            int i122 = i4 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            int i1222 = i4 + 1;
            if (i2 == i6) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onTransact + 95;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 31;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        onExtraCallback = 1;
        IAuthTabCallback();
        ConsumptionTransactionDetailResponse$TitleContent$$serializer consumptionTransactionDetailResponse$TitleContent$$serializer = new ConsumptionTransactionDetailResponse$TitleContent$$serializer();
        INSTANCE = consumptionTransactionDetailResponse$TitleContent$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.consumption.transaction.ConsumptionTransactionDetailResponse.TitleContent", consumptionTransactionDetailResponse$TitleContent$$serializer, 3);
        Object[] objArr = new Object[1];
        a(ViewConfiguration.getWindowTouchSlop() >> 8, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 5, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("titleAlt", false);
        setanimationsloop.onWarmupCompleted("descriptions", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 77;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private ConsumptionTransactionDetailResponse$TitleContent$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onTransact + 23;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnExtraCallback = ConsumptionTransactionDetailResponse.TitleContent.onExtraCallback();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback((KSerializer) lazyArrOnExtraCallback[2].getValue())};
        int i4 = onTransact + 105;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005e A[PHI: r1 r2 r15
      0x005e: PHI (r1v8 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x003b, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x005e: PHI (r2v10 kotlin.Lazy[]) = (r2v2 kotlin.Lazy[]), (r2v12 kotlin.Lazy[]) binds: [B:8:0x003b, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x005e: PHI (r15v5 o.yw) = (r15v1 o.yw), (r15v7 o.yw) binds: [B:8:0x003b, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d A[PHI: r1 r2 r15
      0x003d: PHI (r1v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x003b, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x003d: PHI (r2v3 kotlin.Lazy[]) = (r2v2 kotlin.Lazy[]), (r2v12 kotlin.Lazy[]) binds: [B:8:0x003b, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x003d: PHI (r15v2 o.yw) = (r15v1 o.yw), (r15v7 o.yw) binds: [B:8:0x003b, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ConsumptionTransactionDetailResponse.TitleContent deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        Lazy[] lazyArrOnExtraCallback;
        String str;
        int i;
        String str2;
        List list;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 51;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrOnExtraCallback = ConsumptionTransactionDetailResponse.TitleContent.onExtraCallback();
            int i4 = 45 / 0;
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
                String str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
                str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
                List list2 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrOnExtraCallback[2].getValue(), (Object) null);
                i = 7;
                str2 = str3;
                list = list2;
            } else {
                boolean z = true;
                int i5 = 0;
                List list3 = null;
                String str4 = null;
                str2 = null;
                while (z) {
                    int i6 = onTransact + 31;
                    IAuthTabCallback = i6 % 128;
                    if (i6 % 2 != 0) {
                        ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                        throw null;
                    }
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent != -1) {
                        int i7 = IAuthTabCallback + 23;
                        int i8 = i7 % 128;
                        onTransact = i8;
                        int i9 = i7 % 2;
                        if (iOnNavigationEvent == 0) {
                            str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str2);
                            i5 |= 1;
                        } else if (iOnNavigationEvent != 1) {
                            int i10 = i8 + 19;
                            IAuthTabCallback = i10 % 128;
                            if (i10 % 2 != 0) {
                                if (iOnNavigationEvent != 4) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                list3 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrOnExtraCallback[2].getValue(), list3);
                                i5 |= 4;
                            } else {
                                if (iOnNavigationEvent != 2) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                list3 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrOnExtraCallback[2].getValue(), list3);
                                i5 |= 4;
                            }
                        } else {
                            str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str4);
                            i5 |= 2;
                        }
                    } else {
                        z = false;
                    }
                }
                list = list3;
                i = i5;
                str = str4;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrOnExtraCallback = ConsumptionTransactionDetailResponse.TitleContent.onExtraCallback();
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ConsumptionTransactionDetailResponse.TitleContent(i, str2, str, list, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m589deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ConsumptionTransactionDetailResponse.TitleContent titleContent) {
        int i = 2 % 2;
        int i2 = onTransact + 39;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(titleContent, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        ConsumptionTransactionDetailResponse.TitleContent.onWarmupCompleted(titleContent, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 21;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 29;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ConsumptionTransactionDetailResponse.TitleContent) obj);
        int i4 = IAuthTabCallback + 73;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 41;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        char c2;
        Throwable cause;
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (true) {
            c2 = '0';
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                break;
            }
            int i4 = $11 + 17;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(onNavigationEvent[i >>> i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTouchSlop() >> 8) + 59697), 17 - (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 10972, 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(onExtraCallbackWithResult), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 46135), 30 - TextUtils.lastIndexOf("", '0', 0), 20220 - (ViewConfiguration.getPressedStateDuration() >> 16), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        byte b = (byte) (-1);
                        byte b2 = (byte) (b + 1);
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 49122), (ViewConfiguration.getWindowTouchSlop() >> 8) + 44, View.MeasureSpec.makeMeasureSpec(0, 0) + 1494, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                    }
                }
            } else {
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                Object[] objArr5 = {Integer.valueOf(onNavigationEvent[i + i6])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((Process.getThreadPriority(0) + 20) >> 6) + 59697), (ViewConfiguration.getPressedStateDuration() >> 16) + 17, 10973 - Gravity.getAbsoluteGravity(0, 0), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(onExtraCallbackWithResult), Integer.valueOf(c)};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46133 - TextUtils.indexOf((CharSequence) "", '0', 0)), View.resolveSize(0, 0) + 31, TextUtils.indexOf("", "", 0) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback6 == null) {
                    byte b3 = (byte) (-1);
                    byte b4 = (byte) (b3 + 1);
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), TextUtils.lastIndexOf("", '0', 0) + 45, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1494, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i7 = $10 + 13;
        $11 = i7 % 128;
        int i8 = i7 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback7 == null) {
                byte b5 = (byte) (-1);
                byte b6 = (byte) (b5 + 1);
                objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 44 - Color.alpha(0), 1493 - TextUtils.lastIndexOf("", c2, 0, 0), -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback7).invoke(null, objArr8);
            int i9 = $10 + 17;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            c2 = '0';
        }
        objArr[0] = new String(cArr);
    }

    static void IAuthTabCallback() {
        onNavigationEvent = new char[]{60832, 4566, 5494, 6393, 7197};
        onExtraCallbackWithResult = 3431068750074941887L;
    }
}
