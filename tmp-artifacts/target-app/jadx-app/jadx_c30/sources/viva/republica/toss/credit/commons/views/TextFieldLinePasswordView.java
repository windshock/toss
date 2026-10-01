package viva.republica.toss.credit.commons.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.EditText;
import android.widget.FrameLayout;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.uikit.widget.textField.TextFieldLine;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.EmbeddingAdapterExternalSyntheticLambda1;
import o.TrackGroupExternalSyntheticLambda0;
import o.onJsBridgeReady;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jmrtd.lds.CVCAFile;
import viva.republica.toss.R;

@EmbeddingAdapterExternalSyntheticLambda1
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class TextFieldLinePasswordView extends FrameLayout {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int asInterface = 1;
    private static char[] onExtraCallbackWithResult = {27236, 14254, 43990, 3650, 13552, 43046, 53576, 56352, 55064, 54838, 41946, 15702, 53858, 2922, 2454, 43818, 14306, 354, 41774, 54794, 55148, 56436};
    private final Lazy onExtraCallback;
    private final Lazy onNavigationEvent;
    private boolean onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextFieldLinePasswordView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextFieldLinePasswordView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
    }

    public static /* synthetic */ TextFieldLine IAuthTabCallback(TextFieldLinePasswordView textFieldLinePasswordView) {
        int i = 2 % 2;
        int i2 = asInterface + 79;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        TextFieldLine textFieldLineOnExtraCallbackWithResult = onExtraCallbackWithResult(textFieldLinePasswordView);
        int i4 = asInterface + 31;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return textFieldLineOnExtraCallbackWithResult;
    }

    public static /* synthetic */ void onExtraCallback(TextFieldLinePasswordView textFieldLinePasswordView, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(textFieldLinePasswordView, view);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ TdsImageView onNavigationEvent(TextFieldLinePasswordView textFieldLinePasswordView) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        TdsImageView tdsImageViewOnExtraCallback = onExtraCallback(textFieldLinePasswordView);
        int i4 = IAuthTabCallback + 119;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return tdsImageViewOnExtraCallback;
        }
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldLinePasswordView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
        this.onNavigationEvent = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.credit.commons.views.TextFieldLinePasswordView$$ExternalSyntheticLambda0
            public final Object invoke() {
                return TextFieldLinePasswordView.IAuthTabCallback(this.f$0);
            }
        });
        this.onExtraCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.credit.commons.views.TextFieldLinePasswordView$$ExternalSyntheticLambda1
            public final Object invoke() {
                return TextFieldLinePasswordView.onNavigationEvent(this.f$0);
            }
        });
        onJsBridgeReady.onWarmupCompleted(context, R.layout.view_text_field_line_password, this, true);
        EditText editText = onExtraCallbackWithResult().getEditText();
        if (editText != null) {
            editText.setSaveEnabled(false);
            int i2 = 2 % 2;
        }
        EditText editText2 = onExtraCallbackWithResult().getEditText();
        if (editText2 != null) {
            editText2.setLines(1);
            int i3 = asInterface + 31;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 2 % 2;
            }
        }
        EditText editText3 = onExtraCallbackWithResult().getEditText();
        if (editText3 != null) {
            int i5 = IAuthTabCallback + 113;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            editText3.setInputType(524416);
        }
        IAuthTabCallback().setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.credit.commons.views.TextFieldLinePasswordView$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                TextFieldLinePasswordView.onExtraCallback(this.f$0, view);
            }
        });
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.TextFieldLinePasswordView, 0, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, BuildConfig.FLAVOR);
        setEnablePasswordVisible(typedArrayObtainStyledAttributes.getBoolean(R.styleable.TextFieldLinePasswordView_enable_password_visible, true));
        onExtraCallbackWithResult().setHint(typedArrayObtainStyledAttributes.getString(R.styleable.TextFieldLinePasswordView_hint));
        typedArrayObtainStyledAttributes.recycle();
        int i7 = IAuthTabCallback + 99;
        asInterface = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextFieldLinePasswordView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = asInterface + 61;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i6 = IAuthTabCallback + 19;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    private final TextFieldLine onExtraCallbackWithResult() {
        TextFieldLine textFieldLine;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Object value = this.onNavigationEvent.getValue();
            Intrinsics.checkNotNullExpressionValue(value, BuildConfig.FLAVOR);
            textFieldLine = (TextFieldLine) value;
            int i3 = 86 / 0;
        } else {
            Object value2 = this.onNavigationEvent.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, BuildConfig.FLAVOR);
            textFieldLine = (TextFieldLine) value2;
        }
        int i4 = asInterface + 105;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return textFieldLine;
    }

    private static final TextFieldLine onExtraCallbackWithResult(TextFieldLinePasswordView textFieldLinePasswordView) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 107;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        TextFieldLine textFieldLineFindViewById = textFieldLinePasswordView.findViewById(R.id.viewTextFieldLinePassword);
        if (i3 != 0) {
            return textFieldLineFindViewById;
        }
        throw null;
    }

    private final TdsImageView IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Object value = this.onExtraCallback.getValue();
            Intrinsics.checkNotNullExpressionValue(value, BuildConfig.FLAVOR);
            throw null;
        }
        Object value2 = this.onExtraCallback.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, BuildConfig.FLAVOR);
        TdsImageView tdsImageView = (TdsImageView) value2;
        int i3 = asInterface + 37;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return tdsImageView;
        }
        throw null;
    }

    private static final TdsImageView onExtraCallback(TextFieldLinePasswordView textFieldLinePasswordView) {
        int i = 2 % 2;
        int i2 = asInterface + 61;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        TdsImageView tdsImageViewFindViewById = textFieldLinePasswordView.findViewById(R.id.viewTextFieldLinePasswordShowButton);
        int i4 = IAuthTabCallback + 83;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return tdsImageViewFindViewById;
    }

    private static final void onNavigationEvent(TextFieldLinePasswordView textFieldLinePasswordView, View view) throws Throwable {
        int i = 2 % 2;
        Object obj = null;
        if (textFieldLinePasswordView.onWarmupCompleted) {
            int i2 = IAuthTabCallback + 25;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                textFieldLinePasswordView.onExtraCallbackWithResult().getEditText();
                obj.hashCode();
                throw null;
            }
            EditText editText = textFieldLinePasswordView.onExtraCallbackWithResult().getEditText();
            if (editText != null) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                editText.setSelection(editText.getText().length());
                int i3 = asInterface + 69;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
            }
            textFieldLinePasswordView.IAuthTabCallback().setImageResource(R.drawable.icn_show_password_off);
            TdsImageView tdsImageViewIAuthTabCallback = textFieldLinePasswordView.IAuthTabCallback();
            Object[] objArr = new Object[1];
            a(new int[]{0, 11, 52, 7}, false, new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, objArr);
            tdsImageViewIAuthTabCallback.setContentDescription(((String) objArr[0]).intern());
        } else {
            EditText editText2 = textFieldLinePasswordView.onExtraCallbackWithResult().getEditText();
            if (editText2 != null) {
                int i5 = IAuthTabCallback + 123;
                asInterface = i5 % 128;
                if (i5 % 2 == 0) {
                    editText2.setTransformationMethod(null);
                    editText2.setSelection(editText2.getText().length());
                    int i6 = 37 / 0;
                } else {
                    editText2.setTransformationMethod(null);
                    editText2.setSelection(editText2.getText().length());
                }
            }
            textFieldLinePasswordView.IAuthTabCallback().setImageResource(R.drawable.icn_show_password_on);
            TdsImageView tdsImageViewIAuthTabCallback2 = textFieldLinePasswordView.IAuthTabCallback();
            Object[] objArr2 = new Object[1];
            a(new int[]{11, 11, 0, 10}, true, new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, objArr2);
            tdsImageViewIAuthTabCallback2.setContentDescription(((String) objArr2[0]).intern());
        }
        textFieldLinePasswordView.onWarmupCompleted = !textFieldLinePasswordView.onWarmupCompleted;
    }

    public final void setHint(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
            onExtraCallbackWithResult().setHint(str);
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        onExtraCallbackWithResult().setHint(str);
        int i3 = asInterface + 101;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void setEnablePasswordVisible(boolean z) {
        int i = 2 % 2;
        if (z) {
            int i2 = IAuthTabCallback + 75;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback().setVisibility(0);
        } else {
            IAuthTabCallback().setVisibility(8);
        }
        EditText editText = onExtraCallbackWithResult().getEditText();
        if (editText != null) {
            int i4 = IAuthTabCallback + 67;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                editText.setSelection(editText.getText().length());
            } else {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                editText.setSelection(editText.getText().length());
                throw null;
            }
        }
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr;
        int i = 2;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = onExtraCallbackWithResult;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 57;
                $11 = i8 % 128;
                if (i8 % i == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 35283), TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 35, Process.getGidForName(BuildConfig.FLAVOR) + 14240, -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr3[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i7])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), (Process.myPid() >> 22) + 35, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 14238, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i7++;
                }
                i = 2;
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i4];
        System.arraycopy(cArr2, i3, cArr4, 0, i4);
        if (bArr != null) {
            int i9 = $11 + 59;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                cArr = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
            } else {
                cArr = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            }
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i10 = $10 + 103;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 10935), ((byte) KeyEvent.getModifierMetaStateMask()) + CVCAFile.CAR_TAG, 16719 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i12] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                } else {
                    int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr5 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 28 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0), 17657 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i13] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                }
                c = cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 49467), 70 - (ViewConfiguration.getFadingEdgeLength() >> 16), TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
                int i14 = $10 + 3;
                $11 = i14 % 128;
                int i15 = i14 % 2;
            }
            cArr4 = cArr;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr4, 0, cArr5, 0, i4);
            int i16 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr4, i16, i6);
            System.arraycopy(cArr5, i6, cArr4, 0, i16);
        }
        if (z) {
            int i17 = $11 + 15;
            $10 = i17 % 128;
            int i18 = i17 % 2;
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr4 = cArr6;
        }
        if (i5 > 0) {
            int i19 = $11 + 11;
            $10 = i19 % 128;
            char c2 = 2;
            int i20 = i19 % 2;
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[c2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                int i21 = $10 + 79;
                $11 = i21 % 128;
                c2 = 2;
                int i22 = i21 % 2;
            }
        }
        objArr[0] = new String(cArr4);
    }
}
