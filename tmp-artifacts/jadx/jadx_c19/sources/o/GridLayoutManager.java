package o;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.kakao.sdk.auth.model.Prompt;
import com.kakao.sdk.common.model.ApprovalType;
import com.kakao.sdk.common.model.AuthError;
import com.kakao.sdk.common.model.ClientError;
import com.kakao.sdk.common.model.ClientErrorCause;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class GridLayoutManager {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onNavigationEvent Companion;
    private static int IAuthTabCallbackDefault = 1;
    private static char[] IAuthTabCallbackStub = null;
    private static int asBinder = 1;
    private static int asInterface;
    private static final Lazy<GridLayoutManager> onExtraCallback;
    private static int onTransact;
    private final ApprovalType IAuthTabCallback;
    private final layoutForPredictiveAnimations onExtraCallbackWithResult;
    private final logChildren onNavigationEvent;
    private final updateAnchorFromChildren onWarmupCompleted;

    public GridLayoutManager() {
        this(null, null, null, null, 15, null);
    }

    public GridLayoutManager(@NotNull updateAnchorFromChildren updateanchorfromchildren, @NotNull layoutForPredictiveAnimations layoutforpredictiveanimations, @NotNull logChildren logchildren, @NotNull ApprovalType approvalType) {
        Intrinsics.checkNotNullParameter(updateanchorfromchildren, "");
        Intrinsics.checkNotNullParameter(layoutforpredictiveanimations, "");
        Intrinsics.checkNotNullParameter(logchildren, "");
        Intrinsics.checkNotNullParameter(approvalType, "");
        this.onWarmupCompleted = updateanchorfromchildren;
        this.onExtraCallbackWithResult = layoutforpredictiveanimations;
        this.onNavigationEvent = logchildren;
        this.IAuthTabCallback = approvalType;
    }

    public static final /* synthetic */ Lazy IAuthTabCallback() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 71;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Lazy<GridLayoutManager> lazy = onExtraCallback;
        if (i4 != 0) {
            int i5 = 31 / 0;
        }
        return lazy;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ GridLayoutManager(updateAnchorFromChildren updateanchorfromchildren, layoutForPredictiveAnimations layoutforpredictiveanimations, logChildren logchildren, ApprovalType approvalType, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        Object obj = null;
        if ((i2 & 1) != 0) {
            int i3 = IAuthTabCallbackDefault + 59;
            asInterface = i3 % 128;
            if (i3 % 2 != 0) {
                updateAnchorFromChildren.Companion.onNavigationEvent();
                obj.hashCode();
                throw null;
            }
            updateanchorfromchildren = updateAnchorFromChildren.Companion.onNavigationEvent();
            int i4 = asInterface + 3;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        }
        if ((i2 & 2) != 0) {
            int i6 = IAuthTabCallbackDefault + 39;
            asInterface = i6 % 128;
            if (i6 % 2 != 0) {
                fixLayoutStartGap.onNavigationEvent.onExtraCallbackWithResult();
                obj.hashCode();
                throw null;
            }
            layoutforpredictiveanimations = fixLayoutStartGap.onNavigationEvent.onExtraCallbackWithResult();
        }
        if ((i2 & 4) != 0) {
            logchildren = fixLayoutStartGap.onNavigationEvent.onExtraCallbackWithResult();
            int i7 = 2 % 2;
        }
        this(updateanchorfromchildren, layoutforpredictiveanimations, logchildren, (i2 & 8) != 0 ? fixLayoutStartGap.onNavigationEvent.onExtraCallback() : approvalType);
    }

    public final boolean onExtraCallbackWithResult(@NotNull Context context) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 123;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        if (this.onWarmupCompleted.onNavigationEvent(context, getNewListSize.onNavigationEvent.IAuthTabCallback()) == null) {
            int i5 = asInterface + 31;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = asInterface;
        int i8 = i7 + 75;
        IAuthTabCallbackDefault = i8 % 128;
        int i9 = i8 % 2;
        int i10 = i7 + 89;
        IAuthTabCallbackDefault = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 90 / 0;
        }
        return true;
    }

    public static /* synthetic */ void IAuthTabCallback(GridLayoutManager gridLayoutManager, Context context, List list, int i2, String str, List list2, List list3, String str2, String str3, Function2 function2, int i3, Object obj) {
        int i4;
        List list4;
        int i5 = 2 % 2;
        List list5 = (i3 & 2) != 0 ? null : list;
        if ((i3 & 4) != 0) {
            int i6 = asInterface + 75;
            IAuthTabCallbackDefault = i6 % 128;
            i4 = i6 % 2 == 0 ? 28300 : 10012;
        } else {
            i4 = i2;
        }
        String str4 = (i3 & 8) != 0 ? null : str;
        List list6 = (i3 & 16) != 0 ? null : list2;
        if ((i3 & 32) != 0) {
            int i7 = IAuthTabCallbackDefault + 63;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
            list4 = null;
        } else {
            list4 = list3;
        }
        gridLayoutManager.onNavigationEvent(context, list5, i4, str4, list6, list4, (i3 & 64) != 0 ? null : str2, (i3 & 128) != 0 ? null : str3, function2);
    }

    static final class onExtraCallbackWithResult extends Lambda implements Function1<Prompt, CharSequence> {
        public static final onExtraCallbackWithResult IAuthTabCallback = new onExtraCallbackWithResult();

        onExtraCallbackWithResult() {
            super(1);
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(@NotNull Prompt prompt) {
            Intrinsics.checkNotNullParameter(prompt, "");
            return prompt.getValue();
        }
    }

    public final void onNavigationEvent(@NotNull Context context, @Nullable List<? extends Prompt> list, int i2, @Nullable String str, @Nullable List<String> list2, @Nullable List<String> list3, @Nullable String str2, @Nullable String str3, @NotNull Function2<? super String, ? super Throwable, Unit> function2) {
        String strIntern;
        int i3 = 2 % 2;
        int i4 = asInterface + 75;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(function2, "");
            onExtraCallbackWithResult(context);
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function2, "");
        if (!onExtraCallbackWithResult(context)) {
            function2.invoke((Object) null, new ClientError(ClientErrorCause.NotSupported, "KakaoTalk not installed"));
            return;
        }
        try {
            getNewListSize getnewlistsize = getNewListSize.onNavigationEvent;
            String strOnExtraCallbackWithResult = this.onExtraCallbackWithResult.onExtraCallbackWithResult();
            String strIAuthTabCallbackDefault = this.onExtraCallbackWithResult.IAuthTabCallbackDefault();
            String strOnNavigationEvent = this.onNavigationEvent.onNavigationEvent();
            Bundle bundle = new Bundle();
            if (list2 != null) {
                bundle.putString("channel_public_id", CollectionsKt.joinToString$default(list2, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
            }
            if (list3 != null) {
                int i5 = IAuthTabCallbackDefault + 105;
                asInterface = i5 % 128;
                bundle.putString("service_terms", i5 % 2 != 0 ? CollectionsKt.joinToString$default(list3, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 95, (Object) null) : CollectionsKt.joinToString$default(list3, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
                int i6 = IAuthTabCallbackDefault + 7;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
            }
            String strOnExtraCallbackWithResult2 = this.IAuthTabCallback.onExtraCallbackWithResult();
            if (strOnExtraCallbackWithResult2 != null) {
                bundle.putString("approval_type", strOnExtraCallbackWithResult2);
                int i8 = asInterface + 125;
                IAuthTabCallbackDefault = i8 % 128;
                int i9 = i8 % 2;
            }
            if (str2 != null) {
                int i10 = asInterface + 113;
                IAuthTabCallbackDefault = i10 % 128;
                int i11 = i10 % 2;
                onNavigationEvent onnavigationevent = Companion;
                byte[] bytes = str2.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "");
                bundle.putString("code_challenge", onnavigationevent.onNavigationEvent(bytes));
                bundle.putString("code_challenge_method", "S256");
            }
            if (list != null) {
                int i12 = IAuthTabCallbackDefault + 117;
                asInterface = i12 % 128;
                int i13 = i12 % 2;
                bundle.putString("prompt", CollectionsKt.joinToString$default(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, onExtraCallbackWithResult.IAuthTabCallback, 30, (Object) null));
            }
            if (str != null) {
                int i14 = asInterface + 63;
                IAuthTabCallbackDefault = i14 % 128;
                if (i14 % 2 == 0) {
                    Object[] objArr = new Object[1];
                    a(new int[]{0, 5, 41, 2}, false, null, objArr);
                    strIntern = ((String) objArr[0]).intern();
                } else {
                    Object[] objArr2 = new Object[1];
                    a(new int[]{0, 5, 41, 2}, true, null, objArr2);
                    strIntern = ((String) objArr2[0]).intern();
                }
                bundle.putString(strIntern, str);
            }
            if (str3 != null) {
                bundle.putString("kauth_tx_id", str3);
            }
            Unit unit = Unit.INSTANCE;
            context.startActivity(getnewlistsize.onExtraCallback(context, i2, strOnExtraCallbackWithResult, strIAuthTabCallbackDefault, strOnNavigationEvent, bundle, onExtraCallback(function2)));
        } catch (Throwable th) {
            updateLayoutStateToFillStart.Companion.onNavigationEvent(th);
            function2.invoke((Object) null, th);
        }
    }

    public static /* synthetic */ void onNavigationEvent(GridLayoutManager gridLayoutManager, Context context, List list, List list2, String str, String str2, List list3, List list4, String str3, String str4, String str5, Function2 function2, int i2, Object obj) throws Throwable {
        List list5;
        String str6;
        List list6;
        String str7;
        String str8;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 13;
        int i5 = i4 % 128;
        asInterface = i5;
        Object obj2 = null;
        List list7 = (i4 % 2 == 0 ? (i2 & 2) == 0 : (i2 & 3) == 0) ? list : null;
        if ((i2 & 4) != 0) {
            int i6 = i5 + 33;
            IAuthTabCallbackDefault = i6 % 128;
            if (i6 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            list5 = null;
        } else {
            list5 = list2;
        }
        String str9 = (i2 & 8) != 0 ? null : str;
        if ((i2 & 16) != 0) {
            int i7 = i5 + 95;
            IAuthTabCallbackDefault = i7 % 128;
            int i8 = i7 % 2;
            str6 = null;
        } else {
            str6 = str2;
        }
        if ((i2 & 32) != 0) {
            int i9 = IAuthTabCallbackDefault + 65;
            asInterface = i9 % 128;
            if (i9 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
            list6 = null;
        } else {
            list6 = list3;
        }
        List list8 = (i2 & 64) != 0 ? null : list4;
        if ((i2 & 128) != 0) {
            int i10 = IAuthTabCallbackDefault + 61;
            asInterface = i10 % 128;
            if (i10 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
            str7 = null;
        } else {
            str7 = str3;
        }
        if ((i2 & 256) != 0) {
            int i11 = asInterface + 43;
            IAuthTabCallbackDefault = i11 % 128;
            int i12 = i11 % 2;
            str8 = null;
        } else {
            str8 = str4;
        }
        gridLayoutManager.IAuthTabCallback(context, list7, list5, str9, str6, list6, list8, str7, str8, (i2 & 512) != 0 ? null : str5, function2);
    }

    public final void IAuthTabCallback(@NotNull Context context, @Nullable List<? extends Prompt> list, @Nullable List<String> list2, @Nullable String str, @Nullable String str2, @Nullable List<String> list3, @Nullable List<String> list4, @Nullable String str3, @Nullable String str4, @Nullable String str5, @NotNull Function2<? super String, ? super Throwable, Unit> function2) throws Throwable {
        String str6;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function2, "");
        computeScrollOffset computescrolloffset = new computeScrollOffset(null, 1, null);
        String strOnExtraCallbackWithResult = this.onExtraCallbackWithResult.onExtraCallbackWithResult();
        String strIAuthTabCallbackDefault = this.onExtraCallbackWithResult.IAuthTabCallbackDefault();
        String strOnNavigationEvent = this.onNavigationEvent.onNavigationEvent();
        String strOnExtraCallbackWithResult2 = this.IAuthTabCallback.onExtraCallbackWithResult();
        if (str4 != null) {
            int i3 = asInterface + 115;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            onNavigationEvent onnavigationevent = Companion;
            byte[] bytes = str4.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            String strOnNavigationEvent2 = onnavigationevent.onNavigationEvent(bytes);
            int i5 = IAuthTabCallbackDefault + 13;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            str6 = strOnNavigationEvent2;
        } else {
            str6 = null;
        }
        Uri uriOnNavigationEvent = computescrolloffset.onNavigationEvent(strOnExtraCallbackWithResult, str2, strIAuthTabCallbackDefault, list2, strOnNavigationEvent, list3, list4, list, str3, str, strOnExtraCallbackWithResult2, str6, str4 != null ? "S256" : null, str5);
        updateLayoutStateToFillStart.Companion.onWarmupCompleted(uriOnNavigationEvent);
        try {
            context.startActivity(getNewListSize.onNavigationEvent.onExtraCallbackWithResult(context, uriOnNavigationEvent, this.onExtraCallbackWithResult.IAuthTabCallbackDefault(), onExtraCallback(function2)));
            int i7 = IAuthTabCallbackDefault + 11;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
        } catch (Throwable th) {
            updateLayoutStateToFillStart.Companion.onNavigationEvent(th);
            function2.invoke((Object) null, th);
        }
    }

    public final /* synthetic */ DiffUtilItemCallback onExtraCallback(Function2 function2) {
        int i2 = 2 % 2;
        int i3 = asInterface + 79;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function2, "");
        DiffUtilItemCallback diffUtilItemCallbackOnExtraCallbackWithResult = DiffUtilItemCallback.Companion.onExtraCallbackWithResult(function2, "Auth Code", IAuthTabCallback.onExtraCallback, onWarmupCompleted.onWarmupCompleted, asBinder.onExtraCallback);
        int i5 = asInterface + 83;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 11 / 0;
        }
        return diffUtilItemCallbackOnExtraCallbackWithResult;
    }

    static final class IAuthTabCallback extends Lambda implements Function1<Uri, String> {
        public static final IAuthTabCallback onExtraCallback = new IAuthTabCallback();

        IAuthTabCallback() {
            super(1);
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "");
            return uri.getQueryParameter("code");
        }
    }

    static final class onWarmupCompleted extends Lambda implements Function1<Uri, Throwable> {
        public static final onWarmupCompleted onWarmupCompleted = new onWarmupCompleted();

        onWarmupCompleted() {
            super(1);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(@NotNull Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "");
            return AuthError.Companion.onExtraCallbackWithResult(uri);
        }
    }

    static final class asBinder extends Lambda implements Function1<Uri, Boolean> {
        public static final asBinder onExtraCallback = new asBinder();

        asBinder() {
            super(1);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@NotNull Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "");
            String queryParameter = uri.getQueryParameter("code");
            return Boolean.valueOf(queryParameter == null || queryParameter.length() == 0);
        }
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public final GridLayoutManager onNavigationEvent() {
            return (GridLayoutManager) GridLayoutManager.IAuthTabCallback().getValue();
        }

        public final String onExtraCallbackWithResult() throws NoSuchAlgorithmException {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            byte[] bytes = string.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            String strEncodeToString = Base64.encodeToString(messageDigest.digest(bytes), 3);
            Intrinsics.checkNotNullExpressionValue(strEncodeToString, "");
            return strEncodeToString;
        }

        public final String onNavigationEvent(@NotNull byte[] bArr) {
            Intrinsics.checkNotNullParameter(bArr, "");
            String strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-256").digest(bArr), 11);
            Intrinsics.checkNotNullExpressionValue(strEncodeToString, "");
            return strEncodeToString;
        }
    }

    static final class onExtraCallback extends Lambda implements Function0<GridLayoutManager> {
        public static final onExtraCallback IAuthTabCallback = new onExtraCallback();

        onExtraCallback() {
            super(0);
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final GridLayoutManager invoke() {
            return new GridLayoutManager(null, null, null, null, 15, null);
        }
    }

    static {
        onNavigationEvent();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onNavigationEvent(defaultConstructorMarker);
        onExtraCallback = LazyKt.onExtraCallbackWithResult(onExtraCallback.IAuthTabCallback);
        int i2 = asBinder + 97;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        char c = 0;
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = IAuthTabCallbackStub;
        char c2 = '0';
        long j = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[c] = Integer.valueOf(cArr[i7]);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35284 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1))), (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) + 34, AndroidCharacter.getMirror('0') + 14191, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i7++;
                    c = 0;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            int i8 = $10 + 9;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c3 = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i10 = $10 + 11;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c3)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - (ViewConfiguration.getEdgeSlop() >> 16)), 66 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 16717, -846731970, false, TtmlNode.TAG_P, new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        Object obj = null;
                        cArr4[i11] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        obj.hashCode();
                        throw null;
                    }
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c3)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10983 - AndroidCharacter.getMirror(c2)), Color.alpha(0) + 65, 16718 - View.resolveSizeAndState(0, 0, 0), -846731970, false, TtmlNode.TAG_P, new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                } else {
                    int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c3)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 29, ExpandableListView.getPackedPositionType(0L) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                }
                c3 = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - Color.argb(0, 0, 0, 0)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 69, (ViewConfiguration.getScrollBarSize() >> 8) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
                c2 = '0';
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i14 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i14, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i14);
            int i15 = $10 + 103;
            $11 = i15 % 128;
            int i16 = i15 % 2;
        }
        if (z) {
            char[] cArr6 = new char[i4];
            int i17 = 0;
            while (true) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i17;
                if (trackGroupExternalSyntheticLambda0.onNavigationEvent >= i4) {
                    break;
                }
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                i17 = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                int i18 = $11 + 59;
                $10 = i18 % 128;
                int i19 = i18 % 2;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void onNavigationEvent() {
        IAuthTabCallbackStub = new char[]{27350, 27353, 27328, 27330, 27353};
    }
}
