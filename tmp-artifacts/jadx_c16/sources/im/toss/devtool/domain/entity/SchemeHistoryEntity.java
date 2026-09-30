package im.toss.devtool.domain.entity;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.devtool.domain.entity.SchemeHistoryEntity$;
import java.lang.reflect.Method;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class SchemeHistoryEntity {
    public static final Companion Companion;
    private static int IAuthTabCallback;
    private static int IAuthTabCallbackDefault;
    private static int onExtraCallback;
    private static short[] onExtraCallbackWithResult;
    private static byte[] onNavigationEvent;
    private static int onWarmupCompleted;
    private final String date;
    private final String scheme;
    private static final byte[] $$a = {9, 8, 112, 107};
    private static final int $$b = 115;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static int asInterface = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, short s2, int i) {
        int i2;
        int i3;
        int i4 = i * 3;
        int i5 = (s2 * 3) + 4;
        byte[] bArr = $$a;
        int i6 = 115 - (s * 4);
        byte[] bArr2 = new byte[1 - i4];
        int i7 = 0 - i4;
        if (bArr == null) {
            int i8 = i5;
            i6 = i7;
            int i9 = 0;
            int i10 = i5;
            i6 += -i8;
            i2 = i9;
            i3 = i10 + 1;
            bArr2[i2] = (byte) i6;
            i9 = i2 + 1;
            if (i2 == i7) {
                return new String(bArr2, 0);
            }
            i8 = bArr[i3];
            i10 = i3;
            i6 += -i8;
            i2 = i9;
            i3 = i10 + 1;
            bArr2[i2] = (byte) i6;
            i9 = i2 + 1;
            if (i2 == i7) {
            }
        } else {
            i2 = 0;
            i3 = i5;
            bArr2[i2] = (byte) i6;
            i9 = i2 + 1;
            if (i2 == i7) {
            }
        }
    }

    static {
        IAuthTabCallbackDefault = 0;
        IAuthTabCallback();
        Companion = new Companion((DefaultConstructorMarker) null);
        int i = asInterface + 21;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = asBinder + 9;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof SchemeHistoryEntity)) {
            int i4 = IAuthTabCallbackStub + 41;
            asBinder = i4 % 128;
            return i4 % 2 == 0;
        }
        SchemeHistoryEntity schemeHistoryEntity = (SchemeHistoryEntity) obj;
        if (!Intrinsics.areEqual(this.scheme, schemeHistoryEntity.scheme) || !Intrinsics.areEqual(this.date, schemeHistoryEntity.date)) {
            return false;
        }
        int i5 = asBinder + 79;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = asBinder + 87;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.scheme.hashCode() * 31) + this.date.hashCode();
        int i4 = IAuthTabCallbackStub + 19;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 51 / 0;
        }
        return iHashCode;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        String str = this.scheme;
        String str2 = this.date;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a((short) ((-86) - Color.green(0)), (byte) View.MeasureSpec.getMode(0), (-1980011926) + (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (-613607219) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), View.MeasureSpec.getSize(0) - 22, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(str);
        Object[] objArr2 = new Object[1];
        a((short) (63 - ExpandableListView.getPackedPositionChild(0L)), (byte) (Color.rgb(0, 0, 0) + 16777216), Color.red(0) - 1980011898, (-613607259) - View.resolveSize(0, 0), (-22) - (ViewConfiguration.getPressedStateDuration() >> 16), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(str2);
        Object[] objArr3 = new Object[1];
        a((short) ((-29) - Color.argb(0, 0, 0, 0)), (byte) ExpandableListView.getPackedPositionGroup(0L), (-1980011892) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 613607262, (-22) - KeyEvent.getDeadChar(0, 0), objArr3);
        sb.append(((String) objArr3[0]).intern());
        String string = sb.toString();
        int i2 = asBinder + 125;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ SchemeHistoryEntity(int i, String str, String str2, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i2 = asBinder + 81;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 3, SchemeHistoryEntity$.serializer.INSTANCE.getDescriptor());
            int i4 = IAuthTabCallbackStub + 45;
            asBinder = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        }
        this.scheme = str;
        this.date = str2;
    }

    public SchemeHistoryEntity(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.scheme = str;
        this.date = str2;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(SchemeHistoryEntity schemeHistoryEntity, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 99;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, schemeHistoryEntity.scheme);
        vylVar.onExtraCallback(serialDescriptor, 1, schemeHistoryEntity.date);
        int i4 = asBinder + 55;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 47;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        String str = this.scheme;
        int i5 = i2 + 3;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 95;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = this.date;
        int i5 = i2 + 81;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        boolean z;
        int length;
        byte[] bArr;
        int length2;
        byte[] bArr2;
        int i5;
        int i6 = 2;
        int i7 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - Color.red(0)), Color.green(0) + 42, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z2 = iIntValue == -1;
            if (!(!z2)) {
                byte[] bArr3 = onNavigationEvent;
                if (bArr3 != null) {
                    int i8 = $10 + 121;
                    $11 = i8 % 128;
                    if (i8 % 2 == 0) {
                        length2 = bArr3.length;
                        bArr2 = new byte[length2];
                        i5 = 1;
                    } else {
                        length2 = bArr3.length;
                        bArr2 = new byte[length2];
                        i5 = 0;
                    }
                    while (i5 < length2) {
                        int i9 = $10 + 55;
                        $11 = i9 % 128;
                        int i10 = i9 % i6;
                        Object[] objArr3 = {Integer.valueOf(bArr3[i5])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 12844), 55 - View.resolveSizeAndState(0, 0, 0), 2167 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i5] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i5++;
                        i6 = 2;
                    }
                    bArr3 = bArr2;
                }
                if (bArr3 != null) {
                    byte[] bArr4 = onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 43425), 42 - ExpandableListView.getPackedPositionType(0L), 22438 - TextUtils.lastIndexOf("", '0', 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr4[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (onExtraCallbackWithResult[i + ((int) (onWarmupCompleted ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i11 = $10 + 23;
                int i12 = i11 % 128;
                $11 = i12;
                int i13 = i11 % 2;
                int i14 = ((i + iIntValue) - 2) + ((int) (onWarmupCompleted ^ (-4629411779493505016L)));
                if (z2) {
                    int i15 = i12 + 21;
                    $10 = i15 % 128;
                    int i16 = i15 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i14 + i4;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(IAuthTabCallback), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 87, ExpandableListView.getPackedPositionType(0L) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr5 = onNavigationEvent;
                if (bArr5 != null) {
                    int i17 = $11 + 73;
                    $10 = i17 % 128;
                    if (i17 % 2 != 0) {
                        length = bArr5.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr5.length;
                        bArr = new byte[length];
                    }
                    int i18 = 0;
                    while (i18 < length) {
                        int i19 = $11;
                        int i20 = i19 + 7;
                        $10 = i20 % 128;
                        int i21 = i20 % 2;
                        bArr[i18] = (byte) (bArr5[i18] ^ (-4629411779493505016L));
                        i18++;
                        int i22 = i19 + 107;
                        $10 = i22 % 128;
                        int i23 = i22 % 2;
                    }
                    bArr5 = bArr;
                }
                if (bArr5 != null) {
                    int i24 = $11 + 19;
                    $10 = i24 % 128;
                    if (i24 % 2 != 0) {
                        int i25 = 4 % 4;
                    }
                    z = true;
                } else {
                    z = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (!z) {
                        short[] sArr = onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        int i26 = $11 + 25;
                        $10 = i26 % 128;
                        int i27 = i26 % 2;
                        byte[] bArr6 = onNavigationEvent;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static void IAuthTabCallback() {
        onWarmupCompleted = -767341155;
        onExtraCallback = -1538795491;
        IAuthTabCallback = -2133508209;
        onNavigationEvent = new byte[]{14, 38, 70, 86, 91, 83, 78, -87, 13, 83, 105, 67, 84, 119, 42, 85, 81, 89, 95, 104, Byte.MAX_VALUE, 49, 70, 86, 91, 83, 110, -6, -112, -71, -37, -75, 12, -68, -28};
    }
}
