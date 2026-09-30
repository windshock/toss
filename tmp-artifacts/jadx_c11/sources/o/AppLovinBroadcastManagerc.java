package o;

import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinBroadcastManagerc {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 30688;
    private static int asInterface = 1;
    private static char onExtraCallback = 64765;
    private static char onExtraCallbackWithResult = 39763;
    private static char onNavigationEvent = 44759;
    private static int onWarmupCompleted;

    public static final /* synthetic */ class onExtraCallback {
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int[] iArr = new int[shared.values().length];
            try {
                iArr[shared.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[shared.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[shared.PUSH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[shared.NOTIFICATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[shared.SHORTCUT.ordinal()] = 5;
                int i = 2 % 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[shared.WIDGET.ordinal()] = 6;
                int i2 = onNavigationEvent + 51;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[shared.URL_SCHEME.ordinal()] = 7;
                int i5 = onWarmupCompleted + 7;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[shared.APP_LINK.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            onExtraCallbackWithResult = iArr;
        }
    }

    public static final String IAuthTabCallback(@NotNull shared sharedVar) throws Throwable {
        int i;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 125;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(sharedVar, "");
            i = onExtraCallback.onExtraCallbackWithResult[sharedVar.ordinal()];
            if (i == 0) {
                return "normal";
            }
        } else {
            Intrinsics.checkNotNullParameter(sharedVar, "");
            i = onExtraCallback.onExtraCallbackWithResult[sharedVar.ordinal()];
            if (i == 1) {
                return "normal";
            }
        }
        if (i == 2) {
            Object[] objArr = new Object[1];
            a(new char[]{23351, 9070, 10142, 24636, 21804, 50313, 13151, 14698}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 6, objArr);
            return ((String) objArr[0]).intern();
        }
        int i4 = onWarmupCompleted + 103;
        asInterface = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final String onWarmupCompleted(@NotNull shared sharedVar) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(sharedVar, "");
            int i3 = onExtraCallback.onExtraCallbackWithResult[sharedVar.ordinal()];
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(sharedVar, "");
        switch (onExtraCallback.onExtraCallbackWithResult[sharedVar.ordinal()]) {
            case 1:
                return "normal";
            case 2:
                Object[] objArr = new Object[1];
                a(new char[]{23351, 9070, 10142, 24636, 21804, 50313, 13151, 14698}, 6 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr);
                String strIntern = ((String) objArr[0]).intern();
                int i4 = asInterface + 49;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 69 / 0;
                }
                return strIntern;
            case 3:
                Object[] objArr2 = new Object[1];
                a(new char[]{64994, 59471, 23049, 7073}, KeyEvent.getDeadChar(0, 0) + 4, objArr2);
                return ((String) objArr2[0]).intern();
            case 4:
                return "notification";
            case 5:
                return "shortcut";
            case 6:
                return "widget";
            case 7:
                return "url_scheme";
            case 8:
                return "app_link";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final String onWarmupCompleted(@NotNull r8lambdaEK35TGWCjvE5YDlTcJsm53divws r8lambdaek35tgwcjve5ydltcjsm53divws) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdaek35tgwcjve5ydltcjsm53divws, "");
        if (onExtraCallback.onExtraCallbackWithResult[r8lambdaek35tgwcjve5ydltcjsm53divws.IAuthTabCallback().ordinal()] != 3) {
            return r8lambdaek35tgwcjve5ydltcjsm53divws.onExtraCallback();
        }
        int i2 = asInterface + 77;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String strOnNavigationEvent = r8lambdaek35tgwcjve5ydltcjsm53divws.onNavigationEvent();
        int i4 = onWarmupCompleted + 19;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return strOnNavigationEvent;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[0] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i3 = 58224;
            int i4 = 0;
            while (i4 < 16) {
                int i5 = $10 + 57;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                char c = cArr3[1];
                char c2 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c), Integer.valueOf((c2 + i3) ^ ((c2 << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)))), Integer.valueOf(c2 >>> 5), Integer.valueOf(onExtraCallback)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionGroup(0L), 11 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 12433 - MotionEvent.axisFromString(""), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i3) ^ ((cCharValue << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 9, 12482 - AndroidCharacter.getMirror('0'), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i3 -= 40503;
                    i4++;
                    int i7 = $11 + 97;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr3[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr3[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myTid() >> 22) + 16014), Drawable.resolveOpacity(0, 0) + 14, 19901 - (ViewConfiguration.getJumpTapTimeout() >> 16), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
