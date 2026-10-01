package o;

import android.webkit.WebView;
import im.toss.extensions.WebViewsKt$;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class PermissionUtil {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static final AppSetIdAndScope1 onNavigationEvent = ea10.onExtraCallbackWithResult("WebView");
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ Object onExtraCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = (~((~i6) | i2)) | (~(i2 | i3));
        int i8 = (~i2) | (~i3);
        int i9 = i7 | (~(i8 | i6));
        int i10 = (~i8) | i6;
        int i11 = ~(i3 | i6);
        int i12 = i6 + i2 + i5 + ((-417414852) * i) + (1247522396 * i4);
        int i13 = i12 * i12;
        int i14 = (i6 * (-1219797419)) + 1526988800 + ((-1219797419) * i2) + (825712212 * i9) + ((-1651424424) * i10) + ((-825712212) * i11) + ((-2045509632) * i5) + ((-2135949312) * i) + ((-953155584) * i4) + ((-430374912) * i13);
        int i15 = ((i6 * 184508743) - 476012450) + (i2 * 184508743) + (i9 * (-996)) + (i10 * 1992) + (i11 * 996) + (i5 * 184509739) + (i * (-953474796)) + (i4 * (-288057996)) + (i13 * (-839712768));
        return i14 + ((i15 * i15) * 1709113344) != 1 ? onNavigationEvent(objArr) : onWarmupCompleted(objArr);
    }

    public static /* synthetic */ void onExtraCallbackWithResult(String str, WebView webView, String str2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(str, webView, str2);
        int i4 = onWarmupCompleted + 41;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 46 / 0;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        WebView webView = (WebView) objArr[1];
        String str = (String) objArr[2];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(zBooleanValue, webView, str);
        int i4 = onExtraCallback + 43;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static final /* synthetic */ void onWarmupCompleted(WebView webView, boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(webView, z);
        int i4 = onExtraCallback + 91;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        int i = onExtraCallbackWithResult + 31;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        WebView webView = (WebView) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        Object obj = objArr[4];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 31;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0 ? (iIntValue & 2) != 0 : (iIntValue & 2) != 0) {
            int i4 = i3 + 7;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            str2 = null;
        }
        onExtraCallbackWithResult(webView, str, str2);
        return null;
    }

    public static final void onExtraCallbackWithResult(@NotNull WebView webView, @NotNull String str, @Nullable String str2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(webView, "");
        Intrinsics.checkNotNullParameter(str, "");
        StringsKt.take(str, 200);
        webView.evaluateJavascript(str, new WebViewsKt$.ExternalSyntheticLambda1(str2, webView));
        int i2 = onExtraCallback + 37;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onExtraCallback(String str, WebView webView, String str2) {
        int i = 2 % 2;
        if (str != null && !StringsKt.isBlank(str)) {
            webView.evaluateJavascript(str + "(" + str2 + ")", null);
            int i2 = onExtraCallback + 79;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = onExtraCallback + 25;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onWarmupCompleted(WebView webView, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 65;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 81;
            onWarmupCompleted = i6 % 128;
            z = i6 % 2 == 0;
            int i7 = i4 + 1;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
        }
        IAuthTabCallback(webView, z);
        int i9 = onWarmupCompleted + 121;
        onExtraCallback = i9 % 128;
        int i10 = i9 % 2;
    }

    public static final void IAuthTabCallback(@NotNull WebView webView, boolean z) {
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(webView, "");
            webView.requestFocus();
            textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(webView);
            int i3 = 41 / 0;
            if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult == null) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(webView, "");
            webView.requestFocus();
            textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(webView);
            if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult == null) {
                return;
            }
        }
        TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult);
        if (textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent != null) {
            maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(webView, z, null), 3, (Object) null);
            int i4 = onExtraCallback + 41;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ boolean $showIfAnyFocused;
        final /* synthetic */ WebView $this_requestFocusAndShowSoftInputIfNeeded;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(WebView webView, boolean z, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$this_requestFocusAndShowSoftInputIfNeeded = webView;
            this.$showIfAnyFocused = z;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 61;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 15;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$this_requestFocusAndShowSoftInputIfNeeded, this.$showIfAnyFocused, access13800Var);
            int i2 = IAuthTabCallback + 3;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 68 / 0;
            }
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 111;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 19;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return objIAuthTabCallback;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 53;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                int i5 = IAuthTabCallback;
                int i6 = i5 + 61;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i8 = i5 + 11;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                ResultKt.onNavigationEvent(obj);
                int i10 = onExtraCallbackWithResult + 99;
                IAuthTabCallback = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 2 / 3;
                }
            } else {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(500L, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            PermissionUtil.onWarmupCompleted(this.$this_requestFocusAndShowSoftInputIfNeeded, this.$showIfAnyFocused);
            return Unit.INSTANCE;
        }
    }

    private static final void onExtraCallback(WebView webView, boolean z) {
        int i = 2 % 2;
        webView.evaluateJavascript("(function() {\n        var inputFocus = document.querySelector('input:focus');\n        if (inputFocus != null) {\n            return inputFocus.type\n        }\n\n        var textareaFocus = document.querySelector('textarea:focus');\n        if (textareaFocus != null) {\n            return textareaFocus.type\n        }\n\n        var contentEditable = document.querySelector('[contenteditable=\"true\"]:focus');\n        if (contentEditable != null) {\n            return contentEditable\n        }\n\n        return null\n    })();", new WebViewsKt$.ExternalSyntheticLambda0(z, webView));
        int i2 = onWarmupCompleted + 89;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static final void onWarmupCompleted(boolean z, WebView webView, String str) {
        int i = 2 % 2;
        if (str != null) {
            int i2 = onExtraCallback + 17;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (!(!Intrinsics.areEqual(str, "null"))) {
                return;
            }
            int i4 = onWarmupCompleted + 27;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            if (z || !(!getDistance.onWarmupCompleted.onExtraCallback(new Regex("^\"|\"$").replace(str, "")))) {
                M_.onNavigationEvent(1312897292, new Object[]{M_.onExtraCallback, webView}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -1312897289, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent());
            }
        }
    }
}
