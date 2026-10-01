package im.toss.features.home.core.remote.request;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.remote.request.HomeOverviewReq;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.aeu2;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeOverviewReq$TossstreamAdvertiseRequest$$serializer implements aeu2<HomeOverviewReq.TossstreamAdvertiseRequest> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] IAuthTabCallback = null;
    public static final HomeOverviewReq$TossstreamAdvertiseRequest$$serializer INSTANCE;
    private static int asBinder = 1;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static char onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 29;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 109;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 66 / 0;
        }
        return serialDescriptor;
    }

    static {
        IAuthTabCallback();
        HomeOverviewReq$TossstreamAdvertiseRequest$$serializer homeOverviewReq$TossstreamAdvertiseRequest$$serializer = new HomeOverviewReq$TossstreamAdvertiseRequest$$serializer();
        INSTANCE = homeOverviewReq$TossstreamAdvertiseRequest$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.request.HomeOverviewReq.TossstreamAdvertiseRequest", homeOverviewReq$TossstreamAdvertiseRequest$$serializer, 2);
        Object[] objArr = new Object[1];
        a(new char[]{0, 1, 13875}, (byte) (73 - Color.alpha(0)), (Process.myPid() >> 22) + 3, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("device", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 77;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private HomeOverviewReq$TossstreamAdvertiseRequest$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(HomeOverviewReq$TossstreamAdvertiseRequest$App$$serializer.INSTANCE), HomeOverviewReq$TossstreamAdvertiseRequest$Device$$serializer.INSTANCE};
        int i4 = asBinder + 81;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final HomeOverviewReq.TossstreamAdvertiseRequest deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        HomeOverviewReq.TossstreamAdvertiseRequest.App app;
        HomeOverviewReq.TossstreamAdvertiseRequest.Device device;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            i = 0;
            app = null;
            device = null;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    int i3 = onExtraCallbackWithResult + 125;
                    asBinder = i3 % 128;
                    int i4 = i3 % 2;
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i5 = onExtraCallbackWithResult;
                    int i6 = i5 + 109;
                    asBinder = i6 % 128;
                    int i7 = i6 % 2;
                    if (iOnNavigationEvent != 1) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    int i8 = i5 + 61;
                    asBinder = i8 % 128;
                    int i9 = i8 % 2;
                    HomeOverviewReq$TossstreamAdvertiseRequest$Device$$serializer homeOverviewReq$TossstreamAdvertiseRequest$Device$$serializer = HomeOverviewReq$TossstreamAdvertiseRequest$Device$$serializer.INSTANCE;
                    if (i9 == 0) {
                        device = (HomeOverviewReq.TossstreamAdvertiseRequest.Device) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, homeOverviewReq$TossstreamAdvertiseRequest$Device$$serializer, device);
                        i |= 5;
                    } else {
                        device = (HomeOverviewReq.TossstreamAdvertiseRequest.Device) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, homeOverviewReq$TossstreamAdvertiseRequest$Device$$serializer, device);
                        i |= 2;
                    }
                } else {
                    app = (HomeOverviewReq.TossstreamAdvertiseRequest.App) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, HomeOverviewReq$TossstreamAdvertiseRequest$App$$serializer.INSTANCE, app);
                    i |= 1;
                }
            }
        } else {
            int i10 = onExtraCallbackWithResult + 61;
            asBinder = i10 % 128;
            int i11 = i10 % 2;
            HomeOverviewReq$TossstreamAdvertiseRequest$App$$serializer homeOverviewReq$TossstreamAdvertiseRequest$App$$serializer = HomeOverviewReq$TossstreamAdvertiseRequest$App$$serializer.INSTANCE;
            if (i11 == 0) {
                app = (HomeOverviewReq.TossstreamAdvertiseRequest.App) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, homeOverviewReq$TossstreamAdvertiseRequest$App$$serializer, (Object) null);
                device = (HomeOverviewReq.TossstreamAdvertiseRequest.Device) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, HomeOverviewReq$TossstreamAdvertiseRequest$Device$$serializer.INSTANCE, (Object) null);
                i = 5;
            } else {
                app = (HomeOverviewReq.TossstreamAdvertiseRequest.App) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, homeOverviewReq$TossstreamAdvertiseRequest$App$$serializer, (Object) null);
                device = (HomeOverviewReq.TossstreamAdvertiseRequest.Device) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, HomeOverviewReq$TossstreamAdvertiseRequest$Device$$serializer.INSTANCE, (Object) null);
                i = 3;
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new HomeOverviewReq.TossstreamAdvertiseRequest(i, app, device, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m608deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = asBinder + 47;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        HomeOverviewReq.TossstreamAdvertiseRequest tossstreamAdvertiseRequestDeserialize = deserialize(decoder);
        if (i3 != 0) {
            int i4 = 66 / 0;
        }
        return tossstreamAdvertiseRequestDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HomeOverviewReq.TossstreamAdvertiseRequest tossstreamAdvertiseRequest) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(tossstreamAdvertiseRequest, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            HomeOverviewReq.TossstreamAdvertiseRequest.IAuthTabCallback(tossstreamAdvertiseRequest, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(tossstreamAdvertiseRequest, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        HomeOverviewReq.TossstreamAdvertiseRequest.IAuthTabCallback(tossstreamAdvertiseRequest, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onExtraCallbackWithResult + 29;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 95;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HomeOverviewReq.TossstreamAdvertiseRequest) obj);
        if (i3 != 0) {
            int i4 = 48 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = asBinder + 115;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = asBinder + 5;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = IAuthTabCallback;
        long j = 0;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)) + 27, ExpandableListView.getPackedPositionType(j) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i4++;
                    int i5 = $10 + 105;
                    $11 = i5 % 128;
                    int i6 = i5 % 2;
                    j = 0;
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
        try {
            Object[] objArr3 = {Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0), (-16777190) - Color.rgb(0, 0, 0), Color.alpha(0) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
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
                int i7 = $10 + 109;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 1;
                } else {
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                }
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
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 74, (ViewConfiguration.getFadingEdgeLength() >> 16) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getCapsMode("", 0, 0), ExpandableListView.getPackedPositionType(0L) + 30, Color.rgb(0, 0, 0) + 16796704, 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i8 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i8];
                            int i9 = $10 + 87;
                            $11 = i9 % 128;
                            int i10 = i9 % 2;
                        } else {
                            obj = null;
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i11 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i11];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i12];
                            } else {
                                int i13 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i13];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i14];
                            }
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    obj2 = obj;
                }
            }
            int i15 = 0;
            while (i15 < i) {
                int i16 = $11;
                int i17 = i16 + 13;
                $10 = i17 % 128;
                int i18 = i17 % 2;
                cArr4[i15] = (char) (cArr4[i15] ^ 13722);
                i15++;
                int i19 = i16 + 115;
                $10 = i19 % 128;
                if (i19 % 2 != 0) {
                    int i20 = 4 % 5;
                }
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static void IAuthTabCallback() {
        IAuthTabCallback = new char[]{64963, 64978, 64962, 64965};
        onNavigationEvent = (char) 51243;
    }
}
