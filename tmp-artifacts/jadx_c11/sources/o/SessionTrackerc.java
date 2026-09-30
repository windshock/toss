package o;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.JsonObject;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.featurescommon.servicetermsagreement.standardtermsv2.domain.R;
import im.toss.standardtermsv2.handler.ConsentViaStandardTermsV2Handler$onHandleMessage$1$;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.r8lambda6V0YVgpvgCQzEji1GNetQSIYsE;
import o.wie2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class SessionTrackerc implements ALCFaceQuality {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int[] IAuthTabCallback = {592564778, -1733300660, 36791297, -894986659, 609525189, -718996964, 1965940125, -2051512548, 354960187, -1089541161, -1220620351, -1971994270, 227480578, -1410114488, 2004779649, -91722913, -1733124958, -583414808};
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    private static char onExtraCallback = 44961;
    private static char onExtraCallbackWithResult = 8255;
    private static char onNavigationEvent = 15426;
    private static char onWarmupCompleted = 36746;

    public static final /* synthetic */ void onExtraCallback(SessionTrackerc sessionTrackerc, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse, String str, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, Context context) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 97;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        sessionTrackerc.onWarmupCompleted(r8lambda6v0yvgpvgcqzeji1gnetqsiyse, str, setonoutofmemeryerrorcallback, context);
        if (i3 == 0) {
            throw null;
        }
    }

    public /* bridge */ onOutOfMemory onExtraCallback() {
        onOutOfMemory onoutofmemoryOnExtraCallback;
        int i = 2 % 2;
        int i2 = asBinder + 49;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
            int i3 = 10 / 0;
        } else {
            onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
        }
        int i4 = IAuthTabCallbackDefault + 39;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return onoutofmemoryOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = asBinder + 45;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        if (i5 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 53;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        int i4 = IAuthTabCallbackDefault + 123;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return zOnExtraCallbackWithResult;
        }
        throw null;
    }

    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 43;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        int i4 = asBinder + 101;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = asBinder + 113;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        int i4 = IAuthTabCallbackDefault + 123;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return aLCFaceValidationOnWarmupCompleted;
        }
        throw null;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 39;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        if (i5 == 0) {
            throw null;
        }
    }

    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        Object obj;
        Map mapOnNavigationEvent;
        int i = 2 % 2;
        int i2 = asBinder + 11;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(jsonObject, "");
            Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
            r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
            throw null;
        }
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        Context context = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
        if (context == null) {
            Object[] objArr = new Object[1];
            b(new int[]{-550554400, 1250563704, -1264649673, -1338092177, 1577375765, -1273977409, -258659001, 930822935}, 15 - ((Process.getThreadPriority(0) + 20) >> 6), objArr);
            setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, ((String) objArr[0]).intern(), r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0.RESULT_OTHER_ERROR.getReason(), (Map) null, 4, (Object) null);
            return;
        }
        setText settext = new setText(jsonObject);
        Object[] objArr2 = new Object[1];
        a(new char[]{24461, 52329, 53315, 5190, 43135, 20227}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 6, objArr2);
        String strOnNavigationEvent = settext.onNavigationEvent(((String) objArr2[0]).intern(), "");
        if (StringsKt.isBlank(strOnNavigationEvent)) {
            int i3 = asBinder + 91;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 == 0) {
                String string = context.getString(R.string.service_terms_agreement_standardterms_v2_domain_must_be_set_std_id);
                Object[] objArr3 = new Object[1];
                a(new char[]{50034, 42704, 32434, 15132, 46080, 56951, 303, 40343, 10991, 36946, 13781, 52198, 6442, 10412, 56385, 22073}, TextUtils.getOffsetBefore("", 0) + 15, objArr3);
                setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, string, ((String) objArr3[0]).intern(), (Map) null, 4, (Object) null);
                return;
            }
            String string2 = context.getString(R.string.service_terms_agreement_standardterms_v2_domain_must_be_set_std_id);
            Object[] objArr4 = new Object[1];
            a(new char[]{50034, 42704, 32434, 15132, 46080, 56951, 303, 40343, 10991, 36946, 13781, 52198, 6442, 10412, 56385, 22073}, 57 << TextUtils.getOffsetBefore("", 1), objArr4);
            setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, string2, ((String) objArr4[0]).intern(), (Map) null, 5, (Object) null);
            return;
        }
        Object[] objArr5 = new Object[1];
        a(new char[]{46827, 731, 7101, 527, 13870, 14724, 58011, 265}, 8 - TextUtils.getOffsetBefore("", 0), objArr5);
        String strOnNavigationEvent2 = settext.onNavigationEvent(((String) objArr5[0]).intern(), "");
        Object[] objArr6 = new Object[1];
        a(new char[]{55673, 19051, 11057, 24289, 46661, 19906, 54808, 16382, 46827, 731, 7101, 527, 13870, 14724, 58011, 265}, 16 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr6);
        String strOnNavigationEvent3 = settext.onNavigationEvent(((String) objArr6[0]).intern(), "");
        Object[] objArr7 = new Object[1];
        b(new int[]{289245497, -1588307234, -1010394690, -1654558813, -1496667535, 2032830936}, View.getDefaultSize(0, 0) + 9, objArr7);
        Object[] objArr8 = {settext, ((String) objArr7[0]).intern(), -1L};
        long jLongValue = ((Long) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -616100104, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 616100108, objArr8)).longValue();
        Object[] objArr9 = new Object[1];
        a(new char[]{30552, 7275, 27030, 10934, 59158, 18829, 56725, 4640, 44652, 48891}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 10, objArr9);
        String strOnNavigationEvent4 = settext.onNavigationEvent(((String) objArr9[0]).intern(), "");
        if (StringsKt.isBlank(strOnNavigationEvent4)) {
            mapOnNavigationEvent = access8100.onNavigationEvent();
            int i4 = IAuthTabCallbackDefault + 113;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
        } else {
            try {
                Result.Companion companion = Result.Companion;
                wie2.IAuthTabCallback iAuthTabCallback = wie2.Default;
                iAuthTabCallback.onExtraCallback();
                getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
                obj = Result.constructor-impl((Map) iAuthTabCallback.onExtraCallback(new getMutilBackgroundDrawable(getwrigglelayout, sp.IAuthTabCallback(getwrigglelayout)), strOnNavigationEvent4));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            Map mapOnNavigationEvent2 = access8100.onNavigationEvent();
            if (Result.onExtraCallback(obj)) {
                int i6 = asBinder + 57;
                IAuthTabCallbackDefault = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 91 / 0;
                }
                obj = mapOnNavigationEvent2;
            }
            mapOnNavigationEvent = (Map) obj;
        }
        Map map = mapOnNavigationEvent;
        FragmentActivity activity = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getActivity();
        if (activity == null) {
            ALCFaceBox.onExtraCallbackWithResult(setonoutofmemeryerrorcallback, new ActivityNotFoundException(), (String) null, (Map) null, 6, (Object) null);
        } else {
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(r8lambdakrhaimf1bm5cgjbilhp45vln_xq), (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(context, strOnNavigationEvent, strOnNavigationEvent2, strOnNavigationEvent3, jLongValue, map, activity, this, setonoutofmemeryerrorcallback, null), 3, (Object) null);
        }
    }

    public static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ FragmentActivity $activity;
        final /* synthetic */ setOnOutOfMemeryErrorCallback $callbackProxy;
        final /* synthetic */ Context $context;
        final /* synthetic */ Map<String, String> $extraInfo;
        final /* synthetic */ long $funnelId;
        final /* synthetic */ String $referrer;
        final /* synthetic */ String $serviceReferrer;
        final /* synthetic */ String $standardTermsCode;
        int label;
        final /* synthetic */ SessionTrackerc this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(Context context, String str, String str2, String str3, long j, Map<String, String> map, FragmentActivity fragmentActivity, SessionTrackerc sessionTrackerc, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$context = context;
            this.$standardTermsCode = str;
            this.$referrer = str2;
            this.$serviceReferrer = str3;
            this.$funnelId = j;
            this.$extraInfo = map;
            this.$activity = fragmentActivity;
            this.this$0 = sessionTrackerc;
            this.$callbackProxy = setonoutofmemeryerrorcallback;
        }

        public static /* synthetic */ void onNavigationEvent(SessionTrackerc sessionTrackerc, String str, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, Context context, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 119;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult(sessionTrackerc, str, setonoutofmemeryerrorcallback, context, r8lambda6v0yvgpvgcqzeji1gnetqsiyse);
            int i4 = IAuthTabCallback + 37;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$context, this.$standardTermsCode, this.$referrer, this.$serviceReferrer, this.$funnelId, this.$extraInfo, this.$activity, this.this$0, this.$callbackProxy, access13800Var);
            int i2 = IAuthTabCallback + 11;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return onextracallback;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 5;
            onWarmupCompleted = i2 % 128;
            Object obj3 = null;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                onWarmupCompleted(findresandmsg, access13800Var);
                obj3.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
            int i3 = IAuthTabCallback + 107;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                return objOnWarmupCompleted;
            }
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 65;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 45;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        private static final void onExtraCallbackWithResult(SessionTrackerc sessionTrackerc, String str, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, Context context, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 47;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "ConsentViaStandardTermsV2Handler", "launcher1", (Map) null, (String) null, false, (String) null, 60, (Object) null);
            SessionTrackerc.onExtraCallback(sessionTrackerc, r8lambda6v0yvgpvgcqzeji1gnetqsiyse, str, setonoutofmemeryerrorcallback, context);
            int i4 = onWarmupCompleted + 41;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallback;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 109;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            Object obj2 = null;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                getDummyAd getdummyadOnNavigationEvent = getDummyAd.Companion.onNavigationEvent(this.$context);
                Context context = this.$context;
                String str = this.$standardTermsCode;
                String str2 = this.$referrer;
                String str3 = this.$serviceReferrer;
                long j = this.$funnelId;
                Map<String, String> map = this.$extraInfo;
                this.label = 1;
                objOnExtraCallback = getDummyAd.onExtraCallback(getdummyadOnNavigationEvent, context, str, str2, str3, j, map, null, false, null, null, null, null, null, null, null, false, false, false, null, null, false, null, null, this, 8388544, null);
                if (objOnExtraCallback == objOnWarmupCompleted) {
                    int i5 = onWarmupCompleted + 113;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        return objOnWarmupCompleted;
                    }
                    throw null;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = IAuthTabCallback + 61;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 != 0) {
                    ResultKt.onNavigationEvent(obj);
                    obj2.hashCode();
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
                objOnExtraCallback = obj;
            }
            SessionTrackera.Companion.onExtraCallback(this.$activity.getActivityResultRegistry().onExtraCallback("ConsentViaStandardTermsV2Handler", AppLovinAdImpl.onExtraCallbackWithResult(), new ConsentViaStandardTermsV2Handler$onHandleMessage$1$.ExternalSyntheticLambda0(this.this$0, this.$standardTermsCode, this.$callbackProxy, this.$context))).onNavigationEvent((Intent) objOnExtraCallback);
            Unit unit = Unit.INSTANCE;
            int i7 = IAuthTabCallback + 103;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            return unit;
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (true) {
            Object obj = null;
            if (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent >= cArr.length) {
                break;
            }
            int i4 = $11 + 115;
            $10 = i4 % 128;
            int i5 = 58224;
            char c = 1;
            if (i4 % 2 != 0) {
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            } else {
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            }
            int i6 = i3;
            while (i6 < 16) {
                int i7 = $10 + 65;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                char c2 = cArr3[c];
                char c3 = cArr3[i3];
                char[] cArr4 = cArr3;
                int i9 = (c3 + i5) ^ ((c3 << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)));
                int i10 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onExtraCallback);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[c] = Integer.valueOf(i9);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                        int i11 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10;
                        int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 12435;
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(threadPriority, i11, bitsPerPixel, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(obj, objArr2)).charValue();
                    cArr4[c] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getEdgeSlop() >> 16), 9 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 12433 - TextUtils.lastIndexOf("", '0', 0, 0), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i6++;
                    cArr3 = cArr4;
                    i3 = 0;
                    obj = null;
                    c = 1;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 14, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i12 = $10 + 31;
        $11 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    private final void onWarmupCompleted(r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse, String str, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, Context context) throws Throwable {
        String strName;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 11;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if (StringsKt.isBlank(str)) {
            String string = context.getString(R.string.service_terms_agreement_standardterms_v2_domain_must_be_set_std_id);
            Object[] objArr = new Object[1];
            a(new char[]{50034, 42704, 32434, 15132, 46080, 56951, 303, 40343, 10991, 36946, 13781, 52198, 6442, 10412, 56385, 22073}, 14 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr);
            setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, string, ((String) objArr[0]).intern(), (Map) null, 4, (Object) null);
            return;
        }
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Object[] objArr2 = new Object[1];
        b(new int[]{-1248085353, 429458956, -1692030791, 1304614082, -148673893, 1981201979, 1768763613, -1160054424, 1897018623, -1499145890, -1917122240, -526892187, 638976946, -2052149700, -1914843598, 1518173888}, (ViewConfiguration.getLongPressTimeout() >> 16) + 32, objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        b(new int[]{678398504, -471595838, 856536907, 4011769, 1074469921, -603674384, 962981950, 601979933, -1754051625, -1936305111, -2105051152, 2000949803}, 24 - View.resolveSizeAndState(0, 0, 0), objArr3);
        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, strIntern, ((String) objArr3[0]).intern(), (Map) null, (String) null, false, (String) null, 60, (Object) null);
        JsonObject jsonObject = new JsonObject();
        Object[] objArr4 = new Object[1];
        a(new char[]{43135, 20227}, '2' - AndroidCharacter.getMirror('0'), objArr4);
        jsonObject.addProperty(((String) objArr4[0]).intern(), str);
        if (r8lambda6v0yvgpvgcqzeji1gnetqsiyse.onExtraCallbackWithResult().isSucceed()) {
            Object[] objArr5 = new Object[1];
            a(new char[]{24461, 52329, 60219, 31390, 16467, 64720}, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 4, objArr5);
            jsonObject.addProperty(((String) objArr5[0]).intern(), r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0.RESULT_COMPLETED_MESSAGE.getReason());
        } else {
            Object[] objArr6 = new Object[1];
            a(new char[]{24461, 52329, 60219, 31390, 16467, 64720}, Color.red(0) + 5, objArr6);
            jsonObject.addProperty(((String) objArr6[0]).intern(), r8lambda6v0yvgpvgcqzeji1gnetqsiyse.onExtraCallbackWithResult().getReason());
        }
        r8lambda6V0YVgpvgCQzEji1GNetQSIYsE.onNavigationEvent onnavigationeventOnWarmupCompleted = r8lambda6v0yvgpvgcqzeji1gnetqsiyse.onWarmupCompleted();
        if (onnavigationeventOnWarmupCompleted != null && (strName = onnavigationeventOnWarmupCompleted.name()) != null) {
            int i4 = IAuthTabCallbackDefault + 73;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr7 = new Object[1];
            a(new char[]{5626, 55520, 24461, 52329, 51284, 62664, 3382, 17224, 45588, 26053, 6585, 55553, 12788, 8508, 41548, 13540, 45588, 26053, 138, 57461, 34855, 57189, 61545, 5885}, 24 - TextUtils.indexOf("", "", 0, 0), objArr7);
            jsonObject.addProperty(((String) objArr7[0]).intern(), strName);
        }
        Object[] objArr8 = new Object[1];
        b(new int[]{-1248085353, 429458956, -1692030791, 1304614082, -148673893, 1981201979, 1768763613, -1160054424, 1897018623, -1499145890, -1917122240, -526892187, 638976946, -2052149700, -1914843598, 1518173888}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 32, objArr8);
        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, ((String) objArr8[0]).intern(), jsonObject.toString(), (Map) null, (String) null, false, (String) null, 60, (Object) null);
        ALCFaceBox.onWarmupCompleted(setonoutofmemeryerrorcallback, jsonObject);
        int i6 = asBinder + 97;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
    }

    private static void b(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = IAuthTabCallback;
        float f = 0.0f;
        int i3 = -1469660336;
        int i4 = 0;
        if (iArr2 != null) {
            int i5 = $11 + 97;
            int i6 = i5 % 128;
            $10 = i6;
            int i7 = i5 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i8 = i6 + 17;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 0;
            while (i10 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i10])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1)), ((byte) KeyEvent.getModifierMetaStateMask()) + 73, 8848 - (ViewConfiguration.getWindowTouchSlop() >> 8), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i10] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i10++;
                    f = 0.0f;
                    i3 = -1469660336;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = IAuthTabCallback;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i11 = 0;
            while (i11 < length3) {
                Object[] objArr3 = new Object[1];
                objArr3[i4] = Integer.valueOf(iArr5[i11]);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore("", i4), 72 - KeyEvent.keyCodeFromString(""), 8848 - (ViewConfiguration.getLongPressTimeout() >> 16), -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i11] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i11++;
                i4 = 0;
            }
            iArr5 = iArr6;
        }
        int i12 = i4;
        System.arraycopy(iArr5, i12, iArr4, i12, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i12;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[i12] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i13 = 0;
            for (int i14 = 16; i13 < i14; i14 = 16) {
                int i15 = $10 + 45;
                $11 = i15 % 128;
                int i16 = i15 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i13];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 22251), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 39, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i13++;
            }
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i17;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - View.MeasureSpec.getSize(0)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 77, 7398 - (ViewConfiguration.getTouchSlop() >> 8), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            i12 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
