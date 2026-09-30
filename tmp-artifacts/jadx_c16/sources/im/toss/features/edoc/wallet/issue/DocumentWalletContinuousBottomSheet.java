package im.toss.features.edoc.wallet.issue;

import android.content.Context;
import android.os.Bundle;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.features.edoc.R;
import im.toss.features.edoc.wallet.issue.DocumentWalletContinuousBottomSheet$;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.tds.compose.component.compound.tablerow.ComposableSingletons$TdsTableRowV1Kt$;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.uikit.widget.MaxHeightScrollView;
import im.toss.uikit.widget.dialog.BottomSheetHeader;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.M_;
import o.createFromParts;
import o.dangerouslyForceOverride;
import o.enableImagePrefetchingOnUiThreadAndroid;
import o.r8lambdaaf6h4gyIT_zMU5_zL59OQo83yI;
import o.setProxySelectorokhttp;
import o.success;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class DocumentWalletContinuousBottomSheet extends r8lambdaaf6h4gyIT_zMU5_zL59OQo83yI {
    private static int onActivityLayout = 0;
    private static int onActivityResized = 1;
    private static int onPostMessage = 0;
    private static int onUnminimized = 1;
    private int IAuthTabCallback;
    private boolean IAuthTabCallbackDefault;
    private final String[] IAuthTabCallbackStubProxy;
    private success IAuthTabCallback_Parcel;
    private int ICustomTabsCallback;
    private final Lazy access000;
    private final Function1<List<String>, Unit> access100;
    private final Function1<String, createFromParts> asBinder;
    private final Lazy asInterface;
    private View extraCallback;
    private final Lazy extraCallbackWithResult;
    private final Lazy getInterfaceDescriptor;
    private View onExtraCallback;
    private final Lazy onExtraCallbackWithResult;
    private final String onMessageChannelReady;
    private final Lazy onMinimized;
    private final Function2<Integer, List<String>, onExtraCallback> onTransact;
    private final String readTypedObject;
    private int writeTypedObject;
    public static final onNavigationEvent Companion = new onNavigationEvent((DefaultConstructorMarker) null);
    public static final int onNavigationEvent = 8;

    static {
        int i = onActivityLayout + 59;
        onUnminimized = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ void IAuthTabCallback(DocumentWalletContinuousBottomSheet documentWalletContinuousBottomSheet, View view) {
        int i = 2 % 2;
        int i2 = onActivityResized + 25;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        asInterface(documentWalletContinuousBottomSheet, view);
        int i4 = onActivityResized + 107;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void IAuthTabCallback(success successVar, DocumentWalletContinuousBottomSheet documentWalletContinuousBottomSheet, int i, View view) {
        int i2 = 2 % 2;
        int i3 = onPostMessage + 11;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallback(successVar, documentWalletContinuousBottomSheet, i, view);
        int i5 = onActivityResized + 19;
        onPostMessage = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ ConstraintLayout IAuthTabCallbackStub(DocumentWalletContinuousBottomSheet documentWalletContinuousBottomSheet) {
        int i = 2 % 2;
        int i2 = onActivityResized + 11;
        onPostMessage = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackDefault(documentWalletContinuousBottomSheet);
        }
        IAuthTabCallbackDefault(documentWalletContinuousBottomSheet);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(DocumentWalletContinuousBottomSheet documentWalletContinuousBottomSheet, View view) {
        int i = 2 % 2;
        int i2 = onPostMessage + 93;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
            return (Unit) onExtraCallback(-1423464960, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{documentWalletContinuousBottomSheet, view}, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 1423464961, iIAuthTabCallback);
        }
        int iIAuthTabCallback2 = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        Unit unit = (Unit) onExtraCallback(-1423464960, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{documentWalletContinuousBottomSheet, view}, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 1423464961, iIAuthTabCallback2);
        int i3 = 18 / 0;
        return unit;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        boolean zOnNavigationEvent;
        success successVar = (success) objArr[0];
        DocumentWalletContinuousBottomSheet documentWalletContinuousBottomSheet = (DocumentWalletContinuousBottomSheet) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        TextView textView = (TextView) objArr[3];
        int iIntValue2 = ((Number) objArr[4]).intValue();
        KeyEvent keyEvent = (KeyEvent) objArr[5];
        int i = 2 % 2;
        int i2 = onPostMessage + 111;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            zOnNavigationEvent = onNavigationEvent(successVar, documentWalletContinuousBottomSheet, iIntValue, textView, iIntValue2, keyEvent);
            int i3 = 32 / 0;
        } else {
            zOnNavigationEvent = onNavigationEvent(successVar, documentWalletContinuousBottomSheet, iIntValue, textView, iIntValue2, keyEvent);
        }
        return Boolean.valueOf(zOnNavigationEvent);
    }

    public static /* synthetic */ Typography5 onExtraCallback(DocumentWalletContinuousBottomSheet documentWalletContinuousBottomSheet) {
        Typography5 typography5;
        int i = 2 % 2;
        int i2 = onActivityResized + 97;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {documentWalletContinuousBottomSheet};
        int iIAuthTabCallback = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        if (i3 != 0) {
            typography5 = (Typography5) onExtraCallback(1296188114, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), objArr, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), -1296188108, iIAuthTabCallback);
            int i4 = 55 / 0;
        } else {
            typography5 = (Typography5) onExtraCallback(1296188114, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), objArr, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), -1296188108, iIAuthTabCallback);
        }
        int i5 = onPostMessage + 11;
        onActivityResized = i5 % 128;
        int i6 = i5 % 2;
        return typography5;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i6;
        int i9 = ~(i7 | i8);
        int i10 = ~(i | i6);
        int i11 = i9 | i10;
        int i12 = i9 | (~(i5 | i6)) | i10;
        int i13 = (~(i6 | i5 | i)) | (~(i8 | (~i)));
        int i14 = i5 + i + i2 + ((-2005657349) * i3) + (1476006321 * i4);
        int i15 = i14 * i14;
        int i16 = ((583353605 * i5) - 1319501824) + (407026429 * i) + ((-176327176) * i11) + (i12 * (-2059320060)) + ((-2059320060) * i13) + ((-1652293632) * i2) + ((-798228480) * i3) + ((-1404829696) * i4) + ((-1043726336) * i15);
        int i17 = (i5 * 961754349) + 784684277 + (i * 961754277) + (i11 * (-72)) + (i12 * 36) + (i13 * 36) + (i2 * 961754313) + (i3 * (-1264871149)) + (i4 * 72538105) + (i15 * 798621696);
        switch (i16 + (i17 * i17 * (-1437204480))) {
            case 1:
                return onWarmupCompleted(objArr);
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                return IAuthTabCallbackStub(objArr);
            case 6:
                return asInterface(objArr);
            case 7:
                DocumentWalletContinuousBottomSheet documentWalletContinuousBottomSheet = (DocumentWalletContinuousBottomSheet) objArr[0];
                int i18 = 2 % 2;
                int i19 = onPostMessage + 11;
                onActivityResized = i19 % 128;
                int i20 = i19 % 2;
                LinearLayout linearLayout = (LinearLayout) documentWalletContinuousBottomSheet.onExtraCallbackWithResult.getValue();
                int i21 = onActivityResized + 47;
                onPostMessage = i21 % 128;
                int i22 = i21 % 2;
                return linearLayout;
            case 8:
                DocumentWalletContinuousBottomSheet documentWalletContinuousBottomSheet2 = (DocumentWalletContinuousBottomSheet) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                int i23 = 2 % 2;
                int i24 = onPostMessage + 17;
                onActivityResized = i24 % 128;
                int i25 = i24 % 2;
                documentWalletContinuousBottomSheet2.IAuthTabCallbackStubProxy[iIntValue - 1] = null;
                documentWalletContinuousBottomSheet2.onActivityResized();
                int i26 = onActivityResized + 57;
                onPostMessage = i26 % 128;
                int i27 = i26 % 2;
                return null;
            case 9:
                return onTransact(objArr);
            case 10:
                View view = (View) objArr[0];
                int i28 = 2 % 2;
                int i29 = onActivityResized + 95;
                onPostMessage = i29 % 128;
                if (i29 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(view, "");
                } else {
                    Intrinsics.checkNotNullParameter(view, "");
                }
                view.setVisibility(0);
                return Unit.INSTANCE;
            case 11:
                return asBinder(objArr);
            default:
                return onExtraCallback(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallback(View view) {
        int i = 2 % 2;
        int i2 = onPostMessage + 65;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Unit interfaceDescriptor = getInterfaceDescriptor(view);
        int i4 = onPostMessage + 37;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return interfaceDescriptor;
    }

    public static /* synthetic */ Unit onExtraCallback(DocumentWalletContinuousBottomSheet documentWalletContinuousBottomSheet, View view) {
        int i = 2 % 2;
        int i2 = onActivityResized + 99;
        onPostMessage = i2 % 128;
        if (i2 % 2 != 0) {
            getInterfaceDescriptor(documentWalletContinuousBottomSheet, view);
            throw null;
        }
        Unit interfaceDescriptor = getInterfaceDescriptor(documentWalletContinuousBottomSheet, view);
        int i3 = onPostMessage + 99;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        return interfaceDescriptor;
    }

    public static /* synthetic */ BottomSheetHeader onExtraCallbackWithResult(DocumentWalletContinuousBottomSheet documentWalletContinuousBottomSheet) {
        int i = 2 % 2;
        int i2 = onPostMessage + 115;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            return asBinder(documentWalletContinuousBottomSheet);
        }
        asBinder(documentWalletContinuousBottomSheet);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(View view) {
        int i = 2 % 2;
        int i2 = onActivityResized + 55;
        onPostMessage = i2 % 128;
        if (i2 % 2 == 0) {
            return asBinder(view);
        }
        asBinder(view);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(DocumentWalletContinuousBottomSheet documentWalletContinuousBottomSheet, int i, View view) {
        int i2 = 2 % 2;
        int i3 = onPostMessage + 47;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(documentWalletContinuousBottomSheet, i, view);
        int i5 = onPostMessage + 113;
        onActivityResized = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(DocumentWalletContinuousBottomSheet documentWalletContinuousBottomSheet, View view) {
        int i = 2 % 2;
        int i2 = onActivityResized + 43;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess000 = access000(documentWalletContinuousBottomSheet, view);
        if (i3 != 0) {
            int i4 = 37 / 0;
        }
        int i5 = onActivityResized + 93;
        onPostMessage = i5 % 128;
        if (i5 % 2 == 0) {
            return unitAccess000;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(DocumentWalletContinuousBottomSheet documentWalletContinuousBottomSheet, int i, String str, View view) {
        int i2 = 2 % 2;
        int i3 = onActivityResized + 87;
        onPostMessage = i3 % 128;
        int i4 = i3 % 2;
        IAuthTabCallback(documentWalletContinuousBottomSheet, i, str, view);
        if (i4 != 0) {
            int i5 = 72 / 0;
        }
        int i6 = onActivityResized + 57;
        onPostMessage = i6 % 128;
        int i7 = i6 % 2;
    }

    public static /* synthetic */ MaxHeightScrollView onNavigationEvent(DocumentWalletContinuousBottomSheet documentWalletContinuousBottomSheet) {
        int i = 2 % 2;
        int i2 = onActivityResized + 23;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        MaxHeightScrollView maxHeightScrollView = (MaxHeightScrollView) onExtraCallback(-321444416, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{documentWalletContinuousBottomSheet}, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 321444418, iIAuthTabCallback);
        int i4 = onPostMessage + 23;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return maxHeightScrollView;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        DocumentWalletContinuousBottomSheet documentWalletContinuousBottomSheet = (DocumentWalletContinuousBottomSheet) objArr[0];
        int i = 2 % 2;
        int i2 = onActivityResized + 121;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        LinearLayout linearLayoutOnTransact = onTransact(documentWalletContinuousBottomSheet);
        int i4 = onActivityResized + 117;
        onPostMessage = i4 % 128;
        if (i4 % 2 == 0) {
            return linearLayoutOnTransact;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(View view) {
        int i = 2 % 2;
        int i2 = onPostMessage + 53;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(view);
        int i4 = onActivityResized + 79;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback_Parcel;
    }

    public static /* synthetic */ Unit onNavigationEvent(DocumentWalletContinuousBottomSheet documentWalletContinuousBottomSheet, View view) {
        int i = 2 % 2;
        int i2 = onActivityResized + 125;
        onPostMessage = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
            return (Unit) onExtraCallback(-643989993, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{documentWalletContinuousBottomSheet, view}, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 643989997, iIAuthTabCallback);
        }
        int iIAuthTabCallback2 = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(success successVar) {
        int i = 2 % 2;
        int i2 = onPostMessage + 53;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(successVar);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onPostMessage + 87;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        View view = (View) objArr[0];
        int i = 2 % 2;
        int i2 = onPostMessage + 37;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallbackDefault(view);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(view);
        int i3 = onPostMessage + 65;
        onActivityResized = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 44 / 0;
        }
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit onTransact(DocumentWalletContinuousBottomSheet documentWalletContinuousBottomSheet, View view) {
        int i = 2 % 2;
        int i2 = onActivityResized + 5;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(documentWalletContinuousBottomSheet, view);
        int i4 = onPostMessage + 15;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            return unitAsBinder;
        }
        throw null;
    }

    public static /* synthetic */ Typography5 onWarmupCompleted(DocumentWalletContinuousBottomSheet documentWalletContinuousBottomSheet) {
        int i = 2 % 2;
        int i2 = onActivityResized + 25;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        Typography5 typography5 = (Typography5) onExtraCallback(-1135954081, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{documentWalletContinuousBottomSheet}, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 1135954086, iIAuthTabCallback);
        int i4 = onActivityResized + 119;
        onPostMessage = i4 % 128;
        if (i4 % 2 == 0) {
            return typography5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(View view) {
        int i = 2 % 2;
        int i2 = onPostMessage + 99;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        Unit unit = (Unit) onExtraCallback(136644728, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{view}, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), -136644718, iIAuthTabCallback);
        int i4 = onActivityResized + 11;
        onPostMessage = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(DocumentWalletContinuousBottomSheet documentWalletContinuousBottomSheet, View view) {
        int i = 2 % 2;
        int i2 = onActivityResized + 45;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(documentWalletContinuousBottomSheet, view);
        int i4 = onActivityResized + 75;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackDefault;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DocumentWalletContinuousBottomSheet(@NotNull Context context, @NotNull Function2<? super Integer, ? super List<String>, onExtraCallback> function2, @NotNull Function1<? super List<String>, Unit> function1, @Nullable String str, @Nullable String str2, @Nullable Function1<? super String, createFromParts> function12) {
        super(context, 0, false, false, 14, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.onTransact = function2;
        this.access100 = function1;
        this.readTypedObject = str;
        this.onMessageChannelReady = str2;
        this.asBinder = function12;
        this.IAuthTabCallbackStubProxy = new String[10];
        this.access000 = LazyKt.onExtraCallbackWithResult(new DocumentWalletContinuousBottomSheet$.ExternalSyntheticLambda17(this));
        this.getInterfaceDescriptor = LazyKt.onExtraCallbackWithResult(new DocumentWalletContinuousBottomSheet$.ExternalSyntheticLambda18(this));
        this.onMinimized = LazyKt.onExtraCallbackWithResult(new DocumentWalletContinuousBottomSheet$.ExternalSyntheticLambda19(this));
        this.asInterface = LazyKt.onExtraCallbackWithResult(new DocumentWalletContinuousBottomSheet$.ExternalSyntheticLambda20(this));
        this.extraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new DocumentWalletContinuousBottomSheet$.ExternalSyntheticLambda21(this));
        this.onExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new DocumentWalletContinuousBottomSheet$.ExternalSyntheticLambda22(this));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DocumentWalletContinuousBottomSheet(Context context, Function2 function2, Function1 function1, String str, String str2, Function1 function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str3;
        Function1 function13;
        String str4 = (i & 8) != 0 ? null : str;
        if ((i & 16) != 0) {
            int i2 = onPostMessage + 65;
            onActivityResized = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
            str3 = null;
        } else {
            str3 = str2;
        }
        if ((i & 32) != 0) {
            int i4 = onPostMessage + 39;
            onActivityResized = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 36 / 0;
            }
            int i6 = 2 % 2;
            function13 = null;
        } else {
            function13 = function12;
        }
        this(context, function2, function1, str4, str3, function13);
    }

    private final List<String> asBinder(int i) {
        int i2 = 2 % 2;
        int i3 = onActivityResized + 101;
        onPostMessage = i3 % 128;
        int i4 = i3 % 2;
        List<String> listFilterNotNull = CollectionsKt.filterNotNull(ArraysKt.toList(this.IAuthTabCallbackStubProxy).subList(0, i));
        int i5 = onPostMessage + 49;
        onActivityResized = i5 % 128;
        int i6 = i5 % 2;
        return listFilterNotNull;
    }

    private final boolean onTransact(int i) {
        int i2 = 2 % 2;
        int i3 = onPostMessage + 57;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        if (this.onTransact.invoke(Integer.valueOf(i + 1), asBinder(i)) == null) {
            return false;
        }
        int i5 = onActivityResized + 17;
        onPostMessage = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    private static final ConstraintLayout IAuthTabCallbackDefault(DocumentWalletContinuousBottomSheet documentWalletContinuousBottomSheet) {
        int i = 2 % 2;
        int i2 = onActivityResized + 83;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout constraintLayoutFindViewById = documentWalletContinuousBottomSheet.findViewById(R.id.root);
        int i4 = onActivityResized + 109;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
        return constraintLayoutFindViewById;
    }

    private final ConstraintLayout readTypedObject() {
        int i = 2 % 2;
        int i2 = onPostMessage + 63;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.access000.getValue();
        if (i3 != 0) {
            return (ConstraintLayout) value;
        }
        int i4 = 25 / 0;
        return (ConstraintLayout) value;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        DocumentWalletContinuousBottomSheet documentWalletContinuousBottomSheet = (DocumentWalletContinuousBottomSheet) objArr[0];
        int i = 2 % 2;
        int i2 = onActivityResized + 101;
        onPostMessage = i2 % 128;
        if (i2 % 2 != 0) {
            documentWalletContinuousBottomSheet.findViewById(R.id.prevButton);
            throw null;
        }
        Typography5 typography5FindViewById = documentWalletContinuousBottomSheet.findViewById(R.id.prevButton);
        int i3 = onPostMessage + 25;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        return typography5FindViewById;
    }

    private final Typography5 writeTypedObject() {
        int i = 2 % 2;
        int i2 = onActivityResized + 125;
        onPostMessage = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        Typography5 typography5 = (Typography5) this.getInterfaceDescriptor.getValue();
        int i3 = onActivityResized + 91;
        onPostMessage = i3 % 128;
        int i4 = i3 % 2;
        return typography5;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        DocumentWalletContinuousBottomSheet documentWalletContinuousBottomSheet = (DocumentWalletContinuousBottomSheet) objArr[0];
        int i = 2 % 2;
        int i2 = onPostMessage + 49;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            return documentWalletContinuousBottomSheet.findViewById(R.id.summary);
        }
        int i3 = 39 / 0;
        return documentWalletContinuousBottomSheet.findViewById(R.id.summary);
    }

    private final Typography5 onActivityLayout() {
        Typography5 typography5;
        int i = 2 % 2;
        int i2 = onPostMessage + 7;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            typography5 = (Typography5) this.onMinimized.getValue();
            int i3 = 73 / 0;
        } else {
            typography5 = (Typography5) this.onMinimized.getValue();
        }
        int i4 = onActivityResized + 103;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
        return typography5;
    }

    private static final BottomSheetHeader asBinder(DocumentWalletContinuousBottomSheet documentWalletContinuousBottomSheet) {
        int i = 2 % 2;
        int i2 = onPostMessage + 113;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        BottomSheetHeader bottomSheetHeaderFindViewById = documentWalletContinuousBottomSheet.findViewById(R.id.header);
        int i4 = onActivityResized + 31;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
        return bottomSheetHeaderFindViewById;
    }

    private final BottomSheetHeader onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onActivityResized + 23;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        BottomSheetHeader bottomSheetHeader = (BottomSheetHeader) this.asInterface.getValue();
        int i4 = onActivityResized + 113;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
        return bottomSheetHeader;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        DocumentWalletContinuousBottomSheet documentWalletContinuousBottomSheet = (DocumentWalletContinuousBottomSheet) objArr[0];
        int i = 2 % 2;
        int i2 = onActivityResized + 89;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        MaxHeightScrollView maxHeightScrollViewFindViewById = documentWalletContinuousBottomSheet.findViewById(R.id.scrollView);
        int i4 = onActivityResized + 43;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
        return maxHeightScrollViewFindViewById;
    }

    private final MaxHeightScrollView extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onPostMessage + 15;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        MaxHeightScrollView maxHeightScrollView = (MaxHeightScrollView) this.extraCallbackWithResult.getValue();
        if (i3 == 0) {
            int i4 = 11 / 0;
        }
        return maxHeightScrollView;
    }

    private static final LinearLayout onTransact(DocumentWalletContinuousBottomSheet documentWalletContinuousBottomSheet) {
        int i = 2 % 2;
        int i2 = onActivityResized + 85;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        LinearLayout linearLayout = (LinearLayout) documentWalletContinuousBottomSheet.findViewById(R.id.contentLayout);
        if (i3 == 0) {
            return linearLayout;
        }
        throw null;
    }

    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = onPostMessage + 61;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            super/*o.BrickModuleImplExternalSyntheticLambda0*/.onCreate(bundle);
            setContentView(R.layout.bottom_sheet_document_wallet_continuous);
            onPostMessage();
            int i3 = onActivityResized + 71;
            onPostMessage = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        super/*o.BrickModuleImplExternalSyntheticLambda0*/.onCreate(bundle);
        setContentView(R.layout.bottom_sheet_document_wallet_continuous);
        onPostMessage();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void asInterface(DocumentWalletContinuousBottomSheet documentWalletContinuousBottomSheet, View view) {
        int i = 2 % 2;
        int i2 = onPostMessage + 9;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {documentWalletContinuousBottomSheet, Integer.valueOf(documentWalletContinuousBottomSheet.ICustomTabsCallback)};
        int iIAuthTabCallback = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        int iIAuthTabCallback2 = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        int iIAuthTabCallback3 = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        int iIAuthTabCallback4 = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        if (i3 != 0) {
            onExtraCallback(969346142, iIAuthTabCallback2, objArr, iIAuthTabCallback3, iIAuthTabCallback4, -969346134, iIAuthTabCallback);
        } else {
            onExtraCallback(969346142, iIAuthTabCallback2, objArr, iIAuthTabCallback3, iIAuthTabCallback4, -969346134, iIAuthTabCallback);
            throw null;
        }
    }

    private final void onPostMessage() {
        int i = 2 % 2;
        getBehavior().setDraggable(false);
        Typography5 typography5WriteTypedObject = writeTypedObject();
        if (typography5WriteTypedObject != null) {
            typography5WriteTypedObject.setOnClickListener(new DocumentWalletContinuousBottomSheet$.ExternalSyntheticLambda4(this));
        }
        access000(this.ICustomTabsCallback);
        Typography5 typography5WriteTypedObject2 = writeTypedObject();
        if (typography5WriteTypedObject2 != null) {
            typography5WriteTypedObject2.setVisibility(8);
        }
        onExtraCallback(-618297975, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{this, Integer.valueOf(this.ICustomTabsCallback)}, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 618297975, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback());
        int iIAuthTabCallback = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        LinearLayout linearLayout = (LinearLayout) onExtraCallback(-1420344455, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{this}, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 1420344462, iIAuthTabCallback);
        Object obj = null;
        if (linearLayout != null) {
            int i2 = onPostMessage + 13;
            onActivityResized = i2 % 128;
            if (i2 % 2 != 0) {
                linearLayout.removeAllViews();
            } else {
                linearLayout.removeAllViews();
                obj.hashCode();
                throw null;
            }
        }
        onNavigationEvent(this.ICustomTabsCallback);
        int i3 = onPostMessage + 117;
        onActivityResized = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    private static final Unit IAuthTabCallbackDefault(DocumentWalletContinuousBottomSheet documentWalletContinuousBottomSheet, View view) {
        int i = 2 % 2;
        int i2 = onActivityResized + 15;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        View view2 = documentWalletContinuousBottomSheet.extraCallback;
        if (view2 == null) {
            int i4 = onPostMessage + 101;
            onActivityResized = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i6 = onPostMessage + 89;
            onActivityResized = i6 % 128;
            int i7 = i6 % 2;
            view2 = null;
        }
        view2.requestLayout();
        return Unit.INSTANCE;
    }

    private static final Unit asBinder(DocumentWalletContinuousBottomSheet documentWalletContinuousBottomSheet, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        View view2 = documentWalletContinuousBottomSheet.extraCallback;
        if (view2 == null) {
            int i2 = onPostMessage + 79;
            onActivityResized = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i3 == 0) {
                obj.hashCode();
                throw null;
            }
            view2 = null;
        }
        view2.requestLayout();
        Unit unit = Unit.INSTANCE;
        int i4 = onActivityResized + 101;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit getInterfaceDescriptor(View view) {
        int i = 2 % 2;
        int i2 = onActivityResized + 73;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        view.setVisibility(8);
        Unit unit = Unit.INSTANCE;
        int i4 = onPostMessage + 59;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 13 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallback_Parcel(View view) {
        int i = 2 % 2;
        int i2 = onPostMessage + 91;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
        } else {
            Intrinsics.checkNotNullParameter(view, "");
        }
        view.setVisibility(0);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        DocumentWalletContinuousBottomSheet documentWalletContinuousBottomSheet = (DocumentWalletContinuousBottomSheet) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = onPostMessage + 49;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        documentWalletContinuousBottomSheet.IAuthTabCallbackDefault = false;
        MaxHeightScrollView maxHeightScrollViewExtraCallbackWithResult = documentWalletContinuousBottomSheet.extraCallbackWithResult();
        if (maxHeightScrollViewExtraCallbackWithResult != null) {
            maxHeightScrollViewExtraCallbackWithResult.scrollTo(0, 0);
        }
        Unit unit = Unit.INSTANCE;
        int i4 = onPostMessage + 69;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 91 / 0;
        }
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onMinimized() {
        int measuredHeight;
        View view;
        View view2;
        int i = 2 % 2;
        int i2 = this.ICustomTabsCallback;
        int i3 = i2 + 1;
        this.ICustomTabsCallback = i3;
        if (this.onTransact.invoke(Integer.valueOf(i3), asBinder(i3)) == null) {
            dismiss();
            this.access100.invoke(asBinder(i3));
            return;
        }
        if (this.IAuthTabCallbackDefault) {
            return;
        }
        this.IAuthTabCallbackDefault = true;
        ConstraintLayout typedObject = readTypedObject();
        this.writeTypedObject = typedObject != null ? typedObject.getMeasuredHeight() : 0;
        access000(i3);
        onExtraCallback(-618297975, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{this, Integer.valueOf(i3)}, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 618297975, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback());
        Typography5 typography5WriteTypedObject = writeTypedObject();
        if (typography5WriteTypedObject != null) {
            typography5WriteTypedObject.setVisibility(0);
        }
        onNavigationEvent(i3);
        if (((LinearLayout) onExtraCallback(-1420344455, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{this}, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 1420344462, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback())) != null) {
            LinearLayout linearLayout = (LinearLayout) onExtraCallback(-1420344455, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{this}, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 1420344462, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback());
            Intrinsics.checkNotNull(linearLayout);
            View childAt = linearLayout.getChildAt(i2);
            Intrinsics.checkNotNullExpressionValue(childAt, "");
            this.extraCallback = childAt;
            LinearLayout linearLayout2 = (LinearLayout) onExtraCallback(-1420344455, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{this}, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 1420344462, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback());
            Intrinsics.checkNotNull(linearLayout2);
            View childAt2 = linearLayout2.getChildAt(i3);
            Intrinsics.checkNotNullExpressionValue(childAt2, "");
            this.onExtraCallback = childAt2;
        }
        View view3 = this.extraCallback;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            view3 = null;
        }
        view3.setVisibility(8);
        View view4 = this.onExtraCallback;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            view4 = null;
        }
        view4.setVisibility(0);
        ConstraintLayout typedObject2 = readTypedObject();
        if (typedObject2 != null) {
            ConstraintLayout typedObject3 = readTypedObject();
            Object parent = typedObject3 != null ? typedObject3.getParent() : null;
            Intrinsics.checkNotNull(parent, "");
            typedObject2.measure(View.MeasureSpec.makeMeasureSpec(((View) parent).getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getBehavior().getPeekHeight(), Integer.MIN_VALUE));
        }
        ConstraintLayout typedObject4 = readTypedObject();
        if (typedObject4 != null) {
            measuredHeight = typedObject4.getMeasuredHeight();
            int i4 = onPostMessage + 25;
            onActivityResized = i4 % 128;
            int i5 = i4 % 2;
        } else {
            measuredHeight = 0;
        }
        this.IAuthTabCallback = measuredHeight;
        View view5 = this.extraCallback;
        if (view5 == null) {
            int i6 = onPostMessage + 3;
            onActivityResized = i6 % 128;
            int i7 = i6 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            view5 = null;
        }
        view5.setVisibility(0);
        View view6 = this.onExtraCallback;
        if (view6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            view6 = null;
        }
        view6.setVisibility(8);
        ConstraintLayout typedObject5 = readTypedObject();
        if (typedObject5 != null) {
            enableImagePrefetchingOnUiThreadAndroid.onNavigationEvent(typedObject5, Integer.min(onTransact().getMaxHeight(), this.writeTypedObject), Integer.min(onTransact().getMaxHeight(), this.IAuthTabCallback), 0L, 0L, (Interpolator) null, false, (Function1) null, new DocumentWalletContinuousBottomSheet$.ExternalSyntheticLambda7(this), new DocumentWalletContinuousBottomSheet$.ExternalSyntheticLambda8(this), 124, (Object) null);
        }
        View view7 = this.extraCallback;
        if (view7 == null) {
            int i8 = onActivityResized + 29;
            onPostMessage = i8 % 128;
            int i9 = i8 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            view = null;
        } else {
            view = view7;
        }
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(120, displayMetrics);
        dangerouslyForceOverride dangerouslyforceoverride = dangerouslyForceOverride.onExtraCallbackWithResult;
        enableImagePrefetchingOnUiThreadAndroid.IAuthTabCallbackStub(view, iOnNavigationEvent, 0L, 0L, dangerouslyforceoverride.onWarmupCompleted(), (Function1) null, new DocumentWalletContinuousBottomSheet$.ExternalSyntheticLambda9(), 22, (Object) null);
        View view8 = this.onExtraCallback;
        if (view8 == null) {
            int i10 = onPostMessage + 51;
            onActivityResized = i10 % 128;
            if (i10 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i11 = 25 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            view2 = null;
        } else {
            view2 = view8;
        }
        DisplayMetrics displayMetrics2 = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        enableImagePrefetchingOnUiThreadAndroid.onWarmupCompleted(view2, varyMatches.onNavigationEvent(120, displayMetrics2), 500L, 0L, dangerouslyforceoverride.onWarmupCompleted(), new DocumentWalletContinuousBottomSheet$.ExternalSyntheticLambda10(), new DocumentWalletContinuousBottomSheet$.ExternalSyntheticLambda11(this), 4, (Object) null);
        IAuthTabCallback(i3);
    }

    private static final Unit access000(DocumentWalletContinuousBottomSheet documentWalletContinuousBottomSheet, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        View view2 = documentWalletContinuousBottomSheet.extraCallback;
        if (view2 == null) {
            int i2 = onActivityResized + 19;
            onPostMessage = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = onActivityResized + 47;
            onPostMessage = i4 % 128;
            int i5 = i4 % 2;
            view2 = null;
        }
        view2.requestLayout();
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        DocumentWalletContinuousBottomSheet documentWalletContinuousBottomSheet = (DocumentWalletContinuousBottomSheet) objArr[0];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter((View) objArr[1], "");
        View view = documentWalletContinuousBottomSheet.extraCallback;
        if (view == null) {
            int i2 = onPostMessage + 17;
            onActivityResized = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i3 == 0) {
                throw null;
            }
            int i4 = onPostMessage + 101;
            onActivityResized = i4 % 128;
            int i5 = i4 % 2;
            view = null;
        }
        view.requestLayout();
        return Unit.INSTANCE;
    }

    private static final Unit getInterfaceDescriptor(DocumentWalletContinuousBottomSheet documentWalletContinuousBottomSheet, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        documentWalletContinuousBottomSheet.IAuthTabCallbackDefault = false;
        MaxHeightScrollView maxHeightScrollViewExtraCallbackWithResult = documentWalletContinuousBottomSheet.extraCallbackWithResult();
        if (maxHeightScrollViewExtraCallbackWithResult != null) {
            int i2 = onPostMessage + 3;
            onActivityResized = i2 % 128;
            if (i2 % 2 == 0) {
                maxHeightScrollViewExtraCallbackWithResult.scrollTo(1, 0);
            } else {
                maxHeightScrollViewExtraCallbackWithResult.scrollTo(0, 0);
            }
        }
        Unit unit = Unit.INSTANCE;
        int i3 = onPostMessage + 73;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(DocumentWalletContinuousBottomSheet documentWalletContinuousBottomSheet, int i, View view) {
        int i2 = 2 % 2;
        int i3 = onPostMessage + 37;
        onActivityResized = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            int iIAuthTabCallback = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        int iIAuthTabCallback2 = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        LinearLayout linearLayout = (LinearLayout) onExtraCallback(-1420344455, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{documentWalletContinuousBottomSheet}, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 1420344462, iIAuthTabCallback2);
        if (linearLayout != null) {
            linearLayout.removeViewAt(i + 1);
            int i4 = onActivityResized + 101;
            onPostMessage = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onActivityResized() {
        int measuredHeight;
        View view;
        View view2;
        Object parent;
        int i = 2 % 2;
        int i2 = this.ICustomTabsCallback;
        int i3 = i2 - 1;
        this.ICustomTabsCallback = i3;
        if (this.IAuthTabCallbackDefault) {
            return;
        }
        this.IAuthTabCallbackDefault = true;
        ConstraintLayout typedObject = readTypedObject();
        if (typedObject != null) {
            measuredHeight = typedObject.getMeasuredHeight();
        } else {
            int i4 = onPostMessage + 119;
            onActivityResized = i4 % 128;
            int i5 = i4 % 2;
            measuredHeight = 0;
        }
        this.writeTypedObject = measuredHeight;
        access000(i3);
        onExtraCallback(-618297975, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{this, Integer.valueOf(i3)}, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 618297975, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback());
        if (i3 == 0) {
            int i6 = onPostMessage + 41;
            onActivityResized = i6 % 128;
            int i7 = i6 % 2;
            Typography5 typography5WriteTypedObject = writeTypedObject();
            if (typography5WriteTypedObject != null) {
                typography5WriteTypedObject.setVisibility(8);
            }
        }
        if (((LinearLayout) onExtraCallback(-1420344455, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{this}, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 1420344462, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback())) != null) {
            LinearLayout linearLayout = (LinearLayout) onExtraCallback(-1420344455, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{this}, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 1420344462, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback());
            Intrinsics.checkNotNull(linearLayout);
            View childAt = linearLayout.getChildAt(i2);
            Intrinsics.checkNotNullExpressionValue(childAt, "");
            this.extraCallback = childAt;
            LinearLayout linearLayout2 = (LinearLayout) onExtraCallback(-1420344455, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{this}, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 1420344462, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback());
            Intrinsics.checkNotNull(linearLayout2);
            View childAt2 = linearLayout2.getChildAt(i3);
            Intrinsics.checkNotNullExpressionValue(childAt2, "");
            this.onExtraCallback = childAt2;
        }
        View view3 = this.extraCallback;
        if (view3 == null) {
            int i8 = onActivityResized + 23;
            onPostMessage = i8 % 128;
            int i9 = i8 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            view3 = null;
        }
        view3.setVisibility(8);
        View view4 = this.onExtraCallback;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            view4 = null;
        }
        view4.setVisibility(0);
        ConstraintLayout typedObject2 = readTypedObject();
        if (typedObject2 != null) {
            ConstraintLayout typedObject3 = readTypedObject();
            if (typedObject3 != null) {
                int i10 = onActivityResized + 99;
                onPostMessage = i10 % 128;
                if (i10 % 2 != 0) {
                    parent = typedObject3.getParent();
                    int i11 = 61 / 0;
                } else {
                    parent = typedObject3.getParent();
                }
            } else {
                parent = null;
            }
            Intrinsics.checkNotNull(parent, "");
            typedObject2.measure(View.MeasureSpec.makeMeasureSpec(((View) parent).getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getBehavior().getPeekHeight(), Integer.MIN_VALUE));
        }
        ConstraintLayout typedObject4 = readTypedObject();
        this.IAuthTabCallback = typedObject4 != null ? typedObject4.getMeasuredHeight() : 0;
        View view5 = this.extraCallback;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            view5 = null;
        }
        view5.setVisibility(0);
        View view6 = this.onExtraCallback;
        if (view6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            view6 = null;
        }
        view6.setVisibility(8);
        ConstraintLayout typedObject5 = readTypedObject();
        if (typedObject5 != null) {
            enableImagePrefetchingOnUiThreadAndroid.onNavigationEvent(typedObject5, Integer.min(onTransact().getMaxHeight(), this.writeTypedObject), Integer.min(onTransact().getMaxHeight(), this.IAuthTabCallback), 0L, 0L, (Interpolator) null, false, (Function1) null, new DocumentWalletContinuousBottomSheet$.ExternalSyntheticLambda12(this), new DocumentWalletContinuousBottomSheet$.ExternalSyntheticLambda13(this), 124, (Object) null);
        }
        View view7 = this.onExtraCallback;
        if (view7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            view = null;
        } else {
            view = view7;
        }
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(120, displayMetrics);
        dangerouslyForceOverride dangerouslyforceoverride = dangerouslyForceOverride.onExtraCallbackWithResult;
        enableImagePrefetchingOnUiThreadAndroid.onNavigationEvent(view, iOnNavigationEvent, 500L, 0L, dangerouslyforceoverride.onWarmupCompleted(), new DocumentWalletContinuousBottomSheet$.ExternalSyntheticLambda14(), new DocumentWalletContinuousBottomSheet$.ExternalSyntheticLambda15(this), 4, (Object) null);
        View view8 = this.extraCallback;
        if (view8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            view2 = null;
        } else {
            view2 = view8;
        }
        DisplayMetrics displayMetrics2 = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        enableImagePrefetchingOnUiThreadAndroid.asInterface(view2, varyMatches.onNavigationEvent(120, displayMetrics2), 0L, 0L, dangerouslyforceoverride.onWarmupCompleted(), (Function1) null, new DocumentWalletContinuousBottomSheet$.ExternalSyntheticLambda16(this, i3), 22, (Object) null);
        IAuthTabCallback(i3);
    }

    private static final void IAuthTabCallback(DocumentWalletContinuousBottomSheet documentWalletContinuousBottomSheet, int i, String str, View view) {
        int i2 = 2 % 2;
        int i3 = onPostMessage + 33;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        documentWalletContinuousBottomSheet.onExtraCallback(i, str);
        if (i4 == 0) {
            throw null;
        }
    }

    private final void onExtraCallback(int i, String str) {
        int i2 = 2 % 2;
        int i3 = onPostMessage + 123;
        int i4 = i3 % 128;
        onActivityResized = i4;
        int i5 = i3 % 2;
        String[] strArr = this.IAuthTabCallbackStubProxy;
        if (strArr[i] == null) {
            int i6 = i4 + 7;
            onPostMessage = i6 % 128;
            int i7 = i6 % 2;
            strArr[i] = str;
            onMinimized();
            int i8 = onActivityResized + 117;
            onPostMessage = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    private static final Unit asBinder(View view) {
        int i = 2 % 2;
        int i2 = onActivityResized + 81;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        view.setVisibility(8);
        Unit unit = Unit.INSTANCE;
        int i4 = onActivityResized + 107;
        onPostMessage = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 36 / 0;
        }
        return unit;
    }

    private final void IAuthTabCallback(int i) {
        Typography5 typography5WriteTypedObject;
        int i2 = 2 % 2;
        int i3 = onPostMessage;
        int i4 = i3 + 13;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (i == 0) {
            int i5 = i3 + 25;
            onActivityResized = i5 % 128;
            if (i5 % 2 == 0) {
                typography5WriteTypedObject = writeTypedObject();
                int i6 = 2 / 0;
                if (typography5WriteTypedObject == null) {
                    return;
                }
            } else {
                typography5WriteTypedObject = writeTypedObject();
                if (typography5WriteTypedObject == null) {
                    return;
                }
            }
            enableImagePrefetchingOnUiThreadAndroid.onNavigationEvent(typography5WriteTypedObject, 0L, 0L, (Interpolator) null, false, false, (Function1) null, new DocumentWalletContinuousBottomSheet$.ExternalSyntheticLambda5(), 63, (Object) null);
            return;
        }
        Typography5 typography5WriteTypedObject2 = writeTypedObject();
        if (typography5WriteTypedObject2 != null) {
            enableImagePrefetchingOnUiThreadAndroid.IAuthTabCallback(typography5WriteTypedObject2, 0L, 0L, (Interpolator) null, false, false, (Function1) null, new DocumentWalletContinuousBottomSheet$.ExternalSyntheticLambda6(), 63, (Object) null);
        }
    }

    private static final Unit IAuthTabCallbackDefault(View view) {
        int i = 2 % 2;
        int i2 = onPostMessage + 81;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        view.setVisibility(0);
        Unit unit = Unit.INSTANCE;
        int i4 = onPostMessage + 57;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 94 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        DocumentWalletContinuousBottomSheet documentWalletContinuousBottomSheet = (DocumentWalletContinuousBottomSheet) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        if (iIntValue == 0) {
            int i2 = onActivityResized + 89;
            onPostMessage = i2 % 128;
            int i3 = i2 % 2;
            String str = documentWalletContinuousBottomSheet.onMessageChannelReady;
            if (str == null || str.length() == 0) {
                Typography5 typography5OnActivityLayout = documentWalletContinuousBottomSheet.onActivityLayout();
                if (typography5OnActivityLayout != null) {
                    typography5OnActivityLayout.setVisibility(8);
                    return null;
                }
            } else {
                Typography5 typography5OnActivityLayout2 = documentWalletContinuousBottomSheet.onActivityLayout();
                if (typography5OnActivityLayout2 != null) {
                    typography5OnActivityLayout2.setVisibility(0);
                }
                String str2 = documentWalletContinuousBottomSheet.onMessageChannelReady;
                if (str2 == null || str2.length() == 0) {
                    List<String> listAsBinder = documentWalletContinuousBottomSheet.asBinder(iIntValue);
                    String str3 = documentWalletContinuousBottomSheet.readTypedObject;
                    if (str3 != null) {
                        String str4 = "  " + str3 + "  ";
                        if (str4 == null) {
                            str4 = " ";
                        }
                        String str5 = str4;
                        String str6 = documentWalletContinuousBottomSheet.readTypedObject;
                        if (str6 != null) {
                            String str7 = "  " + str6;
                            if (str7 == null) {
                                int i4 = onPostMessage + 73;
                                onActivityResized = i4 % 128;
                                int i5 = i4 % 2;
                                str7 = "";
                            }
                            String strJoinToString$default = CollectionsKt.joinToString$default(listAsBinder, str5, (CharSequence) null, str7, 0, (CharSequence) null, (Function1) null, 58, (Object) null);
                            Typography5 typography5OnActivityLayout3 = documentWalletContinuousBottomSheet.onActivityLayout();
                            if (typography5OnActivityLayout3 != null) {
                                typography5OnActivityLayout3.setText(strJoinToString$default);
                                int i6 = onActivityResized + 125;
                                onPostMessage = i6 % 128;
                                int i7 = i6 % 2;
                            }
                            Typography5 typography5OnActivityLayout4 = documentWalletContinuousBottomSheet.onActivityLayout();
                            if (typography5OnActivityLayout4 != null) {
                                int i8 = onActivityResized + 105;
                                onPostMessage = i8 % 128;
                                typography5OnActivityLayout4.setContentDescription(StringsKt.replace$default(strJoinToString$default, "~", "부터", i8 % 2 != 0, 4, (Object) null));
                            }
                        }
                    }
                } else {
                    Typography5 typography5OnActivityLayout5 = documentWalletContinuousBottomSheet.onActivityLayout();
                    if (typography5OnActivityLayout5 != null) {
                        int i9 = onActivityResized + 45;
                        onPostMessage = i9 % 128;
                        int i10 = i9 % 2;
                        typography5OnActivityLayout5.setText(documentWalletContinuousBottomSheet.onMessageChannelReady);
                        return null;
                    }
                }
            }
        }
        return null;
    }

    private final void access000(int i) {
        int i2 = 2 % 2;
        onExtraCallback onextracallback = (onExtraCallback) this.onTransact.invoke(Integer.valueOf(i), asBinder(i));
        if (onextracallback != null) {
            int i3 = onPostMessage + 75;
            onActivityResized = i3 % 128;
            int i4 = i3 % 2;
            BottomSheetHeader bottomSheetHeaderOnExtraCallbackWithResult = onExtraCallbackWithResult();
            if (bottomSheetHeaderOnExtraCallbackWithResult != null) {
                int i5 = onPostMessage + 121;
                onActivityResized = i5 % 128;
                if (i5 % 2 == 0) {
                    bottomSheetHeaderOnExtraCallbackWithResult.setTitle(onextracallback.onExtraCallbackWithResult());
                    int i6 = 94 / 0;
                } else {
                    bottomSheetHeaderOnExtraCallbackWithResult.setTitle(onextracallback.onExtraCallbackWithResult());
                }
                int i7 = onPostMessage + 25;
                onActivityResized = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 3 % 3;
                }
            }
            BottomSheetHeader bottomSheetHeaderOnExtraCallbackWithResult2 = onExtraCallbackWithResult();
            if (bottomSheetHeaderOnExtraCallbackWithResult2 != null) {
                int i9 = onPostMessage + 7;
                onActivityResized = i9 % 128;
                int i10 = i9 % 2;
                bottomSheetHeaderOnExtraCallbackWithResult2.setDescription(onextracallback.onWarmupCompleted());
                int i11 = onPostMessage + 25;
                onActivityResized = i11 % 128;
                int i12 = i11 % 2;
            }
        }
    }

    private static final boolean onNavigationEvent(success successVar, DocumentWalletContinuousBottomSheet documentWalletContinuousBottomSheet, int i, TextView textView, int i2, KeyEvent keyEvent) {
        int i3 = 2 % 2;
        if (i2 != 6) {
            return false;
        }
        Integer numValueOf = Integer.valueOf(successVar.onExtraCallback.onExtraCallback().onWarmupCompleted().intValue());
        if (numValueOf.intValue() <= 0) {
            int i4 = onPostMessage + 119;
            onActivityResized = i4 % 128;
            int i5 = i4 % 2;
            numValueOf = null;
        }
        if (numValueOf != null) {
            int i6 = onActivityResized + 53;
            onPostMessage = i6 % 128;
            int i7 = i6 % 2;
            documentWalletContinuousBottomSheet.onExtraCallback(i, String.valueOf(numValueOf.intValue()));
            int i8 = onActivityResized + 63;
            onPostMessage = i8 % 128;
            int i9 = i8 % 2;
        }
        int i10 = onPostMessage + 29;
        onActivityResized = i10 % 128;
        if (i10 % 2 != 0) {
            return true;
        }
        throw null;
    }

    private static final void onExtraCallback(success successVar) {
        int i = 2 % 2;
        int i2 = onPostMessage + 59;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {M_.onExtraCallback, successVar.onExtraCallback};
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        M_.onNavigationEvent(1312897292, objArr, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, -1312897289, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent2);
        int i4 = onPostMessage + 105;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 1 / 0;
        }
    }

    private final void IAuthTabCallbackStub(int i) {
        int i2 = 2 % 2;
        Typography5 typography5OnActivityLayout = onActivityLayout();
        if (typography5OnActivityLayout != null) {
            int i3 = onActivityResized + 29;
            onPostMessage = i3 % 128;
            int i4 = i3 % 2;
            typography5OnActivityLayout.setVisibility(8);
        }
        success successVar = this.IAuthTabCallback_Parcel;
        if (successVar == null) {
            int i5 = onPostMessage + 83;
            onActivityResized = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i7 = onActivityResized + 89;
            onPostMessage = i7 % 128;
            int i8 = i7 % 2;
            successVar = null;
        }
        successVar.onExtraCallback.onExtraCallback().setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(2)});
        successVar.onExtraCallback.onExtraCallback().setPrefix("최근");
        successVar.onExtraCallback.onExtraCallback().setSuffix("년");
        successVar.onExtraCallback.onExtraCallback().setOnEditorActionListener(new DocumentWalletContinuousBottomSheet$.ExternalSyntheticLambda1(successVar, this, i));
        successVar.onExtraCallback.postDelayed(new DocumentWalletContinuousBottomSheet$.ExternalSyntheticLambda2(successVar), 300L);
        successVar.onExtraCallbackWithResult.setOnClickListener(new DocumentWalletContinuousBottomSheet$.ExternalSyntheticLambda3(successVar, this, i));
    }

    private static final void onExtraCallback(success successVar, DocumentWalletContinuousBottomSheet documentWalletContinuousBottomSheet, int i, View view) {
        int i2 = 2 % 2;
        int i3 = onActivityResized + 89;
        onPostMessage = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Integer numValueOf = Integer.valueOf(successVar.onExtraCallback.onExtraCallback().onWarmupCompleted().intValue());
            if (numValueOf.intValue() <= 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                int i4 = onPostMessage + 113;
                onActivityResized = i4 % 128;
                int i5 = i4 % 2;
                int iIntValue = numValueOf.intValue();
                if (i5 != 0) {
                    documentWalletContinuousBottomSheet.onExtraCallback(i, String.valueOf(iIntValue));
                    return;
                } else {
                    documentWalletContinuousBottomSheet.onExtraCallback(i, String.valueOf(iIntValue));
                    obj.hashCode();
                    throw null;
                }
            }
            return;
        }
        Integer.valueOf(successVar.onExtraCallback.onExtraCallback().onWarmupCompleted().intValue()).intValue();
        throw null;
    }

    public static final class onExtraCallback {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        private final String onExtraCallbackWithResult;
        private final List<String> onNavigationEvent;
        private final String onWarmupCompleted;

        public onExtraCallback() {
            this(null, null, null, 7, null);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 21;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            if (this == obj) {
                int i5 = i2 + 37;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
            if (!(!(obj instanceof onExtraCallback))) {
                onExtraCallback onextracallback = (onExtraCallback) obj;
                if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, onextracallback.onExtraCallbackWithResult)) {
                    int i7 = onExtraCallback + 23;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    return false;
                }
                if (Intrinsics.areEqual(this.onWarmupCompleted, onextracallback.onWarmupCompleted)) {
                    if (Intrinsics.areEqual(this.onNavigationEvent, onextracallback.onNavigationEvent)) {
                        return true;
                    }
                    int i9 = IAuthTabCallback + 45;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % 2;
                    return false;
                }
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001c A[PHI: r1 r3
          0x001c: PHI (r1v11 java.lang.String) = (r1v4 java.lang.String), (r1v13 java.lang.String) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]
          0x001c: PHI (r3v8 int) = (r3v0 int), (r3v9 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x001a A[PHI: r3
          0x001a: PHI (r3v1 int) = (r3v0 int), (r3v9 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int hashCode() {
            String str;
            int iHashCode;
            int iHashCode2;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 83;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                str = this.onExtraCallbackWithResult;
                iHashCode = 1;
                iHashCode2 = str == null ? 0 : str.hashCode();
            } else {
                str = this.onExtraCallbackWithResult;
                iHashCode = 0;
                if (str == null) {
                }
            }
            String str2 = this.onWarmupCompleted;
            int iHashCode3 = str2 != null ? str2.hashCode() : 0;
            List<String> list = this.onNavigationEvent;
            if (list != null) {
                int i3 = onExtraCallback + 31;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                iHashCode = list.hashCode();
            }
            return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "StepInfo(title=" + this.onExtraCallbackWithResult + ", description=" + this.onWarmupCompleted + ", elements=" + this.onNavigationEvent + ")";
            int i2 = IAuthTabCallback + 53;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onExtraCallback(@Nullable String str, @Nullable String str2, @Nullable List<String> list) {
            this.onExtraCallbackWithResult = str;
            this.onWarmupCompleted = str2;
            this.onNavigationEvent = list;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onExtraCallback(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = IAuthTabCallback + 1;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 113;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
                str = null;
            }
            str2 = (i & 2) != 0 ? null : str2;
            if ((i & 4) != 0) {
                int i8 = IAuthTabCallback + 55;
                onExtraCallback = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 8 / 0;
                }
                int i10 = 2 % 2;
                list = null;
            }
            this(str, str2, list);
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 79;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            String str = this.onExtraCallbackWithResult;
            int i5 = i3 + 69;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 37 / 0;
            }
            return str;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 83;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            String str = this.onWarmupCompleted;
            int i5 = i3 + 7;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final List<String> onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 75;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            List<String> list = this.onNavigationEvent;
            int i4 = i3 + 115;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 14 / 0;
            }
            return list;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onNavigationEvent(int i) {
        boolean z;
        int i2 = 2 % 2;
        onExtraCallback onextracallback = (onExtraCallback) this.onTransact.invoke(Integer.valueOf(i), asBinder(i));
        if (onextracallback != null) {
            LinearLayout linearLayout = (LinearLayout) onExtraCallback(-1420344455, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{this}, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 1420344462, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback());
            if (linearLayout != null) {
                Context context = linearLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(1);
                Class cls = Integer.TYPE;
                ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
                Intrinsics.checkNotNull(layoutParams);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.width = -1;
                layoutParams2.height = -2;
                DisplayMetrics displayMetrics = linearLayout2.getContext().getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                linearLayout2.setMinimumHeight(varyMatches.onNavigationEvent(100, displayMetrics));
                linearLayout2.setLayoutParams(layoutParams);
                List<String> listOnNavigationEvent = onextracallback.onNavigationEvent();
                success successVar = null;
                if (Intrinsics.areEqual(listOnNavigationEvent != null ? (String) CollectionsKt.firstOrNull(listOnNavigationEvent) : null, "INPUT_RECENT_YEAR")) {
                    success successVarOnWarmupCompleted = success.onWarmupCompleted(getLayoutInflater());
                    Intrinsics.checkNotNullExpressionValue(successVarOnWarmupCompleted, "");
                    this.IAuthTabCallback_Parcel = successVarOnWarmupCompleted;
                    if (successVarOnWarmupCompleted == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        int i3 = onActivityResized + 85;
                        onPostMessage = i3 % 128;
                        int i4 = i3 % 2;
                    } else {
                        successVar = successVarOnWarmupCompleted;
                    }
                    linearLayout2.addView(successVar.onNavigationEvent());
                    IAuthTabCallbackStub(i);
                } else {
                    boolean zOnTransact = onTransact(i);
                    List<String> listOnNavigationEvent2 = onextracallback.onNavigationEvent();
                    if (listOnNavigationEvent2 != null) {
                        for (String str : listOnNavigationEvent2) {
                            Context context2 = linearLayout2.getContext();
                            Intrinsics.checkNotNullExpressionValue(context2, "");
                            TdsListRowV1View tdsListRowV1View = new TdsListRowV1View(context2, (AttributeSet) null, 0, true, 6, (DefaultConstructorMarker) null);
                            Function1<String, createFromParts> function1 = this.asBinder;
                            createFromParts createfromparts = function1 != null ? (createFromParts) function1.invoke(str) : null;
                            if (createfromparts != null) {
                                tdsListRowV1View.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW3A);
                                tdsListRowV1View.setCenterText1(str);
                                Context context3 = tdsListRowV1View.getContext();
                                int i5 = R.string.edoc_continuous_bottomsheet_land_code;
                                String strIAuthTabCallback = createfromparts.IAuthTabCallback();
                                if (strIAuthTabCallback == null) {
                                    int i6 = onActivityResized + 97;
                                    onPostMessage = i6 % 128;
                                    if (i6 % 2 != 0) {
                                        throw null;
                                    }
                                    strIAuthTabCallback = "";
                                }
                                tdsListRowV1View.setCenterText2(context3.getString(i5, strIAuthTabCallback));
                                Context context4 = tdsListRowV1View.getContext();
                                int i7 = R.string.edoc_continuous_bottomsheet_building_code;
                                String strOnExtraCallback = createfromparts.onExtraCallback();
                                if (strOnExtraCallback == null) {
                                    int i8 = onActivityResized + 89;
                                    onPostMessage = i8 % 128;
                                    if (i8 % 2 != 0) {
                                        throw null;
                                    }
                                    strOnExtraCallback = "";
                                }
                                tdsListRowV1View.setCenterText3(context4.getString(i7, strOnExtraCallback));
                                int i9 = onPostMessage + 19;
                                onActivityResized = i9 % 128;
                                int i10 = i9 % 2;
                                z = true;
                            } else {
                                tdsListRowV1View.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW1A);
                                tdsListRowV1View.setRightType(TdsListRowV1View.asBinder.ROW1A);
                                z = true;
                                if (!Intrinsics.areEqual(str, "INPUT_RECENT_YEAR")) {
                                    tdsListRowV1View.setCenterText1(str);
                                } else {
                                    int i11 = onActivityResized + 123;
                                    onPostMessage = i11 % 128;
                                    if (i11 % 2 != 0) {
                                        tdsListRowV1View.setCenterText1(tdsListRowV1View.getContext().getString(R.string.edoc_continuous_bottomsheet_direct_input));
                                        int i12 = 4 / 0;
                                    } else {
                                        tdsListRowV1View.setCenterText1(tdsListRowV1View.getContext().getString(R.string.edoc_continuous_bottomsheet_direct_input));
                                    }
                                }
                            }
                            tdsListRowV1View.setRightArrow(zOnTransact);
                            tdsListRowV1View.setOnClickListener(new DocumentWalletContinuousBottomSheet$.ExternalSyntheticLambda0(this, i, str));
                            setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout2, tdsListRowV1View);
                        }
                    }
                }
                setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, linearLayout2);
            }
        }
    }

    public static /* synthetic */ LinearLayout IAuthTabCallback(DocumentWalletContinuousBottomSheet documentWalletContinuousBottomSheet) {
        int iIAuthTabCallback = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        return (LinearLayout) onExtraCallback(-958242282, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{documentWalletContinuousBottomSheet}, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 958242285, iIAuthTabCallback);
    }

    public static /* synthetic */ Unit IAuthTabCallback(View view) {
        int iIAuthTabCallback = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        return (Unit) onExtraCallback(1090996355, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{view}, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), -1090996346, iIAuthTabCallback);
    }

    private final LinearLayout onWarmupCompleted() {
        int iIAuthTabCallback = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        return (LinearLayout) onExtraCallback(-1420344455, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{this}, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 1420344462, iIAuthTabCallback);
    }

    private static final Typography5 asInterface(DocumentWalletContinuousBottomSheet documentWalletContinuousBottomSheet) {
        int iIAuthTabCallback = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        return (Typography5) onExtraCallback(-1135954081, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{documentWalletContinuousBottomSheet}, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 1135954086, iIAuthTabCallback);
    }

    private final void IAuthTabCallbackDefault(int i) {
        onExtraCallback(969346142, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{this, Integer.valueOf(i)}, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), -969346134, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback());
    }

    private static final MaxHeightScrollView IAuthTabCallback_Parcel(DocumentWalletContinuousBottomSheet documentWalletContinuousBottomSheet) {
        int iIAuthTabCallback = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        return (MaxHeightScrollView) onExtraCallback(-321444416, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{documentWalletContinuousBottomSheet}, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 321444418, iIAuthTabCallback);
    }

    private final void getInterfaceDescriptor(int i) {
        onExtraCallback(-618297975, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{this, Integer.valueOf(i)}, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 618297975, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback());
    }

    private static final Unit IAuthTabCallback_Parcel(DocumentWalletContinuousBottomSheet documentWalletContinuousBottomSheet, View view) {
        int iIAuthTabCallback = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        return (Unit) onExtraCallback(-643989993, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{documentWalletContinuousBottomSheet, view}, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 643989997, iIAuthTabCallback);
    }

    private static final Unit access100(DocumentWalletContinuousBottomSheet documentWalletContinuousBottomSheet, View view) {
        int iIAuthTabCallback = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        return (Unit) onExtraCallback(-1423464960, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{documentWalletContinuousBottomSheet, view}, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 1423464961, iIAuthTabCallback);
    }

    private static final Unit access000(View view) {
        int iIAuthTabCallback = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        return (Unit) onExtraCallback(136644728, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{view}, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), -136644718, iIAuthTabCallback);
    }

    private static final Typography5 access000(DocumentWalletContinuousBottomSheet documentWalletContinuousBottomSheet) {
        int iIAuthTabCallback = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        return (Typography5) onExtraCallback(1296188114, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{documentWalletContinuousBottomSheet}, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), -1296188108, iIAuthTabCallback);
    }
}
