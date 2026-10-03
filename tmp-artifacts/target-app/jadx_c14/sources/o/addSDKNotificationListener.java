package o;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import gatewayprotocol.v1.AdResponseKtKt;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import im.toss.uikit.R;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.SetDetectableSize;
import o.addSDKNotificationListener;
import o.getErrMsg;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class addSDKNotificationListener extends PopupWindow {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallback Companion;
    public static final int IAuthTabCallback;
    private static char[] ICustomTabsCallback = null;
    private static int extraCallback = 0;
    private static int extraCallbackWithResult = 1;
    private static int onActivityResized = 1;
    private static int writeTypedObject;
    private TextView IAuthTabCallbackDefault;
    private final String IAuthTabCallbackStub;
    private final String IAuthTabCallbackStubProxy;
    private Button IAuthTabCallback_Parcel;
    private TdsRoundLayout access000;
    private final CharSequence access100;
    private final CharSequence asBinder;
    private final CharSequence asInterface;
    private final CharSequence getInterfaceDescriptor;
    private final Activity onExtraCallback;
    private ImageView onExtraCallbackWithResult;
    private LinearLayout onNavigationEvent;
    private final boolean onTransact;
    private Button onWarmupCompleted;
    private TextView readTypedObject;

    static {
        onNavigationEvent();
        Companion = new onExtraCallback(null);
        IAuthTabCallback = 8;
        int i = extraCallback + 91;
        onActivityResized = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ addSDKNotificationListener(Activity activity, String str, String str2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity, str, str2, charSequence, charSequence2, charSequence3, charSequence4, z);
    }

    public static /* synthetic */ Unit IAuthTabCallback(addSDKNotificationListener addsdknotificationlistener, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 55;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
            int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
            return (Unit) onExtraCallback(1464565270, AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, new Object[]{addsdknotificationlistener, setDetectableSize}, AdResponseKtKt.IAuthTabCallback(), -1464565266);
        }
        int iIAuthTabCallback3 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback4 = AdResponseKtKt.IAuthTabCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(addSDKNotificationListener addsdknotificationlistener, getErrMsg geterrmsg) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 35;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(addsdknotificationlistener, geterrmsg);
        }
        onNavigationEvent(addsdknotificationlistener, geterrmsg);
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 17;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(function1, obj);
        if (i3 == 0) {
            int i4 = 85 / 0;
        }
    }

    public static /* synthetic */ void IAuthTabCallback(addSDKNotificationListener addsdknotificationlistener, int i, View view) {
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 69;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        onTransact(addsdknotificationlistener, i, view);
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) throws Throwable {
        int i7 = ~i4;
        int i8 = (~(i7 | i)) | i6;
        int i9 = ~i6;
        int i10 = ~(i9 | i | i4);
        int i11 = (~(i4 | i9)) | i | (~(i7 | i6));
        int i12 = i + i6 + i3 + ((-381402339) * i2) + ((-2062754392) * i5);
        int i13 = i12 * i12;
        int i14 = (1317609343 * i) + 1063714816 + (1288888451 * i6) + (i8 * 14360446) + (14360446 * i10) + ((-14360446) * i11) + (1303248896 * i3) + (1454768128 * i2) + (808452096 * i5) + ((-1790509056) * i13);
        int i15 = ((i * (-1355236691)) - 921838429) + (i6 * (-1355236103)) + (i8 * (-294)) + (i10 * (-294)) + (i11 * 294) + (i3 * (-1355236397)) + (i2 * (-1583251481)) + (i5 * 1682205048) + (i13 * (-427491328));
        int i16 = i14 + (i15 * i15 * 844169216);
        if (i16 == 1) {
            return onExtraCallback(objArr);
        }
        if (i16 == 2) {
            return onWarmupCompleted(objArr);
        }
        if (i16 == 3) {
            return onNavigationEvent(objArr);
        }
        if (i16 != 4) {
            return onExtraCallbackWithResult(objArr);
        }
        addSDKNotificationListener addsdknotificationlistener = (addSDKNotificationListener) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i17 = 2 % 2;
        int i18 = writeTypedObject + 39;
        extraCallbackWithResult = i18 % 128;
        int i19 = i18 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr2 = new Object[1];
        a(new int[]{0, 6, 168, 3}, true, null, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), addsdknotificationlistener.IAuthTabCallbackStubProxy);
        Object[] objArr3 = new Object[1];
        a(new int[]{6, 5, 44, 3}, false, new byte[]{0, 0, 1, 1, 1}, objArr3);
        setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), addsdknotificationlistener.getInterfaceDescriptor);
        setDetectableSize.onExtraCallback("desc", addsdknotificationlistener.asInterface);
        Unit unit = Unit.INSTANCE;
        int i20 = writeTypedObject + 17;
        extraCallbackWithResult = i20 % 128;
        int i21 = i20 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        addSDKNotificationListener addsdknotificationlistener = (addSDKNotificationListener) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = writeTypedObject + 125;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(addsdknotificationlistener, setDetectableSize);
        int i4 = writeTypedObject + 35;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(addSDKNotificationListener addsdknotificationlistener, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 71;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(addsdknotificationlistener, setDetectableSize);
        int i4 = writeTypedObject + 33;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 6 / 0;
        }
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(addSDKNotificationListener addsdknotificationlistener, int i, View view) {
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 33;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallback(addsdknotificationlistener, i, view);
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(addSDKNotificationListener addsdknotificationlistener, int i, View view) {
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 83;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        onWarmupCompleted(addsdknotificationlistener, i, view);
        int i5 = extraCallbackWithResult + 5;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ Unit onWarmupCompleted(addSDKNotificationListener addsdknotificationlistener, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 115;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(addsdknotificationlistener, setDetectableSize);
        if (i3 != 0) {
            int i4 = 59 / 0;
        }
        return unitAsInterface;
    }

    private addSDKNotificationListener(Activity activity, String str, String str2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, boolean z) {
        super(activity);
        this.onExtraCallback = activity;
        this.IAuthTabCallbackStubProxy = str;
        this.IAuthTabCallbackStub = str2;
        this.getInterfaceDescriptor = charSequence;
        this.asInterface = charSequence2;
        this.asBinder = charSequence3;
        this.access100 = charSequence4;
        this.onTransact = z;
        setAnimationStyle(R.style.Magnifier_WindowAnimation);
        VectorConvertersKtExternalSyntheticLambda5.onExtraCallbackWithResult(this, 99);
        setBackgroundDrawable(null);
    }

    public static final /* synthetic */ Button IAuthTabCallback(addSDKNotificationListener addsdknotificationlistener) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 5;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Button button = addsdknotificationlistener.IAuthTabCallback_Parcel;
        if (i3 == 0) {
            return button;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void asBinder(addSDKNotificationListener addsdknotificationlistener) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 69;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        addsdknotificationlistener.onExtraCallbackWithResult();
        int i4 = extraCallbackWithResult + 83;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Activity onExtraCallbackWithResult(addSDKNotificationListener addsdknotificationlistener) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 99;
        int i3 = i2 % 128;
        writeTypedObject = i3;
        int i4 = i2 % 2;
        Activity activity = addsdknotificationlistener.onExtraCallback;
        int i5 = i3 + 125;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return activity;
    }

    public static final /* synthetic */ CharSequence onNavigationEvent(addSDKNotificationListener addsdknotificationlistener) {
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 47;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        CharSequence charSequence = addsdknotificationlistener.asBinder;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 5;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 22 / 0;
        }
        return charSequence;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        addSDKNotificationListener addsdknotificationlistener = (addSDKNotificationListener) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 101;
        int i3 = i2 % 128;
        writeTypedObject = i3;
        int i4 = i2 % 2;
        CharSequence charSequence = addsdknotificationlistener.access100;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 93;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return charSequence;
    }

    public static final /* synthetic */ Button onWarmupCompleted(addSDKNotificationListener addsdknotificationlistener) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 3;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        int i4 = i2 % 2;
        Button button = addsdknotificationlistener.onWarmupCompleted;
        int i5 = i3 + 61;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return button;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        addSDKNotificationListener addsdknotificationlistener = (addSDKNotificationListener) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 109;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
            int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
            onExtraCallback(-1928284635, AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, new Object[]{addsdknotificationlistener}, AdResponseKtKt.IAuthTabCallback(), 1928284635);
            return null;
        }
        int iIAuthTabCallback3 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback4 = AdResponseKtKt.IAuthTabCallback();
        onExtraCallback(-1928284635, AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback4, iIAuthTabCallback3, new Object[]{addsdknotificationlistener}, AdResponseKtKt.IAuthTabCallback(), 1928284635);
        int i3 = 51 / 0;
        return null;
    }

    public static final class onNavigationEvent implements View.OnLayoutChangeListener {
        public onNavigationEvent() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) throws Throwable {
            CharSequence charSequenceOnNavigationEvent;
            view.removeOnLayoutChangeListener(this);
            Paint paint = new Paint();
            Button buttonOnWarmupCompleted = addSDKNotificationListener.onWarmupCompleted(addSDKNotificationListener.this);
            Button button = null;
            if (buttonOnWarmupCompleted == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                buttonOnWarmupCompleted = null;
            }
            paint.setTextSize(buttonOnWarmupCompleted.getTextSize());
            Button buttonOnWarmupCompleted2 = addSDKNotificationListener.onWarmupCompleted(addSDKNotificationListener.this);
            if (buttonOnWarmupCompleted2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                buttonOnWarmupCompleted2 = null;
            }
            int length = buttonOnWarmupCompleted2.length();
            Button buttonIAuthTabCallback = addSDKNotificationListener.IAuthTabCallback(addSDKNotificationListener.this);
            if (buttonIAuthTabCallback == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                buttonIAuthTabCallback = null;
            }
            if (length > buttonIAuthTabCallback.length()) {
                charSequenceOnNavigationEvent = addSDKNotificationListener.onNavigationEvent(addSDKNotificationListener.this);
            } else {
                Object[] objArr = {addSDKNotificationListener.this};
                charSequenceOnNavigationEvent = (CharSequence) addSDKNotificationListener.onExtraCallback(-179191151, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), objArr, AdResponseKtKt.IAuthTabCallback(), 179191154);
            }
            float fMeasureText = paint.measureText(charSequenceOnNavigationEvent.toString());
            Button buttonOnWarmupCompleted3 = addSDKNotificationListener.onWarmupCompleted(addSDKNotificationListener.this);
            if (buttonOnWarmupCompleted3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                buttonOnWarmupCompleted3 = null;
            }
            int measuredWidth = buttonOnWarmupCompleted3.getMeasuredWidth();
            Button buttonOnWarmupCompleted4 = addSDKNotificationListener.onWarmupCompleted(addSDKNotificationListener.this);
            if (buttonOnWarmupCompleted4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                buttonOnWarmupCompleted4 = null;
            }
            int paddingLeft = buttonOnWarmupCompleted4.getPaddingLeft();
            Button buttonOnWarmupCompleted5 = addSDKNotificationListener.onWarmupCompleted(addSDKNotificationListener.this);
            if (buttonOnWarmupCompleted5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                button = buttonOnWarmupCompleted5;
            }
            int paddingRight = button.getPaddingRight();
            Configuration configuration = addSDKNotificationListener.onExtraCallbackWithResult(addSDKNotificationListener.this).getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            if (readIntokhttp.onWarmupCompleted(configuration) || measuredWidth - (paddingLeft + paddingRight) < fMeasureText) {
                addSDKNotificationListener.asBinder(addSDKNotificationListener.this);
                return;
            }
            Object[] objArr2 = {addSDKNotificationListener.this};
            addSDKNotificationListener.onExtraCallback(-1409973383, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), objArr2, AdResponseKtKt.IAuthTabCallback(), 1409973385);
        }
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final addSDKNotificationListener onExtraCallback(@NotNull Activity activity, @NotNull String str, @NotNull String str2, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, @NotNull CharSequence charSequence4, boolean z) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(charSequence2, "");
            Intrinsics.checkNotNullParameter(charSequence3, "");
            Intrinsics.checkNotNullParameter(charSequence4, "");
            return new addSDKNotificationListener(activity, str, str2, charSequence, charSequence2, charSequence3, charSequence4, z, null);
        }
    }

    private static final Unit onNavigationEvent(addSDKNotificationListener addsdknotificationlistener, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 85;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new int[]{0, 6, 168, 3}, true, null, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), addsdknotificationlistener.IAuthTabCallbackStubProxy);
        Object[] objArr2 = new Object[1];
        a(new int[]{6, 5, 44, 3}, false, new byte[]{0, 0, 1, 1, 1}, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), addsdknotificationlistener.getInterfaceDescriptor);
        setDetectableSize.onExtraCallback("desc", addsdknotificationlistener.asInterface);
        Unit unit = Unit.INSTANCE;
        int i4 = writeTypedObject + 117;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 28 / 0;
        }
        return unit;
    }

    private static final void onWarmupCompleted(final addSDKNotificationListener addsdknotificationlistener, int i, View view) {
        int i2 = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1012363L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.main.service.SurveyView$$ExternalSyntheticLambda7
            public final Object invoke(Object obj) {
                Object[] objArr = {this.f$0, (SetDetectableSize) obj};
                int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
                return (Unit) addSDKNotificationListener.onExtraCallback(1737859139, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback, objArr, AdResponseKtKt.IAuthTabCallback(), -1737859138);
            }
        }, 14, (Object) null);
        addPolicy.ITrustedWebActivityService_Parcel().onExtraCallbackWithResult(addsdknotificationlistener.IAuthTabCallbackStub, i + 2);
        addsdknotificationlistener.dismiss();
        int i3 = writeTypedObject + 81;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
    }

    private static final Unit IAuthTabCallbackDefault(addSDKNotificationListener addsdknotificationlistener, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 73;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new int[]{11, 6, 0, 0}, true, new byte[]{0, 1, 1, 0, 1, 1}, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), addsdknotificationlistener.asBinder);
        Object[] objArr2 = new Object[1];
        Object obj = null;
        a(new int[]{0, 6, 168, 3}, true, null, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), addsdknotificationlistener.IAuthTabCallbackStubProxy);
        Object[] objArr3 = new Object[1];
        a(new int[]{6, 5, 44, 3}, false, new byte[]{0, 0, 1, 1, 1}, objArr3);
        setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), addsdknotificationlistener.getInterfaceDescriptor);
        setDetectableSize.onExtraCallback("desc", addsdknotificationlistener.asInterface);
        Unit unit = Unit.INSTANCE;
        int i4 = writeTypedObject + 35;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static final void onExtraCallback(final addSDKNotificationListener addsdknotificationlistener, int i, View view) {
        int i2 = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1012319L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.main.service.SurveyView$$ExternalSyntheticLambda8
            public final Object invoke(Object obj) {
                return addSDKNotificationListener.onExtraCallbackWithResult(this.f$0, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        addPolicy.ITrustedWebActivityService_Parcel().onExtraCallbackWithResult(addsdknotificationlistener.IAuthTabCallbackStub, i + 2);
        addsdknotificationlistener.dismiss();
        int i3 = extraCallbackWithResult + 109;
        writeTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit asInterface(addSDKNotificationListener addsdknotificationlistener, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 117;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new int[]{11, 6, 0, 0}, true, new byte[]{0, 1, 1, 0, 1, 1}, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), addsdknotificationlistener.access100);
        Object[] objArr2 = new Object[1];
        Object obj = null;
        a(new int[]{0, 6, 168, 3}, true, null, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), addsdknotificationlistener.IAuthTabCallbackStubProxy);
        Object[] objArr3 = new Object[1];
        a(new int[]{6, 5, 44, 3}, false, new byte[]{0, 0, 1, 1, 1}, objArr3);
        setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), addsdknotificationlistener.getInterfaceDescriptor);
        setDetectableSize.onExtraCallback("desc", addsdknotificationlistener.asInterface);
        Unit unit = Unit.INSTANCE;
        int i4 = extraCallbackWithResult + 115;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static final void onTransact(final addSDKNotificationListener addsdknotificationlistener, int i, View view) {
        int i2 = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1012319L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.main.service.SurveyView$$ExternalSyntheticLambda6
            public final Object invoke(Object obj) {
                return addSDKNotificationListener.onWarmupCompleted(this.f$0, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        addPolicy.ITrustedWebActivityService_Parcel().onExtraCallbackWithResult(addsdknotificationlistener.IAuthTabCallbackStub, i + 2);
        SessionTrackerb.IAuthTabCallback(resumeForClick.asBinder, addsdknotificationlistener.onExtraCallback, addsdknotificationlistener.IAuthTabCallbackStubProxy, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        addsdknotificationlistener.dismiss();
        int i3 = extraCallbackWithResult + 73;
        writeTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(addSDKNotificationListener addsdknotificationlistener, getErrMsg geterrmsg) {
        int i = 2 % 2;
        if (addsdknotificationlistener.isShowing()) {
            int i2 = writeTypedObject + 33;
            extraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            addsdknotificationlistener.dismiss();
            if (i3 == 0) {
                int i4 = 18 / 0;
            }
            int i5 = extraCallbackWithResult + 41;
            writeTypedObject = i5 % 128;
            int i6 = i5 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 55;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final void onExtraCallback() throws Throwable {
        CharSequence charSequenceOnNavigationEvent;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 35;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Button button = null;
        setContentView(LayoutInflater.from(this.onExtraCallback).inflate(viva.republica.toss.R.layout.window_survey_view, (ViewGroup) null));
        TdsRoundLayout tdsRoundLayoutFindViewById = getContentView().findViewById(viva.republica.toss.R.id.survey_card);
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayoutFindViewById, "");
        this.access000 = tdsRoundLayoutFindViewById;
        View viewFindViewById = getContentView().findViewById(viva.republica.toss.R.id.image_view_cancel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.onExtraCallbackWithResult = (ImageView) viewFindViewById;
        View viewFindViewById2 = getContentView().findViewById(viva.republica.toss.R.id.typography7_header);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        this.IAuthTabCallbackDefault = (TextView) viewFindViewById2;
        View viewFindViewById3 = getContentView().findViewById(viva.republica.toss.R.id.typography5_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
        this.readTypedObject = (TextView) viewFindViewById3;
        View viewFindViewById4 = getContentView().findViewById(viva.republica.toss.R.id.button_layout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
        this.onNavigationEvent = (LinearLayout) viewFindViewById4;
        View viewFindViewById5 = getContentView().findViewById(viva.republica.toss.R.id.button_cta);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "");
        this.onWarmupCompleted = (Button) viewFindViewById5;
        View viewFindViewById6 = getContentView().findViewById(viva.republica.toss.R.id.button_secondary);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "");
        this.IAuthTabCallback_Parcel = (Button) viewFindViewById6;
        ConstraintLayout constraintLayout = this.access000;
        if (constraintLayout == null) {
            int i4 = writeTypedObject + 75;
            extraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            constraintLayout = null;
        }
        int iAsInterface = M_.onExtraCallback.asInterface();
        DisplayMetrics displayMetrics = this.onExtraCallback.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(16, displayMetrics);
        DisplayMetrics displayMetrics2 = this.onExtraCallback.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        constraintLayout.setMinWidth(Math.min(iAsInterface - (iOnNavigationEvent << 1), varyMatches.onNavigationEvent(343, displayMetrics2)));
        TextView textView = this.IAuthTabCallbackDefault;
        if (textView == null) {
            int i5 = writeTypedObject + 23;
            extraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            textView = null;
        }
        textView.setText(this.getInterfaceDescriptor);
        TextView textView2 = this.readTypedObject;
        if (textView2 == null) {
            int i7 = writeTypedObject + 111;
            extraCallbackWithResult = i7 % 128;
            if (i7 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i8 = 88 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            textView2 = null;
        }
        textView2.setText(this.asInterface);
        Button button2 = this.onWarmupCompleted;
        if (button2 == null) {
            int i9 = extraCallbackWithResult + 7;
            writeTypedObject = i9 % 128;
            if (i9 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                button.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            button2 = null;
        }
        button2.setText(this.asBinder);
        Button button3 = this.IAuthTabCallback_Parcel;
        if (button3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            button3 = null;
        }
        button3.setText(this.access100);
        final int iOnWarmupCompleted = addPolicy.ITrustedWebActivityService_Parcel().onWarmupCompleted(this.IAuthTabCallbackStub, 0);
        ImageView imageView = this.onExtraCallbackWithResult;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i10 = extraCallbackWithResult + 15;
            writeTypedObject = i10 % 128;
            int i11 = i10 % 2;
            imageView = null;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.main.service.SurveyView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                addSDKNotificationListener.onNavigationEvent(this.f$0, iOnWarmupCompleted, view);
            }
        });
        Button button4 = this.onWarmupCompleted;
        if (button4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            button4 = null;
        }
        button4.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.main.service.SurveyView$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                addSDKNotificationListener.onExtraCallbackWithResult(this.f$0, iOnWarmupCompleted, view);
            }
        });
        Button button5 = this.IAuthTabCallback_Parcel;
        if (button5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            button5 = null;
        }
        button5.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.main.service.SurveyView$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                addSDKNotificationListener.IAuthTabCallback(this.f$0, iOnWarmupCompleted, view);
            }
        });
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted = getIconPaddingLeft.IAuthTabCallback.onWarmupCompleted().onExtraCallback(getErrMsg.class).onWarmupCompleted(NetConverter3.onExtraCallback());
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.main.service.SurveyView$$ExternalSyntheticLambda3
            public final Object invoke(Object obj) {
                return addSDKNotificationListener.IAuthTabCallback(this.f$0, (getErrMsg) obj);
            }
        };
        jsonReaderUnknownNumberParsingOnWarmupCompleted.IAuthTabCallback(new deserializeFloat() { // from class: viva.republica.toss.main.service.SurveyView$$ExternalSyntheticLambda4
            public final void accept(Object obj) {
                addSDKNotificationListener.IAuthTabCallback(function1, obj);
            }
        });
        View contentView = getContentView();
        Intrinsics.checkNotNullExpressionValue(contentView, "");
        if (!contentView.isLaidOut() || contentView.isLayoutRequested()) {
            contentView.addOnLayoutChangeListener(new onNavigationEvent());
        } else {
            Paint paint = new Paint();
            Button buttonOnWarmupCompleted = onWarmupCompleted(this);
            if (buttonOnWarmupCompleted == null) {
                int i12 = extraCallbackWithResult + 97;
                writeTypedObject = i12 % 128;
                int i13 = i12 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                buttonOnWarmupCompleted = null;
            }
            paint.setTextSize(buttonOnWarmupCompleted.getTextSize());
            Button buttonOnWarmupCompleted2 = onWarmupCompleted(this);
            if (buttonOnWarmupCompleted2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                buttonOnWarmupCompleted2 = null;
            }
            int length = buttonOnWarmupCompleted2.length();
            Button buttonIAuthTabCallback = IAuthTabCallback(this);
            if (buttonIAuthTabCallback == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                buttonIAuthTabCallback = null;
            }
            if (length > buttonIAuthTabCallback.length()) {
                charSequenceOnNavigationEvent = onNavigationEvent(this);
            } else {
                charSequenceOnNavigationEvent = (CharSequence) onExtraCallback(-179191151, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), new Object[]{this}, AdResponseKtKt.IAuthTabCallback(), 179191154);
            }
            float fMeasureText = paint.measureText(charSequenceOnNavigationEvent.toString());
            Button buttonOnWarmupCompleted3 = onWarmupCompleted(this);
            if (buttonOnWarmupCompleted3 == null) {
                int i14 = extraCallbackWithResult + 1;
                writeTypedObject = i14 % 128;
                int i15 = i14 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                buttonOnWarmupCompleted3 = null;
            }
            int measuredWidth = buttonOnWarmupCompleted3.getMeasuredWidth();
            Button buttonOnWarmupCompleted4 = onWarmupCompleted(this);
            if (buttonOnWarmupCompleted4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                buttonOnWarmupCompleted4 = null;
            }
            int paddingLeft = buttonOnWarmupCompleted4.getPaddingLeft();
            Button buttonOnWarmupCompleted5 = onWarmupCompleted(this);
            if (buttonOnWarmupCompleted5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                button = buttonOnWarmupCompleted5;
            }
            int paddingRight = button.getPaddingRight();
            Configuration configuration = onExtraCallbackWithResult(this).getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            if (readIntokhttp.onWarmupCompleted(configuration) || measuredWidth - (paddingLeft + paddingRight) < fMeasureText) {
                asBinder(this);
                int i16 = writeTypedObject + 61;
                extraCallbackWithResult = i16 % 128;
                int i17 = i16 % 2;
            } else {
                int i18 = extraCallbackWithResult + 79;
                writeTypedObject = i18 % 128;
                int i19 = i18 % 2;
                onExtraCallback(-1409973383, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), new Object[]{this}, AdResponseKtKt.IAuthTabCallback(), 1409973385);
            }
        }
        ConvertByteArrayToFloatArray.onExtraCallback(1012317L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.main.service.SurveyView$$ExternalSyntheticLambda5
            public final Object invoke(Object obj) {
                return addSDKNotificationListener.IAuthTabCallback(this.f$0, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        addPolicy.ITrustedWebActivityService_Parcel().onExtraCallbackWithResult(this.IAuthTabCallbackStub, iOnWarmupCompleted + 1);
        View contentView2 = getContentView();
        int i20 = this.onTransact ? 86 : 16;
        DisplayMetrics displayMetrics3 = this.onExtraCallback.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
        showAtLocation(contentView2, 80, 0, varyMatches.onNavigationEvent(i20, displayMetrics3));
    }

    private final void onExtraCallbackWithResult() {
        int i = 2 % 2;
        LinearLayout linearLayout = this.onNavigationEvent;
        Button button = null;
        if (linearLayout == null) {
            int i2 = writeTypedObject + 25;
            extraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = extraCallbackWithResult + 41;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
            linearLayout = null;
        }
        linearLayout.setOrientation(1);
        Button button2 = this.onWarmupCompleted;
        if (button2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            button2 = null;
        }
        ViewGroup.LayoutParams layoutParams = button2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = -1;
        layoutParams.height = -2;
        button2.setLayoutParams(layoutParams);
        Button button3 = this.IAuthTabCallback_Parcel;
        if (button3 == null) {
            int i6 = writeTypedObject + 49;
            extraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            button = button3;
        }
        ViewGroup.LayoutParams layoutParams2 = button.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams2.width = -1;
        layoutParams2.height = -2;
        button.setLayoutParams(layoutParams2);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onExtraCallbackWithResult(java.lang.Object[] r9) {
        /*
            r0 = 0
            r9 = r9[r0]
            o.addSDKNotificationListener r9 = (o.addSDKNotificationListener) r9
            r1 = 2
            int r2 = r1 % r1
            int r2 = o.addSDKNotificationListener.extraCallbackWithResult
            int r2 = r2 + 55
            int r3 = r2 % 128
            o.addSDKNotificationListener.writeTypedObject = r3
            int r2 = r2 % r1
            r3 = 0
            if (r2 != 0) goto L90
            android.widget.LinearLayout r2 = r9.onNavigationEvent
            java.lang.String r4 = ""
            if (r2 != 0) goto L1e
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            r2 = r3
        L1e:
            r2.setOrientation(r0)
            android.widget.Button r2 = r9.onWarmupCompleted
            if (r2 != 0) goto L3c
            int r2 = o.addSDKNotificationListener.writeTypedObject
            int r2 = r2 + 85
            int r5 = r2 % 128
            o.addSDKNotificationListener.extraCallbackWithResult = r5
            int r2 = r2 % r1
            if (r2 == 0) goto L35
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            r2 = r3
            goto L3c
        L35:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            r3.hashCode()
            throw r3
        L3c:
            android.view.ViewGroup$LayoutParams r5 = r2.getLayoutParams()
            java.lang.String r6 = "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"
            if (r5 == 0) goto L8a
            int r7 = o.addSDKNotificationListener.extraCallbackWithResult
            int r7 = r7 + 105
            int r8 = r7 % 128
            o.addSDKNotificationListener.writeTypedObject = r8
            int r7 = r7 % r1
            r8 = -2
            if (r7 == 0) goto L5e
            r5.width = r0
            r7 = 40
            r5.height = r7
            r2.setLayoutParams(r5)
            android.widget.Button r9 = r9.IAuthTabCallback_Parcel
            if (r9 != 0) goto L76
            goto L69
        L5e:
            r5.width = r0
            r5.height = r8
            r2.setLayoutParams(r5)
            android.widget.Button r9 = r9.IAuthTabCallback_Parcel
            if (r9 != 0) goto L76
        L69:
            int r9 = o.addSDKNotificationListener.writeTypedObject
            int r9 = r9 + 11
            int r2 = r9 % 128
            o.addSDKNotificationListener.extraCallbackWithResult = r2
            int r9 = r9 % r1
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            r9 = r3
        L76:
            android.view.ViewGroup$LayoutParams r1 = r9.getLayoutParams()
            if (r1 == 0) goto L84
            r1.width = r0
            r1.height = r8
            r9.setLayoutParams(r1)
            return r3
        L84:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            r9.<init>(r6)
            throw r9
        L8a:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            r9.<init>(r6)
            throw r9
        L90:
            android.widget.LinearLayout r9 = r9.onNavigationEvent
            r3.hashCode()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.addSDKNotificationListener.onExtraCallbackWithResult(java.lang.Object[]):java.lang.Object");
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = ICustomTabsCallback;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getMode(0) + 35283), 35 - TextUtils.getTrimmedLength(""), 14239 - (ViewConfiguration.getTapTimeout() >> 16), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i7 = $11 + 97;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') + 10887), 65 - (ViewConfiguration.getTapTimeout() >> 16), 16718 - (ViewConfiguration.getScrollBarSize() >> 8), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), 29 - TextUtils.getOffsetAfter("", 0), 17657 - ((Process.getThreadPriority(0) + 20) >> 6), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - TextUtils.getCapsMode("", 0, 0)), 69 - ImageFormat.getBitsPerPixel(0), 12486 - Color.alpha(0), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i11 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i11, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i11);
        }
        if (z) {
            int i12 = $10 + 63;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            char[] cArr6 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i14 = $11 + 5;
                $10 = i14 % 128;
                int i15 = i14 % 2;
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    public static /* synthetic */ Unit onExtraCallback(addSDKNotificationListener addsdknotificationlistener, SetDetectableSize setDetectableSize) {
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        return (Unit) onExtraCallback(1737859139, AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, new Object[]{addsdknotificationlistener, setDetectableSize}, AdResponseKtKt.IAuthTabCallback(), -1737859138);
    }

    public static final /* synthetic */ CharSequence onExtraCallback(addSDKNotificationListener addsdknotificationlistener) {
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        return (CharSequence) onExtraCallback(-179191151, AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, new Object[]{addsdknotificationlistener}, AdResponseKtKt.IAuthTabCallback(), 179191154);
    }

    public static final /* synthetic */ void IAuthTabCallbackStub(addSDKNotificationListener addsdknotificationlistener) throws Throwable {
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        onExtraCallback(-1409973383, AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, new Object[]{addsdknotificationlistener}, AdResponseKtKt.IAuthTabCallback(), 1409973385);
    }

    private final void onWarmupCompleted() throws Throwable {
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        onExtraCallback(-1928284635, AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, new Object[]{this}, AdResponseKtKt.IAuthTabCallback(), 1928284635);
    }

    private static final Unit asBinder(addSDKNotificationListener addsdknotificationlistener, SetDetectableSize setDetectableSize) {
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        return (Unit) onExtraCallback(1464565270, AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, new Object[]{addsdknotificationlistener, setDetectableSize}, AdResponseKtKt.IAuthTabCallback(), -1464565266);
    }

    static void onNavigationEvent() {
        ICustomTabsCallback = new char[]{27486, 27461, 27477, 27459, 27483, 27459, 27166, 27346, 27354, 27350, 27348, 27257, 27168, 27199, 27194, 27194, 27173};
    }
}
