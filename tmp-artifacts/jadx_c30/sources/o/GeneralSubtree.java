package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISOFileInfo;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class GeneralSubtree {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int access100 = 1;
    private final List<Integer> IAuthTabCallback;
    private final String IAuthTabCallbackStub;
    private final long asBinder;
    private final String asInterface;
    private final boolean onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final long onNavigationEvent;
    private final String onWarmupCompleted;
    private static char[] onTransact = {27243, 27156, 27168, 27198, 27199, 27199, 27172, 27199, 27181, 27179, 27195, 27199, 27191, 27173, 27181, 27197, 27189, 27195, 27194, 27189, 27160, 27160, 27192, 27192, 27190, 27198, 27159, 27337, 27467, 27466, 27456, 27323, 27323, 27317, 27320, 27467, 27465, 27467, 27463, 27325, 27265, 27279, 27306, 27150, 27328, 27367, 27353, 27198, 27180, 27342, 27364, 27352, 27356, 27366, 27144, 27336, 27364, 27293, 27265, 27386, 27256, 27176, 27150, 27240, 27258, 27158, 27170, 27170, 27194, 27199, 27173, 27157, 27155, 27157, 27152, 27197, 27170, 27170, 27170, 27176, 27156, 27152, 27169, 27175};
    private static char[] IAuthTabCallbackDefault = {32542, 32738, 32549, 32604, 32550, 32513, 32598, 32573, 32601, 32606, 32599, 32525, 32595, 32551, 32545, 32537};
    private static int access000 = -1184333886;
    private static boolean getInterfaceDescriptor = true;
    private static boolean IAuthTabCallback_Parcel = true;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GeneralSubtree)) {
            return false;
        }
        GeneralSubtree generalSubtree = (GeneralSubtree) obj;
        if (!Intrinsics.areEqual(this.IAuthTabCallbackStub, generalSubtree.IAuthTabCallbackStub)) {
            return false;
        }
        if (this.asBinder != generalSubtree.asBinder) {
            int i2 = access100 + 13;
            IAuthTabCallbackStubProxy = i2 % 128;
            return i2 % 2 != 0;
        }
        if (this.onNavigationEvent != generalSubtree.onNavigationEvent || this.onExtraCallback != generalSubtree.onExtraCallback || !Intrinsics.areEqual(this.onExtraCallbackWithResult, generalSubtree.onExtraCallbackWithResult) || !Intrinsics.areEqual(this.onWarmupCompleted, generalSubtree.onWarmupCompleted)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.asInterface, generalSubtree.asInterface)) {
            int i3 = access100 + 43;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.IAuthTabCallback, generalSubtree.IAuthTabCallback)) {
            return true;
        }
        int i5 = access100 + 87;
        IAuthTabCallbackStubProxy = i5 % 128;
        return i5 % 2 != 0;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.IAuthTabCallbackStub.hashCode();
        int iHashCode3 = Long.hashCode(this.asBinder);
        int iHashCode4 = Long.hashCode(this.onNavigationEvent);
        int iHashCode5 = Boolean.hashCode(this.onExtraCallback);
        String str = this.onExtraCallbackWithResult;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        String str2 = this.onWarmupCompleted;
        if (str2 == null) {
            int i2 = IAuthTabCallbackStubProxy + 1;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
            int i4 = IAuthTabCallbackStubProxy + 27;
            access100 = i4 % 128;
            int i5 = i4 % 2;
        }
        String str3 = this.asInterface;
        return (((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + this.IAuthTabCallback.hashCode();
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        String str = this.IAuthTabCallbackStub;
        long j = this.asBinder;
        long j2 = this.onNavigationEvent;
        boolean z = this.onExtraCallback;
        String str2 = this.onExtraCallbackWithResult;
        String str3 = this.onWarmupCompleted;
        String str4 = this.asInterface;
        List<Integer> list = this.IAuthTabCallback;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new int[]{0, 27, 8, 0}, false, new byte[]{1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 0, 1, 0}, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(str);
        Object[] objArr2 = new Object[1];
        a(new int[]{27, 16, 155, 13}, false, new byte[]{1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1}, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(j);
        Object[] objArr3 = new Object[1];
        b(null, new byte[]{ISOFileInfo.SECURITY_ATTR_COMPACT, ISOFileInfo.SECURITY_ATTR_EXP, -119, ISOFileInfo.LCS_BYTE, ISOFileInfo.LCS_BYTE, -119, -120, ISOFileInfo.FCI_EXT, -122, ISOFileInfo.PROP_INFO, -124, ISOFileInfo.FILE_IDENTIFIER, -126, ISOFileInfo.DATA_BYTES2}, null, 126 - ExpandableListView.getPackedPositionChild(0L), objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(j2);
        Object[] objArr4 = new Object[1];
        a(new int[]{43, 11, 60, 4}, false, new byte[]{0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0}, objArr4);
        sb.append(((String) objArr4[0]).intern());
        sb.append(z);
        Object[] objArr5 = new Object[1];
        b(null, new byte[]{ISOFileInfo.SECURITY_ATTR_COMPACT, ISOFileInfo.SECURITY_ATTR_EXP, ISOFileInfo.FILE_IDENTIFIER, ISOFileInfo.FCI_EXT, ISOFileInfo.ENV_TEMP_EF, -124, -126, ISOFileInfo.DATA_BYTES2}, null, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 126, objArr5);
        sb.append(((String) objArr5[0]).intern());
        sb.append(str2);
        Object[] objArr6 = new Object[1];
        b(null, new byte[]{ISOFileInfo.SECURITY_ATTR_COMPACT, -124, ISOFileInfo.ENV_TEMP_EF, -119, ISOFileInfo.FCI_EXT, -113, ISOFileInfo.CHANNEL_SECURITY, ISOFileInfo.ENV_TEMP_EF, ISOFileInfo.LCS_BYTE, -126, ISOFileInfo.DATA_BYTES2}, null, (KeyEvent.getMaxKeyCode() >> 16) + CertificateBody.profileType, objArr6);
        sb.append(((String) objArr6[0]).intern());
        sb.append(str3);
        Object[] objArr7 = new Object[1];
        a(new int[]{54, 6, 96, 0}, false, new byte[]{0, 0, 1, 1, 0, 1}, objArr7);
        sb.append(((String) objArr7[0]).intern());
        sb.append(str4);
        Object[] objArr8 = new Object[1];
        a(new int[]{60, 24, 0, 4}, true, new byte[]{0, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 1}, objArr8);
        sb.append(((String) objArr8[0]).intern());
        sb.append(list);
        Object[] objArr9 = new Object[1];
        b(null, new byte[]{-112}, null, 127 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr9);
        sb.append(((String) objArr9[0]).intern());
        String string = sb.toString();
        int i2 = access100 + 27;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    public GeneralSubtree(@NotNull String str, long j, long j2, boolean z, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(list, BuildConfig.FLAVOR);
        this.IAuthTabCallbackStub = str;
        this.asBinder = j;
        this.onNavigationEvent = j2;
        this.onExtraCallback = z;
        this.onExtraCallbackWithResult = str2;
        this.onWarmupCompleted = str3;
        this.asInterface = str4;
        this.IAuthTabCallback = list;
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 93;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        String str = this.IAuthTabCallbackStub;
        int i5 = i3 + 9;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final long IAuthTabCallback() {
        long j;
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 101;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            j = this.asBinder;
            int i4 = 24 / 0;
        } else {
            j = this.asBinder;
        }
        int i5 = i2 + 85;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        throw null;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 121;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        long j = this.onNavigationEvent;
        int i5 = i2 + 15;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final boolean asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 43;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.onExtraCallback;
        int i5 = i2 + 123;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 5;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallbackWithResult;
        }
        throw null;
    }

    public final String onWarmupCompleted() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 1;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.onWarmupCompleted;
            int i4 = 18 / 0;
        } else {
            str = this.onWarmupCompleted;
        }
        int i5 = i2 + 77;
        access100 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = access100 + 51;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        String str = this.asInterface;
        int i5 = i3 + 59;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<Integer> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = access100 + 3;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void b(int[] iArr, byte[] bArr, char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = IAuthTabCallbackDefault;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 77, Color.alpha(0) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i4 = $10 + 109;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 / 2;
            }
            cArr2 = cArr3;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(access000)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            float f = 0.0f;
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 75 - (Process.myTid() >> 22), 16037 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            if (IAuthTabCallback_Parcel) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i6 = $10 + 67;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSize(0, 0), (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1)) + 62, (Process.myTid() >> 22) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    f = 0.0f;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!getInterfaceDescriptor) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i8 = $10 + 13;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ImageFormat.getBitsPerPixel(0)), AndroidCharacter.getMirror('0') + 15, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 12213, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr6);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = onTransact;
        long j = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 69;
                $10 = i8 % 128;
                if (i8 % i != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0) + 35284), 36 - (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)), (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) + 14238, -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr[i7])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - View.resolveSize(0, 0)), 35 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getWindowTouchSlop() >> 8) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i7] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i7++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i = 2;
                j = 0;
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.alpha(0) + 10935), View.combineMeasuredStates(0, 0) + 65, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i9] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                } else {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSize(0, 0), View.resolveSizeAndState(0, 0, 0) + 29, 17658 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    int i11 = $11 + 59;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 49466), 70 - Color.alpha(0), View.resolveSizeAndState(0, 0, 0) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            int i13 = $10 + 23;
            $11 = i13 % 128;
            if (i13 % 2 == 0) {
                char[] cArr5 = new char[i4];
                System.arraycopy(cArr3, 1, cArr5, 0, i4);
                System.arraycopy(cArr5, 1, cArr3, i4 - i6, i6);
                System.arraycopy(cArr5, i6, cArr3, 0, i4 >>> i6);
            } else {
                char[] cArr6 = new char[i4];
                System.arraycopy(cArr3, 0, cArr6, 0, i4);
                int i14 = i4 - i6;
                System.arraycopy(cArr6, 0, cArr3, i14, i6);
                System.arraycopy(cArr6, i6, cArr3, 0, i14);
            }
        }
        if (z) {
            char[] cArr7 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i15 = $11 + 43;
                $10 = i15 % 128;
                if (i15 % 2 != 0) {
                    cArr7[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(trackGroupExternalSyntheticLambda0.onNavigationEvent * i4) % 1];
                } else {
                    cArr7[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr7;
        }
        if (i5 > 0) {
            int i16 = $11 + 61;
            $10 = i16 % 128;
            int i17 = i16 % 2;
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }
}
