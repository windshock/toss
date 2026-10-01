package im.toss.features.mobile.id.model;

import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.ViewConfiguration;
import im.toss.features.mobile.id.model.FaceSelfieVerifyResponse$;
import java.lang.reflect.Method;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class FaceSelfieVerifyResponse {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Companion Companion;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int asInterface = 1;
    private static int onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static int onTransact;
    private static char onWarmupCompleted;
    private final String encFaceRegisterToken;
    private final long id;

    static {
        onExtraCallback();
        Companion = new Companion((DefaultConstructorMarker) null);
        int i = IAuthTabCallbackDefault + 101;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = asInterface + 1;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof FaceSelfieVerifyResponse)) {
            int i4 = asInterface + 53;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        FaceSelfieVerifyResponse faceSelfieVerifyResponse = (FaceSelfieVerifyResponse) obj;
        if (this.id != faceSelfieVerifyResponse.id) {
            return false;
        }
        if (Intrinsics.areEqual(this.encFaceRegisterToken, faceSelfieVerifyResponse.encFaceRegisterToken)) {
            return true;
        }
        int i6 = onTransact + 11;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onTransact + 93;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (Long.hashCode(this.id) * 31) + this.encFaceRegisterToken.hashCode();
        int i4 = asInterface + 35;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        long j = this.id;
        String str = this.encFaceRegisterToken;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new char[]{53051, 61337, 59480, 50691, 2616, 50654, 7973, 12721, 40015, 29309, 16642, 37723, 27947, 33606, 52130, 24343, 53351, 16307, 48187, 29453, 7811, 42827, 7687, 15154, 45220, 18923, 36915, 53403}, 29 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(j);
        Object[] objArr2 = new Object[1];
        a(new char[]{16240, 53977, 46579, 54145, 3291, 58243, 54300, 21941, 14702, 11775, 26027, 41187, 33816, 45329, 28166, 24485, 55143, 18911, 7631, 5407, 46579, 54145, 12188, 4639}, 23 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(str);
        Object[] objArr3 = new Object[1];
        a(new char[]{59975, 23464}, '1' - AndroidCharacter.getMirror('0'), objArr3);
        sb.append(((String) objArr3[0]).intern());
        String string = sb.toString();
        int i2 = asInterface + 117;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ FaceSelfieVerifyResponse(int i, long j, String str, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 3;
        if (3 != (i & 3)) {
            int i3 = onTransact + 3;
            asInterface = i3 % 128;
            if (i3 % 2 == 0) {
                descriptor = FaceSelfieVerifyResponse$.serializer.INSTANCE.getDescriptor();
                i2 = 4;
            } else {
                descriptor = FaceSelfieVerifyResponse$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = 2 % 2;
        }
        this.id = j;
        this.encFaceRegisterToken = str;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(FaceSelfieVerifyResponse faceSelfieVerifyResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = asInterface + 13;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, faceSelfieVerifyResponse.id);
        vylVar.onExtraCallback(serialDescriptor, 1, faceSelfieVerifyResponse.encFaceRegisterToken);
        int i4 = onTransact + 41;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 7;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        long j = this.id;
        int i4 = i2 + 13;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface + 95;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return this.encFaceRegisterToken;
        }
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i5 = $10 + 11;
            $11 = i5 % 128;
            int i6 = 58224;
            if (i5 % 2 == 0) {
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent >> 1];
                i2 = 1;
            } else {
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                i2 = i4;
            }
            while (i2 < 16) {
                int i7 = $11 + 75;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i4];
                int i9 = (c2 + i6) ^ ((c2 << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)));
                int i10 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onWarmupCompleted);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[1] = Integer.valueOf(i9);
                    objArr2[i4] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'));
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 11;
                        int i11 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i4] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, iLastIndexOf, i11, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Gravity.getAbsoluteGravity(0, 0), 11 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 12434 - (Process.myTid() >> 22), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i2++;
                    cArr3 = cArr4;
                    i4 = 0;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 16015), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 14, 19901 - TextUtils.getOffsetAfter("", 0), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            int i12 = $10 + 27;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            cArr3 = cArr5;
            i4 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onExtraCallback() {
        onNavigationEvent = (char) 61897;
        IAuthTabCallback = (char) 15146;
        onExtraCallbackWithResult = (char) 5310;
        onWarmupCompleted = (char) 49139;
    }
}
