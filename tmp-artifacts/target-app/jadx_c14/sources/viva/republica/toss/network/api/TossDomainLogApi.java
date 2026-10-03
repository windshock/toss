package viva.republica.toss.network.api;

import android.graphics.Color;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.JsonObject;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access13800;
import o.checkCanOpenLandingPage;
import o.encryptType4;
import o.getIv8;
import o.getUserCertList;
import o.htf31;
import o.liq;
import o.okycx;
import o.setCurCert;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.api.TossDomainLogApi;
import viva.republica.toss.network.api.TossDomainLogApi$LogItems$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public interface TossDomainLogApi {
    public static final String API_PATH_EVENT_LOG;
    public static final String API_PATH_EVENT_LOG_V2;
    public static final onWarmupCompleted Companion;
    public static final long IAuthTabCallback = 3513324359941133622L;

    static {
        Object[] objArr = new Object[1];
        a(new char[]{4215, 15625, 19032, 38865, 42141, 62038, 7952, 11443, 31165, 34685, 54306, 57833, 3756, 23440, 26900, 46594, 50051, 4293, 15938, 19222, 39160, 42424, 62311, '?'}, 11579 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr);
        API_PATH_EVENT_LOG_V2 = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new char[]{4215, 32527, 52820, 24023, 44165, 15424, 35612, 6789, 27021, 63819, 18446, 55295, 9908, 46710, 1400, 38135, 58279, 29545, 49701, 20978, 41142}, View.getDefaultSize(0, 0) + 28477, objArr2);
        API_PATH_EVENT_LOG = ((String) objArr2[0]).intern();
        Companion = onWarmupCompleted.onNavigationEvent;
    }

    @setCurCert(onExtraCallbackWithResult = {"ExcludeNword:true"})
    @getIv8(onExtraCallback = "v3/apps/domain/events")
    Object IAuthTabCallback(@getUserCertList @NotNull LogItems logItems, @NotNull access13800<? super Unit> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"ExcludeNword:true"})
    @getIv8(onExtraCallback = "v3/apps/domain/v2/events")
    Object onWarmupCompleted(@getUserCertList @NotNull LogItems logItems, @NotNull access13800<? super Unit> access13800Var);

    public static final class onWarmupCompleted {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char[] IAuthTabCallback = null;
        private static int IAuthTabCallbackStub = 0;
        private static int asBinder = 1;
        private static boolean asInterface;
        public static final String onExtraCallback;
        private static int onExtraCallbackWithResult;
        static final /* synthetic */ onWarmupCompleted onNavigationEvent;
        private static boolean onTransact;
        public static final String onWarmupCompleted;

        static {
            onWarmupCompleted();
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-122, -114, -117, -115, -127, -115, -125, -116, -127, -125, -117, -118, -124, -119, -120, -121, -125, -122, -123, -123, -124, -125, -126, -127}, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 127, objArr);
            onWarmupCompleted = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a(null, null, new byte[]{-122, -114, -117, -115, -127, -115, -125, -117, -118, -124, -119, -120, -121, -125, -122, -123, -123, -124, -125, -126, -127}, TextUtils.lastIndexOf("", '0') + 128, objArr2);
            onExtraCallback = ((String) objArr2[0]).intern();
            onNavigationEvent = new onWarmupCompleted();
            int i = asBinder + 87;
            IAuthTabCallbackStub = i % 128;
            int i2 = i % 2;
        }

        private onWarmupCompleted() {
        }

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
            char[] cArr2;
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr3 = IAuthTabCallback;
            if (cArr3 != null) {
                int length = cArr3.length;
                char[] cArr4 = new char[length];
                for (int i3 = 0; i3 < length; i3++) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), 77 - View.MeasureSpec.getSize(0), 20952 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr4[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr3 = cArr4;
            }
            Object[] objArr3 = {Integer.valueOf(onExtraCallbackWithResult)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), 75 - TextUtils.indexOf("", "", 0, 0), 16036 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            int i4 = 1052772399;
            if (asInterface) {
                int i5 = $11 + 39;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                int i7 = $10 + 81;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i9 = $11 + 65;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 63, Color.green(0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                }
                objArr[0] = new String(cArr5);
                return;
            }
            if (!onTransact) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr6);
                return;
            }
            int i11 = $10 + 33;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
            } else {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            }
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i12 = $11 + 85;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionGroup(0L), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 63, 12214 - TextUtils.getOffsetBefore("", 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                i4 = 1052772399;
            }
            objArr[0] = new String(cArr2);
        }

        static void onWarmupCompleted() {
            IAuthTabCallback = new char[]{32458, 32405, 32401, 32423, 32464, 32469, 32420, 32465, 32467, 32479, 32466, 32406, 32475, 32468};
            onExtraCallbackWithResult = -1184334016;
            onTransact = true;
            asInterface = true;
        }
    }

    @liq
    public static final class LogItems {
        private final List<JsonObject> items;
        public static final Companion Companion = new Companion(null);
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.api.TossDomainLogApi$LogItems$$ExternalSyntheticLambda0
            public final Object invoke() {
                return TossDomainLogApi.LogItems.onExtraCallbackWithResult();
            }
        })};

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer onExtraCallbackWithResult() {
            return new checkCanOpenLandingPage(encryptType4.IAuthTabCallback);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LogItems) && Intrinsics.areEqual(this.items, ((LogItems) obj).items);
        }

        public int hashCode() {
            return this.items.hashCode();
        }

        public String toString() {
            return "LogItems(items=" + this.items + ")";
        }

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<LogItems> serializer() {
                return TossDomainLogApi$LogItems$.serializer.INSTANCE;
            }
        }

        public /* synthetic */ LogItems(int i, List list, okycx okycxVar) {
            if (1 != (i & 1)) {
                htf31.onExtraCallbackWithResult(i, 1, TossDomainLogApi$LogItems$.serializer.INSTANCE.getDescriptor());
            }
            this.items = list;
        }

        public LogItems(@NotNull List<JsonObject> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.items = list;
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 24 - TextUtils.indexOf("", ""), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 19626, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (IAuthTabCallback ^ 5407414049857832247L);
                try {
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.green(0), ((byte) KeyEvent.getModifierMetaStateMask()) + 60, 6384 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 59 - (ViewConfiguration.getFadingEdgeLength() >> 16), 6383 - KeyEvent.keyCodeFromString(""), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }
}
