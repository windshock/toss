package o;

import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Objects;
import javax.security.auth.DestroyFailedException;
import javax.security.auth.Destroyable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AFj1rSDKExternalSyntheticLambda3;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFj1rSDKExternalSyntheticLambda3 {
    private static int IAuthTabCallback = 0;
    private static int asBinder = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ onNavigationEvent;
    public static final onExtraCallback Companion = new onExtraCallback(null);
    private static final AppSetIdAndScope1 onWarmupCompleted = ea10.onExtraCallbackWithResult("ContentOwner");

    public static /* synthetic */ boolean IAuthTabCallback(View view) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 53;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallback = onExtraCallback(view);
        int i4 = onExtraCallback + 17;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallback;
    }

    public AFj1rSDKExternalSyntheticLambda3(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq) {
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        this.onNavigationEvent = r8lambdakrhaimf1bm5cgjbilhp45vln_xq;
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    static {
        int i = IAuthTabCallback + 81;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    public final void onExtraCallback() throws DestroyFailedException {
        int i = 2 % 2;
        Objects.toString(this.onNavigationEvent);
        onNavigationEvent();
        onExtraCallbackWithResult();
        int i2 = onExtraCallback + 21;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void onNavigationEvent() {
        int i = 2 % 2;
        View view = this.onNavigationEvent.getView();
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            generateInviteUrl.onWarmupCompleted(viewGroup, new Function1() { // from class: im.toss.uikit.base.ContentOwnerHelper$$ExternalSyntheticLambda0
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i2 = 2 % 2;
                    int i3 = onWarmupCompleted + 81;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    Boolean boolValueOf = Boolean.valueOf(AFj1rSDKExternalSyntheticLambda3.IAuthTabCallback((View) obj));
                    int i5 = onNavigationEvent + Imgproc.COLOR_YUV2RGB_YVYU;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    return boolValueOf;
                }
            });
            int i2 = onExtraCallbackWithResult + 65;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = onExtraCallbackWithResult + 21;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032 A[PHI: r1 r2
      0x0032: PHI (r1v8 android.widget.EditText) = (r1v7 android.widget.EditText), (r1v12 android.widget.EditText) binds: [B:10:0x0030, B:7:0x0022] A[DONT_GENERATE, DONT_INLINE]
      0x0032: PHI (r2v3 int) = (r2v2 int), (r2v6 int) binds: [B:10:0x0030, B:7:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final boolean onExtraCallback(View view) {
        EditText editText;
        int inputType;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (!(view instanceof EditText)) {
            return false;
        }
        int i2 = onExtraCallback + 119;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            editText = (EditText) view;
            inputType = editText.getInputType() & 7227;
            if (inputType != 35) {
                if (inputType != 128 && inputType != 144) {
                    int i3 = onExtraCallback + 19;
                    onExtraCallbackWithResult = i3 % 128;
                    if (i3 % 2 == 0) {
                        if (inputType != 7576) {
                            return false;
                        }
                    } else if (inputType != 224) {
                        return false;
                    }
                }
            }
        } else {
            editText = (EditText) view;
            inputType = editText.getInputType() & 4080;
            if (inputType != 16) {
            }
        }
        Editable editableText = editText.getEditableText();
        Objects.toString(view);
        Objects.toString(editableText);
        Editable editableText2 = editText.getEditableText();
        if (editableText2 == null) {
            return false;
        }
        editableText2.clear();
        int i4 = onExtraCallback + 113;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    private final void onExtraCallbackWithResult() throws DestroyFailedException {
        Destroyable destroyable;
        Object obj;
        int i = 2 % 2;
        Field[] declaredFields = AFj1rSDKExternalSyntheticLambda3.class.getDeclaredFields();
        Intrinsics.checkNotNullExpressionValue(declaredFields, "");
        ArrayList<Field> arrayList = new ArrayList();
        for (Field field : declaredFields) {
            if (Destroyable.class.isAssignableFrom(field.getType())) {
                int i2 = onExtraCallback + 115;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    arrayList.add(field);
                    int i3 = 48 / 0;
                } else {
                    arrayList.add(field);
                }
            }
        }
        ArrayList<Destroyable> arrayList2 = new ArrayList();
        for (Field field2 : arrayList) {
            try {
                if (!field2.isAccessible()) {
                    field2.setAccessible(true);
                }
                obj = field2.get(this);
            } catch (Throwable unused) {
                destroyable = null;
            }
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type javax.security.auth.Destroyable");
            }
            int i4 = onExtraCallbackWithResult + 85;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                destroyable = (Destroyable) obj;
                int i5 = 70 / 0;
            } else {
                destroyable = (Destroyable) obj;
            }
            if (destroyable != null) {
                int i6 = onExtraCallbackWithResult + 23;
                onExtraCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    arrayList2.add(destroyable);
                    throw null;
                }
                arrayList2.add(destroyable);
            }
        }
        int i7 = onExtraCallback + 119;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        for (Destroyable destroyable2 : arrayList2) {
            Objects.toString(destroyable2);
            destroyable2.destroy();
        }
    }
}
