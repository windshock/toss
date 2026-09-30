package im.toss.features.home.core.local.model.dst.element;

import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.local.model.dst.element.BaseListRowLocal;
import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
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
import o.DefaultGainProviderExternalSyntheticLambda0;
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
public final /* synthetic */ class ListRowDrawerLocal$$serializer implements aeu2<ListRowDrawerLocal> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    public static final ListRowDrawerLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static char onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static char[] onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 39;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 15;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 25 / 0;
        }
        return serialDescriptor;
    }

    static {
        onExtraCallback();
        ListRowDrawerLocal$$serializer listRowDrawerLocal$$serializer = new ListRowDrawerLocal$$serializer();
        INSTANCE = listRowDrawerLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.ListRowDrawerLocal", listRowDrawerLocal$$serializer, 14);
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
        a(new char[]{1, 7, 3, '\b', 13926}, (byte) (107 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 5 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        Object[] objArr2 = new Object[1];
        a(new char[]{0, 5, 13902}, (byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 106), 4 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("items", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 17;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private ListRowDrawerLocal$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnNavigationEvent = ListRowDrawerLocal.onNavigationEvent();
        setVideoListener setvideolistener = setVideoListener.onWarmupCompleted;
        setAppxVersionInWorker setappxversioninworker = setAppxVersionInWorker.onExtraCallback;
        KSerializer<?>[] kSerializerArr = {BaseListRowLocal$Content$$serializer.INSTANCE, sp.IAuthTabCallback(updateInterrupt.onNavigationEvent), sp.IAuthTabCallback(setSuccessCallback.onExtraCallback), sp.IAuthTabCallback(setSuccessParams.IAuthTabCallback), getBgColor.IAuthTabCallback, sp.IAuthTabCallback(setvideolistener), sp.IAuthTabCallback(setvideolistener), sp.IAuthTabCallback((KSerializer) lazyArrOnNavigationEvent[7].getValue()), sp.IAuthTabCallback((KSerializer) lazyArrOnNavigationEvent[8].getValue()), sp.IAuthTabCallback(setappxversioninworker), sp.IAuthTabCallback(setappxversioninworker), dj3.onWarmupCompleted, getWriggleLayout.onNavigationEvent, lazyArrOnNavigationEvent[13].getValue()};
        int i4 = IAuthTabCallbackDefault + 89;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ListRowDrawerLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        BaseListRowLocal.RollingNumberContent rollingNumberContent;
        BaseListRowLocal.Content content;
        HandlerLocal handlerLocal;
        Double d;
        int i;
        Double d2;
        BaseListRowLocal.onWarmupCompleted onwarmupcompleted;
        HandlerLocal handlerLocal2;
        BaseListRowLocal.onWarmupCompleted onwarmupcompleted2;
        BaseListRowLocal.Left left;
        boolean z;
        float f;
        List list;
        String str;
        BaseListRowLocal.Right right;
        int i2 = 2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnNavigationEvent = ListRowDrawerLocal.onNavigationEvent();
        int i4 = 9;
        int i5 = 5;
        int i6 = 8;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i7 = IAuthTabCallbackDefault + 97;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            BaseListRowLocal.Content content2 = (BaseListRowLocal.Content) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, BaseListRowLocal$Content$$serializer.INSTANCE, (Object) null);
            BaseListRowLocal.RollingNumberContent rollingNumberContent2 = (BaseListRowLocal.RollingNumberContent) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, updateInterrupt.onNavigationEvent, (Object) null);
            BaseListRowLocal.Left left2 = (BaseListRowLocal.Left) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, setSuccessCallback.onExtraCallback, (Object) null);
            BaseListRowLocal.Right right2 = (BaseListRowLocal.Right) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, setSuccessParams.IAuthTabCallback, (Object) null);
            boolean zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4);
            setVideoListener setvideolistener = setVideoListener.onWarmupCompleted;
            Double d3 = (Double) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, setvideolistener, (Object) null);
            Double d4 = (Double) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, setvideolistener, (Object) null);
            BaseListRowLocal.onWarmupCompleted onwarmupcompleted3 = (BaseListRowLocal.onWarmupCompleted) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, (jp) lazyArrOnNavigationEvent[7].getValue(), (Object) null);
            BaseListRowLocal.onWarmupCompleted onwarmupcompleted4 = (BaseListRowLocal.onWarmupCompleted) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, (jp) lazyArrOnNavigationEvent[8].getValue(), (Object) null);
            setAppxVersionInWorker setappxversioninworker = setAppxVersionInWorker.onExtraCallback;
            HandlerLocal handlerLocal3 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, setappxversioninworker, (Object) null);
            HandlerLocal handlerLocal4 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 10, setappxversioninworker, (Object) null);
            float fOnWarmupCompleted = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 11);
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 12);
            f = fOnWarmupCompleted;
            left = left2;
            list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 13, (jp) lazyArrOnNavigationEvent[13].getValue(), (Object) null);
            content = content2;
            str = strAsInterface;
            right = right2;
            handlerLocal = handlerLocal3;
            d = d4;
            z = zOnExtraCallbackWithResult;
            d2 = d3;
            onwarmupcompleted = onwarmupcompleted3;
            onwarmupcompleted2 = onwarmupcompleted4;
            handlerLocal2 = handlerLocal4;
            rollingNumberContent = rollingNumberContent2;
            i = 16383;
        } else {
            List list2 = null;
            int i9 = 13;
            boolean z2 = true;
            boolean zOnExtraCallbackWithResult2 = false;
            float fOnWarmupCompleted2 = 0.0f;
            HandlerLocal handlerLocal5 = null;
            BaseListRowLocal.onWarmupCompleted onwarmupcompleted5 = null;
            HandlerLocal handlerLocal6 = null;
            BaseListRowLocal.onWarmupCompleted onwarmupcompleted6 = null;
            String strAsInterface2 = null;
            Double d5 = null;
            BaseListRowLocal.Right right3 = null;
            BaseListRowLocal.Left left3 = null;
            BaseListRowLocal.RollingNumberContent rollingNumberContent3 = null;
            BaseListRowLocal.Content content3 = null;
            int i10 = 0;
            Double d6 = null;
            while (z2) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z2 = false;
                        i2 = 2;
                        i4 = 9;
                        i5 = 5;
                        i6 = 8;
                        lazyArrOnNavigationEvent = lazyArrOnNavigationEvent;
                    case 0:
                        content3 = (BaseListRowLocal.Content) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, BaseListRowLocal$Content$$serializer.INSTANCE, content3);
                        i10 |= 1;
                        lazyArrOnNavigationEvent = lazyArrOnNavigationEvent;
                        i2 = 2;
                        i9 = 13;
                        i4 = 9;
                        i5 = 5;
                        i6 = 8;
                    case 1:
                        rollingNumberContent3 = (BaseListRowLocal.RollingNumberContent) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, updateInterrupt.onNavigationEvent, rollingNumberContent3);
                        i10 |= 2;
                        lazyArrOnNavigationEvent = lazyArrOnNavigationEvent;
                        i2 = 2;
                        i9 = 13;
                        i4 = 9;
                        i5 = 5;
                        i6 = 8;
                    case 2:
                        left3 = (BaseListRowLocal.Left) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i2, setSuccessCallback.onExtraCallback, left3);
                        i10 |= 4;
                        i9 = 13;
                        i4 = 9;
                        i5 = 5;
                        i6 = 8;
                    case 3:
                        right3 = (BaseListRowLocal.Right) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, setSuccessParams.IAuthTabCallback, right3);
                        i10 |= 8;
                        d5 = d5;
                        i9 = 13;
                        i4 = 9;
                        i5 = 5;
                        i6 = 8;
                    case 4:
                        zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4);
                        i10 |= 16;
                        i9 = 13;
                        i4 = 9;
                    case 5:
                        d5 = (Double) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, setVideoListener.onWarmupCompleted, d5);
                        i10 |= 32;
                        i9 = 13;
                        i4 = 9;
                    case 6:
                        d6 = (Double) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, setVideoListener.onWarmupCompleted, d6);
                        i10 |= 64;
                        int i11 = IAuthTabCallbackDefault + 99;
                        onExtraCallback = i11 % 128;
                        int i12 = i11 % i2;
                        i9 = 13;
                        i4 = 9;
                    case 7:
                        onwarmupcompleted5 = (BaseListRowLocal.onWarmupCompleted) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, (jp) lazyArrOnNavigationEvent[7].getValue(), onwarmupcompleted5);
                        i10 |= 128;
                        i9 = 13;
                    case 8:
                        onwarmupcompleted6 = (BaseListRowLocal.onWarmupCompleted) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i6, (jp) lazyArrOnNavigationEvent[i6].getValue(), onwarmupcompleted6);
                        i10 |= 256;
                        i9 = 13;
                    case 9:
                        handlerLocal5 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i4, setAppxVersionInWorker.onExtraCallback, handlerLocal5);
                        i10 |= 512;
                        i9 = 13;
                    case 10:
                        handlerLocal6 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 10, setAppxVersionInWorker.onExtraCallback, handlerLocal6);
                        i10 |= 1024;
                        i9 = 13;
                    case 11:
                        fOnWarmupCompleted2 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 11);
                        i10 |= 2048;
                        i9 = 13;
                    case 12:
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 12);
                        i10 |= 4096;
                        int i13 = IAuthTabCallbackDefault + 5;
                        onExtraCallback = i13 % 128;
                        int i14 = i13 % i2;
                        i9 = 13;
                    case 13:
                        list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, i9, (jp) lazyArrOnNavigationEvent[i9].getValue(), list2);
                        i10 |= 8192;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            BaseListRowLocal.Right right4 = right3;
            BaseListRowLocal.Left left4 = left3;
            rollingNumberContent = rollingNumberContent3;
            content = content3;
            handlerLocal = handlerLocal5;
            d = d6;
            i = i10;
            d2 = d5;
            onwarmupcompleted = onwarmupcompleted5;
            handlerLocal2 = handlerLocal6;
            onwarmupcompleted2 = onwarmupcompleted6;
            left = left4;
            z = zOnExtraCallbackWithResult2;
            f = fOnWarmupCompleted2;
            list = list2;
            str = strAsInterface2;
            right = right4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ListRowDrawerLocal(i, content, rollingNumberContent, left, right, z, d2, d, onwarmupcompleted, onwarmupcompleted2, handlerLocal, handlerLocal2, f, str, list, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m398deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        ListRowDrawerLocal listRowDrawerLocalDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallbackDefault + 81;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return listRowDrawerLocalDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ListRowDrawerLocal listRowDrawerLocal) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(listRowDrawerLocal, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            ListRowDrawerLocal.onNavigationEvent(listRowDrawerLocal, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            int i3 = 80 / 0;
        } else {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(listRowDrawerLocal, "");
            SerialDescriptor serialDescriptor2 = descriptor;
            vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
            ListRowDrawerLocal.onNavigationEvent(listRowDrawerLocal, vylVarOnExtraCallback2, serialDescriptor2);
            vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        }
        int i4 = IAuthTabCallbackDefault + 63;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 3;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ListRowDrawerLocal) obj);
        int i4 = onExtraCallback + 1;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallbackDefault + 65;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onWarmupCompleted;
        Object obj2 = null;
        float f = 0.0f;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Gravity.getAbsoluteGravity(0, 0), View.resolveSize(0, 0) + 26, 23139 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i4++;
                    int i5 = $10 + 53;
                    $11 = i5 % 128;
                    int i6 = i5 % 2;
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
        Object[] objArr3 = {Integer.valueOf(onExtraCallbackWithResult)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", ""), 26 - TextUtils.getTrimmedLength(""), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
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
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1)) + 24824), 74 - View.MeasureSpec.getSize(0), TextUtils.indexOf("", "", 0) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        int i7 = $10 + 61;
                        $11 = i7 % 128;
                        int i8 = i7 % 2;
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), View.combineMeasuredStates(0, 0) + 30, 19488 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        int i9 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i9];
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            int i10 = $10 + 85;
                            $11 = i10 % 128;
                            int i11 = i10 % 2;
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
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
                f = 0.0f;
            }
        }
        for (int i16 = 0; i16 < i; i16++) {
            cArr4[i16] = (char) (cArr4[i16] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    static void onExtraCallback() {
        onWarmupCompleted = new char[]{51243, 64970, 64984, 64982, 64991, 64963, 64987, 64978, 51240};
        onExtraCallbackWithResult = (char) 51242;
    }
}
