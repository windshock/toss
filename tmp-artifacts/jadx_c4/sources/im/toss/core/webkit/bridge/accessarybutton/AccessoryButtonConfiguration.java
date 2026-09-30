package im.toss.core.webkit.bridge.accessarybutton;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.EndMotionInteraction;
import o.TombstoneProtosMemoryMappingBuilder;
import o.appInfo;
import o.kt;
import o.liq;
import o.okycx;
import o.wie2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@appInfo(IAuthTabCallback = "type")
@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class AccessoryButtonConfiguration implements Parcelable {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private static long IAuthTabCallback = 0;
    private static final wie2 json;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    public /* synthetic */ AccessoryButtonConfiguration(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ KSerializer IAuthTabCallback() throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallback = onExtraCallback();
        int i4 = onExtraCallbackWithResult + 93;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnExtraCallback;
    }

    private AccessoryButtonConfiguration() {
    }

    public /* synthetic */ AccessoryButtonConfiguration(int i, okycx okycxVar) {
    }

    public static final /* synthetic */ wie2 onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return json;
        }
        throw null;
    }

    public static final /* synthetic */ Lazy onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 53;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>> lazy = $cachedSerializer$delegate;
        int i5 = i2 + 49;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return lazy;
    }

    public static final class Companion {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public static final /* synthetic */ class onNavigationEvent implements appInfo {
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;
            private final /* synthetic */ String onWarmupCompleted;

            public onNavigationEvent(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.onWarmupCompleted = str;
            }

            public final /* synthetic */ String IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 47;
                int i3 = i2 % 128;
                IAuthTabCallback = i3;
                Object obj = null;
                if (i2 % 2 != 0) {
                    throw null;
                }
                String str = this.onWarmupCompleted;
                int i4 = i3 + 99;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    return str;
                }
                obj.hashCode();
                throw null;
            }

            public final /* synthetic */ Class annotationType() {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 23;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 79;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return appInfo.class;
            }

            public final boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (!(obj instanceof appInfo)) {
                    int i2 = onNavigationEvent + 57;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    return false;
                }
                if (Intrinsics.areEqual(IAuthTabCallback(), ((appInfo) obj).IAuthTabCallback())) {
                    return true;
                }
                int i4 = IAuthTabCallback + 89;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }

            public final int hashCode() {
                int iHashCode;
                int i = 2 % 2;
                int i2 = onNavigationEvent + 63;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    iHashCode = this.onWarmupCompleted.hashCode() ^ 707790692;
                    int i3 = 46 / 0;
                } else {
                    iHashCode = this.onWarmupCompleted.hashCode() ^ 707790692;
                }
                int i4 = IAuthTabCallback + 85;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return iHashCode;
            }

            public final String toString() {
                int i = 2 % 2;
                String str = "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=" + this.onWarmupCompleted + ")";
                int i2 = onNavigationEvent + 73;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 39;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializer = (KSerializer) AccessoryButtonConfiguration.onWarmupCompleted().getValue();
            int i4 = onNavigationEvent + 121;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return kSerializer;
        }

        public final KSerializer<AccessoryButtonConfiguration> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 87;
            onNavigationEvent = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                IAuthTabCallback();
                obj.hashCode();
                throw null;
            }
            KSerializer<AccessoryButtonConfiguration> kSerializerIAuthTabCallback = IAuthTabCallback();
            int i3 = onWarmupCompleted + 15;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                return kSerializerIAuthTabCallback;
            }
            throw null;
        }

        public final AccessoryButtonConfiguration onWarmupCompleted(@NotNull String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 39;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            wie2 wie2VarOnExtraCallbackWithResult = AccessoryButtonConfiguration.onExtraCallbackWithResult();
            wie2VarOnExtraCallbackWithResult.onExtraCallback();
            AccessoryButtonConfiguration accessoryButtonConfiguration = (AccessoryButtonConfiguration) wie2VarOnExtraCallbackWithResult.onExtraCallback(AccessoryButtonConfiguration.Companion.serializer(), str);
            int i4 = onNavigationEvent + 87;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 19 / 0;
            }
            return accessoryButtonConfiguration;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final /* synthetic */ KSerializer onExtraCallback() throws Throwable {
        int i = 2 % 2;
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AccessoryButtonConfiguration.class);
        KClass[] kClassArr = {Reflection.getOrCreateKotlinClass(IconAccessoryButtonConfiguration.class), Reflection.getOrCreateKotlinClass(IconDoubleAccessoryButtonConfiguration.class), Reflection.getOrCreateKotlinClass(TextAccessoryButtonConfiguration.class)};
        KSerializer[] kSerializerArr = {IconAccessoryButtonConfiguration$$serializer.INSTANCE, IconDoubleAccessoryButtonConfiguration$$serializer.INSTANCE, TextAccessoryButtonConfiguration$$serializer.INSTANCE};
        Object[] objArr = new Object[1];
        a(new char[]{46946, 17780, 21328, 24866}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 61978, objArr);
        kt ktVar = new kt("im.toss.core.webkit.bridge.accessarybutton.AccessoryButtonConfiguration", orCreateKotlinClass, kClassArr, kSerializerArr, new Annotation[]{new Companion.onNavigationEvent(((String) objArr[0]).intern())});
        int i2 = onWarmupCompleted + 121;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return ktVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onNavigationEvent();
        Companion = new Companion(null);
        json = EndMotionInteraction.onExtraCallback();
        $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.core.webkit.bridge.accessarybutton.AccessoryButtonConfiguration$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() throws Throwable {
                KSerializer kSerializerIAuthTabCallback;
                int i = 2 % 2;
                int i2 = onNavigationEvent + 39;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    kSerializerIAuthTabCallback = AccessoryButtonConfiguration.IAuthTabCallback();
                    int i3 = 71 / 0;
                } else {
                    kSerializerIAuthTabCallback = AccessoryButtonConfiguration.IAuthTabCallback();
                }
                int i4 = onNavigationEvent + 85;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerIAuthTabCallback;
            }
        });
        int i = onNavigationEvent + 37;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $10 + 67;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0), 24 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollBarSize() >> 8) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() + (IAuthTabCallback ^ 5407414049857832247L);
                    try {
                        Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 58, 6384 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
            } else {
                int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarSize() >> 8), (-16777192) - Color.rgb(0, 0, 0), 19626 - ExpandableListView.getPackedPositionChild(0L), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (IAuthTabCallback ^ 5407414049857832247L);
                Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), 60 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), Color.red(0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = $11 + 61;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), KeyEvent.keyCodeFromString("") + 59, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
                throw null;
            }
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            try {
                Object[] objArr7 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback6 == null) {
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 59 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        objArr[0] = new String(cArr2);
    }

    static void onNavigationEvent() {
        IAuthTabCallback = 5945447786315592225L;
    }
}
