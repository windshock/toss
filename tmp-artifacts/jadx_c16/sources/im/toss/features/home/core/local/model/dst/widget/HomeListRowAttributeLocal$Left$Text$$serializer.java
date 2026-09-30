package im.toss.features.home.core.local.model.dst.widget;

import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.local.model.dst.widget.HomeListRowAttributeLocal;
import im.toss.features.home.core.local.model.dst.widget.TextAttributeLocal$;
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
import o.BaseManifest3;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.aeu2;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.setVideoListener;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeListRowAttributeLocal$Left$Text$$serializer implements aeu2<HomeListRowAttributeLocal.Left.Text> {
    public static final HomeListRowAttributeLocal$Left$Text$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {69, 81, 99, -123};
    private static final int $$b = 191;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onExtraCallback = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, int i2) {
        int i3;
        int i4;
        int i5 = s * 2;
        byte[] bArr = $$a;
        int i6 = 3 - (i * 3);
        int i7 = (i2 * 2) + 105;
        byte[] bArr2 = new byte[1 - i5];
        int i8 = 0 - i5;
        if (bArr == null) {
            int i9 = i6;
            int i10 = 0;
            i6 += -i7;
            i4 = i9;
            i3 = i10;
            bArr2[i3] = (byte) i6;
            int i11 = i4 + 1;
            if (i3 == i8) {
                return new String(bArr2, 0);
            }
            int i12 = i3 + 1;
            i9 = i11;
            i7 = bArr[i11];
            i10 = i12;
            i6 += -i7;
            i4 = i9;
            i3 = i10;
            bArr2[i3] = (byte) i6;
            int i112 = i4 + 1;
            if (i3 == i8) {
            }
        } else {
            i3 = 0;
            i4 = i6;
            i6 = i7;
            bArr2[i3] = (byte) i6;
            int i1122 = i4 + 1;
            if (i3 == i8) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i3 + 7;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return serialDescriptor;
    }

    static {
        onWarmupCompleted = 1;
        onWarmupCompleted();
        HomeListRowAttributeLocal$Left$Text$$serializer homeListRowAttributeLocal$Left$Text$$serializer = new HomeListRowAttributeLocal$Left$Text$$serializer();
        INSTANCE = homeListRowAttributeLocal$Left$Text$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.widget.HomeListRowAttributeLocal.Left.Text", homeListRowAttributeLocal$Left$Text$$serializer, 3);
        setanimationsloop.onWarmupCompleted("verticalAlignment", false);
        Object[] objArr = new Object[1];
        a(4 - (ViewConfiguration.getPressedStateDuration() >> 16), -TextUtils.lastIndexOf("", '0', 0, 0), new char[]{3, 3, 65524, 7}, false, 135 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("adaptiveWidth", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 49;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private HomeListRowAttributeLocal$Left$Text$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {HomeListRowAttributeLocal.Left.Text.onWarmupCompleted()[0].getValue(), TextAttributeLocal$.serializer.INSTANCE, sp.IAuthTabCallback(setVideoListener.onWarmupCompleted)};
        int i4 = IAuthTabCallback + 69;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final HomeListRowAttributeLocal.Left.Text deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        Double d;
        BaseManifest3 baseManifest3;
        TextAttributeLocal textAttributeLocal;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnWarmupCompleted = HomeListRowAttributeLocal.Left.Text.onWarmupCompleted();
        Object obj = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = IAuthTabCallback + 61;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            BaseManifest3 baseManifest32 = (BaseManifest3) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnWarmupCompleted[0].getValue(), (Object) null);
            TextAttributeLocal textAttributeLocal2 = (TextAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, TextAttributeLocal$.serializer.INSTANCE, (Object) null);
            d = (Double) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, setVideoListener.onWarmupCompleted, (Object) null);
            baseManifest3 = baseManifest32;
            textAttributeLocal = textAttributeLocal2;
            i = 7;
        } else {
            boolean z = true;
            int i5 = 0;
            Double d2 = null;
            BaseManifest3 baseManifest33 = null;
            TextAttributeLocal textAttributeLocal3 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i6 = IAuthTabCallback + 9;
                    int i7 = i6 % 128;
                    onNavigationEvent = i7;
                    if (i6 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (iOnNavigationEvent == 0) {
                        baseManifest33 = (BaseManifest3) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnWarmupCompleted[0].getValue(), baseManifest33);
                        i5 |= 1;
                    } else if (iOnNavigationEvent == 1) {
                        textAttributeLocal3 = (TextAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, TextAttributeLocal$.serializer.INSTANCE, textAttributeLocal3);
                        i5 |= 2;
                    } else {
                        if (iOnNavigationEvent != 2) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i8 = i7 + 67;
                        IAuthTabCallback = i8 % 128;
                        int i9 = i8 % 2;
                        d2 = (Double) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, setVideoListener.onWarmupCompleted, d2);
                        i5 |= 4;
                    }
                } else {
                    int i10 = onNavigationEvent + 77;
                    IAuthTabCallback = i10 % 128;
                    if (i10 % 2 != 0) {
                        int i11 = 4 % 4;
                    }
                    z = false;
                }
            }
            d = d2;
            baseManifest3 = baseManifest33;
            textAttributeLocal = textAttributeLocal3;
            i = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new HomeListRowAttributeLocal.Left.Text(i, baseManifest3, textAttributeLocal, d, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m496deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        HomeListRowAttributeLocal.Left.Text textDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallback + 67;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return textDeserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HomeListRowAttributeLocal.Left.Text text) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(text, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        HomeListRowAttributeLocal.Left.Text.onNavigationEvent(text, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 117;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HomeListRowAttributeLocal.Left.Text) obj);
        int i4 = onNavigationEvent + 99;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            super.typeParametersSerializers();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onNavigationEvent + 37;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 35126), TextUtils.indexOf("", "", 0) + 23, 10278 - (Process.myTid() >> 22), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getEdgeSlop() >> 16)), 55 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 2167 - TextUtils.getOffsetBefore("", 0), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i7 = $10 + 123;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 5 / 3;
                }
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
            int i9 = $11 + 107;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i11 = $11 + 113;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 12843), View.MeasureSpec.getMode(0) + 55, 2167 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static void onWarmupCompleted() {
        onExtraCallbackWithResult = 478308924;
    }
}
