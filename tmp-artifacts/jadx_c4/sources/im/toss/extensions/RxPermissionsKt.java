package im.toss.extensions;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleEventObserver;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import com.tbruyelle.rxpermissions2.RxPermissions;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.uikit.widget.dialog.TdsDialogV1;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.JsonWriterWriteObject;
import o.NetConverter;
import o.NetConverter3;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.bigDecimalOrDouble;
import o.deserializeFloat;
import o.deserializeIntNullableCollection;
import o.deserializeIp;
import o.getByteBuffer;
import o.matches;
import o.onPageShow;
import o.serializeRaw;
import o.shouldBeKeptAsChild;
import o.writeRaw;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RxPermissionsKt {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i;
        int i8 = ~i3;
        int i9 = ~i2;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i3 | i);
        int i12 = i2 | i11;
        int i13 = (~(i2 | i)) | (~(i7 | i8 | i9)) | i11 | (~(i3 | i2));
        int i14 = i3 + i + i5 + (1272450877 * i6) + ((-51365948) * i4);
        int i15 = i14 * i14;
        int i16 = ((-261444822) * i3) + 922746880 + ((-1437248296) * i) + ((-1175803474) * i10) + (i12 * 587901737) + (587901737 * i13) + ((-849346560) * i5) + ((-1881145344) * i6) + ((-578813952) * i4) + ((-124846080) * i15);
        int i17 = (i3 * 1187242746) + 1002376400 + (i * 1187242392) + (i10 * (-354)) + (i12 * 177) + (i13 * 177) + (i5 * 1187242569) + (i6 * (-1484311963)) + (i4 * 1141305060) + (i15 * 516358144);
        int i18 = i16 + (i17 * i17 * (-861863936));
        if (i18 == 1) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i18 != 2) {
            return i18 != 3 ? i18 != 4 ? i18 != 5 ? onWarmupCompleted(objArr) : onExtraCallback(objArr) : onNavigationEvent(objArr) : IAuthTabCallback(objArr);
        }
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i19 = 2 % 2;
        int i20 = onNavigationEvent + 115;
        onExtraCallback = i20 % 128;
        int i21 = i20 % 2;
        IAuthTabCallbackDefault(function1, obj);
        int i22 = onNavigationEvent + 71;
        onExtraCallback = i22 % 128;
        int i23 = i22 % 2;
        return null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(function1, obj);
        }
        onNavigationEvent(function1, obj);
        throw null;
    }

    public static /* synthetic */ deserializeIp IAuthTabCallback(RxPermissions rxPermissions, String[] strArr, Unit unit) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(rxPermissions, strArr, unit);
        }
        onNavigationEvent(rxPermissions, strArr, unit);
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, JsonWriterWriteObject jsonWriterWriteObject) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(textFieldScrollKtExternalSyntheticLambda0, jsonWriterWriteObject);
        if (i3 != 0) {
            int i4 = 56 / 0;
        }
        int i5 = onExtraCallback + 45;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ deserializeIp onExtraCallback(RxPermissions rxPermissions, String[] strArr, Unit unit) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(rxPermissions, strArr, unit);
            throw null;
        }
        deserializeIp deserializeipOnWarmupCompleted = onWarmupCompleted(rxPermissions, strArr, unit);
        int i3 = onNavigationEvent + 51;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return deserializeipOnWarmupCompleted;
    }

    public static /* synthetic */ serializeRaw onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serializeRaw serializerawAsBinder = asBinder(function1, obj);
        int i4 = onExtraCallback + 57;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return serializerawAsBinder;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        DialogInterface dialogInterface = (DialogInterface) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(dialogInterface, iIntValue);
        int i4 = onExtraCallback + 7;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, FragmentActivity fragmentActivity, onPageShow onpageshow, shouldBeKeptAsChild shouldbekeptaschild) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(str, fragmentActivity, onpageshow, shouldbekeptaschild);
        if (i3 != 0) {
            int i4 = 68 / 0;
        }
        int i5 = onExtraCallback + 3;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, LifecycleEventObserver lifecycleEventObserver) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = matches.onExtraCallback();
        int iOnExtraCallback2 = matches.onExtraCallback();
        int iOnExtraCallback3 = matches.onExtraCallback();
        IAuthTabCallback(-1936966919, iOnExtraCallback, 1936966919, matches.onExtraCallback(), iOnExtraCallback2, new Object[]{textFieldScrollKtExternalSyntheticLambda0, lifecycleEventObserver}, iOnExtraCallback3);
        int i4 = onExtraCallback + 57;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onNavigationEvent(FragmentActivity fragmentActivity, DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 35;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        IAuthTabCallback(fragmentActivity, dialogInterface, i);
        if (i4 == 0) {
            int i5 = 69 / 0;
        }
        int i6 = onNavigationEvent + 31;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    public static /* synthetic */ deserializeIp onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        deserializeIp deserializeipOnTransact = onTransact(function1, obj);
        int i4 = onNavigationEvent + 51;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return deserializeipOnTransact;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ serializeRaw onWarmupCompleted(RxPermissions rxPermissions, onPageShow onpageshow, String str, FragmentActivity fragmentActivity, Unit unit) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(rxPermissions, onpageshow, str, fragmentActivity, unit);
        }
        IAuthTabCallback(rxPermissions, onpageshow, str, fragmentActivity, unit);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(JsonWriterWriteObject jsonWriterWriteObject, TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(jsonWriterWriteObject, textFieldScrollKtExternalSyntheticLambda0, onextracallbackwithresult);
        if (i3 == 0) {
            throw null;
        }
    }

    private static final serializeRaw asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        serializeRaw serializeraw = (serializeRaw) function1.invoke(obj);
        int i4 = onNavigationEvent + 63;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return serializeraw;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        final RxPermissions rxPermissions = (RxPermissions) objArr[0];
        final FragmentActivity fragmentActivity = (FragmentActivity) objArr[1];
        final onPageShow onpageshow = (onPageShow) objArr[2];
        final String str = (String) objArr[3];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(rxPermissions, "");
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(onpageshow, "");
        Intrinsics.checkNotNullParameter(str, "");
        writeRaw<Unit> writerawOnExtraCallback = onExtraCallback((TextFieldScrollKtExternalSyntheticLambda0) fragmentActivity);
        final Function1 function1 = new Function1() { // from class: im.toss.extensions.RxPermissionsKt$$ExternalSyntheticLambda7
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 37;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                serializeRaw serializerawOnWarmupCompleted = RxPermissionsKt.onWarmupCompleted(rxPermissions, onpageshow, str, fragmentActivity, (Unit) obj);
                int i5 = onNavigationEvent + 115;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return serializerawOnWarmupCompleted;
            }
        };
        getByteBuffer getbytebufferOnExtraCallback = writerawOnExtraCallback.onExtraCallback(new deserializeIntNullableCollection() { // from class: im.toss.extensions.RxPermissionsKt$$ExternalSyntheticLambda8
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object apply(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 23;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    RxPermissionsKt.onExtraCallback(function1, obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                serializeRaw serializerawOnExtraCallback = RxPermissionsKt.onExtraCallback(function1, obj);
                int i4 = onExtraCallback + 85;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return serializerawOnExtraCallback;
            }
        });
        Intrinsics.checkNotNullExpressionValue(getbytebufferOnExtraCallback, "");
        int i2 = onExtraCallback + 11;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return getbytebufferOnExtraCallback;
        }
        throw null;
    }

    private static final serializeRaw IAuthTabCallback(RxPermissions rxPermissions, final onPageShow onpageshow, final String str, final FragmentActivity fragmentActivity, Unit unit) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(unit, "");
        getByteBuffer getbytebufferOnExtraCallbackWithResult = rxPermissions.onExtraCallbackWithResult(onpageshow.getId()).onExtraCallbackWithResult(NetConverter3.onExtraCallback());
        final Function1 function1 = new Function1() { // from class: im.toss.extensions.RxPermissionsKt$$ExternalSyntheticLambda11
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 39;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                String str2 = str;
                if (i4 == 0) {
                    return RxPermissionsKt.onExtraCallbackWithResult(str2, fragmentActivity, onpageshow, (shouldBeKeptAsChild) obj);
                }
                RxPermissionsKt.onExtraCallbackWithResult(str2, fragmentActivity, onpageshow, (shouldBeKeptAsChild) obj);
                throw null;
            }
        };
        getByteBuffer getbytebufferOnExtraCallback = getbytebufferOnExtraCallbackWithResult.onExtraCallback(new deserializeFloat() { // from class: im.toss.extensions.RxPermissionsKt$$ExternalSyntheticLambda12
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final void accept(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 17;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = {function1, obj};
                RxPermissionsKt.IAuthTabCallback(-1412650181, matches.onExtraCallback(), 1412650183, matches.onExtraCallback(), matches.onExtraCallback(), objArr, matches.onExtraCallback());
                int i5 = onExtraCallback + 43;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 42 / 0;
                }
            }
        });
        int i2 = onExtraCallback + 61;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return getbytebufferOnExtraCallback;
    }

    private static final void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onExtraCallback + 67;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void IAuthTabCallback(FragmentActivity fragmentActivity, DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + fragmentActivity.getPackageName()));
        fragmentActivity.startActivity(intent);
        dialogInterface.dismiss();
        int i3 = onExtraCallback + 93;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
    }

    private static final void onWarmupCompleted(DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 29;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        dialogInterface.dismiss();
        if (i4 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(String str, final FragmentActivity fragmentActivity, onPageShow onpageshow, shouldBeKeptAsChild shouldbekeptaschild) {
        String str2;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 54 / 0;
            if (StringsKt.isBlank(str)) {
                str2 = "설정에서 " + onpageshow.getLocalizedName() + " 권한을 수락해주세요.";
            } else {
                str2 = str;
            }
        } else if (StringsKt.isBlank(str)) {
        }
        if (shouldbekeptaschild.onNavigationEvent) {
            int i4 = onExtraCallback + 17;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                Unit unit = Unit.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Unit unit2 = Unit.INSTANCE;
        } else if (shouldbekeptaschild.onExtraCallbackWithResult) {
            new TdsToastV1.onNavigationEvent(fragmentActivity, str2).onNavigationEvent();
        } else {
            ((TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted.onExtraCallbackWithResult(JsParamKeys.onExtraCallbackWithResult(), new Object[]{TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted.onExtraCallback((TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) TdsDialogV1.Companion.onExtraCallback(fragmentActivity).onExtraCallbackWithResult(str2), "설정", new DialogInterface.OnClickListener() { // from class: im.toss.extensions.RxPermissionsKt$$ExternalSyntheticLambda9
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i5) {
                    int i6 = 2 % 2;
                    int i7 = onExtraCallback + 123;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    RxPermissionsKt.onNavigationEvent(fragmentActivity, dialogInterface, i5);
                    int i9 = onExtraCallback + 37;
                    onWarmupCompleted = i9 % 128;
                    int i10 = i9 % 2;
                }
            }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null), "취소", new DialogInterface.OnClickListener() { // from class: im.toss.extensions.RxPermissionsKt$$ExternalSyntheticLambda10
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i5) {
                    int i6 = 2 % 2;
                    int i7 = onExtraCallback + 47;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                    Object[] objArr = {dialogInterface, Integer.valueOf(i5)};
                    RxPermissionsKt.IAuthTabCallback(649603747, matches.onExtraCallback(), -649603746, matches.onExtraCallback(), matches.onExtraCallback(), objArr, matches.onExtraCallback());
                    int i9 = onNavigationEvent + 15;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % 2;
                }
            }, null, false, 12, null}, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -1871975236, 1871975236, JsParamKeys.onExtraCallbackWithResult())).readTypedObject();
            int i5 = onNavigationEvent + 51;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        return Unit.INSTANCE;
    }

    public static final writeRaw<Boolean> onExtraCallbackWithResult(@NotNull final RxPermissions rxPermissions, @NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, @NotNull final String... strArr) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(rxPermissions, "");
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        writeRaw<Unit> writerawOnExtraCallback = onExtraCallback(textFieldScrollKtExternalSyntheticLambda0);
        final Function1 function1 = new Function1() { // from class: im.toss.extensions.RxPermissionsKt$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 37;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                deserializeIp deserializeipIAuthTabCallback = RxPermissionsKt.IAuthTabCallback(rxPermissions, strArr, (Unit) obj);
                int i5 = IAuthTabCallback + 55;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return deserializeipIAuthTabCallback;
            }
        };
        writeRaw<Boolean> writerawOnExtraCallbackWithResult = writerawOnExtraCallback.onExtraCallbackWithResult(new deserializeIntNullableCollection() { // from class: im.toss.extensions.RxPermissionsKt$$ExternalSyntheticLambda4
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object apply(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 25;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                deserializeIp deserializeipOnWarmupCompleted = RxPermissionsKt.onWarmupCompleted(function1, obj);
                int i5 = IAuthTabCallback + 13;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    return deserializeipOnWarmupCompleted;
                }
                throw null;
            }
        });
        Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
        int i2 = onNavigationEvent + 23;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return writerawOnExtraCallbackWithResult;
        }
        throw null;
    }

    private static final deserializeIp onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        deserializeIp deserializeip = (deserializeIp) function1.invoke(obj);
        int i3 = onExtraCallback + 53;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return deserializeip;
    }

    private static final deserializeIp onNavigationEvent(RxPermissions rxPermissions, String[] strArr, Unit unit) {
        writeRaw writerawExtraCallback;
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(unit, "");
            writerawExtraCallback = rxPermissions.onNavigationEvent((String[]) Arrays.copyOf(strArr, strArr.length)).extraCallback();
            int i3 = 94 / 0;
        } else {
            Intrinsics.checkNotNullParameter(unit, "");
            writerawExtraCallback = rxPermissions.onNavigationEvent((String[]) Arrays.copyOf(strArr, strArr.length)).extraCallback();
        }
        int i4 = onNavigationEvent + 115;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return writerawExtraCallback;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        final RxPermissions rxPermissions = (RxPermissions) objArr[0];
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = (TextFieldScrollKtExternalSyntheticLambda0) objArr[1];
        final String[] strArr = (String[]) objArr[2];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(rxPermissions, "");
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        writeRaw<Unit> writerawOnExtraCallback = onExtraCallback(textFieldScrollKtExternalSyntheticLambda0);
        final Function1 function1 = new Function1() { // from class: im.toss.extensions.RxPermissionsKt$$ExternalSyntheticLambda5
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 57;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                RxPermissions rxPermissions2 = rxPermissions;
                if (i4 == 0) {
                    return RxPermissionsKt.onExtraCallback(rxPermissions2, strArr, (Unit) obj);
                }
                RxPermissionsKt.onExtraCallback(rxPermissions2, strArr, (Unit) obj);
                throw null;
            }
        };
        writeRaw writerawOnExtraCallbackWithResult = writerawOnExtraCallback.onExtraCallbackWithResult(new deserializeIntNullableCollection() { // from class: im.toss.extensions.RxPermissionsKt$$ExternalSyntheticLambda6
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object apply(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 25;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr2 = {function1, obj};
                int iOnExtraCallback = matches.onExtraCallback();
                int iOnExtraCallback2 = matches.onExtraCallback();
                int iOnExtraCallback3 = matches.onExtraCallback();
                int iOnExtraCallback4 = matches.onExtraCallback();
                if (i4 == 0) {
                    return (deserializeIp) RxPermissionsKt.IAuthTabCallback(-394167579, iOnExtraCallback, 394167582, iOnExtraCallback4, iOnExtraCallback2, objArr2, iOnExtraCallback3);
                }
                int i5 = 46 / 0;
                return (deserializeIp) RxPermissionsKt.IAuthTabCallback(-394167579, iOnExtraCallback, 394167582, iOnExtraCallback4, iOnExtraCallback2, objArr2, iOnExtraCallback3);
            }
        });
        Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
        int i2 = onExtraCallback + 77;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return writerawOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final deserializeIp onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        deserializeIp deserializeip = (deserializeIp) function1.invoke(obj);
        int i3 = onNavigationEvent + 101;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return deserializeip;
    }

    private static final deserializeIp onWarmupCompleted(RxPermissions rxPermissions, String[] strArr, Unit unit) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(unit, "");
        writeRaw writerawExtraCallback = rxPermissions.onExtraCallbackWithResult((String[]) Arrays.copyOf(strArr, strArr.length)).extraCallback();
        int i4 = onExtraCallback + 31;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return writerawExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final writeRaw<Unit> onExtraCallback(final TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        writeRaw<Unit> writerawOnNavigationEvent = writeRaw.onNavigationEvent(new NetConverter() { // from class: im.toss.extensions.RxPermissionsKt$$ExternalSyntheticLambda2
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final void subscribe(JsonWriterWriteObject jsonWriterWriteObject) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 49;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                RxPermissionsKt.IAuthTabCallback(textFieldScrollKtExternalSyntheticLambda0, jsonWriterWriteObject);
                int i5 = onExtraCallback + 83;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        Intrinsics.checkNotNullExpressionValue(writerawOnNavigationEvent, "");
        int i2 = onExtraCallback + 83;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return writerawOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onNavigationEvent(JsonWriterWriteObject jsonWriterWriteObject, TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        if (onextracallbackwithresult == TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_RESUME) {
            int i2 = onNavigationEvent + 113;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            jsonWriterWriteObject.onNavigationEvent(Unit.INSTANCE);
        }
        int i4 = onNavigationEvent + 47;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static final void onWarmupCompleted(final TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, final JsonWriterWriteObject jsonWriterWriteObject) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(jsonWriterWriteObject, "");
        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: im.toss.extensions.RxPermissionsKt$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final void onStateChanged(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 95;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    RxPermissionsKt.onWarmupCompleted(jsonWriterWriteObject, textFieldScrollKtExternalSyntheticLambda02, onextracallbackwithresult);
                    int i4 = 81 / 0;
                } else {
                    RxPermissionsKt.onWarmupCompleted(jsonWriterWriteObject, textFieldScrollKtExternalSyntheticLambda02, onextracallbackwithresult);
                }
                int i5 = onNavigationEvent + 47;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 35 / 0;
                }
            }
        };
        textFieldScrollKtExternalSyntheticLambda0.getLifecycle().IAuthTabCallback(lifecycleEventObserver);
        jsonWriterWriteObject.onWarmupCompleted(bigDecimalOrDouble.onExtraCallback(new Runnable() { // from class: im.toss.extensions.RxPermissionsKt$$ExternalSyntheticLambda1
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 11;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    RxPermissionsKt.onExtraCallbackWithResult(textFieldScrollKtExternalSyntheticLambda0, lifecycleEventObserver);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                RxPermissionsKt.onExtraCallbackWithResult(textFieldScrollKtExternalSyntheticLambda0, lifecycleEventObserver);
                int i4 = onWarmupCompleted + 7;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
            }
        }));
        int i2 = onNavigationEvent + 63;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = (TextFieldScrollKtExternalSyntheticLambda0) objArr[0];
        LifecycleEventObserver lifecycleEventObserver = (LifecycleEventObserver) objArr[1];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        textFieldScrollKtExternalSyntheticLambda0.getLifecycle().onExtraCallbackWithResult(lifecycleEventObserver);
        int i4 = onNavigationEvent + 51;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 19 / 0;
        }
        return null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(DialogInterface dialogInterface, int i) {
        Object[] objArr = {dialogInterface, Integer.valueOf(i)};
        IAuthTabCallback(649603747, matches.onExtraCallback(), -649603746, matches.onExtraCallback(), matches.onExtraCallback(), objArr, matches.onExtraCallback());
    }

    public static /* synthetic */ deserializeIp IAuthTabCallback(Function1 function1, Object obj) {
        int iOnExtraCallback = matches.onExtraCallback();
        int iOnExtraCallback2 = matches.onExtraCallback();
        int iOnExtraCallback3 = matches.onExtraCallback();
        return (deserializeIp) IAuthTabCallback(-394167579, iOnExtraCallback, 394167582, matches.onExtraCallback(), iOnExtraCallback2, new Object[]{function1, obj}, iOnExtraCallback3);
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int iOnExtraCallback = matches.onExtraCallback();
        int iOnExtraCallback2 = matches.onExtraCallback();
        int iOnExtraCallback3 = matches.onExtraCallback();
        IAuthTabCallback(-1412650181, iOnExtraCallback, 1412650183, matches.onExtraCallback(), iOnExtraCallback2, new Object[]{function1, obj}, iOnExtraCallback3);
    }

    private static final void IAuthTabCallback(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, LifecycleEventObserver lifecycleEventObserver) {
        int iOnExtraCallback = matches.onExtraCallback();
        int iOnExtraCallback2 = matches.onExtraCallback();
        int iOnExtraCallback3 = matches.onExtraCallback();
        IAuthTabCallback(-1936966919, iOnExtraCallback, 1936966919, matches.onExtraCallback(), iOnExtraCallback2, new Object[]{textFieldScrollKtExternalSyntheticLambda0, lifecycleEventObserver}, iOnExtraCallback3);
    }

    public static final writeRaw<shouldBeKeptAsChild> onNavigationEvent(@NotNull RxPermissions rxPermissions, @NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, @NotNull String... strArr) {
        int iOnExtraCallback = matches.onExtraCallback();
        int iOnExtraCallback2 = matches.onExtraCallback();
        int iOnExtraCallback3 = matches.onExtraCallback();
        return (writeRaw) IAuthTabCallback(1755154931, iOnExtraCallback, -1755154927, matches.onExtraCallback(), iOnExtraCallback2, new Object[]{rxPermissions, textFieldScrollKtExternalSyntheticLambda0, strArr}, iOnExtraCallback3);
    }

    public static final getByteBuffer<shouldBeKeptAsChild> onExtraCallback(@NotNull RxPermissions rxPermissions, @NotNull FragmentActivity fragmentActivity, @NotNull onPageShow onpageshow, @NotNull String str) {
        int iOnExtraCallback = matches.onExtraCallback();
        int iOnExtraCallback2 = matches.onExtraCallback();
        int iOnExtraCallback3 = matches.onExtraCallback();
        return (getByteBuffer) IAuthTabCallback(397690809, iOnExtraCallback, -397690804, matches.onExtraCallback(), iOnExtraCallback2, new Object[]{rxPermissions, fragmentActivity, onpageshow, str}, iOnExtraCallback3);
    }
}
