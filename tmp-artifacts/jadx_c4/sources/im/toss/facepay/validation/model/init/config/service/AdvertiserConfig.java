package im.toss.facepay.validation.model.init.config.service;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.LiveCheckConstants;
import java.lang.reflect.Method;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class AdvertiserConfig {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Companion Companion;
    private static char[] IAuthTabCallback = null;
    private static int IAuthTabCallbackDefault = 1;
    private static char onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final boolean isEnabled;

    static {
        onWarmupCompleted();
        Companion = new Companion(null);
        int i = onWarmupCompleted + 55;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            int i2 = 85 / 0;
        }
    }

    public AdvertiserConfig() {
        this(false, 1, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 67;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertiserConfig)) {
            int i6 = i4 + 31;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.isEnabled == ((AdvertiserConfig) obj).isEnabled) {
            return true;
        }
        int i8 = i2 + 31;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.isEnabled);
        if (i3 == 0) {
            int i4 = 7 / 0;
        }
        return iHashCode;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        boolean z = this.isEnabled;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new char[]{16, 6, 16, 7, 4, 15, '\b', 23, 5, 1, 14, 0, 23, 5, 1, 23, 3, '\b', 17, '\r', 24, 5, 1, 17, 11, 6, 13785}, (byte) (49 - TextUtils.indexOf((CharSequence) "", '0', 0)), 27 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(z);
        Object[] objArr2 = new Object[1];
        a(new char[]{13765}, (byte) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 18), 1 - ExpandableListView.getPackedPositionGroup(0L), objArr2);
        sb.append(((String) objArr2[0]).intern());
        String string = sb.toString();
        int i2 = onNavigationEvent + 103;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AdvertiserConfig> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 103;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            AdvertiserConfig$$serializer advertiserConfig$$serializer = AdvertiserConfig$$serializer.INSTANCE;
            if (i3 != 0) {
                return advertiserConfig$$serializer;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public /* synthetic */ AdvertiserConfig(int i, boolean z, okycx okycxVar) {
        Object obj = null;
        if ((i & 1) != 0) {
            this.isEnabled = z;
            int i2 = IAuthTabCallbackDefault + 19;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            return;
        }
        this.isEnabled = true;
        int i3 = onNavigationEvent + 19;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(AdvertiserConfig advertiserConfig, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 97;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || !advertiserConfig.isEnabled) {
            vylVar.onNavigationEvent(serialDescriptor, 0, advertiserConfig.isEnabled);
        }
        int i4 = onNavigationEvent + 117;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public AdvertiserConfig(boolean z) {
        this.isEnabled = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertiserConfig(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallbackDefault + 51;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 39;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            z = true;
        }
        this(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int length;
        char[] cArr2;
        int i3;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr3 = IAuthTabCallback;
        Object obj2 = null;
        if (cArr3 != null) {
            int i5 = $10 + 83;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i3 = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i3 = 0;
            }
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0')), Process.getGidForName("") + 27, TextUtils.indexOf("", "", 0, 0) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr2[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i3++;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter("", 0), 26 - (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                int i6 = $11 + 43;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    int i8 = $10 + 39;
                    $11 = i8 % 128;
                    if (i8 % 2 == 0) {
                        defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent % 1];
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                            obj = obj2;
                        } else {
                            try {
                                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                                if (objOnExtraCallback3 == null) {
                                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 74 - (ViewConfiguration.getJumpTapTimeout() >> 16), 8088 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                }
                                if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                    if (objOnExtraCallback4 == null) {
                                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), Drawable.resolveOpacity(0, 0) + 30, 19488 - View.resolveSizeAndState(0, 0, 0), 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                    }
                                    obj = null;
                                    int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                                    int i9 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[iIntValue];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i9];
                                    int i10 = $11 + 27;
                                    $10 = i10 % 128;
                                    int i11 = i10 % 2;
                                } else {
                                    obj = null;
                                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                        int i12 = $11 + 53;
                                        $10 = i12 % 128;
                                        int i13 = i12 % 2;
                                        defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                        int i14 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                        int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i14];
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i15];
                                    } else {
                                        int i16 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                        int i17 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i16];
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i17];
                                    }
                                }
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        }
                    } else {
                        defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    obj2 = obj;
                }
            }
            for (int i18 = 0; i18 < i; i18++) {
                cArr4[i18] = (char) (cArr4[i18] ^ 13722);
            }
            String str = new String(cArr4);
            int i19 = $10 + 35;
            $11 = i19 % 128;
            if (i19 % 2 != 0) {
                objArr[0] = str;
            } else {
                int i20 = 51 / 0;
                objArr[0] = str;
            }
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    static void onWarmupCompleted() {
        IAuthTabCallback = new char[]{64961, 64983, 64977, 64986, 64988, 64962, 64982, 64964, 64981, 64978, 65008, 65010, 65014, 64966, 64985, 64910, 64991, 64965, 64960, 64967, 64989, 64980, 64922, 64923, 64963};
        onExtraCallback = (char) 51244;
    }
}
