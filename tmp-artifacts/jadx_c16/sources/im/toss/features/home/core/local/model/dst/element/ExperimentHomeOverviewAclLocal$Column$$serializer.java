package im.toss.features.home.core.local.model.dst.element;

import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.local.model.dst.element.ExperimentHomeOverviewAclLocal;
import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.aeu2;
import o.okycx;
import o.setAnimationsLoop;
import o.setAppxVersionInWorker;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ExperimentHomeOverviewAclLocal$Column$$serializer implements aeu2<ExperimentHomeOverviewAclLocal.Column> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 1;
    public static final ExperimentHomeOverviewAclLocal$Column$$serializer INSTANCE;
    private static int asBinder;
    private static final SerialDescriptor descriptor;
    private static char onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static char onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 109;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 115;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        onNavigationEvent();
        ExperimentHomeOverviewAclLocal$Column$$serializer experimentHomeOverviewAclLocal$Column$$serializer = new ExperimentHomeOverviewAclLocal$Column$$serializer();
        INSTANCE = experimentHomeOverviewAclLocal$Column$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.ExperimentHomeOverviewAclLocal.Column", experimentHomeOverviewAclLocal$Column$$serializer, 2);
        Object[] objArr = new Object[1];
        a(new char[]{11876, 53170, 24424, 35686, 33746, 59101}, '5' - AndroidCharacter.getMirror('0'), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("handler", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallbackStub + 103;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private ExperimentHomeOverviewAclLocal$Column$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = asBinder + 7;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(setAppxVersionInWorker.onExtraCallback);
            kSerializerArr = new KSerializer[3];
            kSerializerArr[1] = ExperimentHomeOverviewAclLocal$Column$Title$$serializer.INSTANCE;
            kSerializerArr[0] = kSerializerIAuthTabCallback;
        } else {
            kSerializerArr = new KSerializer[]{ExperimentHomeOverviewAclLocal$Column$Title$$serializer.INSTANCE, sp.IAuthTabCallback(setAppxVersionInWorker.onExtraCallback)};
        }
        int i3 = IAuthTabCallbackDefault + 107;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ExperimentHomeOverviewAclLocal.Column deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        ExperimentHomeOverviewAclLocal.Column.Title title;
        HandlerLocal handlerLocal;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            title = (ExperimentHomeOverviewAclLocal.Column.Title) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, ExperimentHomeOverviewAclLocal$Column$Title$$serializer.INSTANCE, (Object) null);
            handlerLocal = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, setAppxVersionInWorker.onExtraCallback, (Object) null);
            int i3 = IAuthTabCallbackDefault + 47;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            i = 3;
        } else {
            int i5 = 0;
            ExperimentHomeOverviewAclLocal.Column.Title title2 = null;
            HandlerLocal handlerLocal2 = null;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i6 = IAuthTabCallbackDefault + 19;
                    int i7 = i6 % 128;
                    asBinder = i7;
                    int i8 = i6 % 2;
                    if (iOnNavigationEvent == 0) {
                        title2 = (ExperimentHomeOverviewAclLocal.Column.Title) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, ExperimentHomeOverviewAclLocal$Column$Title$$serializer.INSTANCE, title2);
                        i5 |= 1;
                    } else {
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i9 = i7 + 33;
                        IAuthTabCallbackDefault = i9 % 128;
                        int i10 = i9 % 2;
                        handlerLocal2 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, setAppxVersionInWorker.onExtraCallback, handlerLocal2);
                        i5 |= 2;
                    }
                } else {
                    z = false;
                }
            }
            i = i5;
            title = title2;
            handlerLocal = handlerLocal2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ExperimentHomeOverviewAclLocal.Column(i, title, handlerLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m350deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 117;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        ExperimentHomeOverviewAclLocal.Column columnDeserialize = deserialize(decoder);
        int i4 = asBinder + 49;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return columnDeserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ExperimentHomeOverviewAclLocal.Column column) {
        int i = 2 % 2;
        int i2 = asBinder + 111;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(column, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            ExperimentHomeOverviewAclLocal.Column.onWarmupCompleted(column, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            int i3 = 70 / 0;
        } else {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(column, "");
            SerialDescriptor serialDescriptor2 = descriptor;
            vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
            ExperimentHomeOverviewAclLocal.Column.onWarmupCompleted(column, vylVarOnExtraCallback2, serialDescriptor2);
            vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        }
        int i4 = IAuthTabCallbackDefault + 45;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 95;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ExperimentHomeOverviewAclLocal.Column) obj);
        int i4 = asBinder + 21;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 39;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = asBinder + 17;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 16 / 0;
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
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i4 = 58224;
            int i5 = i3;
            while (i5 < 16) {
                int i6 = $10 + 85;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i8 = (c2 + i4) ^ ((c2 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)));
                int i9 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onNavigationEvent);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
                        int i10 = 10 - (TypedValue.complexToFraction(i3, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i3, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int packedPositionChild = 12433 - ExpandableListView.getPackedPositionChild(0L);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cAxisFromString, i10, packedPositionChild, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0, 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 10, 12433 - Process.getGidForName(""), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                    i5++;
                    int i11 = $11 + 39;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16013 - Process.getGidForName("")), (ViewConfiguration.getWindowTouchSlop() >> 8) + 14, 19949 - AndroidCharacter.getMirror('0'), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onNavigationEvent() {
        onExtraCallback = (char) 12577;
        onWarmupCompleted = (char) 50156;
        IAuthTabCallback = (char) 56312;
        onNavigationEvent = (char) 30409;
    }
}
