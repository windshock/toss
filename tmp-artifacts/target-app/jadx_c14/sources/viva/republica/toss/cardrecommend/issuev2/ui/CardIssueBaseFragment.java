package viva.republica.toss.cardrecommend.issuev2.ui;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.facebook.react.uimanager.LayoutShadowNode;
import im.toss.base.BaseFragment;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CertificationRequest;
import o.DynamicLoader;
import o.ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda2;
import o.ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda7;
import o.ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8;
import o.FlowRowOverflowScopeImplExternalSyntheticLambda1;
import o.RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1;
import o.RippleNode;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.TypographyKtExternalSyntheticLambda0;
import o.createAdSizeApi;
import o.extraCommand;
import o.getDigestAlgorithms;
import o.getEncryptedData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class CardIssueBaseFragment<L extends getEncryptedData> extends BaseFragment {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int[] onNavigationEvent = {369058400, 284017819, -790487612, 545832097, 860125196, -582877825, -1763081784, 864098204, 748503033, -978400224, -1121104802, -1560523733, -1578247151, -1415081515, -533631988, -633617219, 1588401721, 692799268};
    private final Lazy IAuthTabCallback;
    private final boolean onWarmupCompleted;

    public static /* synthetic */ Unit onExtraCallbackWithResult(CardIssueBaseFragment cardIssueBaseFragment, OnBackPressedCallback onBackPressedCallback) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(cardIssueBaseFragment, onBackPressedCallback);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(cardIssueBaseFragment, onBackPressedCallback);
        int i3 = onExtraCallbackWithResult + 29;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }

    public boolean extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 49;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 45;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 10 / 0;
        }
        return 1009533L;
    }

    public CardIssueBaseFragment() {
        this.IAuthTabCallback = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(CardIssueOverviewViewModel.class), new onNavigationEvent(this), new onWarmupCompleted(null, this), new onExtraCallback(this));
        this.onWarmupCompleted = true;
    }

    public CardIssueBaseFragment(int i) {
        super(i);
        this.IAuthTabCallback = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(CardIssueOverviewViewModel.class), new IAuthTabCallback(this), new onExtraCallbackWithResult(null, this), new IAuthTabCallbackDefault(this));
        this.onWarmupCompleted = true;
    }

    public final getDigestAlgorithms<L> writeTypedObject() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Parcelable parcelable = requireArguments().getParcelable("navigator");
        Intrinsics.checkNotNull(parcelable);
        getDigestAlgorithms<L> getdigestalgorithms = (getDigestAlgorithms) parcelable;
        int i4 = onExtraCallback + 53;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return getdigestalgorithms;
    }

    public final L readTypedObject() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        L l = (L) getDigestAlgorithms.IAuthTabCallback(1377327355, new Object[]{writeTypedObject()}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1377327352, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
        int i3 = onExtraCallback + 21;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return l;
        }
        obj.hashCode();
        throw null;
    }

    public final CardIssueOverviewViewModel extraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        CardIssueOverviewViewModel cardIssueOverviewViewModel = (CardIssueOverviewViewModel) this.IAuthTabCallback.getValue();
        int i4 = onExtraCallback + 51;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return cardIssueOverviewViewModel;
    }

    public boolean ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        boolean z = this.onWarmupCompleted;
        int i5 = i3 + 9;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public Map<String, Object> getScreenParams() throws Throwable {
        int i = 2 % 2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("card_id", extraCallback().IAuthTabCallbackStub());
        linkedHashMap.put("funnel_id", extraCallback().getInterfaceDescriptor());
        linkedHashMap.put("session_id", extraCallback().ICustomTabsCallbackStubProxy());
        linkedHashMap.put("screen_type", readTypedObject().onExtraCallback());
        Object[] objArr = new Object[1];
        b(new int[]{783631064, -1479892907, 267922447, 1561523759}, 9 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr);
        linkedHashMap.put(((String) objArr[0]).intern(), extraCallback().onActivityResized());
        linkedHashMap.put("referrer_item_id", extraCallback().onPostMessage());
        linkedHashMap.put("service_referrer", extraCallback().ICustomTabsCallbackStub());
        Map<String, Object> interfaceDescriptor = readTypedObject().getInterfaceDescriptor();
        Object obj = null;
        if (interfaceDescriptor != null) {
            int i2 = onExtraCallbackWithResult + 101;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            linkedHashMap.putAll(interfaceDescriptor);
            if (i3 == 0) {
                obj.hashCode();
                throw null;
            }
        }
        int i4 = onExtraCallbackWithResult + 23;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return linkedHashMap;
        }
        obj.hashCode();
        throw null;
    }

    public boolean onTrackView() {
        boolean zOnTrackView;
        getEncryptedData typedObject;
        int i = 2 % 2;
        boolean z = false;
        if (readTypedObject().IAuthTabCallback_Parcel()) {
            int i2 = onExtraCallbackWithResult + 21;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = onExtraCallbackWithResult + 19;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            zOnTrackView = super/*im.toss.uikit.base.UIKitBaseFragment*/.onTrackView();
            typedObject = readTypedObject();
        } else {
            zOnTrackView = super/*im.toss.uikit.base.UIKitBaseFragment*/.onTrackView();
            typedObject = readTypedObject();
            z = true;
        }
        typedObject.IAuthTabCallback(z);
        return zOnTrackView;
    }

    private static final Unit onWarmupCompleted(CardIssueBaseFragment cardIssueBaseFragment, OnBackPressedCallback onBackPressedCallback) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "");
        cardIssueBaseFragment.onPostMessage();
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 95;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 28 / 0;
        }
        return unit;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        extraCommand.IAuthTabCallback(requireBaseActivity().getOnBackPressedDispatcher(), this, false, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBaseFragment$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return CardIssueBaseFragment.onExtraCallbackWithResult(this.f$0, (OnBackPressedCallback) obj);
            }
        }, 2, (Object) null);
        setHasOptionsMenu(true);
        int i2 = onExtraCallback + 115;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    public void onCreateOptionsMenu(@NotNull Menu menu, @NotNull MenuInflater menuInflater) {
        MenuItem menuItemFindItem;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(menu, "");
        Intrinsics.checkNotNullParameter(menuInflater, "");
        if (ICustomTabsCallback()) {
            int i2 = onExtraCallbackWithResult + 67;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                menuInflater.inflate(R.menu.menu_card_issue, menu);
                menuItemFindItem = menu.findItem(R.id.menu_text);
                int i3 = 88 / 0;
                if (menuItemFindItem == null) {
                    return;
                }
            } else {
                menuInflater.inflate(R.menu.menu_card_issue, menu);
                menuItemFindItem = menu.findItem(R.id.menu_text);
                if (menuItemFindItem == null) {
                    return;
                }
            }
            if (readTypedObject().asBinder() != null) {
                menuItemFindItem.setVisible(true);
                DynamicLoader dynamicLoaderAsBinder = readTypedObject().asBinder();
                menuItemFindItem.setTitle(dynamicLoaderAsBinder != null ? dynamicLoaderAsBinder.onNavigationEvent() : null);
                return;
            }
            int i4 = onExtraCallback + 15;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            menuItemFindItem.setVisible(false);
            int i6 = onExtraCallback + 47;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 39 / 0;
            }
        }
    }

    public boolean onOptionsItemSelected(@NotNull MenuItem menuItem) {
        String string;
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onExtraCallbackWithResult = i2 % 128;
        String str = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(menuItem, "");
            ICustomTabsCallback();
            throw null;
        }
        Intrinsics.checkNotNullParameter(menuItem, "");
        if (!ICustomTabsCallback()) {
            return false;
        }
        if (menuItem.getItemId() != R.id.menu_text) {
            return super.onOptionsItemSelected(menuItem);
        }
        int i3 = onExtraCallback + 21;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        getDigestAlgorithms<L> getdigestalgorithmsWriteTypedObject = writeTypedObject();
        TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0OnNavigationEvent = RippleNode.onNavigationEvent(this);
        DynamicLoader dynamicLoaderAsBinder = readTypedObject().asBinder();
        createAdSizeApi createadsizeapiOnWarmupCompleted = dynamicLoaderAsBinder != null ? dynamicLoaderAsBinder.onWarmupCompleted() : null;
        CardIssueOverviewViewModel cardIssueOverviewViewModelExtraCallback = extraCallback();
        CharSequence title = menuItem.getTitle();
        if (title != null) {
            int i5 = onExtraCallbackWithResult + 71;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                string = title.toString();
                int i6 = 10 / 0;
            } else {
                string = title.toString();
            }
            str = string;
        }
        getDigestAlgorithms.onExtraCallbackWithResult(getdigestalgorithmsWriteTypedObject, typographyKtExternalSyntheticLambda0OnNavigationEvent, createadsizeapiOnWarmupCompleted, cardIssueOverviewViewModelExtraCallback, str, (RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1) null, 16, (Object) null);
        return true;
    }

    public final void onPostMessage() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            getEncryptedData getencrypteddataIAuthTabCallbackDefault = readTypedObject().IAuthTabCallbackDefault();
            CertificationRequest typedObject = extraCallback().readTypedObject();
            if (getencrypteddataIAuthTabCallbackDefault != null) {
                ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda7 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda7AsBinder = RippleNode.onNavigationEvent(this).asBinder();
                TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0OnNavigationEvent = RippleNode.onNavigationEvent(this);
                ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 = new ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8(typographyKtExternalSyntheticLambda0OnNavigationEvent.IAuthTabCallback_Parcel(), 0, getencrypteddataIAuthTabCallbackDefault.access100());
                getencrypteddataIAuthTabCallbackDefault.onExtraCallbackWithResult(RippleNode.onNavigationEvent(this), exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, new getDigestAlgorithms<>(getencrypteddataIAuthTabCallbackDefault, writeTypedObject().onExtraCallback(), writeTypedObject().onNavigationEvent(), null, false, null, 48, null), extraCallback());
                exposedDropdownMenuPopup_androidKtExternalSyntheticLambda7AsBinder.onExtraCallback(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.onExtraCallback());
                ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda2 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2AsInterface = RippleNode.onNavigationEvent(this).asInterface();
                if (exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2AsInterface != null) {
                    exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2AsInterface.IAuthTabCallback(getencrypteddataIAuthTabCallbackDefault.access100(), getencrypteddataIAuthTabCallbackDefault.access100());
                }
                getDigestAlgorithms.onWarmupCompleted(writeTypedObject(), RippleNode.onNavigationEvent(this), getencrypteddataIAuthTabCallbackDefault, extraCallback(), null, "back_button", null, 40, null);
                return;
            }
            if (!extraCallbackWithResult()) {
                readTypedObject().IAuthTabCallback(false);
            }
            if (onActivityLayout()) {
                return;
            }
            int i3 = onExtraCallbackWithResult + 31;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (typedObject != null) {
                ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda7 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda7AsBinder2 = RippleNode.onNavigationEvent(this).asBinder();
                TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0OnNavigationEvent2 = RippleNode.onNavigationEvent(this);
                ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda82 = new ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8(typographyKtExternalSyntheticLambda0OnNavigationEvent2.IAuthTabCallback_Parcel(), 0, typedObject.access100());
                typedObject.onExtraCallbackWithResult(RippleNode.onNavigationEvent(this), exposedDropdownMenuPopup_androidKtExternalSyntheticLambda82, new getDigestAlgorithms<>(typedObject, writeTypedObject().onExtraCallback(), writeTypedObject().onNavigationEvent(), null, false, null, 48, null), extraCallback());
                exposedDropdownMenuPopup_androidKtExternalSyntheticLambda7AsBinder2.onExtraCallback(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda82.onExtraCallback());
                ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda2 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2AsInterface2 = RippleNode.onNavigationEvent(this).asInterface();
                if (exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2AsInterface2 != null) {
                    exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2AsInterface2.IAuthTabCallback(typedObject.access100(), typedObject.access100());
                }
                getDigestAlgorithms.onWarmupCompleted(writeTypedObject(), RippleNode.onNavigationEvent(this), typedObject, extraCallback(), null, "back_button", null, 40, null);
                return;
            }
            requireBaseActivity().finish();
            return;
        }
        readTypedObject().IAuthTabCallbackDefault();
        extraCallback().readTypedObject();
        obj.hashCode();
        throw null;
    }

    public final boolean onActivityLayout() {
        Object obj;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        if (!isAdded() || getView() == null) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
            return false;
        }
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(RippleNode.onNavigationEvent(this));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.onExtraCallback(obj)) {
            obj = null;
        }
        TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0 = (TypographyKtExternalSyntheticLambda0) obj;
        if (typographyKtExternalSyntheticLambda0 == null) {
            return false;
        }
        try {
            if (typographyKtExternalSyntheticLambda0.onWarmupCompleted() == null) {
                FragmentActivity activity2 = getActivity();
                if (activity2 == null) {
                    return false;
                }
                activity2.finish();
                return false;
            }
            int i4 = onExtraCallbackWithResult + 13;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return typographyKtExternalSyntheticLambda0.getInterfaceDescriptor();
            }
            typographyKtExternalSyntheticLambda0.getInterfaceDescriptor();
            throw null;
        } catch (IllegalStateException unused) {
            FragmentActivity activity3 = getActivity();
            if (activity3 == null) {
                return false;
            }
            activity3.finish();
            return false;
        }
    }

    private static void b(int[] iArr, int i, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = onNavigationEvent;
        int i4 = -1469660336;
        int i5 = 0;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i6 = $10 + 77;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 0;
            while (i8 < length2) {
                int i9 = $10 + 103;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr3[i8])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(0, 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 72, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 8847, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr4[i8] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        i8--;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(iArr3[i8])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(""), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 71, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr4[i8] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        i8++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i4 = -1469660336;
            }
            int i10 = $10 + 81;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = onNavigationEvent;
        if (iArr6 != null) {
            int i12 = $11 + 53;
            $10 = i12 % 128;
            if (i12 % 2 != 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 0;
            }
            while (i2 < length) {
                Object[] objArr4 = new Object[1];
                objArr4[i5] = Integer.valueOf(iArr6[i2]);
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), TextUtils.indexOf("", "") + 72, 8848 - TextUtils.indexOf("", ""), -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr2[i2] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                i2++;
                i5 = 0;
            }
            iArr6 = iArr2;
        }
        int i13 = i5;
        System.arraycopy(iArr6, i13, iArr5, i13, length3);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i13;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i14 = $10 + 93;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            int i16 = 0;
            for (int i17 = 16; i16 < i17; i17 = 16) {
                int i18 = $10 + 21;
                $11 = i18 % 128;
                int i19 = i18 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[i16];
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTouchSlop() >> 8) + 22252), 39 - View.resolveSizeAndState(0, 0, 0), 10301 - KeyEvent.normalizeMetaState(0), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i16++;
            }
            int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i20;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr5[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[17];
            int i21 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i22 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.getDefaultSize(0, 0) + 4033), 78 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 7398 - (ViewConfiguration.getTouchSlop() >> 8), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public static final class IAuthTabCallback extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 invoke() {
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
            return viewModelStore;
        }
    }

    public static final class onNavigationEvent extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onNavigationEvent(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 invoke() {
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
            return viewModelStore;
        }
    }

    public static final class onExtraCallbackWithResult extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallbackWithResult(Function0 function0, Fragment fragment) {
            super(0);
            this.$extrasProducer = function0;
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 invoke() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            Function0 function0 = this.$extrasProducer;
            if (function0 != null && (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) != null) {
                return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            }
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 defaultViewModelCreationExtras = this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
            return defaultViewModelCreationExtras;
        }
    }

    public static final class onWarmupCompleted extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(Function0 function0, Fragment fragment) {
            super(0);
            this.$extrasProducer = function0;
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 invoke() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            Function0 function0 = this.$extrasProducer;
            if (function0 != null && (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) != null) {
                return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            }
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 defaultViewModelCreationExtras = this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
            return defaultViewModelCreationExtras;
        }
    }

    public static final class IAuthTabCallbackDefault extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallbackDefault(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.onWarmupCompleted invoke() {
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
            return defaultViewModelProviderFactory;
        }
    }

    public static final class onExtraCallback extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallback(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.onWarmupCompleted invoke() {
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
            return defaultViewModelProviderFactory;
        }
    }
}
