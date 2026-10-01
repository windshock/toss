package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ImagePipelineExperimentsBuilderExternalSyntheticLambda35$IAuthTabCallback implements Parcelable {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ImagePipelineExperimentsBuilderExternalSyntheticLambda35$IAuthTabCallback[] $VALUES;
    public static final Parcelable.Creator<ImagePipelineExperimentsBuilderExternalSyntheticLambda35$IAuthTabCallback> CREATOR;
    public static final ImagePipelineExperimentsBuilderExternalSyntheticLambda35$IAuthTabCallback FAIL;
    private static long IAuthTabCallback = 0;
    public static final ImagePipelineExperimentsBuilderExternalSyntheticLambda35$IAuthTabCallback RESTRICTED;
    public static final ImagePipelineExperimentsBuilderExternalSyntheticLambda35$IAuthTabCallback SUCCESS;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    private static final /* synthetic */ ImagePipelineExperimentsBuilderExternalSyntheticLambda35$IAuthTabCallback[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 103;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        ImagePipelineExperimentsBuilderExternalSyntheticLambda35$IAuthTabCallback[] imagePipelineExperimentsBuilderExternalSyntheticLambda35$IAuthTabCallbackArr = {SUCCESS, FAIL, RESTRICTED};
        int i5 = i2 + 21;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return imagePipelineExperimentsBuilderExternalSyntheticLambda35$IAuthTabCallbackArr;
    }

    public static EnumEntries<ImagePipelineExperimentsBuilderExternalSyntheticLambda35$IAuthTabCallback> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        throw null;
    }

    public static ImagePipelineExperimentsBuilderExternalSyntheticLambda35$IAuthTabCallback valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        ImagePipelineExperimentsBuilderExternalSyntheticLambda35$IAuthTabCallback imagePipelineExperimentsBuilderExternalSyntheticLambda35$IAuthTabCallback = (ImagePipelineExperimentsBuilderExternalSyntheticLambda35$IAuthTabCallback) Enum.valueOf(ImagePipelineExperimentsBuilderExternalSyntheticLambda35$IAuthTabCallback.class, str);
        if (i3 == 0) {
            return imagePipelineExperimentsBuilderExternalSyntheticLambda35$IAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ImagePipelineExperimentsBuilderExternalSyntheticLambda35$IAuthTabCallback[] values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        ImagePipelineExperimentsBuilderExternalSyntheticLambda35$IAuthTabCallback[] imagePipelineExperimentsBuilderExternalSyntheticLambda35$IAuthTabCallbackArr = (ImagePipelineExperimentsBuilderExternalSyntheticLambda35$IAuthTabCallback[]) $VALUES.clone();
        int i4 = onWarmupCompleted + 19;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return imagePipelineExperimentsBuilderExternalSyntheticLambda35$IAuthTabCallbackArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 89;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 99;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 57;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
        parcel.writeString(name());
        if (i4 == 0) {
            int i5 = 31 / 0;
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        long j;
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $10 + 9;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - MotionEvent.axisFromString(BuildConfig.FLAVOR)), 23 - ((byte) KeyEvent.getModifierMetaStateMask()), Color.blue(0) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (IAuthTabCallback ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarSize() >> 8), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 58, 6383 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = $10 + 95;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0')), 59 - (ViewConfiguration.getTapTimeout() >> 16), 6384 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i7 = 87 / 0;
                j = 0;
            } else {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback4 == null) {
                    j = 0;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 59 - (KeyEvent.getMaxKeyCode() >> 16), 6383 - (ViewConfiguration.getLongPressTimeout() >> 16), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                } else {
                    j = 0;
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            int i8 = $11 + 57;
            $10 = i8 % 128;
            int i9 = i8 % 2;
        }
        objArr[0] = new String(cArr2);
    }

    private ImagePipelineExperimentsBuilderExternalSyntheticLambda35$IAuthTabCallback(String str, int i) {
    }

    static {
        IAuthTabCallback();
        Object[] objArr = new Object[1];
        a(new char[]{49557, 37030, 25583, 12826, 34135, 22428, 9899}, 20789 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
        SUCCESS = new ImagePipelineExperimentsBuilderExternalSyntheticLambda35$IAuthTabCallback(((String) objArr[0]).intern(), 0);
        Object[] objArr2 = new Object[1];
        a(new char[]{49536, 47738, 13941, 45693}, Color.argb(0, 0, 0, 0) + 31741, objArr2);
        FAIL = new ImagePipelineExperimentsBuilderExternalSyntheticLambda35$IAuthTabCallback(((String) objArr2[0]).intern(), 1);
        RESTRICTED = new ImagePipelineExperimentsBuilderExternalSyntheticLambda35$IAuthTabCallback("RESTRICTED", 2);
        ImagePipelineExperimentsBuilderExternalSyntheticLambda35$IAuthTabCallback[] imagePipelineExperimentsBuilderExternalSyntheticLambda35$IAuthTabCallbackArr$values = $values();
        $VALUES = imagePipelineExperimentsBuilderExternalSyntheticLambda35$IAuthTabCallbackArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(imagePipelineExperimentsBuilderExternalSyntheticLambda35$IAuthTabCallbackArr$values);
        CREATOR = new Parcelable.Creator<ImagePipelineExperimentsBuilderExternalSyntheticLambda35$IAuthTabCallback>() { // from class: o.ImagePipelineExperimentsBuilderExternalSyntheticLambda35$IAuthTabCallback.onWarmupCompleted
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final ImagePipelineExperimentsBuilderExternalSyntheticLambda35$IAuthTabCallback[] IAuthTabCallback(int i) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 11;
                onExtraCallback = i3 % 128;
                ImagePipelineExperimentsBuilderExternalSyntheticLambda35$IAuthTabCallback[] imagePipelineExperimentsBuilderExternalSyntheticLambda35$IAuthTabCallbackArr = new ImagePipelineExperimentsBuilderExternalSyntheticLambda35$IAuthTabCallback[i];
                if (i3 % 2 != 0) {
                    return imagePipelineExperimentsBuilderExternalSyntheticLambda35$IAuthTabCallbackArr;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ ImagePipelineExperimentsBuilderExternalSyntheticLambda35$IAuthTabCallback createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 65;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                ImagePipelineExperimentsBuilderExternalSyntheticLambda35$IAuthTabCallback imagePipelineExperimentsBuilderExternalSyntheticLambda35$IAuthTabCallbackOnExtraCallback = onExtraCallback(parcel);
                if (i3 != 0) {
                    int i4 = 56 / 0;
                }
                int i5 = onNavigationEvent + 119;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 6 / 0;
                }
                return imagePipelineExperimentsBuilderExternalSyntheticLambda35$IAuthTabCallbackOnExtraCallback;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ ImagePipelineExperimentsBuilderExternalSyntheticLambda35$IAuthTabCallback[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 103;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    return IAuthTabCallback(i);
                }
                IAuthTabCallback(i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final ImagePipelineExperimentsBuilderExternalSyntheticLambda35$IAuthTabCallback onExtraCallback(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 47;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
                ImagePipelineExperimentsBuilderExternalSyntheticLambda35$IAuthTabCallback imagePipelineExperimentsBuilderExternalSyntheticLambda35$IAuthTabCallbackValueOf = ImagePipelineExperimentsBuilderExternalSyntheticLambda35$IAuthTabCallback.valueOf(parcel.readString());
                int i4 = onNavigationEvent + 83;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return imagePipelineExperimentsBuilderExternalSyntheticLambda35$IAuthTabCallbackValueOf;
            }
        };
        int i = onExtraCallback + 77;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    static void IAuthTabCallback() {
        IAuthTabCallback = 3040924961692534001L;
    }
}
