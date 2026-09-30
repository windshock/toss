package o;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.graphics.Color;
import android.net.Uri;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class notifyJSInstanceInitialized extends ContentProvider {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onNavigationEvent Companion;
    private static long IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface = 0;
    public static final int onExtraCallback;
    private static final String onExtraCallbackWithResult;
    private static final UriMatcher onNavigationEvent;
    private static int onTransact = 1;
    private static final String[] onWarmupCompleted;

    @Override // android.content.ContentProvider
    public int delete(@NotNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 107;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(uri, BuildConfig.FLAVOR);
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(@NotNull Uri uri) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 101;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(uri, BuildConfig.FLAVOR);
        int i4 = onTransact + 11;
        IAuthTabCallbackDefault = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(@NotNull Uri uri, @Nullable ContentValues contentValues) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 55;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(uri, BuildConfig.FLAVOR);
        if (i3 != 0) {
            return null;
        }
        throw null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        int i = 2 % 2;
        int i2 = onTransact + 9;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 47;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    @Override // android.content.ContentProvider
    public int update(@NotNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 113;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(uri, BuildConfig.FLAVOR);
        int i4 = onTransact + 109;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    static {
        onWarmupCompleted();
        Companion = new onNavigationEvent(null);
        onExtraCallback = 8;
        String strIEngagementSignalsCallback = zzaj.onNavigationEvent().IEngagementSignalsCallback();
        onExtraCallbackWithResult = strIEngagementSignalsCallback;
        onWarmupCompleted = new String[]{"PATTERN"};
        UriMatcher uriMatcher = new UriMatcher(-1);
        onNavigationEvent = uriMatcher;
        uriMatcher.addURI(strIEngagementSignalsCallback, "pattern", 1);
        int i = asInterface + 89;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 == 0) {
            int i2 = 6 / 0;
        }
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onWarmupCompleted(access13800Var);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                pauseMyRequest pausemyrequestOnNavigationEvent = UserChoiceBillingListener.onExtraCallback.onNavigationEvent();
                this.label = 1;
                if (pausemyrequestOnNavigationEvent.IAuthTabCallback(this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // android.content.ContentProvider
    public Cursor query(@NotNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(uri, BuildConfig.FLAVOR);
        Object obj = null;
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            if (!UserChoiceBillingListener.onExtraCallback.onNavigationEvent().IAuthTabCallbackStubProxy()) {
                int i2 = onTransact + 5;
                IAuthTabCallbackDefault = i2 % 128;
                if (i2 % 2 == 0) {
                    return null;
                }
                obj.hashCode();
                throw null;
            }
        } else if (!UserChoiceBillingListener.onExtraCallback.onNavigationEvent().IAuthTabCallbackStubProxy()) {
            maybeUpdateAnimatable.onWarmupCompleted((CoroutineContext) null, new onWarmupCompleted(null), 1, (Object) null);
        }
        onNavigationEvent(uri);
        if (onNavigationEvent.match(uri) != 1) {
            return null;
        }
        MatrixCursor matrixCursor = new MatrixCursor(onWarmupCompleted);
        String strIAuthTabCallback = filterCreatePageParams.IAuthTabCallback(uri, "pattern", BuildConfig.FLAVOR);
        int iHashCode = strIAuthTabCallback.hashCode();
        if (iHashCode != -1413853096) {
            if (iHashCode != -1177318867) {
                if (iHashCode == -526492694 && strIAuthTabCallback.equals("account_short")) {
                    matrixCursor.addRow(new String[]{enableFabricLogs.onExtraCallback.onNavigationEvent()});
                    return matrixCursor;
                }
            } else if (strIAuthTabCallback.equals("account")) {
                matrixCursor.addRow(new String[]{enableFabricLogs.onExtraCallbackWithResult(enableFabricLogs.onExtraCallback, false, 1, (Object) null)});
                int i3 = onTransact + 17;
                IAuthTabCallbackDefault = i3 % 128;
                if (i3 % 2 == 0) {
                    return matrixCursor;
                }
                obj.hashCode();
                throw null;
            }
        } else if (strIAuthTabCallback.equals("amount")) {
            matrixCursor.addRow(new String[]{"((?:[1-9]\\d?\\d?\\d?\\d?\\d?\\d?|[1-9]\\d?\\d?,\\d\\d\\d|[1-9],\\d\\d\\d,\\d\\d\\d|(?:(?:(?:[일이삼사오육칠팔구1-9]?천 *)?(?:[일이삼사오육칠팔구1-9]?백 *)?[일이삼사오육칠팔구1-9]?십 *[일이삼사오육칠팔구1-9]?|(?:[일이삼사오육칠팔구1-9]?천 *)?[일이삼사오육칠팔구1-9]?백 *(?:[1-9]?\\d?|[1-9]?십 *[1-9]?)|[일이삼사오육칠팔구1-9]?천 *(?:[1-9]?\\d?\\d?|[1-9]?백 *[1-9]\\d?|[1-9]?백 *[1-9]?십 *)|[일이삼사오육칠팔구]|[1-9]\\d?\\d?\\d?|[1-9],\\d\\d\\d)?만 *)(?:(?:[일이삼사오육칠팔구1-9]?천 *)?(?:[일이삼사오육칠팔구1-9]?백 *)?[일이삼사오육칠팔구1-9]?십 *[일이삼사오육칠팔구1-9]?|(?:[일이삼사오육칠팔구1-9]?천 *)?[일이삼사오육칠팔구1-9]?백 *(?:[1-9]?\\d?|[1-9]?십 *[1-9]?)|[일이삼사오육칠팔구1-9]?천 *(?:[1-9]?\\d?\\d?|[1-9]?백 *[1-9]\\d?|[1-9]?백 *[1-9]?십 *)|[일이삼사오육칠팔구]|[1-9]\\d?\\d?\\d?|[1-9],\\d\\d\\d)?|(?:(?:[일이삼사오육칠팔구1-9]?천 *)?(?:[일이삼사오육칠팔구1-9]?백 *)?[일이삼사오육칠팔구1-9]?십 *[일이삼사오육칠팔구1-9]?|(?:[일이삼사오육칠팔구1-9]?천 *)?[일이삼사오육칠팔구1-9]?백 *(?:[1-9]?\\d?|[1-9]?십 *[1-9]?)|[일이삼사오육칠팔구1-9]?천 *(?:[1-9]?\\d?\\d?|[1-9]?백 *[1-9]\\d?|[1-9]?백 *[1-9]?십 *)|[1-9]\\d?\\d?\\d?|[1-9],\\d\\d\\d))원)"});
            return matrixCursor;
        }
        return matrixCursor;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i3 = $10 + 85;
        $11 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 2 / 2;
        }
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i5 = $11 + 101;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), 24 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0) + 19628, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i6] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() * IAuthTabCallback * 5407414049857832247L;
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0), 60 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 6383 - View.MeasureSpec.getSize(0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
                Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 24, 19627 - Color.green(0), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i7] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (IAuthTabCallback ^ 5407414049857832247L);
                Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0) + 59, TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getEdgeSlop() >> 16), 59 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0), View.combineMeasuredStates(0, 0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
    }

    private final void onNavigationEvent(Uri uri) throws Throwable {
        Object obj;
        int i = 2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(getCallingPackage());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.onExtraCallback(obj)) {
            obj = null;
        }
        String str = (String) obj;
        if (!(!Intrinsics.areEqual(uri.toString(), "content://toss.send.provider/pattern?pattern=account_short"))) {
            int i2 = IAuthTabCallbackDefault + 41;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            if (Intrinsics.areEqual(str, "com.samsung.android.messaging")) {
                return;
            }
        }
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        String str2 = "query: " + uri.getPath();
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("callingPackageName", str);
        Object[] objArr = new Object[1];
        a(new char[]{7515, 5643, 3049}, 2902 - MotionEvent.axisFromString(BuildConfig.FLAVOR), objArr);
        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "SendInfoProvider", str2, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr[0]).intern(), uri)}), (String) null, false, (String) null, 56, (Object) null);
        int i4 = IAuthTabCallbackDefault + 53;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    static void onWarmupCompleted() {
        IAuthTabCallback = -80996928924772327L;
    }
}
