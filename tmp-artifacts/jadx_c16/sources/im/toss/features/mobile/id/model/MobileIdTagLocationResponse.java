package im.toss.features.mobile.id.model;

import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.mobile.id.model.MobileIdTagLocationResponse$;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TombstoneProtosMemoryMappingBuilder;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class MobileIdTagLocationResponse {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final Companion Companion;
    private static char IAuthTabCallback;
    private static int asBinder;
    private static long onExtraCallbackWithResult;
    private static int onWarmupCompleted;
    private final MobileIdTagLocation taggedLocation;
    private static final byte[] $$a = {61, -49, -70, 93};
    private static final int $$b = 111;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, int i2, short s) {
        int i3;
        int i4;
        int i5 = (i2 * 4) + 1;
        int i6 = 110 - s;
        int i7 = 3 - (i * 2);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i8 = i6;
            i4 = 0;
            int i9 = i7;
            int i10 = i7 + i8;
            i3 = i4;
            int i11 = i9;
            i6 = i10;
            i7 = i11;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i5) {
                return new String(bArr2, 0);
            }
            int i12 = i7 + 1;
            i8 = bArr[i12];
            int i13 = i6;
            i9 = i12;
            i7 = i13;
            int i102 = i7 + i8;
            i3 = i4;
            int i112 = i9;
            i6 = i102;
            i7 = i112;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i5) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i5) {
            }
        }
    }

    private static final /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            MobileIdTagLocation.Companion.serializer();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer kSerializerSerializer = MobileIdTagLocation.Companion.serializer();
        int i3 = onExtraCallback + 43;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerSerializer;
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnNavigationEvent = onNavigationEvent();
        int i4 = onNavigationEvent + 11;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnNavigationEvent;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileIdTagLocationResponse)) {
            return false;
        }
        if (this.taggedLocation == ((MobileIdTagLocationResponse) obj).taggedLocation) {
            return true;
        }
        int i4 = i3 + 123;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.taggedLocation.hashCode();
        if (i3 == 0) {
            int i4 = 85 / 0;
        }
        return iHashCode;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        MobileIdTagLocation mobileIdTagLocation = this.taggedLocation;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a((char) (62107 - (ViewConfiguration.getEdgeSlop() >> 16)), 867516416 - (ViewConfiguration.getKeyRepeatDelay() >> 16), new char[]{3354, 27130, 62657, 23551, 35915, 23693, 29673, 55077, 30667, 55075, 58254, 36575, 40590, 44142, 19402, 14367, 31238, 6931, 65466, 52389, 43536, 52348, 11561, 58116, 27545, 9866, 49372, 49392, 28955, 40121, 3924, 177, 20607, 35458, 27474, 34779, 11068, 13494, 64178, 11414, 52498, 39395, 11710}, new char[]{733, 43844, 10751, 32593}, new char[]{212, 46400, 39731, 61170}, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(mobileIdTagLocation);
        Object[] objArr2 = new Object[1];
        a((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 44968), (-1722623651) - View.getDefaultSize(0, 0), new char[]{45980}, new char[]{733, 43844, 10751, 32593}, new char[]{23947, 21209, 43161, 1455}, objArr2);
        sb.append(((String) objArr2[0]).intern());
        String string = sb.toString();
        int i2 = onNavigationEvent + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    static {
        asBinder = 0;
        onExtraCallback();
        Companion = new Companion((DefaultConstructorMarker) null);
        $childSerializers = new Lazy[]{LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new MobileIdTagLocationResponse$.ExternalSyntheticLambda0())};
        int i = IAuthTabCallbackStub + 105;
        asBinder = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ MobileIdTagLocationResponse(int i, MobileIdTagLocation mobileIdTagLocation, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = onNavigationEvent + 61;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 1, MobileIdTagLocationResponse$.serializer.INSTANCE.getDescriptor());
            int i4 = onExtraCallback + 19;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        }
        this.taggedLocation = mobileIdTagLocation;
    }

    public static final /* synthetic */ Lazy[] IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 99;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 83;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(MobileIdTagLocationResponse mobileIdTagLocationResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            vylVar.onNavigationEvent(serialDescriptor, 1, (py) $childSerializers[1].getValue(), mobileIdTagLocationResponse.taggedLocation);
        } else {
            vylVar.onNavigationEvent(serialDescriptor, 0, (py) $childSerializers[0].getValue(), mobileIdTagLocationResponse.taggedLocation);
        }
        int i3 = onNavigationEvent + 21;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 64 / 0;
        }
    }

    public final MobileIdTagLocation onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 33;
        onNavigationEvent = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        MobileIdTagLocation mobileIdTagLocation = this.taggedLocation;
        int i4 = i2 + 55;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return mobileIdTagLocation;
        }
        obj.hashCode();
        throw null;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
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
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i3 = $10 + 9;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), Gravity.getAbsoluteGravity(0, 0) + 43, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1451, 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49122 - ImageFormat.getBitsPerPixel(0)), 45 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), TextUtils.lastIndexOf("", '0') + 1495, 1533236389, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23973 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 50 - (ViewConfiguration.getWindowTouchSlop() >> 8), View.resolveSize(0, 0) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 45849), ImageFormat.getBitsPerPixel(0) + 30, ExpandableListView.getPackedPositionChild(0L) + 12578, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallbackWithResult ^ 7798559133331975163L)) ^ ((int) (onWarmupCompleted ^ 7798559133331975163L))) ^ ((char) (IAuthTabCallback ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i5 = $11 + 17;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        objArr[0] = str;
    }

    static void onExtraCallback() {
        onExtraCallbackWithResult = 1399253655477381414L;
        onWarmupCompleted = -1776194565;
        IAuthTabCallback = (char) 27643;
    }
}
