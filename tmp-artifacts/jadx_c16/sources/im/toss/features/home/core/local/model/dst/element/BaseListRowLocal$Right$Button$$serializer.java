package im.toss.features.home.core.local.model.dst.element;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.local.model.dst.element.BaseListRowLocal;
import im.toss.features.home.core.local.model.dst.eventlog.ImpressionEventLogLocal;
import im.toss.features.home.core.local.model.dst.eventlog.ImpressionEventLogLocal$;
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
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.aeu2;
import o.getBgColor;
import o.getServiceBeans;
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.setAppxVersionInWorker;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BaseListRowLocal$Right$Button$$serializer implements aeu2<BaseListRowLocal.Right.Button> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    public static final BaseListRowLocal$Right$Button$$serializer INSTANCE;
    private static int asInterface = 0;
    private static final SerialDescriptor descriptor;
    private static char[] onExtraCallback = null;
    private static int onExtraCallbackWithResult = 0;
    private static boolean onNavigationEvent = false;
    private static int onTransact = 1;
    private static boolean onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = asInterface + 55;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 91;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onExtraCallback;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $10 + 1;
                $11 = i5 % 128;
                int i6 = i5 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 76 - TextUtils.lastIndexOf("", '0', 0), 20953 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i4++;
                    i2 = 2;
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
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarSize() >> 8), 75 - Gravity.getAbsoluteGravity(0, 0), 16037 - TextUtils.indexOf("", "", 0, 0), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        if (onWarmupCompleted) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), TextUtils.lastIndexOf("", '0') + 64, TextUtils.lastIndexOf("", '0', 0) + 12215, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!onNavigationEvent) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i7 = $11 + 101;
        $10 = i7 % 128;
        int i8 = i7 % 2;
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), View.MeasureSpec.getMode(0) + 63, (Process.myTid() >> 22) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr6);
    }

    static {
        onWarmupCompleted();
        BaseListRowLocal$Right$Button$$serializer baseListRowLocal$Right$Button$$serializer = new BaseListRowLocal$Right$Button$$serializer();
        INSTANCE = baseListRowLocal$Right$Button$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.BaseListRowLocal.Right.Button", baseListRowLocal$Right$Button$$serializer, 9);
        setanimationsloop.onWarmupCompleted("id", false);
        setanimationsloop.onWarmupCompleted("impressionEventLog", false);
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-124, -125, -127, -126, -127}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 126, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("logTitle", false);
        setanimationsloop.onWarmupCompleted("theme", false);
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-124, -125, -122, -127, -123}, 127 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("size", false);
        setanimationsloop.onWarmupCompleted("handler", false);
        setanimationsloop.onWarmupCompleted("isEnabled", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 123;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    private BaseListRowLocal$Right$Button$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 109;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnNavigationEvent = BaseListRowLocal.Right.Button.onNavigationEvent();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, sp.IAuthTabCallback(ImpressionEventLogLocal$.serializer.INSTANCE), getwrigglelayout, sp.IAuthTabCallback(getwrigglelayout), lazyArrOnNavigationEvent[4].getValue(), lazyArrOnNavigationEvent[5].getValue(), lazyArrOnNavigationEvent[6].getValue(), setAppxVersionInWorker.onExtraCallback, getBgColor.IAuthTabCallback};
        int i4 = IAuthTabCallbackStub + 123;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final BaseListRowLocal.Right.Button deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        boolean zOnExtraCallbackWithResult;
        getServiceBeans.IAuthTabCallbackStub iAuthTabCallbackStub;
        getServiceBeans.IAuthTabCallback iAuthTabCallback;
        HandlerLocal handlerLocal;
        String str;
        String str2;
        String str3;
        getServiceBeans.onWarmupCompleted onwarmupcompleted;
        ImpressionEventLogLocal impressionEventLogLocal;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnNavigationEvent = BaseListRowLocal.Right.Button.onNavigationEvent();
        int i3 = 7;
        int i4 = 8;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i5 = IAuthTabCallbackStub + 37;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            ImpressionEventLogLocal impressionEventLogLocal2 = (ImpressionEventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, ImpressionEventLogLocal$.serializer.INSTANCE, (Object) null);
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            String str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, (Object) null);
            getServiceBeans.IAuthTabCallbackStub iAuthTabCallbackStub2 = (getServiceBeans.IAuthTabCallbackStub) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, (jp) lazyArrOnNavigationEvent[4].getValue(), (Object) null);
            getServiceBeans.onWarmupCompleted onwarmupcompleted2 = (getServiceBeans.onWarmupCompleted) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, (jp) lazyArrOnNavigationEvent[5].getValue(), (Object) null);
            str2 = strAsInterface2;
            iAuthTabCallback = (getServiceBeans.IAuthTabCallback) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 6, (jp) lazyArrOnNavigationEvent[6].getValue(), (Object) null);
            str3 = strAsInterface;
            handlerLocal = (HandlerLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 7, setAppxVersionInWorker.onExtraCallback, (Object) null);
            zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8);
            i = 511;
            str = str4;
            impressionEventLogLocal = impressionEventLogLocal2;
            onwarmupcompleted = onwarmupcompleted2;
            iAuthTabCallbackStub = iAuthTabCallbackStub2;
        } else {
            boolean z = true;
            boolean zOnExtraCallbackWithResult2 = false;
            getServiceBeans.onWarmupCompleted onwarmupcompleted3 = null;
            getServiceBeans.IAuthTabCallbackStub iAuthTabCallbackStub3 = null;
            getServiceBeans.IAuthTabCallback iAuthTabCallback2 = null;
            HandlerLocal handlerLocal2 = null;
            String str5 = null;
            String strAsInterface3 = null;
            String strAsInterface4 = null;
            ImpressionEventLogLocal impressionEventLogLocal3 = null;
            int i7 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        i3 = 7;
                    case 0:
                        strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i7 |= 1;
                        i3 = 7;
                        i4 = 8;
                    case 1:
                        impressionEventLogLocal3 = (ImpressionEventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, ImpressionEventLogLocal$.serializer.INSTANCE, impressionEventLogLocal3);
                        i7 |= 2;
                        int i8 = IAuthTabCallbackStub + 21;
                        asInterface = i8 % 128;
                        if (i8 % 2 != 0) {
                            int i9 = 4 % 3;
                        }
                        i3 = 7;
                        i4 = 8;
                    case 2:
                        strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i7 |= 4;
                        i3 = 7;
                        i4 = 8;
                    case 3:
                        str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str5);
                        i7 |= 8;
                        int i10 = asInterface + 25;
                        IAuthTabCallbackStub = i10 % 128;
                        if (i10 % 2 == 0) {
                            int i11 = 5 / 3;
                        }
                        i3 = 7;
                        i4 = 8;
                    case 4:
                        iAuthTabCallbackStub3 = (getServiceBeans.IAuthTabCallbackStub) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, (jp) lazyArrOnNavigationEvent[4].getValue(), iAuthTabCallbackStub3);
                        i7 |= 16;
                        i3 = 7;
                    case 5:
                        onwarmupcompleted3 = (getServiceBeans.onWarmupCompleted) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, (jp) lazyArrOnNavigationEvent[5].getValue(), onwarmupcompleted3);
                        i7 |= 32;
                    case 6:
                        iAuthTabCallback2 = (getServiceBeans.IAuthTabCallback) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 6, (jp) lazyArrOnNavigationEvent[6].getValue(), iAuthTabCallback2);
                        i7 |= 64;
                    case 7:
                        handlerLocal2 = (HandlerLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, i3, setAppxVersionInWorker.onExtraCallback, handlerLocal2);
                        i7 |= 128;
                    case 8:
                        zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i4);
                        i7 |= 256;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            zOnExtraCallbackWithResult = zOnExtraCallbackWithResult2;
            iAuthTabCallbackStub = iAuthTabCallbackStub3;
            iAuthTabCallback = iAuthTabCallback2;
            handlerLocal = handlerLocal2;
            str = str5;
            str2 = strAsInterface3;
            str3 = strAsInterface4;
            onwarmupcompleted = onwarmupcompleted3;
            impressionEventLogLocal = impressionEventLogLocal3;
            i = i7;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new BaseListRowLocal.Right.Button(i, str3, impressionEventLogLocal, str2, str, iAuthTabCallbackStub, onwarmupcompleted, iAuthTabCallback, handlerLocal, zOnExtraCallbackWithResult, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m297deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 73;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        BaseListRowLocal.Right.Button buttonDeserialize = deserialize(decoder);
        int i4 = asInterface + 89;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return buttonDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull BaseListRowLocal.Right.Button button) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 81;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(button, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        BaseListRowLocal.Right.Button.onExtraCallbackWithResult(button, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallbackStub + 41;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 37;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (BaseListRowLocal.Right.Button) obj);
        int i4 = asInterface + 19;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 69 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = asInterface + 57;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallbackStub + 27;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    static void onWarmupCompleted() {
        onExtraCallback = new char[]{32457, 32476, 32465, 32472, 32458, 32460};
        onExtraCallbackWithResult = -1184334011;
        onNavigationEvent = true;
        onWarmupCompleted = true;
    }
}
