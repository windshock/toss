package o;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import im.toss.tosssecurities.core.storage.domain.crosstype.CrossType;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import org.bouncycastle.asn1.eac.CertificateBody;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class uninstallFabricUIManager$IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallback = -836633544289341135L;
    private static int asBinder = 0;
    private static int asInterface = 1;
    final /* synthetic */ setOnOutOfMemeryErrorCallback $callbackProxy;
    final /* synthetic */ JsonObject $data;
    final /* synthetic */ String $name;
    final /* synthetic */ String $url;
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    final /* synthetic */ uninstallFabricUIManager this$0;
    private static char[] onNavigationEvent = {32454, 32460, 32496, 32393, 32448, 32510, 32507, 32506, 32509, 32497, 32456, 32462, 32450, 32477, 32478, 32508, 32511, 32420, 32452, 32467, 32453, 32499, 32475, 47449, 52833, 50109, 50523, 47017, 52217, 47101, 44473, 54121, 46953, 46860, 51857, 47421, 47073, 47133};
    private static int onExtraCallbackWithResult = -1184333975;
    private static boolean onWarmupCompleted = true;
    private static boolean onExtraCallback = true;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    uninstallFabricUIManager$IAuthTabCallback(JsonObject jsonObject, String str, uninstallFabricUIManager uninstallfabricuimanager, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, String str2, access13800<? super uninstallFabricUIManager$IAuthTabCallback> access13800Var) {
        super(2, access13800Var);
        this.$data = jsonObject;
        this.$name = str;
        this.this$0 = uninstallfabricuimanager;
        this.$callbackProxy = setonoutofmemeryerrorcallback;
        this.$url = str2;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        uninstallFabricUIManager$IAuthTabCallback uninstallfabricuimanager_iauthtabcallback = new uninstallFabricUIManager$IAuthTabCallback(this.$data, this.$name, this.this$0, this.$callbackProxy, this.$url, access13800Var);
        int i2 = asInterface + 109;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return uninstallfabricuimanager_iauthtabcallback;
        }
        throw null;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 101;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
        int i4 = asBinder + 45;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return objOnExtraCallback;
        }
        throw null;
    }

    public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 101;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        if (i3 == 0) {
            int i4 = 79 / 0;
        }
        int i5 = asInterface + 63;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 91 / 0;
        }
        return objInvokeSuspend;
    }

    /* renamed from: o.uninstallFabricUIManager$IAuthTabCallback$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private static long onWarmupCompleted = 176408887596369914L;
        int label;

        AnonymousClass2(access13800<? super AnonymousClass2> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(access13800Var);
            int i2 = onExtraCallback + 17;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return anonymousClass2;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 73;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 75;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnExtraCallback;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 79;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            AnonymousClass2 anonymousClass2Create = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                return anonymousClass2Create.invokeSuspend(Unit.INSTANCE);
            }
            int i4 = 42 / 0;
            return anonymousClass2Create.invokeSuspend(Unit.INSTANCE);
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i3 = $11 + 97;
                $10 = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.green(0), 24 - TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0), 19627 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i4] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() % (5407414049857832247L & onWarmupCompleted);
                        Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0), 59 - View.MeasureSpec.getMode(0), 6383 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
                    int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                    Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 24, 19627 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (onWarmupCompleted ^ 5407414049857832247L);
                    Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getThreadPriority(0) + 20) >> 6), 59 - (ViewConfiguration.getEdgeSlop() >> 16), 6383 - View.MeasureSpec.makeMeasureSpec(0, 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
            }
            char[] cArr2 = new char[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0)), 58 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0), 6382 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            String str = new String(cArr2);
            int i6 = $10 + 117;
            $11 = i6 % 128;
            if (i6 % 2 != 0) {
                objArr[0] = str;
            } else {
                int i7 = 31 / 0;
                objArr[0] = str;
            }
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            Toast toastMakeText;
            int i = 2 % 2;
            if (this.label != 0) {
                Object[] objArr = new Object[1];
                a(new char[]{49838, 44217, 7819, 34974, 31417, 58576, 22236, 49278, 45634, 7170, 36474, 30809, 59972, 21937, 51086, 45521, 9149, 36298, 32722, 59684, 23302, 50438, 46950, 8462, 37650, 681, 60545, 24204, 51438, 47815, 9438, 38497, 'M', 61967, 23662, 52838, 47185, 11236, 38320, 1937, 61943, 25599, 52682, 48958, 10552, 39698, 1390}, 28181 - (Process.myPid() >> 22), objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            int i2 = onExtraCallback + 69;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.onNavigationEvent(obj);
            if (i3 == 0) {
                Context contextOnExtraCallback = UserChoiceBillingListener.onExtraCallback.onExtraCallback();
                Object[] objArr2 = new Object[1];
                a(new char[]{49795, 'S', 18247, 35417, 51527, 3155, 21370, 38481, 54616, 6229, 24393, 41537, 57706, 9290, 27472, 44622, 60764, 12357, 30534, 32752, 63745, 36142, 47123, 17924, 15595, 3946, 3851, 57688, 22109, 1310, 46895, 24076, 21805, 10167, 37643, 44964, 43313, 11166, 63139, 45184, 46395, 63546, 33427, 55132, 34701, 20802, 52031, 48492, 35433, 16690, 26007, 6688, 37149, 12406, 13939, 61176, 42045, 28318}, 49919 >>> TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR), objArr2);
                toastMakeText = Toast.makeText(contextOnExtraCallback, ((String) objArr2[0]).intern(), 0);
            } else {
                Context contextOnExtraCallback2 = UserChoiceBillingListener.onExtraCallback.onExtraCallback();
                Object[] objArr3 = new Object[1];
                a(new char[]{49795, 'S', 18247, 35417, 51527, 3155, 21370, 38481, 54616, 6229, 24393, 41537, 57706, 9290, 27472, 44622, 60764, 12357, 30534, 32752, 63745, 36142, 47123, 17924, 15595, 3946, 3851, 57688, 22109, 1310, 46895, 24076, 21805, 10167, 37643, 44964, 43313, 11166, 63139, 45184, 46395, 63546, 33427, 55132, 34701, 20802, 52031, 48492, 35433, 16690, 26007, 6688, 37149, 12406, 13939, 61176, 42045, 28318}, 49919 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR), objArr3);
                toastMakeText = Toast.makeText(contextOnExtraCallback2, ((String) objArr3[0]).intern(), 1);
            }
            toastMakeText.show();
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 21;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        String str;
        Throwable cause;
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (true) {
            int i3 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            int length2 = cArr.length;
            str = BuildConfig.FLAVOR;
            if (i3 >= length2) {
                break;
            }
            int i4 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 24, 19626 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i4] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (IAuthTabCallback ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 59 - (Process.myPid() >> 22), (Process.myTid() >> 22) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i5 = $11 + 21;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                String str2 = str;
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                try {
                    Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 59 - (Process.myPid() >> 22), 6382 - ExpandableListView.getPackedPositionChild(0L), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    int i6 = 15 / 0;
                    str = str2;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } else {
                String str3 = str;
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback4 == null) {
                    str = str3;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(0), 58 - TextUtils.lastIndexOf(str, '0', 0, 0), 6383 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                } else {
                    str = str3;
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
        }
        String str4 = new String(cArr2);
        int i7 = $10 + 105;
        $11 = i7 % 128;
        if (i7 % 2 != 0) {
            objArr[0] = str4;
        } else {
            int i8 = 41 / 0;
            objArr[0] = str4;
        }
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = this.label;
        Object obj2 = null;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            setText settext = new setText(this.$data);
            Object[] objArr = new Object[1];
            a(new char[]{46189, 32650, 9133}, 52201 - ExpandableListView.getPackedPositionType(0L), objArr);
            String strOnNavigationEvent = settext.onNavigationEvent(((String) objArr[0]).intern(), BuildConfig.FLAVOR);
            if (strOnNavigationEvent.length() > 0) {
                int i3 = asBinder + 93;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
                if (!getKeyokhttp.onExtraCallback.onNavigationEvent(Reflection.getOrCreateKotlinClass(CrossType.onNavigationEvent.class), strOnNavigationEvent)) {
                    Object[] objArr2 = new Object[1];
                    a(new char[]{46181, 28388, 370, 15317, 56919, 61609, 43836}, TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR) + 55949, objArr2);
                    String strIntern = ((String) objArr2[0]).intern();
                    Object[] objArr3 = new Object[1];
                    b(null, new byte[]{-119, -122, ISOFileInfo.PROP_INFO, ISOFileInfo.LCS_BYTE, -126, -124, -119, -120, ISOFileInfo.FCI_EXT, -124, -122, ISOFileInfo.PROP_INFO, -124, ISOFileInfo.FILE_IDENTIFIER, -126, ISOFileInfo.DATA_BYTES2}, null, 175 - AndroidCharacter.getMirror('0'), objArr3);
                    Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(strIntern, ((String) objArr3[0]).intern());
                    Object[] objArr4 = new Object[1];
                    a(new char[]{46189, 32650, 9133}, ExpandableListView.getPackedPositionChild(0L) + 52202, objArr4);
                    Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), strOnNavigationEvent);
                    Object[] objArr5 = new Object[1];
                    b(null, new byte[]{ISOFileInfo.FCI_EXT, -120, ISOFileInfo.PROP_INFO, -119, ISOFileInfo.SECURITY_ATTR_COMPACT, ISOFileInfo.SECURITY_ATTR_EXP}, null, 126 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr5);
                    Map mapOnWarmupCompleted = access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback(((String) objArr5[0]).intern(), this.$name)});
                    Object[] objArr6 = new Object[1];
                    a(new char[]{46162, 25562, 6931, 13164, 60057, 33308, 47703, 20886, 2540, 8484, 55436, 61662, 43015, 16482, 32642, 5914, 53058, 59020, 40678, 46634, 28087, 1484, 15625, 54652, 36028, 41988, 23648, 2950, 9212, 56101, 62096, 43726, 16916}, ((byte) KeyEvent.getModifierMetaStateMask()) + ISO7816.INS_READ_BINARY_STAMPED, objArr6);
                    AFd1mSDK.onWarmupCompleted(((String) objArr6[0]).intern(), mapOnWarmupCompleted, false, (Function1) null, 12, (Object) null);
                }
            }
            String str = this.$name;
            int iHashCode = str.hashCode();
            if (iHashCode == -2129000396) {
                Object[] objArr7 = new Object[1];
                a(new char[]{46196, 15328, 43885, 6880, 35452, 31212, 59712, 22780, 51309, 49134, 12107, 40642, 3649, 64980, 27998, 56514, 19522, 13276, 41813, 4812, 33399, 29148, 57641, 20652, 49212, 47028, 10011, 38563, 1597, 62883, 25917, 54460, 17411, 52147, 47873, 10883, 39455, 2444}, View.getDefaultSize(0, 0) + 36739, objArr7);
                if (str.equals(((String) objArr7[0]).intern())) {
                    uninstallFabricUIManager.onWarmupCompleted(this.this$0).onNavigationEvent(strOnNavigationEvent);
                    ALCFaceBox.onWarmupCompleted(this.$callbackProxy, JsonNull.INSTANCE);
                }
            } else if (iHashCode == -702950382) {
                Object[] objArr8 = new Object[1];
                b(null, new byte[]{-126, -112, -107, ISOFileInfo.SECURITY_ATTR_EXP, -108, -126, ISOFileInfo.ENV_TEMP_EF, ISOFileInfo.SECURITY_ATTR_EXP, -111, -120, -119, -113, ISOFileInfo.FILE_IDENTIFIER, -111, -120, -109, -126, -110, -122, -126, ISOFileInfo.PROP_INFO, -119, ISOFileInfo.PROP_INFO, -111, -112, ISOFileInfo.SECURITY_ATTR_COMPACT, -126, -113, -122, -122, -120, ISOFileInfo.CHANNEL_SECURITY, -119, -126, -122}, null, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + CertificateBody.profileType, objArr8);
                if (str.equals(((String) objArr8[0]).intern())) {
                    Object[] objArr9 = new Object[1];
                    b(null, new byte[]{-126, -112, -107, ISOFileInfo.SECURITY_ATTR_EXP, -106}, null, KeyEvent.getDeadChar(0, 0) + CertificateBody.profileType, objArr9);
                    String strOnNavigationEvent2 = settext.onNavigationEvent(((String) objArr9[0]).intern(), BuildConfig.FLAVOR);
                    boolean zOnExtraCallback = uninstallFabricUIManager.onWarmupCompleted(this.this$0).onExtraCallback(strOnNavigationEvent, strOnNavigationEvent2);
                    if (zOnExtraCallback) {
                        ALCFaceBox.onWarmupCompleted(this.$callbackProxy, JsonNull.INSTANCE);
                    } else {
                        Object[] objArr10 = new Object[1];
                        a(new char[]{46189, 32650, 9133}, 52200 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0'), objArr10);
                        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(((String) objArr10[0]).intern(), strOnNavigationEvent);
                        Object[] objArr11 = new Object[1];
                        a(new char[]{46195, 37783, 64428}, View.MeasureSpec.getSize(0) + 10211, objArr11);
                        Map mapOnWarmupCompleted2 = access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback3, getWrite.IAuthTabCallback(((String) objArr11[0]).intern(), this.$url)});
                        Object[] objArr12 = new Object[1];
                        a(new char[]{46197, 3946, 49760, 34131, 22595, 4959, 54873, 43343, 27691, 10010, 64057, 48392, 28677, 51969, 36353, 16850, 1250, 57328, 37590, 21964, 10453, 58334, 42639, 31167, 15547, 63381, 19082, 3481, 49301, 33908}, TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 47881, objArr12);
                        AFd1mSDK.onNavigationEvent(((String) objArr12[0]).intern(), (Throwable) null, mapOnWarmupCompleted2, false, (Function1) null, 26, (Object) null);
                        if (DERSet.onExtraCallback.onRequestPermissionsResult()) {
                            setPatch setpatchOnExtraCallback = putChannelInfo.onExtraCallback();
                            AnonymousClass2 anonymousClass2 = new AnonymousClass2(null);
                            this.L$0 = access15400.onNavigationEvent(settext);
                            this.L$1 = access15400.onNavigationEvent(strOnNavigationEvent);
                            this.L$2 = access15400.onNavigationEvent(strOnNavigationEvent2);
                            this.Z$0 = zOnExtraCallback;
                            this.label = 1;
                            if (maybeUpdateAnimatable.onExtraCallback(setpatchOnExtraCallback, anonymousClass2, this) == objOnWarmupCompleted) {
                                int i5 = asInterface + 95;
                                asBinder = i5 % 128;
                                if (i5 % 2 == 0) {
                                    return objOnWarmupCompleted;
                                }
                                obj2.hashCode();
                                throw null;
                            }
                        }
                    }
                }
            } else if (iHashCode == 66115334) {
                Object[] objArr13 = new Object[1];
                b(null, new byte[]{-126, -112, -107, ISOFileInfo.SECURITY_ATTR_EXP, -108, -126, ISOFileInfo.ENV_TEMP_EF, ISOFileInfo.SECURITY_ATTR_EXP, -111, -120, -119, -113, ISOFileInfo.FILE_IDENTIFIER, -111, -120, -109, -126, -110, -122, -126, ISOFileInfo.PROP_INFO, -119, ISOFileInfo.PROP_INFO, -111, -112, ISOFileInfo.SECURITY_ATTR_COMPACT, -126, -113, -122, -122, -120, ISOFileInfo.CHANNEL_SECURITY, -119, -126, ISOFileInfo.ENV_TEMP_EF}, null, 128 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr13);
                if (str.equals(((String) objArr13[0]).intern())) {
                    int i6 = asInterface + 9;
                    asBinder = i6 % 128;
                    if (i6 % 2 != 0) {
                        uninstallFabricUIManager.onWarmupCompleted(this.this$0).IAuthTabCallback(strOnNavigationEvent);
                        obj2.hashCode();
                        throw null;
                    }
                    String strIAuthTabCallback = uninstallFabricUIManager.onWarmupCompleted(this.this$0).IAuthTabCallback(strOnNavigationEvent);
                    if (strIAuthTabCallback == null) {
                        ALCFaceBox.onWarmupCompleted(this.$callbackProxy, JsonNull.INSTANCE);
                    } else {
                        ALCFaceBox.onExtraCallback(this.$callbackProxy, strIAuthTabCallback);
                    }
                }
            }
            return Unit.INSTANCE;
        }
        int i7 = asInterface + 7;
        int i8 = i7 % 128;
        asBinder = i8;
        int i9 = i7 % 2;
        if (i2 != 1) {
            Object[] objArr14 = new Object[1];
            a(new char[]{46181, 36428, 49212, 6891, 23690, 38565, 59755, 8971, 25977, 49143, 61901, 52140, 3703, 16452, 39481, 56484, 5782, 26815, 41829, 58705, 16181, 29171, 19409, 36347, 49193, 6748, 23606, 38649, 59613, 8882, 25961, 48916, 61766, 52218, 3545, 18323, 39522, 56337, 5639, 26852, 41676, 58506, 16253, 29003, 19211, 36327, 51161}, TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0) + 14891, objArr14);
            throw new IllegalStateException(((String) objArr14[0]).intern());
        }
        int i10 = i8 + 81;
        asInterface = i10 % 128;
        if (i10 % 2 == 0) {
            ResultKt.onNavigationEvent(obj);
            throw null;
        }
        ResultKt.onNavigationEvent(obj);
        setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = this.$callbackProxy;
        Object[] objArr15 = new Object[1];
        b(null, new byte[]{-90, -92, ISOFileInfo.A5, -124, -92, -93, -94, ISOFileInfo.A1, -124, ISOFileInfo.A0, -97, -98, -99, -124, -100, -101, -124, -102, -103, -124, -104, -126, ISOFileInfo.ENV_TEMP_EF, ISOFileInfo.SECURITY_ATTR_EXP, -111, -120, -119, -113, ISOFileInfo.FILE_IDENTIFIER, -111, -120, -109, -126, -110, -126, -106, ISOFileInfo.PROP_INFO, -119, ISOFileInfo.SECURITY_ATTR_EXP, -105}, null, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + CertificateBody.profileType, objArr15);
        String strIntern2 = ((String) objArr15[0]).intern();
        Object[] objArr16 = new Object[1];
        a(new char[]{46152, 14930, 43128, 7792, 35844, 29226, 57383, 22232, 50411, 19190, 14491, 44723, 7331, 33608, 29043, 59241, 21785, 56113, 18749, 16334, 44519, 5088, 33159, 30643, 58811, 21593, 55906, 18557, 15877, 44080}, ExpandableListView.getPackedPositionGroup(0L) + 36373, objArr16);
        setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, strIntern2, ((String) objArr16[0]).intern(), (Map) null, 4, (Object) null);
        return Unit.INSTANCE;
    }

    private static void b(int[] iArr, byte[] bArr, char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onNavigationEvent;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), View.resolveSizeAndState(0, 0, 0) + 77, (ViewConfiguration.getScrollBarSize() >> 8) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(onExtraCallbackWithResult)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 75, ((Process.getThreadPriority(0) + 20) >> 6) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            int i4 = 1052772399;
            if (onExtraCallback) {
                int i5 = $10 + 45;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i7 = $10 + 41;
                    $11 = i7 % 128;
                    if (i7 % 2 == 0) {
                        cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] >> i] % iIntValue);
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), KeyEvent.getDeadChar(0, 0) + 63, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    } else {
                        cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(BuildConfig.FLAVOR), 63 - (ViewConfiguration.getWindowTouchSlop() >> 8), 12214 - (ViewConfiguration.getWindowTouchSlop() >> 8), 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    }
                    i4 = 1052772399;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!onWarmupCompleted) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            int i8 = $10 + 81;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0)), ((Process.getThreadPriority(0) + 20) >> 6) + 63, TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
                int i10 = $11 + 97;
                $10 = i10 % 128;
                int i11 = i10 % 2;
            }
            objArr[0] = new String(cArr6);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }
}
