package com.swmansion.rnscreens;

import android.graphics.Color;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNSSearchBarManagerDelegate;
import com.facebook.react.viewmanagers.RNSSearchBarManagerInterface;
import com.swmansion.rnscreens.SearchBarView;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CredentialProviderGetSignInIntentControllerhandleResponse2;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.access8100;
import o.getWrite;
import o.r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ReactModule(IAuthTabCallback = SearchBarManager.REACT_CLASS)
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class SearchBarManager extends ViewGroupManager<SearchBarView> implements RNSSearchBarManagerInterface<SearchBarView> {
    public static final Companion Companion;
    private static long IAuthTabCallback = 0;
    public static final String REACT_CLASS = "RNSSearchBar";
    private static int onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static int onWarmupCompleted;
    private final r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ<SearchBarView> delegate;
    private static final byte[] $$a = {9, 8, 112, 107};
    private static final int $$b = 83;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallback = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, int i2) {
        int i3;
        int i4 = (i * 2) + 1;
        byte[] bArr = $$a;
        int i5 = (i2 * 2) + 4;
        int i6 = s + 109;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i7 = i6;
            i6 = i4;
            i3 = 0;
            i6 += i7;
            i5++;
            bArr2[i3] = (byte) i6;
            i3++;
            if (i3 == i4) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i5];
            i6 += i7;
            i5++;
            bArr2[i3] = (byte) i6;
            i3++;
            if (i3 == i4) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i6;
            i3++;
            if (i3 == i4) {
            }
        }
    }

    static {
        onWarmupCompleted = 1;
        onExtraCallback();
        Companion = new Companion((DefaultConstructorMarker) null);
        int i = onExtraCallback + 29;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public SearchBarManager() {
        super((ReactApplicationContext) null, 1, (DefaultConstructorMarker) null);
        this.delegate = new RNSSearchBarManagerDelegate(this);
    }

    public /* bridge */ /* synthetic */ void blur(View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 19;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        blur((SearchBarView) view);
        int i4 = IAuthTabCallbackDefault + 25;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 62 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void cancelSearch(View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 41;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        cancelSearch((SearchBarView) view);
        int i4 = IAuthTabCallbackDefault + 123;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void clearText(View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 99;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        clearText((SearchBarView) view);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackDefault + 31;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 56 / 0;
        }
    }

    public /* bridge */ /* synthetic */ View createViewInstance(CredentialProviderGetSignInIntentControllerhandleResponse2 credentialProviderGetSignInIntentControllerhandleResponse2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 63;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        SearchBarView searchBarViewM15createViewInstance = m15createViewInstance(credentialProviderGetSignInIntentControllerhandleResponse2);
        int i4 = IAuthTabCallbackDefault + 107;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return searchBarViewM15createViewInstance;
        }
        throw null;
    }

    public /* bridge */ /* synthetic */ void focus(View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 27;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        focus((SearchBarView) view);
        int i4 = IAuthTabCallbackDefault + 91;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 89;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onAfterUpdateTransaction((SearchBarView) view);
        int i4 = IAuthTabCallbackDefault + 17;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void setAllowToolbarIntegration(View view, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 29;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        setAllowToolbarIntegration((SearchBarView) view, z);
        int i4 = IAuthTabCallbackStub + 17;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void setAutoCapitalize(View view, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 91;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        setAutoCapitalize((SearchBarView) view, str);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void setAutoFocus(View view, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 117;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        setAutoFocus((SearchBarView) view, z);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void setBarTintColor(View view, Integer num) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 55;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        setBarTintColor((SearchBarView) view, num);
        int i4 = IAuthTabCallbackDefault + 117;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void setCancelButtonText(View view, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 107;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        setCancelButtonText((SearchBarView) view, str);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void setDisableBackButtonOverride(View view, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 29;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        setDisableBackButtonOverride((SearchBarView) view, z);
        if (i3 == 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void setHeaderIconColor(View view, Integer num) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 113;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        setHeaderIconColor((SearchBarView) view, num);
        int i4 = IAuthTabCallbackDefault + 79;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 67 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void setHideNavigationBar(View view, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 9;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        setHideNavigationBar((SearchBarView) view, str);
        int i4 = IAuthTabCallbackDefault + 125;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void setHideWhenScrolling(View view, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 107;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        setHideWhenScrolling((SearchBarView) view, z);
        if (i3 != 0) {
            int i4 = 18 / 0;
        }
        int i5 = IAuthTabCallbackStub + 57;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* bridge */ /* synthetic */ void setHintTextColor(View view, Integer num) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 93;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        setHintTextColor((SearchBarView) view, num);
        if (i3 != 0) {
            int i4 = 46 / 0;
        }
        int i5 = IAuthTabCallbackDefault + 123;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void setInputType(View view, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 35;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        setInputType((SearchBarView) view, str);
        int i4 = IAuthTabCallbackStub + 11;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void setObscureBackground(View view, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 39;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        setObscureBackground((SearchBarView) view, str);
        int i4 = IAuthTabCallbackStub + 117;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void setPlaceholder(View view, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 91;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        setPlaceholder((SearchBarView) view, str);
        int i4 = IAuthTabCallbackDefault + 117;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void setPlacement(View view, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 49;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        setPlacement((SearchBarView) view, str);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackDefault + 55;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void setShouldShowHintSearchIcon(View view, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 13;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        setShouldShowHintSearchIcon((SearchBarView) view, z);
        if (i3 == 0) {
            int i4 = 74 / 0;
        }
        int i5 = IAuthTabCallbackDefault + 67;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void setText(View view, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 97;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        setText((SearchBarView) view, str);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void setTextColor(View view, Integer num) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 103;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        setTextColor((SearchBarView) view, num);
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackDefault + 111;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void setTintColor(View view, Integer num) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 43;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        setTintColor((SearchBarView) view, num);
        if (i3 == 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackDefault + 9;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void toggleCancelButton(View view, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 91;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        toggleCancelButton((SearchBarView) view, z);
        int i4 = IAuthTabCallbackDefault + 83;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ<SearchBarView> getDelegate() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 119;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ<SearchBarView> r8lambdafabcsqiuodz2nkxqdax2sri9ddq = this.delegate;
        int i4 = i3 + 95;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return r8lambdafabcsqiuodz2nkxqdax2sri9ddq;
        }
        throw null;
    }

    public String getName() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 87;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return REACT_CLASS;
        }
        throw null;
    }

    /* renamed from: createViewInstance, reason: collision with other method in class */
    protected SearchBarView m15createViewInstance(@NotNull CredentialProviderGetSignInIntentControllerhandleResponse2 credentialProviderGetSignInIntentControllerhandleResponse2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(credentialProviderGetSignInIntentControllerhandleResponse2, "");
        SearchBarView searchBarView = new SearchBarView(credentialProviderGetSignInIntentControllerhandleResponse2);
        int i2 = IAuthTabCallbackStub + 3;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return searchBarView;
    }

    protected void onAfterUpdateTransaction(@NotNull SearchBarView searchBarView) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 27;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(searchBarView, "");
        super/*com.facebook.react.uimanager.BaseViewManager*/.onAfterUpdateTransaction(searchBarView);
        searchBarView.onUpdate();
        int i4 = IAuthTabCallbackDefault + 83;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.facebook.react.bridge.JSApplicationIllegalArgumentException */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (r11.equals(((java.lang.String) r0[0]).intern()) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a7, code lost:
    
        if (r11.equals("systemDefault") != false) goto L33;
     */
    @ReactProp(IAuthTabCallbackStub = "autoCapitalize")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setAutoCapitalize(@NotNull SearchBarView searchBarView, @Nullable String str) throws Throwable {
        SearchBarView.SearchBarAutoCapitalize searchBarAutoCapitalize;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(searchBarView, "");
        if (str != null) {
            int i2 = IAuthTabCallbackDefault + 13;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                str.hashCode();
                throw null;
            }
            switch (str.hashCode()) {
                case -721225454:
                    break;
                case 3387192:
                    Object[] objArr = new Object[1];
                    b((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 23513), new char[]{712, 11776, 45240, 42471}, new char[]{43772, 51199, 55858, 2651}, new char[]{63321, 6562, 38663, 30684}, objArr);
                    break;
                case 113318569:
                    if (str.equals("words")) {
                        searchBarAutoCapitalize = SearchBarView.SearchBarAutoCapitalize.WORDS;
                        break;
                    }
                    throw new JSApplicationIllegalArgumentException("Forbidden auto capitalize value passed");
                case 490141296:
                    if (str.equals("sentences")) {
                        int i3 = IAuthTabCallbackStub + 83;
                        IAuthTabCallbackDefault = i3 % 128;
                        int i4 = i3 % 2;
                        searchBarAutoCapitalize = SearchBarView.SearchBarAutoCapitalize.SENTENCES;
                        int i5 = IAuthTabCallbackStub + 117;
                        IAuthTabCallbackDefault = i5 % 128;
                        if (i5 % 2 != 0) {
                            int i6 = 5 % 2;
                            break;
                        }
                    }
                    throw new JSApplicationIllegalArgumentException("Forbidden auto capitalize value passed");
                case 1245424234:
                    if (str.equals("characters")) {
                        int i7 = IAuthTabCallbackDefault + 79;
                        IAuthTabCallbackStub = i7 % 128;
                        if (i7 % 2 != 0) {
                            searchBarAutoCapitalize = SearchBarView.SearchBarAutoCapitalize.CHARACTERS;
                            break;
                        } else {
                            searchBarAutoCapitalize = SearchBarView.SearchBarAutoCapitalize.CHARACTERS;
                            int i8 = 73 / 0;
                            break;
                        }
                    }
                    throw new JSApplicationIllegalArgumentException("Forbidden auto capitalize value passed");
                default:
                    throw new JSApplicationIllegalArgumentException("Forbidden auto capitalize value passed");
            }
        } else {
            searchBarAutoCapitalize = SearchBarView.SearchBarAutoCapitalize.NONE;
        }
        searchBarView.setAutoCapitalize(searchBarAutoCapitalize);
    }

    @ReactProp(IAuthTabCallbackStub = "autoFocus")
    public void setAutoFocus(@NotNull SearchBarView searchBarView, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 105;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(searchBarView, "");
        searchBarView.setAutoFocus(z);
        int i4 = IAuthTabCallbackDefault + 75;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @ReactProp(IAuthTabCallbackStub = "barTintColor", onWarmupCompleted = "Color")
    public void setBarTintColor(@NotNull SearchBarView searchBarView, @Nullable Integer num) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 101;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(searchBarView, "");
            searchBarView.setTintColor(num);
        } else {
            Intrinsics.checkNotNullParameter(searchBarView, "");
            searchBarView.setTintColor(num);
            throw null;
        }
    }

    @ReactProp(IAuthTabCallbackStub = "disableBackButtonOverride")
    public void setDisableBackButtonOverride(@NotNull SearchBarView searchBarView, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 25;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(searchBarView, "");
        boolean z2 = true;
        if (!z) {
            int i4 = IAuthTabCallbackStub + 93;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
        } else {
            int i6 = IAuthTabCallbackDefault + 125;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            z2 = false;
        }
        searchBarView.setShouldOverrideBackButton(z2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.facebook.react.bridge.JSApplicationIllegalArgumentException */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0083, code lost:
    
        if (r12.equals(((java.lang.String) r1[0]).intern()) != false) goto L26;
     */
    @ReactProp(IAuthTabCallbackStub = "inputType")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setInputType(@NotNull SearchBarView searchBarView, @Nullable String str) throws Throwable {
        SearchBarView.SearchBarInputTypes searchBarInputTypes;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 79;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(searchBarView, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(searchBarView, "");
        if (str != null) {
            int i3 = IAuthTabCallbackStub + 15;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            switch (str.hashCode()) {
                case -1034364087:
                    if (str.equals("number")) {
                        searchBarInputTypes = SearchBarView.SearchBarInputTypes.NUMBER;
                        break;
                    }
                    throw new JSApplicationIllegalArgumentException("Forbidden input type value");
                case 3556653:
                    Object[] objArr = new Object[1];
                    b(ViewConfiguration.getEdgeSlop() >> 16, (char) ((Process.myPid() >> 22) + 55304), new char[]{24360, 41315, 49365, 50600}, new char[]{27810, 24415, 2163, 36568}, new char[]{63321, 6562, 38663, 30684}, objArr);
                    break;
                case 96619420:
                    if (str.equals("email")) {
                        int i5 = IAuthTabCallbackStub + 9;
                        IAuthTabCallbackDefault = i5 % 128;
                        if (i5 % 2 == 0) {
                            searchBarInputTypes = SearchBarView.SearchBarInputTypes.EMAIL;
                            break;
                        } else {
                            searchBarInputTypes = SearchBarView.SearchBarInputTypes.EMAIL;
                            int i6 = 95 / 0;
                            break;
                        }
                    }
                    throw new JSApplicationIllegalArgumentException("Forbidden input type value");
                case 106642798:
                    if (str.equals("phone")) {
                        searchBarInputTypes = SearchBarView.SearchBarInputTypes.PHONE;
                        break;
                    }
                    throw new JSApplicationIllegalArgumentException("Forbidden input type value");
                default:
                    throw new JSApplicationIllegalArgumentException("Forbidden input type value");
            }
        } else {
            searchBarInputTypes = SearchBarView.SearchBarInputTypes.TEXT;
            int i7 = IAuthTabCallbackStub + 91;
            IAuthTabCallbackDefault = i7 % 128;
            int i8 = i7 % 2;
        }
        searchBarView.setInputType(searchBarInputTypes);
    }

    @ReactProp(IAuthTabCallbackStub = "placeholder")
    public void setPlaceholder(@NotNull SearchBarView searchBarView, @Nullable String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 93;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(searchBarView, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(searchBarView, "");
        if (str != null) {
            int i3 = IAuthTabCallbackDefault + 47;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            searchBarView.setPlaceholder(str);
            if (i4 == 0) {
                int i5 = 19 / 0;
            }
        }
    }

    @ReactProp(IAuthTabCallbackStub = "textColor", onWarmupCompleted = "Color")
    public void setTextColor(@NotNull SearchBarView searchBarView, @Nullable Integer num) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 33;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(searchBarView, "");
            searchBarView.setTextColor(num);
            throw null;
        }
        Intrinsics.checkNotNullParameter(searchBarView, "");
        searchBarView.setTextColor(num);
        int i3 = IAuthTabCallbackDefault + 47;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @ReactProp(IAuthTabCallbackStub = "headerIconColor", onWarmupCompleted = "Color")
    public void setHeaderIconColor(@NotNull SearchBarView searchBarView, @Nullable Integer num) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 5;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(searchBarView, "");
        searchBarView.setHeaderIconColor(num);
        int i4 = IAuthTabCallbackStub + 65;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void b(int i, char c, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i5 = $11 + 119;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i7 = $11 + 11;
            $10 = i7 % 128;
            int i8 = i7 % i3;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 43;
                    int defaultSize = 1451 - View.getDefaultSize(0, 0);
                    byte b = (byte) ($$b & 5);
                    byte b2 = (byte) (b - 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(keyRepeatDelay, threadPriority, defaultSize, 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') + 49075), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 45, (Process.myTid() >> 22) + 1494, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 23972), 50 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 22939 - View.resolveSizeAndState(0, 0, 0), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    i2 = 2;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0) + 45849), Color.rgb(0, 0, 0) + 16777245, 12577 - View.MeasureSpec.getSize(0), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (IAuthTabCallback ^ 7798559133331975163L)) ^ ((int) (onExtraCallbackWithResult ^ 7798559133331975163L))) ^ ((char) (onNavigationEvent ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                i3 = i2;
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

    @ReactProp(IAuthTabCallbackStub = "hintTextColor", onWarmupCompleted = "Color")
    public void setHintTextColor(@NotNull SearchBarView searchBarView, @Nullable Integer num) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 35;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(searchBarView, "");
        searchBarView.setHintTextColor(num);
        int i4 = IAuthTabCallbackDefault + 27;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 30 / 0;
        }
    }

    @ReactProp(IAuthTabCallbackStub = "shouldShowHintSearchIcon")
    public void setShouldShowHintSearchIcon(@NotNull SearchBarView searchBarView, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 19;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(searchBarView, "");
        searchBarView.setShouldShowHintSearchIcon(z);
        int i4 = IAuthTabCallbackStub + 13;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 17;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        HashMap mapOnExtraCallbackWithResult = access8100.onExtraCallbackWithResult(new Pair[]{getWrite.IAuthTabCallback("topSearchBlur", access8100.onExtraCallbackWithResult(new Pair[]{getWrite.IAuthTabCallback("registrationName", "onSearchBlur")})), getWrite.IAuthTabCallback("topChangeText", access8100.onExtraCallbackWithResult(new Pair[]{getWrite.IAuthTabCallback("registrationName", "onChangeText")})), getWrite.IAuthTabCallback("topClose", access8100.onExtraCallbackWithResult(new Pair[]{getWrite.IAuthTabCallback("registrationName", "onClose")})), getWrite.IAuthTabCallback("topSearchFocus", access8100.onExtraCallbackWithResult(new Pair[]{getWrite.IAuthTabCallback("registrationName", "onSearchFocus")})), getWrite.IAuthTabCallback("topOpen", access8100.onExtraCallbackWithResult(new Pair[]{getWrite.IAuthTabCallback("registrationName", "onOpen")})), getWrite.IAuthTabCallback("topSearchButtonPress", access8100.onExtraCallbackWithResult(new Pair[]{getWrite.IAuthTabCallback("registrationName", "onSearchButtonPress")}))});
        int i4 = IAuthTabCallbackStub + 51;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return mapOnExtraCallbackWithResult;
        }
        throw null;
    }

    private final void logNotAvailable(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 3;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public void blur(@Nullable SearchBarView searchBarView) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 69;
        IAuthTabCallbackDefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (searchBarView != null) {
            int i4 = i2 + 87;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            searchBarView.handleBlurJsRequest();
            if (i5 != 0) {
                obj.hashCode();
                throw null;
            }
        }
        int i6 = IAuthTabCallbackDefault + 109;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
    }

    public void focus(@Nullable SearchBarView searchBarView) {
        int i = 2 % 2;
        if (searchBarView != null) {
            searchBarView.handleFocusJsRequest();
            int i2 = IAuthTabCallbackStub + 81;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = IAuthTabCallbackDefault + 101;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 98 / 0;
        }
    }

    public void clearText(@Nullable SearchBarView searchBarView) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 31;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        if (searchBarView != null) {
            int i5 = i2 + 115;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            searchBarView.handleClearTextJsRequest();
            if (i6 != 0) {
                throw null;
            }
        }
    }

    public void toggleCancelButton(@Nullable SearchBarView searchBarView, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 79;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (searchBarView != null) {
            searchBarView.handleToggleCancelButtonJsRequest(z);
        }
        int i3 = IAuthTabCallbackStub + 125;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
    }

    public void setText(@Nullable SearchBarView searchBarView, @Nullable String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 49;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        if (searchBarView != null) {
            int i5 = i3 + 61;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            searchBarView.handleSetTextJsRequest(str);
            if (i6 != 0) {
                int i7 = 12 / 0;
            }
        }
        int i8 = IAuthTabCallbackDefault + 119;
        IAuthTabCallbackStub = i8 % 128;
        int i9 = i8 % 2;
    }

    public void cancelSearch(@Nullable SearchBarView searchBarView) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 17;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (searchBarView != null) {
            searchBarView.handleCancelSearchJsRequest();
        }
        int i3 = IAuthTabCallbackStub + 11;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void setPlacement(@NotNull SearchBarView searchBarView, @Nullable String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 11;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(searchBarView, "");
            logNotAvailable("setPlacement");
        } else {
            Intrinsics.checkNotNullParameter(searchBarView, "");
            logNotAvailable("setPlacement");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public void setAllowToolbarIntegration(@NotNull SearchBarView searchBarView, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 3;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(searchBarView, "");
            logNotAvailable("allowToolbarIntegration");
            int i3 = 17 / 0;
        } else {
            Intrinsics.checkNotNullParameter(searchBarView, "");
            logNotAvailable("allowToolbarIntegration");
        }
        int i4 = IAuthTabCallbackDefault + 57;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setHideWhenScrolling(@Nullable SearchBarView searchBarView, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 105;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        logNotAvailable("hideWhenScrolling");
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackStub + 107;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setObscureBackground(@Nullable SearchBarView searchBarView, @Nullable String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 37;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        logNotAvailable("obscureBackground");
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackDefault + 105;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 80 / 0;
        }
    }

    public void setHideNavigationBar(@Nullable SearchBarView searchBarView, @Nullable String str) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 51;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = new Object[1];
            b(Color.red(0) - 91374748, (char) (56030 << TextUtils.indexOf("", "", 1, 1)), new char[]{36576, 35121, 46749, 53245, 25887, 31596, 12964, 4906, 3781, 24920, 56817, 31574, 43266, 50188, 53796, 10621, 10511}, new char[]{25680, 36283, 57082, 52186}, new char[]{63321, 6562, 38663, 30684}, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            b((-91374748) - Color.red(0), (char) (TextUtils.indexOf("", "", 0, 0) + 56030), new char[]{36576, 35121, 46749, 53245, 25887, 31596, 12964, 4906, 3781, 24920, 56817, 31574, 43266, 50188, 53796, 10621, 10511}, new char[]{25680, 36283, 57082, 52186}, new char[]{63321, 6562, 38663, 30684}, objArr2);
            obj = objArr2[0];
        }
        logNotAvailable(((String) obj).intern());
        int i3 = IAuthTabCallbackStub + 71;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
    }

    public void setCancelButtonText(@Nullable SearchBarView searchBarView, @Nullable String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 17;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        logNotAvailable("cancelButtonText");
        int i4 = IAuthTabCallbackStub + 3;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setTintColor(@Nullable SearchBarView searchBarView, @Nullable Integer num) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 61;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        logNotAvailable("tintColor");
        int i4 = IAuthTabCallbackStub + 107;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    static void onExtraCallback() {
        IAuthTabCallback = 2010464920830975138L;
        onExtraCallbackWithResult = -1776194565;
        onNavigationEvent = (char) 27643;
    }
}
