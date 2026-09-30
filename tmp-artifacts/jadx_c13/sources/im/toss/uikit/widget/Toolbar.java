package im.toss.uikit.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.core.content.ContextCompat;
import java.lang.reflect.Field;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CameraControllerExternalSyntheticLambda9;
import o.RequestBodyCompanionasRequestBody1;
import o.accessgetTlsVersionsAsStringp;
import o.deprecated_cacheResponse;
import o.getAdService;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.readIntokhttp;
import o.response;
import o.setDone;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class Toolbar extends androidx.appcompat.widget.Toolbar {
    private static int IAuthTabCallback_Parcel = 1;
    private static int getInterfaceDescriptor;
    private boolean access000;
    private TextView access100;
    private boolean asBinder;
    private final boolean onTransact;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Toolbar(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Toolbar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Toolbar(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        onNavigationEvent();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        setPadding(0, 0, varyMatches.onNavigationEvent(12, displayMetrics), 0);
        this.access000 = true;
        this.asBinder = true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Toolbar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = getInterfaceDescriptor + 79;
            IAuthTabCallback_Parcel = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            int i4 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i5 = IAuthTabCallback_Parcel + 39;
            getInterfaceDescriptor = i5 % 128;
            if (i5 % 2 != 0) {
                i = R.attr.toolbarStyle;
                int i6 = 34 / 0;
            } else {
                i = R.attr.toolbarStyle;
            }
        }
        this(context, attributeSet, i);
    }

    public final void setConsumingTouch(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 25;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        this.access000 = z;
        int i5 = i2 + 125;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setConsumingHover(boolean z) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 111;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        this.asBinder = z;
        int i5 = i2 + 107;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
    }

    private final void onNavigationEvent() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 43;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallback() {
        int i = 2 % 2;
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(im.toss.uikit.R.attr.appBarPopupOverlay, typedValue, true);
        setPopupTheme(typedValue.resourceId);
        int i2 = getInterfaceDescriptor + 85;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setNavigationIcon(@Nullable Drawable drawable) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 77;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (drawable != null) {
            Drawable drawableIAuthTabCallbackStub = CameraControllerExternalSyntheticLambda9.IAuthTabCallbackStub(drawable);
            TypedValue typedValue = new TypedValue();
            getContext().getTheme().resolveAttribute(R.attr.colorControlNormal, typedValue, true);
            CameraControllerExternalSyntheticLambda9.IAuthTabCallback(drawableIAuthTabCallbackStub, ContextCompat.getColor(getContext(), typedValue.resourceId));
            super.setNavigationIcon(drawableIAuthTabCallbackStub);
            return;
        }
        super.setNavigationIcon(drawable);
        int i3 = IAuthTabCallback_Parcel + 55;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        r5 = im.toss.uikit.widget.Toolbar.IAuthTabCallback_Parcel + 123;
        im.toss.uikit.widget.Toolbar.getInterfaceDescriptor = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        if ((r5 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        if ((!r5) != true) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if (r5 != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(@Nullable MotionEvent motionEvent) {
        int i = 2 % 2;
        if (this.access000) {
            int i2 = IAuthTabCallback_Parcel + 21;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (i3 != 0) {
                int i4 = 7 / 0;
            }
        }
        int i5 = IAuthTabCallback_Parcel + 55;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 48 / 0;
        }
        return false;
    }

    public static final class onExtraCallback implements getAdService {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration IAuthTabCallback;

        public onExtraCallback(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 75;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                if (!(!readIntokhttp.onExtraCallback(this.IAuthTabCallback))) {
                    return getSpecialFeatureOptInStatus.Dark;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i3 = onNavigationEvent + 15;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return getspecialfeatureoptinstatus;
            }
            readIntokhttp.onExtraCallback(this.IAuthTabCallback);
            throw null;
        }
    }

    public boolean onHoverEvent(@Nullable MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 7;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!this.asBinder) {
            return false;
        }
        int i4 = i3 + 125;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        if (!super.onHoverEvent(motionEvent)) {
            return false;
        }
        int i6 = IAuthTabCallback_Parcel + 53;
        getInterfaceDescriptor = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    public void setTitle(@Nullable CharSequence charSequence) throws SecurityException, IllegalArgumentException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 109;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            super.setTitle(charSequence);
            onExtraCallbackWithResult();
            int i3 = 71 / 0;
        } else {
            super.setTitle(charSequence);
            onExtraCallbackWithResult();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallbackWithResult() throws SecurityException, IllegalArgumentException {
        int i = 2 % 2;
        if (this.access100 == null) {
            int i2 = getInterfaceDescriptor + 3;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            try {
                TextView textViewIAuthTabCallback = IAuthTabCallback();
                this.access100 = textViewIAuthTabCallback;
                if (textViewIAuthTabCallback != null) {
                    response responseVar = response.SemiBold;
                    Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    textViewIAuthTabCallback.setTypeface(response.toTypeface$default(responseVar, context, (setDone) null, 2, (Object) null));
                    Context context2 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    Configuration configuration = context2.getResources().getConfiguration();
                    Intrinsics.checkNotNullExpressionValue(configuration, "");
                    textViewIAuthTabCallback.setTextColor(new getUrlokhttp(new onExtraCallback(configuration)).onUnminimized());
                    textViewIAuthTabCallback.setTextSize(1, deprecated_cacheResponse.onExtraCallbackWithResult(this, RequestBodyCompanionasRequestBody1.onExtraCallbackWithResult(this, accessgetTlsVersionsAsStringp.Typography5, 20.0f), 0.0f, 2, (Object) null));
                    int i4 = getInterfaceDescriptor + 57;
                    IAuthTabCallback_Parcel = i4 % 128;
                    int i5 = i4 % 2;
                }
            } catch (IllegalAccessException e) {
                if (!(!this.onTransact)) {
                    e.getMessage();
                }
            } catch (NoSuchFieldException e2) {
                if (this.onTransact) {
                    e2.getMessage();
                }
            }
        }
    }

    public final TextView IAuthTabCallback() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 73;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Field declaredField = androidx.appcompat.widget.Toolbar.class.getDeclaredField("IAuthTabCallbackDefault");
        Intrinsics.checkNotNullExpressionValue(declaredField, "");
        declaredField.setAccessible(true);
        Object obj = declaredField.get(this);
        if (!(obj instanceof TextView)) {
            int i4 = getInterfaceDescriptor + 87;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }
        TextView textView = (TextView) obj;
        int i6 = getInterfaceDescriptor + 43;
        IAuthTabCallback_Parcel = i6 % 128;
        int i7 = i6 % 2;
        return textView;
    }
}
