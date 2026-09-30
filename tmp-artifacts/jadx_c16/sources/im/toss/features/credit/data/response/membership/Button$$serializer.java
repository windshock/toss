package im.toss.features.credit.data.response.membership;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.aeu2;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class Button$$serializer implements aeu2<Button> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static boolean IAuthTabCallback = false;
    private static int IAuthTabCallbackStub = 0;
    public static final Button$$serializer INSTANCE;
    private static int asBinder = 1;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static boolean onNavigationEvent = false;
    private static int onTransact = 1;
    private static char[] onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 43;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 37;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        onNavigationEvent();
        Button$$serializer button$$serializer = new Button$$serializer();
        INSTANCE = button$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.membership.Button", button$$serializer, 2);
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-124, -125, -127, -126, -127}, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 126, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("linkUrl", true);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 101;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    private Button$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 35;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            return new KSerializer[]{sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout)};
        }
        getWriggleLayout getwrigglelayout2 = getWriggleLayout.onNavigationEvent;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(getwrigglelayout2);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(getwrigglelayout2);
        KSerializer<?>[] kSerializerArr = new KSerializer[2];
        kSerializerArr[0] = kSerializerIAuthTabCallback;
        kSerializerArr[0] = kSerializerIAuthTabCallback2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final Button deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        String str2;
        int i;
        int i2 = 2 % 2;
        int i3 = onTransact + 57;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            i = 3;
        } else {
            int i5 = IAuthTabCallbackStub + 97;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 0;
            boolean z = true;
            String str3 = null;
            String str4 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i8 = IAuthTabCallbackStub + 15;
                    onTransact = i8 % 128;
                    if (i8 % 2 == 0) {
                        if (iOnNavigationEvent != 0) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str3);
                        i7 |= 2;
                        int i9 = onTransact + 79;
                        IAuthTabCallbackStub = i9 % 128;
                        int i10 = i9 % 2;
                    } else {
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str3);
                        i7 |= 2;
                        int i92 = onTransact + 79;
                        IAuthTabCallbackStub = i92 % 128;
                        int i102 = i92 % 2;
                    }
                } else {
                    str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str4);
                    i7 |= 1;
                }
            }
            str = str3;
            str2 = str4;
            i = i7;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new Button(i, str2, str, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m199deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onTransact + 83;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull Button button) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 39;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(button, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            Button.IAuthTabCallback(button, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(button, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        Button.IAuthTabCallback(button, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = IAuthTabCallbackStub + 1;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 89;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (Button) obj);
        int i4 = onTransact + 51;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onTransact + 51;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = onWarmupCompleted;
        if (cArr3 != null) {
            int i3 = $11 + 25;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = $10 + 41;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), 76 - ExpandableListView.getPackedPositionChild(0L), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr4[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[i5])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), 77 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getJumpTapTimeout() >> 16) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr4[i5] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i5++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
            }
            cArr3 = cArr4;
        }
        try {
            Object[] objArr4 = {Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            float f = 0.0f;
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 75, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
            if (onNavigationEvent) {
                int i7 = $11 + 23;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                    cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
                } else {
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                    cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                }
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)), TextUtils.getTrimmedLength("") + 63, 12214 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    f = 0.0f;
                }
                objArr[0] = new String(cArr2);
                return;
            }
            if (!IAuthTabCallback) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i8 = $10 + 117;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), 63 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 12214 - View.MeasureSpec.makeMeasureSpec(0, 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr6);
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    static void onNavigationEvent() {
        onWarmupCompleted = new char[]{32422, 32425, 32430, 32437};
        onExtraCallback = -1184333998;
        IAuthTabCallback = true;
        onNavigationEvent = true;
    }
}
