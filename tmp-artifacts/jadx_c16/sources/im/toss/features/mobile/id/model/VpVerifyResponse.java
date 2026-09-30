package im.toss.features.mobile.id.model;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.mobile.id.model.VpVerifyResponse$;
import java.lang.reflect.Method;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class VpVerifyResponse {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Companion Companion;
    private static boolean IAuthTabCallback = false;
    private static int asBinder = 1;
    private static int asInterface = 1;
    private static char[] onExtraCallback;
    private static boolean onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onTransact;
    private static int onWarmupCompleted;
    private final long id;
    private final boolean result;

    static {
        onExtraCallbackWithResult();
        Companion = new Companion((DefaultConstructorMarker) null);
        int i = onWarmupCompleted + 83;
        asBinder = i % 128;
        if (i % 2 == 0) {
            int i2 = 9 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r10 instanceof im.toss.features.mobile.id.model.VpVerifyResponse) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r2 = r2 + 7;
        im.toss.features.mobile.id.model.VpVerifyResponse.onTransact = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r10 = (im.toss.features.mobile.id.model.VpVerifyResponse) r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r9.id == r10.id) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        r2 = r2 + 9;
        im.toss.features.mobile.id.model.VpVerifyResponse.onTransact = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        if (r9.result == r10.result) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
    
        r2 = r2 + 47;
        r10 = r2 % 128;
        im.toss.features.mobile.id.model.VpVerifyResponse.onTransact = r10;
        r2 = r2 % 2;
        r10 = r10 + 81;
        im.toss.features.mobile.id.model.VpVerifyResponse.asInterface = r10 % 128;
        r10 = r10 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r9 == r10) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r9 == r10) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 23;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 == 0) {
            int i4 = 36 / 0;
        }
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onTransact + 111;
        asInterface = i2 % 128;
        return i2 % 2 == 0 ? (Long.hashCode(this.id) >>> 80) / Boolean.hashCode(this.result) : (Long.hashCode(this.id) * 31) + Boolean.hashCode(this.result);
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        long j = this.id;
        boolean z = this.result;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-114, -115, -123, -116, -125, -119, -117, -118, -126, -119, -125, -120, -121, -122, -123, -124, -125, -127, -126, -127}, 127 - ExpandableListView.getPackedPositionGroup(0L), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(j);
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-114, -109, -110, -111, -119, -125, -124, -112, -113}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 127, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(z);
        Object[] objArr3 = new Object[1];
        a(null, null, new byte[]{-108}, Color.blue(0) + 127, objArr3);
        sb.append(((String) objArr3[0]).intern());
        String string = sb.toString();
        int i2 = onTransact + 25;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    public /* synthetic */ VpVerifyResponse(int i, long j, boolean z, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 3;
        if (3 != (i & 3)) {
            int i3 = onTransact + 111;
            asInterface = i3 % 128;
            if (i3 % 2 == 0) {
                descriptor = VpVerifyResponse$.serializer.INSTANCE.getDescriptor();
                i2 = 4;
            } else {
                descriptor = VpVerifyResponse$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = onTransact + 11;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.id = j;
        this.result = z;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(VpVerifyResponse vpVerifyResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onTransact + 59;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, vpVerifyResponse.id);
        vylVar.onNavigationEvent(serialDescriptor, 1, vpVerifyResponse.result);
        int i4 = onTransact + 95;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int length;
        char[] cArr2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = onExtraCallback;
        if (cArr3 != null) {
            int i4 = $10 + 33;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            for (int i5 = 0; i5 < length; i5++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getLongPressTimeout() >> 16), 77 - TextUtils.getTrimmedLength(""), TextUtils.indexOf("", "") + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr2[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i6 = $10 + 97;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr3 = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(onNavigationEvent)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16777216), (ViewConfiguration.getJumpTapTimeout() >> 16) + 75, 16037 - Color.green(0), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        int i8 = 1052772399;
        if (IAuthTabCallback) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i8);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getCapsMode("", 0, 0), 62 - Process.getGidForName(""), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i8 = 1052772399;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!onExtraCallbackWithResult) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i9 = $10 + 5;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback >>> defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] >>> iIntValue);
                    i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted;
                } else {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted + 1;
                }
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = i2;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i10 = $10 + 85;
        $11 = i10 % 128;
        int i11 = i10 % 2;
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i12 = $11 + 97;
            $10 = i12 % 128;
            if (i12 % 2 != 0) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback % 0) >> defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), 63 - (ViewConfiguration.getScrollBarSize() >> 8), 12215 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                obj = null;
            } else {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 63 - (ViewConfiguration.getScrollBarSize() >> 8), 12213 - ExpandableListView.getPackedPositionChild(0L), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                obj = null;
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
        }
        objArr[0] = new String(cArr6);
    }

    static void onExtraCallbackWithResult() {
        onExtraCallback = new char[]{32388, 32418, 32437, 32416, 32425, 32436, 32473, 32384, 32423, 32419, 32428, 32618, 32438, 32413, 32622, 32626, 32421, 32430, 32422, 32617};
        onNavigationEvent = -1184333998;
        onExtraCallbackWithResult = true;
        IAuthTabCallback = true;
    }
}
