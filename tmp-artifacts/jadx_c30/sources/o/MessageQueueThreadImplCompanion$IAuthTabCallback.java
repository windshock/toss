package o;

import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class MessageQueueThreadImplCompanion$IAuthTabCallback extends MessageQueueThreadImplCompanion {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final MessageQueueThreadImplCompanion$IAuthTabCallback IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 0;
    private static char onExtraCallback = 0;
    private static char onExtraCallbackWithResult = 0;
    private static char onNavigationEvent = 0;
    private static int onTransact = 1;
    private static char onWarmupCompleted;

    static {
        onExtraCallbackWithResult();
        IAuthTabCallback = new MessageQueueThreadImplCompanion$IAuthTabCallback();
        int i = IAuthTabCallbackDefault + 91;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 105;
        int i4 = i3 % 128;
        onTransact = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i4 + 11;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (obj instanceof MessageQueueThreadImplCompanion$IAuthTabCallback) {
            return true;
        }
        int i8 = i2 + 111;
        onTransact = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onTransact + 125;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return 1564251642;
        }
        int i3 = 41 / 0;
        return 1564251642;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 37;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new char[]{1564, 5991, 32351, 39844, 8948, 58255, 47598, 38743, 20118, 1224, 29175, 51921, 8818, 28193}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 13, objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i4 = asBinder + 51;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return strIntern;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i4 = $10 + 85;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent >>> 1];
            } else {
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            }
            int i5 = 58224;
            int i6 = i3;
            while (i6 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i7 = (c2 + i5) ^ ((c2 << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)));
                int i8 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onNavigationEvent);
                    objArr2[2] = Integer.valueOf(i8);
                    objArr2[1] = Integer.valueOf(i7);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString(BuildConfig.FLAVOR);
                        int iMyTid = (Process.myTid() >> 22) + 10;
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cKeyCodeFromString, iMyTid, packedPositionGroup, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), 9 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 12434 - KeyEvent.normalizeMetaState(0), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i6++;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 15 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 19902 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            int i9 = $10 + 97;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private MessageQueueThreadImplCompanion$IAuthTabCallback() throws Throwable {
        Object[] objArr = new Object[1];
        a(new char[]{64975, 46265, 45125, 11439, 12131, 10507, 44045, 21080, 19649, 58009, 12587, 50836, 38255, 62839}, 14 - TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new char[]{57696, 5438, 34857, 25565, 30676, 12183, 20218, 16639, 44542, 20903, 4296, 25079, 32351, 39844, 8948, 58255, 19905, 5007}, MotionEvent.axisFromString(BuildConfig.FLAVOR) + 18, objArr2);
        super(strIntern, ((String) objArr2[0]).intern(), (DefaultConstructorMarker) null);
    }

    static void onExtraCallbackWithResult() {
        onWarmupCompleted = (char) 8770;
        onExtraCallbackWithResult = (char) 62738;
        onExtraCallback = (char) 28700;
        onNavigationEvent = (char) 50953;
    }
}
