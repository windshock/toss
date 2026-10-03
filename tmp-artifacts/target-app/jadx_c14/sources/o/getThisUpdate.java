package o;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.getThisUpdate;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.common.securekey.SecureKeyboardAdapterKt$;
import viva.republica.toss.common.securekey.SecureKeyboardView;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getThisUpdate {
    public static /* synthetic */ void onExtraCallback(EditText editText, SecureKeyboardView secureKeyboardView, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: viva.republica.toss.common.securekey.SecureKeyboardAdapterKt$$ExternalSyntheticLambda3
                public final Object invoke(Object obj2) {
                    return getThisUpdate.onNavigationEvent(((Boolean) obj2).booleanValue());
                }
            };
        }
        IAuthTabCallback(editText, secureKeyboardView, z, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(boolean z) {
        return Unit.INSTANCE;
    }

    public static final void IAuthTabCallback(@NotNull final EditText editText, @NotNull final SecureKeyboardView secureKeyboardView, final boolean z, @NotNull final Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(editText, "");
        Intrinsics.checkNotNullParameter(secureKeyboardView, "");
        Intrinsics.checkNotNullParameter(function1, "");
        editText.setShowSoftInputOnFocus(false);
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: viva.republica.toss.common.securekey.SecureKeyboardAdapterKt$$ExternalSyntheticLambda0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z2) {
                getThisUpdate.onWarmupCompleted(function1, editText, secureKeyboardView, z, view, z2);
            }
        });
        if (z) {
            editText.setOnTouchListener(new View.OnTouchListener() { // from class: viva.republica.toss.common.securekey.SecureKeyboardAdapterKt$$ExternalSyntheticLambda1
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return getThisUpdate.onWarmupCompleted(secureKeyboardView, view, motionEvent);
                }
            });
            editText.setOnKeyListener(new View.OnKeyListener() { // from class: viva.republica.toss.common.securekey.SecureKeyboardAdapterKt$$ExternalSyntheticLambda2
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                    return getThisUpdate.onExtraCallback(secureKeyboardView, view, i, keyEvent);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onWarmupCompleted(Function1 function1, EditText editText, SecureKeyboardView secureKeyboardView, boolean z, View view, boolean z2) {
        TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent;
        function1.invoke(Boolean.valueOf(z2));
        if (z2) {
            M_.onExtraCallback.onExtraCallback(editText);
            TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(editText);
            if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult != null && (textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult)) != null) {
                maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(editText, null), 3, (Object) null);
            }
            secureKeyboardView.setOnSecureKeyListener((Function1<? super DigestInfo, Unit>) new SecureKeyboardAdapterKt$.ExternalSyntheticLambda4(editText.onCreateInputConnection(new EditorInfo()), editText));
            secureKeyboardView.onWarmupCompleted();
            if (z) {
                secureKeyboardView.setVisibility(0);
                return;
            }
            return;
        }
        secureKeyboardView.setOnSecureKeyListener((SecureKeyboardView.IAuthTabCallback) null);
        if (z) {
            secureKeyboardView.setVisibility(8);
        }
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ EditText $this_registerSecureKeyboardView;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(EditText editText, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$this_registerSecureKeyboardView = editText;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onNavigationEvent(this.$this_registerSecureKeyboardView, access13800Var);
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(300L, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            if (this.$this_registerSecureKeyboardView.isFocused()) {
                M_.onExtraCallback.onExtraCallback(this.$this_registerSecureKeyboardView);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(InputConnection inputConnection, EditText editText, DigestInfo digestInfo) {
        Intrinsics.checkNotNullParameter(digestInfo, "");
        inputConnection.finishComposingText();
        int i = onExtraCallback.onNavigationEvent[digestInfo.ordinal()];
        if (i == 1) {
            CharSequence selectedText = inputConnection.getSelectedText(0);
            if (selectedText == null || selectedText.length() == 0) {
                inputConnection.deleteSurroundingText(1, 0);
            } else {
                inputConnection.commitText("", 1);
            }
        } else if (i == 2) {
            editText.setText((CharSequence) null);
        } else {
            inputConnection.commitText(digestInfo.getTitle(), 1);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean onWarmupCompleted(SecureKeyboardView secureKeyboardView, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && view.hasFocus()) {
            secureKeyboardView.setVisibility(0);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean onExtraCallback(SecureKeyboardView secureKeyboardView, View view, int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getAction() != 0 || secureKeyboardView.getVisibility() != 0) {
            return false;
        }
        secureKeyboardView.setVisibility(8);
        return true;
    }
}
