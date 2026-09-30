package im.toss.uikit.widget;

import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.activity.ComponentActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.google.android.gms.internal.ads.zzgc;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.KeyboardBottomCta$;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CameraControllerExternalSyntheticLambda0;
import o.ICrashCallback;
import o.JsonReaderUnknownNumberParsing;
import o.JsonReaderWithObjectReader;
import o.JsonReaderWithReader;
import o.M_;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TossCoreModule_eventLog;
import o.deprecated_cacheControl;
import o.deserializeFloat;
import o.deserializeFloatArray;
import o.deserializeUriNullableCollection;
import o.getTcfVendorConsentStatus;
import o.hasVaryAll;
import o.onGetAppsServiceDisconnected;
import o.varyMatches;
import o.wasNull;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class KeyboardBottomCta extends ConstraintLayout implements ICrashCallback {
    private static int IAuthTabCallbackStubProxy = 0;
    private static int access000 = 1;
    private final Lazy IAuthTabCallback;
    private deserializeUriNullableCollection IAuthTabCallbackDefault;
    private boolean IAuthTabCallbackStub;
    private boolean IAuthTabCallback_Parcel;
    private final boolean access100;
    private int asBinder;
    private ValueAnimator asInterface;
    private boolean onExtraCallback;
    private final onWarmupCompleted onExtraCallbackWithResult;
    private int onNavigationEvent;
    private onExtraCallback onTransact;
    private final onGetAppsServiceDisconnected onWarmupCompleted;

    public interface onExtraCallback {
        void onExtraCallbackWithResult(boolean z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KeyboardBottomCta(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KeyboardBottomCta(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ void IAuthTabCallback(JsonReaderWithObjectReader jsonReaderWithObjectReader, KeyboardBottomCta keyboardBottomCta, Activity activity) {
        int i = 2 % 2;
        int i2 = access000 + 115;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzgc.onExtraCallbackWithResult();
        onNavigationEvent(-1959826396, zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{jsonReaderWithObjectReader, keyboardBottomCta, activity}, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, 1959826401);
        int i4 = IAuthTabCallbackStubProxy + 87;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 44 / 0;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        KeyboardBottomCta keyboardBottomCta = (KeyboardBottomCta) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 19;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            asInterface(keyboardBottomCta);
            throw null;
        }
        boolean zAsInterface = asInterface(keyboardBottomCta);
        int i3 = access000 + 113;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            return Boolean.valueOf(zAsInterface);
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(Activity activity, KeyboardBottomCta keyboardBottomCta, JsonReaderWithObjectReader jsonReaderWithObjectReader) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 3;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = zzgc.onExtraCallbackWithResult();
            onNavigationEvent(-1146357877, zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{activity, keyboardBottomCta, jsonReaderWithObjectReader}, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, 1146357877);
            throw null;
        }
        int iOnExtraCallbackWithResult4 = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = zzgc.onExtraCallbackWithResult();
        onNavigationEvent(-1146357877, zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult5, new Object[]{activity, keyboardBottomCta, jsonReaderWithObjectReader}, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult6, 1146357877);
        int i3 = access000 + 13;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 66 / 0;
        }
    }

    public static void onExtraCallback(View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 119;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        KeyboardBottomCta keyboardBottomCta = (KeyboardBottomCta) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        float fFloatValue = ((Number) objArr[2]).floatValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        ValueAnimator valueAnimator = (ValueAnimator) objArr[4];
        int i = 2 % 2;
        int i2 = access000 + 61;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        onNavigationEvent(keyboardBottomCta, iIntValue, fFloatValue, iIntValue2, valueAnimator);
        if (i3 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~(i7 | i6);
        int i9 = ~i;
        int i10 = ~i6;
        int i11 = (~(i10 | i7)) | i9;
        int i12 = (~(i4 | i6)) | (~(i7 | i9 | i10));
        int i13 = i + i6 + i3 + ((-1136091917) * i5) + (376669458 * i2);
        int i14 = i13 * i13;
        int i15 = ((-905468225) * i) + 1718550528 + ((-1748215485) * i6) + (i8 * (-421373630)) + (421373630 * i11) + ((-421373630) * i12) + ((-1326841856) * i3) + ((-2044854272) * i5) + (41156608 * i2) + (1721171968 * i14);
        int i16 = ((i * (-924404593)) - 1636593565) + (i6 * (-924403757)) + (i8 * 418) + (i11 * (-418)) + (i12 * 418) + (i3 * (-924404175)) + (i5 * (-2083730301)) + (i2 * 182666354) + (i14 * (-51970048));
        switch (i15 + (i16 * i16 * (-653721600))) {
            case 1:
                return IAuthTabCallback(objArr);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return onNavigationEvent(objArr);
            case 5:
                return onExtraCallback(objArr);
            case 6:
                return IAuthTabCallbackStub(objArr);
            default:
                Activity activity = (Activity) objArr[0];
                KeyboardBottomCta keyboardBottomCta = (KeyboardBottomCta) objArr[1];
                JsonReaderWithObjectReader jsonReaderWithObjectReader = (JsonReaderWithObjectReader) objArr[2];
                int i17 = 2 % 2;
                Intrinsics.checkNotNullParameter(jsonReaderWithObjectReader, "");
                View viewFindViewById = activity.findViewById(R.id.content);
                KeyboardBottomCta$.ExternalSyntheticLambda3 externalSyntheticLambda3 = new KeyboardBottomCta$.ExternalSyntheticLambda3(jsonReaderWithObjectReader, keyboardBottomCta, activity);
                viewFindViewById.getViewTreeObserver().addOnGlobalLayoutListener(externalSyntheticLambda3);
                jsonReaderWithObjectReader.onExtraCallback((deserializeFloatArray) new KeyboardBottomCta$.ExternalSyntheticLambda4(viewFindViewById, externalSyntheticLambda3));
                int i18 = IAuthTabCallbackStubProxy + 35;
                access000 = i18 % 128;
                int i19 = i18 % 2;
                return null;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        KeyboardBottomCta keyboardBottomCta = (KeyboardBottomCta) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        ValueAnimator valueAnimator = (ValueAnimator) objArr[4];
        int i = 2 % 2;
        int i2 = access000 + 35;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(keyboardBottomCta, fFloatValue, iIntValue, iIntValue2, valueAnimator);
        if (i3 != 0) {
            int i4 = 91 / 0;
        }
        int i5 = IAuthTabCallbackStubProxy + 27;
        access000 = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 23;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(view, onGlobalLayoutListener);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackStubProxy + 85;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KeyboardBottomCta(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.IAuthTabCallbackStub = true;
        onGetAppsServiceDisconnected ongetappsservicedisconnectedOnNavigationEvent = onGetAppsServiceDisconnected.onNavigationEvent(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(ongetappsservicedisconnectedOnNavigationEvent, "");
        this.onWarmupCompleted = ongetappsservicedisconnectedOnNavigationEvent;
        this.access100 = getTcfVendorConsentStatus.Companion.onNavigationEvent().onExtraCallback();
        this.IAuthTabCallback = LazyKt__LazyJVMKt.lazy(new KeyboardBottomCta$.ExternalSyntheticLambda5(this));
        this.onExtraCallbackWithResult = new onWarmupCompleted();
        if (attributeSet != null) {
            int i2 = 0;
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, im.toss.uikit.R.styleable.KeyboardBottomCta, 0, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            TdsButtonV1View.IAuthTabCallbackStub iAuthTabCallbackStub = TdsButtonV1View.IAuthTabCallbackStub.PRIMARY;
            TdsButtonV1View.IAuthTabCallbackDefault iAuthTabCallbackDefault = TdsButtonV1View.IAuthTabCallbackDefault.FILL;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            KeyboardBottomCta$.ExternalSyntheticLambda6 externalSyntheticLambda6 = null;
            TdsButtonV1View.IAuthTabCallbackStub iAuthTabCallbackStub2 = iAuthTabCallbackStub;
            TdsButtonV1View.IAuthTabCallbackDefault iAuthTabCallbackDefault2 = iAuthTabCallbackDefault;
            int color = 0;
            String string = _UrlKt.FRAGMENT_ENCODE_SET;
            while (i2 < indexCount) {
                int i3 = IAuthTabCallbackStubProxy + 55;
                access000 = i3 % 128;
                int i4 = i3 % 2;
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == im.toss.uikit.R.styleable.KeyboardBottomCta_ctaTitle) {
                    int i5 = IAuthTabCallbackStubProxy + 67;
                    access000 = i5 % 128;
                    int i6 = i5 % 2;
                    string = typedArrayObtainStyledAttributes.getString(index);
                    if (string == null) {
                        string = _UrlKt.FRAGMENT_ENCODE_SET;
                    }
                } else if (index == im.toss.uikit.R.styleable.KeyboardBottomCta_ctaType) {
                    iAuthTabCallbackStub2 = TdsButtonV1View.IAuthTabCallbackStub.values()[typedArrayObtainStyledAttributes.getInt(index, TdsButtonV1View.IAuthTabCallbackStub.PRIMARY.getIndex())];
                } else if (index == im.toss.uikit.R.styleable.KeyboardBottomCta_ctaStyle) {
                    iAuthTabCallbackDefault2 = TdsButtonV1View.IAuthTabCallbackDefault.values()[typedArrayObtainStyledAttributes.getInt(index, TdsButtonV1View.IAuthTabCallbackDefault.FILL.getIndex())];
                    int i7 = 2 % 2;
                } else if (index == im.toss.uikit.R.styleable.KeyboardBottomCta_onCtaClick) {
                    int i8 = IAuthTabCallbackStubProxy + 27;
                    access000 = i8 % 128;
                    int i9 = i8 % 2;
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    if (string2 == null) {
                        int i10 = IAuthTabCallbackStubProxy + 11;
                        access000 = i10 % 128;
                        if (i10 % 2 == 0) {
                            int i11 = 5 / 5;
                        } else {
                            int i12 = 2 % 2;
                        }
                        string2 = _UrlKt.FRAGMENT_ENCODE_SET;
                    }
                    externalSyntheticLambda6 = new deprecated_cacheControl(this, string2);
                } else if (index == im.toss.uikit.R.styleable.KeyboardBottomCta_backgroundColor) {
                    color = typedArrayObtainStyledAttributes.getColor(index, 255);
                }
                i2++;
                int i13 = 2 % 2;
            }
            if (string.length() > 0) {
                int i14 = IAuthTabCallbackStubProxy + 75;
                access000 = i14 % 128;
                int i15 = i14 % 2;
                if (externalSyntheticLambda6 == null) {
                    externalSyntheticLambda6 = new KeyboardBottomCta$.ExternalSyntheticLambda6();
                    int i16 = 2 % 2;
                }
                setCta((CharSequence) string, (View.OnClickListener) externalSyntheticLambda6, new TdsButtonV1View.asInterface(iAuthTabCallbackStub2, iAuthTabCallbackDefault2, (TdsButtonV1View.onWarmupCompleted) null, (TdsButtonV1View.IAuthTabCallback) null, 12, (DefaultConstructorMarker) null));
            }
            if (color != 0) {
                setBottomCtaBackgroundColor(color);
                int i17 = access000 + 23;
                IAuthTabCallbackStubProxy = i17 % 128;
                if (i17 % 2 == 0) {
                    int i18 = 2 % 2;
                }
            }
        }
        ComponentActivity componentActivityIAuthTabCallback = hasVaryAll.IAuthTabCallback(context);
        ComponentActivity componentActivity = componentActivityIAuthTabCallback instanceof ComponentActivity ? componentActivityIAuthTabCallback : null;
        if (componentActivity != null) {
            this.IAuthTabCallbackDefault = onExtraCallbackWithResult((Activity) componentActivity).onWarmupCompleted((deserializeFloat<? super Boolean>) new KeyboardBottomCta$.ExternalSyntheticLambda8(new KeyboardBottomCta$.ExternalSyntheticLambda7(this)), (deserializeFloat<? super Throwable>) new KeyboardBottomCta$.ExternalSyntheticLambda10(new KeyboardBottomCta$.ExternalSyntheticLambda9()));
            componentActivity.getLifecycle().IAuthTabCallback(new DefaultLifecycleObserver() { // from class: im.toss.uikit.widget.KeyboardBottomCta$2$3
                private static int IAuthTabCallback = 1;
                private static int onWarmupCompleted;

                public /* bridge */ void onCreate(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                    int i19 = 2 % 2;
                    int i20 = onWarmupCompleted + 103;
                    IAuthTabCallback = i20 % 128;
                    int i21 = i20 % 2;
                    super.onCreate(textFieldScrollKtExternalSyntheticLambda0);
                    int i22 = IAuthTabCallback + 85;
                    onWarmupCompleted = i22 % 128;
                    if (i22 % 2 != 0) {
                        throw null;
                    }
                }

                public /* bridge */ void onPause(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                    int i19 = 2 % 2;
                    int i20 = onWarmupCompleted + 93;
                    IAuthTabCallback = i20 % 128;
                    int i21 = i20 % 2;
                    super.onPause(textFieldScrollKtExternalSyntheticLambda0);
                    int i22 = onWarmupCompleted + 89;
                    IAuthTabCallback = i22 % 128;
                    if (i22 % 2 == 0) {
                        throw null;
                    }
                }

                public /* bridge */ void onResume(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                    int i19 = 2 % 2;
                    int i20 = onWarmupCompleted + 115;
                    IAuthTabCallback = i20 % 128;
                    int i21 = i20 % 2;
                    super.onResume(textFieldScrollKtExternalSyntheticLambda0);
                    if (i21 == 0) {
                        throw null;
                    }
                }

                public /* bridge */ void onStart(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                    int i19 = 2 % 2;
                    int i20 = IAuthTabCallback + 17;
                    onWarmupCompleted = i20 % 128;
                    int i21 = i20 % 2;
                    super.onStart(textFieldScrollKtExternalSyntheticLambda0);
                    int i22 = IAuthTabCallback + 85;
                    onWarmupCompleted = i22 % 128;
                    if (i22 % 2 != 0) {
                        int i23 = 65 / 0;
                    }
                }

                public /* bridge */ void onStop(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                    int i19 = 2 % 2;
                    int i20 = IAuthTabCallback + 57;
                    onWarmupCompleted = i20 % 128;
                    int i21 = i20 % 2;
                    super.onStop(textFieldScrollKtExternalSyntheticLambda0);
                    int i22 = IAuthTabCallback + 41;
                    onWarmupCompleted = i22 % 128;
                    if (i22 % 2 != 0) {
                        throw null;
                    }
                }

                public void onDestroy(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                    int i19 = 2 % 2;
                    int i20 = IAuthTabCallback + 77;
                    onWarmupCompleted = i20 % 128;
                    if (i20 % 2 != 0) {
                        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                        super.onDestroy(textFieldScrollKtExternalSyntheticLambda0);
                        KeyboardBottomCta.onTransact(this.onNavigationEvent);
                        throw null;
                    }
                    Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                    super.onDestroy(textFieldScrollKtExternalSyntheticLambda0);
                    deserializeUriNullableCollection deserializeurinullablecollectionOnTransact = KeyboardBottomCta.onTransact(this.onNavigationEvent);
                    if (deserializeurinullablecollectionOnTransact != null) {
                        deserializeurinullablecollectionOnTransact.dispose();
                    }
                    int i21 = onWarmupCompleted + 77;
                    IAuthTabCallback = i21 % 128;
                    if (i21 % 2 == 0) {
                        throw null;
                    }
                }
            });
        }
        if (((Boolean) onNavigationEvent(-528303390, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), new Object[]{this}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), 528303392)).booleanValue()) {
            int i19 = access000 + 11;
            IAuthTabCallbackStubProxy = i19 % 128;
            int i20 = i19 % 2;
            ViewCompat.onExtraCallback(this, this.onExtraCallbackWithResult);
        }
        asBinder();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ KeyboardBottomCta(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        if ((i2 & 4) != 0) {
            int i3 = IAuthTabCallbackStubProxy;
            int i4 = i3 + 97;
            access000 = i4 % 128;
            int i5 = i4 % 2 == 0 ? 1 : 0;
            int i6 = i3 + 87;
            access000 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 3 % 3;
            } else {
                int i8 = 2 % 2;
            }
            i = i5;
        }
        this(context, attributeSet, i);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        KeyboardBottomCta keyboardBottomCta = (KeyboardBottomCta) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 53;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = keyboardBottomCta.onNavigationEvent;
        int i6 = i2 + 41;
        access000 = i6 % 128;
        if (i6 % 2 != 0) {
            return Integer.valueOf(i5);
        }
        throw null;
    }

    public static final /* synthetic */ onExtraCallback IAuthTabCallbackStub(KeyboardBottomCta keyboardBottomCta) {
        int i = 2 % 2;
        int i2 = access000 + 3;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        onExtraCallback onextracallback = keyboardBottomCta.onTransact;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 9;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return onextracallback;
    }

    public static final /* synthetic */ ValueAnimator asBinder(KeyboardBottomCta keyboardBottomCta) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 53;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        ValueAnimator valueAnimator = keyboardBottomCta.asInterface;
        int i5 = i2 + 41;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return valueAnimator;
    }

    public static final /* synthetic */ void onExtraCallback(KeyboardBottomCta keyboardBottomCta) {
        int i = 2 % 2;
        int i2 = access000 + 23;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        keyboardBottomCta.onExtraCallbackWithResult();
        int i4 = IAuthTabCallbackStubProxy + Imgproc.COLOR_YUV2RGB_YVYU;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void onExtraCallback(KeyboardBottomCta keyboardBottomCta, boolean z) {
        int i = 2 % 2;
        int i2 = access000 + 33;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        keyboardBottomCta.IAuthTabCallback_Parcel = z;
        int i5 = i3 + 71;
        access000 = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(KeyboardBottomCta keyboardBottomCta) {
        int i = 2 % 2;
        int i2 = access000 + 25;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        keyboardBottomCta.IAuthTabCallback();
        int i4 = access000 + 89;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ int onNavigationEvent(KeyboardBottomCta keyboardBottomCta, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 39;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        int iOnExtraCallback = keyboardBottomCta.onExtraCallback(i);
        if (i4 == 0) {
            int i5 = 62 / 0;
        }
        return iOnExtraCallback;
    }

    public static final /* synthetic */ boolean onNavigationEvent(KeyboardBottomCta keyboardBottomCta) {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 13;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        boolean z = keyboardBottomCta.onExtraCallback;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 19;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public static final /* synthetic */ deserializeUriNullableCollection onTransact(KeyboardBottomCta keyboardBottomCta) {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 25;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        deserializeUriNullableCollection deserializeurinullablecollection = keyboardBottomCta.IAuthTabCallbackDefault;
        int i5 = i2 + 103;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return deserializeurinullablecollection;
    }

    public static final /* synthetic */ void onWarmupCompleted(KeyboardBottomCta keyboardBottomCta, int i) {
        int i2 = 2 % 2;
        int i3 = access000 + 57;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        keyboardBottomCta.onNavigationEvent = i;
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(KeyboardBottomCta keyboardBottomCta, boolean z) {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 41;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        keyboardBottomCta.onExtraCallback = z;
        int i5 = i2 + 111;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private static final boolean asInterface(KeyboardBottomCta keyboardBottomCta) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 115;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnTransact = keyboardBottomCta.onTransact();
        int i4 = access000 + 17;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return zOnTransact;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        KeyboardBottomCta keyboardBottomCta = (KeyboardBottomCta) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 107;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) keyboardBottomCta.IAuthTabCallback.getValue()).booleanValue();
        int i4 = IAuthTabCallbackStubProxy + 71;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return Boolean.valueOf(zBooleanValue);
        }
        throw null;
    }

    public static final class onWarmupCompleted extends WindowInsetsAnimationCompat.Callback {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        onWarmupCompleted() {
            super(1);
        }

        private final boolean onExtraCallback(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 71;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if ((windowInsetsAnimationCompat.onWarmupCompleted() & WindowInsetsCompat.onTransact.IAuthTabCallback()) != 0) {
                return true;
            }
            int i4 = onExtraCallbackWithResult + 5;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public void onPrepare(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 5;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(windowInsetsAnimationCompat, "");
                onExtraCallback(windowInsetsAnimationCompat);
                throw null;
            }
            Intrinsics.checkNotNullParameter(windowInsetsAnimationCompat, "");
            if (onExtraCallback(windowInsetsAnimationCompat)) {
                KeyboardBottomCta.onWarmupCompleted(KeyboardBottomCta.this, true);
                ValueAnimator valueAnimatorAsBinder = KeyboardBottomCta.asBinder(KeyboardBottomCta.this);
                if (valueAnimatorAsBinder != null) {
                    int i3 = onExtraCallbackWithResult + 7;
                    IAuthTabCallback = i3 % 128;
                    if (i3 % 2 != 0) {
                        valueAnimatorAsBinder.cancel();
                        throw null;
                    }
                    valueAnimatorAsBinder.cancel();
                }
            }
            int i4 = onExtraCallbackWithResult + 57;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        public WindowInsetsAnimationCompat.onExtraCallbackWithResult onStart(WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsetsAnimationCompat.onExtraCallbackWithResult onextracallbackwithresult) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 95;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(windowInsetsAnimationCompat, "");
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            if (onExtraCallback(windowInsetsAnimationCompat)) {
                WindowInsetsCompat windowInsetsCompatICustomTabsCallback = ViewCompat.ICustomTabsCallback(KeyboardBottomCta.this);
                boolean z = false;
                if (windowInsetsCompatICustomTabsCallback != null) {
                    int i4 = onExtraCallbackWithResult + 61;
                    IAuthTabCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        windowInsetsCompatICustomTabsCallback.IAuthTabCallback(WindowInsetsCompat.onTransact.IAuthTabCallback());
                    } else if (windowInsetsCompatICustomTabsCallback.IAuthTabCallback(WindowInsetsCompat.onTransact.IAuthTabCallback())) {
                    }
                    z = true;
                }
                if (z) {
                    int i5 = IAuthTabCallback + 71;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    KeyboardBottomCta.onExtraCallback(KeyboardBottomCta.this);
                    int i7 = IAuthTabCallback + 47;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                }
                onExtraCallback onextracallbackIAuthTabCallbackStub = KeyboardBottomCta.IAuthTabCallbackStub(KeyboardBottomCta.this);
                if (onextracallbackIAuthTabCallbackStub != null) {
                    int i9 = onExtraCallbackWithResult + 119;
                    IAuthTabCallback = i9 % 128;
                    int i10 = i9 % 2;
                    onextracallbackIAuthTabCallbackStub.onExtraCallbackWithResult(z);
                }
            }
            int i11 = IAuthTabCallback + 39;
            onExtraCallbackWithResult = i11 % 128;
            if (i11 % 2 != 0) {
                return onextracallbackwithresult;
            }
            throw null;
        }

        public WindowInsetsCompat onProgress(WindowInsetsCompat windowInsetsCompat, List<WindowInsetsAnimationCompat> list) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 31;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
            Intrinsics.checkNotNullParameter(list, "");
            if (KeyboardBottomCta.onNavigationEvent(KeyboardBottomCta.this)) {
                int i4 = windowInsetsCompat.onWarmupCompleted(WindowInsetsCompat.onTransact.IAuthTabCallback()).onExtraCallback;
                KeyboardBottomCta keyboardBottomCta = KeyboardBottomCta.this;
                KeyboardBottomCta.onWarmupCompleted(keyboardBottomCta, KeyboardBottomCta.onNavigationEvent(keyboardBottomCta, i4));
                ConstraintLayout constraintLayout = KeyboardBottomCta.this;
                int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult3 = zzgc.onExtraCallbackWithResult();
                constraintLayout.setTranslationY(-((Integer) KeyboardBottomCta.onNavigationEvent(-938297430, zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{constraintLayout}, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, 938297431)).intValue());
                int i5 = onExtraCallbackWithResult + 77;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 5 / 4;
                }
            }
            int i7 = IAuthTabCallback + 95;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 97 / 0;
            }
            return windowInsetsCompat;
        }

        public void onEnd(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
            CameraControllerExternalSyntheticLambda0 cameraControllerExternalSyntheticLambda0OnWarmupCompleted;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 51;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = 0;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(windowInsetsAnimationCompat, "");
                int i4 = 63 / 0;
                if (!onExtraCallback(windowInsetsAnimationCompat)) {
                    return;
                }
            } else {
                Intrinsics.checkNotNullParameter(windowInsetsAnimationCompat, "");
                if (!onExtraCallback(windowInsetsAnimationCompat)) {
                    return;
                }
            }
            if (KeyboardBottomCta.onNavigationEvent(KeyboardBottomCta.this)) {
                KeyboardBottomCta.onWarmupCompleted(KeyboardBottomCta.this, false);
                WindowInsetsCompat windowInsetsCompatICustomTabsCallback = ViewCompat.ICustomTabsCallback(KeyboardBottomCta.this);
                if (windowInsetsCompatICustomTabsCallback == null || !windowInsetsCompatICustomTabsCallback.IAuthTabCallback(WindowInsetsCompat.onTransact.IAuthTabCallback())) {
                    KeyboardBottomCta.onWarmupCompleted(KeyboardBottomCta.this, 0);
                    KeyboardBottomCta.this.setTranslationY(0.0f);
                    KeyboardBottomCta.onExtraCallbackWithResult(KeyboardBottomCta.this);
                    KeyboardBottomCta.onExtraCallback(KeyboardBottomCta.this, false);
                    int i5 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGB_YVYU;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return;
                }
                if (windowInsetsCompatICustomTabsCallback != null && (cameraControllerExternalSyntheticLambda0OnWarmupCompleted = windowInsetsCompatICustomTabsCallback.onWarmupCompleted(WindowInsetsCompat.onTransact.IAuthTabCallback())) != null) {
                    int i7 = IAuthTabCallback + 21;
                    onExtraCallbackWithResult = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onExtraCallback;
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    i3 = cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onExtraCallback;
                }
                KeyboardBottomCta keyboardBottomCta = KeyboardBottomCta.this;
                KeyboardBottomCta.onWarmupCompleted(keyboardBottomCta, KeyboardBottomCta.onNavigationEvent(keyboardBottomCta, i3));
                ConstraintLayout constraintLayout = KeyboardBottomCta.this;
                int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
                constraintLayout.setTranslationY(-((Integer) KeyboardBottomCta.onNavigationEvent(-938297430, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), new Object[]{constraintLayout}, iOnExtraCallbackWithResult, zzgc.onExtraCallbackWithResult(), 938297431)).intValue());
                KeyboardBottomCta.onExtraCallback(KeyboardBottomCta.this, true);
            }
        }
    }

    public static void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 5;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            int i4 = 79 / 0;
        }
    }

    public static Unit onExtraCallbackWithResult(KeyboardBottomCta keyboardBottomCta, Boolean bool) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 59;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(bool);
        keyboardBottomCta.setKeyboardVisible(bool.booleanValue());
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static Unit IAuthTabCallback(Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 103;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 11;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 53;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallbackStubProxy + 79;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void asBinder() {
        int i = 2 % 2;
        int i2 = access000 + 95;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onWarmupCompleted().setAsCtaButton();
            obj.hashCode();
            throw null;
        }
        onWarmupCompleted().setAsCtaButton();
        int i3 = IAuthTabCallbackStubProxy + 41;
        access000 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        JsonReaderWithObjectReader jsonReaderWithObjectReader = (JsonReaderWithObjectReader) objArr[0];
        KeyboardBottomCta keyboardBottomCta = (KeyboardBottomCta) objArr[1];
        Activity activity = (Activity) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 53;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        jsonReaderWithObjectReader.IAuthTabCallback(Boolean.valueOf(keyboardBottomCta.onWarmupCompleted(activity)));
        int i4 = IAuthTabCallbackStubProxy + 101;
        access000 = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static final void onExtraCallback(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 25;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        view.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final JsonReaderUnknownNumberParsing<Boolean> onExtraCallbackWithResult(Activity activity) {
        int i = 2 % 2;
        JsonReaderUnknownNumberParsing<Boolean> jsonReaderUnknownNumberParsingAsInterface = JsonReaderUnknownNumberParsing.onExtraCallback((JsonReaderWithReader) new KeyboardBottomCta$.ExternalSyntheticLambda0(activity, this), wasNull.LATEST).asInterface();
        int i2 = IAuthTabCallbackStubProxy + 37;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        return jsonReaderUnknownNumberParsingAsInterface;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean onTransact() {
        int i = 2 % 2;
        if (Build.VERSION.SDK_INT >= 35) {
            TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.windowOptOutEdgeToEdgeEnforcement});
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
            typedArrayObtainStyledAttributes.recycle();
            boolean z2 = !z;
            int i2 = IAuthTabCallbackStubProxy + 55;
            access000 = i2 % 128;
            if (i2 % 2 != 0) {
                return z2;
            }
            throw null;
        }
        int i3 = access000 + 33;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int onExtraCallback(int i) {
        int height;
        int i2;
        int i3 = 2 % 2;
        int i4 = access000 + 31;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int[] iArr = new int[4];
            getLocationInWindow(iArr);
            int i5 = iArr[0];
            int translationY = (int) getTranslationY();
            int height2 = getHeight();
            height = getRootView().getHeight();
            i2 = (i5 >> translationY) * height2;
        } else {
            int[] iArr2 = new int[2];
            getLocationInWindow(iArr2);
            int i6 = iArr2[1];
            int translationY2 = (int) getTranslationY();
            int height3 = getHeight();
            height = getRootView().getHeight();
            i2 = (i6 - translationY2) + height3;
        }
        return TossCoreModule_eventLog.onNavigationEvent(i, i2, height);
    }

    private final boolean onWarmupCompleted(Activity activity) {
        CameraControllerExternalSyntheticLambda0 cameraControllerExternalSyntheticLambda0OnWarmupCompleted;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + Imgproc.COLOR_YUV2RGBA_YVYU;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            if (activity.isInMultiWindowMode()) {
                this.asBinder = 0;
                this.onNavigationEvent = 0;
                return true;
            }
            View viewFindViewById = activity.findViewById(R.id.content);
            int iOnNavigationEvent = M_.onExtraCallback.onNavigationEvent() - viewFindViewById.getHeight();
            if (((Boolean) onNavigationEvent(-528303390, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), new Object[]{this}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), 528303392)).booleanValue()) {
                int i3 = access000 + 79;
                IAuthTabCallbackStubProxy = i3 % 128;
                int i4 = i3 % 2;
                WindowInsetsCompat windowInsetsCompatICustomTabsCallback = ViewCompat.ICustomTabsCallback(viewFindViewById);
                int iOnExtraCallback = onExtraCallback((windowInsetsCompatICustomTabsCallback == null || (cameraControllerExternalSyntheticLambda0OnWarmupCompleted = windowInsetsCompatICustomTabsCallback.onWarmupCompleted(WindowInsetsCompat.onTransact.IAuthTabCallback())) == null) ? 0 : cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onExtraCallback);
                if (iOnExtraCallback > 0) {
                    this.onNavigationEvent = iOnExtraCallback;
                    this.asBinder = 0;
                    return true;
                }
            }
            if (iOnNavigationEvent <= r1.onNavigationEvent() * 0.15d) {
                return false;
            }
            this.asBinder = iOnNavigationEvent;
            int i5 = access000 + 5;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        activity.isInMultiWindowMode();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setKeyboardVisible(boolean z) {
        long j;
        TdsButtonV1View.IAuthTabCallback iAuthTabCallback;
        int i = 2 % 2;
        if (this.onExtraCallback) {
            return;
        }
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        float fOnNavigationEvent = varyMatches.onNavigationEvent(Float.valueOf(20.0f), displayMetrics);
        int i2 = (int) fOnNavigationEvent;
        ValueAnimator valueAnimator = this.asInterface;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
        }
        Object parent = getParent();
        Intrinsics.checkNotNull(parent, "");
        int measuredHeight = ((View) parent).getMeasuredHeight() - getBottom();
        if (z) {
            int i3 = IAuthTabCallbackStubProxy + 79;
            access000 = i3 % 128;
            int i4 = i3 % 2;
            this.asInterface = ValueAnimator.ofFloat(fOnNavigationEvent, 0.0f);
            TdsButtonV1View tdsButtonV1ViewOnWarmupCompleted = onWarmupCompleted();
            if (!(!this.access100)) {
                iAuthTabCallback = TdsButtonV1View.IAuthTabCallback.BLOCK;
                int i5 = IAuthTabCallbackStubProxy + 59;
                access000 = i5 % 128;
                int i6 = i5 % 2;
            } else {
                iAuthTabCallback = TdsButtonV1View.IAuthTabCallback.FULL;
            }
            TdsButtonV1View.setTheme$default(tdsButtonV1ViewOnWarmupCompleted, (TdsButtonV1View.IAuthTabCallbackStub) null, (TdsButtonV1View.IAuthTabCallbackDefault) null, (TdsButtonV1View.onWarmupCompleted) null, iAuthTabCallback, 7, (Object) null);
            ValueAnimator valueAnimator2 = this.asInterface;
            Intrinsics.checkNotNull(valueAnimator2);
            valueAnimator2.addUpdateListener(new KeyboardBottomCta$.ExternalSyntheticLambda1(this, fOnNavigationEvent, measuredHeight, i2));
        } else {
            this.asInterface = ValueAnimator.ofFloat(0.0f, fOnNavigationEvent);
            TdsButtonV1View.setTheme$default(onWarmupCompleted(), (TdsButtonV1View.IAuthTabCallbackStub) null, (TdsButtonV1View.IAuthTabCallbackDefault) null, (TdsButtonV1View.onWarmupCompleted) null, TdsButtonV1View.IAuthTabCallback.INLINE, 7, (Object) null);
            ValueAnimator valueAnimator3 = this.asInterface;
            Intrinsics.checkNotNull(valueAnimator3);
            valueAnimator3.addUpdateListener(new KeyboardBottomCta$.ExternalSyntheticLambda2(this, i2, fOnNavigationEvent, measuredHeight));
        }
        ValueAnimator valueAnimator4 = this.asInterface;
        Intrinsics.checkNotNull(valueAnimator4);
        if (this.IAuthTabCallback_Parcel != z) {
            int i7 = access000 + 81;
            IAuthTabCallbackStubProxy = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 30 / 0;
                j = !this.IAuthTabCallbackStub ? 200L : 0L;
            } else if (!this.IAuthTabCallbackStub) {
            }
        }
        valueAnimator4.setDuration(j);
        ValueAnimator valueAnimator5 = this.asInterface;
        Intrinsics.checkNotNull(valueAnimator5);
        valueAnimator5.start();
        this.IAuthTabCallback_Parcel = z;
        this.IAuthTabCallbackStub = false;
        onExtraCallback onextracallback = this.onTransact;
        if (onextracallback != null) {
            int i9 = IAuthTabCallbackStubProxy + 13;
            access000 = i9 % 128;
            int i10 = i9 % 2;
            onextracallback.onExtraCallbackWithResult(z);
        }
    }

    public static final class onExtraCallbackWithResult implements onExtraCallback {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Function1<Boolean, Unit> onNavigationEvent;

        /* JADX WARN: Multi-variable type inference failed */
        onExtraCallbackWithResult(Function1<? super Boolean, Unit> function1) {
            this.onNavigationEvent = function1;
        }

        @Override // im.toss.uikit.widget.KeyboardBottomCta.onExtraCallback
        public void onExtraCallbackWithResult(boolean z) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 107;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.onNavigationEvent.invoke(Boolean.valueOf(z));
            int i4 = onExtraCallback + 97;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public final void setOnKeyboardVisibilityListener(@NotNull Function1<? super Boolean, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        setOnKeyboardVisibilityListener(new onExtraCallbackWithResult(function1));
        int i2 = access000 + 123;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public final void setOnKeyboardVisibilityListener(@Nullable onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 103;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        this.onTransact = onextracallback;
        int i5 = i2 + 57;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void setCta$default(KeyboardBottomCta keyboardBottomCta, CharSequence charSequence, View.OnClickListener onClickListener, TdsButtonV1View.asInterface asinterface, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = access000 + 45;
        IAuthTabCallbackStubProxy = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 == 0 ? (i & 4) != 0 : (i & 4) != 0) {
            asinterface = null;
        }
        keyboardBottomCta.setCta(charSequence, onClickListener, asinterface);
        int i4 = access000 + 111;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    public final void setCta(@NotNull CharSequence charSequence, @NotNull View.OnClickListener onClickListener, @Nullable TdsButtonV1View.asInterface asinterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 103;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(onClickListener, "");
        this.onWarmupCompleted.onExtraCallbackWithResult.setText(charSequence);
        this.onWarmupCompleted.onExtraCallbackWithResult.setOnClickListener(onClickListener);
        if (asinterface != null) {
            int i4 = access000 + 13;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            TdsButtonV1View tdsButtonV1View = this.onWarmupCompleted.onExtraCallbackWithResult;
            Intrinsics.checkNotNullExpressionValue(tdsButtonV1View, "");
            asinterface.onNavigationEvent(tdsButtonV1View);
        }
        this.onWarmupCompleted.onExtraCallbackWithResult.setVisibility(0);
    }

    public static /* synthetic */ void setCta$default(KeyboardBottomCta keyboardBottomCta, int i, View.OnClickListener onClickListener, TdsButtonV1View.asInterface asinterface, int i2, Object obj) throws Resources.NotFoundException {
        int i3 = 2 % 2;
        if ((i2 & 4) != 0) {
            int i4 = access000 + 69;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            asinterface = null;
        }
        keyboardBottomCta.setCta(i, onClickListener, asinterface);
        int i6 = IAuthTabCallbackStubProxy + 61;
        access000 = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setCta(int i, @NotNull View.OnClickListener onClickListener, @Nullable TdsButtonV1View.asInterface asinterface) throws Resources.NotFoundException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 79;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onClickListener, "");
            String string = getResources().getString(i);
            Intrinsics.checkNotNullExpressionValue(string, "");
            setCta(string, onClickListener, asinterface);
            return;
        }
        Intrinsics.checkNotNullParameter(onClickListener, "");
        String string2 = getResources().getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        setCta(string2, onClickListener, asinterface);
        throw null;
    }

    public final TdsButtonV1View onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = access000 + 81;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullExpressionValue(this.onWarmupCompleted.onExtraCallbackWithResult, "");
            throw null;
        }
        TdsButtonV1View tdsButtonV1View = this.onWarmupCompleted.onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(tdsButtonV1View, "");
        return tdsButtonV1View;
    }

    public final View onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 25;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            View view = this.onWarmupCompleted.onExtraCallback;
            Intrinsics.checkNotNullExpressionValue(view, "");
            return view;
        }
        Intrinsics.checkNotNullExpressionValue(this.onWarmupCompleted.onExtraCallback, "");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setBottomCtaBackgroundColor(int i) {
        int i2 = 2 % 2;
        int i3 = access000 + 89;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            this.onWarmupCompleted.onExtraCallback.setBackground(TdsBottomCtaV1View.Companion.onExtraCallback(i));
            this.onWarmupCompleted.onNavigationEvent.setBackgroundColor(i);
        } else {
            this.onWarmupCompleted.onExtraCallback.setBackground(TdsBottomCtaV1View.Companion.onExtraCallback(i));
            this.onWarmupCompleted.onNavigationEvent.setBackgroundColor(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onWarmupCompleted(@NotNull Rect rect) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 83;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(rect, "");
            return getGlobalVisibleRect(rect);
        }
        Intrinsics.checkNotNullParameter(rect, "");
        getGlobalVisibleRect(rect);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallbackWithResult() {
        TdsButtonV1View.IAuthTabCallback iAuthTabCallback;
        int i = 2 % 2;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(Float.valueOf(20.0f), displayMetrics);
        TdsButtonV1View tdsButtonV1ViewOnWarmupCompleted = onWarmupCompleted();
        if (this.access100) {
            int i2 = IAuthTabCallbackStubProxy + 95;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            iAuthTabCallback = TdsButtonV1View.IAuthTabCallback.BLOCK;
        } else {
            iAuthTabCallback = TdsButtonV1View.IAuthTabCallback.FULL;
        }
        TdsButtonV1View.setTheme$default(tdsButtonV1ViewOnWarmupCompleted, (TdsButtonV1View.IAuthTabCallbackStub) null, (TdsButtonV1View.IAuthTabCallbackDefault) null, (TdsButtonV1View.onWarmupCompleted) null, iAuthTabCallback, 7, (Object) null);
        TdsButtonV1View tdsButtonV1ViewOnWarmupCompleted2 = onWarmupCompleted();
        ViewGroup.LayoutParams layoutParams = tdsButtonV1ViewOnWarmupCompleted2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult = (ConstraintLayout.onExtraCallbackWithResult) layoutParams;
        onextracallbackwithresult.requestPostMessageChannelWithExtras = 0;
        onextracallbackwithresult.access000 = false;
        boolean z = this.access100;
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult).leftMargin = z ? iOnNavigationEvent : 0;
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult).rightMargin = z ? iOnNavigationEvent : 0;
        if (!z) {
            int i4 = access000 + 73;
            IAuthTabCallbackStubProxy = i4 % 128;
            iOnNavigationEvent = i4 % 2 != 0 ? 1 : 0;
        }
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult).bottomMargin = iOnNavigationEvent;
        tdsButtonV1ViewOnWarmupCompleted2.setLayoutParams(onextracallbackwithresult);
        View view = this.onWarmupCompleted.onExtraCallback;
        float f = 0.0f;
        if (this.access100) {
            int i5 = access000 + 85;
            IAuthTabCallbackStubProxy = i5 % 128;
            if (i5 % 2 == 0) {
                f = 1.0f;
            }
        } else {
            int i6 = IAuthTabCallbackStubProxy + 67;
            access000 = i6 % 128;
            int i7 = i6 % 2;
        }
        view.setAlpha(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = access000 + 35;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(Float.valueOf(20.0f), displayMetrics);
        TdsButtonV1View.setTheme$default(onWarmupCompleted(), (TdsButtonV1View.IAuthTabCallbackStub) null, (TdsButtonV1View.IAuthTabCallbackDefault) null, (TdsButtonV1View.onWarmupCompleted) null, TdsButtonV1View.IAuthTabCallback.INLINE, 7, (Object) null);
        TdsButtonV1View tdsButtonV1ViewOnWarmupCompleted = onWarmupCompleted();
        ViewGroup.LayoutParams layoutParams = tdsButtonV1ViewOnWarmupCompleted.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult = (ConstraintLayout.onExtraCallbackWithResult) layoutParams;
        onextracallbackwithresult.requestPostMessageChannelWithExtras = 0;
        onextracallbackwithresult.access000 = false;
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult).leftMargin = iOnNavigationEvent;
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult).rightMargin = iOnNavigationEvent;
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult).bottomMargin = iOnNavigationEvent;
        tdsButtonV1ViewOnWarmupCompleted.setLayoutParams(onextracallbackwithresult);
        this.onWarmupCompleted.onExtraCallback.setAlpha(1.0f);
        int i4 = IAuthTabCallbackStubProxy + 107;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onExtraCallback(KeyboardBottomCta keyboardBottomCta, float f, int i, int i2, ValueAnimator valueAnimator) {
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        float fFloatValue = ((Float) animatedValue).floatValue();
        TdsButtonV1View tdsButtonV1ViewOnWarmupCompleted = keyboardBottomCta.onWarmupCompleted();
        ViewGroup.LayoutParams layoutParams = tdsButtonV1ViewOnWarmupCompleted.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult = (ConstraintLayout.onExtraCallbackWithResult) layoutParams;
        onextracallbackwithresult.requestPostMessageChannelWithExtras = 0;
        onextracallbackwithresult.access000 = false;
        boolean z = keyboardBottomCta.access100;
        if (z) {
            int i5 = access000 + Imgproc.COLOR_YUV2RGB_YVYU;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            i3 = i2;
        } else {
            i3 = 0;
        }
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult).leftMargin = i3;
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult).rightMargin = z ? i2 : 0;
        if (!z) {
            int i7 = access000 + 105;
            int i8 = i7 % 128;
            IAuthTabCallbackStubProxy = i8;
            if (i7 % 2 != 0) {
                throw null;
            }
            i2 = (int) fFloatValue;
            int i9 = i8 + 19;
            access000 = i9 % 128;
            int i10 = i9 % 2;
        }
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult).bottomMargin = i2;
        tdsButtonV1ViewOnWarmupCompleted.setLayoutParams(onextracallbackwithresult);
        float f2 = fFloatValue / f;
        keyboardBottomCta.setTranslationY((((keyboardBottomCta.getMeasuredHeight() * fFloatValue) / f) + i) - (keyboardBottomCta.onNavigationEvent * (1.0f - f2)));
        View view = keyboardBottomCta.onWarmupCompleted.onExtraCallback;
        if (!(!keyboardBottomCta.access100)) {
            int i11 = access000 + 47;
            IAuthTabCallbackStubProxy = i11 % 128;
            int i12 = i11 % 2;
            f2 = 1.0f;
        }
        view.setAlpha(f2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onNavigationEvent(KeyboardBottomCta keyboardBottomCta, int i, float f, int i2, ValueAnimator valueAnimator) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        float fFloatValue = ((Float) animatedValue).floatValue();
        if (!keyboardBottomCta.access100) {
            int i4 = IAuthTabCallbackStubProxy + 29;
            access000 = i4 % 128;
            if (i4 % 2 == 0) {
                i = (int) fFloatValue;
                int i5 = 86 / 0;
            } else {
                i = (int) fFloatValue;
            }
        }
        TdsButtonV1View tdsButtonV1ViewOnWarmupCompleted = keyboardBottomCta.onWarmupCompleted();
        ViewGroup.LayoutParams layoutParams = tdsButtonV1ViewOnWarmupCompleted.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult = (ConstraintLayout.onExtraCallbackWithResult) layoutParams;
        onextracallbackwithresult.requestPostMessageChannelWithExtras = 0;
        onextracallbackwithresult.access000 = false;
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult).leftMargin = i;
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult).rightMargin = i;
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult).bottomMargin = i;
        tdsButtonV1ViewOnWarmupCompleted.setLayoutParams(onextracallbackwithresult);
        float f2 = fFloatValue / f;
        float f3 = 1.0f - f2;
        keyboardBottomCta.setTranslationY((((-keyboardBottomCta.asBinder) * f3) + (i2 * f3)) - (keyboardBottomCta.onNavigationEvent * f3));
        View view = keyboardBottomCta.onWarmupCompleted.onExtraCallback;
        if (keyboardBottomCta.access100) {
            int i6 = IAuthTabCallbackStubProxy + 83;
            access000 = i6 % 128;
            int i7 = i6 % 2;
            f2 = 1.0f;
        }
        view.setAlpha(f2);
    }

    public static /* synthetic */ void onExtraCallbackWithResult(KeyboardBottomCta keyboardBottomCta, int i, float f, int i2, ValueAnimator valueAnimator) {
        Object[] objArr = {keyboardBottomCta, Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(i2), valueAnimator};
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        onNavigationEvent(942974158, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), objArr, iOnExtraCallbackWithResult, zzgc.onExtraCallbackWithResult(), -942974155);
    }

    public static /* synthetic */ boolean IAuthTabCallback(KeyboardBottomCta keyboardBottomCta) {
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzgc.onExtraCallbackWithResult();
        return ((Boolean) onNavigationEvent(-2009516493, zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{keyboardBottomCta}, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, 2009516499)).booleanValue();
    }

    public static /* synthetic */ void onWarmupCompleted(KeyboardBottomCta keyboardBottomCta, float f, int i, int i2, ValueAnimator valueAnimator) {
        Object[] objArr = {keyboardBottomCta, Float.valueOf(f), Integer.valueOf(i), Integer.valueOf(i2), valueAnimator};
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        onNavigationEvent(-1197476899, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), objArr, iOnExtraCallbackWithResult, zzgc.onExtraCallbackWithResult(), 1197476903);
    }

    public static final /* synthetic */ int onWarmupCompleted(KeyboardBottomCta keyboardBottomCta) {
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzgc.onExtraCallbackWithResult();
        return ((Integer) onNavigationEvent(-938297430, zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{keyboardBottomCta}, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, 938297431)).intValue();
    }

    private final boolean onExtraCallback() {
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzgc.onExtraCallbackWithResult();
        return ((Boolean) onNavigationEvent(-528303390, zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this}, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, 528303392)).booleanValue();
    }

    private static final void onWarmupCompleted(Activity activity, KeyboardBottomCta keyboardBottomCta, JsonReaderWithObjectReader jsonReaderWithObjectReader) {
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzgc.onExtraCallbackWithResult();
        onNavigationEvent(-1146357877, zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{activity, keyboardBottomCta, jsonReaderWithObjectReader}, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, 1146357877);
    }

    private static final void onExtraCallback(JsonReaderWithObjectReader jsonReaderWithObjectReader, KeyboardBottomCta keyboardBottomCta, Activity activity) {
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzgc.onExtraCallbackWithResult();
        onNavigationEvent(-1959826396, zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{jsonReaderWithObjectReader, keyboardBottomCta, activity}, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, 1959826401);
    }
}
