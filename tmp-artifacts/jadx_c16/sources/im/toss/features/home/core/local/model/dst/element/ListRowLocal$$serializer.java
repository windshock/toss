package im.toss.features.home.core.local.model.dst.element;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.features.home.core.local.model.dst.element.BaseListRowLocal;
import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.aeu2;
import o.dj3;
import o.getBgColor;
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.setAppxVersionInWorker;
import o.setSuccessCallback;
import o.setSuccessParams;
import o.setVideoListener;
import o.sp;
import o.updateInterrupt;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ListRowLocal$$serializer implements aeu2<ListRowLocal> {
    private static int IAuthTabCallback;
    public static final ListRowLocal$$serializer INSTANCE;
    private static int asBinder;
    private static final SerialDescriptor descriptor;
    private static short[] onExtraCallback;
    private static byte[] onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {48, -22, 122, 126};
    private static final int $$b = 71;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private static int onTransact = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, short s2) {
        int i;
        int i2 = s * 2;
        int i3 = (s2 * 4) + 115;
        byte[] bArr = $$a;
        int i4 = (b * 2) + 4;
        byte[] bArr2 = new byte[i2 + 1];
        if (bArr == null) {
            int i5 = i2;
            int i6 = 0;
            i3 = (-i3) + i5;
            i4++;
            i = i6;
            bArr2[i] = (byte) i3;
            if (i == i2) {
                return new String(bArr2, 0);
            }
            int i7 = i + 1;
            i5 = i3;
            i3 = bArr[i4];
            i6 = i7;
            i3 = (-i3) + i5;
            i4++;
            i = i6;
            bArr2[i] = (byte) i3;
            if (i == i2) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i3;
            if (i == i2) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 63;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 61;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return serialDescriptor;
    }

    static {
        asBinder = 0;
        IAuthTabCallback();
        ListRowLocal$$serializer listRowLocal$$serializer = new ListRowLocal$$serializer();
        INSTANCE = listRowLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.ListRowLocal", listRowLocal$$serializer, 13);
        setanimationsloop.onWarmupCompleted("referenceId", false);
        setanimationsloop.onWarmupCompleted("content", false);
        setanimationsloop.onWarmupCompleted("rollingNumberContent", false);
        setanimationsloop.onWarmupCompleted("left", false);
        setanimationsloop.onWarmupCompleted("right", false);
        setanimationsloop.onWarmupCompleted("arrow", false);
        setanimationsloop.onWarmupCompleted("paddingTop", false);
        setanimationsloop.onWarmupCompleted("paddingBottom", false);
        setanimationsloop.onWarmupCompleted("leftAlignment", false);
        setanimationsloop.onWarmupCompleted("rightAlignment", false);
        setanimationsloop.onWarmupCompleted("handler", false);
        setanimationsloop.onWarmupCompleted("longPressHandler", false);
        Object[] objArr = new Object[1];
        a((short) ((Process.myPid() >> 22) + 94), (byte) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 83), 1081980495 - TextUtils.getOffsetAfter("", 0), (-1429769006) + (Process.myTid() >> 22), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 24, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        descriptor = setanimationsloop;
        int i = onTransact + 69;
        asBinder = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private ListRowLocal$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 29;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnWarmupCompleted = ListRowLocal.onWarmupCompleted();
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(updateInterrupt.onNavigationEvent);
        KSerializer<?> kSerializerIAuthTabCallback3 = sp.IAuthTabCallback(setSuccessCallback.onExtraCallback);
        KSerializer<?> kSerializerIAuthTabCallback4 = sp.IAuthTabCallback(setSuccessParams.IAuthTabCallback);
        setVideoListener setvideolistener = setVideoListener.onWarmupCompleted;
        KSerializer<?> kSerializerIAuthTabCallback5 = sp.IAuthTabCallback(setvideolistener);
        KSerializer<?> kSerializerIAuthTabCallback6 = sp.IAuthTabCallback(setvideolistener);
        KSerializer<?> kSerializerIAuthTabCallback7 = sp.IAuthTabCallback((KSerializer) lazyArrOnWarmupCompleted[8].getValue());
        KSerializer<?> kSerializerIAuthTabCallback8 = sp.IAuthTabCallback((KSerializer) lazyArrOnWarmupCompleted[9].getValue());
        setAppxVersionInWorker setappxversioninworker = setAppxVersionInWorker.onExtraCallback;
        KSerializer<?>[] kSerializerArr = {kSerializerIAuthTabCallback, BaseListRowLocal$Content$$serializer.INSTANCE, kSerializerIAuthTabCallback2, kSerializerIAuthTabCallback3, kSerializerIAuthTabCallback4, getBgColor.IAuthTabCallback, kSerializerIAuthTabCallback5, kSerializerIAuthTabCallback6, kSerializerIAuthTabCallback7, kSerializerIAuthTabCallback8, sp.IAuthTabCallback(setappxversioninworker), sp.IAuthTabCallback(setappxversioninworker), sp.IAuthTabCallback(dj3.onWarmupCompleted)};
        int i4 = IAuthTabCallbackStub + 87;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 64 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ListRowLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        Double d;
        BaseListRowLocal.RollingNumberContent rollingNumberContent;
        Double d2;
        BaseListRowLocal.Left left;
        Float f;
        HandlerLocal handlerLocal;
        BaseListRowLocal.onWarmupCompleted onwarmupcompleted;
        BaseListRowLocal.onWarmupCompleted onwarmupcompleted2;
        int i;
        BaseListRowLocal.Right right;
        boolean z;
        BaseListRowLocal.Content content;
        HandlerLocal handlerLocal2;
        Lazy[] lazyArr;
        BaseListRowLocal.Content content2;
        int i2 = 2 % 2;
        int i3 = asInterface + 93;
        IAuthTabCallbackStub = i3 % 128;
        Double d3 = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(descriptor);
            ListRowLocal.onWarmupCompleted();
            ywVarOnWarmupCompleted.extraCallbackWithResult();
            d3.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted2 = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnWarmupCompleted = ListRowLocal.onWarmupCompleted();
        if (ywVarOnWarmupCompleted2.extraCallbackWithResult()) {
            int i4 = IAuthTabCallbackStub + 45;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            String str2 = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, (Object) null);
            BaseListRowLocal.Content content3 = (BaseListRowLocal.Content) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 1, BaseListRowLocal$Content$$serializer.INSTANCE, (Object) null);
            BaseListRowLocal.RollingNumberContent rollingNumberContent2 = (BaseListRowLocal.RollingNumberContent) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 2, updateInterrupt.onNavigationEvent, (Object) null);
            BaseListRowLocal.Left left2 = (BaseListRowLocal.Left) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 3, setSuccessCallback.onExtraCallback, (Object) null);
            BaseListRowLocal.Right right2 = (BaseListRowLocal.Right) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 4, setSuccessParams.IAuthTabCallback, (Object) null);
            boolean zOnExtraCallbackWithResult = ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 5);
            setVideoListener setvideolistener = setVideoListener.onWarmupCompleted;
            Double d4 = (Double) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 6, setvideolistener, (Object) null);
            Double d5 = (Double) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 7, setvideolistener, (Object) null);
            BaseListRowLocal.onWarmupCompleted onwarmupcompleted3 = (BaseListRowLocal.onWarmupCompleted) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 8, (jp) lazyArrOnWarmupCompleted[8].getValue(), (Object) null);
            BaseListRowLocal.onWarmupCompleted onwarmupcompleted4 = (BaseListRowLocal.onWarmupCompleted) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 9, (jp) lazyArrOnWarmupCompleted[9].getValue(), (Object) null);
            setAppxVersionInWorker setappxversioninworker = setAppxVersionInWorker.onExtraCallback;
            HandlerLocal handlerLocal3 = (HandlerLocal) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 10, setappxversioninworker, (Object) null);
            HandlerLocal handlerLocal4 = (HandlerLocal) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 11, setappxversioninworker, (Object) null);
            rollingNumberContent = rollingNumberContent2;
            onwarmupcompleted2 = onwarmupcompleted4;
            f = (Float) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 12, dj3.onWarmupCompleted, (Object) null);
            str = str2;
            content = content3;
            right = right2;
            d2 = d5;
            d = d4;
            z = zOnExtraCallbackWithResult;
            onwarmupcompleted = onwarmupcompleted3;
            handlerLocal2 = handlerLocal4;
            handlerLocal = handlerLocal3;
            left = left2;
            i = 8191;
        } else {
            int i6 = 12;
            BaseListRowLocal.Right right3 = null;
            BaseListRowLocal.Left left3 = null;
            Float f2 = null;
            HandlerLocal handlerLocal5 = null;
            HandlerLocal handlerLocal6 = null;
            BaseListRowLocal.onWarmupCompleted onwarmupcompleted5 = null;
            BaseListRowLocal.onWarmupCompleted onwarmupcompleted6 = null;
            BaseListRowLocal.Content content4 = null;
            String str3 = null;
            int i7 = 0;
            boolean zOnExtraCallbackWithResult2 = false;
            boolean z2 = true;
            BaseListRowLocal.RollingNumberContent rollingNumberContent3 = null;
            Double d6 = null;
            while (z2) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        content2 = content4;
                        z2 = false;
                        right3 = right3;
                        content4 = content2;
                        i6 = 12;
                    case 0:
                        content2 = content4;
                        str3 = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str3);
                        i7 |= 1;
                        right3 = right3;
                        lazyArrOnWarmupCompleted = lazyArrOnWarmupCompleted;
                        content4 = content2;
                        i6 = 12;
                    case 1:
                        Lazy[] lazyArr2 = lazyArrOnWarmupCompleted;
                        i7 |= 2;
                        right3 = right3;
                        i6 = 12;
                        content4 = (BaseListRowLocal.Content) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 1, BaseListRowLocal$Content$$serializer.INSTANCE, content4);
                        lazyArrOnWarmupCompleted = lazyArr2;
                    case 2:
                        lazyArr = lazyArrOnWarmupCompleted;
                        rollingNumberContent3 = (BaseListRowLocal.RollingNumberContent) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 2, updateInterrupt.onNavigationEvent, rollingNumberContent3);
                        i7 |= 4;
                        lazyArrOnWarmupCompleted = lazyArr;
                        i6 = 12;
                    case 3:
                        lazyArr = lazyArrOnWarmupCompleted;
                        left3 = (BaseListRowLocal.Left) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 3, setSuccessCallback.onExtraCallback, left3);
                        i7 |= 8;
                        int i8 = IAuthTabCallbackStub + 1;
                        asInterface = i8 % 128;
                        int i9 = i8 % 2;
                        lazyArrOnWarmupCompleted = lazyArr;
                        i6 = 12;
                    case 4:
                        lazyArr = lazyArrOnWarmupCompleted;
                        right3 = (BaseListRowLocal.Right) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 4, setSuccessParams.IAuthTabCallback, right3);
                        i7 |= 16;
                        lazyArrOnWarmupCompleted = lazyArr;
                        i6 = 12;
                    case 5:
                        lazyArr = lazyArrOnWarmupCompleted;
                        zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 5);
                        i7 |= 32;
                        lazyArrOnWarmupCompleted = lazyArr;
                        i6 = 12;
                    case 6:
                        lazyArr = lazyArrOnWarmupCompleted;
                        d3 = (Double) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 6, setVideoListener.onWarmupCompleted, d3);
                        i7 |= 64;
                        lazyArrOnWarmupCompleted = lazyArr;
                        i6 = 12;
                    case 7:
                        lazyArr = lazyArrOnWarmupCompleted;
                        d6 = (Double) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 7, setVideoListener.onWarmupCompleted, d6);
                        i7 |= 128;
                        lazyArrOnWarmupCompleted = lazyArr;
                        i6 = 12;
                    case 8:
                        onwarmupcompleted5 = (BaseListRowLocal.onWarmupCompleted) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 8, (jp) lazyArrOnWarmupCompleted[8].getValue(), onwarmupcompleted5);
                        i7 |= 256;
                        i6 = 12;
                    case 9:
                        onwarmupcompleted6 = (BaseListRowLocal.onWarmupCompleted) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 9, (jp) lazyArrOnWarmupCompleted[9].getValue(), onwarmupcompleted6);
                        i7 |= 512;
                        i6 = 12;
                    case 10:
                        handlerLocal6 = (HandlerLocal) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 10, setAppxVersionInWorker.onExtraCallback, handlerLocal6);
                        i7 |= 1024;
                        int i10 = asInterface + 75;
                        IAuthTabCallbackStub = i10 % 128;
                        int i11 = i10 % 2;
                        i6 = 12;
                    case 11:
                        handlerLocal5 = (HandlerLocal) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 11, setAppxVersionInWorker.onExtraCallback, handlerLocal5);
                        i7 |= 2048;
                        i6 = 12;
                    case 12:
                        f2 = (Float) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, i6, dj3.onWarmupCompleted, f2);
                        i7 |= 4096;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            str = str3;
            d = d3;
            rollingNumberContent = rollingNumberContent3;
            d2 = d6;
            left = left3;
            f = f2;
            handlerLocal = handlerLocal6;
            onwarmupcompleted = onwarmupcompleted5;
            onwarmupcompleted2 = onwarmupcompleted6;
            i = i7;
            right = right3;
            z = zOnExtraCallbackWithResult2;
            content = content4;
            handlerLocal2 = handlerLocal5;
        }
        ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor);
        return new ListRowLocal(i, str, content, rollingNumberContent, left, right, z, d, d2, onwarmupcompleted, onwarmupcompleted2, handlerLocal, handlerLocal2, f, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m399deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 7;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ListRowLocal listRowLocalDeserialize = deserialize(decoder);
        if (i3 == 0) {
            int i4 = 79 / 0;
        }
        int i5 = IAuthTabCallbackStub + 45;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return listRowLocalDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ListRowLocal listRowLocal) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 33;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(listRowLocal, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            ListRowLocal.onWarmupCompleted(listRowLocal, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(listRowLocal, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        ListRowLocal.onWarmupCompleted(listRowLocal, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = 17 / 0;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 29;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ListRowLocal) obj);
        int i4 = asInterface + 85;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = asInterface + 33;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallbackStub + 29;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0097 A[PHI: r4
      0x0097: PHI (r4v8 byte[] A[IMMUTABLE_TYPE]) = (r4v7 byte[]), (r4v19 byte[]) binds: [B:19:0x0095, B:16:0x0090] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0213  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        byte[] bArr;
        long j;
        int i4 = 2;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            long j2 = 0;
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43425 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 42 - (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                z = true;
            } else {
                int i6 = $11 + 77;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                z = false;
            }
            if (!z) {
                j = -4629411779493505016L;
            } else {
                int i8 = $10 + 7;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    bArr = onExtraCallbackWithResult;
                    int i9 = 98 / 0;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i10 = 0;
                        while (i10 < length) {
                            int i11 = $11 + 113;
                            $10 = i11 % 128;
                            if (i11 % i4 != 0) {
                                Object[] objArr3 = {Integer.valueOf(bArr[i10])};
                                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                                if (objOnExtraCallback2 == null) {
                                    char pressedStateDuration = (char) (12843 - (ViewConfiguration.getPressedStateDuration() >> 16));
                                    int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 55;
                                    int i12 = 2168 - (ViewConfiguration.getZoomControlsTimeout() > j2 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j2 ? 0 : -1));
                                    byte b2 = (byte) 0;
                                    byte b3 = b2;
                                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(pressedStateDuration, tapTimeout, i12, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                                }
                                bArr2[i10] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            } else {
                                Object[] objArr4 = {Integer.valueOf(bArr[i10])};
                                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                                if (objOnExtraCallback3 == null) {
                                    byte b4 = (byte) 0;
                                    byte b5 = b4;
                                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12844 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 55 - View.MeasureSpec.getSize(0), 2167 - (ViewConfiguration.getPressedStateDuration() >> 16), -299036574, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                                }
                                bArr2[i10] = ((Byte) ((Method) objOnExtraCallback3).invoke(null, objArr4)).byteValue();
                                i10++;
                            }
                            i4 = 2;
                            j2 = 0;
                        }
                        bArr = bArr2;
                    }
                    if (bArr == null) {
                        int i13 = $10 + 113;
                        $11 = i13 % 128;
                        int i14 = i13 % 2;
                        byte[] bArr3 = onExtraCallbackWithResult;
                        Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(onWarmupCompleted)};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (KeyEvent.getMaxKeyCode() >> 16)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 41, 22439 - View.MeasureSpec.getSize(0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                        j = -4629411779493505016L;
                    } else {
                        j = -4629411779493505016L;
                        iIntValue = (short) (((short) (onExtraCallback[i + ((int) (onWarmupCompleted ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                    }
                } else {
                    bArr = onExtraCallbackWithResult;
                    if (bArr != null) {
                    }
                    if (bArr == null) {
                    }
                }
            }
            if (iIntValue > 0) {
                int i15 = ((i + iIntValue) - 2) + ((int) (onWarmupCompleted ^ j));
                if (z) {
                    int i16 = $11 + 37;
                    $10 = i16 % 128;
                    int i17 = i16 % 2 != 0 ? 0 : 1;
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i15 + i17;
                    Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(IAuthTabCallback), sb};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarSize() >> 8), 85 - Process.getGidForName(""), ((byte) KeyEvent.getModifierMetaStateMask()) + 9568, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr4 = onExtraCallbackWithResult;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        for (int i18 = 0; i18 < length2; i18++) {
                            bArr5[i18] = (byte) (bArr4[i18] ^ (-4629411779493505016L));
                        }
                        bArr4 = bArr5;
                    }
                    boolean z2 = bArr4 != null;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        if (z2) {
                            byte[] bArr6 = onExtraCallbackWithResult;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            short[] sArr = onExtraCallback;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                            int i19 = $11 + 125;
                            $10 = i19 % 128;
                            int i20 = i19 % 2;
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    }
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

    static void IAuthTabCallback() {
        onWarmupCompleted = 465932729;
        onNavigationEvent = -1538795490;
        IAuthTabCallback = -243313785;
        onExtraCallbackWithResult = new byte[]{-25, 68, 69, -15, -14};
    }
}
