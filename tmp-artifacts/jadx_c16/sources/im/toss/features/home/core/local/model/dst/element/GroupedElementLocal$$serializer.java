package im.toss.features.home.core.local.model.dst.element;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
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
import o.JsApiStatTrackServiceImpl;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.aeu2;
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class GroupedElementLocal$$serializer implements aeu2<GroupedElementLocal> {
    private static int IAuthTabCallback;
    public static final GroupedElementLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult;
    private static long onNavigationEvent;
    private static char onWarmupCompleted;
    private static final byte[] $$a = {15, -74, 84, -51};
    private static final int $$b = 25;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int asInterface = 1;
    private static int onExtraCallback = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, byte b, byte b2) {
        int i2;
        int i3 = 110 - i;
        byte[] bArr = $$a;
        int i4 = b2 * 3;
        int i5 = 4 - (b * 2);
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i6 = i3;
            i3 = i4;
            int i7 = 0;
            i5++;
            i3 += i6;
            i2 = i7;
            bArr2[i2] = (byte) i3;
            i7 = i2 + 1;
            if (i2 == i4) {
                return new String(bArr2, 0);
            }
            i6 = bArr[i5];
            i5++;
            i3 += i6;
            i2 = i7;
            bArr2[i2] = (byte) i3;
            i7 = i2 + 1;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            i7 = i2 + 1;
            if (i2 == i4) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 119;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 53;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 86 / 0;
        }
        return serialDescriptor;
    }

    static {
        IAuthTabCallback = 1;
        onWarmupCompleted();
        GroupedElementLocal$$serializer groupedElementLocal$$serializer = new GroupedElementLocal$$serializer();
        INSTANCE = groupedElementLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.GroupedElementLocal", groupedElementLocal$$serializer, 3);
        Object[] objArr = new Object[1];
        a((char) (22746 - TextUtils.lastIndexOf("", '0')), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 101800520, new char[]{28150, 17382, 63824}, new char[]{0, 0, 0, 0}, new char[]{18675, 4442, 56070, 57176}, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("defaultElement", false);
        setanimationsloop.onWarmupCompleted("hiddenItems", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 67;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private GroupedElementLocal$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onTransact + 53;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return new KSerializer[]{getWriggleLayout.onNavigationEvent, JsApiStatTrackServiceImpl.onExtraCallbackWithResult, GroupedElementLocal.onExtraCallback()[2].getValue()};
        }
        Lazy[] lazyArrOnExtraCallback = GroupedElementLocal.onExtraCallback();
        KSerializer<?>[] kSerializerArr = new KSerializer[3];
        kSerializerArr[1] = getWriggleLayout.onNavigationEvent;
        kSerializerArr[1] = JsApiStatTrackServiceImpl.onExtraCallbackWithResult;
        kSerializerArr[3] = lazyArrOnExtraCallback[3].getValue();
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final GroupedElementLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        ItemElementLocal itemElementLocal;
        List list;
        String str;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallback = GroupedElementLocal.onExtraCallback();
        ItemElementLocal itemElementLocal2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = asInterface + 45;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            ItemElementLocal itemElementLocal3 = (ItemElementLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, JsApiStatTrackServiceImpl.onExtraCallbackWithResult, (Object) null);
            list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) lazyArrOnExtraCallback[2].getValue(), (Object) null);
            str = strAsInterface;
            itemElementLocal = itemElementLocal3;
            i = 7;
        } else {
            int i5 = 0;
            boolean z = true;
            List list2 = null;
            String strAsInterface2 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                    i5 |= 1;
                } else if (iOnNavigationEvent == 1) {
                    itemElementLocal2 = (ItemElementLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, JsApiStatTrackServiceImpl.onExtraCallbackWithResult, itemElementLocal2);
                    i5 |= 2;
                    int i6 = asInterface + 57;
                    onTransact = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 4 / 3;
                    }
                } else {
                    if (iOnNavigationEvent != 2) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    int i8 = onTransact + 59;
                    asInterface = i8 % 128;
                    int i9 = i8 % 2;
                    list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) lazyArrOnExtraCallback[2].getValue(), list2);
                    i5 |= 4;
                }
            }
            i = i5;
            itemElementLocal = itemElementLocal2;
            list = list2;
            str = strAsInterface2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        GroupedElementLocal groupedElementLocal = new GroupedElementLocal(i, str, itemElementLocal, list, (okycx) null);
        int i10 = asInterface + 37;
        onTransact = i10 % 128;
        int i11 = i10 % 2;
        return groupedElementLocal;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m375deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onTransact + 35;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        GroupedElementLocal groupedElementLocalDeserialize = deserialize(decoder);
        int i4 = onTransact + 39;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return groupedElementLocalDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull GroupedElementLocal groupedElementLocal) {
        int i = 2 % 2;
        int i2 = onTransact + 109;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(groupedElementLocal, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            GroupedElementLocal.onNavigationEvent(groupedElementLocal, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(groupedElementLocal, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        GroupedElementLocal.onNavigationEvent(groupedElementLocal, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onTransact + 9;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 63;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (GroupedElementLocal) obj);
        if (i3 == 0) {
            int i4 = 63 / 0;
        }
        int i5 = asInterface + 55;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = asInterface + 45;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 != 0) {
            int i4 = 62 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i5 = $10 + 37;
        $11 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 4 / 2;
        }
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i7 = $10 + 57;
            $11 = i7 % 128;
            int i8 = i7 % i3;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getThreadPriority(0) + 20) >> 6), 43 - (ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.indexOf("", "", 0) + 1451, 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf("", "") + 49123);
                    int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 44;
                    int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 1494;
                    byte b3 = (byte) ($$b & 7);
                    byte b4 = (byte) (b3 - 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, maximumFlingVelocity, threadPriority, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - View.combineMeasuredStates(0, 0)), 50 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    i2 = 2;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 45848), 29 - TextUtils.getTrimmedLength(""), Color.rgb(0, 0, 0) + 16789793, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onNavigationEvent ^ 7798559133331975163L)) ^ ((int) (onExtraCallbackWithResult ^ 7798559133331975163L))) ^ ((char) (onWarmupCompleted ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                i3 = i2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    static void onWarmupCompleted() {
        onNavigationEvent = 7798559133331975163L;
        onExtraCallbackWithResult = -1776194565;
        onWarmupCompleted = (char) 15599;
    }
}
