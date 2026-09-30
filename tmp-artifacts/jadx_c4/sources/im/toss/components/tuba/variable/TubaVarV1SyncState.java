package im.toss.components.tuba.variable;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.LiveCheckConstants;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonObject;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.Response;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.UserChoiceBillingListener;
import o.findSnapView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface TubaVarV1SyncState {
    public static final IAuthTabCallback Companion = IAuthTabCallback.onWarmupCompleted;

    public interface onExtraCallbackWithResult {
        TubaVarV1SyncState onActivityResized();
    }

    State onExtraCallbackWithResult();

    findSnapView.IAuthTabCallback<State, onWarmupCompleted, Object> onWarmupCompleted(@NotNull onWarmupCompleted onwarmupcompleted);

    public static abstract class State {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ State(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class Empty extends State {
            public static final Empty INSTANCE = new Empty();
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            static {
                int i = onWarmupCompleted + 35;
                onExtraCallbackWithResult = i % 128;
                if (i % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private Empty() {
                super(null);
            }
        }

        private State() {
        }

        public static final class Evaluated extends State {
            private static int IAuthTabCallback = 0;
            public static final Evaluated INSTANCE = new Evaluated();
            private static int onExtraCallback = 1;

            static {
                int i = onExtraCallback + 77;
                IAuthTabCallback = i % 128;
                int i2 = i % 2;
            }

            private Evaluated() {
                super(null);
            }
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 7;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                String simpleName = getClass().getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName, "");
                return simpleName;
            }
            String simpleName2 = getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName2, "");
            int i3 = 17 / 0;
            return simpleName2;
        }
    }

    public static abstract class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class IAuthTabCallback extends onExtraCallback {
            private final JsonObject onExtraCallback;
            private static final byte[] $$a = {94, -43, -105, 125};
            private static final int $$b = 75;
            private static int $10 = 0;
            private static int $11 = 1;
            private static int onWarmupCompleted = 0;
            private static int asBinder = 1;
            private static long IAuthTabCallback = 7798559133331975163L;
            private static int onNavigationEvent = -1776194565;
            private static char onExtraCallbackWithResult = 49891;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static String $$c(byte b, short s, byte b2) {
                int i;
                byte[] bArr = $$a;
                int i2 = b2 + 109;
                int i3 = b * 2;
                int i4 = 4 - (s * 3);
                byte[] bArr2 = new byte[1 - i3];
                int i5 = 0 - i3;
                if (bArr == null) {
                    int i6 = i5;
                    int i7 = 0;
                    i4++;
                    i2 = (-i2) + i6;
                    i = i7;
                    bArr2[i] = (byte) i2;
                    if (i == i5) {
                        return new String(bArr2, 0);
                    }
                    int i8 = i + 1;
                    i6 = i2;
                    i2 = bArr[i4];
                    i7 = i8;
                    i4++;
                    i2 = (-i2) + i6;
                    i = i7;
                    bArr2[i] = (byte) i2;
                    if (i == i5) {
                    }
                } else {
                    i = 0;
                    bArr2[i] = (byte) i2;
                    if (i == i5) {
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IAuthTabCallback(@NotNull JsonObject jsonObject) {
                super(null);
                Intrinsics.checkNotNullParameter(jsonObject, "");
                this.onExtraCallback = jsonObject;
            }

            public final JsonObject onExtraCallback() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 101;
                int i3 = i2 % 128;
                asBinder = i3;
                if (i2 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                JsonObject jsonObject = this.onExtraCallback;
                int i4 = i3 + 65;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return jsonObject;
            }

            public String toString() throws Throwable {
                int i = 2 % 2;
                int size = this.onExtraCallback.size();
                StringBuilder sb = new StringBuilder();
                Object[] objArr = new Object[1];
                a((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), (-503291348) + (Process.myPid() >> 22), new char[]{29234, 49300, 20935, 42886, 28414, 65353, 59033, 52368, 62755, 55715, 53731, 58656, 19098, 30428, 55469, 929, 52596, 55841, 20020, 30563, 15371, 23953, 57833}, new char[]{0, 0, 0, 0}, new char[]{11288, 'b', 33250, 64010}, objArr);
                sb.append(((String) objArr[0]).intern());
                sb.append(size);
                Object[] objArr2 = new Object[1];
                a((char) (12705 - ExpandableListView.getPackedPositionChild(0L)), (ViewConfiguration.getLongPressTimeout() >> 16) + 1014721742, new char[]{44293}, new char[]{0, 0, 0, 0}, new char[]{52772, 31596, 41532, 4657}, objArr2);
                sb.append(((String) objArr2[0]).intern());
                String string = sb.toString();
                int i2 = onWarmupCompleted + 47;
                asBinder = i2 % 128;
                if (i2 % 2 != 0) {
                    return string;
                }
                throw null;
            }

            private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
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
                    int i3 = $11 + 83;
                    $10 = i3 % 128;
                    int i4 = i3 % 2;
                    try {
                        Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                        if (objOnExtraCallback == null) {
                            byte b = (byte) 0;
                            byte b2 = b;
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), (ViewConfiguration.getLongPressTimeout() >> 16) + 43, 1451 - (ViewConfiguration.getScrollBarSize() >> 8), 228868077, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                        if (objOnExtraCallback2 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 49122), 43 - TextUtils.lastIndexOf("", '0', 0, 0), 1494 - (ViewConfiguration.getScrollBarSize() >> 8), 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - (ViewConfiguration.getTapTimeout() >> 16)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 50, 22939 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), KeyEvent.keyCodeFromString("") + 29, KeyEvent.getDeadChar(0, 0) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                        cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                        cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (IAuthTabCallback ^ 7798559133331975163L)) ^ ((int) (onNavigationEvent ^ 7798559133331975163L))) ^ ((char) (onExtraCallbackWithResult ^ 7798559133331975163L)));
                        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                        int i5 = $11 + 7;
                        $10 = i5 % 128;
                        int i6 = i5 % 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                objArr[0] = new String(cArr6);
            }
        }

        private onExtraCallback() {
        }

        public static final class onWarmupCompleted extends onExtraCallback {
            private final JsonObject onExtraCallback;
            private final String onNavigationEvent;
            private final JsonObject onWarmupCompleted;
            private static final byte[] $$a = {93, -40, 95, -94};
            private static final int $$b = 208;
            private static int $10 = 0;
            private static int $11 = 1;
            private static int asInterface = 0;
            private static int IAuthTabCallbackStub = 1;
            private static long onExtraCallbackWithResult = 7798559133331975163L;
            private static int IAuthTabCallback = -1776194565;
            private static char IAuthTabCallbackDefault = 5632;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static String $$c(int i, byte b, byte b2) {
                int i2;
                int i3;
                int i4 = b2 + 109;
                int i5 = 3 - (b * 4);
                byte[] bArr = $$a;
                int i6 = 1 - (i * 4);
                byte[] bArr2 = new byte[i6];
                if (bArr == null) {
                    int i7 = i6;
                    int i8 = i5;
                    i3 = 0;
                    int i9 = i5 + i7;
                    i2 = i3;
                    int i10 = i8;
                    i4 = i9;
                    i5 = i10;
                    int i11 = i5 + 1;
                    i3 = i2 + 1;
                    bArr2[i2] = (byte) i4;
                    if (i3 == i6) {
                        return new String(bArr2, 0);
                    }
                    int i12 = i4;
                    i8 = i11;
                    i5 = bArr[i11];
                    i7 = i12;
                    int i92 = i5 + i7;
                    i2 = i3;
                    int i102 = i8;
                    i4 = i92;
                    i5 = i102;
                    int i112 = i5 + 1;
                    i3 = i2 + 1;
                    bArr2[i2] = (byte) i4;
                    if (i3 == i6) {
                    }
                } else {
                    i2 = 0;
                    int i1122 = i5 + 1;
                    i3 = i2 + 1;
                    bArr2[i2] = (byte) i4;
                    if (i3 == i6) {
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public onWarmupCompleted(@NotNull String str, @Nullable JsonObject jsonObject, @NotNull JsonObject jsonObject2) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(jsonObject2, "");
                this.onNavigationEvent = str;
                this.onWarmupCompleted = jsonObject;
                this.onExtraCallback = jsonObject2;
            }

            public final String IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = asInterface + 105;
                IAuthTabCallbackStub = i2 % 128;
                if (i2 % 2 != 0) {
                    return this.onNavigationEvent;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final JsonObject onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub;
                int i3 = i2 + 115;
                asInterface = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
                JsonObject jsonObject = this.onExtraCallback;
                int i4 = i2 + 51;
                asInterface = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 76 / 0;
                }
                return jsonObject;
            }

            public final JsonObject onNavigationEvent() {
                int i = 2 % 2;
                int i2 = asInterface + 15;
                IAuthTabCallbackStub = i2 % 128;
                if (i2 % 2 != 0) {
                    return this.onWarmupCompleted;
                }
                throw null;
            }

            public String toString() throws Throwable {
                int i = 2 % 2;
                String str = this.onNavigationEvent;
                JsonObject jsonObject = this.onWarmupCompleted;
                Integer numValueOf = null;
                if (jsonObject != null) {
                    int i2 = IAuthTabCallbackStub + 7;
                    asInterface = i2 % 128;
                    int i3 = i2 % 2;
                    int size = jsonObject.size();
                    if (i3 != 0) {
                        Integer.valueOf(size);
                        numValueOf.hashCode();
                        throw null;
                    }
                    numValueOf = Integer.valueOf(size);
                } else {
                    int i4 = IAuthTabCallbackStub + 35;
                    asInterface = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 5 / 2;
                    }
                }
                int size2 = this.onExtraCallback.size();
                StringBuilder sb = new StringBuilder();
                Object[] objArr = new Object[1];
                a((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 244021122, new char[]{49917, 34340, 51405, 47897, 34302, 13270, 58426, 44297, 52175, 47827, 43995, 61532, 43095, 4584, 35699, 60553, 45492, 54614, 26301, 31892, 24509}, new char[]{0, 0, 0, 0}, new char[]{33389, 35703, 17934, 59123}, objArr);
                sb.append(((String) objArr[0]).intern());
                sb.append(str);
                Object[] objArr2 = new Object[1];
                a((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), ViewConfiguration.getScrollDefaultDelay() >> 16, new char[]{56242, 41038, 35262, 48523, 49809, 26113, 13301, 62737, 62658, 20228, 23448, 27138, 2400, 6060, 29717, 33673, 65168, 41952, 60368, 21322, 33201, 21639, 7673, 64122}, new char[]{0, 0, 0, 0}, new char[]{9069, 55717, 12068, 59048}, objArr2);
                sb.append(((String) objArr2[0]).intern());
                sb.append(numValueOf);
                Object[] objArr3 = new Object[1];
                a((char) (ExpandableListView.getPackedPositionChild(0L) + 1), (-1668500837) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), new char[]{63969, 13356, 4296, 18893, 53258, 55133, 63526, 21807, 59606, 32947, 2061, 6640, 58017, 63154, 28312, 35233, 14406, 23961, 29678, 65135, 47622}, new char[]{0, 0, 0, 0}, new char[]{39958, 36018, 63388, 64868}, objArr3);
                sb.append(((String) objArr3[0]).intern());
                sb.append(size2);
                Object[] objArr4 = new Object[1];
                a((char) (4215 - View.resolveSizeAndState(0, 0, 0)), KeyEvent.keyCodeFromString("") + 638216143, new char[]{52361}, new char[]{0, 0, 0, 0}, new char[]{53004, 2663, 30502, 23056}, objArr4);
                sb.append(((String) objArr4[0]).intern());
                return sb.toString();
            }

            private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
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
                int i3 = $11 + 125;
                $10 = i3 % 128;
                int i4 = i3 % 2;
                while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
                    try {
                        Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                        if (objOnExtraCallback == null) {
                            byte b = (byte) 0;
                            byte b2 = b;
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getLongPressTimeout() >> 16), 43 - (Process.myPid() >> 22), ((Process.getThreadPriority(0) + 20) >> 6) + 1451, 228868077, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                        if (objOnExtraCallback2 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 49123), View.MeasureSpec.makeMeasureSpec(0, 0) + 44, 1494 - (Process.myTid() >> 22), 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23973 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 50 - (ViewConfiguration.getScrollBarSize() >> 8), 22939 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - (ViewConfiguration.getScrollBarSize() >> 8)), Drawable.resolveOpacity(0, 0) + 29, 12577 - Color.blue(0), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                        cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                        cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] ^ cArr4[iIntValue2]) ^ (onExtraCallbackWithResult ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallback ^ 7798559133331975163L))) ^ ((char) (IAuthTabCallbackDefault ^ 7798559133331975163L)));
                        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                        int i5 = $10 + 17;
                        $11 = i5 % 128;
                        int i6 = i5 % 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                objArr[0] = new String(cArr6);
            }
        }

        /* renamed from: im.toss.components.tuba.variable.TubaVarV1SyncState$onExtraCallback$onExtraCallback, reason: collision with other inner class name */
        public static final class C0007onExtraCallback extends onExtraCallback {
            private static int $10 = 0;
            private static int $11 = 1;
            private static char IAuthTabCallback = 7061;
            private static int asInterface = 1;
            private static char onExtraCallback = 58179;
            private static char onNavigationEvent = 11790;
            private static int onTransact = 0;
            private static char onWarmupCompleted = 48827;
            private final Throwable onExtraCallbackWithResult;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0007onExtraCallback(@NotNull Throwable th) {
                super(null);
                Intrinsics.checkNotNullParameter(th, "");
                this.onExtraCallbackWithResult = th;
            }

            public final Throwable onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onTransact + 85;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                Throwable th = this.onExtraCallbackWithResult;
                if (i3 == 0) {
                    int i4 = 45 / 0;
                }
                return th;
            }

            public String toString() throws Throwable {
                int i = 2 % 2;
                Throwable th = this.onExtraCallbackWithResult;
                StringBuilder sb = new StringBuilder();
                Object[] objArr = new Object[1];
                a(new char[]{59311, 50921, 37083, 59901, 60544, 45534, 21908, 18145, 61242, 60463, 49140, 35894, 28497, 62639, 12727, 63272, 14470, 8890, 57387, 15978, 39063, 28465, 11087, 34122}, View.MeasureSpec.makeMeasureSpec(0, 0) + 24, objArr);
                sb.append(((String) objArr[0]).intern());
                sb.append(th);
                Object[] objArr2 = new Object[1];
                a(new char[]{54708, 32760}, 1 - Color.alpha(0), objArr2);
                sb.append(((String) objArr2[0]).intern());
                String string = sb.toString();
                int i2 = onTransact + 87;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                return string;
            }

            private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
                char[] cArr2 = new char[cArr.length];
                int i3 = 0;
                defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
                char[] cArr3 = new char[2];
                while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
                    cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                    cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                    int i4 = $11 + 7;
                    $10 = i4 % 128;
                    int i5 = i4 % 2;
                    int i6 = 58224;
                    int i7 = i3;
                    while (i7 < 16) {
                        char c = cArr3[1];
                        char c2 = cArr3[i3];
                        int i8 = (c2 + i6) ^ ((c2 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)));
                        int i9 = c2 >>> 5;
                        try {
                            Object[] objArr2 = new Object[4];
                            objArr2[3] = Integer.valueOf(onWarmupCompleted);
                            objArr2[2] = Integer.valueOf(i9);
                            objArr2[1] = Integer.valueOf(i8);
                            objArr2[i3] = Integer.valueOf(c);
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                            if (objOnExtraCallback == null) {
                                char c3 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                int iMyPid = 10 - (Process.myPid() >> 22);
                                int iBlue = 12434 - Color.blue(i3);
                                Class[] clsArr = new Class[4];
                                clsArr[i3] = Integer.TYPE;
                                clsArr[1] = Integer.TYPE;
                                clsArr[2] = Integer.TYPE;
                                clsArr[3] = Integer.TYPE;
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c3, iMyPid, iBlue, -787580090, false, "C", clsArr);
                            }
                            char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                            cArr3[1] = cCharValue;
                            char[] cArr4 = cArr3;
                            Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallback)};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getEdgeSlop() >> 16), (Process.myPid() >> 22) + 10, 12435 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                            i6 -= 40503;
                            i7++;
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
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - KeyEvent.normalizeMetaState(0)), Color.blue(0) + 14, (-16757315) - Color.rgb(0, 0, 0), -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    cArr3 = cArr5;
                    i3 = 0;
                }
                String str = new String(cArr2, 0, i);
                int i10 = $10 + 5;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                objArr[0] = str;
            }
        }
    }

    public static abstract class onWarmupCompleted {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private final onExtraCallback onWarmupCompleted;

        public /* synthetic */ onWarmupCompleted(onExtraCallback onextracallback, DefaultConstructorMarker defaultConstructorMarker) {
            this(onextracallback);
        }

        public static final class onNavigationEvent extends onWarmupCompleted {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public onNavigationEvent(@NotNull onExtraCallback onextracallback) {
                super(onextracallback, null);
                Intrinsics.checkNotNullParameter(onextracallback, "");
            }
        }

        private onWarmupCompleted(onExtraCallback onextracallback) {
            this.onWarmupCompleted = onextracallback;
        }

        public final onExtraCallback onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 15;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                throw null;
            }
            onExtraCallback onextracallback = this.onWarmupCompleted;
            int i4 = i3 + 85;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return onextracallback;
            }
            obj.hashCode();
            throw null;
        }

        public static final class onExtraCallback extends onWarmupCompleted {
            private static int IAuthTabCallback = 1;
            public static final onExtraCallback onExtraCallback = new onExtraCallback();
            private static int onExtraCallbackWithResult;

            static {
                int i = IAuthTabCallback + 43;
                onExtraCallbackWithResult = i % 128;
                int i2 = i % 2;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            private onExtraCallback() {
                onExtraCallback onextracallback = null;
                super(onextracallback, onextracallback);
            }
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 105;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            String simpleName = getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "");
            int i4 = onNavigationEvent + 99;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return simpleName;
        }
    }

    default void onExtraCallbackWithResult(@NotNull JsonObject jsonObject) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(jsonObject, "");
        onWarmupCompleted(new onWarmupCompleted.onNavigationEvent(new onExtraCallback.IAuthTabCallback(jsonObject)));
    }

    default void onWarmupCompleted(@NotNull onExtraCallback onextracallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        onWarmupCompleted(new onWarmupCompleted.onNavigationEvent(onextracallback));
    }

    default void IAuthTabCallback(@NotNull Throwable th) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        onWarmupCompleted(new onWarmupCompleted.onNavigationEvent(new onExtraCallback.C0007onExtraCallback(th)));
    }

    public static final class IAuthTabCallback {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        static final /* synthetic */ IAuthTabCallback onWarmupCompleted = new IAuthTabCallback();

        static {
            int i = onExtraCallbackWithResult + 119;
            onNavigationEvent = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        private IAuthTabCallback() {
        }

        @Deprecated
        public final TubaVarV1SyncState onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 61;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Response response = Response.onNavigationEvent;
            TubaVarV1SyncState tubaVarV1SyncStateOnActivityResized = ((onExtraCallbackWithResult) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), onExtraCallbackWithResult.class)).onActivityResized();
            int i4 = onExtraCallback + 25;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return tubaVarV1SyncStateOnActivityResized;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
