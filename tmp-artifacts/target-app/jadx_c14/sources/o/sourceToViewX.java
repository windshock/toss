package o;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.R;
import viva.republica.toss.util.RRNUtils;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class sourceToViewX {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ sourceToViewX[] $VALUES;
    public static final IAuthTabCallback Companion;
    public static final sourceToViewX FAMILY_RELATIONS_NAME_MATCH_FAILED = new sourceToViewX("FAMILY_RELATIONS_NAME_MATCH_FAILED", 0);
    public static final sourceToViewX FAMILY_RELATIONS_BIRTHDAY_MATCH_FAILED = new sourceToViewX("FAMILY_RELATIONS_BIRTHDAY_MATCH_FAILED", 1);
    public static final sourceToViewX FAMILY_RELATIONS_GENDER_MATCH_FAILED = new sourceToViewX("FAMILY_RELATIONS_GENDER_MATCH_FAILED", 2);
    public static final sourceToViewX HOUSE_HOLD_NAME_MATCH_FAILED = new sourceToViewX("HOUSE_HOLD_NAME_MATCH_FAILED", 3);
    public static final sourceToViewX HOUSE_HOLD_BIRTHDAY_MATCH_FAILED = new sourceToViewX("HOUSE_HOLD_BIRTHDAY_MATCH_FAILED", 4);
    public static final sourceToViewX HOUSE_HOLD_GENDER_MATCH_FAILED = new sourceToViewX("HOUSE_HOLD_GENDER_MATCH_FAILED", 5);
    public static final sourceToViewX HOUSE_HOLD_NOT_CHILDREN = new sourceToViewX("HOUSE_HOLD_NOT_CHILDREN", 6);
    public static final sourceToViewX CERTIFY_SUCCESS = new sourceToViewX("CERTIFY_SUCCESS", 7);

    private static final /* synthetic */ sourceToViewX[] $values() {
        return new sourceToViewX[]{FAMILY_RELATIONS_NAME_MATCH_FAILED, FAMILY_RELATIONS_BIRTHDAY_MATCH_FAILED, FAMILY_RELATIONS_GENDER_MATCH_FAILED, HOUSE_HOLD_NAME_MATCH_FAILED, HOUSE_HOLD_BIRTHDAY_MATCH_FAILED, HOUSE_HOLD_GENDER_MATCH_FAILED, HOUSE_HOLD_NOT_CHILDREN, CERTIFY_SUCCESS};
    }

    public static EnumEntries<sourceToViewX> getEntries() {
        return $ENTRIES;
    }

    public static sourceToViewX valueOf(String str) {
        return (sourceToViewX) Enum.valueOf(sourceToViewX.class, str);
    }

    public static sourceToViewX[] values() {
        return (sourceToViewX[]) $VALUES.clone();
    }

    private sourceToViewX(String str, int i) {
    }

    static {
        sourceToViewX[] sourcetoviewxArr$values = $values();
        $VALUES = sourcetoviewxArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(sourcetoviewxArr$values);
        Companion = new IAuthTabCallback(null);
    }

    public static final class IAuthTabCallback {
        private static int $10 = 0;
        private static int $11 = 1;
        private static long onExtraCallback = 8037538136629333322L;
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        /* renamed from: o.sourceToViewX$IAuthTabCallback$IAuthTabCallback, reason: collision with other inner class name */
        public static final /* synthetic */ class C0015IAuthTabCallback {
            public static final /* synthetic */ int[] IAuthTabCallback;

            static {
                int[] iArr = new int[sourceToViewX.values().length];
                try {
                    iArr[sourceToViewX.FAMILY_RELATIONS_NAME_MATCH_FAILED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[sourceToViewX.FAMILY_RELATIONS_BIRTHDAY_MATCH_FAILED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[sourceToViewX.FAMILY_RELATIONS_GENDER_MATCH_FAILED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[sourceToViewX.HOUSE_HOLD_NAME_MATCH_FAILED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[sourceToViewX.HOUSE_HOLD_BIRTHDAY_MATCH_FAILED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[sourceToViewX.HOUSE_HOLD_GENDER_MATCH_FAILED.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[sourceToViewX.HOUSE_HOLD_NOT_CHILDREN.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[sourceToViewX.CERTIFY_SUCCESS.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                IAuthTabCallback = iArr;
            }
        }

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final String onExtraCallbackWithResult(@NotNull Context context, @NotNull sourceToViewX sourcetoviewx, @NotNull loadScriptFromAssets loadscriptfromassets) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 105;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(sourcetoviewx, "");
            Intrinsics.checkNotNullParameter(loadscriptfromassets, "");
            RRNUtils rRNUtils = RRNUtils.onExtraCallback;
            createPaints createpaints = createPaints.IAuthTabCallback;
            String strOnNavigationEvent = rRNUtils.onNavigationEvent(createpaints.onNavigationEvent(), createpaints.onTransact());
            switch (C0015IAuthTabCallback.IAuthTabCallback[sourcetoviewx.ordinal()]) {
                case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                    String string = context.getString(R.string.app_family_relations_name_mismatch, loadscriptfromassets.onExtraCallback().IAuthTabCallback(), createpaints.asBinder());
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    return string;
                case 2:
                    String string2 = context.getString(R.string.app_family_relations_birthday_mismatch, loadscriptfromassets.IAuthTabCallback().onExtraCallback(), strOnNavigationEvent);
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    return string2;
                case 3:
                    String string3 = context.getString(R.string.app_family_relations_gender_mismatch, loadscriptfromassets.IAuthTabCallback().onNavigationEvent(), onExtraCallback());
                    Intrinsics.checkNotNullExpressionValue(string3, "");
                    int i4 = onWarmupCompleted + 91;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 == 0) {
                        return string3;
                    }
                    throw null;
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    return "";
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final String IAuthTabCallback(@NotNull Context context, @NotNull sourceToViewX sourcetoviewx, @NotNull unregisterFromInspector unregisterfrominspector) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 27;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(sourcetoviewx, "");
            Intrinsics.checkNotNullParameter(unregisterfrominspector, "");
            RRNUtils rRNUtils = RRNUtils.onExtraCallback;
            createPaints createpaints = createPaints.IAuthTabCallback;
            String strOnNavigationEvent = rRNUtils.onNavigationEvent(createpaints.onNavigationEvent(), createpaints.onTransact());
            switch (C0015IAuthTabCallback.IAuthTabCallback[sourcetoviewx.ordinal()]) {
                case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                case 2:
                case 3:
                case 4:
                case 8:
                    return "";
                case 5:
                    String string = context.getString(R.string.app_household_birthday_mismatch, unregisterfrominspector.onWarmupCompleted(), strOnNavigationEvent);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    return string;
                case 6:
                    String string2 = context.getString(R.string.app_household_gender_mismatch, unregisterfrominspector.onExtraCallbackWithResult(), onExtraCallback());
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    int i4 = onExtraCallbackWithResult + 83;
                    onWarmupCompleted = i4 % 128;
                    if (i4 % 2 != 0) {
                        return string2;
                    }
                    throw null;
                case 7:
                    String string3 = context.getString(R.string.app_household_not_children);
                    Intrinsics.checkNotNullExpressionValue(string3, "");
                    return string3;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final String onNavigationEvent(@NotNull Context context, @NotNull sourceToViewX sourcetoviewx) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 7;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(context, "");
                Intrinsics.checkNotNullParameter(sourcetoviewx, "");
                int i3 = C0015IAuthTabCallback.IAuthTabCallback[sourcetoviewx.ordinal()];
                throw null;
            }
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(sourcetoviewx, "");
            switch (C0015IAuthTabCallback.IAuthTabCallback[sourcetoviewx.ordinal()]) {
                case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                case 4:
                    return context.getString(R.string.guardian_pending_certify_family_relations_name_match_failed_dialog_message, createPaints.IAuthTabCallback.asBinder(), APImageInfo.onNavigationEvent.asBinder());
                case 2:
                case 5:
                    return context.getString(R.string.guardian_pending_certify_family_relations_birthday_match_failed_dialog_message, createPaints.IAuthTabCallback.asBinder(), APImageInfo.onNavigationEvent.asBinder());
                case 3:
                case 6:
                    return context.getString(R.string.guardian_pending_certify_family_relations_gender_match_failed_dialog_message, createPaints.IAuthTabCallback.asBinder(), APImageInfo.onNavigationEvent.asBinder());
                case 7:
                    String string = context.getString(R.string.guardian_pending_certify_family_relations_match_failed_dialog_message);
                    int i4 = onExtraCallbackWithResult + 5;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    return string;
                case 8:
                    return null;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            int i3 = $10 + 57;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 24, 19626 - ((byte) KeyEvent.getModifierMetaStateMask()), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onExtraCallback ^ 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), View.MeasureSpec.getSize(0) + 59, 6383 - TextUtils.getOffsetBefore("", 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
                int i6 = $11 + 111;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                    Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSize(0, 0), 59 - Color.green(0), TextUtils.getOffsetBefore("", 0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    int i7 = 91 / 0;
                } else {
                    cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                    Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), Color.green(0) + 59, 6383 - View.resolveSizeAndState(0, 0, 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
            }
            objArr[0] = new String(cArr2);
        }

        private final String onExtraCallback() throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 103;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            String strOnTransact = createPaints.IAuthTabCallback.onTransact();
            switch (strOnTransact.hashCode()) {
                case 49:
                    Object[] objArr = new Object[1];
                    a(new char[]{51276}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 63526, objArr);
                    if (strOnTransact.equals(((String) objArr[0]).intern())) {
                        return "MALE";
                    }
                    return "";
                case 50:
                    Object[] objArr2 = new Object[1];
                    a(new char[]{51279}, 29387 - ((Process.getThreadPriority(0) + 20) >> 6), objArr2);
                    if (strOnTransact.equals(((String) objArr2[0]).intern())) {
                        return "FEMALE";
                    }
                    return "";
                case 51:
                    if (strOnTransact.equals("3")) {
                        return "MALE";
                    }
                    return "";
                case 52:
                    if (strOnTransact.equals("4")) {
                        return "FEMALE";
                    }
                    return "";
                case 53:
                    if (strOnTransact.equals("5")) {
                        return "MALE";
                    }
                    return "";
                case 54:
                    if (strOnTransact.equals("6")) {
                        return "FEMALE";
                    }
                    return "";
                case 55:
                    if (!strOnTransact.equals("7")) {
                        int i4 = onExtraCallbackWithResult + 101;
                        onWarmupCompleted = i4 % 128;
                        int i5 = i4 % 2;
                        return "";
                    }
                    return "MALE";
                case 56:
                    if (strOnTransact.equals("8")) {
                        return "FEMALE";
                    }
                    return "";
                default:
                    return "";
            }
        }
    }
}
