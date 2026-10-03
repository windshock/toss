package viva.republica.toss.network.model.transfer;

import android.graphics.Color;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
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
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.aeu2;
import o.appInfo;
import o.getWriggleLayout;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.SendPreAction;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class SendPreAction$Send$$serializer implements aeu2<SendPreAction.Send> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 1;
    public static final SendPreAction$Send$$serializer INSTANCE;
    private static int asBinder;
    private static final SerialDescriptor descriptor;
    private static char onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static char onWarmupCompleted;

    public static final /* synthetic */ class onWarmupCompleted implements appInfo {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        private final /* synthetic */ String discriminator;

        public onWarmupCompleted(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.discriminator = str;
        }

        public final /* synthetic */ String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 97;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            String str = this.discriminator;
            if (i3 != 0) {
                int i4 = 1 / 0;
            }
            return str;
        }

        public final /* synthetic */ Class annotationType() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 121;
            onExtraCallbackWithResult = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                throw null;
            }
            int i4 = i2 + 117;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return appInfo.class;
            }
            obj.hashCode();
            throw null;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 101;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 != 0) {
                boolean z = obj instanceof appInfo;
                throw null;
            }
            if (!(obj instanceof appInfo)) {
                int i4 = i3 + 13;
                onWarmupCompleted = i4 % 128;
                return i4 % 2 == 0;
            }
            if (!Intrinsics.areEqual(IAuthTabCallback(), ((appInfo) obj).IAuthTabCallback())) {
                return false;
            }
            int i5 = onWarmupCompleted + 115;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 61;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.discriminator.hashCode() ^ 707790692;
            int i4 = onWarmupCompleted + 67;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return iHashCode;
            }
            throw null;
        }

        public final String toString() {
            int i = 2 % 2;
            String str = "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=" + this.discriminator + ")";
            int i2 = onWarmupCompleted + 45;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = asBinder + 11;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 23;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onNavigationEvent();
        SendPreAction$Send$$serializer sendPreAction$Send$$serializer = new SendPreAction$Send$$serializer();
        INSTANCE = sendPreAction$Send$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("SEND", sendPreAction$Send$$serializer, 4);
        setanimationsloop.onWarmupCompleted("transferUniqueKey", true);
        setanimationsloop.onWarmupCompleted("displayInfoList", true);
        setanimationsloop.onWarmupCompleted("tossBankWebAuthRedirectUrl", true);
        setanimationsloop.onWarmupCompleted("tossCoreBundleTransferInfo", true);
        Object[] objArr = new Object[1];
        a(new char[]{2548, 21227, 50850, 10783, 19170, 64997}, TextUtils.getCapsMode("", 0, 0) + 6, objArr);
        setanimationsloop.onWarmupCompleted(new onWarmupCompleted(((String) objArr[0]).intern()));
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 19;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private SendPreAction$Send$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlinx.serialization.KSerializer[]] */
    /* JADX WARN: Type inference failed for: r5v2, types: [kotlinx.serialization.KSerializer[]] */
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = asBinder + 83;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Lazy[] lazyArrIAuthTabCallbackStub = SendPreAction.Send.IAuthTabCallbackStub();
            ?? r5 = new KSerializer[2];
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            r5[1] = sp.IAuthTabCallback(getwrigglelayout);
            r5[0] = lazyArrIAuthTabCallbackStub[1].getValue();
            r5[4] = sp.IAuthTabCallback(getwrigglelayout);
            r5[5] = sp.IAuthTabCallback(BundleTransferInfo$$serializer.INSTANCE);
            kSerializerArr = r5;
        } else {
            Lazy[] lazyArrIAuthTabCallbackStub2 = SendPreAction.Send.IAuthTabCallbackStub();
            getWriggleLayout getwrigglelayout2 = getWriggleLayout.onNavigationEvent;
            kSerializerArr = new KSerializer[]{sp.IAuthTabCallback(getwrigglelayout2), lazyArrIAuthTabCallbackStub2[1].getValue(), sp.IAuthTabCallback(getwrigglelayout2), sp.IAuthTabCallback(BundleTransferInfo$$serializer.INSTANCE)};
        }
        int i3 = IAuthTabCallbackDefault + 71;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            return kSerializerArr;
        }
        throw null;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 71;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return m98deserialize(decoder);
        }
        m98deserialize(decoder);
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0085 A[SYNTHETIC] */
    /* renamed from: deserialize, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final viva.republica.toss.network.model.transfer.SendPreAction.Send m98deserialize(@org.jetbrains.annotations.NotNull kotlinx.serialization.encoding.Decoder r21) throws kotlinx.serialization.UnknownFieldException {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.SendPreAction$Send$$serializer.m98deserialize(kotlinx.serialization.encoding.Decoder):viva.republica.toss.network.model.transfer.SendPreAction$Send");
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 31;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (SendPreAction.Send) obj);
        int i4 = asBinder + 35;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull SendPreAction.Send send) {
        int i = 2 % 2;
        int i2 = asBinder + 63;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(send, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        SendPreAction.Send.onNavigationEvent(send, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = asBinder + 1;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = asBinder + 9;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            super.typeParametersSerializers();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = IAuthTabCallbackDefault + 97;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 63 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i4 = $10 + 43;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            char c = 1;
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $10 + 39;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                char c2 = cArr3[c];
                char c3 = cArr3[i3];
                int i10 = (c3 + i6) ^ ((c3 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)));
                int i11 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onWarmupCompleted);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[c] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c2);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int iLastIndexOf = 9 - TextUtils.lastIndexOf("", '0', i3);
                        int iBlue = Color.blue(i3) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(keyRepeatDelay, iLastIndexOf, iBlue, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[c] = cCharValue;
                    int i12 = i7;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getMaxKeyCode() >> 16), MotionEvent.axisFromString("") + 11, 12435 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7 = i12 + 1;
                    i3 = 0;
                    c = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr3[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr3[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getMode(0) + 16014), 14 - (ViewConfiguration.getScrollBarSize() >> 8), 19901 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onNavigationEvent() {
        onExtraCallback = (char) 39286;
        onExtraCallbackWithResult = (char) 25960;
        IAuthTabCallback = (char) 26040;
        onWarmupCompleted = (char) 30364;
    }
}
