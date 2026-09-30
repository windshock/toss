package im.toss.features.fx;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayout;
import im.toss.features.fx.FxCurrencyListActivity$ContinentAdapter$;
import im.toss.uikit.widget.grid.TdsListGridV1View;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinAdServiceImplc;
import o.AppMsgReceiver2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertByteArrayToFloatArray;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.ReactNativeFeatureFlagsCxxInterop;
import o.SetDetectableSize;
import o.URLVisitListener;
import o.access502;
import o.access8100;
import o.enableIOSViewClipToPaddingBox;
import o.enableRemoteParamsSwitch;
import o.exitAllPages;
import o.getWrite;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class FxCurrencyListActivity$onWarmupCompleted extends exitAllPages<Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder;
    final /* synthetic */ FxCurrencyListActivity IAuthTabCallback;
    private final String onNavigationEvent;
    private static char[] onTransact = {64976, 64981, 64967, 64970, 64982, 64963, 64961, 64966, 64989};
    private static char asInterface = 51242;

    public static /* synthetic */ Unit onExtraCallbackWithResult(FxCurrencyListActivity fxCurrencyListActivity, AppMsgReceiver2 appMsgReceiver2, URLVisitListener uRLVisitListener) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 73;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(fxCurrencyListActivity, appMsgReceiver2, uRLVisitListener);
        if (i3 != 0) {
            int i4 = 41 / 0;
        }
        int i5 = IAuthTabCallbackStub + 109;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(FxCurrencyListActivity$onWarmupCompleted fxCurrencyListActivity$onWarmupCompleted, AppMsgReceiver2 appMsgReceiver2, FxCurrencyListActivity$onExtraCallback fxCurrencyListActivity$onExtraCallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 61;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(fxCurrencyListActivity$onWarmupCompleted, appMsgReceiver2, fxCurrencyListActivity$onExtraCallback);
        int i4 = asBinder + 69;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static final class IAuthTabCallback implements Function1<Object, Boolean> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        public static final IAuthTabCallback onNavigationEvent = new IAuthTabCallback();
        private static int onWarmupCompleted = 1;

        static {
            int i = onWarmupCompleted + 65;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 79;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return onNavigationEvent(obj);
            }
            onNavigationEvent(obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final Boolean onNavigationEvent(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 5;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(obj, "");
            Boolean boolValueOf = Boolean.valueOf(obj instanceof URLVisitListener);
            int i4 = onExtraCallbackWithResult + 55;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return boolValueOf;
        }
    }

    public static final class onWarmupCompleted implements Function1<Object, Boolean> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        public static final onWarmupCompleted onExtraCallbackWithResult = new onWarmupCompleted();
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = IAuthTabCallback + 77;
            onWarmupCompleted = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 123;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Boolean boolOnNavigationEvent = onNavigationEvent(obj);
            if (i3 != 0) {
                int i4 = 89 / 0;
            }
            int i5 = onExtraCallback + 45;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return boolOnNavigationEvent;
        }

        public final Boolean onNavigationEvent(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 61;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(obj, "");
                return Boolean.valueOf(obj instanceof FxCurrencyListActivity$onExtraCallback);
            }
            Intrinsics.checkNotNullParameter(obj, "");
            Boolean.valueOf(obj instanceof FxCurrencyListActivity$onExtraCallback);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    public FxCurrencyListActivity$onWarmupCompleted(@NotNull FxCurrencyListActivity fxCurrencyListActivity, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.IAuthTabCallback = fxCurrencyListActivity;
        this.onNavigationEvent = str;
        onExtraCallbackWithResult(new access502.onNavigationEvent().onExtraCallbackWithResult(IAuthTabCallback.onNavigationEvent).onNavigationEvent(R.layout.row_fx_continent_item).onExtraCallback(new FxCurrencyListActivity$ContinentAdapter$.ExternalSyntheticLambda0(fxCurrencyListActivity)).IAuthTabCallback());
        onExtraCallbackWithResult(new access502.onNavigationEvent().onExtraCallbackWithResult(onWarmupCompleted.onExtraCallbackWithResult).onNavigationEvent(R.layout.row_fx_continent_footer_item).onExtraCallback(new FxCurrencyListActivity$ContinentAdapter$.ExternalSyntheticLambda1(this)).IAuthTabCallback());
    }

    public static Unit IAuthTabCallback(FxCurrencyListActivity fxCurrencyListActivity, enableRemoteParamsSwitch enableremoteparamsswitch, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 43;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new char[]{7, 3, 4, 7, 13880, 13880, 3, 7}, (byte) (KeyEvent.getDeadChar(0, 0) + 80), 8 - (ViewConfiguration.getTouchSlop() >> 8), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), FxCurrencyListActivity.onWarmupCompleted(fxCurrencyListActivity));
        Object[] objArr2 = new Object[1];
        a(new char[]{1, 6, 13837, 13837, 5, 7, 3, 6}, (byte) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 37), KeyEvent.getDeadChar(0, 0) + 8, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), enableremoteparamsswitch.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 63;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static void IAuthTabCallback(FxCurrencyListActivity fxCurrencyListActivity, enableRemoteParamsSwitch enableremoteparamsswitch, View view) throws Throwable {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1232453L, false, (String) null, (Map) null, new FxCurrencyListActivity$ContinentAdapter$.ExternalSyntheticLambda3(fxCurrencyListActivity, enableremoteparamsswitch), 14, (Object) null);
        AppLovinAdServiceImplc appLovinAdServiceImplcOnNavigationEvent = fxCurrencyListActivity.onNavigationEvent();
        String screenName = fxCurrencyListActivity.getScreenName();
        Object[] objArr = new Object[1];
        a(new char[]{0, 5, 3, 5}, (byte) (34 - (ViewConfiguration.getScrollBarSize() >> 8)), 4 - Gravity.getAbsoluteGravity(0, 0), objArr);
        Map mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback(((String) objArr[0]).intern(), enableremoteparamsswitch.onNavigationEvent())});
        Object[] objArr2 = new Object[1];
        a(new char[]{1, 6, 13837, 13837, 5, 7, 3, 6}, (byte) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 37), 7 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr2);
        appLovinAdServiceImplcOnNavigationEvent.onExtraCallbackWithResult(screenName, ((String) objArr2[0]).intern(), mapIAuthTabCallback);
        FxCurrencyListActivity.onNavigationEvent(fxCurrencyListActivity, enableremoteparamsswitch);
        int i2 = IAuthTabCallbackStub + 69;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0097 A[PHI: r3
      0x0097: PHI (r3v14 com.google.android.flexbox.FlexboxLayout) = (r3v13 com.google.android.flexbox.FlexboxLayout), (r3v18 com.google.android.flexbox.FlexboxLayout) binds: [B:24:0x0095, B:21:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009f A[PHI: r3
      0x009f: PHI (r3v15 com.google.android.flexbox.FlexboxLayout) = (r3v13 com.google.android.flexbox.FlexboxLayout), (r3v18 com.google.android.flexbox.FlexboxLayout) binds: [B:24:0x0095, B:21:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(FxCurrencyListActivity fxCurrencyListActivity, AppMsgReceiver2 appMsgReceiver2, URLVisitListener uRLVisitListener) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
        Intrinsics.checkNotNullParameter(uRLVisitListener, "");
        int i2 = R.id.txt_continent;
        TextView textView = (TextView) appMsgReceiver2.onWarmupCompleted().get(i2);
        if (textView == null) {
            textView = (TextView) ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent.findViewById(i2);
            if (textView != null) {
                int i3 = IAuthTabCallbackStub + 65;
                asBinder = i3 % 128;
                if (i3 % 2 != 0) {
                    appMsgReceiver2.onWarmupCompleted().put(i2, textView);
                    throw null;
                }
                appMsgReceiver2.onWarmupCompleted().put(i2, textView);
                int i4 = IAuthTabCallbackStub + 123;
                asBinder = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 % 4;
                }
            } else {
                appMsgReceiver2.onWarmupCompleted().remove(i2);
                int i6 = asBinder + 99;
                IAuthTabCallbackStub = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        if (textView != null) {
            textView.setText(uRLVisitListener.onExtraCallbackWithResult());
        }
        int i8 = R.id.wrapper_currencies;
        FlexboxLayout flexboxLayoutFindViewById = (FlexboxLayout) appMsgReceiver2.onWarmupCompleted().get(i8);
        if (flexboxLayoutFindViewById == null) {
            int i9 = asBinder + 49;
            IAuthTabCallbackStub = i9 % 128;
            if (i9 % 2 == 0) {
                flexboxLayoutFindViewById = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent.findViewById(i8);
                int i10 = 22 / 0;
                if (flexboxLayoutFindViewById != null) {
                    appMsgReceiver2.onWarmupCompleted().put(i8, flexboxLayoutFindViewById);
                } else {
                    appMsgReceiver2.onWarmupCompleted().remove(i8);
                }
            } else {
                flexboxLayoutFindViewById = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent.findViewById(i8);
                if (flexboxLayoutFindViewById != null) {
                }
            }
        }
        if (flexboxLayoutFindViewById != null) {
            int i11 = asBinder + 113;
            IAuthTabCallbackStub = i11 % 128;
            int i12 = i11 % 2;
            for (enableRemoteParamsSwitch enableremoteparamsswitch : uRLVisitListener.IAuthTabCallback()) {
                DisplayMetrics displayMetrics = flexboxLayoutFindViewById.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                int iOnNavigationEvent = varyMatches.onNavigationEvent(Float.valueOf((ReactNativeFeatureFlagsCxxInterop.onWarmupCompleted.onWarmupCompleted() - 40.0f) / 3.0f), displayMetrics);
                Context context = flexboxLayoutFindViewById.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                View tdsListGridV1View = new TdsListGridV1View(context);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iOnNavigationEvent, -2);
                DisplayMetrics displayMetrics2 = tdsListGridV1View.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
                int iOnNavigationEvent2 = varyMatches.onNavigationEvent(Float.valueOf(4.0f), displayMetrics2);
                layoutParams.setMargins(iOnNavigationEvent2, iOnNavigationEvent2, iOnNavigationEvent2, iOnNavigationEvent2);
                tdsListGridV1View.setLayoutParams(layoutParams);
                tdsListGridV1View.onWarmupCompleted(enableremoteparamsswitch.onExtraCallback() + " " + enableremoteparamsswitch.onExtraCallbackWithResult(), enableremoteparamsswitch.onWarmupCompleted());
                enableIOSViewClipToPaddingBox.IAuthTabCallback.IAuthTabCallback(tdsListGridV1View, new FxCurrencyListActivity$ContinentAdapter$.ExternalSyntheticLambda2(fxCurrencyListActivity, enableremoteparamsswitch));
                flexboxLayoutFindViewById.addView(tdsListGridV1View);
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(FxCurrencyListActivity$onWarmupCompleted fxCurrencyListActivity$onWarmupCompleted, AppMsgReceiver2 appMsgReceiver2, FxCurrencyListActivity$onExtraCallback fxCurrencyListActivity$onExtraCallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
        Intrinsics.checkNotNullParameter(fxCurrencyListActivity$onExtraCallback, "");
        int i2 = R.id.fx_desc;
        TextView textView = (TextView) appMsgReceiver2.onWarmupCompleted().get(i2);
        if (textView == null) {
            textView = (TextView) ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent.findViewById(i2);
            if (textView != null) {
                appMsgReceiver2.onWarmupCompleted().put(i2, textView);
            } else {
                appMsgReceiver2.onWarmupCompleted().remove(i2);
                int i3 = asBinder + 21;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        if (textView != null) {
            int i5 = asBinder + 41;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            textView.setText(fxCurrencyListActivity$onWarmupCompleted.onNavigationEvent);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onTransact;
        float f = 0.0f;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = $10 + 87;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > f ? 1 : (ViewConfiguration.getScrollFriction() == f ? 0 : -1)) - 1), 26 - (ViewConfiguration.getWindowTouchSlop() >> 8), 23139 - TextUtils.getCapsMode("", 0, 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i6++;
                    f = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i7 = $10 + 99;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(asInterface)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.getDefaultSize(0, 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 26, 23139 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            int i9 = $11 + 21;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                int i11 = $10 + 17;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent % 0];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        obj = obj2;
                    } else {
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Gravity.getAbsoluteGravity(0, 0) + 24824), 73 - Process.getGidForName(""), 8136 - AndroidCharacter.getMirror('0'), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), Color.blue(0) + 30, 19488 - ExpandableListView.getPackedPositionGroup(0L), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i12];
                        } else {
                            obj = null;
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                int i13 = $10 + 45;
                                $11 = i13 % 128;
                                int i14 = i13 % 2;
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i15 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i16 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i15];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i16];
                            } else {
                                int i17 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i18 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i17];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i18];
                            }
                        }
                    }
                } else {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
            }
        }
        for (int i19 = 0; i19 < i; i19++) {
            cArr4[i19] = (char) (cArr4[i19] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }
}
