package run.granite.lottie;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.cancelExport;
import o.cancelImport;
import o.exportCertV1;
import o.exportCertV2;
import o.getIv3;
import o.getIvG;
import o.getKeyC;
import o.importCertV1;
import o.importCertV2;
import o.isValidCertNum;
import o.r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI;
import o.transV2AuthURLForQRCode;
import o.transV2ExportCert;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class GraniteLottieView extends FrameLayout implements getKeyC {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onWarmupCompleted Companion;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int access000 = 0;
    private static int access100 = 1;
    private static long asBinder = 0;
    private static int getInterfaceDescriptor = 1;
    private View IAuthTabCallback;
    private transV2ExportCert IAuthTabCallbackDefault;
    private boolean IAuthTabCallbackStub;
    private String asInterface;
    private String onExtraCallback;
    private final cancelExport onExtraCallbackWithResult;
    private String onNavigationEvent;
    private boolean onTransact;
    private String onWarmupCompleted;

    static {
        asInterface();
        Companion = new onWarmupCompleted(null);
        int i = getInterfaceDescriptor + 49;
        IAuthTabCallbackStubProxy = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraniteLottieView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
        this.onExtraCallbackWithResult = new cancelExport(0.0f, false, false, 0.0f, (importCertV1) null, (importCertV2) null, (List) null, (List) null, false, false, false, false, (String) null, (Float) null, 16383, (DefaultConstructorMarker) null);
        transV2ExportCert transv2exportcertOnNavigationEvent = isValidCertNum.onExtraCallbackWithResult.onNavigationEvent();
        this.IAuthTabCallbackDefault = transv2exportcertOnNavigationEvent;
        if (transv2exportcertOnNavigationEvent != null) {
            View viewIAuthTabCallback = transv2exportcertOnNavigationEvent.IAuthTabCallback(context);
            this.IAuthTabCallback = viewIAuthTabCallback;
            if (viewIAuthTabCallback != null) {
                viewIAuthTabCallback.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            }
            View view = this.IAuthTabCallback;
            if (view != null) {
                addView(view);
            }
            View view2 = this.IAuthTabCallback;
            if (view2 != null) {
                int i = access000 + 15;
                access100 = i % 128;
                int i2 = i % 2;
                transv2exportcertOnNavigationEvent.IAuthTabCallback(this, view2);
                int i3 = 2 % 2;
            }
        }
        int i4 = access100 + 125;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    public final void setSourceName(@Nullable String str) {
        int i = 2 % 2;
        if (this.IAuthTabCallbackDefault != null) {
            int i2 = access000 + 63;
            access100 = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (str == null || str.length() <= 0) {
                return;
            }
            int i3 = access000 + 19;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            if (Intrinsics.areEqual(str, this.onExtraCallback)) {
                return;
            }
            int i5 = access100 + 65;
            access000 = i5 % 128;
            if (i5 % 2 == 0) {
                this.onExtraCallback = str;
                this.onWarmupCompleted = null;
                this.asInterface = null;
                this.onNavigationEvent = null;
                asBinder();
                return;
            }
            this.onExtraCallback = str;
            this.onWarmupCompleted = null;
            this.asInterface = null;
            this.onNavigationEvent = null;
            asBinder();
            obj.hashCode();
            throw null;
        }
    }

    public final void setSourceJson(@Nullable String str) {
        int i = 2 % 2;
        int i2 = access000 + 11;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        if (this.IAuthTabCallbackDefault != null) {
            int i5 = i3 + 27;
            access000 = i5 % 128;
            Object obj = null;
            if (i5 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (str == null || str.length() <= 0) {
                return;
            }
            int i6 = access000 + 29;
            access100 = i6 % 128;
            int i7 = i6 % 2;
            if (Intrinsics.areEqual(str, this.onWarmupCompleted)) {
                return;
            }
            this.onWarmupCompleted = str;
            this.onExtraCallback = null;
            this.asInterface = null;
            this.onNavigationEvent = null;
            asBinder();
            int i8 = access100 + 49;
            access000 = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i3 = $10 + 55;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i5 = $10 + 25;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 24, 19627 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i6] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() | (asBinder + 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getSize(0), 59 - Color.red(0), 6383 - (ViewConfiguration.getScrollBarSize() >> 8), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i7 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0) + 1), 23 - MotionEvent.axisFromString(BuildConfig.FLAVOR), 19627 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i7] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (asBinder ^ 5407414049857832247L);
                    Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 58, (ViewConfiguration.getTapTimeout() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i8 = $10 + 23;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(BuildConfig.FLAVOR), 59 - TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0), 6383 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
                int i9 = 5 / 0;
            } else {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr7 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback6 == null) {
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0), TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0') + 60, 6383 - Color.green(0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
            }
        }
        objArr[0] = new String(cArr2);
    }

    public final void setSourceURL(@Nullable String str) {
        int i = 2 % 2;
        if (this.IAuthTabCallbackDefault != null) {
            int i2 = access000;
            int i3 = i2 + 99;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            if (str != null) {
                int i5 = i2 + 57;
                access100 = i5 % 128;
                Object obj = null;
                if (i5 % 2 != 0) {
                    if (str.length() <= 0 || Intrinsics.areEqual(str, this.asInterface)) {
                        return;
                    }
                    this.asInterface = str;
                    this.onExtraCallback = null;
                    this.onWarmupCompleted = null;
                    this.onNavigationEvent = null;
                    asBinder();
                    return;
                }
                str.length();
                obj.hashCode();
                throw null;
            }
        }
    }

    public final void setSourceDotLottieURI(@Nullable String str) {
        int i = 2 % 2;
        if (this.IAuthTabCallbackDefault == null || str == null) {
            return;
        }
        int i2 = access000 + 61;
        access100 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            str.length();
            obj.hashCode();
            throw null;
        }
        if (str.length() > 0) {
            int i3 = access100 + 85;
            access000 = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.areEqual(str, this.onNavigationEvent);
                obj.hashCode();
                throw null;
            }
            if (Intrinsics.areEqual(str, this.onNavigationEvent)) {
                return;
            }
            this.onNavigationEvent = str;
            this.onExtraCallback = null;
            this.onWarmupCompleted = null;
            this.asInterface = null;
            asBinder();
            int i4 = access100 + 55;
            access000 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c A[PHI: r6
      0x003c: PHI (r6v6 o.transV2ExportCert) = (r6v5 o.transV2ExportCert), (r6v7 o.transV2ExportCert) binds: [B:14:0x003a, B:11:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setSpeed(double d) {
        transV2ExportCert transv2exportcert;
        int i = 2 % 2;
        int i2 = access100 + 65;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        float f = (float) d;
        this.onExtraCallbackWithResult.onExtraCallbackWithResult(f);
        Object obj = null;
        if (this.onTransact) {
            int i4 = access100;
            int i5 = i4 + 39;
            access000 = i5 % 128;
            if (i5 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            View view = this.IAuthTabCallback;
            if (view != null) {
                int i6 = i4 + 49;
                access000 = i6 % 128;
                if (i6 % 2 != 0) {
                    transv2exportcert = this.IAuthTabCallbackDefault;
                    int i7 = 14 / 0;
                    if (transv2exportcert != null) {
                        transv2exportcert.onExtraCallbackWithResult(f, view);
                    }
                } else {
                    transv2exportcert = this.IAuthTabCallbackDefault;
                    if (transv2exportcert != null) {
                    }
                }
            }
        }
        int i8 = access000 + 123;
        access100 = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    public final void setLoop(boolean z) {
        int i = 2 % 2;
        this.onExtraCallbackWithResult.asBinder(z);
        if (this.onTransact) {
            int i2 = access000;
            int i3 = i2 + 111;
            access100 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            View view = this.IAuthTabCallback;
            if (view != null) {
                int i4 = i2 + 37;
                access100 = i4 % 128;
                int i5 = i4 % 2;
                transV2ExportCert transv2exportcert = this.IAuthTabCallbackDefault;
                if (transv2exportcert != null) {
                    transv2exportcert.onExtraCallbackWithResult(z, view);
                }
            }
        }
        int i6 = access000 + 87;
        access100 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 55 / 0;
        }
    }

    public final void setAutoPlay(boolean z) {
        transV2ExportCert transv2exportcert;
        int i = 2 % 2;
        this.IAuthTabCallbackStub = z;
        this.onExtraCallbackWithResult.onExtraCallbackWithResult(z);
        if (z) {
            int i2 = access000 + 27;
            int i3 = i2 % 128;
            access100 = i3;
            int i4 = i2 % 2;
            if (this.onTransact) {
                int i5 = i3 + 37;
                int i6 = i5 % 128;
                access000 = i6;
                if (i5 % 2 != 0) {
                    throw null;
                }
                View view = this.IAuthTabCallback;
                if (view == null || (transv2exportcert = this.IAuthTabCallbackDefault) == null) {
                    return;
                }
                int i7 = i6 + 7;
                access100 = i7 % 128;
                int i8 = i7 % 2;
                transv2exportcert.onExtraCallbackWithResult(view, -1, -1);
            }
        }
    }

    public final void setProgress(float f) {
        transV2ExportCert transv2exportcert;
        int i = 2 % 2;
        this.onExtraCallbackWithResult.IAuthTabCallback(f);
        if (this.onTransact) {
            int i2 = access100;
            int i3 = i2 + 43;
            access000 = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            View view = this.IAuthTabCallback;
            if (view == null || (transv2exportcert = this.IAuthTabCallbackDefault) == null) {
                return;
            }
            int i4 = i2 + 57;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            transv2exportcert.onWarmupCompleted(f, view);
            if (i5 != 0) {
                int i6 = 45 / 0;
            }
        }
    }

    public final void setResizeMode(@Nullable String str) {
        int i = 2 % 2;
        int i2 = access000 + 121;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallbackWithResult.onWarmupCompleted(importCertV1.Companion.onExtraCallback(str));
        int i4 = access100 + 89;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setRenderMode(@Nullable String str) {
        int i = 2 % 2;
        int i2 = access100 + 47;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallbackWithResult.onWarmupCompleted(importCertV2.Companion.IAuthTabCallback(str));
        int i4 = access100 + 77;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setCacheComposition(boolean z) {
        int i = 2 % 2;
        int i2 = access000 + 3;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            this.onExtraCallbackWithResult.IAuthTabCallback(z);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.onExtraCallbackWithResult.IAuthTabCallback(z);
        int i3 = access100 + 37;
        access000 = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void setEnableMergePathsAndroidForKitKatAndAbove(boolean z) {
        int i = 2 % 2;
        int i2 = access000 + 75;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            this.onExtraCallbackWithResult.onWarmupCompleted(z);
            int i3 = 77 / 0;
        } else {
            this.onExtraCallbackWithResult.onWarmupCompleted(z);
        }
        int i4 = access100 + 109;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setEnableSafeModeAndroid(boolean z) {
        int i = 2 % 2;
        int i2 = access100 + 97;
        access000 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.onExtraCallbackWithResult.onNavigationEvent(z);
            throw null;
        }
        this.onExtraCallbackWithResult.onNavigationEvent(z);
        int i3 = access000 + 49;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void setHardwareAccelerationAndroid(boolean z) {
        int i = 2 % 2;
        int i2 = access000 + 27;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallbackWithResult.onExtraCallback(z);
        if (i3 == 0) {
            throw null;
        }
    }

    public final void setImageAssetsFolder(@Nullable String str) {
        int i = 2 % 2;
        int i2 = access000 + 29;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            this.onExtraCallbackWithResult.onNavigationEvent(str);
        } else {
            this.onExtraCallbackWithResult.onNavigationEvent(str);
            int i3 = 2 / 0;
        }
    }

    public final void setDuration(double d) {
        Float fValueOf;
        int i = 2 % 2;
        cancelExport cancelexport = this.onExtraCallbackWithResult;
        if (d > 0.0d) {
            int i2 = access100 + 43;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            fValueOf = Float.valueOf((float) d);
            int i4 = access000 + 111;
            access100 = i4 % 128;
            int i5 = i4 % 2;
        } else {
            fValueOf = null;
        }
        cancelexport.IAuthTabCallback(fValueOf);
    }

    public final void setColorFilters(@Nullable List<? extends Map<String, ? extends Object>> list) {
        getIvG getivg;
        transV2ExportCert transv2exportcert;
        String str;
        int i = 2 % 2;
        if (list != null) {
            cancelExport cancelexport = this.onExtraCallbackWithResult;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (true) {
                getivg = null;
                if (!it.hasNext()) {
                    break;
                }
                int i2 = access000 + 119;
                access100 = i2 % 128;
                int i3 = i2 % 2;
                Map map = (Map) it.next();
                Object obj = map.get("keypath");
                if (obj instanceof String) {
                    str = (String) obj;
                } else {
                    int i4 = access000 + 31;
                    access100 = i4 % 128;
                    int i5 = i4 % 2;
                    str = null;
                }
                if (str == null) {
                    int i6 = access100 + 121;
                    access000 = i6 % 128;
                    int i7 = i6 % 2;
                } else {
                    Object obj2 = map.get("color");
                    String str2 = obj2 instanceof String ? (String) obj2 : null;
                    if (str2 != null) {
                        try {
                            getivg = new getIvG(str, Color.parseColor(str2));
                        } catch (Exception unused) {
                        }
                    }
                }
                if (getivg != null) {
                    arrayList.add(getivg);
                }
            }
            cancelexport.onNavigationEvent(arrayList);
            if (this.onTransact) {
                int i8 = access000 + 101;
                access100 = i8 % 128;
                if (i8 % 2 == 0) {
                    getivg.hashCode();
                    throw null;
                }
                View view = this.IAuthTabCallback;
                if (view == null || (transv2exportcert = this.IAuthTabCallbackDefault) == null) {
                    return;
                }
                transv2exportcert.onExtraCallbackWithResult(this.onExtraCallbackWithResult.onWarmupCompleted(), view);
            }
        }
    }

    public final void setTextFiltersAndroid(@Nullable List<? extends Map<String, ? extends Object>> list) throws Throwable {
        View view;
        String str;
        String str2;
        int i = 2 % 2;
        if (list != null) {
            cancelExport cancelexport = this.onExtraCallbackWithResult;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (!(!it.hasNext())) {
                Map map = (Map) it.next();
                Object obj = map.get("find");
                transV2AuthURLForQRCode transv2authurlforqrcode = null;
                if (!(!(obj instanceof String))) {
                    int i2 = access000 + 53;
                    access100 = i2 % 128;
                    if (i2 % 2 == 0) {
                        throw null;
                    }
                    str = (String) obj;
                } else {
                    str = null;
                }
                if (str != null) {
                    Object[] objArr = new Object[1];
                    a(new char[]{3377, 3003, '\t', 7928, 5974, 11313, 10888}, 1693 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr);
                    Object obj2 = map.get(((String) objArr[0]).intern());
                    if (obj2 instanceof String) {
                        int i3 = access000 + 3;
                        access100 = i3 % 128;
                        int i4 = i3 % 2;
                        str2 = (String) obj2;
                    } else {
                        str2 = null;
                    }
                    if (str2 != null) {
                        transv2authurlforqrcode = new transV2AuthURLForQRCode(str, str2);
                    }
                }
                if (transv2authurlforqrcode != null) {
                    arrayList.add(transv2authurlforqrcode);
                }
            }
            cancelexport.IAuthTabCallback(arrayList);
            if (!this.onTransact) {
                return;
            }
            int i5 = access100 + 45;
            access000 = i5 % 128;
            if (i5 % 2 != 0) {
                view = this.IAuthTabCallback;
                int i6 = 64 / 0;
                if (view == null) {
                    return;
                }
            } else {
                view = this.IAuthTabCallback;
                if (view == null) {
                    return;
                }
            }
            transV2ExportCert transv2exportcert = this.IAuthTabCallbackDefault;
            if (transv2exportcert != null) {
                transv2exportcert.onNavigationEvent(this.onExtraCallbackWithResult.IAuthTabCallbackStubProxy(), view);
            }
        }
    }

    public final void onExtraCallback(int i, int i2) {
        int i3 = 2 % 2;
        View view = this.IAuthTabCallback;
        if (view != null) {
            int i4 = access000 + 93;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            transV2ExportCert transv2exportcert = this.IAuthTabCallbackDefault;
            if (transv2exportcert != null) {
                transv2exportcert.onExtraCallbackWithResult(view, i, i2);
            }
        }
        int i6 = access000 + 63;
        access100 = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void onWarmupCompleted() {
        transV2ExportCert transv2exportcert;
        int i = 2 % 2;
        int i2 = access000 + 71;
        int i3 = i2 % 128;
        access100 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        View view = this.IAuthTabCallback;
        if (view == null || (transv2exportcert = this.IAuthTabCallbackDefault) == null) {
            return;
        }
        int i4 = i3 + 103;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        transv2exportcert.onWarmupCompleted(view);
    }

    public final void onTransact() {
        transV2ExportCert transv2exportcert;
        int i = 2 % 2;
        int i2 = access000 + 55;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        View view = this.IAuthTabCallback;
        if (view != null) {
            int i5 = i3 + 73;
            access000 = i5 % 128;
            if (i5 % 2 != 0) {
                transv2exportcert = this.IAuthTabCallbackDefault;
                int i6 = 41 / 0;
                if (transv2exportcert == null) {
                    return;
                }
            } else {
                transv2exportcert = this.IAuthTabCallbackDefault;
                if (transv2exportcert == null) {
                    return;
                }
            }
            int i7 = i3 + 91;
            access000 = i7 % 128;
            int i8 = i7 % 2;
            transv2exportcert.IAuthTabCallback(view);
            if (i8 != 0) {
                throw null;
            }
        }
    }

    public final void IAuthTabCallback() {
        int i = 2 % 2;
        View view = this.IAuthTabCallback;
        if (view != null) {
            int i2 = access000 + 121;
            access100 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            transV2ExportCert transv2exportcert = this.IAuthTabCallbackDefault;
            if (transv2exportcert != null) {
                transv2exportcert.onNavigationEvent(view);
                int i3 = access000 + 95;
                access100 = i3 % 128;
                int i4 = i3 % 2;
            }
        }
    }

    public final void onExtraCallback() {
        int i = 2 % 2;
        View view = this.IAuthTabCallback;
        if (view != null) {
            int i2 = access000 + 29;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            transV2ExportCert transv2exportcert = this.IAuthTabCallbackDefault;
            if (transv2exportcert != null) {
                transv2exportcert.onExtraCallbackWithResult(view);
            }
        }
        int i4 = access000 + 107;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void asBinder() {
        View view;
        int i = 2 % 2;
        this.onTransact = false;
        transV2ExportCert transv2exportcert = this.IAuthTabCallbackDefault;
        if (transv2exportcert != null && (view = this.IAuthTabCallback) != null) {
            int i2 = access100;
            int i3 = i2 + 65;
            access000 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onExtraCallback;
            if (str != null) {
                int i5 = i2 + 19;
                access000 = i5 % 128;
                int i6 = i5 % 2;
                if (str.length() != 0) {
                    int i7 = access100 + 59;
                    access000 = i7 % 128;
                    if (i7 % 2 == 0) {
                        String str2 = this.onExtraCallback;
                        Intrinsics.checkNotNull(str2);
                        transv2exportcert.onWarmupCompleted(str2, view, this.onExtraCallbackWithResult);
                        return;
                    } else {
                        String str3 = this.onExtraCallback;
                        Intrinsics.checkNotNull(str3);
                        transv2exportcert.onWarmupCompleted(str3, view, this.onExtraCallbackWithResult);
                        throw null;
                    }
                }
            }
            String str4 = this.onWarmupCompleted;
            if (str4 != null && str4.length() != 0) {
                String str5 = this.onWarmupCompleted;
                Intrinsics.checkNotNull(str5);
                transv2exportcert.onExtraCallback(str5, view, this.onExtraCallbackWithResult);
                return;
            }
            String str6 = this.asInterface;
            if (str6 != null && str6.length() != 0) {
                String str7 = this.asInterface;
                Intrinsics.checkNotNull(str7);
                transv2exportcert.onExtraCallbackWithResult(str7, view, this.onExtraCallbackWithResult);
                return;
            }
            String str8 = this.onNavigationEvent;
            if (str8 != null) {
                int i8 = access100 + 43;
                access000 = i8 % 128;
                int i9 = i8 % 2;
                if (str8.length() != 0) {
                    String str9 = this.onNavigationEvent;
                    Intrinsics.checkNotNull(str9);
                    transv2exportcert.IAuthTabCallback(str9, view, this.onExtraCallbackWithResult);
                }
            }
        }
        int i10 = access100 + 101;
        access000 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 12 / 0;
        }
    }

    public void onExtraCallbackWithResult() {
        transV2ExportCert transv2exportcert;
        int i = 2 % 2;
        this.onTransact = true;
        IAuthTabCallback(new exportCertV1(IAuthTabCallbackDefault(), getId()));
        if (this.IAuthTabCallbackStub) {
            int i2 = access100 + 103;
            int i3 = i2 % 128;
            access000 = i3;
            int i4 = i2 % 2;
            View view = this.IAuthTabCallback;
            if (view == null || (transv2exportcert = this.IAuthTabCallbackDefault) == null) {
                return;
            }
            int i5 = i3 + 107;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            transv2exportcert.onExtraCallbackWithResult(view, -1, -1);
            int i7 = access100 + 97;
            access000 = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    public void onExtraCallback(boolean z) {
        int i = 2 % 2;
        IAuthTabCallback(new cancelImport(IAuthTabCallbackDefault(), getId(), z));
        int i2 = access100 + 29;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        IAuthTabCallback(new getIv3(IAuthTabCallbackDefault(), getId(), str));
        int i2 = access100 + 125;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 40 / 0;
        }
    }

    public void onNavigationEvent() {
        int i = 2 % 2;
        IAuthTabCallback(new exportCertV2(IAuthTabCallbackDefault(), getId()));
        int i2 = access100 + 123;
        access000 = i2 % 128;
        int i3 = i2 % 2;
    }

    private final int IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = access000 + 115;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI.onExtraCallback(this);
        int i4 = access000 + 125;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return iOnExtraCallback;
    }

    private final void IAuthTabCallback(Event<?> event) {
        EventDispatcher eventDispatcherOnExtraCallbackWithResult;
        int i = 2 % 2;
        ReactContext context = getContext();
        ReactContext reactContext = null;
        if (context instanceof ReactContext) {
            int i2 = access000 + 91;
            access100 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            reactContext = context;
        }
        if (reactContext == null || (eventDispatcherOnExtraCallbackWithResult = r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI.onExtraCallbackWithResult(reactContext, getId())) == null) {
            return;
        }
        int i3 = access000 + 83;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        eventDispatcherOnExtraCallbackWithResult.onWarmupCompleted(event);
    }

    static void asInterface() {
        asBinder = 296593999988099188L;
    }
}
