package o;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.ads.zzgc;
import com.scottyab.rootbeer.RootBeer;
import im.toss.devtool.runtime.ui.scheme.history.Hilt_SchemeHistoryActivity$5;
import im.toss.global.features.leave.test.Hilt_GlobalLeaveTestActivity$4;
import im.toss.security.impl.malware.MalwareDetectActivity$IAuthTabCallback;
import im.toss.selfprotect.DetectType$;
import im.toss.selfprotect.DetectType$Companion$;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppNode61;
import o.CacheCacheException;
import o.EngineConfig1;
import o.makePFX_WINS;
import o.s3;
import o.s5a;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class s8ExternalSyntheticLambda1 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ s8ExternalSyntheticLambda1[] $VALUES;
    public static final onNavigationEvent Companion;
    public static final s8ExternalSyntheticLambda1 DEBUGGER;
    public static final s8ExternalSyntheticLambda1 EMULATOR;
    public static final s8ExternalSyntheticLambda1 HOOK;
    private static int IAuthTabCallback = 1;
    public static final s8ExternalSyntheticLambda1 ROOT;
    public static final s8ExternalSyntheticLambda1 TAMPER_CERT;
    public static final s8ExternalSyntheticLambda1 VIRTUAL_ENVIRONMENT;
    private static int onExtraCallback = 0;
    private static long onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onTransact = 1;
    private static long onWarmupCompleted;
    private final IconRoundCornerProgressBarSavedState1 detectFactor;

    public static /* synthetic */ void $r8$lambda$LGDoTuTlvKKxRwT8e3xx1cv7sIk(Context context, int i, int i2, JsonWriterWriteObject jsonWriterWriteObject) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 9;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        checkDeviceRootedSync$lambda$0(context, i, i2, jsonWriterWriteObject);
        int i6 = onExtraCallback + 5;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void $r8$lambda$Mt8Qk2BoRhHosXz7HsfS_h9chlg(Context context, int i, JsonWriterWriteObject jsonWriterWriteObject) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 115;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        checkDeviceRootedSync$lambda$1(context, i, jsonWriterWriteObject);
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = IAuthTabCallback + 87;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private static final /* synthetic */ s8ExternalSyntheticLambda1[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        s8ExternalSyntheticLambda1[] s8externalsyntheticlambda1Arr = {DEBUGGER, EMULATOR, ROOT, HOOK, TAMPER_CERT, VIRTUAL_ENVIRONMENT};
        int i5 = i3 + 99;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return s8externalsyntheticlambda1Arr;
        }
        throw null;
    }

    public /* synthetic */ s8ExternalSyntheticLambda1(String str, int i, IconRoundCornerProgressBarSavedState1 iconRoundCornerProgressBarSavedState1, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, iconRoundCornerProgressBarSavedState1);
    }

    @JvmStatic
    private static final CacheCacheException.onNavigationEvent callback(JsonWriterWriteObject<Integer> jsonWriterWriteObject) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 43;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        CacheCacheException.onNavigationEvent onnavigationeventOnExtraCallback = onNavigationEvent.onExtraCallback(Companion, jsonWriterWriteObject);
        int i4 = IAuthTabCallback + 29;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return onnavigationeventOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<s8ExternalSyntheticLambda1> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        EnumEntries<s8ExternalSyntheticLambda1> enumEntries = $ENTRIES;
        int i4 = i3 + 53;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return enumEntries;
    }

    public static s8ExternalSyntheticLambda1 valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        s8ExternalSyntheticLambda1 s8externalsyntheticlambda1 = (s8ExternalSyntheticLambda1) Enum.valueOf(s8ExternalSyntheticLambda1.class, str);
        int i4 = IAuthTabCallback + 39;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return s8externalsyntheticlambda1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static s8ExternalSyntheticLambda1[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        s8ExternalSyntheticLambda1[] s8externalsyntheticlambda1Arr = (s8ExternalSyntheticLambda1[]) $VALUES.clone();
        int i3 = IAuthTabCallback + 47;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return s8externalsyntheticlambda1Arr;
        }
        throw null;
    }

    protected abstract s8ExternalSyntheticLambda1 checkUnsafeInternal(@NotNull Context context);

    private s8ExternalSyntheticLambda1(String str, int i, IconRoundCornerProgressBarSavedState1 iconRoundCornerProgressBarSavedState1) {
        this.detectFactor = iconRoundCornerProgressBarSavedState1;
    }

    public final IconRoundCornerProgressBarSavedState1 getDetectFactor() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 87;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        IconRoundCornerProgressBarSavedState1 iconRoundCornerProgressBarSavedState1 = this.detectFactor;
        int i5 = i2 + 13;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return iconRoundCornerProgressBarSavedState1;
    }

    static {
        onNavigationEvent();
        Object[] objArr = new Object[1];
        a(new char[]{47626, 14682, 48302, 13288, 46925, 10908, 43501, 11563}, 33618 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr);
        DEBUGGER = new s8ExternalSyntheticLambda1(((String) objArr[0]).intern(), 0) { // from class: o.s8ExternalSyntheticLambda1.IAuthTabCallback
            private static int $10 = 0;
            private static int $11 = 1;
            private static int onExtraCallback = 0;
            private static long onNavigationEvent = -8652240871095688131L;
            private static int onWarmupCompleted = 1;

            {
                IconRoundCornerProgressBarSavedState1 iconRoundCornerProgressBarSavedState1 = IconRoundCornerProgressBarSavedState1.DEBUGGER;
                DefaultConstructorMarker defaultConstructorMarker = null;
            }

            @Override // o.s8ExternalSyntheticLambda1
            protected s8ExternalSyntheticLambda1 checkUnsafeInternal(@NotNull Context context) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(context, "");
                int iOnWarmupCompleted = DataSourceBitmapLoaderExternalSyntheticLambda2.onWarmupCompleted(1);
                if (iOnWarmupCompleted == 1) {
                    return null;
                }
                int i2 = onExtraCallback + 37;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                Object[] objArr2 = new Object[1];
                c(new char[]{8556, 26767, 45755, 64758, 1770, 20490, 39470, 9304, 28261}, (ViewConfiguration.getTapTimeout() >> 16) + 18913, objArr2);
                String strIntern = ((String) objArr2[0]).intern();
                Object[] objArr3 = new Object[1];
                c(new char[]{8558, 59300, 44286, 29982, 14913, 49306, 35245, 20213, 6002, 56397, 57985, 43975, 28907, 14630, 65124, 33930, 19934}, View.combineMeasuredStates(0, 0) + 50891, objArr3);
                String strIntern2 = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                c(new char[]{8568, 5494, 18763, 48436, 61698, 9475}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 13337, objArr4);
                ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, strIntern, strIntern2, access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), Integer.valueOf(iOnWarmupCompleted))), (String) null, false, (String) null, 56, (Object) null);
                Object[] objArr5 = new Object[1];
                c(new char[]{8556, 51085, 60607, 38396, 47842, 41728, 18490, 29002, 5749, 15510, 9649, 51897, 62449, 39167, 33033, 42548, 20305, 29792}, Color.argb(0, 0, 0, 0) + 59107, objArr5);
                ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, ((String) objArr5[0]).intern(), false, (String) null, (List) null, (Map) null, (Function1) null, 62, (Object) null);
                int i4 = onWarmupCompleted + 79;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return null;
            }

            private static void c(char[] cArr, int i, Object[] objArr2) {
                int i2 = 2 % 2;
                AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
                audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
                int length = cArr.length;
                long[] jArr = new long[length];
                audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
                while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                    int i3 = $10 + 87;
                    $11 = i3 % 128;
                    if (i3 % 2 == 0) {
                        jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = s3.onWarmupCompleted.AnonymousClass2.u(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback], audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0) & (onNavigationEvent - 5407414049857832247L);
                    } else {
                        jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (5407414049857832247L ^ onNavigationEvent) ^ s3.onWarmupCompleted.AnonymousClass2.u(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback], audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0);
                    }
                    SafeWindowLayoutComponentProviderExternalSyntheticLambda1.D(audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0);
                }
                char[] cArr2 = new char[length];
                audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
                while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                    int i4 = $10 + 93;
                    $11 = i4 % 128;
                    if (i4 % 2 != 0) {
                        cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                        SafeWindowLayoutComponentProviderExternalSyntheticLambda1.D(audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0);
                    } else {
                        cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                        SafeWindowLayoutComponentProviderExternalSyntheticLambda1.D(audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0);
                        throw null;
                    }
                }
                objArr2[0] = new String(cArr2);
            }
        };
        Object[] objArr2 = new Object[1];
        a(new char[]{47627, 52258, 22105, 55393, 25227, 62655, 32455, 33019}, TextUtils.getOffsetAfter("", 0) + 30241, objArr2);
        EMULATOR = new s8ExternalSyntheticLambda1(((String) objArr2[0]).intern(), 1) { // from class: o.s8ExternalSyntheticLambda1.onExtraCallback
            private static int $10 = 0;
            private static int $11 = 1;
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;
            private static char[] onNavigationEvent = {27262, 27172, 27199, 27198, 27173, 27178, 27170, 27170, 27178, 27173, 27140, 27148, 27175, 27199, 27198, 27354, 27497, 27491, 27493, 27501, 27496, 27499, 27491, 27518, 27260, 27175, 27199, 27198, 27176, 27172, 27199, 27198, 27143, 27148, 27178, 27170, 27170, 27178, 27173, 27170, 27178, 27255, 27197, 27198, 27198, 27194, 27170};

            {
                IconRoundCornerProgressBarSavedState1 iconRoundCornerProgressBarSavedState1 = IconRoundCornerProgressBarSavedState1.EMULATOR;
                DefaultConstructorMarker defaultConstructorMarker = null;
            }

            @Override // o.s8ExternalSyntheticLambda1
            protected s8ExternalSyntheticLambda1 checkUnsafeInternal(@NotNull Context context) {
                int iOnNavigationEvent;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 53;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(context, "");
                    iOnNavigationEvent = DataSourceBitmapLoaderExternalSyntheticLambda0.onNavigationEvent(context, 1, 3);
                    if (iOnNavigationEvent == 0) {
                        return null;
                    }
                } else {
                    Intrinsics.checkNotNullParameter(context, "");
                    iOnNavigationEvent = DataSourceBitmapLoaderExternalSyntheticLambda0.onNavigationEvent(context, 1, 4);
                    if (iOnNavigationEvent == 1) {
                        return null;
                    }
                }
                int i3 = IAuthTabCallback + 1;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                containsKeyForAdObject.onExtraCallbackWithResult();
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                Object[] objArr3 = new Object[1];
                c(false, new byte[]{0, 0, 1, 0, 1, 1, 1, 1, 0}, new int[]{15, 9, 194, 0}, objArr3);
                String strIntern = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                c(false, new byte[]{1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1}, new int[]{24, 17, 0, 0}, objArr4);
                String strIntern2 = ((String) objArr4[0]).intern();
                Object[] objArr5 = new Object[1];
                c(true, new byte[]{0, 0, 0, 1, 0, 0}, new int[]{41, 6, 0, 1}, objArr5);
                ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, strIntern, strIntern2, access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr5[0]).intern(), Integer.valueOf(iOnNavigationEvent))), (String) null, false, (String) null, 56, (Object) null);
                return this;
            }

            private static void c(boolean z, byte[] bArr, int[] iArr, Object[] objArr3) {
                char[] cArr;
                int i = 2 % 2;
                TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
                int i2 = iArr[0];
                int i3 = iArr[1];
                int i4 = iArr[2];
                int i5 = iArr[3];
                char[] cArr2 = onNavigationEvent;
                if (cArr2 != null) {
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    for (int i6 = 0; i6 < length; i6++) {
                        cArr3[i6] = EngineConfig1.onNavigationEvent.AnonymousClass4.t(cArr2[i6]);
                    }
                    cArr2 = cArr3;
                }
                char[] cArr4 = new char[i3];
                System.arraycopy(cArr2, i2, cArr4, 0, i3);
                if (bArr != null) {
                    int i7 = $10 + 35;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    char[] cArr5 = new char[i3];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                    char c = 0;
                    while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                        if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                            int i9 = $10 + 3;
                            $11 = i9 % 128;
                            if (i9 % 2 == 0) {
                                cArr5[trackGroupExternalSyntheticLambda0.onNavigationEvent] = Hilt_GlobalLeaveTestActivity$4.p(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent], c);
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            cArr5[trackGroupExternalSyntheticLambda0.onNavigationEvent] = Hilt_GlobalLeaveTestActivity$4.p(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent], c);
                        } else {
                            cArr5[trackGroupExternalSyntheticLambda0.onNavigationEvent] = getExternalTransactionToken.q(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent], c);
                        }
                        c = cArr5[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                        Hilt_SchemeHistoryActivity$5.w(trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0);
                    }
                    cArr4 = cArr5;
                }
                if (i5 > 0) {
                    char[] cArr6 = new char[i3];
                    System.arraycopy(cArr4, 0, cArr6, 0, i3);
                    int i10 = i3 - i5;
                    System.arraycopy(cArr6, 0, cArr4, i10, i5);
                    System.arraycopy(cArr6, i5, cArr4, 0, i10);
                }
                if (z) {
                    int i11 = $10 + 107;
                    $11 = i11 % 128;
                    if (i11 % 2 == 0) {
                        cArr = new char[i3];
                        trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
                    } else {
                        cArr = new char[i3];
                        trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                    }
                    while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                        int i12 = $10 + 123;
                        $11 = i12 % 128;
                        int i13 = i12 % 2;
                        cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                        trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                    }
                    cArr4 = cArr;
                }
                if (i4 > 0) {
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                    while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                        int i14 = $10 + 103;
                        $11 = i14 % 128;
                        int i15 = i14 % 2;
                        cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                        trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                    }
                }
                objArr3[0] = new String(cArr4);
            }
        };
        Object[] objArr3 = new Object[1];
        a(new char[]{47644, 12576, 44099, 7033}, 35616 - TextUtils.lastIndexOf("", '0'), objArr3);
        ROOT = new s8ExternalSyntheticLambda1(((String) objArr3[0]).intern(), 2) { // from class: o.s8ExternalSyntheticLambda1.onExtraCallbackWithResult
            private static int $10 = 0;
            private static int $11 = 1;
            private static int IAuthTabCallback = -1776194565;
            private static char onExtraCallback = 27643;
            private static long onExtraCallbackWithResult = 3469238811614631873L;
            private static int onNavigationEvent = 0;
            private static int onTransact = 1;
            private static long onWarmupCompleted = 2874061455473454497L;

            private static void c(char[] cArr, int i, Object[] objArr4) {
                int i2 = 2 % 2;
                TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
                char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallbackWithResult ^ (-7907085296252847348L), cArr, i);
                timelineExternalSyntheticLambda0.onNavigationEvent = 4;
                while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
                    int i3 = $11 + 19;
                    $10 = i3 % 128;
                    int i4 = i3 % 2;
                    timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                    cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] = MalwareDetectActivity$IAuthTabCallback.onExtraCallback.e(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4], timelineExternalSyntheticLambda0.onExtraCallbackWithResult, onExtraCallbackWithResult);
                    tryTriggerOnStart.d(timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0);
                }
                String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
                int i5 = $11 + 97;
                $10 = i5 % 128;
                if (i5 % 2 == 0) {
                    objArr4[0] = str;
                } else {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }

            {
                IconRoundCornerProgressBarSavedState1 iconRoundCornerProgressBarSavedState1 = IconRoundCornerProgressBarSavedState1.ROOT;
                DefaultConstructorMarker defaultConstructorMarker = null;
            }

            @Override // o.s8ExternalSyntheticLambda1
            protected s8ExternalSyntheticLambda1 checkUnsafeInternal(@NotNull Context context) {
                boolean z;
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(context, "");
                Set<String> setOnNavigationEvent = onNavigationEvent(context);
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = setOnNavigationEvent.iterator();
                while (!(!it.hasNext())) {
                    int i2 = onNavigationEvent + 121;
                    onTransact = i2 % 128;
                    int i3 = i2 % 2;
                    Object next = it.next();
                    Object[] objArr4 = new Object[1];
                    d(KeyEvent.getDeadChar(0, 0), new char[]{27432, 9105, 55291, 10019, 34920, 9419, 11595, 41939}, new char[]{18010, 514, 48028, 19416}, (char) TextUtils.getOffsetAfter("", 0), new char[]{46413, 12772, 61277, 5796}, objArr4);
                    if (!Intrinsics.areEqual((String) next, ((String) objArr4[0]).intern())) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    Object[] objArr5 = new Object[1];
                    d(1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), new char[]{59149, 12761, 44528, 38623, 27558, 65476, 37274, 57486, 46036, 41852, 26205, 7510, 15658, 29769}, new char[]{18010, 514, 48028, 19416}, (char) (50107 - (ViewConfiguration.getLongPressTimeout() >> 16)), new char[]{60591, 63975, 47888, 38083}, objArr5);
                    if (!Intrinsics.areEqual((String) obj, ((String) objArr5[0]).intern())) {
                        arrayList2.add(obj);
                    }
                }
                boolean zIsEmpty = arrayList2.isEmpty();
                boolean z2 = !zIsEmpty;
                if (zIsEmpty) {
                    z = false;
                } else {
                    containsKeyForAdObject.onExtraCallbackWithResult();
                    Object[] objArr6 = new Object[1];
                    c(new char[]{6827, 6863, 14217, 48036, 39713, 57930, 64767, 64253, 43516, 22524, 46922, 17686, 31916, 9427, 31698, 36949, 851, 61914}, 1 - View.getDefaultSize(0, 0), objArr6);
                    ((String) objArr6[0]).intern();
                    Object[] objArr7 = new Object[1];
                    d(View.MeasureSpec.makeMeasureSpec(0, 0), new char[]{13637, 14789, 41010, 1631, 39087, 64399, 35409, 11910, 45943, 44994}, new char[]{18010, 514, 48028, 19416}, (char) (Process.myPid() >> 22), new char[]{54656, 3508, 9291, 19517}, objArr7);
                    ((String) objArr7[0]).intern();
                    Objects.toString(setOnNavigationEvent);
                    int i4 = onNavigationEvent + 73;
                    onTransact = i4 % 128;
                    int i5 = i4 % 2;
                    z = true;
                }
                if (!zIsEmpty) {
                    ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                    StringBuilder sb = new StringBuilder();
                    Object[] objArr8 = new Object[1];
                    c(new char[]{7343, 7389, 33252, 1645, 11590, 24472, 43763, 44256, 45054, 57729, 2713}, (Process.myPid() >> 22) + 1, objArr8);
                    sb.append(((String) objArr8[0]).intern());
                    sb.append(z2);
                    Object[] objArr9 = new Object[1];
                    d(ViewConfiguration.getWindowTouchSlop() >> 8, new char[]{13637, 14789, 41010, 1631, 39087, 64399, 35409, 11910, 45943, 44994}, new char[]{18010, 514, 48028, 19416}, (char) TextUtils.indexOf("", "", 0), new char[]{54656, 3508, 9291, 19517}, objArr9);
                    sb.append(((String) objArr9[0]).intern());
                    sb.append(setOnNavigationEvent);
                    Object[] objArr10 = new Object[1];
                    d(ViewConfiguration.getJumpTapTimeout() >> 16, new char[]{12996, 23235, 44169, 16219, 35348, 39535}, new char[]{18010, 514, 48028, 19416}, (char) (((Process.getThreadPriority(0) + 20) >> 6) + 17358), new char[]{50218, 10858, 52757, 41283}, objArr10);
                    Pair[] pairArr = {getWrite.IAuthTabCallback(((String) objArr10[0]).intern(), sb.toString())};
                    Object[] objArr11 = new Object[1];
                    d((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new char[]{57650, 15050, 51997, 34875, 1282, 17291, 6920, 4092, 3260, 56339, 64129, 32140, 5025, 61032, 34559, 5758}, new char[]{18010, 514, 48028, 19416}, (char) (MotionEvent.axisFromString("") + 6618), new char[]{927, 14142, 55605, 22297}, objArr11);
                    ConvertFloatArrayToByteArray.IAuthTabCallback(1167879055, zzgc.onExtraCallbackWithResult(), -1167879050, new Object[]{convertFloatArrayToByteArray, ((String) objArr11[0]).intern(), pairArr}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
                } else if (!setOnNavigationEvent.isEmpty()) {
                    ConvertFloatArrayToByteArray convertFloatArrayToByteArray2 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                    StringBuilder sb2 = new StringBuilder();
                    Object[] objArr12 = new Object[1];
                    c(new char[]{7343, 7389, 33252, 1645, 11590, 24472, 43763, 44256, 45054, 57729, 2713}, 1 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr12);
                    sb2.append(((String) objArr12[0]).intern());
                    sb2.append(z2);
                    Object[] objArr13 = new Object[1];
                    d(Color.rgb(0, 0, 0) + 16777216, new char[]{13637, 14789, 41010, 1631, 39087, 64399, 35409, 11910, 45943, 44994}, new char[]{18010, 514, 48028, 19416}, (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), new char[]{54656, 3508, 9291, 19517}, objArr13);
                    sb2.append(((String) objArr13[0]).intern());
                    sb2.append(setOnNavigationEvent);
                    Object[] objArr14 = new Object[1];
                    d((-1) - TextUtils.indexOf((CharSequence) "", '0'), new char[]{12996, 23235, 44169, 16219, 35348, 39535}, new char[]{18010, 514, 48028, 19416}, (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 17358), new char[]{50218, 10858, 52757, 41283}, objArr14);
                    Pair[] pairArr2 = {getWrite.IAuthTabCallback(((String) objArr14[0]).intern(), sb2.toString())};
                    Object[] objArr15 = new Object[1];
                    c(new char[]{22657, 22759, 5829, 43106, 47724, 61835, 63847, 65375, 60359, 30379, 42179, 16520, 16054, 1410, 26633, 38363, 16758, 53461}, Color.red(0) + 1, objArr15);
                    ConvertFloatArrayToByteArray.IAuthTabCallback(1167879055, zzgc.onExtraCallbackWithResult(), -1167879050, new Object[]{convertFloatArrayToByteArray2, ((String) objArr15[0]).intern(), pairArr2}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
                    int i6 = onNavigationEvent + 3;
                    onTransact = i6 % 128;
                    int i7 = i6 % 2;
                }
                if (!z) {
                    return null;
                }
                int i8 = onNavigationEvent + 3;
                onTransact = i8 % 128;
                int i9 = i8 % 2;
                return this;
            }

            private static void d(int i, char[] cArr, char[] cArr2, char c, char[] cArr3, Object[] objArr4) {
                int i2 = 2 % 2;
                TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
                int length = cArr3.length;
                char[] cArr4 = new char[length];
                int length2 = cArr2.length;
                char[] cArr5 = new char[length2];
                System.arraycopy(cArr3, 0, cArr4, 0, length);
                System.arraycopy(cArr2, 0, cArr5, 0, length2);
                cArr4[0] = (char) (cArr4[0] ^ c);
                cArr5[2] = (char) (cArr5[2] + ((char) i));
                int length3 = cArr.length;
                char[] cArr6 = new char[length3];
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
                while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
                    int i3 = $11 + 13;
                    $10 = i3 % 128;
                    int i4 = i3 % 2;
                    int iN = HttpDataSourceInvalidContentTypeException.n(trackSelectionParametersBuilderExternalSyntheticLambda0);
                    int iM = HttpDataSourceInvalidResponseCodeException.m(trackSelectionParametersBuilderExternalSyntheticLambda0);
                    makePFX_WINS.onNavigationEvent.C0003onNavigationEvent.k(trackSelectionParametersBuilderExternalSyntheticLambda0, cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718, cArr5[iN]);
                    cArr5[iM] = AppNode61.onNavigationEvent.l(cArr4[iM] * 32718, cArr5[iN]);
                    cArr4[iM] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                    cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iM] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onWarmupCompleted ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallback ^ 7798559133331975163L))) ^ ((char) (onExtraCallback ^ 7798559133331975163L)));
                    trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                    int i5 = $11 + 57;
                    $10 = i5 % 128;
                    int i6 = i5 % 2;
                }
                String str = new String(cArr6);
                int i7 = $11 + 51;
                $10 = i7 % 128;
                if (i7 % 2 == 0) {
                    objArr4[0] = str;
                } else {
                    int i8 = 15 / 0;
                    objArr4[0] = str;
                }
            }

            private final Set<String> onNavigationEvent(Context context) {
                Object obj;
                Object obj2;
                Object obj3;
                Object obj4;
                Object obj5;
                Object obj6;
                Object obj7;
                Object obj8;
                Object obj9;
                Object obj10;
                Object obj11;
                int i = 2 % 2;
                RootBeer rootBeer = new RootBeer(context);
                HashSet hashSet = new HashSet();
                try {
                    Result.Companion companion = Result.Companion;
                    obj = Result.constructor-impl(Boolean.valueOf(rootBeer.asInterface()));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    obj = Result.constructor-impl(ResultKt.createFailure(th));
                }
                Boolean bool = Boolean.FALSE;
                if (Result.onExtraCallback(obj)) {
                    obj = bool;
                }
                if (((Boolean) obj).booleanValue()) {
                    Object[] objArr4 = new Object[1];
                    c(new char[]{17747, 17697, 7571, 17624, 45361, 7469, 5402, 4873, 63018, 32243, 18552, 44256, 9052, 3779, 33975, 31152, 23713, 56206, 14255, 13673, 35315, 25725}, -TextUtils.lastIndexOf("", '0'), objArr4);
                    hashSet.add(((String) objArr4[0]).intern());
                }
                try {
                    Result.Companion companion3 = Result.Companion;
                    Object[] objArr5 = new Object[1];
                    c(new char[]{63537, 63554, 57453, 20300, 19669, 11856}, 1 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr5);
                    obj2 = Result.constructor-impl(Boolean.valueOf(rootBeer.onExtraCallbackWithResult(((String) objArr5[0]).intern())));
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.Companion;
                    obj2 = Result.constructor-impl(ResultKt.createFailure(th2));
                }
                Boolean bool2 = Boolean.FALSE;
                if (Result.onExtraCallback(obj2)) {
                    obj2 = bool2;
                }
                if (((Boolean) obj2).booleanValue()) {
                    Object[] objArr6 = new Object[1];
                    c(new char[]{11610, 11576, 31595, 41504, 55247, 64468, 18511, 20041, 40476, 6931, 44721, 61863, 19271}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr6);
                    hashSet.add(((String) objArr6[0]).intern());
                }
                try {
                    Result.Companion companion5 = Result.Companion;
                    Object[] objArr7 = new Object[1];
                    d((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 619388481, new char[]{24440, 33180, 40741, 28324, 4293, 21162, 19378}, new char[]{18010, 514, 48028, 19416}, (char) (ExpandableListView.getPackedPositionChild(0L) + 1), new char[]{49007, 5345, 59611, 41648}, objArr7);
                    obj3 = Result.constructor-impl(Boolean.valueOf(rootBeer.onExtraCallbackWithResult(((String) objArr7[0]).intern())));
                } catch (Throwable th3) {
                    Result.Companion companion6 = Result.Companion;
                    obj3 = Result.constructor-impl(ResultKt.createFailure(th3));
                }
                Boolean bool3 = Boolean.FALSE;
                if (Result.onExtraCallback(obj3)) {
                    obj3 = bool3;
                }
                if (((Boolean) obj3).booleanValue()) {
                    int i2 = onTransact + 99;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    Object[] objArr8 = new Object[1];
                    d(Process.getGidForName("") + 1, new char[]{59149, 12761, 44528, 38623, 27558, 65476, 37274, 57486, 46036, 41852, 26205, 7510, 15658, 29769}, new char[]{18010, 514, 48028, 19416}, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 50106), new char[]{60591, 63975, 47888, 38083}, objArr8);
                    hashSet.add(((String) objArr8[0]).intern());
                }
                try {
                    Result.Companion companion7 = Result.Companion;
                    obj4 = Result.constructor-impl(Boolean.valueOf(rootBeer.onNavigationEvent()));
                } catch (Throwable th4) {
                    Result.Companion companion8 = Result.Companion;
                    obj4 = Result.constructor-impl(ResultKt.createFailure(th4));
                }
                Boolean bool4 = Boolean.FALSE;
                if (Result.onExtraCallback(obj4)) {
                    obj4 = bool4;
                }
                if (((Boolean) obj4).booleanValue()) {
                    int i4 = onTransact + 37;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 != 0) {
                        Object[] objArr9 = new Object[1];
                        c(new char[]{21018, 21118, 32308, 26138, 53912, 16366, 9039, 9551, 57675, 7751, 27323, 39585, 13313, 27985, 42602, 20463, 19446, 47150}, TextUtils.getCapsMode("", 0, 1) + 1, objArr9);
                        obj11 = objArr9[0];
                    } else {
                        Object[] objArr10 = new Object[1];
                        c(new char[]{21018, 21118, 32308, 26138, 53912, 16366, 9039, 9551, 57675, 7751, 27323, 39585, 13313, 27985, 42602, 20463, 19446, 47150}, 1 - TextUtils.getCapsMode("", 0, 0), objArr10);
                        obj11 = objArr10[0];
                    }
                    hashSet.add(((String) obj11).intern());
                }
                try {
                    Result.Companion companion9 = Result.Companion;
                    obj5 = Result.constructor-impl(Boolean.valueOf(rootBeer.onExtraCallbackWithResult()));
                    int i5 = onTransact + 119;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                } catch (Throwable th5) {
                    Result.Companion companion10 = Result.Companion;
                    obj5 = Result.constructor-impl(ResultKt.createFailure(th5));
                }
                Boolean bool5 = Boolean.FALSE;
                if (Result.onExtraCallback(obj5)) {
                    obj5 = bool5;
                }
                if (((Boolean) obj5).booleanValue()) {
                    Object[] objArr11 = new Object[1];
                    c(new char[]{60915, 60801, 64976, 48471, 20842, 58557, 19933, 19419, 24243, 40377}, 1 - (ViewConfiguration.getTouchSlop() >> 8), objArr11);
                    hashSet.add(((String) objArr11[0]).intern());
                }
                try {
                    Result.Companion companion11 = Result.Companion;
                    obj6 = Result.constructor-impl(Boolean.valueOf(rootBeer.onTransact()));
                } catch (Throwable th6) {
                    Result.Companion companion12 = Result.Companion;
                    obj6 = Result.constructor-impl(ResultKt.createFailure(th6));
                }
                Boolean bool6 = Boolean.FALSE;
                if (Result.onExtraCallback(obj6)) {
                    obj6 = bool6;
                }
                if (!(!((Boolean) obj6).booleanValue())) {
                    int i7 = onNavigationEvent + 57;
                    onTransact = i7 % 128;
                    if (i7 % 2 == 0) {
                        Object[] objArr12 = new Object[1];
                        c(new char[]{6254, 6170, 44337, 4181, 409, 18876, 23092, 23591, 43825, 52565, 7394, 58332}, -TextUtils.indexOf((CharSequence) "", 'I'), objArr12);
                        obj10 = objArr12[0];
                    } else {
                        Object[] objArr13 = new Object[1];
                        c(new char[]{6254, 6170, 44337, 4181, 409, 18876, 23092, 23591, 43825, 52565, 7394, 58332}, -TextUtils.indexOf((CharSequence) "", '0'), objArr13);
                        obj10 = objArr13[0];
                    }
                    hashSet.add(((String) obj10).intern());
                }
                try {
                    Result.Companion companion13 = Result.Companion;
                    obj7 = Result.constructor-impl(Boolean.valueOf(rootBeer.asBinder()));
                } catch (Throwable th7) {
                    Result.Companion companion14 = Result.Companion;
                    obj7 = Result.constructor-impl(ResultKt.createFailure(th7));
                }
                Boolean bool7 = Boolean.FALSE;
                if (Result.onExtraCallback(obj7)) {
                    obj7 = bool7;
                }
                if (((Boolean) obj7).booleanValue()) {
                    Object[] objArr14 = new Object[1];
                    c(new char[]{17759, 17708, 30527, 47058, 56199, 60941, 18495, 20000, 62978, 5965, 47976, 61911}, (ViewConfiguration.getEdgeSlop() >> 16) + 1, objArr14);
                    hashSet.add(((String) objArr14[0]).intern());
                }
                try {
                    Result.Companion companion15 = Result.Companion;
                    obj8 = Result.constructor-impl(Boolean.valueOf(rootBeer.onExtraCallback()));
                } catch (Throwable th8) {
                    Result.Companion companion16 = Result.Companion;
                    obj8 = Result.constructor-impl(ResultKt.createFailure(th8));
                }
                Boolean bool8 = Boolean.FALSE;
                if (Result.onExtraCallback(obj8)) {
                    int i8 = onNavigationEvent + 3;
                    onTransact = i8 % 128;
                    int i9 = i8 % 2;
                    obj8 = bool8;
                }
                if (((Boolean) obj8).booleanValue()) {
                    Object[] objArr15 = new Object[1];
                    c(new char[]{9065, 8987, 64628, 28293, 20694, 14192, 39837, 40334, 36883, 39956, 25151, 8815, 17783, 61220}, -TextUtils.lastIndexOf("", '0'), objArr15);
                    hashSet.add(((String) objArr15[0]).intern());
                }
                try {
                    Result.Companion companion17 = Result.Companion;
                    obj9 = Result.constructor-impl(Boolean.valueOf(rootBeer.IAuthTabCallback()));
                    int i10 = onNavigationEvent + 83;
                    onTransact = i10 % 128;
                    int i11 = i10 % 2;
                } catch (Throwable th9) {
                    Result.Companion companion18 = Result.Companion;
                    obj9 = Result.constructor-impl(ResultKt.createFailure(th9));
                }
                Boolean bool9 = Boolean.FALSE;
                if (Result.onExtraCallback(obj9)) {
                    obj9 = bool9;
                }
                if (((Boolean) obj9).booleanValue()) {
                    Object[] objArr16 = new Object[1];
                    d(ViewConfiguration.getFadingEdgeLength() >> 16, new char[]{37256, 3282, 35128, 24772, 26749, 41508, 23172, 13344, 16140, 51402, 42291, 56319}, new char[]{18010, 514, 48028, 19416}, (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), new char[]{32291, 48487, 21762, 54595}, objArr16);
                    hashSet.add(((String) objArr16[0]).intern());
                }
                return hashSet;
            }
        };
        Object[] objArr4 = new Object[1];
        b(new char[]{54007, 53951, 23045, 46684, 63758, 8557, 20500, 37917}, Color.blue(0), objArr4);
        HOOK = new s8ExternalSyntheticLambda1(((String) objArr4[0]).intern(), 3) { // from class: o.s8ExternalSyntheticLambda1.onWarmupCompleted
            static int onExtraCallbackWithResult = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(onWarmupCompleted.class);

            @Override // o.s8ExternalSyntheticLambda1
            protected s8ExternalSyntheticLambda1 checkUnsafeInternal(@NotNull Context context) {
                int i = 2 % 2;
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4878);
                Intrinsics.checkNotNullParameter(context, "");
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2947);
                return null;
            }

            {
                IconRoundCornerProgressBarSavedState1 iconRoundCornerProgressBarSavedState1 = IconRoundCornerProgressBarSavedState1.HOOK;
                DefaultConstructorMarker defaultConstructorMarker = null;
            }
        };
        Object[] objArr5 = new Object[1];
        b(new char[]{49197, 49273, 62284, 7963, 35534, 21167, 54080, 5970, 28720, 33575, 55924, 42905, 41176, 21391, 27175}, TextUtils.lastIndexOf("", '0') + 1, objArr5);
        TAMPER_CERT = new s8ExternalSyntheticLambda1(((String) objArr5[0]).intern(), 4) { // from class: o.s8ExternalSyntheticLambda1.IAuthTabCallbackDefault
            private static int $10 = 0;
            private static int $11 = 1;
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;
            private static char[] onWarmupCompleted = {11785, 6979, 17647, 45470, 64340, 9225, 4541, 23305, 33884, 61870, 14994, 25653, 20874, 39621, 50195, 12653, 31416, 43006, 37183, 55956, 2001, 29019, 47737, 59331, 53507, 6747, 18402, 45293, 64077, 9991, 4291, 23070, 34664, 61648, 15858, 26442, 20609, 40364, 50991, 12393, 32178, 42874, 36917, 56733, 1693, 28707, 48501, 59069, 53355, 7519, 18090, 46079, 64818, 9858, 5085, 23907, 34320, 62413, 15489, 26160, 21484, 40146, 50722, 13067, 48315, 35313, 54845, 9051, 27024, 46812, 33597, 51622, 5862, 25361, 43073, 63107, 49961, 2129, 22197, 41930, 59436, 13633, 1003, 18490, 60850, 55547, 34609, 29290, 14492, 59334, 53876, 39084, 18411, 3994, 15044, 25877, 36991, 55975, 1515, 12397, 31379, 42438, 53262, 7013, 17829, 28702, 47873, 58768, 4334, 23338, 34416, 45259, 64267, 9815, 20653, 60838, 55546, 34609, 29248, 14484, 59351};
            private static long onExtraCallback = -699622735869781857L;

            private static void c(int i, char c, int i2, Object[] objArr6) {
                int i3 = 2 % 2;
                TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
                long[] jArr = new long[i];
                timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
                while (timelineExternalSyntheticLambda1.IAuthTabCallback < i) {
                    int i4 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                    jArr[i4] = s5a.onExtraCallbackWithResult.b(getPageByNodeId.c(onWarmupCompleted[i2 + i4]), i4, onExtraCallback, c);
                    HttpDataSourceInvalidResponseCodeException.a(timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1);
                }
                char[] cArr = new char[i];
                timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
                while (timelineExternalSyntheticLambda1.IAuthTabCallback < i) {
                    int i5 = $11 + 13;
                    $10 = i5 % 128;
                    if (i5 % 2 != 0) {
                        cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                        HttpDataSourceInvalidResponseCodeException.a(timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                    HttpDataSourceInvalidResponseCodeException.a(timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1);
                }
                String str = new String(cArr);
                int i6 = $10 + 107;
                $11 = i6 % 128;
                if (i6 % 2 != 0) {
                    objArr6[0] = str;
                } else {
                    int i7 = 17 / 0;
                    objArr6[0] = str;
                }
            }

            {
                IconRoundCornerProgressBarSavedState1 iconRoundCornerProgressBarSavedState1 = IconRoundCornerProgressBarSavedState1.TAMPER_CERT;
                DefaultConstructorMarker defaultConstructorMarker = null;
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
            
                return null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
            
                r9 = new java.lang.Object[1];
                c(android.graphics.Color.argb(0, 0, 0, 0) + 64, (char) (android.graphics.Color.green(0) + 50153), android.text.TextUtils.getOffsetAfter("", 0), r9);
                r0 = o.DatabaseIOException.onNavigationEvent(r19, ((java.lang.String) r9[0]).intern(), 1);
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0059, code lost:
            
                if (r0 == 1) goto L14;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x005b, code lost:
            
                o.containsKeyForAdObject.onExtraCallbackWithResult();
                android.view.ViewConfiguration.getJumpTapTimeout();
                android.view.ViewConfiguration.getMaximumDrawingCacheSize();
                android.view.ViewConfiguration.getTouchSlop();
                r9 = o.ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                r10 = new java.lang.Object[1];
                c((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 9, (char) (android.os.Process.myPid() >> 22), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 84, r10);
                r10 = ((java.lang.String) r10[0]).intern();
                r11 = new java.lang.Object[1];
                c(23 - (android.os.SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)), (char) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 57914), 93 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)), r11);
                r11 = ((java.lang.String) r11[0]).intern();
                r7 = new java.lang.Object[1];
                c(6 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) (android.view.MotionEvent.axisFromString("") + 1), android.view.View.resolveSizeAndState(0, 0, 0) + 115, r7);
                o.ConvertFloatArrayToByteArray.onExtraCallback(r9, r10, r11, o.access8100.onNavigationEvent(o.getWrite.IAuthTabCallback(((java.lang.String) r7[0]).intern(), java.lang.Integer.valueOf(r0))), (java.lang.String) null, false, (java.lang.String) null, 56, (java.lang.Object) null);
                r0 = o.s8ExternalSyntheticLambda1.IAuthTabCallbackDefault.onNavigationEvent + 21;
                o.s8ExternalSyntheticLambda1.IAuthTabCallbackDefault.IAuthTabCallback = r0 % 128;
                r0 = r0 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x00f7, code lost:
            
                return null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
            
                if (android.os.Process.is64Bit() == false) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
            
                if (android.os.Process.is64Bit() == false) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
            
                r0 = o.s8ExternalSyntheticLambda1.IAuthTabCallbackDefault.IAuthTabCallback + 89;
                o.s8ExternalSyntheticLambda1.IAuthTabCallbackDefault.onNavigationEvent = r0 % 128;
                r0 = r0 % 2;
             */
            @Override // o.s8ExternalSyntheticLambda1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            protected o.s8ExternalSyntheticLambda1 checkUnsafeInternal(@org.jetbrains.annotations.NotNull android.content.Context r19) {
                /*
                    Method dump skipped, instructions count: 248
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: o.s8ExternalSyntheticLambda1.IAuthTabCallbackDefault.checkUnsafeInternal(android.content.Context):o.s8ExternalSyntheticLambda1");
            }
        };
        Object[] objArr6 = new Object[1];
        a(new char[]{47640, 10502, 39966, 793, 63007, 25866, 51204, 48918, 8707, 37129, 1042, 60172, 24080, 52492, 45070, 9996, 35355, 30993, 60424}, 37633 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr6);
        VIRTUAL_ENVIRONMENT = new s8ExternalSyntheticLambda1(((String) objArr6[0]).intern(), 5) { // from class: o.s8ExternalSyntheticLambda1.onTransact
            static int IAuthTabCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(onTransact.class);

            @Override // o.s8ExternalSyntheticLambda1
            protected s8ExternalSyntheticLambda1 checkUnsafeInternal(@NotNull Context context) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback;
                int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3487);
                int i3 = i2 & iOnWarmupCompleted;
                int i4 = ((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 21) & 1;
                Intrinsics.checkNotNullParameter(context, "");
                if (i4 == 0) {
                    return null;
                }
                int i5 = 56 / 0;
                return null;
            }

            {
                IconRoundCornerProgressBarSavedState1 iconRoundCornerProgressBarSavedState1 = IconRoundCornerProgressBarSavedState1.VIRTUAL_ENVIRONMENT;
                DefaultConstructorMarker defaultConstructorMarker = null;
            }
        };
        s8ExternalSyntheticLambda1[] s8externalsyntheticlambda1Arr$values = $values();
        $VALUES = s8externalsyntheticlambda1Arr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(s8externalsyntheticlambda1Arr$values);
        Companion = new onNavigationEvent(null);
        int i = onNavigationEvent + 75;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    private static void b(char[] cArr, int i, Object[] objArr) {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onWarmupCompleted ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $10 + 67;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] = MalwareDetectActivity$IAuthTabCallback.onExtraCallback.e(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4], timelineExternalSyntheticLambda0.onExtraCallbackWithResult, onWarmupCompleted);
            tryTriggerOnStart.d(timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0);
        }
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i5 = $11 + 107;
        $10 = i5 % 128;
        if (i5 % 2 == 0) {
            objArr[0] = str;
        } else {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $11 + 19;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = s3.onWarmupCompleted.AnonymousClass2.u(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback], audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0) + (5407414049857832247L & onExtraCallbackWithResult);
            } else {
                jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (5407414049857832247L ^ onExtraCallbackWithResult) ^ s3.onWarmupCompleted.AnonymousClass2.u(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback], audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0);
            }
            SafeWindowLayoutComponentProviderExternalSyntheticLambda1.D(audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0);
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i4 = $10 + 31;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            SafeWindowLayoutComponentProviderExternalSyntheticLambda1.D(audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0);
        }
        objArr[0] = new String(cArr2);
    }

    public final s8ExternalSyntheticLambda1 safeCheck(@NotNull Context context) {
        Object obj;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        try {
            Result.Companion companion = Result.Companion;
            containsKeyForAdObject.onExtraCallbackWithResult();
            this.detectFactor.getId();
            Object[] objArr = new Object[1];
            b(new char[]{37228, 37135, 60129, 1695, 55325, 'T', 18100, 33429, 8543, 39633}, TextUtils.indexOf("", ""), objArr);
            ((String) objArr[0]).intern();
            obj = Result.constructor-impl(checkUnsafeInternal(context));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.onExtraCallback(obj)) {
            int i2 = onExtraCallback + 103;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            obj = null;
        }
        return (s8ExternalSyntheticLambda1) obj;
    }

    private static final void checkDeviceRootedSync$lambda$0(Context context, int i, int i2, JsonWriterWriteObject jsonWriterWriteObject) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 109;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(jsonWriterWriteObject, "");
        try {
            CacheCacheException.onExtraCallback(context, i, i2, onNavigationEvent.onExtraCallback(Companion, jsonWriterWriteObject));
        } catch (Throwable th) {
            if (jsonWriterWriteObject.isDisposed()) {
                return;
            }
            jsonWriterWriteObject.onExtraCallback(th);
            int i6 = IAuthTabCallback + 51;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    protected final int checkDeviceRootedSync(@NotNull Context context, int i, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Object objOnNavigationEvent = writeRaw.onNavigationEvent(new DetectType$.ExternalSyntheticLambda1(context, i, i2)).onNavigationEvent();
        Intrinsics.checkNotNullExpressionValue(objOnNavigationEvent, "");
        int iIntValue = ((Number) objOnNavigationEvent).intValue();
        int i4 = onExtraCallback + 89;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 86 / 0;
        }
        return iIntValue;
    }

    private static final void checkDeviceRootedSync$lambda$1(Context context, int i, JsonWriterWriteObject jsonWriterWriteObject) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 27;
        IAuthTabCallback = i3 % 128;
        try {
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(jsonWriterWriteObject, "");
                CacheCacheException.onExtraCallback(context, i, onNavigationEvent.onExtraCallback(Companion, jsonWriterWriteObject));
            } else {
                Intrinsics.checkNotNullParameter(jsonWriterWriteObject, "");
                CacheCacheException.onExtraCallback(context, i, onNavigationEvent.onExtraCallback(Companion, jsonWriterWriteObject));
                throw null;
            }
        } catch (Throwable th) {
            if (!jsonWriterWriteObject.isDisposed()) {
                jsonWriterWriteObject.onExtraCallback(th);
                int i4 = IAuthTabCallback + 99;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 % 4;
                }
            }
            int i6 = onExtraCallback + 91;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    protected final int checkDeviceRootedSync(@NotNull Context context, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Object objOnNavigationEvent = writeRaw.onNavigationEvent(new DetectType$.ExternalSyntheticLambda0(context, i)).onNavigationEvent();
        Intrinsics.checkNotNullExpressionValue(objOnNavigationEvent, "");
        int iIntValue = ((Number) objOnNavigationEvent).intValue();
        int i3 = onExtraCallback + 37;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return iIntValue;
    }

    static void onNavigationEvent() {
        onExtraCallbackWithResult = 6320641608436170617L;
        onWarmupCompleted = 4794451147059271450L;
    }

    public static final class onNavigationEvent {
        static int onExtraCallbackWithResult = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(onNavigationEvent.class);

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
            int i7 = ~(i | i6);
            int i8 = i4 | i7;
            int i9 = (~(i6 | (~i4))) | i;
            int i10 = i + i4 + i3 + ((-1932811043) * i2) + (1521317780 * i5);
            int i11 = i10 * i10;
            int i12 = ((i * (-919556932)) - 154402816) + ((-919556932) * i4) + ((-1121407813) * i7) + (i8 * 1121407813) + (1121407813 * i9) + (201850880 * i3) + ((-2098724864) * i2) + ((-1398800384) * i5) + ((-1444151296) * i11);
            int i13 = (i * 1794637580) + 2133191799 + (i4 * 1794637580) + (i7 * (-161)) + (i8 * 161) + (i9 * 161) + (i3 * 1794637741) + (i2 * (-1844343719)) + (i5 * (-1188939004)) + (i11 * (-394526720));
            int i14 = i12 + (i13 * i13 * 821297152);
            return i14 != 1 ? i14 != 2 ? i14 != 3 ? onNavigationEvent(objArr) : onWarmupCompleted(objArr) : onExtraCallback(objArr) : IAuthTabCallback(objArr);
        }

        private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
            JsonWriterWriteObject jsonWriterWriteObject = (JsonWriterWriteObject) objArr[0];
            int iIntValue = ((Number) objArr[1]).intValue();
            int iIntValue2 = ((Number) objArr[2]).intValue();
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1654);
            int i3 = 1 & ((((~i2) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i2)) >> 21);
            onExtraCallback(jsonWriterWriteObject, iIntValue, iIntValue2);
            if (i3 != 0) {
                return null;
            }
            int i4 = 86 / 0;
            return null;
        }

        private onNavigationEvent() {
        }

        private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
            onNavigationEvent onnavigationevent = (onNavigationEvent) objArr[0];
            JsonWriterWriteObject<Integer> jsonWriterWriteObject = (JsonWriterWriteObject) objArr[1];
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3684);
            int i3 = (~iOnWarmupCompleted) & i2;
            int i4 = (~i2) & iOnWarmupCompleted;
            int i5 = 1 & (((i4 & i3) | (i3 ^ i4)) >> 9);
            CacheCacheException.onNavigationEvent onnavigationeventIAuthTabCallback = onnavigationevent.IAuthTabCallback(jsonWriterWriteObject);
            if (i5 != 0) {
                int i6 = 83 / 0;
            }
            return onnavigationeventIAuthTabCallback;
        }

        private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
            int i = 2 % 2;
            DetectType$Companion$.ExternalSyntheticLambda0 externalSyntheticLambda0 = new DetectType$Companion$.ExternalSyntheticLambda0((JsonWriterWriteObject) objArr[1]);
            int i2 = onExtraCallbackWithResult;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5772);
            int i3 = i2 & iOnWarmupCompleted;
            if ((((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 22) & 1) != 0) {
                return externalSyntheticLambda0;
            }
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static /* synthetic */ java.lang.Object onNavigationEvent(java.lang.Object[] r6) {
            /*
                r0 = 0
                r1 = r6[r0]
                o.JsonWriterWriteObject r1 = (o.JsonWriterWriteObject) r1
                r2 = 1
                r3 = r6[r2]
                java.lang.Number r3 = (java.lang.Number) r3
                r3.intValue()
                r3 = 2
                r6 = r6[r3]
                java.lang.Number r6 = (java.lang.Number) r6
                int r6 = r6.intValue()
                int r3 = r3 % r3
                int r3 = o.s8ExternalSyntheticLambda1.onNavigationEvent.onExtraCallbackWithResult
                r4 = 601(0x259, float:8.42E-43)
                int r4 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(r4)
                r5 = r3 & r4
                int r5 = ~r5
                r3 = r3 | r4
                r3 = r3 & r5
                int r3 = r3 >> 27
                r3 = r3 & r2
                r4 = 5171(0x1433, float:7.246E-42)
                if (r3 == 0) goto L37
                boolean r3 = r1.isDisposed()
                r5 = 74
                int r5 = r5 / r0
                r0 = r3 ^ 1
                if (r0 == r2) goto L3d
                goto L4c
            L37:
                boolean r0 = r1.isDisposed()
                if (r0 != 0) goto L4c
            L3d:
                r0 = 4295(0x10c7, float:6.019E-42)
                o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(r0)
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r1.onNavigationEvent(r6)
                o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(r4)
            L4c:
                o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(r4)
                r6 = 0
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: o.s8ExternalSyntheticLambda1.onNavigationEvent.onNavigationEvent(java.lang.Object[]):java.lang.Object");
        }

        public static /* synthetic */ void IAuthTabCallback(JsonWriterWriteObject jsonWriterWriteObject, int i, int i2) {
            Object[] objArr = {jsonWriterWriteObject, Integer.valueOf(i), Integer.valueOf(i2)};
            int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            onWarmupCompleted(983320246, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -983320243, objArr, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback);
        }

        public static final /* synthetic */ CacheCacheException.onNavigationEvent onExtraCallback(onNavigationEvent onnavigationevent, JsonWriterWriteObject jsonWriterWriteObject) {
            int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            return (CacheCacheException.onNavigationEvent) onWarmupCompleted(-656028742, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback2, 656028744, new Object[]{onnavigationevent, jsonWriterWriteObject}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback);
        }

        @JvmStatic
        private final CacheCacheException.onNavigationEvent IAuthTabCallback(JsonWriterWriteObject<Integer> jsonWriterWriteObject) {
            int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            return (CacheCacheException.onNavigationEvent) onWarmupCompleted(-1796175944, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback2, 1796175945, new Object[]{this, jsonWriterWriteObject}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback);
        }

        private static final void onExtraCallback(JsonWriterWriteObject jsonWriterWriteObject, int i, int i2) {
            Object[] objArr = {jsonWriterWriteObject, Integer.valueOf(i), Integer.valueOf(i2)};
            int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            onWarmupCompleted(50297387, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -50297387, objArr, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback);
        }
    }
}
