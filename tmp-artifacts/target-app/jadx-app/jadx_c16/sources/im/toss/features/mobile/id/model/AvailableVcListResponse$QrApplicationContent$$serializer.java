package im.toss.features.mobile.id.model;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.mobile.id.model.AvailableVcListResponse;
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
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
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
public final /* synthetic */ class AvailableVcListResponse$QrApplicationContent$$serializer implements aeu2<AvailableVcListResponse.QrApplicationContent> {
    private static int IAuthTabCallback;
    public static final AvailableVcListResponse$QrApplicationContent$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {119, -40, 16, 123};
    private static final int $$b = 24;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r8v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, short s2) {
        int i2;
        int i3;
        byte[] bArr = $$a;
        int i4 = i * 4;
        ?? r8 = (s2 * 2) + 105;
        int i5 = 3 - (s * 4);
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            byte b = r8;
            i2 = 0;
            int i6 = i5;
            int i7 = i6;
            i3 = i5 + b;
            i5 = i7;
            bArr2[i2] = (byte) i3;
            int i8 = i5 + 1;
            if (i2 == i4) {
                return new String(bArr2, 0);
            }
            b = bArr[i8];
            i2++;
            int i9 = i3;
            i6 = i8;
            i5 = i9;
            int i72 = i6;
            i3 = i5 + b;
            i5 = i72;
            bArr2[i2] = (byte) i3;
            int i82 = i5 + 1;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            i3 = r8;
            bArr2[i2] = (byte) i3;
            int i822 = i5 + 1;
            if (i2 == i4) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i3 + 89;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return serialDescriptor;
        }
        obj.hashCode();
        throw null;
    }

    static {
        onWarmupCompleted = 0;
        IAuthTabCallback();
        AvailableVcListResponse$QrApplicationContent$$serializer availableVcListResponse$QrApplicationContent$$serializer = new AvailableVcListResponse$QrApplicationContent$$serializer();
        INSTANCE = availableVcListResponse$QrApplicationContent$$serializer;
        Object[] objArr = new Object[1];
        a(77 - Color.argb(0, 0, 0, 0), 69 - View.MeasureSpec.getMode(0), new char[]{3, 2, 65534, 17, 18, 15, 2, 16, 65483, '\n', '\f', 65535, 6, '\t', 2, 65483, 6, 1, 65483, '\n', '\f', 1, 2, '\t', 65483, 65502, 19, 65534, 6, '\t', 65534, 65535, '\t', 2, 65523, 0, 65513, 6, 16, 17, 65519, 2, 16, '\r', '\f', 11, 16, 2, 65483, 65518, 15, 65502, '\r', '\r', '\t', 6, 0, 65534, 17, 6, '\f', 11, 65504, '\f', 11, 17, 2, 11, 17, 6, '\n', 65483, 17, '\f', 16, 16, 65483}, false, TextUtils.indexOf((CharSequence) "", '0') + 154, objArr);
        setAnimationsLoop setanimationsloop = new setAnimationsLoop(((String) objArr[0]).intern(), availableVcListResponse$QrApplicationContent$$serializer, 3);
        Object[] objArr2 = new Object[1];
        a(9 - View.resolveSize(0, 0), TextUtils.lastIndexOf("", '0') + 5, new char[]{0, 0, '\b', 6, 6, 65528, 65532, 5, 65524}, true, Color.rgb(0, 0, 0) + 16777379, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        Object[] objArr3 = new Object[1];
        a(6 - Color.red(0), 3 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), new char[]{11, 65533, '\t', 65531, 65530, 65535}, true, 160 - TextUtils.indexOf("", ""), objArr3);
        setanimationsloop.onWarmupCompleted(((String) objArr3[0]).intern(), false);
        Object[] objArr4 = new Object[1];
        a(((Process.getThreadPriority(0) + 20) >> 6) + 15, TextUtils.getTrimmedLength("") + 8, new char[]{'\f', 1, 7, 6, 65508, 1, 6, 3, 65529, '\b', '\b', 4, 1, 65531, 65529}, false, 157 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr4);
        setanimationsloop.onWarmupCompleted(((String) objArr4[0]).intern(), false);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 23;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private AvailableVcListResponse$QrApplicationContent$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnExtraCallback = AvailableVcListResponse.QrApplicationContent.onExtraCallback();
        KSerializer<?>[] kSerializerArr = {lazyArrOnExtraCallback[0].getValue(), lazyArrOnExtraCallback[1].getValue(), getWriggleLayout.onNavigationEvent};
        int i4 = onExtraCallbackWithResult + 19;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final AvailableVcListResponse.QrApplicationContent deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        List list;
        String strAsInterface;
        int i;
        List list2;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 29;
        onExtraCallbackWithResult = i3 % 128;
        List list3 = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(descriptor);
            AvailableVcListResponse.QrApplicationContent.onExtraCallback();
            ywVarOnWarmupCompleted.extraCallbackWithResult();
            list3.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted2 = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallback = AvailableVcListResponse.QrApplicationContent.onExtraCallback();
        if (!(!ywVarOnWarmupCompleted2.extraCallbackWithResult())) {
            List list4 = (List) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnExtraCallback[0].getValue(), (Object) null);
            List list5 = (List) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnExtraCallback[1].getValue(), (Object) null);
            strAsInterface = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 2);
            list = list5;
            i = 7;
            list2 = list4;
        } else {
            String strAsInterface2 = null;
            List list6 = null;
            boolean z = true;
            int i4 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i5 = onExtraCallbackWithResult + 81;
                    int i6 = i5 % 128;
                    onExtraCallback = i6;
                    int i7 = i5 % 2;
                    if (iOnNavigationEvent == 1) {
                        list3 = (List) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnExtraCallback[1].getValue(), list3);
                        i4 |= 2;
                    } else {
                        if (iOnNavigationEvent != 2) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i8 = i6 + 61;
                        onExtraCallbackWithResult = i8 % 128;
                        if (i8 % 2 == 0) {
                            strAsInterface2 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 4);
                            i4 |= 3;
                        } else {
                            strAsInterface2 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 2);
                            i4 |= 4;
                        }
                    }
                } else {
                    list6 = (List) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnExtraCallback[0].getValue(), list6);
                    i4 |= 1;
                }
            }
            list = list3;
            strAsInterface = strAsInterface2;
            i = i4;
            list2 = list6;
        }
        ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor);
        return new AvailableVcListResponse.QrApplicationContent(i, list2, list, strAsInterface, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m658deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        AvailableVcListResponse.QrApplicationContent qrApplicationContentDeserialize = deserialize(decoder);
        if (i3 == 0) {
            int i4 = 58 / 0;
        }
        int i5 = onExtraCallbackWithResult + 61;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return qrApplicationContentDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AvailableVcListResponse.QrApplicationContent qrApplicationContent) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(qrApplicationContent, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            AvailableVcListResponse.QrApplicationContent.onNavigationEvent(qrApplicationContent, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            int i3 = 36 / 0;
        } else {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(qrApplicationContent, "");
            SerialDescriptor serialDescriptor2 = descriptor;
            vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
            AvailableVcListResponse.QrApplicationContent.onNavigationEvent(qrApplicationContent, vylVarOnExtraCallback2, serialDescriptor2);
            vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        }
        int i4 = onExtraCallbackWithResult + 9;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AvailableVcListResponse.QrApplicationContent) obj);
        if (i3 != 0) {
            int i4 = 85 / 0;
        }
        int i5 = onExtraCallback + 9;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 105;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        long j;
        char[] cArr2;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr3 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        int i6 = $10 + 51;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        while (true) {
            i4 = 2083011369;
            j = 0;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            int i8 = $11 + 45;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr3[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i10 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i10]), Integer.valueOf(IAuthTabCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.green(0) + 35125), 24 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 10277, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i10] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12844 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 54 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 2168 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
        if (i2 > 0) {
            int i11 = $11 + 19;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr4 = new char[i];
            System.arraycopy(cArr3, 0, cArr4, 0, i);
            System.arraycopy(cArr4, 0, cArr3, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr4, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr3, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            int i13 = $11 + 119;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                cArr2 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 1;
            } else {
                cArr2 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            }
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr3[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12843), (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)) + 56, ExpandableListView.getPackedPositionGroup(j) + 2167, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 2083011369;
                j = 0;
            }
            cArr3 = cArr2;
        }
        String str = new String(cArr3);
        int i14 = $11 + 71;
        $10 = i14 % 128;
        int i15 = i14 % 2;
        objArr[0] = str;
    }

    static void IAuthTabCallback() {
        IAuthTabCallback = 478308895;
    }
}
