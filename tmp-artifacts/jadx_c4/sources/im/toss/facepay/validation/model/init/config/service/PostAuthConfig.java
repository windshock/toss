package im.toss.facepay.validation.model.init.config.service;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class PostAuthConfig {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Companion Companion;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static long onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final boolean isEnabled;
    private final long waitForPaymentTimeoutMs;

    static {
        IAuthTabCallback();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = onExtraCallback + 25;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public PostAuthConfig() {
        this(false, 0L, 3, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 89;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        if (i3 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostAuthConfig)) {
            int i5 = i2 + 101;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        PostAuthConfig postAuthConfig = (PostAuthConfig) obj;
        if (this.isEnabled == postAuthConfig.isEnabled) {
            return this.waitForPaymentTimeoutMs == postAuthConfig.waitForPaymentTimeoutMs;
        }
        int i7 = i4 + 99;
        onWarmupCompleted = i7 % 128;
        return i7 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.isEnabled);
        return i3 != 0 ? (iHashCode % 11) << Long.hashCode(this.waitForPaymentTimeoutMs) : (iHashCode * 31) + Long.hashCode(this.waitForPaymentTimeoutMs);
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        boolean z = this.isEnabled;
        long j = this.waitForPaymentTimeoutMs;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new char[]{2461, 2509, 22731, 4125, 53465, 36089, 16856, 22182, 11064, 31733, 25851, 29086, 19478, 40691, 1933, 37740, 24920, 41247, 10991, 52807, 33406, 50193, 52661, 59683, 42891, 59228, 61274, 1026, 55544}, View.getDefaultSize(0, 0) + 1, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(z);
        Object[] objArr2 = new Object[1];
        a(new char[]{64490, 64454, 4992, 23321, 40462, 61866, 3851, 11232, 55655, 12528, 10782, 3274, 48720, 54728, 18773, 60960, 37675, 59929, 25726, 45833, 28718, 36665, 33633, 38004, 22001, 44097, 41372, 31096, 10945, 16693}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(j);
        Object[] objArr3 = new Object[1];
        a(new char[]{60063, 60086, 3642, 1566, 19817}, -TextUtils.indexOf((CharSequence) "", '0', 0), objArr3);
        sb.append(((String) objArr3[0]).intern());
        String string = sb.toString();
        int i2 = onNavigationEvent + 105;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PostAuthConfig> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 37;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            PostAuthConfig$$serializer postAuthConfig$$serializer = PostAuthConfig$$serializer.INSTANCE;
            if (i3 != 0) {
                return postAuthConfig$$serializer;
            }
            throw null;
        }
    }

    public /* synthetic */ PostAuthConfig(int i, boolean z, long j, okycx okycxVar) {
        if ((i & 1) == 0) {
            int i2 = onNavigationEvent + 99;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            z = false;
        }
        this.isEnabled = z;
        if ((i & 2) != 0) {
            this.waitForPaymentTimeoutMs = j;
            return;
        }
        int i5 = onWarmupCompleted + 121;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        this.waitForPaymentTimeoutMs = 60000L;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onNavigationEvent(PostAuthConfig postAuthConfig, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i4 = onNavigationEvent + 107;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                boolean z = postAuthConfig.isEnabled;
                obj.hashCode();
                throw null;
            }
            if (postAuthConfig.isEnabled) {
                vylVar.onNavigationEvent(serialDescriptor, 0, postAuthConfig.isEnabled);
            }
        }
        if (!(!vylVar.onWarmupCompleted(serialDescriptor, 1))) {
            vylVar.onExtraCallback(serialDescriptor, 1, postAuthConfig.waitForPaymentTimeoutMs);
        } else {
            int i5 = onWarmupCompleted + 55;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            if (postAuthConfig.waitForPaymentTimeoutMs != 60000) {
            }
        }
        int i7 = onWarmupCompleted + 11;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    public PostAuthConfig(boolean z, long j) {
        this.isEnabled = z;
        this.waitForPaymentTimeoutMs = j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PostAuthConfig(boolean z, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 119;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 23;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            z = false;
        }
        if ((i & 2) != 0) {
            int i7 = onWarmupCompleted + 101;
            int i8 = i7 % 128;
            onNavigationEvent = i8;
            int i9 = i7 % 2;
            int i10 = i8 + 99;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 2 % 2;
            j = 60000;
        }
        this(z, j);
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallbackWithResult ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $10 + 63;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16731404) - Color.rgb(0, 0, 0)), 84 - (Process.myPid() >> 22), 21233 - TextUtils.indexOf("", "", 0, 0), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - TextUtils.getOffsetBefore("", 0)), KeyEvent.getDeadChar(0, 0) + 19, Process.getGidForName("") + 8809, 64918803, false, "d", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i6 = $10 + 87;
        $11 = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    static void IAuthTabCallback() {
        onExtraCallbackWithResult = 2570713398884840373L;
    }
}
