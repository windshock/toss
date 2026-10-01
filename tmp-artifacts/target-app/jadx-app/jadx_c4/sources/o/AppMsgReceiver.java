package o;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import im.toss.core.widget.keyboard.SecureQwertyKeyboard;
import im.toss.core.widget.keyboard.SecureQwertyKeyboardAdapterKt$;
import im.toss.features.teens.cvscash.CvsCashTransactionActivity$;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AppManagerImpl2;
import o.AppMsgReceiver;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class AppMsgReceiver {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    public static /* synthetic */ boolean IAuthTabCallback(SecureQwertyKeyboard secureQwertyKeyboard, View view, int i, KeyEvent keyEvent) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 51;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        boolean zOnExtraCallback = onExtraCallback(secureQwertyKeyboard, view, i, keyEvent);
        if (i4 == 0) {
            int i5 = 58 / 0;
        }
        int i6 = onNavigationEvent + 41;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return zOnExtraCallback;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        SecureQwertyKeyboard secureQwertyKeyboard = (SecureQwertyKeyboard) objArr[0];
        View view = (View) objArr[1];
        MotionEvent motionEvent = (MotionEvent) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallback = onExtraCallback(secureQwertyKeyboard, view, motionEvent);
        if (i3 != 0) {
            int i4 = 45 / 0;
        }
        int i5 = IAuthTabCallback + 67;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return Boolean.valueOf(zOnExtraCallback);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(AppManagerImpl2 appManagerImpl2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(appManagerImpl2);
        int i4 = onNavigationEvent + 3;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onNavigationEvent(InputConnection inputConnection, SecureQwertyKeyboard secureQwertyKeyboard, AppManagerImpl2 appManagerImpl2) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(inputConnection, secureQwertyKeyboard, appManagerImpl2);
        }
        onExtraCallbackWithResult(inputConnection, secureQwertyKeyboard, appManagerImpl2);
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i6;
        int i9 = ~(i7 | i8);
        int i10 = (~(i7 | i5)) | i9 | (~(i8 | i5));
        int i11 = ~i5;
        int i12 = (~(i11 | i8 | i)) | (~(i7 | i11 | i6));
        int i13 = i + i6 + i3 + ((-195996979) * i4) + ((-904719387) * i2);
        int i14 = i13 * i13;
        int i15 = (i * 1886715248) + 940376064 + (1886715248 * i6) + (i10 * (-42925423)) + (i9 * (-42925423)) + ((-42925423) * i12) + (1843789824 * i3) + ((-1389494272) * i4) + (1623064576 * i2) + (1510801408 * i14);
        int i16 = (i * 1590984816) + 1398186415 + (i6 * 1590984816) + (i10 * 737) + (i9 * 737) + (i12 * 737) + (i3 * 1590985553) + (i4 * (-1025631779)) + (i2 * 1121679989) + (i14 * 622657536);
        return i15 + ((i16 * i16) * (-1928134656)) != 1 ? onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr);
    }

    public static /* synthetic */ void onWarmupCompleted(EditText editText, SecureQwertyKeyboard secureQwertyKeyboard, View view, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {editText, secureQwertyKeyboard, view, Boolean.valueOf(z)};
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted2 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted3 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        if (i3 == 0) {
            onWarmupCompleted(707156291, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), objArr, iOnWarmupCompleted2, iOnWarmupCompleted3, iOnWarmupCompleted, -707156291);
        } else {
            onWarmupCompleted(707156291, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), objArr, iOnWarmupCompleted2, iOnWarmupCompleted3, iOnWarmupCompleted, -707156291);
            throw null;
        }
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ EditText $this_registerSecureKeyboardView;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(EditText editText, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$this_registerSecureKeyboardView = editText;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 45;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 65;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$this_registerSecureKeyboardView, access13800Var);
            int i2 = onExtraCallbackWithResult + 71;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 25;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            if (i3 == 0) {
                int i4 = 60 / 0;
            }
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onWarmupCompleted + 7;
                int i4 = i3 % 128;
                onExtraCallbackWithResult = i4;
                int i5 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = i4 + 125;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(300L, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            if (this.$this_registerSecureKeyboardView.isFocused()) {
                M_.onExtraCallback.onExtraCallback(this.$this_registerSecureKeyboardView);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final Unit onExtraCallbackWithResult(InputConnection inputConnection, SecureQwertyKeyboard secureQwertyKeyboard, AppManagerImpl2 appManagerImpl2) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(appManagerImpl2, "");
        inputConnection.finishComposingText();
        if (!(!(appManagerImpl2 instanceof AppManagerImpl2.onExtraCallback))) {
            CharSequence selectedText = inputConnection.getSelectedText(0);
            if (selectedText == null || selectedText.length() == 0) {
                inputConnection.deleteSurroundingText(1, 0);
            } else {
                int i4 = onNavigationEvent + 91;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                inputConnection.commitText("", 1);
                int i6 = onNavigationEvent + 103;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 4 / 4;
                }
            }
        } else if (appManagerImpl2 instanceof AppManagerImpl2.onExtraCallbackWithResult) {
            if (!Intrinsics.areEqual(appManagerImpl2, AppManagerImpl2.onExtraCallbackWithResult.onExtraCallback.onExtraCallbackWithResult)) {
                inputConnection.commitText(((AppManagerImpl2.onExtraCallbackWithResult) appManagerImpl2).onWarmupCompleted(), 1);
            }
        } else {
            if (!(appManagerImpl2 instanceof AppManagerImpl2.onNavigationEvent)) {
                throw new NoWhenBranchMatchedException();
            }
            secureQwertyKeyboard.setVisibility(8);
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(AppManagerImpl2 appManagerImpl2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(appManagerImpl2, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(appManagerImpl2, "");
        int i3 = 6 / 0;
        return Unit.INSTANCE;
    }

    public static final void onNavigationEvent(@NotNull final EditText editText, @NotNull final SecureQwertyKeyboard secureQwertyKeyboard) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(editText, "");
        Intrinsics.checkNotNullParameter(secureQwertyKeyboard, "");
        editText.setShowSoftInputOnFocus(false);
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: im.toss.core.widget.keyboard.SecureQwertyKeyboardAdapterKt$$ExternalSyntheticLambda2
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 13;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                EditText editText2 = editText;
                if (i4 == 0) {
                    AppMsgReceiver.onWarmupCompleted(editText2, secureQwertyKeyboard, view, z);
                } else {
                    AppMsgReceiver.onWarmupCompleted(editText2, secureQwertyKeyboard, view, z);
                    int i5 = 8 / 0;
                }
            }
        });
        editText.setOnTouchListener(new View.OnTouchListener() { // from class: im.toss.core.widget.keyboard.SecureQwertyKeyboardAdapterKt$$ExternalSyntheticLambda3
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 123;
                onNavigationEvent = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    Object[] objArr = {secureQwertyKeyboard, view, motionEvent};
                    int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
                    ((Boolean) AppMsgReceiver.onWarmupCompleted(697427066, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), objArr, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), iOnWarmupCompleted, -697427065)).booleanValue();
                    obj.hashCode();
                    throw null;
                }
                Object[] objArr2 = {secureQwertyKeyboard, view, motionEvent};
                int iOnWarmupCompleted2 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
                boolean zBooleanValue = ((Boolean) AppMsgReceiver.onWarmupCompleted(697427066, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), objArr2, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), iOnWarmupCompleted2, -697427065)).booleanValue();
                int i4 = onNavigationEvent + 73;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return zBooleanValue;
                }
                throw null;
            }
        });
        editText.setOnKeyListener(new View.OnKeyListener() { // from class: im.toss.core.widget.keyboard.SecureQwertyKeyboardAdapterKt$$ExternalSyntheticLambda4
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                int i3 = 2 % 2;
                int i4 = onNavigationEvent + 119;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                boolean zIAuthTabCallback = AppMsgReceiver.IAuthTabCallback(secureQwertyKeyboard, view, i2, keyEvent);
                int i6 = onNavigationEvent + 115;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 == 0) {
                    return zIAuthTabCallback;
                }
                throw null;
            }
        });
        int i2 = IAuthTabCallback + 93;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0042 A[PHI: r11
      0x0042: PHI (r11v11 o.TextFieldScrollKtExternalSyntheticLambda0) = (r11v10 o.TextFieldScrollKtExternalSyntheticLambda0), (r11v18 o.TextFieldScrollKtExternalSyntheticLambda0) binds: [B:10:0x0040, B:7:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult;
        EditText editText = (EditText) objArr[0];
        SecureQwertyKeyboard secureQwertyKeyboard = (SecureQwertyKeyboard) objArr[1];
        int i = 2 % 2;
        if (((Boolean) objArr[3]).booleanValue()) {
            int i2 = onNavigationEvent + 75;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                M_.onExtraCallback.onExtraCallback(editText);
                textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(editText);
                int i3 = 61 / 0;
                if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult != null) {
                    TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult);
                    if (textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent != null) {
                        maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(editText, null), 3, (Object) null);
                    }
                }
            } else {
                M_.onExtraCallback.onExtraCallback(editText);
                textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(editText);
                if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult != null) {
                }
            }
            secureQwertyKeyboard.setOnSecureQwertyKeyListener(new SecureQwertyKeyboardAdapterKt$.ExternalSyntheticLambda0(editText.onCreateInputConnection(new EditorInfo()), secureQwertyKeyboard));
            secureQwertyKeyboard.setVisibility(0);
            int i4 = onNavigationEvent + 87;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return null;
            }
            throw null;
        }
        secureQwertyKeyboard.setOnSecureQwertyKeyListener(new SecureQwertyKeyboardAdapterKt$.ExternalSyntheticLambda1());
        secureQwertyKeyboard.setVisibility(8);
        return null;
    }

    private static final boolean onExtraCallback(SecureQwertyKeyboard secureQwertyKeyboard, View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 83;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0 ? motionEvent.getAction() == 1 : motionEvent.getAction() == 0) {
            if (view.hasFocus()) {
                secureQwertyKeyboard.setVisibility(0);
                int i3 = onNavigationEvent + 55;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 2 / 3;
                }
            }
        }
        return false;
    }

    private static final boolean onExtraCallback(SecureQwertyKeyboard secureQwertyKeyboard, View view, int i, KeyEvent keyEvent) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 105;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        if (i != 4 || keyEvent.getAction() != 0) {
            return false;
        }
        int i5 = onNavigationEvent + 71;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            if (secureQwertyKeyboard.getVisibility() != 0) {
                return false;
            }
            secureQwertyKeyboard.setVisibility(8);
            int i6 = onNavigationEvent + 93;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                return true;
            }
            throw null;
        }
        secureQwertyKeyboard.getVisibility();
        throw null;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(SecureQwertyKeyboard secureQwertyKeyboard, View view, MotionEvent motionEvent) {
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted2 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted3 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        return ((Boolean) onWarmupCompleted(697427066, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), new Object[]{secureQwertyKeyboard, view, motionEvent}, iOnWarmupCompleted2, iOnWarmupCompleted3, iOnWarmupCompleted, -697427065)).booleanValue();
    }

    private static final void onNavigationEvent(EditText editText, SecureQwertyKeyboard secureQwertyKeyboard, View view, boolean z) {
        Object[] objArr = {editText, secureQwertyKeyboard, view, Boolean.valueOf(z)};
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        onWarmupCompleted(707156291, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), objArr, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), iOnWarmupCompleted, -707156291);
    }
}
