package im.toss.features.mobile.id.model;

import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.mobile.id.model.RegisteredDeviceRequest$;
import java.lang.reflect.Method;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RegisteredDeviceRequest {
    public static final Companion Companion;
    private static int IAuthTabCallback;
    private static char onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static long onNavigationEvent;
    private final String authToken;
    private final String txId;
    private static final byte[] $$a = {93, 49, 76, -114};
    private static final int $$b = 191;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onWarmupCompleted = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, byte b, short s) {
        int i2;
        int i3 = i * 3;
        byte[] bArr = $$a;
        int i4 = 110 - s;
        int i5 = 4 - (b * 2);
        byte[] bArr2 = new byte[1 - i3];
        int i6 = 0 - i3;
        if (bArr == null) {
            int i7 = i6;
            int i8 = i5;
            int i9 = 0;
            int i10 = (-i5) + i7;
            int i11 = i8 + 1;
            i2 = i9;
            i4 = i10;
            i5 = i11;
            bArr2[i2] = (byte) i4;
            i9 = i2 + 1;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            int i12 = i4;
            i8 = i5;
            i5 = bArr[i5];
            i7 = i12;
            int i102 = (-i5) + i7;
            int i112 = i8 + 1;
            i2 = i9;
            i4 = i102;
            i5 = i112;
            bArr2[i2] = (byte) i4;
            i9 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            i9 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    static {
        IAuthTabCallback = 1;
        IAuthTabCallback();
        Companion = new Companion((DefaultConstructorMarker) null);
        int i = onWarmupCompleted + 123;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 30 / 0;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 7;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            int i4 = i3 + 9;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (!(obj instanceof RegisteredDeviceRequest)) {
            int i6 = i3 + 99;
            onTransact = i6 % 128;
            return i6 % 2 != 0;
        }
        RegisteredDeviceRequest registeredDeviceRequest = (RegisteredDeviceRequest) obj;
        if (!Intrinsics.areEqual(this.txId, registeredDeviceRequest.txId)) {
            int i7 = IAuthTabCallbackStub + 55;
            onTransact = i7 % 128;
            return i7 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.authToken, registeredDeviceRequest.authToken)) {
            return true;
        }
        int i8 = onTransact + 19;
        IAuthTabCallbackStub = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onTransact + 55;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.txId.hashCode();
        return i3 == 0 ? (iHashCode >> 125) - this.authToken.hashCode() : (iHashCode * 31) + this.authToken.hashCode();
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        String str = this.txId;
        String str2 = this.authToken;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a((char) (17511 - (ViewConfiguration.getPressedStateDuration() >> 16)), (-1734633286) - ((byte) KeyEvent.getModifierMetaStateMask()), new char[]{13499, 5949, 26386, 16405, 11481, 64358, 63959, 7537, 7381, 26434, 56035, 39628, 18023, 62001, 27075, 35291, 58756, 8218, 22008, 18191, 62095, 1301, 45797, 63288, 27532, 6987, 42476, 61087, 13010}, new char[]{0, 0, 0, 0}, new char[]{48035, 39832, 26520, 15172}, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(str);
        Object[] objArr2 = new Object[1];
        a((char) View.resolveSizeAndState(0, 0, 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), new char[]{61831, 55160, 27935, 42229, 17729, 45815, 5639, 36766, 59310, 62452, 38515, 12258}, new char[]{0, 0, 0, 0}, new char[]{49144, 37790, 56113, 42431}, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(str2);
        Object[] objArr3 = new Object[1];
        a((char) (48904 - KeyEvent.normalizeMetaState(0)), TextUtils.indexOf((CharSequence) "", '0', 0) - 695872739, new char[]{13405}, new char[]{0, 0, 0, 0}, new char[]{7376, 34259, 2262, 13503}, objArr3);
        sb.append(((String) objArr3[0]).intern());
        String string = sb.toString();
        int i2 = IAuthTabCallbackStub + 55;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ RegisteredDeviceRequest(int i, String str, String str2, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i2 = IAuthTabCallbackStub + 11;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                htf31.onExtraCallbackWithResult(i, 2, RegisteredDeviceRequest$.serializer.INSTANCE.getDescriptor());
            } else {
                htf31.onExtraCallbackWithResult(i, 3, RegisteredDeviceRequest$.serializer.INSTANCE.getDescriptor());
            }
            int i3 = 2 % 2;
        }
        this.txId = str;
        this.authToken = str2;
    }

    public RegisteredDeviceRequest(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.txId = str;
        this.authToken = str2;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(RegisteredDeviceRequest registeredDeviceRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 71;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, registeredDeviceRequest.txId);
        vylVar.onExtraCallback(serialDescriptor, 1, registeredDeviceRequest.authToken);
        int i4 = IAuthTabCallbackStub + 81;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
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
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i5 = $10 + 11;
            $11 = i5 % 128;
            int i6 = i5 % i3;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 43 - (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.lastIndexOf("", '0', 0) + 1452, 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), TextUtils.getOffsetBefore("", 0) + 44, 1494 - (ViewConfiguration.getLongPressTimeout() >> 16), 1533236389, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 23972), 50 - ExpandableListView.getPackedPositionGroup(0L), ExpandableListView.getPackedPositionType(0L) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    i2 = 2;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45847 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 30 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 12577 - TextUtils.indexOf("", "", 0, 0), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onNavigationEvent ^ 7798559133331975163L)) ^ ((int) (onExtraCallbackWithResult ^ 7798559133331975163L))) ^ ((char) (onExtraCallback ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i7 = $10 + 47;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 5 % 5;
                }
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

    static void IAuthTabCallback() {
        onNavigationEvent = 7798559133331975163L;
        onExtraCallbackWithResult = 1274772278;
        onExtraCallback = (char) 27643;
    }
}
