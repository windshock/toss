package im.toss.facepay.validation.model.init.config.service;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
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
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class CandidateFrameConfig {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Companion Companion;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int asBinder = 0;
    private static int onExtraCallback = 0;
    private static char onExtraCallbackWithResult = 0;
    private static char onNavigationEvent = 0;
    private static int onTransact = 1;
    private static char onWarmupCompleted;
    private final int count;
    private final int sendMs;
    private final int timeoutMs;

    static {
        onNavigationEvent();
        Companion = new Companion(null);
        int i = onTransact + 19;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public CandidateFrameConfig() {
        this(0, 0, 0, 7, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CandidateFrameConfig)) {
            return false;
        }
        CandidateFrameConfig candidateFrameConfig = (CandidateFrameConfig) obj;
        if (this.count == candidateFrameConfig.count) {
            if (this.timeoutMs == candidateFrameConfig.timeoutMs) {
                return this.sendMs == candidateFrameConfig.sendMs;
            }
            int i2 = asBinder + 125;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = asBinder + 85;
        int i5 = i4 % 128;
        IAuthTabCallbackDefault = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 119;
        asBinder = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 63;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(this.count);
        return i3 != 0 ? (((iHashCode + 61) / Integer.hashCode(this.timeoutMs)) / 86) * Integer.hashCode(this.sendMs) : (((iHashCode * 31) + Integer.hashCode(this.timeoutMs)) * 31) + Integer.hashCode(this.sendMs);
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        int i2 = this.count;
        int i3 = this.timeoutMs;
        int i4 = this.sendMs;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new char[]{13050, 47560, 46934, 48287, 31803, 56027, 35297, 4069, 5553, 18041, 5619, 24948, 39099, 13842, 61814, 25890, 5098, 43330, 28071, 22248, 56521, 59728, 14085, 59365, 31100, 50776, 47994, 26704}, 26 - ImageFormat.getBitsPerPixel(0), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(i2);
        Object[] objArr2 = new Object[1];
        a(new char[]{28016, 6585, 34301, 47596, 39099, 13842, 14085, 59365, 2206, 31409, 26365, 39224}, Color.rgb(0, 0, 0) + 16777228, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(i3);
        Object[] objArr3 = new Object[1];
        a(new char[]{28016, 6585, 30846, 20307, 46934, 48287, 43299, 34836, 47994, 26704}, 9 - Drawable.resolveOpacity(0, 0), objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(i4);
        Object[] objArr4 = new Object[1];
        a(new char[]{57445, 44409}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr4);
        sb.append(((String) objArr4[0]).intern());
        String string = sb.toString();
        int i5 = asBinder + 95;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 56 / 0;
        }
        return string;
    }

    public static final class Companion {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CandidateFrameConfig> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 121;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            CandidateFrameConfig$$serializer candidateFrameConfig$$serializer = CandidateFrameConfig$$serializer.INSTANCE;
            int i4 = onNavigationEvent + 117;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return candidateFrameConfig$$serializer;
        }
    }

    public /* synthetic */ CandidateFrameConfig(int i, int i2, int i3, int i4, okycx okycxVar) {
        if ((i & 1) == 0) {
            int i5 = IAuthTabCallbackDefault + 11;
            asBinder = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            i2 = 2;
        }
        this.count = i2;
        if ((i & 2) == 0) {
            int i7 = IAuthTabCallbackDefault + 65;
            asBinder = i7 % 128;
            this.timeoutMs = i7 % 2 != 0 ? 7633 : 10000;
        } else {
            this.timeoutMs = i3;
        }
        if ((i & 4) != 0) {
            this.sendMs = i4;
            return;
        }
        this.sendMs = 2000;
        int i8 = IAuthTabCallbackDefault + 15;
        asBinder = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void IAuthTabCallback(CandidateFrameConfig candidateFrameConfig, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i2 = IAuthTabCallbackDefault + 113;
            asBinder = i2 % 128;
            if (i2 % 2 == 0 ? candidateFrameConfig.count != 2 : candidateFrameConfig.count != 5) {
                vylVar.onExtraCallback(serialDescriptor, 0, candidateFrameConfig.count);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i3 = IAuthTabCallbackDefault + 5;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            if (candidateFrameConfig.timeoutMs != 10000) {
                vylVar.onExtraCallback(serialDescriptor, 1, candidateFrameConfig.timeoutMs);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || candidateFrameConfig.sendMs != 2000) {
            vylVar.onExtraCallback(serialDescriptor, 2, candidateFrameConfig.sendMs);
        }
    }

    public CandidateFrameConfig(int i, int i2, int i3) {
        this.count = i;
        this.timeoutMs = i2;
        this.sendMs = i3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CandidateFrameConfig(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i4 & 1) != 0) {
            int i5 = asBinder + 75;
            IAuthTabCallbackDefault = i5 % 128;
            i = i5 % 2 == 0 ? 5 : 2;
        }
        if ((i4 & 2) != 0) {
            int i6 = asBinder;
            int i7 = i6 + 113;
            IAuthTabCallbackDefault = i7 % 128;
            int i8 = i7 % 2;
            int i9 = i6 + 61;
            IAuthTabCallbackDefault = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 2 % 2;
            }
            i2 = 10000;
        }
        if ((i4 & 4) != 0) {
            int i11 = asBinder + 43;
            IAuthTabCallbackDefault = i11 % 128;
            int i12 = i11 % 2;
            int i13 = 2 % 2;
            i3 = 2000;
        }
        this(i, i2, i3);
    }

    public final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 73;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.count;
        }
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i4 = $10 + 93;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 5 / 3;
            }
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $11 + 9;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onWarmupCompleted);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                        int i12 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 10;
                        int i13 = 12434 - (ExpandableListView.getPackedPositionForGroup(i3) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i3) == 0L ? 0 : -1));
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(touchSlop, i12, i13, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 9 - TextUtils.indexOf((CharSequence) "", '0'), View.MeasureSpec.makeMeasureSpec(0, 0) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    cArr3 = cArr4;
                    i3 = 0;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16015 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 13 - ((byte) KeyEvent.getModifierMetaStateMask()), 19901 - View.resolveSizeAndState(0, 0, 0), -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i14 = $11 + 107;
        $10 = i14 % 128;
        if (i14 % 2 == 0) {
            objArr[0] = str;
        } else {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static void onNavigationEvent() {
        IAuthTabCallback = (char) 31749;
        onNavigationEvent = (char) 37054;
        onExtraCallbackWithResult = (char) 6782;
        onWarmupCompleted = (char) 40259;
    }
}
