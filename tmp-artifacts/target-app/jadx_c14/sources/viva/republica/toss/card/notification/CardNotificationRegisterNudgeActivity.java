package viva.republica.toss.card.notification;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.airbnb.lottie.LottieAnimationView;
import im.toss.base.BaseActivity;
import im.toss.tds.view.component.atom.text.Typography5;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.API_GetLastDebugError;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.IPostMessageServiceStubProxy;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access8100;
import o.getWrite;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.card.register.SchemeCardRegisterActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CardNotificationRegisterNudgeActivity extends BaseActivity {
    public static final onExtraCallback Companion = new onExtraCallback(null);
    public static final int IAuthTabCallbackStub = 8;
    private final Lazy IAuthTabCallbackDefault = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.card.notification.CardNotificationRegisterNudgeActivity$$ExternalSyntheticLambda0
        public final Object invoke() {
            return Integer.valueOf(CardNotificationRegisterNudgeActivity.onWarmupCompleted(this.f$0));
        }
    });
    private final Lazy asBinder = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.card.notification.CardNotificationRegisterNudgeActivity$$ExternalSyntheticLambda1
        public final Object invoke() {
            return CardNotificationRegisterNudgeActivity.IAuthTabCallback(this.f$0);
        }
    });
    private final Lazy onTransact = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new IAuthTabCallback(this));

    public long getScreenId() {
        return 1010399L;
    }

    public static final class IAuthTabCallback implements Function0<API_GetLastDebugError> {
        final /* synthetic */ Activity onNavigationEvent;

        public IAuthTabCallback(Activity activity) {
            this.onNavigationEvent = activity;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final API_GetLastDebugError invoke() {
            LayoutInflater layoutInflater = this.onNavigationEvent.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return API_GetLastDebugError.onNavigationEvent(layoutInflater);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int onNavigationEvent() {
        return ((Number) this.IAuthTabCallbackDefault.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final int onWarmupCompleted(CardNotificationRegisterNudgeActivity cardNotificationRegisterNudgeActivity) {
        return cardNotificationRegisterNudgeActivity.getIntent().getIntExtra("cardCode", 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final String IAuthTabCallback(CardNotificationRegisterNudgeActivity cardNotificationRegisterNudgeActivity) {
        String stringExtra = cardNotificationRegisterNudgeActivity.getIntent().getStringExtra("cardVendorName");
        return stringExtra == null ? "" : stringExtra;
    }

    private final String setEngagementSignalsCallback() {
        return (String) this.asBinder.getValue();
    }

    public Map<String, Object> getScreenParams() {
        return access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback("card_vendor_name", setEngagementSignalsCallback())});
    }

    private final API_GetLastDebugError IAuthTabCallback() {
        Object value = this.onTransact.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (API_GetLastDebugError) value;
    }

    private final LottieAnimationView ICustomTabsServiceStub() {
        LottieAnimationView lottieAnimationView = IAuthTabCallback().onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
        return lottieAnimationView;
    }

    private final Typography5 validateRelationship() {
        Typography5 typography5 = IAuthTabCallback().onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(typography5, "");
        return typography5;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(IAuthTabCallback().getRoot());
        ICustomTabsServiceDefault();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ICustomTabsServiceDefault() {
        IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.onNavigationEvent(true);
        }
        ICustomTabsServiceStub().addAnimatorListener(new onNavigationEvent());
        validateRelationship().setText(getString(R.string.app_card_notification___9c7b971a57, setEngagementSignalsCallback()));
    }

    public static final class onNavigationEvent implements Animator.AnimatorListener {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 1;
        private static int[] onNavigationEvent = {-1572283046, 737484428, -306831666, 1801914809, -797431522, 1012832141, -1304680568, -967856974, -834250529, 1270293682, -1525826081, 334191274, -354651144, -270444316, -445583053, 179442852, -217363324, 65142618};
        private static int onWarmupCompleted;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 95;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(animator, "");
            if (i3 != 0) {
                throw null;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 27;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(animator, "");
            if (i3 == 0) {
                throw null;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 105;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(animator, "");
            if (i3 == 0) {
                int i4 = 47 / 0;
            }
        }

        onNavigationEvent() {
        }

        /* JADX WARN: Type inference failed for: r2v5, types: [android.content.Context, viva.republica.toss.card.notification.CardNotificationRegisterNudgeActivity] */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 79;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(animator, "");
            ?? r2 = CardNotificationRegisterNudgeActivity.this;
            SchemeCardRegisterActivity.onNavigationEvent onnavigationevent = SchemeCardRegisterActivity.Companion;
            int iOnNavigationEvent = r2.onNavigationEvent();
            Object[] objArr = new Object[1];
            a(new int[]{1012081445, 641592799, 371981443, -285385341, -456688405, 793031482, -125394243, 1854604278, 390062825, 1188673493, -1460925943, 828205681, -931943090, 1388354695, 1505317534, -1675418828}, 29 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr);
            r2.startActivity(SchemeCardRegisterActivity.onNavigationEvent.onWarmupCompleted(onnavigationevent, r2, iOnNavigationEvent, 0L, "cardNotification", ((String) objArr[0]).intern(), false, null, null, null, 100, null));
            CardNotificationRegisterNudgeActivity.this.finish();
            int i4 = onWarmupCompleted + 35;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = onNavigationEvent;
            int i4 = -1469660336;
            char c = '0';
            int i5 = 1;
            int i6 = 0;
            if (iArr2 != null) {
                int i7 = $10 + 47;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i9 = 0;
                while (i9 < length) {
                    int i10 = $10 + 61;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(iArr2[i9])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), TextUtils.lastIndexOf("", c) + 73, 8848 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -1725547072, false, "h", new Class[]{Integer.TYPE});
                            }
                            iArr3[i9] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                            i9 >>>= 1;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        Object[] objArr3 = {Integer.valueOf(iArr2[i9])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(0), (KeyEvent.getMaxKeyCode() >> 16) + 72, View.MeasureSpec.makeMeasureSpec(0, 0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr3[i9] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        i9++;
                    }
                    c = '0';
                }
                iArr2 = iArr3;
            }
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = onNavigationEvent;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i11 = $10 + 71;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                int i13 = 0;
                while (i13 < length3) {
                    int i14 = $10 + 75;
                    $11 = i14 % 128;
                    if (i14 % 2 == 0) {
                        try {
                            Object[] objArr4 = new Object[i5];
                            objArr4[i6] = Integer.valueOf(iArr5[i13]);
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter("", i6), 71 - TextUtils.lastIndexOf("", '0'), 8847 - TextUtils.lastIndexOf("", '0', i6, i6), -1725547072, false, "h", new Class[]{Integer.TYPE});
                            }
                            iArr6[i13] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                            i13 %= 0;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } else {
                        try {
                            Object[] objArr5 = {Integer.valueOf(iArr5[i13])};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 72, 8847 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                            }
                            iArr6[i13] = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            i13++;
                        } catch (Throwable th3) {
                            Throwable cause3 = th3.getCause();
                            if (cause3 == null) {
                                throw th3;
                            }
                            throw cause3;
                        }
                    }
                    i4 = -1469660336;
                    i5 = 1;
                    i6 = 0;
                }
                int i15 = $10 + 87;
                $11 = i15 % 128;
                if (i15 % 2 == 0) {
                    int i16 = 4 % 5;
                }
                iArr5 = iArr6;
                i2 = 0;
            } else {
                i2 = 0;
            }
            System.arraycopy(iArr5, i2, iArr4, i2, length2);
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                cArr[i2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                int i17 = 0;
                for (int i18 = 16; i17 < i18; i18 = 16) {
                    int i19 = $10 + 111;
                    $11 = i19 % 128;
                    if (i19 % 2 == 0) {
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i17];
                        Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                        Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                        if (objOnExtraCallback5 == null) {
                            objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 39 - Color.argb(0, 0, 0, 0), 10301 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                        i17 += 41;
                    } else {
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i17];
                        Object[] objArr7 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                        Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                        if (objOnExtraCallback6 == null) {
                            objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - View.MeasureSpec.getSize(0)), 39 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), KeyEvent.keyCodeFromString("") + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objOnExtraCallback6).invoke(null, objArr7)).intValue();
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue2;
                        i17++;
                    }
                }
                int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i20;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
                int i21 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                int i22 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
                cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
                cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
                Object[] objArr8 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
                if (objOnExtraCallback7 == null) {
                    objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetAfter("", 0) + 4033), TextUtils.lastIndexOf("", '0', 0, 0) + 79, 7398 - (ViewConfiguration.getEdgeSlop() >> 16), 1888082611, false, "f", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback7).invoke(null, objArr8);
                i2 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final Intent onNavigationEvent(@NotNull Context context, @Nullable Integer num, @Nullable String str) {
            Intrinsics.checkNotNullParameter(context, "");
            Intent intent = new Intent(context, (Class<?>) CardNotificationRegisterNudgeActivity.class);
            if (num != null) {
                intent.putExtra("cardCode", num.intValue());
            }
            if (str != null) {
                intent.putExtra("cardVendorName", str);
            }
            return intent;
        }
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
