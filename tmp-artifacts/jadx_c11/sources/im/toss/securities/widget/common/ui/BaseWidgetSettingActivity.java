package im.toss.securities.widget.common.ui;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.base.BaseActivity;
import im.toss.base.R;
import im.toss.securities.widget.common.ui.BaseWidgetSettingActivity$;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.setProgressAsync;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class BaseWidgetSettingActivity extends BaseActivity {
    private static int IAuthTabCallbackDefault = 1;
    private static int asBinder;
    public static final int asInterface = 0;

    public static /* synthetic */ Unit onExtraCallback(BaseWidgetSettingActivity baseWidgetSettingActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = asBinder + 87;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(baseWidgetSettingActivity, dialogInterface);
        int i4 = IAuthTabCallbackDefault + 107;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(BaseWidgetSettingActivity baseWidgetSettingActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 103;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(baseWidgetSettingActivity, dialogInterface);
        int i4 = asBinder + 37;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(BaseWidgetSettingActivity baseWidgetSettingActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 21;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(baseWidgetSettingActivity, commonModule_setLeftEdgeTouchEnabled);
        int i4 = asBinder + 121;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 47;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return -1L;
        }
        int i3 = 30 / 0;
        return -1L;
    }

    public abstract void setEngagementSignalsCallback();

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 75;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "");
        onExtraCallback(intent);
        int i4 = IAuthTabCallbackDefault + 69;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onExtraCallback(Intent intent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 59;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if (intent.getIntExtra("appWidgetId", 0) != 0) {
            int i4 = asBinder + 111;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            setEngagementSignalsCallback();
        }
        int i6 = IAuthTabCallbackDefault + 97;
        asBinder = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 40 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 115;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return getIntent().getIntExtra("appWidgetId", 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        if (r0 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        if (o.setProgressAsync.onExtraCallback.IAuthTabCallback(r5, r1) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        return false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f A[PHI: r1
      0x002f: PHI (r1v6 android.appwidget.AppWidgetProviderInfo) = (r1v5 android.appwidget.AppWidgetProviderInfo), (r1v14 android.appwidget.AppWidgetProviderInfo) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onNavigationEvent() {
        AppWidgetProviderInfo appWidgetInfo;
        ComponentName componentName;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 11;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            appWidgetInfo = AppWidgetManager.getInstance(this).getAppWidgetInfo(IAuthTabCallback());
            int i3 = 95 / 0;
            if (appWidgetInfo != null) {
                int i4 = IAuthTabCallbackDefault + 119;
                asBinder = i4 % 128;
                if (i4 % 2 != 0) {
                    componentName = appWidgetInfo.provider;
                    int i5 = 62 / 0;
                } else {
                    componentName = appWidgetInfo.provider;
                }
            } else {
                componentName = null;
            }
        } else {
            appWidgetInfo = AppWidgetManager.getInstance(this).getAppWidgetInfo(IAuthTabCallback());
            if (appWidgetInfo != null) {
            }
        }
        if (componentName != null) {
            int i6 = IAuthTabCallbackDefault + 117;
            asBinder = i6 % 128;
            if (i6 % 2 != 0) {
                boolean zIAuthTabCallback = setProgressAsync.onExtraCallback.IAuthTabCallback(this, componentName);
                int i7 = 75 / 0;
            }
        }
        CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(this, new BaseWidgetSettingActivity$.ExternalSyntheticLambda0(this));
        return true;
    }

    private static final Unit onWarmupCompleted(BaseWidgetSettingActivity baseWidgetSettingActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 117;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            dialogInterface.dismiss();
            baseWidgetSettingActivity.finish();
            Unit unit = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        dialogInterface.dismiss();
        baseWidgetSettingActivity.finish();
        Unit unit2 = Unit.INSTANCE;
        int i3 = asBinder + 31;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            return unit2;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(BaseWidgetSettingActivity baseWidgetSettingActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 81;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        baseWidgetSettingActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 13;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onWarmupCompleted(BaseWidgetSettingActivity baseWidgetSettingActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1081265451, new Object[]{commonModule_setLeftEdgeTouchEnabled, true}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1081265446, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(baseWidgetSettingActivity.getString(R.string.base_widget_unsupported_region_message));
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, commonModule_setLeftEdgeTouchEnabled.onExtraCallback(new BaseWidgetSettingActivity$.ExternalSyntheticLambda1(baseWidgetSettingActivity))};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(new BaseWidgetSettingActivity$.ExternalSyntheticLambda2(baseWidgetSettingActivity));
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackDefault + 107;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 55 / 0;
        }
        return unit;
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
