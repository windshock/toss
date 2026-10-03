package viva.republica.toss.contact;

import android.animation.AnimatorInflater;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.zziea;
import im.toss.featurescommon.contacts.library.Receivable;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.Typography2;
import im.toss.tds.view.component.atom.text.Typography7;
import im.toss.uikit.R;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;
import im.toss.uikit.widget.textField.TdsSearchFieldV1View;
import im.toss.uikit.widget.textField.TextField;
import im.toss.utils.RxUtils;
import java.lang.reflect.Method;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.H5TinyPopMenu;
import o.H5TinyPopMenuTitleBarTheme;
import o.IPostMessageServiceStubProxy;
import o.JsonReaderUnknownNumberParsing;
import o.NetConverter3;
import o.ReactNativeFeatureFlagsCxxInterop;
import o.RightClickGesturesKtonRightClickDown2;
import o.RotationProvider1;
import o.SessionTrackera;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.UST_CERT_GetPublicKeyAlgorithmType;
import o.UST_CERT_GetSerial;
import o.deserializeFloat;
import o.deserializeUriNullableCollection;
import o.getDummyAd;
import o.getIconPaddingLeft;
import o.getLastTrimMemoryLevel;
import o.getWrite;
import o.nSetPosition;
import o.onSwitchToDarkTheme;
import o.response;
import o.setH5MenuList;
import o.setMinWebSocketMessageToCompressokhttp;
import o.setProxySelectorokhttp;
import o.staticInit;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.contact.AppBridgeSelectContactActivity$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AppBridgeSelectContactActivity extends Hilt_AppBridgeSelectContactActivity {
    public static final onNavigationEvent Companion;
    private static int IAuthTabCallbackStubProxy;
    private static int ICustomTabsCallback;
    private static int access000;
    private static int getInterfaceDescriptor;
    public static final int onTransact;
    private static short[] readTypedObject;
    private static byte[] writeTypedObject;
    private RecyclerView IAuthTabCallbackDefault;
    private TdsSearchFieldV1View IAuthTabCallbackStub;

    @Inject
    public getDummyAd standardTermsV2Intent;
    private static final byte[] $$a = {62, 54, 60, 44};
    private static final int $$b = 58;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onActivityLayout = 1;
    private static int extraCallbackWithResult = 0;
    private static int extraCallback = 1;
    private final Lazy IAuthTabCallback_Parcel = new RightClickGesturesKtonRightClickDown2(Reflection.getOrCreateKotlinClass(UST_CERT_GetSerial.class), new IAuthTabCallbackStub(this), new IAuthTabCallback(this), new IAuthTabCallbackDefault(null, this));
    private final onWarmupCompleted asInterface = new onWarmupCompleted();
    private final SessionTrackera asBinder = setH5MenuList.onWarmupCompleted(this, new Function0() { // from class: viva.republica.toss.contact.AppBridgeSelectContactActivity$$ExternalSyntheticLambda6
        public final Object invoke() {
            Object[] objArr = {this.f$0};
            int iIAuthTabCallback = zziea.IAuthTabCallback();
            return (Activity) AppBridgeSelectContactActivity.IAuthTabCallback(zziea.IAuthTabCallback(), objArr, zziea.IAuthTabCallback(), -842611003, zziea.IAuthTabCallback(), 842611006, iIAuthTabCallback);
        }
    }, (Function1) null, 2, (Object) null);
    private final Lazy access100 = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.contact.AppBridgeSelectContactActivity$$ExternalSyntheticLambda7
        public final Object invoke() {
            return AppBridgeSelectContactActivity.onExtraCallbackWithResult(this.f$0);
        }
    });

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, byte r7, int r8) {
        /*
            int r8 = r8 * 2
            int r8 = 4 - r8
            int r7 = r7 * 3
            int r0 = 1 - r7
            int r6 = r6 * 3
            int r6 = 115 - r6
            byte[] r1 = viva.republica.toss.contact.AppBridgeSelectContactActivity.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L18
            r3 = r8
            r4 = r2
            goto L2e
        L18:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L1c:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L29:
            r3 = r1[r6]
            r5 = r3
            r3 = r6
            r6 = r5
        L2e:
            int r8 = r8 + r6
            int r6 = r3 + 1
            r3 = r4
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.contact.AppBridgeSelectContactActivity.$$c(byte, byte, int):java.lang.String");
    }

    static {
        ICustomTabsCallback = 0;
        IAuthTabCallback();
        Companion = new onNavigationEvent(null);
        onTransact = 8;
        int i = onActivityLayout + 71;
        ICustomTabsCallback = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~((~i3) | i5);
        int i8 = ~((~i6) | i5);
        int i9 = i7 | i8;
        int i10 = i8 | (~((~i5) | i3)) | i7;
        int i11 = i5 + i3 + i4 + ((-1814252664) * i) + (2073254503 * i2);
        int i12 = i11 * i11;
        int i13 = ((-223937157) * i5) + 1943797760 + (1745420935 * i3) + (i9 * 1162804602) + (1162804602 * i7) + ((-1162804602) * i10) + ((-1386741760) * i4) + ((-1631584256) * i) + ((-1368915968) * i2) + ((-1053032448) * i12);
        int i14 = (i5 * (-1919122223)) + 1408767311 + (i3 * (-1919121035)) + (i9 * (-594)) + (i7 * (-594)) + (i10 * 594) + (i4 * (-1919121629)) + (i * (-390511720)) + (i2 * 1804971285) + (i12 * 255066112);
        int i15 = i13 + (i14 * i14 * 379846656);
        return i15 != 1 ? i15 != 2 ? i15 != 3 ? i15 != 4 ? onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr) : onExtraCallback(objArr) : IAuthTabCallback(objArr) : onNavigationEvent(objArr);
    }

    public static /* synthetic */ void IAuthTabCallback(AppBridgeSelectContactActivity appBridgeSelectContactActivity, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallback + 7;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(appBridgeSelectContactActivity, obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = extraCallback + 5;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 9;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        asBinder(function1, obj);
        if (i3 == 0) {
            int i4 = 73 / 0;
        }
        int i5 = extraCallbackWithResult + 113;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ boolean IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallback + 105;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            onTransact(function1, obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        boolean zOnTransact = onTransact(function1, obj);
        int i3 = extraCallbackWithResult + 103;
        extraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 94 / 0;
        }
        return zOnTransact;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        AppBridgeSelectContactActivity appBridgeSelectContactActivity = (AppBridgeSelectContactActivity) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallback + 109;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {appBridgeSelectContactActivity};
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        int iIAuthTabCallback3 = zziea.IAuthTabCallback();
        int iIAuthTabCallback4 = zziea.IAuthTabCallback();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Activity activity = (Activity) IAuthTabCallback(iIAuthTabCallback3, objArr2, iIAuthTabCallback4, 865093973, iIAuthTabCallback2, -865093972, iIAuthTabCallback);
        int i4 = extraCallback + 63;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return activity;
    }

    public static /* synthetic */ Unit onExtraCallback(AppBridgeSelectContactActivity appBridgeSelectContactActivity, H5TinyPopMenuTitleBarTheme.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = extraCallback + 97;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = zziea.IAuthTabCallback();
            int iIAuthTabCallback2 = zziea.IAuthTabCallback();
            throw null;
        }
        int iIAuthTabCallback3 = zziea.IAuthTabCallback();
        int iIAuthTabCallback4 = zziea.IAuthTabCallback();
        Unit unit = (Unit) IAuthTabCallback(zziea.IAuthTabCallback(), new Object[]{appBridgeSelectContactActivity, onextracallback}, zziea.IAuthTabCallback(), -1623377902, iIAuthTabCallback4, 1623377904, iIAuthTabCallback3);
        int i3 = extraCallbackWithResult + 41;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ UST_CERT_GetPublicKeyAlgorithmType onExtraCallbackWithResult(AppBridgeSelectContactActivity appBridgeSelectContactActivity) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 105;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        UST_CERT_GetPublicKeyAlgorithmType uST_CERT_GetPublicKeyAlgorithmType = (UST_CERT_GetPublicKeyAlgorithmType) IAuthTabCallback(zziea.IAuthTabCallback(), new Object[]{appBridgeSelectContactActivity}, zziea.IAuthTabCallback(), -65336375, iIAuthTabCallback2, 65336375, iIAuthTabCallback);
        int i4 = extraCallback + 77;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return uST_CERT_GetPublicKeyAlgorithmType;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(AppBridgeSelectContactActivity appBridgeSelectContactActivity, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 9;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = onWarmupCompleted(appBridgeSelectContactActivity, obj);
        int i4 = extraCallback + 87;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return zOnWarmupCompleted;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        AppBridgeSelectContactActivity appBridgeSelectContactActivity = (AppBridgeSelectContactActivity) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 27;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 11;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 98 / 0;
        }
        return appBridgeSelectContactActivity;
    }

    public static /* synthetic */ boolean onNavigationEvent(AppBridgeSelectContactActivity appBridgeSelectContactActivity, H5TinyPopMenuTitleBarTheme.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = extraCallback + 119;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = zziea.IAuthTabCallback();
            int iIAuthTabCallback2 = zziea.IAuthTabCallback();
            ((Boolean) IAuthTabCallback(zziea.IAuthTabCallback(), new Object[]{appBridgeSelectContactActivity, onextracallback}, zziea.IAuthTabCallback(), 24272435, iIAuthTabCallback2, -24272431, iIAuthTabCallback)).booleanValue();
            throw null;
        }
        int iIAuthTabCallback3 = zziea.IAuthTabCallback();
        int iIAuthTabCallback4 = zziea.IAuthTabCallback();
        boolean zBooleanValue = ((Boolean) IAuthTabCallback(zziea.IAuthTabCallback(), new Object[]{appBridgeSelectContactActivity, onextracallback}, zziea.IAuthTabCallback(), 24272435, iIAuthTabCallback4, -24272431, iIAuthTabCallback3)).booleanValue();
        int i3 = extraCallback + 73;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return zBooleanValue;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 103;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        asInterface(function1, obj);
        int i4 = extraCallbackWithResult + 7;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 63 / 0;
        }
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = extraCallback + 95;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            int i4 = 19 / 0;
        }
        int i5 = i3 + 51;
        extraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return -1L;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ UST_CERT_GetSerial onNavigationEvent(AppBridgeSelectContactActivity appBridgeSelectContactActivity) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 11;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        UST_CERT_GetSerial uST_CERT_GetSerialICustomTabsServiceStub = appBridgeSelectContactActivity.ICustomTabsServiceStub();
        if (i3 == 0) {
            int i4 = 5 / 0;
        }
        return uST_CERT_GetSerialICustomTabsServiceStub;
    }

    public final getDummyAd onNavigationEvent() {
        int i = 2 % 2;
        int i2 = extraCallback + 125;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        int i4 = i2 % 2;
        getDummyAd getdummyad = this.standardTermsV2Intent;
        Object obj = null;
        if (getdummyad == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 73;
        extraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return getdummyad;
        }
        obj.hashCode();
        throw null;
    }

    public static final class onWarmupCompleted implements staticInit {
        onWarmupCompleted() {
        }

        public /* bridge */ void IAuthTabCallback(String str) {
            super.IAuthTabCallback(str);
        }

        public void onExtraCallback(Receivable receivable) {
            Intrinsics.checkNotNullParameter(receivable, "");
            onSwitchToDarkTheme onswitchtodarktheme = receivable instanceof onSwitchToDarkTheme ? (onSwitchToDarkTheme) receivable : null;
            if (onswitchtodarktheme == null) {
                return;
            }
            Intent intent = new Intent();
            intent.putExtra("contact", (Parcelable) onswitchtodarktheme);
            AppBridgeSelectContactActivity.this.setResult(-1, intent);
            AppBridgeSelectContactActivity.this.finish();
        }
    }

    private final UST_CERT_GetSerial ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 73;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        UST_CERT_GetSerial uST_CERT_GetSerial = (UST_CERT_GetSerial) this.IAuthTabCallback_Parcel.getValue();
        int i4 = extraCallbackWithResult + 39;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return uST_CERT_GetSerial;
        }
        throw null;
    }

    private final UST_CERT_GetPublicKeyAlgorithmType ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 113;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        UST_CERT_GetPublicKeyAlgorithmType uST_CERT_GetPublicKeyAlgorithmType = (UST_CERT_GetPublicKeyAlgorithmType) this.access100.getValue();
        int i3 = extraCallbackWithResult + 107;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        return uST_CERT_GetPublicKeyAlgorithmType;
    }

    public static final class onExtraCallbackWithResult implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public onExtraCallbackWithResult() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AppBridgeSelectContactActivity.onNavigationEvent(AppBridgeSelectContactActivity.this).onExtraCallbackWithResult().setValue(String.valueOf(editable));
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = (AppBridgeSelectContactActivity) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallback + 45;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = textFieldScrollKtExternalSyntheticLambda0.getIntent().getStringExtra("permissionDescription");
        boolean booleanExtra = textFieldScrollKtExternalSyntheticLambda0.getIntent().getBooleanExtra("sortByFreePassWords", false);
        String stringExtra2 = textFieldScrollKtExternalSyntheticLambda0.getIntent().getStringExtra("serviceReferrer");
        if (stringExtra2 == null) {
            int i4 = extraCallback + 53;
            extraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            stringExtra2 = "";
        }
        UST_CERT_GetPublicKeyAlgorithmType uST_CERT_GetPublicKeyAlgorithmType = new UST_CERT_GetPublicKeyAlgorithmType(textFieldScrollKtExternalSyntheticLambda0.ICustomTabsServiceStub(), textFieldScrollKtExternalSyntheticLambda0, stringExtra, booleanExtra, ((AppBridgeSelectContactActivity) textFieldScrollKtExternalSyntheticLambda0).asInterface, textFieldScrollKtExternalSyntheticLambda0.onNavigationEvent(), ((AppBridgeSelectContactActivity) textFieldScrollKtExternalSyntheticLambda0).asBinder, stringExtra2);
        int i5 = extraCallback + 23;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return uST_CERT_GetPublicKeyAlgorithmType;
    }

    public static final class IAuthTabCallback implements Function0<ViewModelProvider.onWarmupCompleted> {
        final /* synthetic */ ComponentActivity onWarmupCompleted;

        public IAuthTabCallback(ComponentActivity componentActivity) {
            this.onWarmupCompleted = componentActivity;
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.onWarmupCompleted invoke() {
            return this.onWarmupCompleted.getDefaultViewModelProviderFactory();
        }
    }

    public static final class IAuthTabCallbackStub implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        final /* synthetic */ ComponentActivity onExtraCallbackWithResult;

        public IAuthTabCallbackStub(ComponentActivity componentActivity) {
            this.onExtraCallbackWithResult = componentActivity;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 invoke() {
            return this.onExtraCallbackWithResult.getViewModelStore();
        }
    }

    public static final class IAuthTabCallbackDefault implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        final /* synthetic */ ComponentActivity IAuthTabCallback;
        final /* synthetic */ Function0 onWarmupCompleted;

        public IAuthTabCallbackDefault(Function0 function0, ComponentActivity componentActivity) {
            this.onWarmupCompleted = function0;
            this.IAuthTabCallback = componentActivity;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 invoke() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            Function0 function0 = this.onWarmupCompleted;
            return (function0 == null || (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) == null) ? this.IAuthTabCallback.getDefaultViewModelCreationExtras() : androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
        }
    }

    @Override // viva.republica.toss.contact.Hilt_AppBridgeSelectContactActivity
    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 17;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        setContentView(setEngagementSignalsCallback());
        updateVisuals();
        validateRelationship();
        int i4 = extraCallback + 87;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class onNavigationEvent {
        private static final byte[] $$a = {35, -27, Byte.MIN_VALUE, 50};
        private static final int $$b = 37;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static long onNavigationEvent = 7798559133331975163L;
        private static int onExtraCallback = -1212849077;
        private static char onWarmupCompleted = 27643;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(int r5, int r6, int r7) {
            /*
                int r6 = r6 * 3
                int r6 = 3 - r6
                int r5 = 110 - r5
                int r7 = r7 * 4
                int r0 = 1 - r7
                byte[] r1 = viva.republica.toss.contact.AppBridgeSelectContactActivity.onNavigationEvent.$$a
                byte[] r0 = new byte[r0]
                r2 = 0
                int r7 = 0 - r7
                if (r1 != 0) goto L16
                r4 = r7
                r3 = r2
                goto L28
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r5
                int r6 = r6 + 1
                r0[r3] = r4
                if (r3 != r7) goto L24
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                return r5
            L24:
                int r3 = r3 + 1
                r4 = r1[r6]
            L28:
                int r4 = -r4
                int r5 = r5 + r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.contact.AppBridgeSelectContactActivity.onNavigationEvent.$$c(int, int, int):java.lang.String");
        }

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
            int i2 = 2;
            int i3 = 2 % 2;
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
            while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
                int i4 = $10 + 29;
                $11 = i4 % 128;
                int i5 = i4 % i2;
                try {
                    Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                    if (objOnExtraCallback == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Gravity.getAbsoluteGravity(0, 0), TextUtils.indexOf((CharSequence) "", '0') + 44, 1451 - KeyEvent.getDeadChar(0, 0), 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        char doubleTapTimeout = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 49123);
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 44;
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 1495;
                        byte b3 = (byte) ($$b & 3);
                        byte b4 = (byte) (b3 - 1);
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(doubleTapTimeout, packedPositionType, iIndexOf, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionType(0L) + 23972), TextUtils.getOffsetAfter("", 0) + 50, View.MeasureSpec.getSize(0) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 45848), 29 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (-16764639) - Color.rgb(0, 0, 0), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                    cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onNavigationEvent ^ 7798559133331975163L)) ^ ((int) (onExtraCallback ^ 7798559133331975163L))) ^ ((char) (onWarmupCompleted ^ 7798559133331975163L)));
                    trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                    int i6 = $10 + 47;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    i2 = 2;
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

        private onNavigationEvent() {
        }

        public final Intent onExtraCallback(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, @NotNull String str5) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intent intent = new Intent(context, (Class<?>) AppBridgeSelectContactActivity.class);
            Object[] objArr = new Object[1];
            a((char) (17122 - KeyEvent.normalizeMetaState(0)), 152221727 + (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), new char[]{14665, 30169, 62444, 62165, 54805}, new char[]{0, 0, 0, 0}, new char[]{8361, 4792, 57865, 12610}, objArr);
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), str);
            Object[] objArr2 = new Object[1];
            a((char) Color.blue(0), Color.green(0), new char[]{24919, 5881, 54659, 54116, 30145, 36772, 27810, 56983}, new char[]{0, 0, 0, 0}, new char[]{23921, 31960, 46774, 31328}, objArr2);
            intent.putExtras(RotationProvider1.onNavigationEvent(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), str2), getWrite.IAuthTabCallback("placeholder", str3), getWrite.IAuthTabCallback("permissionDescription", str4), getWrite.IAuthTabCallback("sortByFreePassWords", Boolean.valueOf(z)), getWrite.IAuthTabCallback("serviceReferrer", str5)}));
            int i2 = onExtraCallbackWithResult + 29;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return intent;
            }
            throw null;
        }

        public final onSwitchToDarkTheme onExtraCallback(@NotNull Bundle bundle) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 1;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(bundle, "");
            onSwitchToDarkTheme parcelable = bundle.getParcelable("contact");
            int i4 = onExtraCallbackWithResult + 89;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return parcelable;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final LinearLayout setEngagementSignalsCallback() throws Throwable {
        int i = 2 % 2;
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        RecyclerView recyclerView = null;
        AppBarLayout appBarLayout = new AppBarLayout(context, (AttributeSet) null);
        appBarLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        appBarLayout.setStateListAnimator(AnimatorInflater.loadStateListAnimator(appBarLayout.getContext(), R.drawable.appbar_elevation_off));
        Context context2 = appBarLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Toolbar toolbar = new Toolbar(context2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        toolbar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        toolbar.setTitle("");
        setSupportActionBar(toolbar);
        IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.onNavigationEvent(true);
        }
        setProxySelectorokhttp.onExtraCallbackWithResult(appBarLayout, toolbar);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, appBarLayout);
        Intent intent = getIntent();
        Object[] objArr = new Object[1];
        a((short) TextUtils.getOffsetAfter("", 0), (byte) ((-92) - (Process.myTid() >> 22)), Color.rgb(0, 0, 0) + 1377390700, (-1402243349) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), KeyEvent.keyCodeFromString("") - 87, objArr);
        String stringExtra = intent.getStringExtra(((String) objArr[0]).intern());
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (stringExtra.length() > 0) {
            BaseTextView baseTextView = (BaseTextView) Typography2.class.getDeclaredConstructor(Context.class).newInstance(linearLayout.getContext());
            Intrinsics.checkNotNull(baseTextView);
            baseTextView.setText(stringExtra);
            baseTextView.onNavigationEvent(response.Bold);
            DisplayMetrics displayMetrics = baseTextView.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            int iOnNavigationEvent = varyMatches.onNavigationEvent(24, displayMetrics);
            DisplayMetrics displayMetrics2 = baseTextView.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
            int iOnNavigationEvent2 = varyMatches.onNavigationEvent(24, displayMetrics2);
            DisplayMetrics displayMetrics3 = baseTextView.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
            setMinWebSocketMessageToCompressokhttp.onExtraCallback(baseTextView, iOnNavigationEvent, iOnNavigationEvent2, varyMatches.onNavigationEvent(24, displayMetrics3), 0);
            Intrinsics.checkNotNull(baseTextView);
            setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, baseTextView);
        }
        Intent intent2 = getIntent();
        Object[] objArr2 = new Object[1];
        a((short) ((-16777216) - Color.rgb(0, 0, 0)), (byte) (TextUtils.indexOf("", "") - 29), (Process.myPid() >> 22) + 1360613488, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1402243352, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 84, objArr2);
        String stringExtra2 = intent2.getStringExtra(((String) objArr2[0]).intern());
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        if (stringExtra2.length() > 0) {
            BaseTextView baseTextView2 = (BaseTextView) Typography7.class.getDeclaredConstructor(Context.class).newInstance(linearLayout.getContext());
            Intrinsics.checkNotNull(baseTextView2);
            baseTextView2.setText(stringExtra2);
            DisplayMetrics displayMetrics4 = baseTextView2.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics4, "");
            int iOnNavigationEvent3 = varyMatches.onNavigationEvent(24, displayMetrics4);
            DisplayMetrics displayMetrics5 = baseTextView2.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics5, "");
            int iOnNavigationEvent4 = varyMatches.onNavigationEvent(8, displayMetrics5);
            DisplayMetrics displayMetrics6 = baseTextView2.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics6, "");
            int iOnNavigationEvent5 = varyMatches.onNavigationEvent(24, displayMetrics6);
            DisplayMetrics displayMetrics7 = baseTextView2.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics7, "");
            setMinWebSocketMessageToCompressokhttp.onExtraCallback(baseTextView2, iOnNavigationEvent3, iOnNavigationEvent4, iOnNavigationEvent5, varyMatches.onNavigationEvent(8, displayMetrics7));
            Intrinsics.checkNotNull(baseTextView2);
            setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, baseTextView2);
        }
        TdsSearchFieldV1View tdsSearchFieldV1View = new TdsSearchFieldV1View(this);
        tdsSearchFieldV1View.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        DisplayMetrics displayMetrics8 = tdsSearchFieldV1View.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics8, "");
        int iOnNavigationEvent6 = varyMatches.onNavigationEvent(16, displayMetrics8);
        DisplayMetrics displayMetrics9 = tdsSearchFieldV1View.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics9, "");
        int iOnNavigationEvent7 = varyMatches.onNavigationEvent(30, displayMetrics9);
        DisplayMetrics displayMetrics10 = tdsSearchFieldV1View.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics10, "");
        setMinWebSocketMessageToCompressokhttp.onExtraCallback(tdsSearchFieldV1View, iOnNavigationEvent6, iOnNavigationEvent7, varyMatches.onNavigationEvent(16, displayMetrics10), 0);
        String stringExtra3 = getIntent().getStringExtra("placeholder");
        if (stringExtra3 == null) {
            stringExtra3 = getString(viva.republica.toss.R.string.app_contact___55b7eecf5f);
            Intrinsics.checkNotNullExpressionValue(stringExtra3, "");
        }
        tdsSearchFieldV1View.setHint(stringExtra3);
        this.IAuthTabCallbackStub = tdsSearchFieldV1View;
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsSearchFieldV1View);
        RecyclerView recyclerView2 = new RecyclerView(this);
        recyclerView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        DisplayMetrics displayMetrics11 = recyclerView2.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics11, "");
        setMinWebSocketMessageToCompressokhttp.onExtraCallback(recyclerView2, 0, varyMatches.onNavigationEvent(12, displayMetrics11), 0, 0);
        recyclerView2.setAdapter(ICustomTabsServiceDefault());
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));
        this.IAuthTabCallbackDefault = recyclerView2;
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, recyclerView2);
        TextField textField = this.IAuthTabCallbackStub;
        if (textField == null) {
            int i2 = extraCallback + 17;
            extraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            textField = null;
        }
        textField.IAuthTabCallback().addTextChangedListener(new onExtraCallbackWithResult());
        TdsSearchFieldV1View tdsSearchFieldV1View2 = this.IAuthTabCallbackStub;
        if (tdsSearchFieldV1View2 == null) {
            int i4 = extraCallback + 63;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i5 != 0) {
                int i6 = 40 / 0;
            }
            tdsSearchFieldV1View2 = null;
        }
        RecyclerView recyclerView3 = this.IAuthTabCallbackDefault;
        if (recyclerView3 == null) {
            int i7 = extraCallback + 87;
            extraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            recyclerView = recyclerView3;
        }
        tdsSearchFieldV1View2.onWarmupCompleted(recyclerView);
        return linearLayout;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        FragmentActivity activity;
        boolean z = false;
        AppBridgeSelectContactActivity appBridgeSelectContactActivity = (AppBridgeSelectContactActivity) objArr[0];
        H5TinyPopMenuTitleBarTheme.onExtraCallback onextracallback = (H5TinyPopMenuTitleBarTheme.onExtraCallback) objArr[1];
        int i = 2 % 2;
        int i2 = extraCallback + 9;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onextracallback, "");
            activity = appBridgeSelectContactActivity.getActivity();
            if (activity != null) {
            }
            return Boolean.valueOf(!z);
        }
        Intrinsics.checkNotNullParameter(onextracallback, "");
        activity = appBridgeSelectContactActivity.getActivity();
        if (activity == null) {
            z = true;
        }
        return Boolean.valueOf(!z);
        if (activity.isFinishing()) {
            int i3 = extraCallbackWithResult;
            int i4 = i3 + 91;
            extraCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 85;
            extraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 5 % 4;
            }
            z = true;
        }
        return Boolean.valueOf(!z);
    }

    private static final boolean onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallback + 3;
        extraCallbackWithResult = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            ((Boolean) function1.invoke(obj)).booleanValue();
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        boolean zBooleanValue = ((Boolean) function1.invoke(obj)).booleanValue();
        int i3 = extraCallback + 89;
        extraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return zBooleanValue;
        }
        throw null;
    }

    private static final void asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallback + 37;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = extraCallbackWithResult + 85;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        AppBridgeSelectContactActivity appBridgeSelectContactActivity = (AppBridgeSelectContactActivity) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 45;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        appBridgeSelectContactActivity.IEngagementSignalsCallback();
        Unit unit = Unit.INSTANCE;
        int i4 = extraCallbackWithResult + 125;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 91 / 0;
        }
        return unit;
    }

    private final void updateVisuals() {
        int i = 2 % 2;
        deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback = H5TinyPopMenuTitleBarTheme.IAuthTabCallback.IAuthTabCallback().onExtraCallbackWithResult(NetConverter3.onExtraCallback()).onWarmupCompleted(new AppBridgeSelectContactActivity$.ExternalSyntheticLambda1(new AppBridgeSelectContactActivity$.ExternalSyntheticLambda0(this))).IAuthTabCallback(new AppBridgeSelectContactActivity$.ExternalSyntheticLambda3(new AppBridgeSelectContactActivity$.ExternalSyntheticLambda2(this)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback, "");
        addSubscription(deserializeurinullablecollectionIAuthTabCallback);
        deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback2 = getIconPaddingLeft.IAuthTabCallback.onWarmupCompleted().onWarmupCompleted(NetConverter3.onExtraCallback()).onWarmupCompleted(new AppBridgeSelectContactActivity$.ExternalSyntheticLambda4(this)).IAuthTabCallback(new AppBridgeSelectContactActivity$.ExternalSyntheticLambda5(this));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback2, "");
        addSubscription(deserializeurinullablecollectionIAuthTabCallback2);
        int i2 = extraCallbackWithResult + 81;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0025 A[PHI: r5
      0x0025: PHI (r5v2 androidx.fragment.app.FragmentActivity) = (r5v1 androidx.fragment.app.FragmentActivity), (r5v8 androidx.fragment.app.FragmentActivity) binds: [B:8:0x0023, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final boolean onWarmupCompleted(viva.republica.toss.contact.AppBridgeSelectContactActivity r5, java.lang.Object r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.contact.AppBridgeSelectContactActivity.extraCallbackWithResult
            int r1 = r1 + 15
            int r2 = r1 % 128
            viva.republica.toss.contact.AppBridgeSelectContactActivity.extraCallback = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L1c
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            androidx.fragment.app.FragmentActivity r5 = r5.getActivity()
            if (r5 == 0) goto L35
            goto L25
        L1c:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            androidx.fragment.app.FragmentActivity r5 = r5.getActivity()
            if (r5 == 0) goto L35
        L25:
            boolean r5 = r5.isFinishing()
            if (r5 != r3) goto L35
            int r5 = viva.republica.toss.contact.AppBridgeSelectContactActivity.extraCallback
            int r5 = r5 + 39
            int r6 = r5 % 128
            viva.republica.toss.contact.AppBridgeSelectContactActivity.extraCallbackWithResult = r6
            int r5 = r5 % r0
            r4 = r3
        L35:
            r5 = r4 ^ 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.contact.AppBridgeSelectContactActivity.onWarmupCompleted(viva.republica.toss.contact.AppBridgeSelectContactActivity, java.lang.Object):boolean");
    }

    private static final void onExtraCallback(AppBridgeSelectContactActivity appBridgeSelectContactActivity, Object obj) {
        int i = 2 % 2;
        if ((obj instanceof getLastTrimMemoryLevel.onExtraCallback) && ReactNativeFeatureFlagsCxxInterop.onWarmupCompleted.onExtraCallback(((getLastTrimMemoryLevel.onExtraCallback) obj).IAuthTabCallback(), "android.permission.READ_CONTACTS")) {
            int i2 = extraCallback + 73;
            extraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            FragmentActivity activity = appBridgeSelectContactActivity.getActivity();
            if (activity != null) {
                int i4 = extraCallbackWithResult + 111;
                extraCallback = i4 % 128;
                View view = null;
                if (i4 % 2 == 0) {
                    H5TinyPopMenuTitleBarTheme h5TinyPopMenuTitleBarTheme = H5TinyPopMenuTitleBarTheme.IAuthTabCallback;
                    RecyclerView recyclerView = appBridgeSelectContactActivity.IAuthTabCallbackDefault;
                    view.hashCode();
                    throw null;
                }
                H5TinyPopMenuTitleBarTheme h5TinyPopMenuTitleBarTheme2 = H5TinyPopMenuTitleBarTheme.IAuthTabCallback;
                View view2 = appBridgeSelectContactActivity.IAuthTabCallbackDefault;
                if (view2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    view = view2;
                }
                h5TinyPopMenuTitleBarTheme2.onExtraCallbackWithResult(activity, view);
                int i5 = extraCallback + 43;
                extraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
            }
        }
    }

    static final /* synthetic */ class onExtraCallback extends FunctionReferenceImpl implements Function1<List<? extends onSwitchToDarkTheme>, Unit> {
        onExtraCallback(Object obj) {
            super(1, obj, UST_CERT_GetPublicKeyAlgorithmType.class, "updateList", "updateList(Ljava/util/List;)V", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            onNavigationEvent((List) obj);
            return Unit.INSTANCE;
        }

        public final void onNavigationEvent(List<onSwitchToDarkTheme> list) {
            Intrinsics.checkNotNullParameter(list, "");
            UST_CERT_GetPublicKeyAlgorithmType.onExtraCallbackWithResult(nSetPosition.onExtraCallbackWithResult(), new Object[]{(UST_CERT_GetPublicKeyAlgorithmType) ((CallableReference) this).receiver, list}, -701146427, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 701146427, nSetPosition.onExtraCallbackWithResult());
        }
    }

    private static final void asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 7;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            int i4 = 6 / 0;
        }
        int i5 = extraCallbackWithResult + 7;
        extraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void validateRelationship() {
        int i = 2 % 2;
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted = new H5TinyPopMenu(this).onWarmupCompleted().onWarmupCompleted(RxUtils.IAuthTabCallback((Object) null));
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnWarmupCompleted, "");
        final onExtraCallback onextracallback = new onExtraCallback(ICustomTabsServiceDefault());
        jsonReaderUnknownNumberParsingOnWarmupCompleted.IAuthTabCallback(new deserializeFloat() { // from class: viva.republica.toss.contact.AppBridgeSelectContactActivity$$ExternalSyntheticLambda8
            public final void accept(Object obj) {
                AppBridgeSelectContactActivity.IAuthTabCallbackDefault(onextracallback, obj);
            }
        });
        int i2 = extraCallbackWithResult + 45;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r24, byte r25, int r26, int r27, int r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.contact.AppBridgeSelectContactActivity.a(short, byte, int, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006b, code lost:
    
        if (r1 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x006d, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        r1 = viva.republica.toss.contact.AppBridgeSelectContactActivity.extraCallbackWithResult + 79;
        viva.republica.toss.contact.AppBridgeSelectContactActivity.extraCallback = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0079, code lost:
    
        if ((r1 % 2) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x007b, code lost:
    
        r0 = 2 / 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007d, code lost:
    
        r4 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007e, code lost:
    
        r4.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0081, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0082, code lost:
    
        r0 = r12.IAuthTabCallbackStub;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0084, code lost:
    
        if (r0 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0086, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008b, code lost:
    
        r4.setVisibility(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0090, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003b, code lost:
    
        if (r1 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0064, code lost:
    
        if (((java.lang.Boolean) o.H5TinyPopMenuTitleBarTheme.IAuthTabCallback(r5, r6, o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -957813781, o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), r10, 957813783)).booleanValue() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0066, code lost:
    
        validateRelationship();
        r1 = r12.IAuthTabCallbackStub;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void IEngagementSignalsCallback() {
        /*
            r12 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.contact.AppBridgeSelectContactActivity.extraCallbackWithResult
            int r1 = r1 + 125
            int r2 = r1 % 128
            viva.republica.toss.contact.AppBridgeSelectContactActivity.extraCallback = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            r3 = 0
            r4 = 0
            if (r1 != 0) goto L3e
            o.H5TinyPopMenuTitleBarTheme r1 = o.H5TinyPopMenuTitleBarTheme.IAuthTabCallback
            java.lang.Object[] r6 = new java.lang.Object[]{r1}
            int r5 = o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback()
            int r10 = o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback()
            int r9 = o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback()
            int r7 = o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback()
            r11 = 957813783(0x39171417, float:1.4407966E-4)
            r8 = -957813781(0xffffffffc6e8ebeb, float:-29813.959)
            java.lang.Object r1 = o.H5TinyPopMenuTitleBarTheme.IAuthTabCallback(r5, r6, r7, r8, r9, r10, r11)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r5 = 35
            int r5 = r5 / r3
            if (r1 == 0) goto L82
            goto L66
        L3e:
            o.H5TinyPopMenuTitleBarTheme r1 = o.H5TinyPopMenuTitleBarTheme.IAuthTabCallback
            java.lang.Object[] r6 = new java.lang.Object[]{r1}
            int r5 = o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback()
            int r10 = o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback()
            int r9 = o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback()
            int r7 = o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback()
            r11 = 957813783(0x39171417, float:1.4407966E-4)
            r8 = -957813781(0xffffffffc6e8ebeb, float:-29813.959)
            java.lang.Object r1 = o.H5TinyPopMenuTitleBarTheme.IAuthTabCallback(r5, r6, r7, r8, r9, r10, r11)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L82
        L66:
            r12.validateRelationship()
            im.toss.uikit.widget.textField.TdsSearchFieldV1View r1 = r12.IAuthTabCallbackStub
            if (r1 != 0) goto L7d
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
            int r1 = viva.republica.toss.contact.AppBridgeSelectContactActivity.extraCallbackWithResult
            int r1 = r1 + 79
            int r2 = r1 % 128
            viva.republica.toss.contact.AppBridgeSelectContactActivity.extraCallback = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L7e
            int r0 = r0 / r0
            goto L7e
        L7d:
            r4 = r1
        L7e:
            r4.setVisibility(r3)
            return
        L82:
            im.toss.uikit.widget.textField.TdsSearchFieldV1View r0 = r12.IAuthTabCallbackStub
            if (r0 != 0) goto L8a
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
            goto L8b
        L8a:
            r4 = r0
        L8b:
            r0 = 8
            r4.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.contact.AppBridgeSelectContactActivity.IEngagementSignalsCallback():void");
    }

    public static /* synthetic */ Activity IAuthTabCallback(AppBridgeSelectContactActivity appBridgeSelectContactActivity) {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        return (Activity) IAuthTabCallback(zziea.IAuthTabCallback(), new Object[]{appBridgeSelectContactActivity}, zziea.IAuthTabCallback(), -842611003, iIAuthTabCallback2, 842611006, iIAuthTabCallback);
    }

    private static final Activity onWarmupCompleted(AppBridgeSelectContactActivity appBridgeSelectContactActivity) {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        return (Activity) IAuthTabCallback(zziea.IAuthTabCallback(), new Object[]{appBridgeSelectContactActivity}, zziea.IAuthTabCallback(), 865093973, iIAuthTabCallback2, -865093972, iIAuthTabCallback);
    }

    private static final boolean IAuthTabCallback(AppBridgeSelectContactActivity appBridgeSelectContactActivity, H5TinyPopMenuTitleBarTheme.onExtraCallback onextracallback) {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        return ((Boolean) IAuthTabCallback(zziea.IAuthTabCallback(), new Object[]{appBridgeSelectContactActivity, onextracallback}, zziea.IAuthTabCallback(), 24272435, iIAuthTabCallback2, -24272431, iIAuthTabCallback)).booleanValue();
    }

    private static final Unit onWarmupCompleted(AppBridgeSelectContactActivity appBridgeSelectContactActivity, H5TinyPopMenuTitleBarTheme.onExtraCallback onextracallback) {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        return (Unit) IAuthTabCallback(zziea.IAuthTabCallback(), new Object[]{appBridgeSelectContactActivity, onextracallback}, zziea.IAuthTabCallback(), -1623377902, iIAuthTabCallback2, 1623377904, iIAuthTabCallback);
    }

    private static final UST_CERT_GetPublicKeyAlgorithmType onExtraCallback(AppBridgeSelectContactActivity appBridgeSelectContactActivity) {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        return (UST_CERT_GetPublicKeyAlgorithmType) IAuthTabCallback(zziea.IAuthTabCallback(), new Object[]{appBridgeSelectContactActivity}, zziea.IAuthTabCallback(), -65336375, iIAuthTabCallback2, 65336375, iIAuthTabCallback);
    }

    @Override // viva.republica.toss.contact.Hilt_AppBridgeSelectContactActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = extraCallback + 19;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = extraCallbackWithResult + 101;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.contact.Hilt_AppBridgeSelectContactActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = extraCallback + 53;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.contact.Hilt_AppBridgeSelectContactActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 65;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = extraCallbackWithResult + 3;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.contact.Hilt_AppBridgeSelectContactActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = extraCallback + 95;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 != 0) {
            throw null;
        }
        int i4 = extraCallbackWithResult + 31;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 57 / 0;
        }
    }

    static void IAuthTabCallback() {
        getInterfaceDescriptor = 178354076;
        access000 = -1538795436;
        IAuthTabCallbackStubProxy = -137145982;
        writeTypedObject = new byte[]{85, 84, -89, 89, 18, 19, -32, 30, -7, 6, -23, 8, 8};
    }
}
