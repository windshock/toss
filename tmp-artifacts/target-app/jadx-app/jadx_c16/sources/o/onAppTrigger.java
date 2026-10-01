package o;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import im.toss.features.cardissue.R;
import im.toss.features.cardissue.event.ui.cs.CardIssueCsInfoActivity;
import im.toss.features.cardissue.event.view.CardIssueFaqView;
import im.toss.features.cardissue.event.view.FaqUtilKt$;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class onAppTrigger {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long onExtraCallback = -3209131236821488001L;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Pair pair = (Pair) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(pair, zBooleanValue);
        if (i3 == 0) {
            int i4 = 29 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function0 function0) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(function0);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function0);
        int i3 = onWarmupCompleted + 37;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = (~(i4 | i5)) | i2;
        int i8 = (~((~i5) | i4)) | i2;
        int i9 = (~i2) | i4;
        int i10 = i2 + i4 + i + (440753341 * i6) + ((-634449194) * i3);
        int i11 = i10 * i10;
        int i12 = ((-907101825) * i2) + 1075183616 + ((-1421434046) * i4) + (i7 * (-1603099839)) + ((-1603099839) * i8) + (1603099839 * i9) + (181665792 * i) + (780402688 * i6) + ((-180879360) * i3) + (353763328 * i11);
        int i13 = (i2 * 892202253) + 1676176333 + (i4 * 892200102) + (i7 * (-717)) + (i8 * (-717)) + (i9 * 717) + (i * 892200819) + (i6 * (-770690073)) + (i3 * 448958498) + (i11 * 1390542848);
        return i12 + ((i13 * i13) * (-1042677760)) != 1 ? IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        String str = (String) objArr[0];
        Context context = (Context) objArr[1];
        String str2 = (String) objArr[2];
        View view = (View) objArr[3];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        IAuthTabCallback(str, context, str2, view);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = onWarmupCompleted + 41;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(str, setDetectableSize);
        int i4 = onExtraCallbackWithResult + 51;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(Pair pair, boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(1299089L, (String) pair.getFirst());
            Unit unit = Unit.INSTANCE;
            int i3 = onExtraCallbackWithResult + 17;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
        onWarmupCompleted(1299089L, (String) pair.getFirst());
        Unit unit2 = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(Function0 function0) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 91;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final List<Pair<String, String>> onExtraCallbackWithResult(Context context) {
        int i = 2 % 2;
        List<Pair<String, String>> listListOf = CollectionsKt.listOf(new Pair[]{new Pair(context.getString(R.string.card_issue_event_faq_cashback_title), context.getString(R.string.card_issue_event_faq_cashback_description, PlayerErrorCode.onPostMessage())), new Pair(context.getString(R.string.card_issue_event_faq_elibibility_title), context.getString(R.string.card_issue_event_faq_elibibility_description)), new Pair(context.getString(R.string.card_issue_event_faq_delivery_title), context.getString(R.string.card_issue_event_faq_delivery_description))});
        int i2 = onWarmupCompleted + 37;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 79 / 0;
        }
        return listListOf;
    }

    private static final getWidthAndHeight onExtraCallbackWithResult(Context context, String str, String str2, String str3) {
        int i = 2 % 2;
        getWidthAndHeight getwidthandheightOnExtraCallbackWithResult = getWidthAndHeight.onExtraCallbackWithResult(LayoutInflater.from(context));
        getwidthandheightOnExtraCallbackWithResult.onNavigationEvent.setText(str2);
        getwidthandheightOnExtraCallbackWithResult.onExtraCallbackWithResult.setOnClickListener(new FaqUtilKt$.ExternalSyntheticLambda0(str, context, str3));
        Intrinsics.checkNotNullExpressionValue(getwidthandheightOnExtraCallbackWithResult, "");
        int i2 = onExtraCallbackWithResult + 45;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return getwidthandheightOnExtraCallbackWithResult;
    }

    private static final void IAuthTabCallback(String str, Context context, String str2, View view) throws Throwable {
        CardIssueCsInfoActivity.onExtraCallbackWithResult onextracallbackwithresult;
        Object obj;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(1299101L, str);
            onextracallbackwithresult = CardIssueCsInfoActivity.Companion;
            Object[] objArr = new Object[1];
            a(new char[]{43818, 15442, 34274, 28017, 63131, 24077}, TextUtils.indexOf("", "", 1) * 38767, objArr);
            obj = objArr[0];
        } else {
            onWarmupCompleted(1299101L, str);
            onextracallbackwithresult = CardIssueCsInfoActivity.Companion;
            Object[] objArr2 = new Object[1];
            a(new char[]{43818, 15442, 34274, 28017, 63131, 24077}, 38767 - TextUtils.indexOf("", "", 0), objArr2);
            obj = objArr2[0];
        }
        context.startActivity(onextracallbackwithresult.onExtraCallback(context, str2, ((String) obj).intern()));
    }

    private static final void onWarmupCompleted(long j, String str) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(j, false, (String) null, (Map) null, new FaqUtilKt$.ExternalSyntheticLambda3(str), 14, (Object) null);
        int i2 = onExtraCallbackWithResult + 79;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static final Unit onNavigationEvent(String str, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("item_title", str);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 89;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static final List<CardIssueFaqView> onExtraCallback(@NotNull Context context, @Nullable String str, @NotNull Function0<Unit> function0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function0, "");
        List<Pair<String, String>> listOnExtraCallbackWithResult = onExtraCallbackWithResult(context);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listOnExtraCallbackWithResult, 10));
        Iterator<T> it = listOnExtraCallbackWithResult.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            CardIssueFaqView cardIssueFaqView = new CardIssueFaqView(context, null, 0, 6, null);
            cardIssueFaqView.setFaqTitle((String) pair.getFirst());
            LinearLayout linearLayoutOnNavigationEvent = onExtraCallbackWithResult(context, (String) pair.getFirst(), (String) pair.getSecond(), str).onNavigationEvent();
            Intrinsics.checkNotNullExpressionValue(linearLayoutOnNavigationEvent, "");
            cardIssueFaqView.onExtraCallbackWithResult(linearLayoutOnNavigationEvent);
            cardIssueFaqView.setOnOpenClickListener(new FaqUtilKt$.ExternalSyntheticLambda1(pair));
            cardIssueFaqView.setOnExpandRallyFinishListener(new FaqUtilKt$.ExternalSyntheticLambda2(function0));
            arrayList.add(cardIssueFaqView);
            int i2 = onExtraCallbackWithResult + 35;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0246  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        long j;
        Throwable th;
        char c;
        char c2;
        Throwable cause;
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (true) {
            j = 0;
            th = null;
            c = 1;
            if (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback >= cArr.length) {
                break;
            }
            int i3 = $11 + 71;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), 24 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getTapTimeout() >> 16) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() | (onExtraCallback / 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 59 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 6383 - KeyEvent.getDeadChar(0, 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th2) {
                    cause = th2.getCause();
                    if (cause != null) {
                    }
                }
            } else {
                int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), TextUtils.lastIndexOf("", '0', 0) + 25, 19626 - TextUtils.indexOf((CharSequence) "", '0', 0), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (onExtraCallback ^ 5407414049857832247L);
                Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(""), View.MeasureSpec.getMode(0) + 59, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cause = th2.getCause();
            if (cause != null) {
                throw th2;
            }
            throw cause;
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = $11 + 5;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback5 == null) {
                    char c3 = (char) (1 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)));
                    int offsetAfter = TextUtils.getOffsetAfter("", 0) + 59;
                    int iIndexOf = 6383 - TextUtils.indexOf("", "");
                    Class[] clsArr = new Class[2];
                    clsArr[0] = Object.class;
                    clsArr[c] = Object.class;
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c3, offsetAfter, iIndexOf, -1230372444, false, "D", clsArr);
                }
                ((Method) objOnExtraCallback5).invoke(th, objArr6);
                throw th;
            }
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr7 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback6 == null) {
                c2 = 1;
                objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarSize() >> 8), 59 - KeyEvent.keyCodeFromString(""), ExpandableListView.getPackedPositionChild(j) + 6384, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            } else {
                c2 = 1;
            }
            ((Method) objOnExtraCallback6).invoke(null, objArr7);
            int i7 = $11 + 9;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 5 % 3;
            }
            th = null;
            c = c2;
            j = 0;
        }
        objArr[0] = new String(cArr2);
    }

    public static /* synthetic */ Unit IAuthTabCallback(Pair pair, boolean z) {
        Object[] objArr = {pair, Boolean.valueOf(z)};
        int iOnWarmupCompleted = ACPayResult.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(ACPayResult.onWarmupCompleted(), 379449631, ACPayResult.onWarmupCompleted(), -379449631, objArr, iOnWarmupCompleted, ACPayResult.onWarmupCompleted());
    }

    public static /* synthetic */ void onExtraCallbackWithResult(String str, Context context, String str2, View view) {
        int iOnWarmupCompleted = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted2 = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted3 = ACPayResult.onWarmupCompleted();
        onExtraCallbackWithResult(iOnWarmupCompleted2, 230134076, ACPayResult.onWarmupCompleted(), -230134075, new Object[]{str, context, str2, view}, iOnWarmupCompleted, iOnWarmupCompleted3);
    }
}
