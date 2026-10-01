package im.toss.core.webkit.bridge.image.camera;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.firebase.messaging.FcmBroadcastProcessor$;
import com.otaliastudios.cameraview.CameraView;
import com.tbruyelle.rxpermissions2.RxPermissions;
import im.toss.core.R;
import im.toss.core.R$menu;
import im.toss.core.webkit.bridge.image.camera.CameraActivity$;
import im.toss.features.verify.sms.impl.SmsVerifyInYourNameFragment$;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography4;
import im.toss.uikit.base.UIKitBaseActivity;
import im.toss.uikit.widget.AppBarLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BrickModuleImplExternalSyntheticLambda5;
import o.CameraControllerExternalSyntheticLambda0;
import o.CameraControllerExternalSyntheticLambda9;
import o.IPostMessageServiceStubProxy;
import o.RecomposerawaitIdle2;
import o.RememberObserver;
import o.access8100;
import o.animateAppearance;
import o.assertInLayoutOrScroll;
import o.clearOldPositions;
import o.deserializeUriNullableCollection;
import o.drawImageIconPadding;
import o.forceInnerPermissionCheck;
import o.getWrite;
import o.onIconClick;
import o.put;
import o.setIconBackgroundColor;
import o.setProtocolsokhttp;
import o.shouldAbsorb;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class CameraActivity extends UIKitBaseActivity {
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    private static int ICustomTabsCallback = 1;
    private static int extraCallback = 0;
    private static int onActivityResized = 1;
    private static int writeTypedObject;
    private setIconBackgroundColor IAuthTabCallbackDefault;
    private int IAuthTabCallbackStubProxy;
    private MenuItem access000;
    private CameraView asInterface;
    private BrickModuleImplExternalSyntheticLambda5 extraCallbackWithResult;
    private String readTypedObject = "";
    private String asBinder = "";
    private final drawImageIconPadding<String> getInterfaceDescriptor = new drawImageIconPadding<>();
    private String IAuthTabCallbackStub = "";
    private String access100 = "";
    private String IAuthTabCallback_Parcel = "";
    private final Runnable onTransact = new CameraActivity$.ExternalSyntheticLambda7(this);

    static {
        int i = onActivityResized + 51;
        extraCallback = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ WindowInsetsCompat IAuthTabCallback(int i, int i2, int i3, CameraActivity cameraActivity, int i4, int i5, int i6, View view, WindowInsetsCompat windowInsetsCompat) {
        int i7 = 2 % 2;
        int i8 = ICustomTabsCallback + 97;
        writeTypedObject = i8 % 128;
        if (i8 % 2 == 0) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), cameraActivity, Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), view, windowInsetsCompat};
            int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            return (WindowInsetsCompat) onWarmupCompleted(-3174948, 3174949, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr);
        }
        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), cameraActivity, Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), view, windowInsetsCompat};
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        throw null;
    }

    public static /* synthetic */ CharSequence IAuthTabCallback(CameraActivity cameraActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 123;
        writeTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            asInterface(cameraActivity);
            obj.hashCode();
            throw null;
        }
        CharSequence charSequenceAsInterface = asInterface(cameraActivity);
        int i3 = writeTypedObject + 7;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return charSequenceAsInterface;
        }
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 19;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(function1, obj);
        int i4 = writeTypedObject + 53;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        CameraActivity cameraActivity = (CameraActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 35;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        onTransact(cameraActivity);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = ICustomTabsCallback + 71;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ CharSequence onExtraCallback(CameraActivity cameraActivity, List list) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 99;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        CharSequence charSequenceOnWarmupCompleted = onWarmupCompleted(cameraActivity, list);
        if (i3 != 0) {
            int i4 = 64 / 0;
        }
        return charSequenceOnWarmupCompleted;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CameraActivity cameraActivity = (CameraActivity) objArr[0];
        Boolean bool = (Boolean) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 77;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        Unit unit = (Unit) onWarmupCompleted(163033138, -163033135, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, iIAuthTabCallback3, new Object[]{cameraActivity, bool});
        int i4 = writeTypedObject + 65;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(CameraActivity cameraActivity, View view) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 13;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        onTransact(cameraActivity, view);
        int i4 = writeTypedObject + 105;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(CameraActivity cameraActivity, List list) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 17;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(cameraActivity, list);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(cameraActivity, list);
        int i3 = ICustomTabsCallback + 119;
        writeTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 72 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ void onNavigationEvent(CameraActivity cameraActivity, View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 107;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(cameraActivity, view);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = writeTypedObject + 35;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~((~i5) | i2);
        int i8 = ~((~i2) | i);
        int i9 = i8 | i7;
        int i10 = i8 | (~((~i) | i2));
        int i11 = i2 + i + i4 + (762724209 * i6) + (1201824936 * i3);
        int i12 = i11 * i11;
        int i13 = ((-126223985) * i2) + 43253760 + (1339426419 * i) + ((-1465650404) * i7) + (1465650404 * i9) + (1414658446 * i10) + ((-1540882432) * i4) + (1302855680 * i6) + (1514143744 * i3) + (1905524736 * i12);
        int i14 = ((i2 * 162561953) - 555857873) + (i * 162559997) + (i7 * 1956) + (i9 * (-1956)) + (i10 * 978) + (i4 * 162560975) + (i6 * 701011807) + (i3 * 237771736) + (i12 * (-223608832));
        int i15 = i13 + (i14 * i14 * 703332352);
        return i15 != 1 ? i15 != 2 ? i15 != 3 ? i15 != 4 ? i15 != 5 ? onWarmupCompleted(objArr) : IAuthTabCallbackDefault(objArr) : onNavigationEvent(objArr) : IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr) : onExtraCallback(objArr);
    }

    public static /* synthetic */ void onWarmupCompleted(CameraActivity cameraActivity, View view) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 49;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(cameraActivity, view);
        if (i3 == 0) {
            int i4 = 48 / 0;
        }
        int i5 = writeTypedObject + 73;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 109;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(function1, obj);
        if (i3 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = ICustomTabsCallback + 123;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 115;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 85;
        writeTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            return 1013169L;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ String onExtraCallback(CameraActivity cameraActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 99;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        String str = cameraActivity.asBinder;
        if (i3 == 0) {
            return str;
        }
        throw null;
    }

    public static final /* synthetic */ void onExtraCallback(CameraActivity cameraActivity, String str) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 29;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        cameraActivity.IAuthTabCallbackStub = str;
        int i5 = i3 + 3;
        writeTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 50 / 0;
        }
    }

    public static final /* synthetic */ CameraView onWarmupCompleted(CameraActivity cameraActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 31;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        CameraView cameraView = cameraActivity.asInterface;
        int i5 = i2 + 59;
        writeTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 82 / 0;
        }
        return cameraView;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        CameraActivity cameraActivity = (CameraActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 19;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        String str = cameraActivity.IAuthTabCallbackStub;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 17;
        writeTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 70 / 0;
        }
        return str;
    }

    public String getScreenName() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 37;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return "take_photo";
        }
        throw null;
    }

    public static final class onWarmupCompleted {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public final Intent onExtraCallback(@NotNull Context context, int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intent intent = new Intent(context, (Class<?>) CameraActivity.class);
            intent.putExtra("EXTRA_MAX_COUNT", i);
            intent.putExtra("EXTRA_PREVIEW_DESCRIPTION", str);
            intent.putExtra("EXTRA_CONFIRM_MESSAGE", str2);
            intent.putExtra("EXTRA_LOGGING_VIEW", str3);
            intent.putExtra("EXTRA_LOGGING_VIEW", str4);
            int i3 = onNavigationEvent + 93;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return intent;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0021 A[PHI: r1
      0x0021: PHI (r1v7 o.BrickModuleImplExternalSyntheticLambda5) = (r1v6 o.BrickModuleImplExternalSyntheticLambda5), (r1v9 o.BrickModuleImplExternalSyntheticLambda5) binds: [B:10:0x001f, B:7:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onTransact(CameraActivity cameraActivity) {
        BrickModuleImplExternalSyntheticLambda5 brickModuleImplExternalSyntheticLambda5;
        BrickModuleImplExternalSyntheticLambda5 brickModuleImplExternalSyntheticLambda52;
        int i = 2 % 2;
        if (!cameraActivity.isFinishing()) {
            int i2 = ICustomTabsCallback + 91;
            writeTypedObject = i2 % 128;
            if (i2 % 2 != 0) {
                brickModuleImplExternalSyntheticLambda5 = cameraActivity.extraCallbackWithResult;
                int i3 = 68 / 0;
                if (brickModuleImplExternalSyntheticLambda5 != null) {
                    if (brickModuleImplExternalSyntheticLambda5.isShowing() && (brickModuleImplExternalSyntheticLambda52 = cameraActivity.extraCallbackWithResult) != null) {
                        brickModuleImplExternalSyntheticLambda52.dismiss();
                    }
                }
            } else {
                brickModuleImplExternalSyntheticLambda5 = cameraActivity.extraCallbackWithResult;
                if (brickModuleImplExternalSyntheticLambda5 != null) {
                }
            }
        }
        int i4 = ICustomTabsCallback + 49;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 113;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = writeTypedObject + 81;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 32 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final CharSequence asInterface(CameraActivity cameraActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 55;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        String string = cameraActivity.getString(R.string.camera_photo_not_posted_yet);
        int i4 = writeTypedObject + 59;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final CharSequence onWarmupCompleted(CameraActivity cameraActivity, List list) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 31;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.string.camera_photo_posted;
        int size = list.size();
        if (i3 != 0) {
            return cameraActivity.getString(i4, Integer.valueOf(size));
        }
        Object[] objArr = new Object[0];
        objArr[0] = Integer.valueOf(size);
        return cameraActivity.getString(i4, objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(CameraActivity cameraActivity, List list) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 99;
        ICustomTabsCallback = i2 % 128;
        setIconBackgroundColor seticonbackgroundcolor = null;
        if (i2 % 2 != 0 ? cameraActivity.IAuthTabCallbackStubProxy != 1 : cameraActivity.IAuthTabCallbackStubProxy != 0) {
            if (list.isEmpty()) {
                setIconBackgroundColor seticonbackgroundcolor2 = cameraActivity.IAuthTabCallbackDefault;
                if (seticonbackgroundcolor2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    seticonbackgroundcolor2 = null;
                }
                seticonbackgroundcolor2.IAuthTabCallback_Parcel.setImageBitmap((Bitmap) null);
                setIconBackgroundColor seticonbackgroundcolor3 = cameraActivity.IAuthTabCallbackDefault;
                if (seticonbackgroundcolor3 == null) {
                    int i3 = writeTypedObject + 105;
                    ICustomTabsCallback = i3 % 128;
                    int i4 = i3 % 2;
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    seticonbackgroundcolor3 = null;
                }
                Typography4 typography4 = seticonbackgroundcolor3.asInterface;
                Intrinsics.checkNotNullExpressionValue(typography4, "");
                typography4.setVisibility(8);
                setIconBackgroundColor seticonbackgroundcolor4 = cameraActivity.IAuthTabCallbackDefault;
                if (seticonbackgroundcolor4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    seticonbackgroundcolor4 = null;
                }
                seticonbackgroundcolor4.access000.setTextColor(ContextCompat.getColor(cameraActivity, im.toss.tds.R.color.grey_800));
                setIconBackgroundColor seticonbackgroundcolor5 = cameraActivity.IAuthTabCallbackDefault;
                if (seticonbackgroundcolor5 == null) {
                    int i5 = ICustomTabsCallback + 81;
                    writeTypedObject = i5 % 128;
                    if (i5 % 2 != 0) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        seticonbackgroundcolor.hashCode();
                        throw null;
                    }
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    seticonbackgroundcolor5 = null;
                }
                CardView cardView = seticonbackgroundcolor5.IAuthTabCallbackDefault;
                Intrinsics.checkNotNullExpressionValue(cardView, "");
                setProtocolsokhttp.onWarmupCompleted(cardView, new CameraActivity$.ExternalSyntheticLambda5(cameraActivity));
            } else {
                setIconBackgroundColor seticonbackgroundcolor6 = cameraActivity.IAuthTabCallbackDefault;
                if (seticonbackgroundcolor6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    seticonbackgroundcolor6 = null;
                }
                TdsImageView tdsImageView = seticonbackgroundcolor6.IAuthTabCallback_Parcel;
                Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
                RecomposerawaitIdle2.onNavigationEvent onnavigationevent = new RecomposerawaitIdle2.onNavigationEvent(cameraActivity);
                Intrinsics.checkNotNull(list);
                TdsImageView.setImage$default(tdsImageView, onnavigationevent.onExtraCallback(CollectionsKt.last(list)).onExtraCallbackWithResult(RememberObserver.FIT), (Function1) null, (Function1) null, 6, (Object) null);
                setIconBackgroundColor seticonbackgroundcolor7 = cameraActivity.IAuthTabCallbackDefault;
                if (seticonbackgroundcolor7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    seticonbackgroundcolor7 = null;
                }
                Typography4 typography42 = seticonbackgroundcolor7.asInterface;
                Intrinsics.checkNotNullExpressionValue(typography42, "");
                typography42.setVisibility(0);
                setIconBackgroundColor seticonbackgroundcolor8 = cameraActivity.IAuthTabCallbackDefault;
                if (seticonbackgroundcolor8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    seticonbackgroundcolor8 = null;
                }
                seticonbackgroundcolor8.access000.setTextColor(ContextCompat.getColor(cameraActivity, im.toss.tds.R.color.light_theme_blue_600));
                setIconBackgroundColor seticonbackgroundcolor9 = cameraActivity.IAuthTabCallbackDefault;
                if (seticonbackgroundcolor9 == null) {
                    int i6 = ICustomTabsCallback + 79;
                    writeTypedObject = i6 % 128;
                    if (i6 % 2 != 0) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        throw null;
                    }
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    seticonbackgroundcolor9 = null;
                }
                CardView cardView2 = seticonbackgroundcolor9.IAuthTabCallbackDefault;
                Intrinsics.checkNotNullExpressionValue(cardView2, "");
                setProtocolsokhttp.onWarmupCompleted(cardView2, new CameraActivity$.ExternalSyntheticLambda6(cameraActivity, list));
            }
        } else if (list.size() == 1) {
            cameraActivity.finish();
        }
        setIconBackgroundColor seticonbackgroundcolor10 = cameraActivity.IAuthTabCallbackDefault;
        if (seticonbackgroundcolor10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i7 = ICustomTabsCallback + 89;
            writeTypedObject = i7 % 128;
            int i8 = i7 % 2;
            seticonbackgroundcolor10 = null;
        }
        seticonbackgroundcolor10.access000.setText(String.valueOf(list.size()));
        setIconBackgroundColor seticonbackgroundcolor11 = cameraActivity.IAuthTabCallbackDefault;
        if (seticonbackgroundcolor11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            seticonbackgroundcolor = seticonbackgroundcolor11;
        }
        seticonbackgroundcolor.access000.announceForAccessibility(cameraActivity.getString(R.string.camera_photo_posted, Integer.valueOf(list.size())));
        return Unit.INSTANCE;
    }

    private static final void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 7;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        CameraActivity cameraActivity = (CameraActivity) objArr[0];
        Boolean bool = (Boolean) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 27;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        if (bool.booleanValue()) {
            int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            onWarmupCompleted(750390311, -750390307, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, iIAuthTabCallback3, new Object[]{cameraActivity});
        } else {
            cameraActivity.finish();
        }
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallback + 29;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 80 / 0;
        }
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x019c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(@Nullable Bundle bundle) {
        String stringExtra;
        String stringExtra2;
        String stringExtra3;
        String stringExtra4;
        int i = 2 % 2;
        super.onCreate(bundle);
        setIconBackgroundColor seticonbackgroundcolorOnExtraCallback = setIconBackgroundColor.onExtraCallback(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(seticonbackgroundcolorOnExtraCallback, "");
        this.IAuthTabCallbackDefault = seticonbackgroundcolorOnExtraCallback;
        Object obj = null;
        if (seticonbackgroundcolorOnExtraCallback == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            seticonbackgroundcolorOnExtraCallback = null;
        }
        setContentView(seticonbackgroundcolorOnExtraCallback.onExtraCallbackWithResult());
        setIconBackgroundColor seticonbackgroundcolor = this.IAuthTabCallbackDefault;
        if (seticonbackgroundcolor == null) {
            int i2 = ICustomTabsCallback + 83;
            writeTypedObject = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i3 = 80 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            seticonbackgroundcolor = null;
        }
        setSupportActionBar(seticonbackgroundcolor.IAuthTabCallbackStubProxy);
        onExtraCallbackWithResult();
        if (!shouldAbsorb.onExtraCallbackWithResult(this, clearOldPositions.BACK)) {
            Object[] objArr = {this, Integer.valueOf(im.toss.uikit.R.string.alert_message_camera_disabled), 0, 2, null};
            onIconClick.IAuthTabCallback(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), objArr, -2063899930, 2063899930);
            finish();
            return;
        }
        CameraView cameraViewFindViewById = findViewById(R.id.camera);
        Intrinsics.checkNotNullExpressionValue(cameraViewFindViewById, "");
        CameraView cameraView = cameraViewFindViewById;
        this.asInterface = cameraView;
        if (cameraView == null) {
            int i4 = writeTypedObject + 79;
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            cameraView = null;
        }
        cameraView.setEngine(assertInLayoutOrScroll.CAMERA2);
        CameraView cameraView2 = this.asInterface;
        if (cameraView2 == null) {
            int i6 = writeTypedObject + 81;
            ICustomTabsCallback = i6 % 128;
            if (i6 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                obj.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            cameraView2 = null;
        }
        cameraView2.IAuthTabCallback(new onExtraCallback(this));
        setIconBackgroundColor seticonbackgroundcolor2 = this.IAuthTabCallbackDefault;
        if (seticonbackgroundcolor2 == null) {
            int i7 = writeTypedObject + 15;
            ICustomTabsCallback = i7 % 128;
            int i8 = i7 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            seticonbackgroundcolor2 = null;
        }
        seticonbackgroundcolor2.onTransact.setContentDescription(getString(R.string.camera_picture_button));
        setIconBackgroundColor seticonbackgroundcolor3 = this.IAuthTabCallbackDefault;
        if (seticonbackgroundcolor3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            seticonbackgroundcolor3 = null;
        }
        FrameLayout frameLayout = seticonbackgroundcolor3.onTransact;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        setProtocolsokhttp.onExtraCallback(frameLayout);
        if (bundle == null) {
            Intent intent = getIntent();
            if (intent != null) {
                int i9 = writeTypedObject + 7;
                ICustomTabsCallback = i9 % 128;
                if (i9 % 2 == 0) {
                    this.IAuthTabCallbackStubProxy = intent.getIntExtra("EXTRA_MAX_COUNT", 1);
                    stringExtra = intent.getStringExtra("EXTRA_PREVIEW_DESCRIPTION");
                    if (stringExtra == null) {
                        stringExtra = "";
                    }
                    this.readTypedObject = stringExtra;
                    stringExtra2 = intent.getStringExtra("EXTRA_CONFIRM_MESSAGE");
                    if (stringExtra2 == null) {
                        stringExtra2 = "";
                    }
                    this.asBinder = stringExtra2;
                    stringExtra3 = intent.getStringExtra("EXTRA_LOGGING_VIEW");
                    if (stringExtra3 == null) {
                        int i10 = writeTypedObject + 29;
                        ICustomTabsCallback = i10 % 128;
                        if (i10 % 2 == 0) {
                            obj.hashCode();
                            throw null;
                        }
                        stringExtra3 = "";
                    }
                    this.access100 = stringExtra3;
                    stringExtra4 = intent.getStringExtra("EXTRA_LOGGING_VIEW");
                    if (stringExtra4 == null) {
                        stringExtra4 = "";
                    }
                } else {
                    this.IAuthTabCallbackStubProxy = intent.getIntExtra("EXTRA_MAX_COUNT", 0);
                    stringExtra = intent.getStringExtra("EXTRA_PREVIEW_DESCRIPTION");
                    if (stringExtra == null) {
                    }
                    this.readTypedObject = stringExtra;
                    stringExtra2 = intent.getStringExtra("EXTRA_CONFIRM_MESSAGE");
                    if (stringExtra2 == null) {
                    }
                    this.asBinder = stringExtra2;
                    stringExtra3 = intent.getStringExtra("EXTRA_LOGGING_VIEW");
                    if (stringExtra3 == null) {
                    }
                    this.access100 = stringExtra3;
                    stringExtra4 = intent.getStringExtra("EXTRA_LOGGING_VIEW");
                    if (stringExtra4 == null) {
                    }
                }
            }
            deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback = this.getInterfaceDescriptor.onWarmupCompleted().IAuthTabCallback(new CameraActivity$.ExternalSyntheticLambda1(new CameraActivity$.ExternalSyntheticLambda0(this)));
            Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback, "");
            onNavigationEvent(deserializeurinullablecollectionIAuthTabCallback);
            deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback2 = new RxPermissions(this).onNavigationEvent(new String[]{"android.permission.CAMERA"}).IAuthTabCallback(new CameraActivity$.ExternalSyntheticLambda3(new CameraActivity$.ExternalSyntheticLambda2(this)));
            Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback2, "");
            onNavigationEvent(deserializeurinullablecollectionIAuthTabCallback2);
        }
        int i11 = ICustomTabsCallback + 95;
        writeTypedObject = i11 % 128;
        int i12 = i11 % 2;
        this.IAuthTabCallbackStubProxy = bundle.getInt("EXTRA_MAX_COUNT");
        String string = bundle.getString("EXTRA_PREVIEW_DESCRIPTION", "");
        Intrinsics.checkNotNullExpressionValue(string, "");
        this.readTypedObject = string;
        String string2 = bundle.getString("EXTRA_CONFIRM_MESSAGE", "");
        Intrinsics.checkNotNullExpressionValue(string2, "");
        this.asBinder = string2;
        drawImageIconPadding<String> drawimageiconpadding = this.getInterfaceDescriptor;
        ArrayList<String> stringArrayList = bundle.getStringArrayList("EXTRA_PHOTO_URLS");
        if (stringArrayList == null) {
            stringArrayList = new ArrayList<>();
        }
        drawimageiconpadding.onNavigationEvent(stringArrayList);
        String string3 = bundle.getString("EXTRA_CURRENT_PHOTO", "");
        Intrinsics.checkNotNullExpressionValue(string3, "");
        this.IAuthTabCallbackStub = string3;
        String string4 = bundle.getString("EXTRA_LOGGING_VIEW", "");
        Intrinsics.checkNotNullExpressionValue(string4, "");
        this.access100 = string4;
        stringExtra4 = bundle.getString("EXTRA_LOGGING_VIEW", "");
        Intrinsics.checkNotNullExpressionValue(stringExtra4, "");
        this.IAuthTabCallback_Parcel = stringExtra4;
        deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback3 = this.getInterfaceDescriptor.onWarmupCompleted().IAuthTabCallback(new CameraActivity$.ExternalSyntheticLambda1(new CameraActivity$.ExternalSyntheticLambda0(this)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback3, "");
        onNavigationEvent(deserializeurinullablecollectionIAuthTabCallback3);
        deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback22 = new RxPermissions(this).onNavigationEvent(new String[]{"android.permission.CAMERA"}).IAuthTabCallback(new CameraActivity$.ExternalSyntheticLambda3(new CameraActivity$.ExternalSyntheticLambda2(this)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback22, "");
        onNavigationEvent(deserializeurinullablecollectionIAuthTabCallback22);
    }

    private final void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 123;
        writeTypedObject = i2 % 128;
        setIconBackgroundColor seticonbackgroundcolor = null;
        if (i2 % 2 != 0) {
            forceInnerPermissionCheck.onExtraCallbackWithResult.onNavigationEvent();
            WindowInsetsCompat.onTransact.IAuthTabCallback();
            throw null;
        }
        int iOnNavigationEvent = forceInnerPermissionCheck.onExtraCallbackWithResult.onNavigationEvent();
        int iIAuthTabCallback = WindowInsetsCompat.onTransact.IAuthTabCallback();
        setIconBackgroundColor seticonbackgroundcolor2 = this.IAuthTabCallbackDefault;
        if (seticonbackgroundcolor2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            seticonbackgroundcolor2 = null;
        }
        int paddingLeft = seticonbackgroundcolor2.onExtraCallbackWithResult().getPaddingLeft();
        setIconBackgroundColor seticonbackgroundcolor3 = this.IAuthTabCallbackDefault;
        if (seticonbackgroundcolor3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            seticonbackgroundcolor3 = null;
        }
        int paddingRight = seticonbackgroundcolor3.onExtraCallbackWithResult().getPaddingRight();
        setIconBackgroundColor seticonbackgroundcolor4 = this.IAuthTabCallbackDefault;
        if (seticonbackgroundcolor4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            seticonbackgroundcolor4 = null;
        }
        int paddingTop = seticonbackgroundcolor4.onNavigationEvent.getPaddingTop();
        setIconBackgroundColor seticonbackgroundcolor5 = this.IAuthTabCallbackDefault;
        if (seticonbackgroundcolor5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            seticonbackgroundcolor5 = null;
        }
        int paddingBottom = seticonbackgroundcolor5.IAuthTabCallbackStub.getPaddingBottom();
        setIconBackgroundColor seticonbackgroundcolor6 = this.IAuthTabCallbackDefault;
        if (seticonbackgroundcolor6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            seticonbackgroundcolor6 = null;
        }
        int i3 = seticonbackgroundcolor6.onExtraCallback.getLayoutParams().height;
        setIconBackgroundColor seticonbackgroundcolor7 = this.IAuthTabCallbackDefault;
        if (seticonbackgroundcolor7 == null) {
            int i4 = writeTypedObject + 111;
            ICustomTabsCallback = i4 % 128;
            if (i4 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            seticonbackgroundcolor7 = null;
        }
        ViewCompat.onWarmupCompleted(seticonbackgroundcolor7.onExtraCallbackWithResult(), new CameraActivity$.ExternalSyntheticLambda4(iOnNavigationEvent & (~iIAuthTabCallback), paddingLeft, paddingRight, this, paddingTop, paddingBottom, i3));
        setIconBackgroundColor seticonbackgroundcolor8 = this.IAuthTabCallbackDefault;
        if (seticonbackgroundcolor8 == null) {
            int i5 = writeTypedObject + 25;
            ICustomTabsCallback = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i6 == 0) {
                seticonbackgroundcolor.hashCode();
                throw null;
            }
        } else {
            seticonbackgroundcolor = seticonbackgroundcolor8;
        }
        ViewCompat.extraCommand(seticonbackgroundcolor.onExtraCallbackWithResult());
    }

    public void onSaveInstanceState(@NotNull Bundle bundle) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(bundle, "");
        super.onSaveInstanceState(bundle);
        bundle.putInt("EXTRA_MAX_COUNT", this.IAuthTabCallbackStubProxy);
        bundle.putString("EXTRA_PREVIEW_DESCRIPTION", this.readTypedObject);
        bundle.putString("EXTRA_CONFIRM_MESSAGE", this.asBinder);
        bundle.putStringArrayList("EXTRA_PHOTO_URLS", new ArrayList<>(this.getInterfaceDescriptor.onExtraCallback()));
        bundle.putString("EXTRA_CURRENT_PHOTO", this.IAuthTabCallbackStub);
        bundle.putString("EXTRA_LOGGING_VIEW", this.access100);
        bundle.putString("EXTRA_LOGGING_VIEW", this.IAuthTabCallback_Parcel);
        int i2 = writeTypedObject + 113;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    public Map<String, Object> getScreenParams() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 15;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            String str = this.access100;
            if (str.length() <= 0) {
                str = null;
            }
            if (str == null) {
                return null;
            }
            String str2 = this.IAuthTabCallback_Parcel;
            if (str2.length() <= 0) {
                int i3 = writeTypedObject + 97;
                ICustomTabsCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
                str2 = null;
            }
            if (str2 == null) {
                return null;
            }
            return access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback("view", str), getWrite.IAuthTabCallback("category", str2)});
        }
        this.access100.length();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onExtraCallback(CameraActivity cameraActivity, View view) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 19;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        List<String> listOnExtraCallback = cameraActivity.getInterfaceDescriptor.onExtraCallback();
        if (listOnExtraCallback.isEmpty()) {
            return;
        }
        cameraActivity.startActivityForResult(PhotoListActivity.Companion.onNavigationEvent(cameraActivity, new ArrayList(listOnExtraCallback)), 1002);
        int i4 = ICustomTabsCallback + 41;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void IAuthTabCallback(CameraActivity cameraActivity, View view) {
        CameraView cameraView;
        int i = 2 % 2;
        int i2 = writeTypedObject + 51;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        View view2 = null;
        if (i2 % 2 == 0) {
            cameraView = cameraActivity.asInterface;
            int i4 = 78 / 0;
            if (cameraView == null) {
                int i5 = i3 + 37;
                writeTypedObject = i5 % 128;
                int i6 = i5 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                cameraView = null;
            }
        } else {
            cameraView = cameraActivity.asInterface;
            if (cameraView == null) {
            }
        }
        if (cameraView.asInterface()) {
            return;
        }
        int size = cameraActivity.getInterfaceDescriptor.onExtraCallback().size();
        int i7 = cameraActivity.IAuthTabCallbackStubProxy;
        if (size == i7) {
            String string = i7 == 1 ? cameraActivity.getString(im.toss.uikit.R.string.alert_message_photo_max_one) : cameraActivity.getString(im.toss.uikit.R.string.alert_message_photo_max_limit, Integer.valueOf(i7));
            Intrinsics.checkNotNull(string);
            onIconClick.onExtraCallbackWithResult(cameraActivity, string, 0, 2, (Object) null);
            int i8 = writeTypedObject + 79;
            ICustomTabsCallback = i8 % 128;
            if (i8 % 2 != 0) {
                return;
            }
            view2.hashCode();
            throw null;
        }
        CameraView cameraView2 = cameraActivity.asInterface;
        if (cameraView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            cameraView2 = null;
        }
        cameraView2.getInterfaceDescriptor();
        View view3 = cameraActivity.asInterface;
        if (view3 == null) {
            int i9 = writeTypedObject + 101;
            ICustomTabsCallback = i9 % 128;
            int i10 = i9 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            view2 = view3;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.5f);
        alphaAnimation.setDuration(50L);
        alphaAnimation.setRepeatMode(2);
        alphaAnimation.setAnimationListener(cameraActivity.new onExtraCallbackWithResult());
        view2.startAnimation(alphaAnimation);
    }

    public static final class onExtraCallbackWithResult implements Animation.AnimationListener {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 99;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 38 / 0;
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 1;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        onExtraCallbackWithResult() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            int i = 2 % 2;
            CameraView cameraViewOnWarmupCompleted = CameraActivity.onWarmupCompleted(CameraActivity.this);
            if (cameraViewOnWarmupCompleted == null) {
                int i2 = onExtraCallback + 83;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                cameraViewOnWarmupCompleted = null;
            }
            if (!cameraViewOnWarmupCompleted.asInterface()) {
                return;
            }
            int i4 = onExtraCallback + 83;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            CameraActivity.this.IAuthTabCallback();
        }
    }

    private static final void onTransact(CameraActivity cameraActivity, View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 89;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        cameraActivity.finish();
        int i4 = ICustomTabsCallback + 7;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 11;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        View view = getView();
        if (view != null) {
            int i4 = writeTypedObject + 63;
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
            view.removeCallbacks(this.onTransact);
        }
        if (isFinishing()) {
            return;
        }
        if (this.extraCallbackWithResult == null) {
            BrickModuleImplExternalSyntheticLambda5 brickModuleImplExternalSyntheticLambda5 = new BrickModuleImplExternalSyntheticLambda5(this);
            brickModuleImplExternalSyntheticLambda5.setMessage("잠시만 기다려주세요.");
            brickModuleImplExternalSyntheticLambda5.setCancelable(false);
            this.extraCallbackWithResult = brickModuleImplExternalSyntheticLambda5;
        }
        Intrinsics.checkNotNull(this.extraCallbackWithResult);
        if (!(!r1.isShowing())) {
            return;
        }
        BrickModuleImplExternalSyntheticLambda5 brickModuleImplExternalSyntheticLambda52 = this.extraCallbackWithResult;
        Intrinsics.checkNotNull(brickModuleImplExternalSyntheticLambda52);
        brickModuleImplExternalSyntheticLambda52.show();
        int i6 = writeTypedObject + 73;
        ICustomTabsCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 115;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        View view = getView();
        if (view != null) {
            int i4 = writeTypedObject + 67;
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
            view.post(this.onTransact);
        }
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        ArrayList<String> arrayList;
        int i3 = 2 % 2;
        if (i == 1001) {
            if (i2 == -1) {
                this.getInterfaceDescriptor.onWarmupCompleted((drawImageIconPadding<String>) this.IAuthTabCallbackStub);
                return;
            }
            return;
        }
        if (i != 1002) {
            int i4 = writeTypedObject + 63;
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
            super.onActivityResult(i, i2, intent);
            int i6 = ICustomTabsCallback + 33;
            writeTypedObject = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 4 / 0;
                return;
            }
            return;
        }
        if (i2 == -1) {
            if (intent == null || (arrayList = intent.getStringArrayListExtra("imageUrlArray")) == null) {
                arrayList = new ArrayList<>();
            }
            if (this.getInterfaceDescriptor.onExtraCallback().size() != arrayList.size()) {
                int i8 = ICustomTabsCallback + 9;
                writeTypedObject = i8 % 128;
                int i9 = i8 % 2;
                this.getInterfaceDescriptor.onWarmupCompleted(arrayList);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onCreateOptionsMenu(@NotNull Menu menu) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(menu, "");
        getMenuInflater().inflate(R$menu.menu_camera, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.flash);
        Intrinsics.checkNotNullExpressionValue(menuItemFindItem, "");
        this.access000 = menuItemFindItem;
        MenuItem menuItem = null;
        Drawable drawableOnExtraCallback = ResourcesCompat.onExtraCallback(getResources(), R.drawable.btn_flash_on, (Resources.Theme) null);
        if (drawableOnExtraCallback != null) {
            int i2 = writeTypedObject + 125;
            ICustomTabsCallback = i2 % 128;
            if (i2 % 2 == 0) {
                CameraControllerExternalSyntheticLambda9.IAuthTabCallback(drawableOnExtraCallback, -16777216);
                menuItem.hashCode();
                throw null;
            }
            CameraControllerExternalSyntheticLambda9.IAuthTabCallback(drawableOnExtraCallback, -16777216);
        } else {
            drawableOnExtraCallback = null;
        }
        MenuItem menuItem2 = this.access000;
        if (menuItem2 == null) {
            int i3 = ICustomTabsCallback + 87;
            writeTypedObject = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            menuItem2 = null;
        }
        menuItem2.setIcon(drawableOnExtraCallback);
        MenuItem menuItem3 = this.access000;
        if (menuItem3 == null) {
            int i5 = writeTypedObject + 9;
            ICustomTabsCallback = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i6 == 0) {
                throw null;
            }
        } else {
            menuItem = menuItem3;
        }
        put.onNavigationEvent(menuItem, getString(R.string.camera_flash));
        int i7 = writeTypedObject + 89;
        ICustomTabsCallback = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 7 / 0;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onOptionsItemSelected(@NotNull MenuItem menuItem) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(menuItem, "");
        int itemId = menuItem.getItemId();
        if (itemId != R.id.flash) {
            if (itemId != 16908332) {
                return false;
            }
            finish();
            return true;
        }
        CameraView cameraView = this.asInterface;
        setIconBackgroundColor seticonbackgroundcolor = null;
        if (cameraView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            cameraView = null;
        }
        animateAppearance animateappearanceOnTransact = cameraView.onTransact();
        animateAppearance animateappearance = animateAppearance.OFF;
        if (animateappearanceOnTransact == animateappearance) {
            int i2 = writeTypedObject + 67;
            ICustomTabsCallback = i2 % 128;
            if (i2 % 2 == 0) {
                seticonbackgroundcolor.hashCode();
                throw null;
            }
            CameraView cameraView2 = this.asInterface;
            if (cameraView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                cameraView2 = null;
            }
            cameraView2.setFlash(animateAppearance.TORCH);
            Drawable drawable = ContextCompat.getDrawable(this, R.drawable.btn_flash_on_selected);
            if (drawable != null) {
                int i3 = ICustomTabsCallback + 33;
                writeTypedObject = i3 % 128;
                int i4 = i3 % 2;
                CameraControllerExternalSyntheticLambda9.IAuthTabCallback(drawable, -16777216);
            } else {
                drawable = null;
            }
            MenuItem menuItem2 = this.access000;
            if (menuItem2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                menuItem2 = null;
            }
            menuItem2.setIcon(drawable);
            setIconBackgroundColor seticonbackgroundcolor2 = this.IAuthTabCallbackDefault;
            if (seticonbackgroundcolor2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                seticonbackgroundcolor = seticonbackgroundcolor2;
            }
            seticonbackgroundcolor.IAuthTabCallbackStubProxy.announceForAccessibility(getString(R.string.camera_flash_on));
        } else {
            CameraView cameraView3 = this.asInterface;
            if (cameraView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                cameraView3 = null;
            }
            cameraView3.setFlash(animateappearance);
            Drawable drawable2 = ContextCompat.getDrawable(this, R.drawable.btn_flash_on);
            if (drawable2 != null) {
                int i5 = writeTypedObject + 115;
                ICustomTabsCallback = i5 % 128;
                int i6 = i5 % 2;
                CameraControllerExternalSyntheticLambda9.IAuthTabCallback(drawable2, -16777216);
                int i7 = writeTypedObject + 91;
                ICustomTabsCallback = i7 % 128;
                int i8 = i7 % 2;
            } else {
                drawable2 = null;
            }
            MenuItem menuItem3 = this.access000;
            if (menuItem3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i9 = ICustomTabsCallback + 53;
                writeTypedObject = i9 % 128;
                int i10 = i9 % 2;
                menuItem3 = null;
            }
            menuItem3.setIcon(drawable2);
            setIconBackgroundColor seticonbackgroundcolor3 = this.IAuthTabCallbackDefault;
            if (seticonbackgroundcolor3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                seticonbackgroundcolor = seticonbackgroundcolor3;
            }
            seticonbackgroundcolor.IAuthTabCallbackStubProxy.announceForAccessibility(getString(R.string.camera_flash_off));
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void finish() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 93;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        if (!this.getInterfaceDescriptor.onExtraCallback().isEmpty()) {
            Intent intent = new Intent();
            intent.putExtra("imageUrlArray", new ArrayList(this.getInterfaceDescriptor.onExtraCallback()));
            Unit unit = Unit.INSTANCE;
            setResult(-1, intent);
        }
        super/*android.app.Activity*/.finish();
        int i4 = ICustomTabsCallback + 93;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i;
        CameraActivity cameraActivity = (CameraActivity) objArr[0];
        int i2 = 2 % 2;
        CameraView cameraView = cameraActivity.asInterface;
        Object obj = null;
        if (cameraView == null) {
            int i3 = writeTypedObject + 103;
            ICustomTabsCallback = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            cameraView = null;
        }
        cameraView.setLifecycleOwner(cameraActivity);
        IPostMessageServiceStubProxy supportActionBar = cameraActivity.getSupportActionBar();
        if (supportActionBar != null) {
            int i5 = ICustomTabsCallback + 105;
            writeTypedObject = i5 % 128;
            int i6 = i5 % 2;
            supportActionBar.onNavigationEvent(true);
        }
        setIconBackgroundColor seticonbackgroundcolor = cameraActivity.IAuthTabCallbackDefault;
        if (seticonbackgroundcolor == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            seticonbackgroundcolor = null;
        }
        CardView cardView = seticonbackgroundcolor.IAuthTabCallbackDefault;
        Intrinsics.checkNotNull(cardView);
        if (cameraActivity.IAuthTabCallbackStubProxy <= 1) {
            int i7 = writeTypedObject + 111;
            ICustomTabsCallback = i7 % 128;
            i = i7 % 2 == 0 ? 0 : 8;
        }
        cardView.setVisibility(i);
        setProtocolsokhttp.onNavigationEvent(cardView);
        cardView.setOnClickListener(new CameraActivity$.ExternalSyntheticLambda8(cameraActivity));
        setIconBackgroundColor seticonbackgroundcolor2 = cameraActivity.IAuthTabCallbackDefault;
        if (seticonbackgroundcolor2 == null) {
            int i8 = ICustomTabsCallback + 11;
            writeTypedObject = i8 % 128;
            int i9 = i8 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            seticonbackgroundcolor2 = null;
        }
        seticonbackgroundcolor2.onTransact.setOnClickListener(new CameraActivity$.ExternalSyntheticLambda9(cameraActivity));
        setIconBackgroundColor seticonbackgroundcolor3 = cameraActivity.IAuthTabCallbackDefault;
        if (seticonbackgroundcolor3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i10 = ICustomTabsCallback + 41;
            writeTypedObject = i10 % 128;
            int i11 = i10 % 2;
            seticonbackgroundcolor3 = null;
        }
        seticonbackgroundcolor3.asInterface.setOnClickListener(new CameraActivity$.ExternalSyntheticLambda10(cameraActivity));
        if (cameraActivity.readTypedObject.length() <= 0) {
            setIconBackgroundColor seticonbackgroundcolor4 = cameraActivity.IAuthTabCallbackDefault;
            if (seticonbackgroundcolor4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                seticonbackgroundcolor4 = null;
            }
            Group group = seticonbackgroundcolor4.onWarmupCompleted;
            Intrinsics.checkNotNullExpressionValue(group, "");
            group.setVisibility(8);
            return null;
        }
        int i12 = ICustomTabsCallback + 73;
        writeTypedObject = i12 % 128;
        int i13 = i12 % 2;
        setIconBackgroundColor seticonbackgroundcolor5 = cameraActivity.IAuthTabCallbackDefault;
        if (seticonbackgroundcolor5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            seticonbackgroundcolor5 = null;
        }
        Group group2 = seticonbackgroundcolor5.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(group2, "");
        group2.setVisibility(0);
        setIconBackgroundColor seticonbackgroundcolor6 = cameraActivity.IAuthTabCallbackDefault;
        if (seticonbackgroundcolor6 == null) {
            int i14 = writeTypedObject + 45;
            ICustomTabsCallback = i14 % 128;
            if (i14 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                obj.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            seticonbackgroundcolor6 = null;
        }
        seticonbackgroundcolor6.onExtraCallbackWithResult.setText(cameraActivity.readTypedObject);
        return null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        int iIntValue2 = ((Number) objArr[1]).intValue();
        int iIntValue3 = ((Number) objArr[2]).intValue();
        CameraActivity cameraActivity = (CameraActivity) objArr[3];
        int iIntValue4 = ((Number) objArr[4]).intValue();
        int iIntValue5 = ((Number) objArr[5]).intValue();
        int iIntValue6 = ((Number) objArr[6]).intValue();
        View view = (View) objArr[7];
        WindowInsetsCompat windowInsetsCompat = (WindowInsetsCompat) objArr[8];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 7;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        CameraControllerExternalSyntheticLambda0 cameraControllerExternalSyntheticLambda0OnWarmupCompleted = windowInsetsCompat.onWarmupCompleted(iIntValue);
        Intrinsics.checkNotNullExpressionValue(cameraControllerExternalSyntheticLambda0OnWarmupCompleted, "");
        view.setPadding(iIntValue2 + cameraControllerExternalSyntheticLambda0OnWarmupCompleted.IAuthTabCallback, view.getPaddingTop(), iIntValue3 + cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onExtraCallbackWithResult, view.getPaddingBottom());
        setIconBackgroundColor seticonbackgroundcolor = cameraActivity.IAuthTabCallbackDefault;
        setIconBackgroundColor seticonbackgroundcolor2 = null;
        if (seticonbackgroundcolor == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = writeTypedObject + 115;
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
            seticonbackgroundcolor = null;
        }
        AppBarLayout appBarLayout = seticonbackgroundcolor.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(appBarLayout, "");
        appBarLayout.setPadding(appBarLayout.getPaddingLeft(), iIntValue4 + cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onWarmupCompleted, appBarLayout.getPaddingRight(), appBarLayout.getPaddingBottom());
        setIconBackgroundColor seticonbackgroundcolor3 = cameraActivity.IAuthTabCallbackDefault;
        if (seticonbackgroundcolor3 == null) {
            int i6 = ICustomTabsCallback + 35;
            writeTypedObject = i6 % 128;
            int i7 = i6 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            seticonbackgroundcolor3 = null;
        }
        ConstraintLayout constraintLayout = seticonbackgroundcolor3.IAuthTabCallbackStub;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingRight(), iIntValue5 + cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onExtraCallback);
        setIconBackgroundColor seticonbackgroundcolor4 = cameraActivity.IAuthTabCallbackDefault;
        if (seticonbackgroundcolor4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            seticonbackgroundcolor2 = seticonbackgroundcolor4;
        }
        FrameLayout frameLayout = seticonbackgroundcolor2.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = iIntValue6 + cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onExtraCallback;
        frameLayout.setLayoutParams(layoutParams);
        return new WindowInsetsCompat.onWarmupCompleted(windowInsetsCompat).onNavigationEvent(iIntValue, CameraControllerExternalSyntheticLambda0.onNavigationEvent).onExtraCallbackWithResult();
    }

    public static /* synthetic */ Unit onWarmupCompleted(CameraActivity cameraActivity, Boolean bool) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onWarmupCompleted(1864056952, -1864056950, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, iIAuthTabCallback3, new Object[]{cameraActivity, bool});
    }

    public static /* synthetic */ void onNavigationEvent(CameraActivity cameraActivity) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        onWarmupCompleted(1703881602, -1703881597, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, iIAuthTabCallback3, new Object[]{cameraActivity});
    }

    public static final /* synthetic */ String onExtraCallbackWithResult(CameraActivity cameraActivity) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (String) onWarmupCompleted(434164655, -434164655, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, iIAuthTabCallback3, new Object[]{cameraActivity});
    }

    private static final WindowInsetsCompat onExtraCallback(int i, int i2, int i3, CameraActivity cameraActivity, int i4, int i5, int i6, View view, WindowInsetsCompat windowInsetsCompat) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), cameraActivity, Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), view, windowInsetsCompat};
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (WindowInsetsCompat) onWarmupCompleted(-3174948, 3174949, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr);
    }

    private final void onNavigationEvent() {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        onWarmupCompleted(750390311, -750390307, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, iIAuthTabCallback3, new Object[]{this});
    }

    private static final Unit onNavigationEvent(CameraActivity cameraActivity, Boolean bool) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onWarmupCompleted(163033138, -163033135, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, iIAuthTabCallback3, new Object[]{cameraActivity, bool});
    }

    public void onStart() {
        super.onStart();
    }

    public void onResume() {
        super.onResume();
    }

    public void onPause() {
        super.onPause();
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
