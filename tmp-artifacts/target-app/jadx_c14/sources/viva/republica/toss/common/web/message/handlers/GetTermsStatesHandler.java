package viva.republica.toss.common.web.message.handlers;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ALCFaceQuality;
import o.ALCFaceValidation;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BeeVideoPlayerViewWrapper3;
import o.DERSet;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.EndMotionInteraction;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.access13800;
import o.access14300;
import o.findResAndMsg;
import o.maybeUpdateAnimatable;
import o.onOutOfMemory;
import o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ;
import o.setOnOutOfMemeryErrorCallback;
import o.setRandomHost;
import o.setText;
import o.startRunning;
import o.wie2;
import o.xkz2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.common.web.message.handlers.GetTermsStatesHandler$onHandleMessage$1$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class GetTermsStatesHandler implements ALCFaceQuality {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onWarmupCompleted Companion;
    private static final String IAuthTabCallback;
    private static char IAuthTabCallbackDefault = 0;
    private static boolean IAuthTabCallbackStub = false;
    private static int access000 = 0;
    private static int access100 = 1;
    private static char[] asBinder = null;
    private static int asInterface = 1;
    private static final long onExtraCallback;
    private static char[] onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onTransact;
    private static boolean onWarmupCompleted;

    static final class IAuthTabCallback extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GetTermsStatesHandler.IAuthTabCallback(GetTermsStatesHandler.this, null, this);
        }
    }

    static final class asBinder extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        asBinder(access13800<? super asBinder> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnWarmupCompleted = GetTermsStatesHandler.onWarmupCompleted(GetTermsStatesHandler.this, (access13800) this);
            return objOnWarmupCompleted == access14300.onWarmupCompleted() ? objOnWarmupCompleted : Result.IAuthTabCallback(objOnWarmupCompleted);
        }
    }

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GetTermsStatesHandler.onWarmupCompleted(GetTermsStatesHandler.this, null, this);
        }
    }

    public interface onNavigationEvent {
        BeeVideoPlayerViewWrapper3 getMenuInflater();
    }

    public static final /* synthetic */ Object IAuthTabCallback(GetTermsStatesHandler getTermsStatesHandler, List list, access13800 access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 17;
        access000 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            getTermsStatesHandler.onWarmupCompleted((List<Long>) list, (access13800<? super List<TermsState>>) access13800Var);
            obj.hashCode();
            throw null;
        }
        Object objOnWarmupCompleted = getTermsStatesHandler.onWarmupCompleted((List<Long>) list, (access13800<? super List<TermsState>>) access13800Var);
        int i3 = access000 + 115;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            return objOnWarmupCompleted;
        }
        throw null;
    }

    public static final /* synthetic */ Object onWarmupCompleted(GetTermsStatesHandler getTermsStatesHandler, List list, access13800 access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 21;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            getTermsStatesHandler.onNavigationEvent(list, access13800Var);
            throw null;
        }
        Object objOnNavigationEvent = getTermsStatesHandler.onNavigationEvent(list, access13800Var);
        int i3 = access100 + 33;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        return objOnNavigationEvent;
    }

    public static final /* synthetic */ Object onWarmupCompleted(GetTermsStatesHandler getTermsStatesHandler, access13800 access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 45;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback = getTermsStatesHandler.onExtraCallback(access13800Var);
        int i4 = access000 + 33;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return objOnExtraCallback;
    }

    public /* bridge */ onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = access000 + 71;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onOutOfMemory onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
        int i4 = access100 + 85;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 86 / 0;
        }
        return onoutofmemoryOnExtraCallback;
    }

    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = access000 + 119;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        int i6 = access100 + 61;
        access000 = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = access000 + 23;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        int i4 = access100 + 45;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallbackWithResult;
    }

    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access000 + 103;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            super/*o.drawTextBox*/.onNavigationEvent();
            throw null;
        }
        boolean zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        int i3 = access100 + 65;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        return zOnNavigationEvent;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = access000 + 105;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            super/*o.drawTextBox*/.onWarmupCompleted(str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        int i3 = access000 + 27;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return aLCFaceValidationOnWarmupCompleted;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = access100 + 125;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        int i6 = access100 + 109;
        access000 = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    static {
        onWarmupCompleted();
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-123, -117, -123, -123, -126, -118, -121, -126, -125, -119, -125, -120, -121, -122, -123, -126, -124, -125, -126, -127}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 126, objArr);
        IAuthTabCallback = ((String) objArr[0]).intern();
        Companion = new onWarmupCompleted(null);
        onExtraCallback = DERSet.onExtraCallback.ITrustedWebActivityCallbackStub();
        int i = asInterface + 37;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        JsonObject jsonObjectOnExtraCallbackWithResult = new setText(jsonObject).onExtraCallbackWithResult();
        Object[] objArr = new Object[1];
        b((byte) (110 - (ViewConfiguration.getPressedStateDuration() >> 16)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 8, new char[]{' ', 16, '\"', 17, '\b', 29, 17, 6}, objArr);
        JsonArray asJsonArray = jsonObjectOnExtraCallbackWithResult.getAsJsonArray(((String) objArr[0]).intern());
        if (asJsonArray == null) {
            asJsonArray = new JsonArray();
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(asJsonArray, 10));
        Iterator it = asJsonArray.iterator();
        while (!(!it.hasNext())) {
            arrayList.add(Long.valueOf(((JsonElement) it.next()).getAsLong()));
        }
        if (!arrayList.isEmpty()) {
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(r8lambdakrhaimf1bm5cgjbilhp45vln_xq), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackDefault(arrayList, setonoutofmemeryerrorcallback, null), 3, (Object) null);
            int i2 = access100 + 43;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        int i4 = access000 + 57;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr2 = new Object[1];
        b((byte) (84 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 17, new char[]{' ', 16, '\"', 17, '\b', 29, 17, 6, 0, '\f', 6, '#', 15, 17, 4, 31, 13879}, objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(null, null, new byte[]{-124, -120, -111, -104, -105, -111, -106, -118, -115, -116, -107, -108, -109, -110, -116}, View.MeasureSpec.getMode(0) + 127, objArr3);
        setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, strIntern, ((String) objArr3[0]).intern(), (Map) null, 4, (Object) null);
    }

    static final class IAuthTabCallbackDefault extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static long onExtraCallback = 5164931952633390325L;
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ setOnOutOfMemeryErrorCallback $callbackProxy;
        final /* synthetic */ List<Long> $termsIds;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackDefault(List<Long> list, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(2, access13800Var);
            this.$termsIds = list;
            this.$callbackProxy = setonoutofmemeryerrorcallback;
        }

        public static /* synthetic */ Unit onNavigationEvent(kotlinx.serialization.json.JsonArray jsonArray, startRunning startrunning) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 111;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                IAuthTabCallback(jsonArray, startrunning);
                throw null;
            }
            Unit unitIAuthTabCallback = IAuthTabCallback(jsonArray, startrunning);
            int i3 = onExtraCallbackWithResult + 81;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return unitIAuthTabCallback;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefault = GetTermsStatesHandler.this.new IAuthTabCallbackDefault(this.$termsIds, this.$callbackProxy, access13800Var);
            int i2 = onWarmupCompleted + 121;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return iAuthTabCallbackDefault;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 107;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800<? super Unit>) obj2);
            int i4 = onExtraCallbackWithResult + 63;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 42 / 0;
            }
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 115;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefaultCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                return iAuthTabCallbackDefaultCreate.invokeSuspend(Unit.INSTANCE);
            }
            iAuthTabCallbackDefaultCreate.invokeSuspend(Unit.INSTANCE);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final Unit IAuthTabCallback(kotlinx.serialization.json.JsonArray jsonArray, startRunning startrunning) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 79;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                startrunning.IAuthTabCallback(jsonArray);
                startrunning.IAuthTabCallback();
                return Unit.INSTANCE;
            }
            startrunning.IAuthTabCallback(jsonArray);
            startrunning.IAuthTabCallback();
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i3 = $11 + 73;
                $10 = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), 24 - ExpandableListView.getPackedPositionType(0L), View.getDefaultSize(0, 0) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i4] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() * (onExtraCallback ^ 5407414049857832247L);
                        Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), Color.argb(0, 0, 0, 0) + 59, TextUtils.indexOf("", "") + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 23, (Process.myTid() >> 22) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (onExtraCallback ^ 5407414049857832247L);
                    Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), 59 - TextUtils.getOffsetAfter("", 0), 6383 - ((Process.getThreadPriority(0) + 20) >> 6), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
            }
            char[] cArr2 = new char[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i6 = $10 + 19;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                    Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.indexOf("", "") + 59, 6384 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                    int i7 = 54 / 0;
                } else {
                    cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                    Object[] objArr7 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback6 == null) {
                        objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 59 - ExpandableListView.getPackedPositionGroup(0L), 6384 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback6).invoke(null, objArr7);
                }
            }
            String str = new String(cArr2);
            int i8 = $10 + 41;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            objArr[0] = str;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onExtraCallbackWithResult + 13;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0 ? i2 != 1 : i2 != 0) {
                    Object[] objArr = new Object[1];
                    a(new char[]{41377, 2268, 62288, 24019, 1054, 61133, 22871, 923, 59933, 21703, 16209, 59844, 20547, 15068, 58709, 20372, 13842, 57551, 19273, 13769, 40001, 18139, 12621, 39819, 16909, 11468, 38730, 16849, 10313, 37578, 32069, 10116, 36354, 30954, 9077, 36331, 29814, 57017, 35195, 29684, 55912, 34042, 28513, 55779, 32895, 27391, 54645}, TextUtils.getOffsetBefore("", 0) + 43391, objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                GetTermsStatesHandler getTermsStatesHandler = GetTermsStatesHandler.this;
                List<Long> list = this.$termsIds;
                this.label = 1;
                obj = GetTermsStatesHandler.IAuthTabCallback(getTermsStatesHandler, list, this);
                if (obj == objOnWarmupCompleted) {
                    int i4 = onWarmupCompleted + 105;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    return objOnWarmupCompleted;
                }
            }
            List<TermsState> list2 = (List) obj;
            if (list2 == null) {
                List<Long> list3 = this.$termsIds;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                Iterator<T> it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(new TermsState(((Number) it.next()).longValue(), false));
                }
                list2 = arrayList;
            }
            xkz2 xkz2Var = new xkz2();
            for (TermsState termsState : list2) {
                wie2 wie2VarOnExtraCallback = EndMotionInteraction.onExtraCallback();
                wie2VarOnExtraCallback.onExtraCallback();
                kotlinx.serialization.json.JsonObject jsonObjectIAuthTabCallback = wie2VarOnExtraCallback.IAuthTabCallback(TermsState.Companion.serializer(), termsState);
                Intrinsics.checkNotNull(jsonObjectIAuthTabCallback, "");
                xkz2Var.onWarmupCompleted(jsonObjectIAuthTabCallback);
            }
            this.$callbackProxy.IAuthTabCallback(new GetTermsStatesHandler$onHandleMessage$1$.ExternalSyntheticLambda0(xkz2Var.onNavigationEvent()));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object onWarmupCompleted(java.util.List<java.lang.Long> r17, o.access13800<? super java.util.List<viva.republica.toss.common.web.message.handlers.GetTermsStatesHandler.TermsState>> r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.common.web.message.handlers.GetTermsStatesHandler.onWarmupCompleted(java.util.List, o.access13800):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object onExtraCallback(o.access13800<? super kotlin.Result<kotlin.Unit>> r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.common.web.message.handlers.GetTermsStatesHandler.onExtraCallback(o.access13800):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object onNavigationEvent(java.util.List<java.lang.Long> r21, o.access13800<? super java.util.List<viva.republica.toss.common.web.message.handlers.GetTermsStatesHandler.TermsState>> r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.common.web.message.handlers.GetTermsStatesHandler.onNavigationEvent(java.util.List, o.access13800):java.lang.Object");
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onExtraCallbackWithResult;
        if (cArr2 != null) {
            int i4 = $10 + 95;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getMaxKeyCode() >> 16), ((byte) KeyEvent.getModifierMetaStateMask()) + 78, (ViewConfiguration.getPressedStateDuration() >> 16) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
        Object[] objArr3 = {Integer.valueOf(onNavigationEvent)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        long j = 0;
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 75 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 16038, -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        int i7 = 1052772399;
        if (IAuthTabCallbackStub) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i8 = $11 + 87;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 63, TextUtils.indexOf("", "", 0, 0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                j = 0;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!onWarmupCompleted) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i10 = $10 + 25;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i12 = $10 + 101;
        $11 = i12 % 128;
        if (i12 % 2 == 0) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            i2 = defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback;
        } else {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            i2 = defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback;
        }
        char[] cArr6 = new char[i2];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i13 = $10 + 35;
            $11 = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted;
                int i15 = defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback;
                int i16 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted;
                cArr6[i14] = (char) (cArr2[cArr[0] / i] + iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i7);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(0, 0), KeyEvent.normalizeMetaState(0) + 63, 12214 - Gravity.getAbsoluteGravity(0, 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            } else {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i7);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 63 - Color.alpha(0), 12214 - TextUtils.indexOf("", "", 0, 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            int i17 = $11 + 55;
            $10 = i17 % 128;
            int i18 = i17 % 2;
            i7 = 1052772399;
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(byte r33, int r34, char[] r35, java.lang.Object[] r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 779
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.common.web.message.handlers.GetTermsStatesHandler.b(byte, int, char[], java.lang.Object[]):void");
    }

    static void onWarmupCompleted() {
        onExtraCallbackWithResult = new char[]{32469, 32471, 32448, 32416, 32450, 32463, 32449, 32417, 32467, 32477, 32461, 32427, 32432, 32392, 32431, 32462, 32439, 32430, 32422, 32435, 32424, 32418, 32419, 32423};
        onNavigationEvent = -1184333956;
        onWarmupCompleted = true;
        IAuthTabCallbackStub = true;
        asBinder = new char[]{64984, 64963, 64978, 64976, 65066, 64979, 64986, 64980, 64981, 64999, 64964, 64960, 64983, 65067, 64982, 64977, 64990, 64987, 64989, 64992, 64988, 65069, 65064, 64991, 64970, 65065, 65018, 64966, 64916, 65008, 64915, 64998, 64965, 65020, 64967, 64961};
        IAuthTabCallbackDefault = (char) 51247;
    }
}
