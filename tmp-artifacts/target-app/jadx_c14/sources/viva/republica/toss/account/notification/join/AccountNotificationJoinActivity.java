package viva.republica.toss.account.notification.join;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.core.webkit.TossCoreWebView;
import im.toss.core.webkit.WebViewContentOwner;
import im.toss.features.payment.ui.offline.compose.screen.TossPlaceTableOrderScreenKt$;
import im.toss.uikit.widget.Toolbar;
import java.lang.reflect.Method;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o.ASN1OutputStream;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.IPostMessageServiceStubProxy;
import o.RightClickGesturesKtonRightClickDown2;
import o.Ripple_androidKt;
import o.S2SRewardedVideoAdExtendedListener;
import o.SessionTrackerb;
import o.TimelineExternalSyntheticLambda1;
import o.TimerCallBack;
import o.TombstoneProtosMemoryMappingBuilder;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.UST_UTIL_HexStringToBin;
import o.extractFaceStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AccountNotificationJoinActivity extends Hilt_AccountNotificationJoinActivity implements TimerCallBack {
    public static final IAuthTabCallback Companion;
    public static final int IAuthTabCallbackDefault;
    private static int IAuthTabCallback_Parcel;
    private static long asInterface;
    private static char getInterfaceDescriptor;
    private static int writeTypedObject;

    @Inject
    public SessionTrackerb tossRouter;
    private static final byte[] $$a = {2, 77, 55, -86};
    private static final int $$b = 126;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int access100 = 0;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int access000 = 1;
    private final Lazy IAuthTabCallbackStub = new RightClickGesturesKtonRightClickDown2(Reflection.getOrCreateKotlinClass(ASN1OutputStream.class), new onWarmupCompleted(this), new onExtraCallback(this), new onExtraCallbackWithResult(null, this));
    private final Lazy onTransact = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.account.notification.join.AccountNotificationJoinActivity$$ExternalSyntheticLambda2
        public final Object invoke() {
            return AccountNotificationJoinActivity.IAuthTabCallback(this.f$0);
        }
    });
    private final Lazy asBinder = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onNavigationEvent(this));

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r7, int r8, byte r9) {
        /*
            int r8 = r8 + 4
            int r9 = r9 + 109
            byte[] r0 = viva.republica.toss.account.notification.join.AccountNotificationJoinActivity.$$a
            int r7 = r7 * 3
            int r7 = 1 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r9 = r8
            r5 = r2
            goto L28
        L13:
            r3 = r2
        L14:
            int r8 = r8 + 1
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r6
        L28:
            int r8 = r8 + r3
            r3 = r5
            r6 = r9
            r9 = r8
            r8 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.notification.join.AccountNotificationJoinActivity.$$c(short, int, byte):java.lang.String");
    }

    static {
        writeTypedObject = 1;
        setEngagementSignalsCallback();
        Companion = new IAuthTabCallback(null);
        IAuthTabCallbackDefault = 8;
        int i = access100 + 73;
        writeTypedObject = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Type inference failed for: r8v7, types: [android.content.Context, viva.republica.toss.account.notification.join.AccountNotificationJoinActivity] */
    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i;
        int i8 = ~i6;
        int i9 = ~(i7 | i8);
        int i10 = i7 | i3;
        int i11 = (~i10) | i9;
        int i12 = ~i3;
        int i13 = (~(i6 | i10)) | (~(i8 | i12)) | (~(i12 | i));
        int i14 = i + i3 + i5 + ((-1017789379) * i2) + (461141949 * i4);
        int i15 = i14 * i14;
        int i16 = ((-551480932) * i) + 431816704 + ((-1613042074) * i3) + ((-1061561142) * i11) + (i13 * (-1616703077)) + ((-1616703077) * i9) + (1065222144 * i5) + ((-1727660032) * i2) + (1912995840 * i4) + ((-1005256704) * i15);
        int i17 = ((i * (-1063000396)) - 360994079) + (i3 * (-1063001374)) + (i11 * (-978)) + (i13 * 489) + (i9 * 489) + (i5 * (-1063000885)) + (i2 * (-90181537)) + (i4 * (-1548859681)) + (i15 * 816250880);
        if (i16 + (i17 * i17 * 1493368832) == 1) {
            return onExtraCallback(objArr);
        }
        final ?? r8 = (AccountNotificationJoinActivity) objArr[0];
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[1];
        int i18 = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(r8.getString(R.string.app_account_notification_join___d07d6a3b3a));
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, new Object[]{commonModule_setLeftEdgeTouchEnabled, commonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(new Function1() { // from class: viva.republica.toss.account.notification.join.AccountNotificationJoinActivity$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return AccountNotificationJoinActivity.onNavigationEvent(this.f$0, (DialogInterface) obj);
            }
        })}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i19 = access000 + 33;
        IAuthTabCallbackStubProxy = i19 % 128;
        int i20 = i19 % 2;
        return unit;
    }

    public static /* synthetic */ extractFaceStatus IAuthTabCallback(AccountNotificationJoinActivity accountNotificationJoinActivity) {
        int i = 2 % 2;
        int i2 = access000 + 125;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        extractFaceStatus extractfacestatusOnExtraCallbackWithResult = onExtraCallbackWithResult(accountNotificationJoinActivity);
        int i4 = access000 + 11;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return extractfacestatusOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(AccountNotificationJoinActivity accountNotificationJoinActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = access000 + 37;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(accountNotificationJoinActivity, dialogInterface);
        int i4 = IAuthTabCallbackStubProxy + 45;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onWarmupCompleted(AccountNotificationJoinActivity accountNotificationJoinActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = access000 + 95;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        int iOnWarmupCompleted2 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        Unit unit = (Unit) IAuthTabCallback(-1769451710, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 1769451710, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{accountNotificationJoinActivity, commonModule_setLeftEdgeTouchEnabled}, iOnWarmupCompleted);
        int i4 = access000 + 117;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 75;
        int i3 = i2 % 128;
        access000 = i3;
        if (i2 % 2 == 0) {
            int i4 = 68 / 0;
        }
        int i5 = i3 + 77;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return -1L;
    }

    public static final class onNavigationEvent implements Function0<UST_UTIL_HexStringToBin> {
        final /* synthetic */ Activity onWarmupCompleted;

        public onNavigationEvent(Activity activity) {
            this.onWarmupCompleted = activity;
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final UST_UTIL_HexStringToBin invoke() {
            LayoutInflater layoutInflater = this.onWarmupCompleted.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return UST_UTIL_HexStringToBin.onExtraCallback(layoutInflater);
        }
    }

    public /* bridge */ void onExtraCallbackWithResult(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, @Nullable MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 33;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.onExtraCallbackWithResult(str, str2, str3, str4, onMenuItemClickListener);
        if (i3 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if ((r1 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        r1 = r1 + 5;
        viva.republica.toss.account.notification.join.AccountNotificationJoinActivity.IAuthTabCallbackStubProxy = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.SessionTrackerb IAuthTabCallback() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.account.notification.join.AccountNotificationJoinActivity.access000
            int r2 = r1 + 105
            int r3 = r2 % 128
            viva.republica.toss.account.notification.join.AccountNotificationJoinActivity.IAuthTabCallbackStubProxy = r3
            int r2 = r2 % r0
            r3 = 0
            if (r2 == 0) goto L18
            o.SessionTrackerb r2 = r5.tossRouter
            r4 = 86
            int r4 = r4 / 0
            if (r2 == 0) goto L27
            goto L1c
        L18:
            o.SessionTrackerb r2 = r5.tossRouter
            if (r2 == 0) goto L27
        L1c:
            int r1 = r1 + 5
            int r4 = r1 % 128
            viva.republica.toss.account.notification.join.AccountNotificationJoinActivity.IAuthTabCallbackStubProxy = r4
            int r1 = r1 % r0
            if (r1 != 0) goto L26
            return r2
        L26:
            throw r3
        L27:
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.notification.join.AccountNotificationJoinActivity.IAuthTabCallback():o.SessionTrackerb");
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        AccountNotificationJoinActivity accountNotificationJoinActivity = (AccountNotificationJoinActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 63;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        ASN1OutputStream aSN1OutputStream = (ASN1OutputStream) accountNotificationJoinActivity.IAuthTabCallbackStub.getValue();
        if (i3 == 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackStubProxy + 59;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return aSN1OutputStream;
    }

    private final extractFaceStatus ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 67;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.onTransact.getValue();
        if (i3 != 0) {
            return (extractFaceStatus) value;
        }
        int i4 = 45 / 0;
        return (extractFaceStatus) value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final extractFaceStatus onExtraCallbackWithResult(AccountNotificationJoinActivity accountNotificationJoinActivity) {
        int i = 2 % 2;
        extractFaceStatus extractfacestatus = new extractFaceStatus(accountNotificationJoinActivity, false, 2, (DefaultConstructorMarker) null);
        int i2 = IAuthTabCallbackStubProxy + 115;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        return extractfacestatus;
    }

    private final UST_UTIL_HexStringToBin validateRelationship() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 23;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            Object value = this.asBinder.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            return (UST_UTIL_HexStringToBin) value;
        }
        Object value2 = this.asBinder.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "");
        int i3 = 55 / 0;
        return (UST_UTIL_HexStringToBin) value2;
    }

    private final Toolbar ICustomTabsService_Parcel() {
        int i = 2 % 2;
        int i2 = access000 + 51;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullExpressionValue(validateRelationship().onExtraCallback, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Toolbar toolbar = validateRelationship().onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(toolbar, "");
        int i3 = IAuthTabCallbackStubProxy + 39;
        access000 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 73 / 0;
        }
        return toolbar;
    }

    private static final Unit onWarmupCompleted(AccountNotificationJoinActivity accountNotificationJoinActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = access000 + 45;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        accountNotificationJoinActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 13;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 17 / 0;
        }
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01f5  */
    @Override // viva.republica.toss.account.notification.join.Hilt_AccountNotificationJoinActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.notification.join.AccountNotificationJoinActivity.onCreate(android.os.Bundle):void");
    }

    public void onSaveInstanceState(@NotNull Bundle bundle) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(bundle, "");
        super.onSaveInstanceState(bundle);
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        bundle.putInt("bankCode", ((ASN1OutputStream) IAuthTabCallback(229493146, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -229493145, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted)).IAuthTabCallback());
        int iOnWarmupCompleted2 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListenerOnExtraCallback = ((ASN1OutputStream) IAuthTabCallback(229493146, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -229493145, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted2)).onExtraCallback();
        if (s2SRewardedVideoAdExtendedListenerOnExtraCallback != null) {
            bundle.putParcelable("info", s2SRewardedVideoAdExtendedListenerOnExtraCallback);
            int i2 = IAuthTabCallbackStubProxy + 57;
            access000 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 5 % 5;
            }
        }
        int iOnWarmupCompleted3 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        String strIAuthTabCallback_Parcel = ((ASN1OutputStream) IAuthTabCallback(229493146, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -229493145, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted3)).IAuthTabCallback_Parcel();
        if (strIAuthTabCallback_Parcel != null) {
            int i4 = access000 + 61;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            a((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132024749).substring(0, 4).length() - 4), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 489908158, new char[]{2571, 31748, 2793, 43238, 7579, 8792, 51825, 7195, 59729, 39799, 27423}, new char[]{0, 0, 0, 0}, new char[]{21898, 52376, 41186, 3897}, objArr);
            bundle.putString(((String) objArr[0]).intern(), strIAuthTabCallback_Parcel);
        }
        int iOnWarmupCompleted4 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        String interfaceDescriptor = ((ASN1OutputStream) IAuthTabCallback(229493146, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -229493145, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted4)).getInterfaceDescriptor();
        if (interfaceDescriptor != null) {
            int i6 = access000 + 11;
            IAuthTabCallbackStubProxy = i6 % 128;
            int i7 = i6 % 2;
            Object[] objArr2 = new Object[1];
            a((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022848).substring(0, 44).length() - 44), ViewConfiguration.getScrollBarSize() >> 8, new char[]{16756, 38468, 58933, 19627, 56177, 26620, 47568, 14712}, new char[]{0, 0, 0, 0}, new char[]{303, 26913, 21340, 52441}, objArr2);
            bundle.putString(((String) objArr2[0]).intern(), interfaceDescriptor);
        }
    }

    public static final class onExtraCallback implements Function0<ViewModelProvider.onWarmupCompleted> {
        final /* synthetic */ ComponentActivity onExtraCallbackWithResult;

        public onExtraCallback(ComponentActivity componentActivity) {
            this.onExtraCallbackWithResult = componentActivity;
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.onWarmupCompleted invoke() {
            return this.onExtraCallbackWithResult.getDefaultViewModelProviderFactory();
        }
    }

    public static final class onWarmupCompleted implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        final /* synthetic */ ComponentActivity IAuthTabCallback;

        public onWarmupCompleted(ComponentActivity componentActivity) {
            this.IAuthTabCallback = componentActivity;
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 invoke() {
            return this.IAuthTabCallback.getViewModelStore();
        }
    }

    public static final class onExtraCallbackWithResult implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        final /* synthetic */ ComponentActivity onExtraCallback;
        final /* synthetic */ Function0 onWarmupCompleted;

        public onExtraCallbackWithResult(Function0 function0, ComponentActivity componentActivity) {
            this.onWarmupCompleted = function0;
            this.onExtraCallback = componentActivity;
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 invoke() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            Function0 function0 = this.onWarmupCompleted;
            return (function0 == null || (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) == null) ? this.onExtraCallback.getDefaultViewModelCreationExtras() : androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
        }
    }

    private final void IEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 35;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            setSupportActionBar(ICustomTabsService_Parcel());
            IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.onNavigationEvent(true);
                int i3 = access000 + 121;
                IAuthTabCallbackStubProxy = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            return;
        }
        setSupportActionBar(ICustomTabsService_Parcel());
        getSupportActionBar();
        throw null;
    }

    private final Ripple_androidKt updateVisuals() {
        int i = 2 % 2;
        int i2 = access000 + 49;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Ripple_androidKt ripple_androidKtFindFragmentById = getSupportFragmentManager().findFragmentById(R.id.navHostFragment);
        if (ripple_androidKtFindFragmentById instanceof Ripple_androidKt) {
            int i4 = IAuthTabCallbackStubProxy + 73;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            return ripple_androidKtFindFragmentById;
        }
        int i6 = IAuthTabCallbackStubProxy + 93;
        access000 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 21 / 0;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final im.toss.base.BaseFragment ICustomTabsServiceStub() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.account.notification.join.AccountNotificationJoinActivity.IAuthTabCallbackStubProxy
            int r1 = r1 + 69
            int r2 = r1 % 128
            viva.republica.toss.account.notification.join.AccountNotificationJoinActivity.access000 = r2
            int r1 = r1 % r0
            o.Ripple_androidKt r1 = r5.updateVisuals()
            r2 = 0
            if (r1 == 0) goto L36
            int r3 = viva.republica.toss.account.notification.join.AccountNotificationJoinActivity.IAuthTabCallbackStubProxy
            int r3 = r3 + 113
            int r4 = r3 % 128
            viva.republica.toss.account.notification.join.AccountNotificationJoinActivity.access000 = r4
            int r3 = r3 % r0
            if (r3 == 0) goto L32
            o.FlowMeasureLazyPolicyExternalSyntheticLambda3 r0 = r1.getChildFragmentManager()
            if (r0 == 0) goto L36
            java.util.List r0 = r0.onActivityLayout()
            if (r0 == 0) goto L36
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            goto L37
        L32:
            r1.getChildFragmentManager()
            throw r2
        L36:
            r0 = r2
        L37:
            boolean r1 = r0 instanceof im.toss.base.BaseFragment
            if (r1 == 0) goto L3e
            im.toss.base.BaseFragment r0 = (im.toss.base.BaseFragment) r0
            return r0
        L3e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.notification.join.AccountNotificationJoinActivity.ICustomTabsServiceStub():im.toss.base.BaseFragment");
    }

    public static final class IAuthTabCallback {
        private static final byte[] $$a = {107, -21, -54, -113};
        private static final int $$b = 19;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static char[] onNavigationEvent = {60838, 24838, 62686, 19352, 57210, 21026, 41469, 13473, 34873, 8137, 37534, 60838, 24838, 62684, 19348, 57210, 21045, 41467, 13479};
        private static long onWarmupCompleted = -3353678696081628829L;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Type inference failed for: r8v2, types: [int] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(byte r6, int r7, byte r8) {
            /*
                int r6 = r6 * 3
                int r6 = 4 - r6
                int r7 = r7 * 4
                int r0 = r7 + 1
                byte[] r1 = viva.republica.toss.account.notification.join.AccountNotificationJoinActivity.IAuthTabCallback.$$a
                int r8 = r8 * 3
                int r8 = 97 - r8
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L17
                r4 = r8
                r3 = r2
                r8 = r6
                goto L2a
            L17:
                r3 = r2
                r5 = r8
                r8 = r6
                r6 = r5
            L1b:
                byte r4 = (byte) r6
                r0[r3] = r4
                if (r3 != r7) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L26:
                int r3 = r3 + 1
                r4 = r1[r8]
            L2a:
                int r6 = r6 + r4
                int r8 = r8 + 1
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.notification.join.AccountNotificationJoinActivity.IAuthTabCallback.$$c(byte, int, byte):java.lang.String");
        }

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
            long[] jArr = new long[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                int i4 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(onNavigationEvent[i + i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.green(0) + 59697), 17 - Color.blue(0), 10972 - ((byte) KeyEvent.getModifierMetaStateMask()), 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(onWarmupCompleted), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - (KeyEvent.getMaxKeyCode() >> 16)), AndroidCharacter.getMirror('0') - 17, 20220 - (ViewConfiguration.getLongPressTimeout() >> 16), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i4] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (Process.myTid() >> 22)), ExpandableListView.getPackedPositionGroup(0L) + 44, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1493, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    int i5 = $10 + 89;
                    $11 = i5 % 128;
                    int i6 = i5 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr = new char[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                int i7 = $11 + 59;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                    try {
                        Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                        if (objOnExtraCallback4 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49122 - TextUtils.indexOf((CharSequence) "", '0', 0)), 44 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (-16775722) - Color.rgb(0, 0, 0), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback4).invoke(null, objArr5);
                        int i8 = 46 / 0;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                    Object[] objArr6 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 49122), 44 - KeyEvent.keyCodeFromString(""), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1493, -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                }
            }
            objArr[0] = new String(cArr);
        }

        private IAuthTabCallback() {
        }

        public final Intent IAuthTabCallback(@NotNull Context context, int i, @NotNull S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener, @Nullable String str, @Nullable String str2, boolean z) throws Throwable {
            Object obj;
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(s2SRewardedVideoAdExtendedListener, "");
            Intent intent = new Intent(context, (Class<?>) AccountNotificationJoinActivity.class);
            intent.putExtra("bankCode", i);
            intent.putExtra("info", s2SRewardedVideoAdExtendedListener);
            if (str != null) {
                Object[] objArr = new Object[1];
                a(ViewConfiguration.getTapTimeout() >> 16, 11 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) ((-1) - ImageFormat.getBitsPerPixel(0)), objArr);
                intent.putExtra(((String) objArr[0]).intern(), str);
                int i3 = onExtraCallback + 17;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
            }
            intent.putExtra("fromAccountNotification", z);
            if (str2 != null) {
                int i5 = IAuthTabCallback + 27;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    Object[] objArr2 = new Object[1];
                    a(17 - (ViewConfiguration.getKeyRepeatDelay() % 115), 81 << (ViewConfiguration.getJumpTapTimeout() % 64), (char) (TypedValue.complexToFloat(0) > 2.0f ? 1 : (TypedValue.complexToFloat(0) == 2.0f ? 0 : -1)), objArr2);
                    obj = objArr2[0];
                } else {
                    Object[] objArr3 = new Object[1];
                    a((ViewConfiguration.getKeyRepeatDelay() >> 16) + 11, 8 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr3);
                    obj = objArr3[0];
                }
                intent.putExtra(((String) obj).intern(), str2);
                int i6 = IAuthTabCallback + 47;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
            }
            int i8 = onExtraCallback + 123;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            return intent;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean bg_() {
        /*
            r18 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.account.notification.join.AccountNotificationJoinActivity.access000
            int r1 = r1 + 91
            int r2 = r1 % 128
            viva.republica.toss.account.notification.join.AccountNotificationJoinActivity.IAuthTabCallbackStubProxy = r2
            int r1 = r1 % r0
            im.toss.base.BaseFragment r1 = r18.ICustomTabsServiceStub()
            boolean r2 = r1 instanceof viva.republica.toss.account.notification.join.AccountNotificationBankWebFragment
            r3 = 1
            if (r2 == 0) goto L25
            im.toss.base.BaseFragment r0 = r18.ICustomTabsServiceStub()
            if (r0 == 0) goto L99
            boolean r0 = r0.onBackPressed()
            if (r0 != r3) goto L99
            r2 = r18
            goto La1
        L25:
            boolean r1 = r1 instanceof viva.republica.toss.account.notification.join.AccountNotificationJoinCompleteFragment
            if (r1 == 0) goto L99
            r1 = -1
            r2 = r18
            r2.setResult(r1)
            java.lang.Object[] r9 = new java.lang.Object[]{r18}
            int r10 = im.toss.features.payment.ui.offline.compose.screen.TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted()
            int r8 = im.toss.features.payment.ui.offline.compose.screen.TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted()
            int r5 = im.toss.features.payment.ui.offline.compose.screen.TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted()
            int r7 = im.toss.features.payment.ui.offline.compose.screen.TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted()
            r11 = 229493146(0xdadc99a, float:1.0710482E-30)
            r13 = -229493145(0xfffffffff2523667, float:-4.1636877E30)
            r4 = r11
            r6 = r13
            java.lang.Object r1 = IAuthTabCallback(r4, r5, r6, r7, r8, r9, r10)
            o.ASN1OutputStream r1 = (o.ASN1OutputStream) r1
            java.lang.String r1 = r1.IAuthTabCallback_Parcel()
            if (r1 == 0) goto L95
            int r4 = viva.republica.toss.account.notification.join.AccountNotificationJoinActivity.access000
            int r4 = r4 + 39
            int r5 = r4 % 128
            viva.republica.toss.account.notification.join.AccountNotificationJoinActivity.IAuthTabCallbackStubProxy = r5
            int r4 = r4 % r0
            boolean r0 = kotlin.text.StringsKt.isBlank(r1)
            if (r0 == 0) goto L67
            goto L95
        L67:
            o.SessionTrackerb r4 = r18.IAuthTabCallback()
            java.lang.Object[] r16 = new java.lang.Object[]{r18}
            int r17 = im.toss.features.payment.ui.offline.compose.screen.TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted()
            int r15 = im.toss.features.payment.ui.offline.compose.screen.TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted()
            int r12 = im.toss.features.payment.ui.offline.compose.screen.TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted()
            int r14 = im.toss.features.payment.ui.offline.compose.screen.TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted()
            java.lang.Object r0 = IAuthTabCallback(r11, r12, r13, r14, r15, r16, r17)
            o.ASN1OutputStream r0 = (o.ASN1OutputStream) r0
            java.lang.String r6 = r0.IAuthTabCallback_Parcel()
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 60
            r12 = 0
            r5 = r18
            o.SessionTrackerb.IAuthTabCallback(r4, r5, r6, r7, r8, r9, r10, r11, r12)
        L95:
            r18.finish()
            goto La1
        L99:
            r2 = r18
            boolean r0 = super.bg_()
            if (r0 == 0) goto La2
        La1:
            return r3
        La2:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.notification.join.AccountNotificationJoinActivity.bg_():boolean");
    }

    public void onExtraCallback(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, @Nullable MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        int i = 2 % 2;
        int i2 = access000 + 55;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            ICustomTabsServiceDefault().onExtraCallback(str, str2, str3, str4, onMenuItemClickListener);
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            ICustomTabsServiceDefault().onExtraCallback(str, str2, str3, str4, onMenuItemClickListener);
            int i3 = 60 / 0;
        }
    }

    public void onExtraCallback(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable String str5, @Nullable MenuItem.OnMenuItemClickListener onMenuItemClickListener, @Nullable MenuItem.OnMenuItemClickListener onMenuItemClickListener2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 107;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            ICustomTabsServiceDefault().onWarmupCompleted(str, str2, str3, str4, str5, onMenuItemClickListener, onMenuItemClickListener2);
            return;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        ICustomTabsServiceDefault().onWarmupCompleted(str, str2, str3, str4, str5, onMenuItemClickListener, onMenuItemClickListener2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void aS_() {
        int i = 2 % 2;
        int i2 = access000 + 75;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        ICustomTabsServiceDefault().onExtraCallback();
        int i4 = access000 + 15;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public boolean onCreateOptionsMenu(@NotNull Menu menu) {
        int i = 2 % 2;
        int i2 = access000 + 111;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(menu, "");
            extractFaceStatus extractfacestatusICustomTabsServiceDefault = ICustomTabsServiceDefault();
            MenuInflater menuInflater = getMenuInflater();
            Intrinsics.checkNotNullExpressionValue(menuInflater, "");
            extractfacestatusICustomTabsServiceDefault.IAuthTabCallback(menuInflater, menu);
            return false;
        }
        Intrinsics.checkNotNullParameter(menu, "");
        extractFaceStatus extractfacestatusICustomTabsServiceDefault2 = ICustomTabsServiceDefault();
        MenuInflater menuInflater2 = getMenuInflater();
        Intrinsics.checkNotNullExpressionValue(menuInflater2, "");
        extractfacestatusICustomTabsServiceDefault2.IAuthTabCallback(menuInflater2, menu);
        return true;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        char c2;
        int i2 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i3 = $10 + 81;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i5 = $11 + 25;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 43 - Color.argb(0, 0, 0, 0), 1451 - TextUtils.indexOf("", "", 0, 0), 228868077, false, $$c(b, b2, (byte) (-b2)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 - 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 49123), (ViewConfiguration.getJumpTapTimeout() >> 16) + 44, 1494 - TextUtils.getCapsMode("", 0, 0), 1533236389, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getCapsMode("", 0, 0) + 23972), ExpandableListView.getPackedPositionGroup(0L) + 50, 22939 - View.resolveSize(0, 0), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    c2 = 2;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 45847), 29 - Color.red(0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    c2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (asInterface ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallback_Parcel ^ 7798559133331975163L))) ^ ((char) (getInterfaceDescriptor ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onOptionsItemSelected(@NotNull MenuItem menuItem) {
        WebViewContentOwner webViewContentOwner;
        TossCoreWebView webView;
        String url;
        String str = "";
        int i = 2 % 2;
        int i2 = access000 + 19;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(menuItem, "");
        WebViewContentOwner webViewContentOwnerICustomTabsServiceStub = ICustomTabsServiceStub();
        if (webViewContentOwnerICustomTabsServiceStub instanceof WebViewContentOwner) {
            int i4 = access000 + 59;
            IAuthTabCallbackStubProxy = i4 % 128;
            if (i4 % 2 != 0) {
                webViewContentOwner = webViewContentOwnerICustomTabsServiceStub;
                int i5 = 43 / 0;
            } else {
                webViewContentOwner = webViewContentOwnerICustomTabsServiceStub;
            }
        } else {
            int i6 = access000 + 81;
            IAuthTabCallbackStubProxy = i6 % 128;
            int i7 = i6 % 2;
            webViewContentOwner = null;
        }
        if (webViewContentOwner != null && (webView = webViewContentOwner.getWebView()) != null && (url = webView.getUrl()) != null) {
            str = url;
        }
        ICustomTabsServiceDefault().onExtraCallback(getTitle().toString(), str, menuItem);
        return super.onOptionsItemSelected(menuItem);
    }

    private final ASN1OutputStream writeTypedList() {
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        int iOnWarmupCompleted2 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        return (ASN1OutputStream) IAuthTabCallback(229493146, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -229493145, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{this}, iOnWarmupCompleted);
    }

    private static final Unit IAuthTabCallback(AccountNotificationJoinActivity accountNotificationJoinActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        int iOnWarmupCompleted2 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        return (Unit) IAuthTabCallback(-1769451710, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 1769451710, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{accountNotificationJoinActivity, commonModule_setLeftEdgeTouchEnabled}, iOnWarmupCompleted);
    }

    @Override // viva.republica.toss.account.notification.join.Hilt_AccountNotificationJoinActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = access000 + 101;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = access000 + 97;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // viva.republica.toss.account.notification.join.Hilt_AccountNotificationJoinActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 99;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 == 0) {
            int i4 = 58 / 0;
        }
        int i5 = IAuthTabCallbackStubProxy + 113;
        access000 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // viva.republica.toss.account.notification.join.Hilt_AccountNotificationJoinActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = access000 + 89;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.account.notification.join.Hilt_AccountNotificationJoinActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 63;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 == 0) {
            int i4 = 66 / 0;
        }
        int i5 = access000 + 49;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void setEngagementSignalsCallback() {
        asInterface = 7798559133331975163L;
        IAuthTabCallback_Parcel = -1776194565;
        getInterfaceDescriptor = (char) 28564;
    }
}
