package im.toss.facepay.validation.model.init.config.quality;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class BlurConfig {
    public static final Companion Companion;
    private static int IAuthTabCallback;
    private static int onNavigationEvent;
    private final double blurThreshold;
    private final int svNum;
    private static final byte[] $$a = {69, -38, -90, 81};
    private static final int $$b = 59;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, short s2, int i) {
        int i2;
        int i3;
        int i4 = s2 + 4;
        byte[] bArr = $$a;
        int i5 = (s * 3) + 105;
        int i6 = 1 - (i * 2);
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i4;
            i5 = i6;
            int i8 = 0;
            i5 += -i4;
            i4 = i7;
            i2 = i8;
            int i9 = i4 + 1;
            bArr2[i2] = (byte) i5;
            i3 = i2 + 1;
            if (i3 == i6) {
                return new String(bArr2, 0);
            }
            i7 = i9;
            i4 = bArr[i9];
            i8 = i3;
            i5 += -i4;
            i4 = i7;
            i2 = i8;
            int i92 = i4 + 1;
            bArr2[i2] = (byte) i5;
            i3 = i2 + 1;
            if (i3 == i6) {
            }
        } else {
            i2 = 0;
            int i922 = i4 + 1;
            bArr2[i2] = (byte) i5;
            i3 = i2 + 1;
            if (i3 == i6) {
            }
        }
    }

    static {
        onNavigationEvent = 1;
        onExtraCallbackWithResult();
        Companion = new Companion(null);
        int i = onWarmupCompleted + 119;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public BlurConfig() {
        this(0, 0.0d, 3, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 45;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i2 + 49;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (!(obj instanceof BlurConfig)) {
            int i8 = i2 + 101;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        BlurConfig blurConfig = (BlurConfig) obj;
        if (this.svNum == blurConfig.svNum) {
            return Double.compare(this.blurThreshold, blurConfig.blurThreshold) == 0;
        }
        int i10 = i4 + 87;
        onExtraCallback = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (Integer.hashCode(this.svNum) * 31) + Double.hashCode(this.blurThreshold);
        int i4 = onExtraCallback + 57;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        int i2 = this.svNum;
        double d = this.blurThreshold;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 17, 16 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), new char[]{'\r', 21, 65518, 22, 19, 65480, 7, '\t', 6, 14, 15, 65507, 18, 21, '\f', 65506, 65501}, true, 264 - KeyEvent.keyCodeFromString(""), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(i2);
        Object[] objArr2 = new Object[1];
        a(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 17, 9 - Color.green(0), new char[]{'\n', 20, 7, 21, '\n', 17, 14, 6, 65503, 65486, 65474, 4, 14, 23, 20, 65526}, false, KeyEvent.normalizeMetaState(0) + 262, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(d);
        Object[] objArr3 = new Object[1];
        a(TextUtils.indexOf("", "", 0) + 1, 1 - Color.argb(0, 0, 0, 0), new char[]{0}, false, 209 - ExpandableListView.getPackedPositionType(0L), objArr3);
        sb.append(((String) objArr3[0]).intern());
        String string = sb.toString();
        int i3 = onExtraCallbackWithResult + 93;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BlurConfig> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 73;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            BlurConfig$$serializer blurConfig$$serializer = BlurConfig$$serializer.INSTANCE;
            int i4 = onNavigationEvent + 31;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return blurConfig$$serializer;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public /* synthetic */ BlurConfig(int i, int i2, double d, okycx okycxVar) {
        if ((i & 1) == 0) {
            int i3 = onExtraCallbackWithResult + 93;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 2 % 2;
            }
            i2 = 12;
        }
        this.svNum = i2;
        if ((i & 2) != 0) {
            this.blurThreshold = d;
            return;
        }
        int i5 = onExtraCallbackWithResult + 65;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        this.blurThreshold = 0.93d;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onWarmupCompleted(BlurConfig blurConfig, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i2 = onExtraCallbackWithResult + 85;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (blurConfig.svNum != 12) {
                vylVar.onExtraCallback(serialDescriptor, 0, blurConfig.svNum);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || Double.compare(blurConfig.blurThreshold, 0.93d) != 0) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, blurConfig.blurThreshold);
        }
        int i4 = onExtraCallbackWithResult + 121;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public BlurConfig(int i, double d) {
        this.svNum = i;
        this.blurThreshold = d;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BlurConfig(int i, double d, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            int i3 = onExtraCallbackWithResult + 101;
            onExtraCallback = i3 % 128;
            i = i3 % 2 != 0 ? 60 : 12;
            int i4 = 2 % 2;
        }
        if ((i2 & 2) != 0) {
            int i5 = onExtraCallbackWithResult + 9;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            d = 0.93d;
        }
        this(i, d);
    }

    public final int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 17;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.svNum;
        int i6 = i2 + 33;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final double onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        double d = this.blurThreshold;
        int i4 = i3 + 75;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return d;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        long j;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            j = 0;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(IAuthTabCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 35126), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 23, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 10277, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12844 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 55 - (ViewConfiguration.getPressedStateDuration() >> 16), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2168, 1298711993, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
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
            int i7 = $11 + 47;
            $10 = i7 % 128;
            int i8 = i7 % 2;
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
                int i9 = $10 + 5;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 - 1);
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - ExpandableListView.getPackedPositionType(j)), View.getDefaultSize(0, 0) + 55, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2167, 1298711993, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 2083011369;
                j = 0;
            }
            int i11 = $11 + 25;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 4 % 5;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static void onExtraCallbackWithResult() {
        IAuthTabCallback = 478308993;
    }
}
