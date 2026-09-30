package im.toss.di;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.LiveCheckConstants;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import javax.inject.Singleton;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.findResAndMsg;
import o.g1;
import o.s5c;
import o.trackCheckout;
import o.zzad;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class SecurityModule {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 55935;
    private static int IAuthTabCallbackStub = 1;
    private static char onExtraCallback = 8396;
    private static char onExtraCallbackWithResult = 59123;
    private static char onNavigationEvent = 43012;
    private static int onWarmupCompleted;

    @Singleton
    public final Object onNavigationEvent$64b92fa2(@NotNull Context context) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        try {
            Object[] objArr = {context};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1065397470);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14026 - (ViewConfiguration.getPressedStateDuration() >> 16)), 5 - View.MeasureSpec.getSize(0), 19727 - KeyEvent.keyCodeFromString(""), 247485006, false, (String) null, new Class[]{Context.class});
            }
            Object objNewInstance = ((Constructor) objOnExtraCallback).newInstance(objArr);
            int i2 = IAuthTabCallbackStub + 71;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 25 / 0;
            }
            return objNewInstance;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    @Singleton
    public final Object IAuthTabCallback$64b92f45(@NotNull Context context) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        try {
            Object[] objArr = {context};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1952704152);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (26181 - TextUtils.indexOf("", "", 0, 0)), '4' - AndroidCharacter.getMirror('0'), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 21904, -1159927816, false, (String) null, new Class[]{Context.class});
            }
            Object objNewInstance = ((Constructor) objOnExtraCallback).newInstance(objArr);
            int i2 = onWarmupCompleted + 9;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                return objNewInstance;
            }
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    @Singleton
    public final Object onNavigationEvent$6d9dd4fa(@NotNull findResAndMsg findresandmsg, @NotNull Object obj, @NotNull trackCheckout trackcheckout) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(findresandmsg, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(trackcheckout, "");
        try {
            Object[] objArr = {findresandmsg, obj, trackcheckout};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-361193463);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 5 - (ViewConfiguration.getEdgeSlop() >> 16), 20000 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -617062759, false, (String) null, new Class[]{findResAndMsg.class, (Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) (34519 - KeyEvent.keyCodeFromString("")), 5 - (ViewConfiguration.getFadingEdgeLength() >> 16), TextUtils.indexOf((CharSequence) "", '0') + 20172), trackCheckout.class});
            }
            Object objNewInstance = ((Constructor) objOnExtraCallback).newInstance(objArr);
            int i2 = onWarmupCompleted + 43;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 33 / 0;
            }
            return objNewInstance;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final Object onExtraCallback$56e76e23(@NotNull s5c s5cVar) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(s5cVar, "");
        try {
            Object[] objArr = {s5cVar};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(300705890);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (34519 - ExpandableListView.getPackedPositionGroup(0L)), 5 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), TextUtils.lastIndexOf("", '0') + 20172, 548181746, false, (String) null, new Class[]{s5c.class});
            }
            Object objNewInstance = ((Constructor) objOnExtraCallback).newInstance(objArr);
            int i2 = onWarmupCompleted + 115;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                return objNewInstance;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final s5c onWarmupCompleted(@NotNull g1 g1Var, @NotNull zzad zzadVar) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(g1Var, "");
        Intrinsics.checkNotNullParameter(zzadVar, "");
        String strIAuthTabCallbackStub = zzadVar.IAuthTabCallbackStub();
        StringBuilder sb = new StringBuilder();
        sb.append(strIAuthTabCallbackStub);
        Object[] objArr = new Object[1];
        a(new char[]{10301, 36388, 8047, 28187, 55649, 52174, 54532, 31817, 27003, 31834}, TextUtils.getOffsetBefore("", 0) + 10, objArr);
        sb.append(((String) objArr[0]).intern());
        s5c s5cVar = (s5c) g1.onExtraCallback(g1Var, s5c.class, sb.toString(), (Long) null, (Long) null, (Function1) null, 28, (Object) null);
        int i2 = IAuthTabCallbackStub + 33;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return s5cVar;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (true) {
            Object obj = null;
            if (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent >= cArr.length) {
                break;
            }
            int i5 = $10 + 125;
            $11 = i5 % 128;
            int i6 = 58224;
            if (i5 % i2 == 0) {
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent / i4];
            } else {
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            }
            int i7 = i4;
            while (i7 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i4];
                char[] cArr4 = cArr3;
                int i8 = (c2 + i6) ^ ((c2 << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)));
                int i9 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(IAuthTabCallback);
                    objArr2[i2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[0] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char c3 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int scrollBarSize = 10 - (ViewConfiguration.getScrollBarSize() >> 8);
                        int i10 = 12435 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[i2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c3, scrollBarSize, i10, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(obj, objArr2)).charValue();
                    cArr4[1] = cCharValue;
                    DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda12 = defaultGainProviderExternalSyntheticLambda1;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), 11 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 12434 - TextUtils.indexOf("", ""), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    cArr3 = cArr4;
                    defaultGainProviderExternalSyntheticLambda1 = defaultGainProviderExternalSyntheticLambda12;
                    i2 = 2;
                    i4 = 0;
                    obj = null;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda13 = defaultGainProviderExternalSyntheticLambda1;
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda13.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda13.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda13, defaultGainProviderExternalSyntheticLambda13};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 16015), 14 - Color.argb(0, 0, 0, 0), 19901 - View.MeasureSpec.makeMeasureSpec(0, 0), -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            defaultGainProviderExternalSyntheticLambda1 = defaultGainProviderExternalSyntheticLambda13;
            cArr3 = cArr5;
            i2 = 2;
            i4 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i11 = $10 + 113;
        $11 = i11 % 128;
        if (i11 % 2 != 0) {
            objArr[0] = str;
        } else {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }
}
