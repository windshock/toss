package im.toss.features.loan.common;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.base.BaseActivity;
import im.toss.base.BaseFragment;
import im.toss.features.home.core.ui.compose.dst.HomeAssetSubCategoryHeaderKt$;
import im.toss.features.loan.common.LoanApplicationPdfFragment$;
import im.toss.features.loan.ui.R;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.webview.TossWebView;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.text.StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertFloatArrayToByteArray;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.IPostMessageServiceStubProxy;
import o.JsonWriterWriteObject;
import o.M_;
import o.NetConverter3;
import o.PageContext;
import o.RotationProvider1;
import o.SearchBarKtExternalSyntheticLambda5;
import o.TimelineExternalSyntheticLambda1;
import o.addAllCommandLine;
import o.clearTid;
import o.deserializeUriNullableCollection;
import o.enableImagePrefetchingOnUiThreadAndroid;
import o.getHostnameVerifierokhttp;
import o.getRevokedCertificates;
import o.getWrite;
import o.initViews;
import o.isCA;
import o.preFillDefault;
import o.writeRaw;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.widget.PinchZoomRecyclerView;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class LoanApplicationPdfFragment extends BaseFragment {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final IAuthTabCallback Companion;
    static final /* synthetic */ addAllCommandLine<Object>[] IAuthTabCallback;
    private static char IAuthTabCallback_Parcel = 0;
    private static int ICustomTabsCallback = 1;
    private static char access100 = 0;
    private static int extraCallback = 0;
    private static int extraCallbackWithResult = 1;
    private static char getInterfaceDescriptor;
    public static final int onExtraCallback;
    private static char readTypedObject;
    private static int writeTypedObject;
    private Function0<Unit> IAuthTabCallbackDefault;
    private isCA IAuthTabCallbackStub;
    private final Lazy IAuthTabCallbackStubProxy;
    private final Lazy access000;
    private Function0<Unit> asBinder;
    private final Lazy asInterface;
    private final PageContext onExtraCallbackWithResult;
    private final Lazy onNavigationEvent;
    private final Lazy onTransact;
    private final Lazy onWarmupCompleted;

    static {
        IAuthTabCallback();
        IAuthTabCallback = new addAllCommandLine[]{new PropertyReference1Impl<>(LoanApplicationPdfFragment.class, "binding", "getBinding()Lim/toss/features/loan/ui/databinding/ViewLoanApplicationPdfBinding;", 0)};
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new IAuthTabCallback(defaultConstructorMarker);
        onExtraCallback = 8;
        int i = extraCallback + 105;
        ICustomTabsCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static /* synthetic */ String IAuthTabCallback(LoanApplicationPdfFragment loanApplicationPdfFragment) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 81;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        String strAccess100 = access100(loanApplicationPdfFragment);
        int i4 = extraCallbackWithResult + 43;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return strAccess100;
        }
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 91;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback3 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        onExtraCallback(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), iOnExtraCallback3, 1633906516, iOnExtraCallback2, -1633906514, new Object[]{function1, obj}, iOnExtraCallback);
        int i4 = writeTypedObject + 9;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ String IAuthTabCallbackStub(LoanApplicationPdfFragment loanApplicationPdfFragment) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 97;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallbackDefault(loanApplicationPdfFragment);
            throw null;
        }
        String strIAuthTabCallbackDefault = IAuthTabCallbackDefault(loanApplicationPdfFragment);
        int i3 = writeTypedObject + 79;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return strIAuthTabCallbackDefault;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 75;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(function1, obj);
        int i4 = writeTypedObject + 35;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 25 / 0;
        }
        return null;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i5;
        int i8 = (~(i7 | i3)) | i6;
        int i9 = ~i3;
        int i10 = ~i6;
        int i11 = (~(i9 | i10)) | i5;
        int i12 = (~(i6 | i9 | i5)) | (~(i7 | i9 | i10)) | (~(i10 | i3 | i5));
        int i13 = i3 + i5 + i4 + ((-104759182) * i2) + ((-453318476) * i);
        int i14 = i13 * i13;
        int i15 = (i3 * 1504131295) + 1805123584 + (1504131295 * i5) + (179255518 * i8) + ((-358511036) * i11) + ((-179255518) * i12) + (1324875776 * i4) + (711983104 * i2) + (1180696576 * i) + (1022754816 * i14);
        int i16 = ((i3 * (-1431886989)) - 1507491630) + (i5 * (-1431886989)) + (i8 * (-122)) + (i11 * 244) + (i12 * 122) + (i4 * (-1431886867)) + (i2 * 722567050) + (i * (-1618605404)) + (i14 * 297664512);
        switch (i15 + (i16 * i16 * (-277217280))) {
            case 1:
                return onNavigationEvent(objArr);
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return onTransact(objArr);
            case 6:
                return IAuthTabCallbackDefault(objArr);
            case 7:
                return asBinder(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    public static /* synthetic */ String onExtraCallback(LoanApplicationPdfFragment loanApplicationPdfFragment) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 91;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback_Parcel(loanApplicationPdfFragment);
        }
        IAuthTabCallback_Parcel(loanApplicationPdfFragment);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(LoanApplicationPdfFragment loanApplicationPdfFragment, View view) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 111;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(loanApplicationPdfFragment, view);
        int i4 = writeTypedObject + 119;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(String str, LoanApplicationPdfFragment loanApplicationPdfFragment, JsonWriterWriteObject jsonWriterWriteObject) throws IOException {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 19;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(str, loanApplicationPdfFragment, jsonWriterWriteObject);
        int i4 = extraCallbackWithResult + 103;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        LoanApplicationPdfFragment loanApplicationPdfFragment = (LoanApplicationPdfFragment) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 69;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        String interfaceDescriptor = getInterfaceDescriptor(loanApplicationPdfFragment);
        if (i3 != 0) {
            int i4 = 13 / 0;
        }
        int i5 = writeTypedObject + 11;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return interfaceDescriptor;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LoanApplicationPdfFragment loanApplicationPdfFragment, File file) throws FileNotFoundException {
        int i = 2 % 2;
        int i2 = writeTypedObject + 67;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(loanApplicationPdfFragment, file);
        }
        onWarmupCompleted(loanApplicationPdfFragment, file);
        throw null;
    }

    public static /* synthetic */ String onNavigationEvent(LoanApplicationPdfFragment loanApplicationPdfFragment) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 5;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            onTransact(loanApplicationPdfFragment);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String strOnTransact = onTransact(loanApplicationPdfFragment);
        int i3 = extraCallbackWithResult + 81;
        writeTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 83 / 0;
        }
        return strOnTransact;
    }

    public static /* synthetic */ Unit onNavigationEvent(LoanApplicationPdfFragment loanApplicationPdfFragment, String str, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 89;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(loanApplicationPdfFragment, str, th);
        if (i3 == 0) {
            int i4 = 37 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ void onNavigationEvent(LoanApplicationPdfFragment loanApplicationPdfFragment, View view) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 3;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(loanApplicationPdfFragment, view);
        if (i3 == 0) {
            throw null;
        }
        int i4 = writeTypedObject + 67;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        LoanApplicationPdfFragment loanApplicationPdfFragment = (LoanApplicationPdfFragment) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedObject + 13;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String strAsInterface = asInterface(loanApplicationPdfFragment);
        int i4 = writeTypedObject + 37;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return strAsInterface;
        }
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 5;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return 1230907L;
        }
        throw null;
    }

    static final /* synthetic */ class onExtraCallback extends FunctionReferenceImpl implements Function1<View, initViews> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        public static final onExtraCallback onNavigationEvent = new onExtraCallback();
        private static int onWarmupCompleted = 1;

        static {
            int i = onWarmupCompleted + 109;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        onExtraCallback() {
            super(1, initViews.class, "bind", "bind(Landroid/view/View;)Lim/toss/features/loan/ui/databinding/ViewLoanApplicationPdfBinding;", 0);
        }

        public final initViews IAuthTabCallback(View view) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 83;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(view, "");
                initViews.onExtraCallbackWithResult(view);
                throw null;
            }
            Intrinsics.checkNotNullParameter(view, "");
            initViews initviewsOnExtraCallbackWithResult = initViews.onExtraCallbackWithResult(view);
            int i3 = IAuthTabCallback + 113;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return initviewsOnExtraCallbackWithResult;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 93;
            onExtraCallback = i2 % 128;
            View view = (View) obj;
            if (i2 % 2 == 0) {
                return IAuthTabCallback(view);
            }
            IAuthTabCallback(view);
            throw null;
        }
    }

    public LoanApplicationPdfFragment() {
        super(R.layout.view_loan_application_pdf);
        this.onExtraCallbackWithResult = preFillDefault.onExtraCallbackWithResult(this, onExtraCallback.onNavigationEvent);
        this.onTransact = LazyKt.onExtraCallbackWithResult(new LoanApplicationPdfFragment$.ExternalSyntheticLambda6(this));
        this.asInterface = LazyKt.onExtraCallbackWithResult(new LoanApplicationPdfFragment$.ExternalSyntheticLambda7(this));
        this.onWarmupCompleted = LazyKt.onExtraCallbackWithResult(new LoanApplicationPdfFragment$.ExternalSyntheticLambda8(this));
        this.onNavigationEvent = LazyKt.onExtraCallbackWithResult(new LoanApplicationPdfFragment$.ExternalSyntheticLambda9(this));
        this.IAuthTabCallbackStubProxy = LazyKt.onExtraCallbackWithResult(new LoanApplicationPdfFragment$.ExternalSyntheticLambda10(this));
        this.access000 = LazyKt.onExtraCallbackWithResult(new LoanApplicationPdfFragment$.ExternalSyntheticLambda11(this));
    }

    public static final /* synthetic */ initViews asBinder(LoanApplicationPdfFragment loanApplicationPdfFragment) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 65;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            loanApplicationPdfFragment.onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        initViews initviewsOnExtraCallbackWithResult = loanApplicationPdfFragment.onExtraCallbackWithResult();
        int i3 = extraCallbackWithResult + 113;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return initviewsOnExtraCallbackWithResult;
    }

    private final initViews onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 43;
        extraCallbackWithResult = i2 % 128;
        SearchBarKtExternalSyntheticLambda5 searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult = i2 % 2 == 0 ? this.onExtraCallbackWithResult.onExtraCallbackWithResult(this, IAuthTabCallback[0]) : this.onExtraCallbackWithResult.onExtraCallbackWithResult(this, IAuthTabCallback[0]);
        Intrinsics.checkNotNullExpressionValue(searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult, "");
        return (initViews) searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult;
    }

    private final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 9;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.onTransact.getValue();
        int i4 = extraCallbackWithResult + 13;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static final String getInterfaceDescriptor(LoanApplicationPdfFragment loanApplicationPdfFragment) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 61;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            loanApplicationPdfFragment.getArguments();
            throw null;
        }
        Bundle arguments = loanApplicationPdfFragment.getArguments();
        if (arguments != null) {
            int i3 = writeTypedObject + 69;
            extraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            a(new char[]{17104, 6151, 11058, 60607, 45989, 27183, 39332, 35243}, (KeyEvent.getMaxKeyCode() >> 16) + 8, objArr);
            String string = arguments.getString(((String) objArr[0]).intern(), "");
            if (string != null) {
                int i5 = writeTypedObject + 21;
                extraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return string;
            }
        }
        return "";
    }

    private final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 109;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.asInterface.getValue();
        if (i3 != 0) {
            return (String) value;
        }
        int i4 = 84 / 0;
        return (String) value;
    }

    private static final String onTransact(LoanApplicationPdfFragment loanApplicationPdfFragment) {
        String string;
        int i = 2 % 2;
        int i2 = writeTypedObject + 43;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Bundle arguments = loanApplicationPdfFragment.getArguments();
        if (arguments != null && (string = arguments.getString("product_id", "")) != null) {
            return string;
        }
        int i4 = extraCallbackWithResult + 23;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        r1 = im.toss.features.loan.common.LoanApplicationPdfFragment.writeTypedObject;
        r2 = r1 + 39;
        im.toss.features.loan.common.LoanApplicationPdfFragment.extraCallbackWithResult = r2 % 128;
        r2 = r2 % 2;
        r1 = r1 + 81;
        im.toss.features.loan.common.LoanApplicationPdfFragment.extraCallbackWithResult = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if ((r1 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        r4 = null;
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
    
        if (r4 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (r4 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final String asInterface(LoanApplicationPdfFragment loanApplicationPdfFragment) {
        int i = 2 % 2;
        Bundle arguments = loanApplicationPdfFragment.getArguments();
        if (arguments != null) {
            int i2 = extraCallbackWithResult + 125;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            String string = arguments.getString("request_id", "");
            if (i3 != 0) {
                int i4 = 87 / 0;
            }
        }
        return "";
    }

    private final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 103;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.onWarmupCompleted.getValue();
        int i4 = extraCallbackWithResult + 69;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r1
      0x0021: PHI (r1v5 android.os.Bundle) = (r1v4 android.os.Bundle), (r1v7 android.os.Bundle) binds: [B:8:0x001f, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final String IAuthTabCallbackDefault(LoanApplicationPdfFragment loanApplicationPdfFragment) {
        Bundle arguments;
        int i = 2 % 2;
        int i2 = writeTypedObject + 15;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            arguments = loanApplicationPdfFragment.getArguments();
            int i3 = 81 / 0;
            if (arguments != null) {
                int i4 = extraCallbackWithResult + 97;
                writeTypedObject = i4 % 128;
                int i5 = i4 % 2;
                String string = arguments.getString("KEY_CTA_TITLE", "");
                if (string != null) {
                    int i6 = writeTypedObject;
                    int i7 = i6 + 105;
                    extraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                    int i9 = i6 + 47;
                    extraCallbackWithResult = i9 % 128;
                    int i10 = i9 % 2;
                    return string;
                }
            }
        } else {
            arguments = loanApplicationPdfFragment.getArguments();
            if (arguments != null) {
            }
        }
        String string2 = loanApplicationPdfFragment.getString(im.toss.uikit.R.string.uikit_confirm);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        return string2;
    }

    private final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 119;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.onNavigationEvent.getValue();
        if (i3 == 0) {
            return (String) value;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final String IAuthTabCallback_Parcel(LoanApplicationPdfFragment loanApplicationPdfFragment) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 45;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Bundle arguments = loanApplicationPdfFragment.getArguments();
        if (i3 != 0) {
            int i4 = 7 / 0;
            if (arguments != null) {
                String string = arguments.getString("KEY_PAGE_TITLE", "");
                if (string != null) {
                    int i5 = extraCallbackWithResult + 89;
                    int i6 = i5 % 128;
                    writeTypedObject = i6;
                    int i7 = i5 % 2;
                    int i8 = i6 + 53;
                    extraCallbackWithResult = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i9 = 17 / 0;
                    }
                    return string;
                }
            }
        } else if (arguments != null) {
        }
        return "";
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        LoanApplicationPdfFragment loanApplicationPdfFragment = (LoanApplicationPdfFragment) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 59;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) loanApplicationPdfFragment.IAuthTabCallbackStubProxy.getValue();
        if (i3 == 0) {
            return str;
        }
        throw null;
    }

    private final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 41;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.access000.getValue();
        int i4 = writeTypedObject + 33;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 37 / 0;
        }
        return str;
    }

    private static final String access100(LoanApplicationPdfFragment loanApplicationPdfFragment) {
        String string;
        int i = 2 % 2;
        Bundle arguments = loanApplicationPdfFragment.getArguments();
        if (arguments == null || (string = arguments.getString("KEY_URI", "")) == null) {
            int i2 = extraCallbackWithResult + 107;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            return "";
        }
        int i4 = writeTypedObject + 71;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        LoanApplicationPdfFragment loanApplicationPdfFragment = (LoanApplicationPdfFragment) objArr[0];
        Function0<Unit> function0 = (Function0) objArr[1];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 71;
        int i3 = i2 % 128;
        writeTypedObject = i3;
        int i4 = i2 % 2;
        Object obj = null;
        loanApplicationPdfFragment.asBinder = function0;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 57;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallbackWithResult(@Nullable Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 3;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        int i4 = i2 % 2;
        this.IAuthTabCallbackDefault = function0;
        int i5 = i3 + 73;
        writeTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 54 / 0;
        }
    }

    private static final void IAuthTabCallback(LoanApplicationPdfFragment loanApplicationPdfFragment, View view) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 61;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        loanApplicationPdfFragment.asBinder();
        int i4 = writeTypedObject + 75;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        BaseActivity baseActivity;
        int i = 2 % 2;
        int i2 = writeTypedObject + 27;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        BaseActivity activity = getActivity();
        if (activity instanceof BaseActivity) {
            int i4 = extraCallbackWithResult + 49;
            writeTypedObject = i4 % 128;
            if (i4 % 2 != 0) {
                baseActivity = activity;
                int i5 = 75 / 0;
            } else {
                baseActivity = activity;
            }
        } else {
            baseActivity = null;
        }
        if (baseActivity != null) {
            int i6 = extraCallbackWithResult + 117;
            writeTypedObject = i6 % 128;
            int i7 = i6 % 2;
            baseActivity.setSupportActionBar(view.findViewById(R.id.toolbar));
            IPostMessageServiceStubProxy supportActionBar = baseActivity.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.IAuthTabCallbackStub(false);
            }
            IPostMessageServiceStubProxy supportActionBar2 = baseActivity.getSupportActionBar();
            if (supportActionBar2 != null) {
                int i8 = extraCallbackWithResult + 29;
                writeTypedObject = i8 % 128;
                int i9 = i8 % 2;
                supportActionBar2.onNavigationEvent(true);
            }
            onExtraCallbackWithResult().IAuthTabCallback.setNavigationOnClickListener(new LoanApplicationPdfFragment$.ExternalSyntheticLambda5(this));
            int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
            int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
            int iOnExtraCallback3 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
            if (!StringsKt.isBlank((String) onExtraCallback(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), iOnExtraCallback3, -253469979, iOnExtraCallback2, 253469982, new Object[]{this}, iOnExtraCallback))) {
                Typography5 typography5 = onExtraCallbackWithResult().asBinder;
                int iOnExtraCallback4 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
                int iOnExtraCallback5 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
                typography5.setText((String) onExtraCallback(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -253469979, iOnExtraCallback5, 253469982, new Object[]{this}, iOnExtraCallback4));
            }
        }
        onTransact();
        access100();
        onExtraCallbackWithResult().onWarmupCompleted.setEnabledCta(false);
        Object[] objArr = {this, IAuthTabCallbackDefault()};
        int iOnExtraCallback6 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        onExtraCallback(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -2023890743, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 2023890744, objArr, iOnExtraCallback6);
    }

    public boolean onBackPressed() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 55;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        asBinder();
        int i4 = extraCallbackWithResult + 99;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    private final void asBinder() {
        int i = 2 % 2;
        getParentFragmentManager().extraCommand();
        Function0<Unit> function0 = this.IAuthTabCallbackDefault;
        if (function0 != null) {
            int i2 = extraCallbackWithResult + 121;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            function0.invoke();
            int i4 = extraCallbackWithResult + 49;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public void onDestroyView() throws IOException {
        int i = 2 % 2;
        int i2 = writeTypedObject + 17;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroyView();
        isCA isca = this.IAuthTabCallbackStub;
        if (isca != null) {
            int i4 = writeTypedObject + 1;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            isca.close();
        }
        this.IAuthTabCallbackStub = null;
    }

    private final void onTransact() {
        int i = 2 % 2;
        onExtraCallbackWithResult().onNavigationEvent.setLayoutManager(new LinearLayoutManager(requireContext()));
        int i2 = writeTypedObject + 9;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private final void access100() {
        int i = 2 % 2;
        TdsBottomCtaV1View tdsBottomCtaV1View = onExtraCallbackWithResult().onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, onExtraCallback(), new LoanApplicationPdfFragment$.ExternalSyntheticLambda0(this), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        int i2 = writeTypedObject + 51;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallback {
        private static final byte[] $$a = {52, -58, -85, 74};
        private static final int $$b = 65;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static char[] onWarmupCompleted = {15233, 10224};
        private static long onExtraCallback = -2761591501542989688L;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(short s, short s2, byte b) {
            int i;
            int i2 = 3 - (b * 2);
            int i3 = s2 * 3;
            byte[] bArr = $$a;
            int i4 = (s * 3) + 97;
            byte[] bArr2 = new byte[i3 + 1];
            if (bArr == null) {
                int i5 = i3;
                int i6 = 0;
                i4 += i5;
                i = i6;
                bArr2[i] = (byte) i4;
                i6 = i + 1;
                if (i == i3) {
                    return new String(bArr2, 0);
                }
                i2++;
                i5 = bArr[i2];
                i4 += i5;
                i = i6;
                bArr2[i] = (byte) i4;
                i6 = i + 1;
                if (i == i3) {
                }
            } else {
                i = 0;
                bArr2[i] = (byte) i4;
                i6 = i + 1;
                if (i == i3) {
                }
            }
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
                int i4 = $11 + 87;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(onWarmupCompleted[i + i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 59697), 17 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(onExtraCallback), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionType(0L) + 46134), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 31, 20219 - TextUtils.indexOf((CharSequence) "", '0'), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 43, 1494 - TextUtils.indexOf("", "", 0), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
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
                int i7 = $10 + 17;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                try {
                    Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0) + 49124), 44 - TextUtils.getOffsetAfter("", 0), 1493 - MotionEvent.axisFromString(""), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            String str = new String(cArr);
            int i9 = $10 + 49;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            objArr[0] = str;
        }

        private IAuthTabCallback() {
        }

        public static /* synthetic */ LoanApplicationPdfFragment onExtraCallbackWithResult(IAuthTabCallback iAuthTabCallback, String str, String str2, String str3, int i, Object obj) throws Throwable {
            Object obj2;
            int i2 = 2 % 2;
            int i3 = onNavigationEvent;
            int i4 = i3 + 17;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0 ? (i & 2) != 0 : (i & 3) != 0) {
                str2 = "";
            }
            if ((i & 4) != 0) {
                int i5 = i3 + 59;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    Object[] objArr = new Object[1];
                    a(KeyEvent.getMaxKeyCode() << 64, 4 << TextUtils.lastIndexOf("", '6', 0), (char) TextUtils.getOffsetBefore("", 0), objArr);
                    obj2 = objArr[0];
                } else {
                    Object[] objArr2 = new Object[1];
                    a(KeyEvent.getMaxKeyCode() >> 16, TextUtils.lastIndexOf("", '0', 0) + 3, (char) TextUtils.getOffsetBefore("", 0), objArr2);
                    obj2 = objArr2[0];
                }
                str3 = ((String) obj2).intern();
            }
            return iAuthTabCallback.onWarmupCompleted(str, str2, str3);
        }

        public final LoanApplicationPdfFragment onWarmupCompleted(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            LoanApplicationPdfFragment loanApplicationPdfFragment = new LoanApplicationPdfFragment();
            loanApplicationPdfFragment.setArguments(RotationProvider1.onNavigationEvent(new Pair[]{getWrite.IAuthTabCallback("KEY_PAGE_TITLE", str2), getWrite.IAuthTabCallback("KEY_URI", str), getWrite.IAuthTabCallback("KEY_CTA_TITLE", str3)}));
            int i2 = onNavigationEvent + 107;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return loanApplicationPdfFragment;
        }
    }

    private static final Unit onWarmupCompleted(LoanApplicationPdfFragment loanApplicationPdfFragment, View view) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 105;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Function0<Unit> function0 = loanApplicationPdfFragment.asBinder;
        if (function0 == null) {
            int i4 = writeTypedObject + 99;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            loanApplicationPdfFragment.asBinder();
        } else {
            Intrinsics.checkNotNull(function0);
            function0.invoke();
            int i6 = writeTypedObject + 113;
            extraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 % 3;
            }
        }
        return Unit.INSTANCE;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i3 = $11 + 69;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            cArr3[0] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i5 = 58224;
            for (int i6 = 0; i6 < 16; i6++) {
                int i7 = $10 + 41;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                char c = cArr3[1];
                char c2 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c), Integer.valueOf((c2 + i5) ^ ((c2 << 4) + ((char) (getInterfaceDescriptor ^ 1094535280733222934L)))), Integer.valueOf(c2 >>> 5), Integer.valueOf(readTypedObject)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 9 - ((byte) KeyEvent.getModifierMetaStateMask()), 12434 - ExpandableListView.getPackedPositionGroup(0L), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (access100 ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallback_Parcel)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16777216) - Color.rgb(0, 0, 0)), AndroidCharacter.getMirror('0') - '&', View.MeasureSpec.getSize(0) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr3[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr3[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 13 - ((byte) KeyEvent.getModifierMetaStateMask()), 19901 - View.MeasureSpec.makeMeasureSpec(0, 0), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public static final class onExtraCallbackWithResult extends RecyclerView.OnScrollListener {
        private static int IAuthTabCallback = 0;
        private static int onTransact = 1;
        final /* synthetic */ isCA onExtraCallbackWithResult;
        final /* synthetic */ PinchZoomRecyclerView onNavigationEvent;
        private boolean onWarmupCompleted;

        onExtraCallbackWithResult(PinchZoomRecyclerView pinchZoomRecyclerView, isCA isca) {
            this.onNavigationEvent = pinchZoomRecyclerView;
            this.onExtraCallbackWithResult = isca;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(recyclerView, "");
            if (!this.onWarmupCompleted) {
                int i3 = IAuthTabCallback + 25;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
                if (i == 1) {
                    this.onWarmupCompleted = true;
                    Typography5 typography5 = LoanApplicationPdfFragment.asBinder(LoanApplicationPdfFragment.this).onExtraCallbackWithResult;
                    Intrinsics.checkNotNullExpressionValue(typography5, "");
                    enableImagePrefetchingOnUiThreadAndroid.IAuthTabCallback(typography5, 0L, 0L, (Interpolator) null, false, false, (Function1) null, (Function1) null, 127, (Object) null);
                }
            }
            if (i == 0) {
                int i5 = onTransact + 75;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                this.onWarmupCompleted = false;
                Typography5 typography52 = LoanApplicationPdfFragment.asBinder(LoanApplicationPdfFragment.this).onExtraCallbackWithResult;
                Intrinsics.checkNotNullExpressionValue(typography52, "");
                enableImagePrefetchingOnUiThreadAndroid.onNavigationEvent(typography52, 0L, 0L, (Interpolator) null, false, false, (Function1) null, (Function1) null, 127, (Object) null);
                int i7 = onTransact + 17;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
            }
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            int i3 = 2 % 2;
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Typography5 typography5 = LoanApplicationPdfFragment.asBinder(LoanApplicationPdfFragment.this).onExtraCallbackWithResult;
            LinearLayoutManager layoutManager = this.onNavigationEvent.getLayoutManager();
            Intrinsics.checkNotNull(layoutManager, "");
            int iFindLastVisibleItemPosition = layoutManager.findLastVisibleItemPosition();
            typography5.setText((iFindLastVisibleItemPosition + 1) + "/" + this.onExtraCallbackWithResult.onNavigationEvent());
            int i4 = onTransact + 115;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private final void onExtraCallback(File file) throws FileNotFoundException {
        int i = 2 % 2;
        isCA.IAuthTabCallback iAuthTabCallback = isCA.Companion;
        ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(file, 268435456);
        Intrinsics.checkNotNullExpressionValue(parcelFileDescriptorOpen, "");
        isCA iscaOnExtraCallback = iAuthTabCallback.onExtraCallback(parcelFileDescriptorOpen);
        this.IAuthTabCallbackStub = iscaOnExtraCallback;
        PinchZoomRecyclerView pinchZoomRecyclerView = onExtraCallbackWithResult().onNavigationEvent;
        pinchZoomRecyclerView.setAdapter(new getRevokedCertificates(iscaOnExtraCallback, M_.onExtraCallback.asInterface()));
        pinchZoomRecyclerView.setEnabled(false);
        pinchZoomRecyclerView.addOnScrollListener(new onExtraCallbackWithResult(pinchZoomRecyclerView, iscaOnExtraCallback));
        int i2 = extraCallbackWithResult + 103;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = writeTypedObject + 87;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = writeTypedObject + 57;
        extraCallbackWithResult = i4 % 128;
        Object obj2 = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(LoanApplicationPdfFragment loanApplicationPdfFragment, File file) throws FileNotFoundException {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 121;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Typography5 typography5 = loanApplicationPdfFragment.onExtraCallbackWithResult().onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(typography5, "");
        typography5.setVisibility(0);
        PinchZoomRecyclerView pinchZoomRecyclerView = loanApplicationPdfFragment.onExtraCallbackWithResult().onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(pinchZoomRecyclerView, "");
        pinchZoomRecyclerView.setVisibility(0);
        TossWebView tossWebView = loanApplicationPdfFragment.onExtraCallbackWithResult().asInterface;
        Intrinsics.checkNotNullExpressionValue(tossWebView, "");
        tossWebView.setVisibility(8);
        loanApplicationPdfFragment.dismissLoadingIndicator();
        Intrinsics.checkNotNull(file);
        loanApplicationPdfFragment.onExtraCallback(file);
        loanApplicationPdfFragment.onExtraCallbackWithResult().onWarmupCompleted.setEnabledCta(true);
        Unit unit = Unit.INSTANCE;
        int i4 = writeTypedObject + 61;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 80 / 0;
        }
        return unit;
    }

    private static final void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 43;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            int i4 = 43 / 0;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        LoanApplicationPdfFragment loanApplicationPdfFragment = (LoanApplicationPdfFragment) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        getHostnameVerifierokhttp.onNavigationEvent(loanApplicationPdfFragment, (String) null, 1, (Object) null);
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback3 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = ((writeRaw) onExtraCallback(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), iOnExtraCallback3, -1207320609, iOnExtraCallback2, 1207320615, new Object[]{loanApplicationPdfFragment, str}, iOnExtraCallback)).onNavigationEvent(clearTid.onExtraCallback()).IAuthTabCallback(NetConverter3.onExtraCallback()).onNavigationEvent(new LoanApplicationPdfFragment$.ExternalSyntheticLambda2(new LoanApplicationPdfFragment$.ExternalSyntheticLambda1(loanApplicationPdfFragment)), new LoanApplicationPdfFragment$.ExternalSyntheticLambda4(new LoanApplicationPdfFragment$.ExternalSyntheticLambda3(loanApplicationPdfFragment, str)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
        loanApplicationPdfFragment.autoDisposable(deserializeurinullablecollectionOnNavigationEvent);
        int i2 = writeTypedObject + 15;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 18 / 0;
        }
        return null;
    }

    private static final Unit onWarmupCompleted(LoanApplicationPdfFragment loanApplicationPdfFragment, String str, Throwable th) throws Throwable {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("LoanApplicationPdfFragment PDF Downloader : " + th.getMessage(), th);
        loanApplicationPdfFragment.dismissLoadingIndicator();
        loanApplicationPdfFragment.onExtraCallback(str);
        loanApplicationPdfFragment.onExtraCallbackWithResult().onWarmupCompleted.setEnabledCta(true);
        Unit unit = Unit.INSTANCE;
        int i2 = writeTypedObject + 21;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private final void onExtraCallback(String str) throws Throwable {
        int i = 2 % 2;
        Typography5 typography5 = onExtraCallbackWithResult().onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(typography5, "");
        typography5.setVisibility(8);
        PinchZoomRecyclerView pinchZoomRecyclerView = onExtraCallbackWithResult().onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(pinchZoomRecyclerView, "");
        pinchZoomRecyclerView.setVisibility(8);
        TossWebView tossWebView = onExtraCallbackWithResult().asInterface;
        Intrinsics.checkNotNullExpressionValue(tossWebView, "");
        tossWebView.setVisibility(0);
        TossWebView tossWebView2 = onExtraCallbackWithResult().asInterface;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new char[]{15345, 2523, 4350, 16224, 7901, 29443, 21701, 34204, 12983, 25762, 17694, 34585, 54910, 32385, 64726, 2705, 8020, 5291, 43199, 35742, 39805, 14176, 37391, 49475, 9066, 52978, 53420, 20766, 39142, 11437, 39085, 34202, 37875, 63745, 38136, 27816, 7374, 49689, 56152, 56885, 41062, 41342, 9185, 44240, 38093, 55003, 1934, 41612}, 48 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(str);
        tossWebView2.loadUrl(sb.toString());
        int i2 = extraCallbackWithResult + 29;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void onWarmupCompleted(String str, LoanApplicationPdfFragment loanApplicationPdfFragment, JsonWriterWriteObject jsonWriterWriteObject) throws IOException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(jsonWriterWriteObject, "");
        try {
            URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
            Intrinsics.checkNotNullExpressionValue(uRLConnectionOpenConnection, "");
            uRLConnectionOpenConnection.connect();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(uRLConnectionOpenConnection.getInputStream());
            File file = new File(loanApplicationPdfFragment.onWarmupCompleted("LoanDoc" + System.currentTimeMillis() + ".pdf"));
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            int i2 = extraCallbackWithResult + 33;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            while (true) {
                int i4 = bufferedInputStream.read(bArr);
                if (i4 == -1) {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    bufferedInputStream.close();
                    jsonWriterWriteObject.onNavigationEvent(file);
                    return;
                }
                int i5 = writeTypedObject + 93;
                extraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    fileOutputStream.write(bArr, 1, i4);
                } else {
                    fileOutputStream.write(bArr, 0, i4);
                }
            }
        } catch (IOException e) {
            jsonWriterWriteObject.onExtraCallback(e);
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        int i = 2 % 2;
        writeRaw writerawOnNavigationEvent = writeRaw.onNavigationEvent(new LoanApplicationPdfFragment$.ExternalSyntheticLambda12((String) objArr[1], (LoanApplicationPdfFragment) objArr[0])).onNavigationEvent(clearTid.onExtraCallback());
        Intrinsics.checkNotNullExpressionValue(writerawOnNavigationEvent, "");
        int i2 = extraCallbackWithResult + 101;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return writerawOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final String onWarmupCompleted(String str) {
        int i = 2 % 2;
        File externalFilesDir = requireContext().getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS);
        Object obj = null;
        File file = new File(externalFilesDir != null ? externalFilesDir.getPath() : null, "/LoanViewer/Temp");
        if (!file.exists()) {
            file.mkdirs();
            int i2 = extraCallbackWithResult + 31;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
        }
        String str2 = file.getAbsolutePath() + "/" + str;
        int i4 = writeTypedObject + 117;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return str2;
        }
        obj.hashCode();
        throw null;
    }

    public Map<String, Object> getScreenParams() throws Throwable {
        int i = 2 % 2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object[] objArr = new Object[1];
        a(new char[]{17104, 6151, 11058, 60607, 45989, 27183, 39332, 35243}, 8 - KeyEvent.keyCodeFromString(""), objArr);
        linkedHashMap.put(((String) objArr[0]).intern(), IAuthTabCallbackStub());
        linkedHashMap.put("request_id", onWarmupCompleted());
        linkedHashMap.put("product_id", onNavigationEvent());
        int i2 = writeTypedObject + 39;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return linkedHashMap;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ String onExtraCallbackWithResult(LoanApplicationPdfFragment loanApplicationPdfFragment) {
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback3 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        return (String) onExtraCallback(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), iOnExtraCallback3, -2007092308, iOnExtraCallback2, 2007092308, new Object[]{loanApplicationPdfFragment}, iOnExtraCallback);
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, Object obj) {
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback3 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        onExtraCallback(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), iOnExtraCallback3, 2029081895, iOnExtraCallback2, -2029081888, new Object[]{function1, obj}, iOnExtraCallback);
    }

    public static /* synthetic */ String onWarmupCompleted(LoanApplicationPdfFragment loanApplicationPdfFragment) {
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback3 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        return (String) onExtraCallback(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), iOnExtraCallback3, -828253385, iOnExtraCallback2, 828253390, new Object[]{loanApplicationPdfFragment}, iOnExtraCallback);
    }

    private final writeRaw<File> onNavigationEvent(String str) {
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback3 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        return (writeRaw) onExtraCallback(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), iOnExtraCallback3, -1207320609, iOnExtraCallback2, 1207320615, new Object[]{this, str}, iOnExtraCallback);
    }

    private final String asInterface() {
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback3 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        return (String) onExtraCallback(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), iOnExtraCallback3, -253469979, iOnExtraCallback2, 253469982, new Object[]{this}, iOnExtraCallback);
    }

    private final void IAuthTabCallback(String str) {
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback3 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        onExtraCallback(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), iOnExtraCallback3, -2023890743, iOnExtraCallback2, 2023890744, new Object[]{this, str}, iOnExtraCallback);
    }

    private static final void onNavigationEvent(Function1 function1, Object obj) {
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback3 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        onExtraCallback(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), iOnExtraCallback3, 1633906516, iOnExtraCallback2, -1633906514, new Object[]{function1, obj}, iOnExtraCallback);
    }

    public final void onNavigationEvent(@Nullable Function0<Unit> function0) {
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback3 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        onExtraCallback(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), iOnExtraCallback3, 656122391, iOnExtraCallback2, -656122387, new Object[]{this, function0}, iOnExtraCallback);
    }

    static void IAuthTabCallback() {
        access100 = (char) 57371;
        IAuthTabCallback_Parcel = (char) 32060;
        getInterfaceDescriptor = (char) 937;
        readTypedObject = (char) 26106;
    }
}
